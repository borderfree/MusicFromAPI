package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p129d.C4166a;
import com.google.android.gms.internal.p129d.C4168c;

/* renamed from: com.google.android.gms.common.internal.ap */
public final class C3218ap extends C4166a implements C3256o {
    C3218ap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: a */
    public final void mo11192a(int i, Bundle bundle) {
        Parcel c = mo14014c();
        c.writeInt(i);
        C4168c.m20809a(c, (Parcelable) bundle);
        mo14013b(2, c);
    }

    /* renamed from: a */
    public final void mo11193a(int i, IBinder iBinder, Bundle bundle) {
        Parcel c = mo14014c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C4168c.m20809a(c, (Parcelable) bundle);
        mo14013b(1, c);
    }

    /* renamed from: a */
    public final void mo11194a(int i, IBinder iBinder, zzb zzb) {
        Parcel c = mo14014c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C4168c.m20809a(c, (Parcelable) zzb);
        mo14013b(3, c);
    }
}
