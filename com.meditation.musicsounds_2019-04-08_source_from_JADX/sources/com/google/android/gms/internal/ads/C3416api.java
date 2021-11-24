package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.api */
public final class C3416api extends RemoteCreator<aoq> {
    public C3416api() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof aoq ? (aoq) queryLocalInterface : new aor(iBinder);
    }

    /* renamed from: b */
    public final aon mo12243b(Context context) {
        try {
            IBinder a = ((aoq) mo11331a(context)).mo12131a(C3327d.m15136a(context), C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof aon ? (aon) queryLocalInterface : new aop(a);
        } catch (RemoteException | RemoteCreatorException e) {
            C3731me.m19175c("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
