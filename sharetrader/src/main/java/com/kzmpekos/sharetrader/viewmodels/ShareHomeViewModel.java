package com.kzmpekos.sharetrader.viewmodels;

import com.kzmpekos.sharetrader.models.Share;

import java.util.ArrayList;
import java.util.List;

public class ShareHomeViewModel extends BaseViewModel {
    private List<Share> shares;

    public List<Share> getShares() {
        return shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }

    public ShareHomeViewModel() {
        this(new ArrayList<Share>());
    }

    public ShareHomeViewModel(List<Share> shares) {

        super("Shares", "Shares Home Page");
        setShares(shares);
    }
}
