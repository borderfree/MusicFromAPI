package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C3227d;
import com.google.android.gms.common.internal.C3227d.C3228a;
import com.google.android.gms.common.internal.C3227d.C3229b;

/* renamed from: com.google.android.gms.internal.ads.su */
public final class C3909su extends C3227d<C3912sx> {
    public C3909su(Context context, Looper looper, C3228a aVar, C3229b bVar) {
        super(context, looper, 116, aVar, bVar, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10733a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof C3912sx ? (C3912sx) queryLocalInterface : new C3913sy(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10734b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* renamed from: e */
    public final C3912sx mo10737e() {
        return (C3912sx) super.mo11227w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public final String mo10739i_() {
        return "com.google.android.gms.gass.START";
    }
}
