package com.lvzhi.jdk8.date;

import java.time.LocalDate;

/**
 * Created by lvzhi on 2018/3/10
 */
public class Test {

    @org.junit.Test
    public void test1(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
    }

}
