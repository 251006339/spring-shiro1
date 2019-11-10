package com.hxm.eunm;

/**
 * @author XAIOHU
 * @date 2019/11/8 --17:27
 **/
public enum PersonEnum {
    Funtry("sdsa");
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    PersonEnum(String name) {
        this.name = name;
    }
}
