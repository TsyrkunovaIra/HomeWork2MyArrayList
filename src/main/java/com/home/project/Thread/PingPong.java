package com.home.project.Thread;

import static java.lang.Thread.sleep;

public class PingPong {
    private String last ="PONG";
   
  private synchronized void action(String message) {
      while (true){
    if (last.equals(message)) {
        wait(this);
    }else {
        System.out.println(message);
        last = message;
        sleep(1000);
        notifyAll();
        }

    }}
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        new Thread(() -> pingPong.action("ping")).start();
        new Thread(() -> pingPong.action("ball")).start();
        new Thread(() -> pingPong.action("PONG")).start();

    }
    private static void wait (Object o){
      try {
          o.wait();
      }catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
    private static void sleep(long millis) {
      try {
          Thread.sleep(millis);
      }catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
}

