package com.google.zxing.datamatrix.encoder;

/* renamed from: com.google.zxing.datamatrix.encoder.l */
final class C5052l extends C5043c {
    C5052l() {
    }

    /* renamed from: a */
    public int mo16441a() {
        return 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo16442a(char c, StringBuilder sb) {
        int i;
        int i2;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i2 = (c - '0') + 4;
            } else if (c < 'a' || c > 'z') {
                if (c < 0 || c > 31) {
                    char c3 = '!';
                    if (c >= '!' && c <= '/') {
                        sb.append(1);
                    } else if (c >= ':' && c <= '@') {
                        sb.append(1);
                        i = (c - ':') + 15;
                        c = (char) i;
                    } else if (c < '[' || c > '_') {
                        c3 = '`';
                        if (c == '`') {
                            sb.append(2);
                        } else if (c >= 'A' && c <= 'Z') {
                            sb.append(2);
                            i = (c - 'A') + 1;
                            c = (char) i;
                        } else if (c >= '{' && c <= 127) {
                            sb.append(2);
                            i = (c - '{') + 27;
                            c = (char) i;
                        } else if (c >= 128) {
                            sb.append("\u0001\u001e");
                            return mo16442a((char) (c - 128), sb) + 2;
                        } else {
                            C5050j.m25044c(c);
                            return -1;
                        }
                    } else {
                        sb.append(1);
                        i = (c - '[') + 22;
                        c = (char) i;
                    }
                    i = c - c3;
                    c = (char) i;
                } else {
                    sb.append(0);
                }
                sb.append(c);
                return 2;
            } else {
                i2 = (c - 'a') + 14;
            }
            c2 = (char) i2;
        }
        sb.append(c2);
        return 1;
    }
}
