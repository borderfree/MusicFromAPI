package com.facebook;

public class FacebookGraphResponseException extends FacebookException {
    private final C2199i graphResponse;

    public FacebookGraphResponseException(C2199i iVar, String str) {
        super(str);
        this.graphResponse = iVar;
    }

    public final C2199i getGraphResponse() {
        return this.graphResponse;
    }

    public final String toString() {
        FacebookRequestError a = this.graphResponse != null ? this.graphResponse.mo7795a() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (a != null) {
            sb.append("httpResponseCode: ");
            sb.append(a.mo6554b());
            sb.append(", facebookErrorCode: ");
            sb.append(a.mo6555c());
            sb.append(", facebookErrorType: ");
            sb.append(a.mo6558e());
            sb.append(", message: ");
            sb.append(a.mo6559f());
            sb.append("}");
        }
        return sb.toString();
    }
}
