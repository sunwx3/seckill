package com.springboot.seckil.controller;

import com.springboot.seckil.Utils.MD5Util;

import com.springboot.seckil.Utils.UUIDUtils;
import com.springboot.seckil.Utils.ValidateCode;
import com.springboot.seckil.VO.UserTestVO;
import com.springboot.seckil.base.controller.BaseApiController;
import com.springboot.seckil.base.result.Result;
import com.springboot.seckil.base.result.ResultCode;
import com.springboot.seckil.model.UserTest;
import com.springboot.seckil.service.UserTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class LoginController extends BaseApiController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private UserTestService userTestService;
    @RequestMapping(value = "/toLogin",method = RequestMethod.POST)
    public ModelAndView toLogin(){
        UserTest userTest = new UserTest();
        return new ModelAndView("login").addObject(userTest);
    }
    @RequestMapping(value = "/login")
    public Result<UserTestVO> toLogin(UserTest userTest, HttpSession session, Model model, String code, HttpServletResponse response){
        logger.info(userTest.toString());
        /*String sessionCode = (String) session.getAttribute("code");
        logger.info("sessionCode======"+sessionCode);
        if (!StringUtils.equalsIgnoreCase(code,sessionCode)){
            model.addAttribute("message","验证码不匹配");
            return null;
        }
        logger.info("username="+userTest.getUsername()+"password="+userTest.getPassword());*/
        logger.info("进入login=========");
        String username = userTest.getUsername();
        String password =userTest.getPassword();
        UserTestVO usertestVO = userTestService.getByUsername(username);
        if (usertestVO!=null && !usertestVO.equals("")){
            String passInDb =userTestService.getUserTestByUsername(username).getPassword();
            logger.info("passInDb"+passInDb);
            String pass = MD5Util.convertMD5(MD5Util.convertMD5(passInDb));
            logger.info(pass);
            if (password.equals(MD5Util.convertMD5(MD5Util.convertMD5(password)))){
                //将UserTest信息存入redis
                String token = UUIDUtils.getUUID();
                userTestService.saveUserTestToRedisByToken(token,usertestVO);
                Cookie cookie =new Cookie("token",token);
                cookie.setMaxAge(3600);
                cookie.setPath("/");
                response.addCookie(cookie);
                //session.setAttribute("user",userTest);
                logger.info("用户名密码正确");
                return Result.success(usertestVO);
            }else{
                return Result.failure(ResultCode.USER_LOGIN_ERROR);
            }
        }else {
            return Result.failure(ResultCode.USER_LOGIN_ERROR);
        }

    }
    /**
     * 响应验证码页面
     * @return
     */
    @RequestMapping(value="/validateCode")
    public String validateCode(HttpServletRequest request, HttpServletResponse response) throws Exception{
        // 设置响应的类型格式为图片格式
        response.setContentType("image/jpeg");
        //禁止图像缓存。
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        HttpSession session = request.getSession();

        ValidateCode vCode = new ValidateCode(120,40,5,100);
        session.setAttribute("code", vCode.getCode());
        vCode.write(response.getOutputStream());
        return null;
    }

}
