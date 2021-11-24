package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.if */
public final class C3624if {

    /* renamed from: a */
    private final C3636ir f14170a;
    @GuardedBy("mLock")

    /* renamed from: b */
    private final LinkedList<C3625ig> f14171b;

    /* renamed from: c */
    private final Object f14172c;

    /* renamed from: d */
    private final String f14173d;

    /* renamed from: e */
    private final String f14174e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private long f14175f;
    @GuardedBy("mLock")

    /* renamed from: g */
    private long f14176g;
    @GuardedBy("mLock")

    /* renamed from: h */
    private boolean f14177h;
    @GuardedBy("mLock")

    /* renamed from: i */
    private long f14178i;
    @GuardedBy("mLock")

    /* renamed from: j */
    private long f14179j;
    @GuardedBy("mLock")

    /* renamed from: k */
    private long f14180k;
    @GuardedBy("mLock")

    /* renamed from: l */
    private long f14181l;

    private C3624if(C3636ir irVar, String str, String str2) {
        this.f14172c = new Object();
        this.f14175f = -1;
        this.f14176g = -1;
        this.f14177h = false;
        this.f14178i = -1;
        this.f14179j = 0;
        this.f14180k = -1;
        this.f14181l = -1;
        this.f14170a = irVar;
        this.f14173d = str;
        this.f14174e = str2;
        this.f14171b = new LinkedList<>();
    }

    public C3624if(String str, String str2) {
        this(zzbv.zzep(), str, str2);
    }

    /* renamed from: a */
    public final void mo13024a() {
        synchronized (this.f14172c) {
            if (this.f14181l != -1 && this.f14176g == -1) {
                this.f14176g = SystemClock.elapsedRealtime();
                this.f14170a.mo13081a(this);
            }
            this.f14170a.mo13085b();
        }
    }

    /* renamed from: a */
    public final void mo13025a(long j) {
        synchronized (this.f14172c) {
            this.f14181l = j;
            if (this.f14181l != -1) {
                this.f14170a.mo13081a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo13026a(zzjj zzjj) {
        synchronized (this.f14172c) {
            this.f14180k = SystemClock.elapsedRealtime();
            this.f14170a.mo13083a(zzjj, this.f14180k);
        }
    }

    /* renamed from: a */
    public final void mo13027a(boolean z) {
        synchronized (this.f14172c) {
            if (this.f14181l != -1) {
                this.f14178i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f14176g = this.f14178i;
                    this.f14170a.mo13081a(this);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo13028b() {
        synchronized (this.f14172c) {
            if (this.f14181l != -1) {
                C3625ig igVar = new C3625ig();
                igVar.mo13035c();
                this.f14171b.add(igVar);
                this.f14179j++;
                this.f14170a.mo13080a();
                this.f14170a.mo13081a(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo13029b(long j) {
        synchronized (this.f14172c) {
            if (this.f14181l != -1) {
                this.f14175f = j;
                this.f14170a.mo13081a(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo13030b(boolean z) {
        synchronized (this.f14172c) {
            if (this.f14181l != -1) {
                this.f14177h = z;
                this.f14170a.mo13081a(this);
            }
        }
    }

    /* renamed from: c */
    public final void mo13031c() {
        synchronized (this.f14172c) {
            if (this.f14181l != -1 && !this.f14171b.isEmpty()) {
                C3625ig igVar = (C3625ig) this.f14171b.getLast();
                if (igVar.mo13033a() == -1) {
                    igVar.mo13034b();
                    this.f14170a.mo13081a(this);
                }
            }
        }
    }

    /* renamed from: d */
    public final Bundle mo13032d() {
        Bundle bundle;
        synchronized (this.f14172c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f14173d);
            bundle.putString("slotid", this.f14174e);
            bundle.putBoolean("ismediation", this.f14177h);
            bundle.putLong("treq", this.f14180k);
            bundle.putLong("tresponse", this.f14181l);
            bundle.putLong("timp", this.f14176g);
            bundle.putLong("tload", this.f14178i);
            bundle.putLong("pcc", this.f14179j);
            bundle.putLong("tfetch", this.f14175f);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f14171b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3625ig) it.next()).mo13036d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
