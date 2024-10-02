package com.aplikasi.chapter7.binarfud.threadScheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadRunnableSleep implements  Runnable{
    @Override
    public void run() {
        System.out.println("Inside Runnable sleep: "+Thread.currentThread().getName());
        for(int i =0; i<=10; i++){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String dateString=sdf.format(new Date());
            System.out.println("Menunggu selama 1 detik = "+dateString);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
