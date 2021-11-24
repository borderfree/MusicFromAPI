package com.facebook.ads.internal.view.p093g.p097d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer.TrackInfo;
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
import com.facebook.ads.internal.p077s.p081d.C1831a;
import com.facebook.ads.internal.p077s.p081d.C1832b;
import com.facebook.ads.internal.settings.C1837b;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;

@TargetApi(14)
/* renamed from: com.facebook.ads.internal.view.g.d.b */
public class C2096b extends TextureView implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnVideoSizeChangedListener, SurfaceTextureListener, C2100c {

    /* renamed from: t */
    private static final String f6853t = "b";

    /* renamed from: a */
    private Uri f6854a;

    /* renamed from: b */
    private C2102e f6855b;

    /* renamed from: c */
    private Surface f6856c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public MediaPlayer f6857d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public MediaController f6858e;

    /* renamed from: f */
    private C2101d f6859f = C2101d.IDLE;

    /* renamed from: g */
    private C2101d f6860g = C2101d.IDLE;

    /* renamed from: h */
    private C2101d f6861h = C2101d.IDLE;

    /* renamed from: i */
    private boolean f6862i = false;

    /* renamed from: j */
    private View f6863j;

    /* renamed from: k */
    private int f6864k = 0;

    /* renamed from: l */
    private long f6865l;

    /* renamed from: m */
    private int f6866m = 0;

    /* renamed from: n */
    private int f6867n = 0;

    /* renamed from: o */
    private float f6868o = 1.0f;

    /* renamed from: p */
    private boolean f6869p = false;

    /* renamed from: q */
    private int f6870q = 3;

    /* renamed from: r */
    private boolean f6871r = false;

    /* renamed from: s */
    private boolean f6872s = false;

    /* renamed from: u */
    private int f6873u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f6874v = false;

    /* renamed from: w */
    private C2000a f6875w = C2000a.NOT_STARTED;

    /* renamed from: x */
    private final MediaPlayerControl f6876x = new MediaPlayerControl() {
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
            if (C2096b.this.f6857d != null) {
                return C2096b.this.f6857d.getAudioSessionId();
            }
            return 0;
        }

        public int getBufferPercentage() {
            return 0;
        }

        public int getCurrentPosition() {
            return C2096b.this.getCurrentPosition();
        }

        public int getDuration() {
            return C2096b.this.getDuration();
        }

        public boolean isPlaying() {
            return C2096b.this.f6857d != null && C2096b.this.f6857d.isPlaying();
        }

        public void pause() {
            C2096b.this.mo7564a(true);
        }

        public void seekTo(int i) {
            C2096b.this.mo7557a(i);
        }

        public void start() {
            C2096b.this.mo7559a(C2000a.USER_STARTED);
        }
    };

    public C2096b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private boolean m9815a() {
        return this.f6859f == C2101d.PREPARED || this.f6859f == C2101d.STARTED || this.f6859f == C2101d.PAUSED || this.f6859f == C2101d.PLAYBACK_COMPLETED;
    }

    /* renamed from: a */
    private boolean m9816a(Surface surface) {
        if (this.f6857d == null) {
            return false;
        }
        try {
            this.f6857d.setSurface(surface);
            return true;
        } catch (IllegalStateException e) {
            C1831a.m8998a(getContext(), "player", C1832b.f6009w, (Exception) e);
            Log.d(f6853t, "The MediaPlayer failed", e);
            return false;
        }
    }

    /* renamed from: f */
    private boolean m9819f() {
        if (this.f6857d == null) {
            return false;
        }
        try {
            this.f6857d.reset();
            return true;
        } catch (IllegalStateException e) {
            C1831a.m8998a(getContext(), "player", C1832b.f6010x, (Exception) e);
            Log.d(f6853t, "The MediaPlayer failed", e);
            return false;
        }
    }

    /* renamed from: h */
    private boolean m9820h() {
        return (this.f6859f == C2101d.PREPARING || this.f6859f == C2101d.PREPARED) ? false : true;
    }

    /* renamed from: i */
    private boolean m9821i() {
        return (this.f6859f == C2101d.PREPARING || this.f6859f == C2101d.PREPARED) ? false : true;
    }

    private void setVideoState(C2101d dVar) {
        if (dVar != this.f6859f) {
            this.f6859f = dVar;
            if (this.f6855b != null) {
                this.f6855b.mo7424a(dVar);
            }
        }
    }

    /* renamed from: a */
    public void mo7557a(int i) {
        if (this.f6857d == null || !m9815a()) {
            this.f6864k = i;
        } else if (i < getDuration() && i > 0) {
            this.f6873u = getCurrentPosition();
            this.f6864k = i;
            this.f6857d.seekTo(i);
        }
    }

    /* renamed from: a */
    public void mo7559a(C2000a aVar) {
        this.f6860g = C2101d.STARTED;
        this.f6875w = aVar;
        if (this.f6859f == C2101d.STARTED || this.f6859f == C2101d.PREPARED || this.f6859f == C2101d.IDLE || this.f6859f == C2101d.PAUSED || this.f6859f == C2101d.PLAYBACK_COMPLETED) {
            if (this.f6857d == null) {
                setup(this.f6854a);
            } else {
                if (this.f6864k > 0) {
                    this.f6857d.seekTo(this.f6864k);
                }
                this.f6857d.start();
                if (this.f6859f != C2101d.PREPARED || this.f6872s) {
                    setVideoState(C2101d.STARTED);
                }
            }
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    /* renamed from: a */
    public void mo7564a(boolean z) {
        C2101d dVar;
        this.f6860g = C2101d.PAUSED;
        if (this.f6857d == null) {
            dVar = C2101d.IDLE;
        } else if (m9821i()) {
            if (z) {
                this.f6861h = C2101d.PAUSED;
                this.f6862i = true;
            }
            this.f6857d.pause();
            if (this.f6859f != C2101d.PLAYBACK_COMPLETED) {
                dVar = C2101d.PAUSED;
            }
        } else {
            return;
        }
        setVideoState(dVar);
    }

    /* renamed from: b */
    public void mo7566b() {
        if (!this.f6871r) {
            mo7564a(false);
        }
    }

    /* renamed from: c */
    public void mo7568c() {
        setVideoState(C2101d.PLAYBACK_COMPLETED);
        mo7569d();
        this.f6864k = 0;
    }

    /* renamed from: d */
    public void mo7569d() {
        this.f6860g = C2101d.IDLE;
        if (this.f6857d != null) {
            int currentPosition = this.f6857d.getCurrentPosition();
            if (currentPosition > 0) {
                this.f6864k = currentPosition;
            }
            this.f6857d.stop();
            m9819f();
            this.f6857d.release();
            this.f6857d = null;
            if (this.f6858e != null) {
                this.f6858e.hide();
                this.f6858e.setEnabled(false);
            }
        }
        setVideoState(C2101d.IDLE);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public boolean mo7570e() {
        if (this.f6857d == null || VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (TrackInfo trackType : this.f6857d.getTrackInfo()) {
                if (trackType.getTrackType() == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e(f6853t, "Couldn't retrieve video information", e);
            return true;
        }
    }

    /* renamed from: g */
    public void mo7572g() {
        if (this.f6857d != null) {
            m9816a((Surface) null);
            this.f6857d.setOnBufferingUpdateListener(null);
            this.f6857d.setOnCompletionListener(null);
            this.f6857d.setOnErrorListener(null);
            this.f6857d.setOnInfoListener(null);
            this.f6857d.setOnPreparedListener(null);
            this.f6857d.setOnVideoSizeChangedListener(null);
            this.f6857d.setOnSeekCompleteListener(null);
            m9819f();
            this.f6857d = null;
            setVideoState(C2101d.IDLE);
        }
    }

    public int getCurrentPosition() {
        if (this.f6857d == null || !m9815a()) {
            return 0;
        }
        return this.f6857d.getCurrentPosition();
    }

    public int getDuration() {
        if (this.f6857d == null || !m9815a()) {
            return 0;
        }
        return this.f6857d.getDuration();
    }

    public long getInitialBufferTime() {
        return this.f6865l;
    }

    public C2000a getStartReason() {
        return this.f6875w;
    }

    public C2101d getState() {
        return this.f6859f;
    }

    public C2101d getTargetState() {
        return this.f6860g;
    }

    public int getVideoHeight() {
        return this.f6867n;
    }

    public int getVideoWidth() {
        return this.f6866m;
    }

    public View getView() {
        return this;
    }

    public float getVolume() {
        return this.f6868o;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f6857d != null) {
            this.f6857d.pause();
        }
        setVideoState(C2101d.PLAYBACK_COMPLETED);
        mo7557a(0);
        this.f6864k = 0;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f6870q <= 0 || getState() != C2101d.STARTED) {
            setVideoState(C2101d.ERROR);
            mo7569d();
        } else {
            this.f6870q--;
            mo7569d();
            mo7559a(this.f6875w);
        }
        return true;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInfo(android.media.MediaPlayer r1, int r2, int r3) {
        /*
            r0 = this;
            r1 = 3
            if (r2 == r1) goto L_0x0017
            switch(r2) {
                case 701: goto L_0x0010;
                case 702: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0015
        L_0x0007:
            boolean r1 = r0.m9820h()
            if (r1 == 0) goto L_0x0015
            com.facebook.ads.internal.view.g.d.d r1 = com.facebook.ads.internal.view.p093g.p097d.C2101d.STARTED
            goto L_0x0012
        L_0x0010:
            com.facebook.ads.internal.view.g.d.d r1 = com.facebook.ads.internal.view.p093g.p097d.C2101d.BUFFERING
        L_0x0012:
            r0.setVideoState(r1)
        L_0x0015:
            r1 = 0
            return r1
        L_0x0017:
            r1 = 1
            r0.f6872s = r1
            com.facebook.ads.internal.view.g.d.d r2 = r0.f6860g
            com.facebook.ads.internal.view.g.d.d r3 = com.facebook.ads.internal.view.p093g.p097d.C2101d.STARTED
            if (r2 != r3) goto L_0x0025
            com.facebook.ads.internal.view.g.d.d r2 = com.facebook.ads.internal.view.p093g.p097d.C2101d.STARTED
            r0.setVideoState(r2)
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p093g.p097d.C2096b.onInfo(android.media.MediaPlayer, int, int):boolean");
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(C2101d.PREPARED);
        if (this.f6869p && !this.f6874v) {
            this.f6858e = new MediaController(getContext());
            this.f6858e.setAnchorView(this.f6863j == null ? this : this.f6863j);
            this.f6858e.setMediaPlayer(this.f6876x);
            this.f6858e.setEnabled(true);
        }
        setRequestedVolume(this.f6868o);
        this.f6866m = mediaPlayer.getVideoWidth();
        this.f6867n = mediaPlayer.getVideoHeight();
        if (this.f6864k > 0) {
            if (this.f6864k >= this.f6857d.getDuration()) {
                this.f6864k = 0;
            }
            this.f6857d.seekTo(this.f6864k);
            this.f6864k = 0;
        }
        if (this.f6860g == C2101d.STARTED) {
            mo7559a(this.f6875w);
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f6855b != null) {
            this.f6855b.mo7421a(this.f6873u, this.f6864k);
            this.f6864k = 0;
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f6856c == null) {
            this.f6856c = new Surface(surfaceTexture);
        }
        if (!m9816a(this.f6856c)) {
            setVideoState(C2101d.ERROR);
            mo7572g();
            return;
        }
        this.f6862i = false;
        if (this.f6859f == C2101d.PAUSED && this.f6861h != C2101d.PAUSED) {
            mo7559a(this.f6875w);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m9816a((Surface) null);
        if (this.f6856c != null) {
            this.f6856c.release();
            this.f6856c = null;
        }
        if (!this.f6862i) {
            this.f6861h = this.f6869p ? C2101d.STARTED : this.f6859f;
            this.f6862i = true;
        }
        if (this.f6859f != C2101d.PAUSED) {
            mo7564a(false);
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.f6866m = mediaPlayer.getVideoWidth();
        this.f6867n = mediaPlayer.getVideoHeight();
        if (this.f6866m != 0 && this.f6867n != 0) {
            requestLayout();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f6857d != null) {
            if (this.f6858e == null || !this.f6858e.isShowing()) {
                if (!z) {
                    if (!this.f6862i) {
                        this.f6861h = this.f6869p ? C2101d.STARTED : this.f6859f;
                        this.f6862i = true;
                    }
                    if (this.f6859f != C2101d.PAUSED) {
                        mo7566b();
                    }
                } else {
                    this.f6862i = false;
                    if (this.f6859f == C2101d.PAUSED && this.f6861h != C2101d.PAUSED) {
                        mo7559a(this.f6875w);
                    }
                }
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else if (C1837b.m9009d()) {
            Log.w(f6853t, "Google always throw an exception with setBackgroundDrawable on Nougat above. so we silently ignore it.");
        }
    }

    public void setBackgroundPlaybackEnabled(boolean z) {
        this.f6871r = z;
    }

    public void setControlsAnchorView(View view) {
        this.f6863j = view;
        view.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!C2096b.this.f6874v && C2096b.this.f6858e != null && motionEvent.getAction() == 1) {
                    if (C2096b.this.f6858e.isShowing()) {
                        C2096b.this.f6858e.hide();
                    } else {
                        C2096b.this.f6858e.show();
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
            Log.w(f6853t, "Google always throw an exception with setForeground on Nougat above. so we silently ignore it.");
        }
    }

    public void setFullScreen(boolean z) {
        this.f6869p = z;
        if (this.f6869p && !this.f6874v) {
            setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!C2096b.this.f6874v && C2096b.this.f6858e != null && motionEvent.getAction() == 1) {
                        if (C2096b.this.f6858e.isShowing()) {
                            C2096b.this.f6858e.hide();
                        } else {
                            C2096b.this.f6858e.show();
                        }
                    }
                    return true;
                }
            });
        }
    }

    public void setRequestedVolume(float f) {
        this.f6868o = f;
        if (this.f6857d != null && this.f6859f != C2101d.PREPARING && this.f6859f != C2101d.IDLE) {
            this.f6857d.setVolume(f, f);
        }
    }

    public void setVideoMPD(String str) {
    }

    public void setVideoStateChangeListener(C2102e eVar) {
        this.f6855b = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098 A[SYNTHETIC, Splitter:B:27:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3 A[SYNTHETIC, Splitter:B:33:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setup(android.net.Uri r11) {
        /*
            r10 = this;
            r0 = 0
            r10.f6872s = r0
            r10.f6854a = r11
            android.media.MediaPlayer r1 = r10.f6857d
            r2 = 0
            if (r1 == 0) goto L_0x0018
            r10.m9819f()
            r10.m9816a(r2)
            android.media.MediaPlayer r1 = r10.f6857d
            com.facebook.ads.internal.view.g.d.d r3 = com.facebook.ads.internal.view.p093g.p097d.C2101d.IDLE
            r10.setVideoState(r3)
            goto L_0x001d
        L_0x0018:
            android.media.MediaPlayer r1 = new android.media.MediaPlayer
            r1.<init>()
        L_0x001d:
            java.lang.String r3 = r11.getScheme()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r4 = "asset"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x00f9 }
            if (r3 == 0) goto L_0x00cf
            android.content.Context r3 = r10.getContext()     // Catch:{ IOException | SecurityException -> 0x007a }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException | SecurityException -> 0x007a }
            java.lang.String r11 = r11.getPath()     // Catch:{ IOException | SecurityException -> 0x007a }
            r4 = 1
            java.lang.String r11 = r11.substring(r4)     // Catch:{ IOException | SecurityException -> 0x007a }
            android.content.res.AssetFileDescriptor r11 = r3.openFd(r11)     // Catch:{ IOException | SecurityException -> 0x007a }
            long r5 = r11.getStartOffset()     // Catch:{ IOException | SecurityException -> 0x0073, all -> 0x006e }
            long r7 = r11.getLength()     // Catch:{ IOException | SecurityException -> 0x0073, all -> 0x006e }
            java.io.FileDescriptor r4 = r11.getFileDescriptor()     // Catch:{ IOException | SecurityException -> 0x0073, all -> 0x006e }
            r3 = r1
            r3.setDataSource(r4, r5, r7)     // Catch:{ IOException | SecurityException -> 0x0073, all -> 0x006e }
            if (r11 == 0) goto L_0x00d6
            r11.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x00d6
        L_0x0055:
            r11 = move-exception
            java.lang.String r2 = f6853t     // Catch:{ Exception -> 0x00f9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f9 }
            r3.<init>()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r4 = "Unable to close"
            r3.append(r4)     // Catch:{ Exception -> 0x00f9 }
            r3.append(r11)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x00f9 }
        L_0x0069:
            android.util.Log.w(r2, r11)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x00d6
        L_0x006e:
            r2 = move-exception
            r9 = r2
            r2 = r11
            r11 = r9
            goto L_0x00b1
        L_0x0073:
            r2 = move-exception
            r9 = r2
            r2 = r11
            r11 = r9
            goto L_0x007b
        L_0x0078:
            r11 = move-exception
            goto L_0x00b1
        L_0x007a:
            r11 = move-exception
        L_0x007b:
            java.lang.String r3 = f6853t     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r4.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Failed to open assets "
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            r4.append(r11)     // Catch:{ all -> 0x0078 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x0078 }
            android.util.Log.w(r3, r11)     // Catch:{ all -> 0x0078 }
            com.facebook.ads.internal.view.g.d.d r11 = com.facebook.ads.internal.view.p093g.p097d.C2101d.ERROR     // Catch:{ all -> 0x0078 }
            r10.setVideoState(r11)     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x00d6
            r2.close()     // Catch:{ IOException -> 0x009c }
            goto L_0x00d6
        L_0x009c:
            r11 = move-exception
            java.lang.String r2 = f6853t     // Catch:{ Exception -> 0x00f9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f9 }
            r3.<init>()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r4 = "Unable to close"
            r3.append(r4)     // Catch:{ Exception -> 0x00f9 }
            r3.append(r11)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0069
        L_0x00b1:
            if (r2 == 0) goto L_0x00ce
            r2.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00ce
        L_0x00b7:
            r2 = move-exception
            java.lang.String r3 = f6853t     // Catch:{ Exception -> 0x00f9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f9 }
            r4.<init>()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r5 = "Unable to close"
            r4.append(r5)     // Catch:{ Exception -> 0x00f9 }
            r4.append(r2)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00f9 }
            android.util.Log.w(r3, r2)     // Catch:{ Exception -> 0x00f9 }
        L_0x00ce:
            throw r11     // Catch:{ Exception -> 0x00f9 }
        L_0x00cf:
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00f9 }
            r1.setDataSource(r11)     // Catch:{ Exception -> 0x00f9 }
        L_0x00d6:
            r1.setLooping(r0)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnBufferingUpdateListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnCompletionListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnErrorListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnInfoListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnPreparedListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnVideoSizeChangedListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.setOnSeekCompleteListener(r10)     // Catch:{ Exception -> 0x00f9 }
            r1.prepareAsync()     // Catch:{ Exception -> 0x00f9 }
            r10.f6857d = r1     // Catch:{ Exception -> 0x00f9 }
            com.facebook.ads.internal.view.g.d.d r11 = com.facebook.ads.internal.view.p093g.p097d.C2101d.PREPARING     // Catch:{ Exception -> 0x00f9 }
            r10.setVideoState(r11)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0118
        L_0x00f9:
            r11 = move-exception
            com.facebook.ads.internal.view.g.d.d r2 = com.facebook.ads.internal.view.p093g.p097d.C2101d.ERROR
            r10.setVideoState(r2)
            r1.release()
            java.lang.String r1 = f6853t
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot prepare media player with SurfaceTexture: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            android.util.Log.e(r1, r11)
        L_0x0118:
            r10.setSurfaceTextureListener(r10)
            boolean r11 = r10.isAvailable()
            if (r11 == 0) goto L_0x0128
            android.graphics.SurfaceTexture r11 = r10.getSurfaceTexture()
            r10.onSurfaceTextureAvailable(r11, r0, r0)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p093g.p097d.C2096b.setup(android.net.Uri):void");
    }
}
