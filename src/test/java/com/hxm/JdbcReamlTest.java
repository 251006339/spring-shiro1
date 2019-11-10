/*
package com.hxm;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

*/
/**
 * @author XAIOHU
 * @date 2019/10/31 --18:46
 **//*

public class JdbcReamlTest {
    //Druid 数据源
    DruidDataSource druidDataSource = new DruidDataSource();

    {
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/db_shiro?characterEncoding=utf8&useSSL=false&serverTimezone=UTC");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
    }

    @Test
    public void test() {

        JdbcRealm jdbcRealm = new JdbcRealm();
        jdbcRealm.setDataSource(druidDataSource);
        jdbcRealm.setPermissionsLookupEnabled(true);//设置权限允许
        //reaml获得账号和密码; 查询 账号和密码;
        String sql = "select password from users where user_name=?";
        jdbcRealm.setAuthenticationQuery(sql);//认证用户
        String sqlRole = "select role_name from user_role where user_name=?";//查询角色
        jdbcRealm.setUserRolesQuery(sqlRole);//设置角色查询
        //自定义权限认证 permission
        String permissSql = "select  permission from roles_permissions  where role_name=?";
        jdbcRealm.setPermissionsQuery(permissSql);//设置权限查询
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(jdbcRealm);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("admin", "123456");
        subject.login(token);
        //没有这个权限就报错;
        subject.checkPermissions("user:vip2");
        try {
            subject.checkPermissions("user:vip3");

        } catch (AuthorizationException e) {
            System.out.println("没有权限;");
        }
        System.out.println(subject.hasRole("user"));

    }
    @Test
    public void test2(){


    }



}





*/
