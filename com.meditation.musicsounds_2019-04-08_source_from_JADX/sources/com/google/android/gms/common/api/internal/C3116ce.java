package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C3177d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.p128c.C4164e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.ce */
public abstract class C3116ce extends LifecycleCallback implements OnCancelListener {

    /* renamed from: b */
    protected volatile boolean f10782b;

    /* renamed from: c */
    protected final AtomicReference<C3117cf> f10783c;

    /* renamed from: d */
    protected final C3177d f10784d;

    /* renamed from: e */
    private final Handler f10785e;

    protected C3116ce(C3141g gVar) {
        this(gVar, C3177d.m14629a());
    }

    private C3116ce(C3141g gVar, C3177d dVar) {
        super(gVar);
        this.f10783c = new AtomicReference<>(null);
        this.f10785e = new C4164e(Looper.getMainLooper());
        this.f10784d = dVar;
    }

    /* renamed from: a */
    private static int m14317a(C3117cf cfVar) {
        if (cfVar == null) {
            return -1;
        }
        return cfVar.mo10998a();
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10885a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.cf> r0 = r3.f10783c
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.cf r0 = (com.google.android.gms.common.api.internal.C3117cf) r0
            r1 = 1
            r2 = 0
            switch(r4) {
                case 1: goto L_0x002e;
                case 2: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0053
        L_0x000e:
            com.google.android.gms.common.d r4 = r3.f10784d
            android.app.Activity r5 = r3.mo10884a()
            int r4 = r4.mo11106a(r5)
            if (r4 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            com.google.android.gms.common.ConnectionResult r5 = r0.mo10999b()
            int r5 = r5.mo10760c()
            r6 = 18
            if (r5 != r6) goto L_0x0054
            if (r4 != r6) goto L_0x0054
            return
        L_0x002e:
            r4 = -1
            if (r5 != r4) goto L_0x0032
            goto L_0x0054
        L_0x0032:
            if (r5 != 0) goto L_0x0053
            r4 = 13
            if (r6 == 0) goto L_0x003e
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r4 = r6.getIntExtra(r5, r4)
        L_0x003e:
            com.google.android.gms.common.api.internal.cf r5 = new com.google.android.gms.common.api.internal.cf
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r6.<init>(r4, r1)
            int r4 = m14317a(r0)
            r5.<init>(r6, r4)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.cf> r4 = r3.f10783c
            r4.set(r5)
            r0 = r5
        L_0x0053:
            r1 = 0
        L_0x0054:
            if (r1 == 0) goto L_0x005a
            r3.mo10996h()
            return
        L_0x005a:
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.common.ConnectionResult r4 = r0.mo10999b()
            int r5 = r0.mo10998a()
            r3.mo10990a(r4, r5)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3116ce.mo10885a(int, int, android.content.Intent):void");
    }

    /* renamed from: a */
    public void mo10886a(Bundle bundle) {
        super.mo10886a(bundle);
        if (bundle != null) {
            this.f10783c.set(bundle.getBoolean("resolving_error", false) ? new C3117cf(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10990a(ConnectionResult connectionResult, int i);

    /* renamed from: b */
    public void mo10888b() {
        super.mo10888b();
        this.f10782b = true;
    }

    /* renamed from: b */
    public void mo10889b(Bundle bundle) {
        super.mo10889b(bundle);
        C3117cf cfVar = (C3117cf) this.f10783c.get();
        if (cfVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", cfVar.mo10998a());
            bundle.putInt("failed_status", cfVar.mo10999b().mo10760c());
            bundle.putParcelable("failed_resolution", cfVar.mo10999b().mo10761d());
        }
    }

    /* renamed from: b */
    public final void mo10995b(ConnectionResult connectionResult, int i) {
        C3117cf cfVar = new C3117cf(connectionResult, i);
        if (this.f10783c.compareAndSet(null, cfVar)) {
            this.f10785e.post(new C3118cg(this, cfVar));
        }
    }

    /* renamed from: d */
    public void mo10891d() {
        super.mo10891d();
        this.f10782b = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo10991f();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo10996h() {
        this.f10783c.set(null);
        mo10991f();
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo10990a(new ConnectionResult(13, null), m14317a((C3117cf) this.f10783c.get()));
        mo10996h();
    }
}
