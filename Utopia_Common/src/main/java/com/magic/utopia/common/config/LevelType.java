package com.magic.utopia.common.config;

public enum  LevelType {
    heitie(1,"黑铁"),qingtong(2,"青铜"),baiyin(3,"白银"),huangjin(4,"黄金"),bojin(5,"铂金"),zuanshi(6,"砖石"),rongyao(7,"荣耀");
    private int code;
    private String value;
    private LevelType(int code,String value){
        this.code=code;
        this.value=value;
    }
    public int getCode(){
        return code;
    }
    public String getValue(){
        return value;
    }
}
