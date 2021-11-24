package com.google.android.gms.common.api.internal;

import android.support.p009v4.p019g.C0490b;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.r */
public class C3155r extends C3116ce {

    /* renamed from: e */
    private final C0490b<C3112cb<?>> f10909e;

    /* renamed from: f */
    private C3135d f10910f;

    /* renamed from: i */
    private final void m14543i() {
        if (!this.f10909e.isEmpty()) {
            this.f10910f.mo11026a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10990a(ConnectionResult connectionResult, int i) {
        this.f10910f.mo11028b(connectionResult, i);
    }

    /* renamed from: b */
    public void mo10888b() {
        super.mo10888b();
        m14543i();
    }

    /* renamed from: c */
    public void mo10890c() {
        super.mo10890c();
        m14543i();
    }

    /* renamed from: d */
    public void mo10891d() {
        super.mo10891d();
        this.f10910f.mo11029b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo10991f() {
        this.f10910f.mo11031d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final C0490b<C3112cb<?>> mo11079g() {
        return this.f10909e;
    }
}
