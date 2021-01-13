package com.kzmpekos.trackedsharesservice.models;

public class Notification {
    private String tradingCode;
    private float notificationValueMax;
    private float notificationValueMin;

    public Notification(){

    }

    public Notification(String tradingCode,float notificationValuemax,float notificationValueMin){
        this.notificationValueMax=notificationValuemax;
        this.notificationValueMin=notificationValueMin;
        this.tradingCode=tradingCode;
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
