package com.seattleclouds.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.p009v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class SCViewPager extends ViewPager {

    /* renamed from: d */
    private boolean f23457d = true;

    public SCViewPager(Context context) {
        super(context);
    }

    public SCViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23457d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23457d) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setScrollingEnabled(boolean z) {
        this.f23457d = z;
    }
}
