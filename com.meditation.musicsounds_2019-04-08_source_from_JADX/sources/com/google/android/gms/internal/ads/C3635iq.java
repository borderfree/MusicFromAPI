package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.iq */
public final class C3635iq {

    /* renamed from: a */
    private final Object f14226a;
    @GuardedBy("mLock")

    /* renamed from: b */
    private int f14227b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private int f14228c;

    /* renamed from: d */
    private final C3636ir f14229d;

    /* renamed from: e */
    private final String f14230e;

    private C3635iq(C3636ir irVar, String str) {
        this.f14226a = new Object();
        this.f14229d = irVar;
        this.f14230e = str;
    }

    public C3635iq(String str) {
        this(zzbv.zzep(), str);
    }

    /* renamed from: a */
    public final String mo13074a() {
        return this.f14230e;
    }

    /* renamed from: a */
    public final void mo13075a(int i, int i2) {
        synchronized (this.f14226a) {
            this.f14227b = i;
            this.f14228c = i2;
            this.f14229d.mo13082a(this);
        }
    }

    /* renamed from: b */
    public final Bundle mo13076b() {
        Bundle bundle;
        synchronized (this.f14226a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f14227b);
            bundle.putInt("pmnll", this.f14228c);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3635iq iqVar = (C3635iq) obj;
            if (this.f14230e != null) {
                return this.f14230e.equals(iqVar.f14230e);
            }
            if (iqVar.f14230e == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f14230e != null) {
            return this.f14230e.hashCode();
        }
        return 0;
    }
}
