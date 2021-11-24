package com.google.android.exoplayer2.extractor.p108f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.extractor.C2656l;
import com.google.android.exoplayer2.extractor.C2657m;
import com.google.android.exoplayer2.extractor.C2659n;

/* renamed from: com.google.android.exoplayer2.extractor.f.a */
public final class C2640a implements C2639f, C2657m {

    /* renamed from: a */
    public static final C2652i f8965a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2640a()};
        }
    };

    /* renamed from: b */
    private C2651h f8966b;

    /* renamed from: c */
    private C2659n f8967c;

    /* renamed from: d */
    private C2642b f8968d;

    /* renamed from: e */
    private int f8969e;

    /* renamed from: f */
    private int f8970f;

    /* renamed from: a */
    public int mo8945a(C2650g gVar, C2656l lVar) {
        if (this.f8968d == null) {
            this.f8968d = C2643c.m12464a(gVar);
            if (this.f8968d != null) {
                this.f8967c.mo9002a(Format.m11315a((String) null, "audio/raw", (String) null, this.f8968d.mo9107c(), 32768, this.f8968d.mo9109e(), this.f8968d.mo9108d(), this.f8968d.mo9111g(), null, (DrmInitData) null, 0, (String) null));
                this.f8969e = this.f8968d.mo9105b();
            } else {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.f8968d.mo9110f()) {
            C2643c.m12465a(gVar, this.f8968d);
            this.f8966b.mo9118a(this);
        }
        int a = this.f8967c.mo8999a(gVar, 32768 - this.f8970f, true);
        if (a != -1) {
            this.f8970f += a;
        }
        int i = this.f8970f / this.f8969e;
        if (i > 0) {
            long b = this.f8968d.mo9106b(gVar.mo8973c() - ((long) this.f8970f));
            int i2 = i * this.f8969e;
            this.f8970f -= i2;
            this.f8967c.mo9001a(b, 1, i2, this.f8970f, null);
        }
        return a == -1 ? -1 : 0;
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        this.f8970f = 0;
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        this.f8966b = hVar;
        this.f8967c = hVar.mo9116a(0, 1);
        this.f8968d = null;
        hVar.mo9117a();
    }

    /* renamed from: a */
    public boolean mo8930a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo8953a(C2650g gVar) {
        return C2643c.m12464a(gVar) != null;
    }

    /* renamed from: b */
    public long mo8931b() {
        return this.f8968d.mo9102a();
    }

    /* renamed from: b */
    public long mo8932b(long j) {
        return this.f8968d.mo9103a(j);
    }

    /* renamed from: c */
    public void mo8955c() {
    }
}
