package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p023v7.app.C0769g;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.bp */
public class C1087bp extends Resources {

    /* renamed from: a */
    private final WeakReference<Context> f3795a;

    public C1087bp(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f3795a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m5965a() {
        return C0769g.m3585l() && VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo5385a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f3795a.get();
        return context != null ? C1111k.m6081a().mo5492a(context, this, i) : super.getDrawable(i);
    }
}
