package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.bbe;
import com.google.android.gms.internal.ads.bbi;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.n */
final class C2907n implements zzv<C3832py> {

    /* renamed from: a */
    private final /* synthetic */ bbe f10041a;

    /* renamed from: b */
    private final /* synthetic */ zzac f10042b;

    /* renamed from: c */
    private final /* synthetic */ bbi f10043c;

    C2907n(bbe bbe, zzac zzac, bbi bbi) {
        this.f10041a = bbe;
        this.f10042b = zzac;
        this.f10043c = bbi;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3832py pyVar = (C3832py) obj;
        View view = pyVar.getView();
        if (view != null) {
            try {
                if (this.f10041a == null) {
                    if (this.f10043c != null) {
                        if (!this.f10043c.mo12747i()) {
                            this.f10043c.mo12736a(C3327d.m15136a(view));
                            this.f10042b.f10128a.onAdClicked();
                            return;
                        }
                        zzas.m13649b(pyVar);
                    }
                } else if (!this.f10041a.mo12727k()) {
                    this.f10041a.mo12714a(C3327d.m15136a(view));
                    this.f10042b.f10128a.onAdClicked();
                } else {
                    zzas.m13649b(pyVar);
                }
            } catch (RemoteException e) {
                C3643iy.m19175c("Unable to call handleClick on mapper", e);
            }
        }
    }
}
