package com.seattleclouds.modules.order.indiapay.api;

import org.json.JSONObject;

public class IndiaPayApiException extends Exception {
    private static final long serialVersionUID = 1;
    private JSONObject details;

    public IndiaPayApiException(String str) {
        super(str);
    }

    public IndiaPayApiException(String str, JSONObject jSONObject) {
        super(str);
        this.details = jSONObject;
    }

    public JSONObject getDetails() {
        return this.details;
    }

    public int getErrorCode() {
        return getDetails().getInt("code");
    }

    public String getErrorReason() {
        return getDetails().getJSONArray("errors").getJSONObject(0).getString("reason");
    }
}
