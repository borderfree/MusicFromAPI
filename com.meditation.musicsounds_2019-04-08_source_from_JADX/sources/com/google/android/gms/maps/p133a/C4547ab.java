package com.google.android.gms.maps.p133a;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.internal.p132g.C4190a;
import com.google.android.gms.internal.p132g.C4192c;
import com.google.android.gms.internal.p132g.C4197h;
import com.google.android.gms.internal.p132g.C4198i;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: com.google.android.gms.maps.a.ab */
public final class C4547ab extends C4190a implements C4553b {
    C4547ab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* renamed from: a */
    public final C4197h mo15052a(MarkerOptions markerOptions) {
        Parcel s_ = mo14032s_();
        C4192c.m20836a(s_, (Parcelable) markerOptions);
        Parcel a = mo14029a(11, s_);
        C4197h a2 = C4198i.m20850a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final CameraPosition mo15053a() {
        Parcel a = mo14029a(1, mo14032s_());
        CameraPosition cameraPosition = (CameraPosition) C4192c.m20834a(a, CameraPosition.CREATOR);
        a.recycle();
        return cameraPosition;
    }

    /* renamed from: a */
    public final void mo15054a(int i) {
        Parcel s_ = mo14032s_();
        s_.writeInt(i);
        mo14031b(16, s_);
    }

    /* renamed from: a */
    public final void mo15055a(C3323b bVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) bVar);
        mo14031b(4, s_);
    }

    /* renamed from: a */
    public final void mo15056a(C3323b bVar, C4576x xVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) bVar);
        C4192c.m20835a(s_, (IInterface) xVar);
        mo14031b(6, s_);
    }

    /* renamed from: a */
    public final void mo15057a(C4548ac acVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) acVar);
        mo14031b(33, s_);
    }

    /* renamed from: a */
    public final void mo15058a(C4551af afVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) afVar);
        mo14031b(27, s_);
    }

    /* renamed from: a */
    public final void mo15059a(C4554c cVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) cVar);
        mo14031b(24, s_);
    }

    /* renamed from: a */
    public final void mo15060a(C4561i iVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) iVar);
        mo14031b(32, s_);
    }

    /* renamed from: a */
    public final void mo15061a(C4567o oVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) oVar);
        mo14031b(30, s_);
    }

    /* renamed from: a */
    public final void mo15062a(C4569q qVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) qVar);
        mo14031b(36, s_);
    }

    /* renamed from: a */
    public final void mo15063a(boolean z) {
        Parcel s_ = mo14032s_();
        C4192c.m20837a(s_, z);
        mo14031b(22, s_);
    }

    /* renamed from: b */
    public final float mo15064b() {
        Parcel a = mo14029a(2, mo14032s_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: b */
    public final void mo15065b(C3323b bVar) {
        Parcel s_ = mo14032s_();
        C4192c.m20835a(s_, (IInterface) bVar);
        mo14031b(5, s_);
    }

    /* renamed from: c */
    public final float mo15066c() {
        Parcel a = mo14029a(3, mo14032s_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: d */
    public final void mo15067d() {
        mo14031b(14, mo14032s_());
    }

    /* renamed from: e */
    public final int mo15068e() {
        Parcel a = mo14029a(15, mo14032s_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final boolean mo15069f() {
        Parcel a = mo14029a(21, mo14032s_());
        boolean a2 = C4192c.m20838a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: g */
    public final Location mo15070g() {
        Parcel a = mo14029a(23, mo14032s_());
        Location location = (Location) C4192c.m20834a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    /* renamed from: h */
    public final C4558f mo15071h() {
        C4558f fVar;
        Parcel a = mo14029a(25, mo14032s_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            fVar = queryLocalInterface instanceof C4558f ? (C4558f) queryLocalInterface : new C4573u(readStrongBinder);
        }
        a.recycle();
        return fVar;
    }

    /* renamed from: i */
    public final C4557e mo15072i() {
        C4557e eVar;
        Parcel a = mo14029a(26, mo14032s_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            eVar = queryLocalInterface instanceof C4557e ? (C4557e) queryLocalInterface : new C4572t(readStrongBinder);
        }
        a.recycle();
        return eVar;
    }
}
