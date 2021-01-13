package com.kzmpekos.sharetrader.models;

public class Share {
    private String tradingCode;
    private float numberOfShares;
    private float sharePrice;
    private String companyName;
    private int companyMarketValue;

    public Share() {

    }

    public Share(String tradingCode, int numberOfShares, float sharePrice, String companyName, int companyMarketValue) {
        this.tradingCode = tradingCode;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
        this.companyName = companyName;
        this.companyMarketValue = companyMarketValue;
    }

    public String getTradingCode() {
        return tradingCode;
    }

    public void setTradingCode(String tradingCode) {
        this.tradingCode = tradingCode;
    }

    public float getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(float numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public float getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(float sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyMarketValue() {
        return companyMarketValue;
    }

    public void setCompanyMarketValue(int companyMarketValue) {
        this.companyMarketValue = companyMarketValue;
    }
}
