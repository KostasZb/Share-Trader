package com.kzmpekos.trackedsharesservice.services;

import com.kzmpekos.trackedsharesservice.models.Share;
import com.kzmpekos.trackedsharesservice.models.TrackedShare;
import com.kzmpekos.trackedsharesservice.models.UserNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrackedSharesService implements ITrackedSharesService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List<TrackedShare> getTrackedShares(String userId) {
        UserNotification notifications=restTemplate.getForObject("http://notifications-data-service/notificationsdata/users/"+userId, UserNotification.class);
        return notifications.getUserNotification().stream().map(notification -> {
            Share share= restTemplate.getForObject("http://share-info-service/sharedata/shares/"+notification.getTradingCode(), Share.class);
            return new TrackedShare(share.getCompanyName(), notification.getNotificationValueMax(),notification.getNotificationValueMin(),notification.getTradingCode());
        })
                .collect(Collectors.toList());
    }
}
