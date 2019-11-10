package com.test.mock;

import com.hxm.entity.User;
import com.hxm.mapper.UserMapper;
import com.hxm.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.util.MockUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author XAIOHU
 * @date 2019/11/5 --13:04
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockTest {

    /*@MockBean
    UserService userService;*/
   @MockBean//模拟了一个-MockBean
    UserMapper userMapper;
    @Resource
    UserService userService;

@Test
   public void test(){

    User user=new User();
    user.setId(1);
    user.setUsername("admin");
    user.setPassword("123456");
    User user1=new User();
    user1.setId(2);
    User user2=new User();
    user2.setId(3);
    Mockito.when(userMapper.selectByName(Mockito.any())).
            thenReturn(user).thenReturn(user1).thenReturn(user2);

    User name = userService.selectByName("name");
    System.out.println(name);




}


}
