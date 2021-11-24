package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.audio.d */
final class C2460d implements AudioProcessor {

    /* renamed from: b */
    private int f7919b = -1;

    /* renamed from: c */
    private int f7920c = -1;

    /* renamed from: d */
    private int[] f7921d;

    /* renamed from: e */
    private boolean f7922e;

    /* renamed from: f */
    private int[] f7923f;

    /* renamed from: g */
    private ByteBuffer f7924g = f7807a;

    /* renamed from: h */
    private ByteBuffer f7925h = f7807a;

    /* renamed from: i */
    private boolean f7926i;

    /* renamed from: a */
    public void mo8670a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f7919b * 2)) * this.f7923f.length * 2;
        if (this.f7924g.capacity() < length) {
            this.f7924g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f7924g.clear();
        }
        while (position < limit) {
            for (int i : this.f7923f) {
                this.f7924g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f7919b * 2;
        }
        byteBuffer.position(limit);
        this.f7924g.flip();
        this.f7925h = this.f7924g;
    }

    /* renamed from: a */
    public void mo8733a(int[] iArr) {
        this.f7921d = iArr;
    }

    /* renamed from: a */
    public boolean mo8671a() {
        return this.f7922e;
    }

    /* renamed from: a */
    public boolean mo8672a(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f7921d, this.f7923f);
        this.f7923f = this.f7921d;
        if (this.f7923f == null) {
            this.f7922e = false;
            return z;
        } else if (i3 != 2) {
            throw new UnhandledFormatException(i, i2, i3);
        } else if (!z && this.f7920c == i && this.f7919b == i2) {
            return false;
        } else {
            this.f7920c = i;
            this.f7919b = i2;
            this.f7922e = i2 != this.f7923f.length;
            int i4 = 0;
            while (i4 < this.f7923f.length) {
                int i5 = this.f7923f[i4];
                if (i5 < i2) {
                    this.f7922e = (i5 != i4) | this.f7922e;
                    i4++;
                } else {
                    throw new UnhandledFormatException(i, i2, i3);
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public int mo8673b() {
        return this.f7923f == null ? this.f7919b : this.f7923f.length;
    }

    /* renamed from: c */
    public int mo8674c() {
        return 2;
    }

    /* renamed from: d */
    public void mo8675d() {
        this.f7926i = true;
    }

    /* renamed from: e */
    public ByteBuffer mo8676e() {
        ByteBuffer byteBuffer = this.f7925h;
        this.f7925h = f7807a;
        return byteBuffer;
    }

    /* renamed from: f */
    public boolean mo8677f() {
        return this.f7926i && this.f7925h == f7807a;
    }

    /* renamed from: g */
    public void mo8678g() {
        this.f7925h = f7807a;
        this.f7926i = false;
    }

    /* renamed from: h */
    public void mo8679h() {
        mo8678g();
        this.f7924g = f7807a;
        this.f7919b = -1;
        this.f7920c = -1;
        this.f7923f = null;
        this.f7922e = false;
    }
}
