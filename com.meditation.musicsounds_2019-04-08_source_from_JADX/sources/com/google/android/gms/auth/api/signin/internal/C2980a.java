package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C2980a {

    /* renamed from: a */
    private static int f10507a = 31;

    /* renamed from: b */
    private int f10508b = 1;

    /* renamed from: a */
    public int mo10717a() {
        return this.f10508b;
    }

    /* renamed from: a */
    public C2980a mo10718a(Object obj) {
        this.f10508b = (f10507a * this.f10508b) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C2980a mo10719a(boolean z) {
        this.f10508b = (f10507a * this.f10508b) + (z ? 1 : 0);
        return this;
    }
}
