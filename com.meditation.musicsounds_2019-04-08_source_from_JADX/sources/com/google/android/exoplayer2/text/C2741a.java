package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout.Alignment;

/* renamed from: com.google.android.exoplayer2.text.a */
public class C2741a {

    /* renamed from: a */
    public final CharSequence f9388a;

    /* renamed from: b */
    public final Alignment f9389b;

    /* renamed from: c */
    public final Bitmap f9390c;

    /* renamed from: d */
    public final float f9391d;

    /* renamed from: e */
    public final int f9392e;

    /* renamed from: f */
    public final int f9393f;

    /* renamed from: g */
    public final float f9394g;

    /* renamed from: h */
    public final int f9395h;

    /* renamed from: i */
    public final float f9396i;

    /* renamed from: j */
    public final float f9397j;

    /* renamed from: k */
    public final boolean f9398k;

    /* renamed from: l */
    public final int f9399l;

    public C2741a(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, f3, f4, false, -16777216);
    }

    public C2741a(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C2741a(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public C2741a(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, f3, Float.MIN_VALUE, z, i4);
    }

    private C2741a(CharSequence charSequence, Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, float f3, float f4, boolean z, int i4) {
        this.f9388a = charSequence;
        this.f9389b = alignment;
        this.f9390c = bitmap;
        this.f9391d = f;
        this.f9392e = i;
        this.f9393f = i2;
        this.f9394g = f2;
        this.f9395h = i3;
        this.f9396i = f3;
        this.f9397j = f4;
        this.f9398k = z;
        this.f9399l = i4;
    }
}
