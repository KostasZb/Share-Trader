package com.kzmpekos.trackedsharesservice.models;

public class TrackedShare {
    private String companyName;
    private float notificationValueMax;
    private float notificationValueMin;
    private String tradingCode;


    public TrackedShare(String companyName, float notificationValueMax, float notificationValueMin,String tradingCode) {
        this.companyName = companyName;
        this.notificationValueMax = notificationValueMax;
        this.notificationValueMin = notificationValueMin;
        this.tradingCode=tradingCode;
    }

    public String getTradingCode() {
        return tradingCode;
    }

    public void setTradingCode(String tradingCode) {
        this.tradingCode = tradingCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
