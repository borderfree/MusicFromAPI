package android.support.p023v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.bh */
public class C1075bh extends ContextWrapper {

    /* renamed from: a */
    private static final Object f3741a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C1075bh>> f3742b;

    /* renamed from: c */
    private final Resources f3743c;

    /* renamed from: d */
    private final Theme f3744d;

    private C1075bh(Context context) {
        super(context);
        if (C1087bp.m5965a()) {
            this.f3743c = new C1087bp(this, context.getResources());
            this.f3744d = this.f3743c.newTheme();
            this.f3744d.setTo(context.getTheme());
            return;
        }
        this.f3743c = new C1077bj(this, context.getResources());
        this.f3744d = null;
    }

    /* renamed from: a */
    public static Context m5876a(Context context) {
        if (!m5877b(context)) {
            return context;
        }
        synchronized (f3741a) {
            if (f3742b == null) {
                f3742b = new ArrayList<>();
            } else {
                for (int size = f3742b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f3742b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f3742b.remove(size);
                    }
                }
                for (int size2 = f3742b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f3742b.get(size2);
                    C1075bh bhVar = weakReference2 != null ? (C1075bh) weakReference2.get() : null;
                    if (bhVar != null && bhVar.getBaseContext() == context) {
                        return bhVar;
                    }
                }
            }
            C1075bh bhVar2 = new C1075bh(context);
            f3742b.add(new WeakReference(bhVar2));
            return bhVar2;
        }
    }

    /* renamed from: b */
    private static boolean m5877b(Context context) {
        if ((context instanceof C1075bh) || (context.getResources() instanceof C1077bj) || (context.getResources() instanceof C1087bp)) {
            return false;
        }
        return VERSION.SDK_INT < 21 || C1087bp.m5965a();
    }

    public AssetManager getAssets() {
        return this.f3743c.getAssets();
    }

    public Resources getResources() {
        return this.f3743c;
    }

    public Theme getTheme() {
        return this.f3744d == null ? super.getTheme() : this.f3744d;
    }

    public void setTheme(int i) {
        if (this.f3744d == null) {
            super.setTheme(i);
        } else {
            this.f3744d.applyStyle(i, true);
        }
    }
}
