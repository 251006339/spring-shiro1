/*
package com.hxm;

import com.hxm.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

*/
/**
 * @author XAIOHU
 * @date 2019/10/31 --18:35
 **//*

public class IniReamlTest {
//数据源有IniReaml 读取资源文件;加入类里面取;
//jdbc Reaml 使用 jdbc数据库数据
    @Test

    public void test() {
        //读取资源user.ini的文件
        IniRealm iniRealm = new IniRealm("classpath:user.ini");
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(iniRealm);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("admin", "123456");
        subject.login(usernamePasswordToken);
        //判断是否认证通过前段过来的数据和数据库是否一致;
        boolean authenticated = subject.isAuthenticated();
        System.out.println(authenticated);

    }
    @Test
    public void test1(){



    }




}*/
