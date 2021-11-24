package com.google.android.exoplayer2.text.p114f;

import android.text.TextUtils;
import com.google.android.exoplayer2.p102c.C2490c;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.f.a */
final class C2781a {

    /* renamed from: a */
    private static final Pattern f9606a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: b */
    private final C2500k f9607b = new C2500k();

    /* renamed from: c */
    private final StringBuilder f9608c = new StringBuilder();

    /* renamed from: a */
    private static char m13220a(C2500k kVar, int i) {
        return (char) kVar.f8094a[i];
    }

    /* renamed from: a */
    static String m13221a(C2500k kVar, StringBuilder sb) {
        m13225b(kVar);
        if (kVar.mo8824b() == 0) {
            return null;
        }
        String d = m13229d(kVar, sb);
        if (!"".equals(d)) {
            return d;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append((char) kVar.mo8834g());
        return sb2.toString();
    }

    /* renamed from: a */
    private static void m13222a(C2500k kVar, C2784d dVar, StringBuilder sb) {
        m13225b(kVar);
        String d = m13229d(kVar, sb);
        if (!"".equals(d) && ":".equals(m13221a(kVar, sb))) {
            m13225b(kVar);
            String c = m13226c(kVar, sb);
            if (c != null && !"".equals(c)) {
                int d2 = kVar.mo8828d();
                String a = m13221a(kVar, sb);
                if (!";".equals(a)) {
                    if ("}".equals(a)) {
                        kVar.mo8827c(d2);
                    }
                }
                if ("color".equals(d)) {
                    dVar.mo9475a(C2490c.m11679b(c));
                } else if ("background-color".equals(d)) {
                    dVar.mo9481b(C2490c.m11679b(c));
                } else if ("text-decoration".equals(d)) {
                    if ("underline".equals(c)) {
                        dVar.mo9476a(true);
                    }
                } else if ("font-family".equals(d)) {
                    dVar.mo9487d(c);
                } else if ("font-weight".equals(d)) {
                    if ("bold".equals(c)) {
                        dVar.mo9482b(true);
                    }
                } else if ("font-style".equals(d) && "italic".equals(c)) {
                    dVar.mo9484c(true);
                }
            }
        }
    }

    /* renamed from: a */
    private void m13223a(C2784d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f9606a.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.mo9485c(matcher.group(1));
                }
                str = str.substring(0, indexOf);
            }
            String[] split = str.split("\\.");
            String str2 = split[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.mo9483b(str2.substring(0, indexOf2));
                dVar.mo9478a(str2.substring(indexOf2 + 1));
            } else {
                dVar.mo9483b(str2);
            }
            if (split.length > 1) {
                dVar.mo9479a((String[]) Arrays.copyOfRange(split, 1, split.length));
            }
        }
    }

    /* renamed from: b */
    private static String m13224b(C2500k kVar, StringBuilder sb) {
        m13225b(kVar);
        if (kVar.mo8824b() < 5) {
            return null;
        }
        if (!"::cue".equals(kVar.mo8831e(5))) {
            return null;
        }
        int d = kVar.mo8828d();
        String a = m13221a(kVar, sb);
        if (a == null) {
            return null;
        }
        if ("{".equals(a)) {
            kVar.mo8827c(d);
            return "";
        }
        String d2 = "(".equals(a) ? m13228d(kVar) : null;
        String a2 = m13221a(kVar, sb);
        if (!")".equals(a2) || a2 == null) {
            return null;
        }
        return d2;
    }

    /* renamed from: b */
    static void m13225b(C2500k kVar) {
        while (true) {
            boolean z = true;
            while (kVar.mo8824b() > 0 && z) {
                if (!m13230e(kVar) && !m13231f(kVar)) {
                    z = false;
                }
            }
            return;
        }
    }

    /* renamed from: c */
    private static String m13226c(C2500k kVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int d = kVar.mo8828d();
            String a = m13221a(kVar, sb);
            if (a == null) {
                return null;
            }
            if ("}".equals(a) || ";".equals(a)) {
                kVar.mo8827c(d);
                z = true;
            } else {
                sb2.append(a);
            }
        }
        return sb2.toString();
    }

    /* renamed from: c */
    static void m13227c(C2500k kVar) {
        do {
        } while (!TextUtils.isEmpty(kVar.mo8852y()));
    }

    /* renamed from: d */
    private static String m13228d(C2500k kVar) {
        int d = kVar.mo8828d();
        int c = kVar.mo8826c();
        boolean z = false;
        while (d < c && !z) {
            int i = d + 1;
            z = ((char) kVar.f8094a[d]) == ')';
            d = i;
        }
        return kVar.mo8831e((d - 1) - kVar.mo8828d()).trim();
    }

    /* renamed from: d */
    private static String m13229d(C2500k kVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int d = kVar.mo8828d();
        int c = kVar.mo8826c();
        while (d < c && !z) {
            char c2 = (char) kVar.f8094a[d];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                d++;
                sb.append(c2);
            }
        }
        kVar.mo8829d(d - kVar.mo8828d());
        return sb.toString();
    }

    /* renamed from: e */
    private static boolean m13230e(C2500k kVar) {
        switch (m13220a(kVar, kVar.mo8828d())) {
            case 9:
            case 10:
            case 12:
            case 13:
            case ' ':
                kVar.mo8829d(1);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: f */
    private static boolean m13231f(C2500k kVar) {
        int d = kVar.mo8828d();
        int c = kVar.mo8826c();
        byte[] bArr = kVar.f8094a;
        if (d + 2 <= c) {
            int i = d + 1;
            if (bArr[d] == 47) {
                int i2 = i + 1;
                if (bArr[i] == 42) {
                    while (true) {
                        int i3 = i2 + 1;
                        if (i3 >= c) {
                            kVar.mo8829d(c - kVar.mo8828d());
                            return true;
                        } else if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                            i2 = i3 + 1;
                            c = i2;
                        } else {
                            i2 = i3;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C2784d mo9472a(C2500k kVar) {
        this.f9608c.setLength(0);
        int d = kVar.mo8828d();
        m13227c(kVar);
        this.f9607b.mo8822a(kVar.f8094a, kVar.mo8828d());
        this.f9607b.mo8827c(d);
        String b = m13224b(this.f9607b, this.f9608c);
        if (b == null || !"{".equals(m13221a(this.f9607b, this.f9608c))) {
            return null;
        }
        C2784d dVar = new C2784d();
        m13223a(dVar, b);
        String str = null;
        boolean z = false;
        while (!z) {
            int d2 = this.f9607b.mo8828d();
            str = m13221a(this.f9607b, this.f9608c);
            boolean z2 = str == null || "}".equals(str);
            if (!z2) {
                this.f9607b.mo8827c(d2);
                m13222a(this.f9607b, dVar, this.f9608c);
            }
            z = z2;
        }
        if ("}".equals(str)) {
            return dVar;
        }
        return null;
    }
}
