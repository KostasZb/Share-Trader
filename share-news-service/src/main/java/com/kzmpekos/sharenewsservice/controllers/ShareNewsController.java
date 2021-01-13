package com.kzmpekos.sharenewsservice.controllers;

import com.kzmpekos.sharenewsservice.Services.IShareNewsService;
import com.kzmpekos.sharenewsservice.Services.ShareNewsService;
import com.kzmpekos.sharenewsservice.models.NewsWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;


@RestController
@RequestMapping("/news")
public class ShareNewsController {

    private IShareNewsService service=new ShareNewsService();
    @RequestMapping(value="/{tradingCodes}",method = RequestMethod.GET)
    public NewsWrapper getNews(@PathVariable("tradingCodes") String tradingCodes ) throws MalformedURLException {
        return service.getNews(tradingCodes);
    }
}
