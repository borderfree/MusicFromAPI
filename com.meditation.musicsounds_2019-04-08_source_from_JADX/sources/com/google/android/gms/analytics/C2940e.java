package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.measurement.C4270bi;
import com.google.android.gms.internal.measurement.C4286by;
import com.google.android.gms.internal.measurement.C4497s;
import com.google.android.gms.internal.measurement.C4499u;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/* renamed from: com.google.android.gms.analytics.e */
public class C2940e extends C4497s {

    /* renamed from: a */
    private boolean f10373a;

    /* renamed from: b */
    private final Map<String, String> f10374b = new HashMap();

    /* renamed from: c */
    private final Map<String, String> f10375c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4270bi f10376d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2941a f10377e;

    /* renamed from: com.google.android.gms.analytics.e$a */
    class C2941a extends C4497s {

        /* renamed from: a */
        private long f10378a = -1;

        /* renamed from: b */
        private boolean f10379b;

        protected C2941a(C4499u uVar) {
            super(uVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo10611a() {
        }

        /* renamed from: b */
        public final synchronized boolean mo10616b() {
            boolean z;
            z = this.f10379b;
            this.f10379b = false;
            return z;
        }
    }

    C2940e(C4499u uVar, String str, C4270bi biVar) {
        super(uVar);
        if (str != null) {
            this.f10374b.put("&tid", str);
        }
        this.f10374b.put("useSecure", "1");
        this.f10374b.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.f10376d = new C4270bi("tracking", mo14825h());
        this.f10377e = new C2941a(uVar);
    }

    /* renamed from: a */
    private static String m13754a(Entry<String, String> entry) {
        String str = (String) entry.getKey();
        if (!(str.startsWith("&") && str.length() >= 2)) {
            return null;
        }
        return ((String) entry.getKey()).substring(1);
    }

    /* renamed from: a */
    private static void m13755a(Map<String, String> map, Map<String, String> map2) {
        C3266s.m14913a(map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String a = m13754a(entry);
                if (a != null) {
                    map2.put(a, (String) entry.getValue());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10611a() {
        this.f10377e.mo14841y();
        String c = mo14833p().mo14213c();
        if (c != null) {
            mo10613a("&an", c);
        }
        String b = mo14833p().mo14212b();
        if (b != null) {
            mo10613a("&av", b);
        }
    }

    /* renamed from: a */
    public void mo10612a(String str) {
        mo10613a("&cd", str);
    }

    /* renamed from: a */
    public void mo10613a(String str, String str2) {
        C3266s.m14914a(str, (Object) "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.f10374b.put(str, str2);
        }
    }

    /* renamed from: a */
    public void mo10614a(Map<String, String> map) {
        long a = mo14825h().mo11326a();
        if (mo14830m().mo10605e()) {
            mo14815c("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean d = mo14830m().mo10604d();
        HashMap hashMap = new HashMap();
        m13755a(this.f10374b, (Map<String, String>) hashMap);
        m13755a(map, (Map<String, String>) hashMap);
        boolean a2 = C4286by.m21137a((String) this.f10374b.get("useSecure"), true);
        Map<String, String> map2 = this.f10375c;
        C3266s.m14913a(hashMap);
        if (map2 != null) {
            for (Entry entry : map2.entrySet()) {
                String a3 = m13754a(entry);
                if (a3 != null && !hashMap.containsKey(a3)) {
                    hashMap.put(a3, (String) entry.getValue());
                }
            }
        }
        this.f10375c.clear();
        String str = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str)) {
            mo14827j().mo14180a((Map<String, String>) hashMap, "Missing hit type parameter");
            return;
        }
        String str2 = (String) hashMap.get("tid");
        if (TextUtils.isEmpty(str2)) {
            mo14827j().mo14180a((Map<String, String>) hashMap, "Missing tracking id parameter");
            return;
        }
        boolean z = this.f10373a;
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || "pageview".equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt((String) this.f10374b.get("&a")) + 1;
                if (parseInt >= Integer.MAX_VALUE) {
                    parseInt = 1;
                }
                this.f10374b.put("&a", Integer.toString(parseInt));
            }
        }
        C2952p l = mo14829l();
        C2960u uVar = new C2960u(this, hashMap, z, str, a, d, a2, str2);
        l.mo10647a((Runnable) uVar);
    }

    /* renamed from: a */
    public void mo10615a(boolean z) {
        this.f10373a = z;
    }
}
