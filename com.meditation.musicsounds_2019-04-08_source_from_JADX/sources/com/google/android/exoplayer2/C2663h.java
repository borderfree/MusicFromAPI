package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C2520e.C2523c;
import com.google.android.exoplayer2.C2717q.C2719a;
import com.google.android.exoplayer2.C2717q.C2720b;
import com.google.android.exoplayer2.p101b.C2481f;
import com.google.android.exoplayer2.p101b.C2483g;
import com.google.android.exoplayer2.p101b.C2484h;
import com.google.android.exoplayer2.p101b.C2484h.C2485a;
import com.google.android.exoplayer2.p101b.C2486i;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2494g;
import com.google.android.exoplayer2.p102c.C2508p;
import com.google.android.exoplayer2.source.C2731c;
import com.google.android.exoplayer2.source.C2731c.C2732a;
import com.google.android.exoplayer2.source.C2733d;
import com.google.android.exoplayer2.source.C2733d.C2734a;
import com.google.android.exoplayer2.source.C2735e;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.h */
final class C2663h implements Callback, C2485a, C2732a, C2734a {

    /* renamed from: A */
    private C2666c f9051A;

    /* renamed from: B */
    private long f9052B;

    /* renamed from: C */
    private C2664a f9053C;

    /* renamed from: D */
    private C2664a f9054D;

    /* renamed from: E */
    private C2664a f9055E;

    /* renamed from: F */
    private C2717q f9056F;

    /* renamed from: a */
    private final C2671l[] f9057a;

    /* renamed from: b */
    private final C2672m[] f9058b;

    /* renamed from: c */
    private final C2484h f9059c;

    /* renamed from: d */
    private final C2669j f9060d;

    /* renamed from: e */
    private final C2508p f9061e;

    /* renamed from: f */
    private final Handler f9062f;

    /* renamed from: g */
    private final HandlerThread f9063g;

    /* renamed from: h */
    private final Handler f9064h;

    /* renamed from: i */
    private final C2520e f9065i;

    /* renamed from: j */
    private final C2720b f9066j;

    /* renamed from: k */
    private final C2719a f9067k;

    /* renamed from: l */
    private C2665b f9068l;

    /* renamed from: m */
    private C2670k f9069m;

    /* renamed from: n */
    private C2671l f9070n;

    /* renamed from: o */
    private C2494g f9071o;

    /* renamed from: p */
    private C2733d f9072p;

    /* renamed from: q */
    private C2671l[] f9073q;

    /* renamed from: r */
    private boolean f9074r;

    /* renamed from: s */
    private boolean f9075s;

    /* renamed from: t */
    private boolean f9076t;

    /* renamed from: u */
    private boolean f9077u;

    /* renamed from: v */
    private int f9078v = 1;

    /* renamed from: w */
    private int f9079w;

    /* renamed from: x */
    private int f9080x;

    /* renamed from: y */
    private long f9081y;

    /* renamed from: z */
    private int f9082z;

    /* renamed from: com.google.android.exoplayer2.h$a */
    private static final class C2664a {

        /* renamed from: a */
        public final C2731c f9083a;

        /* renamed from: b */
        public final Object f9084b;

        /* renamed from: c */
        public final C2735e[] f9085c;

        /* renamed from: d */
        public final boolean[] f9086d;

        /* renamed from: e */
        public final long f9087e;

        /* renamed from: f */
        public int f9088f;

        /* renamed from: g */
        public long f9089g;

        /* renamed from: h */
        public boolean f9090h;

        /* renamed from: i */
        public boolean f9091i;

        /* renamed from: j */
        public boolean f9092j;

        /* renamed from: k */
        public C2664a f9093k;

        /* renamed from: l */
        public boolean f9094l;

        /* renamed from: m */
        public C2486i f9095m;

        /* renamed from: n */
        private final C2671l[] f9096n;

        /* renamed from: o */
        private final C2672m[] f9097o;

        /* renamed from: p */
        private final C2484h f9098p;

        /* renamed from: q */
        private final C2669j f9099q;

        /* renamed from: r */
        private final C2733d f9100r;

        /* renamed from: s */
        private C2486i f9101s;

        public C2664a(C2671l[] lVarArr, C2672m[] mVarArr, long j, C2484h hVar, C2669j jVar, C2733d dVar, Object obj, int i, boolean z, long j2) {
            this.f9096n = lVarArr;
            this.f9097o = mVarArr;
            this.f9087e = j;
            this.f9098p = hVar;
            this.f9099q = jVar;
            this.f9100r = dVar;
            this.f9084b = C2488a.m11664a(obj);
            this.f9088f = i;
            this.f9090h = z;
            this.f9089g = j2;
            this.f9085c = new C2735e[lVarArr.length];
            this.f9086d = new boolean[lVarArr.length];
            this.f9083a = dVar.mo9369a(i, jVar.mo8797d(), j2);
        }

        /* renamed from: a */
        public long mo9142a() {
            return this.f9087e - this.f9089g;
        }

        /* renamed from: a */
        public long mo9143a(long j) {
            return j + mo9142a();
        }

        /* renamed from: a */
        public long mo9144a(long j, boolean z) {
            return mo9145a(j, z, new boolean[this.f9096n.length]);
        }

        /* renamed from: a */
        public long mo9145a(long j, boolean z, boolean[] zArr) {
            C2483g gVar = this.f9095m.f8044b;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= gVar.f8039a) {
                    break;
                }
                boolean[] zArr2 = this.f9086d;
                if (z || !this.f9095m.mo8790a(this.f9101s, i)) {
                    z2 = false;
                }
                zArr2[i] = z2;
                i++;
            }
            long a = this.f9083a.mo9337a(gVar.mo8785a(), this.f9086d, this.f9085c, zArr, j);
            this.f9101s = this.f9095m;
            this.f9092j = false;
            for (int i2 = 0; i2 < this.f9085c.length; i2++) {
                if (this.f9085c[i2] != null) {
                    C2488a.m11668b(gVar.mo8784a(i2) != null);
                    this.f9092j = true;
                } else {
                    C2488a.m11668b(gVar.mo8784a(i2) == null);
                }
            }
            this.f9099q.mo8792a(this.f9096n, this.f9095m.f8043a, gVar);
            return a;
        }

        /* renamed from: a */
        public void mo9146a(int i, boolean z) {
            this.f9088f = i;
            this.f9090h = z;
        }

        /* renamed from: b */
        public long mo9147b(long j) {
            return j - mo9142a();
        }

        /* renamed from: b */
        public boolean mo9148b() {
            return this.f9091i && (!this.f9092j || this.f9083a.mo9353g() == Long.MIN_VALUE);
        }

        /* renamed from: c */
        public void mo9149c() {
            this.f9091i = true;
            mo9150d();
            this.f9089g = mo9144a(this.f9089g, false);
        }

        /* renamed from: d */
        public boolean mo9150d() {
            C2486i a = this.f9098p.mo8781a(this.f9097o, this.f9083a.mo9350d());
            if (a.mo8789a(this.f9101s)) {
                return false;
            }
            this.f9095m = a;
            return true;
        }

        /* renamed from: e */
        public void mo9151e() {
            try {
                this.f9100r.mo9372a(this.f9083a);
            } catch (RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Period release failed.", e);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.h$b */
    public static final class C2665b {

        /* renamed from: a */
        public final int f9102a;

        /* renamed from: b */
        public final long f9103b;

        /* renamed from: c */
        public volatile long f9104c;

        /* renamed from: d */
        public volatile long f9105d;

        public C2665b(int i, long j) {
            this.f9102a = i;
            this.f9103b = j;
            this.f9104c = j;
            this.f9105d = j;
        }

        /* renamed from: a */
        public C2665b mo9152a(int i) {
            C2665b bVar = new C2665b(i, this.f9103b);
            bVar.f9104c = this.f9104c;
            bVar.f9105d = this.f9105d;
            return bVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.h$c */
    private static final class C2666c {

        /* renamed from: a */
        public final C2717q f9106a;

        /* renamed from: b */
        public final int f9107b;

        /* renamed from: c */
        public final long f9108c;

        public C2666c(C2717q qVar, int i, long j) {
            this.f9106a = qVar;
            this.f9107b = i;
            this.f9108c = j;
        }
    }

    /* renamed from: com.google.android.exoplayer2.h$d */
    public static final class C2667d {

        /* renamed from: a */
        public final C2717q f9109a;

        /* renamed from: b */
        public final Object f9110b;

        /* renamed from: c */
        public final C2665b f9111c;

        /* renamed from: d */
        public final int f9112d;

        public C2667d(C2717q qVar, Object obj, C2665b bVar, int i) {
            this.f9109a = qVar;
            this.f9110b = obj;
            this.f9111c = bVar;
            this.f9112d = i;
        }
    }

    public C2663h(C2671l[] lVarArr, C2484h hVar, C2669j jVar, boolean z, Handler handler, C2665b bVar, C2520e eVar) {
        this.f9057a = lVarArr;
        this.f9059c = hVar;
        this.f9060d = jVar;
        this.f9075s = z;
        this.f9064h = handler;
        this.f9068l = bVar;
        this.f9065i = eVar;
        this.f9058b = new C2672m[lVarArr.length];
        for (int i = 0; i < lVarArr.length; i++) {
            lVarArr[i].mo8614a(i);
            this.f9058b[i] = lVarArr[i].mo8622b();
        }
        this.f9061e = new C2508p();
        this.f9073q = new C2671l[0];
        this.f9066j = new C2720b();
        this.f9067k = new C2719a();
        hVar.mo8788a((C2485a) this);
        this.f9069m = C2670k.f9114a;
        this.f9063g = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f9063g.start();
        this.f9062f = new Handler(this.f9063g.getLooper(), this);
    }

    /* renamed from: a */
    private int m12555a(int i, C2717q qVar, C2717q qVar2) {
        int i2 = i;
        int i3 = -1;
        while (i3 == -1 && i2 < qVar.mo9326c() - 1) {
            i2++;
            i3 = qVar2.mo9318a(qVar.mo9320a(i2, this.f9067k, true).f9294b);
        }
        return i3;
    }

    /* renamed from: a */
    private long m12556a(int i, long j) {
        C2664a aVar;
        m12580d();
        this.f9076t = false;
        m12558a(2);
        if (this.f9055E == null) {
            if (this.f9053C != null) {
                this.f9053C.mo9151e();
            }
            aVar = null;
        } else {
            aVar = null;
            for (C2664a aVar2 = this.f9055E; aVar2 != null; aVar2 = aVar2.f9093k) {
                if (aVar2.f9088f != i || !aVar2.f9091i) {
                    aVar2.mo9151e();
                } else {
                    aVar = aVar2;
                }
            }
        }
        if (!(this.f9055E == aVar && this.f9055E == this.f9054D)) {
            for (C2671l l : this.f9073q) {
                l.mo8633l();
            }
            this.f9073q = new C2671l[0];
            this.f9071o = null;
            this.f9070n = null;
            this.f9055E = null;
        }
        if (aVar != null) {
            aVar.f9093k = null;
            this.f9053C = aVar;
            this.f9054D = aVar;
            m12571b(aVar);
            if (this.f9055E.f9092j) {
                j = this.f9055E.f9083a.mo9348c(j);
            }
            m12559a(j);
            m12592m();
        } else {
            this.f9053C = null;
            this.f9054D = null;
            this.f9055E = null;
            m12559a(j);
        }
        this.f9062f.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: a */
    private Pair<Integer, Long> m12557a(C2717q qVar, int i, long j, long j2) {
        C2488a.m11663a(i, 0, qVar.mo9325b());
        qVar.mo9323a(i, this.f9066j, false, j2);
        if (j == -9223372036854775807L) {
            j = this.f9066j.mo9330a();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = this.f9066j.f9304f;
        long c = this.f9066j.mo9333c() + j;
        while (true) {
            long a = qVar.mo9319a(i2, this.f9067k).mo9327a();
            if (a != -9223372036854775807L && c >= a && i2 < this.f9066j.f9305g) {
                c -= a;
                i2++;
            }
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(c));
    }

    /* renamed from: a */
    private void m12558a(int i) {
        if (this.f9078v != i) {
            this.f9078v = i;
            this.f9064h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: a */
    private void m12559a(long j) {
        this.f9052B = this.f9055E == null ? j + 60000000 : this.f9055E.mo9143a(j);
        this.f9061e.mo8872a(this.f9052B);
        for (C2671l a : this.f9073q) {
            a.mo8616a(this.f9052B);
        }
    }

    /* renamed from: a */
    private void m12560a(long j, long j2) {
        this.f9062f.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f9062f.sendEmptyMessage(2);
        } else {
            this.f9062f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12561a(android.util.Pair<com.google.android.exoplayer2.C2717q, java.lang.Object> r12) {
        /*
            r11 = this;
            com.google.android.exoplayer2.q r0 = r11.f9056F
            java.lang.Object r1 = r12.first
            com.google.android.exoplayer2.q r1 = (com.google.android.exoplayer2.C2717q) r1
            r11.f9056F = r1
            java.lang.Object r12 = r12.second
            r1 = 0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            if (r0 != 0) goto L_0x0070
            int r5 = r11.f9082z
            if (r5 <= 0) goto L_0x0041
            com.google.android.exoplayer2.h$c r5 = r11.f9051A
            android.util.Pair r5 = r11.m12569b(r5)
            int r6 = r11.f9082z
            r11.f9082z = r4
            r11.f9051A = r1
            if (r5 != 0) goto L_0x0029
            r11.m12566a(r12, r6)
            return
        L_0x0029:
            com.google.android.exoplayer2.h$b r7 = new com.google.android.exoplayer2.h$b
            java.lang.Object r8 = r5.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r9 = r5.longValue()
            r7.<init>(r8, r9)
            r11.f9068l = r7
            goto L_0x0071
        L_0x0041:
            com.google.android.exoplayer2.h$b r5 = r11.f9068l
            long r5 = r5.f9103b
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0070
            com.google.android.exoplayer2.q r5 = r11.f9056F
            boolean r5 = r5.mo9324a()
            if (r5 == 0) goto L_0x0055
            r11.m12566a(r12, r4)
            return
        L_0x0055:
            android.util.Pair r5 = r11.m12568b(r4, r2)
            com.google.android.exoplayer2.h$b r6 = new com.google.android.exoplayer2.h$b
            java.lang.Object r7 = r5.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r8 = r5.longValue()
            r6.<init>(r7, r8)
            r11.f9068l = r6
        L_0x0070:
            r6 = 0
        L_0x0071:
            com.google.android.exoplayer2.h$a r5 = r11.f9055E
            if (r5 == 0) goto L_0x0078
            com.google.android.exoplayer2.h$a r5 = r11.f9055E
            goto L_0x007a
        L_0x0078:
            com.google.android.exoplayer2.h$a r5 = r11.f9053C
        L_0x007a:
            if (r5 != 0) goto L_0x0080
            r11.m12573b(r12, r6)
            return
        L_0x0080:
            com.google.android.exoplayer2.q r7 = r11.f9056F
            java.lang.Object r8 = r5.f9084b
            int r7 = r7.mo9318a(r8)
            r8 = -1
            r9 = 1
            if (r7 != r8) goto L_0x00e8
            int r1 = r5.f9088f
            com.google.android.exoplayer2.q r4 = r11.f9056F
            int r0 = r11.m12555a(r1, r0, r4)
            if (r0 != r8) goto L_0x009a
            r11.m12566a(r12, r6)
            return
        L_0x009a:
            com.google.android.exoplayer2.q r1 = r11.f9056F
            com.google.android.exoplayer2.q$a r4 = r11.f9067k
            com.google.android.exoplayer2.q$a r0 = r1.mo9319a(r0, r4)
            int r0 = r0.f9295c
            android.util.Pair r0 = r11.m12568b(r0, r2)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            com.google.android.exoplayer2.q r0 = r11.f9056F
            com.google.android.exoplayer2.q$a r4 = r11.f9067k
            r0.mo9320a(r1, r4, r9)
            com.google.android.exoplayer2.q$a r0 = r11.f9067k
            java.lang.Object r0 = r0.f9294b
            r5.f9088f = r8
        L_0x00c5:
            com.google.android.exoplayer2.h$a r4 = r5.f9093k
            if (r4 == 0) goto L_0x00d9
            com.google.android.exoplayer2.h$a r5 = r5.f9093k
            java.lang.Object r4 = r5.f9084b
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00d5
            r4 = r1
            goto L_0x00d6
        L_0x00d5:
            r4 = -1
        L_0x00d6:
            r5.f9088f = r4
            goto L_0x00c5
        L_0x00d9:
            long r2 = r11.m12556a(r1, r2)
            com.google.android.exoplayer2.h$b r0 = new com.google.android.exoplayer2.h$b
            r0.<init>(r1, r2)
            r11.f9068l = r0
            r11.m12573b(r12, r6)
            return
        L_0x00e8:
            com.google.android.exoplayer2.q r0 = r11.f9056F
            com.google.android.exoplayer2.q$a r2 = r11.f9067k
            r0.mo9319a(r7, r2)
            com.google.android.exoplayer2.q r0 = r11.f9056F
            int r0 = r0.mo9326c()
            int r0 = r0 - r9
            if (r7 != r0) goto L_0x010a
            com.google.android.exoplayer2.q r0 = r11.f9056F
            com.google.android.exoplayer2.q$a r2 = r11.f9067k
            int r2 = r2.f9295c
            com.google.android.exoplayer2.q$b r3 = r11.f9066j
            com.google.android.exoplayer2.q$b r0 = r0.mo9321a(r2, r3)
            boolean r0 = r0.f9303e
            if (r0 != 0) goto L_0x010a
            r0 = 1
            goto L_0x010b
        L_0x010a:
            r0 = 0
        L_0x010b:
            r5.mo9146a(r7, r0)
            com.google.android.exoplayer2.h$a r0 = r11.f9054D
            if (r5 != r0) goto L_0x0114
            r0 = 1
            goto L_0x0115
        L_0x0114:
            r0 = 0
        L_0x0115:
            com.google.android.exoplayer2.h$b r2 = r11.f9068l
            int r2 = r2.f9102a
            if (r7 == r2) goto L_0x0123
            com.google.android.exoplayer2.h$b r2 = r11.f9068l
            com.google.android.exoplayer2.h$b r2 = r2.mo9152a(r7)
            r11.f9068l = r2
        L_0x0123:
            com.google.android.exoplayer2.h$a r2 = r5.f9093k
            if (r2 == 0) goto L_0x0185
            com.google.android.exoplayer2.h$a r2 = r5.f9093k
            int r7 = r7 + r9
            com.google.android.exoplayer2.q r3 = r11.f9056F
            com.google.android.exoplayer2.q$a r8 = r11.f9067k
            r3.mo9320a(r7, r8, r9)
            com.google.android.exoplayer2.q r3 = r11.f9056F
            int r3 = r3.mo9326c()
            int r3 = r3 - r9
            if (r7 != r3) goto L_0x014c
            com.google.android.exoplayer2.q r3 = r11.f9056F
            com.google.android.exoplayer2.q$a r8 = r11.f9067k
            int r8 = r8.f9295c
            com.google.android.exoplayer2.q$b r10 = r11.f9066j
            com.google.android.exoplayer2.q$b r3 = r3.mo9321a(r8, r10)
            boolean r3 = r3.f9303e
            if (r3 != 0) goto L_0x014c
            r3 = 1
            goto L_0x014d
        L_0x014c:
            r3 = 0
        L_0x014d:
            java.lang.Object r8 = r2.f9084b
            com.google.android.exoplayer2.q$a r10 = r11.f9067k
            java.lang.Object r10 = r10.f9294b
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0166
            r2.mo9146a(r7, r3)
            com.google.android.exoplayer2.h$a r3 = r11.f9054D
            if (r2 != r3) goto L_0x0162
            r3 = 1
            goto L_0x0163
        L_0x0162:
            r3 = 0
        L_0x0163:
            r0 = r0 | r3
            r5 = r2
            goto L_0x0123
        L_0x0166:
            if (r0 != 0) goto L_0x017c
            com.google.android.exoplayer2.h$a r0 = r11.f9055E
            int r0 = r0.f9088f
            com.google.android.exoplayer2.h$b r1 = r11.f9068l
            long r1 = r1.f9104c
            long r1 = r11.m12556a(r0, r1)
            com.google.android.exoplayer2.h$b r3 = new com.google.android.exoplayer2.h$b
            r3.<init>(r0, r1)
            r11.f9068l = r3
            goto L_0x0185
        L_0x017c:
            r11.f9053C = r5
            com.google.android.exoplayer2.h$a r0 = r11.f9053C
            r0.f9093k = r1
            r11.m12562a(r2)
        L_0x0185:
            r11.m12573b(r12, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C2663h.m12561a(android.util.Pair):void");
    }

    /* renamed from: a */
    private void m12562a(C2664a aVar) {
        while (aVar != null) {
            aVar.mo9151e();
            aVar = aVar.f9093k;
        }
    }

    /* renamed from: a */
    private void m12563a(C2666c cVar) {
        int i = 1;
        if (this.f9056F == null) {
            this.f9082z++;
            this.f9051A = cVar;
            return;
        }
        Pair b = m12569b(cVar);
        if (b == null) {
            this.f9068l = new C2665b(0, 0);
            this.f9064h.obtainMessage(4, 1, 0, this.f9068l).sendToTarget();
            this.f9068l = new C2665b(0, -9223372036854775807L);
            m12558a(4);
            m12582d(false);
            return;
        }
        int i2 = cVar.f9108c == -9223372036854775807L ? 1 : 0;
        int intValue = ((Integer) b.first).intValue();
        long longValue = ((Long) b.second).longValue();
        try {
            if (intValue != this.f9068l.f9102a || longValue / 1000 != this.f9068l.f9104c / 1000) {
                long a = m12556a(intValue, longValue);
                int i3 = i2 | (longValue != a ? 1 : 0);
                this.f9068l = new C2665b(intValue, a);
                Handler handler = this.f9064h;
                if (i3 == 0) {
                    i = 0;
                }
                handler.obtainMessage(4, i, 0, this.f9068l).sendToTarget();
            }
        } finally {
            this.f9068l = new C2665b(intValue, longValue);
            this.f9064h.obtainMessage(4, i2, 0, this.f9068l).sendToTarget();
        }
    }

    /* renamed from: a */
    private void m12564a(C2670k kVar) {
        C2670k a = this.f9071o != null ? this.f9071o.mo8735a(kVar) : this.f9061e.mo8735a(kVar);
        this.f9069m = a;
        this.f9064h.obtainMessage(7, a).sendToTarget();
    }

    /* renamed from: a */
    private void m12565a(C2671l lVar) {
        if (lVar.mo8625d() == 2) {
            lVar.mo8632k();
        }
    }

    /* renamed from: a */
    private void m12566a(Object obj, int i) {
        this.f9068l = new C2665b(0, 0);
        m12573b(obj, i);
        this.f9068l = new C2665b(0, -9223372036854775807L);
        m12558a(4);
        m12582d(false);
    }

    /* renamed from: a */
    private void m12567a(boolean[] zArr, int i) {
        this.f9073q = new C2671l[i];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9057a.length; i3++) {
            C2671l lVar = this.f9057a[i3];
            C2481f a = this.f9055E.f9095m.f8044b.mo8784a(i3);
            if (a != null) {
                int i4 = i2 + 1;
                this.f9073q[i2] = lVar;
                if (lVar.mo8625d() == 0) {
                    C2711n nVar = this.f9055E.f9095m.f8046d[i3];
                    boolean z = this.f9075s && this.f9078v == 3;
                    boolean z2 = !zArr[i3] && z;
                    Format[] formatArr = new Format[a.mo8766b()];
                    for (int i5 = 0; i5 < formatArr.length; i5++) {
                        formatArr[i5] = a.mo8763a(i5);
                    }
                    lVar.mo8618a(nVar, formatArr, this.f9055E.f9085c[i3], this.f9052B, z2, this.f9055E.mo9142a());
                    C2494g c = lVar.mo8624c();
                    if (c != null) {
                        if (this.f9071o == null) {
                            this.f9071o = c;
                            this.f9070n = lVar;
                            this.f9071o.mo8735a(this.f9069m);
                        } else {
                            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        lVar.mo8626e();
                    }
                }
                i2 = i4;
            }
        }
    }

    /* renamed from: b */
    private Pair<Integer, Long> m12568b(int i, long j) {
        return m12570b(this.f9056F, i, j);
    }

    /* renamed from: b */
    private Pair<Integer, Long> m12569b(C2666c cVar) {
        C2717q qVar = cVar.f9106a;
        if (qVar.mo9324a()) {
            qVar = this.f9056F;
        }
        try {
            Pair<Integer, Long> b = m12570b(qVar, cVar.f9107b, cVar.f9108c);
            if (this.f9056F == qVar) {
                return b;
            }
            int a = this.f9056F.mo9318a(qVar.mo9320a(((Integer) b.first).intValue(), this.f9067k, true).f9294b);
            if (a != -1) {
                return Pair.create(Integer.valueOf(a), b.second);
            }
            int a2 = m12555a(((Integer) b.first).intValue(), qVar, this.f9056F);
            if (a2 != -1) {
                return m12568b(this.f9056F.mo9319a(a2, this.f9067k).f9295c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalSeekPositionException(this.f9056F, cVar.f9107b, cVar.f9108c);
        }
    }

    /* renamed from: b */
    private Pair<Integer, Long> m12570b(C2717q qVar, int i, long j) {
        return m12557a(qVar, i, j, 0);
    }

    /* renamed from: b */
    private void m12571b(C2664a aVar) {
        if (this.f9055E != aVar) {
            boolean[] zArr = new boolean[this.f9057a.length];
            int i = 0;
            for (int i2 = 0; i2 < this.f9057a.length; i2++) {
                C2671l lVar = this.f9057a[i2];
                zArr[i2] = lVar.mo8625d() != 0;
                C2481f a = aVar.f9095m.f8044b.mo8784a(i2);
                if (a != null) {
                    i++;
                }
                if (zArr[i2] && (a == null || (lVar.mo8630i() && lVar.mo8627f() == this.f9055E.f9085c[i2]))) {
                    if (lVar == this.f9070n) {
                        this.f9061e.mo8873a(this.f9071o);
                        this.f9071o = null;
                        this.f9070n = null;
                    }
                    m12565a(lVar);
                    lVar.mo8633l();
                }
            }
            this.f9055E = aVar;
            this.f9064h.obtainMessage(3, aVar.f9095m).sendToTarget();
            m12567a(zArr, i);
        }
    }

    /* renamed from: b */
    private void m12572b(C2733d dVar, boolean z) {
        this.f9064h.sendEmptyMessage(0);
        m12582d(true);
        this.f9060d.mo8791a();
        if (z) {
            this.f9068l = new C2665b(0, -9223372036854775807L);
        }
        this.f9072p = dVar;
        dVar.mo9371a(this.f9065i, true, (C2734a) this);
        m12558a(2);
        this.f9062f.sendEmptyMessage(2);
    }

    /* renamed from: b */
    private void m12573b(Object obj, int i) {
        this.f9064h.obtainMessage(6, new C2667d(this.f9056F, obj, this.f9068l, i)).sendToTarget();
    }

    /* renamed from: b */
    private void m12574b(boolean z) {
        if (this.f9077u != z) {
            this.f9077u = z;
            this.f9064h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: b */
    private boolean m12575b(long j) {
        return j == -9223372036854775807L || this.f9068l.f9104c < j || (this.f9055E.f9093k != null && this.f9055E.f9093k.f9091i);
    }

    /* renamed from: c */
    private void m12576c() {
        this.f9076t = false;
        this.f9061e.mo8871a();
        for (C2671l e : this.f9073q) {
            e.mo8626e();
        }
    }

    /* renamed from: c */
    private void m12577c(C2731c cVar) {
        if (this.f9053C != null && this.f9053C.f9083a == cVar) {
            this.f9053C.mo9149c();
            if (this.f9055E == null) {
                this.f9054D = this.f9053C;
                m12559a(this.f9054D.f9089g);
                m12571b(this.f9054D);
            }
            m12592m();
        }
    }

    /* renamed from: c */
    private void m12578c(boolean z) {
        this.f9076t = false;
        this.f9075s = z;
        if (!z) {
            m12580d();
            m12583e();
            return;
        }
        if (this.f9078v == 3) {
            m12576c();
        } else if (this.f9078v != 2) {
            return;
        }
        this.f9062f.sendEmptyMessage(2);
    }

    /* renamed from: c */
    private void m12579c(C2523c[] cVarArr) {
        try {
            for (C2523c cVar : cVarArr) {
                cVar.f8146a.mo8615a(cVar.f8147b, cVar.f8148c);
            }
            if (this.f9072p != null) {
                this.f9062f.sendEmptyMessage(2);
            }
            synchronized (this) {
                this.f9080x++;
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f9080x++;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: d */
    private void m12580d() {
        this.f9061e.mo8874b();
        for (C2671l a : this.f9073q) {
            m12565a(a);
        }
    }

    /* renamed from: d */
    private void m12581d(C2731c cVar) {
        if (this.f9053C != null && this.f9053C.f9083a == cVar) {
            m12592m();
        }
    }

    /* renamed from: d */
    private void m12582d(boolean z) {
        C2671l[] lVarArr;
        this.f9062f.removeMessages(2);
        this.f9076t = false;
        this.f9061e.mo8874b();
        this.f9071o = null;
        this.f9070n = null;
        this.f9052B = 60000000;
        for (C2671l lVar : this.f9073q) {
            try {
                m12565a(lVar);
                lVar.mo8633l();
            } catch (ExoPlaybackException | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f9073q = new C2671l[0];
        m12562a(this.f9055E != null ? this.f9055E : this.f9053C);
        this.f9053C = null;
        this.f9054D = null;
        this.f9055E = null;
        m12574b(false);
        if (z) {
            if (this.f9072p != null) {
                this.f9072p.mo9373b();
                this.f9072p = null;
            }
            this.f9056F = null;
        }
    }

    /* renamed from: e */
    private void m12583e() {
        if (this.f9055E != null) {
            long f = this.f9055E.f9083a.mo9352f();
            if (f != -9223372036854775807L) {
                m12559a(f);
            } else {
                if (this.f9070n == null || this.f9070n.mo8746u()) {
                    this.f9052B = this.f9061e.mo8748w();
                } else {
                    this.f9052B = this.f9071o.mo8748w();
                    this.f9061e.mo8872a(this.f9052B);
                }
                f = this.f9055E.mo9147b(this.f9052B);
            }
            this.f9068l.f9104c = f;
            this.f9081y = SystemClock.elapsedRealtime() * 1000;
            long g = this.f9073q.length == 0 ? Long.MIN_VALUE : this.f9055E.f9083a.mo9353g();
            C2665b bVar = this.f9068l;
            if (g == Long.MIN_VALUE) {
                g = this.f9056F.mo9319a(this.f9055E.f9088f, this.f9067k).mo9327a();
            }
            bVar.f9105d = g;
        }
    }

    /* renamed from: e */
    private boolean m12584e(boolean z) {
        long g = !this.f9053C.f9091i ? this.f9053C.f9089g : this.f9053C.f9083a.mo9353g();
        if (g == Long.MIN_VALUE) {
            if (this.f9053C.f9090h) {
                return true;
            }
            g = this.f9056F.mo9319a(this.f9053C.f9088f, this.f9067k).mo9327a();
        }
        return this.f9060d.mo8794a(g - this.f9053C.mo9147b(this.f9052B), z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0132  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12585f() {
        /*
            r17 = this;
            r0 = r17
            long r1 = android.os.SystemClock.elapsedRealtime()
            r17.m12590k()
            com.google.android.exoplayer2.h$a r3 = r0.f9055E
            r4 = 10
            if (r3 != 0) goto L_0x0016
            r17.m12589j()
            r0.m12560a(r1, r4)
            return
        L_0x0016:
            java.lang.String r3 = "doSomeWork"
            com.google.android.exoplayer2.p102c.C2510r.m11793a(r3)
            r17.m12583e()
            com.google.android.exoplayer2.h$a r3 = r0.f9055E
            com.google.android.exoplayer2.source.c r3 = r3.f9083a
            com.google.android.exoplayer2.h$b r6 = r0.f9068l
            long r6 = r6.f9104c
            r3.mo9339a(r6)
            com.google.android.exoplayer2.l[] r3 = r0.f9073q
            int r6 = r3.length
            r9 = 0
            r10 = 1
            r11 = 1
        L_0x002f:
            if (r9 >= r6) goto L_0x0064
            r12 = r3[r9]
            long r13 = r0.f9052B
            long r7 = r0.f9081y
            r12.mo9156a(r13, r7)
            if (r10 == 0) goto L_0x0044
            boolean r7 = r12.mo8746u()
            if (r7 == 0) goto L_0x0044
            r10 = 1
            goto L_0x0045
        L_0x0044:
            r10 = 0
        L_0x0045:
            boolean r7 = r12.mo8745t()
            if (r7 != 0) goto L_0x0054
            boolean r7 = r12.mo8746u()
            if (r7 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r7 = 0
            goto L_0x0055
        L_0x0054:
            r7 = 1
        L_0x0055:
            if (r7 != 0) goto L_0x005a
            r12.mo8631j()
        L_0x005a:
            if (r11 == 0) goto L_0x0060
            if (r7 == 0) goto L_0x0060
            r11 = 1
            goto L_0x0061
        L_0x0060:
            r11 = 0
        L_0x0061:
            int r9 = r9 + 1
            goto L_0x002f
        L_0x0064:
            if (r11 != 0) goto L_0x0069
            r17.m12589j()
        L_0x0069:
            com.google.android.exoplayer2.c.g r3 = r0.f9071o
            if (r3 == 0) goto L_0x008e
            com.google.android.exoplayer2.c.g r3 = r0.f9071o
            com.google.android.exoplayer2.k r3 = r3.mo8749x()
            com.google.android.exoplayer2.k r6 = r0.f9069m
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x008e
            r0.f9069m = r3
            com.google.android.exoplayer2.c.p r6 = r0.f9061e
            com.google.android.exoplayer2.c.g r7 = r0.f9071o
            r6.mo8873a(r7)
            android.os.Handler r6 = r0.f9064h
            r7 = 7
            android.os.Message r3 = r6.obtainMessage(r7, r3)
            r3.sendToTarget()
        L_0x008e:
            com.google.android.exoplayer2.q r3 = r0.f9056F
            com.google.android.exoplayer2.h$a r6 = r0.f9055E
            int r6 = r6.f9088f
            com.google.android.exoplayer2.q$a r7 = r0.f9067k
            com.google.android.exoplayer2.q$a r3 = r3.mo9319a(r6, r7)
            long r6 = r3.mo9327a()
            r3 = 3
            r8 = 2
            if (r10 == 0) goto L_0x00c1
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x00b3
            com.google.android.exoplayer2.h$b r9 = r0.f9068l
            long r9 = r9.f9104c
            int r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x00c1
        L_0x00b3:
            com.google.android.exoplayer2.h$a r9 = r0.f9055E
            boolean r9 = r9.f9090h
            if (r9 == 0) goto L_0x00c1
            r6 = 4
            r0.m12558a(r6)
        L_0x00bd:
            r17.m12580d()
            goto L_0x0105
        L_0x00c1:
            int r9 = r0.f9078v
            if (r9 != r8) goto L_0x00ed
            com.google.android.exoplayer2.l[] r9 = r0.f9073q
            int r9 = r9.length
            if (r9 <= 0) goto L_0x00da
            if (r11 == 0) goto L_0x00d7
            boolean r6 = r0.f9076t
            boolean r6 = r0.m12584e(r6)
            if (r6 == 0) goto L_0x00d7
            r16 = 1
            goto L_0x00e0
        L_0x00d7:
            r16 = 0
            goto L_0x00e0
        L_0x00da:
            boolean r7 = r0.m12575b(r6)
            r16 = r7
        L_0x00e0:
            if (r16 == 0) goto L_0x0105
            r0.m12558a(r3)
            boolean r6 = r0.f9075s
            if (r6 == 0) goto L_0x0105
            r17.m12576c()
            goto L_0x0105
        L_0x00ed:
            int r9 = r0.f9078v
            if (r9 != r3) goto L_0x0105
            com.google.android.exoplayer2.l[] r9 = r0.f9073q
            int r9 = r9.length
            if (r9 <= 0) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            boolean r11 = r0.m12575b(r6)
        L_0x00fb:
            if (r11 != 0) goto L_0x0105
            boolean r6 = r0.f9075s
            r0.f9076t = r6
            r0.m12558a(r8)
            goto L_0x00bd
        L_0x0105:
            int r6 = r0.f9078v
            if (r6 != r8) goto L_0x0117
            com.google.android.exoplayer2.l[] r6 = r0.f9073q
            int r7 = r6.length
            r15 = 0
        L_0x010d:
            if (r15 >= r7) goto L_0x0117
            r9 = r6[r15]
            r9.mo8631j()
            int r15 = r15 + 1
            goto L_0x010d
        L_0x0117:
            boolean r6 = r0.f9075s
            if (r6 == 0) goto L_0x011f
            int r6 = r0.f9078v
            if (r6 == r3) goto L_0x0123
        L_0x011f:
            int r3 = r0.f9078v
            if (r3 != r8) goto L_0x0127
        L_0x0123:
            r0.m12560a(r1, r4)
            goto L_0x0137
        L_0x0127:
            com.google.android.exoplayer2.l[] r3 = r0.f9073q
            int r3 = r3.length
            if (r3 == 0) goto L_0x0132
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.m12560a(r1, r3)
            goto L_0x0137
        L_0x0132:
            android.os.Handler r1 = r0.f9062f
            r1.removeMessages(r8)
        L_0x0137:
            com.google.android.exoplayer2.p102c.C2510r.m11792a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C2663h.m12585f():void");
    }

    /* renamed from: g */
    private void m12586g() {
        m12582d(true);
        this.f9060d.mo8795b();
        m12558a(1);
    }

    /* renamed from: h */
    private void m12587h() {
        m12582d(true);
        this.f9060d.mo8796c();
        m12558a(1);
        synchronized (this) {
            this.f9074r = true;
            notifyAll();
        }
    }

    /* renamed from: i */
    private void m12588i() {
        if (this.f9055E != null) {
            C2664a aVar = this.f9055E;
            boolean z = true;
            while (aVar != null && aVar.f9091i) {
                if (aVar.mo9150d()) {
                    if (z) {
                        boolean z2 = this.f9054D != this.f9055E;
                        m12562a(this.f9055E.f9093k);
                        this.f9055E.f9093k = null;
                        this.f9053C = this.f9055E;
                        this.f9054D = this.f9055E;
                        boolean[] zArr = new boolean[this.f9057a.length];
                        long a = this.f9055E.mo9145a(this.f9068l.f9104c, z2, zArr);
                        if (a != this.f9068l.f9104c) {
                            this.f9068l.f9104c = a;
                            m12559a(a);
                        }
                        boolean[] zArr2 = new boolean[this.f9057a.length];
                        int i = 0;
                        for (int i2 = 0; i2 < this.f9057a.length; i2++) {
                            C2671l lVar = this.f9057a[i2];
                            zArr2[i2] = lVar.mo8625d() != 0;
                            C2735e eVar = this.f9055E.f9085c[i2];
                            if (eVar != null) {
                                i++;
                            }
                            if (zArr2[i2]) {
                                if (eVar != lVar.mo8627f()) {
                                    if (lVar == this.f9070n) {
                                        if (eVar == null) {
                                            this.f9061e.mo8873a(this.f9071o);
                                        }
                                        this.f9071o = null;
                                        this.f9070n = null;
                                    }
                                    m12565a(lVar);
                                    lVar.mo8633l();
                                } else if (zArr[i2]) {
                                    lVar.mo8616a(this.f9052B);
                                }
                            }
                        }
                        this.f9064h.obtainMessage(3, aVar.f9095m).sendToTarget();
                        m12567a(zArr2, i);
                    } else {
                        this.f9053C = aVar;
                        C2664a aVar2 = this.f9053C;
                        while (true) {
                            aVar2 = aVar2.f9093k;
                            if (aVar2 == null) {
                                break;
                            }
                            aVar2.mo9151e();
                        }
                        this.f9053C.f9093k = null;
                        if (this.f9053C.f9091i) {
                            this.f9053C.mo9144a(Math.max(this.f9053C.f9089g, this.f9053C.mo9147b(this.f9052B)), false);
                        }
                    }
                    m12592m();
                    m12583e();
                    this.f9062f.sendEmptyMessage(2);
                    return;
                }
                if (aVar == this.f9054D) {
                    z = false;
                }
                aVar = aVar.f9093k;
            }
        }
    }

    /* renamed from: j */
    private void m12589j() {
        if (this.f9053C != null && !this.f9053C.f9091i && (this.f9054D == null || this.f9054D.f9093k == this.f9053C)) {
            C2671l[] lVarArr = this.f9073q;
            int length = lVarArr.length;
            int i = 0;
            while (i < length) {
                if (lVarArr[i].mo8628g()) {
                    i++;
                } else {
                    return;
                }
            }
            this.f9053C.f9083a.mo9349c();
        }
    }

    /* renamed from: k */
    private void m12590k() {
        if (this.f9056F == null) {
            this.f9072p.mo9370a();
            return;
        }
        m12591l();
        if (this.f9053C == null || this.f9053C.mo9148b()) {
            m12574b(false);
        } else if (this.f9053C != null && this.f9053C.f9094l) {
            m12592m();
        }
        if (this.f9055E != null) {
            while (this.f9055E != this.f9054D && this.f9052B >= this.f9055E.f9093k.f9087e) {
                this.f9055E.mo9151e();
                m12571b(this.f9055E.f9093k);
                this.f9068l = new C2665b(this.f9055E.f9088f, this.f9055E.f9089g);
                m12583e();
                this.f9064h.obtainMessage(5, this.f9068l).sendToTarget();
            }
            if (this.f9054D.f9090h) {
                for (int i = 0; i < this.f9057a.length; i++) {
                    C2671l lVar = this.f9057a[i];
                    C2735e eVar = this.f9054D.f9085c[i];
                    if (eVar != null && lVar.mo8627f() == eVar && lVar.mo8628g()) {
                        lVar.mo8629h();
                    }
                }
                return;
            }
            int i2 = 0;
            while (i2 < this.f9057a.length) {
                C2671l lVar2 = this.f9057a[i2];
                C2735e eVar2 = this.f9054D.f9085c[i2];
                if (lVar2.mo8627f() == eVar2 && (eVar2 == null || lVar2.mo8628g())) {
                    i2++;
                } else {
                    return;
                }
            }
            if (this.f9054D.f9093k != null && this.f9054D.f9093k.f9091i) {
                C2486i iVar = this.f9054D.f9095m;
                this.f9054D = this.f9054D.f9093k;
                C2486i iVar2 = this.f9054D.f9095m;
                boolean z = this.f9054D.f9083a.mo9352f() != -9223372036854775807L;
                for (int i3 = 0; i3 < this.f9057a.length; i3++) {
                    C2671l lVar3 = this.f9057a[i3];
                    if (iVar.f8044b.mo8784a(i3) != null) {
                        if (!z) {
                            if (!lVar3.mo8630i()) {
                                C2481f a = iVar2.f8044b.mo8784a(i3);
                                C2711n nVar = iVar.f8046d[i3];
                                C2711n nVar2 = iVar2.f8046d[i3];
                                if (a != null && nVar2.equals(nVar)) {
                                    Format[] formatArr = new Format[a.mo8766b()];
                                    for (int i4 = 0; i4 < formatArr.length; i4++) {
                                        formatArr[i4] = a.mo8763a(i4);
                                    }
                                    lVar3.mo8621a(formatArr, this.f9054D.f9085c[i3], this.f9054D.mo9142a());
                                }
                            }
                        }
                        lVar3.mo8629h();
                    }
                }
            }
        }
    }

    /* renamed from: l */
    private void m12591l() {
        int i;
        if (this.f9053C == null) {
            i = this.f9068l.f9102a;
        } else {
            int i2 = this.f9053C.f9088f;
            if (!this.f9053C.f9090h && this.f9053C.mo9148b() && this.f9056F.mo9319a(i2, this.f9067k).mo9327a() != -9223372036854775807L && (this.f9055E == null || i2 - this.f9055E.f9088f != 100)) {
                i = this.f9053C.f9088f + 1;
            } else {
                return;
            }
        }
        if (i >= this.f9056F.mo9326c()) {
            this.f9072p.mo9370a();
            return;
        }
        long j = 0;
        if (this.f9053C == null) {
            j = this.f9068l.f9104c;
        } else {
            int i3 = this.f9056F.mo9319a(i, this.f9067k).f9295c;
            if (i == this.f9056F.mo9321a(i3, this.f9066j).f9304f) {
                Pair a = m12557a(this.f9056F, i3, -9223372036854775807L, Math.max(0, (this.f9053C.mo9142a() + this.f9056F.mo9319a(this.f9053C.f9088f, this.f9067k).mo9327a()) - this.f9052B));
                if (a != null) {
                    int intValue = ((Integer) a.first).intValue();
                    j = ((Long) a.second).longValue();
                    i = intValue;
                } else {
                    return;
                }
            }
        }
        long j2 = j;
        long a2 = this.f9053C == null ? j2 + 60000000 : this.f9053C.mo9142a() + this.f9056F.mo9319a(this.f9053C.f9088f, this.f9067k).mo9327a();
        this.f9056F.mo9320a(i, this.f9067k, true);
        C2664a aVar = new C2664a(this.f9057a, this.f9058b, a2, this.f9059c, this.f9060d, this.f9072p, this.f9067k.f9294b, i, i == this.f9056F.mo9326c() - 1 && !this.f9056F.mo9321a(this.f9067k.f9295c, this.f9066j).f9303e, j2);
        if (this.f9053C != null) {
            this.f9053C.f9093k = aVar;
        }
        this.f9053C = aVar;
        this.f9053C.f9083a.mo9342a((C2732a) this);
        m12574b(true);
    }

    /* renamed from: m */
    private void m12592m() {
        long e = !this.f9053C.f9091i ? 0 : this.f9053C.f9083a.mo9351e();
        if (e == Long.MIN_VALUE) {
            m12574b(false);
            return;
        }
        long b = this.f9053C.mo9147b(this.f9052B);
        boolean a = this.f9060d.mo8793a(e - b);
        m12574b(a);
        if (a) {
            this.f9053C.f9094l = false;
            this.f9053C.f9083a.mo9347b(b);
            return;
        }
        this.f9053C.f9094l = true;
    }

    /* renamed from: a */
    public void mo9130a() {
        this.f9062f.sendEmptyMessage(5);
    }

    /* renamed from: a */
    public void mo9131a(C2717q qVar, int i, long j) {
        this.f9062f.obtainMessage(3, new C2666c(qVar, i, j)).sendToTarget();
    }

    /* renamed from: a */
    public void mo9132a(C2717q qVar, Object obj) {
        this.f9062f.obtainMessage(7, Pair.create(qVar, obj)).sendToTarget();
    }

    /* renamed from: a */
    public void mo9133a(C2731c cVar) {
        this.f9062f.obtainMessage(8, cVar).sendToTarget();
    }

    /* renamed from: a */
    public void mo9134a(C2733d dVar, boolean z) {
        this.f9062f.obtainMessage(0, z ? 1 : 0, 0, dVar).sendToTarget();
    }

    /* renamed from: a */
    public void mo9136a(boolean z) {
        this.f9062f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: a */
    public void mo9137a(C2523c... cVarArr) {
        if (this.f9074r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.f9079w++;
        this.f9062f.obtainMessage(11, cVarArr).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo9138b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f9074r     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f9062f     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f9074r     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f9063g     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C2663h.mo9138b():void");
    }

    /* renamed from: b */
    public void mo9135a(C2731c cVar) {
        this.f9062f.obtainMessage(9, cVar).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo9140b(com.google.android.exoplayer2.C2520e.C2523c... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f9074r     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.f9079w     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.f9079w = r1     // Catch:{ all -> 0x0031 }
            android.os.Handler r1 = r3.f9062f     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.f9080x     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C2663h.mo9140b(com.google.android.exoplayer2.e$c[]):void");
    }

    public boolean handleMessage(Message message) {
        Handler handler;
        try {
            boolean z = false;
            switch (message.what) {
                case 0:
                    C2733d dVar = (C2733d) message.obj;
                    if (message.arg1 != 0) {
                        z = true;
                    }
                    m12572b(dVar, z);
                    return true;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    }
                    m12578c(z);
                    return true;
                case 2:
                    m12585f();
                    return true;
                case 3:
                    m12563a((C2666c) message.obj);
                    return true;
                case 4:
                    m12564a((C2670k) message.obj);
                    return true;
                case 5:
                    m12586g();
                    return true;
                case 6:
                    m12587h();
                    return true;
                case 7:
                    m12561a((Pair) message.obj);
                    return true;
                case 8:
                    m12577c((C2731c) message.obj);
                    return true;
                case 9:
                    m12581d((C2731c) message.obj);
                    return true;
                case 10:
                    m12588i();
                    return true;
                case 11:
                    m12579c((C2523c[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            e = e;
            Log.e("ExoPlayerImplInternal", "Renderer error.", e);
            handler = this.f9064h;
            handler.obtainMessage(8, e).sendToTarget();
            m12586g();
            return true;
        } catch (IOException e2) {
            Log.e("ExoPlayerImplInternal", "Source error.", e2);
            handler = this.f9064h;
            e = ExoPlaybackException.createForSource(e2);
            handler.obtainMessage(8, e).sendToTarget();
            m12586g();
            return true;
        } catch (RuntimeException e3) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e3);
            handler = this.f9064h;
            e = ExoPlaybackException.createForUnexpected(e3);
            handler.obtainMessage(8, e).sendToTarget();
            m12586g();
            return true;
        }
    }
}
