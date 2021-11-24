package com.bumptech.glide.p035b;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.b.d */
public class C1184d {

    /* renamed from: a */
    private final byte[] f4294a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f4295b;

    /* renamed from: c */
    private C1183c f4296c;

    /* renamed from: d */
    private int f4297d = 0;

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6412a(int r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x0081
            boolean r2 = r5.m6426o()
            if (r2 != 0) goto L_0x0081
            com.bumptech.glide.b.c r2 = r5.f4296c
            int r2 = r2.f4283c
            if (r2 > r6) goto L_0x0081
            int r2 = r5.m6424m()
            r3 = 33
            r4 = 1
            if (r2 == r3) goto L_0x003b
            r3 = 44
            if (r2 == r3) goto L_0x0028
            r3 = 59
            if (r2 == r3) goto L_0x0026
            com.bumptech.glide.b.c r2 = r5.f4296c
            r2.f4282b = r4
            goto L_0x0002
        L_0x0026:
            r1 = 1
            goto L_0x0002
        L_0x0028:
            com.bumptech.glide.b.c r2 = r5.f4296c
            com.bumptech.glide.b.b r2 = r2.f4284d
            if (r2 != 0) goto L_0x0037
            com.bumptech.glide.b.c r2 = r5.f4296c
            com.bumptech.glide.b.b r3 = new com.bumptech.glide.b.b
            r3.<init>()
            r2.f4284d = r3
        L_0x0037:
            r5.m6417f()
            goto L_0x0002
        L_0x003b:
            int r2 = r5.m6424m()
            if (r2 == r4) goto L_0x0048
            r3 = 249(0xf9, float:3.49E-43)
            if (r2 == r3) goto L_0x0074
            switch(r2) {
                case 254: goto L_0x0048;
                case 255: goto L_0x004c;
                default: goto L_0x0048;
            }
        L_0x0048:
            r5.m6422k()
            goto L_0x0002
        L_0x004c:
            r5.m6423l()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        L_0x0055:
            r4 = 11
            if (r3 >= r4) goto L_0x0064
            byte[] r4 = r5.f4294a
            byte r4 = r4[r3]
            char r4 = (char) r4
            r2.append(r4)
            int r3 = r3 + 1
            goto L_0x0055
        L_0x0064:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NETSCAPE2.0"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0048
            r5.m6418g()
            goto L_0x0002
        L_0x0074:
            com.bumptech.glide.b.c r2 = r5.f4296c
            com.bumptech.glide.b.b r3 = new com.bumptech.glide.b.b
            r3.<init>()
            r2.f4284d = r3
            r5.m6416e()
            goto L_0x0002
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p035b.C1184d.m6412a(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m6413b(int r10) {
        /*
            r9 = this;
            int r0 = r10 * 3
            byte[] r0 = new byte[r0]
            r1 = 0
            java.nio.ByteBuffer r2 = r9.f4295b     // Catch:{ BufferUnderflowException -> 0x0036 }
            r2.get(r0)     // Catch:{ BufferUnderflowException -> 0x0036 }
            r2 = 256(0x100, float:3.59E-43)
            int[] r2 = new int[r2]     // Catch:{ BufferUnderflowException -> 0x0036 }
            r1 = 0
            r3 = 0
        L_0x0010:
            if (r1 >= r10) goto L_0x004d
            int r4 = r3 + 1
            byte r3 = r0[r3]     // Catch:{ BufferUnderflowException -> 0x0034 }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r4 + 1
            byte r4 = r0[r4]     // Catch:{ BufferUnderflowException -> 0x0034 }
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r5 + 1
            byte r5 = r0[r5]     // Catch:{ BufferUnderflowException -> 0x0034 }
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r1 + 1
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r3 = r3 << 16
            r3 = r3 | r8
            int r4 = r4 << 8
            r3 = r3 | r4
            r3 = r3 | r5
            r2[r1] = r3     // Catch:{ BufferUnderflowException -> 0x0034 }
            r3 = r6
            r1 = r7
            goto L_0x0010
        L_0x0034:
            r10 = move-exception
            goto L_0x0038
        L_0x0036:
            r10 = move-exception
            r2 = r1
        L_0x0038:
            java.lang.String r0 = "GifHeaderParser"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "GifHeaderParser"
            java.lang.String r1 = "Format Error Reading Color Table"
            android.util.Log.d(r0, r1, r10)
        L_0x0048:
            com.bumptech.glide.b.c r10 = r9.f4296c
            r0 = 1
            r10.f4282b = r0
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p035b.C1184d.m6413b(int):int[]");
    }

    /* renamed from: c */
    private void m6414c() {
        this.f4295b = null;
        Arrays.fill(this.f4294a, 0);
        this.f4296c = new C1183c();
        this.f4297d = 0;
    }

    /* renamed from: d */
    private void m6415d() {
        m6412a(Integer.MAX_VALUE);
    }

    /* renamed from: e */
    private void m6416e() {
        m6424m();
        int m = m6424m();
        this.f4296c.f4284d.f4276g = (m & 28) >> 2;
        boolean z = true;
        if (this.f4296c.f4284d.f4276g == 0) {
            this.f4296c.f4284d.f4276g = 1;
        }
        C1182b bVar = this.f4296c.f4284d;
        if ((m & 1) == 0) {
            z = false;
        }
        bVar.f4275f = z;
        int n = m6425n();
        if (n < 2) {
            n = 10;
        }
        this.f4296c.f4284d.f4278i = n * 10;
        this.f4296c.f4284d.f4277h = m6424m();
        m6424m();
    }

    /* renamed from: f */
    private void m6417f() {
        C1182b bVar;
        int[] iArr;
        this.f4296c.f4284d.f4270a = m6425n();
        this.f4296c.f4284d.f4271b = m6425n();
        this.f4296c.f4284d.f4272c = m6425n();
        this.f4296c.f4284d.f4273d = m6425n();
        int m = m6424m();
        boolean z = false;
        boolean z2 = (m & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((m & 7) + 1));
        C1182b bVar2 = this.f4296c.f4284d;
        if ((m & 64) != 0) {
            z = true;
        }
        bVar2.f4274e = z;
        if (z2) {
            bVar = this.f4296c.f4284d;
            iArr = m6413b(pow);
        } else {
            bVar = this.f4296c.f4284d;
            iArr = null;
        }
        bVar.f4280k = iArr;
        this.f4296c.f4284d.f4279j = this.f4295b.position();
        m6421j();
        if (!m6426o()) {
            this.f4296c.f4283c++;
            this.f4296c.f4285e.add(this.f4296c.f4284d);
        }
    }

    /* renamed from: g */
    private void m6418g() {
        do {
            m6423l();
            if (this.f4294a[0] == 1) {
                this.f4296c.f4293m = (this.f4294a[1] & 255) | ((this.f4294a[2] & 255) << 8);
            }
            if (this.f4297d <= 0) {
                return;
            }
        } while (!m6426o());
    }

    /* renamed from: h */
    private void m6419h() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m6424m());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f4296c.f4282b = 1;
            return;
        }
        m6420i();
        if (this.f4296c.f4288h && !m6426o()) {
            this.f4296c.f4281a = m6413b(this.f4296c.f4289i);
            this.f4296c.f4292l = this.f4296c.f4281a[this.f4296c.f4290j];
        }
    }

    /* renamed from: i */
    private void m6420i() {
        this.f4296c.f4286f = m6425n();
        this.f4296c.f4287g = m6425n();
        int m = m6424m();
        this.f4296c.f4288h = (m & 128) != 0;
        this.f4296c.f4289i = (int) Math.pow(2.0d, (double) ((m & 7) + 1));
        this.f4296c.f4290j = m6424m();
        this.f4296c.f4291k = m6424m();
    }

    /* renamed from: j */
    private void m6421j() {
        m6424m();
        m6422k();
    }

    /* renamed from: k */
    private void m6422k() {
        int m;
        do {
            m = m6424m();
            this.f4295b.position(Math.min(this.f4295b.position() + m, this.f4295b.limit()));
        } while (m > 0);
    }

    /* renamed from: l */
    private void m6423l() {
        this.f4297d = m6424m();
        if (this.f4297d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f4297d) {
                try {
                    i2 = this.f4297d - i;
                    this.f4295b.get(this.f4294a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f4297d);
                        Log.d("GifHeaderParser", sb.toString(), e);
                    }
                    this.f4296c.f4282b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    private int m6424m() {
        try {
            return this.f4295b.get() & 255;
        } catch (Exception unused) {
            this.f4296c.f4282b = 1;
            return 0;
        }
    }

    /* renamed from: n */
    private int m6425n() {
        return this.f4295b.getShort();
    }

    /* renamed from: o */
    private boolean m6426o() {
        return this.f4296c.f4282b != 0;
    }

    /* renamed from: a */
    public C1184d mo5730a(ByteBuffer byteBuffer) {
        m6414c();
        this.f4295b = byteBuffer.asReadOnlyBuffer();
        this.f4295b.position(0);
        this.f4295b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: a */
    public void mo5731a() {
        this.f4295b = null;
        this.f4296c = null;
    }

    /* renamed from: b */
    public C1183c mo5732b() {
        if (this.f4295b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m6426o()) {
            return this.f4296c;
        } else {
            m6419h();
            if (!m6426o()) {
                m6415d();
                if (this.f4296c.f4283c < 0) {
                    this.f4296c.f4282b = 1;
                }
            }
            return this.f4296c;
        }
    }
}
