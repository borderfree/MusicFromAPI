package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.jz */
public final class C3671jz {

    /* renamed from: a */
    private boolean f14293a = false;

    /* renamed from: b */
    private float f14294b = 1.0f;

    /* renamed from: a */
    public static float m18983a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    /* renamed from: c */
    private final synchronized boolean m18984c() {
        return this.f14294b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized float mo13166a() {
        if (!m18984c()) {
            return 1.0f;
        }
        return this.f14294b;
    }

    /* renamed from: a */
    public final synchronized void mo13167a(float f) {
        this.f14294b = f;
    }

    /* renamed from: a */
    public final synchronized void mo13168a(boolean z) {
        this.f14293a = z;
    }

    /* renamed from: b */
    public final synchronized boolean mo13169b() {
        return this.f14293a;
    }
}
