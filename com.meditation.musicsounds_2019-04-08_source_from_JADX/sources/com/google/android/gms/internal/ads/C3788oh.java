package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.oh */
public abstract class C3788oh extends TextureView implements C3810pc {

    /* renamed from: a */
    protected final C3797oq f14537a = new C3797oq();

    /* renamed from: b */
    protected final C3808pa f14538b;

    public C3788oh(Context context) {
        super(context);
        this.f14538b = new C3808pa(context, this);
    }

    /* renamed from: a */
    public abstract String mo13311a();

    /* renamed from: a */
    public abstract void mo13312a(float f, float f2);

    /* renamed from: a */
    public abstract void mo13313a(int i);

    /* renamed from: a */
    public abstract void mo13314a(C3787og ogVar);

    /* renamed from: b */
    public abstract void mo13315b();

    /* renamed from: c */
    public abstract void mo13317c();

    /* renamed from: d */
    public abstract void mo13318d();

    /* renamed from: e */
    public abstract void mo13319e();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
