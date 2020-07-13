package com.springboot.seckil.service;

import com.springboot.seckil.VO.UserTestVO;
import com.springboot.seckil.model.UserTest;
import org.springframework.stereotype.Service;

public interface UserTestService {
    //注册
    public UserTest regist(UserTest userTest);
    //登录验证账号唯一性以及存在性
    public UserTestVO getByUsername(String username);
    //根据用户名获取密码
    public UserTest getUserTestByUsername(String username);
    //
    public void saveUserTestToRedisByToken(String token,UserTestVO userTestVO);
}
