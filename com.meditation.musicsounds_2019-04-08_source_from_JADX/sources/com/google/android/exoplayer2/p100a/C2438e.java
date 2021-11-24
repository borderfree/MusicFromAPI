package com.google.android.exoplayer2.p100a;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.a.e */
public class C2438e extends C2432a {

    /* renamed from: a */
    public final C2433b f7787a = new C2433b();

    /* renamed from: b */
    public ByteBuffer f7788b;

    /* renamed from: c */
    public long f7789c;

    /* renamed from: d */
    private final int f7790d;

    public C2438e(int i) {
        this.f7790d = i;
    }

    /* renamed from: e */
    public static C2438e m11385e() {
        return new C2438e(0);
    }

    /* renamed from: f */
    private ByteBuffer m11386f(int i) {
        if (this.f7790d == 1) {
            return ByteBuffer.allocate(i);
        }
        if (this.f7790d == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        int capacity = this.f7788b == null ? 0 : this.f7788b.capacity();
        StringBuilder sb = new StringBuilder();
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo8641a() {
        super.mo8641a();
        if (this.f7788b != null) {
            this.f7788b.clear();
        }
    }

    /* renamed from: e */
    public void mo8657e(int i) {
        if (this.f7788b == null) {
            this.f7788b = m11386f(i);
            return;
        }
        int capacity = this.f7788b.capacity();
        int position = this.f7788b.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer f = m11386f(i2);
            if (position > 0) {
                this.f7788b.position(0);
                this.f7788b.limit(position);
                f.put(this.f7788b);
            }
            this.f7788b = f;
        }
    }

    /* renamed from: f */
    public final boolean mo8658f() {
        return this.f7788b == null && this.f7790d == 0;
    }

    /* renamed from: g */
    public final boolean mo8659g() {
        return mo8647d(1073741824);
    }

    /* renamed from: h */
    public final void mo8660h() {
        this.f7788b.flip();
    }
}
