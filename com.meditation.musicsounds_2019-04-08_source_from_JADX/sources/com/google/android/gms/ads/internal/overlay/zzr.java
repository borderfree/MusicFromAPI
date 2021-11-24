package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;

@C3464ci
public final class zzr extends zzd {
    public zzr(Activity activity) {
        super(activity);
    }

    public final void onCreate(Bundle bundle) {
        C3643iy.m18780a("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f10064d = 3;
        this.f10061a.finish();
    }
}
