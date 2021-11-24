package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.lo */
final class C3714lo implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ Context f14398a;

    /* renamed from: b */
    private final /* synthetic */ Context f14399b;

    C3714lo(C3712lm lmVar, Context context, Context context2) {
        this.f14398a = context;
        this.f14399b = context2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f14398a != null) {
            C3643iy.m18780a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f14398a.getSharedPreferences("admob_user_agent", 0);
        } else {
            C3643iy.m18780a("Attempting to read user agent from local cache.");
            sharedPreferences = this.f14399b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C3643iy.m18780a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f14399b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                C3643iy.m18780a("Persisting user agent.");
            }
        }
        return string;
    }
}
