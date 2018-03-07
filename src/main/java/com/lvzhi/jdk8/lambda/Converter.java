package com.lvzhi.jdk8.lambda;

/**
 * Created by lvzhi on 2018/3/5
 */
@FunctionalInterface
public interface Converter<F,T> {
    T convvert(F from);
}
