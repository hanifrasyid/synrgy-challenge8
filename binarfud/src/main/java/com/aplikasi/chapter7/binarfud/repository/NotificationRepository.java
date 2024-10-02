package com.aplikasi.chapter7.binarfud.repository;
import com.aplikasi.chapter7.binarfud.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>, JpaSpecificationExecutor<Notification> {

    List<Notification> findAllBySent(boolean sent);
}