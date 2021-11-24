package com.seattleclouds.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;

public class MultiSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: m */
    static final /* synthetic */ boolean f23423m = (!MultiSwipeRefreshLayout.class.desiredAssertionStatus());

    /* renamed from: n */
    private View[] f23424n;

    public MultiSwipeRefreshLayout(Context context) {
        super(context);
    }

    public MultiSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private static boolean m32162a(View view) {
        if (VERSION.SDK_INT >= 14) {
            return C0626s.m2852a(view, -1);
        }
        boolean z = true;
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                z = false;
            }
            return z;
        }
        if (view.getScrollY() <= 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo2728c() {
        View[] viewArr;
        if (this.f23424n != null && this.f23424n.length > 0) {
            for (View view : this.f23424n) {
                if (view != null && view.isShown() && !m32162a(view)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setSwipeableChildren(int... iArr) {
        if (f23423m || iArr != null) {
            this.f23424n = new View[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f23424n[i] = findViewById(iArr[i]);
            }
            return;
        }
        throw new AssertionError();
    }
}
