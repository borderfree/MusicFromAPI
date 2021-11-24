package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ix */
final class C3642ix extends C3638it {

    /* renamed from: a */
    private Context f14246a;

    C3642ix(Context context) {
        this.f14246a = context;
    }

    /* renamed from: a */
    public final void mo10051a() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f14246a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            C3643iy.m19173b("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        C3723lx.m19141a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        C3643iy.m19178e(sb.toString());
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
    }
}
