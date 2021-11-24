package android.support.p009v4.view.p021a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.google.android.gms.ads.AdRequest;

/* renamed from: android.support.v4.view.a.b */
public class C0583b {

    /* renamed from: a */
    public int f1699a = -1;

    /* renamed from: b */
    private final AccessibilityNodeInfo f1700b;

    /* renamed from: android.support.v4.view.a.b$a */
    public static class C0584a {

        /* renamed from: A */
        public static final C0584a f1701A = new C0584a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null);

        /* renamed from: B */
        public static final C0584a f1702B = new C0584a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null);

        /* renamed from: C */
        public static final C0584a f1703C = new C0584a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null);

        /* renamed from: D */
        public static final C0584a f1704D;

        /* renamed from: a */
        public static final C0584a f1705a = new C0584a(1, null);

        /* renamed from: b */
        public static final C0584a f1706b = new C0584a(2, null);

        /* renamed from: c */
        public static final C0584a f1707c = new C0584a(4, null);

        /* renamed from: d */
        public static final C0584a f1708d = new C0584a(8, null);

        /* renamed from: e */
        public static final C0584a f1709e = new C0584a(16, null);

        /* renamed from: f */
        public static final C0584a f1710f = new C0584a(32, null);

        /* renamed from: g */
        public static final C0584a f1711g = new C0584a(64, null);

        /* renamed from: h */
        public static final C0584a f1712h = new C0584a(128, null);

        /* renamed from: i */
        public static final C0584a f1713i = new C0584a(256, null);

        /* renamed from: j */
        public static final C0584a f1714j = new C0584a(AdRequest.MAX_CONTENT_URL_LENGTH, null);

        /* renamed from: k */
        public static final C0584a f1715k = new C0584a(1024, null);

        /* renamed from: l */
        public static final C0584a f1716l = new C0584a(2048, null);

        /* renamed from: m */
        public static final C0584a f1717m = new C0584a(4096, null);

        /* renamed from: n */
        public static final C0584a f1718n = new C0584a(8192, null);

        /* renamed from: o */
        public static final C0584a f1719o = new C0584a(16384, null);

        /* renamed from: p */
        public static final C0584a f1720p = new C0584a(32768, null);

        /* renamed from: q */
        public static final C0584a f1721q = new C0584a(65536, null);

        /* renamed from: r */
        public static final C0584a f1722r = new C0584a(131072, null);

        /* renamed from: s */
        public static final C0584a f1723s = new C0584a(262144, null);

        /* renamed from: t */
        public static final C0584a f1724t = new C0584a(524288, null);

        /* renamed from: u */
        public static final C0584a f1725u = new C0584a(1048576, null);

        /* renamed from: v */
        public static final C0584a f1726v = new C0584a(2097152, null);

        /* renamed from: w */
        public static final C0584a f1727w = new C0584a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);

        /* renamed from: x */
        public static final C0584a f1728x = new C0584a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);

        /* renamed from: y */
        public static final C0584a f1729y = new C0584a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null);

        /* renamed from: z */
        public static final C0584a f1730z = new C0584a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null);

        /* renamed from: E */
        final Object f1731E;

        static {
            AccessibilityAction accessibilityAction = null;
            if (VERSION.SDK_INT >= 24) {
                accessibilityAction = AccessibilityAction.ACTION_SET_PROGRESS;
            }
            f1704D = new C0584a(accessibilityAction);
        }

        public C0584a(int i, CharSequence charSequence) {
            this(VERSION.SDK_INT >= 21 ? new AccessibilityAction(i, charSequence) : null);
        }

        C0584a(Object obj) {
            this.f1731E = obj;
        }
    }

    /* renamed from: android.support.v4.view.a.b$b */
    public static class C0585b {

        /* renamed from: a */
        final Object f1732a;

        C0585b(Object obj) {
            this.f1732a = obj;
        }

        /* renamed from: a */
        public static C0585b m2696a(int i, int i2, boolean z, int i3) {
            return VERSION.SDK_INT >= 21 ? new C0585b(CollectionInfo.obtain(i, i2, z, i3)) : VERSION.SDK_INT >= 19 ? new C0585b(CollectionInfo.obtain(i, i2, z)) : new C0585b(null);
        }
    }

    /* renamed from: android.support.v4.view.a.b$c */
    public static class C0586c {

        /* renamed from: a */
        final Object f1733a;

        C0586c(Object obj) {
            this.f1733a = obj;
        }

        /* renamed from: a */
        public static C0586c m2697a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return VERSION.SDK_INT >= 21 ? new C0586c(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : VERSION.SDK_INT >= 19 ? new C0586c(CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0586c(null);
        }
    }

    private C0583b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1700b = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0583b m2644a(C0583b bVar) {
        return m2645a(AccessibilityNodeInfo.obtain(bVar.f1700b));
    }

    /* renamed from: a */
    public static C0583b m2645a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0583b(accessibilityNodeInfo);
    }

    /* renamed from: b */
    private static String m2646b(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case AdRequest.MAX_CONTENT_URL_LENGTH /*512*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: a */
    public AccessibilityNodeInfo mo2350a() {
        return this.f1700b;
    }

    /* renamed from: a */
    public void mo2351a(int i) {
        this.f1700b.addAction(i);
    }

    /* renamed from: a */
    public void mo2352a(Rect rect) {
        this.f1700b.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void mo2353a(View view) {
        this.f1700b.setSource(view);
    }

    /* renamed from: a */
    public void mo2354a(CharSequence charSequence) {
        this.f1700b.setPackageName(charSequence);
    }

    /* renamed from: a */
    public void mo2355a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f1700b.setCollectionInfo((CollectionInfo) ((C0585b) obj).f1732a);
        }
    }

    /* renamed from: a */
    public void mo2356a(boolean z) {
        this.f1700b.setCheckable(z);
    }

    /* renamed from: a */
    public boolean mo2357a(C0584a aVar) {
        if (VERSION.SDK_INT >= 21) {
            return this.f1700b.removeAction((AccessibilityAction) aVar.f1731E);
        }
        return false;
    }

    /* renamed from: b */
    public int mo2358b() {
        return this.f1700b.getActions();
    }

    /* renamed from: b */
    public void mo2359b(Rect rect) {
        this.f1700b.setBoundsInParent(rect);
    }

    /* renamed from: b */
    public void mo2360b(View view) {
        this.f1700b.addChild(view);
    }

    /* renamed from: b */
    public void mo2361b(CharSequence charSequence) {
        this.f1700b.setClassName(charSequence);
    }

    /* renamed from: b */
    public void mo2362b(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f1700b.setCollectionItemInfo((CollectionItemInfo) ((C0586c) obj).f1733a);
        }
    }

    /* renamed from: b */
    public void mo2363b(boolean z) {
        this.f1700b.setChecked(z);
    }

    /* renamed from: c */
    public void mo2364c(Rect rect) {
        this.f1700b.getBoundsInScreen(rect);
    }

    /* renamed from: c */
    public void mo2365c(View view) {
        this.f1700b.setParent(view);
    }

    /* renamed from: c */
    public void mo2366c(CharSequence charSequence) {
        this.f1700b.setText(charSequence);
    }

    /* renamed from: c */
    public void mo2367c(boolean z) {
        this.f1700b.setFocusable(z);
    }

    /* renamed from: c */
    public boolean mo2368c() {
        return this.f1700b.isCheckable();
    }

    /* renamed from: d */
    public void mo2369d(Rect rect) {
        this.f1700b.setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void mo2370d(View view) {
        if (VERSION.SDK_INT >= 17) {
            this.f1700b.setLabelFor(view);
        }
    }

    /* renamed from: d */
    public void mo2371d(CharSequence charSequence) {
        this.f1700b.setContentDescription(charSequence);
    }

    /* renamed from: d */
    public void mo2372d(boolean z) {
        this.f1700b.setFocused(z);
    }

    /* renamed from: d */
    public boolean mo2373d() {
        return this.f1700b.isChecked();
    }

    /* renamed from: e */
    public void mo2374e(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 21) {
            this.f1700b.setError(charSequence);
        }
    }

    /* renamed from: e */
    public void mo2375e(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f1700b.setVisibleToUser(z);
        }
    }

    /* renamed from: e */
    public boolean mo2376e() {
        return this.f1700b.isFocusable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0583b bVar = (C0583b) obj;
        if (this.f1700b == null) {
            if (bVar.f1700b != null) {
                return false;
            }
        } else if (!this.f1700b.equals(bVar.f1700b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo2378f(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f1700b.setAccessibilityFocused(z);
        }
    }

    /* renamed from: f */
    public boolean mo2379f() {
        return this.f1700b.isFocused();
    }

    /* renamed from: g */
    public void mo2380g(boolean z) {
        this.f1700b.setSelected(z);
    }

    /* renamed from: g */
    public boolean mo2381g() {
        if (VERSION.SDK_INT >= 16) {
            return this.f1700b.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: h */
    public void mo2382h(boolean z) {
        this.f1700b.setClickable(z);
    }

    /* renamed from: h */
    public boolean mo2383h() {
        if (VERSION.SDK_INT >= 16) {
            return this.f1700b.isAccessibilityFocused();
        }
        return false;
    }

    public int hashCode() {
        if (this.f1700b == null) {
            return 0;
        }
        return this.f1700b.hashCode();
    }

    /* renamed from: i */
    public void mo2385i(boolean z) {
        this.f1700b.setLongClickable(z);
    }

    /* renamed from: i */
    public boolean mo2386i() {
        return this.f1700b.isSelected();
    }

    /* renamed from: j */
    public void mo2387j(boolean z) {
        this.f1700b.setEnabled(z);
    }

    /* renamed from: j */
    public boolean mo2388j() {
        return this.f1700b.isClickable();
    }

    /* renamed from: k */
    public void mo2389k(boolean z) {
        this.f1700b.setScrollable(z);
    }

    /* renamed from: k */
    public boolean mo2390k() {
        return this.f1700b.isLongClickable();
    }

    /* renamed from: l */
    public void mo2391l(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f1700b.setContentInvalid(z);
        }
    }

    /* renamed from: l */
    public boolean mo2392l() {
        return this.f1700b.isEnabled();
    }

    /* renamed from: m */
    public boolean mo2393m() {
        return this.f1700b.isPassword();
    }

    /* renamed from: n */
    public boolean mo2394n() {
        return this.f1700b.isScrollable();
    }

    /* renamed from: o */
    public CharSequence mo2395o() {
        return this.f1700b.getPackageName();
    }

    /* renamed from: p */
    public CharSequence mo2396p() {
        return this.f1700b.getClassName();
    }

    /* renamed from: q */
    public CharSequence mo2397q() {
        return this.f1700b.getText();
    }

    /* renamed from: r */
    public CharSequence mo2398r() {
        return this.f1700b.getContentDescription();
    }

    /* renamed from: s */
    public void mo2399s() {
        this.f1700b.recycle();
    }

    /* renamed from: t */
    public String mo2400t() {
        if (VERSION.SDK_INT >= 18) {
            return this.f1700b.getViewIdResourceName();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo2352a(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        mo2364c(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(mo2395o());
        sb.append("; className: ");
        sb.append(mo2396p());
        sb.append("; text: ");
        sb.append(mo2397q());
        sb.append("; contentDescription: ");
        sb.append(mo2398r());
        sb.append("; viewId: ");
        sb.append(mo2400t());
        sb.append("; checkable: ");
        sb.append(mo2368c());
        sb.append("; checked: ");
        sb.append(mo2373d());
        sb.append("; focusable: ");
        sb.append(mo2376e());
        sb.append("; focused: ");
        sb.append(mo2379f());
        sb.append("; selected: ");
        sb.append(mo2386i());
        sb.append("; clickable: ");
        sb.append(mo2388j());
        sb.append("; longClickable: ");
        sb.append(mo2390k());
        sb.append("; enabled: ");
        sb.append(mo2392l());
        sb.append("; password: ");
        sb.append(mo2393m());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(mo2394n());
        sb.append(sb4.toString());
        sb.append("; [");
        int b = mo2358b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            sb.append(m2646b(numberOfTrailingZeros));
            if (b != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
