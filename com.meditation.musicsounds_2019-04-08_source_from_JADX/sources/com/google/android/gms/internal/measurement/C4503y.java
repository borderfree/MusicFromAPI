package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.analytics.C2952p;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.stats.C3285a;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.measurement.y */
public final class C4503y extends C4497s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4235aa f16393a = new C4235aa(this);

    /* renamed from: b */
    private C4268bg f16394b;

    /* renamed from: c */
    private final C4255au f16395c;

    /* renamed from: d */
    private final C4285bx f16396d;

    protected C4503y(C4499u uVar) {
        super(uVar);
        this.f16396d = new C4285bx(uVar.mo14844c());
        this.f16395c = new C4504z(this, uVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22374a(ComponentName componentName) {
        C2952p.m13827d();
        if (this.f16394b != null) {
            this.f16394b = null;
            mo14808a("Disconnected from device AnalyticsService", componentName);
            mo14831n().mo14800d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22375a(C4268bg bgVar) {
        C2952p.m13827d();
        this.f16394b = bgVar;
        m22379e();
        mo14831n().mo14801e();
    }

    /* renamed from: e */
    private final void m22379e() {
        this.f16396d.mo14209a();
        this.f16395c.mo14151a(((Long) C4262ba.f15741A.mo14166a()).longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m22380f() {
        C2952p.m13827d();
        if (mo14870b()) {
            mo14811b("Inactivity, disconnecting from device AnalyticsService");
            mo14872d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10611a() {
    }

    /* renamed from: a */
    public final boolean mo14869a(C4267bf bfVar) {
        C3266s.m14913a(bfVar);
        C2952p.m13827d();
        mo14840x();
        C4268bg bgVar = this.f16394b;
        if (bgVar == null) {
            return false;
        }
        try {
            bgVar.mo14176a(bfVar.mo14168b(), bfVar.mo14170d(), bfVar.mo14172f() ? C4253as.m21003h() : C4253as.m21004i(), Collections.emptyList());
            m22379e();
            return true;
        } catch (RemoteException unused) {
            mo14811b("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo14870b() {
        C2952p.m13827d();
        mo14840x();
        return this.f16394b != null;
    }

    /* renamed from: c */
    public final boolean mo14871c() {
        C2952p.m13827d();
        mo14840x();
        if (this.f16394b != null) {
            return true;
        }
        C4268bg a = this.f16393a.mo14098a();
        if (a == null) {
            return false;
        }
        this.f16394b = a;
        m22379e();
        return true;
    }

    /* renamed from: d */
    public final void mo14872d() {
        C2952p.m13827d();
        mo14840x();
        try {
            C3285a.m15014a().mo11311a(mo14826i(), this.f16393a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.f16394b != null) {
            this.f16394b = null;
            mo14831n().mo14800d();
        }
    }
}
