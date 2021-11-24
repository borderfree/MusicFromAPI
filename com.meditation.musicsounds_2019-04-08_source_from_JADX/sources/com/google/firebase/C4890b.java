package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p019g.C0488a;
import android.util.Log;
import com.google.android.gms.common.api.internal.C3080b;
import com.google.android.gms.common.api.internal.C3080b.C3081a;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.common.util.C3311p;
import com.google.firebase.components.C4900a;
import com.google.firebase.components.C4900a.C49011;
import com.google.firebase.components.C4911j;
import com.google.firebase.p134a.C4882c;
import com.google.firebase.p136c.C4899a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.b */
public class C4890b {
    @GuardedBy("LOCK")

    /* renamed from: a */
    static final Map<String, C4890b> f17593a = new C0488a();

    /* renamed from: b */
    private static final List<String> f17594b = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});

    /* renamed from: c */
    private static final List<String> f17595c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: d */
    private static final List<String> f17596d = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});

    /* renamed from: e */
    private static final List<String> f17597e = Arrays.asList(new String[0]);

    /* renamed from: f */
    private static final Set<String> f17598f = Collections.emptySet();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Object f17599g = new Object();

    /* renamed from: h */
    private static final Executor f17600h = new C4894d(0);

    /* renamed from: i */
    private final Context f17601i;

    /* renamed from: j */
    private final String f17602j;

    /* renamed from: k */
    private final C4897c f17603k;

    /* renamed from: l */
    private final C4911j f17604l;

    /* renamed from: m */
    private final SharedPreferences f17605m;

    /* renamed from: n */
    private final C4882c f17606n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final AtomicBoolean f17607o = new AtomicBoolean(false);

    /* renamed from: p */
    private final AtomicBoolean f17608p = new AtomicBoolean();

    /* renamed from: q */
    private final AtomicBoolean f17609q;

    /* renamed from: r */
    private final List<Object> f17610r = new CopyOnWriteArrayList();

    /* renamed from: s */
    private final List<C4891a> f17611s = new CopyOnWriteArrayList();

    /* renamed from: t */
    private final List<Object> f17612t = new CopyOnWriteArrayList();

    /* renamed from: u */
    private C4892b f17613u;

    /* renamed from: com.google.firebase.b$a */
    public interface C4891a {
        /* renamed from: a */
        void mo16104a(boolean z);
    }

    @Deprecated
    /* renamed from: com.google.firebase.b$b */
    public interface C4892b {
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.b$c */
    static class C4893c implements C3081a {

        /* renamed from: a */
        private static AtomicReference<C4893c> f17614a = new AtomicReference<>();

        private C4893c() {
        }

        /* renamed from: a */
        static /* synthetic */ void m24427a(Context context) {
            if (C3309n.m15070b() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f17614a.get() == null) {
                    C4893c cVar = new C4893c();
                    if (f17614a.compareAndSet(null, cVar)) {
                        C3080b.m14206a(application);
                        C3080b.m14205a().mo10940a((C3081a) cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo10936a(boolean z) {
            synchronized (C4890b.f17599g) {
                Iterator it = new ArrayList(C4890b.f17593a.values()).iterator();
                while (it.hasNext()) {
                    C4890b bVar = (C4890b) it.next();
                    if (bVar.f17607o.get()) {
                        bVar.m24412a(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.b$d */
    static class C4894d implements Executor {

        /* renamed from: a */
        private static final Handler f17615a = new Handler(Looper.getMainLooper());

        private C4894d() {
        }

        /* synthetic */ C4894d(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            f17615a.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.b$e */
    static class C4895e extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<C4895e> f17616a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f17617b;

        private C4895e(Context context) {
            this.f17617b = context;
        }

        /* renamed from: a */
        static /* synthetic */ void m24429a(Context context) {
            if (f17616a.get() == null) {
                C4895e eVar = new C4895e(context);
                if (f17616a.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (C4890b.f17599g) {
                for (C4890b a : C4890b.f17593a.values()) {
                    a.m24419j();
                }
            }
            this.f17617b.unregisterReceiver(this);
        }
    }

    private C4890b(Context context, String str, C4897c cVar) {
        this.f17601i = (Context) C3266s.m14913a(context);
        this.f17602j = C3266s.m14915a(str);
        this.f17603k = (C4897c) C3266s.m14913a(cVar);
        this.f17613u = new C4899a();
        this.f17605m = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
        this.f17609q = new AtomicBoolean(m24417h());
        List a = C49011.m24447a(context).mo16125a();
        this.f17604l = new C4911j(f17600h, a, C4900a.m24439a(context, Context.class, new Class[0]), C4900a.m24439a(this, C4890b.class, new Class[0]), C4900a.m24439a(cVar, C4897c.class, new Class[0]));
        this.f17606n = (C4882c) this.f17604l.mo16131a(C4882c.class);
    }

    /* renamed from: a */
    public static C4890b m24406a(Context context, C4897c cVar) {
        return m24407a(context, cVar, "[DEFAULT]");
    }

    /* renamed from: a */
    public static C4890b m24407a(Context context, C4897c cVar, String str) {
        C4890b bVar;
        C4893c.m24427a(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f17599g) {
            boolean z = !f17593a.containsKey(trim);
            StringBuilder sb = new StringBuilder("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            C3266s.m14920a(z, (Object) sb.toString());
            C3266s.m14914a(context, (Object) "Application context cannot be null.");
            bVar = new C4890b(context, trim, cVar);
            f17593a.put(trim, bVar);
        }
        bVar.m24419j();
        return bVar;
    }

    /* renamed from: a */
    public static List<C4890b> m24408a(Context context) {
        ArrayList arrayList;
        synchronized (f17599g) {
            arrayList = new ArrayList(f17593a.values());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static <T> void m24411a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            if (z) {
                try {
                    if (f17597e.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (!f17598f.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" is not linked. Skipping initialization.");
                        Log.d("FirebaseApp", sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" is missing, but is required. Check if it has been removed by Proguard.");
                        throw new IllegalStateException(sb2.toString());
                    }
                } catch (NoSuchMethodException unused2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                    throw new IllegalStateException(sb3.toString());
                } catch (InvocationTargetException e) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    StringBuilder sb4 = new StringBuilder("Failed to initialize ");
                    sb4.append(str);
                    Log.wtf("FirebaseApp", sb4.toString(), e2);
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24412a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C4891a a : this.f17611s) {
            a.mo16104a(z);
        }
    }

    /* renamed from: b */
    public static C4890b m24413b(Context context) {
        synchronized (f17599g) {
            if (f17593a.containsKey("[DEFAULT]")) {
                C4890b d = m24415d();
                return d;
            }
            C4897c a = C4897c.m24431a(context);
            if (a == null) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            C4890b a2 = m24406a(context, a);
            return a2;
        }
    }

    /* renamed from: d */
    public static C4890b m24415d() {
        C4890b bVar;
        synchronized (f17599g) {
            bVar = (C4890b) f17593a.get("[DEFAULT]");
            if (bVar == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                sb.append(C3311p.m15084a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return bVar;
    }

    /* renamed from: h */
    private boolean m24417h() {
        if (this.f17605m.contains("firebase_data_collection_default_enabled")) {
            return this.f17605m.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f17601i.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f17601i.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                    return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: i */
    private void m24418i() {
        C3266s.m14920a(!this.f17608p.get(), (Object) "FirebaseApp was deleted");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m24419j() {
        boolean c = C0452b.m2069c(this.f17601i);
        if (c) {
            C4895e.m24429a(this.f17601i);
        } else {
            this.f17604l.mo16140a(mo16101f());
        }
        m24411a(C4890b.class, this, f17594b, c);
        if (mo16101f()) {
            m24411a(C4890b.class, this, f17595c, c);
            m24411a(Context.class, this.f17601i, f17596d, c);
        }
    }

    /* renamed from: a */
    public Context mo16095a() {
        m24418i();
        return this.f17601i;
    }

    /* renamed from: a */
    public <T> T mo16096a(Class<T> cls) {
        m24418i();
        return this.f17604l.mo16131a((Class) cls);
    }

    /* renamed from: b */
    public String mo16097b() {
        m24418i();
        return this.f17602j;
    }

    /* renamed from: c */
    public C4897c mo16098c() {
        m24418i();
        return this.f17603k;
    }

    /* renamed from: e */
    public boolean mo16099e() {
        m24418i();
        return this.f17609q.get();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4890b)) {
            return false;
        }
        return this.f17602j.equals(((C4890b) obj).mo16097b());
    }

    /* renamed from: f */
    public boolean mo16101f() {
        return "[DEFAULT]".equals(mo16097b());
    }

    public int hashCode() {
        return this.f17602j.hashCode();
    }

    public String toString() {
        return C3261q.m14905a((Object) this).mo11288a("name", this.f17602j).mo11288a("options", this.f17603k).toString();
    }
}
