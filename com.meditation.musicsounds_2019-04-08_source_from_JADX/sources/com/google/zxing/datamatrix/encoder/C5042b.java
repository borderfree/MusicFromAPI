package com.google.zxing.datamatrix.encoder;

/* renamed from: com.google.zxing.datamatrix.encoder.b */
final class C5042b implements C5047g {
    C5042b() {
    }

    /* renamed from: a */
    private static char m24986a(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    /* renamed from: a */
    public int mo16440a() {
        return 5;
    }

    /* renamed from: a */
    public void mo16439a(C5048h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!hVar.mo16462g()) {
                break;
            }
            sb.append(hVar.mo16455b());
            hVar.f17981a++;
            int a = C5050j.m25038a(hVar.mo16449a(), hVar.f17981a, mo16440a());
            if (a != mo16440a()) {
                hVar.mo16456b(a);
                break;
            }
        }
        int length = sb.length() - 1;
        int d = hVar.mo16459d() + length + 1;
        hVar.mo16458c(d);
        boolean z = hVar.mo16464i().mo16472f() - d > 0;
        if (hVar.mo16462g() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                StringBuilder sb2 = new StringBuilder("Message length not in valid ranges: ");
                sb2.append(length);
                throw new IllegalStateException(sb2.toString());
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            hVar.mo16450a(m24986a(sb.charAt(i), hVar.mo16459d() + 1));
        }
    }
}
