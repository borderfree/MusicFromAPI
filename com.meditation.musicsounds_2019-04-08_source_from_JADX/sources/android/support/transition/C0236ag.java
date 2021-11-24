package android.support.transition;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.ag */
class C0236ag implements C0239ai {

    /* renamed from: a */
    private static LayoutTransition f698a;

    /* renamed from: b */
    private static Field f699b;

    /* renamed from: c */
    private static boolean f700c;

    /* renamed from: d */
    private static Method f701d;

    /* renamed from: e */
    private static boolean f702e;

    C0236ag() {
    }

    /* renamed from: a */
    private static void m919a(LayoutTransition layoutTransition) {
        String str;
        String str2;
        if (!f702e) {
            try {
                f701d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f701d.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f702e = true;
        }
        if (f701d != null) {
            try {
                f701d.invoke(layoutTransition, new Object[0]);
                return;
            } catch (IllegalAccessException unused2) {
                str = "ViewGroupUtilsApi14";
                str2 = "Failed to access cancel method by reflection";
            } catch (InvocationTargetException unused3) {
                str = "ViewGroupUtilsApi14";
                str2 = "Failed to invoke cancel method by reflection";
            }
        } else {
            return;
        }
        Log.i(str, str2);
    }

    /* renamed from: a */
    public C0234ae mo982a(ViewGroup viewGroup) {
        return C0232ac.m908a(viewGroup);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo983a(android.view.ViewGroup r6, boolean r7) {
        /*
            r5 = this;
            android.animation.LayoutTransition r0 = f698a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002a
            android.support.transition.ag$1 r0 = new android.support.transition.ag$1
            r0.<init>()
            f698a = r0
            android.animation.LayoutTransition r0 = f698a
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f698a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = f698a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = f698a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f698a
            r4 = 4
            r0.setAnimator(r4, r3)
        L_0x002a:
            if (r7 == 0) goto L_0x004a
            android.animation.LayoutTransition r7 = r6.getLayoutTransition()
            if (r7 == 0) goto L_0x0044
            boolean r0 = r7.isRunning()
            if (r0 == 0) goto L_0x003b
            m919a(r7)
        L_0x003b:
            android.animation.LayoutTransition r0 = f698a
            if (r7 == r0) goto L_0x0044
            int r0 = android.support.transition.C0290r.C0291a.transition_layout_save
            r6.setTag(r0, r7)
        L_0x0044:
            android.animation.LayoutTransition r7 = f698a
        L_0x0046:
            r6.setLayoutTransition(r7)
            goto L_0x009c
        L_0x004a:
            r6.setLayoutTransition(r3)
            boolean r7 = f700c
            if (r7 != 0) goto L_0x006a
            java.lang.Class<android.view.ViewGroup> r7 = android.view.ViewGroup.class
            java.lang.String r0 = "mLayoutSuppressed"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0061 }
            f699b = r7     // Catch:{ NoSuchFieldException -> 0x0061 }
            java.lang.reflect.Field r7 = f699b     // Catch:{ NoSuchFieldException -> 0x0061 }
            r7.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0061 }
            goto L_0x0068
        L_0x0061:
            java.lang.String r7 = "ViewGroupUtilsApi14"
            java.lang.String r0 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r7, r0)
        L_0x0068:
            f700c = r1
        L_0x006a:
            java.lang.reflect.Field r7 = f699b
            if (r7 == 0) goto L_0x0087
            java.lang.reflect.Field r7 = f699b     // Catch:{ IllegalAccessException -> 0x0080 }
            boolean r7 = r7.getBoolean(r6)     // Catch:{ IllegalAccessException -> 0x0080 }
            if (r7 == 0) goto L_0x007e
            java.lang.reflect.Field r0 = f699b     // Catch:{ IllegalAccessException -> 0x007c }
            r0.setBoolean(r6, r2)     // Catch:{ IllegalAccessException -> 0x007c }
            goto L_0x007e
        L_0x007c:
            r2 = r7
            goto L_0x0080
        L_0x007e:
            r2 = r7
            goto L_0x0087
        L_0x0080:
            java.lang.String r7 = "ViewGroupUtilsApi14"
            java.lang.String r0 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r7, r0)
        L_0x0087:
            if (r2 == 0) goto L_0x008c
            r6.requestLayout()
        L_0x008c:
            int r7 = android.support.transition.C0290r.C0291a.transition_layout_save
            java.lang.Object r7 = r6.getTag(r7)
            android.animation.LayoutTransition r7 = (android.animation.LayoutTransition) r7
            if (r7 == 0) goto L_0x009c
            int r0 = android.support.transition.C0290r.C0291a.transition_layout_save
            r6.setTag(r0, r3)
            goto L_0x0046
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0236ag.mo983a(android.view.ViewGroup, boolean):void");
    }
}
