package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ji */
final class C3654ji implements ark {

    /* renamed from: a */
    private final /* synthetic */ List f14283a;

    /* renamed from: b */
    private final /* synthetic */ arj f14284b;

    /* renamed from: c */
    private final /* synthetic */ Context f14285c;

    C3654ji(C3653jh jhVar, List list, arj arj, Context context) {
        this.f14283a = list;
        this.f14284b = arj;
        this.f14285c = context;
    }

    /* renamed from: a */
    public final void mo12338a() {
        for (String str : this.f14283a) {
            String str2 = "Pinging url: ";
            String valueOf = String.valueOf(str);
            C3643iy.m19176d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.f14284b.mo12336a(Uri.parse(str), null, null);
        }
        this.f14284b.mo12334a((Activity) this.f14285c);
    }

    /* renamed from: b */
    public final void mo12339b() {
    }
}
