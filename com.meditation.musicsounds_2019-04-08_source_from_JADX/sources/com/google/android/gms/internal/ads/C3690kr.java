package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.kr */
public final class C3690kr {

    /* renamed from: a */
    private static ayd f14351a;

    /* renamed from: b */
    private static final Object f14352b = new Object();
    @Deprecated

    /* renamed from: c */
    private static final C3696kx<Void> f14353c = new C3691ks();

    public C3690kr(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        m19039a(context);
    }

    /* renamed from: a */
    private static ayd m19039a(Context context) {
        ayd ayd;
        ayd ayd2;
        synchronized (f14352b) {
            if (f14351a == null) {
                aqm.m16920a(context);
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12749cI)).booleanValue()) {
                    ayd2 = C3684kl.m19028a(context);
                } else {
                    ayd2 = new ayd(new C3697ky(new File(context.getCacheDir(), "volley")), new C3613hv((C3587gw) new C3864rc()));
                    ayd2.mo12623a();
                }
                f14351a = ayd2;
            }
            ayd = f14351a;
        }
        return ayd;
    }

    /* renamed from: a */
    public final C3751my<String> mo13206a(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        C3698kz kzVar = new C3698kz(null);
        C3694kv kvVar = new C3694kv(this, str2, kzVar);
        C3723lx lxVar = new C3723lx(null);
        C3695kw kwVar = new C3695kw(this, i, str, kzVar, kvVar, bArr, map, lxVar);
        if (C3723lx.m19149c()) {
            try {
                lxVar.mo13238a(str2, "GET", kwVar.mo12497b(), kwVar.mo12496a());
            } catch (zza e) {
                C3643iy.m19178e(e.getMessage());
            }
        }
        f14351a.mo12622a(kwVar);
        return kzVar;
    }

    @Deprecated
    /* renamed from: a */
    public final <T> C3751my<T> mo13207a(String str, C3696kx<T> kxVar) {
        C3763nj njVar = new C3763nj();
        f14351a.mo12622a(new C3700la(str, njVar));
        return C3740mn.m19195a(C3740mn.m19194a((C3751my<A>) njVar, (C3736mj<A, B>) new C3693ku<A,B>(this, kxVar), (Executor) C3651jf.f14271a), Throwable.class, (C3735mi<? super X, ? extends V>) new C3692kt<Object,Object>(this, kxVar), C3758ne.f14482b);
    }

    /* renamed from: a */
    public final C3751my<String> mo13208a(String str, Map<String, String> map) {
        return mo13206a(0, str, map, null);
    }
}
