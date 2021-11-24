package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.ke */
final /* synthetic */ class C3677ke implements OnClickListener {

    /* renamed from: a */
    private final C3674kb f14322a;

    /* renamed from: b */
    private final String f14323b;

    C3677ke(C3674kb kbVar, String str) {
        this.f14322a = kbVar;
        this.f14323b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14322a.mo13179a(this.f14323b, dialogInterface, i);
    }
}
