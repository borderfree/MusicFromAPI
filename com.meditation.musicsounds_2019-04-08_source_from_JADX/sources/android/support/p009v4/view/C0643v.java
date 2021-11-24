package android.support.p009v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.v */
public final class C0643v {

    /* renamed from: a */
    static final C0646c f1803a;

    /* renamed from: android.support.v4.view.v$a */
    static class C0644a extends C0646c {
        C0644a() {
        }
    }

    /* renamed from: android.support.v4.view.v$b */
    static class C0645b extends C0644a {
        C0645b() {
        }

        /* renamed from: a */
        public void mo2545a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onStopNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }

        /* renamed from: a */
        public void mo2546a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }

        /* renamed from: a */
        public void mo2547a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onNestedPreScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }

        /* renamed from: a */
        public boolean mo2548a(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onNestedPreFling");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        }

        /* renamed from: a */
        public boolean mo2549a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onNestedFling");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        }

        /* renamed from: a */
        public boolean mo2550a(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onStartNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        }

        /* renamed from: b */
        public void mo2551b(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onNestedScrollAccepted");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }
    }

    /* renamed from: android.support.v4.view.v$c */
    static class C0646c {
        C0646c() {
        }

        /* renamed from: a */
        public void mo2545a(ViewParent viewParent, View view) {
            if (viewParent instanceof C0619l) {
                ((C0619l) viewParent).onStopNestedScroll(view);
            }
        }

        /* renamed from: a */
        public void mo2546a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof C0619l) {
                ((C0619l) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo2547a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof C0619l) {
                ((C0619l) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public boolean mo2548a(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof C0619l) {
                return ((C0619l) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo2549a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof C0619l) {
                return ((C0619l) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo2550a(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0619l) {
                return ((C0619l) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        /* renamed from: b */
        public void mo2551b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0619l) {
                ((C0619l) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    static {
        C0646c cVar = VERSION.SDK_INT >= 21 ? new C0645b() : VERSION.SDK_INT >= 19 ? new C0644a() : new C0646c();
        f1803a = cVar;
    }

    /* renamed from: a */
    public static void m2993a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C0620m) {
            ((C0620m) viewParent).mo497c(view, i);
        } else if (i == 0) {
            f1803a.mo2545a(viewParent, view);
        }
    }

    /* renamed from: a */
    public static void m2994a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof C0620m) {
            ((C0620m) viewParent).mo483a(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            f1803a.mo2546a(viewParent, view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m2995a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C0620m) {
            ((C0620m) viewParent).mo484a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            f1803a.mo2547a(viewParent, view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    public static boolean m2996a(ViewParent viewParent, View view, float f, float f2) {
        return f1803a.mo2548a(viewParent, view, f, f2);
    }

    /* renamed from: a */
    public static boolean m2997a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f1803a.mo2549a(viewParent, view, f, f2, z);
    }

    /* renamed from: a */
    public static boolean m2998a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0620m) {
            return ((C0620m) viewParent).mo489a(view, view2, i, i2);
        }
        if (i2 == 0) {
            return f1803a.mo2550a(viewParent, view, view2, i);
        }
        return false;
    }

    /* renamed from: b */
    public static void m2999b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0620m) {
            ((C0620m) viewParent).mo494b(view, view2, i, i2);
        } else if (i2 == 0) {
            f1803a.mo2551b(viewParent, view, view2, i);
        }
    }
}
