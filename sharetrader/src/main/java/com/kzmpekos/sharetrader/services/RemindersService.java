package com.kzmpekos.sharetrader.services;

import com.kzmpekos.sharetrader.models.NewNotification;
import com.kzmpekos.sharetrader.models.Reminder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RemindersService implements IRemindersService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Reminder> getAllReminders(String userId) {
        List<Reminder> response = restTemplate.getForObject("http://tracked-shares-service/trackedShares/" + userId, List.class);
        return response;
    }

    @Override
    public String registerInterest(NewNotification notification) {
        return restTemplate.postForObject("http://notifications-data-service/notificationsdata/addNotification/", notification, String.class);
    }
}
