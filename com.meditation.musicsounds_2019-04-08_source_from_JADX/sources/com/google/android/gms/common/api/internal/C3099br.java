package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3044e;
import com.google.android.gms.common.api.C3048g;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.C3050i;
import com.google.android.gms.common.api.C3164j;
import com.google.android.gms.common.api.C3165k;
import com.google.android.gms.common.api.C3166l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3266s;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.br */
public final class C3099br<R extends C3049h> extends C3166l<R> implements C3050i<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3165k<? super R, ? extends C3049h> f10742a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3099br<? extends C3049h> f10743b;

    /* renamed from: c */
    private volatile C3164j<? super R> f10744c;

    /* renamed from: d */
    private C3044e<R> f10745d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f10746e;

    /* renamed from: f */
    private Status f10747f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final WeakReference<C3040d> f10748g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3101bt f10749h;

    /* renamed from: i */
    private boolean f10750i;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14256a(Status status) {
        synchronized (this.f10746e) {
            this.f10747f = status;
            m14261b(this.f10747f);
        }
    }

    @GuardedBy("mSyncToken")
    /* renamed from: b */
    private final void m14260b() {
        if (this.f10742a != null || this.f10744c != null) {
            C3040d dVar = (C3040d) this.f10748g.get();
            if (!(this.f10750i || this.f10742a == null || dVar == null)) {
                dVar.mo10842a(this);
                this.f10750i = true;
            }
            if (this.f10747f != null) {
                m14261b(this.f10747f);
                return;
            }
            if (this.f10745d != null) {
                this.f10745d.mo10869a((C3050i<? super R>) this);
            }
        }
    }

    /* renamed from: b */
    private final void m14261b(Status status) {
        synchronized (this.f10746e) {
            if (this.f10742a != null) {
                Status a = this.f10742a.mo11086a(status);
                C3266s.m14914a(a, (Object) "onFailure must not return null");
                this.f10743b.m14256a(a);
            } else if (m14264c()) {
                this.f10744c.mo11084a(status);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m14262b(C3049h hVar) {
        if (hVar instanceof C3048g) {
            try {
                ((C3048g) hVar).mo10873a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(hVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e);
            }
        }
    }

    @GuardedBy("mSyncToken")
    /* renamed from: c */
    private final boolean m14264c() {
        return (this.f10744c == null || ((C3040d) this.f10748g.get()) == null) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10969a() {
        this.f10744c = null;
    }

    /* renamed from: a */
    public final void mo10970a(C3044e<?> eVar) {
        synchronized (this.f10746e) {
            this.f10745d = eVar;
            m14260b();
        }
    }

    /* renamed from: a */
    public final void mo10874a(R r) {
        synchronized (this.f10746e) {
            if (!r.mo10791a().mo10795d()) {
                m14256a(r.mo10791a());
                m14262b((C3049h) r);
            } else if (this.f10742a != null) {
                C3093bl.m14235a().submit(new C3100bs(this, r));
            } else if (m14264c()) {
                this.f10744c.mo11085b(r);
            }
        }
    }
}
