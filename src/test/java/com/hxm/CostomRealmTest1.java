/*
package com.hxm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

*/
/**
 * @author XAIOHU
 * @date 2019/11/1 --11:27
 **//*

public class CostomRealmTest1 {
    public static void main(String[] args) {
        // 加salt密码
        Md5Hash md5Hash = new Md5Hash("123456");
        System.out.println(md5Hash);
    }


    @Test
    public void test(){
        CustomRealm customRealm = new CustomRealm();
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
         defaultSecurityManager.setRealm(customRealm);
         HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");//加密算法类型
        hashedCredentialsMatcher.setHashIterations(1);//加密次数
        customRealm.setCredentialsMatcher(hashedCredentialsMatcher);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();
         //数据源加密,传入的数据也得加密;
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("admin","123456");

        subject.login(usernamePasswordToken);
        System.out.println("是否有这个角色"+subject.hasRole("VIP1"));
        subject.checkRole("VIP1");
        subject.checkPermission("user:delete");

    }



}
*/
