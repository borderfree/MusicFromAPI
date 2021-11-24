package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C3309n;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@ParametersAreNonnullByDefault
@C3464ci
public final class ajo extends Thread {

    /* renamed from: a */
    private boolean f12206a = false;

    /* renamed from: b */
    private boolean f12207b = false;

    /* renamed from: c */
    private boolean f12208c = false;

    /* renamed from: d */
    private final Object f12209d;

    /* renamed from: e */
    private final ajj f12210e;

    /* renamed from: f */
    private final C3462cg f12211f;

    /* renamed from: g */
    private final int f12212g;

    /* renamed from: h */
    private final int f12213h;

    /* renamed from: i */
    private final int f12214i;

    /* renamed from: j */
    private final int f12215j;

    /* renamed from: k */
    private final int f12216k;

    /* renamed from: l */
    private final int f12217l;

    /* renamed from: m */
    private final int f12218m;

    /* renamed from: n */
    private final int f12219n;

    /* renamed from: o */
    private final String f12220o;

    /* renamed from: p */
    private final boolean f12221p;

    public ajo(ajj ajj, C3462cg cgVar) {
        this.f12210e = ajj;
        this.f12211f = cgVar;
        this.f12209d = new Object();
        this.f12213h = ((Integer) ane.m16650f().mo12297a(aqm.f12625R)).intValue();
        this.f12214i = ((Integer) ane.m16650f().mo12297a(aqm.f12626S)).intValue();
        this.f12215j = ((Integer) ane.m16650f().mo12297a(aqm.f12627T)).intValue();
        this.f12216k = ((Integer) ane.m16650f().mo12297a(aqm.f12628U)).intValue();
        this.f12217l = ((Integer) ane.m16650f().mo12297a(aqm.f12631X)).intValue();
        this.f12218m = ((Integer) ane.m16650f().mo12297a(aqm.f12633Z)).intValue();
        this.f12219n = ((Integer) ane.m16650f().mo12297a(aqm.f12661aa)).intValue();
        this.f12212g = ((Integer) ane.m16650f().mo12297a(aqm.f12629V)).intValue();
        this.f12220o = (String) ane.m16650f().mo12297a(aqm.f12663ac);
        this.f12221p = ((Boolean) ane.m16650f().mo12297a(aqm.f12665ae)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    private final ajs m16397a(View view, aji aji) {
        boolean z;
        if (view == null) {
            return new ajs(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new ajs(this, 0, 0);
            }
            aji.mo12009b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new ajs(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof C3832py)) {
            aji.mo12015g();
            WebView webView = (WebView) view;
            if (!C3309n.m15075g()) {
                z = false;
            } else {
                aji.mo12015g();
                webView.post(new ajq(this, aji, webView, globalVisibleRect));
                z = true;
            }
            return z ? new ajs(this, 0, 1) : new ajs(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new ajs(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                ajs a = m16397a(viewGroup.getChildAt(i3), aji);
                i += a.f12230a;
                i2 += a.f12231b;
            }
            return new ajs(this, i, i2);
        }
    }

    /* renamed from: e */
    private static boolean m16398e() {
        boolean z = false;
        try {
            Context b = zzbv.zzen().mo12028b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                            if (Process.myPid() == runningAppProcessInfo.pid) {
                                if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                    PowerManager powerManager = (PowerManager) b.getSystemService("power");
                                    if (powerManager == null ? false : powerManager.isScreenOn()) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
            }
            return z;
        } catch (Throwable th) {
            zzbv.zzeo().mo13047a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* renamed from: f */
    private final void m16399f() {
        synchronized (this.f12209d) {
            this.f12207b = true;
            boolean z = this.f12207b;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            C3643iy.m19172b(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo12042a() {
        synchronized (this.f12209d) {
            if (this.f12206a) {
                C3643iy.m19172b("Content hash thread already started, quiting...");
                return;
            }
            this.f12206a = true;
            start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12043a(View view) {
        try {
            aji aji = new aji(this.f12213h, this.f12214i, this.f12215j, this.f12216k, this.f12217l, this.f12218m, this.f12219n);
            Context b = zzbv.zzen().mo12028b();
            if (b != null && !TextUtils.isEmpty(this.f12220o)) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) ane.m16650f().mo12297a(aqm.f12662ab), "id", b.getPackageName()));
                if (str != null && str.equals(this.f12220o)) {
                    return;
                }
            }
            ajs a = m16397a(view, aji);
            aji.mo12016h();
            if (a.f12230a != 0 || a.f12231b != 0) {
                if (a.f12231b != 0 || aji.mo12019j() != 0) {
                    if (a.f12231b != 0 || !this.f12210e.mo12022a(aji)) {
                        this.f12210e.mo12024c(aji);
                    }
                }
            }
        } catch (Exception e) {
            C3643iy.m19173b("Exception in fetchContentOnUIThread", e);
            this.f12211f.mo12836a(e, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12044a(aji aji, WebView webView, String str, boolean z) {
        aji.mo12014f();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f12221p || TextUtils.isEmpty(webView.getTitle())) {
                    aji.mo12006a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    aji.mo12006a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (aji.mo12007a()) {
                this.f12210e.mo12023b(aji);
            }
        } catch (JSONException unused) {
            C3643iy.m19172b("Json string may be malformed.");
        } catch (Throwable th) {
            C3643iy.m19170a("Failed to get webview content.", th);
            this.f12211f.mo12836a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: b */
    public final aji mo12045b() {
        return this.f12210e.mo12021a();
    }

    /* renamed from: c */
    public final void mo12046c() {
        synchronized (this.f12209d) {
            this.f12207b = false;
            this.f12209d.notifyAll();
            C3643iy.m19172b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: d */
    public final boolean mo12047d() {
        return this.f12207b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        com.google.android.gms.internal.ads.C3643iy.m19173b("Error in ContentFetchTask", r0);
        r4.f12211f.mo12836a(r0, "ContentFetchTask.run");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        com.google.android.gms.internal.ads.C3643iy.m19173b("Error in ContentFetchTask", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007f */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[ExcHandler: InterruptedException (r0v1 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f A[LOOP:1: B:30:0x007f->B:42:0x007f, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = m16398e()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.ajk r0 = com.google.android.gms.ads.internal.zzbv.zzen()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            android.app.Activity r0 = r0.mo12025a()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.C3643iy.m19172b(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        L_0x0015:
            r4.m16399f()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x005f
        L_0x0019:
            if (r0 == 0) goto L_0x005f
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            if (r2 == 0) goto L_0x004c
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            if (r2 == 0) goto L_0x004c
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            com.google.android.gms.internal.ads.ii r2 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo13047a(r0, r3)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.C3643iy.m19172b(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        L_0x004c:
            if (r1 == 0) goto L_0x005f
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.ads.ajp r0 = new com.google.android.gms.internal.ads.ajp     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x005f
        L_0x0059:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.C3643iy.m19172b(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x0015
        L_0x005f:
            int r0 = r4.f12212g     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x007c
        L_0x0068:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.C3643iy.m19173b(r1, r0)
            com.google.android.gms.internal.ads.cg r1 = r4.f12211f
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo12836a(r0, r2)
            goto L_0x007c
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.C3643iy.m19173b(r1, r0)
        L_0x007c:
            java.lang.Object r0 = r4.f12209d
            monitor-enter(r0)
        L_0x007f:
            boolean r1 = r4.f12207b     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.C3643iy.m19172b(r1)     // Catch:{ InterruptedException -> 0x007f }
            java.lang.Object r1 = r4.f12209d     // Catch:{ InterruptedException -> 0x007f }
            r1.wait()     // Catch:{ InterruptedException -> 0x007f }
            goto L_0x007f
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x0000
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ajo.run():void");
    }
}
