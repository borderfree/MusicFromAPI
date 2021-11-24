package com.facebook.ads.internal.view.p093g;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.System;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.facebook.ads.internal.p060b.C1673a;
import com.facebook.ads.internal.p060b.C1674b;
import com.facebook.ads.internal.p060b.C1675c;
import com.facebook.ads.internal.p060b.C1675c.C1676a;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1807q;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.g.c */
public class C2041c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f6699a;

    /* renamed from: b */
    private boolean f6700b;

    /* renamed from: c */
    private final Context f6701c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1728c f6702d;

    /* renamed from: e */
    private final C2044a f6703e;

    /* renamed from: f */
    private final C1673a f6704f;

    /* renamed from: g */
    private int f6705g;

    /* renamed from: h */
    private int f6706h;

    /* renamed from: i */
    private final C2103e f6707i;

    /* renamed from: j */
    private final Map<String, String> f6708j;

    /* renamed from: com.facebook.ads.internal.view.g.c$a */
    public interface C2044a {
        /* renamed from: f */
        boolean mo7430f();

        /* renamed from: g */
        boolean mo7431g();

        int getCurrentPositionInMillis();

        boolean getGlobalVisibleRect(Rect rect);

        long getInitialBufferTime();

        int getMeasuredHeight();

        int getMeasuredWidth();

        C2000a getVideoStartReason();

        float getVolume();
    }

    /* renamed from: com.facebook.ads.internal.view.g.c$b */
    protected enum C2045b {
        PLAY(0),
        SKIP(1),
        TIME(2),
        MRC(3),
        PAUSE(4),
        RESUME(5),
        MUTE(6),
        UNMUTE(7),
        VIEWABLE_IMPRESSION(10);
        

        /* renamed from: j */
        public final int f6721j;

        private C2045b(int i) {
            this.f6721j = i;
        }
    }

    public C2041c(Context context, C1728c cVar, C2044a aVar, List<C1674b> list, String str) {
        this(context, cVar, aVar, list, str, null);
    }

    public C2041c(Context context, C1728c cVar, C2044a aVar, List<C1674b> list, String str, Bundle bundle) {
        this(context, cVar, aVar, list, str, bundle, null);
    }

    public C2041c(Context context, C1728c cVar, C2044a aVar, List<C1674b> list, String str, Bundle bundle, Map<String, String> map) {
        C2044a aVar2 = aVar;
        List<C1674b> list2 = list;
        Bundle bundle2 = bundle;
        this.f6700b = true;
        this.f6705g = 0;
        this.f6706h = 0;
        this.f6701c = context;
        this.f6702d = cVar;
        this.f6703e = aVar2;
        this.f6699a = str;
        this.f6708j = map;
        C20421 r0 = new C1674b(0.5d, -1.0d, 2.0d, true) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo6794a(boolean z, boolean z2, C1675c cVar) {
                if (z2) {
                    C2041c.this.f6702d.mo6943d(C2041c.this.f6699a, C2041c.this.m9652a(C2045b.MRC));
                }
            }
        };
        list2.add(r0);
        C20432 r02 = new C1674b(1.0E-7d, -1.0d, 0.001d, false) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo6794a(boolean z, boolean z2, C1675c cVar) {
                if (z2) {
                    C2041c.this.f6702d.mo6943d(C2041c.this.f6699a, C2041c.this.m9652a(C2045b.VIEWABLE_IMPRESSION));
                }
            }
        };
        list2.add(r02);
        if (bundle2 != null) {
            this.f6704f = new C1673a((View) aVar2, list2, bundle2.getBundle("adQualityManager"));
            this.f6705g = bundle2.getInt("lastProgressTimeMS");
            this.f6706h = bundle2.getInt("lastBoundaryTimeMS");
        } else {
            this.f6704f = new C1673a((View) aVar2, list2);
        }
        this.f6707i = new C2103e(new Handler(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m9652a(C2045b bVar) {
        return m9653a(bVar, this.f6703e.getCurrentPositionInMillis());
    }

    /* renamed from: a */
    private Map<String, String> m9653a(C2045b bVar, int i) {
        Map<String, String> c = m9662c(i);
        c.put("action", String.valueOf(bVar.f6721j));
        return c;
    }

    /* renamed from: a */
    private void mo7468a() {
        this.f6702d.mo6943d(this.f6699a, m9652a(C2045b.MUTE));
    }

    /* renamed from: a */
    private void m9656a(int i, boolean z) {
        if (((double) i) > 0.0d && i >= this.f6705g) {
            if (i > this.f6705g) {
                this.f6704f.mo6791a((double) (((float) (i - this.f6705g)) / 1000.0f), (double) mo7494d());
                this.f6705g = i;
                if (i - this.f6706h >= 5000) {
                    this.f6702d.mo6943d(this.f6699a, m9653a(C2045b.TIME, i));
                    this.f6706h = this.f6705g;
                    this.f6704f.mo6790a();
                    return;
                }
            }
            if (z) {
                this.f6702d.mo6943d(this.f6699a, m9653a(C2045b.TIME, i));
            }
        }
    }

    /* renamed from: a */
    private void m9657a(HashMap<String, String> hashMap) {
        if (this.f6708j != null) {
            hashMap.putAll(this.f6708j);
        }
    }

    /* renamed from: a */
    private void m9658a(Map<String, String> map) {
        map.put("exoplayer", String.valueOf(this.f6703e.mo7430f()));
        map.put("prep", Long.toString(this.f6703e.getInitialBufferTime()));
    }

    /* renamed from: a */
    private void m9659a(Map<String, String> map, int i) {
        map.put("ptime", String.valueOf(((float) this.f6706h) / 1000.0f));
        map.put("time", String.valueOf(((float) i) / 1000.0f));
    }

    /* renamed from: b */
    private void m9661b(Map<String, String> map) {
        C1675c c = this.f6704f.mo6793c();
        C1676a c2 = c.mo6799c();
        map.put("vwa", String.valueOf(c2.mo6805d()));
        map.put("vwm", String.valueOf(c2.mo6804c()));
        map.put("vwmax", String.valueOf(c2.mo6806e()));
        map.put("vtime_ms", String.valueOf(c2.mo6808g() * 1000.0d));
        map.put("mcvt_ms", String.valueOf(c2.mo6809h() * 1000.0d));
        C1676a d = c.mo6800d();
        map.put("vla", String.valueOf(d.mo6805d()));
        map.put("vlm", String.valueOf(d.mo6804c()));
        map.put("vlmax", String.valueOf(d.mo6806e()));
        map.put("atime_ms", String.valueOf(d.mo6808g() * 1000.0d));
        map.put("mcat_ms", String.valueOf(d.mo6809h() * 1000.0d));
    }

    /* renamed from: c */
    private Map<String, String> m9662c(int i) {
        HashMap hashMap = new HashMap();
        C1807q.m8928a(hashMap, this.f6703e.getVideoStartReason() == C2000a.AUTO_STARTED, !this.f6703e.mo7431g());
        m9658a((Map<String, String>) hashMap);
        m9661b((Map<String, String>) hashMap);
        m9659a((Map<String, String>) hashMap, i);
        m9663c((Map<String, String>) hashMap);
        m9657a(hashMap);
        return hashMap;
    }

    /* renamed from: c */
    private void m9663c(Map<String, String> map) {
        Rect rect = new Rect();
        this.f6703e.getGlobalVisibleRect(rect);
        map.put("pt", String.valueOf(rect.top));
        map.put("pl", String.valueOf(rect.left));
        map.put("ph", String.valueOf(this.f6703e.getMeasuredHeight()));
        map.put("pw", String.valueOf(this.f6703e.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.f6701c.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        map.put("vph", String.valueOf(displayMetrics.heightPixels));
        map.put("vpw", String.valueOf(displayMetrics.widthPixels));
    }

    /* renamed from: j */
    private void m9664j() {
        this.f6702d.mo6943d(this.f6699a, m9652a(C2045b.UNMUTE));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7489a(int i) {
        m9656a(i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7490a(int i, int i2) {
        m9656a(i, true);
        this.f6706h = i2;
        this.f6705g = i2;
        this.f6704f.mo6790a();
        this.f6704f.mo6792b();
    }

    /* renamed from: b */
    public void mo7491b() {
        this.f6701c.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f6707i);
    }

    /* renamed from: b */
    public void mo7492b(int i) {
        m9656a(i, true);
        this.f6706h = 0;
        this.f6705g = 0;
        this.f6704f.mo6790a();
        this.f6704f.mo6792b();
    }

    /* renamed from: c */
    public void mo7493c() {
        this.f6701c.getContentResolver().unregisterContentObserver(this.f6707i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float mo7494d() {
        return C1807q.m8927a(this.f6701c) * this.f6703e.getVolume();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo7495e() {
        boolean z;
        if (((double) mo7494d()) < 0.05d) {
            if (this.f6700b) {
                mo7468a();
                z = false;
            } else {
                return;
            }
        } else if (!this.f6700b) {
            m9664j();
            z = true;
        } else {
            return;
        }
        this.f6700b = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo7496f() {
        this.f6702d.mo6943d(this.f6699a, m9652a(C2045b.SKIP));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo7497g() {
        this.f6702d.mo6943d(this.f6699a, m9652a(C2045b.PAUSE));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo7498h() {
        this.f6702d.mo6943d(this.f6699a, m9652a(C2045b.RESUME));
    }

    /* renamed from: i */
    public int mo7499i() {
        return this.f6705g;
    }
}
