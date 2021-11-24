package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.kk */
final class C3683kk implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C3682kj f14336a;

    C3683kk(C3682kj kjVar) {
        this.f14336a = kjVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbv.zzek();
        C3653jh.m18874a(this.f14336a.f14332a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
