package com.springboot.seckil.service.impl;

import com.springboot.seckil.VO.UserTestVO;
import com.springboot.seckil.controller.LoginController;
import com.springboot.seckil.model.UserTest;
import com.springboot.seckil.redis.UserRedis;
import com.springboot.seckil.repository.UserTestRepository;
import com.springboot.seckil.service.UserTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional//事务层 处理数据
public class UserTestServiceImpl implements UserTestService {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    public UserTestRepository userTestRepository;
    @Autowired
    public UserRedis userRedis;
    @Override
    public UserTest regist(UserTest userTest) {
        return userTestRepository.saveAndFlush(userTest);
    }

    @Override
    public UserTestVO getByUsername(String username) {
        UserTestVO userTestVO = new UserTestVO();
        logger.info(userRedis.get(username).toString());

        UserTest userTest = userRedis.get(username);
        logger.info(userTest.toString());
        if (userTest == null){
            userTest = userTestRepository.findByUsername(username);
            userRedis.put(userTest.getUsername(),userTest,-1);
        }
        BeanUtils.copyProperties(userTest,userTestVO);
        logger.info(userTestVO.getUsername());
        return userTestVO;
    }

    @Override
    public UserTest getUserTestByUsername(String username) {
        return userTestRepository.getUserTestByUsername(username);
    }

    @Override
    public void saveUserTestToRedisByToken(String token,UserTestVO userTestVO) {
        UserTest userTest = new UserTest();
        BeanUtils.copyProperties(userTestVO,userTest);
        userRedis.put(token,userTest,-1);
    }
}
