package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.p129d.C4167b;
import com.google.android.gms.internal.p129d.C4168c;

/* renamed from: com.google.android.gms.common.internal.o */
public interface C3256o extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.o$a */
    public static abstract class C3257a extends C4167b implements C3256o {
        public C3257a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo11191a(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    mo11193a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C4168c.m20807a(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    mo11192a(parcel.readInt(), (Bundle) C4168c.m20807a(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    mo11194a(parcel.readInt(), parcel.readStrongBinder(), (zzb) C4168c.m20807a(parcel, zzb.CREATOR));
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo11192a(int i, Bundle bundle);

    /* renamed from: a */
    void mo11193a(int i, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo11194a(int i, IBinder iBinder, zzb zzb);
}
