package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class aqr {
    /* renamed from: a */
    public static void m16934a(aqp aqp, aqo aqo) {
        if (aqo.mo12302b() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(aqo.mo12303c())) {
            aqp.mo12307a(aqo.mo12302b(), aqo.mo12303c(), aqo.mo12301a(), aqo.mo12304d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
