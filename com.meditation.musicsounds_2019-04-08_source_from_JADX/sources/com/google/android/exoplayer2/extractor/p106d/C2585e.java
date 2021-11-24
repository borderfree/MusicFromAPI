package com.google.android.exoplayer2.extractor.p106d;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import java.io.EOFException;

/* renamed from: com.google.android.exoplayer2.extractor.d.e */
final class C2585e {

    /* renamed from: k */
    private static final int f8648k = C2511s.m11819e("OggS");

    /* renamed from: a */
    public int f8649a;

    /* renamed from: b */
    public int f8650b;

    /* renamed from: c */
    public long f8651c;

    /* renamed from: d */
    public long f8652d;

    /* renamed from: e */
    public long f8653e;

    /* renamed from: f */
    public long f8654f;

    /* renamed from: g */
    public int f8655g;

    /* renamed from: h */
    public int f8656h;

    /* renamed from: i */
    public int f8657i;

    /* renamed from: j */
    public final int[] f8658j = new int[255];

    /* renamed from: l */
    private final C2500k f8659l = new C2500k(255);

    C2585e() {
    }

    /* renamed from: a */
    public void mo9047a() {
        this.f8649a = 0;
        this.f8650b = 0;
        this.f8651c = 0;
        this.f8652d = 0;
        this.f8653e = 0;
        this.f8654f = 0;
        this.f8655g = 0;
        this.f8656h = 0;
        this.f8657i = 0;
    }

    /* renamed from: a */
    public boolean mo9048a(C2650g gVar, boolean z) {
        this.f8659l.mo8819a();
        mo9047a();
        if (!(gVar.mo8976d() == -1 || gVar.mo8976d() - gVar.mo8968b() >= 27) || !gVar.mo8972b(this.f8659l.f8094a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f8659l.mo8839l() == ((long) f8648k)) {
            this.f8649a = this.f8659l.mo8834g();
            if (this.f8649a == 0) {
                this.f8650b = this.f8659l.mo8834g();
                this.f8651c = this.f8659l.mo8844q();
                this.f8652d = this.f8659l.mo8840m();
                this.f8653e = this.f8659l.mo8840m();
                this.f8654f = this.f8659l.mo8840m();
                this.f8655g = this.f8659l.mo8834g();
                this.f8656h = this.f8655g + 27;
                this.f8659l.mo8819a();
                gVar.mo8975c(this.f8659l.f8094a, 0, this.f8655g);
                for (int i = 0; i < this.f8655g; i++) {
                    this.f8658j[i] = this.f8659l.mo8834g();
                    this.f8657i += this.f8658j[i];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new ParserException("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new ParserException("expected OggS capture pattern at begin of page");
        }
    }
}
