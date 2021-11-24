package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

@TargetApi(14)
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.pa */
public final class C3808pa implements OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f14632a;

    /* renamed from: b */
    private final C3810pc f14633b;

    /* renamed from: c */
    private boolean f14634c;

    /* renamed from: d */
    private boolean f14635d;

    /* renamed from: e */
    private boolean f14636e;

    /* renamed from: f */
    private float f14637f = 1.0f;

    public C3808pa(Context context, C3810pc pcVar) {
        this.f14632a = (AudioManager) context.getSystemService("audio");
        this.f14633b = pcVar;
    }

    /* renamed from: d */
    private final void m19367d() {
        boolean z = false;
        boolean z2 = this.f14635d && !this.f14636e && this.f14637f > 0.0f;
        if (!z2 || this.f14634c) {
            if (!z2 && this.f14634c) {
                if (this.f14632a != null && this.f14634c) {
                    if (this.f14632a.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.f14634c = z;
                }
                this.f14633b.mo13319e();
            }
            return;
        }
        if (this.f14632a != null && !this.f14634c) {
            if (this.f14632a.requestAudioFocus(this, 3, 2) == 1) {
                z = true;
            }
            this.f14634c = z;
        }
        this.f14633b.mo13319e();
    }

    /* renamed from: a */
    public final float mo13431a() {
        float f = this.f14636e ? 0.0f : this.f14637f;
        if (this.f14634c) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void mo13432a(float f) {
        this.f14637f = f;
        m19367d();
    }

    /* renamed from: a */
    public final void mo13433a(boolean z) {
        this.f14636e = z;
        m19367d();
    }

    /* renamed from: b */
    public final void mo13434b() {
        this.f14635d = true;
        m19367d();
    }

    /* renamed from: c */
    public final void mo13435c() {
        this.f14635d = false;
        m19367d();
    }

    public final void onAudioFocusChange(int i) {
        this.f14634c = i > 0;
        this.f14633b.mo13319e();
    }
}
