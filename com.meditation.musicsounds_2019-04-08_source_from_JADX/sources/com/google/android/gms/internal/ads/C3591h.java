package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.h */
final class C3591h implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C3537f f14061a;

    C3591h(C3537f fVar) {
        this.f14061a = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14061a.mo13247a("User canceled the download.");
    }
}
