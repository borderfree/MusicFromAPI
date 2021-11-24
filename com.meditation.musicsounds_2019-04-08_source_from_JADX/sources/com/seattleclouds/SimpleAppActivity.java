package com.seattleclouds;

import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;

public class SimpleAppActivity extends C5326d {

    /* renamed from: n */
    private boolean f18586n = false;

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo16842m() {
        String str = "index.html";
        if (!this.f18586n) {
            FragmentInfo a = super.mo16878a(str);
            C0396q a2 = mo1469g().mo1536a();
            a2.mo1411a(16908290, Fragment.m1271a((Context) this, a.mo16867a(), a.mo16869b()), "rootFragment");
            a2.mo1428c();
        }
        App.m25640c((Context) this, str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f18586n = bundle != null;
        super.onCreate(bundle);
    }
}
