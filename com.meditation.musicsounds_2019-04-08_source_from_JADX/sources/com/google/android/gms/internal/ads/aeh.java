package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.support.p006c.C0047b;
import android.support.p006c.C0057d;
import java.lang.ref.WeakReference;

public final class aeh extends C0057d {

    /* renamed from: a */
    private WeakReference<aei> f11637a;

    public aeh(aei aei) {
        this.f11637a = new WeakReference<>(aei);
    }

    /* renamed from: a */
    public final void mo107a(ComponentName componentName, C0047b bVar) {
        aei aei = (aei) this.f11637a.get();
        if (aei != null) {
            aei.mo11835a(bVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        aei aei = (aei) this.f11637a.get();
        if (aei != null) {
            aei.mo11834a();
        }
    }
}
