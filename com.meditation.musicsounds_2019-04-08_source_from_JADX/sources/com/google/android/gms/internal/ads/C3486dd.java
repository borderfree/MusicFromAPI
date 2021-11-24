package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3227d.C3228a;
import com.google.android.gms.common.internal.C3227d.C3229b;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.dd */
public final class C3486dd extends C3481cz implements C3228a, C3229b {

    /* renamed from: a */
    private Context f13720a;

    /* renamed from: b */
    private zzang f13721b;

    /* renamed from: c */
    private C3765nl<zzaef> f13722c;

    /* renamed from: d */
    private final C3479cx f13723d;

    /* renamed from: e */
    private final Object f13724e = new Object();

    /* renamed from: f */
    private C3487de f13725f;

    public C3486dd(Context context, zzang zzang, C3765nl<zzaef> nlVar, C3479cx cxVar) {
        super(nlVar, cxVar);
        this.f13720a = context;
        this.f13721b = zzang;
        this.f13722c = nlVar;
        this.f13723d = cxVar;
        this.f13725f = new C3487de(context, ((Boolean) ane.m16650f().mo12297a(aqm.f12614G)).booleanValue() ? zzbv.zzez().mo13214a() : context.getMainLooper(), this, this);
        this.f13725f.mo11221q();
    }

    /* renamed from: a */
    public final void mo12848a() {
        synchronized (this.f13724e) {
            if (this.f13725f.mo11212h() || this.f13725f.mo11213i()) {
                this.f13725f.mo11211g();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final void mo11230a(int i) {
        C3643iy.m19172b("Disconnected from remote ad request service.");
    }

    /* renamed from: a */
    public final void mo11231a(Bundle bundle) {
        mo11913c();
    }

    /* renamed from: a */
    public final void mo11160a(ConnectionResult connectionResult) {
        C3643iy.m19172b("Cannot connect to remote service, fallback to local instance.");
        new C3485dc(this.f13720a, this.f13722c, this.f13723d).mo11913c();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        zzbv.zzek().mo13132b(this.f13720a, this.f13721b.f15360a, "gmob-apps", bundle, true);
    }

    /* renamed from: d */
    public final C3493dk mo12850d() {
        C3493dk e;
        synchronized (this.f13724e) {
            try {
                e = this.f13725f.mo10737e();
            } catch (DeadObjectException | IllegalStateException unused) {
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }
}
