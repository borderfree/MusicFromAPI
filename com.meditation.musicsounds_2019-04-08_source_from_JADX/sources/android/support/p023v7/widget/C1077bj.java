package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.bj */
class C1077bj extends C1054aw {

    /* renamed from: a */
    private final WeakReference<Context> f3749a;

    public C1077bj(Context context, Resources resources) {
        super(resources);
        this.f3749a = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f3749a.get();
        if (!(drawable == null || context == null)) {
            C1111k.m6081a();
            C1111k.m6087a(context, i, drawable);
        }
        return drawable;
    }
}
