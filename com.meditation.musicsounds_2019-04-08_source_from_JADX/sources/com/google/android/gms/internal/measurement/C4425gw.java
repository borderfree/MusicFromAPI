package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.gw */
final class C4425gw<T> implements C4437hh<T> {

    /* renamed from: a */
    private final C4419gq f16192a;

    /* renamed from: b */
    private final C4455hz<?, ?> f16193b;

    /* renamed from: c */
    private final boolean f16194c;

    /* renamed from: d */
    private final C4373fc<?> f16195d;

    private C4425gw(C4455hz<?, ?> hzVar, C4373fc<?> fcVar, C4419gq gqVar) {
        this.f16193b = hzVar;
        this.f16194c = fcVar.mo14463a(gqVar);
        this.f16195d = fcVar;
        this.f16192a = gqVar;
    }

    /* renamed from: a */
    static <T> C4425gw<T> m21759a(C4455hz<?, ?> hzVar, C4373fc<?> fcVar, C4419gq gqVar) {
        return new C4425gw<>(hzVar, fcVar, gqVar);
    }

    /* renamed from: a */
    public final int mo14570a(T t) {
        int hashCode = this.f16193b.mo14652b(t).hashCode();
        return this.f16194c ? (hashCode * 53) + this.f16195d.mo14457a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: a */
    public final T mo14571a() {
        return this.f16192a.mo14500k().mo14507e();
    }

    /* renamed from: a */
    public final void mo14572a(T t, C4436hg hgVar, C4371fb fbVar) {
        boolean z;
        C4455hz<?, ?> hzVar = this.f16193b;
        C4373fc<?> fcVar = this.f16195d;
        Object c = hzVar.mo14656c(t);
        C4376ff b = fcVar.mo14464b(t);
        do {
            try {
                if (hgVar.mo14364a() == Integer.MAX_VALUE) {
                    hzVar.mo14655b((Object) t, c);
                    return;
                }
                int b2 = hgVar.mo14369b();
                if (b2 == 11) {
                    Object obj = null;
                    zzte zzte = null;
                    int i = 0;
                    while (hgVar.mo14364a() != Integer.MAX_VALUE) {
                        int b3 = hgVar.mo14369b();
                        if (b3 == 16) {
                            i = hgVar.mo14397o();
                            obj = fcVar.mo14458a(fbVar, this.f16192a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                fcVar.mo14460a(hgVar, obj, fbVar, b);
                            } else {
                                zzte = hgVar.mo14395n();
                            }
                        } else if (!hgVar.mo14374c()) {
                            break;
                        }
                    }
                    if (hgVar.mo14369b() != 12) {
                        throw zzuv.zzwt();
                    } else if (zzte != null) {
                        if (obj != null) {
                            fcVar.mo14462a(zzte, obj, fbVar, b);
                        } else {
                            hzVar.mo14646a(c, i, zzte);
                        }
                    }
                } else if ((b2 & 7) == 2) {
                    Object a = fcVar.mo14458a(fbVar, this.f16192a, b2 >>> 3);
                    if (a != null) {
                        fcVar.mo14460a(hgVar, a, fbVar, b);
                    } else {
                        z = hzVar.mo14651a(c, hgVar);
                        continue;
                    }
                } else {
                    z = hgVar.mo14374c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                hzVar.mo14655b((Object) t, c);
            }
        } while (z);
    }

    /* renamed from: a */
    public final void mo14573a(T t, C4474in inVar) {
        int a;
        Object value;
        Iterator e = this.f16195d.mo14457a((Object) t).mo14471e();
        while (e.hasNext()) {
            Entry entry = (Entry) e.next();
            C4378fh fhVar = (C4378fh) entry.getKey();
            if (fhVar.mo14482c() != zzxx.MESSAGE || fhVar.mo14483d() || fhVar.mo14484e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C4398fw) {
                a = fhVar.mo14478a();
                value = ((C4398fw) entry).mo14519a().mo14528c();
            } else {
                a = fhVar.mo14478a();
                value = entry.getValue();
            }
            inVar.mo14414a(a, value);
        }
        C4455hz<?, ?> hzVar = this.f16193b;
        hzVar.mo14654b(hzVar.mo14652b(t), inVar);
    }

    /* renamed from: a */
    public final boolean mo14574a(T t, T t2) {
        if (!this.f16193b.mo14652b(t).equals(this.f16193b.mo14652b(t2))) {
            return false;
        }
        if (this.f16194c) {
            return this.f16195d.mo14457a((Object) t).equals(this.f16195d.mo14457a((Object) t2));
        }
        return true;
    }

    /* renamed from: b */
    public final int mo14575b(T t) {
        C4455hz<?, ?> hzVar = this.f16193b;
        int e = hzVar.mo14659e(hzVar.mo14652b(t)) + 0;
        return this.f16194c ? e + this.f16195d.mo14457a((Object) t).mo14477i() : e;
    }

    /* renamed from: b */
    public final void mo14576b(T t, T t2) {
        C4439hj.m21856a(this.f16193b, t, t2);
        if (this.f16194c) {
            C4439hj.m21854a(this.f16195d, t, t2);
        }
    }

    /* renamed from: c */
    public final void mo14577c(T t) {
        this.f16193b.mo14658d(t);
        this.f16195d.mo14465c(t);
    }

    /* renamed from: d */
    public final boolean mo14578d(T t) {
        return this.f16195d.mo14457a((Object) t).mo14474g();
    }
}
