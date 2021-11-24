package com.facebook.ads.internal.view.p085b;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p077s.p079b.C1817b;
import com.facebook.ads.internal.p077s.p079b.C1818c;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b.e */
public class C1877e extends LinearLayout {

    /* renamed from: a */
    private TextView f6177a;

    /* renamed from: b */
    private TextView f6178b;

    /* renamed from: c */
    private Drawable f6179c;

    public C1877e(Context context) {
        super(context);
        m9151a();
    }

    /* renamed from: a */
    private void m9151a() {
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        this.f6177a = new TextView(getContext());
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        this.f6177a.setTextColor(-16777216);
        this.f6177a.setTextSize(2, 20.0f);
        this.f6177a.setEllipsize(TruncateAt.END);
        this.f6177a.setSingleLine(true);
        this.f6177a.setVisibility(8);
        addView(this.f6177a, layoutParams);
        this.f6178b = new TextView(getContext());
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        this.f6178b.setAlpha(0.5f);
        this.f6178b.setTextColor(-16777216);
        this.f6178b.setTextSize(2, 15.0f);
        this.f6178b.setCompoundDrawablePadding((int) (f * 5.0f));
        this.f6178b.setEllipsize(TruncateAt.END);
        this.f6178b.setSingleLine(true);
        this.f6178b.setVisibility(8);
        addView(this.f6178b, layoutParams2);
    }

    private Drawable getPadlockDrawable() {
        if (this.f6179c == null) {
            this.f6179c = C1818c.m8956a(getContext(), C1817b.BROWSER_PADLOCK);
        }
        return this.f6179c;
    }

    public void setSubtitle(String str) {
        TextView textView;
        int i;
        if (TextUtils.isEmpty(str)) {
            this.f6178b.setText(null);
            textView = this.f6178b;
            i = 8;
        } else {
            Uri parse = Uri.parse(str);
            this.f6178b.setText(parse.getHost());
            this.f6178b.setCompoundDrawablesRelativeWithIntrinsicBounds("https".equals(parse.getScheme()) ? getPadlockDrawable() : null, null, null, null);
            textView = this.f6178b;
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setTitle(String str) {
        TextView textView;
        int i;
        if (TextUtils.isEmpty(str)) {
            this.f6177a.setText(null);
            textView = this.f6177a;
            i = 8;
        } else {
            this.f6177a.setText(str);
            textView = this.f6177a;
            i = 0;
        }
        textView.setVisibility(i);
    }
}
