package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3467cl;
import com.google.android.gms.internal.ads.C3488df;
import com.google.android.gms.internal.ads.C3506dw;
import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3626ih;
import com.google.android.gms.internal.ads.C3638it;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3659jn;
import com.google.android.gms.internal.ads.C3758ne;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.ajo;
import com.google.android.gms.internal.ads.akz;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.aqz;
import com.google.android.gms.internal.ads.atu;
import com.google.android.gms.internal.ads.auf;
import com.google.android.gms.internal.ads.bad;
import com.google.android.gms.internal.ads.bal;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzhu.zza.zzb;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public abstract class zzd extends zza implements zzn, zzbo, bad {

    /* renamed from: j */
    protected final bas f10283j;

    /* renamed from: k */
    private transient boolean f10284k;

    public zzd(Context context, zzjn zzjn, String str, bas bas, zzang zzang, zzw zzw) {
        this(new zzbw(context, zzjn, str, zzang), bas, null, zzw);
    }

    private zzd(zzbw zzbw, bas bas, zzbl zzbl, zzw zzw) {
        super(zzbw, null, zzw);
        this.f10283j = bas;
        this.f10284k = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C3488df m13689a(com.google.android.gms.internal.ads.zzjj r55, android.os.Bundle r56, com.google.android.gms.internal.ads.C3626ih r57, int r58) {
        /*
            r54 = this;
            r0 = r54
            com.google.android.gms.ads.internal.zzbw r1 = r0.f10120e
            android.content.Context r1 = r1.zzrt
            android.content.pm.ApplicationInfo r7 = r1.getApplicationInfo()
            r1 = 0
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e     // Catch:{ NameNotFoundException -> 0x001b }
            android.content.Context r2 = r2.zzrt     // Catch:{ NameNotFoundException -> 0x001b }
            com.google.android.gms.common.d.b r2 = com.google.android.gms.common.p123d.C3181c.m14658a(r2)     // Catch:{ NameNotFoundException -> 0x001b }
            java.lang.String r4 = r7.packageName     // Catch:{ NameNotFoundException -> 0x001b }
            android.content.pm.PackageInfo r2 = r2.mo11129b(r4, r1)     // Catch:{ NameNotFoundException -> 0x001b }
            r8 = r2
            goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e
            android.content.Context r2 = r2.zzrt
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r4 = r2.getDisplayMetrics()
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e
            com.google.android.gms.ads.internal.zzbx r2 = r2.f10256c
            if (r2 == 0) goto L_0x0094
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e
            com.google.android.gms.ads.internal.zzbx r2 = r2.f10256c
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L_0x0094
            r2 = 2
            int[] r2 = new int[r2]
            com.google.android.gms.ads.internal.zzbw r5 = r0.f10120e
            com.google.android.gms.ads.internal.zzbx r5 = r5.f10256c
            r5.getLocationOnScreen(r2)
            r5 = r2[r1]
            r6 = 1
            r2 = r2[r6]
            com.google.android.gms.ads.internal.zzbw r9 = r0.f10120e
            com.google.android.gms.ads.internal.zzbx r9 = r9.f10256c
            int r9 = r9.getWidth()
            com.google.android.gms.ads.internal.zzbw r10 = r0.f10120e
            com.google.android.gms.ads.internal.zzbx r10 = r10.f10256c
            int r10 = r10.getHeight()
            com.google.android.gms.ads.internal.zzbw r11 = r0.f10120e
            com.google.android.gms.ads.internal.zzbx r11 = r11.f10256c
            boolean r11 = r11.isShown()
            if (r11 == 0) goto L_0x0072
            int r11 = r5 + r9
            if (r11 <= 0) goto L_0x0072
            int r11 = r2 + r10
            if (r11 <= 0) goto L_0x0072
            int r11 = r4.widthPixels
            if (r5 > r11) goto L_0x0072
            int r11 = r4.heightPixels
            if (r2 > r11) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            android.os.Bundle r11 = new android.os.Bundle
            r12 = 5
            r11.<init>(r12)
            java.lang.String r12 = "x"
            r11.putInt(r12, r5)
            java.lang.String r5 = "y"
            r11.putInt(r5, r2)
            java.lang.String r2 = "width"
            r11.putInt(r2, r9)
            java.lang.String r2 = "height"
            r11.putInt(r2, r10)
            java.lang.String r2 = "visible"
            r11.putInt(r2, r6)
            r9 = r11
            goto L_0x0095
        L_0x0094:
            r9 = 0
        L_0x0095:
            com.google.android.gms.internal.ads.ii r2 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ip r2 = r2.mo13043a()
            java.lang.String r12 = r2.mo13073a()
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e
            com.google.android.gms.internal.ads.if r5 = new com.google.android.gms.internal.ads.if
            com.google.android.gms.ads.internal.zzbw r6 = r0.f10120e
            java.lang.String r6 = r6.zzacp
            r5.<init>(r12, r6)
            r2.zzacy = r5
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e
            com.google.android.gms.internal.ads.if r2 = r2.zzacy
            r14 = r55
            r2.mo13026a(r14)
            com.google.android.gms.ads.internal.zzbv.zzek()
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e
            android.content.Context r2 = r2.zzrt
            com.google.android.gms.ads.internal.zzbw r5 = r0.f10120e
            com.google.android.gms.ads.internal.zzbx r5 = r5.f10256c
            com.google.android.gms.ads.internal.zzbw r6 = r0.f10120e
            com.google.android.gms.internal.ads.zzjn r6 = r6.zzacv
            java.lang.String r20 = com.google.android.gms.internal.ads.C3653jh.m18866a(r2, r5, r6)
            r5 = 0
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e
            com.google.android.gms.internal.ads.aok r2 = r2.f10261h
            if (r2 == 0) goto L_0x00e2
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e     // Catch:{ RemoteException -> 0x00dd }
            com.google.android.gms.internal.ads.aok r2 = r2.f10261h     // Catch:{ RemoteException -> 0x00dd }
            long r10 = r2.mo12121b()     // Catch:{ RemoteException -> 0x00dd }
            r21 = r10
            goto L_0x00e4
        L_0x00dd:
            java.lang.String r2 = "Cannot get correlation id, default to 0."
            com.google.android.gms.internal.ads.C3643iy.m19178e(r2)
        L_0x00e2:
            r21 = r5
        L_0x00e4:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r23 = r2.toString()
            com.google.android.gms.internal.ads.ir r2 = com.google.android.gms.ads.internal.zzbv.zzep()
            com.google.android.gms.ads.internal.zzbw r5 = r0.f10120e
            android.content.Context r5 = r5.zzrt
            android.os.Bundle r15 = r2.mo13079a(r5, r0, r12)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r2 = 0
        L_0x0103:
            com.google.android.gms.ads.internal.zzbw r5 = r0.f10120e
            android.support.v4.g.m<java.lang.String, com.google.android.gms.internal.ads.aui> r5 = r5.f10266m
            int r5 = r5.size()
            if (r2 >= r5) goto L_0x0134
            com.google.android.gms.ads.internal.zzbw r5 = r0.f10120e
            android.support.v4.g.m<java.lang.String, com.google.android.gms.internal.ads.aui> r5 = r5.f10266m
            java.lang.Object r5 = r5.mo2010b(r2)
            java.lang.String r5 = (java.lang.String) r5
            r13.add(r5)
            com.google.android.gms.ads.internal.zzbw r6 = r0.f10120e
            android.support.v4.g.m<java.lang.String, com.google.android.gms.internal.ads.auf> r6 = r6.f10265l
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0131
            com.google.android.gms.ads.internal.zzbw r6 = r0.f10120e
            android.support.v4.g.m<java.lang.String, com.google.android.gms.internal.ads.auf> r6 = r6.f10265l
            java.lang.Object r6 = r6.get(r5)
            if (r6 == 0) goto L_0x0131
            r11.add(r5)
        L_0x0131:
            int r2 = r2 + 1
            goto L_0x0103
        L_0x0134:
            com.google.android.gms.ads.internal.ai r2 = new com.google.android.gms.ads.internal.ai
            r2.<init>(r0)
            com.google.android.gms.internal.ads.my r34 = com.google.android.gms.internal.ads.C3651jf.m18856a(r2)
            com.google.android.gms.ads.internal.aj r2 = new com.google.android.gms.ads.internal.aj
            r2.<init>(r0)
            com.google.android.gms.internal.ads.my r44 = com.google.android.gms.internal.ads.C3651jf.m18856a(r2)
            if (r57 == 0) goto L_0x014f
            java.lang.String r2 = r57.mo13039c()
            r35 = r2
            goto L_0x0151
        L_0x014f:
            r35 = 0
        L_0x0151:
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e
            java.util.List<java.lang.String> r2 = r2.f10275v
            if (r2 == 0) goto L_0x01a9
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e
            java.util.List<java.lang.String> r2 = r2.f10275v
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x01a9
            if (r8 == 0) goto L_0x0165
            int r1 = r8.versionCode
        L_0x0165:
            com.google.android.gms.internal.ads.ii r2 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r2 = r2.mo13060l()
            int r2 = r2.mo13115g()
            if (r1 <= r2) goto L_0x018a
            com.google.android.gms.internal.ads.ii r2 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r2 = r2.mo13060l()
            r2.mo13121m()
            com.google.android.gms.internal.ads.ii r2 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r2 = r2.mo13060l()
            r2.mo13092a(r1)
            goto L_0x01a9
        L_0x018a:
            com.google.android.gms.internal.ads.ii r1 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r1 = r1.mo13060l()
            org.json.JSONObject r1 = r1.mo13120l()
            if (r1 == 0) goto L_0x01a9
            com.google.android.gms.ads.internal.zzbw r2 = r0.f10120e
            java.lang.String r2 = r2.zzacp
            org.json.JSONArray r1 = r1.optJSONArray(r2)
            if (r1 == 0) goto L_0x01a9
            java.lang.String r1 = r1.toString()
            r46 = r1
            goto L_0x01ab
        L_0x01a9:
            r46 = 0
        L_0x01ab:
            com.google.android.gms.internal.ads.df r1 = new com.google.android.gms.internal.ads.df
            r2 = r1
            com.google.android.gms.ads.internal.zzbw r5 = r0.f10120e
            com.google.android.gms.internal.ads.zzjn r5 = r5.zzacv
            com.google.android.gms.ads.internal.zzbw r6 = r0.f10120e
            java.lang.String r6 = r6.zzacp
            java.lang.String r10 = com.google.android.gms.internal.ads.ane.m16647c()
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            com.google.android.gms.internal.ads.zzang r3 = r3.zzacr
            r47 = r11
            r11 = r3
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            java.util.List<java.lang.String> r3 = r3.f10275v
            r48 = r13
            r13 = r3
            com.google.android.gms.internal.ads.ii r3 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r3 = r3.mo13060l()
            boolean r16 = r3.mo13099a()
            int r3 = r4.widthPixels
            r17 = r3
            int r3 = r4.heightPixels
            r18 = r3
            float r3 = r4.density
            r19 = r3
            java.util.List r24 = com.google.android.gms.internal.ads.aqm.m16919a()
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            java.lang.String r3 = r3.f10254a
            r25 = r3
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            com.google.android.gms.internal.ads.zzpl r3 = r3.f10267n
            r26 = r3
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            java.lang.String r27 = r3.zzfq()
            com.google.android.gms.internal.ads.jz r3 = com.google.android.gms.ads.internal.zzbv.zzfj()
            float r28 = r3.mo13166a()
            com.google.android.gms.internal.ads.jz r3 = com.google.android.gms.ads.internal.zzbv.zzfj()
            boolean r29 = r3.mo13169b()
            com.google.android.gms.ads.internal.zzbv.zzek()
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            android.content.Context r3 = r3.zzrt
            int r30 = com.google.android.gms.internal.ads.C3653jh.m18908i(r3)
            com.google.android.gms.ads.internal.zzbv.zzek()
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            com.google.android.gms.ads.internal.zzbx r3 = r3.f10256c
            int r31 = com.google.android.gms.internal.ads.C3653jh.m18898d(r3)
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            android.content.Context r3 = r3.zzrt
            boolean r3 = r3 instanceof android.app.Activity
            r32 = r3
            com.google.android.gms.internal.ads.ii r3 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r3 = r3.mo13060l()
            boolean r33 = r3.mo13114f()
            com.google.android.gms.internal.ads.ii r3 = com.google.android.gms.ads.internal.zzbv.zzeo()
            boolean r36 = r3.mo13052d()
            com.google.android.gms.internal.ads.pi r3 = com.google.android.gms.ads.internal.zzbv.zzff()
            int r37 = r3.mo13443a()
            com.google.android.gms.ads.internal.zzbv.zzek()
            android.os.Bundle r38 = com.google.android.gms.internal.ads.C3653jh.m18893c()
            com.google.android.gms.internal.ads.ki r3 = com.google.android.gms.ads.internal.zzbv.zzeu()
            java.lang.String r39 = r3.mo13192a()
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            com.google.android.gms.internal.ads.zzlu r3 = r3.f10269p
            r40 = r3
            com.google.android.gms.internal.ads.ki r3 = com.google.android.gms.ads.internal.zzbv.zzeu()
            boolean r41 = r3.mo13196b()
            com.google.android.gms.internal.ads.axd r3 = com.google.android.gms.internal.ads.axd.m17586a()
            android.os.Bundle r42 = r3.mo12586j()
            com.google.android.gms.internal.ads.ii r3 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.ja r3 = r3.mo13060l()
            com.google.android.gms.ads.internal.zzbw r4 = r0.f10120e
            java.lang.String r4 = r4.zzacp
            boolean r43 = r3.mo13112e(r4)
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            java.util.List<java.lang.Integer> r3 = r3.f10271r
            r45 = r3
            com.google.android.gms.ads.internal.zzbw r3 = r0.f10120e
            android.content.Context r3 = r3.zzrt
            com.google.android.gms.common.d.b r3 = com.google.android.gms.common.p123d.C3181c.m14658a(r3)
            boolean r49 = r3.mo11126a()
            com.google.android.gms.internal.ads.ii r3 = com.google.android.gms.ads.internal.zzbv.zzeo()
            boolean r50 = r3.mo13053e()
            com.google.android.gms.ads.internal.zzbv.zzem()
            boolean r51 = com.google.android.gms.internal.ads.C3659jn.m18934e()
            com.google.android.gms.internal.ads.ii r3 = com.google.android.gms.ads.internal.zzbv.zzeo()
            com.google.android.gms.internal.ads.my r3 = r3.mo13062n()
            r53 = r1
            r0 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r14 = 0
            java.lang.Object r0 = com.google.android.gms.internal.ads.C3740mn.m19197a(r3, r14, r0, r4)
            r52 = r0
            java.util.ArrayList r52 = (java.util.ArrayList) r52
            r3 = r9
            r4 = r55
            r9 = r12
            r12 = r15
            r14 = r48
            r15 = r56
            r48 = r58
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return r53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzd.m13689a(com.google.android.gms.internal.ads.zzjj, android.os.Bundle, com.google.android.gms.internal.ads.ih, int):com.google.android.gms.internal.ads.df");
    }

    /* renamed from: b */
    static String m13690b(C3622id idVar) {
        if (idVar == null) {
            return null;
        }
        String str = idVar.f14150q;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && idVar.f14148o != null) {
            try {
                return new JSONObject(idVar.f14148o.f13412k).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10273a(C3622id idVar, boolean z) {
        if (idVar == null) {
            C3643iy.m19178e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (idVar == null) {
            C3643iy.m19178e("Ad state was null when trying to ping impression URLs.");
        } else {
            C3643iy.m19172b("Pinging Impression URLs.");
            if (this.f10120e.zzacy != null) {
                this.f10120e.zzacy.mo13024a();
            }
            idVar.f14125K.mo12082a(zzb.AD_IMPRESSION);
            if (idVar.f14138e != null && !idVar.f14118D) {
                zzbv.zzek();
                C3653jh.m18876a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, mo10114b(idVar.f14138e));
                idVar.f14118D = true;
            }
        }
        if (!idVar.f14120F || z) {
            if (!(idVar.f14151r == null || idVar.f14151r.f13426d == null)) {
                zzbv.zzfd();
                bal.m17780a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, idVar, this.f10120e.zzacp, z, mo10114b(idVar.f14151r.f13426d));
            }
            if (!(idVar.f14148o == null || idVar.f14148o.f13408g == null)) {
                zzbv.zzfd();
                bal.m17780a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, idVar, this.f10120e.zzacp, z, idVar.f14148o.f13408g);
            }
            idVar.f14120F = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo10113a(C3622id idVar) {
        zzjj zzjj;
        boolean z = false;
        if (this.f10121f != null) {
            zzjj = this.f10121f;
            this.f10121f = null;
        } else {
            zzjj = idVar.f14134a;
            if (zzjj.f15483c != null) {
                z = zzjj.f15483c.getBoolean("_noRefresh", false);
            }
        }
        return mo10194a(zzjj, idVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo10194a(zzjj zzjj, C3622id idVar, boolean z) {
        zzbl zzbl;
        long j;
        if (!z && this.f10120e.zzfo()) {
            if (idVar.f14142i > 0) {
                zzbl = this.f10119d;
                j = idVar.f14142i;
            } else if (idVar.f14151r != null && idVar.f14151r.f13432j > 0) {
                zzbl = this.f10119d;
                j = idVar.f14151r.f13432j;
            } else if (!idVar.f14147n && idVar.f14137d == 2) {
                this.f10119d.zzg(zzjj);
            }
            zzbl.zza(zzjj, j);
        }
        return this.f10119d.zzdz();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10274b(C3622id idVar, boolean z) {
        if (idVar != null) {
            if (!(idVar == null || idVar.f14139f == null || idVar.f14119E)) {
                zzbv.zzek();
                C3653jh.m18876a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, mo10107a(idVar.f14139f));
                idVar.f14119E = true;
            }
            if (!idVar.f14121G || z) {
                if (!(idVar.f14151r == null || idVar.f14151r.f13427e == null)) {
                    zzbv.zzfd();
                    bal.m17780a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, idVar, this.f10120e.zzacp, z, mo10107a(idVar.f14151r.f13427e));
                }
                if (!(idVar.f14148o == null || idVar.f14148o.f13409h == null)) {
                    zzbv.zzfd();
                    bal.m17780a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, idVar, this.f10120e.zzacp, z, idVar.f14148o.f13409h);
                }
                idVar.f14121G = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo10115b(zzjj zzjj) {
        return super.mo10115b(zzjj) && !this.f10284k;
    }

    public final String getMediationAdapterClassName() {
        if (this.f10120e.zzacw == null) {
            return null;
        }
        return this.f10120e.zzacw.f14150q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo10275k() {
        zzbv.zzek();
        if (C3653jh.m18884a(this.f10120e.zzrt, "android.permission.INTERNET")) {
            zzbv.zzek();
            if (C3653jh.m18883a(this.f10120e.zzrt)) {
                return true;
            }
        }
        return false;
    }

    public void onAdClicked() {
        if (this.f10120e.zzacw == null) {
            C3643iy.m19178e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.f10120e.zzacw.f14151r == null || this.f10120e.zzacw.f14151r.f13425c == null)) {
            zzbv.zzfd();
            bal.m17780a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, this.f10120e.zzacw, this.f10120e.zzacp, false, mo10114b(this.f10120e.zzacw.f14151r.f13425c));
        }
        if (!(this.f10120e.zzacw.f14148o == null || this.f10120e.zzacw.f14148o.f13407f == null)) {
            zzbv.zzfd();
            bal.m17780a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, this.f10120e.zzacw, this.f10120e.zzacp, false, this.f10120e.zzacw.f14148o.f13407f);
        }
        super.onAdClicked();
    }

    public final void onPause() {
        this.f10122g.mo11945c(this.f10120e.zzacw);
    }

    public final void onResume() {
        this.f10122g.mo11946d(this.f10120e.zzacw);
    }

    public void pause() {
        C3266s.m14922b("pause must be called on the main UI thread.");
        if (!(this.f10120e.zzacw == null || this.f10120e.zzacw.f14135b == null || !this.f10120e.zzfo())) {
            zzbv.zzem();
            C3659jn.m18932a(this.f10120e.zzacw.f14135b);
        }
        if (!(this.f10120e.zzacw == null || this.f10120e.zzacw.f14149p == null)) {
            try {
                this.f10120e.zzacw.f14149p.mo12699d();
            } catch (RemoteException unused) {
                C3643iy.m19178e("Could not pause mediation adapter.");
            }
        }
        this.f10122g.mo11945c(this.f10120e.zzacw);
        this.f10119d.pause();
    }

    public final void recordImpression() {
        mo10273a(this.f10120e.zzacw, false);
    }

    public void resume() {
        C3266s.m14922b("resume must be called on the main UI thread.");
        C3832py pyVar = (this.f10120e.zzacw == null || this.f10120e.zzacw.f14135b == null) ? null : this.f10120e.zzacw.f14135b;
        if (pyVar != null && this.f10120e.zzfo()) {
            zzbv.zzem();
            C3659jn.m18933b(this.f10120e.zzacw.f14135b);
        }
        if (!(this.f10120e.zzacw == null || this.f10120e.zzacw.f14149p == null)) {
            try {
                this.f10120e.zzacw.f14149p.mo12700e();
            } catch (RemoteException unused) {
                C3643iy.m19178e("Could not resume mediation adapter.");
            }
        }
        if (pyVar == null || !pyVar.mo13475B()) {
            this.f10119d.resume();
        }
        this.f10122g.mo11946d(this.f10120e.zzacw);
    }

    public void showInterstitial() {
        C3643iy.m19178e("showInterstitial is not supported for current ad type");
    }

    public final void zza(atu atu, String str) {
        Object obj;
        auf auf = null;
        if (atu != null) {
            try {
                obj = atu.mo12372l();
            } catch (RemoteException e) {
                C3643iy.m19175c("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            obj = null;
        }
        if (!(this.f10120e.f10265l == null || obj == null)) {
            auf = (auf) this.f10120e.f10265l.get(obj);
        }
        if (auf == null) {
            C3643iy.m19178e("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            auf.mo12513a(atu, str);
        }
    }

    public final boolean zza(C3488df dfVar, aqz aqz) {
        this.f10116a = aqz;
        aqz.mo12322a("seq_num", dfVar.f13756g);
        aqz.mo12322a("request_id", dfVar.f13771v);
        aqz.mo12322a("session_id", dfVar.f13757h);
        if (dfVar.f13755f != null) {
            aqz.mo12322a("app_version", String.valueOf(dfVar.f13755f.versionCode));
        }
        zzbw zzbw = this.f10120e;
        zzbv.zzeg();
        Context context = this.f10120e.zzrt;
        akz akz = this.f10124i.zzxb;
        C3638it dwVar = dfVar.f13751b.f15483c.getBundle("sdk_less_server_data") != null ? new C3506dw(context, dfVar, this, akz) : new C3467cl(context, dfVar, this, akz);
        dwVar.mo13086h();
        zzbw.zzact = dwVar;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean zza(C3622id idVar, C3622id idVar2) {
        int i;
        if (!(idVar == null || idVar.f14152s == null)) {
            idVar.f14152s.mo12661a((bad) null);
        }
        if (idVar2.f14152s != null) {
            idVar2.f14152s.mo12661a((bad) this);
        }
        int i2 = 0;
        if (idVar2.f14151r != null) {
            i2 = idVar2.f14151r.f13440r;
            i = idVar2.f14151r.f13441s;
        } else {
            i = 0;
        }
        this.f10120e.zzadt.mo13075a(i2, i);
        return true;
    }

    public boolean zza(zzjj zzjj, aqz aqz) {
        return zza(zzjj, aqz, 1);
    }

    public final boolean zza(zzjj zzjj, aqz aqz, int i) {
        C3626ih ihVar;
        if (!mo10275k()) {
            return false;
        }
        zzbv.zzek();
        ajo a = zzbv.zzeo().mo13042a(this.f10120e.zzrt);
        String str = null;
        Bundle a2 = a == null ? null : C3653jh.m18860a(a);
        this.f10119d.cancel();
        this.f10120e.zzadv = 0;
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12785cs)).booleanValue()) {
            ihVar = zzbv.zzeo().mo13060l().mo13116h();
            zzad zzes = zzbv.zzes();
            Context context = this.f10120e.zzrt;
            zzang zzang = this.f10120e.zzacr;
            String str2 = this.f10120e.zzacp;
            if (ihVar != null) {
                str = ihVar.mo13040d();
            }
            zzes.mo10166a(context, zzang, false, ihVar, str, str2, null);
        } else {
            ihVar = null;
        }
        return zza(m13689a(zzjj, a2, ihVar, i), aqz);
    }

    public final void zzb(C3622id idVar) {
        super.zzb(idVar);
        if (idVar.f14148o != null) {
            C3643iy.m19172b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.f10120e.f10256c != null) {
                this.f10120e.f10256c.zzfu();
            }
            C3643iy.m19172b("Pinging network fill URLs.");
            zzbv.zzfd();
            bal.m17780a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, idVar, this.f10120e.zzacp, false, idVar.f14148o.f13411j);
            if (!(idVar.f14151r == null || idVar.f14151r.f13429g == null || idVar.f14151r.f13429g.size() <= 0)) {
                C3643iy.m19172b("Pinging urls remotely");
                zzbv.zzek().mo13128a(this.f10120e.zzrt, idVar.f14151r.f13429g);
            }
        } else {
            C3643iy.m19172b("Enable the debug gesture detector on the admob ad frame.");
            if (this.f10120e.f10256c != null) {
                this.f10120e.f10256c.zzft();
            }
        }
        if (idVar.f14137d == 3 && idVar.f14151r != null && idVar.f14151r.f13428f != null) {
            C3643iy.m19172b("Pinging no fill URLs.");
            zzbv.zzfd();
            bal.m17780a(this.f10120e.zzrt, this.f10120e.zzacr.f15360a, idVar, this.f10120e.zzacp, false, idVar.f14151r.f13428f);
        }
    }

    public final void zzb(String str, String str2) {
        onAppEvent(str, str2);
    }

    public void zzcb() {
        this.f10284k = false;
        mo10124k_();
        this.f10120e.zzacy.mo13031c();
    }

    public void zzcc() {
        this.f10284k = true;
        mo10126n_();
    }

    public void zzcd() {
        C3643iy.m19178e("Mediated ad does not support onVideoEnd callback");
    }

    public void zzce() {
        onAdClicked();
    }

    public final void zzcf() {
        zzcb();
    }

    public final void zzcg() {
        mo10125m_();
    }

    public final void zzch() {
        zzcc();
    }

    public final void zzci() {
        if (this.f10120e.zzacw != null) {
            String str = this.f10120e.zzacw.f14150q;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            C3643iy.m19178e(sb.toString());
        }
        mo10273a(this.f10120e.zzacw, true);
        mo10274b(this.f10120e.zzacw, true);
        mo10116d();
    }

    public void zzcj() {
        recordImpression();
    }

    public final String zzck() {
        if (this.f10120e.zzacw == null) {
            return null;
        }
        return m13690b(this.f10120e.zzacw);
    }

    public final void zzcl() {
        Executor executor = C3758ne.f14481a;
        zzbl zzbl = this.f10119d;
        zzbl.getClass();
        executor.execute(C2858ag.m13542a(zzbl));
    }

    public final void zzcm() {
        Executor executor = C3758ne.f14481a;
        zzbl zzbl = this.f10119d;
        zzbl.getClass();
        executor.execute(C2859ah.m13543a(zzbl));
    }
}
