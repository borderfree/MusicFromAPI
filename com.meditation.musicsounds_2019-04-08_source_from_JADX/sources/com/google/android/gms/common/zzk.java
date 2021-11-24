package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3216an;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import javax.annotation.Nullable;

public final class zzk extends AbstractSafeParcelable {
    public static final Creator<zzk> CREATOR = new C3290t();

    /* renamed from: a */
    private final String f11225a;
    @Nullable

    /* renamed from: b */
    private final C3279n f11226b;

    /* renamed from: c */
    private final boolean f11227c;

    zzk(String str, @Nullable IBinder iBinder, boolean z) {
        this.f11225a = str;
        this.f11226b = m15109a(iBinder);
        this.f11227c = z;
    }

    zzk(String str, @Nullable C3279n nVar, boolean z) {
        this.f11225a = str;
        this.f11226b = nVar;
        this.f11227c = z;
    }

    @Nullable
    /* renamed from: a */
    private static C3279n m15109a(@Nullable IBinder iBinder) {
        C3280o oVar = null;
        if (iBinder == null) {
            return null;
        }
        try {
            C3323b a = C3216an.m14736a(iBinder).mo11189a();
            byte[] bArr = a == null ? null : (byte[]) C3327d.m15137a(a);
            if (bArr != null) {
                oVar = new C3280o(bArr);
            } else {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            }
            return oVar;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 1, this.f11225a, false);
        if (this.f11226b == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = this.f11226b.asBinder();
        }
        C3267a.m14963a(parcel, 2, iBinder, false);
        C3267a.m14971a(parcel, 3, this.f11227c);
        C3267a.m14956a(parcel, a);
    }
}
