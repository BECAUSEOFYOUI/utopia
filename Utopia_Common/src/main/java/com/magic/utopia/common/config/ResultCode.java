package com.magic.utopia.common.config;

public enum  ResultCode {
    success(200),fail(400);
    private int code;
    private ResultCode(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }
}
