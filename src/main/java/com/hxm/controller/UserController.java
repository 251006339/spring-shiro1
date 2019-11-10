package com.hxm.controller;

import com.hxm.entity.Week;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.security.x509.DeltaCRLIndicatorExtension;

/**
 * @author XAIOHU
 * @date 2019/11/3 --14:20 redirect:/form
 **/
@Controller
public class UserController {

  @GetMapping("/login")
    public String toLogin(){

      return "login";
  }
    @PostMapping("/index")
    public String toIndex(@RequestParam("username") String name, @RequestParam("password") String password, Model model){
        System.out.println("---username"+name+"---password"+password);//通过shiro认证如果用户一致就可访问
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(name,password);
        Subject subject = SecurityUtils.getSubject();
        try {
             subject.login(usernamePasswordToken);
        } catch (UnknownAccountException e) {
           // e.printStackTrace();//用户名错误;就提示用户名错误;
            model.addAttribute("msg","用户名错误");
            return "login";
        } catch (IncorrectCredentialsException e) {
            e.printStackTrace();
            model.addAttribute("msg","密码错误");
            return "login";
        }

        return "index";
    }
    @GetMapping("/user/add")
    public String toUserAdd(){
     //访问useradd会过滤,判断是否认证;

        return "useradd";
    }
     @RequiresRoles("VIP1")
    @GetMapping("/user/delete")
    public String toUserDelete(){
  //执行之前都会执行过滤器链,如果不符号,就返回login页面;

        return "userdelete";
    }
    @GetMapping("/noAuth")
    public String noAuth(){


        return "noAuth";
    }
  //  http://localhost:8080/index
  @GetMapping("/index")
  public String toIndex1( String password, Model model){









      return "index";
  }
}
