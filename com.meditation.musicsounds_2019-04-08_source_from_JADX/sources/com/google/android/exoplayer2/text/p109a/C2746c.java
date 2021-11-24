package com.google.android.exoplayer2.text.p109a;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2499j;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2768d;
import com.google.android.exoplayer2.text.C2794g;
import com.google.android.exoplayer2.text.C2795h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.a.c */
public final class C2746c extends C2749d {

    /* renamed from: a */
    private final C2500k f9433a = new C2500k();

    /* renamed from: b */
    private final C2499j f9434b = new C2499j();

    /* renamed from: c */
    private final int f9435c;

    /* renamed from: d */
    private final C2747a[] f9436d;

    /* renamed from: e */
    private C2747a f9437e;

    /* renamed from: f */
    private List<C2741a> f9438f;

    /* renamed from: g */
    private List<C2741a> f9439g;

    /* renamed from: h */
    private C2748b f9440h;

    /* renamed from: i */
    private int f9441i;

    /* renamed from: com.google.android.exoplayer2.text.a.c$a */
    private static final class C2747a {

        /* renamed from: a */
        public static final int f9442a = m13057a(2, 2, 2, 0);

        /* renamed from: b */
        public static final int f9443b = m13057a(0, 0, 0, 0);

        /* renamed from: c */
        public static final int f9444c = m13057a(0, 0, 0, 3);

        /* renamed from: d */
        private static final int[] f9445d = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: e */
        private static final int[] f9446e = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: f */
        private static final int[] f9447f = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: g */
        private static final boolean[] f9448g = {false, false, false, true, true, true, false};

        /* renamed from: h */
        private static final int[] f9449h = {f9443b, f9444c, f9443b, f9443b, f9444c, f9443b, f9443b};

        /* renamed from: i */
        private static final int[] f9450i = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: j */
        private static final int[] f9451j = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: k */
        private static final int[] f9452k = {f9443b, f9443b, f9443b, f9443b, f9443b, f9444c, f9444c};

        /* renamed from: A */
        private int f9453A;

        /* renamed from: B */
        private int f9454B;

        /* renamed from: C */
        private int f9455C;

        /* renamed from: D */
        private int f9456D;

        /* renamed from: E */
        private int f9457E;

        /* renamed from: F */
        private int f9458F;

        /* renamed from: G */
        private int f9459G;

        /* renamed from: l */
        private final List<SpannableString> f9460l = new LinkedList();

        /* renamed from: m */
        private final SpannableStringBuilder f9461m = new SpannableStringBuilder();

        /* renamed from: n */
        private boolean f9462n;

        /* renamed from: o */
        private boolean f9463o;

        /* renamed from: p */
        private int f9464p;

        /* renamed from: q */
        private boolean f9465q;

        /* renamed from: r */
        private int f9466r;

        /* renamed from: s */
        private int f9467s;

        /* renamed from: t */
        private int f9468t;

        /* renamed from: u */
        private int f9469u;

        /* renamed from: v */
        private boolean f9470v;

        /* renamed from: w */
        private int f9471w;

        /* renamed from: x */
        private int f9472x;

        /* renamed from: y */
        private int f9473y;

        /* renamed from: z */
        private int f9474z;

        public C2747a() {
            mo9415b();
        }

        /* renamed from: a */
        public static int m13057a(int i, int i2, int i3, int i4) {
            int i5;
            C2488a.m11663a(i, 0, 4);
            C2488a.m11663a(i2, 0, 4);
            C2488a.m11663a(i3, 0, 4);
            C2488a.m11663a(i4, 0, 4);
            int i6 = 255;
            switch (i4) {
                case 2:
                    i5 = 127;
                    break;
                case 3:
                    i5 = 0;
                    break;
                default:
                    i5 = 255;
                    break;
            }
            int i7 = i > 1 ? 255 : 0;
            int i8 = i2 > 1 ? 255 : 0;
            if (i3 <= 1) {
                i6 = 0;
            }
            return Color.argb(i5, i7, i8, i6);
        }

        /* renamed from: b */
        public static int m13058b(int i, int i2, int i3) {
            return m13057a(i, i2, i3, 0);
        }

        /* renamed from: a */
        public void mo9407a(char c) {
            if (c == 10) {
                this.f9460l.add(mo9420g());
                this.f9461m.clear();
                if (this.f9453A != -1) {
                    this.f9453A = 0;
                }
                if (this.f9454B != -1) {
                    this.f9454B = 0;
                }
                if (this.f9455C != -1) {
                    this.f9455C = 0;
                }
                if (this.f9457E != -1) {
                    this.f9457E = 0;
                }
                while (true) {
                    if ((this.f9470v && this.f9460l.size() >= this.f9469u) || this.f9460l.size() >= 15) {
                        this.f9460l.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f9461m.append(c);
            }
        }

        /* renamed from: a */
        public void mo9408a(int i, int i2) {
            if (this.f9459G != i) {
                mo9407a(10);
            }
            this.f9459G = i;
        }

        /* renamed from: a */
        public void mo9409a(int i, int i2, int i3) {
            if (!(this.f9455C == -1 || this.f9456D == i)) {
                this.f9461m.setSpan(new ForegroundColorSpan(this.f9456D), this.f9455C, this.f9461m.length(), 33);
            }
            if (i != f9442a) {
                this.f9455C = this.f9461m.length();
                this.f9456D = i;
            }
            if (!(this.f9457E == -1 || this.f9458F == i2)) {
                this.f9461m.setSpan(new BackgroundColorSpan(this.f9458F), this.f9457E, this.f9461m.length(), 33);
            }
            if (i2 != f9443b) {
                this.f9457E = this.f9461m.length();
                this.f9458F = i2;
            }
        }

        /* renamed from: a */
        public void mo9410a(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f9453A != -1) {
                if (!z) {
                    this.f9461m.setSpan(new StyleSpan(2), this.f9453A, this.f9461m.length(), 33);
                    this.f9453A = -1;
                }
            } else if (z) {
                this.f9453A = this.f9461m.length();
            }
            if (this.f9454B != -1) {
                if (!z2) {
                    this.f9461m.setSpan(new UnderlineSpan(), this.f9454B, this.f9461m.length(), 33);
                    this.f9454B = -1;
                }
            } else if (z2) {
                this.f9454B = this.f9461m.length();
            }
        }

        /* renamed from: a */
        public void mo9411a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f9474z = i;
            this.f9471w = i6;
        }

        /* renamed from: a */
        public void mo9412a(boolean z) {
            this.f9463o = z;
        }

        /* renamed from: a */
        public void mo9413a(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z5 = z2;
            int i9 = i7;
            int i10 = i8;
            this.f9462n = true;
            this.f9463o = z;
            this.f9470v = z5;
            this.f9464p = i;
            this.f9465q = z4;
            this.f9466r = i2;
            this.f9467s = i3;
            this.f9468t = i6;
            int i11 = i4 + 1;
            if (this.f9469u != i11) {
                this.f9469u = i11;
                while (true) {
                    if ((!z5 || this.f9460l.size() < this.f9469u) && this.f9460l.size() < 15) {
                        break;
                    }
                    this.f9460l.remove(0);
                }
            }
            if (!(i9 == 0 || this.f9472x == i9)) {
                this.f9472x = i9;
                int i12 = i9 - 1;
                mo9411a(f9449h[i12], f9444c, f9448g[i12], 0, f9446e[i12], f9447f[i12], f9445d[i12]);
            }
            if (i10 != 0 && this.f9473y != i10) {
                this.f9473y = i10;
                int i13 = i10 - 1;
                mo9410a(0, 1, 1, false, false, f9451j[i13], f9450i[i13]);
                mo9409a(f9442a, f9452k[i13], f9443b);
            }
        }

        /* renamed from: a */
        public boolean mo9414a() {
            return !mo9417d() || (this.f9460l.isEmpty() && this.f9461m.length() == 0);
        }

        /* renamed from: b */
        public void mo9415b() {
            mo9416c();
            this.f9462n = false;
            this.f9463o = false;
            this.f9464p = 4;
            this.f9465q = false;
            this.f9466r = 0;
            this.f9467s = 0;
            this.f9468t = 0;
            this.f9469u = 15;
            this.f9470v = true;
            this.f9471w = 0;
            this.f9472x = 0;
            this.f9473y = 0;
            this.f9474z = f9443b;
            this.f9456D = f9442a;
            this.f9458F = f9443b;
        }

        /* renamed from: c */
        public void mo9416c() {
            this.f9460l.clear();
            this.f9461m.clear();
            this.f9453A = -1;
            this.f9454B = -1;
            this.f9455C = -1;
            this.f9457E = -1;
            this.f9459G = 0;
        }

        /* renamed from: d */
        public boolean mo9417d() {
            return this.f9462n;
        }

        /* renamed from: e */
        public boolean mo9418e() {
            return this.f9463o;
        }

        /* renamed from: f */
        public void mo9419f() {
            int length = this.f9461m.length();
            if (length > 0) {
                this.f9461m.delete(length - 1, length);
            }
        }

        /* renamed from: g */
        public SpannableString mo9420g() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9461m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f9453A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f9453A, length, 33);
                }
                if (this.f9454B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9454B, length, 33);
                }
                if (this.f9455C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f9456D), this.f9455C, length, 33);
                }
                if (this.f9457E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f9458F), this.f9457E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: h */
        public C2745b mo9421h() {
            Alignment alignment;
            float f;
            float f2;
            if (mo9414a()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.f9460l.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f9460l.get(i));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(mo9420g());
            switch (this.f9471w) {
                case 0:
                case 3:
                    alignment = Alignment.ALIGN_NORMAL;
                    break;
                case 1:
                    alignment = Alignment.ALIGN_OPPOSITE;
                    break;
                case 2:
                    alignment = Alignment.ALIGN_CENTER;
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected justification value: ");
                    sb.append(this.f9471w);
                    throw new IllegalArgumentException(sb.toString());
            }
            Alignment alignment2 = alignment;
            if (this.f9465q) {
                f2 = ((float) this.f9467s) / 99.0f;
                f = ((float) this.f9466r) / 99.0f;
            } else {
                f2 = ((float) this.f9467s) / 209.0f;
                f = ((float) this.f9466r) / 74.0f;
            }
            float f3 = (f2 * 0.9f) + 0.05f;
            float f4 = (f * 0.9f) + 0.05f;
            int i2 = this.f9468t % 3 == 0 ? 0 : this.f9468t % 3 == 1 ? 1 : 2;
            int i3 = this.f9468t / 3 == 0 ? 0 : this.f9468t / 3 == 1 ? 1 : 2;
            C2745b bVar = new C2745b(spannableStringBuilder, alignment2, f4, 0, i2, f3, i3, Float.MIN_VALUE, this.f9474z != f9443b, this.f9474z, this.f9464p);
            return bVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.a.c$b */
    private static final class C2748b {

        /* renamed from: a */
        public final int f9475a;

        /* renamed from: b */
        public final int f9476b;

        /* renamed from: c */
        public final byte[] f9477c;

        /* renamed from: d */
        int f9478d = 0;

        public C2748b(int i, int i2) {
            this.f9475a = i;
            this.f9476b = i2;
            this.f9477c = new byte[((i2 * 2) - 1)];
        }
    }

    public C2746c(int i) {
        if (i == -1) {
            i = 1;
        }
        this.f9435c = i;
        this.f9436d = new C2747a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f9436d[i2] = new C2747a();
        }
        this.f9437e = this.f9436d[0];
        m13047p();
    }

    /* renamed from: a */
    private void m13031a(int i) {
        C2499j jVar;
        if (i == 0) {
            return;
        }
        if (i != 3) {
            int i2 = 8;
            if (i != 8) {
                switch (i) {
                    case 12:
                        m13047p();
                        return;
                    case 13:
                        this.f9437e.mo9407a(10);
                        return;
                    case 14:
                        return;
                    default:
                        if (i >= 17 && i <= 23) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                            sb.append(i);
                            Log.w("Cea708Decoder", sb.toString());
                            jVar = this.f9434b;
                        } else if (i < 24 || i > 31) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid C0 command: ");
                            sb2.append(i);
                            Log.w("Cea708Decoder", sb2.toString());
                            return;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Currently unsupported COMMAND_P16 Command: ");
                            sb3.append(i);
                            Log.w("Cea708Decoder", sb3.toString());
                            jVar = this.f9434b;
                            i2 = 16;
                        }
                        jVar.mo8812b(i2);
                        return;
                }
            } else {
                this.f9437e.mo9419f();
            }
        } else {
            this.f9438f = m13046o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r5 = r4.f9434b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r5.mo8812b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r2 > 8) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r4.f9434b.mo8816d() == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        r4.f9436d[8 - r2].mo9415b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (r2 > 8) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
        if (r4.f9434b.mo8816d() == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        r4.f9436d[8 - r2].mo9412a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r2 > 8) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ee, code lost:
        if (r4.f9434b.mo8816d() == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f0, code lost:
        r4.f9436d[8 - r2].mo9416c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        r4.f9437e = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13032b(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x00fc;
                case 129: goto L_0x00fc;
                case 130: goto L_0x00fc;
                case 131: goto L_0x00fc;
                case 132: goto L_0x00fc;
                case 133: goto L_0x00fc;
                case 134: goto L_0x00fc;
                case 135: goto L_0x00fc;
                case 136: goto L_0x00e6;
                case 137: goto L_0x00cf;
                case 138: goto L_0x00b8;
                case 139: goto L_0x009c;
                case 140: goto L_0x0086;
                case 141: goto L_0x007f;
                case 142: goto L_0x010a;
                case 143: goto L_0x007a;
                case 144: goto L_0x0066;
                case 145: goto L_0x0054;
                case 146: goto L_0x0046;
                default: goto L_0x0008;
            }
        L_0x0008:
            switch(r5) {
                case 151: goto L_0x0034;
                case 152: goto L_0x0023;
                case 153: goto L_0x0023;
                case 154: goto L_0x0023;
                case 155: goto L_0x0023;
                case 156: goto L_0x0023;
                case 157: goto L_0x0023;
                case 158: goto L_0x0023;
                case 159: goto L_0x0023;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = "Cea708Decoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid C1 command: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.util.Log.w(r0, r5)
            goto L_0x010a
        L_0x0023:
            int r5 = r5 + -152
            r4.m13040i(r5)
            int r0 = r4.f9441i
            if (r0 == r5) goto L_0x010a
            r4.f9441i = r5
            com.google.android.exoplayer2.text.a.c$a[] r0 = r4.f9436d
            r5 = r0[r5]
            goto L_0x0108
        L_0x0034:
            com.google.android.exoplayer2.text.a.c$a r5 = r4.f9437e
            boolean r5 = r5.mo9417d()
            if (r5 != 0) goto L_0x0041
            com.google.android.exoplayer2.c.j r5 = r4.f9434b
            r0 = 32
            goto L_0x0070
        L_0x0041:
            r4.m13045n()
            goto L_0x010a
        L_0x0046:
            com.google.android.exoplayer2.text.a.c$a r5 = r4.f9437e
            boolean r5 = r5.mo9417d()
            if (r5 != 0) goto L_0x004f
            goto L_0x006e
        L_0x004f:
            r4.m13044m()
            goto L_0x010a
        L_0x0054:
            com.google.android.exoplayer2.text.a.c$a r5 = r4.f9437e
            boolean r5 = r5.mo9417d()
            if (r5 != 0) goto L_0x0061
            com.google.android.exoplayer2.c.j r5 = r4.f9434b
            r0 = 24
            goto L_0x0070
        L_0x0061:
            r4.m13043l()
            goto L_0x010a
        L_0x0066:
            com.google.android.exoplayer2.text.a.c$a r5 = r4.f9437e
            boolean r5 = r5.mo9417d()
            if (r5 != 0) goto L_0x0075
        L_0x006e:
            com.google.android.exoplayer2.c.j r5 = r4.f9434b
        L_0x0070:
            r5.mo8812b(r0)
            goto L_0x010a
        L_0x0075:
            r4.m13042k()
            goto L_0x010a
        L_0x007a:
            r4.m13047p()
            goto L_0x010a
        L_0x007f:
            com.google.android.exoplayer2.c.j r5 = r4.f9434b
            r5.mo8812b(r1)
            goto L_0x010a
        L_0x0086:
            if (r2 > r1) goto L_0x010a
            com.google.android.exoplayer2.c.j r5 = r4.f9434b
            boolean r5 = r5.mo8816d()
            if (r5 == 0) goto L_0x0099
            com.google.android.exoplayer2.text.a.c$a[] r5 = r4.f9436d
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo9415b()
        L_0x0099:
            int r2 = r2 + 1
            goto L_0x0086
        L_0x009c:
            r5 = 1
        L_0x009d:
            if (r5 > r1) goto L_0x010a
            com.google.android.exoplayer2.c.j r0 = r4.f9434b
            boolean r0 = r0.mo8816d()
            if (r0 == 0) goto L_0x00b5
            com.google.android.exoplayer2.text.a.c$a[] r0 = r4.f9436d
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.mo9418e()
            r3 = r3 ^ r2
            r0.mo9412a(r3)
        L_0x00b5:
            int r5 = r5 + 1
            goto L_0x009d
        L_0x00b8:
            if (r2 > r1) goto L_0x010a
            com.google.android.exoplayer2.c.j r5 = r4.f9434b
            boolean r5 = r5.mo8816d()
            if (r5 == 0) goto L_0x00cc
            com.google.android.exoplayer2.text.a.c$a[] r5 = r4.f9436d
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.mo9412a(r0)
        L_0x00cc:
            int r2 = r2 + 1
            goto L_0x00b8
        L_0x00cf:
            r5 = 1
        L_0x00d0:
            if (r5 > r1) goto L_0x010a
            com.google.android.exoplayer2.c.j r0 = r4.f9434b
            boolean r0 = r0.mo8816d()
            if (r0 == 0) goto L_0x00e3
            com.google.android.exoplayer2.text.a.c$a[] r0 = r4.f9436d
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.mo9412a(r2)
        L_0x00e3:
            int r5 = r5 + 1
            goto L_0x00d0
        L_0x00e6:
            if (r2 > r1) goto L_0x010a
            com.google.android.exoplayer2.c.j r5 = r4.f9434b
            boolean r5 = r5.mo8816d()
            if (r5 == 0) goto L_0x00f9
            com.google.android.exoplayer2.text.a.c$a[] r5 = r4.f9436d
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo9416c()
        L_0x00f9:
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x00fc:
            int r5 = r5 + -128
            int r0 = r4.f9441i
            if (r0 == r5) goto L_0x010a
            r4.f9441i = r5
            com.google.android.exoplayer2.text.a.c$a[] r0 = r4.f9436d
            r5 = r0[r5]
        L_0x0108:
            r4.f9437e = r5
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p109a.C2746c.m13032b(int):void");
    }

    /* renamed from: c */
    private void m13033c(int i) {
        C2499j jVar;
        int i2;
        if (i > 7) {
            if (i <= 15) {
                jVar = this.f9434b;
                i2 = 8;
            } else if (i <= 23) {
                jVar = this.f9434b;
                i2 = 16;
            } else if (i <= 31) {
                jVar = this.f9434b;
                i2 = 24;
            } else {
                return;
            }
            jVar.mo8812b(i2);
        }
    }

    /* renamed from: d */
    private void m13034d(int i) {
        C2499j jVar;
        int i2;
        if (i <= 135) {
            jVar = this.f9434b;
            i2 = 32;
        } else if (i <= 143) {
            jVar = this.f9434b;
            i2 = 40;
        } else if (i <= 159) {
            this.f9434b.mo8812b(2);
            this.f9434b.mo8812b(this.f9434b.mo8814c(6) * 8);
            return;
        } else {
            return;
        }
        jVar.mo8812b(i2);
    }

    /* renamed from: e */
    private void m13035e(int i) {
        if (i == 127) {
            this.f9437e.mo9407a(9835);
        } else {
            this.f9437e.mo9407a((char) (i & 255));
        }
    }

    /* renamed from: f */
    private void m13036f(int i) {
        this.f9437e.mo9407a((char) (i & 255));
    }

    /* renamed from: g */
    private void m13037g(int i) {
        C2747a aVar;
        char c;
        if (i == 37) {
            aVar = this.f9437e;
            c = 8230;
        } else if (i == 42) {
            aVar = this.f9437e;
            c = 352;
        } else if (i == 44) {
            aVar = this.f9437e;
            c = 338;
        } else if (i != 63) {
            switch (i) {
                case 32:
                    aVar = this.f9437e;
                    c = ' ';
                    break;
                case 33:
                    aVar = this.f9437e;
                    c = 160;
                    break;
                default:
                    switch (i) {
                        case 48:
                            aVar = this.f9437e;
                            c = 9608;
                            break;
                        case 49:
                            aVar = this.f9437e;
                            c = 8216;
                            break;
                        case 50:
                            aVar = this.f9437e;
                            c = 8217;
                            break;
                        case 51:
                            aVar = this.f9437e;
                            c = 8220;
                            break;
                        case 52:
                            aVar = this.f9437e;
                            c = 8221;
                            break;
                        case 53:
                            aVar = this.f9437e;
                            c = 8226;
                            break;
                        default:
                            switch (i) {
                                case 57:
                                    aVar = this.f9437e;
                                    c = 8482;
                                    break;
                                case 58:
                                    aVar = this.f9437e;
                                    c = 353;
                                    break;
                                default:
                                    switch (i) {
                                        case 60:
                                            aVar = this.f9437e;
                                            c = 339;
                                            break;
                                        case 61:
                                            aVar = this.f9437e;
                                            c = 8480;
                                            break;
                                        default:
                                            switch (i) {
                                                case 118:
                                                    aVar = this.f9437e;
                                                    c = 8539;
                                                    break;
                                                case 119:
                                                    aVar = this.f9437e;
                                                    c = 8540;
                                                    break;
                                                case 120:
                                                    aVar = this.f9437e;
                                                    c = 8541;
                                                    break;
                                                case 121:
                                                    aVar = this.f9437e;
                                                    c = 8542;
                                                    break;
                                                case 122:
                                                    aVar = this.f9437e;
                                                    c = 9474;
                                                    break;
                                                case 123:
                                                    aVar = this.f9437e;
                                                    c = 9488;
                                                    break;
                                                case 124:
                                                    aVar = this.f9437e;
                                                    c = 9492;
                                                    break;
                                                case 125:
                                                    aVar = this.f9437e;
                                                    c = 9472;
                                                    break;
                                                case 126:
                                                    aVar = this.f9437e;
                                                    c = 9496;
                                                    break;
                                                case 127:
                                                    aVar = this.f9437e;
                                                    c = 9484;
                                                    break;
                                                default:
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Invalid G2 character: ");
                                                    sb.append(i);
                                                    Log.w("Cea708Decoder", sb.toString());
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        } else {
            aVar = this.f9437e;
            c = 376;
        }
        aVar.mo9407a(c);
    }

    /* renamed from: h */
    private void m13038h(int i) {
        C2747a aVar;
        char c;
        if (i == 160) {
            aVar = this.f9437e;
            c = 13252;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid G3 character: ");
            sb.append(i);
            Log.w("Cea708Decoder", sb.toString());
            aVar = this.f9437e;
            c = '_';
        }
        aVar.mo9407a(c);
    }

    /* renamed from: i */
    private void m13039i() {
        if (this.f9440h != null) {
            m13041j();
            this.f9440h = null;
        }
    }

    /* renamed from: i */
    private void m13040i(int i) {
        C2747a aVar = this.f9436d[i];
        this.f9434b.mo8812b(2);
        boolean d = this.f9434b.mo8816d();
        boolean d2 = this.f9434b.mo8816d();
        boolean d3 = this.f9434b.mo8816d();
        int c = this.f9434b.mo8814c(3);
        boolean d4 = this.f9434b.mo8816d();
        int c2 = this.f9434b.mo8814c(7);
        int c3 = this.f9434b.mo8814c(8);
        int c4 = this.f9434b.mo8814c(4);
        int c5 = this.f9434b.mo8814c(4);
        this.f9434b.mo8812b(2);
        int c6 = this.f9434b.mo8814c(6);
        this.f9434b.mo8812b(2);
        aVar.mo9413a(d, d2, d3, c, d4, c2, c3, c5, c6, c4, this.f9434b.mo8814c(3), this.f9434b.mo8814c(3));
    }

    /* renamed from: j */
    private void m13041j() {
        String str;
        StringBuilder sb;
        String str2;
        if (this.f9440h.f9478d != (this.f9440h.f9476b * 2) - 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((this.f9440h.f9476b * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(this.f9440h.f9478d);
            sb2.append(" (sequence number ");
            sb2.append(this.f9440h.f9475a);
            sb2.append("); ignoring packet");
            Log.w("Cea708Decoder", sb2.toString());
            return;
        }
        this.f9434b.mo8809a(this.f9440h.f9477c, this.f9440h.f9478d);
        int c = this.f9434b.mo8814c(3);
        int c2 = this.f9434b.mo8814c(5);
        if (c == 7) {
            this.f9434b.mo8812b(2);
            c += this.f9434b.mo8814c(6);
        }
        if (c2 == 0) {
            if (c != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("serviceNumber is non-zero (");
                sb3.append(c);
                sb3.append(") when blockSize is 0");
                Log.w("Cea708Decoder", sb3.toString());
            }
        } else if (c == this.f9435c) {
            boolean z = false;
            while (this.f9434b.mo8807a() > 0) {
                int c3 = this.f9434b.mo8814c(8);
                if (c3 == 16) {
                    c3 = this.f9434b.mo8814c(8);
                    if (c3 <= 31) {
                        m13033c(c3);
                    } else if (c3 <= 127) {
                        m13037g(c3);
                    } else if (c3 <= 159) {
                        m13034d(c3);
                    } else if (c3 <= 255) {
                        m13038h(c3);
                    } else {
                        str = "Cea708Decoder";
                        sb = new StringBuilder();
                        str2 = "Invalid extended command: ";
                        sb.append(str2);
                        sb.append(c3);
                        Log.w(str, sb.toString());
                    }
                } else if (c3 <= 31) {
                    m13031a(c3);
                } else if (c3 <= 127) {
                    m13035e(c3);
                } else if (c3 <= 159) {
                    m13032b(c3);
                } else if (c3 <= 255) {
                    m13036f(c3);
                } else {
                    str = "Cea708Decoder";
                    sb = new StringBuilder();
                    str2 = "Invalid base command: ";
                    sb.append(str2);
                    sb.append(c3);
                    Log.w(str, sb.toString());
                }
                z = true;
            }
            if (z) {
                this.f9438f = m13046o();
            }
        }
    }

    /* renamed from: k */
    private void m13042k() {
        this.f9437e.mo9410a(this.f9434b.mo8814c(4), this.f9434b.mo8814c(2), this.f9434b.mo8814c(2), this.f9434b.mo8816d(), this.f9434b.mo8816d(), this.f9434b.mo8814c(3), this.f9434b.mo8814c(3));
    }

    /* renamed from: l */
    private void m13043l() {
        int a = C2747a.m13057a(this.f9434b.mo8814c(2), this.f9434b.mo8814c(2), this.f9434b.mo8814c(2), this.f9434b.mo8814c(2));
        int a2 = C2747a.m13057a(this.f9434b.mo8814c(2), this.f9434b.mo8814c(2), this.f9434b.mo8814c(2), this.f9434b.mo8814c(2));
        this.f9434b.mo8812b(2);
        this.f9437e.mo9409a(a, a2, C2747a.m13058b(this.f9434b.mo8814c(2), this.f9434b.mo8814c(2), this.f9434b.mo8814c(2)));
    }

    /* renamed from: m */
    private void m13044m() {
        this.f9434b.mo8812b(4);
        int c = this.f9434b.mo8814c(4);
        this.f9434b.mo8812b(2);
        this.f9437e.mo9408a(c, this.f9434b.mo8814c(6));
    }

    /* renamed from: n */
    private void m13045n() {
        int a = C2747a.m13057a(this.f9434b.mo8814c(2), this.f9434b.mo8814c(2), this.f9434b.mo8814c(2), this.f9434b.mo8814c(2));
        int c = this.f9434b.mo8814c(2);
        int b = C2747a.m13058b(this.f9434b.mo8814c(2), this.f9434b.mo8814c(2), this.f9434b.mo8814c(2));
        if (this.f9434b.mo8816d()) {
            c |= 4;
        }
        int i = c;
        boolean d = this.f9434b.mo8816d();
        int c2 = this.f9434b.mo8814c(2);
        int c3 = this.f9434b.mo8814c(2);
        int c4 = this.f9434b.mo8814c(2);
        this.f9434b.mo8812b(8);
        this.f9437e.mo9411a(a, b, d, i, c2, c3, c4);
    }

    /* renamed from: o */
    private List<C2741a> m13046o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f9436d[i].mo9414a() && this.f9436d[i].mo9418e()) {
                arrayList.add(this.f9436d[i].mo9421h());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p */
    private void m13047p() {
        for (int i = 0; i < 8; i++) {
            this.f9436d[i].mo9415b();
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo9383a(long j) {
        super.mo9383a(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9384a(C2794g gVar) {
        this.f9433a.mo8822a(gVar.f7788b.array(), gVar.f7788b.limit());
        while (this.f9433a.mo8824b() >= 3) {
            int g = this.f9433a.mo8834g() & 7;
            int i = g & 3;
            boolean z = false;
            boolean z2 = (g & 4) == 4;
            byte g2 = (byte) this.f9433a.mo8834g();
            byte g3 = (byte) this.f9433a.mo8834g();
            if ((i == 2 || i == 3) && z2) {
                if (i == 3) {
                    m13039i();
                    int i2 = (g2 & 192) >> 6;
                    byte b = g2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    this.f9440h = new C2748b(i2, b);
                    byte[] bArr = this.f9440h.f9477c;
                    C2748b bVar = this.f9440h;
                    int i3 = bVar.f9478d;
                    bVar.f9478d = i3 + 1;
                    bArr[i3] = g3;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    C2488a.m11666a(z);
                    if (this.f9440h == null) {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = this.f9440h.f9477c;
                        C2748b bVar2 = this.f9440h;
                        int i4 = bVar2.f9478d;
                        bVar2.f9478d = i4 + 1;
                        bArr2[i4] = g2;
                        byte[] bArr3 = this.f9440h.f9477c;
                        C2748b bVar3 = this.f9440h;
                        int i5 = bVar3.f9478d;
                        bVar3.f9478d = i5 + 1;
                        bArr3[i5] = g3;
                    }
                }
                if (this.f9440h.f9478d == (this.f9440h.f9476b * 2) - 1) {
                    m13039i();
                }
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
        this.f9438f = null;
        this.f9439g = null;
        this.f9441i = 0;
        this.f9437e = this.f9436d[this.f9441i];
        m13047p();
        this.f9440h = null;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo8655d() {
        super.mo8655d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo9386e() {
        return this.f9438f != this.f9439g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C2768d mo9387f() {
        this.f9439g = this.f9438f;
        return new C2751f(this.f9438f);
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
