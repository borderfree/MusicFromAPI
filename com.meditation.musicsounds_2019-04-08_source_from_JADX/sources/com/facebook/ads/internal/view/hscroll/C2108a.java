package com.facebook.ads.internal.view.hscroll;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.internal.view.hscroll.a */
public class C2108a {

    /* renamed from: a */
    private final SparseArray<int[]> f6909a;

    /* renamed from: a */
    public void mo7646a(int i, int[] iArr) {
        this.f6909a.put(i, iArr);
    }

    /* renamed from: a */
    public int[] mo7647a(int i) {
        return (int[]) this.f6909a.get(i);
    }

    /* renamed from: b */
    public boolean mo7648b(int i) {
        return this.f6909a.indexOfKey(i) >= 0;
    }
}
