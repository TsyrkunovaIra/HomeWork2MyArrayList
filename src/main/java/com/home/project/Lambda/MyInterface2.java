package com.home.project.Lambda;

import java.util.function.ToDoubleFunction;

public interface MyInterface2 {
    public static void main(String[] args){
        ToDoubleFunction<String> length = x -> x.length();
        System.out.println(length.applyAsDouble("kfbgjkjfbgjlghbljh gfbhfgbhf"));
    }
}
