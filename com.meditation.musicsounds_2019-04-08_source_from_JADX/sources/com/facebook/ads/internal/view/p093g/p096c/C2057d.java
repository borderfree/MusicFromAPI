package com.facebook.ads.internal.view.p093g.p096c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.view.View;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2023h;
import com.facebook.ads.internal.view.p093g.p095b.C2024i;
import com.facebook.ads.internal.view.p093g.p095b.C2025j;
import com.facebook.ads.internal.view.p093g.p095b.C2026k;
import com.facebook.ads.internal.view.p093g.p095b.C2032q;
import com.facebook.ads.internal.view.p093g.p095b.C2035t;

@TargetApi(12)
/* renamed from: com.facebook.ads.internal.view.g.c.d */
public class C2057d implements C2001b {

    /* renamed from: a */
    private final C2024i f6738a;

    /* renamed from: b */
    private final C2026k f6739b;

    /* renamed from: c */
    private final C2018c f6740c;

    /* renamed from: d */
    private final C2032q f6741d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Handler f6742e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final boolean f6743f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f6744g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public View f6745h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2065a f6746i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1994a f6747j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6748k;

    /* renamed from: com.facebook.ads.internal.view.g.c.d$a */
    public enum C2065a {
        VISIBLE,
        INVSIBLE,
        FADE_OUT_ON_PLAY
    }

    public C2057d(View view, C2065a aVar, boolean z) {
        this(view, aVar, z, false);
    }

    public C2057d(View view, C2065a aVar, boolean z, boolean z2) {
        this.f6738a = new C2024i() {
            /* renamed from: a */
            public void mo6765a(C2023h hVar) {
                C2057d.this.m9703a(1, 0);
            }
        };
        this.f6739b = new C2026k() {
            /* renamed from: a */
            public void mo6765a(C2025j jVar) {
                if (C2057d.this.f6748k) {
                    if (C2057d.this.f6746i == C2065a.FADE_OUT_ON_PLAY || C2057d.this.f6743f) {
                        C2057d.this.f6746i = null;
                        C2057d.this.m9709c();
                        return;
                    }
                    C2057d.this.m9703a(0, 8);
                }
            }
        };
        this.f6740c = new C2018c() {
            /* renamed from: a */
            public void mo6765a(C2017b bVar) {
                if (C2057d.this.f6746i != C2065a.INVSIBLE) {
                    C2057d.this.f6745h.setAlpha(1.0f);
                    C2057d.this.f6745h.setVisibility(0);
                }
            }
        };
        this.f6741d = new C2032q() {
            /* renamed from: a */
            public void mo6765a(C2035t tVar) {
                if (C2057d.this.f6747j != null && tVar.mo7486a().getAction() == 0) {
                    C2057d.this.f6742e.removeCallbacksAndMessages(null);
                    C2057d.this.m9704a((AnimatorListenerAdapter) new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            C2057d.this.f6742e.postDelayed(new Runnable() {
                                public void run() {
                                    if (!C2057d.this.f6744g && C2057d.this.f6748k) {
                                        C2057d.this.m9709c();
                                    }
                                }
                            }, 2000);
                        }
                    });
                }
            }
        };
        this.f6748k = true;
        this.f6742e = new Handler();
        this.f6743f = z;
        this.f6744g = z2;
        mo7513a(view, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9703a(int i, int i2) {
        this.f6742e.removeCallbacksAndMessages(null);
        this.f6745h.clearAnimation();
        this.f6745h.setAlpha((float) i);
        this.f6745h.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9704a(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f6745h.setVisibility(0);
        this.f6745h.animate().alpha(1.0f).setDuration(500).setListener(animatorListenerAdapter);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m9709c() {
        this.f6745h.animate().alpha(0.0f).setDuration(500).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                C2057d.this.f6745h.setVisibility(8);
            }
        });
    }

    /* renamed from: a */
    public void mo7513a(View view, C2065a aVar) {
        View view2;
        int i;
        this.f6746i = aVar;
        this.f6745h = view;
        this.f6745h.clearAnimation();
        if (aVar == C2065a.INVSIBLE) {
            this.f6745h.setAlpha(0.0f);
            view2 = this.f6745h;
            i = 8;
        } else {
            this.f6745h.setAlpha(1.0f);
            view2 = this.f6745h;
            i = 0;
        }
        view2.setVisibility(i);
    }

    /* renamed from: a */
    public void mo7380a(C1994a aVar) {
        this.f6747j = aVar;
        aVar.getEventBus().mo6906a((T[]) new C1720f[]{this.f6738a, this.f6739b, this.f6741d, this.f6740c});
    }

    /* renamed from: a */
    public boolean mo7514a() {
        return this.f6748k;
    }

    /* renamed from: b */
    public void mo7515b() {
        this.f6748k = false;
        m9704a((AnimatorListenerAdapter) null);
    }

    /* renamed from: b */
    public void mo7384b(C1994a aVar) {
        m9703a(1, 0);
        aVar.getEventBus().mo6908b((T[]) new C1720f[]{this.f6740c, this.f6741d, this.f6739b, this.f6738a});
        this.f6747j = null;
    }
}
