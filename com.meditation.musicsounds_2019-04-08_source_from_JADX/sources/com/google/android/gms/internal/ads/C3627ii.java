package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ii */
public final class C3627ii implements C3650je {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f14191a = new Object();

    /* renamed from: b */
    private ahv f14192b;

    /* renamed from: c */
    private final C3634ip f14193c = new C3634ip();

    /* renamed from: d */
    private final C3646ja f14194d = new C3646ja();

    /* renamed from: e */
    private boolean f14195e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f14196f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzang f14197g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: h */
    public aqp f14198h = null;
    @Nullable

    /* renamed from: i */
    private ajo f14199i = null;
    @Nullable

    /* renamed from: j */
    private ajj f14200j = null;
    @Nullable

    /* renamed from: k */
    private Boolean f14201k = null;

    /* renamed from: l */
    private String f14202l;

    /* renamed from: m */
    private final AtomicInteger f14203m = new AtomicInteger(0);

    /* renamed from: n */
    private final C3630il f14204n = new C3630il(null);

    /* renamed from: o */
    private final Object f14205o = new Object();

    /* renamed from: p */
    private C3751my<ArrayList<String>> f14206p;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        return null;
     */
    @javax.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.ajo m18714a(@javax.annotation.Nullable android.content.Context r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aqm.f12624Q
            com.google.android.gms.internal.ads.aqk r1 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r0 = r1.mo12297a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            boolean r0 = com.google.android.gms.common.util.C3309n.m15070b()
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aqm.f12632Y
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r0 = r2.mo12297a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0040
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aqm.f12630W
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r0 = r2.mo12297a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0040
            return r1
        L_0x0040:
            if (r5 == 0) goto L_0x0045
            if (r6 == 0) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Object r5 = r3.f14191a
            monitor-enter(r5)
            android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x007d
            if (r4 != 0) goto L_0x0051
            goto L_0x007d
        L_0x0051:
            com.google.android.gms.internal.ads.ajj r6 = r3.f14200j     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x005c
            com.google.android.gms.internal.ads.ajj r6 = new com.google.android.gms.internal.ads.ajj     // Catch:{ all -> 0x007f }
            r6.<init>()     // Catch:{ all -> 0x007f }
            r3.f14200j = r6     // Catch:{ all -> 0x007f }
        L_0x005c:
            com.google.android.gms.internal.ads.ajo r6 = r3.f14199i     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x006f
            com.google.android.gms.internal.ads.ajo r6 = new com.google.android.gms.internal.ads.ajo     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.ajj r0 = r3.f14200j     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.zzang r1 = r3.f14197g     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.internal.ads.C3458cc.m18248a(r4, r1)     // Catch:{ all -> 0x007f }
            r6.<init>(r0, r4)     // Catch:{ all -> 0x007f }
            r3.f14199i = r6     // Catch:{ all -> 0x007f }
        L_0x006f:
            com.google.android.gms.internal.ads.ajo r4 = r3.f14199i     // Catch:{ all -> 0x007f }
            r4.mo12042a()     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "start fetching content..."
            com.google.android.gms.internal.ads.C3643iy.m19176d(r4)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.ajo r4 = r3.f14199i     // Catch:{ all -> 0x007f }
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            return r4
        L_0x007d:
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            return r1
        L_0x007f:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3627ii.m18714a(android.content.Context, boolean, boolean):com.google.android.gms.internal.ads.ajo");
    }

    @TargetApi(16)
    /* renamed from: b */
    private static ArrayList<String> m18716b(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b = C3181c.m14658a(context).mo11129b(context.getApplicationInfo().packageName, 4096);
            if (!(b.requestedPermissions == null || b.requestedPermissionsFlags == null)) {
                for (int i = 0; i < b.requestedPermissions.length; i++) {
                    if ((b.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(b.requestedPermissions[i]);
                    }
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: a */
    public final ajo mo13042a(@Nullable Context context) {
        return m18714a(context, this.f14194d.mo13104b(), this.f14194d.mo13110d());
    }

    /* renamed from: a */
    public final C3634ip mo13043a() {
        return this.f14193c;
    }

    @TargetApi(23)
    /* renamed from: a */
    public final void mo13044a(Context context, zzang zzang) {
        aqp aqp;
        synchronized (this.f14191a) {
            if (!this.f14195e) {
                this.f14196f = context.getApplicationContext();
                this.f14197g = zzang;
                zzbv.zzen().mo12027a((ajn) zzbv.zzep());
                this.f14194d.mo13094a(this.f14196f);
                this.f14194d.mo13095a((C3650je) this);
                C3458cc.m18248a(this.f14196f, this.f14197g);
                this.f14202l = zzbv.zzek().mo13131b(context, zzang.f15360a);
                this.f14192b = new ahv(context.getApplicationContext(), this.f14197g);
                zzbv.zzet();
                if (!((Boolean) ane.m16650f().mo12297a(aqm.f12621N)).booleanValue()) {
                    C3643iy.m18780a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    aqp = null;
                } else {
                    aqp = new aqp();
                }
                this.f14198h = aqp;
                C3738ml.m19187a((C3751my) new C3629ik(this).mo11913c(), "AppState.registerCsiReporter");
                this.f14195e = true;
                mo13062n();
            }
        }
    }

    /* renamed from: a */
    public final void mo13045a(Bundle bundle) {
        if (bundle.containsKey("content_url_opted_out") && bundle.containsKey("content_vertical_opted_out")) {
            m18714a(this.f14196f, bundle.getBoolean("content_url_opted_out"), bundle.getBoolean("content_vertical_opted_out"));
        }
    }

    /* renamed from: a */
    public final void mo13046a(Boolean bool) {
        synchronized (this.f14191a) {
            this.f14201k = bool;
        }
    }

    /* renamed from: a */
    public final void mo13047a(Throwable th, String str) {
        C3458cc.m18248a(this.f14196f, this.f14197g).mo12836a(th, str);
    }

    /* renamed from: a */
    public final void mo13048a(boolean z) {
        this.f14204n.mo13065a(z);
    }

    @Nullable
    /* renamed from: b */
    public final aqp mo13049b() {
        aqp aqp;
        synchronized (this.f14191a) {
            aqp = this.f14198h;
        }
        return aqp;
    }

    /* renamed from: b */
    public final void mo13050b(Throwable th, String str) {
        C3458cc.m18248a(this.f14196f, this.f14197g).mo12837a(th, str, ((Float) ane.m16650f().mo12297a(aqm.f12896f)).floatValue());
    }

    /* renamed from: c */
    public final Boolean mo13051c() {
        Boolean bool;
        synchronized (this.f14191a) {
            bool = this.f14201k;
        }
        return bool;
    }

    /* renamed from: d */
    public final boolean mo13052d() {
        return this.f14204n.mo13066a();
    }

    /* renamed from: e */
    public final boolean mo13053e() {
        return this.f14204n.mo13067b();
    }

    /* renamed from: f */
    public final void mo13054f() {
        this.f14204n.mo13068c();
    }

    /* renamed from: g */
    public final ahv mo13055g() {
        return this.f14192b;
    }

    @Nullable
    /* renamed from: h */
    public final Resources mo13056h() {
        if (this.f14197g.f15363d) {
            return this.f14196f.getResources();
        }
        try {
            DynamiteModule a = DynamiteModule.m15147a(this.f14196f, DynamiteModule.f11241a, ModuleDescriptor.MODULE_ID);
            if (a != null) {
                return a.mo11351a().getResources();
            }
            return null;
        } catch (LoadingException e) {
            C3643iy.m19175c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: i */
    public final void mo13057i() {
        this.f14203m.incrementAndGet();
    }

    /* renamed from: j */
    public final void mo13058j() {
        this.f14203m.decrementAndGet();
    }

    /* renamed from: k */
    public final int mo13059k() {
        return this.f14203m.get();
    }

    /* renamed from: l */
    public final C3646ja mo13060l() {
        C3646ja jaVar;
        synchronized (this.f14191a) {
            jaVar = this.f14194d;
        }
        return jaVar;
    }

    @Nullable
    /* renamed from: m */
    public final Context mo13061m() {
        return this.f14196f;
    }

    /* renamed from: n */
    public final C3751my<ArrayList<String>> mo13062n() {
        if (this.f14196f != null && C3309n.m15072d()) {
            if (!((Boolean) ane.m16650f().mo12297a(aqm.f12695bH)).booleanValue()) {
                synchronized (this.f14205o) {
                    if (this.f14206p != null) {
                        C3751my<ArrayList<String>> myVar = this.f14206p;
                        return myVar;
                    }
                    C3751my<ArrayList<String>> a = C3651jf.m18856a((Callable<T>) new C3628ij<T>(this));
                    this.f14206p = a;
                    return a;
                }
            }
        }
        return C3740mn.m19191a(new ArrayList());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ ArrayList mo13063o() {
        return m18716b(this.f14196f);
    }
}
