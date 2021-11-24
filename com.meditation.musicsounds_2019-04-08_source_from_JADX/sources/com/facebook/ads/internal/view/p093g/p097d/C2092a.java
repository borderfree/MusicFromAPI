package com.facebook.ads.internal.view.p093g.p097d;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import com.facebook.ads.internal.p070l.C1714a;
import com.facebook.ads.internal.p070l.C1716b;
import com.facebook.ads.internal.settings.C1837b;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import com.google.android.exoplayer2.C2487c;
import com.google.android.exoplayer2.C2520e.C2521a;
import com.google.android.exoplayer2.C2660f;
import com.google.android.exoplayer2.C2669j;
import com.google.android.exoplayer2.C2670k;
import com.google.android.exoplayer2.C2713p;
import com.google.android.exoplayer2.C2713p.C2716b;
import com.google.android.exoplayer2.C2717q;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.extractor.C2543c;
import com.google.android.exoplayer2.p101b.C2469a.C2470a;
import com.google.android.exoplayer2.p101b.C2474c;
import com.google.android.exoplayer2.p101b.C2483g;
import com.google.android.exoplayer2.p101b.C2484h;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.source.C2729b;
import com.google.android.exoplayer2.source.C2733d;
import com.google.android.exoplayer2.source.C2740i;
import com.google.android.exoplayer2.upstream.C2809d;
import com.google.android.exoplayer2.upstream.C2813g;
import com.google.android.exoplayer2.upstream.C2816i;
import com.google.android.exoplayer2.upstream.C2819l;

@TargetApi(14)
/* renamed from: com.facebook.ads.internal.view.g.d.a */
public class C2092a extends TextureView implements SurfaceTextureListener, C2100c, C2521a, C2716b {

    /* renamed from: a */
    private static final String f6825a = "a";

    /* renamed from: b */
    private Uri f6826b;

    /* renamed from: c */
    private String f6827c;

    /* renamed from: d */
    private C2102e f6828d;

    /* renamed from: e */
    private Surface f6829e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2713p f6830f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MediaController f6831g;

    /* renamed from: h */
    private C2101d f6832h = C2101d.IDLE;

    /* renamed from: i */
    private C2101d f6833i = C2101d.IDLE;

    /* renamed from: j */
    private C2101d f6834j = C2101d.IDLE;

    /* renamed from: k */
    private boolean f6835k = false;

    /* renamed from: l */
    private View f6836l;

    /* renamed from: m */
    private boolean f6837m = false;

    /* renamed from: n */
    private boolean f6838n = false;

    /* renamed from: o */
    private long f6839o;

    /* renamed from: p */
    private long f6840p;

    /* renamed from: q */
    private long f6841q;

    /* renamed from: r */
    private int f6842r;

    /* renamed from: s */
    private int f6843s;

    /* renamed from: t */
    private float f6844t = 1.0f;

    /* renamed from: u */
    private int f6845u = -1;

    /* renamed from: v */
    private boolean f6846v = false;

    /* renamed from: w */
    private boolean f6847w = false;

    /* renamed from: x */
    private C2000a f6848x = C2000a.NOT_STARTED;

    /* renamed from: y */
    private boolean f6849y = false;

    public C2092a(Context context) {
        super(context);
    }

    /* renamed from: h */
    private void m9795h() {
        C2813g gVar = new C2813g();
        this.f6830f = C2660f.m12534a(getContext(), (C2484h) new C2474c(new C2470a(gVar)), (C2669j) new C2487c());
        this.f6830f.mo9300a((C2716b) this);
        this.f6830f.mo8917a((C2521a) this);
        this.f6830f.mo8919a(false);
        if (this.f6838n && !this.f6846v) {
            this.f6831g = new MediaController(getContext());
            this.f6831g.setAnchorView(this.f6836l == null ? this : this.f6836l);
            this.f6831g.setMediaPlayer(new MediaPlayerControl() {
                public boolean canPause() {
                    return true;
                }

                public boolean canSeekBackward() {
                    return true;
                }

                public boolean canSeekForward() {
                    return true;
                }

                public int getAudioSessionId() {
                    if (C2092a.this.f6830f != null) {
                        return C2092a.this.f6830f.mo9302i();
                    }
                    return 0;
                }

                public int getBufferPercentage() {
                    if (C2092a.this.f6830f != null) {
                        return C2092a.this.f6830f.mo8928g();
                    }
                    return 0;
                }

                public int getCurrentPosition() {
                    return C2092a.this.getCurrentPosition();
                }

                public int getDuration() {
                    return C2092a.this.getDuration();
                }

                public boolean isPlaying() {
                    return C2092a.this.f6830f != null && C2092a.this.f6830f.mo8921a();
                }

                public void pause() {
                    C2092a.this.mo7564a(true);
                }

                public void seekTo(int i) {
                    C2092a.this.mo7557a(i);
                }

                public void start() {
                    C2092a.this.mo7559a(C2000a.USER_STARTED);
                }
            });
            this.f6831g.setEnabled(true);
        }
        if (this.f6827c == null || this.f6827c.length() == 0 || this.f6849y) {
            C2729b bVar = new C2729b(this.f6826b, new C2816i(getContext(), C2511s.m11802a(getContext(), "ads"), (C2819l<? super C2809d>) gVar), new C2543c(), null, null);
            this.f6830f.mo8918a((C2733d) bVar);
        }
        setVideoState(C2101d.PREPARING);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    /* renamed from: i */
    private void m9796i() {
        if (this.f6829e != null) {
            this.f6829e.release();
            this.f6829e = null;
        }
        if (this.f6830f != null) {
            this.f6830f.mo8925d();
            this.f6830f = null;
        }
        this.f6831g = null;
        this.f6837m = false;
        setVideoState(C2101d.IDLE);
    }

    private void setVideoState(C2101d dVar) {
        if (dVar != this.f6832h) {
            this.f6832h = dVar;
            if (this.f6832h == C2101d.STARTED) {
                this.f6837m = true;
            }
            if (this.f6828d != null) {
                this.f6828d.mo7424a(dVar);
            }
        }
    }

    /* renamed from: a */
    public void mo7556a() {
    }

    /* renamed from: a */
    public void mo7557a(int i) {
        if (this.f6830f != null) {
            this.f6845u = getCurrentPosition();
            this.f6830f.mo8916a((long) i);
            return;
        }
        this.f6841q = (long) i;
    }

    /* renamed from: a */
    public void mo7558a(int i, int i2, int i3, float f) {
        this.f6842r = i;
        this.f6843s = i2;
        if (this.f6842r != 0 && this.f6843s != 0) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void mo7559a(C2000a aVar) {
        this.f6833i = C2101d.STARTED;
        this.f6848x = aVar;
        if (this.f6830f == null) {
            setup(this.f6826b);
        } else if (this.f6832h == C2101d.PREPARED || this.f6832h == C2101d.PAUSED || this.f6832h == C2101d.PLAYBACK_COMPLETED) {
            this.f6830f.mo8919a(true);
            setVideoState(C2101d.STARTED);
        }
    }

    /* renamed from: a */
    public void mo7560a(ExoPlaybackException exoPlaybackException) {
        setVideoState(C2101d.ERROR);
        exoPlaybackException.printStackTrace();
        C1716b.m8601a(C1714a.m8600a(exoPlaybackException, "[ExoPlayer] Error during playback of ExoPlayer"));
    }

    /* renamed from: a */
    public void mo7561a(C2670k kVar) {
    }

    /* renamed from: a */
    public void mo7562a(C2717q qVar, Object obj) {
    }

    /* renamed from: a */
    public void mo7563a(C2740i iVar, C2483g gVar) {
    }

    /* renamed from: a */
    public void mo7564a(boolean z) {
        if (this.f6830f != null) {
            this.f6830f.mo8919a(false);
        } else {
            setVideoState(C2101d.IDLE);
        }
    }

    /* renamed from: a */
    public void mo7565a(boolean z, int i) {
        C2101d dVar;
        switch (i) {
            case 1:
                dVar = C2101d.IDLE;
                break;
            case 2:
                if (this.f6845u >= 0) {
                    int i2 = this.f6845u;
                    this.f6845u = -1;
                    this.f6828d.mo7421a(i2, getCurrentPosition());
                    return;
                }
                return;
            case 3:
                if (this.f6839o != 0) {
                    this.f6840p = System.currentTimeMillis() - this.f6839o;
                }
                setRequestedVolume(this.f6844t);
                if (this.f6841q > 0 && this.f6841q < this.f6830f.mo8926e()) {
                    this.f6830f.mo8916a(this.f6841q);
                    this.f6841q = 0;
                }
                if (this.f6830f.mo8927f() != 0 && !z && this.f6837m) {
                    dVar = C2101d.PAUSED;
                    break;
                } else if (!z && this.f6832h != C2101d.PLAYBACK_COMPLETED) {
                    setVideoState(C2101d.PREPARED);
                    if (this.f6833i == C2101d.STARTED) {
                        mo7559a(this.f6848x);
                        this.f6833i = C2101d.IDLE;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                if (z) {
                    setVideoState(C2101d.PLAYBACK_COMPLETED);
                }
                if (this.f6830f != null) {
                    this.f6830f.mo8919a(false);
                    if (!z) {
                        this.f6830f.mo8922b();
                    }
                }
                this.f6837m = false;
                return;
            default:
                return;
        }
        setVideoState(dVar);
    }

    /* renamed from: b */
    public void mo7566b() {
        if (!this.f6847w) {
            mo7564a(false);
        }
    }

    /* renamed from: b */
    public void mo7567b(boolean z) {
    }

    /* renamed from: c */
    public void mo7568c() {
        setVideoState(C2101d.PLAYBACK_COMPLETED);
        mo7569d();
        this.f6841q = 0;
    }

    /* renamed from: d */
    public void mo7569d() {
        this.f6833i = C2101d.IDLE;
        if (this.f6830f != null) {
            this.f6830f.mo8924c();
            this.f6830f.mo8925d();
            this.f6830f = null;
        }
        setVideoState(C2101d.IDLE);
    }

    /* renamed from: e */
    public boolean mo7570e() {
        return (this.f6830f == null || this.f6830f.mo9301h() == null) ? false : true;
    }

    /* renamed from: f */
    public void mo7571f() {
    }

    /* renamed from: g */
    public void mo7572g() {
        m9796i();
    }

    public int getCurrentPosition() {
        if (this.f6830f != null) {
            return (int) this.f6830f.mo8927f();
        }
        return 0;
    }

    public int getDuration() {
        if (this.f6830f == null) {
            return 0;
        }
        return (int) this.f6830f.mo8926e();
    }

    public long getInitialBufferTime() {
        return this.f6840p;
    }

    public C2000a getStartReason() {
        return this.f6848x;
    }

    public C2101d getState() {
        return this.f6832h;
    }

    public C2101d getTargetState() {
        return this.f6833i;
    }

    public int getVideoHeight() {
        return this.f6843s;
    }

    public int getVideoWidth() {
        return this.f6842r;
    }

    public View getView() {
        return this;
    }

    public float getVolume() {
        return this.f6844t;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f6829e != null) {
            this.f6829e.release();
        }
        this.f6829e = new Surface(surfaceTexture);
        if (this.f6830f != null) {
            this.f6830f.mo9299a(this.f6829e);
            this.f6835k = false;
            if (this.f6832h == C2101d.PAUSED && this.f6834j != C2101d.PAUSED) {
                mo7559a(this.f6848x);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.f6829e != null) {
            this.f6829e.release();
            this.f6829e = null;
            if (this.f6830f != null) {
                this.f6830f.mo9299a((Surface) null);
            }
        }
        if (!this.f6835k) {
            this.f6834j = this.f6838n ? C2101d.STARTED : this.f6832h;
            this.f6835k = true;
        }
        if (this.f6832h != C2101d.PAUSED) {
            mo7564a(false);
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f6830f != null) {
            if (this.f6831g == null || !this.f6831g.isShowing()) {
                if (!z) {
                    if (!this.f6835k) {
                        this.f6834j = this.f6838n ? C2101d.STARTED : this.f6832h;
                        this.f6835k = true;
                    }
                    if (this.f6832h != C2101d.PAUSED) {
                        mo7566b();
                    }
                } else {
                    this.f6835k = false;
                    if (this.f6832h == C2101d.PAUSED && this.f6834j != C2101d.PAUSED) {
                        mo7559a(this.f6848x);
                    }
                }
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else if (C1837b.m9009d()) {
            Log.w(f6825a, "Google always throw an exception with setBackgroundDrawable on Nougat above. so we silently ignore it.");
        }
    }

    public void setBackgroundPlaybackEnabled(boolean z) {
        this.f6847w = z;
    }

    public void setControlsAnchorView(View view) {
        this.f6836l = view;
        view.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (C2092a.this.f6831g != null && motionEvent.getAction() == 1) {
                    if (C2092a.this.f6831g.isShowing()) {
                        C2092a.this.f6831g.hide();
                    } else {
                        C2092a.this.f6831g.show();
                    }
                }
                return true;
            }
        });
    }

    public void setForeground(Drawable drawable) {
        if (VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else if (C1837b.m9009d()) {
            Log.w(f6825a, "Google always throw an exception with setForeground on Nougat above. so we silently ignore it.");
        }
    }

    public void setFullScreen(boolean z) {
        this.f6838n = z;
        if (z && !this.f6846v) {
            setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (C2092a.this.f6831g != null && motionEvent.getAction() == 1) {
                        if (C2092a.this.f6831g.isShowing()) {
                            C2092a.this.f6831g.hide();
                        } else {
                            C2092a.this.f6831g.show();
                        }
                    }
                    return true;
                }
            });
        }
    }

    public void setRequestedVolume(float f) {
        this.f6844t = f;
        if (this.f6830f != null && this.f6832h != C2101d.PREPARING && this.f6832h != C2101d.IDLE) {
            this.f6830f.mo9298a(f);
        }
    }

    public void setTestMode(boolean z) {
        this.f6849y = z;
    }

    public void setVideoMPD(String str) {
        this.f6827c = str;
    }

    public void setVideoStateChangeListener(C2102e eVar) {
        this.f6828d = eVar;
    }

    public void setup(Uri uri) {
        if (this.f6830f != null) {
            m9796i();
        }
        this.f6826b = uri;
        setSurfaceTextureListener(this);
        m9795h();
    }
}
