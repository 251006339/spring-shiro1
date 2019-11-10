/*
package com.hxm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.assertj.core.internal.bytebuddy.pool.TypePool;
import org.junit.Test;

*/
/**
 * @author XAIOHU
 * @date 2019/11/1 --10:46
 **//*

public class CustomTest {

    @Test
    public void test(){
        CustomRealm customRealm = new CustomRealm();
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(customRealm);//数据库提供的数据 用户 ,角色 权限赋给 Realm
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();//
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("admin","123456");
        subject.login(usernamePasswordToken);//前段提供的账号查询数据库获得账号和密码和前台提供的账号和密码做对比,不一致就会报错;IncorrectCredentials错误认证;
        System.out.println("是否认证通过:-->"+subject.isAuthenticated());
        subject.checkRole("VIP2");//授权角色和权限执行Authorization,  认证账号密码执行Authercation

        subject.checkPermission("user:delete");




    }

}
*/
