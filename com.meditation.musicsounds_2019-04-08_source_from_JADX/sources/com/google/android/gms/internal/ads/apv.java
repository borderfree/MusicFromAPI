package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class apv extends aow {

    /* renamed from: a */
    private final VideoLifecycleCallbacks f12586a;

    public apv(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f12586a = videoLifecycleCallbacks;
    }

    /* renamed from: a */
    public final void mo12144a() {
        this.f12586a.onVideoStart();
    }

    /* renamed from: a */
    public final void mo12145a(boolean z) {
        this.f12586a.onVideoMute(z);
    }

    /* renamed from: b */
    public final void mo12146b() {
        this.f12586a.onVideoPlay();
    }

    /* renamed from: c */
    public final void mo12147c() {
        this.f12586a.onVideoPause();
    }

    /* renamed from: d */
    public final void mo12148d() {
        this.f12586a.onVideoEnd();
    }
}
