package com.kzmpekos.sharetrader.viewmodels;

import com.kzmpekos.sharetrader.models.News;

import java.util.List;

public class NewsViewModel extends BaseViewModel {
    private List<News> data;

    public NewsViewModel() {
    }

    public NewsViewModel(List<News> data) {
        super("news", "News Page");
        this.data = data;
    }

    public List<News> getData() {
        return data;
    }

    public void setData(List<News> data) {
        this.data = data;
    }
}
