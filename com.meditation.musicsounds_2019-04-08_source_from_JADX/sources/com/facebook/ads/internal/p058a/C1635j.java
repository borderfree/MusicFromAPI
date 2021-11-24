package com.facebook.ads.internal.p058a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.internal.p070l.C1714a.C1715a;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p072o.C1731e;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.j */
class C1635j extends C1627b {

    /* renamed from: d */
    private static final String f5315d = "j";

    /* renamed from: e */
    private final Uri f5316e;

    /* renamed from: f */
    private final Map<String, String> f5317f;

    C1635j(Context context, C1728c cVar, String str, Uri uri, Map<String, String> map) {
        super(context, cVar, str);
        this.f5316e = uri;
        this.f5317f = map;
    }

    /* renamed from: a */
    public C1715a mo6654a() {
        return null;
    }

    /* renamed from: b */
    public void mo6655b() {
        C1731e eVar = C1731e.IMMEDIATE;
        String queryParameter = this.f5316e.getQueryParameter("priority");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                eVar = C1731e.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        this.f5294b.mo6940a(this.f5295c, this.f5317f, this.f5316e.getQueryParameter("type"), eVar);
    }
}
