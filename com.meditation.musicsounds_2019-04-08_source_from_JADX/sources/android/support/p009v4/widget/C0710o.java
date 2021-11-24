package android.support.p009v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

@Deprecated
/* renamed from: android.support.v4.widget.o */
public class C0710o extends View {
    @Deprecated
    public C0710o(Context context) {
        this(context, null);
    }

    @Deprecated
    public C0710o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public C0710o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    /* renamed from: a */
    private static int m3326a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? i : size : Math.min(i, size);
    }

    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m3326a(getSuggestedMinimumWidth(), i), m3326a(getSuggestedMinimumHeight(), i2));
    }
}
