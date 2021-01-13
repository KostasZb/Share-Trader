package com.kzmpekos.trackedsharesservice.models;

import java.util.List;

public class UserNotification {
    private List<Notification> userNotification;

    public List<Notification> getUserNotification() {
        return userNotification;
    }

    public void setUserNotification(List<Notification> userNotification) {
        this.userNotification = userNotification;
    }
}
