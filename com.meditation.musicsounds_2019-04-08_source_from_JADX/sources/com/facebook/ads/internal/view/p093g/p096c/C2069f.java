package com.facebook.ads.internal.view.p093g.p096c;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.view.p093g.p094a.C2002c;
import com.facebook.ads.internal.view.p093g.p095b.C2027l;

/* renamed from: com.facebook.ads.internal.view.g.c.f */
public class C2069f extends C2002c {

    /* renamed from: a */
    private final C1720f<C2027l> f6765a;

    public C2069f(Context context) {
        this(context, null);
    }

    public C2069f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2069f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6765a = new C1720f<C2027l>() {
            /* renamed from: a */
            public Class<C2027l> mo6764a() {
                return C2027l.class;
            }

            /* renamed from: a */
            public void mo6765a(C2027l lVar) {
                C2069f.this.setVisibility(8);
            }
        };
        int applyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, Mode.SRC_IN);
        LayoutParams layoutParams = new LayoutParams(applyDimension, applyDimension);
        layoutParams.addRule(13);
        addView(progressBar, layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7465a() {
        super.mo7465a();
        setVisibility(0);
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo6907a(this.f6765a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7466b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo6909b(this.f6765a);
        }
        setVisibility(8);
        super.mo7466b();
    }
}
