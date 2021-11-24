package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.analytics.C2935b;
import com.google.android.gms.analytics.C2952p;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.common.util.C3303h;
import java.lang.Thread.UncaughtExceptionHandler;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.google.android.gms.internal.measurement.u */
public class C4499u {

    /* renamed from: a */
    private static volatile C4499u f16368a;

    /* renamed from: b */
    private final Context f16369b;

    /* renamed from: c */
    private final Context f16370c;

    /* renamed from: d */
    private final C3300e f16371d = C3303h.m15052d();

    /* renamed from: e */
    private final C4253as f16372e = new C4253as(this);

    /* renamed from: f */
    private final C4272bk f16373f;

    /* renamed from: g */
    private final C2952p f16374g;

    /* renamed from: h */
    private final C4490l f16375h;

    /* renamed from: i */
    private final C4258ax f16376i;

    /* renamed from: j */
    private final C4287bz f16377j;

    /* renamed from: k */
    private final C4276bo f16378k;

    /* renamed from: l */
    private final C2935b f16379l;

    /* renamed from: m */
    private final C4246al f16380m;

    /* renamed from: n */
    private final C4489k f16381n;

    /* renamed from: o */
    private final C4240af f16382o;

    /* renamed from: p */
    private final C4257aw f16383p;

    private C4499u(C4501w wVar) {
        Context a = wVar.mo14860a();
        C3266s.m14914a(a, (Object) "Application context can't be null");
        Context b = wVar.mo14861b();
        C3266s.m14913a(b);
        this.f16369b = a;
        this.f16370c = b;
        C4272bk bkVar = new C4272bk(this);
        bkVar.mo14841y();
        this.f16373f = bkVar;
        C4272bk e = mo14846e();
        String str = C4498t.f16366a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        e.mo14818d(sb.toString());
        C4276bo boVar = new C4276bo(this);
        boVar.mo14841y();
        this.f16378k = boVar;
        C4287bz bzVar = new C4287bz(this);
        bzVar.mo14841y();
        this.f16377j = bzVar;
        C4490l lVar = new C4490l(this, wVar);
        C4246al alVar = new C4246al(this);
        C4489k kVar = new C4489k(this);
        C4240af afVar = new C4240af(this);
        C4257aw awVar = new C4257aw(this);
        C2952p a2 = C2952p.m13822a(a);
        a2.mo10648a((UncaughtExceptionHandler) new C4500v(this));
        this.f16374g = a2;
        C2935b bVar = new C2935b(this);
        alVar.mo14841y();
        this.f16380m = alVar;
        kVar.mo14841y();
        this.f16381n = kVar;
        afVar.mo14841y();
        this.f16382o = afVar;
        awVar.mo14841y();
        this.f16383p = awVar;
        C4258ax axVar = new C4258ax(this);
        axVar.mo14841y();
        this.f16376i = axVar;
        lVar.mo14841y();
        this.f16375h = lVar;
        bVar.mo10600a();
        this.f16379l = bVar;
        lVar.mo14798b();
    }

    /* renamed from: a */
    public static C4499u m22345a(Context context) {
        C3266s.m14913a(context);
        if (f16368a == null) {
            synchronized (C4499u.class) {
                if (f16368a == null) {
                    C3300e d = C3303h.m15052d();
                    long b = d.mo11327b();
                    C4499u uVar = new C4499u(new C4501w(context));
                    f16368a = uVar;
                    C2935b.m13740c();
                    long b2 = d.mo11327b() - b;
                    long longValue = ((Long) C4262ba.f15745E.mo14166a()).longValue();
                    if (b2 > longValue) {
                        uVar.mo14846e().mo14817c("Slow initialization (ms)", Long.valueOf(b2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return f16368a;
    }

    /* renamed from: a */
    private static void m22346a(C4497s sVar) {
        C3266s.m14914a(sVar, (Object) "Analytics service not created/initialized");
        C3266s.m14924b(sVar.mo14839w(), "Analytics service not initialized");
    }

    /* renamed from: a */
    public final Context mo14842a() {
        return this.f16369b;
    }

    /* renamed from: b */
    public final Context mo14843b() {
        return this.f16370c;
    }

    /* renamed from: c */
    public final C3300e mo14844c() {
        return this.f16371d;
    }

    /* renamed from: d */
    public final C4253as mo14845d() {
        return this.f16372e;
    }

    /* renamed from: e */
    public final C4272bk mo14846e() {
        m22346a((C4497s) this.f16373f);
        return this.f16373f;
    }

    /* renamed from: f */
    public final C4272bk mo14847f() {
        return this.f16373f;
    }

    /* renamed from: g */
    public final C2952p mo14848g() {
        C3266s.m14913a(this.f16374g);
        return this.f16374g;
    }

    /* renamed from: h */
    public final C4490l mo14849h() {
        m22346a((C4497s) this.f16375h);
        return this.f16375h;
    }

    /* renamed from: i */
    public final C4258ax mo14850i() {
        m22346a((C4497s) this.f16376i);
        return this.f16376i;
    }

    /* renamed from: j */
    public final C2935b mo14851j() {
        C3266s.m14913a(this.f16379l);
        C3266s.m14924b(this.f16379l.mo10603b(), "Analytics instance not initialized");
        return this.f16379l;
    }

    /* renamed from: k */
    public final C4287bz mo14852k() {
        m22346a((C4497s) this.f16377j);
        return this.f16377j;
    }

    /* renamed from: l */
    public final C4276bo mo14853l() {
        m22346a((C4497s) this.f16378k);
        return this.f16378k;
    }

    /* renamed from: m */
    public final C4276bo mo14854m() {
        if (this.f16378k == null || !this.f16378k.mo14839w()) {
            return null;
        }
        return this.f16378k;
    }

    /* renamed from: n */
    public final C4489k mo14855n() {
        m22346a((C4497s) this.f16381n);
        return this.f16381n;
    }

    /* renamed from: o */
    public final C4246al mo14856o() {
        m22346a((C4497s) this.f16380m);
        return this.f16380m;
    }

    /* renamed from: p */
    public final C4240af mo14857p() {
        m22346a((C4497s) this.f16382o);
        return this.f16382o;
    }

    /* renamed from: q */
    public final C4257aw mo14858q() {
        return this.f16383p;
    }
}
