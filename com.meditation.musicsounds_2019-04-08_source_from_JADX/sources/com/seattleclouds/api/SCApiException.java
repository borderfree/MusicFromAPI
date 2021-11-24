package com.seattleclouds.api;

import org.json.JSONObject;

public class SCApiException extends Exception {
    private static final long serialVersionUID = 1;
    private JSONObject details;

    public SCApiException(String str, JSONObject jSONObject) {
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
