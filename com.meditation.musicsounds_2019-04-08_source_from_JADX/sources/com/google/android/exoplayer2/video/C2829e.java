package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p100a.C2437d;
import com.google.android.exoplayer2.p102c.C2488a;

/* renamed from: com.google.android.exoplayer2.video.e */
public interface C2829e {

    /* renamed from: com.google.android.exoplayer2.video.e$a */
    public static final class C2830a {

        /* renamed from: a */
        private final Handler f9837a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C2829e f9838b;

        public C2830a(Handler handler, C2829e eVar) {
            this.f9837a = eVar != null ? (Handler) C2488a.m11664a(handler) : null;
            this.f9838b = eVar;
        }

        /* renamed from: a */
        public void mo9578a(int i, int i2, int i3, float f) {
            if (this.f9838b != null) {
                Handler handler = this.f9837a;
                final int i4 = i;
                final int i5 = i2;
                final int i6 = i3;
                final float f2 = f;
                C28355 r1 = new Runnable() {
                    public void run() {
                        C2830a.this.f9838b.mo9303a(i4, i5, i6, f2);
                    }
                };
                handler.post(r1);
            }
        }

        /* renamed from: a */
        public void mo9579a(final int i, final long j) {
            if (this.f9838b != null) {
                this.f9837a.post(new Runnable() {
                    public void run() {
                        C2830a.this.f9838b.mo9304a(i, j);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo9580a(final Surface surface) {
            if (this.f9838b != null) {
                this.f9837a.post(new Runnable() {
                    public void run() {
                        C2830a.this.f9838b.mo9305a(surface);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo9581a(final Format format) {
            if (this.f9838b != null) {
                this.f9837a.post(new Runnable() {
                    public void run() {
                        C2830a.this.f9838b.mo9306a(format);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo9582a(final C2437d dVar) {
            if (this.f9838b != null) {
                this.f9837a.post(new Runnable() {
                    public void run() {
                        C2830a.this.f9838b.mo9307a(dVar);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo9583a(String str, long j, long j2) {
            if (this.f9838b != null) {
                Handler handler = this.f9837a;
                final String str2 = str;
                final long j3 = j;
                final long j4 = j2;
                C28322 r1 = new Runnable() {
                    public void run() {
                        C2830a.this.f9838b.mo9308a(str2, j3, j4);
                    }
                };
                handler.post(r1);
            }
        }

        /* renamed from: b */
        public void mo9584b(final C2437d dVar) {
            if (this.f9838b != null) {
                this.f9837a.post(new Runnable() {
                    public void run() {
                        dVar.mo8656a();
                        C2830a.this.f9838b.mo9310b(dVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo9303a(int i, int i2, int i3, float f);

    /* renamed from: a */
    void mo9304a(int i, long j);

    /* renamed from: a */
    void mo9305a(Surface surface);

    /* renamed from: a */
    void mo9306a(Format format);

    /* renamed from: a */
    void mo9307a(C2437d dVar);

    /* renamed from: a */
    void mo9308a(String str, long j, long j2);

    /* renamed from: b */
    void mo9310b(C2437d dVar);
}
