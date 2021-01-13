package com.kzmpekos.sharetrader.services;

import com.kzmpekos.sharetrader.models.NewNotification;
import com.kzmpekos.sharetrader.models.Reminder;

import java.util.List;

public interface IRemindersService {
    public List<Reminder> getAllReminders(String userId);

    public String registerInterest(NewNotification notification);
}
