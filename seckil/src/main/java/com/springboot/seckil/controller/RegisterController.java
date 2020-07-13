package com.springboot.seckil.controller;

import com.springboot.seckil.Utils.MD5Util;
import com.springboot.seckil.model.UserTest;
import com.springboot.seckil.service.UserTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@ResponseBody
public class RegisterController {
    private static Logger logger = LoggerFactory.getLogger(RegisterController.class);
    @Autowired
    private UserTestService userTestService;
    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    public ModelAndView toRegister(){
        UserTest userTest = new UserTest();
        return new ModelAndView("register").addObject(userTest);
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ModelAndView register(@ModelAttribute("userTest")UserTest userTest){
        String MD5pass = MD5Util.string2MD5(userTest.getPassword());
        userTest.setPassword(MD5pass);
        UserTest regist = userTestService.regist(userTest);
        logger.info("username="+userTest.getUsername()+"password="+userTest.getPassword()+userTest.getId());
        return new ModelAndView("/register");
    }
}
