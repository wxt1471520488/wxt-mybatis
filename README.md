# wxt-mybatis
> 自定义持久层框架(仿mybatis)

**思路**
* 加载配置文件
  * 读取配置文件内容
  * 解析配置文件内容
  * 封装实体配置对象类
* 创建 SqlSessionFactory 接口
  * 封装核心配置对象
  * 生产SqlSession
* 创建 SqlSession 接口
  * 代理dao层接口
  * 抽象sql方法
* 创建 Executor 接口
  * 使用连接池与数据库交互
  * 执行sql
  * 封装返回结果

**流程图**
![image](C:/Users/wxt/Desktop/未命名文件.png)