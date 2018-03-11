package com.lvzhi.jdk8.date;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lvzhi on 2018/3/10
 */
public class Test {

    @org.junit.Test
    public void test1(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
    }


    @org.junit.Test
    public void test2(){
        String s = new String("s");
        String s1 = new String("s") + new String("s");
        String s2 = new String("s") + new String("s");
        System.out.println(s1 == s1);
        System.out.println(s1.hashCode() == s2.hashCode());
        Map<String,String> map = new HashMap<>();
        map.put(s1,"a");
        map.put(s2,"b");
        System.out.println(map.size());
    }
}
