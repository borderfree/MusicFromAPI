package com.facebook.ads.internal.view.p093g;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p070l.C1718d;
import com.facebook.ads.internal.p070l.C1719e;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.settings.C1837b;
import com.facebook.ads.internal.view.p093g.C2041c.C2044a;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p094a.C2002c;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2019d;
import com.facebook.ads.internal.view.p093g.p095b.C2023h;
import com.facebook.ads.internal.view.p093g.p095b.C2025j;
import com.facebook.ads.internal.view.p093g.p095b.C2027l;
import com.facebook.ads.internal.view.p093g.p095b.C2029n;
import com.facebook.ads.internal.view.p093g.p095b.C2031p;
import com.facebook.ads.internal.view.p093g.p095b.C2033r;
import com.facebook.ads.internal.view.p093g.p095b.C2034s;
import com.facebook.ads.internal.view.p093g.p095b.C2035t;
import com.facebook.ads.internal.view.p093g.p095b.C2037v;
import com.facebook.ads.internal.view.p093g.p095b.C2038x;
import com.facebook.ads.internal.view.p093g.p095b.C2039y;
import com.facebook.ads.internal.view.p093g.p096c.C2066e;
import com.facebook.ads.internal.view.p093g.p097d.C2092a;
import com.facebook.ads.internal.view.p093g.p097d.C2096b;
import com.facebook.ads.internal.view.p093g.p097d.C2100c;
import com.facebook.ads.internal.view.p093g.p097d.C2101d;
import com.facebook.ads.internal.view.p093g.p097d.C2102e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.g.a */
public class C1994a extends RelativeLayout implements C2044a, C2102e {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C2027l f6614b = new C2027l();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C2019d f6615c = new C2019d();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C2033r f6616d = new C2033r();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C2023h f6617e = new C2023h();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C2034s f6618f = new C2034s();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C2025j f6619g = new C2025j();

    /* renamed from: h */
    private static final C2037v f6620h = new C2037v();

    /* renamed from: i */
    private static final C2039y f6621i = new C2039y();

    /* renamed from: j */
    private static final C2038x f6622j = new C2038x();

    /* renamed from: a */
    protected final C2100c f6623a;

    /* renamed from: k */
    private C2090d f6624k;

    /* renamed from: l */
    private final List<C2001b> f6625l = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Handler f6626m = new Handler();

    /* renamed from: n */
    private final Handler f6627n = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1719e<C1720f, C1718d> f6628o = new C1719e<>();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f6629p;

    /* renamed from: q */
    private boolean f6630q;

    /* renamed from: r */
    private boolean f6631r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f6632s = 200;

    /* renamed from: t */
    private final OnTouchListener f6633t = new OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C1994a.this.f6628o.mo6905a(new C2035t(view, motionEvent));
            return false;
        }
    };

    public C1994a(Context context) {
        super(context);
        this.f6623a = C1713a.m8569a(context) ? new C2092a(context) : new C2096b(context);
        m9563s();
    }

    /* renamed from: a */
    private void m9549a(C2002c cVar) {
        if (cVar.getParent() != null) {
            return;
        }
        if (cVar instanceof C2066e) {
            this.f6624k.mo7550a(cVar);
        } else {
            addView(cVar);
        }
    }

    /* renamed from: b */
    private void m9553b(C2002c cVar) {
        if (cVar instanceof C2066e) {
            this.f6624k.mo7551b(cVar);
        } else {
            C1808r.m8940b(cVar);
        }
    }

    /* renamed from: s */
    private void m9563s() {
        if (mo7430f() && (this.f6623a instanceof C2092a)) {
            ((C2092a) this.f6623a).setTestMode(C1837b.m9006a(getContext()));
        }
        this.f6623a.setRequestedVolume(1.0f);
        this.f6623a.setVideoStateChangeListener(this);
        this.f6624k = new C2090d(getContext(), this.f6623a);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f6624k, layoutParams);
        setOnTouchListener(this.f6633t);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m9564t() {
        this.f6626m.postDelayed(new Runnable() {
            public void run() {
                if (!C1994a.this.f6629p) {
                    C1994a.this.f6628o.mo6905a(new C2029n(C1994a.this.getCurrentPositionInMillis()));
                    C1994a.this.f6626m.postDelayed(this, (long) C1994a.this.f6632s);
                }
            }
        }, (long) this.f6632s);
    }

    /* renamed from: a */
    public void mo7419a() {
        for (C2001b bVar : this.f6625l) {
            if (bVar instanceof C2002c) {
                m9549a((C2002c) bVar);
            }
            bVar.mo7380a(this);
        }
    }

    /* renamed from: a */
    public void mo7420a(int i) {
        this.f6626m.removeCallbacksAndMessages(null);
        this.f6623a.mo7557a(i);
    }

    /* renamed from: a */
    public void mo7421a(final int i, final int i2) {
        this.f6627n.post(new Runnable() {
            public void run() {
                C1994a.this.f6628o.mo6905a(new C2031p(i, i2));
            }
        });
        m9564t();
    }

    /* renamed from: a */
    public void mo7422a(C2000a aVar) {
        if (this.f6629p && this.f6623a.getState() == C2101d.PLAYBACK_COMPLETED) {
            this.f6629p = false;
        }
        this.f6623a.mo7559a(aVar);
    }

    /* renamed from: a */
    public void mo7423a(C2001b bVar) {
        this.f6625l.add(bVar);
    }

    /* renamed from: a */
    public void mo7424a(final C2101d dVar) {
        final int currentPositionInMillis = getCurrentPositionInMillis();
        final int duration = getDuration();
        this.f6627n.post(new Runnable() {
            public void run() {
                C1719e b;
                C1718d q;
                C1719e b2;
                C1718d bVar;
                if (dVar == C2101d.PREPARED) {
                    b2 = C1994a.this.f6628o;
                    bVar = C1994a.f6614b;
                } else if (dVar == C2101d.ERROR) {
                    C1994a.this.f6629p = true;
                    b2 = C1994a.this.f6628o;
                    bVar = C1994a.f6615c;
                } else if (dVar == C2101d.PLAYBACK_COMPLETED) {
                    C1994a.this.f6629p = true;
                    C1994a.this.f6626m.removeCallbacksAndMessages(null);
                    b2 = C1994a.this.f6628o;
                    bVar = new C2017b(currentPositionInMillis, duration);
                } else if (dVar == C2101d.STARTED) {
                    C1994a.this.f6628o.mo6905a(C1994a.f6619g);
                    C1994a.this.f6626m.removeCallbacksAndMessages(null);
                    C1994a.this.m9564t();
                    return;
                } else {
                    if (dVar == C2101d.PAUSED) {
                        b = C1994a.this.f6628o;
                        q = C1994a.f6617e;
                    } else if (dVar == C2101d.IDLE) {
                        b = C1994a.this.f6628o;
                        q = C1994a.f6618f;
                    } else {
                        return;
                    }
                    b.mo6905a(q);
                    C1994a.this.f6626m.removeCallbacksAndMessages(null);
                    return;
                }
                b2.mo6905a(bVar);
            }
        });
    }

    /* renamed from: a */
    public void mo7425a(boolean z) {
        if (!mo7448k()) {
            this.f6623a.mo7564a(z);
            this.f6631r = z;
        }
    }

    /* renamed from: b */
    public void mo7426b() {
        for (C2001b bVar : this.f6625l) {
            if (bVar instanceof C2002c) {
                m9553b((C2002c) bVar);
            }
            bVar.mo7384b(this);
        }
    }

    /* renamed from: c */
    public void mo7427c() {
        if (!mo7448k()) {
            this.f6623a.mo7566b();
        }
    }

    /* renamed from: d */
    public void mo7428d() {
        this.f6627n.post(new Runnable() {
            public void run() {
                C1994a.this.getEventBus().mo6905a(C1994a.f6616d);
            }
        });
        this.f6623a.mo7568c();
    }

    /* renamed from: e */
    public void mo7429e() {
        this.f6623a.mo7569d();
    }

    /* renamed from: f */
    public boolean mo7430f() {
        return C1713a.m8569a(getContext());
    }

    /* renamed from: g */
    public boolean mo7431g() {
        return this.f6630q;
    }

    public int getCurrentPositionInMillis() {
        return this.f6623a.getCurrentPosition();
    }

    public int getDuration() {
        return this.f6623a.getDuration();
    }

    public C1719e<C1720f, C1718d> getEventBus() {
        return this.f6628o;
    }

    public long getInitialBufferTime() {
        return this.f6623a.getInitialBufferTime();
    }

    public C2101d getState() {
        return this.f6623a.getState();
    }

    /* access modifiers changed from: protected */
    public Handler getStateHandler() {
        return this.f6627n;
    }

    public TextureView getTextureView() {
        return (TextureView) this.f6623a;
    }

    public int getVideoHeight() {
        return this.f6623a.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.f6632s;
    }

    public C2000a getVideoStartReason() {
        return this.f6623a.getStartReason();
    }

    public View getVideoView() {
        return this.f6624k;
    }

    public int getVideoWidth() {
        return this.f6623a.getVideoWidth();
    }

    public float getVolume() {
        return this.f6623a.getVolume();
    }

    /* renamed from: h */
    public boolean mo7445h() {
        return getState() == C2101d.STARTED;
    }

    /* renamed from: i */
    public boolean mo7446i() {
        return this.f6623a.mo7570e();
    }

    /* renamed from: j */
    public void mo7447j() {
        this.f6623a.setVideoStateChangeListener(null);
        this.f6623a.mo7572g();
    }

    /* renamed from: k */
    public boolean mo7448k() {
        return getState() == C2101d.PAUSED;
    }

    /* renamed from: l */
    public boolean mo7449l() {
        return mo7448k() && this.f6631r;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        this.f6628o.mo6905a(f6622j);
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f6628o.mo6905a(f6621i);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.f6623a != null) {
            this.f6623a.setControlsAnchorView(view);
        }
    }

    public void setIsFullScreen(boolean z) {
        this.f6630q = z;
        this.f6623a.setFullScreen(z);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(String str) {
        this.f6623a.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.f6632s = i;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            mo7426b();
        } else {
            mo7419a();
            this.f6623a.setup(uri);
        }
        this.f6629p = false;
    }

    public void setVideoURI(String str) {
        setVideoURI(str != null ? Uri.parse(str) : null);
    }

    public void setVolume(float f) {
        this.f6623a.setRequestedVolume(f);
        getEventBus().mo6905a(f6620h);
    }
}
