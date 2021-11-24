package com.facebook.ads.internal.view.p093g.p096c;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.p086c.C1896d;
import com.facebook.ads.internal.view.p086c.C1897e;
import com.facebook.ads.internal.view.p093g.p094a.C2002c;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2025j;

/* renamed from: com.facebook.ads.internal.view.g.c.e */
public class C2066e extends C2002c {

    /* renamed from: a */
    private final ImageView f6760a;

    /* renamed from: b */
    private final C1720f<C2025j> f6761b = new C1720f<C2025j>() {
        /* renamed from: a */
        public Class<C2025j> mo6764a() {
            return C2025j.class;
        }

        /* renamed from: a */
        public void mo6765a(C2025j jVar) {
            C2066e.this.setVisibility(8);
        }
    };

    /* renamed from: c */
    private final C1720f<C2017b> f6762c = new C1720f<C2017b>() {
        /* renamed from: a */
        public Class<C2017b> mo6764a() {
            return C2017b.class;
        }

        /* renamed from: a */
        public void mo6765a(C2017b bVar) {
            C2066e.this.setVisibility(0);
        }
    };

    public C2066e(Context context) {
        super(context);
        this.f6760a = new ImageView(context);
        this.f6760a.setScaleType(ScaleType.FIT_CENTER);
        C1808r.m8932a((View) this.f6760a, -16777216);
        this.f6760a.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.f6760a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7465a() {
        super.mo7465a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo6906a((T[]) new C1720f[]{this.f6761b, this.f6762c});
        }
    }

    /* renamed from: a */
    public void mo7523a(String str, C1897e eVar) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        C1896d a = new C1896d(this.f6760a).mo7236a();
        if (eVar != null) {
            a.mo7238a(eVar);
        }
        a.mo7240a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7466b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo6908b((T[]) new C1720f[]{this.f6762c, this.f6761b});
        }
        super.mo7466b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f6760a.layout(0, 0, i3 - i, i4 - i2);
    }

    public void setImage(String str) {
        mo7523a(str, null);
    }
}
