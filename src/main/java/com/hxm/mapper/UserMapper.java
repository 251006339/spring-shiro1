package com.hxm.mapper;


import com.hxm.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author XAIOHU
 * @date 2019/11/3 --18:11
 **/
@Mapper
public interface UserMapper {
      //selectByName
   User selectByName(String name);

}
