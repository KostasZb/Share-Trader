package com.kzmpekos.sharetrader.models;

public class ShareInformation {
    private float price;
    private float beta;
    private long volAvg;
    private String mktCap;
    private float lastDiv;
    private String range;
    private float changes;
    private String changesPercentage;
    private String companyName;
    private String exchange;
    private String industry;
    private String website;
    private String description;
    private String ceo;
    private String sector;
    private String image;

    public ShareInformation() {
    }

    public ShareInformation(float price, float beta, long volAvg, String mktCap, float lastDiv, String range, float changes, String changesPercentage, String companyName, String exchange, String industry, String website, String description, String ceo, String sector, String image) {
        this.price = price;
        this.beta = beta;
        this.volAvg = volAvg;
        this.mktCap = mktCap;
        this.lastDiv = lastDiv;
        this.range = range;
        this.changes = changes;
        this.changesPercentage = changesPercentage;
        this.companyName = companyName;
        this.exchange = exchange;
        this.industry = industry;
        this.website = website;
        this.description = description;
        this.ceo = ceo;
        this.sector = sector;
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getBeta() {
        return beta;
    }

    public void setBeta(float beta) {
        this.beta = beta;
    }

    public long getVolAvg() {
        return volAvg;
    }

    public void setVolAvg(long volAvg) {
        this.volAvg = volAvg;
    }

    public String getMktCap() {
        return mktCap;
    }

    public void setMktCap(String mktCap) {
        this.mktCap = mktCap;
    }

    public float getLastDiv() {
        return lastDiv;
    }

    public void setLastDiv(float lastDiv) {
        this.lastDiv = lastDiv;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public float getChanges() {
        return changes;
    }

    public void setChanges(float changes) {
        this.changes = changes;
    }

    public String getChangesPercentage() {
        return changesPercentage;
    }

    public void setChangesPercentage(String changesPercentage) {
        this.changesPercentage = changesPercentage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
