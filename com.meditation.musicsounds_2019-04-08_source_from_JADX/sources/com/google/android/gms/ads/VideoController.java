package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aov;
import com.google.android.gms.internal.ads.apv;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;

    /* renamed from: a */
    private final Object f9873a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private aos f9874b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private VideoLifecycleCallbacks f9875c;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final float getAspectRatio() {
        synchronized (this.f9873a) {
            if (this.f9874b == null) {
                return 0.0f;
            }
            try {
                float e = this.f9874b.mo12138e();
                return e;
            } catch (RemoteException e2) {
                C3731me.m19173b("Unable to call getAspectRatio on video controller.", e2);
                return 0.0f;
            }
        }
    }

    public final int getPlaybackState() {
        synchronized (this.f9873a) {
            if (this.f9874b == null) {
                return 0;
            }
            try {
                int d = this.f9874b.mo12137d();
                return d;
            } catch (RemoteException e) {
                C3731me.m19173b("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.f9873a) {
            videoLifecycleCallbacks = this.f9875c;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.f9873a) {
            z = this.f9874b != null;
        }
        return z;
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.f9873a) {
            if (this.f9874b == null) {
                return false;
            }
            try {
                boolean j = this.f9874b.mo12143j();
                return j;
            } catch (RemoteException e) {
                C3731me.m19173b("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.f9873a) {
            if (this.f9874b == null) {
                return false;
            }
            try {
                boolean i = this.f9874b.mo12142i();
                return i;
            } catch (RemoteException e) {
                C3731me.m19173b("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.f9873a) {
            if (this.f9874b == null) {
                return true;
            }
            try {
                boolean c = this.f9874b.mo12136c();
                return c;
            } catch (RemoteException e) {
                C3731me.m19173b("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.f9873a) {
            if (this.f9874b != null) {
                try {
                    this.f9874b.mo12134a(z);
                } catch (RemoteException e) {
                    C3731me.m19173b("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public final void pause() {
        synchronized (this.f9873a) {
            if (this.f9874b != null) {
                try {
                    this.f9874b.mo12135b();
                } catch (RemoteException e) {
                    C3731me.m19173b("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public final void play() {
        synchronized (this.f9873a) {
            if (this.f9874b != null) {
                try {
                    this.f9874b.mo12132a();
                } catch (RemoteException e) {
                    C3731me.m19173b("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        C3266s.m14914a(videoLifecycleCallbacks, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f9873a) {
            this.f9875c = videoLifecycleCallbacks;
            if (this.f9874b != null) {
                try {
                    this.f9874b.mo12133a((aov) new apv(videoLifecycleCallbacks));
                } catch (RemoteException e) {
                    C3731me.m19173b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    public final void zza(aos aos) {
        synchronized (this.f9873a) {
            this.f9874b = aos;
            if (this.f9875c != null) {
                setVideoLifecycleCallbacks(this.f9875c);
            }
        }
    }

    public final aos zzbc() {
        aos aos;
        synchronized (this.f9873a) {
            aos = this.f9874b;
        }
        return aos;
    }
}
