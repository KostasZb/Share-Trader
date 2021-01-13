package com.kzmpekos.sharenewsservice.models;

import java.util.List;

public class NewsWrapper {
    private List<News> data;

    public NewsWrapper() {
    }

    public NewsWrapper(List<News> data) {
        this.data = data;
    }

    public List<News> getData() {
        return data;
    }

    public void setData(List<News> data) {
        this.data = data;
    }
}
