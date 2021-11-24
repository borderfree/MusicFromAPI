package com.facebook.ads.internal.view.p092f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1656k;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.component.C1898a;
import com.facebook.ads.internal.view.component.C1924d;
import com.facebook.ads.internal.view.component.C1926f;
import com.facebook.ads.internal.view.p086c.C1896d;
import com.facebook.ads.internal.view.p093g.p095b.C2040z;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.f.a */
public class C1975a extends LinearLayout {

    /* renamed from: a */
    private static final int f6547a = ((int) (C1808r.f5899b * 12.0f));

    /* renamed from: b */
    private static final int f6548b = ((int) (C1808r.f5899b * 16.0f));

    /* renamed from: c */
    private final C1926f f6549c;

    /* renamed from: d */
    private final ImageView f6550d;

    /* renamed from: e */
    private final RelativeLayout f6551e;

    /* renamed from: f */
    private final C1898a f6552f;

    /* renamed from: g */
    private final int f6553g;

    public C1975a(Context context, int i, C1647d dVar, C1728c cVar, C1845a aVar, boolean z, boolean z2, C1838a aVar2, C1806p pVar) {
        Context context2 = context;
        int i2 = i;
        super(context);
        this.f6553g = i2;
        this.f6550d = new C1924d(context2);
        C1808r.m8932a((View) this.f6550d, 0);
        C1808r.m8931a((View) this.f6550d);
        LayoutParams layoutParams = new LayoutParams(i2, i2);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.setMargins(0, 0, f6547a, 0);
        if (z2) {
            this.f6550d.setVisibility(8);
        }
        C1926f fVar = new C1926f(context, dVar, true, z, true);
        this.f6549c = fVar;
        this.f6549c.setAlignment(8388611);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f6550d.getId());
        layoutParams2.addRule(15);
        C1898a aVar3 = r1;
        C1898a aVar4 = new C1898a(context, true, false, C2040z.REWARDED_VIDEO_AD_CLICK.mo7487a(), dVar, cVar, aVar, aVar2, pVar);
        this.f6552f = aVar3;
        this.f6552f.setVisibility(8);
        this.f6551e = new RelativeLayout(context2);
        C1808r.m8931a((View) this.f6551e);
        this.f6551e.addView(this.f6550d, layoutParams);
        this.f6551e.addView(this.f6549c, layoutParams2);
        addView(this.f6551e, new LinearLayout.LayoutParams(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        C1808r.m8933a((View) this, (Drawable) gradientDrawable);
    }

    /* renamed from: a */
    public void mo7400a() {
        this.f6552f.setVisibility(0);
    }

    /* renamed from: a */
    public void mo7401a(int i) {
        C1808r.m8940b(this.f6552f);
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        setOrientation(i2);
        int i3 = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2 != 0 ? -1 : 0, -2);
        layoutParams.weight = 1.0f;
        if (i2 == 0) {
            i3 = -2;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, -2);
        layoutParams2.setMargins(i2 != 0 ? 0 : f6548b, i2 != 0 ? f6548b : 0, 0, 0);
        layoutParams2.gravity = 80;
        this.f6551e.setLayoutParams(layoutParams);
        addView(this.f6552f, layoutParams2);
    }

    public void setInfo(C1656k kVar) {
        this.f6549c.mo7322a(kVar.mo6751b().mo6699a(), kVar.mo6751b().mo6700b(), false, false);
        this.f6552f.mo7252a(kVar.mo6753c(), kVar.mo6757g(), new HashMap());
        new C1896d(this.f6550d).mo7237a(this.f6553g, this.f6553g).mo7240a(kVar.mo6748a().mo6733b());
    }
}
