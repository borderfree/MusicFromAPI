package android.support.p009v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

/* renamed from: android.support.v4.view.q */
public final class C0624q {

    /* renamed from: a */
    private Object f1787a;

    private C0624q(Object obj) {
        this.f1787a = obj;
    }

    /* renamed from: a */
    public static C0624q m2832a(Context context, int i) {
        return VERSION.SDK_INT >= 24 ? new C0624q(PointerIcon.getSystemIcon(context, i)) : new C0624q(null);
    }

    /* renamed from: a */
    public Object mo2488a() {
        return this.f1787a;
    }
}
