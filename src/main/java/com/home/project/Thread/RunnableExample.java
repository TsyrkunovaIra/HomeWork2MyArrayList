package com.home.project.Thread;

public class RunnableExample {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        }

}
