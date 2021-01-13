package com.kzmpekos.sharenewsservice.models;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.List;

public class News {
    private String news_url;
    private String image_url;
    private  String title;
    private String text;
    private String source_name;
    private String  date;
    private List<String> topics;
    private String sentiment;
    private String type;
    private List<String> tickers;

    public News() {
    }

    public News(String news_url, String image_url, String title, String text, String source_name, String date, List<String> topics, String sentiment, String type, List<String> tickers) {
        this.news_url = news_url;
        this.image_url = image_url;
        this.title = title;
        this.text = text;
        this.source_name = source_name;
        this.date = date;
        this.topics = topics;
        this.sentiment = sentiment;
        this.type = type;
        this.tickers = tickers;
    }

    public String getNews_url() {
        return news_url;
    }

    public void setNews_url(String news_url) {
        this.news_url = news_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getTickers() {
        return tickers;
    }

    public void setTickers(List<String> tickers) {
        this.tickers = tickers;
    }
}
