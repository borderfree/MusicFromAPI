package com.google.android.exoplayer2.text.p109a;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2768d;
import com.google.android.exoplayer2.text.C2794g;
import com.google.android.exoplayer2.text.C2795h;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.a.a */
public final class C2742a extends C2749d {

    /* renamed from: a */
    private static final int[] f9400a = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: b */
    private static final int[] f9401b = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: c */
    private static final int[] f9402c = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: d */
    private static final int[] f9403d = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: e */
    private static final int[] f9404e = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: f */
    private static final int[] f9405f = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: g */
    private static final int[] f9406g = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: h */
    private final C2500k f9407h = new C2500k();

    /* renamed from: i */
    private final int f9408i;

    /* renamed from: j */
    private final int f9409j;

    /* renamed from: k */
    private final LinkedList<C2743a> f9410k = new LinkedList<>();

    /* renamed from: l */
    private C2743a f9411l = new C2743a(0, 4);

    /* renamed from: m */
    private List<C2741a> f9412m;

    /* renamed from: n */
    private List<C2741a> f9413n;

    /* renamed from: o */
    private int f9414o;

    /* renamed from: p */
    private int f9415p;

    /* renamed from: q */
    private boolean f9416q;

    /* renamed from: r */
    private byte f9417r;

    /* renamed from: s */
    private byte f9418s;

    /* renamed from: com.google.android.exoplayer2.text.a.a$a */
    private static class C2743a {

        /* renamed from: a */
        private final List<CharacterStyle> f9419a = new ArrayList();

        /* renamed from: b */
        private final List<C2744a> f9420b = new ArrayList();

        /* renamed from: c */
        private final List<SpannableString> f9421c = new LinkedList();

        /* renamed from: d */
        private final SpannableStringBuilder f9422d = new SpannableStringBuilder();

        /* renamed from: e */
        private int f9423e;

        /* renamed from: f */
        private int f9424f;

        /* renamed from: g */
        private int f9425g;

        /* renamed from: h */
        private int f9426h;

        /* renamed from: i */
        private int f9427i;

        /* renamed from: j */
        private int f9428j;

        /* renamed from: com.google.android.exoplayer2.text.a.a$a$a */
        private static class C2744a {

            /* renamed from: a */
            public final CharacterStyle f9429a;

            /* renamed from: b */
            public final int f9430b;

            /* renamed from: c */
            public final int f9431c;

            public C2744a(CharacterStyle characterStyle, int i, int i2) {
                this.f9429a = characterStyle;
                this.f9430b = i;
                this.f9431c = i2;
            }
        }

        public C2743a(int i, int i2) {
            mo9392a(i, i2);
        }

        /* renamed from: a */
        public void mo9390a(char c) {
            this.f9422d.append(c);
        }

        /* renamed from: a */
        public void mo9391a(int i) {
            this.f9423e = i;
        }

        /* renamed from: a */
        public void mo9392a(int i, int i2) {
            this.f9419a.clear();
            this.f9420b.clear();
            this.f9421c.clear();
            this.f9422d.clear();
            this.f9423e = 15;
            this.f9424f = 0;
            this.f9425g = 0;
            this.f9426h = i;
            this.f9427i = i2;
            this.f9428j = -1;
        }

        /* renamed from: a */
        public void mo9393a(CharacterStyle characterStyle) {
            this.f9419a.add(characterStyle);
        }

        /* renamed from: a */
        public void mo9394a(CharacterStyle characterStyle, int i) {
            this.f9420b.add(new C2744a(characterStyle, this.f9422d.length(), i));
        }

        /* renamed from: a */
        public void mo9395a(boolean z) {
            if (z) {
                this.f9428j = this.f9422d.length();
            } else if (this.f9428j != -1) {
                this.f9422d.setSpan(new UnderlineSpan(), this.f9428j, this.f9422d.length(), 33);
                this.f9428j = -1;
            }
        }

        /* renamed from: a */
        public boolean mo9396a() {
            return this.f9419a.isEmpty() && this.f9420b.isEmpty() && this.f9421c.isEmpty() && this.f9422d.length() == 0;
        }

        /* renamed from: b */
        public void mo9397b() {
            int length = this.f9422d.length();
            if (length > 0) {
                this.f9422d.delete(length - 1, length);
            }
        }

        /* renamed from: b */
        public void mo9398b(int i) {
            this.f9424f = i;
        }

        /* renamed from: c */
        public int mo9399c() {
            return this.f9423e;
        }

        /* renamed from: c */
        public void mo9400c(int i) {
            this.f9425g = i;
        }

        /* renamed from: d */
        public void mo9401d() {
            this.f9421c.add(mo9402e());
            this.f9422d.clear();
            this.f9419a.clear();
            this.f9420b.clear();
            this.f9428j = -1;
            int min = Math.min(this.f9427i, this.f9423e);
            while (this.f9421c.size() >= min) {
                this.f9421c.remove(0);
            }
        }

        /* renamed from: e */
        public SpannableString mo9402e() {
            int length = this.f9422d.length();
            int i = 0;
            for (int i2 = 0; i2 < this.f9419a.size(); i2++) {
                this.f9422d.setSpan(this.f9419a.get(i2), 0, length, 33);
            }
            while (i < this.f9420b.size()) {
                C2744a aVar = (C2744a) this.f9420b.get(i);
                this.f9422d.setSpan(aVar.f9429a, aVar.f9430b, i < this.f9420b.size() - aVar.f9431c ? ((C2744a) this.f9420b.get(aVar.f9431c + i)).f9430b : length, 33);
                i++;
            }
            if (this.f9428j != -1) {
                this.f9422d.setSpan(new UnderlineSpan(), this.f9428j, length, 33);
            }
            return new SpannableString(this.f9422d);
        }

        /* renamed from: f */
        public C2741a mo9403f() {
            int i;
            float f;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f9421c.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.f9421c.get(i4));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(mo9402e());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.f9424f + this.f9425g;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (this.f9426h == 2 && Math.abs(i6) < 3) {
                f = 0.5f;
                i = 1;
            } else if (this.f9426h != 2 || i6 <= 0) {
                f = ((((float) i5) / 32.0f) * 0.8f) + 0.1f;
                i = 0;
            } else {
                f = ((((float) (32 - length)) / 32.0f) * 0.8f) + 0.1f;
                i = 2;
            }
            if (this.f9426h == 1 || this.f9423e > 7) {
                i3 = (this.f9423e - 15) - 2;
                i2 = 2;
            } else {
                i3 = this.f9423e;
                i2 = 0;
            }
            C2741a aVar = new C2741a(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f, i, Float.MIN_VALUE);
            return aVar;
        }

        public String toString() {
            return this.f9422d.toString();
        }
    }

    public C2742a(String str, int i) {
        this.f9408i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        switch (i) {
            case 3:
            case 4:
                this.f9409j = 2;
                break;
            default:
                this.f9409j = 1;
                break;
        }
        m12992a(0);
        m13006j();
    }

    /* renamed from: a */
    private void m12991a(byte b) {
        this.f9411l.mo9395a((b & 1) == 1);
        int i = (b >> 1) & 15;
        if (i == 7) {
            this.f9411l.mo9394a((CharacterStyle) new StyleSpan(2), 2);
            this.f9411l.mo9394a((CharacterStyle) new ForegroundColorSpan(-1), 1);
            return;
        }
        this.f9411l.mo9394a((CharacterStyle) new ForegroundColorSpan(f9402c[i]), 1);
    }

    /* renamed from: a */
    private void m12992a(int i) {
        if (this.f9414o != i) {
            int i2 = this.f9414o;
            this.f9414o = i;
            m13006j();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f9412m = null;
            }
        }
    }

    /* renamed from: a */
    private boolean m12993a(byte b, byte b2) {
        boolean g = m13004g(b);
        if (g) {
            if (this.f9416q && this.f9417r == b && this.f9418s == b2) {
                this.f9416q = false;
                return true;
            }
            this.f9416q = true;
            this.f9417r = b;
            this.f9418s = b2;
        }
        if (m12997c(b, b2)) {
            m12991a(b2);
        } else if (m12999d(b, b2)) {
            m12995b(b, b2);
        } else if (m13001e(b, b2)) {
            this.f9411l.mo9400c(b2 - 32);
        } else if (m13003f(b, b2)) {
            m12994b(b2);
        }
        return g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r3.f9414o != 3) goto L_0x0048;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12994b(byte r4) {
        /*
            r3 = this;
            r0 = 32
            r1 = 2
            if (r4 == r0) goto L_0x005a
            r0 = 41
            r2 = 3
            if (r4 == r0) goto L_0x0056
            r0 = 1
            switch(r4) {
                case 37: goto L_0x0053;
                case 38: goto L_0x0050;
                case 39: goto L_0x0049;
                default: goto L_0x000e;
            }
        L_0x000e:
            int r1 = r3.f9414o
            if (r1 != 0) goto L_0x0013
            return
        L_0x0013:
            r1 = 33
            if (r4 == r1) goto L_0x0043
            switch(r4) {
                case 44: goto L_0x0037;
                case 45: goto L_0x0025;
                case 46: goto L_0x0021;
                case 47: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0048
        L_0x001b:
            java.util.List r4 = r3.m13005i()
            r3.f9412m = r4
        L_0x0021:
            r3.m13006j()
            goto L_0x0048
        L_0x0025:
            int r4 = r3.f9414o
            if (r4 != r0) goto L_0x0048
            com.google.android.exoplayer2.text.a.a$a r4 = r3.f9411l
            boolean r4 = r4.mo9396a()
            if (r4 != 0) goto L_0x0048
            com.google.android.exoplayer2.text.a.a$a r4 = r3.f9411l
            r4.mo9401d()
            goto L_0x0048
        L_0x0037:
            r4 = 0
            r3.f9412m = r4
            int r4 = r3.f9414o
            if (r4 == r0) goto L_0x0021
            int r4 = r3.f9414o
            if (r4 != r2) goto L_0x0048
            goto L_0x0021
        L_0x0043:
            com.google.android.exoplayer2.text.a.a$a r4 = r3.f9411l
            r4.mo9397b()
        L_0x0048:
            return
        L_0x0049:
            r4 = 4
            r3.f9415p = r4
        L_0x004c:
            r3.m12992a(r0)
            return
        L_0x0050:
            r3.f9415p = r2
            goto L_0x004c
        L_0x0053:
            r3.f9415p = r1
            goto L_0x004c
        L_0x0056:
            r3.m12992a(r2)
            return
        L_0x005a:
            r3.m12992a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p109a.C2742a.m12994b(byte):void");
    }

    /* renamed from: b */
    private void m12995b(byte b, byte b2) {
        int i = f9400a[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f9411l.mo9399c()) {
            if (this.f9414o != 1 && !this.f9411l.mo9396a()) {
                this.f9411l = new C2743a(this.f9414o, this.f9415p);
                this.f9410k.add(this.f9411l);
            }
            this.f9411l.mo9391a(i);
        }
        if ((b2 & 1) == 1) {
            this.f9411l.mo9393a((CharacterStyle) new UnderlineSpan());
        }
        int i2 = (b2 >> 1) & 15;
        if (i2 > 7) {
            this.f9411l.mo9398b(f9401b[i2 & 7]);
        } else if (i2 == 7) {
            this.f9411l.mo9393a((CharacterStyle) new StyleSpan(2));
            this.f9411l.mo9393a((CharacterStyle) new ForegroundColorSpan(-1));
        } else {
            this.f9411l.mo9393a((CharacterStyle) new ForegroundColorSpan(f9402c[i2]));
        }
    }

    /* renamed from: c */
    private static char m12996c(byte b) {
        return (char) f9403d[(b & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: c */
    private static boolean m12997c(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: d */
    private static char m12998d(byte b) {
        return (char) f9404e[b & 15];
    }

    /* renamed from: d */
    private static boolean m12999d(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: e */
    private static char m13000e(byte b) {
        return (char) f9405f[b & 31];
    }

    /* renamed from: e */
    private static boolean m13001e(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: f */
    private static char m13002f(byte b) {
        return (char) f9406g[b & 31];
    }

    /* renamed from: f */
    private static boolean m13003f(byte b, byte b2) {
        return (b & 247) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: g */
    private static boolean m13004g(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: i */
    private List<C2741a> m13005i() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f9410k.size(); i++) {
            C2741a f = ((C2743a) this.f9410k.get(i)).mo9403f();
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private void m13006j() {
        this.f9411l.mo9392a(this.f9414o, this.f9415p);
        this.f9410k.clear();
        this.f9410k.add(this.f9411l);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo9383a(long j) {
        super.mo9383a(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9384a(C2794g gVar) {
        C2743a aVar;
        char c;
        this.f9407h.mo8822a(gVar.f7788b.array(), gVar.f7788b.limit());
        boolean z = false;
        boolean z2 = false;
        while (this.f9407h.mo8824b() >= this.f9408i) {
            byte g = this.f9408i == 2 ? -4 : (byte) this.f9407h.mo8834g();
            byte g2 = (byte) (this.f9407h.mo8834g() & 127);
            byte g3 = (byte) (this.f9407h.mo8834g() & 127);
            if ((g & 6) == 4 && ((this.f9409j != 1 || (g & 1) == 0) && ((this.f9409j != 2 || (g & 1) == 1) && !(g2 == 0 && g3 == 0)))) {
                if ((g2 & 247) == 17 && (g3 & 240) == 48) {
                    aVar = this.f9411l;
                    c = m12998d(g3);
                } else if ((g2 & 246) == 18 && (g3 & 224) == 32) {
                    this.f9411l.mo9397b();
                    if ((g2 & 1) == 0) {
                        aVar = this.f9411l;
                        c = m13000e(g3);
                    } else {
                        aVar = this.f9411l;
                        c = m13002f(g3);
                    }
                } else {
                    if ((g2 & 224) == 0) {
                        z2 = m12993a(g2, g3);
                    } else {
                        this.f9411l.mo9390a(m12996c(g2));
                        if ((g3 & 224) != 0) {
                            aVar = this.f9411l;
                            c = m12996c(g3);
                        }
                    }
                    z = true;
                }
                aVar.mo9390a(c);
                z = true;
            }
        }
        if (z) {
            if (!z2) {
                this.f9416q = false;
            }
            if (this.f9414o == 1 || this.f9414o == 3) {
                this.f9412m = m13005i();
            }
        }
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo9385b(C2794g gVar) {
        super.mo8652a(gVar);
    }

    /* renamed from: c */
    public void mo8654c() {
        super.mo8654c();
        this.f9412m = null;
        this.f9413n = null;
        m12992a(0);
        m13006j();
        this.f9415p = 4;
        this.f9416q = false;
        this.f9417r = 0;
        this.f9418s = 0;
    }

    /* renamed from: d */
    public void mo8655d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo9386e() {
        return this.f9412m != this.f9413n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C2768d mo9387f() {
        this.f9413n = this.f9412m;
        return new C2751f(this.f9412m);
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ C2795h mo9388g() {
        return super.mo8653b();
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ C2794g mo9389h() {
        return super.mo8651a();
    }
}
