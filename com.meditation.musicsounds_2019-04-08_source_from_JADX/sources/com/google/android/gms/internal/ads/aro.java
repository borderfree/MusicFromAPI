package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3327d;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class aro extends RelativeLayout {

    /* renamed from: a */
    private static final float[] f12978a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b */
    private AnimationDrawable f12979b;

    public aro(Context context, arl arl, LayoutParams layoutParams) {
        super(context);
        C3266s.m14913a(arl);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f12978a, null, null));
        shapeDrawable.getPaint().setColor(arl.mo12343d());
        setLayoutParams(layoutParams);
        zzbv.zzem().mo13150a((View) this, (Drawable) shapeDrawable);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(arl.mo12340a())) {
            LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(arl.mo12340a());
            textView.setTextColor(arl.mo12344e());
            textView.setTextSize((float) arl.mo12345f());
            ane.m16645a();
            int a = C3719lt.m19107a(context, 4);
            ane.m16645a();
            textView.setPadding(a, 0, C3719lt.m19107a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<arp> c = arl.mo12342c();
        if (c != null && c.size() > 1) {
            this.f12979b = new AnimationDrawable();
            for (arp a2 : c) {
                try {
                    this.f12979b.addFrame((Drawable) C3327d.m15137a(a2.mo12354a()), arl.mo12346g());
                } catch (Exception e) {
                    C3643iy.m19173b("Error while getting drawable.", e);
                }
            }
            zzbv.zzem().mo13150a((View) imageView, (Drawable) this.f12979b);
        } else if (c.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C3327d.m15137a(((arp) c.get(0)).mo12354a()));
            } catch (Exception e2) {
                C3643iy.m19173b("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        if (this.f12979b != null) {
            this.f12979b.start();
        }
        super.onAttachedToWindow();
    }
}
