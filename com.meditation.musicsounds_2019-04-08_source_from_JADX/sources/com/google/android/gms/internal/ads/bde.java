package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzbv;

final class bde implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ bdd f13597a;

    bde(bdd bdd) {
        this.f13597a = bdd;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent b = this.f13597a.mo12807b();
        zzbv.zzek();
        C3653jh.m18873a(this.f13597a.f13591b, b);
    }
}
