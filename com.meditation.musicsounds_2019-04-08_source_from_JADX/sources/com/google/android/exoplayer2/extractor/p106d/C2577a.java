package com.google.android.exoplayer2.extractor.p106d;

import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2657m;
import com.google.android.exoplayer2.p102c.C2488a;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.d.a */
final class C2577a implements C2586f {

    /* renamed from: a */
    private final C2585e f8621a = new C2585e();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f8622b;

    /* renamed from: c */
    private final long f8623c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2588h f8624d;

    /* renamed from: e */
    private int f8625e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f8626f;

    /* renamed from: g */
    private long f8627g;

    /* renamed from: h */
    private long f8628h;

    /* renamed from: i */
    private long f8629i;

    /* renamed from: j */
    private long f8630j;

    /* renamed from: k */
    private long f8631k;

    /* renamed from: l */
    private long f8632l;

    /* renamed from: com.google.android.exoplayer2.extractor.d.a$a */
    private class C2579a implements C2657m {
        private C2579a() {
        }

        /* renamed from: a */
        public boolean mo8930a() {
            return true;
        }

        /* renamed from: b */
        public long mo8931b() {
            return C2577a.this.f8624d.mo9050a(C2577a.this.f8626f);
        }

        /* renamed from: b */
        public long mo8932b(long j) {
            if (j == 0) {
                return C2577a.this.f8622b;
            }
            return C2577a.this.m12156a(C2577a.this.f8622b, C2577a.this.f8624d.mo9053b(j), 30000);
        }
    }

    public C2577a(long j, long j2, C2588h hVar, int i, long j3) {
        C2488a.m11666a(j >= 0 && j2 > j);
        this.f8624d = hVar;
        this.f8622b = j;
        this.f8623c = j2;
        if (((long) i) == j2 - j) {
            this.f8626f = j3;
            this.f8625e = 3;
            return;
        }
        this.f8625e = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public long m12156a(long j, long j2, long j3) {
        long j4 = j + (((j2 * (this.f8623c - this.f8622b)) / this.f8626f) - j3);
        if (j4 < this.f8622b) {
            j4 = this.f8622b;
        }
        return j4 >= this.f8623c ? this.f8623c - 1 : j4;
    }

    /* renamed from: a */
    public long mo9027a(long j) {
        C2488a.m11666a(this.f8625e == 3 || this.f8625e == 2);
        long j2 = 0;
        if (j != 0) {
            j2 = this.f8624d.mo9053b(j);
        }
        this.f8628h = j2;
        this.f8625e = 2;
        mo9033b();
        return this.f8628h;
    }

    /* renamed from: a */
    public long mo9028a(long j, C2650g gVar) {
        C2650g gVar2 = gVar;
        if (this.f8629i == this.f8630j) {
            return -(this.f8631k + 2);
        }
        long c = gVar.mo8973c();
        if (mo9032a(gVar2, this.f8630j)) {
            this.f8621a.mo9048a(gVar2, false);
            gVar.mo8965a();
            long j2 = j - this.f8621a.f8651c;
            int i = this.f8621a.f8656h + this.f8621a.f8657i;
            if (j2 < 0 || j2 > 72000) {
                if (j2 < 0) {
                    this.f8630j = c;
                    this.f8632l = this.f8621a.f8651c;
                } else {
                    long j3 = (long) i;
                    this.f8629i = gVar.mo8973c() + j3;
                    this.f8631k = this.f8621a.f8651c;
                    if ((this.f8630j - this.f8629i) + j3 < 100000) {
                        gVar2.mo8969b(i);
                        return -(this.f8631k + 2);
                    }
                }
                if (this.f8630j - this.f8629i < 100000) {
                    this.f8630j = this.f8629i;
                    return this.f8629i;
                }
                return Math.min(Math.max((gVar.mo8973c() - ((long) (i * (j2 <= 0 ? 2 : 1)))) + ((j2 * (this.f8630j - this.f8629i)) / (this.f8632l - this.f8631k)), this.f8629i), this.f8630j - 1);
            }
            gVar2.mo8969b(i);
            return -(this.f8621a.f8651c + 2);
        } else if (this.f8629i != c) {
            return this.f8629i;
        } else {
            throw new IOException("No ogg page can be found.");
        }
    }

    /* renamed from: a */
    public long mo9029a(C2650g gVar) {
        switch (this.f8625e) {
            case 0:
                this.f8627g = gVar.mo8973c();
                this.f8625e = 1;
                long j = this.f8623c - 65307;
                if (j > this.f8627g) {
                    return j;
                }
                break;
            case 1:
                break;
            case 2:
                long j2 = 0;
                if (this.f8628h != 0) {
                    long a = mo9028a(this.f8628h, gVar);
                    if (a >= 0) {
                        return a;
                    }
                    j2 = mo9030a(gVar, this.f8628h, -(a + 2));
                }
                this.f8625e = 3;
                return -(j2 + 2);
            case 3:
                return -1;
            default:
                throw new IllegalStateException();
        }
        this.f8626f = mo9035c(gVar);
        this.f8625e = 3;
        return this.f8627g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo9030a(C2650g gVar, long j, long j2) {
        C2585e eVar = this.f8621a;
        while (true) {
            eVar.mo9048a(gVar, false);
            if (this.f8621a.f8651c < j) {
                gVar.mo8969b(this.f8621a.f8656h + this.f8621a.f8657i);
                j2 = this.f8621a.f8651c;
                eVar = this.f8621a;
            } else {
                gVar.mo8965a();
                return j2;
            }
        }
    }

    /* renamed from: a */
    public C2579a mo9036c() {
        if (this.f8626f != 0) {
            return new C2579a();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9032a(C2650g gVar, long j) {
        int i;
        long min = Math.min(j + 3, this.f8623c);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        while (true) {
            int i2 = 0;
            if (gVar.mo8973c() + ((long) length) > min) {
                length = (int) (min - gVar.mo8973c());
                if (length < 4) {
                    return false;
                }
            }
            gVar.mo8972b(bArr, 0, length, false);
            while (true) {
                i = length - 3;
                if (i2 >= i) {
                    break;
                } else if (bArr[i2] == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103 && bArr[i2 + 3] == 83) {
                    gVar.mo8969b(i2);
                    return true;
                } else {
                    i2++;
                }
            }
            gVar.mo8969b(i);
        }
    }

    /* renamed from: b */
    public void mo9033b() {
        this.f8629i = this.f8622b;
        this.f8630j = this.f8623c;
        this.f8631k = 0;
        this.f8632l = this.f8626f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9034b(C2650g gVar) {
        if (!mo9032a(gVar, this.f8623c)) {
            throw new EOFException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public long mo9035c(C2650g gVar) {
        mo9034b(gVar);
        this.f8621a.mo9047a();
        while ((this.f8621a.f8650b & 4) != 4 && gVar.mo8973c() < this.f8623c) {
            this.f8621a.mo9048a(gVar, false);
            gVar.mo8969b(this.f8621a.f8656h + this.f8621a.f8657i);
        }
        return this.f8621a.f8651c;
    }
}
