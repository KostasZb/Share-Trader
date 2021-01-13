package com.kzmpekos.shareinfoservice.models;

import java.util.List;

public class ShareList {
    public ShareList() {
    }

    private List<Stock> symbolsList;

    public List<Stock> getShareslist() {
        return symbolsList;
    }

    public void setShareslist(List<Stock> symbolsList) {
        this.symbolsList = symbolsList;
    }

    public ShareList(List<Stock> symbolsList) {
        this.symbolsList = symbolsList;
    }
}
