package com.kzmpekos.sharenewsservice.Services;

import com.google.gson.Gson;
import com.kzmpekos.sharenewsservice.models.NewsWrapper;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

public class ShareNewsService implements IShareNewsService {
    //Getting the share news as per trading codes retrieved and returning a newswrapper object
    @Override
    public NewsWrapper getNews(String tradingCodes) throws MalformedURLException {
        NewsWrapper newsWrapper=new NewsWrapper();
        URL url= new URL("https://stocknewsapi.com/api/v1?tickers="+tradingCodes+"&items=50&token=akredacoslxtbn5chklsio67yhe2c8van0jw0i4s");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            String allStocks=reader.lines().collect(Collectors.joining());
            Gson gson=new Gson();
            newsWrapper=gson.fromJson(allStocks,NewsWrapper.class);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newsWrapper;
    }
}
