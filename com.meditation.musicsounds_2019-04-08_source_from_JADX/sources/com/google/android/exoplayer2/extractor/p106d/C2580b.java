package com.google.android.exoplayer2.extractor.p106d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2657m;
import com.google.android.exoplayer2.p102c.C2492e;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.d.b */
final class C2580b extends C2588h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2492e f8634a;

    /* renamed from: b */
    private C2581a f8635b;

    /* renamed from: com.google.android.exoplayer2.extractor.d.b$a */
    private class C2581a implements C2586f, C2657m {

        /* renamed from: b */
        private long[] f8637b;

        /* renamed from: c */
        private long[] f8638c;

        /* renamed from: d */
        private long f8639d = -1;

        /* renamed from: e */
        private long f8640e = -1;

        public C2581a() {
        }

        /* renamed from: a */
        public long mo9027a(long j) {
            long b = C2580b.this.mo9053b(j);
            this.f8640e = this.f8637b[C2511s.m11800a(this.f8637b, b, true, true)];
            return b;
        }

        /* renamed from: a */
        public long mo9029a(C2650g gVar) {
            if (this.f8640e < 0) {
                return -1;
            }
            long j = -(this.f8640e + 2);
            this.f8640e = -1;
            return j;
        }

        /* renamed from: a */
        public void mo9040a(C2500k kVar) {
            kVar.mo8829d(1);
            int k = kVar.mo8838k() / 18;
            this.f8637b = new long[k];
            this.f8638c = new long[k];
            for (int i = 0; i < k; i++) {
                this.f8637b[i] = kVar.mo8843p();
                this.f8638c[i] = kVar.mo8843p();
                kVar.mo8829d(2);
            }
        }

        /* renamed from: a */
        public boolean mo8930a() {
            return true;
        }

        /* renamed from: b */
        public long mo8931b() {
            return C2580b.this.f8634a.mo8802b();
        }

        /* renamed from: b */
        public long mo8932b(long j) {
            return this.f8639d + this.f8638c[C2511s.m11800a(this.f8637b, C2580b.this.mo9053b(j), true, true)];
        }

        /* renamed from: c */
        public C2657m mo9036c() {
            return this;
        }

        /* renamed from: c */
        public void mo9041c(long j) {
            this.f8639d = j;
        }
    }

    C2580b() {
    }

    /* renamed from: a */
    public static boolean m12175a(C2500k kVar) {
        return kVar.mo8824b() >= 5 && kVar.mo8834g() == 127 && kVar.mo8839l() == 1179402563;
    }

    /* renamed from: a */
    private static boolean m12176a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: c */
    private int m12177c(C2500k kVar) {
        int i;
        int i2;
        int i3 = (kVar.f8094a[2] & 255) >> 4;
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i3 - 2;
                break;
            case 6:
            case 7:
                kVar.mo8829d(4);
                kVar.mo8853z();
                int g = i3 == 6 ? kVar.mo8834g() : kVar.mo8835h();
                kVar.mo8827c(0);
                return g + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = 256;
                i2 = i3 - 8;
                break;
            default:
                return -1;
        }
        return i << i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9037a(boolean z) {
        super.mo9037a(z);
        if (z) {
            this.f8634a = null;
            this.f8635b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9038a(C2500k kVar, long j, C2590a aVar) {
        byte[] bArr = kVar.f8094a;
        if (this.f8634a == null) {
            this.f8634a = new C2492e(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, kVar.mo8826c());
            copyOfRange[4] = Byte.MIN_VALUE;
            aVar.f8676a = Format.m11316a(null, "audio/x-flac", null, -1, this.f8634a.mo8801a(), this.f8634a.f8068f, this.f8634a.f8067e, Collections.singletonList(copyOfRange), null, 0, null);
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.f8635b = new C2581a();
            this.f8635b.mo9040a(kVar);
        } else if (m12176a(bArr)) {
            if (this.f8635b != null) {
                this.f8635b.mo9041c(j);
                aVar.f8677b = this.f8635b;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo9039b(C2500k kVar) {
        if (!m12176a(kVar.f8094a)) {
            return -1;
        }
        return (long) m12177c(kVar);
    }
}
