package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.kd */
final /* synthetic */ class C3676kd implements OnClickListener {

    /* renamed from: a */
    private final C3674kb f14318a;

    /* renamed from: b */
    private final int f14319b;

    /* renamed from: c */
    private final int f14320c;

    /* renamed from: d */
    private final int f14321d;

    C3676kd(C3674kb kbVar, int i, int i2, int i3) {
        this.f14318a = kbVar;
        this.f14319b = i;
        this.f14320c = i2;
        this.f14321d = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14318a.mo13176a(this.f14319b, this.f14320c, this.f14321d, dialogInterface, i);
    }
}
