package com.google.zxing.qrcode.p144a;

import java.lang.reflect.Array;

/* renamed from: com.google.zxing.qrcode.a.b */
public final class C5082b {

    /* renamed from: a */
    private final byte[][] f18062a;

    /* renamed from: b */
    private final int f18063b;

    /* renamed from: c */
    private final int f18064c;

    public C5082b(int i, int i2) {
        this.f18062a = (byte[][]) Array.newInstance(byte.class, new int[]{i2, i});
        this.f18063b = i;
        this.f18064c = i2;
    }

    /* renamed from: a */
    public byte mo16494a(int i, int i2) {
        return this.f18062a[i2][i];
    }

    /* renamed from: a */
    public int mo16495a() {
        return this.f18064c;
    }

    /* renamed from: a */
    public void mo16496a(byte b) {
        for (int i = 0; i < this.f18064c; i++) {
            for (int i2 = 0; i2 < this.f18063b; i2++) {
                this.f18062a[i][i2] = b;
            }
        }
    }

    /* renamed from: a */
    public void mo16497a(int i, int i2, int i3) {
        this.f18062a[i2][i] = (byte) i3;
    }

    /* renamed from: a */
    public void mo16498a(int i, int i2, boolean z) {
        this.f18062a[i2][i] = z ? (byte) 1 : 0;
    }

    /* renamed from: b */
    public int mo16499b() {
        return this.f18063b;
    }

    /* renamed from: c */
    public byte[][] mo16500c() {
        return this.f18062a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder((this.f18063b * 2 * this.f18064c) + 2);
        for (int i = 0; i < this.f18064c; i++) {
            for (int i2 = 0; i2 < this.f18063b; i2++) {
                switch (this.f18062a[i][i2]) {
                    case 0:
                        str = " 0";
                        break;
                    case 1:
                        str = " 1";
                        break;
                    default:
                        str = "  ";
                        break;
                }
                sb.append(str);
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
