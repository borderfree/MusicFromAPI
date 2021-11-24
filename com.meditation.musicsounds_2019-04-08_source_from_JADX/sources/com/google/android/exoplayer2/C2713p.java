package com.google.android.exoplayer2;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.exoplayer2.C2520e.C2521a;
import com.google.android.exoplayer2.C2520e.C2523c;
import com.google.android.exoplayer2.audio.C2452c;
import com.google.android.exoplayer2.metadata.C2686d.C2687a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p100a.C2437d;
import com.google.android.exoplayer2.p101b.C2484h;
import com.google.android.exoplayer2.source.C2733d;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2796i.C2797a;
import com.google.android.exoplayer2.video.C2829e;
import java.util.List;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.p */
public class C2713p implements C2520e {

    /* renamed from: a */
    protected final C2671l[] f9269a;

    /* renamed from: b */
    private final C2520e f9270b;

    /* renamed from: c */
    private final C2715a f9271c = new C2715a();

    /* renamed from: d */
    private final int f9272d;

    /* renamed from: e */
    private final int f9273e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Format f9274f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Format f9275g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Surface f9276h;

    /* renamed from: i */
    private boolean f9277i;

    /* renamed from: j */
    private int f9278j;

    /* renamed from: k */
    private SurfaceHolder f9279k;

    /* renamed from: l */
    private TextureView f9280l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C2797a f9281m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C2687a f9282n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C2716b f9283o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2452c f9284p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C2829e f9285q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C2437d f9286r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C2437d f9287s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f9288t;

    /* renamed from: u */
    private int f9289u;

    /* renamed from: v */
    private float f9290v;

    /* renamed from: com.google.android.exoplayer2.p$a */
    private final class C2715a implements Callback, SurfaceTextureListener, C2452c, C2687a, C2797a, C2829e {
        private C2715a() {
        }

        /* renamed from: a */
        public void mo8715a(int i) {
            C2713p.this.f9288t = i;
            if (C2713p.this.f9284p != null) {
                C2713p.this.f9284p.mo8715a(i);
            }
        }

        /* renamed from: a */
        public void mo9303a(int i, int i2, int i3, float f) {
            if (C2713p.this.f9283o != null) {
                C2713p.this.f9283o.mo7558a(i, i2, i3, f);
            }
            if (C2713p.this.f9285q != null) {
                C2713p.this.f9285q.mo9303a(i, i2, i3, f);
            }
        }

        /* renamed from: a */
        public void mo9304a(int i, long j) {
            if (C2713p.this.f9285q != null) {
                C2713p.this.f9285q.mo9304a(i, j);
            }
        }

        /* renamed from: a */
        public void mo8716a(int i, long j, long j2) {
            if (C2713p.this.f9284p != null) {
                C2713p.this.f9284p.mo8716a(i, j, j2);
            }
        }

        /* renamed from: a */
        public void mo9305a(Surface surface) {
            if (C2713p.this.f9283o != null && C2713p.this.f9276h == surface) {
                C2713p.this.f9283o.mo7556a();
            }
            if (C2713p.this.f9285q != null) {
                C2713p.this.f9285q.mo9305a(surface);
            }
        }

        /* renamed from: a */
        public void mo9306a(Format format) {
            C2713p.this.f9274f = format;
            if (C2713p.this.f9285q != null) {
                C2713p.this.f9285q.mo9306a(format);
            }
        }

        /* renamed from: a */
        public void mo9307a(C2437d dVar) {
            C2713p.this.f9286r = dVar;
            if (C2713p.this.f9285q != null) {
                C2713p.this.f9285q.mo9307a(dVar);
            }
        }

        /* renamed from: a */
        public void mo9195a(Metadata metadata) {
            if (C2713p.this.f9282n != null) {
                C2713p.this.f9282n.mo9195a(metadata);
            }
        }

        /* renamed from: a */
        public void mo9308a(String str, long j, long j2) {
            if (C2713p.this.f9285q != null) {
                C2713p.this.f9285q.mo9308a(str, j, j2);
            }
        }

        /* renamed from: a */
        public void mo9309a(List<C2741a> list) {
            if (C2713p.this.f9281m != null) {
                C2713p.this.f9281m.mo9309a(list);
            }
        }

        /* renamed from: b */
        public void mo8717b(Format format) {
            C2713p.this.f9275g = format;
            if (C2713p.this.f9284p != null) {
                C2713p.this.f9284p.mo8717b(format);
            }
        }

        /* renamed from: b */
        public void mo9310b(C2437d dVar) {
            if (C2713p.this.f9285q != null) {
                C2713p.this.f9285q.mo9310b(dVar);
            }
            C2713p.this.f9274f = null;
            C2713p.this.f9286r = null;
        }

        /* renamed from: b */
        public void mo8718b(String str, long j, long j2) {
            if (C2713p.this.f9284p != null) {
                C2713p.this.f9284p.mo8718b(str, j, j2);
            }
        }

        /* renamed from: c */
        public void mo8719c(C2437d dVar) {
            C2713p.this.f9287s = dVar;
            if (C2713p.this.f9284p != null) {
                C2713p.this.f9284p.mo8719c(dVar);
            }
        }

        /* renamed from: d */
        public void mo8720d(C2437d dVar) {
            if (C2713p.this.f9284p != null) {
                C2713p.this.f9284p.mo8720d(dVar);
            }
            C2713p.this.f9275g = null;
            C2713p.this.f9287s = null;
            C2713p.this.f9288t = 0;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C2713p.this.m12833a(new Surface(surfaceTexture), true);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C2713p.this.m12833a((Surface) null, true);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C2713p.this.m12833a(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C2713p.this.m12833a((Surface) null, false);
        }
    }

    /* renamed from: com.google.android.exoplayer2.p$b */
    public interface C2716b {
        /* renamed from: a */
        void mo7556a();

        /* renamed from: a */
        void mo7558a(int i, int i2, int i3, float f);
    }

    protected C2713p(C2712o oVar, C2484h hVar, C2669j jVar) {
        this.f9269a = oVar.mo8889a(new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()), this.f9271c, this.f9271c, this.f9271c, this.f9271c);
        int i = 0;
        int i2 = 0;
        for (C2671l a : this.f9269a) {
            switch (a.mo8612a()) {
                case 1:
                    i2++;
                    break;
                case 2:
                    i++;
                    break;
            }
        }
        this.f9272d = i;
        this.f9273e = i2;
        this.f9290v = 1.0f;
        this.f9288t = 0;
        this.f9289u = 3;
        this.f9278j = 1;
        this.f9270b = new C2661g(this.f9269a, hVar, jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12833a(Surface surface, boolean z) {
        C2671l[] lVarArr;
        C2523c[] cVarArr = new C2523c[this.f9272d];
        int i = 0;
        for (C2671l lVar : this.f9269a) {
            if (lVar.mo8612a() == 2) {
                int i2 = i + 1;
                cVarArr[i] = new C2523c(lVar, 1, surface);
                i = i2;
            }
        }
        if (this.f9276h == null || this.f9276h == surface) {
            this.f9270b.mo8920a(cVarArr);
        } else {
            if (this.f9277i) {
                this.f9276h.release();
            }
            this.f9270b.mo8923b(cVarArr);
        }
        this.f9276h = surface;
        this.f9277i = z;
    }

    /* renamed from: j */
    private void m12842j() {
        if (this.f9280l != null) {
            if (this.f9280l.getSurfaceTextureListener() != this.f9271c) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f9280l.setSurfaceTextureListener(null);
            }
            this.f9280l = null;
        }
        if (this.f9279k != null) {
            this.f9279k.removeCallback(this.f9271c);
            this.f9279k = null;
        }
    }

    /* renamed from: a */
    public void mo9298a(float f) {
        C2671l[] lVarArr;
        this.f9290v = f;
        C2523c[] cVarArr = new C2523c[this.f9273e];
        int i = 0;
        for (C2671l lVar : this.f9269a) {
            if (lVar.mo8612a() == 1) {
                int i2 = i + 1;
                cVarArr[i] = new C2523c(lVar, 2, Float.valueOf(f));
                i = i2;
            }
        }
        this.f9270b.mo8920a(cVarArr);
    }

    /* renamed from: a */
    public void mo8916a(long j) {
        this.f9270b.mo8916a(j);
    }

    /* renamed from: a */
    public void mo9299a(Surface surface) {
        m12842j();
        m12833a(surface, false);
    }

    /* renamed from: a */
    public void mo8917a(C2521a aVar) {
        this.f9270b.mo8917a(aVar);
    }

    /* renamed from: a */
    public void mo9300a(C2716b bVar) {
        this.f9283o = bVar;
    }

    /* renamed from: a */
    public void mo8918a(C2733d dVar) {
        this.f9270b.mo8918a(dVar);
    }

    /* renamed from: a */
    public void mo8919a(boolean z) {
        this.f9270b.mo8919a(z);
    }

    /* renamed from: a */
    public void mo8920a(C2523c... cVarArr) {
        this.f9270b.mo8920a(cVarArr);
    }

    /* renamed from: a */
    public boolean mo8921a() {
        return this.f9270b.mo8921a();
    }

    /* renamed from: b */
    public void mo8922b() {
        this.f9270b.mo8922b();
    }

    /* renamed from: b */
    public void mo8923b(C2523c... cVarArr) {
        this.f9270b.mo8923b(cVarArr);
    }

    /* renamed from: c */
    public void mo8924c() {
        this.f9270b.mo8924c();
    }

    /* renamed from: d */
    public void mo8925d() {
        this.f9270b.mo8925d();
        m12842j();
        if (this.f9276h != null) {
            if (this.f9277i) {
                this.f9276h.release();
            }
            this.f9276h = null;
        }
    }

    /* renamed from: e */
    public long mo8926e() {
        return this.f9270b.mo8926e();
    }

    /* renamed from: f */
    public long mo8927f() {
        return this.f9270b.mo8927f();
    }

    /* renamed from: g */
    public int mo8928g() {
        return this.f9270b.mo8928g();
    }

    /* renamed from: h */
    public Format mo9301h() {
        return this.f9275g;
    }

    /* renamed from: i */
    public int mo9302i() {
        return this.f9288t;
    }
}
