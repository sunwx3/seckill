package com.springboot.seckil.base.result;

/**
 * 静态方法帮JavaBean赋值，得到我们想要的返回结果
 * 转换成json{"code":200,"message":"成功","data":{"username":"guest","password":"02a05c6e278d3e19afaca4f3f7cf47d9","repassword":"qqqqqqq","id":1024}}
 * @param <T>
 */
public class Result<T> {

    private Integer code;

    private String message;

    private T data;

    //调用失败返回的结果
    public static <T> Result<T> failure(){
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.FAIL);
        return result;
    }
    //调用失败返回的结果，加上data
    public static <T> Result<T> failure(T data){
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }
    //根据枚举类中定义的枚举值进行返回
    public static <T> Result<T> failure(ResultCode resultCode){
        Result<T> result = new Result<>();
        result.setResultCode(resultCode);
        return result;
    }
    //根据枚举类中定义的枚举值，参数data 进行返回
    public static <T> Result<T> failure(ResultCode resultCode,T data){
        Result<T> result = new Result<>();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }
    //调用成功返回的结果
    public static <T> Result<T> success(){
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.FAIL);
        return result;
    }
    //调用成功返回的结果
    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }
    //内部方法  调用到时快速设置枚举值
    public void setResultCode(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
