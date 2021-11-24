package com.seattleclouds.previewer.appmart.order;

import android.content.Context;
import android.support.p009v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NewOrderLockedViewPager extends ViewPager {
    public NewOrderLockedViewPager(Context context) {
        super(context);
    }

    public NewOrderLockedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
