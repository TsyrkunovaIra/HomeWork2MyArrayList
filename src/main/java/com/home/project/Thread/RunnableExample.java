package com.home.project.Thread;

public class RunnableExample {
    public void run(){
        Thread current =Thread.currentThread();
while (!current.isInterrupted()){
    try {
        Thread.sleep(1000);
    }catch (InterruptedException e){
        e.printStackTrace();
        current.interrupt();
    }
}
    }
    public static void main(String[] args) throws InterruptedException{
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        
        }


}
