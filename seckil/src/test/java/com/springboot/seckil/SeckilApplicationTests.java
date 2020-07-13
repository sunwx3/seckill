package com.springboot.seckil;


import com.springboot.seckil.model.UserTest;

import com.springboot.seckil.service.UserTestService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;




@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//由于是web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration
@WebAppConfiguration
public class SeckilApplicationTests {
    @Autowired
    private UserTestService userTestService;
    @Test
    public void contextLoads() {
    }
    @Before
    public void init(){
        System.out.println("开始测试---------------");
    }
    @After
    public void after(){
        System.out.println("测试结束---------------");
    }
    @Test
    public void testLogin(){
        UserTest user= new UserTest("tom","1234");
        Assert.assertNull(user);
        System.out.println(user);
    }
    @Test
    public void userTestRegist(){
        UserTest user= new UserTest("tom","1234",1);
        UserTest userTest = userTestService.regist(user);
        Assert.assertNotNull(userTest);
    }


}
