package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.p077s.p078a.C1808r;

/* renamed from: com.facebook.ads.internal.view.component.f */
public class C1926f extends LinearLayout {

    /* renamed from: a */
    private static final float f6351a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static final int f6352b = ((int) (f6351a * 6.0f));

    /* renamed from: c */
    private static final int f6353c = ((int) (f6351a * 8.0f));

    /* renamed from: d */
    private final TextView f6354d;

    /* renamed from: e */
    private final TextView f6355e;

    public C1926f(Context context, C1647d dVar, boolean z, int i, int i2, int i3) {
        super(context);
        setOrientation(1);
        this.f6354d = new TextView(context);
        C1808r.m8938a(this.f6354d, true, i);
        this.f6354d.setTextColor(dVar.mo6708c(z));
        this.f6354d.setEllipsize(TruncateAt.END);
        this.f6354d.setLineSpacing((float) f6352b, 1.0f);
        this.f6355e = new TextView(context);
        C1808r.m8938a(this.f6355e, false, i2);
        this.f6355e.setTextColor(dVar.mo6707b(z));
        this.f6355e.setEllipsize(TruncateAt.END);
        this.f6355e.setLineSpacing((float) f6352b, 1.0f);
        addView(this.f6354d, new LayoutParams(-1, -2));
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.setMargins(0, i3, 0, 0);
        addView(this.f6355e, layoutParams);
    }

    public C1926f(Context context, C1647d dVar, boolean z, boolean z2, boolean z3) {
        this(context, dVar, z, z2 ? 18 : 22, z2 ? 14 : 16, z3 ? f6353c / 2 : f6353c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r8 != false) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7322a(java.lang.String r5, java.lang.String r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            r2 = r2 ^ r1
            android.widget.TextView r3 = r4.f6354d
            if (r0 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r5 = r6
        L_0x0011:
            r3.setText(r5)
            android.widget.TextView r5 = r4.f6355e
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            java.lang.String r6 = ""
        L_0x001b:
            r5.setText(r6)
            r5 = 3
            r6 = 2
            if (r0 == 0) goto L_0x0038
            if (r2 != 0) goto L_0x0025
            goto L_0x0038
        L_0x0025:
            android.widget.TextView r0 = r4.f6354d
            if (r7 == 0) goto L_0x002b
            r2 = 1
            goto L_0x002c
        L_0x002b:
            r2 = 2
        L_0x002c:
            r0.setMaxLines(r2)
            android.widget.TextView r0 = r4.f6355e
            if (r7 == 0) goto L_0x0035
            r5 = 1
            goto L_0x0041
        L_0x0035:
            if (r8 == 0) goto L_0x003c
            goto L_0x0041
        L_0x0038:
            android.widget.TextView r0 = r4.f6354d
            if (r7 == 0) goto L_0x003e
        L_0x003c:
            r5 = 2
            goto L_0x0041
        L_0x003e:
            if (r8 == 0) goto L_0x0041
            r5 = 4
        L_0x0041:
            r0.setMaxLines(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.component.C1926f.mo7322a(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public TextView getDescriptionTextView() {
        return this.f6355e;
    }

    public TextView getTitleTextView() {
        return this.f6354d;
    }

    public void setAlignment(int i) {
        this.f6354d.setGravity(i);
        this.f6355e.setGravity(i);
    }
}
