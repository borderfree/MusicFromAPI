package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.rx */
public final class C3885rx {

    /* renamed from: a */
    public final String f14910a;

    /* renamed from: b */
    public final Uri f14911b;

    /* renamed from: c */
    public final Map<String, String> f14912c;

    /* renamed from: d */
    private final String f14913d;

    @TargetApi(21)
    public C3885rx(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public C3885rx(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private C3885rx(String str, Uri uri, @Nullable String str2, @Nullable Map<String, String> map) {
        this.f14910a = str;
        this.f14911b = uri;
        if (str2 == null) {
            str2 = "GET";
        }
        this.f14913d = str2;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.f14912c = map;
    }
}
