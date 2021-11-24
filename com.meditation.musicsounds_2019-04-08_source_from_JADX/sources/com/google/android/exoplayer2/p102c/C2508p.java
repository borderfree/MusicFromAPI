package com.google.android.exoplayer2.p102c;

import android.os.SystemClock;
import com.google.android.exoplayer2.C2468b;
import com.google.android.exoplayer2.C2670k;

/* renamed from: com.google.android.exoplayer2.c.p */
public final class C2508p implements C2494g {

    /* renamed from: a */
    private boolean f8116a;

    /* renamed from: b */
    private long f8117b;

    /* renamed from: c */
    private long f8118c;

    /* renamed from: d */
    private C2670k f8119d = C2670k.f9114a;

    /* renamed from: a */
    public C2670k mo8735a(C2670k kVar) {
        if (this.f8116a) {
            mo8872a(mo8748w());
        }
        this.f8119d = kVar;
        return kVar;
    }

    /* renamed from: a */
    public void mo8871a() {
        if (!this.f8116a) {
            this.f8118c = SystemClock.elapsedRealtime();
            this.f8116a = true;
        }
    }

    /* renamed from: a */
    public void mo8872a(long j) {
        this.f8117b = j;
        if (this.f8116a) {
            this.f8118c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public void mo8873a(C2494g gVar) {
        mo8872a(gVar.mo8748w());
        this.f8119d = gVar.mo8749x();
    }

    /* renamed from: b */
    public void mo8874b() {
        if (this.f8116a) {
            mo8872a(mo8748w());
            this.f8116a = false;
        }
    }

    /* renamed from: w */
    public long mo8748w() {
        long j = this.f8117b;
        if (!this.f8116a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8118c;
        return j + (this.f8119d.f9115b == 1.0f ? C2468b.m11603b(elapsedRealtime) : this.f8119d.mo9153a(elapsedRealtime));
    }

    /* renamed from: x */
    public C2670k mo8749x() {
        return this.f8119d;
    }
}
