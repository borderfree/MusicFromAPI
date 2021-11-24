package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.C2668i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2536b;
import com.google.android.exoplayer2.extractor.C2572d;
import com.google.android.exoplayer2.extractor.C2572d.C2576c;
import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2656l;
import com.google.android.exoplayer2.extractor.C2657m;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.p100a.C2438e;
import com.google.android.exoplayer2.p101b.C2481f;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2491d;
import com.google.android.exoplayer2.p102c.C2495h;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.source.C2729b.C2730a;
import com.google.android.exoplayer2.source.C2731c.C2732a;
import com.google.android.exoplayer2.source.C2733d.C2734a;
import com.google.android.exoplayer2.upstream.C2806b;
import com.google.android.exoplayer2.upstream.C2809d;
import com.google.android.exoplayer2.upstream.C2811e;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.C2802a;
import com.google.android.exoplayer2.upstream.Loader.C2804c;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.a */
final class C2721a implements C2576c, C2651h, C2731c, C2802a<C2726a> {

    /* renamed from: A */
    private boolean f9309A;

    /* renamed from: B */
    private long f9310B;

    /* renamed from: C */
    private long f9311C;

    /* renamed from: D */
    private long f9312D;

    /* renamed from: E */
    private int f9313E;

    /* renamed from: F */
    private boolean f9314F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f9315G;

    /* renamed from: a */
    private final Uri f9316a;

    /* renamed from: b */
    private final C2809d f9317b;

    /* renamed from: c */
    private final int f9318c;

    /* renamed from: d */
    private final Handler f9319d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2730a f9320e;

    /* renamed from: f */
    private final C2734a f9321f;

    /* renamed from: g */
    private final C2806b f9322g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f9323h;

    /* renamed from: i */
    private final Loader f9324i = new Loader("Loader:ExtractorMediaPeriod");

    /* renamed from: j */
    private final C2727b f9325j;

    /* renamed from: k */
    private final C2491d f9326k;

    /* renamed from: l */
    private final Runnable f9327l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Runnable f9328m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Handler f9329n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final SparseArray<C2572d> f9330o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2732a f9331p;

    /* renamed from: q */
    private C2657m f9332q;

    /* renamed from: r */
    private boolean f9333r;

    /* renamed from: s */
    private boolean f9334s;

    /* renamed from: t */
    private boolean f9335t;

    /* renamed from: u */
    private boolean f9336u;

    /* renamed from: v */
    private int f9337v;

    /* renamed from: w */
    private C2740i f9338w;

    /* renamed from: x */
    private long f9339x;

    /* renamed from: y */
    private boolean[] f9340y;

    /* renamed from: z */
    private boolean[] f9341z;

    /* renamed from: com.google.android.exoplayer2.source.a$a */
    final class C2726a implements C2804c {

        /* renamed from: b */
        private final Uri f9349b;

        /* renamed from: c */
        private final C2809d f9350c;

        /* renamed from: d */
        private final C2727b f9351d;

        /* renamed from: e */
        private final C2491d f9352e;

        /* renamed from: f */
        private final C2656l f9353f = new C2656l();

        /* renamed from: g */
        private volatile boolean f9354g;

        /* renamed from: h */
        private boolean f9355h = true;

        /* renamed from: i */
        private long f9356i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public long f9357j = -1;

        public C2726a(Uri uri, C2809d dVar, C2727b bVar, C2491d dVar2) {
            this.f9349b = (Uri) C2488a.m11664a(uri);
            this.f9350c = (C2809d) C2488a.m11664a(dVar);
            this.f9351d = (C2727b) C2488a.m11664a(bVar);
            this.f9352e = dVar2;
        }

        /* renamed from: a */
        public void mo9359a() {
            this.f9354g = true;
        }

        /* renamed from: a */
        public void mo9360a(long j, long j2) {
            this.f9353f.f9025a = j;
            this.f9356i = j2;
            this.f9355h = true;
        }

        /* renamed from: b */
        public boolean mo9361b() {
            return this.f9354g;
        }

        /* renamed from: c */
        public void mo9362c() {
            C2536b bVar;
            int i = 0;
            while (i == 0 && !this.f9354g) {
                try {
                    long j = this.f9353f.f9025a;
                    C2809d dVar = this.f9350c;
                    C2811e eVar = new C2811e(this.f9349b, j, -1, C2721a.this.f9323h);
                    this.f9357j = dVar.mo9519a(eVar);
                    if (this.f9357j != -1) {
                        this.f9357j += j;
                    }
                    bVar = new C2536b(this.f9350c, j, this.f9357j);
                    try {
                        C2639f a = this.f9351d.mo9363a(bVar, this.f9350c.mo9520a());
                        if (this.f9355h) {
                            a.mo8951a(j, this.f9356i);
                            this.f9355h = false;
                        }
                        while (i == 0 && !this.f9354g) {
                            this.f9352e.mo8800c();
                            int a2 = a.mo8945a((C2650g) bVar, this.f9353f);
                            try {
                                if (bVar.mo8973c() > 1048576 + j) {
                                    j = bVar.mo8973c();
                                    this.f9352e.mo8799b();
                                    C2721a.this.f9329n.post(C2721a.this.f9328m);
                                }
                                i = a2;
                            } catch (Throwable th) {
                                th = th;
                                i = a2;
                                this.f9353f.f9025a = bVar.mo8973c();
                                C2511s.m11805a(this.f9350c);
                                throw th;
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f9353f.f9025a = bVar.mo8973c();
                        }
                        C2511s.m11805a(this.f9350c);
                    } catch (Throwable th2) {
                        th = th2;
                        if (!(i == 1 || bVar == null)) {
                            this.f9353f.f9025a = bVar.mo8973c();
                        }
                        C2511s.m11805a(this.f9350c);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bVar = null;
                    this.f9353f.f9025a = bVar.mo8973c();
                    C2511s.m11805a(this.f9350c);
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.a$b */
    private static final class C2727b {

        /* renamed from: a */
        private final C2639f[] f9358a;

        /* renamed from: b */
        private final C2651h f9359b;

        /* renamed from: c */
        private C2639f f9360c;

        public C2727b(C2639f[] fVarArr, C2651h hVar) {
            this.f9358a = fVarArr;
            this.f9359b = hVar;
        }

        /* renamed from: a */
        public C2639f mo9363a(C2650g gVar, Uri uri) {
            if (this.f9360c != null) {
                return this.f9360c;
            }
            C2639f[] fVarArr = this.f9358a;
            int length = fVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C2639f fVar = fVarArr[i];
                try {
                    if (fVar.mo8953a(gVar)) {
                        this.f9360c = fVar;
                        gVar.mo8965a();
                        break;
                    }
                    gVar.mo8965a();
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    gVar.mo8965a();
                    throw th;
                }
            }
            if (this.f9360c != null) {
                this.f9360c.mo8952a(this.f9359b);
                return this.f9360c;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("None of the available extractors (");
            sb.append(C2511s.m11803a((Object[]) this.f9358a));
            sb.append(") could read the stream.");
            throw new UnrecognizedInputFormatException(sb.toString(), uri);
        }

        /* renamed from: a */
        public void mo9364a() {
            if (this.f9360c != null) {
                this.f9360c.mo8955c();
                this.f9360c = null;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.a$c */
    private final class C2728c implements C2735e {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f9362b;

        public C2728c(int i) {
            this.f9362b = i;
        }

        /* renamed from: a */
        public int mo9365a(C2668i iVar, C2438e eVar, boolean z) {
            return C2721a.this.mo9334a(this.f9362b, iVar, eVar, z);
        }

        /* renamed from: a */
        public void mo9366a(long j) {
            C2721a.this.mo9338a(this.f9362b, j);
        }

        /* renamed from: a */
        public boolean mo9367a() {
            return C2721a.this.mo9345a(this.f9362b);
        }

        /* renamed from: b */
        public void mo9368b() {
            C2721a.this.mo9354h();
        }
    }

    public C2721a(Uri uri, C2809d dVar, C2639f[] fVarArr, int i, Handler handler, C2730a aVar, C2734a aVar2, C2806b bVar, String str) {
        this.f9316a = uri;
        this.f9317b = dVar;
        this.f9318c = i;
        this.f9319d = handler;
        this.f9320e = aVar;
        this.f9321f = aVar2;
        this.f9322g = bVar;
        this.f9323h = str;
        this.f9325j = new C2727b(fVarArr, this);
        this.f9326k = new C2491d();
        this.f9327l = new Runnable() {
            public void run() {
                C2721a.this.m12911i();
            }
        };
        this.f9328m = new Runnable() {
            public void run() {
                if (!C2721a.this.f9315G) {
                    C2721a.this.f9331p.mo9135a(C2721a.this);
                }
            }
        };
        this.f9329n = new Handler();
        this.f9312D = -9223372036854775807L;
        this.f9330o = new SparseArray<>();
        this.f9310B = -1;
    }

    /* renamed from: a */
    private void m12899a(C2726a aVar) {
        if (this.f9310B == -1) {
            this.f9310B = aVar.f9357j;
        }
    }

    /* renamed from: a */
    private boolean m12901a(IOException iOException) {
        return iOException instanceof UnrecognizedInputFormatException;
    }

    /* renamed from: b */
    private void m12902b(C2726a aVar) {
        if (this.f9310B != -1) {
            return;
        }
        if (this.f9332q == null || this.f9332q.mo8931b() == -9223372036854775807L) {
            this.f9311C = 0;
            this.f9336u = this.f9334s;
            int size = this.f9330o.size();
            for (int i = 0; i < size; i++) {
                ((C2572d) this.f9330o.valueAt(i)).mo9005a(!this.f9334s || this.f9340y[i]);
            }
            aVar.mo9360a(0, 0);
        }
    }

    /* renamed from: b */
    private void m12903b(final IOException iOException) {
        if (this.f9319d != null && this.f9320e != null) {
            this.f9319d.post(new Runnable() {
                public void run() {
                    C2721a.this.f9320e.mo9374a(iOException);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m12911i() {
        if (!this.f9315G && !this.f9334s && this.f9332q != null && this.f9333r) {
            int size = this.f9330o.size();
            int i = 0;
            while (i < size) {
                if (((C2572d) this.f9330o.valueAt(i)).mo9009d() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f9326k.mo8799b();
            C2739h[] hVarArr = new C2739h[size];
            this.f9341z = new boolean[size];
            this.f9340y = new boolean[size];
            this.f9339x = this.f9332q.mo8931b();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 >= size) {
                    break;
                }
                Format d = ((C2572d) this.f9330o.valueAt(i2)).mo9009d();
                hVarArr[i2] = new C2739h(d);
                String str = d.f7738f;
                if (!C2495h.m11693b(str) && !C2495h.m11692a(str)) {
                    z = false;
                }
                this.f9341z[i2] = z;
                this.f9309A = z | this.f9309A;
                i2++;
            }
            this.f9338w = new C2740i(hVarArr);
            this.f9334s = true;
            this.f9321f.mo9132a(new C2738g(this.f9339x, this.f9332q.mo8930a()), null);
            this.f9331p.mo9133a(this);
        }
    }

    /* renamed from: j */
    private void m12912j() {
        C2726a aVar = new C2726a(this.f9316a, this.f9317b, this.f9325j, this.f9326k);
        if (this.f9334s) {
            C2488a.m11668b(m12915m());
            if (this.f9339x == -9223372036854775807L || this.f9312D < this.f9339x) {
                aVar.mo9360a(this.f9332q.mo8932b(this.f9312D), this.f9312D);
                this.f9312D = -9223372036854775807L;
            } else {
                this.f9314F = true;
                this.f9312D = -9223372036854775807L;
                return;
            }
        }
        this.f9313E = m12913k();
        int i = this.f9318c;
        if (i == -1) {
            i = (this.f9334s && this.f9310B == -1 && (this.f9332q == null || this.f9332q.mo8931b() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f9324i.mo9527a(aVar, this, i);
    }

    /* renamed from: k */
    private int m12913k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f9330o.size(); i2++) {
            i += ((C2572d) this.f9330o.valueAt(i2)).mo8998a();
        }
        return i;
    }

    /* renamed from: l */
    private long m12914l() {
        int size = this.f9330o.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((C2572d) this.f9330o.valueAt(i)).mo9010e());
        }
        return j;
    }

    /* renamed from: m */
    private boolean m12915m() {
        return this.f9312D != -9223372036854775807L;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo9334a(int i, C2668i iVar, C2438e eVar, boolean z) {
        if (this.f9336u || m12915m()) {
            return -3;
        }
        return ((C2572d) this.f9330o.valueAt(i)).mo9000a(iVar, eVar, z, this.f9314F, this.f9311C);
    }

    /* renamed from: a */
    public int mo9336a(C2726a aVar, long j, long j2, IOException iOException) {
        m12899a(aVar);
        m12903b(iOException);
        if (m12901a(iOException)) {
            return 3;
        }
        int i = m12913k() > this.f9313E ? 1 : 0;
        m12902b(aVar);
        this.f9313E = m12913k();
        return i;
    }

    /* renamed from: a */
    public long mo9337a(C2481f[] fVarArr, boolean[] zArr, C2735e[] eVarArr, boolean[] zArr2, long j) {
        C2488a.m11668b(this.f9334s);
        for (int i = 0; i < fVarArr.length; i++) {
            if (eVarArr[i] != null && (fVarArr[i] == null || !zArr[i])) {
                int a = eVarArr[i].f9362b;
                C2488a.m11668b(this.f9340y[a]);
                this.f9337v--;
                this.f9340y[a] = false;
                ((C2572d) this.f9330o.valueAt(a)).mo9007b();
                eVarArr[i] = null;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            if (eVarArr[i2] == null && fVarArr[i2] != null) {
                C2481f fVar = fVarArr[i2];
                C2488a.m11668b(fVar.mo8766b() == 1);
                C2488a.m11668b(fVar.mo8767b(0) == 0);
                int a2 = this.f9338w.mo9379a(fVar.mo8764a());
                C2488a.m11668b(!this.f9340y[a2]);
                this.f9337v++;
                this.f9340y[a2] = true;
                eVarArr[i2] = new C2728c(a2);
                zArr2[i2] = true;
                z = true;
            }
        }
        if (!this.f9335t) {
            int size = this.f9330o.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.f9340y[i3]) {
                    ((C2572d) this.f9330o.valueAt(i3)).mo9007b();
                }
            }
        }
        if (this.f9337v == 0) {
            this.f9336u = false;
            if (this.f9324i.mo9530a()) {
                this.f9324i.mo9531b();
            }
        } else if (!this.f9335t ? j != 0 : z) {
            j = mo9348c(j);
            for (int i4 = 0; i4 < eVarArr.length; i4++) {
                if (eVarArr[i4] != null) {
                    zArr2[i4] = true;
                }
            }
        }
        this.f9335t = true;
        return j;
    }

    /* renamed from: a */
    public C2659n mo9116a(int i, int i2) {
        C2572d dVar = (C2572d) this.f9330o.get(i);
        if (dVar != null) {
            return dVar;
        }
        C2572d dVar2 = new C2572d(this.f9322g);
        dVar2.mo9004a((C2576c) this);
        this.f9330o.put(i, dVar2);
        return dVar2;
    }

    /* renamed from: a */
    public void mo9117a() {
        this.f9333r = true;
        this.f9329n.post(this.f9327l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9338a(int i, long j) {
        C2572d dVar = (C2572d) this.f9330o.valueAt(i);
        if (!this.f9314F || j <= dVar.mo9010e()) {
            dVar.mo9006a(j, true);
        } else {
            dVar.mo9011f();
        }
    }

    /* renamed from: a */
    public void mo9339a(long j) {
    }

    /* renamed from: a */
    public void mo9026a(Format format) {
        this.f9329n.post(this.f9327l);
    }

    /* renamed from: a */
    public void mo9118a(C2657m mVar) {
        this.f9332q = mVar;
        this.f9329n.post(this.f9327l);
    }

    /* renamed from: a */
    public void mo9343a(C2726a aVar, long j, long j2) {
        m12899a(aVar);
        this.f9314F = true;
        if (this.f9339x == -9223372036854775807L) {
            long l = m12914l();
            this.f9339x = l == Long.MIN_VALUE ? 0 : l + 10000;
            this.f9321f.mo9132a(new C2738g(this.f9339x, this.f9332q.mo8930a()), null);
        }
        this.f9331p.mo9135a(this);
    }

    /* renamed from: a */
    public void mo9344a(C2726a aVar, long j, long j2, boolean z) {
        m12899a(aVar);
        if (!z && this.f9337v > 0) {
            int size = this.f9330o.size();
            for (int i = 0; i < size; i++) {
                ((C2572d) this.f9330o.valueAt(i)).mo9005a(this.f9340y[i]);
            }
            this.f9331p.mo9135a(this);
        }
    }

    /* renamed from: a */
    public void mo9342a(C2732a aVar) {
        this.f9331p = aVar;
        this.f9326k.mo8798a();
        m12912j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9345a(int i) {
        return this.f9314F || (!m12915m() && !((C2572d) this.f9330o.valueAt(i)).mo9008c());
    }

    /* renamed from: b */
    public void mo9346b() {
        final C2727b bVar = this.f9325j;
        this.f9324i.mo9529a((Runnable) new Runnable() {
            public void run() {
                bVar.mo9364a();
                int size = C2721a.this.f9330o.size();
                for (int i = 0; i < size; i++) {
                    ((C2572d) C2721a.this.f9330o.valueAt(i)).mo9007b();
                }
            }
        });
        this.f9329n.removeCallbacksAndMessages(null);
        this.f9315G = true;
    }

    /* renamed from: b */
    public boolean mo9347b(long j) {
        if (this.f9314F || (this.f9334s && this.f9337v == 0)) {
            return false;
        }
        boolean a = this.f9326k.mo8798a();
        if (!this.f9324i.mo9530a()) {
            m12912j();
            a = true;
        }
        return a;
    }

    /* renamed from: c */
    public long mo9348c(long j) {
        if (!this.f9332q.mo8930a()) {
            j = 0;
        }
        this.f9311C = j;
        int size = this.f9330o.size();
        boolean z = !m12915m();
        int i = 0;
        while (z && i < size) {
            if (this.f9340y[i]) {
                z = ((C2572d) this.f9330o.valueAt(i)).mo9006a(j, false);
            }
            i++;
        }
        if (!z) {
            this.f9312D = j;
            this.f9314F = false;
            if (this.f9324i.mo9530a()) {
                this.f9324i.mo9531b();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    ((C2572d) this.f9330o.valueAt(i2)).mo9005a(this.f9340y[i2]);
                }
            }
        }
        this.f9336u = false;
        return j;
    }

    /* renamed from: c */
    public void mo9349c() {
        mo9354h();
    }

    /* renamed from: d */
    public C2740i mo9350d() {
        return this.f9338w;
    }

    /* renamed from: e */
    public long mo9351e() {
        if (this.f9337v == 0) {
            return Long.MIN_VALUE;
        }
        return mo9353g();
    }

    /* renamed from: f */
    public long mo9352f() {
        if (!this.f9336u) {
            return -9223372036854775807L;
        }
        this.f9336u = false;
        return this.f9311C;
    }

    /* renamed from: g */
    public long mo9353g() {
        long j;
        if (this.f9314F) {
            return Long.MIN_VALUE;
        }
        if (m12915m()) {
            return this.f9312D;
        }
        if (this.f9309A) {
            j = Long.MAX_VALUE;
            int size = this.f9330o.size();
            for (int i = 0; i < size; i++) {
                if (this.f9341z[i]) {
                    j = Math.min(j, ((C2572d) this.f9330o.valueAt(i)).mo9010e());
                }
            }
        } else {
            j = m12914l();
        }
        if (j == Long.MIN_VALUE) {
            j = this.f9311C;
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo9354h() {
        this.f9324i.mo9532c();
    }
}
