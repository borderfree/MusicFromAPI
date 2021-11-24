package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class ahw implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    protected final ahu f12064a;

    /* renamed from: b */
    private final Object f12065b = new Object();

    /* renamed from: c */
    private final WeakReference<C3622id> f12066c;

    /* renamed from: d */
    private WeakReference<ViewTreeObserver> f12067d;

    /* renamed from: e */
    private final ajh f12068e;

    /* renamed from: f */
    private final Context f12069f;

    /* renamed from: g */
    private final WindowManager f12070g;

    /* renamed from: h */
    private final PowerManager f12071h;

    /* renamed from: i */
    private final KeyguardManager f12072i;

    /* renamed from: j */
    private final DisplayMetrics f12073j;

    /* renamed from: k */
    private aie f12074k;

    /* renamed from: l */
    private boolean f12075l;

    /* renamed from: m */
    private boolean f12076m = false;

    /* renamed from: n */
    private boolean f12077n = false;

    /* renamed from: o */
    private boolean f12078o;

    /* renamed from: p */
    private boolean f12079p;

    /* renamed from: q */
    private boolean f12080q;

    /* renamed from: r */
    private BroadcastReceiver f12081r;

    /* renamed from: s */
    private final HashSet<aht> f12082s = new HashSet<>();

    /* renamed from: t */
    private C3708li f12083t;

    /* renamed from: u */
    private final HashSet<ais> f12084u = new HashSet<>();

    /* renamed from: v */
    private final Rect f12085v = new Rect();

    /* renamed from: w */
    private final ahz f12086w;

    /* renamed from: x */
    private float f12087x;

    public ahw(Context context, zzjn zzjn, C3622id idVar, zzang zzang, ajh ajh) {
        this.f12066c = new WeakReference<>(idVar);
        this.f12068e = ajh;
        this.f12067d = new WeakReference<>(null);
        this.f12078o = true;
        this.f12080q = false;
        this.f12083t = new C3708li(200);
        ahu ahu = new ahu(UUID.randomUUID().toString(), zzang, zzjn.f15499a, idVar.f14144k, idVar.mo13023a(), zzjn.f15506h);
        this.f12064a = ahu;
        this.f12070g = (WindowManager) context.getSystemService("window");
        this.f12071h = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f12072i = (KeyguardManager) context.getSystemService("keyguard");
        this.f12069f = context;
        this.f12086w = new ahz(this, new Handler());
        this.f12069f.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f12086w);
        this.f12073j = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.f12070g.getDefaultDisplay();
        this.f12085v.right = defaultDisplay.getWidth();
        this.f12085v.bottom = defaultDisplay.getHeight();
        mo11947a();
    }

    /* renamed from: a */
    private static int m16277a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    private final JSONObject m16278a(View view, Boolean bool) {
        if (view == null) {
            return m16283i().put("isAttachedToWindow", false).put("isScreenOn", m16284j()).put("isVisible", false);
        }
        boolean a = zzbv.zzem().mo13154a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            C3643iy.m19173b("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject i = m16283i();
        i.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", m16277a(this.f12085v.top, this.f12073j)).put("bottom", m16277a(this.f12085v.bottom, this.f12073j)).put("left", m16277a(this.f12085v.left, this.f12073j)).put("right", m16277a(this.f12085v.right, this.f12073j))).put("adBox", new JSONObject().put("top", m16277a(rect.top, this.f12073j)).put("bottom", m16277a(rect.bottom, this.f12073j)).put("left", m16277a(rect.left, this.f12073j)).put("right", m16277a(rect.right, this.f12073j))).put("globalVisibleBox", new JSONObject().put("top", m16277a(rect2.top, this.f12073j)).put("bottom", m16277a(rect2.bottom, this.f12073j)).put("left", m16277a(rect2.left, this.f12073j)).put("right", m16277a(rect2.right, this.f12073j))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m16277a(rect3.top, this.f12073j)).put("bottom", m16277a(rect3.bottom, this.f12073j)).put("left", m16277a(rect3.left, this.f12073j)).put("right", m16277a(rect3.right, this.f12073j))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m16277a(rect4.top, this.f12073j)).put("bottom", m16277a(rect4.bottom, this.f12073j)).put("left", m16277a(rect4.left, this.f12073j)).put("right", m16277a(rect4.right, this.f12073j))).put("screenDensity", (double) this.f12073j.density);
        if (bool == null) {
            bool = Boolean.valueOf(zzbv.zzek().mo13130a(view, this.f12071h, this.f12072i));
        }
        i.put("isVisible", bool.booleanValue());
        return i;
    }

    /* renamed from: a */
    private static JSONObject m16279a(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m16280a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject a = m16279a(jSONObject);
            ArrayList arrayList = new ArrayList(this.f12084u);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ais) obj).mo11971a(a, z);
            }
        } catch (Throwable th) {
            C3643iy.m19173b("Skipping active view message.", th);
        }
    }

    /* renamed from: g */
    private final void m16281g() {
        if (this.f12074k != null) {
            this.f12074k.mo11938a(this);
        }
    }

    /* renamed from: h */
    private final void m16282h() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f12067d.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    /* renamed from: i */
    private final JSONObject m16283i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f12064a.mo11933b()).put("activeViewJSON", this.f12064a.mo11934c()).put("timestamp", zzbv.zzer().mo11327b()).put("adFormat", this.f12064a.mo11932a()).put("hashCode", this.f12064a.mo11935d()).put("isMraid", this.f12064a.mo11936e()).put("isStopped", this.f12077n).put("isPaused", this.f12076m).put("isNative", this.f12064a.mo11937f()).put("isScreenOn", m16284j()).put("appMuted", zzbv.zzfj().mo13169b()).put("appVolume", (double) zzbv.zzfj().mo13166a()).put("deviceVolume", (double) this.f12087x);
        return jSONObject;
    }

    /* renamed from: j */
    private final boolean m16284j() {
        return VERSION.SDK_INT >= 20 ? this.f12071h.isInteractive() : this.f12071h.isScreenOn();
    }

    /* renamed from: a */
    public final void mo11947a() {
        this.f12087x = C3671jz.m18983a(this.f12069f);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cd, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11948a(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f12065b
            monitor-enter(r0)
            java.util.HashSet<com.google.android.gms.internal.ads.ais> r1 = r7.f12084u     // Catch:{ all -> 0x00ce }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ce }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ce }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.ais r2 = (com.google.android.gms.internal.ads.ais) r2     // Catch:{ all -> 0x00ce }
            boolean r2 = r2.mo11972a()     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0009
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x00cc
            boolean r1 = r7.f12078o     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x0028
            goto L_0x00cc
        L_0x0028:
            com.google.android.gms.internal.ads.ajh r1 = r7.f12068e     // Catch:{ all -> 0x00ce }
            android.view.View r1 = r1.mo11964a()     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.jh r2 = com.google.android.gms.ads.internal.zzbv.zzek()     // Catch:{ all -> 0x00ce }
            android.os.PowerManager r5 = r7.f12071h     // Catch:{ all -> 0x00ce }
            android.app.KeyguardManager r6 = r7.f12072i     // Catch:{ all -> 0x00ce }
            boolean r2 = r2.mo13130a(r1, r5, r6)     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            if (r1 == 0) goto L_0x0053
            if (r2 == 0) goto L_0x0053
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ all -> 0x00ce }
            r5.<init>()     // Catch:{ all -> 0x00ce }
            r6 = 0
            boolean r5 = r1.getGlobalVisibleRect(r5, r6)     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            com.google.android.gms.internal.ads.ajh r6 = r7.f12068e     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.mo11965b()     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x0061
            r7.mo11953b()     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x0061:
            if (r8 != r4) goto L_0x0071
            com.google.android.gms.internal.ads.li r6 = r7.f12083t     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.mo13219a()     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x0071
            boolean r6 = r7.f12080q     // Catch:{ all -> 0x00ce }
            if (r5 != r6) goto L_0x0071
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x0071:
            if (r5 != 0) goto L_0x007b
            boolean r6 = r7.f12080q     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x007b
            if (r8 != r4) goto L_0x007b
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x007b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            org.json.JSONObject r8 = r7.m16278a(r1, r8)     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            r7.m16280a(r8, r3)     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            r7.f12080q = r5     // Catch:{ RuntimeException | JSONException -> 0x0089 }
            goto L_0x008f
        L_0x0089:
            r8 = move-exception
            java.lang.String r1 = "Active view update failed."
            com.google.android.gms.internal.ads.C3643iy.m19170a(r1, r8)     // Catch:{ all -> 0x00ce }
        L_0x008f:
            com.google.android.gms.internal.ads.ajh r8 = r7.f12068e     // Catch:{ all -> 0x00ce }
            com.google.android.gms.internal.ads.ajh r8 = r8.mo11966c()     // Catch:{ all -> 0x00ce }
            android.view.View r8 = r8.mo11964a()     // Catch:{ all -> 0x00ce }
            if (r8 == 0) goto L_0x00c7
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r7.f12067d     // Catch:{ all -> 0x00ce }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00ce }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ all -> 0x00ce }
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()     // Catch:{ all -> 0x00ce }
            if (r8 == r1) goto L_0x00c7
            r7.m16282h()     // Catch:{ all -> 0x00ce }
            boolean r2 = r7.f12075l     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x00b8
            if (r1 == 0) goto L_0x00c0
            boolean r1 = r1.isAlive()     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x00c0
        L_0x00b8:
            r7.f12075l = r4     // Catch:{ all -> 0x00ce }
            r8.addOnScrollChangedListener(r7)     // Catch:{ all -> 0x00ce }
            r8.addOnGlobalLayoutListener(r7)     // Catch:{ all -> 0x00ce }
        L_0x00c0:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00ce }
            r1.<init>(r8)     // Catch:{ all -> 0x00ce }
            r7.f12067d = r1     // Catch:{ all -> 0x00ce }
        L_0x00c7:
            r7.m16281g()     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            return
        L_0x00ce:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ahw.mo11948a(int):void");
    }

    /* renamed from: a */
    public final void mo11949a(aie aie) {
        synchronized (this.f12065b) {
            this.f12074k = aie;
        }
    }

    /* renamed from: a */
    public final void mo11950a(ais ais) {
        if (this.f12084u.isEmpty()) {
            synchronized (this.f12065b) {
                if (this.f12081r == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.f12081r = new ahx(this);
                    zzbv.zzfk().mo13226a(this.f12069f, this.f12081r, intentFilter);
                }
            }
            mo11948a(3);
        }
        this.f12084u.add(ais);
        try {
            ais.mo11971a(m16279a(m16278a(this.f12068e.mo11964a(), (Boolean) null)), false);
        } catch (JSONException e) {
            C3643iy.m19173b("Skipping measurement update for new client.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11951a(ais ais, Map<String, String> map) {
        String str = "Received request to untrack: ";
        String valueOf = String.valueOf(this.f12064a.mo11935d());
        C3643iy.m19172b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        mo11954b(ais);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo11952a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f12064a.mo11935d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11953b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12065b
            monitor-enter(r0)
            boolean r1 = r5.f12078o     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0044
            r1 = 1
            r5.f12079p = r1     // Catch:{ all -> 0x0046 }
            org.json.JSONObject r2 = r5.m16283i()     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            java.lang.String r3 = "doneReasonCode"
            java.lang.String r4 = "u"
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            r5.m16280a(r2, r1)     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            goto L_0x0024
        L_0x0019:
            r1 = move-exception
            java.lang.String r2 = "Failure while processing active view data."
        L_0x001c:
            com.google.android.gms.internal.ads.C3643iy.m19173b(r2, r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0024
        L_0x0020:
            r1 = move-exception
            java.lang.String r2 = "JSON failure while processing active view data."
            goto L_0x001c
        L_0x0024:
            java.lang.String r1 = "Untracking ad unit: "
            com.google.android.gms.internal.ads.ahu r2 = r5.f12064a     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = r2.mo11935d()     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0046 }
            int r3 = r2.length()     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x003b
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x0041
        L_0x003b:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0046 }
            r2.<init>(r1)     // Catch:{ all -> 0x0046 }
            r1 = r2
        L_0x0041:
            com.google.android.gms.internal.ads.C3643iy.m19172b(r1)     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ahw.mo11953b():void");
    }

    /* renamed from: b */
    public final void mo11954b(ais ais) {
        this.f12084u.remove(ais);
        ais.mo11973b();
        if (this.f12084u.isEmpty()) {
            synchronized (this.f12065b) {
                m16282h();
                synchronized (this.f12065b) {
                    if (this.f12081r != null) {
                        try {
                            zzbv.zzfk().mo13225a(this.f12069f, this.f12081r);
                        } catch (IllegalStateException e) {
                            C3643iy.m19173b("Failed trying to unregister the receiver", e);
                        } catch (Exception e2) {
                            zzbv.zzeo().mo13047a((Throwable) e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.f12081r = null;
                    }
                }
                this.f12069f.getContentResolver().unregisterContentObserver(this.f12086w);
                int i = 0;
                this.f12078o = false;
                m16281g();
                ArrayList arrayList = new ArrayList(this.f12084u);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mo11954b((ais) obj);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo11955b(Map<String, String> map) {
        mo11948a(3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo11956c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            Iterator it = this.f12082s.iterator();
            while (it.hasNext()) {
                ((aht) it.next()).mo11931a(this, z);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo11957c() {
        boolean z;
        synchronized (this.f12065b) {
            z = this.f12078o;
        }
        return z;
    }

    /* renamed from: d */
    public final void mo11958d() {
        synchronized (this.f12065b) {
            this.f12077n = true;
            mo11948a(3);
        }
    }

    /* renamed from: e */
    public final void mo11959e() {
        synchronized (this.f12065b) {
            this.f12076m = true;
            mo11948a(3);
        }
    }

    /* renamed from: f */
    public final void mo11960f() {
        synchronized (this.f12065b) {
            this.f12076m = false;
            mo11948a(3);
        }
    }

    public final void onGlobalLayout() {
        mo11948a(2);
    }

    public final void onScrollChanged() {
        mo11948a(1);
    }
}
