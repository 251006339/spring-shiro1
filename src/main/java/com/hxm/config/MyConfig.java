package com.hxm.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.hxm.entity.MyRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * @author XAIOHU
 * @date 2019/11/3 --15:07
 **/
@Configuration
public class MyConfig {

    @Bean(name = "securityManager")  //先加载到myrealm里面的userService
    public DefaultWebSecurityManager securityManager(MyRealm myRealm) {
        //数据源
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();

        defaultWebSecurityManager.setRealm(myRealm);

        return defaultWebSecurityManager;
    }


    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //authc账号和密码一致;
        HashMap<String, String> filterMap = new HashMap();
        //执行的时候要认证下,过滤一下,如果是这个用户的角色就访问,不是就返回到其他页面;
        filterMap.put("/user/add", "authc");//访问useradd 请求时会被过滤,过滤到的地址为
        filterMap.put("/user/delete", "authc");
        filterMap.put("/user/*", "authc");
        //filterMap.put("/user/add", "perms[user:add]");
        // filterMap.put("/user/delete", "perms[user:delete]");//过滤器中如果需要权限,则就会判断这个用户是否有这个权限;
        //过滤器链,
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");

        shiroFilterFactoryBean.setLoginUrl("/login");//到这个页面;
        return shiroFilterFactoryBean;
    }

    @Bean
    public MyRealm realm() {


        return new MyRealm();
    }

    @Bean
    public ShiroDialect shiroDialect() {

        return new ShiroDialect();

    }
}


