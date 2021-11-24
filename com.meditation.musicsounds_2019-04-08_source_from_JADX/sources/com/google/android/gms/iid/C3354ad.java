package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C4797g;

/* renamed from: com.google.android.gms.iid.ad */
abstract class C3354ad<T> {

    /* renamed from: a */
    final int f11275a;

    /* renamed from: b */
    final C4797g<T> f11276b = new C4797g<>();

    /* renamed from: c */
    final int f11277c;

    /* renamed from: d */
    final Bundle f11278d;

    C3354ad(int i, int i2, Bundle bundle) {
        this.f11275a = i;
        this.f11277c = i2;
        this.f11278d = bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo11375a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11376a(zzaa zzaa) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzaa);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f11276b.mo15930a((Exception) zzaa);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo11377a();

    public String toString() {
        int i = this.f11277c;
        int i2 = this.f11275a;
        mo11377a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=false}");
        return sb.toString();
    }
}
