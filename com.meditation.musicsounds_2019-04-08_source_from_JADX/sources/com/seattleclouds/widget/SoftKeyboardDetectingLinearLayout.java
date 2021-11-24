package com.seattleclouds.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class SoftKeyboardDetectingLinearLayout extends LinearLayout {

    /* renamed from: a */
    private C6667a f23463a;

    /* renamed from: com.seattleclouds.widget.SoftKeyboardDetectingLinearLayout$a */
    public interface C6667a {
        /* renamed from: a */
        void mo17571a(boolean z);
    }

    public SoftKeyboardDetectingLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
            return;
        }
        int size = MeasureSpec.getSize(i2);
        Activity activity = (Activity) getContext();
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i3 = rect.top;
        int height = activity.getWindowManager().getDefaultDisplay().getHeight();
        int i4 = (height - i3) - size;
        if (this.f23463a != null) {
            this.f23463a.mo17571a(i4 > height / 3);
        }
        super.onMeasure(i, i2);
    }

    public void setSoftKeyboardVisibilityListener(C6667a aVar) {
        this.f23463a = aVar;
    }
}
