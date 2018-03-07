package com.lvzhi.jdk8.lambda;

import jj2000.j2k.util.MathUtil;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.Random;
import java.util.function.*;

/**
 * Created by lvzhi on 2018/3/5
 */
public class TestLambda {


    @org.junit.Test
    public void test1() {
        Converter<String, Integer> converter = i -> Integer.valueOf(i);
        System.out.println(converter.convvert("111"));

        Converter<String, Integer> converter2 = (i) -> {
            System.out.println("start");
            return Integer.valueOf(i);
        };
        System.out.println(converter2.convvert("111"));
    }

    @org.junit.Test
    public void test2() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("old thread");
            }
        }).start();

        new Thread(()-> System.out.println("new thread")).start();
    }

    @org.junit.Test
    public void testConsumer(){
        //消费型接口
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {

            }
        };
        Consumer<String> consumer1 = (m)->System.out.println(m);
        consumer1.accept("a");

        System.out.println("---------------");
        happy(1,(p)->System.out.println(p+" haha"));

    }
    private void happy(double d, Consumer<Double> c){
        c.accept(d);
    }

    @org.junit.Test
    public void testSupplier(){
        Supplier<Integer> supplier = new Supplier(){

            @Override
            public Object get() {
                return 1;
            }
        };
        System.out.println(supplier.get());
        Supplier<Double> supplier2 = () -> Math.random();
        System.out.println(supplier2.get());
    }

    @org.junit.Test
    public void testFunction(){
        Function<String, Integer> function = m -> Integer.valueOf(m);
        System.out.println(function.apply("111"));
    }

    @org.junit.Test
    public void testPredicate(){
        Predicate<Integer> predicate = (m) -> m > 1;
        System.out.println(predicate.test(2));
        System.out.println(predicate.test(0));
    }

    @org.junit.Test
    public void test3(){
        PrintStream ps = System.out;
        Consumer<String> consumer = ps::println;
        consumer.accept("s");

        Consumer<String> consumer1 = System.out::println;
        consumer.accept("d");

        Function<String, String> function = String::valueOf;
        System.out.println(function.apply("22"));

        BiPredicate<String,String> biPredicate = String::equals;
        System.out.println(biPredicate.test("1","1"));


    }



}
