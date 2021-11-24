package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public PendingIntent getResolution() {
        return this.mStatus.mo10798f();
    }

    public void startResolutionForResult(Activity activity, int i) {
        this.mStatus.mo10792a(activity, i);
    }
}
