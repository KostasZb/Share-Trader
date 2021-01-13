package com.kzmpekos.notificationsdataservice.Controllers;

import com.kzmpekos.notificationsdataservice.models.NewNotification;
import com.kzmpekos.notificationsdataservice.models.UserNotification;
import com.kzmpekos.notificationsdataservice.services.INotificationsService;
import com.kzmpekos.notificationsdataservice.services.NotificationsService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/notificationsdata")
public class NotificationsController {

    INotificationsService service=new NotificationsService();

    @RequestMapping(value="users/{userId}",method = RequestMethod.GET)
    public UserNotification getUserNotification(@PathVariable("userId") String userId){
        return service.getUserNotifications(userId);
    }

    @RequestMapping(value="addNotification",method = RequestMethod.POST)
    public String setNotification(@RequestBody NewNotification notification){
        return service.setNotification(notification);
    }




}
