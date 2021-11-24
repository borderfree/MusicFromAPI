package com.google.android.gms.internal.ads;

public final class ake implements C3394ab {

    /* renamed from: a */
    private int f12253a;

    /* renamed from: b */
    private int f12254b;

    /* renamed from: c */
    private final int f12255c;

    /* renamed from: d */
    private final float f12256d;

    public ake() {
        this(2500, 1, 1.0f);
    }

    private ake(int i, int i2, float f) {
        this.f12253a = 2500;
        this.f12255c = 1;
        this.f12256d = 1.0f;
    }

    /* renamed from: a */
    public final int mo11532a() {
        return this.f12253a;
    }

    /* renamed from: a */
    public final void mo11533a(zzae zzae) {
        boolean z = true;
        this.f12254b++;
        this.f12253a = (int) (((float) this.f12253a) + (((float) this.f12253a) * this.f12256d));
        if (this.f12254b > this.f12255c) {
            z = false;
        }
        if (!z) {
            throw zzae;
        }
    }

    /* renamed from: b */
    public final int mo11534b() {
        return this.f12254b;
    }
}
