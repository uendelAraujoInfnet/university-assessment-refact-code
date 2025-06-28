package com.uendel;

public class NotificationService {
    private final NotificationChannel channel;

    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
    }

    public void notifyUser(String message) {
        channel.send(message);
    }
}
