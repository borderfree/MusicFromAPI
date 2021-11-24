package com.facebook.ads.internal.view.p093g.p094a;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.view.p093g.C1994a;

/* renamed from: com.facebook.ads.internal.view.g.a.c */
public abstract class C2002c extends RelativeLayout implements C2001b {

    /* renamed from: a */
    private C1994a f6648a;

    public C2002c(Context context) {
        super(context);
    }

    public C2002c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new LayoutParams(-1, -1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7465a() {
    }

    /* renamed from: a */
    public void mo7380a(C1994a aVar) {
        this.f6648a = aVar;
        mo7465a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7466b() {
    }

    /* renamed from: b */
    public void mo7384b(C1994a aVar) {
        mo7466b();
        this.f6648a = null;
    }

    /* access modifiers changed from: protected */
    public C1994a getVideoView() {
        return this.f6648a;
    }
}
