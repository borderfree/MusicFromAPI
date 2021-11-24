package com.google.android.exoplayer2.text.p109a;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.text.C2741a;

/* renamed from: com.google.android.exoplayer2.text.a.b */
final class C2745b extends C2741a implements Comparable<C2745b> {

    /* renamed from: m */
    public final int f9432m;

    public C2745b(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.f9432m = i5;
    }

    /* renamed from: a */
    public int compareTo(C2745b bVar) {
        if (bVar.f9432m < this.f9432m) {
            return -1;
        }
        return bVar.f9432m > this.f9432m ? 1 : 0;
    }
}
