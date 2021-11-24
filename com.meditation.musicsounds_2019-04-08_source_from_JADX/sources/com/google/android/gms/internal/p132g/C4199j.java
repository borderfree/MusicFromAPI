package com.google.android.gms.internal.p132g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;

/* renamed from: com.google.android.gms.internal.g.j */
public final class C4199j extends C4190a implements C4197h {
    C4199j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: a */
    public final String mo14037a() {
        Parcel a = mo14029a(6, mo14032s_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo14038a(C3323b bVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) bVar);
        mo14031b(18, s_);
    }

    /* renamed from: a */
    public final void mo14039a(String str) {
        Parcel s_ = mo14032s_();
        s_.writeString(str);
        mo14031b(7, s_);
    }

    /* renamed from: a */
    public final boolean mo14040a(C4197h hVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) hVar);
        Parcel a = mo14029a(16, s_);
        boolean a2 = C4192c.m20838a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final String mo14041b() {
        Parcel a = mo14029a(8, mo14032s_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo14042c() {
        mo14031b(11, mo14032s_());
    }

    /* renamed from: d */
    public final boolean mo14043d() {
        Parcel a = mo14029a(13, mo14032s_());
        boolean a2 = C4192c.m20838a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final int mo14044e() {
        Parcel a = mo14029a(17, mo14032s_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
