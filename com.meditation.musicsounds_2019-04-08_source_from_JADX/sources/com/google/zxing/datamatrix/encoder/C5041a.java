package com.google.zxing.datamatrix.encoder;

/* renamed from: com.google.zxing.datamatrix.encoder.a */
final class C5041a implements C5047g {
    C5041a() {
    }

    /* renamed from: a */
    private static char m24983a(char c, char c2) {
        if (C5050j.m25042a(c) && C5050j.m25042a(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        StringBuilder sb = new StringBuilder("not digits: ");
        sb.append(c);
        sb.append(c2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public int mo16438a() {
        return 0;
    }

    /* renamed from: a */
    public void mo16439a(C5048h hVar) {
        if (C5050j.m25037a((CharSequence) hVar.mo16449a(), hVar.f17981a) >= 2) {
            hVar.mo16450a(m24983a(hVar.mo16449a().charAt(hVar.f17981a), hVar.mo16449a().charAt(hVar.f17981a + 1)));
            hVar.f17981a += 2;
            return;
        }
        char b = hVar.mo16455b();
        int a = C5050j.m25038a(hVar.mo16449a(), hVar.f17981a, mo16438a());
        if (a != mo16438a()) {
            switch (a) {
                case 1:
                    hVar.mo16450a(230);
                    hVar.mo16456b(1);
                    return;
                case 2:
                    hVar.mo16450a(239);
                    hVar.mo16456b(2);
                    return;
                case 3:
                    hVar.mo16450a(238);
                    hVar.mo16456b(3);
                    return;
                case 4:
                    hVar.mo16450a(240);
                    hVar.mo16456b(4);
                    return;
                case 5:
                    hVar.mo16450a(231);
                    hVar.mo16456b(5);
                    return;
                default:
                    StringBuilder sb = new StringBuilder("Illegal mode: ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
            }
        } else if (C5050j.m25043b(b)) {
            hVar.mo16450a(235);
            hVar.mo16450a((char) ((b - 128) + 1));
            hVar.f17981a++;
        } else {
            hVar.mo16450a((char) (b + 1));
            hVar.f17981a++;
        }
    }
}
