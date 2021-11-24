package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p070l.C1718d;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.p089d.C1947b;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.C2003b;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2019d;
import com.facebook.ads.internal.view.p093g.p095b.C2020e;
import com.facebook.ads.internal.view.p093g.p095b.C2021f;
import com.facebook.ads.internal.view.p093g.p095b.C2022g;
import com.facebook.ads.internal.view.p093g.p095b.C2023h;
import com.facebook.ads.internal.view.p093g.p095b.C2024i;
import com.facebook.ads.internal.view.p093g.p095b.C2025j;
import com.facebook.ads.internal.view.p093g.p095b.C2026k;
import com.facebook.ads.internal.view.p093g.p095b.C2031p;
import com.facebook.ads.internal.view.p093g.p096c.C2048b;

/* renamed from: com.facebook.ads.internal.view.m */
public class C2127m implements C1844a {

    /* renamed from: a */
    private final C2026k f6978a = new C2026k() {
        /* renamed from: a */
        public void mo6765a(C2025j jVar) {
            C2127m.this.f6985h.mo6646a("videoInterstitalEvent", (C1718d) jVar);
        }
    };

    /* renamed from: b */
    private final C2024i f6979b = new C2024i() {
        /* renamed from: a */
        public void mo6765a(C2023h hVar) {
            C2127m.this.f6985h.mo6646a("videoInterstitalEvent", (C1718d) hVar);
        }
    };

    /* renamed from: c */
    private final C2018c f6980c = new C2018c() {
        /* renamed from: a */
        public void mo6765a(C2017b bVar) {
            C2127m.this.f6985h.mo6646a("videoInterstitalEvent", (C1718d) bVar);
        }
    };

    /* renamed from: d */
    private final C2020e f6981d = new C2020e() {
        /* renamed from: a */
        public void mo6765a(C2019d dVar) {
            C2127m.this.f6982e.finish();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AudienceNetworkActivity f6982e;

    /* renamed from: f */
    private final C1728c f6983f;

    /* renamed from: g */
    private final C1994a f6984g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1845a f6985h;

    /* renamed from: i */
    private C2003b f6986i;

    /* renamed from: j */
    private int f6987j;

    public C2127m(final AudienceNetworkActivity audienceNetworkActivity, C1728c cVar, C1845a aVar) {
        this.f6982e = audienceNetworkActivity;
        this.f6983f = cVar;
        this.f6984g = new C1994a(audienceNetworkActivity);
        this.f6984g.mo7423a((C2001b) new C2048b(audienceNetworkActivity));
        this.f6984g.getEventBus().mo6906a((T[]) new C1720f[]{this.f6978a, this.f6979b, this.f6980c, this.f6981d});
        this.f6985h = aVar;
        this.f6984g.setIsFullScreen(true);
        this.f6984g.setVolume(1.0f);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(15);
        this.f6984g.setLayoutParams(layoutParams);
        aVar.mo6643a((View) this.f6984g);
        C1882c cVar2 = new C1882c(audienceNetworkActivity);
        cVar2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                audienceNetworkActivity.finish();
            }
        });
        aVar.mo6643a((View) cVar2);
    }

    /* renamed from: a */
    public void mo6761a() {
        this.f6985h.mo6646a("videoInterstitalEvent", (C1718d) new C2031p(this.f6987j, this.f6984g.getCurrentPositionInMillis()));
        this.f6986i.mo7492b(this.f6984g.getCurrentPositionInMillis());
        this.f6984g.mo7429e();
        this.f6984g.mo7447j();
    }

    /* renamed from: a */
    public void mo7664a(int i) {
        this.f6984g.setVideoProgressReportIntervalMs(i);
    }

    /* renamed from: a */
    public void mo6770a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        String stringExtra = intent.getStringExtra("useNativeCtaButton");
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C1947b bVar = new C1947b(audienceNetworkActivity, stringExtra);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            int i = (int) (C1808r.f5899b * 16.0f);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            bVar.setLayoutParams(layoutParams);
            bVar.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C2127m.this.f6985h.mo6645a("performCtaClick");
                }
            });
            this.f6985h.mo6643a((View) bVar);
        }
        this.f6987j = intent.getIntExtra("videoSeekTime", 0);
        C2003b bVar2 = new C2003b((Context) audienceNetworkActivity, this.f6983f, this.f6984g, intent.getStringExtra("clientToken"), intent.getBundleExtra("videoLogger"));
        this.f6986i = bVar2;
        this.f6984g.setVideoMPD(intent.getStringExtra("videoMPD"));
        this.f6984g.setVideoURI(intent.getStringExtra("videoURL"));
        if (this.f6987j > 0) {
            this.f6984g.mo7420a(this.f6987j);
        }
        if (intent.getBooleanExtra("autoplay", false)) {
            this.f6984g.mo7422a(C2000a.USER_STARTED);
        }
    }

    /* renamed from: a */
    public void mo6772a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo7665a(View view) {
        this.f6984g.setControlsAnchorView(view);
    }

    /* renamed from: a */
    public void mo6773a(boolean z) {
        this.f6985h.mo6646a("videoInterstitalEvent", (C1718d) new C2021f());
        this.f6984g.mo7427c();
    }

    /* renamed from: b */
    public void mo6774b(boolean z) {
        this.f6985h.mo6646a("videoInterstitalEvent", (C1718d) new C2022g());
        this.f6984g.mo7422a(C2000a.USER_STARTED);
    }

    public void setListener(C1845a aVar) {
    }
}
