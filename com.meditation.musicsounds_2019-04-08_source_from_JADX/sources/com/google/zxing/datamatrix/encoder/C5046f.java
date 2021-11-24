package com.google.zxing.datamatrix.encoder;

/* renamed from: com.google.zxing.datamatrix.encoder.f */
final class C5046f implements C5047g {
    C5046f() {
    }

    /* renamed from: a */
    private static String m25008a(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i2 >> 16) & 255);
            char c3 = (char) ((i2 >> 8) & 255);
            char c4 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append(c2);
            if (length >= 2) {
                sb.append(c3);
            }
            if (length >= 3) {
                sb.append(c4);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: a */
    private static void m25009a(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            C5050j.m25044c(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* renamed from: a */
    private static void m25010a(C5048h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    hVar.mo16465j();
                    int f = hVar.mo16464i().mo16472f() - hVar.mo16459d();
                    if (hVar.mo16463h() == 0 && f <= 2) {
                        hVar.mo16456b(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String a = m25008a(charSequence, 0);
                    if (!(!hVar.mo16462g()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        hVar.mo16458c(hVar.mo16459d() + i);
                        if (hVar.mo16464i().mo16472f() - hVar.mo16459d() >= 3) {
                            hVar.mo16458c(hVar.mo16459d() + a.length());
                            z = false;
                        }
                    }
                    if (z) {
                        hVar.mo16466k();
                        hVar.f17981a -= i;
                    } else {
                        hVar.mo16454a(a);
                    }
                    hVar.mo16456b(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.mo16456b(0);
        }
    }

    /* renamed from: a */
    public int mo16448a() {
        return 4;
    }

    /* renamed from: a */
    public void mo16439a(C5048h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo16462g()) {
                break;
            }
            m25009a(hVar.mo16455b(), sb);
            hVar.f17981a++;
            if (sb.length() >= 4) {
                hVar.mo16454a(m25008a((CharSequence) sb, 0));
                sb.delete(0, 4);
                if (C5050j.m25038a(hVar.mo16449a(), hVar.f17981a, mo16448a()) != mo16448a()) {
                    hVar.mo16456b(0);
                    break;
                }
            }
        }
        sb.append(31);
        m25010a(hVar, (CharSequence) sb);
    }
}
