package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.WindowManager;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.video.d */
public final class C2827d {

    /* renamed from: a */
    private final C2828a f9820a;

    /* renamed from: b */
    private final boolean f9821b;

    /* renamed from: c */
    private final long f9822c;

    /* renamed from: d */
    private final long f9823d;

    /* renamed from: e */
    private long f9824e;

    /* renamed from: f */
    private long f9825f;

    /* renamed from: g */
    private long f9826g;

    /* renamed from: h */
    private boolean f9827h;

    /* renamed from: i */
    private long f9828i;

    /* renamed from: j */
    private long f9829j;

    /* renamed from: k */
    private long f9830k;

    /* renamed from: com.google.android.exoplayer2.video.d$a */
    private static final class C2828a implements Callback, FrameCallback {

        /* renamed from: b */
        private static final C2828a f9831b = new C2828a();

        /* renamed from: a */
        public volatile long f9832a;

        /* renamed from: c */
        private final Handler f9833c;

        /* renamed from: d */
        private final HandlerThread f9834d = new HandlerThread("ChoreographerOwner:Handler");

        /* renamed from: e */
        private Choreographer f9835e;

        /* renamed from: f */
        private int f9836f;

        private C2828a() {
            this.f9834d.start();
            this.f9833c = new Handler(this.f9834d.getLooper(), this);
            this.f9833c.sendEmptyMessage(0);
        }

        /* renamed from: a */
        public static C2828a m13477a() {
            return f9831b;
        }

        /* renamed from: d */
        private void m13478d() {
            this.f9835e = Choreographer.getInstance();
        }

        /* renamed from: e */
        private void m13479e() {
            this.f9836f++;
            if (this.f9836f == 1) {
                this.f9835e.postFrameCallback(this);
            }
        }

        /* renamed from: f */
        private void m13480f() {
            this.f9836f--;
            if (this.f9836f == 0) {
                this.f9835e.removeFrameCallback(this);
                this.f9832a = 0;
            }
        }

        /* renamed from: b */
        public void mo9574b() {
            this.f9833c.sendEmptyMessage(1);
        }

        /* renamed from: c */
        public void mo9575c() {
            this.f9833c.sendEmptyMessage(2);
        }

        public void doFrame(long j) {
            this.f9832a = j;
            this.f9835e.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    m13478d();
                    return true;
                case 1:
                    m13479e();
                    return true;
                case 2:
                    m13480f();
                    return true;
                default:
                    return false;
            }
        }
    }

    public C2827d() {
        this(-1.0d, false);
    }

    private C2827d(double d, boolean z) {
        long j;
        this.f9821b = z;
        if (z) {
            this.f9820a = C2828a.m13477a();
            this.f9822c = (long) (1.0E9d / d);
            j = (this.f9822c * 80) / 100;
        } else {
            this.f9820a = null;
            j = -1;
            this.f9822c = -1;
        }
        this.f9823d = j;
    }

    public C2827d(Context context) {
        this((double) m13470a(context), true);
    }

    /* renamed from: a */
    private static float m13470a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }

    /* renamed from: a */
    private static long m13471a(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j5;
            j5 = j3 + j5;
            j4 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* renamed from: b */
    private boolean m13472b(long j, long j2) {
        return Math.abs((j2 - this.f9828i) - (j - this.f9829j)) > 20000000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo9570a(long r18, long r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r5 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r1
            boolean r7 = r0.f9827h
            if (r7 == 0) goto L_0x004d
            long r7 = r0.f9824e
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x001f
            long r7 = r0.f9830k
            r9 = 1
            long r7 = r7 + r9
            r0.f9830k = r7
            long r7 = r0.f9826g
            r0.f9825f = r7
        L_0x001f:
            long r7 = r0.f9830k
            r9 = 6
            r11 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x0045
            long r7 = r0.f9829j
            long r7 = r5 - r7
            long r9 = r0.f9830k
            long r7 = r7 / r9
            long r9 = r0.f9825f
            long r9 = r9 + r7
            boolean r7 = r0.m13472b(r9, r3)
            if (r7 == 0) goto L_0x003d
            r0.f9827h = r11
            r7 = r3
            r9 = r5
            goto L_0x0043
        L_0x003d:
            long r7 = r0.f9828i
            long r7 = r7 + r9
            long r11 = r0.f9829j
            long r7 = r7 - r11
        L_0x0043:
            r11 = r7
            goto L_0x004f
        L_0x0045:
            boolean r7 = r0.m13472b(r5, r3)
            if (r7 == 0) goto L_0x004d
            r0.f9827h = r11
        L_0x004d:
            r11 = r3
            r9 = r5
        L_0x004f:
            boolean r7 = r0.f9827h
            r13 = 0
            if (r7 != 0) goto L_0x0061
            r0.f9829j = r5
            r0.f9828i = r3
            r0.f9830k = r13
            r3 = 1
            r0.f9827h = r3
            r17.mo9573c()
        L_0x0061:
            r0.f9824e = r1
            r0.f9826g = r9
            com.google.android.exoplayer2.video.d$a r1 = r0.f9820a
            if (r1 == 0) goto L_0x0081
            com.google.android.exoplayer2.video.d$a r1 = r0.f9820a
            long r1 = r1.f9832a
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0072
            goto L_0x0081
        L_0x0072:
            com.google.android.exoplayer2.video.d$a r1 = r0.f9820a
            long r13 = r1.f9832a
            long r1 = r0.f9822c
            r15 = r1
            long r1 = m13471a(r11, r13, r15)
            long r3 = r0.f9823d
            long r1 = r1 - r3
            return r1
        L_0x0081:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.C2827d.mo9570a(long, long):long");
    }

    /* renamed from: a */
    public void mo9571a() {
        this.f9827h = false;
        if (this.f9821b) {
            this.f9820a.mo9574b();
        }
    }

    /* renamed from: b */
    public void mo9572b() {
        if (this.f9821b) {
            this.f9820a.mo9575c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9573c() {
    }
}
