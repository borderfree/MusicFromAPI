package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3252m;
import com.google.android.gms.internal.p128c.C4160a;
import com.google.android.gms.internal.p128c.C4162c;

/* renamed from: com.google.android.gms.signin.internal.g */
public final class C4788g extends C4160a implements C4787f {
    C4788g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo15899a(int i) {
        Parcel a = mo14005a();
        a.writeInt(i);
        mo14006a(7, a);
    }

    /* renamed from: a */
    public final void mo15900a(C3252m mVar, int i, boolean z) {
        Parcel a = mo14005a();
        C4162c.m20800a(a, (IInterface) mVar);
        a.writeInt(i);
        C4162c.m20802a(a, z);
        mo14006a(9, a);
    }

    /* renamed from: a */
    public final void mo15901a(zah zah, C4785d dVar) {
        Parcel a = mo14005a();
        C4162c.m20801a(a, (Parcelable) zah);
        C4162c.m20800a(a, (IInterface) dVar);
        mo14006a(12, a);
    }
}
