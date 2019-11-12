package com.magic.utopia.common.config;

public enum UserLogType {
    register(1),login(2);
    private int code;
    private UserLogType(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }
}
