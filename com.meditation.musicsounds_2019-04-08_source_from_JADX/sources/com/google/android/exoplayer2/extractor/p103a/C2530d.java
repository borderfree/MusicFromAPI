package com.google.android.exoplayer2.extractor.p103a;

import android.util.SparseArray;
import com.google.android.exoplayer2.C2468b;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.C2524a;
import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.extractor.C2656l;
import com.google.android.exoplayer2.extractor.C2657m;
import com.google.android.exoplayer2.extractor.C2657m.C2658a;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.p102c.C2493f;
import com.google.android.exoplayer2.p102c.C2496i;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.extractor.a.d */
public final class C2530d implements C2639f {

    /* renamed from: a */
    public static final C2652i f8164a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2530d()};
        }
    };

    /* renamed from: b */
    private static final byte[] f8165b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c */
    private static final byte[] f8166c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final UUID f8167d = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private long f8168A;

    /* renamed from: B */
    private boolean f8169B;

    /* renamed from: C */
    private long f8170C;

    /* renamed from: D */
    private long f8171D;

    /* renamed from: E */
    private long f8172E;

    /* renamed from: F */
    private C2493f f8173F;

    /* renamed from: G */
    private C2493f f8174G;

    /* renamed from: H */
    private boolean f8175H;

    /* renamed from: I */
    private int f8176I;

    /* renamed from: J */
    private long f8177J;

    /* renamed from: K */
    private long f8178K;

    /* renamed from: L */
    private int f8179L;

    /* renamed from: M */
    private int f8180M;

    /* renamed from: N */
    private int[] f8181N;

    /* renamed from: O */
    private int f8182O;

    /* renamed from: P */
    private int f8183P;

    /* renamed from: Q */
    private int f8184Q;

    /* renamed from: R */
    private int f8185R;

    /* renamed from: S */
    private boolean f8186S;

    /* renamed from: T */
    private boolean f8187T;

    /* renamed from: U */
    private boolean f8188U;

    /* renamed from: V */
    private boolean f8189V;

    /* renamed from: W */
    private byte f8190W;

    /* renamed from: X */
    private int f8191X;

    /* renamed from: Y */
    private int f8192Y;

    /* renamed from: Z */
    private int f8193Z;

    /* renamed from: aa */
    private boolean f8194aa;

    /* renamed from: ab */
    private boolean f8195ab;

    /* renamed from: ac */
    private C2651h f8196ac;

    /* renamed from: e */
    private final C2528b f8197e;

    /* renamed from: f */
    private final C2535f f8198f;

    /* renamed from: g */
    private final SparseArray<C2533b> f8199g;

    /* renamed from: h */
    private final boolean f8200h;

    /* renamed from: i */
    private final C2500k f8201i;

    /* renamed from: j */
    private final C2500k f8202j;

    /* renamed from: k */
    private final C2500k f8203k;

    /* renamed from: l */
    private final C2500k f8204l;

    /* renamed from: m */
    private final C2500k f8205m;

    /* renamed from: n */
    private final C2500k f8206n;

    /* renamed from: o */
    private final C2500k f8207o;

    /* renamed from: p */
    private final C2500k f8208p;

    /* renamed from: q */
    private final C2500k f8209q;

    /* renamed from: r */
    private ByteBuffer f8210r;

    /* renamed from: s */
    private long f8211s;

    /* renamed from: t */
    private long f8212t;

    /* renamed from: u */
    private long f8213u;

    /* renamed from: v */
    private long f8214v;

    /* renamed from: w */
    private long f8215w;

    /* renamed from: x */
    private C2533b f8216x;

    /* renamed from: y */
    private boolean f8217y;

    /* renamed from: z */
    private int f8218z;

    /* renamed from: com.google.android.exoplayer2.extractor.a.d$a */
    private final class C2532a implements C2529c {
        private C2532a() {
        }

        /* renamed from: a */
        public int mo8936a(int i) {
            return C2530d.this.mo8944a(i);
        }

        /* renamed from: a */
        public void mo8937a(int i, double d) {
            C2530d.this.mo8946a(i, d);
        }

        /* renamed from: a */
        public void mo8938a(int i, int i2, C2650g gVar) {
            C2530d.this.mo8947a(i, i2, gVar);
        }

        /* renamed from: a */
        public void mo8939a(int i, long j) {
            C2530d.this.mo8948a(i, j);
        }

        /* renamed from: a */
        public void mo8940a(int i, long j, long j2) {
            C2530d.this.mo8949a(i, j, j2);
        }

        /* renamed from: a */
        public void mo8941a(int i, String str) {
            C2530d.this.mo8950a(i, str);
        }

        /* renamed from: b */
        public boolean mo8942b(int i) {
            return C2530d.this.mo8954b(i);
        }

        /* renamed from: c */
        public void mo8943c(int i) {
            C2530d.this.mo8956c(i);
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.a.d$b */
    private static final class C2533b {

        /* renamed from: A */
        public float f8220A;

        /* renamed from: B */
        public float f8221B;

        /* renamed from: C */
        public float f8222C;

        /* renamed from: D */
        public float f8223D;

        /* renamed from: E */
        public float f8224E;

        /* renamed from: F */
        public float f8225F;

        /* renamed from: G */
        public int f8226G;

        /* renamed from: H */
        public int f8227H;

        /* renamed from: I */
        public int f8228I;

        /* renamed from: J */
        public long f8229J;

        /* renamed from: K */
        public long f8230K;

        /* renamed from: L */
        public boolean f8231L;

        /* renamed from: M */
        public boolean f8232M;

        /* renamed from: N */
        public C2659n f8233N;

        /* renamed from: O */
        public int f8234O;
        /* access modifiers changed from: private */

        /* renamed from: P */
        public String f8235P;

        /* renamed from: a */
        public String f8236a;

        /* renamed from: b */
        public int f8237b;

        /* renamed from: c */
        public int f8238c;

        /* renamed from: d */
        public int f8239d;

        /* renamed from: e */
        public boolean f8240e;

        /* renamed from: f */
        public byte[] f8241f;

        /* renamed from: g */
        public byte[] f8242g;

        /* renamed from: h */
        public byte[] f8243h;

        /* renamed from: i */
        public DrmInitData f8244i;

        /* renamed from: j */
        public int f8245j;

        /* renamed from: k */
        public int f8246k;

        /* renamed from: l */
        public int f8247l;

        /* renamed from: m */
        public int f8248m;

        /* renamed from: n */
        public int f8249n;

        /* renamed from: o */
        public byte[] f8250o;

        /* renamed from: p */
        public int f8251p;

        /* renamed from: q */
        public boolean f8252q;

        /* renamed from: r */
        public int f8253r;

        /* renamed from: s */
        public int f8254s;

        /* renamed from: t */
        public int f8255t;

        /* renamed from: u */
        public int f8256u;

        /* renamed from: v */
        public int f8257v;

        /* renamed from: w */
        public float f8258w;

        /* renamed from: x */
        public float f8259x;

        /* renamed from: y */
        public float f8260y;

        /* renamed from: z */
        public float f8261z;

        private C2533b() {
            this.f8245j = -1;
            this.f8246k = -1;
            this.f8247l = -1;
            this.f8248m = -1;
            this.f8249n = 0;
            this.f8250o = null;
            this.f8251p = -1;
            this.f8252q = false;
            this.f8253r = -1;
            this.f8254s = -1;
            this.f8255t = -1;
            this.f8256u = 1000;
            this.f8257v = 200;
            this.f8258w = -1.0f;
            this.f8259x = -1.0f;
            this.f8260y = -1.0f;
            this.f8261z = -1.0f;
            this.f8220A = -1.0f;
            this.f8221B = -1.0f;
            this.f8222C = -1.0f;
            this.f8223D = -1.0f;
            this.f8224E = -1.0f;
            this.f8225F = -1.0f;
            this.f8226G = 1;
            this.f8227H = -1;
            this.f8228I = 8000;
            this.f8229J = 0;
            this.f8230K = 0;
            this.f8232M = true;
            this.f8235P = "eng";
        }

        /* renamed from: a */
        private static List<byte[]> m11929a(C2500k kVar) {
            try {
                kVar.mo8829d(16);
                if (kVar.mo8840m() != 826496599) {
                    return null;
                }
                byte[] bArr = kVar.f8094a;
                for (int d = kVar.mo8828d() + 20; d < bArr.length - 4; d++) {
                    if (bArr[d] == 0 && bArr[d + 1] == 0 && bArr[d + 2] == 1 && bArr[d + 3] == 15) {
                        return Collections.singletonList(Arrays.copyOfRange(bArr, d, bArr.length));
                    }
                }
                throw new ParserException("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC VC1 codec private");
            }
        }

        /* renamed from: a */
        private static List<byte[]> m11930a(byte[] bArr) {
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while (bArr[i] == -1) {
                        i2 += 255;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + bArr[i];
                    int i5 = 0;
                    while (bArr[i3] == -1) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + bArr[i3];
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        throw new ParserException("Error parsing vorbis codec private");
                    }
                    throw new ParserException("Error parsing vorbis codec private");
                }
                throw new ParserException("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        /* renamed from: a */
        private byte[] m11931a() {
            if (this.f8258w == -1.0f || this.f8259x == -1.0f || this.f8260y == -1.0f || this.f8261z == -1.0f || this.f8220A == -1.0f || this.f8221B == -1.0f || this.f8222C == -1.0f || this.f8223D == -1.0f || this.f8224E == -1.0f || this.f8225F == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.put(0);
            wrap.putShort((short) ((int) ((this.f8258w * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f8259x * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f8260y * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f8261z * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f8220A * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f8221B * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f8222C * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f8223D * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) (this.f8224E + 0.5f)));
            wrap.putShort((short) ((int) (this.f8225F + 0.5f)));
            wrap.putShort((short) this.f8256u);
            wrap.putShort((short) this.f8257v);
            return bArr;
        }

        /* renamed from: b */
        private static boolean m11932b(C2500k kVar) {
            try {
                int i = kVar.mo8836i();
                boolean z = true;
                if (i == 1) {
                    return true;
                }
                if (i != 65534) {
                    return false;
                }
                kVar.mo8827c(24);
                if (!(kVar.mo8843p() == C2530d.f8167d.getMostSignificantBits() && kVar.mo8843p() == C2530d.f8167d.getLeastSignificantBits())) {
                    z = false;
                }
                return z;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e0, code lost:
            r3.append(r4);
            r3.append(r1);
            android.util.Log.w(r2, r3.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x020b, code lost:
            r12 = r1;
            r2 = null;
            r15 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0213, code lost:
            r2 = r0.f8243h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0219, code lost:
            r12 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x02b7, code lost:
            r0.f8234O = r2;
            r12 = r1;
            r2 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d1, code lost:
            r12 = r1;
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d3, code lost:
            r15 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d4, code lost:
            r18 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d6, code lost:
            r1 = r0.f8232M | false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x02db, code lost:
            if (r0.f8231L == false) goto L_0x02de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x02dd, code lost:
            r7 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x02de, code lost:
            r1 = r1 | r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e3, code lost:
            if (com.google.android.exoplayer2.p102c.C2495h.m11692a(r12) == false) goto L_0x0306;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x02e5, code lost:
            r1 = com.google.android.exoplayer2.Format.m11315a(java.lang.Integer.toString(r28), r12, (java.lang.String) null, -1, r15, r0.f8226G, r0.f8228I, r18, r2, r0.f8244i, r1 ? 1 : 0, r0.f8235P);
            r8 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x030a, code lost:
            if (com.google.android.exoplayer2.p102c.C2495h.m11693b(r12) == false) goto L_0x037f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x030e, code lost:
            if (r0.f8249n != 0) goto L_0x0326;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0312, code lost:
            if (r0.f8247l != -1) goto L_0x0317;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0314, code lost:
            r1 = r0.f8245j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0317, code lost:
            r1 = r0.f8247l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0319, code lost:
            r0.f8247l = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x031d, code lost:
            if (r0.f8248m != -1) goto L_0x0322;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x031f, code lost:
            r1 = r0.f8246k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0322, code lost:
            r1 = r0.f8248m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0324, code lost:
            r0.f8248m = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x032a, code lost:
            if (r0.f8247l == -1) goto L_0x0342;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x032e, code lost:
            if (r0.f8248m == -1) goto L_0x0342;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0330, code lost:
            r21 = ((float) (r0.f8246k * r0.f8247l)) / ((float) (r0.f8245j * r0.f8248m));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0342, code lost:
            r21 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0346, code lost:
            if (r0.f8252q == false) goto L_0x0357;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0348, code lost:
            r10 = new com.google.android.exoplayer2.video.ColorInfo(r0.f8253r, r0.f8255t, r0.f8254s, m11931a());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0357, code lost:
            r24 = r10;
            r1 = com.google.android.exoplayer2.Format.m11313a(java.lang.Integer.toString(r28), r12, (java.lang.String) null, -1, r15, r0.f8245j, r0.f8246k, -1.0f, r2, -1, r21, r0.f8250o, r0.f8251p, r24, r0.f8244i);
            r8 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0385, code lost:
            if ("application/x-subrip".equals(r12) == false) goto L_0x039b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0387, code lost:
            r1 = com.google.android.exoplayer2.Format.m11319a(java.lang.Integer.toString(r28), r12, (java.lang.String) null, -1, r1 ? 1 : 0, r0.f8235P, r0.f8244i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x03a1, code lost:
            if ("application/vobsub".equals(r12) != false) goto L_0x03bc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03a9, code lost:
            if ("application/pgs".equals(r12) != false) goto L_0x03bc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x03b1, code lost:
            if ("application/dvbsubs".equals(r12) == false) goto L_0x03b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x03bb, code lost:
            throw new com.google.android.exoplayer2.ParserException("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x03bc, code lost:
            r1 = com.google.android.exoplayer2.Format.m11321a(java.lang.Integer.toString(r28), r12, (java.lang.String) null, -1, r2, r0.f8235P, r0.f8244i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x03cf, code lost:
            r0.f8233N = r27.mo9116a(r0.f8237b, r8);
            r0.f8233N.mo9002a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x03de, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a0, code lost:
            r3.append("Unsupported PCM bit depth: ");
            r3.append(r0.f8227H);
            r4 = ". Setting mimeType to ";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ad, code lost:
            r12 = r1;
            r18 = r2;
            r2 = null;
            r15 = -1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8958a(com.google.android.exoplayer2.extractor.C2651h r27, int r28) {
            /*
                r26 = this;
                r0 = r26
                java.lang.String r1 = r0.f8236a
                int r2 = r1.hashCode()
                r3 = 4
                r4 = 8
                r5 = 1
                r6 = 2
                r7 = 0
                r8 = 3
                r9 = -1
                switch(r2) {
                    case -2095576542: goto L_0x014a;
                    case -2095575984: goto L_0x0140;
                    case -1985379776: goto L_0x0135;
                    case -1784763192: goto L_0x012a;
                    case -1730367663: goto L_0x011f;
                    case -1482641358: goto L_0x0114;
                    case -1482641357: goto L_0x0109;
                    case -1373388978: goto L_0x00fe;
                    case -933872740: goto L_0x00f3;
                    case -538363189: goto L_0x00e8;
                    case -538363109: goto L_0x00dd;
                    case -425012669: goto L_0x00d1;
                    case -356037306: goto L_0x00c5;
                    case 62923557: goto L_0x00b9;
                    case 62923603: goto L_0x00ad;
                    case 62927045: goto L_0x00a1;
                    case 82338133: goto L_0x0096;
                    case 82338134: goto L_0x008b;
                    case 99146302: goto L_0x007f;
                    case 444813526: goto L_0x0073;
                    case 542569478: goto L_0x0067;
                    case 725957860: goto L_0x005b;
                    case 855502857: goto L_0x0050;
                    case 1422270023: goto L_0x0044;
                    case 1809237540: goto L_0x0039;
                    case 1950749482: goto L_0x002d;
                    case 1950789798: goto L_0x0021;
                    case 1951062397: goto L_0x0015;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0154
            L_0x0015:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 11
                goto L_0x0155
            L_0x0021:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 21
                goto L_0x0155
            L_0x002d:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 16
                goto L_0x0155
            L_0x0039:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 2
                goto L_0x0155
            L_0x0044:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 24
                goto L_0x0155
            L_0x0050:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 7
                goto L_0x0155
            L_0x005b:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 23
                goto L_0x0155
            L_0x0067:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 19
                goto L_0x0155
            L_0x0073:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 9
                goto L_0x0155
            L_0x007f:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 26
                goto L_0x0155
            L_0x008b:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 1
                goto L_0x0155
            L_0x0096:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 0
                goto L_0x0155
            L_0x00a1:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 18
                goto L_0x0155
            L_0x00ad:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 15
                goto L_0x0155
            L_0x00b9:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 12
                goto L_0x0155
            L_0x00c5:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 20
                goto L_0x0155
            L_0x00d1:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 25
                goto L_0x0155
            L_0x00dd:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 6
                goto L_0x0155
            L_0x00e8:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 4
                goto L_0x0155
            L_0x00f3:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 27
                goto L_0x0155
            L_0x00fe:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 8
                goto L_0x0155
            L_0x0109:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 14
                goto L_0x0155
            L_0x0114:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 13
                goto L_0x0155
            L_0x011f:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 10
                goto L_0x0155
            L_0x012a:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 17
                goto L_0x0155
            L_0x0135:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 22
                goto L_0x0155
            L_0x0140:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 3
                goto L_0x0155
            L_0x014a:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0154
                r1 = 5
                goto L_0x0155
            L_0x0154:
                r1 = -1
            L_0x0155:
                r2 = 4096(0x1000, float:5.74E-42)
                r10 = 0
                switch(r1) {
                    case 0: goto L_0x02cf;
                    case 1: goto L_0x02cc;
                    case 2: goto L_0x02c9;
                    case 3: goto L_0x02bc;
                    case 4: goto L_0x02bc;
                    case 5: goto L_0x02bc;
                    case 6: goto L_0x02a6;
                    case 7: goto L_0x0294;
                    case 8: goto L_0x0275;
                    case 9: goto L_0x0272;
                    case 10: goto L_0x0262;
                    case 11: goto L_0x021c;
                    case 12: goto L_0x0211;
                    case 13: goto L_0x0209;
                    case 14: goto L_0x0206;
                    case 15: goto L_0x0202;
                    case 16: goto L_0x01fe;
                    case 17: goto L_0x01fa;
                    case 18: goto L_0x01f6;
                    case 19: goto L_0x01f6;
                    case 20: goto L_0x01f2;
                    case 21: goto L_0x01ef;
                    case 22: goto L_0x01b4;
                    case 23: goto L_0x018d;
                    case 24: goto L_0x0189;
                    case 25: goto L_0x0185;
                    case 26: goto L_0x0181;
                    case 27: goto L_0x0163;
                    default: goto L_0x015b;
                }
            L_0x015b:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>(r2)
                throw r1
            L_0x0163:
                java.lang.String r1 = "application/dvbsubs"
                byte[] r2 = new byte[r3]
                byte[] r3 = r0.f8243h
                byte r3 = r3[r7]
                r2[r7] = r3
                byte[] r3 = r0.f8243h
                byte r3 = r3[r5]
                r2[r5] = r3
                byte[] r3 = r0.f8243h
                byte r3 = r3[r6]
                r2[r6] = r3
                byte[] r3 = r0.f8243h
                byte r3 = r3[r8]
                r2[r8] = r3
                goto L_0x0215
            L_0x0181:
                java.lang.String r1 = "application/pgs"
                goto L_0x02d1
            L_0x0185:
                java.lang.String r1 = "application/vobsub"
                goto L_0x0213
            L_0x0189:
                java.lang.String r1 = "application/x-subrip"
                goto L_0x02d1
            L_0x018d:
                java.lang.String r1 = "audio/raw"
                int r2 = r0.f8227H
                int r2 = com.google.android.exoplayer2.p102c.C2511s.m11811b(r2)
                if (r2 != 0) goto L_0x01ad
                java.lang.String r1 = "audio/x-unknown"
                java.lang.String r2 = "MatroskaExtractor"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L_0x01a0:
                java.lang.String r4 = "Unsupported PCM bit depth: "
                r3.append(r4)
                int r4 = r0.f8227H
                r3.append(r4)
                java.lang.String r4 = ". Setting mimeType to "
                goto L_0x01e0
            L_0x01ad:
                r12 = r1
                r18 = r2
                r2 = r10
                r15 = -1
                goto L_0x02d6
            L_0x01b4:
                java.lang.String r1 = "audio/raw"
                com.google.android.exoplayer2.c.k r2 = new com.google.android.exoplayer2.c.k
                byte[] r3 = r0.f8243h
                r2.<init>(r3)
                boolean r2 = m11932b(r2)
                if (r2 == 0) goto L_0x01d5
                int r2 = r0.f8227H
                int r2 = com.google.android.exoplayer2.p102c.C2511s.m11811b(r2)
                if (r2 != 0) goto L_0x01ad
                java.lang.String r1 = "audio/x-unknown"
                java.lang.String r2 = "MatroskaExtractor"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                goto L_0x01a0
            L_0x01d5:
                java.lang.String r1 = "audio/x-unknown"
                java.lang.String r2 = "MatroskaExtractor"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            L_0x01e0:
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                android.util.Log.w(r2, r3)
                goto L_0x02d1
            L_0x01ef:
                java.lang.String r1 = "audio/x-flac"
                goto L_0x0213
            L_0x01f2:
                java.lang.String r1 = "audio/vnd.dts.hd"
                goto L_0x02d1
            L_0x01f6:
                java.lang.String r1 = "audio/vnd.dts"
                goto L_0x02d1
            L_0x01fa:
                java.lang.String r1 = "audio/true-hd"
                goto L_0x02d1
            L_0x01fe:
                java.lang.String r1 = "audio/eac3"
                goto L_0x02d1
            L_0x0202:
                java.lang.String r1 = "audio/ac3"
                goto L_0x02d1
            L_0x0206:
                java.lang.String r1 = "audio/mpeg"
                goto L_0x020b
            L_0x0209:
                java.lang.String r1 = "audio/mpeg-L2"
            L_0x020b:
                r12 = r1
                r2 = r10
                r15 = 4096(0x1000, float:5.74E-42)
                goto L_0x02d4
            L_0x0211:
                java.lang.String r1 = "audio/mp4a-latm"
            L_0x0213:
                byte[] r2 = r0.f8243h
            L_0x0215:
                java.util.List r2 = java.util.Collections.singletonList(r2)
            L_0x0219:
                r12 = r1
                goto L_0x02d3
            L_0x021c:
                java.lang.String r1 = "audio/opus"
                r2 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r8)
                byte[] r11 = r0.f8243h
                r3.add(r11)
                java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r4)
                java.nio.ByteOrder r12 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r11 = r11.order(r12)
                long r12 = r0.f8229J
                java.nio.ByteBuffer r11 = r11.putLong(r12)
                byte[] r11 = r11.array()
                r3.add(r11)
                java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
                java.nio.ByteOrder r11 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r4 = r4.order(r11)
                long r11 = r0.f8230K
                java.nio.ByteBuffer r4 = r4.putLong(r11)
                byte[] r4 = r4.array()
                r3.add(r4)
                r12 = r1
                r2 = r3
                r15 = 5760(0x1680, float:8.071E-42)
                goto L_0x02d4
            L_0x0262:
                java.lang.String r1 = "audio/vorbis"
                r2 = 8192(0x2000, float:1.14794E-41)
                byte[] r3 = r0.f8243h
                java.util.List r3 = m11930a(r3)
                r12 = r1
                r2 = r3
                r15 = 8192(0x2000, float:1.14794E-41)
                goto L_0x02d4
            L_0x0272:
                java.lang.String r1 = "video/x-unknown"
                goto L_0x02d1
            L_0x0275:
                com.google.android.exoplayer2.c.k r1 = new com.google.android.exoplayer2.c.k
                byte[] r2 = r0.f8243h
                r1.<init>(r2)
                java.util.List r1 = m11929a(r1)
                if (r1 == 0) goto L_0x028a
                java.lang.String r2 = "video/wvc1"
            L_0x0284:
                r12 = r2
                r15 = -1
                r18 = -1
                r2 = r1
                goto L_0x02d6
            L_0x028a:
                java.lang.String r2 = "MatroskaExtractor"
                java.lang.String r3 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
                android.util.Log.w(r2, r3)
                java.lang.String r2 = "video/x-unknown"
                goto L_0x0284
            L_0x0294:
                java.lang.String r1 = "video/hevc"
                com.google.android.exoplayer2.c.k r2 = new com.google.android.exoplayer2.c.k
                byte[] r3 = r0.f8243h
                r2.<init>(r3)
                com.google.android.exoplayer2.video.b r2 = com.google.android.exoplayer2.video.C2822b.m13426a(r2)
                java.util.List<byte[]> r3 = r2.f9786a
                int r2 = r2.f9787b
                goto L_0x02b7
            L_0x02a6:
                java.lang.String r1 = "video/avc"
                com.google.android.exoplayer2.c.k r2 = new com.google.android.exoplayer2.c.k
                byte[] r3 = r0.f8243h
                r2.<init>(r3)
                com.google.android.exoplayer2.video.a r2 = com.google.android.exoplayer2.video.C2821a.m13424a(r2)
                java.util.List<byte[]> r3 = r2.f9781a
                int r2 = r2.f9782b
            L_0x02b7:
                r0.f8234O = r2
                r12 = r1
                r2 = r3
                goto L_0x02d3
            L_0x02bc:
                java.lang.String r1 = "video/mp4v-es"
                byte[] r2 = r0.f8243h
                if (r2 != 0) goto L_0x02c5
                r2 = r10
                goto L_0x0219
            L_0x02c5:
                byte[] r2 = r0.f8243h
                goto L_0x0215
            L_0x02c9:
                java.lang.String r1 = "video/mpeg2"
                goto L_0x02d1
            L_0x02cc:
                java.lang.String r1 = "video/x-vnd.on2.vp9"
                goto L_0x02d1
            L_0x02cf:
                java.lang.String r1 = "video/x-vnd.on2.vp8"
            L_0x02d1:
                r12 = r1
                r2 = r10
            L_0x02d3:
                r15 = -1
            L_0x02d4:
                r18 = -1
            L_0x02d6:
                boolean r1 = r0.f8232M
                r1 = r1 | r7
                boolean r3 = r0.f8231L
                if (r3 == 0) goto L_0x02de
                r7 = 2
            L_0x02de:
                r1 = r1 | r7
                boolean r3 = com.google.android.exoplayer2.p102c.C2495h.m11692a(r12)
                if (r3 == 0) goto L_0x0306
                java.lang.String r11 = java.lang.Integer.toString(r28)
                r13 = 0
                r14 = -1
                int r3 = r0.f8226G
                int r4 = r0.f8228I
                com.google.android.exoplayer2.drm.DrmInitData r6 = r0.f8244i
                java.lang.String r7 = r0.f8235P
                r16 = r3
                r17 = r4
                r19 = r2
                r20 = r6
                r21 = r1
                r22 = r7
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m11315a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r8 = 1
                goto L_0x03cf
            L_0x0306:
                boolean r3 = com.google.android.exoplayer2.p102c.C2495h.m11693b(r12)
                if (r3 == 0) goto L_0x037f
                int r1 = r0.f8249n
                if (r1 != 0) goto L_0x0326
                int r1 = r0.f8247l
                if (r1 != r9) goto L_0x0317
                int r1 = r0.f8245j
                goto L_0x0319
            L_0x0317:
                int r1 = r0.f8247l
            L_0x0319:
                r0.f8247l = r1
                int r1 = r0.f8248m
                if (r1 != r9) goto L_0x0322
                int r1 = r0.f8246k
                goto L_0x0324
            L_0x0322:
                int r1 = r0.f8248m
            L_0x0324:
                r0.f8248m = r1
            L_0x0326:
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = r0.f8247l
                if (r3 == r9) goto L_0x0342
                int r3 = r0.f8248m
                if (r3 == r9) goto L_0x0342
                int r1 = r0.f8246k
                int r3 = r0.f8247l
                int r1 = r1 * r3
                float r1 = (float) r1
                int r3 = r0.f8245j
                int r4 = r0.f8248m
                int r3 = r3 * r4
                float r3 = (float) r3
                float r1 = r1 / r3
                r21 = r1
                goto L_0x0344
            L_0x0342:
                r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x0344:
                boolean r1 = r0.f8252q
                if (r1 == 0) goto L_0x0357
                byte[] r1 = r26.m11931a()
                com.google.android.exoplayer2.video.ColorInfo r10 = new com.google.android.exoplayer2.video.ColorInfo
                int r3 = r0.f8253r
                int r4 = r0.f8255t
                int r5 = r0.f8254s
                r10.<init>(r3, r4, r5, r1)
            L_0x0357:
                r24 = r10
                java.lang.String r11 = java.lang.Integer.toString(r28)
                r13 = 0
                r14 = -1
                int r1 = r0.f8245j
                int r3 = r0.f8246k
                r18 = -1082130432(0xffffffffbf800000, float:-1.0)
                r20 = -1
                byte[] r4 = r0.f8250o
                int r5 = r0.f8251p
                com.google.android.exoplayer2.drm.DrmInitData r7 = r0.f8244i
                r16 = r1
                r17 = r3
                r19 = r2
                r22 = r4
                r23 = r5
                r25 = r7
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m11313a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                r8 = 2
                goto L_0x03cf
            L_0x037f:
                java.lang.String r3 = "application/x-subrip"
                boolean r3 = r3.equals(r12)
                if (r3 == 0) goto L_0x039b
                java.lang.String r11 = java.lang.Integer.toString(r28)
                r13 = 0
                r14 = -1
                java.lang.String r2 = r0.f8235P
                com.google.android.exoplayer2.drm.DrmInitData r3 = r0.f8244i
                r15 = r1
                r16 = r2
                r17 = r3
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m11319a(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x03cf
            L_0x039b:
                java.lang.String r1 = "application/vobsub"
                boolean r1 = r1.equals(r12)
                if (r1 != 0) goto L_0x03bc
                java.lang.String r1 = "application/pgs"
                boolean r1 = r1.equals(r12)
                if (r1 != 0) goto L_0x03bc
                java.lang.String r1 = "application/dvbsubs"
                boolean r1 = r1.equals(r12)
                if (r1 == 0) goto L_0x03b4
                goto L_0x03bc
            L_0x03b4:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>(r2)
                throw r1
            L_0x03bc:
                java.lang.String r11 = java.lang.Integer.toString(r28)
                r13 = 0
                r14 = -1
                java.lang.String r1 = r0.f8235P
                com.google.android.exoplayer2.drm.DrmInitData r3 = r0.f8244i
                r15 = r2
                r16 = r1
                r17 = r3
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m11321a(r11, r12, r13, r14, r15, r16, r17)
            L_0x03cf:
                int r2 = r0.f8237b
                r3 = r27
                com.google.android.exoplayer2.extractor.n r2 = r3.mo9116a(r2, r8)
                r0.f8233N = r2
                com.google.android.exoplayer2.extractor.n r2 = r0.f8233N
                r2.mo9002a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p103a.C2530d.C2533b.mo8958a(com.google.android.exoplayer2.extractor.h, int):void");
        }
    }

    public C2530d() {
        this(0);
    }

    public C2530d(int i) {
        this(new C2525a(), i);
    }

    C2530d(C2528b bVar, int i) {
        this.f8212t = -1;
        this.f8213u = -9223372036854775807L;
        this.f8214v = -9223372036854775807L;
        this.f8215w = -9223372036854775807L;
        this.f8170C = -1;
        this.f8171D = -1;
        this.f8172E = -9223372036854775807L;
        this.f8197e = bVar;
        this.f8197e.mo8934a((C2529c) new C2532a());
        boolean z = true;
        if ((i & 1) != 0) {
            z = false;
        }
        this.f8200h = z;
        this.f8198f = new C2535f();
        this.f8199g = new SparseArray<>();
        this.f8203k = new C2500k(4);
        this.f8204l = new C2500k(ByteBuffer.allocate(4).putInt(-1).array());
        this.f8205m = new C2500k(4);
        this.f8201i = new C2500k(C2496i.f8073a);
        this.f8202j = new C2500k(4);
        this.f8206n = new C2500k();
        this.f8207o = new C2500k();
        this.f8208p = new C2500k(8);
        this.f8209q = new C2500k();
    }

    /* renamed from: a */
    private int m11892a(C2650g gVar, C2659n nVar, int i) {
        int i2;
        int b = this.f8206n.mo8824b();
        if (b > 0) {
            i2 = Math.min(i, b);
            nVar.mo9003a(this.f8206n, i2);
        } else {
            i2 = nVar.mo8999a(gVar, i, false);
        }
        this.f8185R += i2;
        this.f8193Z += i2;
        return i2;
    }

    /* renamed from: a */
    private long m11893a(long j) {
        if (this.f8213u != -9223372036854775807L) {
            return C2511s.m11814b(j, this.f8213u, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    private void m11895a(C2533b bVar) {
        m11900a(this.f8207o.f8094a, this.f8178K);
        bVar.f8233N.mo9003a(this.f8207o, this.f8207o.mo8826c());
        this.f8193Z += this.f8207o.mo8826c();
    }

    /* renamed from: a */
    private void m11896a(C2533b bVar, long j) {
        if ("S_TEXT/UTF8".equals(bVar.f8236a)) {
            m11895a(bVar);
        }
        bVar.f8233N.mo9001a(j, this.f8184Q, this.f8193Z, 0, bVar.f8242g);
        this.f8194aa = true;
        m11904b();
    }

    /* renamed from: a */
    private void m11897a(C2650g gVar, int i) {
        if (this.f8203k.mo8826c() < i) {
            if (this.f8203k.mo8830e() < i) {
                this.f8203k.mo8822a(Arrays.copyOf(this.f8203k.f8094a, Math.max(this.f8203k.f8094a.length * 2, i)), this.f8203k.mo8826c());
            }
            gVar.mo8970b(this.f8203k.f8094a, this.f8203k.mo8826c(), i - this.f8203k.mo8826c());
            this.f8203k.mo8825b(i);
        }
    }

    /* renamed from: a */
    private void m11898a(C2650g gVar, C2533b bVar, int i) {
        if ("S_TEXT/UTF8".equals(bVar.f8236a)) {
            int length = f8165b.length + i;
            if (this.f8207o.mo8830e() < length) {
                this.f8207o.f8094a = Arrays.copyOf(f8165b, length + i);
            }
            gVar.mo8970b(this.f8207o.f8094a, f8165b.length, i);
            this.f8207o.mo8827c(0);
            this.f8207o.mo8825b(length);
            return;
        }
        C2659n nVar = bVar.f8233N;
        if (!this.f8186S) {
            if (bVar.f8240e) {
                this.f8184Q &= -1073741825;
                int i2 = 128;
                if (!this.f8187T) {
                    gVar.mo8970b(this.f8203k.f8094a, 0, 1);
                    this.f8185R++;
                    if ((this.f8203k.f8094a[0] & 128) != 128) {
                        this.f8190W = this.f8203k.f8094a[0];
                        this.f8187T = true;
                    } else {
                        throw new ParserException("Extension bit is set in signal byte");
                    }
                }
                if ((this.f8190W & 1) == 1) {
                    boolean z = (this.f8190W & 2) == 2;
                    this.f8184Q |= 1073741824;
                    if (!this.f8188U) {
                        gVar.mo8970b(this.f8208p.f8094a, 0, 8);
                        this.f8185R += 8;
                        this.f8188U = true;
                        byte[] bArr = this.f8203k.f8094a;
                        if (!z) {
                            i2 = 0;
                        }
                        bArr[0] = (byte) (i2 | 8);
                        this.f8203k.mo8827c(0);
                        nVar.mo9003a(this.f8203k, 1);
                        this.f8193Z++;
                        this.f8208p.mo8827c(0);
                        nVar.mo9003a(this.f8208p, 8);
                        this.f8193Z += 8;
                    }
                    if (z) {
                        if (!this.f8189V) {
                            gVar.mo8970b(this.f8203k.f8094a, 0, 1);
                            this.f8185R++;
                            this.f8203k.mo8827c(0);
                            this.f8191X = this.f8203k.mo8834g();
                            this.f8189V = true;
                        }
                        int i3 = this.f8191X * 4;
                        this.f8203k.mo8820a(i3);
                        gVar.mo8970b(this.f8203k.f8094a, 0, i3);
                        this.f8185R += i3;
                        short s = (short) ((this.f8191X / 2) + 1);
                        int i4 = (s * 6) + 2;
                        if (this.f8210r == null || this.f8210r.capacity() < i4) {
                            this.f8210r = ByteBuffer.allocate(i4);
                        }
                        this.f8210r.position(0);
                        this.f8210r.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.f8191X) {
                            int t = this.f8203k.mo8847t();
                            if (i5 % 2 == 0) {
                                this.f8210r.putShort((short) (t - i6));
                            } else {
                                this.f8210r.putInt(t - i6);
                            }
                            i5++;
                            i6 = t;
                        }
                        int i7 = (i - this.f8185R) - i6;
                        if (this.f8191X % 2 == 1) {
                            this.f8210r.putInt(i7);
                        } else {
                            this.f8210r.putShort((short) i7);
                            this.f8210r.putInt(0);
                        }
                        this.f8209q.mo8822a(this.f8210r.array(), i4);
                        nVar.mo9003a(this.f8209q, i4);
                        this.f8193Z += i4;
                    }
                }
            } else if (bVar.f8241f != null) {
                this.f8206n.mo8822a(bVar.f8241f, bVar.f8241f.length);
            }
            this.f8186S = true;
        }
        int c = i + this.f8206n.mo8826c();
        if ("V_MPEG4/ISO/AVC".equals(bVar.f8236a) || "V_MPEGH/ISO/HEVC".equals(bVar.f8236a)) {
            byte[] bArr2 = this.f8202j.f8094a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i8 = bVar.f8234O;
            int i9 = 4 - bVar.f8234O;
            while (this.f8185R < c) {
                if (this.f8192Y == 0) {
                    m11899a(gVar, bArr2, i9, i8);
                    this.f8202j.mo8827c(0);
                    this.f8192Y = this.f8202j.mo8847t();
                    this.f8201i.mo8827c(0);
                    nVar.mo9003a(this.f8201i, 4);
                    this.f8193Z += 4;
                } else {
                    this.f8192Y -= m11892a(gVar, nVar, this.f8192Y);
                }
            }
        } else {
            while (this.f8185R < c) {
                m11892a(gVar, nVar, c - this.f8185R);
            }
        }
        if ("A_VORBIS".equals(bVar.f8236a)) {
            this.f8204l.mo8827c(0);
            nVar.mo9003a(this.f8204l, 4);
            this.f8193Z += 4;
        }
    }

    /* renamed from: a */
    private void m11899a(C2650g gVar, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f8206n.mo8824b());
        gVar.mo8970b(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f8206n.mo8823a(bArr, i, min);
        }
        this.f8185R += i2;
    }

    /* renamed from: a */
    private static void m11900a(byte[] bArr, long j) {
        byte[] bArr2;
        if (j == -9223372036854775807L) {
            bArr2 = f8166c;
        } else {
            int i = (int) (j / 3600000000L);
            long j2 = j - (((long) i) * 3600000000L);
            int i2 = (int) (j2 / 60000000);
            long j3 = j2 - ((long) (60000000 * i2));
            int i3 = (int) (j3 / 1000000);
            bArr2 = C2511s.m11817c(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j3 - ((long) (1000000 * i3))) / 1000))}));
        }
        System.arraycopy(bArr2, 0, bArr, 19, 12);
    }

    /* renamed from: a */
    private boolean m11901a(C2656l lVar, long j) {
        if (this.f8169B) {
            this.f8171D = j;
            lVar.f9025a = this.f8170C;
            this.f8169B = false;
            return true;
        } else if (!this.f8217y || this.f8171D == -1) {
            return false;
        } else {
            lVar.f9025a = this.f8171D;
            this.f8171D = -1;
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m11902a(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    /* renamed from: a */
    private static int[] m11903a(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: b */
    private void m11904b() {
        this.f8185R = 0;
        this.f8193Z = 0;
        this.f8192Y = 0;
        this.f8186S = false;
        this.f8187T = false;
        this.f8189V = false;
        this.f8191X = 0;
        this.f8190W = 0;
        this.f8188U = false;
        this.f8206n.mo8819a();
    }

    /* renamed from: d */
    private C2657m m11905d() {
        if (this.f8212t == -1 || this.f8215w == -9223372036854775807L || this.f8173F == null || this.f8173F.mo8803a() == 0 || this.f8174G == null || this.f8174G.mo8803a() != this.f8173F.mo8803a()) {
            this.f8173F = null;
            this.f8174G = null;
            return new C2658a(this.f8215w);
        }
        int a = this.f8173F.mo8803a();
        int[] iArr = new int[a];
        long[] jArr = new long[a];
        long[] jArr2 = new long[a];
        long[] jArr3 = new long[a];
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            jArr3[i2] = this.f8173F.mo8804a(i2);
            jArr[i2] = this.f8212t + this.f8174G.mo8804a(i2);
        }
        while (true) {
            int i3 = a - 1;
            if (i < i3) {
                int i4 = i + 1;
                iArr[i] = (int) (jArr[i4] - jArr[i]);
                jArr2[i] = jArr3[i4] - jArr3[i];
                i = i4;
            } else {
                iArr[i3] = (int) ((this.f8212t + this.f8211s) - jArr[i3]);
                jArr2[i3] = this.f8215w - jArr3[i3];
                this.f8173F = null;
                this.f8174G = null;
                return new C2524a(iArr, jArr, jArr2, jArr3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo8944a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public int mo8945a(C2650g gVar, C2656l lVar) {
        int i = 0;
        this.f8194aa = false;
        boolean z = true;
        while (z && !this.f8194aa) {
            z = this.f8197e.mo8935a(gVar);
            if (z && m11901a(lVar, gVar.mo8973c())) {
                return 1;
            }
        }
        if (!z) {
            i = -1;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8946a(int i, double d) {
        if (i == 181) {
            this.f8216x.f8228I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f8216x.f8258w = (float) d;
                    return;
                case 21970:
                    this.f8216x.f8259x = (float) d;
                    return;
                case 21971:
                    this.f8216x.f8260y = (float) d;
                    return;
                case 21972:
                    this.f8216x.f8261z = (float) d;
                    return;
                case 21973:
                    this.f8216x.f8220A = (float) d;
                    return;
                case 21974:
                    this.f8216x.f8221B = (float) d;
                    return;
                case 21975:
                    this.f8216x.f8222C = (float) d;
                    return;
                case 21976:
                    this.f8216x.f8223D = (float) d;
                    return;
                case 21977:
                    this.f8216x.f8224E = (float) d;
                    return;
                case 21978:
                    this.f8216x.f8225F = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.f8214v = (long) d;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8947a(int i, int i2, C2650g gVar) {
        byte b;
        byte[] bArr;
        int i3 = i;
        int i4 = i2;
        C2650g gVar2 = gVar;
        int i5 = 0;
        if (i3 == 161 || i3 == 163) {
            int i6 = 8;
            if (this.f8176I == 0) {
                this.f8182O = (int) this.f8198f.mo8960a(gVar2, false, true, 8);
                this.f8183P = this.f8198f.mo8962b();
                this.f8178K = -9223372036854775807L;
                this.f8176I = 1;
                this.f8203k.mo8819a();
            }
            C2533b bVar = (C2533b) this.f8199g.get(this.f8182O);
            if (bVar == null) {
                gVar2.mo8969b(i4 - this.f8183P);
                this.f8176I = 0;
                return;
            }
            if (this.f8176I == 1) {
                m11897a(gVar2, 3);
                int i7 = (this.f8203k.f8094a[2] & 6) >> 1;
                byte b2 = 255;
                if (i7 == 0) {
                    this.f8180M = 1;
                    this.f8181N = m11903a(this.f8181N, 1);
                    this.f8181N[0] = (i4 - this.f8183P) - 3;
                } else if (i3 == 163) {
                    m11897a(gVar2, 4);
                    this.f8180M = (this.f8203k.f8094a[3] & 255) + 1;
                    this.f8181N = m11903a(this.f8181N, this.f8180M);
                    if (i7 == 2) {
                        Arrays.fill(this.f8181N, 0, this.f8180M, ((i4 - this.f8183P) - 4) / this.f8180M);
                    } else if (i7 == 1) {
                        int i8 = 4;
                        int i9 = 0;
                        for (int i10 = 0; i10 < this.f8180M - 1; i10++) {
                            this.f8181N[i10] = 0;
                            do {
                                i8++;
                                m11897a(gVar2, i8);
                                b = this.f8203k.f8094a[i8 - 1] & 255;
                                int[] iArr = this.f8181N;
                                iArr[i10] = iArr[i10] + b;
                            } while (b == 255);
                            i9 += this.f8181N[i10];
                        }
                        this.f8181N[this.f8180M - 1] = ((i4 - this.f8183P) - i8) - i9;
                    } else if (i7 == 3) {
                        int i11 = 0;
                        int i12 = 4;
                        int i13 = 0;
                        while (i11 < this.f8180M - 1) {
                            this.f8181N[i11] = i5;
                            i12++;
                            m11897a(gVar2, i12);
                            int i14 = i12 - 1;
                            if (this.f8203k.f8094a[i14] != 0) {
                                long j = 0;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= i6) {
                                        break;
                                    }
                                    int i16 = 1 << (7 - i15);
                                    if ((this.f8203k.f8094a[i14] & i16) != 0) {
                                        i12 += i15;
                                        m11897a(gVar2, i12);
                                        int i17 = i14 + 1;
                                        j = (long) (this.f8203k.f8094a[i14] & b2 & (i16 ^ -1));
                                        while (i17 < i12) {
                                            i17++;
                                            j = ((long) (this.f8203k.f8094a[i17] & 255)) | (j << i6);
                                            i6 = 8;
                                        }
                                        if (i11 > 0) {
                                            j -= (1 << ((i15 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i15++;
                                        i6 = 8;
                                        b2 = 255;
                                    }
                                }
                                long j2 = j;
                                if (j2 < -2147483648L || j2 > 2147483647L) {
                                    throw new ParserException("EBML lacing sample size out of range.");
                                }
                                int i18 = (int) j2;
                                int[] iArr2 = this.f8181N;
                                if (i11 != 0) {
                                    i18 += this.f8181N[i11 - 1];
                                }
                                iArr2[i11] = i18;
                                i13 += this.f8181N[i11];
                                i11++;
                                i5 = 0;
                                i6 = 8;
                                b2 = 255;
                            } else {
                                throw new ParserException("No valid varint length mask found");
                            }
                        }
                        this.f8181N[this.f8180M - 1] = ((i4 - this.f8183P) - i12) - i13;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected lacing value: ");
                        sb.append(i7);
                        throw new ParserException(sb.toString());
                    }
                } else {
                    throw new ParserException("Lacing only supported in SimpleBlocks.");
                }
                this.f8177J = this.f8172E + m11893a((long) ((this.f8203k.f8094a[0] << 8) | (this.f8203k.f8094a[1] & 255)));
                this.f8184Q = ((bVar.f8238c == 2 || (i3 == 163 && (this.f8203k.f8094a[2] & 128) == 128)) ? 1 : 0) | ((this.f8203k.f8094a[2] & 8) == 8 ? Integer.MIN_VALUE : 0);
                this.f8176I = 2;
                this.f8179L = 0;
            }
            if (i3 == 163) {
                while (this.f8179L < this.f8180M) {
                    m11898a(gVar2, bVar, this.f8181N[this.f8179L]);
                    m11896a(bVar, this.f8177J + ((long) ((this.f8179L * bVar.f8239d) / 1000)));
                    this.f8179L++;
                }
                this.f8176I = 0;
            } else {
                m11898a(gVar2, bVar, this.f8181N[0]);
            }
        } else {
            if (i3 == 16981) {
                this.f8216x.f8241f = new byte[i4];
                bArr = this.f8216x.f8241f;
            } else if (i3 == 18402) {
                this.f8216x.f8242g = new byte[i4];
                bArr = this.f8216x.f8242g;
            } else if (i3 == 21419) {
                Arrays.fill(this.f8205m.f8094a, 0);
                gVar2.mo8970b(this.f8205m.f8094a, 4 - i4, i4);
                this.f8205m.mo8827c(0);
                this.f8218z = (int) this.f8205m.mo8839l();
            } else if (i3 == 25506) {
                this.f8216x.f8243h = new byte[i4];
                bArr = this.f8216x.f8243h;
            } else if (i3 == 30322) {
                this.f8216x.f8250o = new byte[i4];
                bArr = this.f8216x.f8250o;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected id: ");
                sb2.append(i3);
                throw new ParserException(sb2.toString());
            }
            gVar2.mo8970b(bArr, 0, i4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8948a(int i, long j) {
        boolean z = false;
        switch (i) {
            case 131:
                this.f8216x.f8238c = (int) j;
                return;
            case 136:
                C2533b bVar = this.f8216x;
                if (j == 1) {
                    z = true;
                }
                bVar.f8231L = z;
                return;
            case 155:
                this.f8178K = m11893a(j);
                return;
            case 159:
                this.f8216x.f8226G = (int) j;
                return;
            case 176:
                this.f8216x.f8245j = (int) j;
                return;
            case 179:
                this.f8173F.mo8805a(m11893a(j));
                return;
            case 186:
                this.f8216x.f8246k = (int) j;
                return;
            case 215:
                this.f8216x.f8237b = (int) j;
                return;
            case 231:
                this.f8172E = m11893a(j);
                return;
            case 241:
                if (!this.f8175H) {
                    this.f8174G.mo8805a(j);
                    this.f8175H = true;
                    return;
                }
                return;
            case 251:
                this.f8195ab = true;
                return;
            case 16980:
                if (j != 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ContentCompAlgo ");
                    sb.append(j);
                    sb.append(" not supported");
                    throw new ParserException(sb.toString());
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DocTypeReadVersion ");
                    sb2.append(j);
                    sb2.append(" not supported");
                    throw new ParserException(sb2.toString());
                }
                return;
            case 17143:
                if (j != 1) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("EBMLReadVersion ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new ParserException(sb3.toString());
                }
                return;
            case 18401:
                if (j != 5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("ContentEncAlgo ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new ParserException(sb4.toString());
                }
                return;
            case 18408:
                if (j != 1) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("AESSettingsCipherMode ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new ParserException(sb5.toString());
                }
                return;
            case 20529:
                if (j != 0) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("ContentEncodingOrder ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new ParserException(sb6.toString());
                }
                return;
            case 20530:
                if (j != 1) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("ContentEncodingScope ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new ParserException(sb7.toString());
                }
                return;
            case 21420:
                this.f8168A = j + this.f8212t;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 3) {
                    this.f8216x.f8251p = 1;
                    return;
                } else if (i2 != 15) {
                    switch (i2) {
                        case 0:
                            this.f8216x.f8251p = 0;
                            return;
                        case 1:
                            this.f8216x.f8251p = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.f8216x.f8251p = 3;
                    return;
                }
            case 21680:
                this.f8216x.f8247l = (int) j;
                return;
            case 21682:
                this.f8216x.f8249n = (int) j;
                return;
            case 21690:
                this.f8216x.f8248m = (int) j;
                return;
            case 21930:
                C2533b bVar2 = this.f8216x;
                if (j == 1) {
                    z = true;
                }
                bVar2.f8232M = z;
                return;
            case 21945:
                switch ((int) j) {
                    case 1:
                        this.f8216x.f8255t = 2;
                        return;
                    case 2:
                        this.f8216x.f8255t = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                int i3 = (int) j;
                if (i3 != 1) {
                    if (i3 == 16) {
                        this.f8216x.f8254s = 6;
                        return;
                    } else if (i3 != 18) {
                        switch (i3) {
                            case 6:
                            case 7:
                                break;
                            default:
                                return;
                        }
                    } else {
                        this.f8216x.f8254s = 7;
                        return;
                    }
                }
                this.f8216x.f8254s = 3;
                return;
            case 21947:
                this.f8216x.f8252q = true;
                int i4 = (int) j;
                if (i4 == 1) {
                    this.f8216x.f8253r = 1;
                    return;
                } else if (i4 != 9) {
                    switch (i4) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f8216x.f8253r = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.f8216x.f8253r = 6;
                    return;
                }
            case 21948:
                this.f8216x.f8256u = (int) j;
                return;
            case 21949:
                this.f8216x.f8257v = (int) j;
                return;
            case 22186:
                this.f8216x.f8229J = j;
                return;
            case 22203:
                this.f8216x.f8230K = j;
                return;
            case 25188:
                this.f8216x.f8227H = (int) j;
                return;
            case 2352003:
                this.f8216x.f8239d = (int) j;
                return;
            case 2807729:
                this.f8213u = j;
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8949a(int i, long j, long j2) {
        if (i == 160) {
            this.f8195ab = false;
        } else if (i == 174) {
            this.f8216x = new C2533b();
        } else if (i == 187) {
            this.f8175H = false;
        } else if (i == 19899) {
            this.f8218z = -1;
            this.f8168A = -1;
        } else if (i == 20533) {
            this.f8216x.f8240e = true;
        } else if (i == 21968) {
            this.f8216x.f8252q = true;
        } else if (i == 25152) {
        } else {
            if (i != 408125543) {
                if (i == 475249515) {
                    this.f8173F = new C2493f();
                    this.f8174G = new C2493f();
                } else if (i != 524531317 || this.f8217y) {
                } else {
                    if (!this.f8200h || this.f8170C == -1) {
                        this.f8196ac.mo9118a(new C2658a(this.f8215w));
                        this.f8217y = true;
                        return;
                    }
                    this.f8169B = true;
                }
            } else if (this.f8212t == -1 || this.f8212t == j) {
                this.f8212t = j;
                this.f8211s = j2;
            } else {
                throw new ParserException("Multiple Segment elements not supported");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8950a(int i, String str) {
        if (i == 134) {
            this.f8216x.f8236a = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                this.f8216x.f8235P = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new ParserException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        this.f8172E = -9223372036854775807L;
        this.f8176I = 0;
        this.f8197e.mo8933a();
        this.f8198f.mo8961a();
        m11904b();
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        this.f8196ac = hVar;
    }

    /* renamed from: a */
    public boolean mo8953a(C2650g gVar) {
        return new C2534e().mo8959a(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo8954b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: c */
    public void mo8955c() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8956c(int i) {
        if (i != 160) {
            if (i == 174) {
                if (m11902a(this.f8216x.f8236a)) {
                    this.f8216x.mo8958a(this.f8196ac, this.f8216x.f8237b);
                    this.f8199g.put(this.f8216x.f8237b, this.f8216x);
                }
                this.f8216x = null;
            } else if (i != 19899) {
                if (i != 25152) {
                    if (i != 28032) {
                        if (i == 357149030) {
                            if (this.f8213u == -9223372036854775807L) {
                                this.f8213u = 1000000;
                            }
                            if (this.f8214v != -9223372036854775807L) {
                                this.f8215w = m11893a(this.f8214v);
                            }
                        } else if (i != 374648427) {
                            if (i == 475249515 && !this.f8217y) {
                                this.f8196ac.mo9118a(m11905d());
                                this.f8217y = true;
                            }
                        } else if (this.f8199g.size() != 0) {
                            this.f8196ac.mo9117a();
                        } else {
                            throw new ParserException("No valid tracks were found");
                        }
                    } else if (this.f8216x.f8240e && this.f8216x.f8241f != null) {
                        throw new ParserException("Combining encryption and compression is not supported");
                    }
                } else if (this.f8216x.f8240e) {
                    if (this.f8216x.f8242g != null) {
                        this.f8216x.f8244i = new DrmInitData(new SchemeData(C2468b.f7982b, "video/webm", this.f8216x.f8242g));
                    } else {
                        throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                    }
                }
            } else if (this.f8218z == -1 || this.f8168A == -1) {
                throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            } else if (this.f8218z == 475249515) {
                this.f8170C = this.f8168A;
            }
        } else if (this.f8176I == 2) {
            if (!this.f8195ab) {
                this.f8184Q |= 1;
            }
            m11896a((C2533b) this.f8199g.get(this.f8182O), this.f8177J);
            this.f8176I = 0;
        }
    }
}
