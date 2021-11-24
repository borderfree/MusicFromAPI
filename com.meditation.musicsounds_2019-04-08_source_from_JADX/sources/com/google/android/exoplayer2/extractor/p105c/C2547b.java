package com.google.android.exoplayer2.extractor.p105c;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.C2448a;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2653j;
import com.google.android.exoplayer2.extractor.p105c.C2555d.C2557a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2489b;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.c.b */
final class C2547b {

    /* renamed from: a */
    private static final int f8408a = C2511s.m11819e("vide");

    /* renamed from: b */
    private static final int f8409b = C2511s.m11819e("soun");

    /* renamed from: c */
    private static final int f8410c = C2511s.m11819e("text");

    /* renamed from: d */
    private static final int f8411d = C2511s.m11819e("sbtl");

    /* renamed from: e */
    private static final int f8412e = C2511s.m11819e("subt");

    /* renamed from: f */
    private static final int f8413f = C2511s.m11819e("clcp");

    /* renamed from: g */
    private static final int f8414g = C2511s.m11819e("cenc");

    /* renamed from: h */
    private static final int f8415h = C2511s.m11819e("meta");

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$a */
    private static final class C2548a {

        /* renamed from: a */
        public final int f8416a;

        /* renamed from: b */
        public int f8417b;

        /* renamed from: c */
        public int f8418c;

        /* renamed from: d */
        public long f8419d;

        /* renamed from: e */
        private final boolean f8420e;

        /* renamed from: f */
        private final C2500k f8421f;

        /* renamed from: g */
        private final C2500k f8422g;

        /* renamed from: h */
        private int f8423h;

        /* renamed from: i */
        private int f8424i;

        public C2548a(C2500k kVar, C2500k kVar2, boolean z) {
            this.f8422g = kVar;
            this.f8421f = kVar2;
            this.f8420e = z;
            kVar2.mo8827c(12);
            this.f8416a = kVar2.mo8847t();
            kVar.mo8827c(12);
            this.f8424i = kVar.mo8847t();
            boolean z2 = true;
            if (kVar.mo8841n() != 1) {
                z2 = false;
            }
            C2488a.m11669b(z2, "first_chunk must be 1");
            this.f8417b = -1;
        }

        /* renamed from: a */
        public boolean mo8983a() {
            int i = this.f8417b + 1;
            this.f8417b = i;
            if (i == this.f8416a) {
                return false;
            }
            this.f8419d = this.f8420e ? this.f8421f.mo8849v() : this.f8421f.mo8839l();
            if (this.f8417b == this.f8423h) {
                this.f8418c = this.f8422g.mo8847t();
                this.f8422g.mo8829d(4);
                int i2 = this.f8424i - 1;
                this.f8424i = i2;
                this.f8423h = i2 > 0 ? this.f8422g.mo8847t() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$b */
    private interface C2549b {
        /* renamed from: a */
        int mo8984a();

        /* renamed from: b */
        int mo8985b();

        /* renamed from: c */
        boolean mo8986c();
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$c */
    private static final class C2550c {

        /* renamed from: a */
        public final C2569k[] f8425a;

        /* renamed from: b */
        public Format f8426b;

        /* renamed from: c */
        public int f8427c;

        /* renamed from: d */
        public int f8428d = 0;

        public C2550c(int i) {
            this.f8425a = new C2569k[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$d */
    static final class C2551d implements C2549b {

        /* renamed from: a */
        private final int f8429a = this.f8431c.mo8847t();

        /* renamed from: b */
        private final int f8430b = this.f8431c.mo8847t();

        /* renamed from: c */
        private final C2500k f8431c;

        public C2551d(C2546b bVar) {
            this.f8431c = bVar.f8407aQ;
            this.f8431c.mo8827c(12);
        }

        /* renamed from: a */
        public int mo8984a() {
            return this.f8430b;
        }

        /* renamed from: b */
        public int mo8985b() {
            return this.f8429a == 0 ? this.f8431c.mo8847t() : this.f8429a;
        }

        /* renamed from: c */
        public boolean mo8986c() {
            return this.f8429a != 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$e */
    static final class C2552e implements C2549b {

        /* renamed from: a */
        private final C2500k f8432a;

        /* renamed from: b */
        private final int f8433b = this.f8432a.mo8847t();

        /* renamed from: c */
        private final int f8434c = (this.f8432a.mo8847t() & 255);

        /* renamed from: d */
        private int f8435d;

        /* renamed from: e */
        private int f8436e;

        public C2552e(C2546b bVar) {
            this.f8432a = bVar.f8407aQ;
            this.f8432a.mo8827c(12);
        }

        /* renamed from: a */
        public int mo8984a() {
            return this.f8433b;
        }

        /* renamed from: b */
        public int mo8985b() {
            if (this.f8434c == 8) {
                return this.f8432a.mo8834g();
            }
            if (this.f8434c == 16) {
                return this.f8432a.mo8835h();
            }
            int i = this.f8435d;
            this.f8435d = i + 1;
            if (i % 2 != 0) {
                return this.f8436e & 15;
            }
            this.f8436e = this.f8432a.mo8834g();
            return (this.f8436e & 240) >> 4;
        }

        /* renamed from: c */
        public boolean mo8986c() {
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.b$f */
    private static final class C2553f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f8437a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f8438b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f8439c;

        public C2553f(int i, long j, int i2) {
            this.f8437a = i;
            this.f8438b = j;
            this.f8439c = i2;
        }
    }

    /* renamed from: a */
    private static int m11998a(C2500k kVar, int i, int i2) {
        int d = kVar.mo8828d();
        while (d - i < i2) {
            kVar.mo8827c(d);
            int n = kVar.mo8841n();
            C2488a.m11667a(n > 0, "childAtomSize should be positive");
            if (kVar.mo8841n() == C2544a.f8319J) {
                return d;
            }
            d += n;
        }
        return -1;
    }

    /* renamed from: a */
    private static int m11999a(C2500k kVar, int i, int i2, C2550c cVar, int i3) {
        int d = kVar.mo8828d();
        while (true) {
            boolean z = false;
            if (d - i >= i2) {
                return 0;
            }
            kVar.mo8827c(d);
            int n = kVar.mo8841n();
            if (n > 0) {
                z = true;
            }
            C2488a.m11667a(z, "childAtomSize should be positive");
            if (kVar.mo8841n() == C2544a.f8331V) {
                Pair b = m12010b(kVar, d, n);
                if (b != null) {
                    cVar.f8425a[i3] = (C2569k) b.second;
                    return ((Integer) b.first).intValue();
                }
            }
            d += n;
        }
    }

    /* renamed from: a */
    private static long m12000a(C2500k kVar) {
        int i = 8;
        kVar.mo8827c(8);
        if (C2544a.m11991a(kVar.mo8841n()) != 0) {
            i = 16;
        }
        kVar.mo8829d(i);
        return kVar.mo8839l();
    }

    /* renamed from: a */
    private static Pair<long[], long[]> m12001a(C2545a aVar) {
        if (aVar != null) {
            C2546b d = aVar.mo8981d(C2544a.f8326Q);
            if (d != null) {
                C2500k kVar = d.f8407aQ;
                kVar.mo8827c(8);
                int a = C2544a.m11991a(kVar.mo8841n());
                int t = kVar.mo8847t();
                long[] jArr = new long[t];
                long[] jArr2 = new long[t];
                int i = 0;
                while (i < t) {
                    jArr[i] = a == 1 ? kVar.mo8849v() : kVar.mo8839l();
                    jArr2[i] = a == 1 ? kVar.mo8843p() : (long) kVar.mo8841n();
                    if (kVar.mo8837j() == 1) {
                        kVar.mo8829d(2);
                        i++;
                    } else {
                        throw new IllegalArgumentException("Unsupported media rate.");
                    }
                }
                return Pair.create(jArr, jArr2);
            }
        }
        return Pair.create(null, null);
    }

    /* renamed from: a */
    private static C2550c m12002a(C2500k kVar, int i, int i2, String str, DrmInitData drmInitData, boolean z) {
        C2500k kVar2 = kVar;
        kVar2.mo8827c(12);
        int n = kVar.mo8841n();
        C2550c cVar = new C2550c(n);
        for (int i3 = 0; i3 < n; i3++) {
            int d = kVar.mo8828d();
            int n2 = kVar.mo8841n();
            C2488a.m11667a(n2 > 0, "childAtomSize should be positive");
            int n3 = kVar.mo8841n();
            if (n3 == C2544a.f8378b || n3 == C2544a.f8379c || n3 == C2544a.f8335Z || n3 == C2544a.f8363al || n3 == C2544a.f8380d || n3 == C2544a.f8381e || n3 == C2544a.f8382f || n3 == C2544a.f8347aK || n3 == C2544a.f8348aL) {
                m12007a(kVar, n3, d, n2, i, i2, drmInitData, cVar, i3);
            } else if (n3 == C2544a.f8385i || n3 == C2544a.f8352aa || n3 == C2544a.f8390n || n3 == C2544a.f8392p || n3 == C2544a.f8394r || n3 == C2544a.f8397u || n3 == C2544a.f8395s || n3 == C2544a.f8396t || n3 == C2544a.f8376ay || n3 == C2544a.f8377az || n3 == C2544a.f8388l || n3 == C2544a.f8389m || n3 == C2544a.f8386j || n3 == C2544a.f8351aO) {
                DrmInitData drmInitData2 = drmInitData;
                m12009a(kVar, n3, d, n2, i, str, z, drmInitData, cVar, i3);
            } else if (n3 == C2544a.f8361aj || n3 == C2544a.f8372au || n3 == C2544a.f8373av || n3 == C2544a.f8374aw || n3 == C2544a.f8375ax) {
                DrmInitData drmInitData3 = drmInitData;
                m12008a(kVar, n3, d, n2, i, str, drmInitData, cVar);
            } else if (n3 == C2544a.f8350aN) {
                cVar.f8426b = Format.m11320a(Integer.toString(i), "application/x-camera-motion", null, -1, drmInitData);
            } else {
                DrmInitData drmInitData4 = drmInitData;
            }
            kVar2.mo8827c(d + n2);
        }
        return cVar;
    }

    /* renamed from: a */
    public static C2568j m12003a(C2545a aVar, C2546b bVar, long j, DrmInitData drmInitData, boolean z) {
        long j2;
        C2546b bVar2;
        C2545a aVar2 = aVar;
        C2545a e = aVar2.mo8982e(C2544a.f8314E);
        int c = m12014c(e.mo8981d(C2544a.f8328S).f8407aQ);
        C2568j jVar = null;
        if (c == -1) {
            return null;
        }
        C2553f b = m12011b(aVar2.mo8981d(C2544a.f8324O).f8407aQ);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            j2 = b.f8438b;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long a = m12000a(bVar2.f8407aQ);
        if (j2 != -9223372036854775807L) {
            j3 = C2511s.m11814b(j2, 1000000, a);
        }
        long j4 = j3;
        C2545a e2 = e.mo8982e(C2544a.f8315F).mo8982e(C2544a.f8316G);
        Pair d = m12016d(e.mo8981d(C2544a.f8327R).f8407aQ);
        C2550c a2 = m12002a(e2.mo8981d(C2544a.f8329T).f8407aQ, b.f8437a, b.f8439c, (String) d.second, drmInitData, z);
        Pair a3 = m12001a(aVar2.mo8982e(C2544a.f8325P));
        if (a2.f8426b != null) {
            int b2 = b.f8437a;
            long longValue = ((Long) d.first).longValue();
            Format format = a2.f8426b;
            int i = a2.f8428d;
            C2569k[] kVarArr = a2.f8425a;
            int i2 = a2.f8427c;
            jVar = new C2568j(b2, c, longValue, a, j4, format, i, kVarArr, i2, (long[]) a3.first, (long[]) a3.second);
        }
        return jVar;
    }

    /* renamed from: a */
    public static C2571m m12004a(C2568j jVar, C2545a aVar, C2653j jVar2) {
        C2549b bVar;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        int[] iArr3;
        long[] jArr3;
        boolean z2;
        long[] jArr4;
        int i5;
        long[] jArr5;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int i6;
        C2549b bVar2;
        C2568j jVar3 = jVar;
        C2545a aVar2 = aVar;
        C2653j jVar4 = jVar2;
        C2546b d = aVar2.mo8981d(C2544a.f8368aq);
        if (d != null) {
            bVar = new C2551d(d);
        } else {
            C2546b d2 = aVar2.mo8981d(C2544a.f8369ar);
            if (d2 != null) {
                bVar = new C2552e(d2);
            } else {
                throw new ParserException("Track has no sample table size information");
            }
        }
        int a = bVar.mo8984a();
        if (a == 0) {
            C2571m mVar = new C2571m(new long[0], new int[0], 0, new long[0], new int[0]);
            return mVar;
        }
        C2546b d3 = aVar2.mo8981d(C2544a.f8370as);
        if (d3 == null) {
            d3 = aVar2.mo8981d(C2544a.f8371at);
            z = true;
        } else {
            z = false;
        }
        C2500k kVar = d3.f8407aQ;
        C2500k kVar2 = aVar2.mo8981d(C2544a.f8367ap).f8407aQ;
        C2500k kVar3 = aVar2.mo8981d(C2544a.f8364am).f8407aQ;
        C2546b d4 = aVar2.mo8981d(C2544a.f8365an);
        C2500k kVar4 = d4 != null ? d4.f8407aQ : null;
        C2546b d5 = aVar2.mo8981d(C2544a.f8366ao);
        C2500k kVar5 = d5 != null ? d5.f8407aQ : null;
        C2548a aVar3 = new C2548a(kVar2, kVar, z);
        kVar3.mo8827c(12);
        int t = kVar3.mo8847t() - 1;
        int t2 = kVar3.mo8847t();
        int t3 = kVar3.mo8847t();
        if (kVar5 != null) {
            kVar5.mo8827c(12);
            i = kVar5.mo8847t();
        } else {
            i = 0;
        }
        int i7 = -1;
        if (kVar4 != null) {
            kVar4.mo8827c(12);
            i2 = kVar4.mo8847t();
            if (i2 > 0) {
                i7 = kVar4.mo8847t() - 1;
            } else {
                kVar4 = null;
            }
        } else {
            i2 = 0;
        }
        long j2 = 0;
        if (!(bVar.mo8986c() && "audio/raw".equals(jVar3.f8548f.f7738f) && t == 0 && i == 0 && i2 == 0)) {
            jArr2 = new long[a];
            iArr = new int[a];
            jArr = new long[a];
            int i8 = i2;
            iArr2 = new int[a];
            C2500k kVar6 = kVar3;
            int i9 = i7;
            long j3 = 0;
            long j4 = 0;
            int i10 = i8;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = t;
            int i15 = i;
            int i16 = 0;
            int i17 = 0;
            int i18 = t3;
            int i19 = t2;
            int i20 = i18;
            while (i16 < a) {
                while (i12 == 0) {
                    C2488a.m11668b(aVar3.mo8983a());
                    int i21 = i20;
                    int i22 = i14;
                    long j5 = aVar3.f8419d;
                    i12 = aVar3.f8418c;
                    i20 = i21;
                    i14 = i22;
                    j3 = j5;
                }
                int i23 = i20;
                int i24 = i14;
                if (kVar5 != null) {
                    while (i13 == 0 && i15 > 0) {
                        i13 = kVar5.mo8847t();
                        i11 = kVar5.mo8841n();
                        i15--;
                    }
                    i13--;
                }
                int i25 = i11;
                jArr2[i16] = j3;
                iArr[i16] = bVar.mo8985b();
                if (iArr[i16] > i17) {
                    i6 = a;
                    bVar2 = bVar;
                    i17 = iArr[i16];
                } else {
                    i6 = a;
                    bVar2 = bVar;
                }
                jArr[i16] = j4 + ((long) i25);
                iArr2[i16] = kVar4 == null ? 1 : 0;
                if (i16 == i9) {
                    iArr2[i16] = 1;
                    i10--;
                    if (i10 > 0) {
                        i9 = kVar4.mo8847t() - 1;
                    }
                }
                int i26 = i10;
                int i27 = i9;
                int i28 = i23;
                j4 += (long) i28;
                i19--;
                if (i19 != 0 || i24 <= 0) {
                    i14 = i24;
                } else {
                    i14 = i24 - 1;
                    i19 = kVar6.mo8847t();
                    i28 = kVar6.mo8847t();
                }
                j3 += (long) iArr[i16];
                i12--;
                i16++;
                i11 = i25;
                bVar = bVar2;
                a = i6;
                i9 = i27;
                i20 = i28;
                i10 = i26;
            }
            i3 = a;
            int i29 = i14;
            C2488a.m11666a(i13 == 0);
            while (i15 > 0) {
                C2488a.m11666a(kVar5.mo8847t() == 0);
                kVar5.mo8841n();
                i15--;
            }
            if (i10 == 0 && i19 == 0 && i12 == 0 && i29 == 0) {
                jVar3 = jVar;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent stbl box for track ");
                int i30 = i10;
                jVar3 = jVar;
                sb.append(jVar3.f8543a);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i30);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i19);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i12);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i29);
                Log.w("AtomParsers", sb.toString());
            }
            j = j4;
            i4 = i17;
        } else {
            i3 = a;
            C2549b bVar3 = bVar;
            long[] jArr6 = new long[aVar3.f8416a];
            int[] iArr7 = new int[aVar3.f8416a];
            while (aVar3.mo8983a()) {
                jArr6[aVar3.f8417b] = aVar3.f8419d;
                iArr7[aVar3.f8417b] = aVar3.f8418c;
            }
            C2557a a2 = C2555d.m12033a(bVar3.mo8985b(), jArr6, iArr7, (long) t3);
            jArr2 = a2.f8444a;
            iArr = a2.f8445b;
            int i31 = a2.f8446c;
            jArr = a2.f8447d;
            iArr2 = a2.f8448e;
            i4 = i31;
            j = 0;
        }
        if (jVar3.f8551i == null || jVar2.mo9119a()) {
            long[] jArr7 = jArr2;
            int[] iArr8 = iArr2;
            int[] iArr9 = iArr;
            C2511s.m11806a(jArr, 1000000, jVar3.f8545c);
            C2571m mVar2 = new C2571m(jArr7, iArr9, i4, jArr, iArr8);
            return mVar2;
        }
        if (jVar3.f8551i.length == 1 && jVar3.f8544b == 1 && jArr.length >= 2) {
            long j6 = jVar3.f8552j[0];
            long b = C2511s.m11814b(jVar3.f8551i[0], jVar3.f8545c, jVar3.f8546d) + j6;
            if (jArr[0] <= j6 && j6 < jArr[1] && jArr[jArr.length - 1] < b && b <= j) {
                long j7 = j - b;
                long b2 = C2511s.m11814b(j6 - jArr[0], (long) jVar3.f8548f.f7751s, jVar3.f8545c);
                long b3 = C2511s.m11814b(j7, (long) jVar3.f8548f.f7751s, jVar3.f8545c);
                if (!(b2 == 0 && b3 == 0) && b2 <= 2147483647L && b3 <= 2147483647L) {
                    C2653j jVar5 = jVar2;
                    jVar5.f9009b = (int) b2;
                    jVar5.f9010c = (int) b3;
                    C2511s.m11806a(jArr, 1000000, jVar3.f8545c);
                    C2571m mVar3 = new C2571m(jArr2, iArr, i4, jArr, iArr2);
                    return mVar3;
                }
            }
        }
        if (jVar3.f8551i.length == 1) {
            char c = 0;
            if (jVar3.f8551i[0] == 0) {
                int i32 = 0;
                while (i32 < jArr.length) {
                    jArr[i32] = C2511s.m11814b(jArr[i32] - jVar3.f8552j[c], 1000000, jVar3.f8545c);
                    i32++;
                    c = 0;
                }
                C2571m mVar4 = new C2571m(jArr2, iArr, i4, jArr, iArr2);
                return mVar4;
            }
        }
        boolean z3 = jVar3.f8544b == 1;
        int i33 = 0;
        boolean z4 = false;
        int i34 = 0;
        int i35 = 0;
        while (i33 < jVar3.f8551i.length) {
            long j8 = jVar3.f8552j[i33];
            if (j8 != -1) {
                iArr6 = iArr;
                long b4 = C2511s.m11814b(jVar3.f8551i[i33], jVar3.f8545c, jVar3.f8546d);
                int b5 = C2511s.m11813b(jArr, j8, true, true);
                int b6 = C2511s.m11813b(jArr, j8 + b4, z3, false);
                i34 += b6 - b5;
                z4 |= i35 != b5;
                i35 = b6;
            } else {
                iArr6 = iArr;
            }
            i33++;
            iArr = iArr6;
        }
        int[] iArr10 = iArr;
        boolean z5 = (i34 != i3) | z4;
        long[] jArr8 = z5 ? new long[i34] : jArr2;
        int[] iArr11 = z5 ? new int[i34] : iArr10;
        if (z5) {
            i4 = 0;
        }
        int[] iArr12 = z5 ? new int[i34] : iArr2;
        long[] jArr9 = new long[i34];
        int i36 = i4;
        int i37 = 0;
        int i38 = 0;
        while (i37 < jVar3.f8551i.length) {
            long j9 = jVar3.f8552j[i37];
            long j10 = jVar3.f8551i[i37];
            if (j9 != -1) {
                int[] iArr13 = iArr12;
                i5 = i37;
                long[] jArr10 = jArr8;
                jArr4 = jArr9;
                long b7 = C2511s.m11814b(j10, jVar3.f8545c, jVar3.f8546d) + j9;
                int b8 = C2511s.m11813b(jArr, j9, true, true);
                int b9 = C2511s.m11813b(jArr, b7, z3, false);
                if (z5) {
                    int i39 = b9 - b8;
                    jArr5 = jArr10;
                    System.arraycopy(jArr2, b8, jArr5, i38, i39);
                    iArr4 = iArr10;
                    System.arraycopy(iArr4, b8, iArr11, i38, i39);
                    z2 = z3;
                    iArr5 = iArr13;
                    System.arraycopy(iArr2, b8, iArr5, i38, i39);
                } else {
                    z2 = z3;
                    iArr4 = iArr10;
                    iArr5 = iArr13;
                    jArr5 = jArr10;
                }
                int i40 = i36;
                while (b8 < b9) {
                    long[] jArr11 = jArr2;
                    int[] iArr14 = iArr2;
                    long j11 = j9;
                    jArr4[i38] = C2511s.m11814b(j2, 1000000, jVar3.f8546d) + C2511s.m11814b(jArr[b8] - j9, 1000000, jVar3.f8545c);
                    if (z5 && iArr11[i38] > i40) {
                        i40 = iArr4[b8];
                    }
                    i38++;
                    b8++;
                    jArr2 = jArr11;
                    iArr2 = iArr14;
                    j9 = j11;
                }
                jArr3 = jArr2;
                iArr3 = iArr2;
                i36 = i40;
            } else {
                z2 = z3;
                jArr5 = jArr8;
                jArr4 = jArr9;
                jArr3 = jArr2;
                iArr3 = iArr2;
                iArr5 = iArr12;
                i5 = i37;
                iArr4 = iArr10;
            }
            j2 += j10;
            i37 = i5 + 1;
            iArr10 = iArr4;
            jArr8 = jArr5;
            jArr9 = jArr4;
            jArr2 = jArr3;
            iArr2 = iArr3;
            iArr12 = iArr5;
            z3 = z2;
        }
        long[] jArr12 = jArr8;
        long[] jArr13 = jArr9;
        int[] iArr15 = iArr12;
        boolean z6 = false;
        for (int i41 = 0; i41 < iArr15.length && !z6; i41++) {
            z6 |= (iArr15[i41] & 1) != 0;
        }
        if (z6) {
            C2571m mVar5 = new C2571m(jArr12, iArr11, i36, jArr13, iArr15);
            return mVar5;
        }
        throw new ParserException("The edited sample sequence does not contain a sync sample.");
    }

    /* renamed from: a */
    private static Metadata m12005a(C2500k kVar, int i) {
        kVar.mo8829d(12);
        while (kVar.mo8828d() < i) {
            int d = kVar.mo8828d();
            int n = kVar.mo8841n();
            if (kVar.mo8841n() == C2544a.f8339aC) {
                kVar.mo8827c(d);
                return m12012b(kVar, d + n);
            }
            kVar.mo8829d(n - 8);
        }
        return null;
    }

    /* renamed from: a */
    public static Metadata m12006a(C2546b bVar, boolean z) {
        if (z) {
            return null;
        }
        C2500k kVar = bVar.f8407aQ;
        kVar.mo8827c(8);
        while (kVar.mo8824b() >= 8) {
            int d = kVar.mo8828d();
            int n = kVar.mo8841n();
            if (kVar.mo8841n() == C2544a.f8338aB) {
                kVar.mo8827c(d);
                return m12005a(kVar, d + n);
            }
            kVar.mo8829d(n - 8);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0135 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0136  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12007a(com.google.android.exoplayer2.p102c.C2500k r21, int r22, int r23, int r24, int r25, int r26, com.google.android.exoplayer2.drm.DrmInitData r27, com.google.android.exoplayer2.extractor.p105c.C2547b.C2550c r28, int r29) {
        /*
            r0 = r21
            r1 = r23
            r2 = r24
            r3 = r28
            int r4 = r1 + 8
            int r4 = r4 + 8
            r0.mo8827c(r4)
            r4 = 16
            r0.mo8829d(r4)
            int r10 = r21.mo8835h()
            int r11 = r21.mo8835h()
            r4 = 50
            r0.mo8829d(r4)
            int r4 = r21.mo8828d()
            int r5 = com.google.android.exoplayer2.extractor.p105c.C2544a.f8335Z
            r6 = r22
            if (r6 != r5) goto L_0x0035
            r5 = r29
            int r5 = m11999a(r0, r1, r2, r3, r5)
            r0.mo8827c(r4)
            goto L_0x0036
        L_0x0035:
            r5 = r6
        L_0x0036:
            r6 = -1
            r7 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r6 = r7
            r13 = r6
            r16 = r13
            r7 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r17 = -1
        L_0x0043:
            int r9 = r4 - r1
            if (r9 >= r2) goto L_0x0133
            r0.mo8827c(r4)
            int r9 = r21.mo8828d()
            int r12 = r21.mo8841n()
            if (r12 != 0) goto L_0x005d
            int r14 = r21.mo8828d()
            int r14 = r14 - r1
            if (r14 != r2) goto L_0x005d
            goto L_0x0133
        L_0x005d:
            if (r12 <= 0) goto L_0x0061
            r8 = 1
            goto L_0x0062
        L_0x0061:
            r8 = 0
        L_0x0062:
            java.lang.String r14 = "childAtomSize should be positive"
            com.google.android.exoplayer2.p102c.C2488a.m11667a(r8, r14)
            int r8 = r21.mo8841n()
            int r14 = com.google.android.exoplayer2.extractor.p105c.C2544a.f8317H
            r1 = 3
            if (r8 != r14) goto L_0x0091
            if (r6 != 0) goto L_0x0075
            r20 = 1
            goto L_0x0077
        L_0x0075:
            r20 = 0
        L_0x0077:
            com.google.android.exoplayer2.p102c.C2488a.m11668b(r20)
            java.lang.String r6 = "video/avc"
            int r9 = r9 + 8
            r0.mo8827c(r9)
            com.google.android.exoplayer2.video.a r1 = com.google.android.exoplayer2.video.C2821a.m13424a(r21)
            java.util.List<byte[]> r13 = r1.f9781a
            int r8 = r1.f9782b
            r3.f8427c = r8
            if (r7 != 0) goto L_0x012e
            float r15 = r1.f9785e
            goto L_0x012e
        L_0x0091:
            int r14 = com.google.android.exoplayer2.extractor.p105c.C2544a.f8318I
            if (r8 != r14) goto L_0x00b2
            if (r6 != 0) goto L_0x009a
            r20 = 1
            goto L_0x009c
        L_0x009a:
            r20 = 0
        L_0x009c:
            com.google.android.exoplayer2.p102c.C2488a.m11668b(r20)
            java.lang.String r6 = "video/hevc"
            int r9 = r9 + 8
            r0.mo8827c(r9)
            com.google.android.exoplayer2.video.b r1 = com.google.android.exoplayer2.video.C2822b.m13426a(r21)
            java.util.List<byte[]> r13 = r1.f9786a
            int r1 = r1.f9787b
            r3.f8427c = r1
            goto L_0x012e
        L_0x00b2:
            int r14 = com.google.android.exoplayer2.extractor.p105c.C2544a.f8349aM
            if (r8 != r14) goto L_0x00cc
            if (r6 != 0) goto L_0x00bb
            r20 = 1
            goto L_0x00bd
        L_0x00bb:
            r20 = 0
        L_0x00bd:
            com.google.android.exoplayer2.p102c.C2488a.m11668b(r20)
            int r1 = com.google.android.exoplayer2.extractor.p105c.C2544a.f8347aK
            if (r5 != r1) goto L_0x00c9
            java.lang.String r1 = "video/x-vnd.on2.vp8"
        L_0x00c6:
            r6 = r1
            goto L_0x012e
        L_0x00c9:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x00c6
        L_0x00cc:
            int r14 = com.google.android.exoplayer2.extractor.p105c.C2544a.f8383g
            if (r8 != r14) goto L_0x00dd
            if (r6 != 0) goto L_0x00d5
            r20 = 1
            goto L_0x00d7
        L_0x00d5:
            r20 = 0
        L_0x00d7:
            com.google.android.exoplayer2.p102c.C2488a.m11668b(r20)
            java.lang.String r6 = "video/3gpp"
            goto L_0x012e
        L_0x00dd:
            int r14 = com.google.android.exoplayer2.extractor.p105c.C2544a.f8319J
            if (r8 != r14) goto L_0x00fa
            if (r6 != 0) goto L_0x00e6
            r20 = 1
            goto L_0x00e8
        L_0x00e6:
            r20 = 0
        L_0x00e8:
            com.google.android.exoplayer2.p102c.C2488a.m11668b(r20)
            android.util.Pair r1 = m12017d(r0, r9)
            java.lang.Object r6 = r1.first
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r1.second
            java.util.List r13 = java.util.Collections.singletonList(r1)
            goto L_0x012e
        L_0x00fa:
            int r14 = com.google.android.exoplayer2.extractor.p105c.C2544a.f8360ai
            if (r8 != r14) goto L_0x0104
            float r15 = m12013c(r0, r9)
            r7 = 1
            goto L_0x012e
        L_0x0104:
            int r14 = com.google.android.exoplayer2.extractor.p105c.C2544a.f8345aI
            if (r8 != r14) goto L_0x010d
            byte[] r16 = m12018d(r0, r9, r12)
            goto L_0x012e
        L_0x010d:
            int r9 = com.google.android.exoplayer2.extractor.p105c.C2544a.f8344aH
            if (r8 != r9) goto L_0x012e
            int r8 = r21.mo8834g()
            r0.mo8829d(r1)
            if (r8 != 0) goto L_0x012e
            int r8 = r21.mo8834g()
            switch(r8) {
                case 0: goto L_0x012c;
                case 1: goto L_0x0129;
                case 2: goto L_0x0125;
                case 3: goto L_0x0122;
                default: goto L_0x0121;
            }
        L_0x0121:
            goto L_0x012e
        L_0x0122:
            r17 = 3
            goto L_0x012e
        L_0x0125:
            r8 = 2
            r17 = 2
            goto L_0x012e
        L_0x0129:
            r17 = 1
            goto L_0x012e
        L_0x012c:
            r17 = 0
        L_0x012e:
            int r4 = r4 + r12
            r1 = r23
            goto L_0x0043
        L_0x0133:
            if (r6 != 0) goto L_0x0136
            return
        L_0x0136:
            java.lang.String r5 = java.lang.Integer.toString(r25)
            r7 = 0
            r8 = -1
            r9 = -1
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r18 = 0
            r14 = r26
            r19 = r27
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.m11313a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.f8426b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p105c.C2547b.m12007a(com.google.android.exoplayer2.c.k, int, int, int, int, int, com.google.android.exoplayer2.drm.DrmInitData, com.google.android.exoplayer2.extractor.c.b$c, int):void");
    }

    /* renamed from: a */
    private static void m12008a(C2500k kVar, int i, int i2, int i3, int i4, String str, DrmInitData drmInitData, C2550c cVar) {
        String str2;
        String str3;
        C2500k kVar2 = kVar;
        int i5 = i;
        C2550c cVar2 = cVar;
        kVar2.mo8827c(i2 + 8 + 8);
        List list = null;
        long j = Long.MAX_VALUE;
        if (i5 == C2544a.f8361aj) {
            str2 = "application/ttml+xml";
        } else if (i5 == C2544a.f8372au) {
            int i6 = (i3 - 8) - 8;
            byte[] bArr = new byte[i6];
            kVar2.mo8823a(bArr, 0, i6);
            list = Collections.singletonList(bArr);
            str3 = "application/x-quicktime-tx3g";
            cVar2.f8426b = Format.m11318a(Integer.toString(i4), str3, null, -1, 0, str, -1, drmInitData, j, list);
        } else if (i5 == C2544a.f8373av) {
            str2 = "application/x-mp4-vtt";
        } else if (i5 == C2544a.f8374aw) {
            str2 = "application/ttml+xml";
            j = 0;
        } else if (i5 == C2544a.f8375ax) {
            str2 = "application/x-mp4-cea-608";
            cVar2.f8428d = 1;
        } else {
            throw new IllegalStateException();
        }
        str3 = str2;
        cVar2.f8426b = Format.m11318a(Integer.toString(i4), str3, null, -1, 0, str, -1, drmInitData, j, list);
    }

    /* renamed from: a */
    private static void m12009a(C2500k kVar, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, C2550c cVar, int i5) {
        int i6;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        C2550c cVar2;
        String str3;
        int i11;
        int i12;
        Format b;
        C2500k kVar2 = kVar;
        int i13 = i2;
        int i14 = i3;
        String str4 = str;
        DrmInitData drmInitData2 = drmInitData;
        C2550c cVar3 = cVar;
        kVar2.mo8827c(i13 + 8 + 8);
        if (z) {
            i6 = kVar.mo8835h();
            kVar2.mo8829d(6);
        } else {
            kVar2.mo8829d(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            i7 = kVar.mo8835h();
            kVar2.mo8829d(6);
            i8 = kVar.mo8845r();
            if (i6 == 1) {
                kVar2.mo8829d(16);
            }
        } else if (i6 == 2) {
            kVar2.mo8829d(16);
            i8 = (int) Math.round(kVar.mo8850w());
            int t = kVar.mo8847t();
            kVar2.mo8829d(20);
            i7 = t;
        } else {
            return;
        }
        int d = kVar.mo8828d();
        int i15 = i;
        if (i15 == C2544a.f8352aa) {
            int a = m11999a(kVar2, i13, i14, cVar3, i5);
            kVar2.mo8827c(d);
            i15 = a;
        }
        String str5 = i15 == C2544a.f8390n ? "audio/ac3" : i15 == C2544a.f8392p ? "audio/eac3" : i15 == C2544a.f8394r ? "audio/vnd.dts" : (i15 == C2544a.f8395s || i15 == C2544a.f8396t) ? "audio/vnd.dts.hd" : i15 == C2544a.f8397u ? "audio/vnd.dts.hd;profile=lbr" : i15 == C2544a.f8376ay ? "audio/3gpp" : i15 == C2544a.f8377az ? "audio/amr-wb" : (i15 == C2544a.f8388l || i15 == C2544a.f8389m) ? "audio/raw" : i15 == C2544a.f8386j ? "audio/mpeg" : i15 == C2544a.f8351aO ? "audio/alac" : null;
        int i16 = i8;
        int i17 = d;
        String str6 = str5;
        int i18 = i7;
        byte[] bArr = null;
        while (i17 - i13 < i14) {
            kVar2.mo8827c(i17);
            int n = kVar.mo8841n();
            C2488a.m11667a(n > 0, "childAtomSize should be positive");
            int n2 = kVar.mo8841n();
            if (n2 == C2544a.f8319J || (z && n2 == C2544a.f8387k)) {
                i10 = n;
                String str7 = str6;
                i9 = i17;
                cVar2 = cVar3;
                int a2 = n2 == C2544a.f8319J ? i9 : m11998a(kVar2, i9, i10);
                if (a2 != -1) {
                    Pair d2 = m12017d(kVar2, a2);
                    str3 = (String) d2.first;
                    bArr = (byte[]) d2.second;
                    if ("audio/mp4a-latm".equals(str3)) {
                        Pair a3 = C2489b.m11671a(bArr);
                        i16 = ((Integer) a3.first).intValue();
                        i18 = ((Integer) a3.second).intValue();
                    }
                } else {
                    str3 = str7;
                }
                str2 = str3;
            } else {
                if (n2 == C2544a.f8391o) {
                    kVar2.mo8827c(i17 + 8);
                    b = C2448a.m11490a(kVar2, Integer.toString(i4), str4, drmInitData2);
                } else if (n2 == C2544a.f8393q) {
                    kVar2.mo8827c(i17 + 8);
                    b = C2448a.m11492b(kVar2, Integer.toString(i4), str4, drmInitData2);
                } else {
                    if (n2 == C2544a.f8398v) {
                        i11 = n;
                        str2 = str6;
                        i12 = i17;
                        cVar2 = cVar3;
                        cVar2.f8426b = Format.m11316a(Integer.toString(i4), str6, null, -1, -1, i18, i16, null, drmInitData, 0, str);
                    } else {
                        i11 = n;
                        str2 = str6;
                        i12 = i17;
                        cVar2 = cVar3;
                        if (n2 == C2544a.f8351aO) {
                            i10 = i11;
                            byte[] bArr2 = new byte[i10];
                            i9 = i12;
                            kVar2.mo8827c(i9);
                            kVar2.mo8823a(bArr2, 0, i10);
                            bArr = bArr2;
                        }
                    }
                    i10 = i11;
                    i9 = i12;
                }
                cVar3.f8426b = b;
                i10 = n;
                str2 = str6;
                i9 = i17;
                cVar2 = cVar3;
            }
            i17 = i9 + i10;
            drmInitData2 = drmInitData;
            cVar3 = cVar2;
            str6 = str2;
            i14 = i3;
        }
        String str8 = str6;
        C2550c cVar4 = cVar3;
        if (cVar4.f8426b == null) {
            String str9 = str8;
            if (str9 != null) {
                cVar4.f8426b = Format.m11315a(Integer.toString(i4), str9, (String) null, -1, -1, i18, i16, "audio/raw".equals(str9) ? 2 : -1, bArr == null ? null : Collections.singletonList(bArr), drmInitData, 0, str);
            }
        }
    }

    /* renamed from: b */
    private static Pair<Integer, C2569k> m12010b(C2500k kVar, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        Object obj = null;
        Object obj2 = null;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i3 - i >= i2) {
                break;
            }
            kVar.mo8827c(i3);
            int n = kVar.mo8841n();
            int n2 = kVar.mo8841n();
            if (n2 == C2544a.f8353ab) {
                obj = Integer.valueOf(kVar.mo8841n());
            } else if (n2 == C2544a.f8332W) {
                kVar.mo8829d(4);
                if (kVar.mo8841n() != f8414g) {
                    z3 = false;
                }
                z2 = z3;
            } else if (n2 == C2544a.f8333X) {
                obj2 = m12015c(kVar, i3, n);
            }
            i3 += n;
        }
        if (!z2) {
            return null;
        }
        C2488a.m11667a(obj != null, "frma atom is mandatory");
        if (obj2 != null) {
            z = true;
        }
        C2488a.m11667a(z, "schi->tenc atom is mandatory");
        return Pair.create(obj, obj2);
    }

    /* renamed from: b */
    private static C2553f m12011b(C2500k kVar) {
        boolean z;
        int i = 8;
        kVar.mo8827c(8);
        int a = C2544a.m11991a(kVar.mo8841n());
        kVar.mo8829d(a == 0 ? 8 : 16);
        int n = kVar.mo8841n();
        kVar.mo8829d(4);
        int d = kVar.mo8828d();
        if (a == 0) {
            i = 4;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (kVar.f8094a[d + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            kVar.mo8829d(i);
        } else {
            long l = a == 0 ? kVar.mo8839l() : kVar.mo8849v();
            if (l != 0) {
                j = l;
            }
        }
        kVar.mo8829d(16);
        int n2 = kVar.mo8841n();
        int n3 = kVar.mo8841n();
        kVar.mo8829d(4);
        int n4 = kVar.mo8841n();
        int n5 = kVar.mo8841n();
        if (n2 == 0 && n3 == 65536 && n4 == -65536 && n5 == 0) {
            i2 = 90;
        } else if (n2 == 0 && n3 == -65536 && n4 == 65536 && n5 == 0) {
            i2 = 270;
        } else if (n2 == -65536 && n3 == 0 && n4 == 0 && n5 == -65536) {
            i2 = 180;
        }
        return new C2553f(n, j, i2);
    }

    /* renamed from: b */
    private static Metadata m12012b(C2500k kVar, int i) {
        kVar.mo8829d(8);
        ArrayList arrayList = new ArrayList();
        while (kVar.mo8828d() < i) {
            Entry a = C2562f.m12075a(kVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Entry>) arrayList);
    }

    /* renamed from: c */
    private static float m12013c(C2500k kVar, int i) {
        kVar.mo8827c(i + 8);
        return ((float) kVar.mo8847t()) / ((float) kVar.mo8847t());
    }

    /* renamed from: c */
    private static int m12014c(C2500k kVar) {
        kVar.mo8827c(16);
        int n = kVar.mo8841n();
        if (n == f8409b) {
            return 1;
        }
        if (n == f8408a) {
            return 2;
        }
        if (n == f8410c || n == f8411d || n == f8412e || n == f8413f) {
            return 3;
        }
        return n == f8415h ? 4 : -1;
    }

    /* renamed from: c */
    private static C2569k m12015c(C2500k kVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            kVar.mo8827c(i3);
            int n = kVar.mo8841n();
            if (kVar.mo8841n() == C2544a.f8334Y) {
                kVar.mo8829d(6);
                boolean z = true;
                if (kVar.mo8834g() != 1) {
                    z = false;
                }
                int g = kVar.mo8834g();
                byte[] bArr = new byte[16];
                kVar.mo8823a(bArr, 0, bArr.length);
                return new C2569k(z, g, bArr);
            }
            i3 += n;
        }
        return null;
    }

    /* renamed from: d */
    private static Pair<Long, String> m12016d(C2500k kVar) {
        int i = 8;
        kVar.mo8827c(8);
        int a = C2544a.m11991a(kVar.mo8841n());
        kVar.mo8829d(a == 0 ? 8 : 16);
        long l = kVar.mo8839l();
        if (a == 0) {
            i = 4;
        }
        kVar.mo8829d(i);
        int h = kVar.mo8835h();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) (((h >> 10) & 31) + 96));
        sb.append((char) (((h >> 5) & 31) + 96));
        sb.append((char) ((h & 31) + 96));
        return Pair.create(Long.valueOf(l), sb.toString());
    }

    /* renamed from: d */
    private static Pair<String, byte[]> m12017d(C2500k kVar, int i) {
        kVar.mo8827c(i + 8 + 4);
        kVar.mo8829d(1);
        m12019e(kVar);
        kVar.mo8829d(2);
        int g = kVar.mo8834g();
        if ((g & 128) != 0) {
            kVar.mo8829d(2);
        }
        if ((g & 64) != 0) {
            kVar.mo8829d(kVar.mo8835h());
        }
        if ((g & 32) != 0) {
            kVar.mo8829d(2);
        }
        kVar.mo8829d(1);
        m12019e(kVar);
        String str = null;
        switch (kVar.mo8834g()) {
            case 32:
                str = "video/mp4v-es";
                break;
            case 33:
                str = "video/avc";
                break;
            case 35:
                str = "video/hevc";
                break;
            case 64:
            case 102:
            case 103:
            case 104:
                str = "audio/mp4a-latm";
                break;
            case 107:
                return Pair.create("audio/mpeg", null);
            case 165:
                str = "audio/ac3";
                break;
            case 166:
                str = "audio/eac3";
                break;
            case 169:
            case 172:
                return Pair.create("audio/vnd.dts", null);
            case 170:
            case 171:
                return Pair.create("audio/vnd.dts.hd", null);
        }
        kVar.mo8829d(12);
        kVar.mo8829d(1);
        int e = m12019e(kVar);
        byte[] bArr = new byte[e];
        kVar.mo8823a(bArr, 0, e);
        return Pair.create(str, bArr);
    }

    /* renamed from: d */
    private static byte[] m12018d(C2500k kVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            kVar.mo8827c(i3);
            int n = kVar.mo8841n();
            if (kVar.mo8841n() == C2544a.f8346aJ) {
                return Arrays.copyOfRange(kVar.f8094a, i3, n + i3);
            }
            i3 += n;
        }
        return null;
    }

    /* renamed from: e */
    private static int m12019e(C2500k kVar) {
        int g = kVar.mo8834g();
        int i = g & 127;
        while ((g & 128) == 128) {
            g = kVar.mo8834g();
            i = (i << 7) | (g & 127);
        }
        return i;
    }
}
