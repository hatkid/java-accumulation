package com.lvzhi.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lvzhi on 2018/3/10
 */
public class Test {
    private static List<String> lists;
    private static List<Integer> integerList;
    static {
        lists=new ArrayList<String >();
        lists.add("a1");
        lists.add("a2");
        lists.add("b1");
        lists.add("b2");
        lists.add("b3");
        lists.add("o1");
        integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(1);
        integerList.add(7);
        integerList.add(4);
    }


    @org.junit.Test
    public void test1() {


//        lists.stream().filter((m)->{return m.startsWith("a");})
//                .forEach((m)->System.out.println(m));
//        lists.stream().filter(m->m.startsWith("a"))
//                .forEach((m->{System.out.println(m);}));
//        lists.stream().filter(m->m.startsWith("a"))
//                .forEach(list::add);
//        lists.stream().filter(m->m.startsWith("a"))
//                .forEach(System.out::println);
//        list.forEach((m)->{System.out.println(m);});


//        integerList.forEach(System.out::println);

//        integerList.stream().sorted().forEach(System.out::println);
//        lists.stream().map((m)->m.length()).forEach(System.out::println);

    }

    @org.junit.Test
    public void test2(){
//        Stream.of(lists,integerList).flatMap(u->u.stream()).forEach(System.out::println);
//        boolean anyStartWithA = lists.stream().anyMatch((s -> s.startsWith("a")));
//        anyStartWithA = lists.stream().allMatch((s -> s.startsWith("a")));
//        System.out.println(anyStartWithA);
//        List<Integer> list = lists.stream().filter((p) -> p.startsWith("a")).sorted().map(n->n.length()).collect(Collectors.toList());
//        list.forEach(System.out::println);
//        Optional<String> optional = lists.stream().filter((p) -> p.startsWith("a")).sorted().reduce((s1, s2)->{return s1+"|"+s2;});
//        if (optional.isPresent()){
//            System.out.println(optional.get());
//        }
        List<Integer> list = lists.parallelStream().filter((p) -> p.startsWith("a")).sorted().map(n->n.length()).collect(Collectors.toList());
        list.forEach(System.out::println);
    }



}
