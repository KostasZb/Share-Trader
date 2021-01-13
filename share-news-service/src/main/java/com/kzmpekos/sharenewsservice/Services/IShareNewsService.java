package com.kzmpekos.sharenewsservice.Services;

import com.kzmpekos.sharenewsservice.models.NewsWrapper;

import java.net.MalformedURLException;

public interface IShareNewsService {
    public NewsWrapper getNews( String tradingCodes ) throws MalformedURLException;
}
