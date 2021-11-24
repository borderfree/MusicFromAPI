package com.facebook.ads.internal.p083t;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p077s.p078a.C1786b;
import com.facebook.ads.internal.p077s.p078a.C1805o;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p078a.C1809s;
import com.facebook.ads.internal.p077s.p082e.C1833a;
import com.facebook.ads.internal.p077s.p082e.C1834b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.t.a */
public class C1838a {

    /* renamed from: a */
    private static final String f6033a = "a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final View f6034b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f6035c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f6036d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final WeakReference<C1839a> f6037e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f6038f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f6039g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Runnable f6040h;

    /* renamed from: i */
    private int f6041i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f6042j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6043k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1841b f6044l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Map<String, Integer> f6045m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f6046n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f6047o;

    /* renamed from: com.facebook.ads.internal.t.a$a */
    public static abstract class C1839a {
        /* renamed from: a */
        public abstract void mo7113a();

        /* renamed from: b */
        public void mo7114b() {
        }
    }

    /* renamed from: com.facebook.ads.internal.t.a$b */
    private static final class C1840b extends C1809s<C1838a> {
        C1840b(C1838a aVar) {
            super(aVar);
        }

        public void run() {
            C1838a aVar = (C1838a) mo7072a();
            if (aVar != null) {
                View a = aVar.f6034b;
                C1839a aVar2 = (C1839a) aVar.f6037e.get();
                if (a != null && aVar2 != null) {
                    C1841b a2 = C1838a.m9017a(a, aVar.f6035c);
                    int i = 0;
                    if (a2.mo7116a()) {
                        aVar.f6047o = aVar.f6047o + 1;
                    } else {
                        aVar.f6047o = 0;
                    }
                    boolean z = aVar.f6047o > aVar.f6036d;
                    boolean z2 = aVar.f6044l != null && aVar.f6044l.mo7116a();
                    if (z || !a2.mo7116a()) {
                        aVar.f6044l = a2;
                    }
                    String valueOf = String.valueOf(a2.mo7117b());
                    synchronized (aVar) {
                        if (aVar.f6045m.containsKey(valueOf)) {
                            i = ((Integer) aVar.f6045m.get(valueOf)).intValue();
                        }
                        aVar.f6045m.put(valueOf, Integer.valueOf(i + 1));
                    }
                    if (z && !z2) {
                        aVar.f6046n = System.currentTimeMillis();
                        aVar2.mo7113a();
                        if (!aVar.f6039g) {
                            return;
                        }
                    } else if (!z && z2) {
                        aVar2.mo7114b();
                    }
                    if (!aVar.f6043k && aVar.f6040h != null) {
                        aVar.f6038f.postDelayed(aVar.f6040h, (long) aVar.f6042j);
                    }
                }
            }
        }
    }

    public C1838a(View view, int i, int i2, boolean z, C1839a aVar) {
        this.f6038f = new Handler();
        this.f6041i = 0;
        this.f6042j = 1000;
        this.f6043k = true;
        this.f6044l = new C1841b(C1842c.UNKNOWN);
        this.f6045m = new HashMap();
        this.f6046n = 0;
        this.f6047o = 0;
        this.f6034b = view;
        if (this.f6034b.getId() == -1) {
            C1808r.m8931a(this.f6034b);
        }
        this.f6035c = i;
        this.f6037e = new WeakReference<>(aVar);
        this.f6039g = z;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f6036d = i2;
    }

    public C1838a(View view, int i, C1839a aVar) {
        this(view, i, 0, false, aVar);
    }

    /* renamed from: a */
    static float m9010a(View view) {
        float alpha = view.getAlpha();
        while (view.getParent() instanceof ViewGroup) {
            view = (View) view.getParent();
            float alpha2 = view.getAlpha();
            if (alpha2 < 0.0f) {
                alpha2 = 0.0f;
            }
            if (alpha2 > 1.0f) {
                alpha2 = 1.0f;
            }
            alpha *= alpha2;
        }
        return alpha;
    }

    /* renamed from: a */
    public static int m9011a(int i, View view) {
        int width = view.getWidth() * view.getHeight();
        float f = 100.0f;
        if (width > 0) {
            f = 100.0f / ((float) width);
        }
        return (int) Math.max((double) i, Math.ceil((double) f));
    }

    /* renamed from: a */
    private static int m9013a(Vector<Rect> vector) {
        int size = vector.size();
        int i = size * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        boolean[][] zArr = (boolean[][]) Array.newInstance(boolean.class, new int[]{i, i});
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            Rect rect = (Rect) vector.elementAt(i2);
            int i5 = i3 + 1;
            iArr[i3] = rect.left;
            int i6 = i4 + 1;
            iArr2[i4] = rect.bottom;
            int i7 = i5 + 1;
            iArr[i5] = rect.right;
            int i8 = i6 + 1;
            iArr2[i6] = rect.top;
            i2++;
            i3 = i7;
            i4 = i8;
        }
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        for (int i9 = 0; i9 < size; i9++) {
            Rect rect2 = (Rect) vector.elementAt(i9);
            int a = m9014a(iArr, rect2.left);
            int a2 = m9014a(iArr, rect2.right);
            int a3 = m9014a(iArr2, rect2.top);
            int a4 = m9014a(iArr2, rect2.bottom);
            for (int i10 = a + 1; i10 <= a2; i10++) {
                for (int i11 = a3 + 1; i11 <= a4; i11++) {
                    zArr[i10][i11] = true;
                }
            }
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            int i14 = i13;
            for (int i15 = 0; i15 < i; i15++) {
                i14 += zArr[i12][i15] ? (iArr[i12] - iArr[i12 - 1]) * (iArr2[i15] - iArr2[i15 - 1]) : 0;
            }
            i12++;
            i13 = i14;
        }
        return i13;
    }

    /* renamed from: a */
    private static int m9014a(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = ((length - i2) / 2) + i2;
            if (iArr[i3] == i) {
                return i3;
            }
            if (iArr[i3] > i) {
                length = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static C1841b m9017a(View view, int i) {
        DisplayMetrics displayMetrics;
        View view2 = view;
        boolean z = false;
        if (view2 == null) {
            m9019a(null, false, "mAdView is null.");
            return new C1841b(C1842c.AD_IS_NULL);
        } else if (view.getParent() == null) {
            m9019a(view2, false, "mAdView has no parent.");
            return new C1841b(C1842c.INVALID_PARENT);
        } else if (!view.isShown()) {
            m9019a(view2, false, "mAdView parent is not set to VISIBLE.");
            return new C1841b(C1842c.INVALID_PARENT);
        } else if (view.getWindowVisibility() != 0) {
            m9019a(view2, false, "mAdView window is not set to VISIBLE.");
            return new C1841b(C1842c.INVALID_WINDOW);
        } else if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("mAdView has invisible dimensions (w=");
            sb.append(view.getMeasuredWidth());
            sb.append(", h=");
            sb.append(view.getMeasuredHeight());
            m9019a(view2, false, sb.toString());
            return new C1841b(C1842c.INVALID_DIMENSIONS);
        } else if (m9010a(view) < 0.9f) {
            m9019a(view2, false, "mAdView is too transparent.");
            return new C1841b(C1842c.AD_IS_TRANSPARENT);
        } else {
            int width = view.getWidth();
            int height = view.getHeight();
            int[] iArr = new int[2];
            try {
                view2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                if (!view2.getGlobalVisibleRect(rect)) {
                    return new C1841b(C1842c.AD_IS_NOT_VISIBLE);
                }
                Context context = view.getContext();
                if (VERSION.SDK_INT >= 17) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    displayMetrics = new DisplayMetrics();
                    defaultDisplay.getRealMetrics(displayMetrics);
                } else {
                    displayMetrics = context.getResources().getDisplayMetrics();
                }
                Vector b = m9021b(view);
                int a = m9013a(b);
                b.add(rect);
                float a2 = (((float) (m9013a(b) - a)) * 1.0f) / ((float) (view.getMeasuredHeight() * view.getMeasuredWidth()));
                boolean t = C1713a.m8589t(context);
                int a3 = m9011a(i, view2);
                float f = ((float) a3) / 100.0f;
                if (t) {
                    if (a2 < f) {
                        m9019a(view2, false, String.format(Locale.US, "mAdView visible area is too small [%.2f%% visible, current threshold %.2f%%]", new Object[]{Float.valueOf(a2), Float.valueOf(f)}));
                        return new C1841b(C1842c.AD_INSUFFICIENT_VISIBLE_AREA, a2);
                    }
                } else if (iArr[0] < 0 || displayMetrics.widthPixels - iArr[0] < width) {
                    m9019a(view2, false, "mAdView is not fully on screen horizontally.");
                    return new C1841b(C1842c.AD_OFFSCREEN_HORIZONTALLY, a2);
                } else {
                    double d = (double) height;
                    double d2 = (double) a3;
                    Double.isNaN(d2);
                    double d3 = 100.0d - d2;
                    Double.isNaN(d);
                    int i2 = (int) ((d * d3) / 100.0d);
                    if (rect.top - iArr[1] > i2) {
                        m9019a(view2, false, "mAdView is not visible from the top.");
                        return new C1841b(C1842c.AD_OFFSCREEN_TOP, a2);
                    }
                    z = false;
                    if ((iArr[1] + height) - rect.bottom > i2) {
                        m9019a(view2, false, "mAdView is not visible from the bottom.");
                        return new C1841b(C1842c.AD_OFFSCREEN_BOTTOM, a2);
                    }
                }
                if (!C1833a.m9001a(context)) {
                    m9019a(view2, z, "Screen is not interactive.");
                    return new C1841b(C1842c.SCREEN_NOT_INTERACTIVE, a2);
                }
                Map a4 = C1834b.m9002a(context);
                if (C1786b.m8875b(a4)) {
                    m9019a(view2, z, "Keyguard is obstructing view.");
                    return new C1841b(C1842c.AD_IS_OBSTRUCTED_BY_KEYGUARD, a2);
                } else if (!C1713a.m8572c(context) || !C1786b.m8874a(a4)) {
                    Float a5 = C1713a.m8585p(context) ? C1843d.m9049a(view) : null;
                    if (a5 != null) {
                        if (a5.floatValue() == -1.0f) {
                            m9019a(view2, false, "mAdView is not in the top activity");
                            return new C1841b(C1842c.AD_IS_NOT_IN_ACTIVITY);
                        } else if (a5.floatValue() == 0.0f) {
                            m9019a(view2, false, "mAdView is not visible");
                            return new C1841b(C1842c.AD_IS_NOT_VISIBLE);
                        }
                    }
                    if (!C1713a.m8586q(context) || a5 == null || a5.floatValue() >= f) {
                        m9019a(view2, true, "mAdView is visible.");
                        return new C1841b(C1842c.IS_VIEWABLE, a2, a4);
                    }
                    m9019a(view2, false, String.format(Locale.US, "mAdView visible area is too small [%.2f%% visible, current threshold %.2f%%]", new Object[]{a5, Float.valueOf(f)}));
                    return new C1841b(C1842c.AD_INSUFFICIENT_VISIBLE_AREA, a2, a4);
                } else {
                    m9019a(view2, z, "Ad is on top of the Lockscreen.");
                    return new C1841b(C1842c.AD_IN_LOCKSCREEN, a2, a4);
                }
            } catch (NullPointerException unused) {
                m9019a(view2, false, "Cannot get location on screen.");
                return new C1841b(C1842c.INVALID_DIMENSIONS);
            }
        }
    }

    /* renamed from: a */
    private static void m9019a(View view, boolean z, String str) {
    }

    /* renamed from: b */
    private static Vector<Rect> m9021b(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int indexOfChild = viewGroup.indexOfChild(view);
        while (true) {
            indexOfChild++;
            if (indexOfChild < viewGroup.getChildCount()) {
                vector.addAll(m9023c(viewGroup.getChildAt(indexOfChild)));
            } else {
                vector.addAll(m9021b((View) viewGroup));
                return vector;
            }
        }
    }

    /* renamed from: c */
    private static Vector<Rect> m9023c(View view) {
        Vector<Rect> vector = new Vector<>();
        if (view.isShown() && (VERSION.SDK_INT < 11 || view.getAlpha() > 0.0f)) {
            if (!(view instanceof ViewGroup) || !m9025d(view)) {
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    vector.add(rect);
                }
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    vector.addAll(m9023c(viewGroup.getChildAt(i)));
                }
                return vector;
            }
        }
        return vector;
    }

    /* renamed from: d */
    private static boolean m9025d(View view) {
        return view.getBackground() == null || (VERSION.SDK_INT >= 19 && view.getBackground().getAlpha() <= 0);
    }

    /* renamed from: a */
    public synchronized void mo7106a() {
        if (this.f6040h != null) {
            mo7111c();
        }
        this.f6040h = new C1840b(this);
        this.f6038f.postDelayed(this.f6040h, (long) this.f6041i);
        this.f6043k = false;
        this.f6047o = 0;
        this.f6044l = new C1841b(C1842c.UNKNOWN);
        this.f6045m = new HashMap();
    }

    /* renamed from: a */
    public void mo7107a(int i) {
        this.f6041i = i;
    }

    /* renamed from: a */
    public synchronized void mo7108a(Map<String, String> map) {
        map.put("vrc", String.valueOf(this.f6044l.mo7117b()));
        map.put("vp", String.valueOf(this.f6044l.mo7118c()));
        map.put("vh", new JSONObject(this.f6045m).toString());
        map.put("vt", C1805o.m8921a(this.f6046n));
        map.putAll(this.f6044l.mo7119d());
    }

    /* renamed from: b */
    public void mo7109b(int i) {
        this.f6042j = i;
    }

    /* renamed from: b */
    public synchronized boolean mo7110b() {
        return this.f6043k;
    }

    /* renamed from: c */
    public synchronized void mo7111c() {
        this.f6038f.removeCallbacks(this.f6040h);
        this.f6040h = null;
        this.f6043k = true;
        this.f6047o = 0;
    }

    /* renamed from: d */
    public synchronized String mo7112d() {
        StringBuilder sb;
        C1842c cVar = C1842c.values()[this.f6044l.mo7117b()];
        sb = new StringBuilder();
        sb.append(cVar.toString());
        sb.append(String.format(Locale.US, " (%.1f%%)", new Object[]{Float.valueOf(this.f6044l.mo7118c() * 100.0f)}));
        return sb.toString();
    }
}
