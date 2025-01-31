package com.home.project.Thread;

public class Task {
    private Object object = new Object();
    private void waitTask(){
        try {
            object.wait();
            System.out.println("OK");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void action1(){
        try {
            synchronized (object){
                System.out.println("action1");
                object.wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    private void f(){
        object.notifyAll();
    }
    public static void main(String[] args){
       // new Task().waitTask();
        new Task().action1();
        new Task().f();
    }

}
