package com.aplikasi.chapter7.binarfud.service;

import com.aplikasi.chapter7.binarfud.entity.Notification;
import java.util.List;

public interface NotificationService {
    public List<Notification> getNotificationsToSend();
    public void sendNotification(Notification notification);
}