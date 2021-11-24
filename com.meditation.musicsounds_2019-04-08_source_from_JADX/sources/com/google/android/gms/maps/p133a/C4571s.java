package com.google.android.gms.maps.p133a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import com.google.android.gms.internal.p132g.C4190a;
import com.google.android.gms.internal.p132g.C4192c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.a.s */
public final class C4571s extends C4190a implements C4545a {
    C4571s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: a */
    public final C3323b mo15043a(float f) {
        Parcel s_ = mo14032s_();
        s_.writeFloat(f);
        Parcel a = mo14029a(4, s_);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final C3323b mo15044a(CameraPosition cameraPosition) {
        Parcel s_ = mo14032s_();
        C4192c.m20836a(s_, (Parcelable) cameraPosition);
        Parcel a = mo14029a(7, s_);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final C3323b mo15045a(LatLng latLng) {
        Parcel s_ = mo14032s_();
        C4192c.m20836a(s_, (Parcelable) latLng);
        Parcel a = mo14029a(8, s_);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final C3323b mo15046a(LatLng latLng, float f) {
        Parcel s_ = mo14032s_();
        C4192c.m20836a(s_, (Parcelable) latLng);
        s_.writeFloat(f);
        Parcel a = mo14029a(9, s_);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final C3323b mo15047a(LatLngBounds latLngBounds, int i) {
        Parcel s_ = mo14032s_();
        C4192c.m20836a(s_, (Parcelable) latLngBounds);
        s_.writeInt(i);
        Parcel a = mo14029a(10, s_);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
