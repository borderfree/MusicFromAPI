package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4383fm.C4388e;

/* renamed from: com.google.android.gms.internal.measurement.hf */
final class C4435hf implements C4417go {

    /* renamed from: a */
    private final C4419gq f16210a;

    /* renamed from: b */
    private final String f16211b;

    /* renamed from: c */
    private final Object[] f16212c;

    /* renamed from: d */
    private final int f16213d;

    C4435hf(C4419gq gqVar, String str, Object[] objArr) {
        this.f16210a = gqVar;
        this.f16211b = str;
        this.f16212c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f16213d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f16213d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo14567a() {
        return (this.f16213d & 1) == 1 ? C4388e.f16126h : C4388e.f16127i;
    }

    /* renamed from: b */
    public final boolean mo14568b() {
        return (this.f16213d & 2) == 2;
    }

    /* renamed from: c */
    public final C4419gq mo14569c() {
        return this.f16210a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo14589d() {
        return this.f16211b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Object[] mo14590e() {
        return this.f16212c;
    }
}
