package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.kj */
final class C3682kj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f14332a;

    /* renamed from: b */
    private final /* synthetic */ String f14333b;

    /* renamed from: c */
    private final /* synthetic */ boolean f14334c;

    /* renamed from: d */
    private final /* synthetic */ boolean f14335d;

    C3682kj(C3681ki kiVar, Context context, String str, boolean z, boolean z2) {
        this.f14332a = context;
        this.f14333b = str;
        this.f14334c = z;
        this.f14335d = z2;
    }

    public final void run() {
        Builder builder = new Builder(this.f14332a);
        builder.setMessage(this.f14333b);
        builder.setTitle(this.f14334c ? "Error" : "Info");
        if (this.f14335d) {
            builder.setNeutralButton("Dismiss", null);
        } else {
            builder.setPositiveButton("Learn More", new C3683kk(this));
            builder.setNegativeButton("Dismiss", null);
        }
        builder.create().show();
    }
}
