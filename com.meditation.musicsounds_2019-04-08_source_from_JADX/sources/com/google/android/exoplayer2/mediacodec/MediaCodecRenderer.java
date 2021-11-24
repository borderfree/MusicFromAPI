package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.C2431a;
import com.google.android.exoplayer2.C2668i;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C2517a;
import com.google.android.exoplayer2.drm.C2519c;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;
import com.google.android.exoplayer2.p100a.C2437d;
import com.google.android.exoplayer2.p100a.C2438e;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2496i;
import com.google.android.exoplayer2.p102c.C2510r;
import com.google.android.exoplayer2.p102c.C2511s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public abstract class MediaCodecRenderer extends C2431a {

    /* renamed from: b */
    private static final byte[] f9118b = C2511s.m11820f("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private long f9119A;

    /* renamed from: B */
    private int f9120B;

    /* renamed from: C */
    private int f9121C;

    /* renamed from: D */
    private boolean f9122D;

    /* renamed from: E */
    private boolean f9123E;

    /* renamed from: F */
    private int f9124F;

    /* renamed from: G */
    private int f9125G;

    /* renamed from: H */
    private boolean f9126H;

    /* renamed from: I */
    private boolean f9127I;

    /* renamed from: J */
    private boolean f9128J;

    /* renamed from: K */
    private boolean f9129K;

    /* renamed from: L */
    private boolean f9130L;

    /* renamed from: M */
    private boolean f9131M;

    /* renamed from: a */
    protected C2437d f9132a;

    /* renamed from: c */
    private final C2679b f9133c;

    /* renamed from: d */
    private final C2517a<C2519c> f9134d;

    /* renamed from: e */
    private final boolean f9135e;

    /* renamed from: f */
    private final C2438e f9136f;

    /* renamed from: g */
    private final C2438e f9137g;

    /* renamed from: h */
    private final C2668i f9138h;

    /* renamed from: i */
    private final List<Long> f9139i;

    /* renamed from: j */
    private final BufferInfo f9140j;

    /* renamed from: k */
    private Format f9141k;

    /* renamed from: l */
    private MediaCodec f9142l;

    /* renamed from: m */
    private DrmSession<C2519c> f9143m;

    /* renamed from: n */
    private DrmSession<C2519c> f9144n;

    /* renamed from: o */
    private boolean f9145o;

    /* renamed from: p */
    private boolean f9146p;

    /* renamed from: q */
    private boolean f9147q;

    /* renamed from: r */
    private boolean f9148r;

    /* renamed from: s */
    private boolean f9149s;

    /* renamed from: t */
    private boolean f9150t;

    /* renamed from: u */
    private boolean f9151u;

    /* renamed from: v */
    private boolean f9152v;

    /* renamed from: w */
    private boolean f9153w;

    /* renamed from: x */
    private boolean f9154x;

    /* renamed from: y */
    private ByteBuffer[] f9155y;

    /* renamed from: z */
    private ByteBuffer[] f9156z;

    public static class DecoderInitializationException extends Exception {
        public final String decoderName;
        public final String diagnosticInfo;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th, boolean z, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoder init failed: [");
            sb.append(i);
            sb.append("], ");
            sb.append(format);
            super(sb.toString(), th);
            this.mimeType = format.f7738f;
            this.secureDecoderRequired = z;
            this.decoderName = null;
            this.diagnosticInfo = m12688a(i);
        }

        public DecoderInitializationException(Format format, Throwable th, boolean z, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoder init failed: ");
            sb.append(str);
            sb.append(", ");
            sb.append(format);
            super(sb.toString(), th);
            this.mimeType = format.f7738f;
            this.secureDecoderRequired = z;
            this.decoderName = str;
            this.diagnosticInfo = C2511s.f8123a >= 21 ? m12689a(th) : null;
        }

        /* renamed from: a */
        private static String m12688a(int i) {
            String str = i < 0 ? "neg_" : "";
            StringBuilder sb = new StringBuilder();
            sb.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
            sb.append(str);
            sb.append(Math.abs(i));
            return sb.toString();
        }

        @TargetApi(21)
        /* renamed from: a */
        private static String m12689a(Throwable th) {
            if (th instanceof CodecException) {
                return ((CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public MediaCodecRenderer(int i, C2679b bVar, C2517a<C2519c> aVar, boolean z) {
        super(i);
        C2488a.m11668b(C2511s.f8123a >= 16);
        this.f9133c = (C2679b) C2488a.m11664a(bVar);
        this.f9134d = aVar;
        this.f9135e = z;
        this.f9136f = new C2438e(0);
        this.f9137g = C2438e.m11385e();
        this.f9138h = new C2668i();
        this.f9139i = new ArrayList();
        this.f9140j = new BufferInfo();
        this.f9124F = 0;
        this.f9125G = 0;
    }

    /* renamed from: F */
    private void m12645F() {
        if (this.f9125G == 2) {
            mo9160C();
            mo9166z();
            return;
        }
        this.f9129K = true;
        mo8750y();
    }

    /* renamed from: a */
    private static CryptoInfo m12646a(C2438e eVar, int i) {
        CryptoInfo a = eVar.f7787a.mo8649a();
        if (i == 0) {
            return a;
        }
        if (a.numBytesOfClearData == null) {
            a.numBytesOfClearData = new int[1];
        }
        int[] iArr = a.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return a;
    }

    /* renamed from: a */
    private void m12647a(DecoderInitializationException decoderInitializationException) {
        throw ExoPlaybackException.createForRenderer(decoderInitializationException, mo8639r());
    }

    /* renamed from: a */
    private static boolean mo8742a(String str) {
        return C2511s.f8123a < 18 || (C2511s.f8123a == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (C2511s.f8123a == 19 && C2511s.f8126d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: a */
    private static boolean m12649a(String str, Format format) {
        return C2511s.f8123a < 21 && format.f7740h.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: b */
    private boolean mo9568b(long j, long j2) {
        boolean z;
        if (this.f9121C < 0) {
            if (!this.f9151u || !this.f9127I) {
                this.f9121C = this.f9142l.dequeueOutputBuffer(this.f9140j, mo9162E());
            } else {
                try {
                    this.f9121C = this.f9142l.dequeueOutputBuffer(this.f9140j, mo9162E());
                } catch (IllegalStateException unused) {
                    m12645F();
                    if (this.f9129K) {
                        mo9160C();
                    }
                    return false;
                }
            }
            if (this.f9121C >= 0) {
                if (this.f9154x) {
                    this.f9154x = false;
                    this.f9142l.releaseOutputBuffer(this.f9121C, false);
                    this.f9121C = -1;
                    return true;
                } else if ((this.f9140j.flags & 4) != 0) {
                    m12645F();
                    this.f9121C = -1;
                    return false;
                } else {
                    ByteBuffer byteBuffer = this.f9156z[this.f9121C];
                    if (byteBuffer != null) {
                        byteBuffer.position(this.f9140j.offset);
                        byteBuffer.limit(this.f9140j.offset + this.f9140j.size);
                    }
                    this.f9122D = m12655d(this.f9140j.presentationTimeUs);
                }
            } else if (this.f9121C == -2) {
                mo8748w();
                return true;
            } else if (this.f9121C == -3) {
                mo8749x();
                return true;
            } else {
                if (this.f9149s && (this.f9128J || this.f9125G == 2)) {
                    m12645F();
                }
                return false;
            }
        }
        if (!this.f9151u || !this.f9127I) {
            z = mo8741a(j, j2, this.f9142l, this.f9156z[this.f9121C], this.f9121C, this.f9140j.flags, this.f9140j.presentationTimeUs, this.f9122D);
        } else {
            try {
                z = mo8741a(j, j2, this.f9142l, this.f9156z[this.f9121C], this.f9121C, this.f9140j.flags, this.f9140j.presentationTimeUs, this.f9122D);
            } catch (IllegalStateException unused2) {
                m12645F();
                if (this.f9129K) {
                    mo9160C();
                }
                return false;
            }
        }
        if (!z) {
            return false;
        }
        mo9165c(this.f9140j.presentationTimeUs);
        this.f9121C = -1;
        return true;
    }

    /* renamed from: b */
    private static boolean m12651b(String str) {
        return C2511s.f8123a < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(C2511s.f8124b) || "flounder_lte".equals(C2511s.f8124b) || "grouper".equals(C2511s.f8124b) || "tilapia".equals(C2511s.f8124b));
    }

    /* renamed from: b */
    private static boolean m12652b(String str, Format format) {
        return C2511s.f8123a <= 18 && format.f7750r == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* renamed from: b */
    private boolean m12653b(boolean z) {
        boolean z2 = false;
        if (this.f9143m == null) {
            return false;
        }
        int a = this.f9143m.mo8909a();
        if (a != 0) {
            if (a != 4 && (z || !this.f9135e)) {
                z2 = true;
            }
            return z2;
        }
        throw ExoPlaybackException.createForRenderer(this.f9143m.mo8912c(), mo8639r());
    }

    /* renamed from: c */
    private static boolean m12654c(String str) {
        return C2511s.f8123a <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
    }

    /* renamed from: d */
    private boolean m12655d(long j) {
        int size = this.f9139i.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.f9139i.get(i)).longValue() == j) {
                this.f9139i.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m12656d(String str) {
        return (C2511s.f8123a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (C2511s.f8123a <= 19 && "hb2000".equals(C2511s.f8124b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
    }

    /* renamed from: e */
    private static boolean m12657e(String str) {
        return C2511s.f8123a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: v */
    private boolean mo8747v() {
        int i;
        int i2;
        if (this.f9142l == null || this.f9125G == 2 || this.f9128J) {
            return false;
        }
        if (this.f9120B < 0) {
            this.f9120B = this.f9142l.dequeueInputBuffer(0);
            if (this.f9120B < 0) {
                return false;
            }
            this.f9136f.f7788b = this.f9155y[this.f9120B];
            this.f9136f.mo8641a();
        }
        if (this.f9125G == 1) {
            if (!this.f9149s) {
                this.f9127I = true;
                this.f9142l.queueInputBuffer(this.f9120B, 0, 0, 0, 4);
                this.f9120B = -1;
            }
            this.f9125G = 2;
            return false;
        } else if (this.f9153w) {
            this.f9153w = false;
            this.f9136f.f7788b.put(f9118b);
            this.f9142l.queueInputBuffer(this.f9120B, 0, f9118b.length, 0, 0);
            this.f9120B = -1;
            this.f9126H = true;
            return true;
        } else {
            if (this.f9130L) {
                i2 = -4;
                i = 0;
            } else {
                if (this.f9124F == 1) {
                    for (int i3 = 0; i3 < this.f9141k.f7740h.size(); i3++) {
                        this.f9136f.f7788b.put((byte[]) this.f9141k.f7740h.get(i3));
                    }
                    this.f9124F = 2;
                }
                int position = this.f9136f.f7788b.position();
                i = position;
                i2 = mo8613a(this.f9138h, this.f9136f, false);
            }
            if (i2 == -3) {
                return false;
            }
            if (i2 == -5) {
                if (this.f9124F == 2) {
                    this.f9136f.mo8641a();
                    this.f9124F = 1;
                }
                mo8744b(this.f9138h.f9113a);
                return true;
            } else if (this.f9136f.mo8645c()) {
                if (this.f9124F == 2) {
                    this.f9136f.mo8641a();
                    this.f9124F = 1;
                }
                this.f9128J = true;
                if (!this.f9126H) {
                    m12645F();
                    return false;
                }
                try {
                    if (!this.f9149s) {
                        this.f9127I = true;
                        this.f9142l.queueInputBuffer(this.f9120B, 0, 0, 0, 4);
                        this.f9120B = -1;
                    }
                    return false;
                } catch (CryptoException e) {
                    throw ExoPlaybackException.createForRenderer(e, mo8639r());
                }
            } else if (!this.f9131M || this.f9136f.mo8646d()) {
                this.f9131M = false;
                boolean g = this.f9136f.mo8659g();
                this.f9130L = m12653b(g);
                if (this.f9130L) {
                    return false;
                }
                if (this.f9146p && !g) {
                    C2496i.m11701a(this.f9136f.f7788b);
                    if (this.f9136f.f7788b.position() == 0) {
                        return true;
                    }
                    this.f9146p = false;
                }
                try {
                    long j = this.f9136f.f7789c;
                    if (this.f9136f.mo8648g_()) {
                        this.f9139i.add(Long.valueOf(j));
                    }
                    this.f9136f.mo8660h();
                    mo9163a(this.f9136f);
                    if (g) {
                        this.f9142l.queueSecureInputBuffer(this.f9120B, 0, m12646a(this.f9136f, i), j, 0);
                    } else {
                        this.f9142l.queueInputBuffer(this.f9120B, 0, this.f9136f.f7788b.limit(), j, 0);
                    }
                    this.f9120B = -1;
                    this.f9126H = true;
                    this.f9124F = 0;
                    this.f9132a.f7782c++;
                    return true;
                } catch (CryptoException e2) {
                    throw ExoPlaybackException.createForRenderer(e2, mo8639r());
                }
            } else {
                this.f9136f.mo8641a();
                if (this.f9124F == 2) {
                    this.f9124F = 1;
                }
                return true;
            }
        }
    }

    /* renamed from: w */
    private void mo8748w() {
        MediaFormat outputFormat = this.f9142l.getOutputFormat();
        if (this.f9148r && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f9154x = true;
            return;
        }
        if (this.f9152v) {
            outputFormat.setInteger("channel-count", 1);
        }
        mo8738a(this.f9142l, outputFormat);
    }

    /* renamed from: x */
    private void mo8749x() {
        this.f9156z = this.f9142l.getOutputBuffers();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo9158A() {
        return this.f9142l == null && this.f9141k != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final MediaCodec mo9159B() {
        return this.f9142l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo9160C() {
        if (this.f9142l != null) {
            this.f9119A = -9223372036854775807L;
            this.f9120B = -1;
            this.f9121C = -1;
            this.f9130L = false;
            this.f9122D = false;
            this.f9139i.clear();
            this.f9155y = null;
            this.f9156z = null;
            this.f9123E = false;
            this.f9126H = false;
            this.f9145o = false;
            this.f9146p = false;
            this.f9147q = false;
            this.f9148r = false;
            this.f9149s = false;
            this.f9150t = false;
            this.f9152v = false;
            this.f9153w = false;
            this.f9154x = false;
            this.f9127I = false;
            this.f9124F = 0;
            this.f9125G = 0;
            this.f9132a.f7781b++;
            this.f9136f.f7788b = null;
            try {
                this.f9142l.stop();
                try {
                    this.f9142l.release();
                    this.f9142l = null;
                    if (this.f9143m != null && this.f9144n != this.f9143m) {
                        try {
                            this.f9134d.mo8914a(this.f9143m);
                        } finally {
                            this.f9143m = null;
                        }
                    }
                } catch (Throwable th) {
                    this.f9142l = null;
                    if (!(this.f9143m == null || this.f9144n == this.f9143m)) {
                        this.f9134d.mo8914a(this.f9143m);
                    }
                    throw th;
                } finally {
                    this.f9143m = null;
                }
            } catch (Throwable th2) {
                this.f9142l = null;
                if (!(this.f9143m == null || this.f9144n == this.f9143m)) {
                    try {
                        this.f9134d.mo8914a(this.f9143m);
                    } finally {
                        this.f9143m = null;
                    }
                }
                throw th2;
            } finally {
                this.f9143m = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo9161D() {
        this.f9119A = -9223372036854775807L;
        this.f9120B = -1;
        this.f9121C = -1;
        this.f9131M = true;
        this.f9130L = false;
        this.f9122D = false;
        this.f9139i.clear();
        this.f9153w = false;
        this.f9154x = false;
        if (this.f9147q || ((this.f9150t && this.f9127I) || this.f9125G != 0)) {
            mo9160C();
            mo9166z();
        } else {
            this.f9142l.flush();
            this.f9126H = false;
        }
        if (this.f9123E && this.f9141k != null) {
            this.f9124F = 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public long mo9162E() {
        return 0;
    }

    /* renamed from: a */
    public final int mo9157a(Format format) {
        try {
            return mo8734a(this.f9133c, format);
        } catch (DecoderQueryException e) {
            throw ExoPlaybackException.createForRenderer(e, mo8639r());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo8734a(C2679b bVar, Format format);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2678a mo8736a(C2679b bVar, Format format, boolean z) {
        return bVar.mo9180a(format.f7738f, z);
    }

    /* renamed from: a */
    public void mo9156a(long j, long j2) {
        if (this.f9129K) {
            mo8750y();
            return;
        }
        if (this.f9141k == null) {
            this.f9137g.mo8641a();
            int a = mo8613a(this.f9138h, this.f9137g, true);
            if (a == -5) {
                mo8744b(this.f9138h.f9113a);
            } else {
                if (a == -4) {
                    C2488a.m11668b(this.f9137g.mo8645c());
                    this.f9128J = true;
                    m12645F();
                }
                return;
            }
        }
        mo9166z();
        if (this.f9142l != null) {
            C2510r.m11793a("drainAndFeed");
            do {
            } while (mo9568b(j, j2));
            do {
            } while (mo8747v());
            C2510r.m11792a();
        } else {
            mo8623b(j);
            this.f9137g.mo8641a();
            int a2 = mo8613a(this.f9138h, this.f9137g, false);
            if (a2 == -5) {
                mo8744b(this.f9138h.f9113a);
            } else if (a2 == -4) {
                C2488a.m11668b(this.f9137g.mo8645c());
                this.f9128J = true;
                m12645F();
            }
        }
        this.f9132a.mo8656a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8617a(long j, boolean z) {
        this.f9128J = false;
        this.f9129K = false;
        if (this.f9142l != null) {
            mo9161D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8738a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9163a(C2438e eVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8739a(C2678a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8740a(String str, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8619a(boolean z) {
        this.f9132a = new C2437d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo8741a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9164a(MediaCodec mediaCodec, boolean z, Format format, Format format2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8744b(Format format) {
        Format format2 = this.f9141k;
        this.f9141k = format;
        boolean z = true;
        if (!C2511s.m11809a((Object) this.f9141k.f7741i, format2 == null ? null : format2.f7741i)) {
            if (this.f9141k.f7741i == null) {
                this.f9144n = null;
            } else if (this.f9134d != null) {
                this.f9144n = this.f9134d.mo8913a(Looper.myLooper(), this.f9141k.f7741i);
                if (this.f9144n == this.f9143m) {
                    this.f9134d.mo8914a(this.f9144n);
                }
            } else {
                throw ExoPlaybackException.createForRenderer(new IllegalStateException("Media requires a DrmSessionManager"), mo8639r());
            }
        }
        if (this.f9144n == this.f9143m && this.f9142l != null && mo9164a(this.f9142l, this.f9145o, format2, this.f9141k)) {
            this.f9123E = true;
            this.f9124F = 1;
            if (!(this.f9148r && this.f9141k.f7742j == format2.f7742j && this.f9141k.f7743k == format2.f7743k)) {
                z = false;
            }
            this.f9153w = z;
        } else if (this.f9126H) {
            this.f9125G = 1;
        } else {
            mo9160C();
            mo9166z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9165c(long j) {
    }

    /* renamed from: m */
    public final int mo8634m() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo8635n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo8636o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo8637p() {
        this.f9141k = null;
        try {
            mo9160C();
            try {
                if (this.f9143m != null) {
                    this.f9134d.mo8914a(this.f9143m);
                }
                try {
                    if (!(this.f9144n == null || this.f9144n == this.f9143m)) {
                        this.f9134d.mo8914a(this.f9144n);
                    }
                } finally {
                    this.f9143m = null;
                    this.f9144n = null;
                }
            } catch (Throwable th) {
                if (!(this.f9144n == null || this.f9144n == this.f9143m)) {
                    this.f9134d.mo8914a(this.f9144n);
                }
                throw th;
            } finally {
                this.f9143m = null;
                this.f9144n = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.f9144n == null || this.f9144n == this.f9143m)) {
                    this.f9134d.mo8914a(this.f9144n);
                }
                throw th2;
            } finally {
                this.f9143m = null;
                this.f9144n = null;
            }
        } finally {
            this.f9143m = null;
            this.f9144n = null;
        }
    }

    /* renamed from: t */
    public boolean mo8745t() {
        return this.f9141k != null && !this.f9130L && (mo8640s() || this.f9121C >= 0 || (this.f9119A != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f9119A));
    }

    /* renamed from: u */
    public boolean mo8746u() {
        return this.f9129K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo8750y() {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0157  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9166z() {
        /*
            r13 = this;
            boolean r0 = r13.mo9158A()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.c> r0 = r13.f9144n
            r13.f9143m = r0
            com.google.android.exoplayer2.Format r0 = r13.f9141k
            java.lang.String r0 = r0.f7738f
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.c> r1 = r13.f9143m
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0047
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.c> r1 = r13.f9143m
            int r1 = r1.mo8909a()
            if (r1 == 0) goto L_0x0038
            r4 = 3
            if (r1 == r4) goto L_0x0025
            r4 = 4
            if (r1 != r4) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            return
        L_0x0025:
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.c> r1 = r13.f9143m
            com.google.android.exoplayer2.drm.b r1 = r1.mo8911b()
            com.google.android.exoplayer2.drm.c r1 = (com.google.android.exoplayer2.drm.C2519c) r1
            android.media.MediaCrypto r1 = r1.mo8915a()
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.c> r4 = r13.f9143m
            boolean r4 = r4.mo8910a(r0)
            goto L_0x0049
        L_0x0038:
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.c> r0 = r13.f9143m
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r0.mo8912c()
            int r1 = r13.mo8639r()
            com.google.android.exoplayer2.ExoPlaybackException r0 = com.google.android.exoplayer2.ExoPlaybackException.createForRenderer(r0, r1)
            throw r0
        L_0x0047:
            r1 = r3
            r4 = 0
        L_0x0049:
            com.google.android.exoplayer2.mediacodec.b r5 = r13.f9133c     // Catch:{ DecoderQueryException -> 0x0091 }
            com.google.android.exoplayer2.Format r6 = r13.f9141k     // Catch:{ DecoderQueryException -> 0x0091 }
            com.google.android.exoplayer2.mediacodec.a r5 = r13.mo8736a(r5, r6, r4)     // Catch:{ DecoderQueryException -> 0x0091 }
            if (r5 != 0) goto L_0x008f
            if (r4 == 0) goto L_0x008f
            com.google.android.exoplayer2.mediacodec.b r6 = r13.f9133c     // Catch:{ DecoderQueryException -> 0x008c }
            com.google.android.exoplayer2.Format r7 = r13.f9141k     // Catch:{ DecoderQueryException -> 0x008c }
            com.google.android.exoplayer2.mediacodec.a r2 = r13.mo8736a(r6, r7, r2)     // Catch:{ DecoderQueryException -> 0x008c }
            if (r2 == 0) goto L_0x00a0
            java.lang.String r5 = "MediaCodecRenderer"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ DecoderQueryException -> 0x008a }
            r6.<init>()     // Catch:{ DecoderQueryException -> 0x008a }
            java.lang.String r7 = "Drm session requires secure decoder for "
            r6.append(r7)     // Catch:{ DecoderQueryException -> 0x008a }
            r6.append(r0)     // Catch:{ DecoderQueryException -> 0x008a }
            java.lang.String r0 = ", but "
            r6.append(r0)     // Catch:{ DecoderQueryException -> 0x008a }
            java.lang.String r0 = "no secure decoder available. Trying to proceed with "
            r6.append(r0)     // Catch:{ DecoderQueryException -> 0x008a }
            java.lang.String r0 = r2.f9168a     // Catch:{ DecoderQueryException -> 0x008a }
            r6.append(r0)     // Catch:{ DecoderQueryException -> 0x008a }
            java.lang.String r0 = "."
            r6.append(r0)     // Catch:{ DecoderQueryException -> 0x008a }
            java.lang.String r0 = r6.toString()     // Catch:{ DecoderQueryException -> 0x008a }
            android.util.Log.w(r5, r0)     // Catch:{ DecoderQueryException -> 0x008a }
            goto L_0x00a0
        L_0x008a:
            r0 = move-exception
            goto L_0x0093
        L_0x008c:
            r0 = move-exception
            r2 = r5
            goto L_0x0093
        L_0x008f:
            r2 = r5
            goto L_0x00a0
        L_0x0091:
            r0 = move-exception
            r2 = r3
        L_0x0093:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r5 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r6 = r13.f9141k
            r7 = -49998(0xffffffffffff3cb2, float:NaN)
            r5.<init>(r6, r0, r4, r7)
            r13.m12647a(r5)
        L_0x00a0:
            if (r2 != 0) goto L_0x00af
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r5 = r13.f9141k
            r6 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>(r5, r3, r4, r6)
            r13.m12647a(r0)
        L_0x00af:
            java.lang.String r0 = r2.f9168a
            boolean r3 = r2.f9169b
            r13.f9145o = r3
            com.google.android.exoplayer2.Format r3 = r13.f9141k
            boolean r3 = m12649a(r0, r3)
            r13.f9146p = r3
            boolean r3 = mo8742a(r0)
            r13.f9147q = r3
            boolean r3 = m12651b(r0)
            r13.f9148r = r3
            boolean r3 = m12654c(r0)
            r13.f9149s = r3
            boolean r3 = m12656d(r0)
            r13.f9150t = r3
            boolean r3 = m12657e(r0)
            r13.f9151u = r3
            com.google.android.exoplayer2.Format r3 = r13.f9141k
            boolean r3 = m12652b(r0, r3)
            r13.f9152v = r3
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x013d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013d }
            r3.<init>()     // Catch:{ Exception -> 0x013d }
            java.lang.String r7 = "createCodec:"
            r3.append(r7)     // Catch:{ Exception -> 0x013d }
            r3.append(r0)     // Catch:{ Exception -> 0x013d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x013d }
            com.google.android.exoplayer2.p102c.C2510r.m11793a(r3)     // Catch:{ Exception -> 0x013d }
            android.media.MediaCodec r3 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x013d }
            r13.f9142l = r3     // Catch:{ Exception -> 0x013d }
            com.google.android.exoplayer2.p102c.C2510r.m11792a()     // Catch:{ Exception -> 0x013d }
            java.lang.String r3 = "configureCodec"
            com.google.android.exoplayer2.p102c.C2510r.m11793a(r3)     // Catch:{ Exception -> 0x013d }
            android.media.MediaCodec r3 = r13.f9142l     // Catch:{ Exception -> 0x013d }
            com.google.android.exoplayer2.Format r7 = r13.f9141k     // Catch:{ Exception -> 0x013d }
            r13.mo8739a(r2, r3, r7, r1)     // Catch:{ Exception -> 0x013d }
            com.google.android.exoplayer2.p102c.C2510r.m11792a()     // Catch:{ Exception -> 0x013d }
            java.lang.String r1 = "startCodec"
            com.google.android.exoplayer2.p102c.C2510r.m11793a(r1)     // Catch:{ Exception -> 0x013d }
            android.media.MediaCodec r1 = r13.f9142l     // Catch:{ Exception -> 0x013d }
            r1.start()     // Catch:{ Exception -> 0x013d }
            com.google.android.exoplayer2.p102c.C2510r.m11792a()     // Catch:{ Exception -> 0x013d }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x013d }
            r1 = 0
            long r11 = r9 - r5
            r7 = r13
            r8 = r0
            r7.mo8740a(r8, r9, r11)     // Catch:{ Exception -> 0x013d }
            android.media.MediaCodec r1 = r13.f9142l     // Catch:{ Exception -> 0x013d }
            java.nio.ByteBuffer[] r1 = r1.getInputBuffers()     // Catch:{ Exception -> 0x013d }
            r13.f9155y = r1     // Catch:{ Exception -> 0x013d }
            android.media.MediaCodec r1 = r13.f9142l     // Catch:{ Exception -> 0x013d }
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x013d }
            r13.f9156z = r1     // Catch:{ Exception -> 0x013d }
            goto L_0x0148
        L_0x013d:
            r1 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r3 = r13.f9141k
            r2.<init>(r3, r1, r4, r0)
            r13.m12647a(r2)
        L_0x0148:
            int r0 = r13.mo8625d()
            r1 = 2
            if (r0 != r1) goto L_0x0157
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x015c
        L_0x0157:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x015c:
            r13.f9119A = r0
            r0 = -1
            r13.f9120B = r0
            r13.f9121C = r0
            r0 = 1
            r13.f9131M = r0
            com.google.android.exoplayer2.a.d r1 = r13.f9132a
            int r2 = r1.f7780a
            int r2 = r2 + r0
            r1.f7780a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo9166z():void");
    }
}
