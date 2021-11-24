package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C4797g;

/* renamed from: com.google.firebase.iid.m */
abstract class C4960m<T> {

    /* renamed from: a */
    final int f17767a;

    /* renamed from: b */
    final C4797g<T> f17768b = new C4797g<>();

    /* renamed from: c */
    final int f17769c;

    /* renamed from: d */
    final Bundle f17770d;

    C4960m(int i, int i2, Bundle bundle) {
        this.f17767a = i;
        this.f17769c = i2;
        this.f17770d = bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo16231a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16233a(zzal zzal) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzal);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f17768b.mo15930a((Exception) zzal);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16234a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f17768b.mo15931a(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo16232a();

    public String toString() {
        int i = this.f17769c;
        int i2 = this.f17767a;
        boolean a = mo16232a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
