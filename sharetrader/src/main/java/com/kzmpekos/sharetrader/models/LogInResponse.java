package com.kzmpekos.sharetrader.models;

public class LogInResponse {
    private boolean success;
    private String result;

    public boolean getSuccess() {
        return success;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
