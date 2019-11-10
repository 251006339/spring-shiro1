package com.hxm.entity;

import java.util.List;

/**
 * @author XAIOHU
 * @date 2019/11/5 --9:47
 **/
public enum Week {
    Monday(1,2),Tuesday(1,2),Wednesday(1,2),Thursday(1,2),Friday(1,2),Saturday(2,0),Sunday(2,0);
    private Integer work;
    private Integer day;

    Week(Integer work, Integer  day) {
        this.work = work;
        this.day = day;
    }
    //提供私有方法
    public Integer getWork() {
        return work;
    }
   //提供私有方法;
    public Integer getDay() {
        return day;
    }
}
