package com.home.project.Thread;

public class LambdaExample {
    public static void main(String[] args){
        Runnable myRannable = () -> {
            System.out.println("This is a new thread.");
        };
        Thread thread = new Thread(myRannable);
        thread.start();
    }
}
