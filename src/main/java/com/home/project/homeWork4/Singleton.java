package com.home.project.homeWork4;

public class Singleton {
    private static Singleton user;
    private Singleton(){}
    public static Singleton getSingleton(){
        if (user == null){
            user = new Singleton();
        }
        return user;
    }
}

