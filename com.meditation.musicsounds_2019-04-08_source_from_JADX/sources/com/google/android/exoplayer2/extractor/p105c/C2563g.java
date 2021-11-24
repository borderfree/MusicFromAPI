package com.google.android.exoplayer2.extractor.p105c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.extractor.C2653j;
import com.google.android.exoplayer2.extractor.C2656l;
import com.google.android.exoplayer2.extractor.C2657m;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2496i;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: com.google.android.exoplayer2.extractor.c.g */
public final class C2563g implements C2639f, C2657m {

    /* renamed from: a */
    public static final C2652i f8521a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2563g()};
        }
    };

    /* renamed from: b */
    private static final int f8522b = C2511s.m11819e("qt  ");

    /* renamed from: c */
    private final C2500k f8523c = new C2500k(C2496i.f8073a);

    /* renamed from: d */
    private final C2500k f8524d = new C2500k(4);

    /* renamed from: e */
    private final C2500k f8525e = new C2500k(16);

    /* renamed from: f */
    private final Stack<C2545a> f8526f = new Stack<>();

    /* renamed from: g */
    private int f8527g;

    /* renamed from: h */
    private int f8528h;

    /* renamed from: i */
    private long f8529i;

    /* renamed from: j */
    private int f8530j;

    /* renamed from: k */
    private C2500k f8531k;

    /* renamed from: l */
    private int f8532l;

    /* renamed from: m */
    private int f8533m;

    /* renamed from: n */
    private C2651h f8534n;

    /* renamed from: o */
    private C2565a[] f8535o;

    /* renamed from: p */
    private long f8536p;

    /* renamed from: q */
    private boolean f8537q;

    /* renamed from: com.google.android.exoplayer2.extractor.c.g$a */
    private static final class C2565a {

        /* renamed from: a */
        public final C2568j f8538a;

        /* renamed from: b */
        public final C2571m f8539b;

        /* renamed from: c */
        public final C2659n f8540c;

        /* renamed from: d */
        public int f8541d;

        public C2565a(C2568j jVar, C2571m mVar, C2659n nVar) {
            this.f8538a = jVar;
            this.f8539b = mVar;
            this.f8540c = nVar;
        }
    }

    /* renamed from: a */
    private void m12084a(long j) {
        while (!this.f8526f.isEmpty() && ((C2545a) this.f8526f.peek()).f8404aQ == j) {
            C2545a aVar = (C2545a) this.f8526f.pop();
            if (aVar.f8403aP == C2544a.f8311B) {
                m12085a(aVar);
                this.f8526f.clear();
                this.f8527g = 2;
            } else if (!this.f8526f.isEmpty()) {
                ((C2545a) this.f8526f.peek()).mo8979a(aVar);
            }
        }
        if (this.f8527g != 2) {
            m12093d();
        }
    }

    /* renamed from: a */
    private void m12085a(C2545a aVar) {
        Metadata metadata;
        C2545a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        C2653j jVar = new C2653j();
        C2546b d = aVar2.mo8981d(C2544a.f8337aA);
        if (d != null) {
            metadata = C2547b.m12006a(d, this.f8537q);
            if (metadata != null) {
                jVar.mo9121a(metadata);
            }
        } else {
            metadata = null;
        }
        long j = Long.MAX_VALUE;
        long j2 = -9223372036854775807L;
        for (int i = 0; i < aVar2.f8406aS.size(); i++) {
            C2545a aVar3 = (C2545a) aVar2.f8406aS.get(i);
            if (aVar3.f8403aP == C2544a.f8313D) {
                C2568j a = C2547b.m12003a(aVar3, aVar2.mo8981d(C2544a.f8312C), -9223372036854775807L, (DrmInitData) null, this.f8537q);
                if (a != null) {
                    C2571m a2 = C2547b.m12004a(a, aVar3.mo8982e(C2544a.f8314E).mo8982e(C2544a.f8315F).mo8982e(C2544a.f8316G), jVar);
                    if (a2.f8576a != 0) {
                        C2565a aVar4 = new C2565a(a, a2, this.f8534n.mo9116a(i, a.f8544b));
                        Format a3 = a.f8548f.mo8597a(a2.f8579d + 30);
                        if (a.f8544b == 1) {
                            if (jVar.mo9119a()) {
                                a3 = a3.mo8598a(jVar.f9009b, jVar.f9010c);
                            }
                            if (metadata != null) {
                                a3 = a3.mo8601a(metadata);
                            }
                        }
                        aVar4.f8540c.mo9002a(a3);
                        j2 = Math.max(j2, a.f8547e);
                        arrayList.add(aVar4);
                        long j3 = a2.f8577b[0];
                        if (j3 < j) {
                            j = j3;
                        }
                    }
                }
            }
        }
        this.f8536p = j2;
        this.f8535o = (C2565a[]) arrayList.toArray(new C2565a[arrayList.size()]);
        this.f8534n.mo9117a();
        this.f8534n.mo9118a(this);
    }

    /* renamed from: a */
    private static boolean m12086a(int i) {
        return i == C2544a.f8327R || i == C2544a.f8312C || i == C2544a.f8328S || i == C2544a.f8329T || i == C2544a.f8364am || i == C2544a.f8365an || i == C2544a.f8366ao || i == C2544a.f8326Q || i == C2544a.f8367ap || i == C2544a.f8368aq || i == C2544a.f8369ar || i == C2544a.f8370as || i == C2544a.f8371at || i == C2544a.f8324O || i == C2544a.f8336a || i == C2544a.f8337aA;
    }

    /* renamed from: a */
    private static boolean m12087a(C2500k kVar) {
        kVar.mo8827c(8);
        if (kVar.mo8841n() == f8522b) {
            return true;
        }
        kVar.mo8829d(4);
        while (kVar.mo8824b() > 0) {
            if (kVar.mo8841n() == f8522b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m12088b(int i) {
        return i == C2544a.f8311B || i == C2544a.f8313D || i == C2544a.f8314E || i == C2544a.f8315F || i == C2544a.f8316G || i == C2544a.f8325P;
    }

    /* renamed from: b */
    private boolean m12089b(C2650g gVar) {
        if (this.f8530j == 0) {
            if (!gVar.mo8967a(this.f8525e.f8094a, 0, 8, true)) {
                return false;
            }
            this.f8530j = 8;
            this.f8525e.mo8827c(0);
            this.f8529i = this.f8525e.mo8839l();
            this.f8528h = this.f8525e.mo8841n();
        }
        if (this.f8529i == 1) {
            gVar.mo8970b(this.f8525e.f8094a, 8, 8);
            this.f8530j += 8;
            this.f8529i = this.f8525e.mo8849v();
        }
        if (m12088b(this.f8528h)) {
            long c = (gVar.mo8973c() + this.f8529i) - ((long) this.f8530j);
            this.f8526f.add(new C2545a(this.f8528h, c));
            if (this.f8529i == ((long) this.f8530j)) {
                m12084a(c);
            } else {
                m12093d();
            }
        } else {
            if (m12086a(this.f8528h)) {
                C2488a.m11668b(this.f8530j == 8);
                C2488a.m11668b(this.f8529i <= 2147483647L);
                this.f8531k = new C2500k((int) this.f8529i);
                System.arraycopy(this.f8525e.f8094a, 0, this.f8531k.f8094a, 0, 8);
            } else {
                this.f8531k = null;
            }
            this.f8527g = 1;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m12090b(C2650g gVar, C2656l lVar) {
        boolean z;
        long j = this.f8529i - ((long) this.f8530j);
        long c = gVar.mo8973c() + j;
        if (this.f8531k != null) {
            gVar.mo8970b(this.f8531k.f8094a, this.f8530j, (int) j);
            if (this.f8528h == C2544a.f8336a) {
                this.f8537q = m12087a(this.f8531k);
            } else if (!this.f8526f.isEmpty()) {
                ((C2545a) this.f8526f.peek()).mo8980a(new C2546b(this.f8528h, this.f8531k));
            }
        } else if (j < 262144) {
            gVar.mo8969b((int) j);
        } else {
            lVar.f9025a = gVar.mo8973c() + j;
            z = true;
            m12084a(c);
            return !z && this.f8527g != 2;
        }
        z = false;
        m12084a(c);
        if (!z) {
        }
    }

    /* renamed from: c */
    private int m12091c(C2650g gVar, C2656l lVar) {
        int e = m12094e();
        if (e == -1) {
            return -1;
        }
        C2565a aVar = this.f8535o[e];
        C2659n nVar = aVar.f8540c;
        int i = aVar.f8541d;
        long j = aVar.f8539b.f8577b[i];
        int i2 = aVar.f8539b.f8578c[i];
        if (aVar.f8538a.f8549g == 1) {
            j += 8;
            i2 -= 8;
        }
        long c = (j - gVar.mo8973c()) + ((long) this.f8532l);
        if (c < 0 || c >= 262144) {
            lVar.f9025a = j;
            return 1;
        }
        gVar.mo8969b((int) c);
        if (aVar.f8538a.f8553k != 0) {
            byte[] bArr = this.f8524d.f8094a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i3 = aVar.f8538a.f8553k;
            int i4 = 4 - aVar.f8538a.f8553k;
            while (this.f8532l < i2) {
                if (this.f8533m == 0) {
                    gVar.mo8970b(this.f8524d.f8094a, i4, i3);
                    this.f8524d.mo8827c(0);
                    this.f8533m = this.f8524d.mo8847t();
                    this.f8523c.mo8827c(0);
                    nVar.mo9003a(this.f8523c, 4);
                    this.f8532l += 4;
                    i2 += i4;
                } else {
                    int a = nVar.mo8999a(gVar, this.f8533m, false);
                    this.f8532l += a;
                    this.f8533m -= a;
                }
            }
        } else {
            while (this.f8532l < i2) {
                int a2 = nVar.mo8999a(gVar, i2 - this.f8532l, false);
                this.f8532l += a2;
                this.f8533m -= a2;
            }
        }
        int i5 = i2;
        nVar.mo9001a(aVar.f8539b.f8580e[i], aVar.f8539b.f8581f[i], i5, 0, null);
        aVar.f8541d++;
        this.f8532l = 0;
        this.f8533m = 0;
        return 0;
    }

    /* renamed from: c */
    private void m12092c(long j) {
        C2565a[] aVarArr;
        for (C2565a aVar : this.f8535o) {
            C2571m mVar = aVar.f8539b;
            int a = mVar.mo8996a(j);
            if (a == -1) {
                a = mVar.mo8997b(j);
            }
            aVar.f8541d = a;
        }
    }

    /* renamed from: d */
    private void m12093d() {
        this.f8527g = 0;
        this.f8530j = 0;
    }

    /* renamed from: e */
    private int m12094e() {
        int i = -1;
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.f8535o.length; i2++) {
            C2565a aVar = this.f8535o[i2];
            int i3 = aVar.f8541d;
            if (i3 != aVar.f8539b.f8576a) {
                long j2 = aVar.f8539b.f8577b[i3];
                if (j2 < j) {
                    i = i2;
                    j = j2;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public int mo8945a(C2650g gVar, C2656l lVar) {
        while (true) {
            switch (this.f8527g) {
                case 0:
                    if (m12089b(gVar)) {
                        break;
                    } else {
                        return -1;
                    }
                case 1:
                    if (!m12090b(gVar, lVar)) {
                        break;
                    } else {
                        return 1;
                    }
                case 2:
                    return m12091c(gVar, lVar);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        this.f8526f.clear();
        this.f8530j = 0;
        this.f8532l = 0;
        this.f8533m = 0;
        if (j == 0) {
            m12093d();
        } else if (this.f8535o != null) {
            m12092c(j2);
        }
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        this.f8534n = hVar;
    }

    /* renamed from: a */
    public boolean mo8930a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo8953a(C2650g gVar) {
        return C2567i.m12109b(gVar);
    }

    /* renamed from: b */
    public long mo8931b() {
        return this.f8536p;
    }

    /* renamed from: b */
    public long mo8932b(long j) {
        long j2 = Long.MAX_VALUE;
        for (C2565a aVar : this.f8535o) {
            C2571m mVar = aVar.f8539b;
            int a = mVar.mo8996a(j);
            if (a == -1) {
                a = mVar.mo8997b(j);
            }
            long j3 = mVar.f8577b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: c */
    public void mo8955c() {
    }
}
