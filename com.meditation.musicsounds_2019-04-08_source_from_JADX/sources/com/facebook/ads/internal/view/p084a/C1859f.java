package com.facebook.ads.internal.view.p084a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p061c.C1681c;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p079b.C1817b;
import com.facebook.ads.internal.p077s.p079b.C1818c;

/* renamed from: com.facebook.ads.internal.view.a.f */
public class C1859f extends LinearLayout {

    /* renamed from: a */
    private static final int f6116a = ((int) (C1808r.f5899b * 40.0f));

    /* renamed from: b */
    private static final int f6117b = ((int) (C1808r.f5899b * 20.0f));

    /* renamed from: c */
    private static final int f6118c = ((int) (C1808r.f5899b * 10.0f));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1681c f6119d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1856c f6120e;

    C1859f(Context context, C1681c cVar, C1856c cVar2, String str, C1817b bVar) {
        super(context);
        this.f6119d = cVar;
        this.f6120e = cVar2;
        setOrientation(1);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        View a = m9112a(str);
        a.setPadding(0, 0, 0, 0);
        View view = new View(getContext());
        view.setLayoutParams(new LayoutParams(-1, 1));
        C1808r.m8932a(view, -10459280);
        View a2 = m9110a();
        a2.setPadding(0, f6118c, 0, 0);
        addView(a, layoutParams);
        addView(view);
        if (!TextUtils.isEmpty(this.f6119d.mo6825c())) {
            View a3 = m9111a(bVar, this.f6119d.mo6825c());
            a3.setPadding(0, f6118c, 0, f6118c);
            addView(a3, layoutParams);
        }
        addView(a2, layoutParams);
    }

    /* renamed from: a */
    private View m9110a() {
        C1862g gVar = new C1862g(getContext());
        for (final C1681c cVar : this.f6119d.mo6826d()) {
            final C1857d dVar = new C1857d(getContext());
            dVar.setText(cVar.mo6824b());
            C1808r.m8938a((TextView) dVar, false, 14);
            dVar.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    dVar.mo7139a();
                    C1859f.this.f6120e.mo7134b(cVar);
                }
            });
            gVar.addView(dVar);
        }
        return gVar;
    }

    /* renamed from: a */
    private View m9111a(C1817b bVar, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LayoutParams layoutParams = new LayoutParams(f6117b, f6117b);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(C1818c.m8953a(bVar));
        TextView textView = new TextView(getContext());
        C1808r.m8938a(textView, true, 14);
        textView.setTextColor(-10459280);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(f6118c, 0, 0, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    /* renamed from: a */
    private View m9112a(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(C1818c.m8953a(C1817b.BACK_ARROW));
        imageView.setPadding(0, f6118c, f6118c * 2, f6118c);
        LayoutParams layoutParams = new LayoutParams(f6116a, f6116a);
        imageView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1859f.this.f6120e.mo7132a(C1859f.this.f6119d);
            }
        });
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        C1808r.m8938a(textView, true, 16);
        textView.setTextColor(-14934495);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, f6116a, 0);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}
