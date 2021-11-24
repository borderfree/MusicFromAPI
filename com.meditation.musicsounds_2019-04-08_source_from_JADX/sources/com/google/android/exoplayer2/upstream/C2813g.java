package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2504o;
import com.google.android.exoplayer2.upstream.C2807c.C2808a;

/* renamed from: com.google.android.exoplayer2.upstream.g */
public final class C2813g implements C2807c, C2819l<Object> {

    /* renamed from: a */
    private final Handler f9732a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2808a f9733b;

    /* renamed from: c */
    private final C2504o f9734c;

    /* renamed from: d */
    private int f9735d;

    /* renamed from: e */
    private long f9736e;

    /* renamed from: f */
    private long f9737f;

    /* renamed from: g */
    private long f9738g;

    /* renamed from: h */
    private long f9739h;

    /* renamed from: i */
    private long f9740i;

    public C2813g() {
        this(null, null);
    }

    public C2813g(Handler handler, C2808a aVar) {
        this(handler, aVar, 2000);
    }

    public C2813g(Handler handler, C2808a aVar, int i) {
        this.f9732a = handler;
        this.f9733b = aVar;
        this.f9734c = new C2504o(i);
        this.f9740i = -1;
    }

    /* renamed from: a */
    private void m13393a(int i, long j, long j2) {
        if (this.f9732a != null && this.f9733b != null) {
            Handler handler = this.f9732a;
            final int i2 = i;
            final long j3 = j;
            final long j4 = j2;
            C28141 r1 = new Runnable() {
                public void run() {
                    C2813g.this.f9733b.mo9545a(i2, j3, j4);
                }
            };
            handler.post(r1);
        }
    }

    /* renamed from: a */
    public synchronized long mo9544a() {
        return this.f9740i;
    }

    /* renamed from: a */
    public synchronized void mo9551a(Object obj) {
        C2488a.m11668b(this.f9735d > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.f9736e);
        long j = (long) i;
        this.f9738g += j;
        this.f9739h += this.f9737f;
        if (i > 0) {
            this.f9734c.mo8866a((int) Math.sqrt((double) this.f9737f), (float) ((this.f9737f * 8000) / j));
            if (this.f9738g >= 2000 || this.f9739h >= 524288) {
                float a = this.f9734c.mo8865a(0.5f);
                this.f9740i = Float.isNaN(a) ? -1 : (long) a;
            }
        }
        m13393a(i, this.f9737f, this.f9740i);
        int i2 = this.f9735d - 1;
        this.f9735d = i2;
        if (i2 > 0) {
            this.f9736e = elapsedRealtime;
        }
        this.f9737f = 0;
    }

    /* renamed from: a */
    public synchronized void mo9552a(Object obj, int i) {
        this.f9737f += (long) i;
    }

    /* renamed from: a */
    public synchronized void mo9553a(Object obj, C2811e eVar) {
        if (this.f9735d == 0) {
            this.f9736e = SystemClock.elapsedRealtime();
        }
        this.f9735d++;
    }
}
