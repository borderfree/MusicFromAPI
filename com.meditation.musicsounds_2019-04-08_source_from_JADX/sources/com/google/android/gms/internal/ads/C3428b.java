package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.b */
final class C3428b implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ bdd f13399a;

    C3428b(bdd bdd) {
        this.f13399a = bdd;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13399a.mo13247a("Operation denied by user.");
    }
}
