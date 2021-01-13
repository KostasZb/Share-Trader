package com.kzmpekos.shareinfoservice.models;

public class Stock {

    private String symbol;
    private String name;
    private float price;
    private String exchange;
    public Stock() {

    }

    public Stock(String symbol, String name, float price, String exchange) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.exchange = exchange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
