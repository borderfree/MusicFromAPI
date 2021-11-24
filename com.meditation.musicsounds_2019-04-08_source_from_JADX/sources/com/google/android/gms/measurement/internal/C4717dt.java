package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dt */
final class C4717dt extends C4753fa {

    /* renamed from: a */
    private final /* synthetic */ C4714dq f16991a;

    C4717dt(C4714dq dqVar, C4663bt btVar) {
        this.f16991a = dqVar;
        super(btVar);
    }

    /* renamed from: a */
    public final void mo15469a() {
        C4714dq dqVar = this.f16991a;
        dqVar.mo15239d();
        dqVar.mo15253r().mo15855x().mo15858a("Current session is expired, remove the session number and Id");
        if (dqVar.mo15255t().mo15756p(dqVar.mo15242g().mo15825x())) {
            dqVar.mo15241f().mo15415a("auto", "_sid", (Object) null, dqVar.mo15248m().mo11326a());
        }
        if (dqVar.mo15255t().mo15757q(dqVar.mo15242g().mo15825x())) {
            dqVar.mo15241f().mo15415a("auto", "_sno", (Object) null, dqVar.mo15248m().mo11326a());
        }
    }
}
