1.项目介绍：rbac管理系统是一个基于角色的访问控制，管理影院员工信息的权限系统。
2.功能：登陆，前台页面演示权限，后台用户管理，角色管理和权限管理
3.数据库设计：
    3.1.共有5个数据表：permission，role，role_permission，user，user_role
4.开发环境与开发框架
    Windows10+IDEA+Git+SpringBoot+Shiro+Maven+jsp
5.结构
**--src
    --main
        --java**
            --com.xupt.edu.rabc
                --exception
                --controlller
                --realm
                --mapper
                --filter
                --pojo
                --service
                --util
                --shiro 
                --RbacApplication.java
        **--resources**
            --application.properties
        **--webapp**
            --static
                --css
            --WEB-INF
                --jsp
6.遇到的问题
    6.1.shiro是怎样作认证和授权的？（工作流程）
        6.1.1.获取当前的Subject,调用SecurityUtils.getSubject()
        6.1.2.获取页面的用户名和密码，将其封装为UsernamePasswordToken对象
        6.1.3.执行登陆
        6.1.4.自定义Realm方法，继承AuthorizingRealm类，实现doGetAuthenticationInfo和doGetAuthorizationInfo方法
            ---doGetAuthenticationInfo（认证）
                ---1.获取账号密码
                ---2.获取数据库中的密码
                ---3.创建SimpleAuthenticationInfo对象，HashedCredentialsMatcher进行自动校验
                ---4.返回SimpleAuthenticationInfo对象
            ---doGetAuthorizationInfo（授权）
                ---1.获取用户名
                ---2.通过service获取角色和权限
                ---3.创建SimpleAuthorizationInfo对象，把通过service获取到的角色和权限放到授权对象中
                ---4.返回SimpleAuthorizationInfo对象
    6.2.数据库中密码直接为明文密码，不安全怎么办？
        6.2.1.设置密码使用MD5加密算法。（MD5加密算法不可逆，安全）
        6.2.2.为了保证不同用户设置的密码相同，导致数据库中加密后的密码相同，采用盐值加密。（保证加密后的密码不相同，更加安全）
    6.3.如何通过URL配置来灵活设置权限，而不是非要在Controller里通过注解来做了权限设置？
        通过自定义拦截器的方式，遍历该用户的所有权限url,若有权限则放行，否则没有该权限。
        注解设置权限开发的局限性（当权限配置关系发生变化，每次都要修改代码，编译打包重启系统，这肯定是不能够被接受的。）
