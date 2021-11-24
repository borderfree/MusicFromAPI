package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C3464ci
public final class bap implements baa {

    /* renamed from: a */
    private final zzaef f13499a;

    /* renamed from: b */
    private final bas f13500b;

    /* renamed from: c */
    private final Context f13501c;

    /* renamed from: d */
    private final Object f13502d = new Object();

    /* renamed from: e */
    private final bac f13503e;

    /* renamed from: f */
    private final boolean f13504f;

    /* renamed from: g */
    private final long f13505g;

    /* renamed from: h */
    private final long f13506h;

    /* renamed from: i */
    private final aqz f13507i;

    /* renamed from: j */
    private final boolean f13508j;

    /* renamed from: k */
    private final String f13509k;

    /* renamed from: l */
    private boolean f13510l = false;

    /* renamed from: m */
    private bag f13511m;

    /* renamed from: n */
    private List<baj> f13512n = new ArrayList();

    /* renamed from: o */
    private final boolean f13513o;

    public bap(Context context, zzaef zzaef, bas bas, bac bac, boolean z, boolean z2, String str, long j, long j2, aqz aqz, boolean z3) {
        this.f13501c = context;
        this.f13499a = zzaef;
        this.f13500b = bas;
        this.f13503e = bac;
        this.f13504f = z;
        this.f13508j = z2;
        this.f13509k = str;
        this.f13505g = j;
        this.f13506h = j2;
        this.f13507i = aqz;
        this.f13513o = z3;
    }

    /* renamed from: a */
    public final baj mo12653a(List<bab> list) {
        Object obj;
        baj baj;
        C3643iy.m19172b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        aqx a = this.f13507i.mo12318a();
        zzjn zzjn = this.f13499a.f15260d;
        int[] iArr = new int[2];
        if (zzjn.f15505g != null) {
            zzbv.zzfd();
            if (bal.m17782a(this.f13509k, iArr)) {
                int i = iArr[0];
                int i2 = iArr[1];
                zzjn[] zzjnArr = zzjn.f15505g;
                int length = zzjnArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    zzjn zzjn2 = zzjnArr[i3];
                    if (i == zzjn2.f15503e && i2 == zzjn2.f15500b) {
                        zzjn = zzjn2;
                        break;
                    }
                    i3++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bab bab = (bab) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(bab.f13403b);
            C3643iy.m19176d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = bab.f13404c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    aqx a2 = this.f13507i.mo12318a();
                    Object obj2 = this.f13502d;
                    synchronized (obj2) {
                        try {
                            if (this.f13510l) {
                                baj = new baj(-1);
                            } else {
                                Iterator it3 = it;
                                Iterator it4 = it2;
                                aqx aqx = a;
                                r11 = r11;
                                aqx aqx2 = a2;
                                bag bag = r11;
                                obj = obj2;
                                try {
                                    bag bag2 = new bag(this.f13501c, str2, this.f13500b, this.f13503e, bab, this.f13499a.f15259c, zzjn, this.f13499a.f15267k, this.f13504f, this.f13508j, this.f13499a.f15281y, this.f13499a.f15270n, this.f13499a.f15282z, this.f13499a.f15251X, this.f13513o);
                                    this.f13511m = bag;
                                    baj a3 = this.f13511m.mo12672a(this.f13505g, this.f13506h);
                                    this.f13512n.add(a3);
                                    if (a3.f13473a == 0) {
                                        C3643iy.m19172b("Adapter succeeded.");
                                        this.f13507i.mo12322a("mediation_network_succeed", str2);
                                        if (!arrayList.isEmpty()) {
                                            this.f13507i.mo12322a("mediation_networks_fail", TextUtils.join(",", arrayList));
                                        }
                                        this.f13507i.mo12324a(aqx2, "mls");
                                        this.f13507i.mo12324a(aqx, "ttm");
                                        return a3;
                                    }
                                    aqx aqx3 = aqx;
                                    aqx aqx4 = aqx2;
                                    arrayList.add(str2);
                                    this.f13507i.mo12324a(aqx4, "mlf");
                                    if (a3.f13475c != null) {
                                        C3653jh.f14275a.post(new baq(this, a3));
                                    }
                                    a = aqx3;
                                    it = it3;
                                    it2 = it4;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                    }
                    return baj;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f13507i.mo12322a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        return new baj(1);
    }

    /* renamed from: a */
    public final void mo12654a() {
        synchronized (this.f13502d) {
            this.f13510l = true;
            if (this.f13511m != null) {
                this.f13511m.mo12673a();
            }
        }
    }

    /* renamed from: b */
    public final List<baj> mo12655b() {
        return this.f13512n;
    }
}
