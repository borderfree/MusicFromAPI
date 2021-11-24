package com.google.firebase.components;

import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.firebase.components.e */
public final class C4906e {

    /* renamed from: a */
    private final Class<?> f17644a;

    /* renamed from: b */
    private final int f17645b;

    /* renamed from: c */
    private final int f17646c;

    private C4906e(Class<?> cls, int i, int i2) {
        this.f17644a = (Class) C3266s.m14914a(cls, (Object) "Null dependency anInterface.");
        this.f17645b = i;
        this.f17646c = i2;
    }

    /* renamed from: a */
    public static C4906e m24461a(Class<?> cls) {
        return new C4906e(cls, 1, 0);
    }

    /* renamed from: a */
    public final Class<?> mo16133a() {
        return this.f17644a;
    }

    /* renamed from: b */
    public final boolean mo16134b() {
        return this.f17645b == 1;
    }

    /* renamed from: c */
    public final boolean mo16135c() {
        return this.f17646c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4906e) {
            C4906e eVar = (C4906e) obj;
            if (this.f17644a == eVar.f17644a && this.f17645b == eVar.f17645b && this.f17646c == eVar.f17646c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f17644a.hashCode() ^ 1000003) * 1000003) ^ this.f17645b) * 1000003) ^ this.f17646c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f17644a);
        sb.append(", required=");
        boolean z = false;
        sb.append(this.f17645b == 1);
        sb.append(", direct=");
        if (this.f17646c == 0) {
            z = true;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
