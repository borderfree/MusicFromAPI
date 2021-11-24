package com.seattleclouds.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Gallery;

public class SettableRateFlingGallery extends Gallery {

    /* renamed from: a */
    private int f23462a = 2;

    public SettableRateFlingGallery(Context context) {
        super(context);
    }

    public SettableRateFlingGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettableRateFlingGallery(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getFlingRate() {
        return this.f23462a;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return super.onFling(motionEvent, motionEvent2, f / ((float) this.f23462a), f2);
    }

    public void setFlingRate(int i) {
        this.f23462a = i;
    }
}
