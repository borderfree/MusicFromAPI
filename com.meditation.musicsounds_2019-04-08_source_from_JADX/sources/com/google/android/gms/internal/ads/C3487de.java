package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C3227d;
import com.google.android.gms.common.internal.C3227d.C3228a;
import com.google.android.gms.common.internal.C3227d.C3229b;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.de */
public final class C3487de extends C3227d<C3493dk> {
    public C3487de(Context context, Looper looper, C3228a aVar, C3229b bVar) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        super(context, looper, 8, aVar, bVar, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10733a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof C3493dk ? (C3493dk) queryLocalInterface : new C3495dm(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10734b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* renamed from: e */
    public final C3493dk mo10737e() {
        return (C3493dk) super.mo11227w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public final String mo10739i_() {
        return "com.google.android.gms.ads.service.START";
    }
}
