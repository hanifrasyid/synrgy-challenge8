package com.aplikasi.chapter7.binarfud.threadScheduler;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside Runnable: "+Thread.currentThread().getName());
    }
}
