package android.support.p023v7.view;

import android.support.p009v4.view.C0647w;
import android.support.p009v4.view.C0651x;
import android.support.p009v4.view.C0652y;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.h */
public class C0837h {

    /* renamed from: a */
    final ArrayList<C0647w> f2495a = new ArrayList<>();

    /* renamed from: b */
    C0651x f2496b;

    /* renamed from: c */
    private long f2497c = -1;

    /* renamed from: d */
    private Interpolator f2498d;

    /* renamed from: e */
    private boolean f2499e;

    /* renamed from: f */
    private final C0652y f2500f = new C0652y() {

        /* renamed from: b */
        private boolean f2502b = false;

        /* renamed from: c */
        private int f2503c = 0;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3333a() {
            this.f2503c = 0;
            this.f2502b = false;
            C0837h.this.mo3331b();
        }

        /* renamed from: a */
        public void mo2566a(View view) {
            if (!this.f2502b) {
                this.f2502b = true;
                if (C0837h.this.f2496b != null) {
                    C0837h.this.f2496b.mo2566a(null);
                }
            }
        }

        /* renamed from: b */
        public void mo2567b(View view) {
            int i = this.f2503c + 1;
            this.f2503c = i;
            if (i == C0837h.this.f2495a.size()) {
                if (C0837h.this.f2496b != null) {
                    C0837h.this.f2496b.mo2567b(null);
                }
                mo3333a();
            }
        }
    };

    /* renamed from: a */
    public C0837h mo3325a(long j) {
        if (!this.f2499e) {
            this.f2497c = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0837h mo3326a(C0647w wVar) {
        if (!this.f2499e) {
            this.f2495a.add(wVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0837h mo3327a(C0647w wVar, C0647w wVar2) {
        this.f2495a.add(wVar);
        wVar2.mo2559b(wVar.mo2552a());
        this.f2495a.add(wVar2);
        return this;
    }

    /* renamed from: a */
    public C0837h mo3328a(C0651x xVar) {
        if (!this.f2499e) {
            this.f2496b = xVar;
        }
        return this;
    }

    /* renamed from: a */
    public C0837h mo3329a(Interpolator interpolator) {
        if (!this.f2499e) {
            this.f2498d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public void mo3330a() {
        if (!this.f2499e) {
            Iterator it = this.f2495a.iterator();
            while (it.hasNext()) {
                C0647w wVar = (C0647w) it.next();
                if (this.f2497c >= 0) {
                    wVar.mo2554a(this.f2497c);
                }
                if (this.f2498d != null) {
                    wVar.mo2557a(this.f2498d);
                }
                if (this.f2496b != null) {
                    wVar.mo2555a((C0651x) this.f2500f);
                }
                wVar.mo2561c();
            }
            this.f2499e = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3331b() {
        this.f2499e = false;
    }

    /* renamed from: c */
    public void mo3332c() {
        if (this.f2499e) {
            Iterator it = this.f2495a.iterator();
            while (it.hasNext()) {
                ((C0647w) it.next()).mo2560b();
            }
            this.f2499e = false;
        }
    }
}
