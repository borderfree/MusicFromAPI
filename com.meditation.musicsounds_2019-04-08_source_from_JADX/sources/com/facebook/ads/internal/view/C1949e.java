package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.p059a.C1650g;
import com.facebook.ads.internal.adapters.p059a.C1651h;
import com.facebook.ads.internal.p070l.C1714a;
import com.facebook.ads.internal.p070l.C1714a.C1715a;
import com.facebook.ads.internal.p070l.C1716b;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.p083t.C1838a.C1839a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.component.p087a.C1915b;
import com.facebook.ads.internal.view.component.p087a.C1916c;
import com.facebook.ads.internal.view.component.p087a.C1917d.C1919a;
import com.facebook.ads.internal.view.p086c.C1896d;
import com.facebook.ads.internal.view.p086c.C1897e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.e */
public class C1949e extends C2104h {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1650g f6461e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1838a f6462f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1806p f6463g = new C1806p();

    /* renamed from: h */
    private final C1839a f6464h;

    /* renamed from: i */
    private long f6465i;

    public C1949e(Context context, C1650g gVar, C1728c cVar, C1845a aVar) {
        super(context, cVar, aVar);
        this.f6461e = gVar;
        this.f6464h = new C1839a() {
            /* renamed from: a */
            public void mo7113a() {
                if (!C1949e.this.f6463g.mo7070b()) {
                    C1949e.this.f6463g.mo7068a();
                    HashMap hashMap = new HashMap();
                    C1949e.this.f6462f.mo7108a((Map<String, String>) hashMap);
                    hashMap.put("touch", C1800k.m8915a(C1949e.this.f6463g.mo7071c()));
                    C1949e.this.f6891b.mo6939a(C1949e.this.f6461e.mo6723c(), hashMap);
                    if (C1949e.this.getAudienceNetworkListener() != null) {
                        C1949e.this.getAudienceNetworkListener().mo6645a("com.facebook.ads.interstitial.impression.logged");
                    }
                }
            }
        };
        this.f6462f = new C1838a(this, 100, this.f6464h);
        this.f6462f.mo7107a(gVar.mo6726f());
    }

    private void setUpContent(int i) {
        C1651h hVar = (C1651h) this.f6461e.mo6724d().get(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        C1896d a = new C1896d(imageView).mo7237a(hVar.mo6731c().mo6687i(), hVar.mo6731c().mo6686h());
        a.mo7238a((C1897e) new C1897e() {
            /* renamed from: a */
            public void mo7245a(boolean z) {
                if (z) {
                    C1949e.this.f6462f.mo7106a();
                }
            }
        });
        a.mo7240a(hVar.mo6731c().mo6685g());
        C1919a aVar = new C1919a(getContext(), this.f6891b, getAudienceNetworkListener(), this.f6461e, imageView, this.f6462f, this.f6463g);
        C1915b a2 = C1916c.m9271a(aVar.mo7307a(f6890a).mo7311b(i).mo7310a());
        mo7642a(a2, a2.mo7256a(), i);
    }

    /* renamed from: a */
    public void mo6761a() {
        if (this.f6461e != null) {
            C1716b.m8601a(C1714a.m8599a(this.f6465i, C1715a.XOUT, this.f6461e.mo6725e()));
            if (!TextUtils.isEmpty(this.f6461e.mo6723c())) {
                HashMap hashMap = new HashMap();
                this.f6462f.mo7108a((Map<String, String>) hashMap);
                hashMap.put("touch", C1800k.m8915a(this.f6463g.mo7071c()));
                this.f6891b.mo6946g(this.f6461e.mo6723c(), hashMap);
            }
        }
        this.f6462f.mo7111c();
        super.mo6761a();
    }

    /* renamed from: a */
    public void mo6770a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        super.mo7643a(audienceNetworkActivity, this.f6461e);
        setUpContent(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.f6465i = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo6772a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo6773a(boolean z) {
    }

    /* renamed from: b */
    public void mo6774b(boolean z) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        removeAllViews();
        setUpContent(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f6463g.mo7069a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
