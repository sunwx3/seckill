package com.springboot.seckil.base.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

//新建BaseApiController类，定义所有api接口的URL前缀，并开放跨域访问权限
@RequestMapping("/api")
//@CrossOrigin 是用来处理跨域请求让你能访问不同域的文件的注解
@CrossOrigin(origins = "*",allowCredentials = "true")
public class BaseApiController {
}
