package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.g */
final class C2465g implements AudioProcessor {

    /* renamed from: b */
    private int f7940b = -1;

    /* renamed from: c */
    private int f7941c = -1;

    /* renamed from: d */
    private int f7942d = 0;

    /* renamed from: e */
    private ByteBuffer f7943e = f7807a;

    /* renamed from: f */
    private ByteBuffer f7944f = f7807a;

    /* renamed from: g */
    private boolean f7945g;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8670a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f7942d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 * 2
        L_0x0023:
            java.nio.ByteBuffer r3 = r7.f7943e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x003a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f7943e = r2
            goto L_0x003f
        L_0x003a:
            java.nio.ByteBuffer r2 = r7.f7943e
            r2.clear()
        L_0x003f:
            int r2 = r7.f7942d
            if (r2 == r5) goto L_0x0081
            if (r2 == r6) goto L_0x0068
            if (r2 != r4) goto L_0x0062
        L_0x0047:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f7943e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7943e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0047
        L_0x0062:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0068:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f7943e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7943e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0068
        L_0x0081:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f7943e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7943e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0081
        L_0x009c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f7943e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f7943e
            r7.f7944f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C2465g.mo8670a(java.nio.ByteBuffer):void");
    }

    /* renamed from: a */
    public boolean mo8671a() {
        return (this.f7942d == 0 || this.f7942d == 2) ? false : true;
    }

    /* renamed from: a */
    public boolean mo8672a(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new UnhandledFormatException(i, i2, i3);
        } else if (this.f7940b == i && this.f7941c == i2 && this.f7942d == i3) {
            return false;
        } else {
            this.f7940b = i;
            this.f7941c = i2;
            this.f7942d = i3;
            if (i3 == 2) {
                this.f7943e = f7807a;
            }
            return true;
        }
    }

    /* renamed from: b */
    public int mo8673b() {
        return this.f7941c;
    }

    /* renamed from: c */
    public int mo8674c() {
        return 2;
    }

    /* renamed from: d */
    public void mo8675d() {
        this.f7945g = true;
    }

    /* renamed from: e */
    public ByteBuffer mo8676e() {
        ByteBuffer byteBuffer = this.f7944f;
        this.f7944f = f7807a;
        return byteBuffer;
    }

    /* renamed from: f */
    public boolean mo8677f() {
        return this.f7945g && this.f7944f == f7807a;
    }

    /* renamed from: g */
    public void mo8678g() {
        this.f7944f = f7807a;
        this.f7945g = false;
    }

    /* renamed from: h */
    public void mo8679h() {
        mo8678g();
        this.f7943e = f7807a;
        this.f7940b = -1;
        this.f7941c = -1;
        this.f7942d = 0;
    }
}
