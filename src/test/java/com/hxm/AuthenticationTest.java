/*
package com.hxm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

*/
/**
 * @author XAIOHU
 * @date 2019/10/31 --17:24
 **//*



public class AuthenticationTest {

    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

    @Before
    public void before() {
        simpleAccountRealm.addAccount("admin", "123456");
        simpleAccountRealm.addAccount("xiaohu", "123", "VIP1", "VIP2");

    }

    @Test
    public void testAuthentication() {
        //1. 构建SecurityManager 环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(simpleAccountRealm);

        //2. 主体提交认证请求
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("admin", "123456");
        subject.login(token);

        System.out.println("是否认证通过：" + subject.isAuthenticated());

        subject.logout();

        System.out.println("是否认证通过：" + subject.isAuthenticated());
    }

    @Test
    public void testAuthentication1() {
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(simpleAccountRealm);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("admin", "123456");

        Subject subject = SecurityUtils.getSubject();
        subject.login(usernamePasswordToken);
        boolean authenticated = subject.isAuthenticated();
        System.out.println(authenticated);
        subject.logout();//注销
        boolean authenticated1 = subject.isAuthenticated();
        System.out.println(authenticated1);
    }

    @Test
    public void test2() {
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(simpleAccountRealm);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("xiaohu", "123");
         subject.login(usernamePasswordToken);
        boolean authenticated = subject.isAuthenticated();
        System.out.println(authenticated);

        subject.checkRole("VIP1");
        subject.checkRoles("VIP1","VIP2");


    }

}
*/
