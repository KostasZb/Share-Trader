package com.kzmpekos.sharetrader.services;

import com.kzmpekos.sharetrader.models.Share;
import com.kzmpekos.sharetrader.viewmodels.ShareInformationViewModel;

import java.util.List;

public interface ISharesService {
    public List<Share> getShares(String exchange);

    public ShareInformationViewModel getShareInformation(String tradingCode);

}
