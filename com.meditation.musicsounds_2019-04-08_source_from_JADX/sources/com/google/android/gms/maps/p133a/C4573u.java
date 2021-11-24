package com.google.android.gms.maps.p133a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.p132g.C4190a;
import com.google.android.gms.internal.p132g.C4192c;

/* renamed from: com.google.android.gms.maps.a.u */
public final class C4573u extends C4190a implements C4558f {
    C4573u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    /* renamed from: a */
    public final void mo15087a(boolean z) {
        Parcel s_ = mo14032s_();
        C4192c.m20837a(s_, z);
        mo14031b(2, s_);
    }

    /* renamed from: b */
    public final void mo15088b(boolean z) {
        Parcel s_ = mo14032s_();
        C4192c.m20837a(s_, z);
        mo14031b(3, s_);
    }
}
