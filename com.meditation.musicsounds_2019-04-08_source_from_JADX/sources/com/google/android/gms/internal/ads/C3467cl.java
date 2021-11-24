package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzhu.zza.zzb;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.cl */
public final class C3467cl extends C3638it implements C3479cx {
    @GuardedBy("mCancelLock")

    /* renamed from: a */
    C3673ka f13690a;

    /* renamed from: b */
    private final C3466ck f13691b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3488df f13692c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f13693d = new Object();

    /* renamed from: e */
    private final Context f13694e;

    /* renamed from: f */
    private final akv f13695f;

    /* renamed from: g */
    private final akz f13696g;

    /* renamed from: h */
    private zzaef f13697h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Runnable f13698i;

    /* renamed from: j */
    private zzaej f13699j;

    /* renamed from: k */
    private bac f13700k;

    public C3467cl(Context context, C3488df dfVar, C3466ck ckVar, akz akz) {
        akv akv;
        akw akw;
        this.f13691b = ckVar;
        this.f13694e = context;
        this.f13692c = dfVar;
        this.f13696g = akz;
        this.f13695f = new akv(this.f13696g);
        this.f13695f.mo12081a((akw) new C3468cm(this));
        alw alw = new alw();
        alw.f12374a = Integer.valueOf(this.f13692c.f13759j.f15361b);
        alw.f12375b = Integer.valueOf(this.f13692c.f13759j.f15362c);
        alw.f12376c = Integer.valueOf(this.f13692c.f13759j.f15363d ? 0 : 2);
        this.f13695f.mo12081a((akw) new C3469cn(alw));
        if (this.f13692c.f13755f != null) {
            this.f13695f.mo12081a((akw) new C3470co(this));
        }
        zzjn zzjn = this.f13692c.f13752c;
        if (zzjn.f15502d && "interstitial_mb".equals(zzjn.f15499a)) {
            akv = this.f13695f;
            akw = C3471cp.f13704a;
        } else if (zzjn.f15502d && "reward_mb".equals(zzjn.f15499a)) {
            akv = this.f13695f;
            akw = C3472cq.f13705a;
        } else if (zzjn.f15506h || zzjn.f15502d) {
            akv = this.f13695f;
            akw = C3474cs.f13707a;
        } else {
            akv = this.f13695f;
            akw = C3473cr.f13706a;
        }
        akv.mo12081a(akw);
        this.f13695f.mo12082a(zzb.AD_REQUEST);
    }

    /* renamed from: a */
    private final zzjn m18256a(zzaef zzaef) {
        zzjn[] zzjnArr;
        if (((this.f13697h == null || this.f13697h.f15249V == null || this.f13697h.f15249V.size() <= 1) ? false : true) && this.f13700k != null && !this.f13700k.f13442t) {
            return null;
        }
        if (this.f13699j.f15331y) {
            for (zzjn zzjn : zzaef.f15260d.f15505g) {
                if (zzjn.f15507i) {
                    return new zzjn(zzjn, zzaef.f15260d.f15505g);
                }
            }
        }
        if (this.f13699j.f15318l != null) {
            String[] split = this.f13699j.f15318l.split("x");
            if (split.length != 2) {
                String str = "Invalid ad size format from the ad response: ";
                String valueOf = String.valueOf(this.f13699j.f15318l);
                throw new zzadu(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
            }
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                zzjn[] zzjnArr2 = zzaef.f15260d.f15505g;
                int length = zzjnArr2.length;
                for (int i = 0; i < length; i++) {
                    zzjn zzjn2 = zzjnArr2[i];
                    float f = this.f13694e.getResources().getDisplayMetrics().density;
                    int i2 = zzjn2.f15503e == -1 ? (int) (((float) zzjn2.f15504f) / f) : zzjn2.f15503e;
                    int i3 = zzjn2.f15500b == -2 ? (int) (((float) zzjn2.f15501c) / f) : zzjn2.f15500b;
                    if (parseInt == i2 && parseInt2 == i3 && !zzjn2.f15507i) {
                        return new zzjn(zzjn2, zzaef.f15260d.f15505g);
                    }
                }
                String str2 = "The ad size from the ad response was not one of the requested sizes: ";
                String valueOf2 = String.valueOf(this.f13699j.f15318l);
                throw new zzadu(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), 0);
            } catch (NumberFormatException unused) {
                String str3 = "Invalid ad size number from the ad response: ";
                String valueOf3 = String.valueOf(this.f13699j.f15318l);
                throw new zzadu(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), 0);
            }
        } else {
            throw new zzadu("The ad response must specify one of the supported ad sizes.", 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18258a(int i, String str) {
        int i2 = i;
        if (i2 == 3 || i2 == -1) {
            C3643iy.m19176d(str);
        } else {
            C3643iy.m19178e(str);
        }
        this.f13699j = this.f13699j == null ? new zzaej(i2) : new zzaej(i2, this.f13699j.f15316j);
        C3623ie ieVar = new C3623ie(this.f13697h != null ? this.f13697h : new zzaef(this.f13692c, -1, null, null, null), this.f13699j, this.f13700k, null, i, -1, this.f13699j.f15319m, null, this.f13695f, null);
        this.f13691b.zza(ieVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C3673ka mo12841a(zzang zzang, C3765nl<zzaef> nlVar) {
        Context context = this.f13694e;
        if (new C3478cw(context).mo12847a(zzang)) {
            C3643iy.m19172b("Fetching ad response from local ad request service.");
            C3485dc dcVar = new C3485dc(context, nlVar, this);
            dcVar.mo11913c();
            return dcVar;
        }
        C3643iy.m19172b("Fetching ad response from remote ad request service.");
        ane.m16645a();
        if (C3719lt.m19123c(context)) {
            return new C3486dd(context, zzang, nlVar, this);
        }
        C3643iy.m19178e("Failed to connect to remote ad request service.");
        return null;
    }

    /* renamed from: a */
    public final void mo10051a() {
        C3643iy.m19172b("AdLoaderBackgroundTask started.");
        this.f13698i = new C3475ct(this);
        C3653jh.f14275a.postDelayed(this.f13698i, ((Long) ane.m16650f().mo12297a(aqm.f12688bA)).longValue());
        long b = zzbv.zzer().mo11327b();
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12738by)).booleanValue() && this.f13692c.f13751b.f15483c != null) {
            String string = this.f13692c.f13751b.f15483c.getString("_ad");
            if (string != null) {
                zzaef zzaef = new zzaef(this.f13692c, b, null, null, null);
                this.f13697h = zzaef;
                mo12843a(C3524en.m18346a(this.f13694e, this.f13697h, string));
                return;
            }
        }
        C3769np npVar = new C3769np();
        C3651jf.m18855a((Runnable) new C3476cu(this, npVar));
        String h = zzbv.zzfh().mo13011h(this.f13694e);
        String i = zzbv.zzfh().mo13012i(this.f13694e);
        String j = zzbv.zzfh().mo13013j(this.f13694e);
        zzbv.zzfh().mo13008f(this.f13694e, j);
        zzaef zzaef2 = new zzaef(this.f13692c, b, h, i, j);
        this.f13697h = zzaef2;
        npVar.mo13302a(this.f13697h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12842a(all all) {
        all.f12330c.f12316a = this.f13692c.f13755f.packageName;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01eb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12843a(com.google.android.gms.internal.ads.zzaej r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Received ad response."
            com.google.android.gms.internal.ads.C3643iy.m19172b(r0)
            r13.f13699j = r14
            com.google.android.gms.common.util.e r14 = com.google.android.gms.ads.internal.zzbv.zzer()
            long r6 = r14.mo11327b()
            java.lang.Object r14 = r13.f13693d
            monitor-enter(r14)
            r0 = 0
            r13.f13690a = r0     // Catch:{ all -> 0x0219 }
            monitor-exit(r14)     // Catch:{ all -> 0x0219 }
            com.google.android.gms.internal.ads.ii r14 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r14 = r14.mo13060l()
            com.google.android.gms.internal.ads.zzaej r1 = r13.f13699j
            boolean r1 = r1.f15288F
            r14.mo13109d(r1)
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.aqm.f12654aT
            com.google.android.gms.internal.ads.aqk r1 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r14 = r1.mo12297a(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j
            boolean r14 = r14.f15296N
            if (r14 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.ii r14 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r14 = r14.mo13060l()
            com.google.android.gms.internal.ads.zzaef r1 = r13.f13697h
            java.lang.String r1 = r1.f15261e
            r14.mo13106c(r1)
            goto L_0x005c
        L_0x004d:
            com.google.android.gms.internal.ads.ii r14 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r14 = r14.mo13060l()
            com.google.android.gms.internal.ads.zzaef r1 = r13.f13697h
            java.lang.String r1 = r1.f15261e
            r14.mo13108d(r1)
        L_0x005c:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            int r14 = r14.f15310d     // Catch:{ zzadu -> 0x020c }
            r1 = -2
            r2 = -3
            if (r14 == r1) goto L_0x008c
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            int r14 = r14.f15310d     // Catch:{ zzadu -> 0x020c }
            if (r14 != r2) goto L_0x006b
            goto L_0x008c
        L_0x006b:
            com.google.android.gms.internal.ads.zzadu r14 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.zzaej r0 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            int r0 = r0.f15310d     // Catch:{ zzadu -> 0x020c }
            r1 = 66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ zzadu -> 0x020c }
            r2.<init>(r1)     // Catch:{ zzadu -> 0x020c }
            java.lang.String r1 = "There was a problem getting an ad response. ErrorCode: "
            r2.append(r1)     // Catch:{ zzadu -> 0x020c }
            r2.append(r0)     // Catch:{ zzadu -> 0x020c }
            java.lang.String r0 = r2.toString()     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.zzaej r1 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            int r1 = r1.f15310d     // Catch:{ zzadu -> 0x020c }
            r14.<init>(r0, r1)     // Catch:{ zzadu -> 0x020c }
            throw r14     // Catch:{ zzadu -> 0x020c }
        L_0x008c:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            int r14 = r14.f15310d     // Catch:{ zzadu -> 0x020c }
            r1 = 0
            if (r14 == r2) goto L_0x013b
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            java.lang.String r14 = r14.f15308b     // Catch:{ zzadu -> 0x020c }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ zzadu -> 0x020c }
            if (r14 != 0) goto L_0x0132
            com.google.android.gms.internal.ads.ii r14 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.ja r14 = r14.mo13060l()     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            boolean r2 = r2.f15326t     // Catch:{ zzadu -> 0x020c }
            r14.mo13098a(r2)     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            boolean r14 = r14.f15313g     // Catch:{ zzadu -> 0x020c }
            if (r14 == 0) goto L_0x00f0
            com.google.android.gms.internal.ads.bac r14 = new com.google.android.gms.internal.ads.bac     // Catch:{ JSONException -> 0x00c9 }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f13699j     // Catch:{ JSONException -> 0x00c9 }
            java.lang.String r2 = r2.f15308b     // Catch:{ JSONException -> 0x00c9 }
            r14.<init>(r2)     // Catch:{ JSONException -> 0x00c9 }
            r13.f13700k = r14     // Catch:{ JSONException -> 0x00c9 }
            com.google.android.gms.internal.ads.ii r14 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ JSONException -> 0x00c9 }
            com.google.android.gms.internal.ads.bac r2 = r13.f13700k     // Catch:{ JSONException -> 0x00c9 }
            boolean r2 = r2.f13430h     // Catch:{ JSONException -> 0x00c9 }
            r14.mo13048a(r2)     // Catch:{ JSONException -> 0x00c9 }
            goto L_0x00fb
        L_0x00c9:
            r14 = move-exception
            java.lang.String r0 = "Could not parse mediation config."
            com.google.android.gms.internal.ads.C3643iy.m19173b(r0, r14)     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.zzadu r14 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ zzadu -> 0x020c }
            java.lang.String r0 = "Could not parse mediation config: "
            com.google.android.gms.internal.ads.zzaej r2 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            java.lang.String r2 = r2.f15308b     // Catch:{ zzadu -> 0x020c }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ zzadu -> 0x020c }
            int r3 = r2.length()     // Catch:{ zzadu -> 0x020c }
            if (r3 == 0) goto L_0x00e6
            java.lang.String r0 = r0.concat(r2)     // Catch:{ zzadu -> 0x020c }
            goto L_0x00ec
        L_0x00e6:
            java.lang.String r2 = new java.lang.String     // Catch:{ zzadu -> 0x020c }
            r2.<init>(r0)     // Catch:{ zzadu -> 0x020c }
            r0 = r2
        L_0x00ec:
            r14.<init>(r0, r1)     // Catch:{ zzadu -> 0x020c }
            throw r14     // Catch:{ zzadu -> 0x020c }
        L_0x00f0:
            com.google.android.gms.internal.ads.ii r14 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            boolean r2 = r2.f15291I     // Catch:{ zzadu -> 0x020c }
            r14.mo13048a(r2)     // Catch:{ zzadu -> 0x020c }
        L_0x00fb:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            java.lang.String r14 = r14.f15289G     // Catch:{ zzadu -> 0x020c }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ zzadu -> 0x020c }
            if (r14 != 0) goto L_0x013b
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.aqm.f12743cC     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ zzadu -> 0x020c }
            java.lang.Object r14 = r2.mo12297a(r14)     // Catch:{ zzadu -> 0x020c }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ zzadu -> 0x020c }
            boolean r14 = r14.booleanValue()     // Catch:{ zzadu -> 0x020c }
            if (r14 == 0) goto L_0x013b
            java.lang.String r14 = "Received cookie from server. Setting webview cookie in CookieManager."
            com.google.android.gms.internal.ads.C3643iy.m19172b(r14)     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.jn r14 = com.google.android.gms.ads.internal.zzbv.zzem()     // Catch:{ zzadu -> 0x020c }
            android.content.Context r2 = r13.f13694e     // Catch:{ zzadu -> 0x020c }
            android.webkit.CookieManager r14 = r14.mo13160c(r2)     // Catch:{ zzadu -> 0x020c }
            if (r14 == 0) goto L_0x013b
            java.lang.String r2 = "googleads.g.doubleclick.net"
            com.google.android.gms.internal.ads.zzaej r3 = r13.f13699j     // Catch:{ zzadu -> 0x020c }
            java.lang.String r3 = r3.f15289G     // Catch:{ zzadu -> 0x020c }
            r14.setCookie(r2, r3)     // Catch:{ zzadu -> 0x020c }
            goto L_0x013b
        L_0x0132:
            com.google.android.gms.internal.ads.zzadu r14 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ zzadu -> 0x020c }
            java.lang.String r0 = "No fill from ad server."
            r1 = 3
            r14.<init>(r0, r1)     // Catch:{ zzadu -> 0x020c }
            throw r14     // Catch:{ zzadu -> 0x020c }
        L_0x013b:
            com.google.android.gms.internal.ads.zzaef r14 = r13.f13697h     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.zzjn r14 = r14.f15260d     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.zzjn[] r14 = r14.f15505g     // Catch:{ zzadu -> 0x020c }
            if (r14 == 0) goto L_0x014b
            com.google.android.gms.internal.ads.zzaef r14 = r13.f13697h     // Catch:{ zzadu -> 0x020c }
            com.google.android.gms.internal.ads.zzjn r14 = r13.m18256a(r14)     // Catch:{ zzadu -> 0x020c }
            r4 = r14
            goto L_0x014c
        L_0x014b:
            r4 = r0
        L_0x014c:
            com.google.android.gms.internal.ads.ii r14 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r14 = r14.mo13060l()
            com.google.android.gms.internal.ads.zzaej r2 = r13.f13699j
            boolean r2 = r2.f15327u
            r14.mo13103b(r2)
            com.google.android.gms.internal.ads.ii r14 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r14 = r14.mo13060l()
            com.google.android.gms.internal.ads.zzaej r2 = r13.f13699j
            boolean r2 = r2.f15295M
            r14.mo13107c(r2)
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j
            java.lang.String r14 = r14.f15323q
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0185
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x017f }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f13699j     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = r2.f15323q     // Catch:{ Exception -> 0x017f }
            r14.<init>(r2)     // Catch:{ Exception -> 0x017f }
            r10 = r14
            goto L_0x0186
        L_0x017f:
            r14 = move-exception
            java.lang.String r2 = "Error parsing the JSON for Active View."
            com.google.android.gms.internal.ads.C3643iy.m19173b(r2, r14)
        L_0x0185:
            r10 = r0
        L_0x0186:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j
            int r14 = r14.f15298P
            r2 = 2
            r3 = 1
            if (r14 != r2) goto L_0x01cd
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.zzaef r14 = r13.f13697h
            com.google.android.gms.internal.ads.zzjj r14 = r14.f15259c
            android.os.Bundle r2 = r14.f15493m
            if (r2 == 0) goto L_0x019d
            android.os.Bundle r14 = r14.f15493m
            goto L_0x01a2
        L_0x019d:
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
        L_0x01a2:
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()
            android.os.Bundle r2 = r14.getBundle(r2)
            if (r2 == 0) goto L_0x01b9
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()
            android.os.Bundle r14 = r14.getBundle(r2)
            goto L_0x01c8
        L_0x01b9:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r5 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r5 = r5.getName()
            r14.putBundle(r5, r2)
            r14 = r2
        L_0x01c8:
            java.lang.String r2 = "render_test_label"
            r14.putBoolean(r2, r3)
        L_0x01cd:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j
            int r14 = r14.f15298P
            if (r14 != r3) goto L_0x01d7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L_0x01d7:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f13699j
            int r14 = r14.f15298P
            if (r14 != 0) goto L_0x01eb
            com.google.android.gms.internal.ads.zzaef r14 = r13.f13697h
            com.google.android.gms.internal.ads.zzjj r14 = r14.f15259c
            boolean r14 = com.google.android.gms.internal.ads.C3711ll.m19090a(r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r12 = r14
            goto L_0x01ec
        L_0x01eb:
            r12 = r0
        L_0x01ec:
            com.google.android.gms.internal.ads.ie r14 = new com.google.android.gms.internal.ads.ie
            com.google.android.gms.internal.ads.zzaef r1 = r13.f13697h
            com.google.android.gms.internal.ads.zzaej r2 = r13.f13699j
            com.google.android.gms.internal.ads.bac r3 = r13.f13700k
            r5 = -2
            com.google.android.gms.internal.ads.zzaej r0 = r13.f13699j
            long r8 = r0.f15319m
            com.google.android.gms.internal.ads.akv r11 = r13.f13695f
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            com.google.android.gms.internal.ads.ck r0 = r13.f13691b
            r0.zza(r14)
        L_0x0204:
            android.os.Handler r14 = com.google.android.gms.internal.ads.C3653jh.f14275a
            java.lang.Runnable r0 = r13.f13698i
            r14.removeCallbacks(r0)
            return
        L_0x020c:
            r14 = move-exception
            int r0 = r14.getErrorCode()
            java.lang.String r14 = r14.getMessage()
            r13.m18258a(r0, r14)
            goto L_0x0204
        L_0x0219:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0219 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3467cl.mo12843a(com.google.android.gms.internal.ads.zzaej):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12844b(all all) {
        all.f12328a = this.f13692c.f13771v;
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
        synchronized (this.f13693d) {
            if (this.f13690a != null) {
                this.f13690a.mo11912b();
            }
        }
    }
}
