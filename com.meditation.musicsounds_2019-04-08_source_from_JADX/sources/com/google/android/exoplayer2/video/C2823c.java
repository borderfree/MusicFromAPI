package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C2517a;
import com.google.android.exoplayer2.drm.C2519c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.mediacodec.C2678a;
import com.google.android.exoplayer2.mediacodec.C2679b;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.p100a.C2438e;
import com.google.android.exoplayer2.p102c.C2495h;
import com.google.android.exoplayer2.p102c.C2510r;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.video.C2829e.C2830a;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.video.c */
public class C2823c extends MediaCodecRenderer {

    /* renamed from: c */
    private static final int[] f9788c = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: A */
    private float f9789A;

    /* renamed from: B */
    private boolean f9790B;

    /* renamed from: C */
    private int f9791C;

    /* renamed from: b */
    C2826b f9792b;

    /* renamed from: d */
    private final C2827d f9793d;

    /* renamed from: e */
    private final C2830a f9794e;

    /* renamed from: f */
    private final long f9795f;

    /* renamed from: g */
    private final int f9796g;

    /* renamed from: h */
    private final boolean f9797h = m13432K();

    /* renamed from: i */
    private Format[] f9798i;

    /* renamed from: j */
    private C2825a f9799j;

    /* renamed from: k */
    private Surface f9800k;

    /* renamed from: l */
    private int f9801l = 1;

    /* renamed from: m */
    private boolean f9802m;

    /* renamed from: n */
    private long f9803n = -9223372036854775807L;

    /* renamed from: o */
    private long f9804o;

    /* renamed from: p */
    private int f9805p;

    /* renamed from: q */
    private int f9806q;

    /* renamed from: r */
    private int f9807r;

    /* renamed from: s */
    private float f9808s = -1.0f;

    /* renamed from: t */
    private int f9809t = -1;

    /* renamed from: u */
    private int f9810u = -1;

    /* renamed from: v */
    private int f9811v;

    /* renamed from: w */
    private float f9812w = -1.0f;

    /* renamed from: x */
    private int f9813x;

    /* renamed from: y */
    private int f9814y;

    /* renamed from: z */
    private int f9815z;

    /* renamed from: com.google.android.exoplayer2.video.c$a */
    protected static final class C2825a {

        /* renamed from: a */
        public final int f9816a;

        /* renamed from: b */
        public final int f9817b;

        /* renamed from: c */
        public final int f9818c;

        public C2825a(int i, int i2, int i3) {
            this.f9816a = i;
            this.f9817b = i2;
            this.f9818c = i3;
        }
    }

    @TargetApi(23)
    /* renamed from: com.google.android.exoplayer2.video.c$b */
    private final class C2826b implements OnFrameRenderedListener {
        private C2826b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            if (this == C2823c.this.f9792b) {
                C2823c.this.mo8747v();
            }
        }
    }

    public C2823c(Context context, C2679b bVar, long j, C2517a<C2519c> aVar, boolean z, Handler handler, C2829e eVar, int i) {
        super(2, bVar, aVar, z);
        this.f9795f = j;
        this.f9796g = i;
        this.f9793d = new C2827d(context);
        this.f9794e = new C2830a(handler, eVar);
        m13428G();
    }

    /* renamed from: F */
    private void m13427F() {
        if (this.f9802m) {
            this.f9794e.mo9580a(this.f9800k);
        }
    }

    /* renamed from: G */
    private void m13428G() {
        this.f9813x = -1;
        this.f9814y = -1;
        this.f9789A = -1.0f;
        this.f9815z = -1;
    }

    /* renamed from: H */
    private void m13429H() {
        if (this.f9813x != this.f9809t || this.f9814y != this.f9810u || this.f9815z != this.f9811v || this.f9789A != this.f9812w) {
            this.f9794e.mo9578a(this.f9809t, this.f9810u, this.f9811v, this.f9812w);
            this.f9813x = this.f9809t;
            this.f9814y = this.f9810u;
            this.f9815z = this.f9811v;
            this.f9789A = this.f9812w;
        }
    }

    /* renamed from: I */
    private void m13430I() {
        if (this.f9813x != -1 || this.f9814y != -1) {
            this.f9794e.mo9578a(this.f9809t, this.f9810u, this.f9811v, this.f9812w);
        }
    }

    /* renamed from: J */
    private void m13431J() {
        if (this.f9805p > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f9794e.mo9579a(this.f9805p, elapsedRealtime - this.f9804o);
            this.f9805p = 0;
            this.f9804o = elapsedRealtime;
        }
    }

    /* renamed from: K */
    private static boolean m13432K() {
        return C2511s.f8123a <= 22 && "foster".equals(C2511s.f8124b) && "NVIDIA".equals(C2511s.f8125c);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m13433a(java.lang.String r5, int r6, int r7) {
        /*
            r0 = -1
            if (r6 == r0) goto L_0x007b
            if (r7 != r0) goto L_0x0007
            goto L_0x007b
        L_0x0007:
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 4
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x0044;
                case -1662541442: goto L_0x003a;
                case 1187890754: goto L_0x0030;
                case 1331836730: goto L_0x0026;
                case 1599127256: goto L_0x001c;
                case 1599127257: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x004e
        L_0x0012:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 5
            goto L_0x004f
        L_0x001c:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 3
            goto L_0x004f
        L_0x0026:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 2
            goto L_0x004f
        L_0x0030:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x003a:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 4
            goto L_0x004f
        L_0x0044:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004e
            r5 = 0
            goto L_0x004f
        L_0x004e:
            r5 = -1
        L_0x004f:
            switch(r5) {
                case 0: goto L_0x0072;
                case 1: goto L_0x0072;
                case 2: goto L_0x0056;
                case 3: goto L_0x0072;
                case 4: goto L_0x0053;
                case 5: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            return r0
        L_0x0053:
            int r6 = r6 * r7
            goto L_0x0075
        L_0x0056:
            java.lang.String r5 = "BRAVIA 4K 2015"
            java.lang.String r1 = com.google.android.exoplayer2.p102c.C2511s.f8126d
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0061
            return r0
        L_0x0061:
            r5 = 16
            int r6 = com.google.android.exoplayer2.p102c.C2511s.m11797a(r6, r5)
            int r7 = com.google.android.exoplayer2.p102c.C2511s.m11797a(r7, r5)
            int r6 = r6 * r7
            int r6 = r6 * 16
            int r6 = r6 * 16
            goto L_0x0074
        L_0x0072:
            int r6 = r6 * r7
        L_0x0074:
            r3 = 2
        L_0x0075:
            int r6 = r6 * 3
            int r3 = r3 * 2
            int r6 = r6 / r3
            return r6
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.C2823c.m13433a(java.lang.String, int, int):int");
    }

    /* renamed from: a */
    private static Point m13434a(C2678a aVar, Format format) {
        int[] iArr;
        boolean z = format.f7743k > format.f7742j;
        int i = z ? format.f7743k : format.f7742j;
        int i2 = z ? format.f7742j : format.f7743k;
        float f = ((float) i2) / ((float) i);
        for (int i3 : f9788c) {
            int i4 = (int) (((float) i3) * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (C2511s.f8123a >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point a = aVar.mo9173a(i5, i3);
                if (aVar.mo9175a(a.x, a.y, (double) format.f7744l)) {
                    return a;
                }
            } else {
                int a2 = C2511s.m11797a(i3, 16) * 16;
                int a3 = C2511s.m11797a(i4, 16) * 16;
                if (a2 * a3 <= MediaCodecUtil.m12697b()) {
                    int i6 = z ? a3 : a2;
                    if (z) {
                        a3 = a2;
                    }
                    return new Point(i6, a3);
                }
            }
        }
        return null;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private static MediaFormat m13435a(Format format, C2825a aVar, boolean z, int i) {
        MediaFormat b = format.mo8602b();
        b.setInteger("max-width", aVar.f9816a);
        b.setInteger("max-height", aVar.f9817b);
        if (aVar.f9818c != -1) {
            b.setInteger("max-input-size", aVar.f9818c);
        }
        if (z) {
            b.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m13439a(b, i);
        }
        return b;
    }

    /* renamed from: a */
    private void m13436a(MediaCodec mediaCodec, int i) {
        C2510r.m11793a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C2510r.m11792a();
        this.f9132a.f7784e++;
    }

    @TargetApi(21)
    /* renamed from: a */
    private void m13437a(MediaCodec mediaCodec, int i, long j) {
        m13429H();
        C2510r.m11793a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        C2510r.m11792a();
        this.f9132a.f7783d++;
        this.f9806q = 0;
        mo8747v();
    }

    @TargetApi(23)
    /* renamed from: a */
    private static void m13438a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m13439a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: a */
    private void m13440a(Surface surface) {
        if (this.f9800k != surface) {
            this.f9800k = surface;
            int d = mo8625d();
            if (d == 1 || d == 2) {
                MediaCodec B = mo9159B();
                if (C2511s.f8123a < 23 || B == null || surface == null) {
                    mo9160C();
                    mo9166z();
                } else {
                    m13438a(B, surface);
                }
            }
            if (surface != null) {
                m13430I();
                m13449x();
                if (d == 2) {
                    m13448w();
                    return;
                }
                return;
            }
            m13428G();
            m13449x();
        } else if (surface != null) {
            m13430I();
            m13427F();
        }
    }

    /* renamed from: a */
    private static boolean m13441a(boolean z, Format format, Format format2) {
        return format.f7738f.equals(format2.f7738f) && m13447e(format) == m13447e(format2) && (z || (format.f7742j == format2.f7742j && format.f7743k == format2.f7743k));
    }

    /* renamed from: b */
    private void m13442b(MediaCodec mediaCodec, int i) {
        C2510r.m11793a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C2510r.m11792a();
        this.f9132a.f7785f++;
        this.f9805p++;
        this.f9806q++;
        this.f9132a.f7786g = Math.max(this.f9806q, this.f9132a.f7786g);
        if (this.f9805p == this.f9796g) {
            m13431J();
        }
    }

    /* renamed from: c */
    private static int m13443c(Format format) {
        return format.f7739g != -1 ? format.f7739g : m13433a(format.f7738f, format.f7742j, format.f7743k);
    }

    /* renamed from: c */
    private void m13444c(MediaCodec mediaCodec, int i) {
        m13429H();
        C2510r.m11793a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C2510r.m11792a();
        this.f9132a.f7783d++;
        this.f9806q = 0;
        mo8747v();
    }

    /* renamed from: d */
    private static float m13445d(Format format) {
        if (format.f7746n == -1.0f) {
            return 1.0f;
        }
        return format.f7746n;
    }

    /* renamed from: d */
    private static void m13446d(MediaCodec mediaCodec, int i) {
        mediaCodec.setVideoScalingMode(i);
    }

    /* renamed from: e */
    private static int m13447e(Format format) {
        if (format.f7745m == -1) {
            return 0;
        }
        return format.f7745m;
    }

    /* renamed from: w */
    private void m13448w() {
        this.f9803n = this.f9795f > 0 ? SystemClock.elapsedRealtime() + this.f9795f : -9223372036854775807L;
    }

    /* renamed from: x */
    private void m13449x() {
        this.f9802m = false;
        if (C2511s.f8123a >= 23 && this.f9790B) {
            MediaCodec B = mo9159B();
            if (B != null) {
                this.f9792b = new C2826b(B);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo9158A() {
        return super.mo9158A() && this.f9800k != null && this.f9800k.isValid();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo8734a(C2679b bVar, Format format) {
        boolean z;
        String str = format.f7738f;
        int i = 0;
        if (!C2495h.m11693b(str)) {
            return 0;
        }
        DrmInitData drmInitData = format.f7741i;
        if (drmInitData != null) {
            z = false;
            for (int i2 = 0; i2 < drmInitData.f8137a; i2++) {
                z |= drmInitData.mo8891a(i2).f8142c;
            }
        } else {
            z = false;
        }
        C2678a a = bVar.mo9180a(str, z);
        if (a == null) {
            return 1;
        }
        boolean b = a.mo9178b(format.f7735c);
        if (b && format.f7742j > 0 && format.f7743k > 0) {
            if (C2511s.f8123a >= 21) {
                b = a.mo9175a(format.f7742j, format.f7743k, (double) format.f7744l);
            } else {
                b = format.f7742j * format.f7743k <= MediaCodecUtil.m12697b();
                if (!b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(format.f7742j);
                    sb.append("x");
                    sb.append(format.f7743k);
                    sb.append("] [");
                    sb.append(C2511s.f8127e);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        int i3 = a.f9169b ? 8 : 4;
        if (a.f9170c) {
            i = 16;
        }
        return (b ? 3 : 2) | i3 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2825a mo9567a(C2678a aVar, Format format, Format[] formatArr) {
        int i = format.f7742j;
        int i2 = format.f7743k;
        int c = m13443c(format);
        if (formatArr.length == 1) {
            return new C2825a(i, i2, c);
        }
        int i3 = i2;
        int i4 = c;
        boolean z = false;
        int i5 = i;
        for (Format format2 : formatArr) {
            if (m13441a(aVar.f9169b, format, format2)) {
                z |= format2.f7742j == -1 || format2.f7743k == -1;
                i5 = Math.max(i5, format2.f7742j);
                i3 = Math.max(i3, format2.f7743k);
                i4 = Math.max(i4, m13443c(format2));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(i5);
            sb.append("x");
            sb.append(i3);
            Log.w("MediaCodecVideoRenderer", sb.toString());
            Point a = m13434a(aVar, format);
            if (a != null) {
                i5 = Math.max(i5, a.x);
                i3 = Math.max(i3, a.y);
                i4 = Math.max(i4, m13433a(format.f7738f, i5, i3));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(i5);
                sb2.append("x");
                sb2.append(i3);
                Log.w("MediaCodecVideoRenderer", sb2.toString());
            }
        }
        return new C2825a(i5, i3, i4);
    }

    /* renamed from: a */
    public void mo8615a(int i, Object obj) {
        if (i == 1) {
            m13440a((Surface) obj);
        } else if (i == 4) {
            this.f9801l = ((Integer) obj).intValue();
            MediaCodec B = mo9159B();
            if (B != null) {
                m13446d(B, this.f9801l);
            }
        } else {
            super.mo8615a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8617a(long j, boolean z) {
        super.mo8617a(j, z);
        m13449x();
        this.f9806q = 0;
        if (z) {
            m13448w();
        } else {
            this.f9803n = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8738a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.f9809t = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.f9810u = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f9812w = this.f9808s;
        if (C2511s.f8123a < 21) {
            this.f9811v = this.f9807r;
        } else if (this.f9807r == 90 || this.f9807r == 270) {
            int i = this.f9809t;
            this.f9809t = this.f9810u;
            this.f9810u = i;
            this.f9812w = 1.0f / this.f9812w;
        }
        m13446d(mediaCodec, this.f9801l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9163a(C2438e eVar) {
        if (C2511s.f8123a < 23 && this.f9790B) {
            mo8747v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8739a(C2678a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.f9799j = mo9567a(aVar, format, this.f9798i);
        mediaCodec.configure(m13435a(format, this.f9799j, this.f9797h, this.f9791C), this.f9800k, mediaCrypto, 0);
        if (C2511s.f8123a >= 23 && this.f9790B) {
            this.f9792b = new C2826b(mediaCodec);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8740a(String str, long j, long j2) {
        this.f9794e.mo9583a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8619a(boolean z) {
        super.mo8619a(z);
        this.f9791C = mo8638q().f9268b;
        this.f9790B = this.f9791C != 0;
        this.f9794e.mo9582a(this.f9132a);
        this.f9793d.mo9571a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8620a(Format[] formatArr) {
        this.f9798i = formatArr;
        super.mo8620a(formatArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8741a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        long j4 = j2;
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j5 = j3;
        if (z) {
            m13436a(mediaCodec2, i3);
            return true;
        } else if (!this.f9802m) {
            if (C2511s.f8123a >= 21) {
                m13437a(mediaCodec2, i3, System.nanoTime());
            } else {
                m13444c(mediaCodec2, i3);
            }
            return true;
        } else if (mo8625d() != 2) {
            return false;
        } else {
            long elapsedRealtime = (j5 - j) - ((SystemClock.elapsedRealtime() * 1000) - j4);
            long nanoTime = System.nanoTime();
            long a = this.f9793d.mo9570a(j5, nanoTime + (elapsedRealtime * 1000));
            long j6 = (a - nanoTime) / 1000;
            if (mo9568b(j6, j4)) {
                m13442b(mediaCodec2, i3);
                return true;
            }
            if (C2511s.f8123a >= 21) {
                if (j6 < 50000) {
                    m13437a(mediaCodec2, i3, a);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                m13444c(mediaCodec2, i3);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9164a(MediaCodec mediaCodec, boolean z, Format format, Format format2) {
        return m13441a(z, format, format2) && format2.f7742j <= this.f9799j.f9816a && format2.f7743k <= this.f9799j.f9817b && format2.f7739g <= this.f9799j.f9818c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8744b(Format format) {
        super.mo8744b(format);
        this.f9794e.mo9581a(format);
        this.f9808s = m13445d(format);
        this.f9807r = m13447e(format);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo9568b(long j, long j2) {
        return j < -30000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo8635n() {
        super.mo8635n();
        this.f9805p = 0;
        this.f9804o = SystemClock.elapsedRealtime();
        this.f9803n = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo8636o() {
        m13431J();
        super.mo8636o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo8637p() {
        this.f9809t = -1;
        this.f9810u = -1;
        this.f9812w = -1.0f;
        this.f9808s = -1.0f;
        m13428G();
        m13449x();
        this.f9793d.mo9572b();
        this.f9792b = null;
        try {
            super.mo8637p();
        } finally {
            this.f9132a.mo8656a();
            this.f9794e.mo9584b(this.f9132a);
        }
    }

    /* renamed from: t */
    public boolean mo8745t() {
        if ((this.f9802m || super.mo9158A()) && super.mo8745t()) {
            this.f9803n = -9223372036854775807L;
            return true;
        } else if (this.f9803n == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f9803n) {
                return true;
            }
            this.f9803n = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo8747v() {
        if (!this.f9802m) {
            this.f9802m = true;
            this.f9794e.mo9580a(this.f9800k);
        }
    }
}
