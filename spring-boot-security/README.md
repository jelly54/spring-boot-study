# Spring Boot Security Getting Started

### Guides
* 运行项目中 [sql文件](./src/main/resources/db) 获取数据库

* 基础文件
    - [bean](./src/main/java/com/jelly/security/bean)  pojo 的包路径
    - [dao](./src/main/java/com/jelly/security/dao)  mapper&操作数据库的sql 的包路径
    - [service](./src/main/java/com/jelly/security/service)  service服务的包路径
    - [web](./src/main/java/com/jelly/security/web/)  相关控制器的包路径

* 在 [security包](./src/main/java/com/jelly/security/security) 下是 spring security的配置文件

* 运行项目，启动后访问 [localhost:8080/home.html](localhost:8080/home.html) 将会提示登录，此时有两个选项
```text
1、在 ** WebSecurityConfig ** 中使用了密码加密，则只能使用  账号-密码 为 jelly-123进行登陆。
2、在上述文件中未使用密码加密，则使用 账号-密码 为 admin-123进行登录
```  

* 进入home页面中，可以校验当前登录用户的权限、进行退出操作等。
