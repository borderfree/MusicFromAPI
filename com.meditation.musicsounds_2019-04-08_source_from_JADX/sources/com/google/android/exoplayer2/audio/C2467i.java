package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import com.google.android.exoplayer2.p102c.C2511s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.exoplayer2.audio.i */
public final class C2467i implements AudioProcessor {

    /* renamed from: b */
    private int f7970b = -1;

    /* renamed from: c */
    private int f7971c = -1;

    /* renamed from: d */
    private C2466h f7972d;

    /* renamed from: e */
    private float f7973e = 1.0f;

    /* renamed from: f */
    private float f7974f = 1.0f;

    /* renamed from: g */
    private ByteBuffer f7975g = f7807a;

    /* renamed from: h */
    private ShortBuffer f7976h = this.f7975g.asShortBuffer();

    /* renamed from: i */
    private ByteBuffer f7977i = f7807a;

    /* renamed from: j */
    private long f7978j;

    /* renamed from: k */
    private long f7979k;

    /* renamed from: l */
    private boolean f7980l;

    /* renamed from: a */
    public float mo8757a(float f) {
        this.f7973e = C2511s.m11796a(f, 0.1f, 8.0f);
        return this.f7973e;
    }

    /* renamed from: a */
    public void mo8670a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f7978j += (long) remaining;
            this.f7972d.mo8753a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int b = this.f7972d.mo8754b() * this.f7970b * 2;
        if (b > 0) {
            if (this.f7975g.capacity() < b) {
                this.f7975g = ByteBuffer.allocateDirect(b).order(ByteOrder.nativeOrder());
                this.f7976h = this.f7975g.asShortBuffer();
            } else {
                this.f7975g.clear();
                this.f7976h.clear();
            }
            this.f7972d.mo8756b(this.f7976h);
            this.f7979k += (long) b;
            this.f7975g.limit(b);
            this.f7977i = this.f7975g;
        }
    }

    /* renamed from: a */
    public boolean mo8671a() {
        return Math.abs(this.f7973e - 1.0f) >= 0.01f || Math.abs(this.f7974f - 1.0f) >= 0.01f;
    }

    /* renamed from: a */
    public boolean mo8672a(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new UnhandledFormatException(i, i2, i3);
        } else if (this.f7971c == i && this.f7970b == i2) {
            return false;
        } else {
            this.f7971c = i;
            this.f7970b = i2;
            return true;
        }
    }

    /* renamed from: b */
    public float mo8758b(float f) {
        this.f7974f = C2511s.m11796a(f, 0.1f, 8.0f);
        return f;
    }

    /* renamed from: b */
    public int mo8673b() {
        return this.f7970b;
    }

    /* renamed from: c */
    public int mo8674c() {
        return 2;
    }

    /* renamed from: d */
    public void mo8675d() {
        this.f7972d.mo8751a();
        this.f7980l = true;
    }

    /* renamed from: e */
    public ByteBuffer mo8676e() {
        ByteBuffer byteBuffer = this.f7977i;
        this.f7977i = f7807a;
        return byteBuffer;
    }

    /* renamed from: f */
    public boolean mo8677f() {
        return this.f7980l && (this.f7972d == null || this.f7972d.mo8754b() == 0);
    }

    /* renamed from: g */
    public void mo8678g() {
        this.f7972d = new C2466h(this.f7971c, this.f7970b);
        this.f7972d.mo8752a(this.f7973e);
        this.f7972d.mo8755b(this.f7974f);
        this.f7977i = f7807a;
        this.f7978j = 0;
        this.f7979k = 0;
        this.f7980l = false;
    }

    /* renamed from: h */
    public void mo8679h() {
        this.f7972d = null;
        this.f7975g = f7807a;
        this.f7976h = this.f7975g.asShortBuffer();
        this.f7977i = f7807a;
        this.f7970b = -1;
        this.f7971c = -1;
        this.f7978j = 0;
        this.f7979k = 0;
        this.f7980l = false;
    }

    /* renamed from: i */
    public long mo8759i() {
        return this.f7978j;
    }

    /* renamed from: j */
    public long mo8760j() {
        return this.f7979k;
    }
}
