package com.google.android.exoplayer2.text.p113e;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.text.C2753b;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.e.a */
public final class C2777a extends C2753b {

    /* renamed from: a */
    private static final int f9594a = C2511s.m11819e("styl");

    /* renamed from: b */
    private static final int f9595b = C2511s.m11819e("tbox");

    /* renamed from: c */
    private final C2500k f9596c = new C2500k();

    /* renamed from: d */
    private boolean f9597d;

    /* renamed from: e */
    private int f9598e;

    /* renamed from: f */
    private int f9599f;

    /* renamed from: g */
    private String f9600g;

    /* renamed from: h */
    private float f9601h;

    /* renamed from: i */
    private int f9602i;

    public C2777a(List<byte[]> list) {
        super("Tx3gDecoder");
        m13208a(list);
    }

    /* renamed from: a */
    private static String m13204a(C2500k kVar) {
        String str;
        m13209a(kVar.mo8824b() >= 2);
        int h = kVar.mo8835h();
        if (h == 0) {
            return "";
        }
        if (kVar.mo8824b() >= 2) {
            char f = kVar.mo8832f();
            if (f == 65279 || f == 65534) {
                str = "UTF-16";
                return kVar.mo8818a(h, Charset.forName(str));
            }
        }
        str = "UTF-8";
        return kVar.mo8818a(h, Charset.forName(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13205a(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L_0x004f
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x000c
            r10 = 1
            goto L_0x000d
        L_0x000c:
            r10 = 0
        L_0x000d:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r10 == 0) goto L_0x0028
            if (r2 == 0) goto L_0x0022
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 3
            r3.<init>(r4)
        L_0x001e:
            r5.setSpan(r3, r8, r9, r7)
            goto L_0x0031
        L_0x0022:
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r1)
            goto L_0x001e
        L_0x0028:
            if (r2 == 0) goto L_0x0031
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
            goto L_0x001e
        L_0x0031:
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            if (r1 == 0) goto L_0x0041
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L_0x0041:
            if (r1 != 0) goto L_0x004f
            if (r10 != 0) goto L_0x004f
            if (r2 != 0) goto L_0x004f
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p113e.C2777a.m13205a(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    /* renamed from: a */
    private static void m13206a(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    /* renamed from: a */
    private void m13207a(C2500k kVar, SpannableStringBuilder spannableStringBuilder) {
        m13209a(kVar.mo8824b() >= 12);
        int h = kVar.mo8835h();
        int h2 = kVar.mo8835h();
        kVar.mo8829d(2);
        int g = kVar.mo8834g();
        kVar.mo8829d(1);
        int n = kVar.mo8841n();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i = h;
        int i2 = h2;
        m13205a(spannableStringBuilder2, g, this.f9598e, i, i2, 0);
        m13210b(spannableStringBuilder2, n, this.f9599f, i, i2, 0);
    }

    /* renamed from: a */
    private void m13208a(List<byte[]> list) {
        boolean z = false;
        if (list != null && list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f9598e = bArr[24];
            this.f9599f = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f9600g = "Serif".equals(new String(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            this.f9602i = bArr[25] * 20;
            if ((bArr[0] & 32) != 0) {
                z = true;
            }
            this.f9597d = z;
            if (this.f9597d) {
                this.f9601h = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.f9602i);
                this.f9601h = C2511s.m11796a(this.f9601h, 0.0f, 0.95f);
                return;
            }
        } else {
            this.f9598e = 0;
            this.f9599f = -1;
            this.f9600g = "sans-serif";
            this.f9597d = false;
        }
        this.f9601h = 0.85f;
    }

    /* renamed from: a */
    private static void m13209a(boolean z) {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    /* renamed from: b */
    private static void m13210b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7, types: [int] */
    /* JADX WARNING: type inference failed for: r4v8, types: [int] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v4
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], int, ?[boolean, int, float, short, byte, char]]
      uses: [boolean, ?[int, byte, short, char], int]
      mth insns count: 71
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.text.C2768d mo9429a(byte[] r10, int r11, boolean r12) {
        /*
            r9 = this;
            com.google.android.exoplayer2.c.k r12 = r9.f9596c
            r12.mo8822a(r10, r11)
            com.google.android.exoplayer2.c.k r10 = r9.f9596c
            java.lang.String r10 = m13204a(r10)
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0014
            com.google.android.exoplayer2.text.e.b r10 = com.google.android.exoplayer2.text.p113e.C2778b.f9603a
            return r10
        L_0x0014:
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r10)
            int r1 = r9.f9598e
            r2 = 0
            r3 = 0
            int r4 = r11.length()
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r11
            m13205a(r0, r1, r2, r3, r4, r5)
            int r1 = r9.f9599f
            r2 = -1
            int r4 = r11.length()
            m13210b(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r9.f9600g
            java.lang.String r2 = "sans-serif"
            int r4 = r11.length()
            m13206a(r0, r1, r2, r3, r4, r5)
            float r10 = r9.f9601h
            r3 = r10
        L_0x003f:
            com.google.android.exoplayer2.c.k r10 = r9.f9596c
            int r10 = r10.mo8824b()
            r12 = 8
            if (r10 < r12) goto L_0x00ad
            com.google.android.exoplayer2.c.k r10 = r9.f9596c
            int r10 = r10.mo8828d()
            com.google.android.exoplayer2.c.k r12 = r9.f9596c
            int r12 = r12.mo8841n()
            com.google.android.exoplayer2.c.k r0 = r9.f9596c
            int r0 = r0.mo8841n()
            int r1 = f9594a
            r2 = 2
            r4 = 0
            r5 = 1
            if (r0 != r1) goto L_0x007f
            com.google.android.exoplayer2.c.k r0 = r9.f9596c
            int r0 = r0.mo8824b()
            if (r0 < r2) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r5 = 0
        L_0x006c:
            m13209a(r5)
            com.google.android.exoplayer2.c.k r0 = r9.f9596c
            int r0 = r0.mo8835h()
        L_0x0075:
            if (r4 >= r0) goto L_0x00a6
            com.google.android.exoplayer2.c.k r1 = r9.f9596c
            r9.m13207a(r1, r11)
            int r4 = r4 + 1
            goto L_0x0075
        L_0x007f:
            int r1 = f9595b
            if (r0 != r1) goto L_0x00a6
            boolean r0 = r9.f9597d
            if (r0 == 0) goto L_0x00a6
            com.google.android.exoplayer2.c.k r0 = r9.f9596c
            int r0 = r0.mo8824b()
            if (r0 < r2) goto L_0x0090
            r4 = 1
        L_0x0090:
            m13209a(r4)
            com.google.android.exoplayer2.c.k r0 = r9.f9596c
            int r0 = r0.mo8835h()
            float r0 = (float) r0
            int r1 = r9.f9602i
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 0
            r2 = 1064514355(0x3f733333, float:0.95)
            float r3 = com.google.android.exoplayer2.p102c.C2511s.m11796a(r0, r1, r2)
        L_0x00a6:
            com.google.android.exoplayer2.c.k r0 = r9.f9596c
            int r10 = r10 + r12
            r0.mo8827c(r10)
            goto L_0x003f
        L_0x00ad:
            com.google.android.exoplayer2.text.e.b r10 = new com.google.android.exoplayer2.text.e.b
            com.google.android.exoplayer2.text.a r12 = new com.google.android.exoplayer2.text.a
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            r0 = r12
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.<init>(r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p113e.C2777a.mo9429a(byte[], int, boolean):com.google.android.exoplayer2.text.d");
    }
}
