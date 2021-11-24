package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.zzbv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.nv */
public final class C3775nv extends C3788oh implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {

    /* renamed from: c */
    private static final Map<Integer, String> f14503c = new HashMap();

    /* renamed from: d */
    private final C3805oy f14504d;

    /* renamed from: e */
    private final boolean f14505e;

    /* renamed from: f */
    private int f14506f = 0;

    /* renamed from: g */
    private int f14507g = 0;

    /* renamed from: h */
    private MediaPlayer f14508h;

    /* renamed from: i */
    private Uri f14509i;

    /* renamed from: j */
    private int f14510j;

    /* renamed from: k */
    private int f14511k;

    /* renamed from: l */
    private int f14512l;

    /* renamed from: m */
    private int f14513m;

    /* renamed from: n */
    private int f14514n;

    /* renamed from: o */
    private C3802ov f14515o;

    /* renamed from: p */
    private boolean f14516p;

    /* renamed from: q */
    private int f14517q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C3787og f14518r;

    static {
        if (VERSION.SDK_INT >= 17) {
            f14503c.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            f14503c.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            f14503c.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            f14503c.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            f14503c.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f14503c.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        f14503c.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        f14503c.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        f14503c.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f14503c.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        f14503c.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        f14503c.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        f14503c.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        f14503c.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            f14503c.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f14503c.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public C3775nv(Context context, boolean z, boolean z2, C3803ow owVar, C3805oy oyVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.f14504d = oyVar;
        this.f14516p = z;
        this.f14505e = z2;
        this.f14504d.mo13422a(this);
    }

    /* renamed from: a */
    private final void m19240a(float f) {
        if (this.f14508h != null) {
            try {
                this.f14508h.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            C3643iy.m19178e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* renamed from: a */
    private final void m19241a(boolean z) {
        C3643iy.m18780a("AdMediaPlayerView release");
        if (this.f14515o != null) {
            this.f14515o.mo13402b();
            this.f14515o = null;
        }
        if (this.f14508h != null) {
            this.f14508h.reset();
            this.f14508h.release();
            this.f14508h = null;
            m19242c(0);
            if (z) {
                this.f14507g = 0;
                this.f14507g = 0;
            }
        }
    }

    /* renamed from: c */
    private final void m19242c(int i) {
        if (i == 3) {
            this.f14504d.mo13425c();
            this.f14538b.mo13434b();
        } else if (this.f14506f == 3) {
            this.f14504d.mo13426d();
            this.f14538b.mo13435c();
        }
        this.f14506f = i;
    }

    /* renamed from: f */
    private final void m19243f() {
        C3643iy.m18780a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (!(this.f14509i == null || surfaceTexture == null)) {
            m19241a(false);
            try {
                zzbv.zzfb();
                this.f14508h = new MediaPlayer();
                this.f14508h.setOnBufferingUpdateListener(this);
                this.f14508h.setOnCompletionListener(this);
                this.f14508h.setOnErrorListener(this);
                this.f14508h.setOnInfoListener(this);
                this.f14508h.setOnPreparedListener(this);
                this.f14508h.setOnVideoSizeChangedListener(this);
                this.f14512l = 0;
                if (this.f14516p) {
                    this.f14515o = new C3802ov(getContext());
                    this.f14515o.mo13401a(surfaceTexture, getWidth(), getHeight());
                    this.f14515o.start();
                    SurfaceTexture c = this.f14515o.mo13403c();
                    if (c != null) {
                        surfaceTexture = c;
                    } else {
                        this.f14515o.mo13402b();
                        this.f14515o = null;
                    }
                }
                this.f14508h.setDataSource(getContext(), this.f14509i);
                zzbv.zzfc();
                this.f14508h.setSurface(new Surface(surfaceTexture));
                this.f14508h.setAudioStreamType(3);
                this.f14508h.setScreenOnWhilePlaying(true);
                this.f14508h.prepareAsync();
                m19242c(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.f14509i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                C3643iy.m19175c(sb.toString(), e);
                onError(this.f14508h, 1, 0);
            }
        }
    }

    /* renamed from: g */
    private final void m19244g() {
        if (this.f14505e && m19245h() && this.f14508h.getCurrentPosition() > 0 && this.f14507g != 3) {
            C3643iy.m18780a("AdMediaPlayerView nudging MediaPlayer");
            m19240a(0.0f);
            this.f14508h.start();
            int currentPosition = this.f14508h.getCurrentPosition();
            long a = zzbv.zzer().mo11326a();
            while (m19245h() && this.f14508h.getCurrentPosition() == currentPosition) {
                if (zzbv.zzer().mo11326a() - a > 250) {
                    break;
                }
            }
            this.f14508h.pause();
            mo13319e();
        }
    }

    /* renamed from: h */
    private final boolean m19245h() {
        return (this.f14508h == null || this.f14506f == -1 || this.f14506f == 0 || this.f14506f == 1) ? false : true;
    }

    /* renamed from: a */
    public final String mo13311a() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.f14516p ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    /* renamed from: a */
    public final void mo13312a(float f, float f2) {
        if (this.f14515o != null) {
            this.f14515o.mo13399a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo13313a(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        C3643iy.m18780a(sb.toString());
        if (m19245h()) {
            this.f14508h.seekTo(i);
            this.f14517q = 0;
            return;
        }
        this.f14517q = i;
    }

    /* renamed from: a */
    public final void mo13314a(C3787og ogVar) {
        this.f14518r = ogVar;
    }

    /* renamed from: b */
    public final void mo13315b() {
        C3643iy.m18780a("AdMediaPlayerView stop");
        if (this.f14508h != null) {
            this.f14508h.stop();
            this.f14508h.release();
            this.f14508h = null;
            m19242c(0);
            this.f14507g = 0;
        }
        this.f14504d.mo13423b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13316b(int i) {
        if (this.f14518r != null) {
            this.f14518r.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: c */
    public final void mo13317c() {
        C3643iy.m18780a("AdMediaPlayerView play");
        if (m19245h()) {
            this.f14508h.start();
            m19242c(3);
            this.f14537a.mo13388a();
            C3653jh.f14275a.post(new C3785oe(this));
        }
        this.f14507g = 3;
    }

    /* renamed from: d */
    public final void mo13318d() {
        C3643iy.m18780a("AdMediaPlayerView pause");
        if (m19245h() && this.f14508h.isPlaying()) {
            this.f14508h.pause();
            m19242c(4);
            C3653jh.f14275a.post(new C3786of(this));
        }
        this.f14507g = 4;
    }

    /* renamed from: e */
    public final void mo13319e() {
        m19240a(this.f14538b.mo13431a());
    }

    public final int getCurrentPosition() {
        if (m19245h()) {
            return this.f14508h.getCurrentPosition();
        }
        return 0;
    }

    public final int getDuration() {
        if (m19245h()) {
            return this.f14508h.getDuration();
        }
        return -1;
    }

    public final int getVideoHeight() {
        if (this.f14508h != null) {
            return this.f14508h.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoWidth() {
        if (this.f14508h != null) {
            return this.f14508h.getVideoWidth();
        }
        return 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f14512l = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C3643iy.m18780a("AdMediaPlayerView completion");
        m19242c(5);
        this.f14507g = 5;
        C3653jh.f14275a.post(new C3778ny(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f14503c.get(Integer.valueOf(i));
        String str2 = (String) f14503c.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C3643iy.m19178e(sb.toString());
        m19242c(-1);
        this.f14507g = -1;
        C3653jh.f14275a.post(new C3779nz(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f14503c.get(Integer.valueOf(i));
        String str2 = (String) f14503c.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C3643iy.m18780a(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if ((r5.f14510j * r7) > (r5.f14511k * r6)) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r1 > r6) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (r1 > r6) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f14510j
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.f14511k
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.f14510j
            if (r2 <= 0) goto L_0x008e
            int r2 = r5.f14511k
            if (r2 <= 0) goto L_0x008e
            com.google.android.gms.internal.ads.ov r2 = r5.f14515o
            if (r2 != 0) goto L_0x008e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0055
            if (r1 != r2) goto L_0x0055
            int r0 = r5.f14510j
            int r0 = r0 * r7
            int r1 = r5.f14511k
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x0042
            int r6 = r5.f14510j
            int r6 = r6 * r7
            int r0 = r5.f14511k
            int r0 = r6 / r0
            r6 = r0
            goto L_0x0090
        L_0x0042:
            int r0 = r5.f14510j
            int r0 = r0 * r7
            int r1 = r5.f14511k
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0090
        L_0x004c:
            int r7 = r5.f14511k
            int r7 = r7 * r6
            int r0 = r5.f14510j
            int r1 = r7 / r0
            goto L_0x008f
        L_0x0055:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0067
            int r0 = r5.f14511k
            int r0 = r0 * r6
            int r2 = r5.f14510j
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0065
            if (r0 <= r7) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            r7 = r0
            goto L_0x0090
        L_0x0067:
            if (r1 != r2) goto L_0x0077
            int r1 = r5.f14510j
            int r1 = r1 * r7
            int r2 = r5.f14511k
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0075
            if (r1 <= r6) goto L_0x0075
            goto L_0x0090
        L_0x0075:
            r6 = r1
            goto L_0x0090
        L_0x0077:
            int r2 = r5.f14510j
            int r4 = r5.f14511k
            if (r1 != r3) goto L_0x0087
            if (r4 <= r7) goto L_0x0087
            int r1 = r5.f14510j
            int r1 = r1 * r7
            int r2 = r5.f14511k
            int r1 = r1 / r2
            goto L_0x0089
        L_0x0087:
            r1 = r2
            r7 = r4
        L_0x0089:
            if (r0 != r3) goto L_0x0075
            if (r1 <= r6) goto L_0x0075
            goto L_0x004c
        L_0x008e:
            r6 = r0
        L_0x008f:
            r7 = r1
        L_0x0090:
            r5.setMeasuredDimension(r6, r7)
            com.google.android.gms.internal.ads.ov r0 = r5.f14515o
            if (r0 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.ov r0 = r5.f14515o
            r0.mo13400a(r6, r7)
        L_0x009c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 != r1) goto L_0x00b9
            int r0 = r5.f14513m
            if (r0 <= 0) goto L_0x00aa
            int r0 = r5.f14513m
            if (r0 != r6) goto L_0x00b2
        L_0x00aa:
            int r0 = r5.f14514n
            if (r0 <= 0) goto L_0x00b5
            int r0 = r5.f14514n
            if (r0 == r7) goto L_0x00b5
        L_0x00b2:
            r5.m19244g()
        L_0x00b5:
            r5.f14513m = r6
            r5.f14514n = r7
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3775nv.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C3643iy.m18780a("AdMediaPlayerView prepared");
        m19242c(2);
        this.f14504d.mo13421a();
        C3653jh.f14275a.post(new C3777nx(this));
        this.f14510j = mediaPlayer.getVideoWidth();
        this.f14511k = mediaPlayer.getVideoHeight();
        if (this.f14517q != 0) {
            mo13313a(this.f14517q);
        }
        m19244g();
        int i = this.f14510j;
        int i2 = this.f14511k;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        C3643iy.m19176d(sb.toString());
        if (this.f14507g == 3) {
            mo13317c();
        }
        mo13319e();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C3643iy.m18780a("AdMediaPlayerView surface created");
        m19243f();
        C3653jh.f14275a.post(new C3782ob(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C3643iy.m18780a("AdMediaPlayerView surface destroyed");
        if (this.f14508h != null && this.f14517q == 0) {
            this.f14517q = this.f14508h.getCurrentPosition();
        }
        if (this.f14515o != null) {
            this.f14515o.mo13402b();
        }
        C3653jh.f14275a.post(new C3784od(this));
        m19241a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C3643iy.m18780a("AdMediaPlayerView surface changed");
        boolean z = false;
        boolean z2 = this.f14507g == 3;
        if (this.f14510j == i && this.f14511k == i2) {
            z = true;
        }
        if (this.f14508h != null && z2 && z) {
            if (this.f14517q != 0) {
                mo13313a(this.f14517q);
            }
            mo13317c();
        }
        if (this.f14515o != null) {
            this.f14515o.mo13400a(i, i2);
        }
        C3653jh.f14275a.post(new C3783oc(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f14504d.mo13424b(this);
        this.f14537a.mo13389a(surfaceTexture, this.f14518r);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        C3643iy.m18780a(sb.toString());
        this.f14510j = mediaPlayer.getVideoWidth();
        this.f14511k = mediaPlayer.getVideoHeight();
        if (this.f14510j != 0 && this.f14511k != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        C3643iy.m18780a(sb.toString());
        C3653jh.f14275a.post(new C3776nw(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzhl a = zzhl.m20753a(parse);
        if (a != null) {
            parse = Uri.parse(a.f15449a);
        }
        this.f14509i = parse;
        this.f14517q = 0;
        m19243f();
        requestLayout();
        invalidate();
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }
}
