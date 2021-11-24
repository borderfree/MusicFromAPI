package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ir */
public final class C3636ir implements ajn {

    /* renamed from: a */
    private final Object f14231a;

    /* renamed from: b */
    private final C3632in f14232b;

    /* renamed from: c */
    private final HashSet<C3624if> f14233c;

    /* renamed from: d */
    private final HashSet<C3635iq> f14234d;

    public C3636ir() {
        this(ane.m16647c());
    }

    private C3636ir(String str) {
        this.f14231a = new Object();
        this.f14233c = new HashSet<>();
        this.f14234d = new HashSet<>();
        this.f14232b = new C3632in(str);
    }

    /* renamed from: a */
    public final Bundle mo13079a(Context context, C3633io ioVar, String str) {
        Bundle bundle;
        synchronized (this.f14231a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f14232b.mo13069a(context, str));
            Bundle bundle2 = new Bundle();
            Iterator it = this.f14234d.iterator();
            while (it.hasNext()) {
                C3635iq iqVar = (C3635iq) it.next();
                bundle2.putBundle(iqVar.mo13074a(), iqVar.mo13076b());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f14233c.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C3624if) it2.next()).mo13032d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            ioVar.zza(this.f14233c);
            this.f14233c.clear();
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo13080a() {
        synchronized (this.f14231a) {
            this.f14232b.mo13070a();
        }
    }

    /* renamed from: a */
    public final void mo13081a(C3624if ifVar) {
        synchronized (this.f14231a) {
            this.f14233c.add(ifVar);
        }
    }

    /* renamed from: a */
    public final void mo13082a(C3635iq iqVar) {
        synchronized (this.f14231a) {
            this.f14234d.add(iqVar);
        }
    }

    /* renamed from: a */
    public final void mo13083a(zzjj zzjj, long j) {
        synchronized (this.f14231a) {
            this.f14232b.mo13071a(zzjj, j);
        }
    }

    /* renamed from: a */
    public final void mo13084a(HashSet<C3624if> hashSet) {
        synchronized (this.f14231a) {
            this.f14233c.addAll(hashSet);
        }
    }

    /* renamed from: a */
    public final void mo12041a(boolean z) {
        long a = zzbv.zzer().mo11326a();
        if (z) {
            if (a - zzbv.zzeo().mo13060l().mo13117i() > ((Long) ane.m16650f().mo12297a(aqm.f12643aI)).longValue()) {
                this.f14232b.f14216a = -1;
                return;
            }
            this.f14232b.f14216a = zzbv.zzeo().mo13060l().mo13118j();
            return;
        }
        zzbv.zzeo().mo13060l().mo13093a(a);
        zzbv.zzeo().mo13060l().mo13100b(this.f14232b.f14216a);
    }

    /* renamed from: b */
    public final void mo13085b() {
        synchronized (this.f14231a) {
            this.f14232b.mo13072b();
        }
    }
}
