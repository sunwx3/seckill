package com.springboot.seckil.base.result;

/**
 * 使用枚举类型定义静态错误信息，方便修改，查找，添加。
 * 我们约定，200 为成功，500 为失败，因为失败的情况和业务较多，我们用 500 开头，如 5002**表示用户相
 * 关业务出错等。
 */
public enum ResultCode {
    SUCCESS(200,"成功"),
    FAIL(500,"失败"),
    USER_LOGIN_ERROR(500201,"登陆失败，用户名密码出错，请重新输入！");
    private Integer code;

    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
