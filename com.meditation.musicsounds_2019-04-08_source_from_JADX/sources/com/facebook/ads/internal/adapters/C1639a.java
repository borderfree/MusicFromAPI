package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.p077s.p078a.C1788d;
import com.facebook.ads.internal.p083t.C1838a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.a */
public abstract class C1639a {

    /* renamed from: a */
    protected final C1657b f5328a;

    /* renamed from: b */
    protected final C1838a f5329b;

    /* renamed from: c */
    private final Context f5330c;

    /* renamed from: d */
    private boolean f5331d;

    public C1639a(Context context, C1657b bVar, C1838a aVar) {
        this.f5330c = context;
        this.f5328a = bVar;
        this.f5329b = aVar;
    }

    /* renamed from: a */
    public final void mo6674a() {
        if (!this.f5331d) {
            if (this.f5328a != null) {
                this.f5328a.mo6759a();
            }
            HashMap hashMap = new HashMap();
            if (this.f5329b != null) {
                this.f5329b.mo7108a((Map<String, String>) hashMap);
            }
            mo6675a(hashMap);
            this.f5331d = true;
            C1788d.m8880a(this.f5330c, "Impression logged");
            if (this.f5328a != null) {
                this.f5328a.mo6760b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6675a(Map<String, String> map);
}
