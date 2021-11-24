package com.google.android.exoplayer2.extractor.p103a;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.p102c.C2488a;
import java.util.Stack;

/* renamed from: com.google.android.exoplayer2.extractor.a.a */
final class C2525a implements C2528b {

    /* renamed from: a */
    private final byte[] f8155a = new byte[8];

    /* renamed from: b */
    private final Stack<C2527a> f8156b = new Stack<>();

    /* renamed from: c */
    private final C2535f f8157c = new C2535f();

    /* renamed from: d */
    private C2529c f8158d;

    /* renamed from: e */
    private int f8159e;

    /* renamed from: f */
    private int f8160f;

    /* renamed from: g */
    private long f8161g;

    /* renamed from: com.google.android.exoplayer2.extractor.a.a$a */
    private static final class C2527a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f8162a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f8163b;

        private C2527a(int i, long j) {
            this.f8162a = i;
            this.f8163b = j;
        }
    }

    C2525a() {
    }

    /* renamed from: a */
    private long m11872a(C2650g gVar, int i) {
        gVar.mo8970b(this.f8155a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f8155a[i2] & 255));
        }
        return j;
    }

    /* renamed from: b */
    private double m11873b(C2650g gVar, int i) {
        long a = m11872a(gVar, i);
        return i == 4 ? (double) Float.intBitsToFloat((int) a) : Double.longBitsToDouble(a);
    }

    /* renamed from: b */
    private long m11874b(C2650g gVar) {
        gVar.mo8965a();
        while (true) {
            gVar.mo8975c(this.f8155a, 0, 4);
            int a = C2535f.m11936a(this.f8155a[0]);
            if (a != -1 && a <= 4) {
                int a2 = (int) C2535f.m11937a(this.f8155a, a, false);
                if (this.f8158d.mo8942b(a2)) {
                    gVar.mo8969b(a);
                    return (long) a2;
                }
            }
            gVar.mo8969b(1);
        }
    }

    /* renamed from: c */
    private String m11875c(C2650g gVar, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        gVar.mo8970b(bArr, 0, i);
        return new String(bArr);
    }

    /* renamed from: a */
    public void mo8933a() {
        this.f8159e = 0;
        this.f8156b.clear();
        this.f8157c.mo8961a();
    }

    /* renamed from: a */
    public void mo8934a(C2529c cVar) {
        this.f8158d = cVar;
    }

    /* renamed from: a */
    public boolean mo8935a(C2650g gVar) {
        C2488a.m11668b(this.f8158d != null);
        while (true) {
            if (this.f8156b.isEmpty() || gVar.mo8973c() < ((C2527a) this.f8156b.peek()).f8163b) {
                if (this.f8159e == 0) {
                    long a = this.f8157c.mo8960a(gVar, true, false, 4);
                    if (a == -2) {
                        a = m11874b(gVar);
                    }
                    if (a == -1) {
                        return false;
                    }
                    this.f8160f = (int) a;
                    this.f8159e = 1;
                }
                if (this.f8159e == 1) {
                    this.f8161g = this.f8157c.mo8960a(gVar, false, true, 8);
                    this.f8159e = 2;
                }
                int a2 = this.f8158d.mo8936a(this.f8160f);
                switch (a2) {
                    case 0:
                        gVar.mo8969b((int) this.f8161g);
                        this.f8159e = 0;
                    case 1:
                        long c = gVar.mo8973c();
                        this.f8156b.add(new C2527a(this.f8160f, this.f8161g + c));
                        this.f8158d.mo8940a(this.f8160f, c, this.f8161g);
                        this.f8159e = 0;
                        return true;
                    case 2:
                        if (this.f8161g <= 8) {
                            this.f8158d.mo8939a(this.f8160f, m11872a(gVar, (int) this.f8161g));
                            this.f8159e = 0;
                            return true;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid integer size: ");
                        sb.append(this.f8161g);
                        throw new ParserException(sb.toString());
                    case 3:
                        if (this.f8161g <= 2147483647L) {
                            this.f8158d.mo8941a(this.f8160f, m11875c(gVar, (int) this.f8161g));
                            this.f8159e = 0;
                            return true;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("String element size: ");
                        sb2.append(this.f8161g);
                        throw new ParserException(sb2.toString());
                    case 4:
                        this.f8158d.mo8938a(this.f8160f, (int) this.f8161g, gVar);
                        this.f8159e = 0;
                        return true;
                    case 5:
                        if (this.f8161g == 4 || this.f8161g == 8) {
                            this.f8158d.mo8937a(this.f8160f, m11873b(gVar, (int) this.f8161g));
                            this.f8159e = 0;
                            return true;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid float size: ");
                        sb3.append(this.f8161g);
                        throw new ParserException(sb3.toString());
                    default:
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid element type ");
                        sb4.append(a2);
                        throw new ParserException(sb4.toString());
                }
            } else {
                this.f8158d.mo8943c(((C2527a) this.f8156b.pop()).f8162a);
                return true;
            }
        }
    }
}
