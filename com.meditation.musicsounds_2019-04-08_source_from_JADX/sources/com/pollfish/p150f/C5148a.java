package com.pollfish.p150f;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.pollfish.constants.Position;
import com.pollfish.interfaces.C5174a.C5175a;
import com.pollfish.interfaces.C5174a.C5176b;
import com.pollfish.interfaces.C5174a.C5177c;
import com.pollfish.interfaces.C5174a.C5178d;
import com.pollfish.interfaces.C5174a.C5179e;
import com.pollfish.interfaces.C5174a.C5180f;
import com.pollfish.interfaces.PollfishClosedListener;
import com.pollfish.interfaces.PollfishOpenedListener;
import com.pollfish.interfaces.PollfishSurveyCompletedListener;
import com.pollfish.interfaces.PollfishSurveyNotAvailableListener;
import com.pollfish.interfaces.PollfishSurveyReceivedListener;
import com.pollfish.interfaces.PollfishUserNotEligibleListener;
import com.pollfish.p145a.C5105a;
import com.pollfish.p145a.C5106b;
import com.pollfish.p145a.C5108c;
import com.pollfish.p145a.C5109d;
import com.pollfish.p147c.C5112a;
import com.pollfish.p147c.C5114c;
import com.pollfish.p147c.C5115d;
import com.pollfish.p147c.C5116e;
import com.pollfish.p147c.C5117f;
import com.pollfish.p147c.C5128i;
import com.pollfish.p148d.C5131a;
import com.pollfish.p150f.p151a.C5157b;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.pollfish.f.a */
public class C5148a {

    /* renamed from: a */
    public static boolean f18370a = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static String f18371p = "";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f18372A;

    /* renamed from: B */
    private ViewGroup f18373B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C5176b f18374C = new C5176b() {
        /* renamed from: a */
        public void mo16780a() {
            synchronized (C5148a.f18371p) {
                if (C5148a.this.f18389l >= 1) {
                    C5148a.this.f18389l = C5148a.this.f18389l - 1;
                } else {
                    C5148a.this.f18389l = 0;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("assetsAndCacheListener: updateNumOfTranfers...numOfAssetsLeftToBeCopiedInCache: ");
                sb.append(C5148a.this.f18389l);
                C5162b.m25518a("LifeCycle", sb.toString());
            }
        }

        /* renamed from: a */
        public void mo16781a(int i) {
            synchronized (C5148a.f18371p) {
                C5148a.this.f18394r = true;
                StringBuilder sb = new StringBuilder();
                sb.append("assetsAndCacheListener: checkedAfterJSONIfTransferAssets: ");
                sb.append(C5148a.this.f18394r);
                C5162b.m25518a("LifeCycle", sb.toString());
                C5148a.this.f18389l = i;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("assetsAndCacheListener: onNumOfTranfers...assetsLeftToBeCopiedInCache: ");
                sb2.append(C5148a.this.f18389l);
                C5162b.m25518a("LifeCycle", sb2.toString());
            }
        }

        /* renamed from: a */
        public void mo16782a(C5109d dVar) {
            synchronized (C5148a.f18371p) {
                String str = "LifeCycle";
                StringBuilder sb = new StringBuilder();
                sb.append("onTransferFromMemoryFinished: failed to write in cache file: ");
                sb.append(dVar.mo16654a());
                C5162b.m25518a(str, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(".");
                sb2.append(dVar.mo16654a());
                mo16784a(sb2.toString(), dVar.mo16657d());
                new C5117f(dVar, C5148a.this.f18380c, this).mo16699c(new Void[0]);
            }
        }

        /* renamed from: a */
        public void mo16783a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("assetsAndCacheListener: deleteFailedTransferAndDownload: ");
            sb.append(str);
            C5162b.m25518a("LifeCycle", sb.toString());
            synchronized (C5148a.f18371p) {
                try {
                    if (!(C5148a.this.f18390m == null || str == null)) {
                        HashMap f = C5148a.this.f18390m;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(".");
                        sb2.append(str);
                        f.remove(sb2.toString());
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("assetsAndCacheListener: urlsToBeReplaceInHtmlOfWebview.size(): ");
                        sb3.append(C5148a.this.f18390m.size());
                        C5162b.m25518a("LifeCycle", sb3.toString());
                    }
                } catch (Exception e) {
                    String str2 = "LifeCycle";
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("deleteFileDownloadedSucessfully error: ");
                    sb4.append(e);
                    C5162b.m25519b(str2, sb4.toString());
                }
            }
        }

        /* renamed from: a */
        public void mo16784a(String str, String str2) {
            synchronized (C5148a.f18371p) {
                String str3 = "LifeCycle";
                StringBuilder sb = new StringBuilder();
                sb.append("assetsAndCacheListener: addUrlsToBeDownloadedOrReplacedLater: ");
                sb.append(str);
                sb.append(" toUrl: ");
                sb.append(str2);
                C5162b.m25518a(str3, sb.toString());
                if (!(C5148a.this.f18390m == null || str == null)) {
                    C5148a.this.f18390m.put(str, str2);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("assetsAndCacheListener: urlsToBeReplaceInHtmlOfWebview.size(): ");
                sb2.append(C5148a.this.f18390m.size());
                C5162b.m25518a("LifeCycle", sb2.toString());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b8, code lost:
            return com.pollfish.p150f.C5148a.m25476f(r5.f18403a);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.HashMap mo16785b() {
            /*
                r5 = this;
                java.lang.String r0 = com.pollfish.p150f.C5148a.f18371p
                monitor-enter(r0)
                java.lang.String r1 = "LifeCycle"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
                r2.<init>()     // Catch:{ all -> 0x00bb }
                java.lang.String r3 = "checkedAfterRegisterIfDownloadAssets: "
                r2.append(r3)     // Catch:{ all -> 0x00bb }
                com.pollfish.f.a r3 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                boolean r3 = r3.f18393q     // Catch:{ all -> 0x00bb }
                r2.append(r3)     // Catch:{ all -> 0x00bb }
                java.lang.String r3 = " checkedAfterJSONIfTransferAssets: "
                r2.append(r3)     // Catch:{ all -> 0x00bb }
                com.pollfish.f.a r3 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                boolean r3 = r3.f18394r     // Catch:{ all -> 0x00bb }
                r2.append(r3)     // Catch:{ all -> 0x00bb }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bb }
                com.pollfish.p150f.C5162b.m25518a(r1, r2)     // Catch:{ all -> 0x00bb }
                com.pollfish.f.a r1 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                boolean r1 = r1.f18393q     // Catch:{ all -> 0x00bb }
                r2 = 0
                if (r1 == 0) goto L_0x00b9
                com.pollfish.f.a r1 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                boolean r1 = r1.f18394r     // Catch:{ all -> 0x00bb }
                if (r1 == 0) goto L_0x00b9
                com.pollfish.f.a r1 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                java.util.HashMap r1 = r1.f18390m     // Catch:{ all -> 0x00bb }
                if (r1 == 0) goto L_0x00b1
                java.lang.String r1 = "LifeCycle"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
                r3.<init>()     // Catch:{ all -> 0x00bb }
                java.lang.String r4 = "assetsAndCacheListener: shouldProceedOrReplace?  urlsToBeReplaceInHtmlOfWebview.size(): "
                r3.append(r4)     // Catch:{ all -> 0x00bb }
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                java.util.HashMap r4 = r4.f18390m     // Catch:{ all -> 0x00bb }
                int r4 = r4.size()     // Catch:{ all -> 0x00bb }
                r3.append(r4)     // Catch:{ all -> 0x00bb }
                java.lang.String r4 = " assetsLeftToBeCopiedInCache: "
                r3.append(r4)     // Catch:{ all -> 0x00bb }
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                int r4 = r4.f18389l     // Catch:{ all -> 0x00bb }
                r3.append(r4)     // Catch:{ all -> 0x00bb }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00bb }
                com.pollfish.p150f.C5162b.m25518a(r1, r3)     // Catch:{ all -> 0x00bb }
                com.pollfish.f.a r1 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                int r1 = r1.f18389l     // Catch:{ all -> 0x00bb }
                if (r1 != 0) goto L_0x0092
                com.pollfish.f.a r1 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                java.util.HashMap r1 = r1.f18390m     // Catch:{ all -> 0x00bb }
                int r1 = r1.size()     // Catch:{ all -> 0x00bb }
                if (r1 <= 0) goto L_0x0092
                java.lang.String r1 = "LifeCycle"
                java.lang.String r2 = "You should replace the urls in html!"
            L_0x008e:
                com.pollfish.p150f.C5162b.m25518a(r1, r2)     // Catch:{ all -> 0x00bb }
                goto L_0x00b1
            L_0x0092:
                com.pollfish.f.a r1 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                int r1 = r1.f18389l     // Catch:{ all -> 0x00bb }
                if (r1 <= 0) goto L_0x00a3
                java.lang.String r1 = "LifeCycle"
                java.lang.String r3 = "Something is being downloaded/copied - you should wait"
                com.pollfish.p150f.C5162b.m25518a(r1, r3)     // Catch:{ all -> 0x00bb }
                monitor-exit(r0)     // Catch:{ all -> 0x00bb }
                return r2
            L_0x00a3:
                com.pollfish.f.a r1 = com.pollfish.p150f.C5148a.this     // Catch:{ all -> 0x00bb }
                java.util.HashMap r1 = r1.f18390m     // Catch:{ all -> 0x00bb }
                r1.clear()     // Catch:{ all -> 0x00bb }
                java.lang.String r1 = "LifeCycle"
                java.lang.String r2 = "Everything is finished - proceed to show Pollfish panel"
                goto L_0x008e
            L_0x00b1:
                monitor-exit(r0)     // Catch:{ all -> 0x00bb }
                com.pollfish.f.a r0 = com.pollfish.p150f.C5148a.this
                java.util.HashMap r0 = r0.f18390m
                return r0
            L_0x00b9:
                monitor-exit(r0)     // Catch:{ all -> 0x00bb }
                return r2
            L_0x00bb:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00bb }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p150f.C5148a.C51491.mo16785b():java.util.HashMap");
        }

        /* renamed from: b */
        public void mo16786b(int i) {
            synchronized (C5148a.f18371p) {
                C5148a.this.f18389l = C5148a.this.f18389l + i;
                StringBuilder sb = new StringBuilder();
                sb.append("assetsAndCacheListener: increaseNumOfAssetsLeftToBeDownloadedBy: ");
                sb.append(C5148a.this.f18389l);
                C5162b.m25518a("LifeCycle", sb.toString());
            }
        }

        /* renamed from: c */
        public void mo16787c() {
            synchronized (C5148a.f18371p) {
                C5148a.this.f18393q = true;
                StringBuilder sb = new StringBuilder();
                sb.append("assetsAndCacheListener: checkedAfterRegisterIfDownloadAssets: ");
                sb.append(C5148a.this.f18393q);
                C5162b.m25518a("LifeCycle", sb.toString());
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C5179e f18375D = new C5179e() {
        /* renamed from: a */
        public void mo16788a() {
            C5162b.m25518a("LifeCycle", "onReturnFromQueueProceedToRegister...");
            C5162b.m25518a("LifeCycle", "registering...");
            C5108c g = C5148a.this.f18381d;
            StringBuilder sb = new StringBuilder();
            sb.append(C5148a.this.f18401y);
            sb.append("/v2");
            sb.append("/device/register");
            C5116e eVar = new C5116e(g, sb.toString(), C5148a.this.f18402z, C5148a.this.f18372A, C5166c.m25534a(C5148a.this.f18381d), C5148a.this.f18377F, C5148a.this.f18380c, false, null, null, null);
            eVar.mo16699c(new Void[0]);
        }
    };

    /* renamed from: E */
    private C5175a f18376E = new C5175a() {
        /* renamed from: a */
        public void mo16789a(C5105a aVar) {
            if (aVar != null) {
                C5162b.m25518a("LifeCycle", "Advertising id is not null, proceed...");
                StringBuilder sb = new StringBuilder();
                sb.append("onReturnFromAdvertisingId with googleAdId object with advertisingID: ");
                sb.append(aVar.mo16589a());
                sb.append(" and Opt out from Interest based ads option: ");
                sb.append(aVar.mo16590b());
                C5162b.m25518a("LifeCycle", sb.toString());
                C5148a.this.mo16776a(aVar);
                return;
            }
            C5162b.m25518a("LifeCycle", "GoogleAdId is null, cannot proceed");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C5177c f18377F = new C5177c() {
        /* JADX WARNING: Removed duplicated region for block: B:47:0x02bf A[SYNTHETIC, Splitter:B:47:0x02bf] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x030f  */
        /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo16790a(com.pollfish.p145a.C5110e r26) {
            /*
                r25 = this;
                r1 = r25
                java.lang.String r0 = "LifeCycle"
                java.lang.String r3 = "onContactServerFinished..."
                com.pollfish.p150f.C5162b.m25518a(r0, r3)
                if (r26 == 0) goto L_0x0374
                boolean r0 = r26.mo16666h()
                if (r0 != 0) goto L_0x0374
                java.lang.String r0 = "LifeCycle"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "onContactServerFinished with SurveyResponse status: "
                r3.append(r4)
                int r4 = r26.mo16659a()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.pollfish.p150f.C5162b.m25518a(r0, r3)
                java.lang.String r0 = "LifeCycle"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "onContactServerFinished with SurveyResponse hasAcceptedTerms: "
                r3.append(r4)
                boolean r4 = r26.mo16664f()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.pollfish.p150f.C5162b.m25518a(r0, r3)
                java.lang.String r0 = "LifeCycle"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "time out happened: "
                r3.append(r4)
                boolean r4 = r26.mo16666h()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.pollfish.p150f.C5162b.m25518a(r0, r3)
                boolean r9 = r26.mo16664f()
                int r3 = r26.mo16659a()
                java.lang.String r0 = r26.mo16661c()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.pollfish.f.a r5 = com.pollfish.p150f.C5148a.this
                java.lang.String r5 = r5.f18401y
                r4.append(r5)
                java.lang.String r5 = "/v2"
                r4.append(r5)
                java.lang.String r5 = "/device/register"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                boolean r0 = r0.equalsIgnoreCase(r4)
                r10 = 0
                r11 = 204(0xcc, float:2.86E-43)
                r12 = 200(0xc8, float:2.8E-43)
                if (r0 == 0) goto L_0x013e
                if (r3 == r12) goto L_0x0096
                if (r3 != r11) goto L_0x013e
            L_0x0096:
                boolean r0 = r26.mo16664f()
                if (r0 == 0) goto L_0x013e
                java.lang.String r0 = r26.mo16665g()
                if (r0 == 0) goto L_0x013e
                java.lang.String r0 = r26.mo16665g()
                int r0 = r0.length()
                r4 = 4
                if (r0 != r4) goto L_0x013e
                java.lang.String r0 = "LifeCycle"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "User has accepted terms and conditions - send User Consent Data: "
                r4.append(r5)
                java.lang.String r5 = r26.mo16665g()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.pollfish.p150f.C5162b.m25518a(r0, r4)
                java.lang.String r0 = "LifeCycle"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Sent at url: "
                r4.append(r5)
                com.pollfish.f.a r5 = com.pollfish.p150f.C5148a.this
                java.lang.String r5 = r5.f18401y
                r4.append(r5)
                java.lang.String r5 = "/v2"
                r4.append(r5)
                java.lang.String r5 = "/device/info"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.pollfish.p150f.C5162b.m25518a(r0, r4)
                com.pollfish.c.e r0 = new com.pollfish.c.e
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this
                com.pollfish.a.c r14 = r4.f18381d
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.pollfish.f.a r5 = com.pollfish.p150f.C5148a.this
                java.lang.String r5 = r5.f18401y
                r4.append(r5)
                java.lang.String r5 = "/v2"
                r4.append(r5)
                java.lang.String r5 = "/device/info"
                r4.append(r5)
                java.lang.String r15 = r4.toString()
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this
                int r16 = r4.f18402z
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this
                java.lang.String r17 = r4.f18372A
                r18 = 0
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this
                com.pollfish.interfaces.a$c r19 = r4.f18377F
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this
                android.app.Activity r20 = r4.f18380c
                r21 = 0
                r22 = 0
                r23 = 0
                java.lang.String r24 = r26.mo16665g()
                r13 = r0
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                java.lang.Void[] r4 = new java.lang.Void[r10]
                r0.mo16699c(r4)
            L_0x013e:
                r0 = 406(0x196, float:5.69E-43)
                if (r3 != r12) goto L_0x0259
                java.lang.String r4 = r26.mo16661c()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                com.pollfish.f.a r6 = com.pollfish.p150f.C5148a.this
                java.lang.String r6 = r6.f18401y
                r5.append(r6)
                java.lang.String r6 = "/v2"
                r5.append(r6)
                java.lang.String r6 = "/device/register"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                boolean r4 = r4.equalsIgnoreCase(r5)
                if (r4 == 0) goto L_0x0251
                com.pollfish.f.a r13 = com.pollfish.p150f.C5148a.this
                java.lang.String r4 = r26.mo16660b()
                com.pollfish.f.a r5 = com.pollfish.p150f.C5148a.this
                com.pollfish.a.c r5 = r5.f18381d
                com.pollfish.f.a r6 = com.pollfish.p150f.C5148a.this
                com.pollfish.interfaces.a$d r6 = r6.f18378G
                com.pollfish.f.a r7 = com.pollfish.p150f.C5148a.this
                com.pollfish.interfaces.a$b r7 = r7.f18374C
                com.pollfish.f.a r8 = com.pollfish.p150f.C5148a.this
                android.app.Activity r8 = r8.f18380c
                com.pollfish.a.b r4 = com.pollfish.p150f.C5166c.m25530a(r4, r5, r6, r7, r8, r9)
                r13.mo16779b(r4)
                java.lang.String r4 = "LifeCycle"
                java.lang.String r5 = "ContactServerFinishedListener: returned from a register request"
                com.pollfish.p150f.C5162b.m25518a(r4, r5)
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                android.app.Activity r4 = r4.f18380c     // Catch:{ Exception -> 0x0249 }
                boolean r4 = r4 instanceof com.pollfish.interfaces.PollfishSurveyReceivedListener     // Catch:{ Exception -> 0x0249 }
                if (r4 == 0) goto L_0x01f1
                java.lang.String r4 = "LifeCycle"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0249 }
                r5.<init>()     // Catch:{ Exception -> 0x0249 }
                java.lang.String r6 = "ContactServerFinishedListener: Survey or award is there : isShortSurvey "
                r5.append(r6)     // Catch:{ Exception -> 0x0249 }
                com.pollfish.f.a r6 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                com.pollfish.a.b r6 = r6.f18382e     // Catch:{ Exception -> 0x0249 }
                boolean r6 = r6.mo16607m()     // Catch:{ Exception -> 0x0249 }
                r5.append(r6)     // Catch:{ Exception -> 0x0249 }
                java.lang.String r6 = " survey Price: "
                r5.append(r6)     // Catch:{ Exception -> 0x0249 }
                com.pollfish.f.a r6 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                com.pollfish.a.b r6 = r6.f18382e     // Catch:{ Exception -> 0x0249 }
                int r6 = r6.mo16608n()     // Catch:{ Exception -> 0x0249 }
                r5.append(r6)     // Catch:{ Exception -> 0x0249 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0249 }
                com.pollfish.p150f.C5162b.m25518a(r4, r5)     // Catch:{ Exception -> 0x0249 }
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                android.app.Activity r4 = r4.f18380c     // Catch:{ Exception -> 0x0249 }
                com.pollfish.interfaces.PollfishSurveyReceivedListener r4 = (com.pollfish.interfaces.PollfishSurveyReceivedListener) r4     // Catch:{ Exception -> 0x0249 }
                com.pollfish.f.a r5 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                com.pollfish.a.b r5 = r5.f18382e     // Catch:{ Exception -> 0x0249 }
                boolean r5 = r5.mo16607m()     // Catch:{ Exception -> 0x0249 }
                com.pollfish.f.a r6 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                com.pollfish.a.b r6 = r6.f18382e     // Catch:{ Exception -> 0x0249 }
            L_0x01e8:
                int r6 = r6.mo16608n()     // Catch:{ Exception -> 0x0249 }
                r4.onPollfishSurveyReceived(r5, r6)     // Catch:{ Exception -> 0x0249 }
                goto L_0x027b
            L_0x01f1:
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                com.pollfish.interfaces.PollfishSurveyReceivedListener r4 = r4.f18395s     // Catch:{ Exception -> 0x0249 }
                if (r4 == 0) goto L_0x027b
                java.lang.String r4 = "LifeCycle"
                java.lang.String r5 = "ContactServerFinishedListener: Survey or award is there and this.pollfishSurveyReceivedListenerExt!=null"
                com.pollfish.p150f.C5162b.m25518a(r4, r5)     // Catch:{ Exception -> 0x0249 }
                java.lang.String r4 = "LifeCycle"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0249 }
                r5.<init>()     // Catch:{ Exception -> 0x0249 }
                java.lang.String r6 = "ContactServerFinishedListener: panelObj.isShortSurvey(): "
                r5.append(r6)     // Catch:{ Exception -> 0x0249 }
                com.pollfish.f.a r6 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                com.pollfish.a.b r6 = r6.f18382e     // Catch:{ Exception -> 0x0249 }
                boolean r6 = r6.mo16607m()     // Catch:{ Exception -> 0x0249 }
                r5.append(r6)     // Catch:{ Exception -> 0x0249 }
                java.lang.String r6 = " survey Price: "
                r5.append(r6)     // Catch:{ Exception -> 0x0249 }
                com.pollfish.f.a r6 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                com.pollfish.a.b r6 = r6.f18382e     // Catch:{ Exception -> 0x0249 }
                int r6 = r6.mo16608n()     // Catch:{ Exception -> 0x0249 }
                r5.append(r6)     // Catch:{ Exception -> 0x0249 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0249 }
                com.pollfish.p150f.C5162b.m25518a(r4, r5)     // Catch:{ Exception -> 0x0249 }
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                com.pollfish.interfaces.PollfishSurveyReceivedListener r4 = r4.f18395s     // Catch:{ Exception -> 0x0249 }
                com.pollfish.f.a r5 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                com.pollfish.a.b r5 = r5.f18382e     // Catch:{ Exception -> 0x0249 }
                boolean r5 = r5.mo16607m()     // Catch:{ Exception -> 0x0249 }
                com.pollfish.f.a r6 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x0249 }
                com.pollfish.a.b r6 = r6.f18382e     // Catch:{ Exception -> 0x0249 }
                goto L_0x01e8
            L_0x0249:
                java.lang.String r4 = "LifeCycle"
                java.lang.String r5 = "Could not notify listener on survey received"
                com.pollfish.p150f.C5162b.m25519b(r4, r5)
                goto L_0x027b
            L_0x0251:
                java.lang.String r4 = "LifeCycle"
                java.lang.String r5 = "ContactServerFinishedListener: Response from server not from registering"
            L_0x0255:
                com.pollfish.p150f.C5162b.m25518a(r4, r5)
                goto L_0x027b
            L_0x0259:
                if (r3 != r11) goto L_0x0260
                java.lang.String r4 = "LifeCycle"
                java.lang.String r5 = "ContactServerFinishedListener: Nothing to show"
                goto L_0x0255
            L_0x0260:
                r4 = 400(0x190, float:5.6E-43)
                if (r3 != r4) goto L_0x0269
                java.lang.String r4 = "LifeCycle"
                java.lang.String r5 = "ContactServerFinishedListener: Wrong or Bad arguments"
                goto L_0x0255
            L_0x0269:
                r4 = 401(0x191, float:5.62E-43)
                if (r3 != r4) goto L_0x0272
                java.lang.String r4 = "LifeCycle"
                java.lang.String r5 = "ContactServerFinishedListener: Encryption is wrong"
                goto L_0x0255
            L_0x0272:
                if (r3 != r0) goto L_0x027b
                java.lang.String r4 = "Pollfish"
                java.lang.String r5 = "Wrong Pollfish API Key"
                android.util.Log.w(r4, r5)
            L_0x027b:
                java.lang.String r4 = "LifeCycle"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "surveyResponse.getServerUrl(): "
                r5.append(r6)
                java.lang.String r6 = r26.mo16661c()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.pollfish.p150f.C5162b.m25518a(r4, r5)
                if (r3 == r12) goto L_0x0309
                if (r3 == r0) goto L_0x0309
                java.lang.String r0 = r26.mo16661c()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.pollfish.f.a r5 = com.pollfish.p150f.C5148a.this
                java.lang.String r5 = r5.f18401y
                r4.append(r5)
                java.lang.String r5 = "/v2"
                r4.append(r5)
                java.lang.String r5 = "/device/register"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                boolean r0 = r0.equalsIgnoreCase(r4)
                if (r0 == 0) goto L_0x0309
                com.pollfish.f.a r0 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x02f2 }
                android.app.Activity r0 = r0.f18380c     // Catch:{ Exception -> 0x02f2 }
                boolean r0 = r0 instanceof com.pollfish.interfaces.PollfishSurveyNotAvailableListener     // Catch:{ Exception -> 0x02f2 }
                if (r0 == 0) goto L_0x02dc
                java.lang.String r0 = "LifeCycle"
                java.lang.String r4 = "firing PollfishSurveyNotAvailableListener after registering"
                com.pollfish.p150f.C5162b.m25518a(r0, r4)     // Catch:{ Exception -> 0x02f2 }
                com.pollfish.f.a r0 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x02f2 }
                android.app.Activity r0 = r0.f18380c     // Catch:{ Exception -> 0x02f2 }
                com.pollfish.interfaces.PollfishSurveyNotAvailableListener r0 = (com.pollfish.interfaces.PollfishSurveyNotAvailableListener) r0     // Catch:{ Exception -> 0x02f2 }
            L_0x02d8:
                r0.onPollfishSurveyNotAvailable()     // Catch:{ Exception -> 0x02f2 }
                goto L_0x0309
            L_0x02dc:
                com.pollfish.f.a r0 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x02f2 }
                com.pollfish.interfaces.PollfishSurveyNotAvailableListener r0 = r0.f18396t     // Catch:{ Exception -> 0x02f2 }
                if (r0 == 0) goto L_0x0309
                java.lang.String r0 = "LifeCycle"
                java.lang.String r4 = "firing PollfishSurveyNotAvailableListener after registering pollfishSurveyNotAvailableListenerExt!=null"
                com.pollfish.p150f.C5162b.m25518a(r0, r4)     // Catch:{ Exception -> 0x02f2 }
                com.pollfish.f.a r0 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x02f2 }
                com.pollfish.interfaces.PollfishSurveyNotAvailableListener r0 = r0.f18396t     // Catch:{ Exception -> 0x02f2 }
                goto L_0x02d8
            L_0x02f2:
                r0 = move-exception
                java.lang.String r4 = "LifeCycle"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "ContactServerFinishedListener: Could not notify listener on nothing to show: "
                r5.append(r6)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                com.pollfish.p150f.C5162b.m25519b(r4, r0)
            L_0x0309:
                boolean r0 = r26.mo16663e()
                if (r0 == 0) goto L_0x03e8
                if (r3 == r12) goto L_0x0313
                if (r3 != r11) goto L_0x03e8
            L_0x0313:
                java.lang.String r0 = r26.mo16661c()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this
                java.lang.String r4 = r4.f18401y
                r3.append(r4)
                java.lang.String r4 = "/v2"
                r3.append(r4)
                java.lang.String r4 = "/device/register"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                boolean r0 = r0.equalsIgnoreCase(r3)
                if (r0 != 0) goto L_0x03e8
                java.lang.String r0 = "LifeCycle"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "try to delete file with name: "
                r3.append(r4)
                java.lang.String r4 = r26.mo16662d()
                r3.append(r4)
                java.lang.String r4 = " from queue on sucessful sent"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.pollfish.p150f.C5162b.m25518a(r0, r3)
                com.pollfish.c.b r0 = new com.pollfish.c.b
                java.lang.String r2 = r26.mo16662d()
                com.pollfish.f.a r3 = com.pollfish.p150f.C5148a.this
                android.app.Activity r3 = r3.f18380c
                com.pollfish.f.a r4 = com.pollfish.p150f.C5148a.this
                com.pollfish.interfaces.a$e r4 = r4.f18375D
                r0.<init>(r2, r3, r4)
                java.lang.Void[] r2 = new java.lang.Void[r10]
                r0.mo16699c(r2)
                goto L_0x03e8
            L_0x0374:
                if (r26 == 0) goto L_0x03e1
                boolean r0 = r26.mo16666h()
                if (r0 == 0) goto L_0x03e1
                java.lang.String r0 = "LifeCycle"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "time out happened: "
                r3.append(r4)
                boolean r2 = r26.mo16666h()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                com.pollfish.p150f.C5162b.m25518a(r0, r2)
                com.pollfish.f.a r0 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x03c9 }
                android.app.Activity r0 = r0.f18380c     // Catch:{ Exception -> 0x03c9 }
                boolean r0 = r0 instanceof com.pollfish.interfaces.PollfishSurveyNotAvailableListener     // Catch:{ Exception -> 0x03c9 }
                if (r0 == 0) goto L_0x03b3
                java.lang.String r0 = "LifeCycle"
                java.lang.String r2 = "firing PollfishSurveyNotAvailableListener after registering"
                com.pollfish.p150f.C5162b.m25518a(r0, r2)     // Catch:{ Exception -> 0x03c9 }
                com.pollfish.f.a r0 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x03c9 }
                android.app.Activity r0 = r0.f18380c     // Catch:{ Exception -> 0x03c9 }
                com.pollfish.interfaces.PollfishSurveyNotAvailableListener r0 = (com.pollfish.interfaces.PollfishSurveyNotAvailableListener) r0     // Catch:{ Exception -> 0x03c9 }
            L_0x03af:
                r0.onPollfishSurveyNotAvailable()     // Catch:{ Exception -> 0x03c9 }
                goto L_0x03e8
            L_0x03b3:
                com.pollfish.f.a r0 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x03c9 }
                com.pollfish.interfaces.PollfishSurveyNotAvailableListener r0 = r0.f18396t     // Catch:{ Exception -> 0x03c9 }
                if (r0 == 0) goto L_0x03e8
                java.lang.String r0 = "LifeCycle"
                java.lang.String r2 = "firing PollfishSurveyNotAvailableListener after registering pollfishSurveyNotAvailableListenerExt!=null"
                com.pollfish.p150f.C5162b.m25518a(r0, r2)     // Catch:{ Exception -> 0x03c9 }
                com.pollfish.f.a r0 = com.pollfish.p150f.C5148a.this     // Catch:{ Exception -> 0x03c9 }
                com.pollfish.interfaces.PollfishSurveyNotAvailableListener r0 = r0.f18396t     // Catch:{ Exception -> 0x03c9 }
                goto L_0x03af
            L_0x03c9:
                r0 = move-exception
                java.lang.String r2 = "LifeCycle"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "ContactServerFinishedListener: Could not notify listener on nothing to show: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.pollfish.p150f.C5162b.m25519b(r2, r0)
                goto L_0x03e8
            L_0x03e1:
                java.lang.String r0 = "LifeCycle"
                java.lang.String r2 = "ContactServerFinishedListener: Nothing to show - no server response (serverResponse = null) "
                com.pollfish.p150f.C5162b.m25518a(r0, r2)
            L_0x03e8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p150f.C5148a.C51524.mo16790a(com.pollfish.a.e):void");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C5178d f18378G = new C5178d() {
        /* renamed from: a */
        public void mo16791a(C5106b bVar) {
            C5162b.m25518a("LifeCycle", "onPollfishCustomIndicatorChecked()");
            C5148a.this.mo16777a(bVar);
        }
    };

    /* renamed from: b */
    private C5180f f18379b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Activity f18380c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5108c f18381d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5106b f18382e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5131a f18383f = null;

    /* renamed from: g */
    private String f18384g;

    /* renamed from: h */
    private Position f18385h = null;

    /* renamed from: i */
    private int f18386i;

    /* renamed from: j */
    private boolean f18387j;

    /* renamed from: k */
    private boolean f18388k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f18389l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public HashMap f18390m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f18391n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Timer f18392o;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f18393q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f18394r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public PollfishSurveyReceivedListener f18395s = null;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public PollfishSurveyNotAvailableListener f18396t = null;

    /* renamed from: u */
    private PollfishSurveyCompletedListener f18397u = null;

    /* renamed from: v */
    private PollfishOpenedListener f18398v = null;

    /* renamed from: w */
    private PollfishClosedListener f18399w = null;

    /* renamed from: x */
    private PollfishUserNotEligibleListener f18400x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f18401y = null;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f18402z;

    public C5148a(Activity activity, String str, boolean z, Position position, int i, boolean z2, C5180f fVar, PollfishSurveyReceivedListener pollfishSurveyReceivedListener, PollfishSurveyNotAvailableListener pollfishSurveyNotAvailableListener, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener, String str2, int i2, ViewGroup viewGroup, String str3) {
        this.f18395s = pollfishSurveyReceivedListener;
        this.f18396t = pollfishSurveyNotAvailableListener;
        this.f18397u = pollfishSurveyCompletedListener;
        this.f18398v = pollfishOpenedListener;
        this.f18399w = pollfishClosedListener;
        this.f18400x = pollfishUserNotEligibleListener;
        this.f18389l = 0;
        this.f18380c = activity;
        this.f18384g = str;
        this.f18388k = z;
        this.f18385h = position;
        this.f18386i = i;
        this.f18387j = z2;
        this.f18393q = false;
        this.f18394r = false;
        this.f18379b = fVar;
        this.f18390m = new HashMap();
        this.f18401y = str2;
        this.f18402z = i2;
        this.f18372A = str3;
        this.f18373B = viewGroup;
    }

    /* renamed from: a */
    private void m25466a(boolean z) {
        C5162b.m25518a("LifeCycle", "reorder app Layouts - add Pollfish layout");
        try {
            this.f18383f = C5157b.m25514a(this.f18380c, this.f18381d, z, this.f18377F, this.f18374C, this.f18397u, this.f18398v, this.f18399w, this.f18400x, this.f18401y, this.f18402z, this.f18372A, this.f18373B);
            StringBuilder sb = new StringBuilder();
            sb.append("serverToConnectUrl: ");
            sb.append(this.f18401y);
            C5162b.m25518a("LifeCycle", sb.toString());
            if (this.f18383f != null) {
                C5162b.m25518a("LifeCycle", "overlayLayout != null");
                this.f18379b.mo16839a(this.f18383f);
                return;
            }
            C5162b.m25518a("LifeCycle", "overlayLayout == null");
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("error LayoutUtils.createLayout: ");
            sb2.append(e);
            C5162b.m25519b("LifeCycle", sb2.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25473c(final C5106b bVar) {
        C5162b.m25518a("LifeCycle", "panelObject != null - canceling timer - moving to proceedPanel");
        C5166c.m25536a((Context) this.f18380c, (Runnable) new Runnable() {
            public void run() {
                C5148a.this.mo16779b(bVar);
                if (C5148a.this.f18383f != null) {
                    C5148a.this.f18383f.mo16734a(bVar);
                }
            }
        }, 0);
        if (this.f18392o != null) {
            this.f18392o.cancel();
            this.f18392o = null;
        }
        this.f18391n = 0;
    }

    /* renamed from: a */
    public void mo16775a() {
        C5162b.m25518a("LifeCycle", "Pollfish checkAdIdAvailability()...");
        C5162b.m25518a("LifeCycle", "check if overlay view already exists (changed app hierarchy before)");
        String str = "LifeCycle";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("userLayout: ");
            sb.append(this.f18373B);
            C5162b.m25518a(str, sb.toString());
            this.f18383f = C5157b.m25513a(this.f18380c, this.f18373B);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error while getExistingOverlay");
            sb2.append(e);
            C5162b.m25519b("LifeCycle", sb2.toString());
        }
        if (this.f18383f != null) {
            C5162b.m25518a("LifeCycle", "existing overlay found - reset view hierarchy to initial state");
            try {
                C5157b.m25517a(this.f18383f);
            } catch (Exception e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("bringAppViewsToPriorOverlayState error: ");
                sb3.append(e2);
                C5162b.m25519b("LifeCycle", sb3.toString());
                return;
            }
        } else {
            C5162b.m25518a("LifeCycle", "no existing overlay found");
        }
        C5162b.m25518a("LifeCycle", "Loading Pollfish parameters..");
        C5108c cVar = new C5108c(this.f18380c, this.f18384g, this.f18388k, this.f18385h, this.f18386i, this.f18387j);
        this.f18381d = cVar;
        C5162b.m25518a("LifeCycle", "Pollfish parameters loaded");
        C5162b.m25518a("LifeCycle", "Re-aranging view hierarchy");
        try {
            mo16778b();
        } catch (Exception e3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("error in createViewsLayout: ");
            sb4.append(e3);
            C5162b.m25519b("LifeCycle", sb4.toString());
        }
        C5162b.m25518a("LifeCycle", "Check advertising id...");
        new C5112a(this.f18380c, this.f18376E, this.f18388k).execute(new Void[0]);
    }

    /* renamed from: a */
    public void mo16776a(C5105a aVar) {
        C5162b.m25518a("LifeCycle", "Pollfish lifecycle begin()...");
        if (aVar != null && aVar.mo16589a() != null) {
            this.f18381d.mo16631d(aVar.mo16589a());
            this.f18381d.mo16624a(aVar.mo16590b());
            C5162b.m25518a("LifeCycle", "read assets and copy to internal cache or download if needed");
            new C5128i(this.f18374C, this.f18380c).mo16699c(new Void[0]);
            C5162b.m25518a("LifeCycle", "check queue...");
            int a = C5166c.m25527a(this.f18380c, "pollfish_pref_queue");
            StringBuilder sb = new StringBuilder();
            sb.append("number of times tried to empty queue with no result: ");
            sb.append(a);
            C5162b.m25518a("LifeCycle", sb.toString());
            if (a < 10) {
                C5162b.m25518a("LifeCycle", "check queue, not tried too many times yet - try again");
                new C5114c(this.f18381d, this.f18377F, this.f18375D, this.f18380c).mo16699c(new Void[0]);
                return;
            }
            C5162b.m25518a("LifeCycle", "clearing queue after multiple attends to clear the queue");
            new C5115d(this.f18380c).execute(new Void[0]);
            C5166c.m25535a(this.f18380c, "pollfish_pref_queue", 0);
            C5162b.m25518a("LifeCycle", "registering...");
            C5108c cVar = this.f18381d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18401y);
            sb2.append("/v2");
            sb2.append("/device/register");
            C5116e eVar = new C5116e(cVar, sb2.toString(), this.f18402z, this.f18372A, C5166c.m25534a(this.f18381d), this.f18377F, this.f18380c, false, null, null, null);
            eVar.mo16699c(new Void[0]);
        }
    }

    /* renamed from: a */
    public void mo16777a(final C5106b bVar) {
        if (bVar != null) {
            try {
                m25473c(bVar);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("timer: e: ");
                sb.append(e);
                C5162b.m25519b("LifeCycle", sb.toString());
                if (this.f18392o != null) {
                    this.f18392o.cancel();
                    this.f18392o = null;
                }
                this.f18391n = 0;
            }
        } else {
            this.f18392o = new Timer();
            this.f18392o.schedule(new TimerTask() {
                public void run() {
                    String str;
                    String sb;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("checking if panelObject!=null after coming from registering timerTimes: ");
                    sb2.append(C5148a.this.f18391n);
                    C5162b.m25518a("LifeCycle", sb2.toString());
                    try {
                        if (bVar != null) {
                            C5148a.this.m25473c(bVar);
                            return;
                        }
                        if (bVar != null || C5148a.this.f18391n <= 100) {
                            C5148a.this.f18391n = C5148a.this.f18391n + 1;
                            str = "LifeCycle";
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("panelObject == null - trying again for timerTimes: ");
                            sb3.append(C5148a.this.f18391n);
                            sb = sb3.toString();
                        } else {
                            if (C5148a.this.f18392o != null) {
                                C5148a.this.f18392o.cancel();
                                C5148a.this.f18392o = null;
                            }
                            C5148a.this.f18391n = 0;
                            str = "LifeCycle";
                            sb = "panelObject == null - canceling timer - tried too many times - timerTimes>100";
                        }
                        C5162b.m25518a(str, sb);
                    } catch (Exception e) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("timer: e: ");
                        sb4.append(e);
                        C5162b.m25519b("LifeCycle", sb4.toString());
                        if (C5148a.this.f18392o != null) {
                            C5148a.this.f18392o.cancel();
                            C5148a.this.f18392o = null;
                        }
                        C5148a.this.f18391n = 0;
                    }
                }
            }, (long) 0, (long) 50);
        }
    }

    /* renamed from: b */
    public void mo16778b() {
        C5162b.m25518a("LifeCycle", "createViewsLayout()");
        try {
            C5162b.m25518a("LifeCycle", "call to re-order layouts with overlay view inside");
            m25466a(f18370a);
        } catch (Exception unused) {
            C5162b.m25519b("LifeCycle", "error in reOrderLayouts after custom indicator check fired");
        }
    }

    /* renamed from: b */
    public void mo16779b(C5106b bVar) {
        this.f18382e = bVar;
    }
}
