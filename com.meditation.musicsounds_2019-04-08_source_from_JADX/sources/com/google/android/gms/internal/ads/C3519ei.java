package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.zzbv;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ei */
public final class C3519ei extends C3494dl {

    /* renamed from: a */
    private static final Object f13833a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static C3519ei f13834b;

    /* renamed from: c */
    private final Context f13835c;

    /* renamed from: d */
    private final C3518eh f13836d;

    /* renamed from: e */
    private final ScheduledExecutorService f13837e = Executors.newSingleThreadScheduledExecutor();

    private C3519ei(Context context, C3518eh ehVar) {
        this.f13835c = context;
        this.f13836d = ehVar;
    }

    /* renamed from: a */
    public static C3519ei m18334a(Context context, C3518eh ehVar) {
        C3519ei eiVar;
        synchronized (f13833a) {
            if (f13834b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                aqm.m16920a(context);
                f13834b = new C3519ei(context, ehVar);
                if (context.getApplicationContext() != null) {
                    zzbv.zzek().mo13135c(context);
                }
                C3640iv.m18774a(context);
            }
            eiVar = f13834b;
        }
        return eiVar;
    }

    /* renamed from: a */
    private static zzaej m18336a(Context context, C3518eh ehVar, zzaef zzaef, ScheduledExecutorService scheduledExecutorService) {
        char c;
        Context context2 = context;
        C3518eh ehVar2 = ehVar;
        zzaef zzaef2 = zzaef;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        C3643iy.m19172b("Starting ad request from service using: google.afma.request.getAdDictionary");
        aqz aqz = new aqz(((Boolean) ane.m16650f().mo12297a(aqm.f12621N)).booleanValue(), "load_ad", zzaef2.f15260d.f15499a);
        if (zzaef2.f15254a > 10 && zzaef2.f15228A != -1) {
            aqz.mo12324a(aqz.mo12319a(zzaef2.f15228A), "cts");
        }
        aqx a = aqz.mo12318a();
        C3751my a2 = C3740mn.m19192a(ehVar2.f13829i.mo13724a(context2), ((Long) ane.m16650f().mo12297a(aqm.f12741cA)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        C3751my a3 = C3740mn.m19192a(ehVar2.f13828h.mo12903a(context2), ((Long) ane.m16650f().mo12297a(aqm.f12735bv)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        C3751my a4 = ehVar2.f13823c.mo13017a(zzaef2.f15263g.packageName);
        C3751my b = ehVar2.f13823c.mo13018b(zzaef2.f15263g.packageName);
        C3751my a5 = ehVar2.f13830j.mo13021a(zzaef2.f15264h, zzaef2.f15263g);
        Future a6 = zzbv.zzev().mo12896a(context2);
        C3751my a7 = C3740mn.m19191a(null);
        Bundle bundle = zzaef2.f15259c.f15483c;
        boolean z = (bundle == null || bundle.getString("_ad") == null) ? false : true;
        if (zzaef2.f15234G && !z) {
            a7 = ehVar2.f13826f.mo12651a(zzaef2.f15262f);
        }
        aqz aqz2 = aqz;
        C3751my a8 = C3740mn.m19192a(a7, ((Long) ane.m16650f().mo12297a(aqm.f12784cr)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future a9 = C3740mn.m19191a(null);
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12644aJ)).booleanValue()) {
            a9 = C3740mn.m19192a(ehVar2.f13830j.mo13020a(context2), ((Long) ane.m16650f().mo12297a(aqm.f12645aK)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        }
        Bundle bundle2 = (zzaef2.f15254a < 4 || zzaef2.f15271o == null) ? null : zzaef2.f15271o;
        ((Boolean) ane.m16650f().mo12297a(aqm.f12664ad)).booleanValue();
        zzbv.zzek();
        if (C3653jh.m18884a(context2, "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            C3643iy.m19172b("Device is offline.");
        }
        String uuid = zzaef2.f15254a >= 7 ? zzaef2.f15278v : UUID.randomUUID().toString();
        new C3525eo(context2, uuid, zzaef2.f15262f.packageName);
        if (zzaef2.f15259c.f15483c != null) {
            String string = zzaef2.f15259c.f15483c.getString("_ad");
            if (string != null) {
                return C3524en.m18346a(context2, zzaef2, string);
            }
        }
        List<String> a10 = ehVar2.f13824d.mo12281a(zzaef2.f15279w);
        aqx aqx = a;
        String str = uuid;
        Bundle bundle3 = (Bundle) C3740mn.m19197a((Future<T>) a2, null, ((Long) ane.m16650f().mo12297a(aqm.f12741cA)).longValue(), TimeUnit.MILLISECONDS);
        C3544fg fgVar = (C3544fg) C3740mn.m19196a((Future<T>) a3, null);
        Location location = (Location) C3740mn.m19196a((Future<T>) a8, null);
        Info info = (Info) C3740mn.m19196a(a9, null);
        String str2 = (String) C3740mn.m19196a((Future<T>) a5, null);
        String str3 = (String) C3740mn.m19196a((Future<T>) a4, null);
        String str4 = (String) C3740mn.m19196a((Future<T>) b, null);
        C3533ew ewVar = (C3533ew) C3740mn.m19196a(a6, null);
        if (ewVar == null) {
            C3643iy.m19178e("Error fetching device info. This is not recoverable.");
            return new zzaej(0);
        }
        C3517eg egVar = new C3517eg();
        egVar.f13817j = zzaef2;
        egVar.f13818k = ewVar;
        egVar.f13812e = fgVar;
        egVar.f13811d = location;
        egVar.f13809b = bundle3;
        egVar.f13815h = str2;
        egVar.f13816i = info;
        if (a10 == null) {
            egVar.f13810c.clear();
        }
        egVar.f13810c = a10;
        egVar.f13808a = bundle2;
        egVar.f13813f = str3;
        egVar.f13814g = str4;
        Context context3 = context;
        egVar.f13819l = ehVar2.f13822b.mo12079a(context3);
        egVar.f13820m = ehVar2.f13831k;
        JSONObject a11 = C3524en.m18350a(context3, egVar);
        if (a11 == null) {
            return new zzaej(0);
        }
        if (zzaef2.f15254a < 7) {
            try {
                a11.put("request_id", str);
            } catch (JSONException unused) {
            }
        }
        aqz aqz3 = aqz2;
        aqx aqx2 = aqx;
        aqz3.mo12324a(aqx2, "arc");
        aqz3.mo12318a();
        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService;
        C3751my a12 = C3740mn.m19192a(C3740mn.m19193a(ehVar2.f13832l.mo12879a().mo12646b(a11), C3520ej.f13838a, (Executor) scheduledExecutorService3), 10, TimeUnit.SECONDS, scheduledExecutorService3);
        C3751my a13 = ehVar2.f13825e.mo12899a();
        if (a13 != null) {
            C3738ml.m19187a(a13, "AdRequestServiceImpl.loadAd.flags");
        }
        C3531eu euVar = (C3531eu) C3740mn.m19196a((Future<T>) a12, null);
        if (euVar == null) {
            return new zzaej(0);
        }
        if (euVar.mo12884a() != -2) {
            return new zzaej(euVar.mo12884a());
        }
        aqz3.mo12327d();
        zzaej a14 = !TextUtils.isEmpty(euVar.mo12893i()) ? C3524en.m18346a(context3, zzaef2, euVar.mo12893i()) : null;
        if (a14 == null && !TextUtils.isEmpty(euVar.mo12889e())) {
            a14 = m18337a(zzaef, context, zzaef2.f15267k.f15360a, euVar.mo12889e(), str3, str4, euVar, aqz3, ehVar);
        }
        if (a14 == null) {
            c = 0;
            a14 = new zzaej(0);
        } else {
            c = 0;
        }
        String[] strArr = new String[1];
        strArr[c] = "tts";
        aqz3.mo12324a(aqx2, strArr);
        a14.f15329w = aqz3.mo12325b();
        return a14;
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.es.a(long, boolean):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e9, code lost:
        r0 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r6 = new java.io.InputStreamReader(r11.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        com.google.android.gms.ads.internal.zzbv.zzek();
        r10 = com.google.android.gms.internal.ads.C3653jh.m18868a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        com.google.android.gms.common.util.C3307l.m15066a(r6);
        r3.mo13237a(r10);
        m18338a(r0, r12, r10, r9);
        r5.mo12882a(r0, r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0109, code lost:
        if (r1 == null) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010b, code lost:
        r1.mo12324a(r4, "ufe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0116, code lost:
        r0 = r5.mo12881a(r7, r24.mo12894j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0121, code lost:
        if (r2 == null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2.f13827g.mo12902b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0128, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r16 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012e, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        com.google.android.gms.common.util.C3307l.m15066a(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0133, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014e, code lost:
        com.google.android.gms.internal.ads.C3643iy.m19178e("No location header to follow redirect.");
        r0 = new com.google.android.gms.internal.ads.zzaej(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015c, code lost:
        if (r2 == null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015e, code lost:
        r2.f13827g.mo12902b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0163, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017d, code lost:
        com.google.android.gms.internal.ads.C3643iy.m19178e("Too many redirects.");
        r0 = new com.google.android.gms.internal.ads.zzaej(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018b, code lost:
        if (r2 == null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018d, code lost:
        r2.f13827g.mo12902b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0192, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a A[Catch:{ all -> 0x00c0, all -> 0x01cc }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaej m18337a(com.google.android.gms.internal.ads.zzaef r18, android.content.Context r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.google.android.gms.internal.ads.C3531eu r24, com.google.android.gms.internal.ads.aqz r25, com.google.android.gms.internal.ads.C3518eh r26) {
        /*
            r0 = r18
            r1 = r25
            r2 = r26
            if (r1 == 0) goto L_0x000d
            com.google.android.gms.internal.ads.aqx r4 = r25.mo12318a()
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            com.google.android.gms.internal.ads.es r5 = new com.google.android.gms.internal.ads.es     // Catch:{ IOException -> 0x01d8 }
            java.lang.String r6 = r24.mo12887c()     // Catch:{ IOException -> 0x01d8 }
            r5.<init>(r0, r6)     // Catch:{ IOException -> 0x01d8 }
            java.lang.String r6 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r7 = java.lang.String.valueOf(r21)     // Catch:{ IOException -> 0x01d8 }
            int r8 = r7.length()     // Catch:{ IOException -> 0x01d8 }
            if (r8 == 0) goto L_0x0029
            java.lang.String r6 = r6.concat(r7)     // Catch:{ IOException -> 0x01d8 }
            r7 = r6
            goto L_0x002e
        L_0x0029:
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x01d8 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x01d8 }
        L_0x002e:
            com.google.android.gms.internal.ads.C3643iy.m19172b(r7)     // Catch:{ IOException -> 0x01d8 }
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x01d8 }
            r7 = r21
            r6.<init>(r7)     // Catch:{ IOException -> 0x01d8 }
            com.google.android.gms.common.util.e r7 = com.google.android.gms.ads.internal.zzbv.zzer()     // Catch:{ IOException -> 0x01d8 }
            long r7 = r7.mo11327b()     // Catch:{ IOException -> 0x01d8 }
            r9 = 0
            r10 = 0
        L_0x0042:
            if (r2 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.fe r11 = r2.f13827g     // Catch:{ IOException -> 0x01d8 }
            r11.mo12901a()     // Catch:{ IOException -> 0x01d8 }
        L_0x0049:
            java.net.URLConnection r11 = r6.openConnection()     // Catch:{ IOException -> 0x01d8 }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ IOException -> 0x01d8 }
            com.google.android.gms.internal.ads.jh r12 = com.google.android.gms.ads.internal.zzbv.zzek()     // Catch:{ all -> 0x01cc }
            r13 = r19
            r14 = r20
            r12.mo13127a(r13, r14, r9, r11)     // Catch:{ all -> 0x01cc }
            boolean r12 = r24.mo12891g()     // Catch:{ all -> 0x01cc }
            if (r12 == 0) goto L_0x007e
            boolean r12 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x01cc }
            if (r12 != 0) goto L_0x006e
            java.lang.String r12 = "x-afma-drt-cookie"
            r15 = r22
            r11.addRequestProperty(r12, r15)     // Catch:{ all -> 0x01cc }
            goto L_0x0070
        L_0x006e:
            r15 = r22
        L_0x0070:
            boolean r12 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x01cc }
            if (r12 != 0) goto L_0x0080
            java.lang.String r12 = "x-afma-drt-v2-cookie"
            r3 = r23
            r11.addRequestProperty(r12, r3)     // Catch:{ all -> 0x01cc }
            goto L_0x0082
        L_0x007e:
            r15 = r22
        L_0x0080:
            r3 = r23
        L_0x0082:
            java.lang.String r12 = r0.f15235H     // Catch:{ all -> 0x01cc }
            boolean r17 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x01cc }
            if (r17 != 0) goto L_0x0094
            java.lang.String r17 = "Sending webview cookie in ad request header."
            com.google.android.gms.internal.ads.C3643iy.m19172b(r17)     // Catch:{ all -> 0x01cc }
            java.lang.String r9 = "Cookie"
            r11.addRequestProperty(r9, r12)     // Catch:{ all -> 0x01cc }
        L_0x0094:
            r9 = 1
            if (r24 == 0) goto L_0x00cb
            java.lang.String r17 = r24.mo12888d()     // Catch:{ all -> 0x01cc }
            boolean r17 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x01cc }
            if (r17 != 0) goto L_0x00cb
            r11.setDoOutput(r9)     // Catch:{ all -> 0x01cc }
            java.lang.String r17 = r24.mo12888d()     // Catch:{ all -> 0x01cc }
            byte[] r9 = r17.getBytes()     // Catch:{ all -> 0x01cc }
            int r3 = r9.length     // Catch:{ all -> 0x01cc }
            r11.setFixedLengthStreamingMode(r3)     // Catch:{ all -> 0x01cc }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c4 }
            java.io.OutputStream r12 = r11.getOutputStream()     // Catch:{ all -> 0x00c4 }
            r3.<init>(r12)     // Catch:{ all -> 0x00c4 }
            r3.write(r9)     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.common.util.C3307l.m15066a(r3)     // Catch:{ all -> 0x01cc }
            goto L_0x00cc
        L_0x00c0:
            r0 = move-exception
            r16 = r3
            goto L_0x00c7
        L_0x00c4:
            r0 = move-exception
            r16 = 0
        L_0x00c7:
            com.google.android.gms.common.util.C3307l.m15066a(r16)     // Catch:{ all -> 0x01cc }
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x00cb:
            r9 = 0
        L_0x00cc:
            com.google.android.gms.internal.ads.lx r3 = new com.google.android.gms.internal.ads.lx     // Catch:{ all -> 0x01cc }
            java.lang.String r12 = r0.f15278v     // Catch:{ all -> 0x01cc }
            r3.<init>(r12)     // Catch:{ all -> 0x01cc }
            r3.mo13240a(r11, r9)     // Catch:{ all -> 0x01cc }
            int r9 = r11.getResponseCode()     // Catch:{ all -> 0x01cc }
            java.util.Map r12 = r11.getHeaderFields()     // Catch:{ all -> 0x01cc }
            r3.mo13239a(r11, r9)     // Catch:{ all -> 0x01cc }
            r0 = 200(0xc8, float:2.8E-43)
            r13 = 300(0x12c, float:4.2E-43)
            if (r9 < r0) goto L_0x0134
            if (r9 >= r13) goto L_0x0134
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x01cc }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x012d }
            java.io.InputStream r10 = r11.getInputStream()     // Catch:{ all -> 0x012d }
            r6.<init>(r10)     // Catch:{ all -> 0x012d }
            com.google.android.gms.ads.internal.zzbv.zzek()     // Catch:{ all -> 0x0129 }
            java.lang.String r10 = com.google.android.gms.internal.ads.C3653jh.m18868a(r6)     // Catch:{ all -> 0x0129 }
            com.google.android.gms.common.util.C3307l.m15066a(r6)     // Catch:{ all -> 0x01cc }
            r3.mo13237a(r10)     // Catch:{ all -> 0x01cc }
            m18338a(r0, r12, r10, r9)     // Catch:{ all -> 0x01cc }
            r5.mo12882a(r0, r12, r10)     // Catch:{ all -> 0x01cc }
            if (r1 == 0) goto L_0x0116
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x01cc }
            java.lang.String r3 = "ufe"
            r6 = 0
            r0[r6] = r3     // Catch:{ all -> 0x01cc }
            r1.mo12324a(r4, r0)     // Catch:{ all -> 0x01cc }
        L_0x0116:
            boolean r0 = r24.mo12894j()     // Catch:{ all -> 0x01cc }
            com.google.android.gms.internal.ads.zzaej r0 = r5.mo12881a(r7, r0)     // Catch:{ all -> 0x01cc }
            r11.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r2 == 0) goto L_0x0128
            com.google.android.gms.internal.ads.fe r1 = r2.f13827g     // Catch:{ IOException -> 0x01d8 }
            r1.mo12902b()     // Catch:{ IOException -> 0x01d8 }
        L_0x0128:
            return r0
        L_0x0129:
            r0 = move-exception
            r16 = r6
            goto L_0x0130
        L_0x012d:
            r0 = move-exception
            r16 = 0
        L_0x0130:
            com.google.android.gms.common.util.C3307l.m15066a(r16)     // Catch:{ all -> 0x01cc }
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x0134:
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x01cc }
            r3 = 0
            m18338a(r0, r12, r3, r9)     // Catch:{ all -> 0x01cc }
            if (r9 < r13) goto L_0x01a5
            r0 = 400(0x190, float:5.6E-43)
            if (r9 >= r0) goto L_0x01a5
            java.lang.String r0 = "Location"
            java.lang.String r0 = r11.getHeaderField(r0)     // Catch:{ all -> 0x01cc }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01cc }
            if (r6 == 0) goto L_0x0164
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)     // Catch:{ all -> 0x01cc }
            com.google.android.gms.internal.ads.zzaej r0 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x01cc }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x01cc }
            r11.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r2 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.fe r1 = r2.f13827g     // Catch:{ IOException -> 0x01d8 }
            r1.mo12902b()     // Catch:{ IOException -> 0x01d8 }
        L_0x0163:
            return r0
        L_0x0164:
            java.net.URL r6 = new java.net.URL     // Catch:{ all -> 0x01cc }
            r6.<init>(r0)     // Catch:{ all -> 0x01cc }
            r0 = 1
            int r10 = r10 + r0
            com.google.android.gms.internal.ads.aqc<java.lang.Integer> r0 = com.google.android.gms.internal.ads.aqm.f12825df     // Catch:{ all -> 0x01cc }
            com.google.android.gms.internal.ads.aqk r9 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x01cc }
            java.lang.Object r0 = r9.mo12297a(r0)     // Catch:{ all -> 0x01cc }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01cc }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01cc }
            if (r10 <= r0) goto L_0x0193
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)     // Catch:{ all -> 0x01cc }
            com.google.android.gms.internal.ads.zzaej r0 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x01cc }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x01cc }
            r11.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r2 == 0) goto L_0x0192
            com.google.android.gms.internal.ads.fe r1 = r2.f13827g     // Catch:{ IOException -> 0x01d8 }
            r1.mo12902b()     // Catch:{ IOException -> 0x01d8 }
        L_0x0192:
            return r0
        L_0x0193:
            r5.mo12883a(r12)     // Catch:{ all -> 0x01cc }
            r11.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r2 == 0) goto L_0x01a0
            com.google.android.gms.internal.ads.fe r0 = r2.f13827g     // Catch:{ IOException -> 0x01d8 }
            r0.mo12902b()     // Catch:{ IOException -> 0x01d8 }
        L_0x01a0:
            r0 = r18
            r9 = 0
            goto L_0x0042
        L_0x01a5:
            r0 = 46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cc }
            r1.<init>(r0)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "Received error HTTP response code: "
            r1.append(r0)     // Catch:{ all -> 0x01cc }
            r1.append(r9)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01cc }
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)     // Catch:{ all -> 0x01cc }
            com.google.android.gms.internal.ads.zzaej r0 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x01cc }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x01cc }
            r11.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r2 == 0) goto L_0x01cb
            com.google.android.gms.internal.ads.fe r1 = r2.f13827g     // Catch:{ IOException -> 0x01d8 }
            r1.mo12902b()     // Catch:{ IOException -> 0x01d8 }
        L_0x01cb:
            return r0
        L_0x01cc:
            r0 = move-exception
            r11.disconnect()     // Catch:{ IOException -> 0x01d8 }
            if (r2 == 0) goto L_0x01d7
            com.google.android.gms.internal.ads.fe r1 = r2.f13827g     // Catch:{ IOException -> 0x01d8 }
            r1.mo12902b()     // Catch:{ IOException -> 0x01d8 }
        L_0x01d7:
            throw r0     // Catch:{ IOException -> 0x01d8 }
        L_0x01d8:
            r0 = move-exception
            java.lang.String r1 = "Error while connecting to ad server: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x01ee
            java.lang.String r0 = r1.concat(r0)
            goto L_0x01f3
        L_0x01ee:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x01f3:
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)
            com.google.android.gms.internal.ads.zzaej r0 = new com.google.android.gms.internal.ads.zzaej
            r1 = 2
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3519ei.m18337a(com.google.android.gms.internal.ads.zzaef, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.eu, com.google.android.gms.internal.ads.aqz, com.google.android.gms.internal.ads.eh):com.google.android.gms.internal.ads.zzaej");
    }

    /* renamed from: a */
    private static void m18338a(String str, Map<String, List<String>> map, String str2, int i) {
        if (C3643iy.m19171a(2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            C3643iy.m18780a(sb.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    sb2.append("    ");
                    sb2.append(str3);
                    sb2.append(":");
                    C3643iy.m18780a(sb2.toString());
                    for (String valueOf : (List) map.get(str3)) {
                        String str4 = "      ";
                        String valueOf2 = String.valueOf(valueOf);
                        C3643iy.m18780a(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
                    }
                }
            }
            C3643iy.m18780a("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    C3643iy.m18780a(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                C3643iy.m18780a("    null");
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i);
            sb3.append("\n}");
            C3643iy.m18780a(sb3.toString());
        }
    }

    /* renamed from: a */
    public final zzaej mo12859a(zzaef zzaef) {
        return m18336a(this.f13835c, this.f13836d, zzaef, this.f13837e);
    }

    /* renamed from: a */
    public final void mo12860a(zzaef zzaef, C3496dn dnVar) {
        zzbv.zzeo().mo13044a(this.f13835c, zzaef.f15267k);
        C3751my a = C3651jf.m18855a((Runnable) new C3521ek(this, zzaef, dnVar));
        zzbv.zzez().mo13214a();
        zzbv.zzez().mo13215b().postDelayed(new C3522el(this, a), 60000);
    }

    /* renamed from: a */
    public final void mo12861a(zzaey zzaey, C3499dq dqVar) {
        C3643iy.m18780a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo12862b(zzaey zzaey, C3499dq dqVar) {
        C3643iy.m18780a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }
}
