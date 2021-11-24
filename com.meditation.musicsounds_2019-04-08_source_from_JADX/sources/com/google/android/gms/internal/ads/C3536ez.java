package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.ez */
final class C3536ez implements Callable<C3533ew> {

    /* renamed from: a */
    private final /* synthetic */ Context f13966a;

    /* renamed from: b */
    private final /* synthetic */ C3535ey f13967b;

    C3536ez(C3535ey eyVar, Context context) {
        this.f13967b = eyVar;
        this.f13966a = context;
    }

    public final /* synthetic */ Object call() {
        C3533ew ewVar;
        C3538fa faVar = (C3538fa) this.f13967b.f13965a.get(this.f13966a);
        if (faVar != null) {
            if (!(faVar.f13970a + ((Long) ane.m16650f().mo12297a(aqm.f12730bq)).longValue() < zzbv.zzer().mo11326a())) {
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12729bp)).booleanValue()) {
                    ewVar = new C3534ex(this.f13966a, faVar.f13971b).mo12895a();
                    this.f13967b.f13965a.put(this.f13966a, new C3538fa(this.f13967b, ewVar));
                    return ewVar;
                }
            }
        }
        ewVar = new C3534ex(this.f13966a).mo12895a();
        this.f13967b.f13965a.put(this.f13966a, new C3538fa(this.f13967b, ewVar));
        return ewVar;
    }
}
