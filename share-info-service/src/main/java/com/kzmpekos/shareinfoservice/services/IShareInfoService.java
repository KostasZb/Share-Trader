package com.kzmpekos.shareinfoservice.services;

import com.kzmpekos.shareinfoservice.models.Share;
import com.kzmpekos.shareinfoservice.models.ShareDetails;

import java.net.MalformedURLException;
import java.util.List;

public interface IShareInfoService {
    public Share getShare(String tradingCode) throws MalformedURLException;
    public List<Share> getAllShares(String exchange) throws MalformedURLException;
    public ShareDetails getShareDetails(String tradingCode) throws MalformedURLException;
}
