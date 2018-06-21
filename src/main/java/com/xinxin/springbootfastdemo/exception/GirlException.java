package com.xinxin.springbootfastdemo.exception;

import com.xinxin.springbootfastdemo.enums.ResultEnum;

/**
 * 自定义异常
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
