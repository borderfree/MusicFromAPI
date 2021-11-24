package com.facebook.ads.internal.p058a;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1788d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.h */
public abstract class C1633h extends C1627b {

    /* renamed from: d */
    protected final C1637l f5311d;

    public C1633h(Context context, C1728c cVar, String str, C1637l lVar) {
        super(context, cVar, str);
        this.f5311d = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6663a(Map<String, String> map, C1626a aVar) {
        if (!TextUtils.isEmpty(this.f5295c)) {
            if (this instanceof C1631f) {
                this.f5294b.mo6945f(this.f5295c, map);
            } else {
                this.f5294b.mo6941b(this.f5295c, map);
            }
            boolean a = C1626a.m8170a(aVar);
            if (this.f5311d != null) {
                this.f5311d.mo6665a(aVar);
                if (a) {
                    this.f5311d.mo6664a();
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("leave_time", Long.toString(-1));
                hashMap.put("back_time", Long.toString(-1));
                hashMap.put("outcome", C1626a.CANNOT_TRACK.name());
                this.f5294b.mo6947h(this.f5295c, hashMap);
            }
        }
        C1788d.m8880a(this.f5293a, "Click logged");
    }

    /* renamed from: b */
    public final void mo6655b() {
        if (this.f5311d != null) {
            this.f5311d.mo6666a(this.f5295c);
        }
        mo6659f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract void mo6659f();
}
