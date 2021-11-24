package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;

/* renamed from: com.google.android.gms.common.api.internal.ag */
final class C3060ag implements C3042b, C3043c {

    /* renamed from: a */
    private final /* synthetic */ C3161x f10649a;

    private C3060ag(C3161x xVar) {
        this.f10649a = xVar;
    }

    /* synthetic */ C3060ag(C3161x xVar, C3162y yVar) {
        this(xVar);
    }

    /* renamed from: a */
    public final void mo10863a(int i) {
    }

    /* renamed from: a */
    public final void mo10864a(Bundle bundle) {
        this.f10649a.f10928k.mo15891a(new C3058ae(this.f10649a));
    }

    /* renamed from: a */
    public final void mo10865a(ConnectionResult connectionResult) {
        this.f10649a.f10919b.lock();
        try {
            if (this.f10649a.m14578a(connectionResult)) {
                this.f10649a.m14594g();
                this.f10649a.m14589e();
            } else {
                this.f10649a.m14581b(connectionResult);
            }
        } finally {
            this.f10649a.f10919b.unlock();
        }
    }
}
