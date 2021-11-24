package com.facebook.ads.internal.view.p093g.p097d;

import android.net.Uri;
import android.view.View;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;

/* renamed from: com.facebook.ads.internal.view.g.d.c */
public interface C2100c {
    /* renamed from: a */
    void mo7557a(int i);

    /* renamed from: a */
    void mo7559a(C2000a aVar);

    /* renamed from: a */
    void mo7564a(boolean z);

    /* renamed from: b */
    void mo7566b();

    /* renamed from: c */
    void mo7568c();

    /* renamed from: d */
    void mo7569d();

    /* renamed from: e */
    boolean mo7570e();

    /* renamed from: g */
    void mo7572g();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    C2000a getStartReason();

    C2101d getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(C2102e eVar);

    void setup(Uri uri);
}
