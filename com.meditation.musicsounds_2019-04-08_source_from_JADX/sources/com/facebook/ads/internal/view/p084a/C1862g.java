package com.facebook.ads.internal.view.p084a;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.facebook.ads.internal.p077s.p078a.C1808r;

/* renamed from: com.facebook.ads.internal.view.a.g */
public class C1862g extends ViewGroup {

    /* renamed from: a */
    private static final int f6125a = ((int) (C1808r.f5899b * 8.0f));

    /* renamed from: b */
    private int f6126b;

    public C1862g(Context context) {
        super(context);
        setMotionEventSplittingEnabled(false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (paddingLeft + measuredWidth > i5) {
                paddingLeft = getPaddingLeft();
                paddingTop += this.f6126b;
            }
            childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, measuredHeight + paddingTop);
            paddingLeft += measuredWidth + f6125a;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        int i3 = paddingTop;
        int i4 = paddingLeft;
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            childAt.measure(MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = childAt.getMeasuredWidth();
            i5 = Math.max(i5, childAt.getMeasuredHeight() + f6125a);
            if (i4 + measuredWidth > size) {
                i4 = getPaddingLeft();
                i3 += i5;
            }
            i4 += measuredWidth + f6125a;
        }
        this.f6126b = i5;
        int i7 = i5 + i3;
        if (i7 < size2) {
            size2 = i7;
        }
        setMeasuredDimension(size, size2 + f6125a);
    }
}
