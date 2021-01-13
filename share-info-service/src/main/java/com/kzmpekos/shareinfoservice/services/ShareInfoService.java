package com.kzmpekos.shareinfoservice.services;

import com.google.gson.Gson;
import com.kzmpekos.shareinfoservice.models.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShareInfoService implements IShareInfoService{
    //using https://financialmodelingprep.com/ 's API to get a share information
    @Override
    public Share getShare(String tradingCode) throws MalformedURLException {
        Share share=new Share();
        URL ur = new URL("https://financialmodelingprep.com/api/v3/company/profile/"+tradingCode);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(ur.openStream(), "UTF-8"))) {
            String stockInfoString=reader.lines().collect(Collectors.joining());
            Gson gson=new Gson();
            ShareInformationWrapper shareInfo=gson.fromJson(stockInfoString,ShareInformationWrapper.class);
            share.setCompanyName(shareInfo.getProfile().getCompanyName());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return share;
    }

    @Override
    public List<Share> getAllShares(String exchange) throws MalformedURLException {


        ShareList allSharesAsStocks=getStockList();
        ArrayList<Share> requestedMarketShares=new ArrayList<>();

        try{

            for(Stock stock:allSharesAsStocks.getShareslist()) {
                if (stock.getExchange().equals(exchange)) {
                    Share share = new Share();
                    share.setTradingCode(stock.getSymbol());
                    share.setSharePrice(stock.getPrice());
                    share.setCompanyName(stock.getName());
                    requestedMarketShares.add(share);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return requestedMarketShares;
    }


    //using https://financialmodelingprep.com/ 's API to get all available shares and their prices, then using a wrapper class for the returned String
    private ShareList getStockList() throws MalformedURLException {
        URL url = new URL("https://financialmodelingprep.com/api/v3/company/stock/list");
        ShareList stockList=new ShareList();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            String allStocks=reader.lines().collect(Collectors.joining());
            Gson gson=new Gson();
            stockList=gson.fromJson(allStocks,ShareList.class);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stockList;
    };
    //using https://financialmodelingprep.com/ 's API to get a share details
    @Override
    public ShareDetails getShareDetails(String tradingCode) throws MalformedURLException {
        ShareDetails shareInformation=new ShareDetails();
        URL url = new URL("https://financialmodelingprep.com/api/v3/company/profile/"+tradingCode);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            String allShareInfo=reader.lines().collect(Collectors.joining());
            Gson gson=new Gson();
            ShareInformationWrapper shareInformationWrapper=gson.fromJson(allShareInfo,ShareInformationWrapper.class);
            shareInformation=shareInformationWrapper.getProfile();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return shareInformation;
    }
}
