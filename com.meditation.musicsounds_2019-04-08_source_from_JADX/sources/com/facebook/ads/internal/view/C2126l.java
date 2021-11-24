package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View.MeasureSpec;
import com.facebook.ads.internal.view.p093g.C1994a;

/* renamed from: com.facebook.ads.internal.view.l */
public class C2126l extends C1994a {
    public C2126l(Context context) {
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
