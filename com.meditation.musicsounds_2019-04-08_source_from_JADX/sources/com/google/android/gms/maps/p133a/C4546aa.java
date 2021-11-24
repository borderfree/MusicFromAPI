package com.google.android.gms.maps.p133a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.internal.p132g.C4190a;
import com.google.android.gms.internal.p132g.C4192c;
import com.google.android.gms.internal.p132g.C4194e;
import com.google.android.gms.internal.p132g.C4195f;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: com.google.android.gms.maps.a.aa */
public final class C4546aa extends C4190a implements C4578z {
    C4546aa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* renamed from: a */
    public final C4545a mo15048a() {
        C4545a aVar;
        Parcel a = mo14029a(4, mo14032s_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof C4545a ? (C4545a) queryLocalInterface : new C4571s(readStrongBinder);
        }
        a.recycle();
        return aVar;
    }

    /* renamed from: a */
    public final C4556d mo15049a(C3323b bVar, GoogleMapOptions googleMapOptions) {
        C4556d dVar;
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) bVar);
        C4192c.m20836a(s_, (Parcelable) googleMapOptions);
        Parcel a = mo14029a(3, s_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            dVar = queryLocalInterface instanceof C4556d ? (C4556d) queryLocalInterface : new C4550ae(readStrongBinder);
        }
        a.recycle();
        return dVar;
    }

    /* renamed from: a */
    public final void mo15050a(C3323b bVar, int i) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) bVar);
        s_.writeInt(i);
        mo14031b(6, s_);
    }

    /* renamed from: b */
    public final C4194e mo15051b() {
        Parcel a = mo14029a(5, mo14032s_());
        C4194e a2 = C4195f.m20840a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
