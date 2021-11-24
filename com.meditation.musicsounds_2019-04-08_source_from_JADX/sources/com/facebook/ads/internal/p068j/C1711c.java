package com.facebook.ads.internal.p068j;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.ads.internal.p062d.C1682a;
import com.facebook.ads.internal.p066h.C1703d;
import com.facebook.ads.internal.p067i.C1704a;
import com.facebook.ads.internal.p067i.C1708b;
import com.facebook.ads.internal.p077s.p078a.C1787c;
import com.facebook.ads.internal.p077s.p078a.C1795g;
import com.facebook.ads.internal.p077s.p078a.C1795g.C1796a;
import com.facebook.ads.internal.p077s.p078a.C1797h;
import com.facebook.ads.internal.p077s.p078a.C1798i;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1801l;
import com.facebook.ads.internal.p077s.p078a.C1805o;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p078a.C1814u;
import com.facebook.ads.internal.settings.C1837b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.j.c */
public class C1711c {

    /* renamed from: a */
    public static int f5632a = 1303;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicInteger f5633b = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f5634c = null;

    /* renamed from: d */
    private static final C1796a f5635d = C1795g.m8900a();

    /* renamed from: e */
    private final Context f5636e;

    /* renamed from: f */
    private final C1708b f5637f;

    public C1711c(Context context, boolean z) {
        this.f5636e = context;
        this.f5637f = new C1708b(context);
        m8562a(context, z);
    }

    /* renamed from: a */
    private static void m8562a(final Context context, boolean z) {
        if (f5633b.compareAndSet(0, 1)) {
            try {
                C1801l.m8916a();
                final SharedPreferences sharedPreferences = context.getSharedPreferences("FBAdPrefs", 0);
                C1708b bVar = new C1708b(context);
                StringBuilder sb = new StringBuilder();
                sb.append("AFP;");
                sb.append(bVar.mo6893g());
                final String sb2 = sb.toString();
                f5634c = sharedPreferences.getString(sb2, null);
                FutureTask futureTask = new FutureTask(new Callable<Boolean>() {
                    /* renamed from: a */
                    public Boolean call() {
                        C1711c.f5634c = C1711c.m8564b(context, context.getPackageName());
                        sharedPreferences.edit().putString(sb2, C1711c.f5634c).apply();
                        C1711c.f5633b.set(2);
                        return Boolean.valueOf(true);
                    }
                });
                Executors.newSingleThreadExecutor().submit(futureTask);
                if (z) {
                    futureTask.get();
                }
            } catch (Exception unused) {
                f5633b.set(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m8564b(Context context, String str) {
        try {
            return C1798i.m8910a(context.getPackageManager().getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            Map a = new C1711c(context, false).mo6898a();
            a.put("subtype", "generic");
            a.put("subtype_code", String.valueOf(f5632a));
            C1703d.m8517a(e, context, a);
            return null;
        }
    }

    /* renamed from: a */
    public Map<String, String> mo6898a() {
        m8562a(this.f5636e, false);
        C1704a.m8532a(this.f5636e);
        HashMap hashMap = new HashMap();
        hashMap.put("SDK", "android");
        hashMap.put("SDK_VERSION", "5.0.0");
        hashMap.put("LOCALE", Locale.getDefault().toString());
        float f = C1808r.f5899b;
        int i = this.f5636e.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.f5636e.getResources().getDisplayMetrics().heightPixels;
        hashMap.put("DENSITY", String.valueOf(f));
        hashMap.put("SCREEN_WIDTH", String.valueOf((int) (((float) i) / f)));
        hashMap.put("SCREEN_HEIGHT", String.valueOf((int) (((float) i2) / f)));
        hashMap.put("ATTRIBUTION_ID", C1682a.f5523a);
        hashMap.put("ID_SOURCE", C1682a.f5526d);
        hashMap.put("OS", "Android");
        hashMap.put("OSVERS", C1708b.f5624a);
        hashMap.put("BUNDLE", this.f5637f.mo6892f());
        hashMap.put("APPNAME", this.f5637f.mo6890d());
        hashMap.put("APPVERS", this.f5637f.mo6893g());
        hashMap.put("APPBUILD", String.valueOf(this.f5637f.mo6894h()));
        hashMap.put("CARRIER", this.f5637f.mo6889c());
        hashMap.put("MAKE", this.f5637f.mo6887a());
        hashMap.put("MODEL", this.f5637f.mo6888b());
        hashMap.put("ROOTED", String.valueOf(f5635d.f5849d));
        hashMap.put("INSTALLER", this.f5637f.mo6891e());
        hashMap.put("SDK_CAPABILITY", C1787c.m8876b());
        hashMap.put("NETWORK_TYPE", String.valueOf(C1814u.m8949a(this.f5636e).f5919g));
        hashMap.put("SESSION_TIME", C1805o.m8920a(C1801l.m8917b()));
        hashMap.put("SESSION_ID", C1801l.m8918c());
        if (f5634c != null) {
            hashMap.put("AFP", f5634c);
        }
        String a = C1795g.m8901a(this.f5636e);
        if (a != null) {
            hashMap.put("ASHAS", a);
        }
        hashMap.put("UNITY", String.valueOf(C1797h.m8907a(this.f5636e)));
        String c = C1837b.m9008c();
        if (c != null) {
            hashMap.put("MEDIATION_SERVICE", c);
        }
        hashMap.put("ACCESSIBILITY_ENABLED", String.valueOf(this.f5637f.mo6895i()));
        if (this.f5637f.mo6896j() != -1) {
            hashMap.put("APP_MIN_SDK_VERSION", String.valueOf(this.f5637f.mo6896j()));
        }
        hashMap.put("VALPARAMS", C1710b.m8556a(this.f5636e));
        hashMap.put("ANALOG", C1800k.m8915a(C1704a.m8531a()));
        return hashMap;
    }
}
