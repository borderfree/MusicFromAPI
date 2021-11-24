package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4478ir;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.is */
public final class C4479is<M extends C4478ir<M>, T> {

    /* renamed from: a */
    protected final Class<T> f16311a;

    /* renamed from: b */
    public final int f16312b;

    /* renamed from: c */
    protected final boolean f16313c;

    /* renamed from: d */
    private final int f16314d;

    /* renamed from: a */
    private final Object m22249a(C4475io ioVar) {
        Class<T> componentType = this.f16313c ? this.f16311a.getComponentType() : this.f16311a;
        try {
            switch (this.f16314d) {
                case 10:
                    C4483iw iwVar = (C4483iw) componentType.newInstance();
                    ioVar.mo14711a(iwVar, this.f16312b >>> 3);
                    return iwVar;
                case 11:
                    C4483iw iwVar2 = (C4483iw) componentType.newInstance();
                    ioVar.mo14710a(iwVar2);
                    return iwVar2;
                default:
                    int i = this.f16314d;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(componentType);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb2.append("Error creating instance of class ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString(), e);
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(componentType);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb3.append("Error creating instance of class ");
            sb3.append(valueOf2);
            throw new IllegalArgumentException(sb3.toString(), e2);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo14764a(Object obj) {
        int i = this.f16312b >>> 3;
        switch (this.f16314d) {
            case 10:
                return (C4477iq.m22222b(i) << 1) + ((C4483iw) obj).mo14784e();
            case 11:
                return C4477iq.m22224b(i, (C4483iw) obj);
            default:
                int i2 = this.f16314d;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final T mo14765a(List<C4485iy> list) {
        if (list == null) {
            return null;
        }
        if (this.f16313c) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C4485iy iyVar = (C4485iy) list.get(i);
                if (iyVar.f16328b.length != 0) {
                    arrayList.add(m22249a(C4475io.m22169a(iyVar.f16328b)));
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return null;
            }
            T cast = this.f16311a.cast(Array.newInstance(this.f16311a.getComponentType(), size));
            for (int i2 = 0; i2 < size; i2++) {
                Array.set(cast, i2, arrayList.get(i2));
            }
            return cast;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return this.f16311a.cast(m22249a(C4475io.m22169a(((C4485iy) list.get(list.size() - 1)).f16328b)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14766a(Object obj, C4477iq iqVar) {
        try {
            iqVar.mo14759c(this.f16312b);
            switch (this.f16314d) {
                case 10:
                    int i = this.f16312b >>> 3;
                    ((C4483iw) obj).mo14224a(iqVar);
                    iqVar.mo14760c(i, 4);
                    return;
                case 11:
                    iqVar.mo14756a((C4483iw) obj);
                    return;
                default:
                    int i2 = this.f16314d;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4479is)) {
            return false;
        }
        C4479is isVar = (C4479is) obj;
        return this.f16314d == isVar.f16314d && this.f16311a == isVar.f16311a && this.f16312b == isVar.f16312b && this.f16313c == isVar.f16313c;
    }

    public final int hashCode() {
        return ((((((this.f16314d + 1147) * 31) + this.f16311a.hashCode()) * 31) + this.f16312b) * 31) + (this.f16313c ? 1 : 0);
    }
}
