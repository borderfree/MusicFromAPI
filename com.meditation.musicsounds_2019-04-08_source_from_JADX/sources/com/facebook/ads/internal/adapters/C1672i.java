package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.adapters.p059a.C1656k;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p083t.C1838a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.i */
public class C1672i extends C1639a {

    /* renamed from: c */
    private final C1728c f5479c;

    /* renamed from: d */
    private final C1806p f5480d;

    /* renamed from: e */
    private C1656k f5481e;

    public C1672i(Context context, C1728c cVar, C1838a aVar, C1806p pVar, C1657b bVar) {
        super(context, bVar, aVar);
        this.f5479c = cVar;
        this.f5480d = pVar;
    }

    /* renamed from: a */
    public void mo6789a(C1656k kVar) {
        this.f5481e = kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6675a(Map<String, String> map) {
        if (this.f5481e != null && !TextUtils.isEmpty(this.f5481e.mo6757g())) {
            map.put("touch", C1800k.m8915a(this.f5480d.mo7071c()));
            this.f5479c.mo6939a(this.f5481e.mo6757g(), map);
        }
    }
}
