# 创建数据库表结构
1.在ActivitiDemo/BasicDemo/src/main/resources/activiti.cfg.xml，配置好数据库链接信息<br>
2.然后在com.roy.TestCreateTable测试类，执行建表语句
# 模块示例划分
1.ActivitiBusinessDemo--携带业务key，创建流程的示例<br>
2.ActivitiGatewayExclusive--排他网关的案例<br>
![img_3.png](img_3.png)
3.ActivitiGatewayInclusive--包含网关的案例<br>
![img_4.png](img_4.png)
4.ActivitiGatewayParallel--并行网关的案例<br>
条件在并行网关会被忽略<br>
![img_2.png](img_2.png)
5.BaseActivitiDemo--基础的案例<br>
![img.png](img.png)
<br>6.TestAssigneeUel--uel表达式指定负责人案例<br>
7.TestCandidate--候选人、任务分配案例<br>
8.TestVariables--流程变量相关案例<br>
![img_1.png](img_1.png)