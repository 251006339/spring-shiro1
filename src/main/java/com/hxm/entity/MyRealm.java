package com.hxm.entity;

import com.hxm.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author XAIOHU
 * @date 2019/11/3 --14:10
 **/
public class MyRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;


    @Override //授权 角色,权限
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("授权执行");
        String username = (String) principalCollection.getPrimaryPrincipal();//获得token传过来用户名
        //定义数据库的密码:123456
        User user = userService.selectByName(username);

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
         //查询出来的授权信息;
        simpleAuthorizationInfo.addStringPermission(user.getPerms());//添加权限 user:add

        return simpleAuthorizationInfo;
    }

    @Override //认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("认证用户执行");
        String username = (String) authenticationToken.getPrincipal();
        User user = userService.selectByName(username);

        if(!username.equals(user.getUsername())){

        return null; //返回空--会login会报 unkoum异常;

       }
        String passwordByUsername = getPasswordByUsername(username);

        //如果密码不一致会报Indi  密码不一致异常; 第一个参数会根据getPrimaryPrincipal获得;
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username, user.getPassword(), "");

        return simpleAuthenticationInfo;
    }
    private String  getPasswordByUsername(String name){
         return "123456";
    }

}
