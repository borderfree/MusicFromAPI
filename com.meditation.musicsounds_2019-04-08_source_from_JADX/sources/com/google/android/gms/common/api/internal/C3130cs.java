package com.google.android.gms.common.api.internal;

import android.support.p009v4.p019g.C0488a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.C4793c;
import com.google.android.gms.tasks.C4796f;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.cs */
final class C3130cs implements C4793c<Map<C3112cb<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ C3128cq f10834a;

    private C3130cs(C3128cq cqVar) {
        this.f10834a = cqVar;
    }

    /* renamed from: a */
    public final void mo11008a(C4796f<Map<C3112cb<?>, String>> fVar) {
        C3128cq cqVar;
        ConnectionResult connectionResult;
        Map d;
        this.f10834a.f10821f.lock();
        try {
            if (this.f10834a.f10829n) {
                if (fVar.mo15925b()) {
                    this.f10834a.f10830o = new C0488a(this.f10834a.f10816a.size());
                    for (C3127cp b : this.f10834a.f10816a.values()) {
                        this.f10834a.f10830o.put(b.mo10831b(), ConnectionResult.f10553a);
                    }
                } else {
                    if (fVar.mo15928e() instanceof AvailabilityException) {
                        AvailabilityException availabilityException = (AvailabilityException) fVar.mo15928e();
                        if (this.f10834a.f10827l) {
                            this.f10834a.f10830o = new C0488a(this.f10834a.f10816a.size());
                            for (C3127cp cpVar : this.f10834a.f10816a.values()) {
                                C3112cb b2 = cpVar.mo10831b();
                                ConnectionResult connectionResult2 = availabilityException.getConnectionResult(cpVar);
                                if (this.f10834a.m14380a(cpVar, connectionResult2)) {
                                    d = this.f10834a.f10830o;
                                    connectionResult2 = new ConnectionResult(16);
                                } else {
                                    d = this.f10834a.f10830o;
                                }
                                d.put(b2, connectionResult2);
                            }
                        } else {
                            this.f10834a.f10830o = availabilityException.zaj();
                        }
                        cqVar = this.f10834a;
                        connectionResult = this.f10834a.m14397k();
                    } else {
                        Log.e("ConnectionlessGAC", "Unexpected availability exception", fVar.mo15928e());
                        this.f10834a.f10830o = Collections.emptyMap();
                        cqVar = this.f10834a;
                        connectionResult = new ConnectionResult(8);
                    }
                    cqVar.f10833r = connectionResult;
                }
                if (this.f10834a.f10831p != null) {
                    this.f10834a.f10830o.putAll(this.f10834a.f10831p);
                    this.f10834a.f10833r = this.f10834a.m14397k();
                }
                if (this.f10834a.f10833r == null) {
                    this.f10834a.m14392g();
                    this.f10834a.m14395j();
                } else {
                    this.f10834a.f10829n = false;
                    this.f10834a.f10820e.mo10906a(this.f10834a.f10833r);
                }
                this.f10834a.f10824i.signalAll();
            }
        } finally {
            this.f10834a.f10821f.unlock();
        }
    }
}
