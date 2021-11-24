package com.seattleclouds.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

/* renamed from: com.seattleclouds.widget.a */
public class C6669a extends ImageView {
    public C6669a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int size = MeasureSpec.getSize(i);
            setMeasuredDimension(size, (int) ((((float) size) * (((float) drawable.getIntrinsicHeight()) / ((float) drawable.getIntrinsicWidth()))) + 0.5f));
            return;
        }
        super.onMeasure(i, i2);
    }
}
