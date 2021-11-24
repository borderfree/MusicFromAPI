package com.google.android.exoplayer2.extractor.p105c;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.C2524a;
import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.extractor.C2656l;
import com.google.android.exoplayer2.extractor.C2657m;
import com.google.android.exoplayer2.extractor.C2657m.C2658a;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2496i;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2509q;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.text.p109a.C2752g;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.extractor.c.e */
public final class C2558e implements C2639f {

    /* renamed from: a */
    public static final C2652i f8449a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2558e()};
        }
    };

    /* renamed from: b */
    private static final int f8450b = C2511s.m11819e("seig");

    /* renamed from: c */
    private static final byte[] f8451c = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: A */
    private int f8452A;

    /* renamed from: B */
    private int f8453B;

    /* renamed from: C */
    private boolean f8454C;

    /* renamed from: D */
    private C2651h f8455D;

    /* renamed from: E */
    private C2659n f8456E;

    /* renamed from: F */
    private C2659n[] f8457F;

    /* renamed from: G */
    private boolean f8458G;

    /* renamed from: d */
    private final int f8459d;

    /* renamed from: e */
    private final C2568j f8460e;

    /* renamed from: f */
    private final SparseArray<C2561b> f8461f;

    /* renamed from: g */
    private final C2500k f8462g;

    /* renamed from: h */
    private final C2500k f8463h;

    /* renamed from: i */
    private final C2500k f8464i;

    /* renamed from: j */
    private final C2500k f8465j;

    /* renamed from: k */
    private final C2509q f8466k;

    /* renamed from: l */
    private final C2500k f8467l;

    /* renamed from: m */
    private final byte[] f8468m;

    /* renamed from: n */
    private final Stack<C2545a> f8469n;

    /* renamed from: o */
    private final LinkedList<C2560a> f8470o;

    /* renamed from: p */
    private int f8471p;

    /* renamed from: q */
    private int f8472q;

    /* renamed from: r */
    private long f8473r;

    /* renamed from: s */
    private int f8474s;

    /* renamed from: t */
    private C2500k f8475t;

    /* renamed from: u */
    private long f8476u;

    /* renamed from: v */
    private int f8477v;

    /* renamed from: w */
    private long f8478w;

    /* renamed from: x */
    private long f8479x;

    /* renamed from: y */
    private C2561b f8480y;

    /* renamed from: z */
    private int f8481z;

    /* renamed from: com.google.android.exoplayer2.extractor.c.e$a */
    private static final class C2560a {

        /* renamed from: a */
        public final long f8482a;

        /* renamed from: b */
        public final int f8483b;

        public C2560a(long j, int i) {
            this.f8482a = j;
            this.f8483b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.e$b */
    private static final class C2561b {

        /* renamed from: a */
        public final C2570l f8484a = new C2570l();

        /* renamed from: b */
        public final C2659n f8485b;

        /* renamed from: c */
        public C2568j f8486c;

        /* renamed from: d */
        public C2554c f8487d;

        /* renamed from: e */
        public int f8488e;

        /* renamed from: f */
        public int f8489f;

        /* renamed from: g */
        public int f8490g;

        public C2561b(C2659n nVar) {
            this.f8485b = nVar;
        }

        /* renamed from: a */
        public void mo8987a() {
            this.f8484a.mo8990a();
            this.f8488e = 0;
            this.f8490g = 0;
            this.f8489f = 0;
        }

        /* renamed from: a */
        public void mo8988a(DrmInitData drmInitData) {
            this.f8485b.mo9002a(this.f8486c.f8548f.mo8600a(drmInitData));
        }

        /* renamed from: a */
        public void mo8989a(C2568j jVar, C2554c cVar) {
            this.f8486c = (C2568j) C2488a.m11664a(jVar);
            this.f8487d = (C2554c) C2488a.m11664a(cVar);
            this.f8485b.mo9002a(jVar.f8548f);
            mo8987a();
        }
    }

    public C2558e() {
        this(0);
    }

    public C2558e(int i) {
        this(i, null);
    }

    public C2558e(int i, C2509q qVar) {
        this(i, qVar, null);
    }

    public C2558e(int i, C2509q qVar, C2568j jVar) {
        this.f8459d = i | (jVar != null ? 16 : 0);
        this.f8466k = qVar;
        this.f8460e = jVar;
        this.f8467l = new C2500k(16);
        this.f8462g = new C2500k(C2496i.f8073a);
        this.f8463h = new C2500k(5);
        this.f8464i = new C2500k();
        this.f8465j = new C2500k(1);
        this.f8468m = new byte[16];
        this.f8469n = new Stack<>();
        this.f8470o = new LinkedList<>();
        this.f8461f = new SparseArray<>();
        this.f8478w = -9223372036854775807L;
        this.f8479x = -9223372036854775807L;
        m12040a();
    }

    /* renamed from: a */
    private int m12034a(C2561b bVar) {
        C2570l lVar = bVar.f8484a;
        C2500k kVar = lVar.f8573q;
        int i = (lVar.f8571o != null ? lVar.f8571o : bVar.f8486c.f8550h[lVar.f8557a.f8440a]).f8555b;
        boolean z = lVar.f8570n[bVar.f8488e];
        this.f8465j.f8094a[0] = (byte) ((z ? 128 : 0) | i);
        this.f8465j.mo8827c(0);
        C2659n nVar = bVar.f8485b;
        nVar.mo9003a(this.f8465j, 1);
        nVar.mo9003a(kVar, i);
        if (!z) {
            return i + 1;
        }
        int h = kVar.mo8835h();
        kVar.mo8829d(-2);
        int i2 = (h * 6) + 2;
        nVar.mo9003a(kVar, i2);
        return i + 1 + i2;
    }

    /* renamed from: a */
    private static int m12035a(C2561b bVar, int i, long j, int i2, C2500k kVar, int i3) {
        long[] jArr;
        long j2;
        long j3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        C2554c cVar;
        C2561b bVar2 = bVar;
        kVar.mo8827c(8);
        int b = C2544a.m11992b(kVar.mo8841n());
        C2568j jVar = bVar2.f8486c;
        C2570l lVar = bVar2.f8484a;
        C2554c cVar2 = lVar.f8557a;
        lVar.f8564h[i] = kVar.mo8847t();
        lVar.f8563g[i] = lVar.f8559c;
        if ((b & 1) != 0) {
            long[] jArr2 = lVar.f8563g;
            jArr2[i] = jArr2[i] + ((long) kVar.mo8841n());
        }
        boolean z3 = (b & 4) != 0;
        int i6 = cVar2.f8443d;
        if (z3) {
            i6 = kVar.mo8847t();
        }
        boolean z4 = (b & 256) != 0;
        boolean z5 = (b & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        boolean z6 = (b & 1024) != 0;
        boolean z7 = (b & 2048) != 0;
        long j4 = 0;
        if (jVar.f8551i != null && jVar.f8551i.length == 1 && jVar.f8551i[0] == 0) {
            j4 = C2511s.m11814b(jVar.f8552j[0], 1000, jVar.f8545c);
        }
        int[] iArr = lVar.f8565i;
        int[] iArr2 = lVar.f8566j;
        long[] jArr3 = lVar.f8567k;
        int i7 = i6;
        boolean[] zArr = lVar.f8568l;
        int i8 = i3 + lVar.f8564h[i];
        boolean z8 = jVar.f8544b == 2 && (i2 & 1) != 0;
        long j5 = jVar.f8545c;
        if (i > 0) {
            jArr = jArr3;
            j2 = j4;
            j3 = lVar.f8575s;
        } else {
            jArr = jArr3;
            j2 = j4;
            j3 = j;
        }
        int i9 = i3;
        while (i9 < i8) {
            int t = z4 ? kVar.mo8847t() : cVar2.f8441b;
            if (z5) {
                z = z4;
                i4 = kVar.mo8847t();
            } else {
                z = z4;
                i4 = cVar2.f8442c;
            }
            if (i9 == 0 && z3) {
                z2 = z3;
                i5 = i7;
            } else if (z6) {
                i5 = kVar.mo8841n();
                z2 = z3;
            } else {
                z2 = z3;
                i5 = cVar2.f8443d;
            }
            if (z7) {
                cVar = cVar2;
                iArr2[i9] = (int) (((long) (kVar.mo8841n() * 1000)) / j5);
            } else {
                cVar = cVar2;
                iArr2[i9] = 0;
            }
            jArr[i9] = C2511s.m11814b(j3, 1000, j5) - j2;
            iArr[i9] = i4;
            zArr[i9] = ((i5 >> 16) & 1) == 0 && (!z8 || i9 == 0);
            j3 += (long) t;
            i9++;
            z4 = z;
            z3 = z2;
            cVar2 = cVar;
        }
        lVar.f8575s = j3;
        return i8;
    }

    /* renamed from: a */
    private static Pair<Long, C2524a> m12036a(C2500k kVar, long j) {
        long v;
        long v2;
        C2500k kVar2 = kVar;
        kVar2.mo8827c(8);
        int a = C2544a.m11991a(kVar.mo8841n());
        kVar2.mo8829d(4);
        long l = kVar.mo8839l();
        if (a == 0) {
            v = kVar.mo8839l();
            v2 = kVar.mo8839l();
        } else {
            v = kVar.mo8849v();
            v2 = kVar.mo8849v();
        }
        long j2 = j + v2;
        long j3 = v;
        long b = C2511s.m11814b(j3, 1000000, l);
        kVar2.mo8829d(2);
        int h = kVar.mo8835h();
        int[] iArr = new int[h];
        long[] jArr = new long[h];
        long[] jArr2 = new long[h];
        long[] jArr3 = new long[h];
        long j4 = j3;
        long j5 = b;
        int i = 0;
        while (i < h) {
            int n = kVar.mo8841n();
            if ((n & Integer.MIN_VALUE) == 0) {
                long l2 = kVar.mo8839l();
                iArr[i] = n & Integer.MAX_VALUE;
                jArr[i] = j2;
                jArr3[i] = j5;
                j4 += l2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i2 = h;
                int[] iArr2 = iArr;
                long[] jArr6 = jArr;
                j5 = C2511s.m11814b(j4, 1000000, l);
                jArr4[i] = j5 - jArr5[i];
                kVar2.mo8829d(4);
                j2 += (long) iArr2[i];
                i++;
                jArr2 = jArr4;
                iArr = iArr2;
                jArr3 = jArr5;
                h = i2;
                jArr = jArr6;
            } else {
                throw new ParserException("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(b), new C2524a(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: a */
    private static DrmInitData m12037a(List<C2546b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C2546b bVar = (C2546b) list.get(i);
            if (bVar.f8403aP == C2544a.f8330U) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f8407aQ.f8094a;
                UUID a = C2566h.m12104a(bArr);
                if (a == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new SchemeData(a, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData((List<SchemeData>) arrayList);
    }

    /* renamed from: a */
    private static C2561b m12038a(SparseArray<C2561b> sparseArray) {
        int size = sparseArray.size();
        C2561b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C2561b bVar2 = (C2561b) sparseArray.valueAt(i);
            if (bVar2.f8490g != bVar2.f8484a.f8561e) {
                long j2 = bVar2.f8484a.f8563g[bVar2.f8490g];
                if (j2 < j) {
                    bVar = bVar2;
                    j = j2;
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private static C2561b m12039a(C2500k kVar, SparseArray<C2561b> sparseArray, int i) {
        kVar.mo8827c(8);
        int b = C2544a.m11992b(kVar.mo8841n());
        int n = kVar.mo8841n();
        if ((i & 16) != 0) {
            n = 0;
        }
        C2561b bVar = (C2561b) sparseArray.get(n);
        if (bVar == null) {
            return null;
        }
        if ((b & 1) != 0) {
            long v = kVar.mo8849v();
            bVar.f8484a.f8559c = v;
            bVar.f8484a.f8560d = v;
        }
        C2554c cVar = bVar.f8487d;
        bVar.f8484a.f8557a = new C2554c((b & 2) != 0 ? kVar.mo8847t() - 1 : cVar.f8440a, (b & 8) != 0 ? kVar.mo8847t() : cVar.f8441b, (b & 16) != 0 ? kVar.mo8847t() : cVar.f8442c, (b & 32) != 0 ? kVar.mo8847t() : cVar.f8443d);
        return bVar;
    }

    /* renamed from: a */
    private void m12040a() {
        this.f8471p = 0;
        this.f8474s = 0;
    }

    /* renamed from: a */
    private void m12041a(long j) {
        while (!this.f8469n.isEmpty() && ((C2545a) this.f8469n.peek()).f8404aQ == j) {
            m12047a((C2545a) this.f8469n.pop());
        }
        m12040a();
    }

    /* renamed from: a */
    private void m12042a(C2500k kVar) {
        if (this.f8456E != null) {
            kVar.mo8827c(12);
            kVar.mo8851x();
            kVar.mo8851x();
            long b = C2511s.m11814b(kVar.mo8839l(), 1000000, kVar.mo8839l());
            kVar.mo8827c(12);
            int b2 = kVar.mo8824b();
            this.f8456E.mo9003a(kVar, b2);
            if (this.f8479x != -9223372036854775807L) {
                this.f8456E.mo9001a(this.f8479x + b, 1, b2, 0, null);
            } else {
                this.f8470o.addLast(new C2560a(b, b2));
                this.f8477v += b2;
            }
        }
    }

    /* renamed from: a */
    private static void m12043a(C2500k kVar, int i, C2570l lVar) {
        kVar.mo8827c(i + 8);
        int b = C2544a.m11992b(kVar.mo8841n());
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int t = kVar.mo8847t();
            if (t == lVar.f8562f) {
                Arrays.fill(lVar.f8570n, 0, t, z);
                lVar.mo8991a(kVar.mo8824b());
                lVar.mo8993a(kVar);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Length mismatch: ");
            sb.append(t);
            sb.append(", ");
            sb.append(lVar.f8562f);
            throw new ParserException(sb.toString());
        }
        throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: a */
    private static void m12044a(C2500k kVar, C2500k kVar2, C2570l lVar) {
        kVar.mo8827c(8);
        int n = kVar.mo8841n();
        if (kVar.mo8841n() == f8450b) {
            if (C2544a.m11991a(n) == 1) {
                kVar.mo8829d(4);
            }
            if (kVar.mo8841n() == 1) {
                kVar2.mo8827c(8);
                int n2 = kVar2.mo8841n();
                if (kVar2.mo8841n() == f8450b) {
                    int a = C2544a.m11991a(n2);
                    if (a == 1) {
                        if (kVar2.mo8839l() == 0) {
                            throw new ParserException("Variable length decription in sgpd found (unsupported)");
                        }
                    } else if (a >= 2) {
                        kVar2.mo8829d(4);
                    }
                    if (kVar2.mo8839l() == 1) {
                        kVar2.mo8829d(2);
                        boolean z = kVar2.mo8834g() == 1;
                        if (z) {
                            int g = kVar2.mo8834g();
                            byte[] bArr = new byte[16];
                            kVar2.mo8823a(bArr, 0, bArr.length);
                            lVar.f8569m = true;
                            lVar.f8571o = new C2569k(z, g, bArr);
                            return;
                        }
                        return;
                    }
                    throw new ParserException("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new ParserException("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: a */
    private static void m12045a(C2500k kVar, C2570l lVar) {
        kVar.mo8827c(8);
        int n = kVar.mo8841n();
        if ((C2544a.m11992b(n) & 1) == 1) {
            kVar.mo8829d(8);
        }
        int t = kVar.mo8847t();
        if (t == 1) {
            lVar.f8560d += C2544a.m11991a(n) == 0 ? kVar.mo8839l() : kVar.mo8849v();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected saio entry count: ");
        sb.append(t);
        throw new ParserException(sb.toString());
    }

    /* renamed from: a */
    private static void m12046a(C2500k kVar, C2570l lVar, byte[] bArr) {
        kVar.mo8827c(8);
        kVar.mo8823a(bArr, 0, 16);
        if (Arrays.equals(bArr, f8451c)) {
            m12043a(kVar, 16, lVar);
        }
    }

    /* renamed from: a */
    private void m12047a(C2545a aVar) {
        if (aVar.f8403aP == C2544a.f8311B) {
            m12056b(aVar);
        } else if (aVar.f8403aP == C2544a.f8320K) {
            m12061c(aVar);
        } else if (!this.f8469n.isEmpty()) {
            ((C2545a) this.f8469n.peek()).mo8979a(aVar);
        }
    }

    /* renamed from: a */
    private static void m12048a(C2545a aVar, SparseArray<C2561b> sparseArray, int i, byte[] bArr) {
        int size = aVar.f8406aS.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2545a aVar2 = (C2545a) aVar.f8406aS.get(i2);
            if (aVar2.f8403aP == C2544a.f8321L) {
                m12057b(aVar2, sparseArray, i, bArr);
            }
        }
    }

    /* renamed from: a */
    private static void m12049a(C2545a aVar, C2561b bVar, long j, int i) {
        List<C2546b> list = aVar.f8405aR;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C2546b bVar2 = (C2546b) list.get(i4);
            if (bVar2.f8403aP == C2544a.f8402z) {
                C2500k kVar = bVar2.f8407aQ;
                kVar.mo8827c(12);
                int t = kVar.mo8847t();
                if (t > 0) {
                    i3 += t;
                    i2++;
                }
            }
        }
        bVar.f8490g = 0;
        bVar.f8489f = 0;
        bVar.f8488e = 0;
        bVar.f8484a.mo8992a(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C2546b bVar3 = (C2546b) list.get(i7);
            if (bVar3.f8403aP == C2544a.f8402z) {
                int i8 = i5 + 1;
                i6 = m12035a(bVar, i5, j, i, bVar3.f8407aQ, i6);
                i5 = i8;
            }
        }
    }

    /* renamed from: a */
    private void m12050a(C2546b bVar, long j) {
        if (!this.f8469n.isEmpty()) {
            ((C2545a) this.f8469n.peek()).mo8980a(bVar);
        } else if (bVar.f8403aP == C2544a.f8310A) {
            Pair a = m12036a(bVar.f8407aQ, j);
            this.f8479x = ((Long) a.first).longValue();
            this.f8455D.mo9118a((C2657m) a.second);
            this.f8458G = true;
        } else if (bVar.f8403aP == C2544a.f8343aG) {
            m12042a(bVar.f8407aQ);
        }
    }

    /* renamed from: a */
    private static void m12051a(C2569k kVar, C2500k kVar2, C2570l lVar) {
        int i;
        int i2 = kVar.f8555b;
        kVar2.mo8827c(8);
        boolean z = true;
        if ((C2544a.m11992b(kVar2.mo8841n()) & 1) == 1) {
            kVar2.mo8829d(8);
        }
        int g = kVar2.mo8834g();
        int t = kVar2.mo8847t();
        if (t == lVar.f8562f) {
            if (g == 0) {
                boolean[] zArr = lVar.f8570n;
                i = 0;
                for (int i3 = 0; i3 < t; i3++) {
                    int g2 = kVar2.mo8834g();
                    i += g2;
                    zArr[i3] = g2 > i2;
                }
            } else {
                if (g <= i2) {
                    z = false;
                }
                i = (g * t) + 0;
                Arrays.fill(lVar.f8570n, 0, t, z);
            }
            lVar.mo8991a(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Length mismatch: ");
        sb.append(t);
        sb.append(", ");
        sb.append(lVar.f8562f);
        throw new ParserException(sb.toString());
    }

    /* renamed from: a */
    private static boolean m12052a(int i) {
        return i == C2544a.f8328S || i == C2544a.f8327R || i == C2544a.f8312C || i == C2544a.f8310A || i == C2544a.f8329T || i == C2544a.f8399w || i == C2544a.f8400x || i == C2544a.f8324O || i == C2544a.f8401y || i == C2544a.f8402z || i == C2544a.f8330U || i == C2544a.f8354ac || i == C2544a.f8355ad || i == C2544a.f8359ah || i == C2544a.f8358ag || i == C2544a.f8356ae || i == C2544a.f8357af || i == C2544a.f8326Q || i == C2544a.f8323N || i == C2544a.f8343aG;
    }

    /* renamed from: b */
    private static Pair<Integer, C2554c> m12053b(C2500k kVar) {
        kVar.mo8827c(12);
        return Pair.create(Integer.valueOf(kVar.mo8841n()), new C2554c(kVar.mo8847t() - 1, kVar.mo8847t(), kVar.mo8847t(), kVar.mo8841n()));
    }

    /* renamed from: b */
    private void m12054b() {
        if ((this.f8459d & 4) != 0 && this.f8456E == null) {
            this.f8456E = this.f8455D.mo9116a(this.f8461f.size(), 4);
            this.f8456E.mo9002a(Format.m11311a((String) null, "application/x-emsg", Long.MAX_VALUE));
        }
        if ((this.f8459d & 8) != 0 && this.f8457F == null) {
            C2659n a = this.f8455D.mo9116a(this.f8461f.size() + 1, 3);
            a.mo9002a(Format.m11319a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (DrmInitData) null));
            this.f8457F = new C2659n[]{a};
        }
    }

    /* renamed from: b */
    private static void m12055b(C2500k kVar, C2570l lVar) {
        m12043a(kVar, 0, lVar);
    }

    /* renamed from: b */
    private void m12056b(C2545a aVar) {
        int i;
        C2545a aVar2 = aVar;
        int i2 = 0;
        boolean z = true;
        C2488a.m11669b(this.f8460e == null, "Unexpected moov box.");
        DrmInitData a = m12037a(aVar2.f8405aR);
        C2545a e = aVar2.mo8982e(C2544a.f8322M);
        SparseArray sparseArray = new SparseArray();
        int size = e.f8405aR.size();
        long j = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            C2546b bVar = (C2546b) e.f8405aR.get(i3);
            if (bVar.f8403aP == C2544a.f8401y) {
                Pair b = m12053b(bVar.f8407aQ);
                sparseArray.put(((Integer) b.first).intValue(), b.second);
            } else if (bVar.f8403aP == C2544a.f8323N) {
                j = m12060c(bVar.f8407aQ);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.f8406aS.size();
        int i4 = 0;
        while (i4 < size2) {
            C2545a aVar3 = (C2545a) aVar2.f8406aS.get(i4);
            if (aVar3.f8403aP == C2544a.f8313D) {
                i = i4;
                C2568j a2 = C2547b.m12003a(aVar3, aVar2.mo8981d(C2544a.f8312C), j, a, false);
                if (a2 != null) {
                    sparseArray2.put(a2.f8543a, a2);
                }
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
        int size3 = sparseArray2.size();
        if (this.f8461f.size() == 0) {
            while (i2 < size3) {
                C2568j jVar = (C2568j) sparseArray2.valueAt(i2);
                C2561b bVar2 = new C2561b(this.f8455D.mo9116a(i2, jVar.f8544b));
                bVar2.mo8989a(jVar, (C2554c) sparseArray.get(jVar.f8543a));
                this.f8461f.put(jVar.f8543a, bVar2);
                this.f8478w = Math.max(this.f8478w, jVar.f8547e);
                i2++;
            }
            m12054b();
            this.f8455D.mo9117a();
            return;
        }
        if (this.f8461f.size() != size3) {
            z = false;
        }
        C2488a.m11668b(z);
        while (i2 < size3) {
            C2568j jVar2 = (C2568j) sparseArray2.valueAt(i2);
            ((C2561b) this.f8461f.get(jVar2.f8543a)).mo8989a(jVar2, (C2554c) sparseArray.get(jVar2.f8543a));
            i2++;
        }
    }

    /* renamed from: b */
    private static void m12057b(C2545a aVar, SparseArray<C2561b> sparseArray, int i, byte[] bArr) {
        C2561b a = m12039a(aVar.mo8981d(C2544a.f8400x).f8407aQ, sparseArray, i);
        if (a != null) {
            C2570l lVar = a.f8484a;
            long j = lVar.f8575s;
            a.mo8987a();
            if (aVar.mo8981d(C2544a.f8399w) != null && (i & 2) == 0) {
                j = m12063d(aVar.mo8981d(C2544a.f8399w).f8407aQ);
            }
            m12049a(aVar, a, j, i);
            C2546b d = aVar.mo8981d(C2544a.f8354ac);
            if (d != null) {
                m12051a(a.f8486c.f8550h[lVar.f8557a.f8440a], d.f8407aQ, lVar);
            }
            C2546b d2 = aVar.mo8981d(C2544a.f8355ad);
            if (d2 != null) {
                m12045a(d2.f8407aQ, lVar);
            }
            C2546b d3 = aVar.mo8981d(C2544a.f8359ah);
            if (d3 != null) {
                m12055b(d3.f8407aQ, lVar);
            }
            C2546b d4 = aVar.mo8981d(C2544a.f8356ae);
            C2546b d5 = aVar.mo8981d(C2544a.f8357af);
            if (!(d4 == null || d5 == null)) {
                m12044a(d4.f8407aQ, d5.f8407aQ, lVar);
            }
            int size = aVar.f8405aR.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2546b bVar = (C2546b) aVar.f8405aR.get(i2);
                if (bVar.f8403aP == C2544a.f8358ag) {
                    m12046a(bVar.f8407aQ, lVar, bArr);
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m12058b(int i) {
        return i == C2544a.f8311B || i == C2544a.f8313D || i == C2544a.f8314E || i == C2544a.f8315F || i == C2544a.f8316G || i == C2544a.f8320K || i == C2544a.f8321L || i == C2544a.f8322M || i == C2544a.f8325P;
    }

    /* renamed from: b */
    private boolean m12059b(C2650g gVar) {
        if (this.f8474s == 0) {
            if (!gVar.mo8967a(this.f8467l.f8094a, 0, 8, true)) {
                return false;
            }
            this.f8474s = 8;
            this.f8467l.mo8827c(0);
            this.f8473r = this.f8467l.mo8839l();
            this.f8472q = this.f8467l.mo8841n();
        }
        if (this.f8473r == 1) {
            gVar.mo8970b(this.f8467l.f8094a, 8, 8);
            this.f8474s += 8;
            this.f8473r = this.f8467l.mo8849v();
        }
        if (this.f8473r >= ((long) this.f8474s)) {
            long c = gVar.mo8973c() - ((long) this.f8474s);
            if (this.f8472q == C2544a.f8320K) {
                int size = this.f8461f.size();
                for (int i = 0; i < size; i++) {
                    C2570l lVar = ((C2561b) this.f8461f.valueAt(i)).f8484a;
                    lVar.f8558b = c;
                    lVar.f8560d = c;
                    lVar.f8559c = c;
                }
            }
            if (this.f8472q == C2544a.f8384h) {
                this.f8480y = null;
                this.f8476u = c + this.f8473r;
                if (!this.f8458G) {
                    this.f8455D.mo9118a(new C2658a(this.f8478w));
                    this.f8458G = true;
                }
                this.f8471p = 2;
                return true;
            }
            if (m12058b(this.f8472q)) {
                long c2 = (gVar.mo8973c() + this.f8473r) - 8;
                this.f8469n.add(new C2545a(this.f8472q, c2));
                if (this.f8473r == ((long) this.f8474s)) {
                    m12041a(c2);
                } else {
                    m12040a();
                }
            } else {
                if (m12052a(this.f8472q)) {
                    if (this.f8474s != 8) {
                        throw new ParserException("Leaf atom defines extended atom size (unsupported).");
                    } else if (this.f8473r <= 2147483647L) {
                        this.f8475t = new C2500k((int) this.f8473r);
                        System.arraycopy(this.f8467l.f8094a, 0, this.f8475t.f8094a, 0, 8);
                    } else {
                        throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else if (this.f8473r <= 2147483647L) {
                    this.f8475t = null;
                } else {
                    throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
                }
                this.f8471p = 1;
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    /* renamed from: c */
    private static long m12060c(C2500k kVar) {
        kVar.mo8827c(8);
        return C2544a.m11991a(kVar.mo8841n()) == 0 ? kVar.mo8839l() : kVar.mo8849v();
    }

    /* renamed from: c */
    private void m12061c(C2545a aVar) {
        m12048a(aVar, this.f8461f, this.f8459d, this.f8468m);
        DrmInitData a = m12037a(aVar.f8405aR);
        if (a != null) {
            int size = this.f8461f.size();
            for (int i = 0; i < size; i++) {
                ((C2561b) this.f8461f.valueAt(i)).mo8988a(a);
            }
        }
    }

    /* renamed from: c */
    private void m12062c(C2650g gVar) {
        int i = ((int) this.f8473r) - this.f8474s;
        if (this.f8475t != null) {
            gVar.mo8970b(this.f8475t.f8094a, 8, i);
            m12050a(new C2546b(this.f8472q, this.f8475t), gVar.mo8973c());
        } else {
            gVar.mo8969b(i);
        }
        m12041a(gVar.mo8973c());
    }

    /* renamed from: d */
    private static long m12063d(C2500k kVar) {
        kVar.mo8827c(8);
        return C2544a.m11991a(kVar.mo8841n()) == 1 ? kVar.mo8849v() : kVar.mo8839l();
    }

    /* renamed from: d */
    private void m12064d(C2650g gVar) {
        int size = this.f8461f.size();
        C2561b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C2570l lVar = ((C2561b) this.f8461f.valueAt(i)).f8484a;
            if (lVar.f8574r && lVar.f8560d < j) {
                long j2 = lVar.f8560d;
                bVar = (C2561b) this.f8461f.valueAt(i);
                j = j2;
            }
        }
        if (bVar == null) {
            this.f8471p = 3;
            return;
        }
        int c = (int) (j - gVar.mo8973c());
        if (c >= 0) {
            gVar.mo8969b(c);
            bVar.f8484a.mo8994a(gVar);
            return;
        }
        throw new ParserException("Offset to encryption data was negative.");
    }

    /* renamed from: e */
    private boolean m12065e(C2650g gVar) {
        byte[] bArr;
        int i;
        C2650g gVar2 = gVar;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        if (this.f8471p == 3) {
            if (this.f8480y == null) {
                C2561b a = m12038a(this.f8461f);
                if (a == null) {
                    int c = (int) (this.f8476u - gVar.mo8973c());
                    if (c >= 0) {
                        gVar2.mo8969b(c);
                        m12040a();
                        return false;
                    }
                    throw new ParserException("Offset to end of mdat was negative.");
                }
                int c2 = (int) (a.f8484a.f8563g[a.f8490g] - gVar.mo8973c());
                if (c2 < 0) {
                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    c2 = 0;
                }
                gVar2.mo8969b(c2);
                this.f8480y = a;
            }
            this.f8481z = this.f8480y.f8484a.f8565i[this.f8480y.f8488e];
            if (this.f8480y.f8484a.f8569m) {
                this.f8452A = m12034a(this.f8480y);
                this.f8481z += this.f8452A;
            } else {
                this.f8452A = 0;
            }
            if (this.f8480y.f8486c.f8549g == 1) {
                this.f8481z -= 8;
                gVar2.mo8969b(8);
            }
            this.f8471p = 4;
            this.f8453B = 0;
        }
        C2570l lVar = this.f8480y.f8484a;
        C2568j jVar = this.f8480y.f8486c;
        C2659n nVar = this.f8480y.f8485b;
        int i5 = this.f8480y.f8488e;
        if (jVar.f8553k != 0) {
            byte[] bArr2 = this.f8463h.f8094a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i6 = jVar.f8553k + 1;
            int i7 = 4 - jVar.f8553k;
            while (this.f8452A < this.f8481z) {
                if (this.f8453B == 0) {
                    gVar2.mo8970b(bArr2, i7, i6);
                    this.f8463h.mo8827c(i4);
                    this.f8453B = this.f8463h.mo8847t() - i3;
                    this.f8462g.mo8827c(i4);
                    nVar.mo9003a(this.f8462g, i2);
                    nVar.mo9003a(this.f8463h, i3);
                    this.f8454C = this.f8457F != null && C2496i.m11703a(jVar.f8548f.f7738f, bArr2[i2]);
                    this.f8452A += 5;
                    this.f8481z += i7;
                } else {
                    if (this.f8454C) {
                        this.f8464i.mo8820a(this.f8453B);
                        gVar2.mo8970b(this.f8464i.f8094a, i4, this.f8453B);
                        nVar.mo9003a(this.f8464i, this.f8453B);
                        i = this.f8453B;
                        int a2 = C2496i.m11697a(this.f8464i.f8094a, this.f8464i.mo8826c());
                        this.f8464i.mo8827c("video/hevc".equals(jVar.f8548f.f7738f) ? 1 : 0);
                        this.f8464i.mo8825b(a2);
                        C2752g.m13094a(lVar.mo8995b(i5) * 1000, this.f8464i, this.f8457F);
                    } else {
                        i = nVar.mo8999a(gVar2, this.f8453B, false);
                    }
                    this.f8452A += i;
                    this.f8453B -= i;
                    i2 = 4;
                    i3 = 1;
                    i4 = 0;
                }
            }
        } else {
            while (this.f8452A < this.f8481z) {
                this.f8452A += nVar.mo8999a(gVar2, this.f8481z - this.f8452A, false);
            }
        }
        long b = lVar.mo8995b(i5) * 1000;
        boolean z = (lVar.f8569m ? (char) 0 : 0) | lVar.f8568l[i5];
        int i8 = lVar.f8557a.f8440a;
        if (lVar.f8569m) {
            bArr = (lVar.f8571o != null ? lVar.f8571o : jVar.f8550h[i8]).f8556c;
        } else {
            bArr = null;
        }
        if (this.f8466k != null) {
            b = this.f8466k.mo8880c(b);
        }
        nVar.mo9001a(b, z ? 1 : 0, this.f8481z, 0, bArr);
        while (!this.f8470o.isEmpty()) {
            C2560a aVar = (C2560a) this.f8470o.removeFirst();
            this.f8477v -= aVar.f8483b;
            this.f8456E.mo9001a(aVar.f8482a + b, 1, aVar.f8483b, this.f8477v, null);
        }
        this.f8480y.f8488e++;
        this.f8480y.f8489f++;
        if (this.f8480y.f8489f == lVar.f8564h[this.f8480y.f8490g]) {
            this.f8480y.f8490g++;
            this.f8480y.f8489f = 0;
            this.f8480y = null;
        }
        this.f8471p = 3;
        return true;
    }

    /* renamed from: a */
    public int mo8945a(C2650g gVar, C2656l lVar) {
        while (true) {
            switch (this.f8471p) {
                case 0:
                    if (m12059b(gVar)) {
                        break;
                    } else {
                        return -1;
                    }
                case 1:
                    m12062c(gVar);
                    break;
                case 2:
                    m12064d(gVar);
                    break;
                default:
                    if (!m12065e(gVar)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        int size = this.f8461f.size();
        for (int i = 0; i < size; i++) {
            ((C2561b) this.f8461f.valueAt(i)).mo8987a();
        }
        this.f8470o.clear();
        this.f8477v = 0;
        this.f8469n.clear();
        m12040a();
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        this.f8455D = hVar;
        if (this.f8460e != null) {
            C2561b bVar = new C2561b(hVar.mo9116a(0, this.f8460e.f8544b));
            bVar.mo8989a(this.f8460e, new C2554c(0, 0, 0, 0));
            this.f8461f.put(0, bVar);
            m12054b();
            this.f8455D.mo9117a();
        }
    }

    /* renamed from: a */
    public boolean mo8953a(C2650g gVar) {
        return C2567i.m12107a(gVar);
    }

    /* renamed from: c */
    public void mo8955c() {
    }
}
