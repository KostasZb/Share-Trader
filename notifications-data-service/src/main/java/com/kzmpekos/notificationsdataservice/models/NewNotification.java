package com.kzmpekos.notificationsdataservice.models;

public class NewNotification {
    private int userId;
    private String tradingCode;
    private float notificationValueMax;
    private float notificationValueMin;

    public NewNotification(){

    }

    public NewNotification(int userId, String tradingCode, float notificationValueMax, float notificationValueMin) {
        this.userId = userId;
        this.tradingCode = tradingCode;
        this.notificationValueMax = notificationValueMax;
        this.notificationValueMin = notificationValueMin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTradingCode() {
        return tradingCode;
    }

    public void setTradingCode(String tradingCode) {
        this.tradingCode = tradingCode;
    }

    public float getNotificationValueMax() {
        return notificationValueMax;
    }

    public void setNotificationValueMax(float notificationValueMax) {
        this.notificationValueMax = notificationValueMax;
    }

    public float getNotificationValueMin() {
        return notificationValueMin;
    }

    public void setNotificationValueMin(float notificationValueMin) {
        this.notificationValueMin = notificationValueMin;
    }
}
