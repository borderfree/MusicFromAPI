package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.internal.measurement.C4287bz;
import com.google.android.gms.internal.measurement.C4499u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.analytics.b */
public final class C2935b extends C2942f {

    /* renamed from: b */
    private static List<Runnable> f10363b = new ArrayList();

    /* renamed from: c */
    private boolean f10364c;

    /* renamed from: d */
    private Set<Object> f10365d = new HashSet();

    /* renamed from: e */
    private boolean f10366e;

    /* renamed from: f */
    private volatile boolean f10367f;

    public C2935b(C4499u uVar) {
        super(uVar);
    }

    /* renamed from: a */
    public static C2935b m13739a(Context context) {
        return C4499u.m22345a(context).mo14851j();
    }

    /* renamed from: c */
    public static void m13740c() {
        synchronized (C2935b.class) {
            if (f10363b != null) {
                for (Runnable run : f10363b) {
                    run.run();
                }
                f10363b = null;
            }
        }
    }

    /* renamed from: a */
    public final C2940e mo10599a(String str) {
        C2940e eVar;
        synchronized (this) {
            eVar = new C2940e(mo10620f(), str, null);
            eVar.mo14841y();
        }
        return eVar;
    }

    /* renamed from: a */
    public final void mo10600a() {
        C4287bz k = mo10620f().mo14852k();
        k.mo14214d();
        if (k.mo14215e()) {
            mo10602a(k.mo14216f());
        }
        k.mo14214d();
        this.f10364c = true;
    }

    /* renamed from: a */
    public final void mo10601a(int i) {
        mo10620f().mo14849h().mo14794a(i);
    }

    /* renamed from: a */
    public final void mo10602a(boolean z) {
        this.f10366e = z;
    }

    /* renamed from: b */
    public final boolean mo10603b() {
        return this.f10364c;
    }

    /* renamed from: d */
    public final boolean mo10604d() {
        return this.f10366e;
    }

    /* renamed from: e */
    public final boolean mo10605e() {
        return this.f10367f;
    }
}
