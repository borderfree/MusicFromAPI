package com.google.android.gms.internal.p132g;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;

/* renamed from: com.google.android.gms.internal.g.g */
public final class C4196g extends C4190a implements C4194e {
    C4196g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    /* renamed from: a */
    public final C3323b mo14036a(Bitmap bitmap) {
        Parcel s_ = mo14032s_();
        C4192c.m20836a(s_, (Parcelable) bitmap);
        Parcel a = mo14029a(6, s_);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
