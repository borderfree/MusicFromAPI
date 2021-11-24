package com.facebook.ads.internal.view.p089d;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p059a.C1652i;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.component.C1924d;
import com.facebook.ads.internal.view.p086c.C1896d;

/* renamed from: com.facebook.ads.internal.view.d.c */
public class C1948c extends LinearLayout {

    /* renamed from: a */
    private C1924d f6458a;

    /* renamed from: b */
    private TextView f6459b;

    /* renamed from: c */
    private TextView f6460c;

    public C1948c(Context context) {
        super(context);
        mo7359a(context);
    }

    /* renamed from: a */
    public void mo7358a(int i, int i2) {
        this.f6459b.setTextColor(i);
        this.f6460c.setTextColor(i2);
    }

    /* renamed from: a */
    public void mo7359a(Context context) {
        int i = (int) (C1808r.f5899b * 32.0f);
        setGravity(16);
        this.f6458a = new C1924d(context);
        this.f6458a.setFullCircleCorners(true);
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.setMargins(0, 0, (int) (C1808r.f5899b * 8.0f), 0);
        addView(this.f6458a, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f6459b = new TextView(context);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        C1808r.m8938a(this.f6459b, true, 16);
        this.f6459b.setEllipsize(TruncateAt.END);
        this.f6459b.setSingleLine(true);
        this.f6460c = new TextView(context);
        C1808r.m8938a(this.f6460c, false, 14);
        linearLayout.addView(this.f6459b);
        linearLayout.addView(this.f6460c);
        addView(linearLayout, layoutParams2);
    }

    public void setPageDetails(C1652i iVar) {
        C1896d dVar = new C1896d(this.f6458a);
        dVar.mo7237a((int) (C1808r.f5899b * 32.0f), (int) (C1808r.f5899b * 32.0f));
        dVar.mo7240a(iVar.mo6733b());
        this.f6459b.setText(iVar.mo6732a());
        this.f6460c.setText(iVar.mo6735d());
    }
}
