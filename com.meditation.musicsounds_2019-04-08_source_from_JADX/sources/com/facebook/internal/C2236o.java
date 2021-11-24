package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.support.p009v4.app.Fragment;

/* renamed from: com.facebook.internal.o */
public class C2236o {

    /* renamed from: a */
    private Fragment f7219a;

    /* renamed from: b */
    private android.app.Fragment f7220b;

    public C2236o(Fragment fragment) {
        C2264y.m10422a((Object) fragment, "fragment");
        this.f7219a = fragment;
    }

    /* renamed from: a */
    public final Activity mo7861a() {
        return this.f7219a != null ? this.f7219a.mo1318s() : this.f7220b.getActivity();
    }

    /* renamed from: a */
    public void mo7862a(Intent intent, int i) {
        if (this.f7219a != null) {
            this.f7219a.startActivityForResult(intent, i);
        } else {
            this.f7220b.startActivityForResult(intent, i);
        }
    }
}
