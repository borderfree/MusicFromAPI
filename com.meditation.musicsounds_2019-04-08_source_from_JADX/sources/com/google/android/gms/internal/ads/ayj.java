package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class ayj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f13323a;

    /* renamed from: b */
    private final Context f13324b;

    /* renamed from: c */
    private final String f13325c;

    /* renamed from: d */
    private final zzang f13326d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3685km<axx> f13327e;

    /* renamed from: f */
    private C3685km<axx> f13328f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public aza f13329g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f13330h;

    public ayj(Context context, zzang zzang, String str) {
        this.f13323a = new Object();
        this.f13330h = 1;
        this.f13325c = str;
        this.f13324b = context.getApplicationContext();
        this.f13326d = zzang;
        this.f13327e = new ayv();
        this.f13328f = new ayv();
    }

    public ayj(Context context, zzang zzang, String str, C3685km<axx> kmVar, C3685km<axx> kmVar2) {
        this(context, zzang, str);
        this.f13327e = kmVar;
        this.f13328f = kmVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final aza mo12628a(afm afm) {
        aza aza = new aza(this.f13328f);
        C3758ne.f14481a.execute(new ayk(this, afm, aza));
        aza.mo13301a(new ays(this, aza), new ayt(this, aza));
        return aza;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12629a(afm afm, aza aza) {
        try {
            Context context = this.f13324b;
            zzang zzang = this.f13326d;
            axx axi = ((Boolean) ane.m16650f().mo12297a(aqm.f12635aA)).booleanValue() ? new axi(context, zzang) : new axz(context, zzang, afm, null);
            axi.mo12591a((axy) new ayl(this, aza, axi));
            axi.mo12617a("/jsLoaded", new ayo(this, aza, axi));
            C3709lj ljVar = new C3709lj();
            ayp ayp = new ayp(this, afm, axi, ljVar);
            ljVar.mo13221a(ayp);
            axi.mo12617a("/requestReload", ayp);
            if (this.f13325c.endsWith(".js")) {
                axi.mo12592a(this.f13325c);
            } else if (this.f13325c.startsWith("<html>")) {
                axi.mo12597c(this.f13325c);
            } else {
                axi.mo12598d(this.f13325c);
            }
            C3653jh.f14275a.postDelayed(new ayq(this, aza, axi), (long) ayu.f13356a);
        } catch (Throwable th) {
            C3643iy.m19173b("Error creating webview.", th);
            zzbv.zzeo().mo13047a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            aza.mo13303a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo12630a(com.google.android.gms.internal.ads.aza r4, com.google.android.gms.internal.ads.axx r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13323a
            monitor-enter(r0)
            int r1 = r4.mo13304b()     // Catch:{ all -> 0x002a }
            r2 = -1
            if (r1 == r2) goto L_0x0028
            int r1 = r4.mo13304b()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            r4.mo13303a()     // Catch:{ all -> 0x002a }
            java.util.concurrent.Executor r4 = com.google.android.gms.internal.ads.C3758ne.f14481a     // Catch:{ all -> 0x002a }
            r5.getClass()     // Catch:{ all -> 0x002a }
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.ayn.m17681a(r5)     // Catch:{ all -> 0x002a }
            r4.execute(r5)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.C3643iy.m18780a(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ayj.mo12630a(com.google.android.gms.internal.ads.aza, com.google.android.gms.internal.ads.axx):void");
    }

    /* renamed from: b */
    public final ayw mo12631b(afm afm) {
        synchronized (this.f13323a) {
            if (this.f13329g != null) {
                if (this.f13329g.mo13304b() != -1) {
                    if (this.f13330h == 0) {
                        ayw c = this.f13329g.mo12640c();
                        return c;
                    } else if (this.f13330h == 1) {
                        this.f13330h = 2;
                        mo12628a((afm) null);
                        ayw c2 = this.f13329g.mo12640c();
                        return c2;
                    } else if (this.f13330h == 2) {
                        ayw c3 = this.f13329g.mo12640c();
                        return c3;
                    } else {
                        ayw c4 = this.f13329g.mo12640c();
                        return c4;
                    }
                }
            }
            this.f13330h = 2;
            this.f13329g = mo12628a((afm) null);
            ayw c5 = this.f13329g.mo12640c();
            return c5;
        }
    }
}
