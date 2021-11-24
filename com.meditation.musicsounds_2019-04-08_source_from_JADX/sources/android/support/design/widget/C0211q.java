package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p023v7.p024a.C0726a.C0727a;

/* renamed from: android.support.design.widget.q */
class C0211q {

    /* renamed from: a */
    private static final int[] f658a = {C0727a.colorPrimary};

    /* renamed from: a */
    static void m831a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f658a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
