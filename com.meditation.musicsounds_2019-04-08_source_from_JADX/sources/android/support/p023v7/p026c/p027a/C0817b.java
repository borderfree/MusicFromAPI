package android.support.p023v7.p026c.p027a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.content.C0452b;
import android.support.p023v7.widget.C1111k;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.c.a.b */
public final class C0817b {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2412a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0818a>> f2413b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2414c = new Object();

    /* renamed from: android.support.v7.c.a.b$a */
    private static class C0818a {

        /* renamed from: a */
        final ColorStateList f2415a;

        /* renamed from: b */
        final Configuration f2416b;

        C0818a(ColorStateList colorStateList, Configuration configuration) {
            this.f2415a = colorStateList;
            this.f2416b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m3881a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m3886d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m3885c(context, i);
        if (c == null) {
            return C0452b.m2066b(context, i);
        }
        m3883a(context, i, c);
        return c;
    }

    /* renamed from: a */
    private static TypedValue m3882a() {
        TypedValue typedValue = (TypedValue) f2412a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2412a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m3883a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2414c) {
            SparseArray sparseArray = (SparseArray) f2413b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f2413b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0818a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static Drawable m3884b(Context context, int i) {
        return C1111k.m6081a().mo5490a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m3885c(Context context, int i) {
        if (m3887e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0816a.m3877a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m3886d(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f2414c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<android.support.v7.c.a.b$a>> r1 = f2413b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            android.support.v7.c.a.b$a r2 = (android.support.p023v7.p026c.p027a.C0817b.C0818a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f2416b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f2415a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.p026c.p027a.C0817b.m3886d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: e */
    private static boolean m3887e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m3882a();
        resources.getValue(i, a, true);
        return a.type >= 28 && a.type <= 31;
    }
}
