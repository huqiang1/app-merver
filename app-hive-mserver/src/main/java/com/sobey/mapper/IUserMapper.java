package com.sobey.mapper;

import com.sobey.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface IUserMapper {


    @Insert("insert into t_user(uuid,userName,phone,email,token) values(#{uuid},#{userName},#{phone},#{email},#{token})")
    void add(User user);

    @Select("slelect * from t_user where uuid = #{uuid}")
    User select(User user);
}
