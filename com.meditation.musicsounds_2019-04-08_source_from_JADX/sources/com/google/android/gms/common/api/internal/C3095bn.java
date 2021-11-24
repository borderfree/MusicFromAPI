package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.C4776a;
import com.google.android.gms.signin.C4778b;
import com.google.android.gms.signin.C4781e;
import com.google.android.gms.signin.internal.C4784c;
import com.google.android.gms.signin.internal.zaj;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.bn */
public final class C3095bn extends C4784c implements C3042b, C3043c {

    /* renamed from: a */
    private static C3021a<? extends C4781e, C4776a> f10731a = C4778b.f17302a;

    /* renamed from: b */
    private final Context f10732b;

    /* renamed from: c */
    private final Handler f10733c;

    /* renamed from: d */
    private final C3021a<? extends C4781e, C4776a> f10734d;

    /* renamed from: e */
    private Set<Scope> f10735e;

    /* renamed from: f */
    private C3240e f10736f;

    /* renamed from: g */
    private C4781e f10737g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3098bq f10738h;

    public C3095bn(Context context, Handler handler, C3240e eVar) {
        this(context, handler, eVar, f10731a);
    }

    public C3095bn(Context context, Handler handler, C3240e eVar, C3021a<? extends C4781e, C4776a> aVar) {
        this.f10732b = context;
        this.f10733c = handler;
        this.f10736f = (C3240e) C3266s.m14914a(eVar, (Object) "ClientSettings must not be null");
        this.f10735e = eVar.mo11247d();
        this.f10734d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m14245b(zaj zaj) {
        ConnectionResult a = zaj.mo15908a();
        if (a.mo10759b()) {
            ResolveAccountResponse b = zaj.mo15909b();
            a = b.mo11149b();
            if (!a.mo10759b()) {
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.f10738h.mo10967a(b.mo11148a(), this.f10735e);
                this.f10737g.mo10815g();
            }
        }
        this.f10738h.mo10968b(a);
        this.f10737g.mo10815g();
    }

    /* renamed from: a */
    public final C4781e mo10962a() {
        return this.f10737g;
    }

    /* renamed from: a */
    public final void mo10863a(int i) {
        this.f10737g.mo10815g();
    }

    /* renamed from: a */
    public final void mo10864a(Bundle bundle) {
        this.f10737g.mo15891a(this);
    }

    /* renamed from: a */
    public final void mo10865a(ConnectionResult connectionResult) {
        this.f10738h.mo10968b(connectionResult);
    }

    /* renamed from: a */
    public final void mo10963a(C3098bq bqVar) {
        if (this.f10737g != null) {
            this.f10737g.mo10815g();
        }
        this.f10736f.mo11244a(Integer.valueOf(System.identityHashCode(this)));
        this.f10737g = (C4781e) this.f10734d.mo10666a(this.f10732b, this.f10733c.getLooper(), this.f10736f, this.f10736f.mo11252i(), this, this);
        this.f10738h = bqVar;
        if (this.f10735e == null || this.f10735e.isEmpty()) {
            this.f10733c.post(new C3096bo(this));
        } else {
            this.f10737g.mo15889A();
        }
    }

    /* renamed from: a */
    public final void mo10895a(zaj zaj) {
        this.f10733c.post(new C3097bp(this, zaj));
    }

    /* renamed from: b */
    public final void mo10964b() {
        if (this.f10737g != null) {
            this.f10737g.mo10815g();
        }
    }
}
