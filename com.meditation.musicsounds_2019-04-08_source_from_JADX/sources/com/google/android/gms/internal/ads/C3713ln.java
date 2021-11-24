package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.C3312q;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.ln */
final class C3713ln implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ Context f14397a;

    C3713ln(C3712lm lmVar, Context context) {
        this.f14397a = context;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences = this.f14397a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C3643iy.m18780a("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f14397a);
            C3312q.m15086a(this.f14397a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        C3643iy.m18780a("User agent is already initialized on Google Play Services.");
        return string;
    }
}
