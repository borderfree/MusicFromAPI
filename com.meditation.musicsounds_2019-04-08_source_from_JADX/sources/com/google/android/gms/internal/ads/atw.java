package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import java.util.ArrayList;
import java.util.List;

public final class atw extends ahm implements atu {
    atw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public final String mo12397a(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        Parcel a = mo11917a(1, q_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final List<String> mo12398a() {
        Parcel a = mo11917a(3, mo11920q_());
        ArrayList createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    /* renamed from: a */
    public final boolean mo12399a(C3323b bVar) {
        Parcel q_ = mo11920q_();
        aho.m16239a(q_, (IInterface) bVar);
        Parcel a = mo11917a(10, q_);
        boolean a2 = aho.m16242a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C3323b mo12400b() {
        Parcel a = mo11917a(11, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final asy mo12401b(String str) {
        asy asy;
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        Parcel a = mo11917a(2, q_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            asy = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            asy = queryLocalInterface instanceof asy ? (asy) queryLocalInterface : new ata(readStrongBinder);
        }
        a.recycle();
        return asy;
    }

    /* renamed from: c */
    public final aos mo12402c() {
        Parcel a = mo11917a(7, mo11920q_());
        aos a2 = aot.m16701a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo12403c(String str) {
        Parcel q_ = mo11920q_();
        q_.writeString(str);
        mo11919b(5, q_);
    }

    /* renamed from: d */
    public final void mo12404d() {
        mo11919b(6, mo11920q_());
    }

    /* renamed from: e */
    public final C3323b mo12405e() {
        Parcel a = mo11917a(9, mo11920q_());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final void mo12406f() {
        mo11919b(8, mo11920q_());
    }

    /* renamed from: l */
    public final String mo12372l() {
        Parcel a = mo11917a(4, mo11920q_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
