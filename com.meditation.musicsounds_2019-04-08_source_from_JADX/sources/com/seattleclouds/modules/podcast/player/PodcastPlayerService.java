package com.seattleclouds.modules.podcast.player;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.p009v4.app.C0419y.C0424d;
import android.support.p009v4.content.C0456d;
import android.widget.RemoteViews;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.modules.podcast.player.C6144b.C6145a;
import com.seattleclouds.util.C6645y;

public class PodcastPlayerService extends Service implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, C6145a {

    /* renamed from: a */
    private static final int f21758a = C5458g.podcast_player_notification_id;

    /* renamed from: b */
    private final IBinder f21759b = new C6142a();

    /* renamed from: c */
    private MediaPlayer f21760c;

    /* renamed from: d */
    private C0456d f21761d;

    /* renamed from: e */
    private NotificationManager f21762e;

    /* renamed from: f */
    private C6144b f21763f;

    /* renamed from: g */
    private WifiLock f21764g;

    /* renamed from: h */
    private AudioFocus f21765h = AudioFocus.NoFocusNoDuck;

    /* renamed from: i */
    private State f21766i = State.None;

    /* renamed from: j */
    private boolean f21767j;

    /* renamed from: k */
    private Uri f21768k;

    /* renamed from: l */
    private String f21769l;

    /* renamed from: m */
    private String f21770m;

    /* renamed from: n */
    private Bitmap f21771n;

    /* renamed from: o */
    private boolean f21772o;

    /* renamed from: p */
    private boolean f21773p;

    /* renamed from: q */
    private int f21774q = 0;

    /* renamed from: r */
    private int f21775r = 0;

    /* renamed from: s */
    private int f21776s = 0;

    /* renamed from: t */
    private RemotePlayerControl f21777t;

    /* renamed from: u */
    private Notification f21778u;

    /* renamed from: v */
    private Intent f21779v;

    enum AudioFocus {
        NoFocusNoDuck,
        NoFocusCanDuck,
        Focused
    }

    private class RemotePlayerControl extends RemoteViews {
        public RemotePlayerControl(String str, int i) {
            super(str, i);
            setOnClickPendingIntent(C5458g.closeButton, PendingIntent.getService(PodcastPlayerService.this.getApplicationContext(), 100, new Intent(C6143a.m30001d(PodcastPlayerService.this.getApplicationContext())), 134217728));
            setOnClickPendingIntent(C5458g.rewindButton, PendingIntent.getService(PodcastPlayerService.this.getApplicationContext(), 101, new Intent(C6143a.m30003f(PodcastPlayerService.this.getApplicationContext())), 134217728));
            setOnClickPendingIntent(C5458g.fastForwardButton, PendingIntent.getService(PodcastPlayerService.this.getApplicationContext(), 102, new Intent(C6143a.m30004g(PodcastPlayerService.this.getApplicationContext())), 134217728));
        }

        /* renamed from: a */
        public void mo19336a(Bitmap bitmap) {
            setImageViewBitmap(C5458g.imageView, bitmap);
        }

        /* renamed from: a */
        public void mo19337a(State state) {
            Intent intent;
            int i;
            int i2;
            if (state == State.Playing) {
                intent = new Intent(C6143a.m30000c(PodcastPlayerService.this.getApplicationContext()));
                i = C5458g.playButton;
                i2 = C5457f.ic_notif_podcast_pause;
            } else {
                intent = new Intent(C6143a.m29999b(PodcastPlayerService.this.getApplicationContext()));
                i = C5458g.playButton;
                i2 = C5457f.ic_notif_podcast_play;
            }
            setImageViewResource(i, i2);
            setOnClickPendingIntent(C5458g.playButton, PendingIntent.getService(PodcastPlayerService.this.getApplicationContext(), 100, intent, 134217728));
        }

        /* renamed from: a */
        public void mo19338a(String str) {
            setTextViewText(C5458g.textView, str);
        }
    }

    enum State {
        None,
        Stopped,
        Preparing,
        Playing,
        Paused
    }

    /* renamed from: com.seattleclouds.modules.podcast.player.PodcastPlayerService$a */
    public class C6142a extends Binder {
        public C6142a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PodcastPlayerService mo19339a() {
            return PodcastPlayerService.this;
        }
    }

    /* renamed from: a */
    private void m29969a(State state) {
        if (state == State.Stopped) {
            this.f21762e.cancel(f21758a);
            this.f21778u = null;
            this.f21777t = null;
            return;
        }
        this.f21778u = m29970b(state);
        if (this.f21778u != null) {
            this.f21777t.mo19337a(state);
            m29975o();
        }
    }

    /* renamed from: b */
    private Notification m29970b(State state) {
        int i;
        if (state != State.Playing && state != State.Paused) {
            return null;
        }
        if (this.f21777t == null) {
            this.f21777t = new RemotePlayerControl(getPackageName(), C5460i.podcast_player_remote_control);
            this.f21777t.mo19338a(this.f21769l);
            this.f21777t.mo19336a(this.f21771n);
        }
        C0424d a = new C0424d(getApplicationContext(), "pod_cast").mo1725a(true).mo1723a((CharSequence) this.f21769l).mo1717a(PendingIntent.getActivity(getApplicationContext(), 0, this.f21779v, 134217728));
        if (24 == VERSION.SDK_INT || 25 == VERSION.SDK_INT) {
            a.mo1728b((RemoteViews) this.f21777t);
        } else {
            a.mo1722a((RemoteViews) this.f21777t);
        }
        C6645y.m32105a("pod_cast");
        if (state == State.Playing) {
            i = C5457f.ic_media_podcast_notif_play_alpha;
        } else if (state != State.Paused) {
            return null;
        } else {
            i = C5457f.ic_media_podcast_notif_pause_alpha;
        }
        a.mo1713a(i);
        return a.mo1712a();
    }

    /* renamed from: k */
    private void m29971k() {
        this.f21760c = new MediaPlayer();
        if (getApplicationContext().checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
            this.f21760c.setWakeMode(getApplicationContext(), 1);
        }
        this.f21760c.setOnPreparedListener(this);
        this.f21760c.setOnSeekCompleteListener(this);
        this.f21760c.setOnCompletionListener(this);
        this.f21760c.setOnBufferingUpdateListener(this);
        this.f21760c.setOnInfoListener(this);
        this.f21760c.setOnErrorListener(this);
    }

    /* renamed from: l */
    private void m29972l() {
        if (this.f21765h != AudioFocus.Focused && this.f21763f.mo19340a()) {
            this.f21765h = AudioFocus.Focused;
        }
    }

    /* renamed from: m */
    private void m29973m() {
        if (this.f21765h == AudioFocus.Focused && this.f21763f.mo19341b()) {
            this.f21765h = AudioFocus.NoFocusNoDuck;
        }
    }

    /* renamed from: n */
    private void m29974n() {
        try {
            if (this.f21765h == AudioFocus.NoFocusNoDuck) {
                mo19317b(false);
                return;
            }
            if (this.f21765h == AudioFocus.NoFocusCanDuck) {
                this.f21760c.setVolume(0.1f, 0.1f);
            } else {
                this.f21760c.setVolume(1.0f, 1.0f);
            }
            if (this.f21766i == State.Playing && !this.f21760c.isPlaying()) {
                if (this.f21775r > 0) {
                    this.f21760c.seekTo(this.f21775r);
                }
                this.f21760c.start();
                this.f21761d.mo1845a(new Intent(C6143a.m29999b(this)));
                m29969a(State.Playing);
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: o */
    private void m29975o() {
        if (this.f21778u != null) {
            this.f21762e.notify(f21758a, this.f21778u);
        }
    }

    /* renamed from: a */
    public void mo19308a() {
        this.f21765h = AudioFocus.Focused;
        m29974n();
    }

    /* renamed from: a */
    public void mo19309a(int i) {
        if (this.f21773p) {
            this.f21760c.seekTo(i);
        }
    }

    /* renamed from: a */
    public void mo19310a(Intent intent) {
        this.f21779v = intent;
    }

    /* renamed from: a */
    public void mo19311a(Bitmap bitmap) {
        this.f21771n = bitmap;
        if (this.f21777t != null) {
            this.f21777t.mo19336a(bitmap);
            m29975o();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|(1:35)|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0093 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19312a(android.net.Uri r5, boolean r6) {
        /*
            r4 = this;
            android.net.Uri r0 = r4.f21768k
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0028
            android.net.Uri r0 = r4.f21768k
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0028
            boolean r0 = r4.f21773p
            if (r0 == 0) goto L_0x001b
            android.media.MediaPlayer r0 = r4.f21760c
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L_0x001b
            return
        L_0x001b:
            if (r6 == 0) goto L_0x002c
            boolean r0 = r4.f21773p
            if (r0 == 0) goto L_0x0025
            r4.mo19318c()
            return
        L_0x0025:
            r4.f21772o = r1
            goto L_0x002c
        L_0x0028:
            r4.f21775r = r2
            r4.f21776s = r2
        L_0x002c:
            r4.f21773p = r2
            r4.mo19319d()
            r4.f21768k = r5
            android.net.Uri r0 = r4.f21768k
            if (r0 != 0) goto L_0x0038
            return
        L_0x0038:
            java.lang.String r0 = r5.toString()
            java.lang.String r3 = "http:"
            boolean r0 = r0.startsWith(r3)
            if (r0 != 0) goto L_0x0052
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "https:"
            boolean r5 = r5.startsWith(r0)
            if (r5 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            r4.f21767j = r1
            android.media.MediaPlayer r5 = r4.f21760c
            r5.reset()
            android.media.MediaPlayer r5 = r4.f21760c
            r4.onBufferingUpdate(r5, r2)
            android.media.MediaPlayer r5 = r4.f21760c     // Catch:{ IOException -> 0x00a4 }
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ IOException -> 0x00a4 }
            android.net.Uri r1 = r4.f21768k     // Catch:{ IOException -> 0x00a4 }
            r5.setDataSource(r0, r1)     // Catch:{ IOException -> 0x00a4 }
            r4.f21772o = r6     // Catch:{ IOException -> 0x00a4 }
            android.media.MediaPlayer r5 = r4.f21760c     // Catch:{ IOException -> 0x00a4 }
            r5.prepareAsync()     // Catch:{ IOException -> 0x00a4 }
            com.seattleclouds.modules.podcast.player.PodcastPlayerService$State r5 = com.seattleclouds.modules.podcast.player.PodcastPlayerService.State.Preparing     // Catch:{ IOException -> 0x00a4 }
            r4.f21766i = r5     // Catch:{ IOException -> 0x00a4 }
            boolean r5 = r4.f21767j     // Catch:{ SecurityException -> 0x0093 }
            if (r5 == 0) goto L_0x0086
            android.net.wifi.WifiManager$WifiLock r5 = r4.f21764g     // Catch:{ SecurityException -> 0x0093 }
            boolean r5 = r5.isHeld()     // Catch:{ SecurityException -> 0x0093 }
            if (r5 != 0) goto L_0x0086
            android.net.wifi.WifiManager$WifiLock r5 = r4.f21764g     // Catch:{ SecurityException -> 0x0093 }
            r5.acquire()     // Catch:{ SecurityException -> 0x0093 }
            goto L_0x0093
        L_0x0086:
            android.net.wifi.WifiManager$WifiLock r5 = r4.f21764g     // Catch:{ SecurityException -> 0x0093 }
            boolean r5 = r5.isHeld()     // Catch:{ SecurityException -> 0x0093 }
            if (r5 == 0) goto L_0x0093
            android.net.wifi.WifiManager$WifiLock r5 = r4.f21764g     // Catch:{ SecurityException -> 0x0093 }
            r5.release()     // Catch:{ SecurityException -> 0x0093 }
        L_0x0093:
            r4.m29972l()     // Catch:{ IOException -> 0x00a4 }
            android.support.v4.content.d r5 = r4.f21761d     // Catch:{ IOException -> 0x00a4 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ IOException -> 0x00a4 }
            java.lang.String r0 = com.seattleclouds.modules.podcast.player.C6143a.m30006i(r4)     // Catch:{ IOException -> 0x00a4 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x00a4 }
            r5.mo1845a(r6)     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.podcast.player.PodcastPlayerService.mo19312a(android.net.Uri, boolean):void");
    }

    /* renamed from: a */
    public void mo19313a(String str) {
        this.f21769l = str;
        if (this.f21777t != null) {
            this.f21777t.mo19338a(this.f21769l);
            m29975o();
        }
    }

    /* renamed from: a */
    public void mo19314a(boolean z) {
        this.f21765h = z ? AudioFocus.NoFocusCanDuck : AudioFocus.NoFocusNoDuck;
        m29974n();
    }

    /* renamed from: b */
    public void mo19315b() {
        if (this.f21760c.isPlaying()) {
            mo19317b(true);
        } else {
            mo19318c();
        }
    }

    /* renamed from: b */
    public void mo19316b(String str) {
        this.f21770m = str;
    }

    /* renamed from: b */
    public void mo19317b(boolean z) {
        if (z) {
            try {
                this.f21766i = State.Paused;
            } catch (IllegalStateException unused) {
            }
        }
        this.f21760c.pause();
        this.f21761d.mo1845a(new Intent(C6143a.m30000c(this)));
        m29969a(State.Paused);
    }

    /* renamed from: c */
    public void mo19318c() {
        this.f21766i = State.Playing;
        m29972l();
        m29974n();
    }

    /* renamed from: d */
    public void mo19319d() {
        try {
            this.f21766i = State.Stopped;
            if (this.f21773p) {
                this.f21775r = this.f21760c.getCurrentPosition();
            }
            this.f21760c.stop();
        } catch (IllegalStateException unused) {
        }
        if (this.f21767j && !this.f21764g.isHeld()) {
            try {
                this.f21764g.acquire();
            } catch (SecurityException unused2) {
            }
        }
        m29973m();
        this.f21774q = 0;
        this.f21773p = false;
        this.f21761d.mo1845a(new Intent(C6143a.m30001d(this)));
        m29969a(State.Stopped);
    }

    /* renamed from: e */
    public void mo19320e() {
        if (this.f21773p) {
            int i = mo19324i() - 30000;
            if (i < 0) {
                i = 0;
            }
            try {
                this.f21760c.seekTo(i);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: f */
    public void mo19321f() {
        if (this.f21773p) {
            int i = mo19324i() + 30000;
            if (i > mo19323h()) {
                i = mo19323h();
            }
            try {
                this.f21760c.seekTo(i);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: g */
    public boolean mo19322g() {
        return this.f21760c.isPlaying();
    }

    /* renamed from: h */
    public int mo19323h() {
        return this.f21773p ? this.f21760c.getDuration() : this.f21776s;
    }

    /* renamed from: i */
    public int mo19324i() {
        return this.f21773p ? this.f21760c.getCurrentPosition() : this.f21775r;
    }

    /* renamed from: j */
    public int mo19325j() {
        return this.f21774q;
    }

    public IBinder onBind(Intent intent) {
        return this.f21759b;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (this.f21774q != i) {
            this.f21774q = i;
            Intent intent = new Intent(C6143a.m30011n(this));
            intent.putExtra("EXTRA_AUDIO_BUFFER_PERCENT", i);
            this.f21761d.mo1845a(intent);
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        m29969a(State.Stopped);
        this.f21761d.mo1845a(new Intent(C6143a.m30012o(this)));
    }

    public void onCreate() {
        super.onCreate();
        m29971k();
        this.f21761d = C0456d.m2097a((Context) this);
        this.f21762e = (NotificationManager) getSystemService("notification");
        this.f21763f = new C6144b(getApplicationContext(), this);
        this.f21764g = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(1, "podcast_wifi_lock");
    }

    public void onDestroy() {
        try {
            this.f21760c.stop();
        } catch (IllegalStateException unused) {
        }
        this.f21760c.release();
        m29973m();
        super.onDestroy();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f21773p = false;
        m29973m();
        this.f21761d.mo1845a(new Intent(C6143a.m30005h(this)));
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        C0456d dVar;
        Intent intent;
        if (i == 801) {
            return true;
        }
        switch (i) {
            case 701:
                dVar = this.f21761d;
                intent = new Intent(C6143a.m30009l(this));
                break;
            case 702:
                dVar = this.f21761d;
                intent = new Intent(C6143a.m30010m(this));
                break;
            default:
                return false;
        }
        dVar.mo1845a(intent);
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f21773p = true;
        this.f21776s = mediaPlayer.getDuration();
        Intent intent = new Intent(C6143a.m30007j(this));
        intent.putExtra("EXTRA_AUDIO_DURATION", mediaPlayer.getDuration());
        intent.putExtra("EXTRA_AUDIO_POSITION", mediaPlayer.getCurrentPosition());
        this.f21761d.mo1845a(intent);
        if (this.f21772o) {
            this.f21772o = false;
            mo19318c();
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        Intent intent = new Intent(C6143a.m30008k(this));
        intent.putExtra("EXTRA_AUDIO_DURATION", mediaPlayer.getDuration());
        intent.putExtra("EXTRA_AUDIO_POSITION", mediaPlayer.getCurrentPosition());
        this.f21761d.mo1845a(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action = intent.getAction();
        if (action == null) {
            return 2;
        }
        if (action.equals(C6143a.m29998a(this))) {
            mo19315b();
        } else if (action.equals(C6143a.m29999b(this))) {
            mo19318c();
        } else if (action.equals(C6143a.m30000c(this))) {
            mo19317b(true);
        } else if (action.equals(C6143a.m30001d(this))) {
            mo19319d();
        } else if (action.equals(C6143a.m30002e(this))) {
            this.f21769l = intent.getStringExtra("EXTRA_DEFAULT_TITLE");
            this.f21770m = intent.getStringExtra("EXTRA_DEFAULT_ARTIST");
            mo19312a((Uri) intent.getParcelableExtra("EXTRA_URI"), intent.getBooleanExtra("EXTRA_AUTO_PLAY", false));
        } else if (action.equals(C6143a.m30004g(this))) {
            mo19321f();
        } else if (action.equals(C6143a.m30003f(this))) {
            mo19320e();
        }
        return 2;
    }
}
