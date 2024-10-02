package com.aplikasi.chapter7.binarfud.service.impl;
import com.aplikasi.chapter7.binarfud.entity.Notification;
import com.aplikasi.chapter7.binarfud.repository.NotificationRepository;
import com.aplikasi.chapter7.binarfud.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getNotificationsToSend() {
        return notificationRepository.findAllBySent(false);
    }

    public void sendNotification(Notification notification) {
        notification.setSent(true);
        notificationRepository.save(notification);
    }
}

