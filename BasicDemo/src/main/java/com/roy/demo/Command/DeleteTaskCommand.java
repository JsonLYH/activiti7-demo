package com.roy.demo.Command;


import org.activiti.engine.impl.cmd.NeedsActiveTaskCmd;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntityManager;

/***
 * 删除正在执行的任务
 */
public class DeleteTaskCommand extends NeedsActiveTaskCmd<String> {

    public DeleteTaskCommand(String taskId) {
        super(taskId);
    }

    @Override
    protected String execute(CommandContext commandContext, TaskEntity currentTask) {
        //获取所需服务
        TaskEntityManager taskEntityManager = commandContext.getTaskEntityManager();
        //获取当前任务的来源任务及来源节点信息
        ExecutionEntity executionEntity = currentTask.getExecution();
        //删除当前任务,来源任务
        taskEntityManager.deleteTask(currentTask.getId(), "deleted",false);
        return executionEntity.getId();
    }

    @Override
    protected String getSuspendedTaskException() {
        return "挂起的任务不能删除";
    }

}
