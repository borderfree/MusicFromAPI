package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.gms.iid.c */
final class C3356c extends C3354ad<Bundle> {
    C3356c(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11375a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f11276b.mo15931a(bundle2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo11377a() {
        return false;
    }
}
