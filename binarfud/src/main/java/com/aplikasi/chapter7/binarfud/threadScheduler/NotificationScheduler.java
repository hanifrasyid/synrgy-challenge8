package com.aplikasi.chapter7.binarfud.threadScheduler;

import com.aplikasi.chapter7.binarfud.entity.Notification;
import com.aplikasi.chapter7.binarfud.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Component
public class NotificationScheduler {

    @Autowired //backround [proccses
    @Qualifier(value = "taskExecutor")
    private TaskExecutor taskExecutor;

    @Autowired
    private NotificationService notificationService;

    // Menjalankan job setiap hari pukul 12:00 siang

    @Scheduled(cron = "${cron.expression:-}")
    @Transactional
    public void sendAsync() {
        taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Method executed at 12 AM everyday. Current time is :: " + new Date());

                // Dapatkan daftar notifikasi yang harus dikirim
                List<Notification> notifications = notificationService.getNotificationsToSend();

                // Kirim notifikasi
                for (Notification notification : notifications) {
                    notificationService.sendNotification(notification);
                }
            }
        });
    }
}

