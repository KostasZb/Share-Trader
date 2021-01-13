package com.kzmpekos.notificationsdataservice.services;

import com.kzmpekos.notificationsdataservice.models.NewNotification;
import com.kzmpekos.notificationsdataservice.models.Notification;
import com.kzmpekos.notificationsdataservice.models.UserNotification;

import java.sql.*;
import java.util.ArrayList;

public class NotificationsService implements INotificationsService {
    //Retrieving user'snotifications from the database
    @Override
    public UserNotification getUserNotifications(String userId) {
        ArrayList<Notification> notifications =new ArrayList<Notification>();
        String url="jdbc:mysql://localhost:3308/notificationservicedb?autoReconnect=true&useSSL=false";
        String user="sharetrader";
        String password="sharetrader";
        try{
            Connection myCon= DriverManager.getConnection(url,user,password);
            Statement myStatement=myCon.createStatement();
            String sql="select * from notificationservicedb.notification where userid="+userId;
            ResultSet rs=myStatement.executeQuery(sql);
            while(rs.next()){

                Notification notification=new Notification(rs.getString("tradingCode"),rs.getInt("notificationValueMax"),rs.getInt("notificationValueMin"));
                notifications.add(notification);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        UserNotification userNotification=new UserNotification();
        userNotification.setUserNotification(notifications);
        return  userNotification;
    }
    //Adding a new notification to the database
    @Override
    public String setNotification(NewNotification notification) {
        String url="jdbc:mysql://localhost:3308/notificationservicedb?autoReconnect=true&useSSL=false";
        String user="sharetrader";
        String password="sharetrader";
        try{
            Connection myCon= DriverManager.getConnection(url,user,password);
            Statement myStatement=myCon.createStatement();
            String sql="INSERT INTO notificationservicedb.notification VALUES ('"+notification.getUserId()+"','"+notification.getTradingCode()+"','"+notification.getNotificationValueMax()+"','"+notification.getNotificationValueMin()+"')";
            myStatement.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }

        return "Share added to interests";
    }
}
