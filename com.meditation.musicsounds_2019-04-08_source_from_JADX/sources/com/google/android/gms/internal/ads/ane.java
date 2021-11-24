package com.google.android.gms.internal.ads;

@C3464ci
public final class ane {

    /* renamed from: a */
    private static final Object f12492a = new Object();

    /* renamed from: b */
    private static ane f12493b;

    /* renamed from: c */
    private final C3719lt f12494c = new C3719lt();

    /* renamed from: d */
    private final amt f12495d;

    /* renamed from: e */
    private final String f12496e;

    /* renamed from: f */
    private final aqi f12497f;

    /* renamed from: g */
    private final aqj f12498g;

    /* renamed from: h */
    private final aqk f12499h;

    static {
        ane ane = new ane();
        synchronized (f12492a) {
            f12493b = ane;
        }
    }

    protected ane() {
        amt amt = new amt(new aml(), new amk(), new C3416api(), new auy(), new C3570gf(), new C3807p(), new auz());
        this.f12495d = amt;
        this.f12496e = C3719lt.m19122c();
        this.f12497f = new aqi();
        this.f12498g = new aqj();
        this.f12499h = new aqk();
    }

    /* renamed from: a */
    public static C3719lt m16645a() {
        return m16651g().f12494c;
    }

    /* renamed from: b */
    public static amt m16646b() {
        return m16651g().f12495d;
    }

    /* renamed from: c */
    public static String m16647c() {
        return m16651g().f12496e;
    }

    /* renamed from: d */
    public static aqj m16648d() {
        return m16651g().f12498g;
    }

    /* renamed from: e */
    public static aqi m16649e() {
        return m16651g().f12497f;
    }

    /* renamed from: f */
    public static aqk m16650f() {
        return m16651g().f12499h;
    }

    /* renamed from: g */
    private static ane m16651g() {
        ane ane;
        synchronized (f12492a) {
            ane = f12493b;
        }
        return ane;
    }
}
