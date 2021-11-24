package com.google.android.gms.maps.p133a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.p132g.C4191b;

/* renamed from: com.google.android.gms.maps.a.c */
public interface C4554c extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.c$a */
    public static abstract class C4555a extends C4191b implements C4554c {
        public C4555a() {
            super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo14033a(int i, Parcel parcel, Parcel parcel2, int i2) {
            C4563k kVar;
            switch (i) {
                case 1:
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        kVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                        kVar = queryLocalInterface instanceof C4563k ? (C4563k) queryLocalInterface : new C4564l(readStrongBinder);
                    }
                    mo15085a(kVar);
                    break;
                case 2:
                    mo15084a();
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo15084a();

    /* renamed from: a */
    void mo15085a(C4563k kVar);
}
