package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.C2950n;
import com.google.android.gms.common.internal.C3266s;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.measurement.h */
public final class C4429h extends C2950n<C4429h> {

    /* renamed from: a */
    private String f16196a;

    /* renamed from: b */
    private int f16197b;

    /* renamed from: c */
    private int f16198c;

    /* renamed from: d */
    private String f16199d;

    /* renamed from: e */
    private String f16200e;

    /* renamed from: f */
    private boolean f16201f;

    /* renamed from: g */
    private boolean f16202g;

    public C4429h() {
        this(false);
    }

    private C4429h(boolean z) {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0) {
            leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L);
            if (leastSignificantBits == 0) {
                Log.e("GAv4", "UUID.randomUUID() returned 0.");
                leastSignificantBits = Integer.MAX_VALUE;
            }
        }
        this(false, leastSignificantBits);
    }

    private C4429h(boolean z, int i) {
        C3266s.m14912a(i);
        this.f16197b = i;
        this.f16202g = false;
    }

    /* renamed from: a */
    public final String mo14581a() {
        return this.f16196a;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        C4429h hVar = (C4429h) nVar;
        if (!TextUtils.isEmpty(this.f16196a)) {
            hVar.f16196a = this.f16196a;
        }
        if (this.f16197b != 0) {
            hVar.f16197b = this.f16197b;
        }
        if (this.f16198c != 0) {
            hVar.f16198c = this.f16198c;
        }
        if (!TextUtils.isEmpty(this.f16199d)) {
            hVar.f16199d = this.f16199d;
        }
        if (!TextUtils.isEmpty(this.f16200e)) {
            String str = this.f16200e;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            hVar.f16200e = str;
        }
        if (this.f16201f) {
            hVar.f16201f = this.f16201f;
        }
        if (this.f16202g) {
            hVar.f16202g = this.f16202g;
        }
    }

    /* renamed from: b */
    public final int mo14582b() {
        return this.f16197b;
    }

    /* renamed from: c */
    public final String mo14583c() {
        return this.f16200e;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", this.f16196a);
        hashMap.put("interstitial", Boolean.valueOf(this.f16201f));
        hashMap.put("automatic", Boolean.valueOf(this.f16202g));
        hashMap.put("screenId", Integer.valueOf(this.f16197b));
        hashMap.put("referrerScreenId", Integer.valueOf(this.f16198c));
        hashMap.put("referrerScreenName", this.f16199d);
        hashMap.put("referrerUri", this.f16200e);
        return m13814a((Object) hashMap);
    }
}
