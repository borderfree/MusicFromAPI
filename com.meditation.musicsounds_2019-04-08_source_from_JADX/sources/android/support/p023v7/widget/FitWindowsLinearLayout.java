package android.support.p023v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p023v7.widget.C1021aj.C1022a;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C1021aj {

    /* renamed from: a */
    private C1022a f2920a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.f2920a != null) {
            this.f2920a.mo3172a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C1022a aVar) {
        this.f2920a = aVar;
    }
}
