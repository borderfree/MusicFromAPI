package com.google.android.exoplayer2.extractor.p104b;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.extractor.C2653j;
import com.google.android.exoplayer2.extractor.C2655k;
import com.google.android.exoplayer2.extractor.C2656l;
import com.google.android.exoplayer2.extractor.C2657m;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.C2699a;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import java.io.EOFException;

/* renamed from: com.google.android.exoplayer2.extractor.b.b */
public final class C2538b implements C2639f {

    /* renamed from: a */
    public static final C2652i f8278a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2538b()};
        }
    };

    /* renamed from: b */
    private static final int f8279b = C2511s.m11819e("Xing");

    /* renamed from: c */
    private static final int f8280c = C2511s.m11819e("Info");

    /* renamed from: d */
    private static final int f8281d = C2511s.m11819e("VBRI");

    /* renamed from: e */
    private final int f8282e;

    /* renamed from: f */
    private final long f8283f;

    /* renamed from: g */
    private final C2500k f8284g;

    /* renamed from: h */
    private final C2655k f8285h;

    /* renamed from: i */
    private final C2653j f8286i;

    /* renamed from: j */
    private C2651h f8287j;

    /* renamed from: k */
    private C2659n f8288k;

    /* renamed from: l */
    private int f8289l;

    /* renamed from: m */
    private Metadata f8290m;

    /* renamed from: n */
    private C2540a f8291n;

    /* renamed from: o */
    private long f8292o;

    /* renamed from: p */
    private long f8293p;

    /* renamed from: q */
    private int f8294q;

    /* renamed from: com.google.android.exoplayer2.extractor.b.b$a */
    interface C2540a extends C2657m {
        /* renamed from: a */
        long mo8977a(long j);
    }

    public C2538b() {
        this(0);
    }

    public C2538b(int i) {
        this(i, -9223372036854775807L);
    }

    public C2538b(int i, long j) {
        this.f8282e = i;
        this.f8283f = j;
        this.f8284g = new C2500k(10);
        this.f8285h = new C2655k();
        this.f8286i = new C2653j();
        this.f8292o = -9223372036854775807L;
    }

    /* renamed from: a */
    private static int m11965a(C2500k kVar, int i) {
        if (kVar.mo8826c() >= i + 4) {
            kVar.mo8827c(i);
            int n = kVar.mo8841n();
            if (n == f8279b || n == f8280c) {
                return n;
            }
        }
        if (kVar.mo8826c() >= 40) {
            kVar.mo8827c(36);
            if (kVar.mo8841n() == f8281d) {
                return f8281d;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static boolean m11966a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: a */
    private boolean m11967a(C2650g gVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = z ? 16384 : 131072;
        gVar.mo8965a();
        if (gVar.mo8973c() == 0) {
            m11969c(gVar);
            int b = (int) gVar.mo8968b();
            if (!z) {
                gVar.mo8969b(b);
            }
            i = b;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        while (true) {
            if (!gVar.mo8972b(this.f8284g.f8094a, 0, 4, i4 > 0)) {
                break;
            }
            this.f8284g.mo8827c(0);
            int n = this.f8284g.mo8841n();
            if (i3 == 0 || m11966a(n, (long) i3)) {
                int a = C2655k.m12521a(n);
                if (a != -1) {
                    i5 = i4 + 1;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        C2655k.m12523a(n, this.f8285h);
                        i3 = n;
                    }
                    gVar.mo8974c(a - 4);
                }
            }
            int i7 = i2 + 1;
            if (i2 != i6) {
                if (z) {
                    gVar.mo8965a();
                    gVar.mo8974c(i + i7);
                } else {
                    gVar.mo8969b(1);
                }
                i2 = i7;
                i5 = 0;
                i3 = 0;
            } else if (z) {
                return false;
            } else {
                throw new ParserException("Searched too many bytes.");
            }
        }
        if (z) {
            gVar.mo8969b(i + i2);
        } else {
            gVar.mo8965a();
        }
        this.f8289l = i3;
        return true;
    }

    /* renamed from: b */
    private int m11968b(C2650g gVar) {
        if (this.f8294q == 0) {
            gVar.mo8965a();
            if (!gVar.mo8972b(this.f8284g.f8094a, 0, 4, true)) {
                return -1;
            }
            this.f8284g.mo8827c(0);
            int n = this.f8284g.mo8841n();
            if (!m11966a(n, (long) this.f8289l) || C2655k.m12521a(n) == -1) {
                gVar.mo8969b(1);
                this.f8289l = 0;
                return 0;
            }
            C2655k.m12523a(n, this.f8285h);
            if (this.f8292o == -9223372036854775807L) {
                this.f8292o = this.f8291n.mo8977a(gVar.mo8973c());
                if (this.f8283f != -9223372036854775807L) {
                    this.f8292o += this.f8283f - this.f8291n.mo8977a(0);
                }
            }
            this.f8294q = this.f8285h.f9020c;
        }
        int a = this.f8288k.mo8999a(gVar, this.f8294q, true);
        if (a == -1) {
            return -1;
        }
        this.f8294q -= a;
        if (this.f8294q > 0) {
            return 0;
        }
        this.f8288k.mo9001a(this.f8292o + ((this.f8293p * 1000000) / ((long) this.f8285h.f9021d)), 1, this.f8285h.f9020c, 0, null);
        this.f8293p += (long) this.f8285h.f9024g;
        this.f8294q = 0;
        return 0;
    }

    /* renamed from: c */
    private void m11969c(C2650g gVar) {
        int i = 0;
        while (true) {
            gVar.mo8975c(this.f8284g.f8094a, 0, 10);
            this.f8284g.mo8827c(0);
            if (this.f8284g.mo8838k() != C2699a.f9224a) {
                gVar.mo8965a();
                gVar.mo8974c(i);
                return;
            }
            this.f8284g.mo8829d(3);
            int s = this.f8284g.mo8846s();
            int i2 = s + 10;
            if (this.f8290m == null) {
                byte[] bArr = new byte[i2];
                System.arraycopy(this.f8284g.f8094a, 0, bArr, 0, 10);
                gVar.mo8975c(bArr, 10, s);
                this.f8290m = new C2699a((this.f8282e & 2) != 0 ? C2653j.f9007a : null).mo9268a(bArr, i2);
                if (this.f8290m != null) {
                    this.f8286i.mo9121a(this.f8290m);
                }
            } else {
                gVar.mo8974c(s);
            }
            i += i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.exoplayer2.extractor.p104b.C2538b.C2540a m11970d(com.google.android.exoplayer2.extractor.C2650g r10) {
        /*
            r9 = this;
            com.google.android.exoplayer2.c.k r1 = new com.google.android.exoplayer2.c.k
            com.google.android.exoplayer2.extractor.k r0 = r9.f8285h
            int r0 = r0.f9020c
            r1.<init>(r0)
            byte[] r0 = r1.f8094a
            com.google.android.exoplayer2.extractor.k r2 = r9.f8285h
            int r2 = r2.f9020c
            r6 = 0
            r10.mo8975c(r0, r6, r2)
            com.google.android.exoplayer2.extractor.k r0 = r9.f8285h
            int r0 = r0.f9018a
            r2 = 1
            r0 = r0 & r2
            r3 = 21
            if (r0 == 0) goto L_0x002b
            com.google.android.exoplayer2.extractor.k r0 = r9.f8285h
            int r0 = r0.f9022e
            if (r0 == r2) goto L_0x0028
            r3 = 36
            r7 = 36
            goto L_0x0036
        L_0x0028:
            r7 = 21
            goto L_0x0036
        L_0x002b:
            com.google.android.exoplayer2.extractor.k r0 = r9.f8285h
            int r0 = r0.f9022e
            if (r0 == r2) goto L_0x0032
            goto L_0x0028
        L_0x0032:
            r3 = 13
            r7 = 13
        L_0x0036:
            int r8 = m11965a(r1, r7)
            int r0 = f8279b
            if (r8 == r0) goto L_0x0062
            int r0 = f8280c
            if (r8 != r0) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = f8281d
            if (r8 != r0) goto L_0x005d
            com.google.android.exoplayer2.extractor.k r0 = r9.f8285h
            long r2 = r10.mo8973c()
            long r4 = r10.mo8976d()
            com.google.android.exoplayer2.extractor.b.c r0 = com.google.android.exoplayer2.extractor.p104b.C2541c.m11979a(r0, r1, r2, r4)
            com.google.android.exoplayer2.extractor.k r1 = r9.f8285h
            int r1 = r1.f9020c
            r10.mo8969b(r1)
            goto L_0x00b2
        L_0x005d:
            r0 = 0
            r10.mo8965a()
            goto L_0x00b2
        L_0x0062:
            com.google.android.exoplayer2.extractor.k r0 = r9.f8285h
            long r2 = r10.mo8973c()
            long r4 = r10.mo8976d()
            com.google.android.exoplayer2.extractor.b.d r0 = com.google.android.exoplayer2.extractor.p104b.C2542d.m11985a(r0, r1, r2, r4)
            if (r0 == 0) goto L_0x009a
            com.google.android.exoplayer2.extractor.j r1 = r9.f8286i
            boolean r1 = r1.mo9119a()
            if (r1 != 0) goto L_0x009a
            r10.mo8965a()
            int r7 = r7 + 141
            r10.mo8974c(r7)
            com.google.android.exoplayer2.c.k r1 = r9.f8284g
            byte[] r1 = r1.f8094a
            r2 = 3
            r10.mo8975c(r1, r6, r2)
            com.google.android.exoplayer2.c.k r1 = r9.f8284g
            r1.mo8827c(r6)
            com.google.android.exoplayer2.extractor.j r1 = r9.f8286i
            com.google.android.exoplayer2.c.k r2 = r9.f8284g
            int r2 = r2.mo8838k()
            r1.mo9120a(r2)
        L_0x009a:
            com.google.android.exoplayer2.extractor.k r1 = r9.f8285h
            int r1 = r1.f9020c
            r10.mo8969b(r1)
            if (r0 == 0) goto L_0x00b2
            boolean r1 = r0.mo8930a()
            if (r1 != 0) goto L_0x00b2
            int r1 = f8280c
            if (r8 != r1) goto L_0x00b2
            com.google.android.exoplayer2.extractor.b.b$a r10 = r9.m11971e(r10)
            return r10
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p104b.C2538b.m11970d(com.google.android.exoplayer2.extractor.g):com.google.android.exoplayer2.extractor.b.b$a");
    }

    /* renamed from: e */
    private C2540a m11971e(C2650g gVar) {
        gVar.mo8975c(this.f8284g.f8094a, 0, 4);
        this.f8284g.mo8827c(0);
        C2655k.m12523a(this.f8284g.mo8841n(), this.f8285h);
        C2537a aVar = new C2537a(gVar.mo8973c(), this.f8285h.f9023f, gVar.mo8976d());
        return aVar;
    }

    /* renamed from: a */
    public int mo8945a(C2650g gVar, C2656l lVar) {
        if (this.f8289l == 0) {
            try {
                m11967a(gVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        } else {
            C2650g gVar2 = gVar;
        }
        if (this.f8291n == null) {
            this.f8291n = m11970d(gVar);
            if (this.f8291n == null || (!this.f8291n.mo8930a() && (this.f8282e & 1) != 0)) {
                this.f8291n = m11971e(gVar);
            }
            this.f8287j.mo9118a(this.f8291n);
            this.f8288k.mo9002a(Format.m11314a((String) null, this.f8285h.f9019b, (String) null, -1, 4096, this.f8285h.f9022e, this.f8285h.f9021d, -1, this.f8286i.f9009b, this.f8286i.f9010c, null, (DrmInitData) null, 0, (String) null, (this.f8282e & 2) != 0 ? null : this.f8290m));
        }
        return m11968b(gVar);
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        this.f8289l = 0;
        this.f8292o = -9223372036854775807L;
        this.f8293p = 0;
        this.f8294q = 0;
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        this.f8287j = hVar;
        this.f8288k = this.f8287j.mo9116a(0, 1);
        this.f8287j.mo9117a();
    }

    /* renamed from: a */
    public boolean mo8953a(C2650g gVar) {
        return m11967a(gVar, true);
    }

    /* renamed from: c */
    public void mo8955c() {
    }
}
