package com.google.android.gms.common.internal.p124a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3245h;

/* renamed from: com.google.android.gms.common.internal.a.j */
public final class C3198j extends C3245h<C3201m> {
    public C3198j(Context context, Looper looper, C3240e eVar, C3042b bVar, C3043c cVar) {
        super(context, looper, 39, eVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10733a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return queryLocalInterface instanceof C3201m ? (C3201m) queryLocalInterface : new C3202n(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10734b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    /* renamed from: i_ */
    public final String mo10739i_() {
        return "com.google.android.gms.common.service.START";
    }
}
