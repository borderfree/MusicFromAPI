package com.seattleclouds.widget;

import android.content.Context;
import android.view.View;
import android.widget.TabHost;

/* renamed from: com.seattleclouds.widget.b */
public class C6670b extends View {
    public C6670b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TabHost tabHost = (TabHost) getRootView().findViewById(16908306);
        tabHost.getViewTreeObserver().removeOnTouchModeChangeListener(tabHost);
    }
}
