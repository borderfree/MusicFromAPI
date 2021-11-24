package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.dr */
public abstract class C4333dr<T> {

    /* renamed from: a */
    private static final Object f16028a = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static Context f16029b = null;

    /* renamed from: c */
    private static boolean f16030c = false;

    /* renamed from: g */
    private static final AtomicInteger f16031g = new AtomicInteger();

    /* renamed from: d */
    private final C4339dx f16032d;

    /* renamed from: e */
    private final String f16033e;

    /* renamed from: f */
    private final T f16034f;

    /* renamed from: h */
    private volatile int f16035h;

    /* renamed from: i */
    private volatile T f16036i;

    private C4333dr(C4339dx dxVar, String str, T t) {
        this.f16035h = -1;
        if (dxVar.f16038b != null) {
            this.f16032d = dxVar;
            this.f16033e = str;
            this.f16034f = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* synthetic */ C4333dr(C4339dx dxVar, String str, Object obj, C4334ds dsVar) {
        this(dxVar, str, obj);
    }

    /* renamed from: a */
    private final String m21272a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f16033e;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f16033e);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    static void m21273a() {
        f16031g.incrementAndGet();
    }

    /* renamed from: a */
    public static void m21274a(Context context) {
        synchronized (f16028a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f16029b != context) {
                synchronized (C4321df.class) {
                    C4321df.f16014a.clear();
                }
                synchronized (C4340dy.class) {
                    C4340dy.f16044a.clear();
                }
                synchronized (C4329dn.class) {
                    C4329dn.f16024a = null;
                }
                f16031g.incrementAndGet();
                f16029b = context;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4333dr<Double> m21275b(C4339dx dxVar, String str, double d) {
        return new C4337dv(dxVar, str, Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4333dr<Integer> m21276b(C4339dx dxVar, String str, int i) {
        return new C4335dt(dxVar, str, Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4333dr<Long> m21277b(C4339dx dxVar, String str, long j) {
        return new C4334ds(dxVar, str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4333dr<String> m21278b(C4339dx dxVar, String str, String str2) {
        return new C4338dw(dxVar, str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4333dr<Boolean> m21279b(C4339dx dxVar, String str, boolean z) {
        return new C4336du(dxVar, str, Boolean.valueOf(z));
    }

    @Nullable
    /* renamed from: e */
    private final T m21280e() {
        C4326dk dkVar;
        C4339dx dxVar = this.f16032d;
        String str = (String) C4329dn.m21261a(f16029b).mo14275a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (!(str != null && C4318dc.f16000b.matcher(str).matches())) {
            if (this.f16032d.f16038b != null) {
                dkVar = C4321df.m21246a(f16029b.getContentResolver(), this.f16032d.f16038b);
            } else {
                Context context = f16029b;
                C4339dx dxVar2 = this.f16032d;
                dkVar = C4340dy.m21302a(context, (String) null);
            }
            if (dkVar != null) {
                Object a = dkVar.mo14275a(mo14285b());
                if (a != null) {
                    return mo14284a(a);
                }
            }
        } else {
            String str2 = "PhenotypeFlag";
            String str3 = "Bypass reading Phenotype values for flag: ";
            String valueOf = String.valueOf(mo14285b());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    private final T m21281f() {
        C4339dx dxVar = this.f16032d;
        C4329dn a = C4329dn.m21261a(f16029b);
        C4339dx dxVar2 = this.f16032d;
        Object a2 = a.mo14275a(m21272a(this.f16032d.f16039c));
        if (a2 != null) {
            return mo14284a(a2);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo14284a(Object obj);

    /* renamed from: b */
    public final String mo14285b() {
        return m21272a(this.f16032d.f16040d);
    }

    /* renamed from: c */
    public final T mo14286c() {
        return this.f16034f;
    }

    /* renamed from: d */
    public final T mo14287d() {
        int i = f16031g.get();
        if (this.f16035h < i) {
            synchronized (this) {
                if (this.f16035h < i) {
                    if (f16029b != null) {
                        C4339dx dxVar = this.f16032d;
                        T e = m21280e();
                        if (e == null) {
                            e = m21281f();
                            if (e == null) {
                                e = this.f16034f;
                            }
                        }
                        this.f16036i = e;
                        this.f16035h = i;
                    } else {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                }
            }
        }
        return this.f16036i;
    }
}
