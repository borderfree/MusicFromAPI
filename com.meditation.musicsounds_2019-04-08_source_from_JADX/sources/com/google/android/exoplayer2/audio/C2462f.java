package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.C2670k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioTrack.C2446c;
import com.google.android.exoplayer2.audio.AudioTrack.ConfigurationException;
import com.google.android.exoplayer2.audio.AudioTrack.InitializationException;
import com.google.android.exoplayer2.audio.AudioTrack.WriteException;
import com.google.android.exoplayer2.audio.C2452c.C2453a;
import com.google.android.exoplayer2.drm.C2517a;
import com.google.android.exoplayer2.drm.C2519c;
import com.google.android.exoplayer2.mediacodec.C2678a;
import com.google.android.exoplayer2.mediacodec.C2679b;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.p102c.C2494g;
import com.google.android.exoplayer2.p102c.C2495h;
import com.google.android.exoplayer2.p102c.C2511s;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.audio.f */
public class C2462f extends MediaCodecRenderer implements C2494g {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2453a f7930b;

    /* renamed from: c */
    private final AudioTrack f7931c;

    /* renamed from: d */
    private boolean f7932d;

    /* renamed from: e */
    private boolean f7933e;

    /* renamed from: f */
    private MediaFormat f7934f;

    /* renamed from: g */
    private int f7935g;

    /* renamed from: h */
    private int f7936h;

    /* renamed from: i */
    private long f7937i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f7938j;

    /* renamed from: com.google.android.exoplayer2.audio.f$a */
    private final class C2464a implements C2446c {
        private C2464a() {
        }

        /* renamed from: a */
        public void mo8708a() {
            C2462f.this.mo8747v();
            C2462f.this.f7938j = true;
        }

        /* renamed from: a */
        public void mo8709a(int i) {
            C2462f.this.f7930b.mo8721a(i);
            C2462f.this.mo8743b(i);
        }

        /* renamed from: a */
        public void mo8710a(int i, long j, long j2) {
            C2462f.this.f7930b.mo8722a(i, j, j2);
            C2462f.this.mo8737a(i, j, j2);
        }
    }

    public C2462f(C2679b bVar, C2517a<C2519c> aVar, boolean z, Handler handler, C2452c cVar, C2451b bVar2, AudioProcessor... audioProcessorArr) {
        super(1, bVar, aVar, z);
        this.f7931c = new AudioTrack(bVar2, audioProcessorArr, new C2464a());
        this.f7930b = new C2453a(handler, cVar);
    }

    /* renamed from: b */
    private static boolean m11526b(String str) {
        return C2511s.f8123a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C2511s.f8125c) && (C2511s.f8124b.startsWith("zeroflte") || C2511s.f8124b.startsWith("herolte") || C2511s.f8124b.startsWith("heroqlte"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo8734a(C2679b bVar, Format format) {
        String str = format.f7738f;
        if (!C2495h.m11692a(str)) {
            return 0;
        }
        int i = C2511s.f8123a >= 21 ? 16 : 0;
        int i2 = 3;
        if (mo8742a(str) && bVar.mo9179a() != null) {
            return i | 4 | 3;
        }
        C2678a a = bVar.mo9180a(str, false);
        boolean z = true;
        if (a == null) {
            return 1;
        }
        if (C2511s.f8123a >= 21 && ((format.f7751s != -1 && !a.mo9174a(format.f7751s)) || (format.f7750r != -1 && !a.mo9177b(format.f7750r)))) {
            z = false;
        }
        if (!z) {
            i2 = 2;
        }
        return i | 4 | i2;
    }

    /* renamed from: a */
    public C2670k mo8735a(C2670k kVar) {
        return this.f7931c.mo8681a(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2678a mo8736a(C2679b bVar, Format format, boolean z) {
        if (mo8742a(format.f7738f)) {
            C2678a a = bVar.mo9179a();
            if (a != null) {
                this.f7932d = true;
                return a;
            }
        }
        this.f7932d = false;
        return super.mo8736a(bVar, format, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8737a(int i, long j, long j2) {
    }

    /* renamed from: a */
    public void mo8615a(int i, Object obj) {
        switch (i) {
            case 2:
                this.f7931c.mo8683a(((Float) obj).floatValue());
                return;
            case 3:
                this.f7931c.mo8684a(((Integer) obj).intValue());
                return;
            default:
                super.mo8615a(i, obj);
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8617a(long j, boolean z) {
        super.mo8617a(j, z);
        this.f7931c.mo8696i();
        this.f7937i = j;
        this.f7938j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8738a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int[] iArr;
        boolean z = this.f7934f != null;
        String string = z ? this.f7934f.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.f7934f;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f7933e || integer != 6 || this.f7936h >= 6) {
            iArr = null;
        } else {
            iArr = new int[this.f7936h];
            for (int i = 0; i < this.f7936h; i++) {
                iArr[i] = i;
            }
        }
        try {
            this.f7931c.mo8685a(string, integer, integer2, this.f7935g, 0, iArr);
        } catch (ConfigurationException e) {
            throw ExoPlaybackException.createForRenderer(e, mo8639r());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8739a(C2678a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.f7933e = m11526b(aVar.f9168a);
        if (this.f7932d) {
            this.f7934f = format.mo8602b();
            this.f7934f.setString("mime", "audio/raw");
            mediaCodec.configure(this.f7934f, null, mediaCrypto, 0);
            this.f7934f.setString("mime", format.f7738f);
            return;
        }
        mediaCodec.configure(format.mo8602b(), null, mediaCrypto, 0);
        this.f7934f = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8740a(String str, long j, long j2) {
        this.f7930b.mo8725a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8619a(boolean z) {
        super.mo8619a(z);
        this.f7930b.mo8724a(this.f9132a);
        int i = mo8638q().f9268b;
        if (i != 0) {
            this.f7931c.mo8689b(i);
        } else {
            this.f7931c.mo8694g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8741a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.f7932d && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f9132a.f7784e++;
            this.f7931c.mo8688b();
            return true;
        } else {
            try {
                if (!this.f7931c.mo8687a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f9132a.f7783d++;
                return true;
            } catch (InitializationException | WriteException e) {
                throw ExoPlaybackException.createForRenderer(e, mo8639r());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8742a(String str) {
        return this.f7931c.mo8686a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8743b(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8744b(Format format) {
        super.mo8744b(format);
        this.f7930b.mo8723a(format);
        this.f7935g = "audio/raw".equals(format.f7738f) ? format.f7752t : 2;
        this.f7936h = format.f7750r;
    }

    /* renamed from: c */
    public C2494g mo8624c() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo8635n() {
        super.mo8635n();
        this.f7931c.mo8682a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo8636o() {
        this.f7931c.mo8695h();
        super.mo8636o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo8637p() {
        try {
            this.f7931c.mo8697j();
            try {
                super.mo8637p();
            } finally {
                this.f9132a.mo8656a();
                this.f7930b.mo8726b(this.f9132a);
            }
        } catch (Throwable th) {
            super.mo8637p();
            throw th;
        } finally {
            this.f9132a.mo8656a();
            this.f7930b.mo8726b(this.f9132a);
        }
    }

    /* renamed from: t */
    public boolean mo8745t() {
        return this.f7931c.mo8692e() || super.mo8745t();
    }

    /* renamed from: u */
    public boolean mo8746u() {
        return super.mo8746u() && this.f7931c.mo8691d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo8747v() {
    }

    /* renamed from: w */
    public long mo8748w() {
        long a = this.f7931c.mo8680a(mo8746u());
        if (a != Long.MIN_VALUE) {
            if (!this.f7938j) {
                a = Math.max(this.f7937i, a);
            }
            this.f7937i = a;
            this.f7938j = false;
        }
        return this.f7937i;
    }

    /* renamed from: x */
    public C2670k mo8749x() {
        return this.f7931c.mo8693f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo8750y() {
        try {
            this.f7931c.mo8690c();
        } catch (WriteException e) {
            throw ExoPlaybackException.createForRenderer(e, mo8639r());
        }
    }
}
