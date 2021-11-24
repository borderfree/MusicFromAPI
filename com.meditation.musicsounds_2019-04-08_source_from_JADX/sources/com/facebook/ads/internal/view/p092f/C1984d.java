package com.facebook.ads.internal.view.p092f;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.view.component.C1925e;
import com.facebook.ads.internal.view.p086c.C1896d;

/* renamed from: com.facebook.ads.internal.view.f.d */
class C1984d extends C1925e {

    /* renamed from: a */
    private final ImageView f6582a;

    public C1984d(Context context) {
        super(context);
        this.f6582a = new ImageView(context);
        this.f6582a.setAdjustViewBounds(true);
        addView(this.f6582a, new LayoutParams(-2, -1));
    }

    /* renamed from: a */
    public void mo7411a(String str) {
        C1896d dVar = new C1896d(this.f6582a);
        dVar.mo7236a();
        dVar.mo7240a(str);
    }
}
