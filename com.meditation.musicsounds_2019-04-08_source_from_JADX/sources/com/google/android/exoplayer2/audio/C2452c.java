package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p100a.C2437d;
import com.google.android.exoplayer2.p102c.C2488a;

/* renamed from: com.google.android.exoplayer2.audio.c */
public interface C2452c {

    /* renamed from: com.google.android.exoplayer2.audio.c$a */
    public static final class C2453a {

        /* renamed from: a */
        private final Handler f7901a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C2452c f7902b;

        public C2453a(Handler handler, C2452c cVar) {
            this.f7901a = cVar != null ? (Handler) C2488a.m11664a(handler) : null;
            this.f7902b = cVar;
        }

        /* renamed from: a */
        public void mo8721a(final int i) {
            if (this.f7902b != null) {
                this.f7901a.post(new Runnable() {
                    public void run() {
                        C2453a.this.f7902b.mo8715a(i);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo8722a(int i, long j, long j2) {
            if (this.f7902b != null) {
                Handler handler = this.f7901a;
                final int i2 = i;
                final long j3 = j;
                final long j4 = j2;
                C24574 r1 = new Runnable() {
                    public void run() {
                        C2453a.this.f7902b.mo8716a(i2, j3, j4);
                    }
                };
                handler.post(r1);
            }
        }

        /* renamed from: a */
        public void mo8723a(final Format format) {
            if (this.f7902b != null) {
                this.f7901a.post(new Runnable() {
                    public void run() {
                        C2453a.this.f7902b.mo8717b(format);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo8724a(final C2437d dVar) {
            if (this.f7902b != null) {
                this.f7901a.post(new Runnable() {
                    public void run() {
                        C2453a.this.f7902b.mo8719c(dVar);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo8725a(String str, long j, long j2) {
            if (this.f7902b != null) {
                Handler handler = this.f7901a;
                final String str2 = str;
                final long j3 = j;
                final long j4 = j2;
                C24552 r1 = new Runnable() {
                    public void run() {
                        C2453a.this.f7902b.mo8718b(str2, j3, j4);
                    }
                };
                handler.post(r1);
            }
        }

        /* renamed from: b */
        public void mo8726b(final C2437d dVar) {
            if (this.f7902b != null) {
                this.f7901a.post(new Runnable() {
                    public void run() {
                        dVar.mo8656a();
                        C2453a.this.f7902b.mo8720d(dVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo8715a(int i);

    /* renamed from: a */
    void mo8716a(int i, long j, long j2);

    /* renamed from: b */
    void mo8717b(Format format);

    /* renamed from: b */
    void mo8718b(String str, long j, long j2);

    /* renamed from: c */
    void mo8719c(C2437d dVar);

    /* renamed from: d */
    void mo8720d(C2437d dVar);
}
