package com.lvzhi.jdk8.base64;

import java.util.Base64;

/**
 * Created by lvzhi on 2018/3/10
 */
public class Test {

    @org.junit.Test
    public void test(){
        String base = Base64.getEncoder().encodeToString("hello".getBytes());
        System.out.println(base);
        String baseRever = new String(Base64.getDecoder().decode(base));
        System.out.println(baseRever);
    }

}
