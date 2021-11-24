package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.internal.view.k */
public class C2125k extends ImageView {
    public C2125k(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i) == 1073741824) {
            i2 = i;
        } else if (MeasureSpec.getMode(i2) == 1073741824) {
            i = i2;
        }
        super.onMeasure(i, i2);
    }
}
