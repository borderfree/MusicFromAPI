package com.facebook.ads.internal.view.p089d.p090a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p023v7.widget.C1050au;
import android.support.p023v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1650g;
import com.facebook.ads.internal.adapters.p059a.C1651h;
import com.facebook.ads.internal.p064f.C1684a;
import com.facebook.ads.internal.p070l.C1714a;
import com.facebook.ads.internal.p070l.C1714a.C1715a;
import com.facebook.ads.internal.p070l.C1716b;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.p083t.C1838a.C1839a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.C2104h;
import com.facebook.ads.internal.view.component.C1923c;
import com.facebook.ads.internal.view.p089d.p090a.C1937d.C1938a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.d.a.f */
public class C1941f extends C2104h {

    /* renamed from: e */
    private static final int f6418e = ((int) (C1808r.f5899b * 48.0f));

    /* renamed from: f */
    private static final int f6419f = ((int) (C1808r.f5899b * 8.0f));

    /* renamed from: g */
    private static final int f6420g = ((int) (C1808r.f5899b * 8.0f));

    /* renamed from: h */
    private static final int f6421h = ((int) (C1808r.f5899b * 56.0f));

    /* renamed from: i */
    private static final int f6422i = ((int) (C1808r.f5899b * 12.0f));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1806p f6423j = new C1806p();

    /* renamed from: k */
    private C1684a f6424k;

    /* renamed from: l */
    private LinearLayout f6425l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f6426m;

    /* renamed from: n */
    private long f6427n;

    /* renamed from: o */
    private String f6428o;

    /* renamed from: p */
    private List<C1935b> f6429p;

    /* renamed from: q */
    private C1931a f6430q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1923c f6431r;

    /* renamed from: s */
    private C1936c f6432s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C1838a f6433t;

    /* renamed from: u */
    private C1839a f6434u;

    /* renamed from: v */
    private int f6435v;

    /* renamed from: w */
    private int f6436w;

    public C1941f(Context context, C1728c cVar, C1684a aVar, C1845a aVar2) {
        super(context, cVar, aVar2);
        this.f6424k = aVar;
    }

    /* renamed from: a */
    private void m9381a(C1650g gVar) {
        this.f6426m = gVar.mo6723c();
        this.f6428o = gVar.mo6725e();
        this.f6435v = gVar.mo6726f();
        this.f6436w = gVar.mo6727g();
        List d = gVar.mo6724d();
        this.f6429p = new ArrayList(d.size());
        for (int i = 0; i < d.size(); i++) {
            this.f6429p.add(new C1935b(i, d.size(), (C1651h) d.get(i)));
        }
    }

    /* renamed from: a */
    private void m9382a(C1931a aVar) {
        new C1050au().mo5339a((RecyclerView) this.f6432s);
        aVar.mo7329a((C1938a) new C1938a() {
            /* renamed from: a */
            public void mo7339a(int i) {
                if (C1941f.this.f6431r != null) {
                    C1941f.this.f6431r.mo7317a(i);
                }
            }
        });
        this.f6431r = new C1923c(getContext(), this.f6893d.mo6676a(), this.f6429p.size());
        LayoutParams layoutParams = new LayoutParams(-1, f6420g);
        layoutParams.setMargins(0, f6422i, 0, 0);
        this.f6431r.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo6761a() {
        super.mo6761a();
        C1716b.m8601a(C1714a.m8599a(this.f6427n, C1715a.XOUT, this.f6428o));
        if (!TextUtils.isEmpty(this.f6426m)) {
            HashMap hashMap = new HashMap();
            this.f6433t.mo7108a((Map<String, String>) hashMap);
            hashMap.put("touch", C1800k.m8915a(this.f6423j.mo7071c()));
            this.f6891b.mo6946g(this.f6426m, hashMap);
        }
        mo7352b();
        this.f6433t.mo7111c();
        this.f6433t = null;
        this.f6434u = null;
        this.f6429p = null;
    }

    /* renamed from: a */
    public void mo6770a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        C1650g gVar = (C1650g) intent.getSerializableExtra("ad_data_bundle");
        super.mo7643a(audienceNetworkActivity, gVar);
        m9381a(gVar);
        setUpLayout(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.f6427n = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo6772a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo6773a(boolean z) {
        if (this.f6430q != null) {
            this.f6430q.mo7328a();
        }
    }

    /* renamed from: b */
    public void mo7352b() {
        if (this.f6425l != null) {
            this.f6425l.removeAllViews();
            this.f6425l = null;
        }
        if (this.f6432s != null) {
            this.f6432s.removeAllViews();
            this.f6432s = null;
        }
        if (this.f6431r != null) {
            this.f6431r.removeAllViews();
            this.f6431r = null;
        }
    }

    /* renamed from: b */
    public void mo6774b(boolean z) {
        this.f6430q.mo7330b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        mo7352b();
        setUpLayout(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f6423j.mo7069a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setUpLayout(int i) {
        LinearLayout linearLayout;
        int i2;
        int i3;
        int i4;
        int i5;
        C1941f fVar;
        int i6 = i;
        this.f6425l = new LinearLayout(getContext());
        if (i6 == 1) {
            linearLayout = this.f6425l;
            i2 = 17;
        } else {
            linearLayout = this.f6425l;
            i2 = 48;
        }
        linearLayout.setGravity(i2);
        this.f6425l.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f6425l.setOrientation(1);
        int i7 = C1808r.f5898a.widthPixels;
        int i8 = C1808r.f5898a.heightPixels;
        if (i6 == 1) {
            i3 = Math.min(i7 - (f6419f * 4), i8 / 2);
            i4 = (i7 - i3) / 8;
            i5 = i4 * 4;
        } else {
            i3 = i8 - ((f6421h + f6418e) + (f6419f * 2));
            i4 = f6419f;
            i5 = i4 * 2;
        }
        int i9 = i4;
        int i10 = i3;
        int i11 = i5;
        this.f6434u = new C1839a() {
            /* renamed from: a */
            public void mo7113a() {
                HashMap hashMap = new HashMap();
                if (!C1941f.this.f6423j.mo7070b()) {
                    C1941f.this.f6423j.mo7068a();
                    if (C1941f.this.getAudienceNetworkListener() != null) {
                        C1941f.this.getAudienceNetworkListener().mo6645a("com.facebook.ads.interstitial.impression.logged");
                    }
                    if (!TextUtils.isEmpty(C1941f.this.f6426m)) {
                        C1941f.this.f6433t.mo7108a((Map<String, String>) hashMap);
                        hashMap.put("touch", C1800k.m8915a(C1941f.this.f6423j.mo7071c()));
                        C1941f.this.f6891b.mo6939a(C1941f.this.f6426m, hashMap);
                    }
                }
            }
        };
        this.f6433t = new C1838a(this, 1, this.f6434u);
        this.f6433t.mo7107a(this.f6435v);
        this.f6433t.mo7109b(this.f6436w);
        this.f6432s = new C1936c(getContext());
        this.f6432s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.f6430q = new C1931a(this.f6432s, i6, this.f6429p, this.f6433t);
        C1936c cVar = this.f6432s;
        List<C1935b> list = this.f6429p;
        C1728c cVar2 = this.f6891b;
        C1684a aVar = this.f6424k;
        C1838a aVar2 = this.f6433t;
        C1806p pVar = this.f6423j;
        C1845a audienceNetworkListener = getAudienceNetworkListener();
        C1647d a = i6 == 1 ? this.f6893d.mo6676a() : this.f6893d.mo6677b();
        String str = this.f6426m;
        C1931a aVar3 = this.f6430q;
        C1937d dVar = r1;
        C1936c cVar3 = cVar;
        C1937d dVar2 = new C1937d(list, cVar2, aVar, aVar2, pVar, audienceNetworkListener, a, str, i10, i9, i11, i, aVar3);
        cVar3.setAdapter(dVar);
        int i12 = i;
        if (i12 == 1) {
            fVar = this;
            fVar.m9382a(fVar.f6430q);
        } else {
            fVar = this;
        }
        fVar.f6425l.addView(fVar.f6432s);
        if (fVar.f6431r != null) {
            fVar.f6425l.addView(fVar.f6431r);
        }
        fVar.mo7642a(fVar.f6425l, false, i12);
    }
}
