package com.facebook.ads.internal.view.hscroll;

import android.support.p023v7.widget.RecyclerView.C0942j;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.internal.view.hscroll.b */
public class C2109b {
    /* renamed from: a */
    public int[] mo7649a(View view, int i, int i2) {
        C0942j jVar = (C0942j) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), jVar.width), ViewGroup.getChildMeasureSpec(i2, view.getPaddingTop() + view.getPaddingBottom(), jVar.height));
        return new int[]{view.getMeasuredWidth() + jVar.leftMargin + jVar.rightMargin, view.getMeasuredHeight() + jVar.bottomMargin + jVar.topMargin};
    }
}
