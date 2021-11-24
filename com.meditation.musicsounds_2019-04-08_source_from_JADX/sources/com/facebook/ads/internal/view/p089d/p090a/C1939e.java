package com.facebook.ads.internal.view.p089d.p090a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.C2126l;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.C2003b;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p096c.C2048b;
import com.facebook.ads.internal.view.p093g.p096c.C2054c;
import com.facebook.ads.internal.view.p093g.p096c.C2057d;
import com.facebook.ads.internal.view.p093g.p096c.C2057d.C2065a;
import com.facebook.ads.internal.view.p093g.p096c.C2066e;
import com.facebook.ads.internal.view.p093g.p096c.C2071g;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.d.a.e */
public class C1939e extends FrameLayout {

    /* renamed from: a */
    private static final int f6410a = ((int) (C1808r.f5899b * 16.0f));

    /* renamed from: b */
    private final C1728c f6411b;

    /* renamed from: c */
    private C2126l f6412c;

    /* renamed from: d */
    private C2054c f6413d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2071g f6414e;

    /* renamed from: f */
    private C2066e f6415f;

    /* renamed from: g */
    private C2003b f6416g;

    public C1939e(Context context, C1728c cVar) {
        super(context);
        this.f6411b = cVar;
        setUpView(context);
    }

    private void setUpPlugins(Context context) {
        this.f6412c.mo7426b();
        this.f6415f = new C2066e(context);
        this.f6412c.mo7423a((C2001b) this.f6415f);
        this.f6413d = new C2054c(context);
        this.f6412c.mo7423a((C2001b) new C2048b(context));
        this.f6412c.mo7423a((C2001b) this.f6413d);
        this.f6414e = new C2071g(context, true);
        this.f6412c.mo7423a((C2001b) this.f6414e);
        this.f6412c.mo7423a((C2001b) new C2057d(this.f6414e, C2065a.FADE_OUT_ON_PLAY, true, true));
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(f6410a, f6410a, f6410a, f6410a);
        this.f6413d.setLayoutParams(layoutParams);
        this.f6412c.addView(this.f6413d);
    }

    private void setUpVideo(Context context) {
        this.f6412c = new C2126l(context);
        this.f6412c.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C1808r.m8931a((View) this.f6412c);
        addView(this.f6412c);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1939e.this.f6414e.performClick();
            }
        });
    }

    private void setUpView(Context context) {
        setUpVideo(context);
        setUpPlugins(context);
    }

    /* renamed from: a */
    public void mo7340a() {
        this.f6412c.mo7425a(true);
    }

    /* renamed from: a */
    public void mo7341a(C1720f fVar) {
        this.f6412c.getEventBus().mo6907a(fVar);
    }

    /* renamed from: a */
    public void mo7342a(C1728c cVar, String str, Map<String, String> map) {
        mo7345c();
        C2003b bVar = new C2003b(getContext(), cVar, (C1994a) this.f6412c, str, map);
        this.f6416g = bVar;
    }

    /* renamed from: a */
    public void mo7343a(C2000a aVar) {
        this.f6412c.mo7422a(aVar);
    }

    /* renamed from: b */
    public boolean mo7344b() {
        return this.f6412c.mo7445h();
    }

    /* renamed from: c */
    public void mo7345c() {
        if (this.f6416g != null) {
            this.f6416g.mo7468a();
            this.f6416g = null;
        }
    }

    public C1994a getSimpleVideoView() {
        return this.f6412c;
    }

    public float getVolume() {
        return this.f6412c.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.f6415f.setImage(str);
    }

    public void setVideoURI(String str) {
        this.f6412c.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.f6412c.setVolume(f);
        this.f6413d.mo7509a();
    }
}
