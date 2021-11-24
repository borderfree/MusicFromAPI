package android.support.p023v7.widget;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: android.support.v7.widget.bm */
public class C1082bm {
    /* renamed from: a */
    public static void m5951a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C1083bn.m5955a(view, charSequence);
        }
    }
}
