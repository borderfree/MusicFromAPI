package com.seattleclouds.api;

public class HttpResponseException extends Exception {
    private static final long serialVersionUID = 1;
    private int statusCode;

    public HttpResponseException(int i, String str) {
        super(str);
        this.statusCode = i;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
