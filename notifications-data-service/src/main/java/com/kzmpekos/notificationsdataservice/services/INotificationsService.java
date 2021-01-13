package com.kzmpekos.notificationsdataservice.services;

import com.kzmpekos.notificationsdataservice.models.NewNotification;
import com.kzmpekos.notificationsdataservice.models.UserNotification;

public interface INotificationsService {
    public UserNotification getUserNotifications(String userId);
    public String setNotification(NewNotification notification);
}
