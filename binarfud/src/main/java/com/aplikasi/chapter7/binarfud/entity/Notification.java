package com.aplikasi.chapter7.binarfud.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notification")
public class Notification implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "message")
    private String message;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "sent")
    private boolean sent;

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}