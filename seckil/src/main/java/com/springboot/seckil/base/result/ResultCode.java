package com.springboot.seckil.base.result;

/**
 * 使用枚举类型定义静态错误信息，方便修改，查找，添加。
 * 我们约定，200 为成功，500 为失败，因为失败的情况和业务较多，我们用 500 开头，如 5002**表示用户相
 * 关业务出错等。
 */
public enum ResultCode {
    // 秒课错误: 500100 - 500199
    SECKILL_LINE_UP(500100, "排队中"),
    SECKILL_NO_QUOTE(500101, "非常抱歉该课程名额已满，请联系小姐姐。"),
    SECKILL_BOUGHT(500102, "你已购买该课程，请去订单页面查看。"),
    SECKILL_PATH_ERROR(500104, "你的请求地址不正确，请联系小姐姐。"),
    SECKILL_IP_OUTMAX(500105, "你的请求过于频繁，请稍后再试。"),

    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    USER_LOGIN_ERROR(500201, "登录失败，用户名或密码出错，请重新输入");




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
