package com.springboot.seckil.repository;

import com.springboot.seckil.model.UserTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//<实体类名，主键类型>
//封装了增删改查，分页等操作
public interface UserTestRepository extends JpaRepository<UserTest,Integer> {
    //根据用户名查找用户
    public UserTest findByUsername(String username);
    //根据用户名查找密码
    public UserTest getUserTestByUsername(String username);
}
