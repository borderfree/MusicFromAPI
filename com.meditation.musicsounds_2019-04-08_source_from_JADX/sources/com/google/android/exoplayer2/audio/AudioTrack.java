package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C2468b;
import com.google.android.exoplayer2.C2670k;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2511s;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;

public final class AudioTrack {

    /* renamed from: a */
    public static boolean f7808a = false;

    /* renamed from: b */
    public static boolean f7809b = false;

    /* renamed from: A */
    private int f7810A;

    /* renamed from: B */
    private int f7811B;

    /* renamed from: C */
    private int f7812C;

    /* renamed from: D */
    private long f7813D;

    /* renamed from: E */
    private long f7814E;

    /* renamed from: F */
    private boolean f7815F;

    /* renamed from: G */
    private long f7816G;

    /* renamed from: H */
    private Method f7817H;

    /* renamed from: I */
    private int f7818I;

    /* renamed from: J */
    private long f7819J;

    /* renamed from: K */
    private long f7820K;

    /* renamed from: L */
    private int f7821L;

    /* renamed from: M */
    private long f7822M;

    /* renamed from: N */
    private long f7823N;

    /* renamed from: O */
    private int f7824O;

    /* renamed from: P */
    private int f7825P;

    /* renamed from: Q */
    private long f7826Q;

    /* renamed from: R */
    private long f7827R;

    /* renamed from: S */
    private long f7828S;

    /* renamed from: T */
    private float f7829T;

    /* renamed from: U */
    private AudioProcessor[] f7830U;

    /* renamed from: V */
    private ByteBuffer[] f7831V;

    /* renamed from: W */
    private ByteBuffer f7832W;

    /* renamed from: X */
    private ByteBuffer f7833X;

    /* renamed from: Y */
    private byte[] f7834Y;

    /* renamed from: Z */
    private int f7835Z;

    /* renamed from: aa */
    private int f7836aa;

    /* renamed from: ab */
    private boolean f7837ab;

    /* renamed from: ac */
    private boolean f7838ac;

    /* renamed from: ad */
    private int f7839ad;

    /* renamed from: ae */
    private boolean f7840ae;

    /* renamed from: af */
    private boolean f7841af;

    /* renamed from: ag */
    private long f7842ag;

    /* renamed from: c */
    private final C2451b f7843c;

    /* renamed from: d */
    private final C2460d f7844d;

    /* renamed from: e */
    private final C2467i f7845e;

    /* renamed from: f */
    private final AudioProcessor[] f7846f;

    /* renamed from: g */
    private final C2446c f7847g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ConditionVariable f7848h = new ConditionVariable(true);

    /* renamed from: i */
    private final long[] f7849i;

    /* renamed from: j */
    private final C2444a f7850j;

    /* renamed from: k */
    private final LinkedList<C2447d> f7851k;

    /* renamed from: l */
    private android.media.AudioTrack f7852l;

    /* renamed from: m */
    private android.media.AudioTrack f7853m;

    /* renamed from: n */
    private int f7854n;

    /* renamed from: o */
    private int f7855o;

    /* renamed from: p */
    private int f7856p;

    /* renamed from: q */
    private int f7857q;

    /* renamed from: r */
    private int f7858r;

    /* renamed from: s */
    private boolean f7859s;

    /* renamed from: t */
    private int f7860t;

    /* renamed from: u */
    private long f7861u;

    /* renamed from: v */
    private C2670k f7862v;

    /* renamed from: w */
    private C2670k f7863w;

    /* renamed from: x */
    private long f7864x;

    /* renamed from: y */
    private long f7865y;

    /* renamed from: z */
    private ByteBuffer f7866z;

    public static final class ConfigurationException extends Exception {
        public ConfigurationException(String str) {
            super(str);
        }

        public ConfigurationException(Throwable th) {
            super(th);
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        public InitializationException(int i, int i2, int i3, int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed: ");
            sb.append(i);
            sb.append(", Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(")");
            super(sb.toString());
            this.audioTrackState = i;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack write failed: ");
            sb.append(i);
            super(sb.toString());
            this.errorCode = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioTrack$a */
    private static class C2444a {

        /* renamed from: a */
        protected android.media.AudioTrack f7871a;

        /* renamed from: b */
        private boolean f7872b;

        /* renamed from: c */
        private int f7873c;

        /* renamed from: d */
        private long f7874d;

        /* renamed from: e */
        private long f7875e;

        /* renamed from: f */
        private long f7876f;

        /* renamed from: g */
        private long f7877g;

        /* renamed from: h */
        private long f7878h;

        /* renamed from: i */
        private long f7879i;

        private C2444a() {
        }

        /* renamed from: a */
        public void mo8700a() {
            if (this.f7877g == -9223372036854775807L) {
                this.f7871a.pause();
            }
        }

        /* renamed from: a */
        public void mo8701a(long j) {
            this.f7878h = mo8703b();
            this.f7877g = SystemClock.elapsedRealtime() * 1000;
            this.f7879i = j;
            this.f7871a.stop();
        }

        /* renamed from: a */
        public void mo8702a(android.media.AudioTrack audioTrack, boolean z) {
            this.f7871a = audioTrack;
            this.f7872b = z;
            this.f7877g = -9223372036854775807L;
            this.f7874d = 0;
            this.f7875e = 0;
            this.f7876f = 0;
            if (audioTrack != null) {
                this.f7873c = audioTrack.getSampleRate();
            }
        }

        /* renamed from: b */
        public long mo8703b() {
            if (this.f7877g != -9223372036854775807L) {
                return Math.min(this.f7879i, this.f7878h + ((((SystemClock.elapsedRealtime() * 1000) - this.f7877g) * ((long) this.f7873c)) / 1000000));
            }
            int playState = this.f7871a.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = 4294967295L & ((long) this.f7871a.getPlaybackHeadPosition());
            if (this.f7872b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f7876f = this.f7874d;
                }
                playbackHeadPosition += this.f7876f;
            }
            if (this.f7874d > playbackHeadPosition) {
                this.f7875e++;
            }
            this.f7874d = playbackHeadPosition;
            return playbackHeadPosition + (this.f7875e << 32);
        }

        /* renamed from: c */
        public long mo8704c() {
            return (mo8703b() * 1000000) / ((long) this.f7873c);
        }

        /* renamed from: d */
        public boolean mo8705d() {
            return false;
        }

        /* renamed from: e */
        public long mo8706e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public long mo8707f() {
            throw new UnsupportedOperationException();
        }
    }

    @TargetApi(19)
    /* renamed from: com.google.android.exoplayer2.audio.AudioTrack$b */
    private static class C2445b extends C2444a {

        /* renamed from: b */
        private final AudioTimestamp f7880b = new AudioTimestamp();

        /* renamed from: c */
        private long f7881c;

        /* renamed from: d */
        private long f7882d;

        /* renamed from: e */
        private long f7883e;

        public C2445b() {
            super();
        }

        /* renamed from: a */
        public void mo8702a(android.media.AudioTrack audioTrack, boolean z) {
            super.mo8702a(audioTrack, z);
            this.f7881c = 0;
            this.f7882d = 0;
            this.f7883e = 0;
        }

        /* renamed from: d */
        public boolean mo8705d() {
            boolean timestamp = this.f7871a.getTimestamp(this.f7880b);
            if (timestamp) {
                long j = this.f7880b.framePosition;
                if (this.f7882d > j) {
                    this.f7881c++;
                }
                this.f7882d = j;
                this.f7883e = j + (this.f7881c << 32);
            }
            return timestamp;
        }

        /* renamed from: e */
        public long mo8706e() {
            return this.f7880b.nanoTime;
        }

        /* renamed from: f */
        public long mo8707f() {
            return this.f7883e;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioTrack$c */
    public interface C2446c {
        /* renamed from: a */
        void mo8708a();

        /* renamed from: a */
        void mo8709a(int i);

        /* renamed from: a */
        void mo8710a(int i, long j, long j2);
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioTrack$d */
    private static final class C2447d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C2670k f7884a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f7885b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f7886c;

        private C2447d(C2670k kVar, long j, long j2) {
            this.f7884a = kVar;
            this.f7885b = j;
            this.f7886c = j2;
        }
    }

    public AudioTrack(C2451b bVar, AudioProcessor[] audioProcessorArr, C2446c cVar) {
        this.f7843c = bVar;
        this.f7847g = cVar;
        if (C2511s.f8123a >= 18) {
            try {
                this.f7817H = android.media.AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7850j = C2511s.f8123a >= 19 ? new C2445b() : new C2444a();
        this.f7844d = new C2460d();
        this.f7845e = new C2467i();
        this.f7846f = new AudioProcessor[(audioProcessorArr.length + 3)];
        this.f7846f[0] = new C2465g();
        this.f7846f[1] = this.f7844d;
        System.arraycopy(audioProcessorArr, 0, this.f7846f, 2, audioProcessorArr.length);
        this.f7846f[audioProcessorArr.length + 2] = this.f7845e;
        this.f7849i = new long[10];
        this.f7829T = 1.0f;
        this.f7825P = 0;
        this.f7858r = 3;
        this.f7839ad = 0;
        this.f7863w = C2670k.f9114a;
        this.f7836aa = -1;
        this.f7830U = new AudioProcessor[0];
        this.f7831V = new ByteBuffer[0];
        this.f7851k = new LinkedList<>();
    }

    /* renamed from: a */
    private static int m11423a(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return C2461e.m11520a(byteBuffer);
        }
        if (i == 5) {
            return C2448a.m11486a();
        }
        if (i == 6) {
            return C2448a.m11488a(byteBuffer);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected audio encoding: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m11424a(android.media.AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    /* renamed from: a */
    private int m11425a(android.media.AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.f7866z == null) {
            this.f7866z = ByteBuffer.allocate(16);
            this.f7866z.order(ByteOrder.BIG_ENDIAN);
            this.f7866z.putInt(1431633921);
        }
        if (this.f7810A == 0) {
            this.f7866z.putInt(4, i);
            this.f7866z.putLong(8, j * 1000);
            this.f7866z.position(0);
            this.f7810A = i;
        }
        int remaining = this.f7866z.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f7866z, remaining, 1);
            if (write < 0) {
                this.f7810A = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int a = m11424a(audioTrack, byteBuffer, i);
        if (a < 0) {
            this.f7810A = 0;
            return a;
        }
        this.f7810A -= a;
        return a;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static android.media.AudioTrack m11426a(int i, int i2, int i3, int i4, int i5) {
        android.media.AudioTrack audioTrack = new android.media.AudioTrack(new Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(i2).setEncoding(i3).setSampleRate(i).build(), i4, 1, i5);
        return audioTrack;
    }

    /* renamed from: a */
    private void m11428a(long j) {
        int length = this.f7830U.length;
        int i = length;
        while (i >= 0) {
            ByteBuffer byteBuffer = i > 0 ? this.f7831V[i - 1] : this.f7832W != null ? this.f7832W : AudioProcessor.f7807a;
            if (i == length) {
                m11433b(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.f7830U[i];
                audioProcessor.mo8670a(byteBuffer);
                ByteBuffer e = audioProcessor.mo8676e();
                this.f7831V[i] = e;
                if (e.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m11429a(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m11430b(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = -1095064472(0xffffffffbebaa468, float:-0.36453557)
            r2 = 0
            if (r0 == r1) goto L_0x0038
            r1 = 187078296(0xb269698, float:3.208373E-32)
            if (r0 == r1) goto L_0x002e
            r1 = 1504578661(0x59ae0c65, float:6.1237842E15)
            if (r0 == r1) goto L_0x0024
            r1 = 1505942594(0x59c2dc42, float:6.8560402E15)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 3
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "audio/eac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 1
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "audio/ac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 2
            goto L_0x0043
        L_0x0042:
            r3 = -1
        L_0x0043:
            switch(r3) {
                case 0: goto L_0x004e;
                case 1: goto L_0x004c;
                case 2: goto L_0x004a;
                case 3: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            return r2
        L_0x0047:
            r3 = 8
            return r3
        L_0x004a:
            r3 = 7
            return r3
        L_0x004c:
            r3 = 6
            return r3
        L_0x004e:
            r3 = 5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrack.m11430b(java.lang.String):int");
    }

    /* renamed from: b */
    private long m11431b(long j) {
        long j2;
        long j3;
        while (!this.f7851k.isEmpty() && j >= ((C2447d) this.f7851k.getFirst()).f7886c) {
            C2447d dVar = (C2447d) this.f7851k.remove();
            this.f7863w = dVar.f7884a;
            this.f7865y = dVar.f7886c;
            this.f7864x = dVar.f7885b - this.f7826Q;
        }
        if (this.f7863w.f9115b == 1.0f) {
            return (j + this.f7864x) - this.f7865y;
        }
        if (!this.f7851k.isEmpty() || this.f7845e.mo8760j() < 1024) {
            j2 = this.f7864x;
            double d = (double) this.f7863w.f9115b;
            double d2 = (double) (j - this.f7865y);
            Double.isNaN(d);
            Double.isNaN(d2);
            j3 = (long) (d * d2);
        } else {
            j2 = this.f7864x;
            j3 = C2511s.m11814b(j - this.f7865y, this.f7845e.mo8759i(), this.f7845e.mo8760j());
        }
        return j2 + j3;
    }

    /* renamed from: b */
    private static void m11432b(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: b */
    private boolean m11433b(ByteBuffer byteBuffer, long j) {
        int i;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        if (this.f7833X != null) {
            C2488a.m11666a(this.f7833X == byteBuffer);
        } else {
            this.f7833X = byteBuffer;
            if (C2511s.f8123a < 21) {
                int remaining = byteBuffer.remaining();
                if (this.f7834Y == null || this.f7834Y.length < remaining) {
                    this.f7834Y = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.f7834Y, 0, remaining);
                byteBuffer.position(position);
                this.f7835Z = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (C2511s.f8123a < 21) {
            int b = this.f7860t - ((int) (this.f7822M - (this.f7850j.mo8703b() * ((long) this.f7821L))));
            if (b > 0) {
                i = this.f7853m.write(this.f7834Y, this.f7835Z, Math.min(remaining2, b));
                if (i > 0) {
                    this.f7835Z += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else {
                i = 0;
            }
        } else if (this.f7840ae) {
            C2488a.m11668b(j != -9223372036854775807L);
            i = m11425a(this.f7853m, byteBuffer, remaining2, j);
        } else {
            i = m11424a(this.f7853m, byteBuffer, remaining2);
        }
        this.f7842ag = SystemClock.elapsedRealtime();
        if (i >= 0) {
            if (!this.f7859s) {
                this.f7822M += (long) i;
            }
            if (i != remaining2) {
                return false;
            }
            if (this.f7859s) {
                this.f7823N += (long) this.f7824O;
            }
            this.f7833X = null;
            return true;
        }
        throw new WriteException(i);
    }

    /* renamed from: c */
    private long m11434c(long j) {
        return (j * 1000000) / ((long) this.f7854n);
    }

    /* renamed from: d */
    private long m11435d(long j) {
        return (j * ((long) this.f7854n)) / 1000000;
    }

    /* renamed from: k */
    private void m11436k() {
        AudioProcessor[] audioProcessorArr;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : this.f7846f) {
            if (audioProcessor.mo8671a()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.mo8678g();
            }
        }
        int size = arrayList.size();
        this.f7830U = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f7831V = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            AudioProcessor audioProcessor2 = this.f7830U[i];
            audioProcessor2.mo8678g();
            this.f7831V[i] = audioProcessor2.mo8676e();
        }
    }

    /* renamed from: l */
    private void m11437l() {
        this.f7848h.block();
        android.media.AudioTrack audioTrack = this.f7840ae ? m11426a(this.f7854n, this.f7855o, this.f7857q, this.f7860t, this.f7839ad) : this.f7839ad == 0 ? new android.media.AudioTrack(this.f7858r, this.f7854n, this.f7855o, this.f7857q, this.f7860t, 1) : new android.media.AudioTrack(this.f7858r, this.f7854n, this.f7855o, this.f7857q, this.f7860t, 1, this.f7839ad);
        this.f7853m = audioTrack;
        m11443r();
        int audioSessionId = this.f7853m.getAudioSessionId();
        if (f7808a && C2511s.f8123a < 21) {
            if (!(this.f7852l == null || audioSessionId == this.f7852l.getAudioSessionId())) {
                m11440o();
            }
            if (this.f7852l == null) {
                android.media.AudioTrack audioTrack2 = new android.media.AudioTrack(this.f7858r, 4000, 4, 2, 2, 0, audioSessionId);
                this.f7852l = audioTrack2;
            }
        }
        if (this.f7839ad != audioSessionId) {
            this.f7839ad = audioSessionId;
            this.f7847g.mo8709a(audioSessionId);
        }
        this.f7850j.mo8702a(this.f7853m, m11448w());
        m11439n();
        this.f7841af = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m11438m() {
        /*
            r8 = this;
            int r0 = r8.f7836aa
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r8.f7859s
            if (r0 == 0) goto L_0x000f
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r8.f7830U
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r8.f7836aa = r0
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r8.f7836aa
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r8.f7830U
            int r5 = r5.length
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r5) goto L_0x003a
            com.google.android.exoplayer2.audio.AudioProcessor[] r4 = r8.f7830U
            int r5 = r8.f7836aa
            r4 = r4[r5]
            if (r0 == 0) goto L_0x002c
            r4.mo8675d()
        L_0x002c:
            r8.m11428a(r6)
            boolean r0 = r4.mo8677f()
            if (r0 != 0) goto L_0x0036
            return r3
        L_0x0036:
            int r0 = r8.f7836aa
            int r0 = r0 + r2
            goto L_0x0010
        L_0x003a:
            java.nio.ByteBuffer r0 = r8.f7833X
            if (r0 == 0) goto L_0x0048
            java.nio.ByteBuffer r0 = r8.f7833X
            r8.m11433b(r0, r6)
            java.nio.ByteBuffer r0 = r8.f7833X
            if (r0 == 0) goto L_0x0048
            return r3
        L_0x0048:
            r8.f7836aa = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrack.m11438m():boolean");
    }

    /* renamed from: n */
    private void m11439n() {
        if (m11444s()) {
            if (C2511s.f8123a >= 21) {
                m11429a(this.f7853m, this.f7829T);
            } else {
                m11432b(this.f7853m, this.f7829T);
            }
        }
    }

    /* renamed from: o */
    private void m11440o() {
        if (this.f7852l != null) {
            final android.media.AudioTrack audioTrack = this.f7852l;
            this.f7852l = null;
            new Thread() {
                public void run() {
                    audioTrack.release();
                }
            }.start();
        }
    }

    /* renamed from: p */
    private boolean m11441p() {
        return m11444s() && this.f7825P != 0;
    }

    /* renamed from: q */
    private void m11442q() {
        String sb;
        long c = this.f7850j.mo8704c();
        if (c != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f7814E >= 30000) {
                this.f7849i[this.f7811B] = c - nanoTime;
                this.f7811B = (this.f7811B + 1) % 10;
                if (this.f7812C < 10) {
                    this.f7812C++;
                }
                this.f7814E = nanoTime;
                this.f7813D = 0;
                for (int i = 0; i < this.f7812C; i++) {
                    this.f7813D += this.f7849i[i] / ((long) this.f7812C);
                }
            }
            if (!m11448w() && nanoTime - this.f7816G >= 500000) {
                this.f7815F = this.f7850j.mo8705d();
                if (this.f7815F) {
                    long e = this.f7850j.mo8706e() / 1000;
                    long f = this.f7850j.mo8707f();
                    if (e >= this.f7827R) {
                        if (Math.abs(e - nanoTime) > 5000000) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Spurious audio timestamp (system clock mismatch): ");
                            sb2.append(f);
                            sb2.append(", ");
                            sb2.append(e);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(c);
                            sb = sb2.toString();
                            if (f7809b) {
                                throw new InvalidAudioTrackTimestampException(sb);
                            }
                        } else if (Math.abs(m11434c(f) - c) > 5000000) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Spurious audio timestamp (frame position mismatch): ");
                            sb3.append(f);
                            sb3.append(", ");
                            sb3.append(e);
                            sb3.append(", ");
                            sb3.append(nanoTime);
                            sb3.append(", ");
                            sb3.append(c);
                            sb = sb3.toString();
                            if (f7809b) {
                                throw new InvalidAudioTrackTimestampException(sb);
                            }
                        }
                        Log.w("AudioTrack", sb);
                    }
                    this.f7815F = false;
                }
                if (this.f7817H != null && !this.f7859s) {
                    try {
                        this.f7828S = (((long) ((Integer) this.f7817H.invoke(this.f7853m, null)).intValue()) * 1000) - this.f7861u;
                        this.f7828S = Math.max(this.f7828S, 0);
                        if (this.f7828S > 5000000) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Ignoring impossibly large audio latency: ");
                            sb4.append(this.f7828S);
                            Log.w("AudioTrack", sb4.toString());
                            this.f7828S = 0;
                        }
                    } catch (Exception unused) {
                        this.f7817H = null;
                    }
                }
                this.f7816G = nanoTime;
            }
        }
    }

    /* renamed from: r */
    private void m11443r() {
        int state = this.f7853m.getState();
        if (state != 1) {
            try {
                this.f7853m.release();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f7853m = null;
                throw th;
            }
            this.f7853m = null;
            throw new InitializationException(state, this.f7854n, this.f7855o, this.f7860t);
        }
    }

    /* renamed from: s */
    private boolean m11444s() {
        return this.f7853m != null;
    }

    /* renamed from: t */
    private long m11445t() {
        return this.f7859s ? this.f7820K : this.f7819J / ((long) this.f7818I);
    }

    /* renamed from: u */
    private long m11446u() {
        return this.f7859s ? this.f7823N : this.f7822M / ((long) this.f7821L);
    }

    /* renamed from: v */
    private void m11447v() {
        this.f7813D = 0;
        this.f7812C = 0;
        this.f7811B = 0;
        this.f7814E = 0;
        this.f7815F = false;
        this.f7816G = 0;
    }

    /* renamed from: w */
    private boolean m11448w() {
        return C2511s.f8123a < 23 && (this.f7857q == 5 || this.f7857q == 6);
    }

    /* renamed from: x */
    private boolean m11449x() {
        return m11448w() && this.f7853m.getPlayState() == 2 && this.f7853m.getPlaybackHeadPosition() == 0;
    }

    /* renamed from: a */
    public long mo8680a(boolean z) {
        long j;
        if (!m11441p()) {
            return Long.MIN_VALUE;
        }
        if (this.f7853m.getPlayState() == 3) {
            m11442q();
        }
        long nanoTime = System.nanoTime() / 1000;
        if (this.f7815F) {
            j = m11434c(this.f7850j.mo8707f() + m11435d(nanoTime - (this.f7850j.mo8706e() / 1000)));
        } else {
            j = this.f7812C == 0 ? this.f7850j.mo8704c() : nanoTime + this.f7813D;
            if (!z) {
                j -= this.f7828S;
            }
        }
        return this.f7826Q + m11431b(j);
    }

    /* renamed from: a */
    public C2670k mo8681a(C2670k kVar) {
        if (this.f7859s) {
            this.f7863w = C2670k.f9114a;
            return this.f7863w;
        }
        C2670k kVar2 = new C2670k(this.f7845e.mo8757a(kVar.f9115b), this.f7845e.mo8758b(kVar.f9116c));
        C2670k kVar3 = this.f7862v != null ? this.f7862v : !this.f7851k.isEmpty() ? ((C2447d) this.f7851k.getLast()).f7884a : this.f7863w;
        if (!kVar2.equals(kVar3)) {
            if (m11444s()) {
                this.f7862v = kVar2;
            } else {
                this.f7863w = kVar2;
            }
        }
        return this.f7863w;
    }

    /* renamed from: a */
    public void mo8682a() {
        this.f7838ac = true;
        if (m11444s()) {
            this.f7827R = System.nanoTime() / 1000;
            this.f7853m.play();
        }
    }

    /* renamed from: a */
    public void mo8683a(float f) {
        if (this.f7829T != f) {
            this.f7829T = f;
            m11439n();
        }
    }

    /* renamed from: a */
    public void mo8684a(int i) {
        if (this.f7858r != i) {
            this.f7858r = i;
            if (!this.f7840ae) {
                mo8696i();
                this.f7839ad = 0;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0148  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8685a(java.lang.String r9, int r10, int r11, int r12, int r13, int[] r14) {
        /*
            r8 = this;
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r9)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x000f
            int r9 = m11430b(r9)
            goto L_0x0010
        L_0x000f:
            r9 = r12
        L_0x0010:
            r2 = 0
            if (r0 != 0) goto L_0x004f
            int r12 = com.google.android.exoplayer2.p102c.C2511s.m11812b(r12, r10)
            r8.f7818I = r12
            com.google.android.exoplayer2.audio.d r12 = r8.f7844d
            r12.mo8733a(r14)
            com.google.android.exoplayer2.audio.AudioProcessor[] r12 = r8.f7846f
            int r14 = r12.length
            r4 = r9
            r3 = r10
            r9 = 0
            r10 = 0
        L_0x0025:
            if (r9 >= r14) goto L_0x0046
            r5 = r12[r9]
            boolean r6 = r5.mo8672a(r11, r3, r4)     // Catch:{ UnhandledFormatException -> 0x003f }
            r10 = r10 | r6
            boolean r6 = r5.mo8671a()
            if (r6 == 0) goto L_0x003c
            int r3 = r5.mo8673b()
            int r4 = r5.mo8674c()
        L_0x003c:
            int r9 = r9 + 1
            goto L_0x0025
        L_0x003f:
            r9 = move-exception
            com.google.android.exoplayer2.audio.AudioTrack$ConfigurationException r10 = new com.google.android.exoplayer2.audio.AudioTrack$ConfigurationException
            r10.<init>(r9)
            throw r10
        L_0x0046:
            if (r10 == 0) goto L_0x004b
            r8.m11436k()
        L_0x004b:
            r12 = r10
            r10 = r3
            r9 = r4
            goto L_0x0050
        L_0x004f:
            r12 = 0
        L_0x0050:
            r14 = 252(0xfc, float:3.53E-43)
            r3 = 12
            switch(r10) {
                case 1: goto L_0x0083;
                case 2: goto L_0x0080;
                case 3: goto L_0x007d;
                case 4: goto L_0x007a;
                case 5: goto L_0x0077;
                case 6: goto L_0x0074;
                case 7: goto L_0x0071;
                case 8: goto L_0x006e;
                default: goto L_0x0057;
            }
        L_0x0057:
            com.google.android.exoplayer2.audio.AudioTrack$ConfigurationException r9 = new com.google.android.exoplayer2.audio.AudioTrack$ConfigurationException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported channel count: "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x006e:
            int r4 = com.google.android.exoplayer2.C2468b.f7981a
            goto L_0x0084
        L_0x0071:
            r4 = 1276(0x4fc, float:1.788E-42)
            goto L_0x0084
        L_0x0074:
            r4 = 252(0xfc, float:3.53E-43)
            goto L_0x0084
        L_0x0077:
            r4 = 220(0xdc, float:3.08E-43)
            goto L_0x0084
        L_0x007a:
            r4 = 204(0xcc, float:2.86E-43)
            goto L_0x0084
        L_0x007d:
            r4 = 28
            goto L_0x0084
        L_0x0080:
            r4 = 12
            goto L_0x0084
        L_0x0083:
            r4 = 4
        L_0x0084:
            int r5 = com.google.android.exoplayer2.p102c.C2511s.f8123a
            r6 = 23
            r7 = 5
            if (r5 > r6) goto L_0x00ab
            java.lang.String r5 = "foster"
            java.lang.String r6 = com.google.android.exoplayer2.p102c.C2511s.f8124b
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00ab
            java.lang.String r5 = "NVIDIA"
            java.lang.String r6 = com.google.android.exoplayer2.p102c.C2511s.f8125c
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00ab
            r5 = 3
            if (r10 == r5) goto L_0x00ac
            if (r10 == r7) goto L_0x00ac
            r14 = 7
            if (r10 == r14) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            int r14 = com.google.android.exoplayer2.C2468b.f7981a
            goto L_0x00ac
        L_0x00ab:
            r14 = r4
        L_0x00ac:
            int r4 = com.google.android.exoplayer2.p102c.C2511s.f8123a
            r5 = 25
            if (r4 > r5) goto L_0x00c2
            java.lang.String r4 = "fugu"
            java.lang.String r5 = com.google.android.exoplayer2.p102c.C2511s.f8124b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c2
            if (r0 == 0) goto L_0x00c2
            if (r10 != r1) goto L_0x00c2
            r14 = 12
        L_0x00c2:
            if (r12 != 0) goto L_0x00d7
            boolean r12 = r8.m11444s()
            if (r12 == 0) goto L_0x00d7
            int r12 = r8.f7856p
            if (r12 != r9) goto L_0x00d7
            int r12 = r8.f7854n
            if (r12 != r11) goto L_0x00d7
            int r12 = r8.f7855o
            if (r12 != r14) goto L_0x00d7
            return
        L_0x00d7:
            r8.mo8696i()
            r8.f7856p = r9
            r8.f7859s = r0
            r8.f7854n = r11
            r8.f7855o = r14
            r12 = 2
            if (r0 == 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r9 = 2
        L_0x00e7:
            r8.f7857q = r9
            int r9 = com.google.android.exoplayer2.p102c.C2511s.m11812b(r12, r10)
            r8.f7821L = r9
            if (r13 == 0) goto L_0x00f4
            r8.f7860t = r13
            goto L_0x0140
        L_0x00f4:
            if (r0 == 0) goto L_0x0109
            int r9 = r8.f7857q
            if (r9 == r7) goto L_0x0104
            int r9 = r8.f7857q
            r10 = 6
            if (r9 != r10) goto L_0x0100
            goto L_0x0104
        L_0x0100:
            r9 = 49152(0xc000, float:6.8877E-41)
            goto L_0x0106
        L_0x0104:
            r9 = 20480(0x5000, float:2.8699E-41)
        L_0x0106:
            r8.f7860t = r9
            goto L_0x0140
        L_0x0109:
            int r9 = r8.f7857q
            int r9 = android.media.AudioTrack.getMinBufferSize(r11, r14, r9)
            r10 = -2
            if (r9 == r10) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r1 = 0
        L_0x0114:
            com.google.android.exoplayer2.p102c.C2488a.m11668b(r1)
            int r10 = r9 * 4
            r11 = 250000(0x3d090, double:1.235164E-318)
            long r11 = r8.m11435d(r11)
            int r11 = (int) r11
            int r12 = r8.f7821L
            int r11 = r11 * r12
            long r12 = (long) r9
            r1 = 750000(0xb71b0, double:3.70549E-318)
            long r1 = r8.m11435d(r1)
            int r9 = r8.f7821L
            long r3 = (long) r9
            long r1 = r1 * r3
            long r12 = java.lang.Math.max(r12, r1)
            int r9 = (int) r12
            if (r10 >= r11) goto L_0x013b
            r9 = r11
            goto L_0x0106
        L_0x013b:
            if (r10 <= r9) goto L_0x013e
            goto L_0x0106
        L_0x013e:
            r9 = r10
            goto L_0x0106
        L_0x0140:
            if (r0 == 0) goto L_0x0148
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0152
        L_0x0148:
            int r9 = r8.f7860t
            int r10 = r8.f7821L
            int r9 = r9 / r10
            long r9 = (long) r9
            long r9 = r8.m11434c(r9)
        L_0x0152:
            r8.f7861u = r9
            com.google.android.exoplayer2.k r9 = r8.f7863w
            r8.mo8681a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrack.mo8685a(java.lang.String, int, int, int, int, int[]):void");
    }

    /* renamed from: a */
    public boolean mo8686a(String str) {
        return this.f7843c != null && this.f7843c.mo8711a(m11430b(str));
    }

    /* renamed from: a */
    public boolean mo8687a(ByteBuffer byteBuffer, long j) {
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        C2488a.m11666a(this.f7832W == null || byteBuffer2 == this.f7832W);
        if (!m11444s()) {
            m11437l();
            if (this.f7838ac) {
                mo8682a();
            }
        }
        if (m11448w()) {
            if (this.f7853m.getPlayState() == 2) {
                this.f7841af = false;
                return false;
            } else if (this.f7853m.getPlayState() == 1 && this.f7850j.mo8703b() != 0) {
                return false;
            }
        }
        boolean z = this.f7841af;
        this.f7841af = mo8692e();
        if (z && !this.f7841af && this.f7853m.getPlayState() != 1) {
            this.f7847g.mo8710a(this.f7860t, C2468b.m11602a(this.f7861u), SystemClock.elapsedRealtime() - this.f7842ag);
        }
        if (this.f7832W == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f7859s && this.f7824O == 0) {
                this.f7824O = m11423a(this.f7857q, byteBuffer2);
            }
            if (this.f7862v != null) {
                if (!m11438m()) {
                    return false;
                }
                LinkedList<C2447d> linkedList = this.f7851k;
                C2447d dVar = r11;
                C2447d dVar2 = new C2447d(this.f7862v, Math.max(0, j2), m11434c(m11446u()));
                linkedList.add(dVar);
                this.f7862v = null;
                m11436k();
            }
            if (this.f7825P == 0) {
                this.f7826Q = Math.max(0, j2);
                this.f7825P = 1;
            } else {
                long c = this.f7826Q + m11434c(m11445t());
                if (this.f7825P != 1 || Math.abs(c - j2) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Discontinuity detected [expected ");
                    sb.append(c);
                    sb.append(", got ");
                    sb.append(j2);
                    sb.append("]");
                    Log.e("AudioTrack", sb.toString());
                    i = 2;
                    this.f7825P = 2;
                }
                if (this.f7825P == i) {
                    this.f7826Q += j2 - c;
                    this.f7825P = 1;
                    this.f7847g.mo8708a();
                }
            }
            if (this.f7859s) {
                this.f7820K += (long) this.f7824O;
            } else {
                this.f7819J += (long) byteBuffer.remaining();
            }
            this.f7832W = byteBuffer2;
        }
        if (this.f7859s) {
            m11433b(this.f7832W, j2);
        } else {
            m11428a(j2);
        }
        if (this.f7832W.hasRemaining()) {
            return false;
        }
        this.f7832W = null;
        return true;
    }

    /* renamed from: b */
    public void mo8688b() {
        if (this.f7825P == 1) {
            this.f7825P = 2;
        }
    }

    /* renamed from: b */
    public void mo8689b(int i) {
        C2488a.m11668b(C2511s.f8123a >= 21);
        if (!this.f7840ae || this.f7839ad != i) {
            this.f7840ae = true;
            this.f7839ad = i;
            mo8696i();
        }
    }

    /* renamed from: c */
    public void mo8690c() {
        if (!this.f7837ab && m11444s() && m11438m()) {
            this.f7850j.mo8701a(m11446u());
            this.f7810A = 0;
            this.f7837ab = true;
        }
    }

    /* renamed from: d */
    public boolean mo8691d() {
        return !m11444s() || (this.f7837ab && !mo8692e());
    }

    /* renamed from: e */
    public boolean mo8692e() {
        return m11444s() && (m11446u() > this.f7850j.mo8703b() || m11449x());
    }

    /* renamed from: f */
    public C2670k mo8693f() {
        return this.f7863w;
    }

    /* renamed from: g */
    public void mo8694g() {
        if (this.f7840ae) {
            this.f7840ae = false;
            this.f7839ad = 0;
            mo8696i();
        }
    }

    /* renamed from: h */
    public void mo8695h() {
        this.f7838ac = false;
        if (m11444s()) {
            m11447v();
            this.f7850j.mo8700a();
        }
    }

    /* renamed from: i */
    public void mo8696i() {
        if (m11444s()) {
            this.f7819J = 0;
            this.f7820K = 0;
            this.f7822M = 0;
            this.f7823N = 0;
            this.f7824O = 0;
            if (this.f7862v != null) {
                this.f7863w = this.f7862v;
                this.f7862v = null;
            } else if (!this.f7851k.isEmpty()) {
                this.f7863w = ((C2447d) this.f7851k.getLast()).f7884a;
            }
            this.f7851k.clear();
            this.f7864x = 0;
            this.f7865y = 0;
            this.f7832W = null;
            this.f7833X = null;
            for (int i = 0; i < this.f7830U.length; i++) {
                AudioProcessor audioProcessor = this.f7830U[i];
                audioProcessor.mo8678g();
                this.f7831V[i] = audioProcessor.mo8676e();
            }
            this.f7837ab = false;
            this.f7836aa = -1;
            this.f7866z = null;
            this.f7810A = 0;
            this.f7825P = 0;
            this.f7828S = 0;
            m11447v();
            if (this.f7853m.getPlayState() == 3) {
                this.f7853m.pause();
            }
            final android.media.AudioTrack audioTrack = this.f7853m;
            this.f7853m = null;
            this.f7850j.mo8702a(null, false);
            this.f7848h.close();
            new Thread() {
                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        AudioTrack.this.f7848h.open();
                    }
                }
            }.start();
        }
    }

    /* renamed from: j */
    public void mo8697j() {
        mo8696i();
        m11440o();
        for (AudioProcessor h : this.f7846f) {
            h.mo8679h();
        }
        this.f7839ad = 0;
        this.f7838ac = false;
    }
}
