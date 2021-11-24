package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class afg {

    /* renamed from: a */
    protected static volatile akz f11869a = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final ConditionVariable f11870d = new ConditionVariable();

    /* renamed from: e */
    private static volatile Random f11871e = null;

    /* renamed from: b */
    protected volatile Boolean f11872b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public aga f11873c;

    public afg(aga aga) {
        this.f11873c = aga;
        aga.mo11872c().execute(new afh(this));
    }

    /* renamed from: a */
    public static int m16097a() {
        try {
            return VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : m16100c().nextInt();
        } catch (RuntimeException unused) {
            return m16100c().nextInt();
        }
    }

    /* renamed from: c */
    private static Random m16100c() {
        if (f11871e == null) {
            synchronized (afg.class) {
                if (f11871e == null) {
                    f11871e = new Random();
                }
            }
        }
        return f11871e;
    }

    /* renamed from: a */
    public final void mo11842a(int i, int i2, long j) {
        try {
            f11870d.block();
            if (this.f11872b.booleanValue() && f11869a != null) {
                C3978vc vcVar = new C3978vc();
                vcVar.f14986a = this.f11873c.f11934a.getPackageName();
                vcVar.f14987b = Long.valueOf(j);
                alb a = f11869a.mo12083a(C3401ads.m16013a((C3401ads) vcVar));
                a.mo12085a(i2);
                a.mo12087b(i);
                a.mo12086a();
            }
        } catch (Exception unused) {
        }
    }
}
