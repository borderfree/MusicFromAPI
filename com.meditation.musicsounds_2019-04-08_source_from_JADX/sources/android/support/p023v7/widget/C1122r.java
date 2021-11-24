package android.support.p023v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: android.support.v7.widget.r */
public class C1122r extends RatingBar {

    /* renamed from: a */
    private final C1121q f3893a;

    public C1122r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.ratingBarStyle);
    }

    public C1122r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3893a = new C1121q(this);
        this.f3893a.mo5520a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f3893a.mo5519a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
