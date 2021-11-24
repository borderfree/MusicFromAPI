package com.facebook.ads.internal.view.p084a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p079b.C1817b;
import com.facebook.ads.internal.p077s.p079b.C1818c;

/* renamed from: com.facebook.ads.internal.view.a.e */
public class C1858e extends LinearLayout {

    /* renamed from: a */
    public static final LayoutParams f6109a = new LayoutParams(-1, -2);

    /* renamed from: b */
    private static final int f6110b = ((int) (C1808r.f5899b * 8.0f));

    /* renamed from: c */
    private static final int f6111c;

    /* renamed from: d */
    private static final int f6112d = ((int) (C1808r.f5899b * 20.0f));

    /* renamed from: e */
    private final LinearLayout f6113e;

    /* renamed from: f */
    private final ImageView f6114f;

    /* renamed from: g */
    private final TextView f6115g;

    static {
        double d = (double) C1808r.f5899b;
        Double.isNaN(d);
        f6111c = (int) (d * 14.5d);
    }

    public C1858e(Context context) {
        super(context);
        this.f6114f = new ImageView(context);
        this.f6114f.setColorFilter(-10459280);
        LayoutParams layoutParams = new LayoutParams(f6112d, f6112d);
        layoutParams.gravity = 16;
        this.f6114f.setLayoutParams(layoutParams);
        this.f6113e = new LinearLayout(context);
        this.f6113e.setOrientation(1);
        this.f6113e.setPadding(f6110b * 2, 0, 0, 0);
        this.f6113e.setLayoutParams(f6109a);
        this.f6115g = new TextView(context);
        C1808r.m8938a(this.f6115g, true, 16);
        this.f6115g.setTextColor(-14934495);
        this.f6113e.addView(this.f6115g, f6109a);
        setOrientation(0);
        addView(this.f6114f);
        addView(this.f6113e);
    }

    /* renamed from: a */
    public void mo7140a(C1817b bVar, String str, String str2) {
        int i;
        int i2;
        this.f6114f.setImageBitmap(C1818c.m8953a(bVar));
        this.f6115g.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            C1808r.m8938a(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.f6113e.addView(textView, f6109a);
            i = f6110b;
            i2 = f6110b;
        } else {
            i = f6111c;
            i2 = f6111c;
        }
        setPadding(0, i, 0, i2);
    }
}
