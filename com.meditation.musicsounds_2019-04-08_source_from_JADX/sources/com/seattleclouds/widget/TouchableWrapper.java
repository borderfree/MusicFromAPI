package com.seattleclouds.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class TouchableWrapper extends FrameLayout {

    /* renamed from: a */
    private C6668a f23464a;

    /* renamed from: com.seattleclouds.widget.TouchableWrapper$a */
    public interface C6668a {
        /* renamed from: a */
        boolean mo17718a(MotionEvent motionEvent);
    }

    public TouchableWrapper(Context context) {
        super(context);
    }

    public TouchableWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchableWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean a = this.f23464a != null ? this.f23464a.mo17718a(motionEvent) : false;
        return !a ? super.dispatchTouchEvent(motionEvent) : a;
    }

    public C6668a getListener() {
        return this.f23464a;
    }

    public void setListener(C6668a aVar) {
        this.f23464a = aVar;
    }
}
