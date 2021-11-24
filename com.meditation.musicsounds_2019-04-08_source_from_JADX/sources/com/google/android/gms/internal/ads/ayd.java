package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class ayd {

    /* renamed from: a */
    private final AtomicInteger f13305a;

    /* renamed from: b */
    private final Set<auc<?>> f13306b;

    /* renamed from: c */
    private final PriorityBlockingQueue<auc<?>> f13307c;

    /* renamed from: d */
    private final PriorityBlockingQueue<auc<?>> f13308d;

    /* renamed from: e */
    private final C4109yy f13309e;

    /* renamed from: f */
    private final apd f13310f;

    /* renamed from: g */
    private final C3387a f13311g;

    /* renamed from: h */
    private final aqb[] f13312h;

    /* renamed from: i */
    private agb f13313i;

    /* renamed from: j */
    private final List<aze> f13314j;

    public ayd(C4109yy yyVar, apd apd) {
        this(yyVar, apd, 4);
    }

    private ayd(C4109yy yyVar, apd apd, int i) {
        this(yyVar, apd, 4, new alc(new Handler(Looper.getMainLooper())));
    }

    private ayd(C4109yy yyVar, apd apd, int i, C3387a aVar) {
        this.f13305a = new AtomicInteger();
        this.f13306b = new HashSet();
        this.f13307c = new PriorityBlockingQueue<>();
        this.f13308d = new PriorityBlockingQueue<>();
        this.f13314j = new ArrayList();
        this.f13309e = yyVar;
        this.f13310f = apd;
        this.f13312h = new aqb[4];
        this.f13311g = aVar;
    }

    /* renamed from: a */
    public final <T> auc<T> mo12622a(auc<T> auc) {
        auc.mo12490a(this);
        synchronized (this.f13306b) {
            this.f13306b.add(auc);
        }
        auc.mo12488a(this.f13305a.incrementAndGet());
        auc.mo12498b("add-to-queue");
        (!auc.mo12506h() ? this.f13308d : this.f13307c).add(auc);
        return auc;
    }

    /* renamed from: a */
    public final void mo12623a() {
        aqb[] aqbArr;
        if (this.f13313i != null) {
            this.f13313i.mo11885a();
        }
        for (aqb aqb : this.f13312h) {
            if (aqb != null) {
                aqb.mo12283a();
            }
        }
        this.f13313i = new agb(this.f13307c, this.f13308d, this.f13309e, this.f13311g);
        this.f13313i.start();
        for (int i = 0; i < this.f13312h.length; i++) {
            aqb aqb2 = new aqb(this.f13308d, this.f13310f, this.f13309e, this.f13311g);
            this.f13312h[i] = aqb2;
            aqb2.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final <T> void mo12624b(auc<T> auc) {
        synchronized (this.f13306b) {
            this.f13306b.remove(auc);
        }
        synchronized (this.f13314j) {
            for (aze a : this.f13314j) {
                a.mo12643a(auc);
            }
        }
    }
}
