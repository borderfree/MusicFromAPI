package com.facebook.ads.internal.view.p093g.p096c;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.view.p093g.p094a.C2002c;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2023h;
import com.facebook.ads.internal.view.p093g.p095b.C2024i;
import com.facebook.ads.internal.view.p093g.p095b.C2025j;
import com.facebook.ads.internal.view.p093g.p095b.C2026k;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.g.c.b */
public class C2048b extends C2002c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WeakReference<OnAudioFocusChangeListener> f6722a = null;

    /* renamed from: b */
    private final C2018c f6723b = new C2018c() {
        /* renamed from: a */
        public void mo6765a(C2017b bVar) {
            ((AudioManager) C2048b.this.getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(C2048b.this.f6722a == null ? null : (OnAudioFocusChangeListener) C2048b.this.f6722a.get());
        }
    };

    /* renamed from: c */
    private final C2024i f6724c = new C2024i() {
        /* renamed from: a */
        public void mo6765a(C2023h hVar) {
            ((AudioManager) C2048b.this.getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(C2048b.this.f6722a == null ? null : (OnAudioFocusChangeListener) C2048b.this.f6722a.get());
        }
    };

    /* renamed from: d */
    private final C2026k f6725d = new C2026k() {
        /* renamed from: a */
        public void mo6765a(C2025j jVar) {
            if (C2048b.this.f6722a == null || C2048b.this.f6722a.get() == null) {
                C2048b.this.f6722a = new WeakReference(new OnAudioFocusChangeListener() {
                    public void onAudioFocusChange(final int i) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                if (C2048b.this.getVideoView() != null && i <= 0) {
                                    C2048b.this.getVideoView().mo7425a(false);
                                }
                            }
                        });
                    }
                });
            }
            ((AudioManager) C2048b.this.getContext().getApplicationContext().getSystemService("audio")).requestAudioFocus((OnAudioFocusChangeListener) C2048b.this.f6722a.get(), 3, 1);
        }
    };

    public C2048b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7465a() {
        super.mo7465a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo6906a((T[]) new C1720f[]{this.f6725d, this.f6723b, this.f6724c});
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7466b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo6908b((T[]) new C1720f[]{this.f6724c, this.f6723b, this.f6725d});
        }
        super.mo7466b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(this.f6722a == null ? null : (OnAudioFocusChangeListener) this.f6722a.get());
        super.onDetachedFromWindow();
    }
}
