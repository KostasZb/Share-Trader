package com.kzmpekos.sharetrader.services;

import com.kzmpekos.sharetrader.models.Share;
import com.kzmpekos.sharetrader.viewmodels.ShareInformationViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TrackedSharesService implements ISharesService {
    @Autowired
    private RestTemplate restTemplate;

    //Getting A list of Available shares from the share-info-service
    @Override
    public List<Share> getShares(String exchange) {
        List<Share> response = restTemplate.getForObject("http://share-info-service/sharedata/allshares/" + exchange, List.class);
        return response;
    }

    @Override
    public ShareInformationViewModel getShareInformation(String tradingCode) {
        ShareInformationViewModel response = restTemplate.getForObject("http://share-info-service/sharedata/shareInfo/" + tradingCode, ShareInformationViewModel.class);
        return response;
    }
}
