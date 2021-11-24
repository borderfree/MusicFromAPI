package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3659jn;
import com.google.android.gms.internal.ads.C3726m;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.C3861r;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import java.util.Collections;

@C3464ci
public class zzd extends C3861r implements zzw {

    /* renamed from: e */
    private static final int f10060e = Color.argb(0, 0, 0, 0);

    /* renamed from: a */
    protected final Activity f10061a;

    /* renamed from: b */
    AdOverlayInfoParcel f10062b;

    /* renamed from: c */
    C3832py f10063c;

    /* renamed from: d */
    int f10064d = 0;

    /* renamed from: f */
    private zzi f10065f;

    /* renamed from: g */
    private zzo f10066g;

    /* renamed from: h */
    private boolean f10067h = false;

    /* renamed from: i */
    private FrameLayout f10068i;

    /* renamed from: j */
    private CustomViewCallback f10069j;

    /* renamed from: k */
    private boolean f10070k = false;

    /* renamed from: l */
    private boolean f10071l = false;

    /* renamed from: m */
    private C2911c f10072m;

    /* renamed from: n */
    private boolean f10073n = false;

    /* renamed from: o */
    private final Object f10074o = new Object();

    /* renamed from: p */
    private Runnable f10075p;

    /* renamed from: q */
    private boolean f10076q;

    /* renamed from: r */
    private boolean f10077r;

    /* renamed from: s */
    private boolean f10078s = false;

    /* renamed from: t */
    private boolean f10079t = false;

    /* renamed from: u */
    private boolean f10080u = true;

    public zzd(Activity activity) {
        this.f10061a = activity;
    }

    /* renamed from: a */
    private final void m13589a(boolean z) {
        int intValue = ((Integer) ane.m16650f().mo12297a(aqm.f12820da)).intValue();
        C2914f fVar = new C2914f();
        fVar.f10057e = 50;
        fVar.f10053a = z ? intValue : 0;
        fVar.f10054b = z ? 0 : intValue;
        fVar.f10055c = 0;
        fVar.f10056d = intValue;
        this.f10066g = new zzo(this.f10061a, fVar, this);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.f10062b.zzbyr);
        this.f10072m.addView(this.f10066g, layoutParams);
    }

    /* renamed from: b */
    private final void m13590b() {
        if (this.f10061a.isFinishing() && !this.f10078s) {
            this.f10078s = true;
            if (this.f10063c != null) {
                this.f10063c.mo13482a(this.f10064d);
                synchronized (this.f10074o) {
                    if (!this.f10076q && this.f10063c.mo13476C()) {
                        this.f10075p = new C2910b(this);
                        C3653jh.f14275a.postDelayed(this.f10075p, ((Long) ane.m16650f().mo12297a(aqm.f12650aP)).longValue());
                        return;
                    }
                }
            }
            mo10063a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c6, code lost:
        if (r1.f10061a.getResources().getConfiguration().orientation == 1) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e7, code lost:
        if (r1.f10061a.getResources().getConfiguration().orientation == 2) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0134 A[SYNTHETIC, Splitter:B:59:0x0134] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0237  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13591b(boolean r19) {
        /*
            r18 = this;
            r1 = r18
            boolean r2 = r1.f10077r
            r3 = 1
            if (r2 != 0) goto L_0x000c
            android.app.Activity r2 = r1.f10061a
            r2.requestWindowFeature(r3)
        L_0x000c:
            android.app.Activity r2 = r1.f10061a
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L_0x0260
            boolean r4 = com.google.android.gms.common.util.C3309n.m15079k()
            if (r4 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aqm.f12765cY
            com.google.android.gms.internal.ads.aqk r5 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r4 = r5.mo12297a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0040
            com.google.android.gms.ads.internal.zzbv.zzek()
            android.app.Activity r4 = r1.f10061a
            android.app.Activity r5 = r1.f10061a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            boolean r4 = com.google.android.gms.internal.ads.C3653jh.m18882a(r4, r5)
            goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.f10062b
            com.google.android.gms.ads.internal.zzaq r5 = r5.zzbyw
            r6 = 0
            if (r5 == 0) goto L_0x0052
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.f10062b
            com.google.android.gms.ads.internal.zzaq r5 = r5.zzbyw
            boolean r5 = r5.zzzf
            if (r5 == 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            boolean r7 = r1.f10071l
            if (r7 == 0) goto L_0x0059
            if (r5 == 0) goto L_0x008f
        L_0x0059:
            if (r4 == 0) goto L_0x008f
            r4 = 1024(0x400, float:1.435E-42)
            r2.setFlags(r4, r4)
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aqm.f12651aQ
            com.google.android.gms.internal.ads.aqk r5 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r4 = r5.mo12297a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x008f
            boolean r4 = com.google.android.gms.common.util.C3309n.m15075g()
            if (r4 == 0) goto L_0x008f
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.f10062b
            com.google.android.gms.ads.internal.zzaq r4 = r4.zzbyw
            if (r4 == 0) goto L_0x008f
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.f10062b
            com.google.android.gms.ads.internal.zzaq r4 = r4.zzbyw
            boolean r4 = r4.zzzk
            if (r4 == 0) goto L_0x008f
            android.view.View r4 = r2.getDecorView()
            r5 = 4098(0x1002, float:5.743E-42)
            r4.setSystemUiVisibility(r5)
        L_0x008f:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.f10062b
            com.google.android.gms.internal.ads.py r4 = r4.zzbyo
            r5 = 0
            if (r4 == 0) goto L_0x009f
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.f10062b
            com.google.android.gms.internal.ads.py r4 = r4.zzbyo
            com.google.android.gms.internal.ads.rf r4 = r4.mo13527t()
            goto L_0x00a0
        L_0x009f:
            r4 = r5
        L_0x00a0:
            if (r4 == 0) goto L_0x00a7
            boolean r4 = r4.mo13552b()
            goto L_0x00a8
        L_0x00a7:
            r4 = 0
        L_0x00a8:
            r1.f10073n = r6
            if (r4 == 0) goto L_0x00ea
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r7 = r1.f10062b
            int r7 = r7.orientation
            com.google.android.gms.internal.ads.jn r8 = com.google.android.gms.ads.internal.zzbv.zzem()
            int r8 = r8.mo13143a()
            if (r7 != r8) goto L_0x00cc
            android.app.Activity r7 = r1.f10061a
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            if (r7 != r3) goto L_0x00c9
        L_0x00c8:
            r6 = 1
        L_0x00c9:
            r1.f10073n = r6
            goto L_0x00ea
        L_0x00cc:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r7 = r1.f10062b
            int r7 = r7.orientation
            com.google.android.gms.internal.ads.jn r8 = com.google.android.gms.ads.internal.zzbv.zzem()
            int r8 = r8.mo13156b()
            if (r7 != r8) goto L_0x00ea
            android.app.Activity r7 = r1.f10061a
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 != r8) goto L_0x00c9
            goto L_0x00c8
        L_0x00ea:
            boolean r6 = r1.f10073n
            r7 = 46
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Delay onShow to next orientation change: "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.google.android.gms.internal.ads.C3643iy.m19172b(r6)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.f10062b
            int r6 = r6.orientation
            r1.setRequestedOrientation(r6)
            com.google.android.gms.internal.ads.jn r6 = com.google.android.gms.ads.internal.zzbv.zzem()
            boolean r2 = r6.mo13155a(r2)
            if (r2 == 0) goto L_0x0118
            java.lang.String r2 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.internal.ads.C3643iy.m19172b(r2)
        L_0x0118:
            boolean r2 = r1.f10071l
            if (r2 != 0) goto L_0x0124
            com.google.android.gms.ads.internal.overlay.c r2 = r1.f10072m
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x0120:
            r2.setBackgroundColor(r6)
            goto L_0x0129
        L_0x0124:
            com.google.android.gms.ads.internal.overlay.c r2 = r1.f10072m
            int r6 = f10060e
            goto L_0x0120
        L_0x0129:
            android.app.Activity r2 = r1.f10061a
            com.google.android.gms.ads.internal.overlay.c r6 = r1.f10072m
            r2.setContentView(r6)
            r1.f10077r = r3
            if (r19 == 0) goto L_0x020a
            com.google.android.gms.ads.internal.zzbv.zzel()     // Catch:{ Exception -> 0x01fc }
            android.app.Activity r7 = r1.f10061a     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo     // Catch:{ Exception -> 0x01fc }
            if (r2 == 0) goto L_0x0149
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.internal.ads.rl r2 = r2.mo13519r()     // Catch:{ Exception -> 0x01fc }
            r8 = r2
            goto L_0x014a
        L_0x0149:
            r8 = r5
        L_0x014a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo     // Catch:{ Exception -> 0x01fc }
            if (r2 == 0) goto L_0x015a
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo     // Catch:{ Exception -> 0x01fc }
            java.lang.String r2 = r2.mo13520s()     // Catch:{ Exception -> 0x01fc }
            r9 = r2
            goto L_0x015b
        L_0x015a:
            r9 = r5
        L_0x015b:
            r10 = 1
            r12 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.internal.ads.zzang r13 = r2.zzacr     // Catch:{ Exception -> 0x01fc }
            r14 = 0
            r15 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo     // Catch:{ Exception -> 0x01fc }
            if (r2 == 0) goto L_0x0174
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.ads.internal.zzw r2 = r2.mo13412e()     // Catch:{ Exception -> 0x01fc }
            r16 = r2
            goto L_0x0176
        L_0x0174:
            r16 = r5
        L_0x0176:
            com.google.android.gms.internal.ads.akv r17 = com.google.android.gms.internal.ads.akv.m16455a()     // Catch:{ Exception -> 0x01fc }
            r11 = r4
            com.google.android.gms.internal.ads.py r2 = com.google.android.gms.internal.ads.C3840qf.m19490a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01fc }
            r1.f10063c = r2     // Catch:{ Exception -> 0x01fc }
            com.google.android.gms.internal.ads.py r2 = r1.f10063c
            com.google.android.gms.internal.ads.rf r6 = r2.mo13527t()
            r7 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            com.google.android.gms.ads.internal.gmsg.zzb r8 = r2.zzbyx
            r9 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            com.google.android.gms.ads.internal.gmsg.zzd r10 = r2.zzbyp
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            com.google.android.gms.ads.internal.overlay.zzt r11 = r2.zzbyt
            r12 = 1
            r13 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo
            if (r2 == 0) goto L_0x01a9
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo
            com.google.android.gms.internal.ads.rf r2 = r2.mo13527t()
            com.google.android.gms.ads.internal.zzx r5 = r2.mo13535a()
        L_0x01a9:
            r14 = r5
            r15 = 0
            r16 = 0
            r6.mo13540a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.ads.py r2 = r1.f10063c
            com.google.android.gms.internal.ads.rf r2 = r2.mo13527t()
            com.google.android.gms.ads.internal.overlay.a r5 = new com.google.android.gms.ads.internal.overlay.a
            r5.<init>(r1)
            r2.mo13541a(r5)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            java.lang.String r2 = r2.url
            if (r2 == 0) goto L_0x01ce
            com.google.android.gms.internal.ads.py r2 = r1.f10063c
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.f10062b
            java.lang.String r5 = r5.url
            r2.loadUrl(r5)
            goto L_0x01e6
        L_0x01ce:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            java.lang.String r2 = r2.zzbys
            if (r2 == 0) goto L_0x01f4
            com.google.android.gms.internal.ads.py r5 = r1.f10063c
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            java.lang.String r6 = r2.zzbyq
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            java.lang.String r7 = r2.zzbys
            java.lang.String r8 = "text/html"
            java.lang.String r9 = "UTF-8"
            r10 = 0
            r5.loadDataWithBaseURL(r6, r7, r8, r9, r10)
        L_0x01e6:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo
            if (r2 == 0) goto L_0x0217
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo
            r2.mo13491b(r1)
            goto L_0x0217
        L_0x01f4:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "No URL or HTML to display in ad overlay."
            r0.<init>(r2)
            throw r0
        L_0x01fc:
            r0 = move-exception
            java.lang.String r2 = "Error obtaining webview."
            com.google.android.gms.internal.ads.C3643iy.m19173b(r2, r0)
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "Could not obtain webview for the overlay."
            r0.<init>(r2)
            throw r0
        L_0x020a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.f10062b
            com.google.android.gms.internal.ads.py r2 = r2.zzbyo
            r1.f10063c = r2
            com.google.android.gms.internal.ads.py r2 = r1.f10063c
            android.app.Activity r5 = r1.f10061a
            r2.mo13483a(r5)
        L_0x0217:
            com.google.android.gms.internal.ads.py r2 = r1.f10063c
            r2.mo13484a(r1)
            com.google.android.gms.internal.ads.py r2 = r1.f10063c
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L_0x0233
            boolean r5 = r2 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0233
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            com.google.android.gms.internal.ads.py r5 = r1.f10063c
            android.view.View r5 = r5.getView()
            r2.removeView(r5)
        L_0x0233:
            boolean r2 = r1.f10071l
            if (r2 == 0) goto L_0x023c
            com.google.android.gms.internal.ads.py r2 = r1.f10063c
            r2.mo13480G()
        L_0x023c:
            com.google.android.gms.ads.internal.overlay.c r2 = r1.f10072m
            com.google.android.gms.internal.ads.py r5 = r1.f10063c
            android.view.View r5 = r5.getView()
            r6 = -1
            r2.addView(r5, r6, r6)
            if (r19 != 0) goto L_0x0251
            boolean r0 = r1.f10073n
            if (r0 != 0) goto L_0x0251
            r18.m13592c()
        L_0x0251:
            r1.m13589a(r4)
            com.google.android.gms.internal.ads.py r0 = r1.f10063c
            boolean r0 = r0.mo13529v()
            if (r0 == 0) goto L_0x025f
            r1.zza(r4, r3)
        L_0x025f:
            return
        L_0x0260:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "Invalid activity, no window available."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzd.m13591b(boolean):void");
    }

    /* renamed from: c */
    private final void m13592c() {
        this.f10063c.mo13511m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10063a() {
        if (!this.f10079t) {
            this.f10079t = true;
            if (this.f10063c != null) {
                this.f10072m.removeView(this.f10063c.getView());
                if (this.f10065f != null) {
                    this.f10063c.mo13483a(this.f10065f.zzrt);
                    this.f10063c.mo13493b(false);
                    this.f10065f.parent.addView(this.f10063c.getView(), this.f10065f.index, this.f10065f.zzbyi);
                    this.f10065f = null;
                } else if (this.f10061a.getApplicationContext() != null) {
                    this.f10063c.mo13483a(this.f10061a.getApplicationContext());
                }
                this.f10063c = null;
            }
            if (!(this.f10062b == null || this.f10062b.zzbyn == null)) {
                this.f10062b.zzbyn.zzcb();
            }
        }
    }

    public final void close() {
        this.f10064d = 2;
        this.f10061a.finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
        this.f10064d = 0;
    }

    public void onCreate(Bundle bundle) {
        this.f10061a.requestWindowFeature(1);
        this.f10070k = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.f10062b = AdOverlayInfoParcel.zzc(this.f10061a.getIntent());
            if (this.f10062b != null) {
                if (this.f10062b.zzacr.f15362c > 7500000) {
                    this.f10064d = 3;
                }
                if (this.f10061a.getIntent() != null) {
                    this.f10080u = this.f10061a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.f10062b.zzbyw != null) {
                    this.f10071l = this.f10062b.zzbyw.zzze;
                } else {
                    this.f10071l = false;
                }
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12705bR)).booleanValue() && this.f10071l && this.f10062b.zzbyw.zzzj != -1) {
                    new C2912d(this, null).mo13086h();
                }
                if (bundle == null) {
                    if (this.f10062b.zzbyn != null && this.f10080u) {
                        this.f10062b.zzbyn.zzcc();
                    }
                    if (!(this.f10062b.zzbyu == 1 || this.f10062b.zzbym == null)) {
                        this.f10062b.zzbym.onAdClicked();
                    }
                }
                this.f10072m = new C2911c(this.f10061a, this.f10062b.zzbyv, this.f10062b.zzacr.f15360a);
                this.f10072m.setId(1000);
                switch (this.f10062b.zzbyu) {
                    case 1:
                        m13591b(false);
                        return;
                    case 2:
                        this.f10065f = new zzi(this.f10062b.zzbyo);
                        m13591b(false);
                        return;
                    case 3:
                        m13591b(true);
                        return;
                    default:
                        throw new zzg("Could not determine ad overlay type.");
                }
            } else {
                throw new zzg("Could not get info for ad overlay.");
            }
        } catch (zzg e) {
            C3643iy.m19178e(e.getMessage());
            this.f10064d = 3;
            this.f10061a.finish();
        }
    }

    public final void onDestroy() {
        if (this.f10063c != null) {
            this.f10072m.removeView(this.f10063c.getView());
        }
        m13590b();
    }

    public final void onPause() {
        zznh();
        if (this.f10062b.zzbyn != null) {
            this.f10062b.zzbyn.onPause();
        }
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12766cZ)).booleanValue() && this.f10063c != null && (!this.f10061a.isFinishing() || this.f10065f == null)) {
            zzbv.zzem();
            C3659jn.m18932a(this.f10063c);
        }
        m13590b();
    }

    public final void onRestart() {
    }

    public final void onResume() {
        if (this.f10062b.zzbyn != null) {
            this.f10062b.zzbyn.onResume();
        }
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12766cZ)).booleanValue()) {
            if (this.f10063c == null || this.f10063c.mo13532y()) {
                C3643iy.m19178e("The webview does not exist. Ignoring action.");
            } else {
                zzbv.zzem();
                C3659jn.m18933b(this.f10063c);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f10070k);
    }

    public final void onStart() {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12766cZ)).booleanValue()) {
            if (this.f10063c == null || this.f10063c.mo13532y()) {
                C3643iy.m19178e("The webview does not exist. Ignoring action.");
            } else {
                zzbv.zzem();
                C3659jn.m18933b(this.f10063c);
            }
        }
    }

    public final void onStop() {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12766cZ)).booleanValue() && this.f10063c != null && (!this.f10061a.isFinishing() || this.f10065f == null)) {
            zzbv.zzem();
            C3659jn.m18932a(this.f10063c);
        }
        m13590b();
    }

    public final void setRequestedOrientation(int i) {
        if (this.f10061a.getApplicationInfo().targetSdkVersion >= ((Integer) ane.m16650f().mo12297a(aqm.f12833dn)).intValue()) {
            if (this.f10061a.getApplicationInfo().targetSdkVersion <= ((Integer) ane.m16650f().mo12297a(aqm.f12834do)).intValue()) {
                if (VERSION.SDK_INT >= ((Integer) ane.m16650f().mo12297a(aqm.f12835dp)).intValue()) {
                    if (VERSION.SDK_INT <= ((Integer) ane.m16650f().mo12297a(aqm.f12836dq)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.f10061a.setRequestedOrientation(i);
    }

    public final void zza(View view, CustomViewCallback customViewCallback) {
        this.f10068i = new FrameLayout(this.f10061a);
        this.f10068i.setBackgroundColor(-16777216);
        this.f10068i.addView(view, -1, -1);
        this.f10061a.setContentView(this.f10068i);
        this.f10077r = true;
        this.f10069j = customViewCallback;
        this.f10067h = true;
    }

    public final void zza(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = ((Boolean) ane.m16650f().mo12297a(aqm.f12652aR)).booleanValue() && this.f10062b != null && this.f10062b.zzbyw != null && this.f10062b.zzbyw.zzzl;
        boolean z5 = ((Boolean) ane.m16650f().mo12297a(aqm.f12653aS)).booleanValue() && this.f10062b != null && this.f10062b.zzbyw != null && this.f10062b.zzbyw.zzzm;
        if (z && z2 && z4 && !z5) {
            new C3726m(this.f10063c, "useCustomClose").mo13247a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.f10066g != null) {
            zzo zzo = this.f10066g;
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzo.zzu(z3);
        }
    }

    public final void zzax() {
        this.f10077r = true;
    }

    public final void zznh() {
        if (this.f10062b != null && this.f10067h) {
            setRequestedOrientation(this.f10062b.orientation);
        }
        if (this.f10068i != null) {
            this.f10061a.setContentView(this.f10072m);
            this.f10077r = true;
            this.f10068i.removeAllViews();
            this.f10068i = null;
        }
        if (this.f10069j != null) {
            this.f10069j.onCustomViewHidden();
            this.f10069j = null;
        }
        this.f10067h = false;
    }

    public final void zzni() {
        this.f10064d = 1;
        this.f10061a.finish();
    }

    public final boolean zznj() {
        this.f10064d = 0;
        if (this.f10063c == null) {
            return true;
        }
        boolean A = this.f10063c.mo13474A();
        if (!A) {
            this.f10063c.mo12588a("onbackblocked", Collections.emptyMap());
        }
        return A;
    }

    public final void zznk() {
        this.f10072m.removeView(this.f10066g);
        m13589a(true);
    }

    public final void zznn() {
        if (this.f10073n) {
            this.f10073n = false;
            m13592c();
        }
    }

    public final void zznp() {
        this.f10072m.f10048a = true;
    }

    public final void zznq() {
        synchronized (this.f10074o) {
            this.f10076q = true;
            if (this.f10075p != null) {
                C3653jh.f14275a.removeCallbacks(this.f10075p);
                C3653jh.f14275a.post(this.f10075p);
            }
        }
    }

    public final void zzo(C3323b bVar) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12765cY)).booleanValue() && C3309n.m15079k()) {
            Configuration configuration = (Configuration) C3327d.m15137a(bVar);
            zzbv.zzek();
            if (C3653jh.m18882a(this.f10061a, configuration)) {
                this.f10061a.getWindow().addFlags(1024);
                this.f10061a.getWindow().clearFlags(2048);
                return;
            }
            this.f10061a.getWindow().addFlags(2048);
            this.f10061a.getWindow().clearFlags(1024);
        }
    }
}
