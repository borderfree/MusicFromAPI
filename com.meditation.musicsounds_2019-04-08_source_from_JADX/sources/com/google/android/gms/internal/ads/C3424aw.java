package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbc;
import com.google.android.gms.ads.internal.zzbv;
import com.seattleclouds.modules.p176n.C5894b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.aw */
public final class C3424aw implements Callable<C3622id> {

    /* renamed from: a */
    private static long f13209a = 10;

    /* renamed from: b */
    private final Context f13210b;

    /* renamed from: c */
    private final C3690kr f13211c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzbc f13212d;

    /* renamed from: e */
    private final afm f13213e;

    /* renamed from: f */
    private final C3442bn f13214f;

    /* renamed from: g */
    private final Object f13215g = new Object();

    /* renamed from: h */
    private final C3623ie f13216h;

    /* renamed from: i */
    private final aqz f13217i;

    /* renamed from: j */
    private boolean f13218j;

    /* renamed from: k */
    private int f13219k;

    /* renamed from: l */
    private List<String> f13220l;

    /* renamed from: m */
    private JSONObject f13221m;

    /* renamed from: n */
    private String f13222n;

    /* renamed from: o */
    private String f13223o;

    public C3424aw(Context context, zzbc zzbc, C3690kr krVar, afm afm, C3623ie ieVar, aqz aqz) {
        this.f13210b = context;
        this.f13212d = zzbc;
        this.f13211c = krVar;
        this.f13216h = ieVar;
        this.f13213e = afm;
        this.f13217i = aqz;
        this.f13214f = zzbc.zzdr();
        this.f13218j = false;
        this.f13219k = -2;
        this.f13220l = null;
        this.f13222n = null;
        this.f13223o = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r3.length() != 0) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0157 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0158 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c2 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C3622id call() {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
            com.google.android.gms.ads.internal.zzbc r2 = r15.f13212d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r11 = r2.getUuid()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r2 = r15.m17513b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r2 != 0) goto L_0x006e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ie r3 = r15.f13216h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaej r3 = r3.f14161b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r3 = r3.f15308b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r2.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ie r4 = r15.f13216h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaej r4 = r4.f14161b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r4 = r4.f15308b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3.<init>(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            int r4 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r4 == 0) goto L_0x0040
            java.lang.String r4 = "ads"
            org.json.JSONArray r3 = r3.optJSONArray(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 == 0) goto L_0x0037
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x0038
        L_0x0037:
            r3 = r1
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 != 0) goto L_0x0044
        L_0x0040:
            r3 = 3
            r15.m17507a(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
        L_0x0044:
            com.google.android.gms.internal.ads.bn r3 = r15.f13214f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.my r2 = r3.mo12815a(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            long r3 = f13209a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.Object r2 = r2.get(r3, r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r3 = "success"
            boolean r3 = r2.optBoolean(r3, r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = "json"
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r3 = "ads"
            org.json.JSONArray r2 = r2.optJSONArray(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            org.json.JSONObject r2 = r2.getJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r8 = r2
            goto L_0x006f
        L_0x006e:
            r8 = r1
        L_0x006f:
            java.lang.String r2 = "enable_omid"
            boolean r2 = r8.optBoolean(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r2 != 0) goto L_0x007d
        L_0x0077:
            com.google.android.gms.internal.ads.mx r3 = com.google.android.gms.internal.ads.C3740mn.m19191a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r12 = r3
            goto L_0x00a3
        L_0x007d:
            java.lang.String r3 = "omid_settings"
            org.json.JSONObject r3 = r8.optJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 != 0) goto L_0x0086
            goto L_0x0077
        L_0x0086:
            java.lang.String r4 = "omid_html"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r4 == 0) goto L_0x0093
            goto L_0x0077
        L_0x0093:
            com.google.android.gms.internal.ads.nj r4 = new com.google.android.gms.internal.ads.nj     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r4.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.util.concurrent.Executor r5 = com.google.android.gms.internal.ads.C3758ne.f14481a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ax r6 = new com.google.android.gms.internal.ads.ax     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r6.<init>(r15, r4, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r5.execute(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r12 = r4
        L_0x00a3:
            boolean r3 = r15.m17513b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 != 0) goto L_0x014c
            if (r8 != 0) goto L_0x00ad
            goto L_0x014c
        L_0x00ad:
            java.lang.String r3 = "template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ie r4 = r15.f13216h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaef r4 = r4.f14160a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzpl r4 = r4.f15281y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r4 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.ie r4 = r15.f13216h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaef r4 = r4.f14160a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzpl r4 = r4.f15281y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r4 = r4.f15515b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x00c5
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            com.google.android.gms.internal.ads.ie r5 = r15.f13216h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaef r5 = r5.f14160a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzpl r5 = r5.f15281y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r5 == 0) goto L_0x00d6
            com.google.android.gms.internal.ads.ie r5 = r15.f13216h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaef r5 = r5.f14160a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzpl r5 = r5.f15281y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r5 = r5.f15517d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x00d7
        L_0x00d6:
            r5 = 0
        L_0x00d7:
            java.lang.String r6 = "2"
            boolean r6 = r6.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r6 == 0) goto L_0x00e9
            com.google.android.gms.internal.ads.bo r3 = new com.google.android.gms.internal.ads.bo     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ie r6 = r15.f13216h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r6 = r6.f14169j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3.<init>(r4, r5, r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x014d
        L_0x00e9:
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.bp r3 = new com.google.android.gms.internal.ads.bp     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ie r6 = r15.f13216h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            boolean r6 = r6.f14169j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3.<init>(r4, r5, r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x014d
        L_0x00fb:
            java.lang.String r5 = "3"
            boolean r3 = r5.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 == 0) goto L_0x0149
            java.lang.String r3 = "custom_template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.nj r5 = new com.google.android.gms.internal.ads.nj     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r5.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            android.os.Handler r6 = com.google.android.gms.internal.ads.C3653jh.f14275a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.az r7 = new com.google.android.gms.internal.ads.az     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r7.<init>(r15, r5, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r6.post(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            long r6 = f13209a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.Object r3 = r5.get(r6, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 == 0) goto L_0x0128
            com.google.android.gms.internal.ads.bq r3 = new com.google.android.gms.internal.ads.bq     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3.<init>(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x014d
        L_0x0128:
            java.lang.String r3 = "No handler for custom template: "
            java.lang.String r4 = "custom_template_id"
            java.lang.String r4 = r8.getString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            int r5 = r4.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r5 == 0) goto L_0x013f
            java.lang.String r3 = r3.concat(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x0145
        L_0x013f:
            java.lang.String r4 = new java.lang.String     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r4.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3 = r4
        L_0x0145:
            com.google.android.gms.internal.ads.C3643iy.m19174c(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x014c
        L_0x0149:
            r15.m17507a(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
        L_0x014c:
            r3 = r1
        L_0x014d:
            boolean r4 = r15.m17513b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r4 != 0) goto L_0x01bd
            if (r3 == 0) goto L_0x01bd
            if (r8 != 0) goto L_0x0158
            goto L_0x01bd
        L_0x0158:
            java.lang.String r4 = "tracking_urls_and_actions"
            org.json.JSONObject r4 = r8.getJSONObject(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r5 = "impression_tracking_urls"
            org.json.JSONArray r5 = r4.optJSONArray(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r5 != 0) goto L_0x0168
            r6 = r1
            goto L_0x017e
        L_0x0168:
            int r6 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r7 = 0
        L_0x016f:
            int r9 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r7 >= r9) goto L_0x017e
            java.lang.String r9 = r5.getString(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r6[r7] = r9     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            int r7 = r7 + 1
            goto L_0x016f
        L_0x017e:
            if (r6 != 0) goto L_0x0182
            r5 = r1
            goto L_0x0186
        L_0x0182:
            java.util.List r5 = java.util.Arrays.asList(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
        L_0x0186:
            r15.f13220l = r5     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r5 = "active_view"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r15.f13221m = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r4 = "debug_signals"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r15.f13222n = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r4 = "omid_settings"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r15.f13223o = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ase r13 = r3.mo12809a(r15, r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.asg r14 = new com.google.android.gms.internal.ads.asg     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            android.content.Context r4 = r15.f13210b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.ads.internal.zzbc r5 = r15.f13212d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.bn r6 = r15.f13214f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.afm r7 = r15.f13213e     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ie r3 = r15.f13216h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzaef r3 = r3.f14160a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.zzang r10 = r3.f15267k     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3 = r14
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r13.mo12359a(r14)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            goto L_0x01be
        L_0x01bd:
            r13 = r1
        L_0x01be:
            boolean r3 = r13 instanceof com.google.android.gms.internal.ads.aru     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            if (r3 == 0) goto L_0x01d1
            r3 = r13
            com.google.android.gms.internal.ads.aru r3 = (com.google.android.gms.internal.ads.aru) r3     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.ba r4 = new com.google.android.gms.internal.ads.ba     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r4.<init>(r15, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.bn r3 = r15.f13214f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            java.lang.String r5 = "/nativeAdCustomClick"
            r3.mo12817a(r5, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
        L_0x01d1:
            com.google.android.gms.internal.ads.id r2 = r15.m17503a(r13, r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.ads.internal.zzbc r3 = r15.f13212d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            com.google.android.gms.internal.ads.py r4 = m17510b(r12)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            r3.zzg(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df }
            return r2
        L_0x01df:
            r2 = move-exception
            java.lang.String r3 = "Error occured while doing native ads initialization."
            goto L_0x01ea
        L_0x01e3:
            r2 = move-exception
            java.lang.String r3 = "Timeout when loading native ad."
            goto L_0x01ea
        L_0x01e7:
            r2 = move-exception
            java.lang.String r3 = "Malformed native JSON response."
        L_0x01ea:
            com.google.android.gms.internal.ads.C3643iy.m19175c(r3, r2)
            boolean r2 = r15.f13218j
            if (r2 != 0) goto L_0x01f4
            r15.m17507a(r0)
        L_0x01f4:
            com.google.android.gms.internal.ads.id r0 = r15.m17503a(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3424aw.call():com.google.android.gms.internal.ads.id");
    }

    /* renamed from: a */
    private final C3622id m17503a(ase ase, boolean z) {
        int i;
        synchronized (this.f13215g) {
            i = (ase == null && this.f13219k == -2) ? 0 : this.f13219k;
        }
        C3622id idVar = new C3622id(this.f13216h.f14160a.f15259c, null, this.f13216h.f14161b.f15309c, i, this.f13216h.f14161b.f15311e, this.f13220l, this.f13216h.f14161b.f15317k, this.f13216h.f14161b.f15316j, this.f13216h.f14160a.f15265i, false, null, null, null, null, null, 0, this.f13216h.f14163d, this.f13216h.f14161b.f15312f, this.f13216h.f14165f, this.f13216h.f14166g, this.f13216h.f14161b.f15320n, this.f13221m, i != -2 ? null : ase, null, null, null, this.f13216h.f14161b.f15286D, this.f13216h.f14161b.f15287E, null, this.f13216h.f14161b.f15290H, this.f13222n, this.f13216h.f14168i, this.f13216h.f14161b.f15297O, this.f13216h.f14169j, z, this.f13216h.f14161b.f15300R, this.f13216h.f14161b.f15301S, this.f13223o);
        return idVar;
    }

    /* renamed from: a */
    private final C3751my<arp> m17504a(JSONObject jSONObject, boolean z, boolean z2) {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(string)) {
            mo12543a(0, z);
            return C3740mn.m19191a(null);
        } else if (z2) {
            return C3740mn.m19191a(new arp(null, Uri.parse(string), optDouble));
        } else {
            C3690kr krVar = this.f13211c;
            C3431bc bcVar = new C3431bc(this, z, optDouble, optBoolean, string);
            return krVar.mo13207a(string, (C3696kx<T>) bcVar);
        }
    }

    /* renamed from: a */
    static C3832py m17505a(C3751my<C3832py> myVar) {
        try {
            return (C3832py) myVar.get((long) ((Integer) ane.m16650f().mo12297a(aqm.f12769cc)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C3643iy.m19175c("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            C3643iy.m19175c("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    /* renamed from: a */
    private final void m17507a(int i) {
        synchronized (this.f13215g) {
            this.f13218j = true;
            this.f13219k = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17508a(atu atu, String str) {
        try {
            auf zzr = this.f13212d.zzr(atu.mo12372l());
            if (zzr != null) {
                zzr.mo12513a(atu, str);
            }
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            C3643iy.m19175c(sb.toString(), e);
        }
    }

    /* renamed from: b */
    private static C3832py m17510b(C3751my<C3832py> myVar) {
        try {
            return (C3832py) myVar.get((long) ((Integer) ane.m16650f().mo12297a(aqm.f12770cd)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            C3731me.m19175c("", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            C3731me.m19175c("", e2);
            return null;
        }
    }

    /* renamed from: b */
    private static Integer m17511b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt(C5894b.f20856a)));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <V> List<V> m17512b(List<C3751my<V>> list) {
        ArrayList arrayList = new ArrayList();
        for (C3751my myVar : list) {
            Object obj = myVar.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final boolean m17513b() {
        boolean z;
        synchronized (this.f13215g) {
            z = this.f13218j;
        }
        return z;
    }

    /* renamed from: a */
    public final C3751my<arl> mo12538a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return C3740mn.m19191a(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = m17511b(optJSONObject, "text_color");
        Integer b2 = m17511b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.f13216h.f14160a.f15281y == null || this.f13216h.f14160a.f15281y.f15514a < 2) ? 1 : this.f13216h.f14160a.f15281y.f15518e;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List<C3751my> arrayList = new ArrayList<>();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = mo12541a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(mo12540a(optJSONObject, "image", false, false));
        }
        C3763nj njVar = new C3763nj();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (C3751my a : arrayList) {
            List list = arrayList;
            a.mo13268a(new C3432bd(atomicInteger, size, njVar, arrayList), C3651jf.f14271a);
            arrayList = list;
        }
        C3763nj njVar2 = njVar;
        C3430bb bbVar = new C3430bb(this, optString, b2, b, optInt, optInt3, optInt2, i, optBoolean);
        return C3740mn.m19194a((C3751my<A>) njVar2, (C3736mj<A, B>) bbVar, (Executor) C3651jf.f14271a);
    }

    /* renamed from: a */
    public final C3751my<C3832py> mo12539a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return C3740mn.m19191a(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            C3643iy.m19178e("Required field 'vast_xml' is missing");
            return C3740mn.m19191a(null);
        }
        C3434bf bfVar = new C3434bf(this.f13210b, this.f13213e, this.f13216h, this.f13217i, this.f13212d);
        C3763nj njVar = new C3763nj();
        C3758ne.f14481a.execute(new C3435bg(bfVar, optJSONObject, njVar));
        return njVar;
    }

    /* renamed from: a */
    public final C3751my<arp> mo12540a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m17504a(jSONObject2, z, z2);
    }

    /* renamed from: a */
    public final List<C3751my<arp>> mo12541a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            mo12543a(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m17504a(jSONObject2, false, z2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Future<arp> mo12542a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m17504a(jSONObject2, optBoolean, z);
    }

    /* renamed from: a */
    public final void mo12543a(int i, boolean z) {
        if (z) {
            m17507a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12544a(C3763nj njVar, String str) {
        try {
            zzbv.zzel();
            C3832py a = C3840qf.m19490a(this.f13210b, C3873rl.m19690a(), "native-omid", false, false, this.f13213e, this.f13216h.f14160a.f15267k, this.f13217i, null, this.f13212d.zzbi(), this.f13216h.f14168i);
            a.mo13527t().mo13541a((C3868rg) new C3426ay(njVar, a));
            a.loadData(str, "text/html", "UTF-8");
        } catch (Exception e) {
            njVar.mo13296b(null);
            C3731me.m19175c("", e);
        }
    }
}
