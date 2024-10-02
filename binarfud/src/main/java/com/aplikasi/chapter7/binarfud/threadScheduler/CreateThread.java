package com.aplikasi.chapter7.binarfud.threadScheduler;

public class CreateThread extends Thread{
    @Override
    public  void run(){
        System.out.println("Inside : "+Thread.currentThread().getName());
    }

}
