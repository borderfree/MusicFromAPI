package com.google.android.gms.common.api.internal;

import android.support.p009v4.p019g.C0488a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.C4793c;
import com.google.android.gms.tasks.C4796f;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.o */
final class C3152o implements C4793c<Map<C3112cb<?>, String>> {

    /* renamed from: a */
    private C3148k f10903a;

    /* renamed from: b */
    private final /* synthetic */ C3128cq f10904b;

    C3152o(C3128cq cqVar, C3148k kVar) {
        this.f10904b = cqVar;
        this.f10903a = kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11074a() {
        this.f10903a.mo10732y();
    }

    /* renamed from: a */
    public final void mo11008a(C4796f<Map<C3112cb<?>, String>> fVar) {
        C3148k kVar;
        Map g;
        this.f10904b.f10821f.lock();
        try {
            if (!this.f10904b.f10829n) {
                kVar = this.f10903a;
            } else {
                if (fVar.mo15925b()) {
                    this.f10904b.f10831p = new C0488a(this.f10904b.f10817b.size());
                    for (C3127cp b : this.f10904b.f10817b.values()) {
                        this.f10904b.f10831p.put(b.mo10831b(), ConnectionResult.f10553a);
                    }
                } else if (fVar.mo15928e() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) fVar.mo15928e();
                    if (this.f10904b.f10827l) {
                        this.f10904b.f10831p = new C0488a(this.f10904b.f10817b.size());
                        for (C3127cp cpVar : this.f10904b.f10817b.values()) {
                            C3112cb b2 = cpVar.mo10831b();
                            ConnectionResult connectionResult = availabilityException.getConnectionResult(cpVar);
                            if (this.f10904b.m14380a(cpVar, connectionResult)) {
                                g = this.f10904b.f10831p;
                                connectionResult = new ConnectionResult(16);
                            } else {
                                g = this.f10904b.f10831p;
                            }
                            g.put(b2, connectionResult);
                        }
                    } else {
                        this.f10904b.f10831p = availabilityException.zaj();
                    }
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", fVar.mo15928e());
                    this.f10904b.f10831p = Collections.emptyMap();
                }
                if (this.f10904b.mo10930f()) {
                    this.f10904b.f10830o.putAll(this.f10904b.f10831p);
                    if (this.f10904b.m14397k() == null) {
                        this.f10904b.m14392g();
                        this.f10904b.m14395j();
                        this.f10904b.f10824i.signalAll();
                    }
                }
                kVar = this.f10903a;
            }
            kVar.mo10732y();
        } finally {
            this.f10904b.f10821f.unlock();
        }
    }
}
