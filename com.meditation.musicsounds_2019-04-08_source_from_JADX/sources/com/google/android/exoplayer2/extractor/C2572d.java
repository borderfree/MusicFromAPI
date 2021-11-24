package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C2668i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p100a.C2438e;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.upstream.C2805a;
import com.google.android.exoplayer2.upstream.C2806b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.exoplayer2.extractor.d */
public final class C2572d implements C2659n {

    /* renamed from: a */
    private final C2806b f8582a;

    /* renamed from: b */
    private final int f8583b;

    /* renamed from: c */
    private final C2575b f8584c = new C2575b();

    /* renamed from: d */
    private final LinkedBlockingDeque<C2805a> f8585d = new LinkedBlockingDeque<>();

    /* renamed from: e */
    private final C2574a f8586e = new C2574a();

    /* renamed from: f */
    private final C2500k f8587f = new C2500k(32);

    /* renamed from: g */
    private final AtomicInteger f8588g = new AtomicInteger();

    /* renamed from: h */
    private long f8589h;

    /* renamed from: i */
    private Format f8590i;

    /* renamed from: j */
    private boolean f8591j;

    /* renamed from: k */
    private Format f8592k;

    /* renamed from: l */
    private long f8593l;

    /* renamed from: m */
    private long f8594m;

    /* renamed from: n */
    private C2805a f8595n;

    /* renamed from: o */
    private int f8596o = this.f8583b;

    /* renamed from: p */
    private boolean f8597p;

    /* renamed from: q */
    private C2576c f8598q;

    /* renamed from: com.google.android.exoplayer2.extractor.d$a */
    private static final class C2574a {

        /* renamed from: a */
        public int f8599a;

        /* renamed from: b */
        public long f8600b;

        /* renamed from: c */
        public long f8601c;

        /* renamed from: d */
        public byte[] f8602d;

        private C2574a() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d$b */
    private static final class C2575b {

        /* renamed from: a */
        private int f8603a = 1000;

        /* renamed from: b */
        private int[] f8604b = new int[this.f8603a];

        /* renamed from: c */
        private long[] f8605c = new long[this.f8603a];

        /* renamed from: d */
        private int[] f8606d = new int[this.f8603a];

        /* renamed from: e */
        private int[] f8607e = new int[this.f8603a];

        /* renamed from: f */
        private long[] f8608f = new long[this.f8603a];

        /* renamed from: g */
        private byte[][] f8609g = new byte[this.f8603a][];

        /* renamed from: h */
        private Format[] f8610h = new Format[this.f8603a];

        /* renamed from: i */
        private int f8611i;

        /* renamed from: j */
        private int f8612j;

        /* renamed from: k */
        private int f8613k;

        /* renamed from: l */
        private int f8614l;

        /* renamed from: m */
        private long f8615m = Long.MIN_VALUE;

        /* renamed from: n */
        private long f8616n = Long.MIN_VALUE;

        /* renamed from: o */
        private boolean f8617o = true;

        /* renamed from: p */
        private boolean f8618p = true;

        /* renamed from: q */
        private Format f8619q;

        /* renamed from: r */
        private int f8620r;

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
            return -3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized int mo9012a(com.google.android.exoplayer2.C2668i r5, com.google.android.exoplayer2.p100a.C2438e r6, boolean r7, boolean r8, com.google.android.exoplayer2.Format r9, com.google.android.exoplayer2.extractor.C2572d.C2574a r10) {
            /*
                r4 = this;
                monitor-enter(r4)
                int r0 = r4.f8611i     // Catch:{ all -> 0x00a3 }
                r1 = -5
                r2 = -3
                r3 = -4
                if (r0 != 0) goto L_0x0022
                if (r8 == 0) goto L_0x0010
                r5 = 4
                r6.mo8642a_(r5)     // Catch:{ all -> 0x00a3 }
                monitor-exit(r4)
                return r3
            L_0x0010:
                com.google.android.exoplayer2.Format r6 = r4.f8619q     // Catch:{ all -> 0x00a3 }
                if (r6 == 0) goto L_0x0020
                if (r7 != 0) goto L_0x001a
                com.google.android.exoplayer2.Format r6 = r4.f8619q     // Catch:{ all -> 0x00a3 }
                if (r6 == r9) goto L_0x0020
            L_0x001a:
                com.google.android.exoplayer2.Format r6 = r4.f8619q     // Catch:{ all -> 0x00a3 }
                r5.f9113a = r6     // Catch:{ all -> 0x00a3 }
                monitor-exit(r4)
                return r1
            L_0x0020:
                monitor-exit(r4)
                return r2
            L_0x0022:
                if (r7 != 0) goto L_0x0099
                com.google.android.exoplayer2.Format[] r7 = r4.f8610h     // Catch:{ all -> 0x00a3 }
                int r8 = r4.f8613k     // Catch:{ all -> 0x00a3 }
                r7 = r7[r8]     // Catch:{ all -> 0x00a3 }
                if (r7 == r9) goto L_0x002d
                goto L_0x0099
            L_0x002d:
                boolean r5 = r6.mo8658f()     // Catch:{ all -> 0x00a3 }
                if (r5 == 0) goto L_0x0035
                monitor-exit(r4)
                return r2
            L_0x0035:
                long[] r5 = r4.f8608f     // Catch:{ all -> 0x00a3 }
                int r7 = r4.f8613k     // Catch:{ all -> 0x00a3 }
                r7 = r5[r7]     // Catch:{ all -> 0x00a3 }
                r6.f7789c = r7     // Catch:{ all -> 0x00a3 }
                int[] r5 = r4.f8607e     // Catch:{ all -> 0x00a3 }
                int r7 = r4.f8613k     // Catch:{ all -> 0x00a3 }
                r5 = r5[r7]     // Catch:{ all -> 0x00a3 }
                r6.mo8642a_(r5)     // Catch:{ all -> 0x00a3 }
                int[] r5 = r4.f8606d     // Catch:{ all -> 0x00a3 }
                int r7 = r4.f8613k     // Catch:{ all -> 0x00a3 }
                r5 = r5[r7]     // Catch:{ all -> 0x00a3 }
                r10.f8599a = r5     // Catch:{ all -> 0x00a3 }
                long[] r5 = r4.f8605c     // Catch:{ all -> 0x00a3 }
                int r7 = r4.f8613k     // Catch:{ all -> 0x00a3 }
                r7 = r5[r7]     // Catch:{ all -> 0x00a3 }
                r10.f8600b = r7     // Catch:{ all -> 0x00a3 }
                byte[][] r5 = r4.f8609g     // Catch:{ all -> 0x00a3 }
                int r7 = r4.f8613k     // Catch:{ all -> 0x00a3 }
                r5 = r5[r7]     // Catch:{ all -> 0x00a3 }
                r10.f8602d = r5     // Catch:{ all -> 0x00a3 }
                long r7 = r4.f8615m     // Catch:{ all -> 0x00a3 }
                long r5 = r6.f7789c     // Catch:{ all -> 0x00a3 }
                long r5 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x00a3 }
                r4.f8615m = r5     // Catch:{ all -> 0x00a3 }
                int r5 = r4.f8611i     // Catch:{ all -> 0x00a3 }
                int r5 = r5 + -1
                r4.f8611i = r5     // Catch:{ all -> 0x00a3 }
                int r5 = r4.f8613k     // Catch:{ all -> 0x00a3 }
                int r5 = r5 + 1
                r4.f8613k = r5     // Catch:{ all -> 0x00a3 }
                int r5 = r4.f8612j     // Catch:{ all -> 0x00a3 }
                int r5 = r5 + 1
                r4.f8612j = r5     // Catch:{ all -> 0x00a3 }
                int r5 = r4.f8613k     // Catch:{ all -> 0x00a3 }
                int r6 = r4.f8603a     // Catch:{ all -> 0x00a3 }
                if (r5 != r6) goto L_0x0083
                r5 = 0
                r4.f8613k = r5     // Catch:{ all -> 0x00a3 }
            L_0x0083:
                int r5 = r4.f8611i     // Catch:{ all -> 0x00a3 }
                if (r5 <= 0) goto L_0x008f
                long[] r5 = r4.f8605c     // Catch:{ all -> 0x00a3 }
                int r6 = r4.f8613k     // Catch:{ all -> 0x00a3 }
                r6 = r5[r6]     // Catch:{ all -> 0x00a3 }
                r5 = r6
                goto L_0x0095
            L_0x008f:
                long r5 = r10.f8600b     // Catch:{ all -> 0x00a3 }
                int r7 = r10.f8599a     // Catch:{ all -> 0x00a3 }
                long r7 = (long) r7     // Catch:{ all -> 0x00a3 }
                long r5 = r5 + r7
            L_0x0095:
                r10.f8601c = r5     // Catch:{ all -> 0x00a3 }
                monitor-exit(r4)
                return r3
            L_0x0099:
                com.google.android.exoplayer2.Format[] r6 = r4.f8610h     // Catch:{ all -> 0x00a3 }
                int r7 = r4.f8613k     // Catch:{ all -> 0x00a3 }
                r6 = r6[r7]     // Catch:{ all -> 0x00a3 }
                r5.f9113a = r6     // Catch:{ all -> 0x00a3 }
                monitor-exit(r4)
                return r1
            L_0x00a3:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.C2572d.C2575b.mo9012a(com.google.android.exoplayer2.i, com.google.android.exoplayer2.a.e, boolean, boolean, com.google.android.exoplayer2.Format, com.google.android.exoplayer2.extractor.d$a):int");
        }

        /* renamed from: a */
        public long mo9013a(int i) {
            int c = mo9021c() - i;
            C2488a.m11666a(c >= 0 && c <= this.f8611i);
            if (c != 0) {
                this.f8611i -= c;
                this.f8614l = ((this.f8614l + this.f8603a) - c) % this.f8603a;
                this.f8616n = Long.MIN_VALUE;
                for (int i2 = this.f8611i - 1; i2 >= 0; i2--) {
                    int i3 = (this.f8613k + i2) % this.f8603a;
                    this.f8616n = Math.max(this.f8616n, this.f8608f[i3]);
                    if ((this.f8607e[i3] & 1) != 0) {
                        break;
                    }
                }
                return this.f8605c[this.f8614l];
            } else if (this.f8612j == 0) {
                return 0;
            } else {
                int i4 = (this.f8614l == 0 ? this.f8603a : this.f8614l) - 1;
                return this.f8605c[i4] + ((long) this.f8606d[i4]);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
            return -1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized long mo9014a(long r9, boolean r11) {
            /*
                r8 = this;
                monitor-enter(r8)
                int r0 = r8.f8611i     // Catch:{ all -> 0x0060 }
                r1 = -1
                if (r0 == 0) goto L_0x005e
                long[] r0 = r8.f8608f     // Catch:{ all -> 0x0060 }
                int r3 = r8.f8613k     // Catch:{ all -> 0x0060 }
                r3 = r0[r3]     // Catch:{ all -> 0x0060 }
                int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r0 >= 0) goto L_0x0012
                goto L_0x005e
            L_0x0012:
                long r3 = r8.f8616n     // Catch:{ all -> 0x0060 }
                int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r0 <= 0) goto L_0x001c
                if (r11 != 0) goto L_0x001c
                monitor-exit(r8)
                return r1
            L_0x001c:
                r11 = 0
                int r0 = r8.f8613k     // Catch:{ all -> 0x0060 }
                r3 = -1
                r11 = -1
                r4 = 0
            L_0x0022:
                int r5 = r8.f8614l     // Catch:{ all -> 0x0060 }
                if (r0 == r5) goto L_0x0040
                long[] r5 = r8.f8608f     // Catch:{ all -> 0x0060 }
                r6 = r5[r0]     // Catch:{ all -> 0x0060 }
                int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r5 <= 0) goto L_0x002f
                goto L_0x0040
            L_0x002f:
                int[] r5 = r8.f8607e     // Catch:{ all -> 0x0060 }
                r5 = r5[r0]     // Catch:{ all -> 0x0060 }
                r5 = r5 & 1
                if (r5 == 0) goto L_0x0038
                r11 = r4
            L_0x0038:
                int r0 = r0 + 1
                int r5 = r8.f8603a     // Catch:{ all -> 0x0060 }
                int r0 = r0 % r5
                int r4 = r4 + 1
                goto L_0x0022
            L_0x0040:
                if (r11 != r3) goto L_0x0044
                monitor-exit(r8)
                return r1
            L_0x0044:
                int r9 = r8.f8613k     // Catch:{ all -> 0x0060 }
                int r9 = r9 + r11
                int r10 = r8.f8603a     // Catch:{ all -> 0x0060 }
                int r9 = r9 % r10
                r8.f8613k = r9     // Catch:{ all -> 0x0060 }
                int r9 = r8.f8612j     // Catch:{ all -> 0x0060 }
                int r9 = r9 + r11
                r8.f8612j = r9     // Catch:{ all -> 0x0060 }
                int r9 = r8.f8611i     // Catch:{ all -> 0x0060 }
                int r9 = r9 - r11
                r8.f8611i = r9     // Catch:{ all -> 0x0060 }
                long[] r9 = r8.f8605c     // Catch:{ all -> 0x0060 }
                int r10 = r8.f8613k     // Catch:{ all -> 0x0060 }
                r10 = r9[r10]     // Catch:{ all -> 0x0060 }
                monitor-exit(r8)
                return r10
            L_0x005e:
                monitor-exit(r8)
                return r1
            L_0x0060:
                r9 = move-exception
                monitor-exit(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.C2572d.C2575b.mo9014a(long, boolean):long");
        }

        /* renamed from: a */
        public void mo9015a() {
            this.f8612j = 0;
            this.f8613k = 0;
            this.f8614l = 0;
            this.f8611i = 0;
            this.f8617o = true;
        }

        /* renamed from: a */
        public synchronized void mo9016a(long j) {
            this.f8616n = Math.max(this.f8616n, j);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e9, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo9017a(long r6, int r8, long r9, int r11, byte[] r12) {
            /*
                r5 = this;
                monitor-enter(r5)
                boolean r0 = r5.f8617o     // Catch:{ all -> 0x00ea }
                r1 = 0
                if (r0 == 0) goto L_0x000e
                r0 = r8 & 1
                if (r0 != 0) goto L_0x000c
                monitor-exit(r5)
                return
            L_0x000c:
                r5.f8617o = r1     // Catch:{ all -> 0x00ea }
            L_0x000e:
                boolean r0 = r5.f8618p     // Catch:{ all -> 0x00ea }
                r0 = r0 ^ 1
                com.google.android.exoplayer2.p102c.C2488a.m11668b(r0)     // Catch:{ all -> 0x00ea }
                r5.mo9016a(r6)     // Catch:{ all -> 0x00ea }
                long[] r0 = r5.f8608f     // Catch:{ all -> 0x00ea }
                int r2 = r5.f8614l     // Catch:{ all -> 0x00ea }
                r0[r2] = r6     // Catch:{ all -> 0x00ea }
                long[] r6 = r5.f8605c     // Catch:{ all -> 0x00ea }
                int r7 = r5.f8614l     // Catch:{ all -> 0x00ea }
                r6[r7] = r9     // Catch:{ all -> 0x00ea }
                int[] r6 = r5.f8606d     // Catch:{ all -> 0x00ea }
                int r7 = r5.f8614l     // Catch:{ all -> 0x00ea }
                r6[r7] = r11     // Catch:{ all -> 0x00ea }
                int[] r6 = r5.f8607e     // Catch:{ all -> 0x00ea }
                int r7 = r5.f8614l     // Catch:{ all -> 0x00ea }
                r6[r7] = r8     // Catch:{ all -> 0x00ea }
                byte[][] r6 = r5.f8609g     // Catch:{ all -> 0x00ea }
                int r7 = r5.f8614l     // Catch:{ all -> 0x00ea }
                r6[r7] = r12     // Catch:{ all -> 0x00ea }
                com.google.android.exoplayer2.Format[] r6 = r5.f8610h     // Catch:{ all -> 0x00ea }
                int r7 = r5.f8614l     // Catch:{ all -> 0x00ea }
                com.google.android.exoplayer2.Format r8 = r5.f8619q     // Catch:{ all -> 0x00ea }
                r6[r7] = r8     // Catch:{ all -> 0x00ea }
                int[] r6 = r5.f8604b     // Catch:{ all -> 0x00ea }
                int r7 = r5.f8614l     // Catch:{ all -> 0x00ea }
                int r8 = r5.f8620r     // Catch:{ all -> 0x00ea }
                r6[r7] = r8     // Catch:{ all -> 0x00ea }
                int r6 = r5.f8611i     // Catch:{ all -> 0x00ea }
                int r6 = r6 + 1
                r5.f8611i = r6     // Catch:{ all -> 0x00ea }
                int r6 = r5.f8611i     // Catch:{ all -> 0x00ea }
                int r7 = r5.f8603a     // Catch:{ all -> 0x00ea }
                if (r6 != r7) goto L_0x00da
                int r6 = r5.f8603a     // Catch:{ all -> 0x00ea }
                int r6 = r6 + 1000
                int[] r7 = new int[r6]     // Catch:{ all -> 0x00ea }
                long[] r8 = new long[r6]     // Catch:{ all -> 0x00ea }
                long[] r9 = new long[r6]     // Catch:{ all -> 0x00ea }
                int[] r10 = new int[r6]     // Catch:{ all -> 0x00ea }
                int[] r11 = new int[r6]     // Catch:{ all -> 0x00ea }
                byte[][] r12 = new byte[r6][]     // Catch:{ all -> 0x00ea }
                com.google.android.exoplayer2.Format[] r0 = new com.google.android.exoplayer2.Format[r6]     // Catch:{ all -> 0x00ea }
                int r2 = r5.f8603a     // Catch:{ all -> 0x00ea }
                int r3 = r5.f8613k     // Catch:{ all -> 0x00ea }
                int r2 = r2 - r3
                long[] r3 = r5.f8605c     // Catch:{ all -> 0x00ea }
                int r4 = r5.f8613k     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00ea }
                long[] r3 = r5.f8608f     // Catch:{ all -> 0x00ea }
                int r4 = r5.f8613k     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00ea }
                int[] r3 = r5.f8607e     // Catch:{ all -> 0x00ea }
                int r4 = r5.f8613k     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00ea }
                int[] r3 = r5.f8606d     // Catch:{ all -> 0x00ea }
                int r4 = r5.f8613k     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00ea }
                byte[][] r3 = r5.f8609g     // Catch:{ all -> 0x00ea }
                int r4 = r5.f8613k     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00ea }
                com.google.android.exoplayer2.Format[] r3 = r5.f8610h     // Catch:{ all -> 0x00ea }
                int r4 = r5.f8613k     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00ea }
                int[] r3 = r5.f8604b     // Catch:{ all -> 0x00ea }
                int r4 = r5.f8613k     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00ea }
                int r3 = r5.f8613k     // Catch:{ all -> 0x00ea }
                long[] r4 = r5.f8605c     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00ea }
                long[] r4 = r5.f8608f     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00ea }
                int[] r4 = r5.f8607e     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00ea }
                int[] r4 = r5.f8606d     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00ea }
                byte[][] r4 = r5.f8609g     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00ea }
                com.google.android.exoplayer2.Format[] r4 = r5.f8610h     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00ea }
                int[] r4 = r5.f8604b     // Catch:{ all -> 0x00ea }
                java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00ea }
                r5.f8605c = r8     // Catch:{ all -> 0x00ea }
                r5.f8608f = r9     // Catch:{ all -> 0x00ea }
                r5.f8607e = r10     // Catch:{ all -> 0x00ea }
                r5.f8606d = r11     // Catch:{ all -> 0x00ea }
                r5.f8609g = r12     // Catch:{ all -> 0x00ea }
                r5.f8610h = r0     // Catch:{ all -> 0x00ea }
                r5.f8604b = r7     // Catch:{ all -> 0x00ea }
                r5.f8613k = r1     // Catch:{ all -> 0x00ea }
                int r7 = r5.f8603a     // Catch:{ all -> 0x00ea }
                r5.f8614l = r7     // Catch:{ all -> 0x00ea }
                int r7 = r5.f8603a     // Catch:{ all -> 0x00ea }
                r5.f8611i = r7     // Catch:{ all -> 0x00ea }
                r5.f8603a = r6     // Catch:{ all -> 0x00ea }
                goto L_0x00e8
            L_0x00da:
                int r6 = r5.f8614l     // Catch:{ all -> 0x00ea }
                int r6 = r6 + 1
                r5.f8614l = r6     // Catch:{ all -> 0x00ea }
                int r6 = r5.f8614l     // Catch:{ all -> 0x00ea }
                int r7 = r5.f8603a     // Catch:{ all -> 0x00ea }
                if (r6 != r7) goto L_0x00e8
                r5.f8614l = r1     // Catch:{ all -> 0x00ea }
            L_0x00e8:
                monitor-exit(r5)
                return
            L_0x00ea:
                r6 = move-exception
                monitor-exit(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.C2572d.C2575b.mo9017a(long, int, long, int, byte[]):void");
        }

        /* renamed from: a */
        public synchronized boolean mo9018a(Format format) {
            if (format == null) {
                this.f8618p = true;
                return false;
            }
            this.f8618p = false;
            if (C2511s.m11809a((Object) format, (Object) this.f8619q)) {
                return false;
            }
            this.f8619q = format;
            return true;
        }

        /* renamed from: b */
        public void mo9019b() {
            this.f8615m = Long.MIN_VALUE;
            this.f8616n = Long.MIN_VALUE;
        }

        /* renamed from: b */
        public synchronized boolean mo9020b(long j) {
            if (this.f8615m >= j) {
                return false;
            }
            int i = this.f8611i;
            while (i > 0 && this.f8608f[((this.f8613k + i) - 1) % this.f8603a] >= j) {
                i--;
            }
            mo9013a(this.f8612j + i);
            return true;
        }

        /* renamed from: c */
        public int mo9021c() {
            return this.f8612j + this.f8611i;
        }

        /* renamed from: d */
        public synchronized boolean mo9022d() {
            return this.f8611i == 0;
        }

        /* renamed from: e */
        public synchronized Format mo9023e() {
            return this.f8618p ? null : this.f8619q;
        }

        /* renamed from: f */
        public synchronized long mo9024f() {
            return Math.max(this.f8615m, this.f8616n);
        }

        /* renamed from: g */
        public synchronized long mo9025g() {
            if (this.f8611i == 0) {
                return -1;
            }
            int i = ((this.f8613k + this.f8611i) - 1) % this.f8603a;
            this.f8613k = (this.f8613k + this.f8611i) % this.f8603a;
            this.f8612j += this.f8611i;
            this.f8611i = 0;
            return this.f8605c[i] + ((long) this.f8606d[i]);
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d$c */
    public interface C2576c {
        /* renamed from: a */
        void mo9026a(Format format);
    }

    public C2572d(C2806b bVar) {
        this.f8582a = bVar;
        this.f8583b = bVar.mo9543c();
    }

    /* renamed from: a */
    private int m12118a(int i) {
        if (this.f8596o == this.f8583b) {
            this.f8596o = 0;
            this.f8595n = this.f8582a.mo9539a();
            this.f8585d.add(this.f8595n);
        }
        return Math.min(i, this.f8583b - this.f8596o);
    }

    /* renamed from: a */
    private static Format m12119a(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (!(j == 0 || format.f7755w == Long.MAX_VALUE)) {
            format = format.mo8599a(format.f7755w + j);
        }
        return format;
    }

    /* renamed from: a */
    private void m12120a(long j) {
        int i = ((int) (j - this.f8589h)) / this.f8583b;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8582a.mo9540a((C2805a) this.f8585d.remove());
            this.f8589h += (long) this.f8583b;
        }
    }

    /* renamed from: a */
    private void m12121a(long j, ByteBuffer byteBuffer, int i) {
        while (i > 0) {
            m12120a(j);
            int i2 = (int) (j - this.f8589h);
            int min = Math.min(i, this.f8583b - i2);
            C2805a aVar = (C2805a) this.f8585d.peek();
            byteBuffer.put(aVar.f9715a, aVar.mo9538a(i2), min);
            j += (long) min;
            i -= min;
        }
    }

    /* renamed from: a */
    private void m12122a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            m12120a(j);
            int i3 = (int) (j - this.f8589h);
            int min = Math.min(i - i2, this.f8583b - i3);
            C2805a aVar = (C2805a) this.f8585d.peek();
            System.arraycopy(aVar.f9715a, aVar.mo9538a(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
        }
    }

    /* renamed from: a */
    private void m12123a(C2438e eVar, C2574a aVar) {
        int i;
        long j = aVar.f8600b;
        this.f8587f.mo8820a(1);
        m12122a(j, this.f8587f.f8094a, 1);
        long j2 = j + 1;
        byte b = this.f8587f.f8094a[0];
        boolean z = (b & 128) != 0;
        byte b2 = b & Byte.MAX_VALUE;
        if (eVar.f7787a.f7768a == null) {
            eVar.f7787a.f7768a = new byte[16];
        }
        m12122a(j2, eVar.f7787a.f7768a, (int) b2);
        long j3 = j2 + ((long) b2);
        if (z) {
            this.f8587f.mo8820a(2);
            m12122a(j3, this.f8587f.f8094a, 2);
            j3 += 2;
            i = this.f8587f.mo8835h();
        } else {
            i = 1;
        }
        int[] iArr = eVar.f7787a.f7771d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = eVar.f7787a.f7772e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i2 = i * 6;
            this.f8587f.mo8820a(i2);
            m12122a(j3, this.f8587f.f8094a, i2);
            j3 += (long) i2;
            this.f8587f.mo8827c(0);
            for (int i3 = 0; i3 < i; i3++) {
                iArr2[i3] = this.f8587f.mo8835h();
                iArr4[i3] = this.f8587f.mo8847t();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f8599a - ((int) (j3 - aVar.f8600b));
        }
        eVar.f7787a.mo8650a(i, iArr2, iArr4, aVar.f8602d, eVar.f7787a.f7768a, 1);
        int i4 = (int) (j3 - aVar.f8600b);
        aVar.f8600b += (long) i4;
        aVar.f8599a -= i4;
    }

    /* renamed from: g */
    private boolean m12124g() {
        return this.f8588g.compareAndSet(0, 1);
    }

    /* renamed from: h */
    private void m12125h() {
        if (!this.f8588g.compareAndSet(1, 0)) {
            m12126i();
        }
    }

    /* renamed from: i */
    private void m12126i() {
        this.f8584c.mo9015a();
        this.f8582a.mo9541a((C2805a[]) this.f8585d.toArray(new C2805a[this.f8585d.size()]));
        this.f8585d.clear();
        this.f8582a.mo9542b();
        this.f8589h = 0;
        this.f8594m = 0;
        this.f8595n = null;
        this.f8596o = this.f8583b;
    }

    /* renamed from: a */
    public int mo8998a() {
        return this.f8584c.mo9021c();
    }

    /* renamed from: a */
    public int mo8999a(C2650g gVar, int i, boolean z) {
        if (!m12124g()) {
            int a = gVar.mo8963a(i);
            if (a != -1) {
                return a;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int a2 = gVar.mo8964a(this.f8595n.f9715a, this.f8595n.mo9538a(this.f8596o), m12118a(i));
            if (a2 != -1) {
                this.f8596o += a2;
                this.f8594m += (long) a2;
                m12125h();
                return a2;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        } finally {
            m12125h();
        }
    }

    /* renamed from: a */
    public int mo9000a(C2668i iVar, C2438e eVar, boolean z, boolean z2, long j) {
        switch (this.f8584c.mo9012a(iVar, eVar, z, z2, this.f8590i, this.f8586e)) {
            case -5:
                this.f8590i = iVar.f9113a;
                return -5;
            case -4:
                if (!eVar.mo8645c()) {
                    if (eVar.f7789c < j) {
                        eVar.mo8643b(Integer.MIN_VALUE);
                    }
                    if (eVar.mo8659g()) {
                        m12123a(eVar, this.f8586e);
                    }
                    eVar.mo8657e(this.f8586e.f8599a);
                    m12121a(this.f8586e.f8600b, eVar.f7788b, this.f8586e.f8599a);
                    m12120a(this.f8586e.f8601c);
                }
                return -4;
            case -3:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo9001a(long j, int i, int i2, int i3, byte[] bArr) {
        long j2 = j;
        if (this.f8591j) {
            mo9002a(this.f8592k);
        }
        if (!m12124g()) {
            this.f8584c.mo9016a(j);
            return;
        }
        try {
            if (this.f8597p) {
                if ((i & 1) != 0) {
                    if (this.f8584c.mo9020b(j)) {
                        this.f8597p = false;
                    }
                }
                return;
            }
            this.f8584c.mo9017a(this.f8593l + j2, i, (this.f8594m - ((long) i2)) - ((long) i3), i2, bArr);
            m12125h();
        } finally {
            m12125h();
        }
    }

    /* renamed from: a */
    public void mo9002a(Format format) {
        Format a = m12119a(format, this.f8593l);
        boolean a2 = this.f8584c.mo9018a(a);
        this.f8592k = format;
        this.f8591j = false;
        if (this.f8598q != null && a2) {
            this.f8598q.mo9026a(a);
        }
    }

    /* renamed from: a */
    public void mo9003a(C2500k kVar, int i) {
        if (!m12124g()) {
            kVar.mo8829d(i);
            return;
        }
        while (i > 0) {
            int a = m12118a(i);
            kVar.mo8823a(this.f8595n.f9715a, this.f8595n.mo9538a(this.f8596o), a);
            this.f8596o += a;
            this.f8594m += (long) a;
            i -= a;
        }
        m12125h();
    }

    /* renamed from: a */
    public void mo9004a(C2576c cVar) {
        this.f8598q = cVar;
    }

    /* renamed from: a */
    public void mo9005a(boolean z) {
        int andSet = this.f8588g.getAndSet(z ? 0 : 2);
        m12126i();
        this.f8584c.mo9019b();
        if (andSet == 2) {
            this.f8590i = null;
        }
    }

    /* renamed from: a */
    public boolean mo9006a(long j, boolean z) {
        long a = this.f8584c.mo9014a(j, z);
        if (a == -1) {
            return false;
        }
        m12120a(a);
        return true;
    }

    /* renamed from: b */
    public void mo9007b() {
        if (this.f8588g.getAndSet(2) == 0) {
            m12126i();
        }
    }

    /* renamed from: c */
    public boolean mo9008c() {
        return this.f8584c.mo9022d();
    }

    /* renamed from: d */
    public Format mo9009d() {
        return this.f8584c.mo9023e();
    }

    /* renamed from: e */
    public long mo9010e() {
        return this.f8584c.mo9024f();
    }

    /* renamed from: f */
    public void mo9011f() {
        long g = this.f8584c.mo9025g();
        if (g != -1) {
            m12120a(g);
        }
    }
}
