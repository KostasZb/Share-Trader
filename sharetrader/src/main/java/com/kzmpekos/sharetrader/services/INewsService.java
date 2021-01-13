package com.kzmpekos.sharetrader.services;

import com.kzmpekos.sharetrader.models.Reminder;
import com.kzmpekos.sharetrader.viewmodels.NewsViewModel;

import java.util.List;

public interface INewsService {
    public NewsViewModel getNewsViewModel(List<Reminder> reminders);
}
