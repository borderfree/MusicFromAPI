package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.common.util.p125a.C3294b;
import com.google.android.gms.tasks.C4793c;
import com.google.android.gms.tasks.C4796f;
import com.google.android.gms.tasks.C4797g;
import com.google.android.gms.tasks.C4800i;
import com.google.firebase.C4879a;
import com.google.firebase.C4890b;
import com.google.firebase.p134a.C4881b;
import com.google.firebase.p134a.C4883d;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.slf4j.Marker;

public class FirebaseInstanceId {

    /* renamed from: a */
    private static final long f17670a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b */
    private static C4971x f17671b;
    @GuardedBy("FirebaseInstanceId.class")

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor f17672c;

    /* renamed from: d */
    private final Executor f17673d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4890b f17674e;

    /* renamed from: f */
    private final C4962o f17675f;

    /* renamed from: g */
    private C4949b f17676g;

    /* renamed from: h */
    private final C4965r f17677h;

    /* renamed from: i */
    private final C4925ac f17678i;
    @GuardedBy("this")

    /* renamed from: j */
    private boolean f17679j;

    /* renamed from: k */
    private final C4919a f17680k;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    private class C4919a {

        /* renamed from: b */
        private final boolean f17682b = m24531c();

        /* renamed from: c */
        private final C4883d f17683c;
        @GuardedBy("this")

        /* renamed from: d */
        private C4881b<C4879a> f17684d;
        @GuardedBy("this")

        /* renamed from: e */
        private Boolean f17685e = m24530b();

        C4919a(C4883d dVar) {
            this.f17683c = dVar;
            if (this.f17685e == null && this.f17682b) {
                this.f17684d = new C4939aq(this);
                dVar.mo16085a(C4879a.class, this.f17684d);
            }
        }

        /* renamed from: b */
        private final Boolean m24530b() {
            Context a = FirebaseInstanceId.this.f17674e.mo16095a();
            SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled"))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        /* renamed from: c */
        private final boolean m24531c() {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a = FirebaseInstanceId.this.f17674e.mo16095a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a.getPackageName());
                ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized void mo16172a(boolean z) {
            if (this.f17684d != null) {
                this.f17683c.mo16087b(C4879a.class, this.f17684d);
                this.f17684d = null;
            }
            Editor edit = FirebaseInstanceId.this.f17674e.mo16095a().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.m24506o();
            }
            this.f17685e = Boolean.valueOf(z);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            return r1.f17682b && com.google.firebase.iid.FirebaseInstanceId.m24497a(r1.f17681a).mo16099e();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo16173a() {
            /*
                r1 = this;
                monitor-enter(r1)
                java.lang.Boolean r0 = r1.f17685e     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x000d
                java.lang.Boolean r0 = r1.f17685e     // Catch:{ all -> 0x0022 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0022 }
                monitor-exit(r1)
                return r0
            L_0x000d:
                boolean r0 = r1.f17682b     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0020
                com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x0022 }
                com.google.firebase.b r0 = r0.f17674e     // Catch:{ all -> 0x0022 }
                boolean r0 = r0.mo16099e()     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0020
                r0 = 1
            L_0x001e:
                monitor-exit(r1)
                return r0
            L_0x0020:
                r0 = 0
                goto L_0x001e
            L_0x0022:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.C4919a.mo16173a():boolean");
        }
    }

    FirebaseInstanceId(C4890b bVar, C4883d dVar) {
        this(bVar, new C4962o(bVar.mo16095a()), C4932aj.m24561b(), C4932aj.m24561b(), dVar);
    }

    private FirebaseInstanceId(C4890b bVar, C4962o oVar, Executor executor, Executor executor2, C4883d dVar) {
        this.f17679j = false;
        if (C4962o.m24639a(bVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f17671b == null) {
                    f17671b = new C4971x(bVar.mo16095a());
                }
            }
            this.f17674e = bVar;
            this.f17675f = oVar;
            if (this.f17676g == null) {
                C4949b bVar2 = (C4949b) bVar.mo16096a(C4949b.class);
                if (bVar2 == null || !bVar2.mo16207b()) {
                    bVar2 = new C4940ar(bVar, oVar, executor);
                }
                this.f17676g = bVar2;
            }
            this.f17676g = this.f17676g;
            this.f17673d = executor2;
            this.f17678i = new C4925ac(f17671b);
            this.f17680k = new C4919a(dVar);
            this.f17677h = new C4965r(executor);
            if (this.f17680k.mo16173a()) {
                m24506o();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: a */
    public static FirebaseInstanceId m24498a() {
        return getInstance(C4890b.m24415d());
    }

    /* renamed from: a */
    private final <T> T m24499a(C4796f<T> fVar) {
        try {
            return C4800i.m24064a(fVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo16166i();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: a */
    static void m24500a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f17672c == null) {
                f17672c = new ScheduledThreadPoolExecutor(1, new C3294b("FirebaseInstanceId"));
            }
            f17672c.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: b */
    private final C4796f<C4921a> m24501b(String str, String str2) {
        String c = m24504c(str2);
        C4797g gVar = new C4797g();
        Executor executor = this.f17673d;
        C4936an anVar = new C4936an(this, str, str2, gVar, c);
        executor.execute(anVar);
        return gVar.mo15929a();
    }

    /* renamed from: c */
    private static C4972y m24503c(String str, String str2) {
        return f17671b.mo16246a("", str, str2);
    }

    /* renamed from: c */
    private static String m24504c(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? Marker.ANY_MARKER : str;
    }

    @Keep
    public static FirebaseInstanceId getInstance(C4890b bVar) {
        return (FirebaseInstanceId) bVar.mo16096a(FirebaseInstanceId.class);
    }

    /* renamed from: h */
    static boolean m24505h() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m24506o() {
        C4972y f = mo16164f();
        if (!mo16168k() || f == null || f.mo16253b(this.f17675f.mo16237b()) || this.f17678i.mo16184a()) {
            m24507p();
        }
    }

    /* renamed from: p */
    private final synchronized void m24507p() {
        if (!this.f17679j) {
            mo16153a(0);
        }
    }

    /* renamed from: q */
    private static String m24508q() {
        return C4962o.m24640a(f17671b.mo16250b("").mo16213a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C4796f mo16151a(String str, String str2, String str3, String str4) {
        return this.f17676g.mo16203a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public String mo16152a(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C4921a) m24499a(m24501b(str, str2))).mo16178a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo16153a(long j) {
        C4973z zVar = new C4973z(this, this.f17675f, this.f17678i, Math.min(Math.max(30, j << 1), f17670a));
        m24500a((Runnable) zVar, j);
        this.f17679j = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16154a(String str) {
        C4972y f = mo16164f();
        if (f == null || f.mo16253b(this.f17675f.mo16237b())) {
            throw new IOException("token not available");
        }
        m24499a(this.f17676g.mo16202a(m24508q(), f.f17801a, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo16155a(String str, String str2, C4797g gVar, String str3) {
        String q = m24508q();
        C4972y c = m24503c(str, str2);
        if (c == null || c.mo16253b(this.f17675f.mo16237b())) {
            String a = C4972y.m24679a(c);
            C4965r rVar = this.f17677h;
            C4937ao aoVar = new C4937ao(this, q, a, str, str3);
            C4796f a2 = rVar.mo16241a(str, str3, aoVar);
            Executor executor = this.f17673d;
            C4938ap apVar = new C4938ap(this, str, str3, gVar, q);
            a2.mo15919a(executor, (C4793c<TResult>) apVar);
            return;
        }
        gVar.mo15931a(new C4946ax(q, c.f17801a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo16156a(String str, String str2, C4797g gVar, String str3, C4796f fVar) {
        if (fVar.mo15925b()) {
            String str4 = (String) fVar.mo15927d();
            f17671b.mo16249a("", str, str2, str4, this.f17675f.mo16237b());
            gVar.mo15931a(new C4946ax(str3, str4));
            return;
        }
        gVar.mo15930a(fVar.mo15928e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo16157a(boolean z) {
        this.f17679j = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C4890b mo16158b() {
        return this.f17674e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16159b(String str) {
        C4972y f = mo16164f();
        if (f == null || f.mo16253b(this.f17675f.mo16237b())) {
            throw new IOException("token not available");
        }
        m24499a(this.f17676g.mo16206b(m24508q(), f.f17801a, str));
    }

    /* renamed from: b */
    public final void mo16160b(boolean z) {
        this.f17680k.mo16172a(z);
    }

    /* renamed from: c */
    public String mo16161c() {
        m24506o();
        return m24508q();
    }

    /* renamed from: d */
    public C4796f<C4921a> mo16162d() {
        return m24501b(C4962o.m24639a(this.f17674e), Marker.ANY_MARKER);
    }

    /* renamed from: e */
    public void mo16163e() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            m24499a(this.f17676g.mo16200a(m24508q()));
            mo16166i();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C4972y mo16164f() {
        return m24503c(C4962o.m24639a(this.f17674e), Marker.ANY_MARKER);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final String mo16165g() {
        return mo16152a(C4962o.m24639a(this.f17674e), Marker.ANY_MARKER);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final synchronized void mo16166i() {
        f17671b.mo16251b();
        if (this.f17680k.mo16173a()) {
            m24507p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo16167j() {
        return this.f17676g.mo16207b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo16168k() {
        return this.f17676g.mo16205a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo16169l() {
        m24499a(this.f17676g.mo16201a(m24508q(), C4972y.m24679a(mo16164f())));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final void mo16170m() {
        f17671b.mo16252c("");
        m24507p();
    }

    /* renamed from: n */
    public final boolean mo16171n() {
        return this.f17680k.mo16173a();
    }
}
