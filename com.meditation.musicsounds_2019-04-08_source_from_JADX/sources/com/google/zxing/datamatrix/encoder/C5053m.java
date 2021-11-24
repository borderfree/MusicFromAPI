package com.google.zxing.datamatrix.encoder;

/* renamed from: com.google.zxing.datamatrix.encoder.m */
final class C5053m extends C5043c {
    C5053m() {
    }

    /* renamed from: a */
    public int mo16441a() {
        return 3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo16442a(char c, StringBuilder sb) {
        int i;
        char c2;
        if (c == 13) {
            c2 = 0;
        } else {
            if (c == '*') {
                sb.append(1);
            } else if (c == '>') {
                c2 = 2;
            } else if (c == ' ') {
                c2 = 3;
            } else {
                if (c >= '0' && c <= '9') {
                    i = (c - '0') + 4;
                } else if (c < 'A' || c > 'Z') {
                    C5050j.m25044c(c);
                } else {
                    i = (c - 'A') + 14;
                }
                c2 = (char) i;
            }
            return 1;
        }
        sb.append(c2);
        return 1;
    }

    /* renamed from: a */
    public void mo16439a(C5048h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo16462g()) {
                break;
            }
            char b = hVar.mo16455b();
            hVar.f17981a++;
            mo16442a(b, sb);
            if (sb.length() % 3 == 0) {
                m24991a(hVar, sb);
                int a = C5050j.m25038a(hVar.mo16449a(), hVar.f17981a, mo16441a());
                if (a != mo16441a()) {
                    hVar.mo16456b(a);
                    break;
                }
            }
        }
        mo16443b(hVar, sb);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16443b(C5048h hVar, StringBuilder sb) {
        hVar.mo16465j();
        int f = hVar.mo16464i().mo16472f() - hVar.mo16459d();
        hVar.f17981a -= sb.length();
        if (hVar.mo16463h() > 1 || f > 1 || hVar.mo16463h() != f) {
            hVar.mo16450a(254);
        }
        if (hVar.mo16460e() < 0) {
            hVar.mo16456b(0);
        }
    }
}
