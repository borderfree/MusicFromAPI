package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.internal.C3227d;
import com.google.android.gms.common.internal.C3227d.C3228a;
import com.google.android.gms.common.internal.C3227d.C3229b;

/* renamed from: com.google.android.gms.measurement.internal.q */
public final class C4766q extends C3227d<C4758i> {
    public C4766q(Context context, Looper looper, C3228a aVar, C3229b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo10733a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C4758i ? (C4758i) queryLocalInterface : new C4760k(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10734b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: f */
    public final int mo10738f() {
        return C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public final String mo10739i_() {
        return "com.google.android.gms.measurement.START";
    }
}
