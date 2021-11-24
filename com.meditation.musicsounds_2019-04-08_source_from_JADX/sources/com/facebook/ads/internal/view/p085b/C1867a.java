package com.facebook.ads.internal.view.p085b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p079b.C1817b;
import com.facebook.ads.internal.p077s.p079b.C1818c;
import java.util.List;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b.a */
public class C1867a extends LinearLayout {

    /* renamed from: a */
    private static final int f6144a = Color.rgb(224, 224, 224);

    /* renamed from: b */
    private static final Uri f6145b = Uri.parse("http://www.facebook.com");

    /* renamed from: c */
    private static final OnTouchListener f6146c = new OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    C1808r.m8932a(view, C1867a.f6147d);
                    break;
                case 1:
                    C1808r.m8932a(view, 0);
                    break;
            }
            return false;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int f6147d = Color.argb(34, 0, 0, 0);

    /* renamed from: e */
    private ImageView f6148e;

    /* renamed from: f */
    private C1877e f6149f;

    /* renamed from: g */
    private ImageView f6150g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1871a f6151h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f6152i;

    /* renamed from: com.facebook.ads.internal.view.b.a$a */
    public interface C1871a {
        /* renamed from: a */
        void mo7145a();
    }

    public C1867a(Context context) {
        super(context);
        m9133a(context);
    }

    /* renamed from: a */
    private void m9133a(Context context) {
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (50.0f * f);
        int i2 = (int) (f * 4.0f);
        C1808r.m8932a((View) this, -1);
        setGravity(16);
        this.f6148e = new ImageView(context);
        LayoutParams layoutParams = new LayoutParams(i, i);
        this.f6148e.setScaleType(ScaleType.CENTER);
        this.f6148e.setImageBitmap(C1818c.m8953a(C1817b.BROWSER_CLOSE));
        this.f6148e.setOnTouchListener(f6146c);
        this.f6148e.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C1867a.this.f6151h != null) {
                    C1867a.this.f6151h.mo7145a();
                }
            }
        });
        addView(this.f6148e, layoutParams);
        this.f6149f = new C1877e(context);
        LayoutParams layoutParams2 = new LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.f6149f.setPadding(0, i2, 0, i2);
        addView(this.f6149f, layoutParams2);
        this.f6150g = new ImageView(context);
        LayoutParams layoutParams3 = new LayoutParams(i, i);
        this.f6150g.setScaleType(ScaleType.CENTER);
        this.f6150g.setOnTouchListener(f6146c);
        this.f6150g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!TextUtils.isEmpty(C1867a.this.f6152i) && !"about:blank".equals(C1867a.this.f6152i)) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C1867a.this.f6152i));
                    intent.addFlags(268435456);
                    C1867a.this.getContext().startActivity(intent);
                }
            }
        });
        addView(this.f6150g, layoutParams3);
        setupDefaultNativeBrowser(context);
    }

    private void setupDefaultNativeBrowser(Context context) {
        Bitmap bitmap;
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", f6145b), 65536);
        if (queryIntentActivities.size() == 0) {
            this.f6150g.setVisibility(8);
            bitmap = null;
        } else {
            bitmap = C1818c.m8953a((queryIntentActivities.size() != 1 || !"com.android.chrome".equals(((ResolveInfo) queryIntentActivities.get(0)).activityInfo.packageName)) ? C1817b.BROWSER_LAUNCH_NATIVE : C1817b.BROWSER_LAUNCH_CHROME);
        }
        this.f6150g.setImageBitmap(bitmap);
    }

    public void setListener(C1871a aVar) {
        this.f6151h = aVar;
    }

    public void setTitle(String str) {
        this.f6149f.setTitle(str);
    }

    public void setUrl(String str) {
        this.f6152i = str;
        if (TextUtils.isEmpty(str) || "about:blank".equals(str)) {
            this.f6149f.setSubtitle(null);
            this.f6150g.setEnabled(false);
            this.f6150g.setColorFilter(new PorterDuffColorFilter(f6144a, Mode.SRC_IN));
            return;
        }
        this.f6149f.setSubtitle(str);
        this.f6150g.setEnabled(true);
        this.f6150g.setColorFilter(null);
    }
}
