package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.jc */
final class C3648jc extends C3649jd {

    /* renamed from: a */
    private final /* synthetic */ Bundle f14269a;

    /* renamed from: b */
    private final /* synthetic */ C3646ja f14270b;

    C3648jc(C3646ja jaVar, Bundle bundle) {
        this.f14270b = jaVar;
        this.f14269a = bundle;
        super(null);
    }

    /* renamed from: a */
    public final void mo10051a() {
        Iterator it = this.f14270b.f14250d.iterator();
        while (it.hasNext()) {
            ((C3650je) it.next()).mo13045a(this.f14269a);
        }
    }
}
