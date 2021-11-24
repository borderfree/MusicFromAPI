package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

public final class agn extends ahl {

    /* renamed from: d */
    private final Activity f11997d;

    /* renamed from: e */
    private final View f11998e;

    public agn(aga aga, String str, String str2, C4110yz yzVar, int i, int i2, View view, Activity activity) {
        super(aga, str, str2, yzVar, i, 62);
        this.f11998e = view;
        this.f11997d = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        if (this.f11998e != null) {
            boolean booleanValue = ((Boolean) ane.m16650f().mo12297a(aqm.f12693bF)).booleanValue();
            Object[] objArr = (Object[]) this.f12043c.invoke(null, new Object[]{this.f11998e, this.f11997d, Boolean.valueOf(booleanValue)});
            synchronized (this.f12042b) {
                this.f12042b.f15108Q = Long.valueOf(((Long) objArr[0]).longValue());
                this.f12042b.f15109R = Long.valueOf(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f12042b.f15110S = (String) objArr[2];
                }
            }
        }
    }
}
