package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4383fm.C4387d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.fb */
public class C4371fb {

    /* renamed from: a */
    static final C4371fb f16092a = new C4371fb(true);

    /* renamed from: b */
    private static volatile boolean f16093b = false;

    /* renamed from: c */
    private static final Class<?> f16094c = m21505d();

    /* renamed from: d */
    private static volatile C4371fb f16095d;

    /* renamed from: e */
    private final Map<C4372a, C4387d<?, ?>> f16096e;

    /* renamed from: com.google.android.gms.internal.measurement.fb$a */
    static final class C4372a {

        /* renamed from: a */
        private final Object f16097a;

        /* renamed from: b */
        private final int f16098b;

        C4372a(Object obj, int i) {
            this.f16097a = obj;
            this.f16098b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C4372a)) {
                return false;
            }
            C4372a aVar = (C4372a) obj;
            return this.f16097a == aVar.f16097a && this.f16098b == aVar.f16098b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f16097a) * 65535) + this.f16098b;
        }
    }

    C4371fb() {
        this.f16096e = new HashMap();
    }

    private C4371fb(boolean z) {
        this.f16096e = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C4371fb m21502a() {
        return C4370fa.m21498a();
    }

    /* renamed from: b */
    public static C4371fb m21503b() {
        C4371fb fbVar = f16095d;
        if (fbVar == null) {
            synchronized (C4371fb.class) {
                fbVar = f16095d;
                if (fbVar == null) {
                    fbVar = C4370fa.m21500b();
                    f16095d = fbVar;
                }
            }
        }
        return fbVar;
    }

    /* renamed from: c */
    static C4371fb m21504c() {
        return C4381fk.m21563a(C4371fb.class);
    }

    /* renamed from: d */
    private static Class<?> m21505d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <ContainingType extends C4419gq> C4387d<ContainingType, ?> mo14453a(ContainingType containingtype, int i) {
        return (C4387d) this.f16096e.get(new C4372a(containingtype, i));
    }
}
