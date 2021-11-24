package com.google.android.gms.common.api;

public class ApiException extends Exception {
    protected final Status mStatus;

    public ApiException(Status status) {
        int e = status.mo10796e();
        String b = status.mo10793b() != null ? status.mo10793b() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 13);
        sb.append(e);
        sb.append(": ");
        sb.append(b);
        super(sb.toString());
        this.mStatus = status;
    }

    public int getStatusCode() {
        return this.mStatus.mo10796e();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.mo10793b();
    }
}
