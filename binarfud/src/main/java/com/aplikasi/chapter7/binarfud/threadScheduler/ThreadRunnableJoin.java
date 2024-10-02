package com.aplikasi.chapter7.binarfud.threadScheduler;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRunnableJoin implements  Runnable{
    @Override
    public void run() {
        System.out.println("Inside Runnable: "+Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadRunnableJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
