/*
package com.hxm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

*/
/**
 * @author XAIOHU
 * @date 2019/11/1 --10:15自定义的类继承AyuthorzizingRealm 重写
 **//*

public class CustomRealm extends AuthorizingRealm {
    Map<String, String> map1 = new HashMap<>();

    {//admin
        map1.put("admin","e10adc3949ba59abbe56e057f20f883e");
        super.setName("customRealm");
    }

    @Override //数据库提供的用户 角色 权限  认证的数据来和授权比较是否一致;获得权限
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        String username = (String) principalCollection.getPrimaryPrincipal();
        System.out.println(username);
        String passwordByUserName = getPasswordByUserName(username);
        Set<String> rolesByUsername = getRolesByUsername(username);//通过用户获得role;
        Set<String> permissionByUsername = getPermissionByUsername(username);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRoles(rolesByUsername);//加入到role
        simpleAuthorizationInfo.addStringPermissions(permissionByUsername);


        return simpleAuthorizationInfo;
    }

    @Override //前段传过来的数据认证 账号
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //1从主体传过来的账号中,获取用户名;
        String username = (String) authenticationToken.getPrincipal();
        //2通过用户名去到数据库中获取凭证;                                                 v
        String passwordByUserName = getPasswordByUserName(username);
        if (passwordByUserName == null) {
            return null;
        }//t是认证  前端提供的账号和密码查询数据库
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username, passwordByUserName, "customRealm");

        //simpleAuthenticationInfo.setCredentials(ByteSource.Util.bytes("pyy"));//设置username--passwordByUserName+pyy-加盐

        return simpleAuthenticationInfo;
    }

    //根据用户名获得password
    private String getPasswordByUserName(String username) {
        String s = map1.get(username);//123456

        return s;
    }

    private Set<String> getPermissionByUsername(String username) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("user:add");
        hashSet.add("user:delete");
        hashSet.add("user:update");

        return hashSet;
    }

    private Set<String> getRolesByUsername(String username) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("admin");
        hashSet.add("VIP1");
        hashSet.add("VIP2");
        return hashSet;
    }


}
*/
