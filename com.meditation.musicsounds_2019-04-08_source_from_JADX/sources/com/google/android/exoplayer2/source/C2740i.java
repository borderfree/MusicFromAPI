package com.google.android.exoplayer2.source;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.i */
public final class C2740i {

    /* renamed from: a */
    public static final C2740i f9384a = new C2740i(new C2739h[0]);

    /* renamed from: b */
    public final int f9385b;

    /* renamed from: c */
    private final C2739h[] f9386c;

    /* renamed from: d */
    private int f9387d;

    public C2740i(C2739h... hVarArr) {
        this.f9386c = hVarArr;
        this.f9385b = hVarArr.length;
    }

    /* renamed from: a */
    public int mo9379a(C2739h hVar) {
        for (int i = 0; i < this.f9385b; i++) {
            if (this.f9386c[i] == hVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public C2739h mo9380a(int i) {
        return this.f9386c[i];
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2740i iVar = (C2740i) obj;
        if (this.f9385b != iVar.f9385b || !Arrays.equals(this.f9386c, iVar.f9386c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f9387d == 0) {
            this.f9387d = Arrays.hashCode(this.f9386c);
        }
        return this.f9387d;
    }
}
