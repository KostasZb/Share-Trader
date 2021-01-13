package com.kzmpekos.shareinfoservice.models;

public class ShareInformationWrapper {
    private String symbol;
    private ShareDetails profile;

    public ShareInformationWrapper(String symbol, ShareDetails profile) {
        this.symbol = symbol;
        this.profile = profile;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public ShareDetails getProfile() {
        return profile;
    }

    public void setProfile(ShareDetails profile) {
        this.profile = profile;
    }
}
