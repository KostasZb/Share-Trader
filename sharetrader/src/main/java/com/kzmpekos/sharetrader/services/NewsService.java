package com.kzmpekos.sharetrader.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kzmpekos.sharetrader.models.Reminder;
import com.kzmpekos.sharetrader.viewmodels.NewsViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NewsService implements INewsService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public NewsViewModel getNewsViewModel(List<Reminder> reminders) {

        ObjectMapper mapper = new ObjectMapper();
        List<Reminder> allreminders = mapper.convertValue(reminders, new TypeReference<List<Reminder>>() {
        });
        String tradingCodes = "";
        if (allreminders.size() > 0) {
            tradingCodes = allreminders.get(0).getTradingCode();
            if (allreminders.size() > 1) {
                for (int counter = 1; counter < allreminders.size(); counter++) {
                    tradingCodes = tradingCodes + "," + allreminders.get(counter).getTradingCode();
                }
            }
        }

        NewsViewModel newsViewModel = restTemplate.getForObject("http://share-news-service/news/" + tradingCodes, NewsViewModel.class);
        return newsViewModel;
    }
}
