package com.google.android.gms.common.internal.p124a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.p128c.C4160a;
import com.google.android.gms.internal.p128c.C4162c;

/* renamed from: com.google.android.gms.common.internal.a.n */
public final class C3202n extends C4160a implements C3201m {
    C3202n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    /* renamed from: a */
    public final void mo11159a(C3199k kVar) {
        Parcel a = mo14005a();
        C4162c.m20800a(a, (IInterface) kVar);
        mo14008b(1, a);
    }
}
