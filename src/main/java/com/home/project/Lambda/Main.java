package com.home.project.Lambda;

public class Main {
    public static void main(String[] args){
        MyInterface ref;
        ref = () -> 1.61803;
        System.out.println("   = " + ref.getGoldenRationalValue());
    }
}
