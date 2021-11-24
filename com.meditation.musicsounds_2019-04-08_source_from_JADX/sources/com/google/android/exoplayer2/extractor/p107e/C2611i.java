package com.google.android.exoplayer2.extractor.p107e;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2496i;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.e.i */
public final class C2611i implements C2610h {

    /* renamed from: c */
    private static final double[] f8775c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f8776a;

    /* renamed from: b */
    private C2659n f8777b;

    /* renamed from: d */
    private boolean f8778d;

    /* renamed from: e */
    private long f8779e;

    /* renamed from: f */
    private final boolean[] f8780f = new boolean[4];

    /* renamed from: g */
    private final C2612a f8781g = new C2612a(128);

    /* renamed from: h */
    private boolean f8782h;

    /* renamed from: i */
    private long f8783i;

    /* renamed from: j */
    private long f8784j;

    /* renamed from: k */
    private boolean f8785k;

    /* renamed from: l */
    private boolean f8786l;

    /* renamed from: m */
    private long f8787m;

    /* renamed from: n */
    private long f8788n;

    /* renamed from: com.google.android.exoplayer2.extractor.e.i$a */
    private static final class C2612a {

        /* renamed from: a */
        public int f8789a;

        /* renamed from: b */
        public int f8790b;

        /* renamed from: c */
        public byte[] f8791c;

        /* renamed from: d */
        private boolean f8792d;

        public C2612a(int i) {
            this.f8791c = new byte[i];
        }

        /* renamed from: a */
        public void mo9067a() {
            this.f8792d = false;
            this.f8789a = 0;
            this.f8790b = 0;
        }

        /* renamed from: a */
        public void mo9068a(byte[] bArr, int i, int i2) {
            if (this.f8792d) {
                int i3 = i2 - i;
                if (this.f8791c.length < this.f8789a + i3) {
                    this.f8791c = Arrays.copyOf(this.f8791c, (this.f8789a + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f8791c, this.f8789a, i3);
                this.f8789a += i3;
            }
        }

        /* renamed from: a */
        public boolean mo9069a(int i, int i2) {
            if (this.f8792d) {
                if (this.f8790b == 0 && i == 181) {
                    this.f8790b = this.f8789a;
                } else {
                    this.f8789a -= i2;
                    this.f8792d = false;
                    return true;
                }
            } else if (i == 179) {
                this.f8792d = true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private static Pair<Format, Long> m12312a(C2612a aVar, String str) {
        float f;
        int i;
        float f2;
        C2612a aVar2 = aVar;
        byte[] copyOf = Arrays.copyOf(aVar2.f8791c, aVar2.f8789a);
        byte b = copyOf[5] & 255;
        int i2 = ((copyOf[4] & 255) << 4) | (b >> 4);
        byte b2 = ((b & 15) << 8) | (copyOf[6] & 255);
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                f2 = (float) (b2 * 4);
                i = i2 * 3;
                break;
            case 3:
                f2 = (float) (b2 * 16);
                i = i2 * 9;
                break;
            case 4:
                f2 = (float) (b2 * 121);
                i = i2 * 100;
                break;
            default:
                f = 1.0f;
                break;
        }
        f = f2 / ((float) i);
        Format a = Format.m11312a(str, "video/mpeg2", (String) null, -1, -1, i2, (int) b2, -1.0f, Collections.singletonList(copyOf), -1, f, (DrmInitData) null);
        long j = 0;
        int i3 = (copyOf[7] & 15) - 1;
        if (i3 >= 0 && i3 < f8775c.length) {
            double d = f8775c[i3];
            int i4 = aVar2.f8790b + 9;
            int i5 = (copyOf[i4] & 96) >> 5;
            byte b3 = copyOf[i4] & 31;
            if (i5 != b3) {
                double d2 = (double) i5;
                Double.isNaN(d2);
                double d3 = d2 + 1.0d;
                double d4 = (double) (b3 + 1);
                Double.isNaN(d4);
                d *= d3 / d4;
            }
            j = (long) (1000000.0d / d);
        }
        return Pair.create(a, Long.valueOf(j));
    }

    /* renamed from: a */
    public void mo9060a() {
        C2496i.m11702a(this.f8780f);
        this.f8781g.mo9067a();
        this.f8785k = false;
        this.f8782h = false;
        this.f8783i = 0;
    }

    /* renamed from: a */
    public void mo9061a(long j, boolean z) {
        this.f8785k = j != -9223372036854775807L;
        if (this.f8785k) {
            this.f8784j = j;
        }
    }

    /* renamed from: a */
    public void mo9062a(C2500k kVar) {
        byte b;
        C2500k kVar2 = kVar;
        int d = kVar.mo8828d();
        int c = kVar.mo8826c();
        byte[] bArr = kVar2.f8094a;
        this.f8783i += (long) kVar.mo8824b();
        this.f8777b.mo9003a(kVar2, kVar.mo8824b());
        int i = d;
        while (true) {
            int a = C2496i.m11698a(bArr, d, c, this.f8780f);
            if (a == c) {
                break;
            }
            int i2 = a + 3;
            byte b2 = kVar2.f8094a[i2] & 255;
            if (!this.f8778d) {
                int i3 = a - i;
                if (i3 > 0) {
                    this.f8781g.mo9068a(bArr, i, a);
                }
                if (this.f8781g.mo9069a(b2, i3 < 0 ? -i3 : 0)) {
                    Pair a2 = m12312a(this.f8781g, this.f8776a);
                    this.f8777b.mo9002a((Format) a2.first);
                    this.f8779e = ((Long) a2.second).longValue();
                    this.f8778d = true;
                }
            }
            if (this.f8778d && (b2 == 184 || b2 == 0)) {
                int i4 = c - a;
                if (this.f8782h) {
                    byte b3 = b2;
                    this.f8777b.mo9001a(this.f8788n, this.f8786l ? 1 : 0, ((int) (this.f8783i - this.f8787m)) - i4, i4, null);
                    this.f8786l = false;
                    b = b3;
                } else {
                    b = b2;
                }
                if (b == 184) {
                    this.f8782h = false;
                    this.f8786l = true;
                } else {
                    this.f8788n = this.f8785k ? this.f8784j : this.f8788n + this.f8779e;
                    this.f8787m = this.f8783i - ((long) i4);
                    this.f8785k = false;
                    this.f8782h = true;
                }
            }
            i = a;
            d = i2;
        }
        if (!this.f8778d) {
            this.f8781g.mo9068a(bArr, i, c);
        }
    }

    /* renamed from: a */
    public void mo9063a(C2651h hVar, C2638d dVar) {
        dVar.mo9099a();
        this.f8776a = dVar.mo9101c();
        this.f8777b = hVar.mo9116a(dVar.mo9100b(), 2);
    }

    /* renamed from: b */
    public void mo9064b() {
    }
}
