package com.springboot.seckil;

import com.springboot.seckil.model.UserTest;
import com.springboot.seckil.redis.UserRedis;
import com.springboot.seckil.service.UserTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//由于是web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration
@WebAppConfiguration
public class UserServiceTest {
    @Autowired
    public UserTestService userTestService;
    @Resource
    UserRedis userRedis;
    @Test
    public void testUserRedisPut(){
        UserTest userTest =new UserTest("tom","OOoo0000");
        userRedis.put(userTest.getUsername(),userTest,-1);
    }
}
