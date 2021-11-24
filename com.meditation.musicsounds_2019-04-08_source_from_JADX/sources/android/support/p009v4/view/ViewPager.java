package android.support.p009v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.view.p021a.C0583b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: android.support.v4.view.ViewPager */
public class ViewPager extends ViewGroup {

    /* renamed from: a */
    static final int[] f1612a = {16842931};

    /* renamed from: aj */
    private static final C0576i f1613aj = new C0576i();

    /* renamed from: e */
    private static final Comparator<C0569b> f1614e = new Comparator<C0569b>() {
        /* renamed from: a */
        public int compare(C0569b bVar, C0569b bVar2) {
            return bVar.f1680b - bVar2.f1680b;
        }
    };

    /* renamed from: f */
    private static final Interpolator f1615f = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: A */
    private int f1616A = 1;

    /* renamed from: B */
    private boolean f1617B;

    /* renamed from: C */
    private boolean f1618C;

    /* renamed from: D */
    private int f1619D;

    /* renamed from: E */
    private int f1620E;

    /* renamed from: F */
    private int f1621F;

    /* renamed from: G */
    private float f1622G;

    /* renamed from: H */
    private float f1623H;

    /* renamed from: I */
    private float f1624I;

    /* renamed from: J */
    private float f1625J;

    /* renamed from: K */
    private int f1626K = -1;

    /* renamed from: L */
    private VelocityTracker f1627L;

    /* renamed from: M */
    private int f1628M;

    /* renamed from: N */
    private int f1629N;

    /* renamed from: O */
    private int f1630O;

    /* renamed from: P */
    private int f1631P;

    /* renamed from: Q */
    private boolean f1632Q;

    /* renamed from: R */
    private long f1633R;

    /* renamed from: S */
    private EdgeEffect f1634S;

    /* renamed from: T */
    private EdgeEffect f1635T;

    /* renamed from: U */
    private boolean f1636U = true;

    /* renamed from: V */
    private boolean f1637V = false;

    /* renamed from: W */
    private boolean f1638W;

    /* renamed from: aa */
    private int f1639aa;

    /* renamed from: ab */
    private List<C0573f> f1640ab;

    /* renamed from: ac */
    private C0573f f1641ac;

    /* renamed from: ad */
    private C0573f f1642ad;

    /* renamed from: ae */
    private List<C0572e> f1643ae;

    /* renamed from: af */
    private C0574g f1644af;

    /* renamed from: ag */
    private int f1645ag;

    /* renamed from: ah */
    private int f1646ah;

    /* renamed from: ai */
    private ArrayList<View> f1647ai;

    /* renamed from: ak */
    private final Runnable f1648ak = new Runnable() {
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo2265c();
        }
    };

    /* renamed from: al */
    private int f1649al = 0;

    /* renamed from: b */
    C0623p f1650b;

    /* renamed from: c */
    int f1651c;

    /* renamed from: d */
    private int f1652d;

    /* renamed from: g */
    private final ArrayList<C0569b> f1653g = new ArrayList<>();

    /* renamed from: h */
    private final C0569b f1654h = new C0569b();

    /* renamed from: i */
    private final Rect f1655i = new Rect();

    /* renamed from: j */
    private int f1656j = -1;

    /* renamed from: k */
    private Parcelable f1657k = null;

    /* renamed from: l */
    private ClassLoader f1658l = null;

    /* renamed from: m */
    private Scroller f1659m;

    /* renamed from: n */
    private boolean f1660n;

    /* renamed from: o */
    private C0575h f1661o;

    /* renamed from: p */
    private int f1662p;

    /* renamed from: q */
    private Drawable f1663q;

    /* renamed from: r */
    private int f1664r;

    /* renamed from: s */
    private int f1665s;

    /* renamed from: t */
    private float f1666t = -3.4028235E38f;

    /* renamed from: u */
    private float f1667u = Float.MAX_VALUE;

    /* renamed from: v */
    private int f1668v;

    /* renamed from: w */
    private int f1669w;

    /* renamed from: x */
    private boolean f1670x;

    /* renamed from: y */
    private boolean f1671y;

    /* renamed from: z */
    private boolean f1672z;

    /* renamed from: android.support.v4.view.ViewPager$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f1676a;

        /* renamed from: b */
        Parcelable f1677b;

        /* renamed from: c */
        ClassLoader f1678c;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f1676a = parcel.readInt();
            this.f1677b = parcel.readParcelable(classLoader);
            this.f1678c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f1676a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1676a);
            parcel.writeParcelable(this.f1677b, i);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.v4.view.ViewPager$a */
    public @interface C0568a {
    }

    /* renamed from: android.support.v4.view.ViewPager$b */
    static class C0569b {

        /* renamed from: a */
        Object f1679a;

        /* renamed from: b */
        int f1680b;

        /* renamed from: c */
        boolean f1681c;

        /* renamed from: d */
        float f1682d;

        /* renamed from: e */
        float f1683e;

        C0569b() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$c */
    public static class C0570c extends LayoutParams {

        /* renamed from: a */
        public boolean f1684a;

        /* renamed from: b */
        public int f1685b;

        /* renamed from: c */
        float f1686c = 0.0f;

        /* renamed from: d */
        boolean f1687d;

        /* renamed from: e */
        int f1688e;

        /* renamed from: f */
        int f1689f;

        public C0570c() {
            super(-1, -1);
        }

        public C0570c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1612a);
            this.f1685b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$d */
    class C0571d extends C0577a {
        C0571d() {
        }

        /* renamed from: b */
        private boolean m2616b() {
            return ViewPager.this.f1650b != null && ViewPager.this.f1650b.mo2480b() > 1;
        }

        /* renamed from: a */
        public void mo285a(View view, C0583b bVar) {
            super.mo285a(view, bVar);
            bVar.mo2361b((CharSequence) ViewPager.class.getName());
            bVar.mo2389k(m2616b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                bVar.mo2351a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                bVar.mo2351a(8192);
            }
        }

        /* renamed from: a */
        public void mo474a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo474a(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m2616b());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.f1650b != null) {
                accessibilityEvent.setItemCount(ViewPager.this.f1650b.mo2480b());
                accessibilityEvent.setFromIndex(ViewPager.this.f1651c);
                accessibilityEvent.setToIndex(ViewPager.this.f1651c);
            }
        }

        /* renamed from: a */
        public boolean mo2319a(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.mo2319a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = ViewPager.this.f1651c - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i2 = ViewPager.this.f1651c + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$e */
    public interface C0572e {
        /* renamed from: a */
        void mo719a(ViewPager viewPager, C0623p pVar, C0623p pVar2);
    }

    /* renamed from: android.support.v4.view.ViewPager$f */
    public interface C0573f {
        /* renamed from: a */
        void mo742a(int i);

        /* renamed from: a */
        void mo743a(int i, float f, int i2);

        /* renamed from: b */
        void mo744b(int i);
    }

    /* renamed from: android.support.v4.view.ViewPager$g */
    public interface C0574g {
        /* renamed from: a */
        void mo2320a(View view, float f);
    }

    /* renamed from: android.support.v4.view.ViewPager$h */
    private class C0575h extends DataSetObserver {
        C0575h() {
        }

        public void onChanged() {
            ViewPager.this.mo2261b();
        }

        public void onInvalidated() {
            ViewPager.this.mo2261b();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$i */
    static class C0576i implements Comparator<View> {
        C0576i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C0570c cVar = (C0570c) view.getLayoutParams();
            C0570c cVar2 = (C0570c) view2.getLayoutParams();
            if (cVar.f1684a == cVar2.f1684a) {
                return cVar.f1688e - cVar2.f1688e;
            }
            return cVar.f1684a ? 1 : -1;
        }
    }

    public ViewPager(Context context) {
        super(context);
        mo2245a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2245a();
    }

    /* renamed from: a */
    private int m2563a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f1630O || Math.abs(i2) <= this.f1628M) {
            i += (int) (f + (i >= this.f1651c ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f1653g.size() <= 0) {
            return i;
        }
        return Math.max(((C0569b) this.f1653g.get(0)).f1680b, Math.min(i, ((C0569b) this.f1653g.get(this.f1653g.size() - 1)).f1680b));
    }

    /* renamed from: a */
    private Rect m2564a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: a */
    private void m2565a(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f1653g.isEmpty()) {
            C0569b b = mo2259b(this.f1651c);
            min = (int) ((b != null ? Math.min(b.f1683e, this.f1667u) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m2569a(false);
            } else {
                return;
            }
        } else if (!this.f1659m.isFinished()) {
            this.f1659m.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: a */
    private void m2566a(int i, boolean z, int i2, boolean z2) {
        C0569b b = mo2259b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f1666t, Math.min(b.f1683e, this.f1667u))) : 0;
        if (z) {
            mo2248a(clientWidth, 0, i2);
            if (z2) {
                m2577e(i);
                return;
            }
            return;
        }
        if (z2) {
            m2577e(i);
        }
        m2569a(false);
        scrollTo(clientWidth, 0);
        m2576d(clientWidth);
    }

    /* renamed from: a */
    private void m2567a(C0569b bVar, int i, C0569b bVar2) {
        C0569b bVar3;
        C0569b bVar4;
        int b = this.f1650b.mo2480b();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f1662p) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f1680b;
            if (i2 < bVar.f1680b) {
                float f2 = bVar2.f1683e + bVar2.f1682d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f1680b && i4 < this.f1653g.size()) {
                    while (true) {
                        bVar4 = (C0569b) this.f1653g.get(i4);
                        if (i3 > bVar4.f1680b && i4 < this.f1653g.size() - 1) {
                            i4++;
                        }
                    }
                    while (i3 < bVar4.f1680b) {
                        f2 += this.f1650b.mo2487d(i3) + f;
                        i3++;
                    }
                    bVar4.f1683e = f2;
                    f2 += bVar4.f1682d + f;
                    i3++;
                }
            } else if (i2 > bVar.f1680b) {
                int size = this.f1653g.size() - 1;
                float f3 = bVar2.f1683e;
                while (true) {
                    i2--;
                    if (i2 < bVar.f1680b || size < 0) {
                        break;
                    }
                    while (true) {
                        bVar3 = (C0569b) this.f1653g.get(size);
                        if (i2 < bVar3.f1680b && size > 0) {
                            size--;
                        }
                    }
                    while (i2 > bVar3.f1680b) {
                        f3 -= this.f1650b.mo2487d(i2) + f;
                        i2--;
                    }
                    f3 -= bVar3.f1682d + f;
                    bVar3.f1683e = f3;
                }
            }
        }
        int size2 = this.f1653g.size();
        float f4 = bVar.f1683e;
        int i5 = bVar.f1680b - 1;
        this.f1666t = bVar.f1680b == 0 ? bVar.f1683e : -3.4028235E38f;
        int i6 = b - 1;
        this.f1667u = bVar.f1680b == i6 ? (bVar.f1683e + bVar.f1682d) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            C0569b bVar5 = (C0569b) this.f1653g.get(i7);
            while (i5 > bVar5.f1680b) {
                f4 -= this.f1650b.mo2487d(i5) + f;
                i5--;
            }
            f4 -= bVar5.f1682d + f;
            bVar5.f1683e = f4;
            if (bVar5.f1680b == 0) {
                this.f1666t = f4;
            }
            i7--;
            i5--;
        }
        float f5 = bVar.f1683e + bVar.f1682d + f;
        int i8 = bVar.f1680b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C0569b bVar6 = (C0569b) this.f1653g.get(i9);
            while (i8 < bVar6.f1680b) {
                f5 += this.f1650b.mo2487d(i8) + f;
                i8++;
            }
            if (bVar6.f1680b == i6) {
                this.f1667u = (bVar6.f1682d + f5) - 1.0f;
            }
            bVar6.f1683e = f5;
            f5 += bVar6.f1682d + f;
            i9++;
            i8++;
        }
        this.f1637V = false;
    }

    /* renamed from: a */
    private void m2568a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1626K) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1622G = motionEvent.getX(i);
            this.f1626K = motionEvent.getPointerId(i);
            if (this.f1627L != null) {
                this.f1627L.clear();
            }
        }
    }

    /* renamed from: a */
    private void m2569a(boolean z) {
        boolean z2 = this.f1649al == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f1659m.isFinished()) {
                this.f1659m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1659m.getCurrX();
                int currY = this.f1659m.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m2576d(currX);
                    }
                }
            }
        }
        this.f1672z = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f1653g.size(); i++) {
            C0569b bVar = (C0569b) this.f1653g.get(i);
            if (bVar.f1681c) {
                bVar.f1681c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C0626s.m2847a((View) this, this.f1648ak);
        } else {
            this.f1648ak.run();
        }
    }

    /* renamed from: a */
    private boolean m2570a(float f, float f2) {
        return (f < ((float) this.f1620E) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f1620E)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m2571b(int i, float f, int i2) {
        if (this.f1641ac != null) {
            this.f1641ac.mo743a(i, f, i2);
        }
        if (this.f1640ab != null) {
            int size = this.f1640ab.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0573f fVar = (C0573f) this.f1640ab.get(i3);
                if (fVar != null) {
                    fVar.mo743a(i, f, i2);
                }
            }
        }
        if (this.f1642ad != null) {
            this.f1642ad.mo743a(i, f, i2);
        }
    }

    /* renamed from: b */
    private void m2572b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f1645ag : 0, null);
        }
    }

    /* renamed from: c */
    private void m2573c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private boolean m2574c(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f1622G - f;
        this.f1622G = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f1666t * clientWidth;
        float f4 = this.f1667u * clientWidth;
        boolean z3 = false;
        C0569b bVar = (C0569b) this.f1653g.get(0);
        C0569b bVar2 = (C0569b) this.f1653g.get(this.f1653g.size() - 1);
        if (bVar.f1680b != 0) {
            f3 = bVar.f1683e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f1680b != this.f1650b.mo2480b() - 1) {
            f4 = bVar2.f1683e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f1634S.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f1635T.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f1622G += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m2576d(i);
        return z3;
    }

    /* renamed from: c */
    private static boolean m2575c(View view) {
        return view.getClass().getAnnotation(C0568a.class) != null;
    }

    /* renamed from: d */
    private boolean m2576d(int i) {
        if (this.f1653g.size() != 0) {
            C0569b l = m2582l();
            int clientWidth = getClientWidth();
            int i2 = this.f1662p + clientWidth;
            float f = (float) clientWidth;
            float f2 = ((float) this.f1662p) / f;
            int i3 = l.f1680b;
            float f3 = ((((float) i) / f) - l.f1683e) / (l.f1682d + f2);
            int i4 = (int) (((float) i2) * f3);
            this.f1638W = false;
            mo2247a(i3, f3, i4);
            if (this.f1638W) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f1636U) {
            return false;
        } else {
            this.f1638W = false;
            mo2247a(0, 0.0f, 0);
            if (this.f1638W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: e */
    private void m2577e(int i) {
        if (this.f1641ac != null) {
            this.f1641ac.mo744b(i);
        }
        if (this.f1640ab != null) {
            int size = this.f1640ab.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0573f fVar = (C0573f) this.f1640ab.get(i2);
                if (fVar != null) {
                    fVar.mo744b(i);
                }
            }
        }
        if (this.f1642ad != null) {
            this.f1642ad.mo744b(i);
        }
    }

    /* renamed from: f */
    private void m2578f(int i) {
        if (this.f1641ac != null) {
            this.f1641ac.mo742a(i);
        }
        if (this.f1640ab != null) {
            int size = this.f1640ab.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0573f fVar = (C0573f) this.f1640ab.get(i2);
                if (fVar != null) {
                    fVar.mo742a(i);
                }
            }
        }
        if (this.f1642ad != null) {
            this.f1642ad.mo742a(i);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: i */
    private void m2579i() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0570c) getChildAt(i).getLayoutParams()).f1684a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: j */
    private void m2580j() {
        if (this.f1646ah != 0) {
            if (this.f1647ai == null) {
                this.f1647ai = new ArrayList<>();
            } else {
                this.f1647ai.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f1647ai.add(getChildAt(i));
            }
            Collections.sort(this.f1647ai, f1613aj);
        }
    }

    /* renamed from: k */
    private boolean m2581k() {
        this.f1626K = -1;
        m2583m();
        this.f1634S.onRelease();
        this.f1635T.onRelease();
        return this.f1634S.isFinished() || this.f1635T.isFinished();
    }

    /* renamed from: l */
    private C0569b m2582l() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f1662p) / ((float) clientWidth) : 0.0f;
        C0569b bVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i < this.f1653g.size()) {
            C0569b bVar2 = (C0569b) this.f1653g.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (bVar2.f1680b != i3) {
                    bVar2 = this.f1654h;
                    bVar2.f1683e = f2 + f3 + f;
                    bVar2.f1680b = i3;
                    bVar2.f1682d = this.f1650b.mo2487d(bVar2.f1680b);
                    i--;
                }
            }
            f2 = bVar2.f1683e;
            float f4 = bVar2.f1682d + f2 + f;
            if (!z && scrollX < f2) {
                return bVar;
            }
            if (scrollX < f4 || i == this.f1653g.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f1680b;
            f3 = bVar2.f1682d;
            i++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    /* renamed from: m */
    private void m2583m() {
        this.f1617B = false;
        this.f1618C = false;
        if (this.f1627L != null) {
            this.f1627L.recycle();
            this.f1627L = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1671y != z) {
            this.f1671y = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo2242a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0569b mo2243a(int i, int i2) {
        C0569b bVar = new C0569b();
        bVar.f1680b = i;
        bVar.f1679a = this.f1650b.mo1656a((ViewGroup) this, i);
        bVar.f1682d = this.f1650b.mo2487d(i);
        if (i2 < 0 || i2 >= this.f1653g.size()) {
            this.f1653g.add(bVar);
        } else {
            this.f1653g.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0569b mo2244a(View view) {
        for (int i = 0; i < this.f1653g.size(); i++) {
            C0569b bVar = (C0569b) this.f1653g.get(i);
            if (this.f1650b.mo1660a(view, bVar.f1679a)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2245a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f1659m = new Scroller(context, f1615f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1621F = viewConfiguration.getScaledPagingTouchSlop();
        this.f1628M = (int) (400.0f * f);
        this.f1629N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1634S = new EdgeEffect(context);
        this.f1635T = new EdgeEffect(context);
        this.f1630O = (int) (25.0f * f);
        this.f1631P = (int) (2.0f * f);
        this.f1619D = (int) (f * 16.0f);
        C0626s.m2844a((View) this, (C0577a) new C0571d());
        if (C0626s.m2859d(this) == 0) {
            C0626s.m2854b((View) this, 1);
        }
        C0626s.m2845a((View) this, (C0622o) new C0622o() {

            /* renamed from: b */
            private final Rect f1675b = new Rect();

            /* renamed from: a */
            public C0591aa mo364a(View view, C0591aa aaVar) {
                C0591aa a = C0626s.m2836a(view, aaVar);
                if (a.mo2420f()) {
                    return a;
                }
                Rect rect = this.f1675b;
                rect.left = a.mo2413a();
                rect.top = a.mo2415b();
                rect.right = a.mo2416c();
                rect.bottom = a.mo2417d();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0591aa b = C0626s.m2853b(ViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo2413a(), rect.left);
                    rect.top = Math.min(b.mo2415b(), rect.top);
                    rect.right = Math.min(b.mo2416c(), rect.right);
                    rect.bottom = Math.min(b.mo2417d(), rect.bottom);
                }
                return a.mo2414a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r8.f1680b == r0.f1651c) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c8, code lost:
        if (r10 >= 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d6, code lost:
        if (r10 >= 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e4, code lost:
        if (r10 >= 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ef, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0144, code lost:
        if (r4 < r0.f1653g.size()) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014f, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0162, code lost:
        if (r4 < r0.f1653g.size()) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0174, code lost:
        if (r4 < r0.f1653g.size()) goto L_0x0146;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2246a(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f1651c
            if (r2 == r1) goto L_0x0011
            int r2 = r0.f1651c
            android.support.v4.view.ViewPager$b r2 = r0.mo2259b(r2)
            r0.f1651c = r1
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            android.support.v4.view.p r1 = r0.f1650b
            if (r1 != 0) goto L_0x001a
            r17.m2580j()
            return
        L_0x001a:
            boolean r1 = r0.f1672z
            if (r1 == 0) goto L_0x0022
            r17.m2580j()
            return
        L_0x0022:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            android.support.v4.view.p r1 = r0.f1650b
            r1.mo1658a(r0)
            int r1 = r0.f1616A
            int r4 = r0.f1651c
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            android.support.v4.view.p r6 = r0.f1650b
            int r6 = r6.mo2480b()
            int r7 = r6 + -1
            int r8 = r0.f1651c
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f1652d
            if (r6 != r7) goto L_0x01f7
            r7 = 0
        L_0x004c:
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r8 = r0.f1653g
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x006c
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r8 = r0.f1653g
            java.lang.Object r8 = r8.get(r7)
            android.support.v4.view.ViewPager$b r8 = (android.support.p009v4.view.ViewPager.C0569b) r8
            int r9 = r8.f1680b
            int r10 = r0.f1651c
            if (r9 < r10) goto L_0x0069
            int r9 = r8.f1680b
            int r10 = r0.f1651c
            if (r9 != r10) goto L_0x006c
            goto L_0x006d
        L_0x0069:
            int r7 = r7 + 1
            goto L_0x004c
        L_0x006c:
            r8 = 0
        L_0x006d:
            if (r8 != 0) goto L_0x0077
            if (r6 <= 0) goto L_0x0077
            int r8 = r0.f1651c
            android.support.v4.view.ViewPager$b r8 = r0.mo2243a(r8, r7)
        L_0x0077:
            r9 = 0
            if (r8 == 0) goto L_0x0184
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0087
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r11 = r0.f1653g
            java.lang.Object r11 = r11.get(r10)
            android.support.v4.view.ViewPager$b r11 = (android.support.p009v4.view.ViewPager.C0569b) r11
            goto L_0x0088
        L_0x0087:
            r11 = 0
        L_0x0088:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x0092
            r3 = 0
            goto L_0x009f
        L_0x0092:
            float r14 = r8.f1682d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x009f:
            int r14 = r0.f1651c
            int r14 = r14 + -1
            r15 = r7
            r7 = 0
        L_0x00a5:
            if (r14 < 0) goto L_0x00f5
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00cb
            if (r14 >= r4) goto L_0x00cb
            if (r11 != 0) goto L_0x00b0
            goto L_0x00f5
        L_0x00b0:
            int r5 = r11.f1680b
            if (r14 != r5) goto L_0x00f1
            boolean r5 = r11.f1681c
            if (r5 != 0) goto L_0x00f1
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1653g
            r5.remove(r10)
            android.support.v4.view.p r5 = r0.f1650b
            java.lang.Object r11 = r11.f1679a
            r5.mo1659a(r0, r14, r11)
            int r10 = r10 + -1
            int r15 = r15 + -1
            if (r10 < 0) goto L_0x00ef
            goto L_0x00e6
        L_0x00cb:
            if (r11 == 0) goto L_0x00d9
            int r5 = r11.f1680b
            if (r14 != r5) goto L_0x00d9
            float r5 = r11.f1682d
            float r7 = r7 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00ef
            goto L_0x00e6
        L_0x00d9:
            int r5 = r10 + 1
            android.support.v4.view.ViewPager$b r5 = r0.mo2243a(r14, r5)
            float r5 = r5.f1682d
            float r7 = r7 + r5
            int r15 = r15 + 1
            if (r10 < 0) goto L_0x00ef
        L_0x00e6:
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1653g
            java.lang.Object r5 = r5.get(r10)
            android.support.v4.view.ViewPager$b r5 = (android.support.p009v4.view.ViewPager.C0569b) r5
            goto L_0x00f0
        L_0x00ef:
            r5 = 0
        L_0x00f0:
            r11 = r5
        L_0x00f1:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x00a5
        L_0x00f5:
            float r3 = r8.f1682d
            int r4 = r15 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0178
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1653g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x010e
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1653g
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p009v4.view.ViewPager.C0569b) r5
            goto L_0x010f
        L_0x010e:
            r5 = 0
        L_0x010f:
            if (r12 > 0) goto L_0x0113
            r7 = 0
            goto L_0x011b
        L_0x0113:
            int r7 = r17.getPaddingRight()
            float r7 = (float) r7
            float r10 = (float) r12
            float r7 = r7 / r10
            float r7 = r7 + r13
        L_0x011b:
            int r10 = r0.f1651c
        L_0x011d:
            int r10 = r10 + 1
            if (r10 >= r6) goto L_0x0178
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x0151
            if (r10 <= r1) goto L_0x0151
            if (r5 != 0) goto L_0x012a
            goto L_0x0178
        L_0x012a:
            int r11 = r5.f1680b
            if (r10 != r11) goto L_0x0177
            boolean r11 = r5.f1681c
            if (r11 != 0) goto L_0x0177
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r11 = r0.f1653g
            r11.remove(r4)
            android.support.v4.view.p r11 = r0.f1650b
            java.lang.Object r5 = r5.f1679a
            r11.mo1659a(r0, r10, r5)
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1653g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014f
        L_0x0146:
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1653g
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p009v4.view.ViewPager.C0569b) r5
            goto L_0x0177
        L_0x014f:
            r5 = 0
            goto L_0x0177
        L_0x0151:
            if (r5 == 0) goto L_0x0165
            int r11 = r5.f1680b
            if (r10 != r11) goto L_0x0165
            float r5 = r5.f1682d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1653g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014f
            goto L_0x0146
        L_0x0165:
            android.support.v4.view.ViewPager$b r5 = r0.mo2243a(r10, r4)
            int r4 = r4 + 1
            float r5 = r5.f1682d
            float r3 = r3 + r5
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1653g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014f
            goto L_0x0146
        L_0x0177:
            goto L_0x011d
        L_0x0178:
            r0.m2567a(r8, r15, r2)
            android.support.v4.view.p r1 = r0.f1650b
            int r2 = r0.f1651c
            java.lang.Object r3 = r8.f1679a
            r1.mo1663b(r0, r2, r3)
        L_0x0184:
            android.support.v4.view.p r1 = r0.f1650b
            r1.mo1662b(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x018e:
            if (r2 >= r1) goto L_0x01b7
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.support.v4.view.ViewPager$c r4 = (android.support.p009v4.view.ViewPager.C0570c) r4
            r4.f1689f = r2
            boolean r5 = r4.f1684a
            if (r5 != 0) goto L_0x01b4
            float r5 = r4.f1686c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01b4
            android.support.v4.view.ViewPager$b r3 = r0.mo2244a(r3)
            if (r3 == 0) goto L_0x01b4
            float r5 = r3.f1682d
            r4.f1686c = r5
            int r3 = r3.f1680b
            r4.f1688e = r3
        L_0x01b4:
            int r2 = r2 + 1
            goto L_0x018e
        L_0x01b7:
            r17.m2580j()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01f6
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01cb
            android.support.v4.view.ViewPager$b r3 = r0.mo2260b(r1)
            goto L_0x01cc
        L_0x01cb:
            r3 = 0
        L_0x01cc:
            if (r3 == 0) goto L_0x01d4
            int r1 = r3.f1680b
            int r2 = r0.f1651c
            if (r1 == r2) goto L_0x01f6
        L_0x01d4:
            r1 = 0
        L_0x01d5:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x01f6
            android.view.View r2 = r0.getChildAt(r1)
            android.support.v4.view.ViewPager$b r3 = r0.mo2244a(r2)
            if (r3 == 0) goto L_0x01f3
            int r3 = r3.f1680b
            int r4 = r0.f1651c
            if (r3 != r4) goto L_0x01f3
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 == 0) goto L_0x01f3
            goto L_0x01f6
        L_0x01f3:
            int r1 = r1 + 1
            goto L_0x01d5
        L_0x01f6:
            return
        L_0x01f7:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x0204 }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x0204 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0204 }
            goto L_0x020c
        L_0x0204:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x020c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f1652d
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            android.support.v4.view.p r1 = r0.f1650b
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.view.ViewPager.mo2246a(int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2247a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f1639aa
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006d
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = 0
        L_0x001d:
            if (r3 >= r6) goto L_0x006d
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            android.support.v4.view.ViewPager$c r9 = (android.support.p009v4.view.ViewPager.C0570c) r9
            boolean r10 = r9.f1684a
            if (r10 != 0) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            int r9 = r9.f1685b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004f
            r10 = 3
            if (r9 == r10) goto L_0x0049
            r10 = 5
            if (r9 == r10) goto L_0x003c
            r9 = r4
            goto L_0x005e
        L_0x003c:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L_0x005b
        L_0x0049:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L_0x005e
        L_0x004f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L_0x005b:
            r11 = r9
            r9 = r4
            r4 = r11
        L_0x005e:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0069
            r8.offsetLeftAndRight(r4)
        L_0x0069:
            r4 = r9
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x006d:
            r12.m2571b(r13, r14, r15)
            android.support.v4.view.ViewPager$g r13 = r12.f1644af
            if (r13 == 0) goto L_0x00a1
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007c:
            if (r1 >= r14) goto L_0x00a1
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            android.support.v4.view.ViewPager$c r0 = (android.support.p009v4.view.ViewPager.C0570c) r0
            boolean r0 = r0.f1684a
            if (r0 == 0) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            android.support.v4.view.ViewPager$g r3 = r12.f1644af
            r3.mo2320a(r15, r0)
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x007c
        L_0x00a1:
            r12.f1638W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.view.ViewPager.mo2247a(int, float, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2248a(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.f1659m != null && !this.f1659m.isFinished()) {
            i4 = this.f1660n ? this.f1659m.getCurrX() : this.f1659m.getStartX();
            this.f1659m.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i5 = i4;
        int scrollY = getScrollY();
        int i6 = i - i5;
        int i7 = i2 - scrollY;
        if (i6 == 0 && i7 == 0) {
            m2569a(false);
            mo2265c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i8;
        float a = f2 + (mo2242a(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i6)) / ((f * this.f1650b.mo2487d(this.f1651c)) + ((float) this.f1662p))) + 1.0f) * 100.0f), 600);
        this.f1660n = false;
        this.f1659m.startScroll(i5, scrollY, i6, i7, min);
        C0626s.m2857c(this);
    }

    /* renamed from: a */
    public void mo2249a(int i, boolean z) {
        this.f1672z = false;
        mo2250a(i, z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2250a(int i, boolean z, boolean z2) {
        mo2251a(i, z, z2, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2251a(int i, boolean z, boolean z2, int i2) {
        if (this.f1650b == null || this.f1650b.mo2480b() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f1651c != i || this.f1653g.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f1650b.mo2480b()) {
                i = this.f1650b.mo2480b() - 1;
            }
            int i3 = this.f1616A;
            if (i > this.f1651c + i3 || i < this.f1651c - i3) {
                for (int i4 = 0; i4 < this.f1653g.size(); i4++) {
                    ((C0569b) this.f1653g.get(i4)).f1681c = true;
                }
            }
            if (this.f1651c == i) {
                z3 = false;
            }
            if (this.f1636U) {
                this.f1651c = i;
                if (z3) {
                    m2577e(i);
                }
                requestLayout();
            } else {
                mo2246a(i);
                m2566a(i, z, i2, z3);
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    public void mo2252a(C0572e eVar) {
        if (this.f1643ae == null) {
            this.f1643ae = new ArrayList();
        }
        this.f1643ae.add(eVar);
    }

    /* renamed from: a */
    public void mo2253a(C0573f fVar) {
        if (this.f1640ab == null) {
            this.f1640ab = new ArrayList();
        }
        this.f1640ab.add(fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return mo2266c(r4);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2254a(android.view.KeyEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L_0x004a
            int r0 = r4.getKeyCode()
            r1 = 61
            r2 = 2
            if (r0 == r1) goto L_0x0033
            switch(r0) {
                case 21: goto L_0x0021;
                case 22: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x004a
        L_0x0013:
            boolean r4 = r4.hasModifiers(r2)
            if (r4 == 0) goto L_0x001e
            boolean r4 = r3.mo2286h()
            goto L_0x004b
        L_0x001e:
            r4 = 66
            goto L_0x002e
        L_0x0021:
            boolean r4 = r4.hasModifiers(r2)
            if (r4 == 0) goto L_0x002c
            boolean r4 = r3.mo2277g()
            goto L_0x004b
        L_0x002c:
            r4 = 17
        L_0x002e:
            boolean r4 = r3.mo2266c(r4)
            goto L_0x004b
        L_0x0033:
            boolean r0 = r4.hasNoModifiers()
            if (r0 == 0) goto L_0x003e
            boolean r4 = r3.mo2266c(r2)
            goto L_0x004b
        L_0x003e:
            r0 = 1
            boolean r4 = r4.hasModifiers(r0)
            if (r4 == 0) goto L_0x004a
            boolean r4 = r3.mo2266c(r0)
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.view.ViewPager.mo2254a(android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2255a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (mo2255a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0569b a = mo2244a(childAt);
                    if (a != null && a.f1680b == this.f1651c) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0569b a = mo2244a(childAt);
                if (a != null && a.f1680b == this.f1651c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0570c cVar = (C0570c) layoutParams;
        cVar.f1684a |= m2575c(view);
        if (!this.f1670x) {
            super.addView(view, i, layoutParams);
        } else if (cVar == null || !cVar.f1684a) {
            cVar.f1687d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0569b mo2259b(int i) {
        for (int i2 = 0; i2 < this.f1653g.size(); i2++) {
            C0569b bVar = (C0569b) this.f1653g.get(i2);
            if (bVar.f1680b == i) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0569b mo2260b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo2244a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2261b() {
        int b = this.f1650b.mo2480b();
        this.f1652d = b;
        boolean z = this.f1653g.size() < (this.f1616A * 2) + 1 && this.f1653g.size() < b;
        int i = this.f1651c;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f1653g.size()) {
            C0569b bVar = (C0569b) this.f1653g.get(i2);
            int a = this.f1650b.mo2475a(bVar.f1679a);
            if (a != -1) {
                if (a == -2) {
                    this.f1653g.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f1650b.mo1658a((ViewGroup) this);
                        z2 = true;
                    }
                    this.f1650b.mo1659a((ViewGroup) this, bVar.f1680b, bVar.f1679a);
                    if (this.f1651c == bVar.f1680b) {
                        i = Math.max(0, Math.min(this.f1651c, b - 1));
                    }
                } else if (bVar.f1680b != a) {
                    if (bVar.f1680b == this.f1651c) {
                        i = a;
                    }
                    bVar.f1680b = a;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f1650b.mo1662b((ViewGroup) this);
        }
        Collections.sort(this.f1653g, f1614e);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C0570c cVar = (C0570c) getChildAt(i3).getLayoutParams();
                if (!cVar.f1684a) {
                    cVar.f1686c = 0.0f;
                }
            }
            mo2250a(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo2262b(float f) {
        if (!this.f1632Q) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f1650b != null) {
            this.f1622G += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.f1666t * clientWidth;
            float f3 = this.f1667u * clientWidth;
            C0569b bVar = (C0569b) this.f1653g.get(0);
            C0569b bVar2 = (C0569b) this.f1653g.get(this.f1653g.size() - 1);
            if (bVar.f1680b != 0) {
                f2 = bVar.f1683e * clientWidth;
            }
            if (bVar2.f1680b != this.f1650b.mo2480b() - 1) {
                f3 = bVar2.f1683e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.f1622G += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            m2576d(i);
            MotionEvent obtain = MotionEvent.obtain(this.f1633R, SystemClock.uptimeMillis(), 2, this.f1622G, 0.0f, 0);
            this.f1627L.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public void mo2263b(C0572e eVar) {
        if (this.f1643ae != null) {
            this.f1643ae.remove(eVar);
        }
    }

    /* renamed from: b */
    public void mo2264b(C0573f fVar) {
        if (this.f1640ab != null) {
            this.f1640ab.remove(fVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2265c() {
        mo2246a(this.f1651c);
    }

    /* renamed from: c */
    public boolean mo2266c(int i) {
        boolean h;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    sb2.append(sb.toString());
                    Log.e("ViewPager", sb2.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && findNextFocus != view) {
            if (i == 17) {
                int i2 = m2564a(this.f1655i, findNextFocus).left;
                int i3 = m2564a(this.f1655i, view).left;
                if (view != null && i2 >= i3) {
                    h = mo2277g();
                    z2 = h;
                }
            } else if (i == 66) {
                int i4 = m2564a(this.f1655i, findNextFocus).left;
                int i5 = m2564a(this.f1655i, view).left;
                if (view != null && i4 <= i5) {
                    h = mo2286h();
                    z2 = h;
                }
            }
            h = findNextFocus.requestFocus();
            z2 = h;
        } else if (i == 17 || i == 1) {
            z2 = mo2277g();
        } else if (i == 66 || i == 2) {
            z2 = mo2286h();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.f1650b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f1666t))) {
                z = true;
            }
            return z;
        }
        if (i > 0 && scrollX < ((int) (((float) clientWidth) * this.f1667u))) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0570c) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f1660n = true;
        if (this.f1659m.isFinished() || !this.f1659m.computeScrollOffset()) {
            m2569a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1659m.getCurrX();
        int currY = this.f1659m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m2576d(currX)) {
                this.f1659m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0626s.m2857c(this);
    }

    /* renamed from: d */
    public boolean mo2270d() {
        if (this.f1617B) {
            return false;
        }
        this.f1632Q = true;
        setScrollState(1);
        this.f1622G = 0.0f;
        this.f1624I = 0.0f;
        if (this.f1627L == null) {
            this.f1627L = VelocityTracker.obtain();
        } else {
            this.f1627L.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f1627L.addMovement(obtain);
        obtain.recycle();
        this.f1633R = uptimeMillis;
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2254a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0569b a = mo2244a(childAt);
                if (a != null && a.f1680b == this.f1651c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && this.f1650b != null && this.f1650b.mo2480b() > 1)) {
            if (!this.f1634S.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f1666t * ((float) width));
                this.f1634S.setSize(height, width);
                z = false | this.f1634S.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f1635T.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f1667u + 1.0f)) * ((float) width2));
                this.f1635T.setSize(height2, width2);
                z |= this.f1635T.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f1634S.finish();
            this.f1635T.finish();
        }
        if (z) {
            C0626s.m2857c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1663q;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: e */
    public void mo2275e() {
        if (this.f1632Q) {
            if (this.f1650b != null) {
                VelocityTracker velocityTracker = this.f1627L;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f1629N);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f1626K);
                this.f1672z = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C0569b l = m2582l();
                mo2251a(m2563a(l.f1680b, ((((float) scrollX) / ((float) clientWidth)) - l.f1683e) / l.f1682d, xVelocity, (int) (this.f1622G - this.f1624I)), true, true, xVelocity);
            }
            m2583m();
            this.f1632Q = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* renamed from: f */
    public boolean mo2276f() {
        return this.f1632Q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo2277g() {
        if (this.f1651c <= 0) {
            return false;
        }
        mo2249a(this.f1651c - 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C0570c();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0570c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0623p getAdapter() {
        return this.f1650b;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f1646ah == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0570c) ((View) this.f1647ai.get(i2)).getLayoutParams()).f1689f;
    }

    public int getCurrentItem() {
        return this.f1651c;
    }

    public int getOffscreenPageLimit() {
        return this.f1616A;
    }

    public int getPageMargin() {
        return this.f1662p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo2286h() {
        if (this.f1650b == null || this.f1651c >= this.f1650b.mo2480b() - 1) {
            return false;
        }
        mo2249a(this.f1651c + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1636U = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1648ak);
        if (this.f1659m != null && !this.f1659m.isFinished()) {
            this.f1659m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f1662p > 0 && this.f1663q != null && this.f1653g.size() > 0 && this.f1650b != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.f1662p) / f4;
            int i = 0;
            C0569b bVar = (C0569b) this.f1653g.get(0);
            float f6 = bVar.f1683e;
            int size = this.f1653g.size();
            int i2 = bVar.f1680b;
            int i3 = ((C0569b) this.f1653g.get(size - 1)).f1680b;
            while (i2 < i3) {
                while (i2 > bVar.f1680b && i < size) {
                    i++;
                    bVar = (C0569b) this.f1653g.get(i);
                }
                if (i2 == bVar.f1680b) {
                    f2 = (bVar.f1683e + bVar.f1682d) * f4;
                    f = bVar.f1683e + bVar.f1682d + f5;
                } else {
                    float d = this.f1650b.mo2487d(i2);
                    f = f6 + d + f5;
                    f2 = (f6 + d) * f4;
                }
                if (((float) this.f1662p) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.f1663q.setBounds(Math.round(f2), this.f1664r, Math.round(((float) this.f1662p) + f2), this.f1665s);
                    this.f1663q.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i2++;
                    f6 = f;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m2581k();
            return false;
        }
        if (action != 0) {
            if (this.f1617B) {
                return true;
            }
            if (this.f1618C) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f1624I = x;
            this.f1622G = x;
            float y = motionEvent.getY();
            this.f1625J = y;
            this.f1623H = y;
            this.f1626K = motionEvent2.getPointerId(0);
            this.f1618C = false;
            this.f1660n = true;
            this.f1659m.computeScrollOffset();
            if (this.f1649al != 2 || Math.abs(this.f1659m.getFinalX() - this.f1659m.getCurrX()) <= this.f1631P) {
                m2569a(false);
                this.f1617B = false;
            } else {
                this.f1659m.abortAnimation();
                this.f1672z = false;
                mo2265c();
                this.f1617B = true;
                m2573c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f1626K;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f1622G;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f1625J);
                if (f != 0.0f && !m2570a(this.f1622G, f)) {
                    if (mo2255a(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f1622G = x2;
                        this.f1623H = y2;
                        this.f1618C = true;
                        return false;
                    }
                }
                if (abs > ((float) this.f1621F) && abs * 0.5f > abs2) {
                    this.f1617B = true;
                    m2573c(true);
                    setScrollState(1);
                    this.f1622G = f > 0.0f ? this.f1624I + ((float) this.f1621F) : this.f1624I - ((float) this.f1621F);
                    this.f1623H = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f1621F)) {
                    this.f1618C = true;
                }
                if (this.f1617B && m2574c(x2)) {
                    C0626s.m2857c(this);
                }
            }
        } else if (action == 6) {
            m2568a(motionEvent);
        }
        if (this.f1627L == null) {
            this.f1627L = VelocityTracker.obtain();
        }
        this.f1627L.addMovement(motionEvent2);
        return this.f1617B;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = paddingBottom;
        int i10 = 0;
        int i11 = paddingTop;
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0570c cVar = (C0570c) childAt.getLayoutParams();
                if (cVar.f1684a) {
                    int i14 = cVar.f1685b & 7;
                    int i15 = cVar.f1685b & 112;
                    if (i14 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i12);
                    } else if (i14 == 3) {
                        i5 = i12;
                        i12 = childAt.getMeasuredWidth() + i12;
                    } else if (i14 != 5) {
                        i5 = i12;
                    } else {
                        i5 = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i15 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, i11);
                    } else if (i15 == 48) {
                        i6 = i11;
                        i11 = childAt.getMeasuredHeight() + i11;
                    } else if (i15 != 80) {
                        i6 = i11;
                    } else {
                        i6 = (i8 - i9) - childAt.getMeasuredHeight();
                        i9 += childAt.getMeasuredHeight();
                    }
                    int i16 = i5 + scrollX;
                    childAt.layout(i16, i6, childAt.getMeasuredWidth() + i16, i6 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i17 = (i7 - i12) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                C0570c cVar2 = (C0570c) childAt2.getLayoutParams();
                if (!cVar2.f1684a) {
                    C0569b a = mo2244a(childAt2);
                    if (a != null) {
                        float f = (float) i17;
                        int i19 = ((int) (a.f1683e * f)) + i12;
                        if (cVar2.f1687d) {
                            cVar2.f1687d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * cVar2.f1686c), 1073741824), MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                        }
                        childAt2.layout(i19, i11, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + i11);
                    }
                }
            }
        }
        this.f1664r = i11;
        this.f1665s = i8 - i9;
        this.f1639aa = i10;
        if (this.f1636U) {
            z2 = false;
            m2566a(this.f1651c, false, 0, false);
        } else {
            z2 = false;
        }
        this.f1636U = z2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r17
            int r2 = getDefaultSize(r1, r2)
            r3 = r18
            int r3 = getDefaultSize(r1, r3)
            r0.setMeasuredDimension(r2, r3)
            int r2 = r16.getMeasuredWidth()
            int r3 = r2 / 10
            int r4 = r0.f1619D
            int r3 = java.lang.Math.min(r3, r4)
            r0.f1620E = r3
            int r3 = r16.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r16.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r16.getMeasuredHeight()
            int r4 = r16.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r16.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r16.getChildCount()
            r5 = r3
            r3 = r2
            r2 = 0
        L_0x003f:
            r6 = 8
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r4) goto L_0x00c6
            android.view.View r9 = r0.getChildAt(r2)
            int r10 = r9.getVisibility()
            if (r10 == r6) goto L_0x00c1
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            android.support.v4.view.ViewPager$c r6 = (android.support.p009v4.view.ViewPager.C0570c) r6
            if (r6 == 0) goto L_0x00c1
            boolean r10 = r6.f1684a
            if (r10 == 0) goto L_0x00c1
            int r10 = r6.f1685b
            r10 = r10 & 7
            int r11 = r6.f1685b
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r11 == r12) goto L_0x006f
            r12 = 80
            if (r11 != r12) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r11 = 0
            goto L_0x0070
        L_0x006f:
            r11 = 1
        L_0x0070:
            r12 = 3
            if (r10 == r12) goto L_0x0078
            r12 = 5
            if (r10 != r12) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x0081
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x007e:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0085
        L_0x0081:
            if (r7 == 0) goto L_0x007e
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0085:
            int r13 = r6.width
            r14 = -1
            r15 = -2
            if (r13 == r15) goto L_0x0097
            int r10 = r6.width
            if (r10 == r14) goto L_0x0093
            int r10 = r6.width
            r13 = r10
            goto L_0x0094
        L_0x0093:
            r13 = r3
        L_0x0094:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0098
        L_0x0097:
            r13 = r3
        L_0x0098:
            int r1 = r6.height
            if (r1 == r15) goto L_0x00a5
            int r1 = r6.height
            if (r1 == r14) goto L_0x00a3
            int r1 = r6.height
            goto L_0x00a7
        L_0x00a3:
            r1 = r5
            goto L_0x00a7
        L_0x00a5:
            r1 = r5
            r8 = r12
        L_0x00a7:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r9.measure(r6, r1)
            if (r11 == 0) goto L_0x00ba
            int r1 = r9.getMeasuredHeight()
            int r5 = r5 - r1
            goto L_0x00c1
        L_0x00ba:
            if (r7 == 0) goto L_0x00c1
            int r1 = r9.getMeasuredWidth()
            int r3 = r3 - r1
        L_0x00c1:
            int r2 = r2 + 1
            r1 = 0
            goto L_0x003f
        L_0x00c6:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r0.f1668v = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r0.f1669w = r1
            r0.f1670x = r7
            r16.mo2265c()
            r1 = 0
            r0.f1670x = r1
            int r2 = r16.getChildCount()
        L_0x00de:
            if (r1 >= r2) goto L_0x0108
            android.view.View r4 = r0.getChildAt(r1)
            int r5 = r4.getVisibility()
            if (r5 == r6) goto L_0x0105
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v4.view.ViewPager$c r5 = (android.support.p009v4.view.ViewPager.C0570c) r5
            if (r5 == 0) goto L_0x00f6
            boolean r7 = r5.f1684a
            if (r7 != 0) goto L_0x0105
        L_0x00f6:
            float r7 = (float) r3
            float r5 = r5.f1686c
            float r7 = r7 * r5
            int r5 = (int) r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r7 = r0.f1669w
            r4.measure(r5, r7)
        L_0x0105:
            int r1 = r1 + 1
            goto L_0x00de
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.view.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                C0569b a = mo2244a(childAt);
                if (a != null && a.f1680b == this.f1651c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2234a());
        if (this.f1650b != null) {
            this.f1650b.mo1657a(savedState.f1677b, savedState.f1678c);
            mo2250a(savedState.f1676a, false, true);
        } else {
            this.f1656j = savedState.f1676a;
            this.f1657k = savedState.f1677b;
            this.f1658l = savedState.f1678c;
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1676a = this.f1651c;
        if (this.f1650b != null) {
            savedState.f1677b = this.f1650b.mo1654a();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m2565a(i, i3, this.f1662p, this.f1662p);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0123, code lost:
        r2 = m2581k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f1632Q
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            android.support.v4.view.p r0 = r7.f1650b
            if (r0 == 0) goto L_0x014e
            android.support.v4.view.p r0 = r7.f1650b
            int r0 = r0.mo2480b()
            if (r0 != 0) goto L_0x0022
            goto L_0x014e
        L_0x0022:
            android.view.VelocityTracker r0 = r7.f1627L
            if (r0 != 0) goto L_0x002c
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.f1627L = r0
        L_0x002c:
            android.view.VelocityTracker r0 = r7.f1627L
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L_0x0128;
                case 1: goto L_0x00db;
                case 2: goto L_0x0068;
                case 3: goto L_0x005d;
                case 4: goto L_0x003a;
                case 5: goto L_0x004d;
                case 6: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0148
        L_0x003c:
            r7.m2568a(r8)
            int r0 = r7.f1626K
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.f1622G = r8
            goto L_0x0148
        L_0x004d:
            int r0 = r8.getActionIndex()
            float r3 = r8.getX(r0)
            r7.f1622G = r3
            int r8 = r8.getPointerId(r0)
            goto L_0x0146
        L_0x005d:
            boolean r8 = r7.f1617B
            if (r8 == 0) goto L_0x0148
            int r8 = r7.f1651c
            r7.m2566a(r8, r1, r2, r2)
            goto L_0x0123
        L_0x0068:
            boolean r0 = r7.f1617B
            if (r0 != 0) goto L_0x00c7
            int r0 = r7.f1626K
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L_0x0077
            goto L_0x0123
        L_0x0077:
            float r3 = r8.getX(r0)
            float r4 = r7.f1622G
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.f1623H
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.f1621F
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c7
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c7
            r7.f1617B = r1
            r7.m2573c(r1)
            float r4 = r7.f1624I
            float r3 = r3 - r4
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ae
            float r3 = r7.f1624I
            int r4 = r7.f1621F
            float r4 = (float) r4
            float r3 = r3 + r4
            goto L_0x00b4
        L_0x00ae:
            float r3 = r7.f1624I
            int r4 = r7.f1621F
            float r4 = (float) r4
            float r3 = r3 - r4
        L_0x00b4:
            r7.f1622G = r3
            r7.f1623H = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00c7
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00c7:
            boolean r0 = r7.f1617B
            if (r0 == 0) goto L_0x0148
            int r0 = r7.f1626K
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.m2574c(r8)
            r2 = r2 | r8
            goto L_0x0148
        L_0x00db:
            boolean r0 = r7.f1617B
            if (r0 == 0) goto L_0x0148
            android.view.VelocityTracker r0 = r7.f1627L
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r7.f1629N
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r7.f1626K
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.f1672z = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            android.support.v4.view.ViewPager$b r4 = r7.m2582l()
            int r5 = r7.f1662p
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.f1680b
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.f1683e
            float r3 = r3 - r2
            float r2 = r4.f1682d
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.f1626K
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.f1624I
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.m2563a(r6, r3, r0, r8)
            r7.mo2251a(r8, r1, r1, r0)
        L_0x0123:
            boolean r2 = r7.m2581k()
            goto L_0x0148
        L_0x0128:
            android.widget.Scroller r0 = r7.f1659m
            r0.abortAnimation()
            r7.f1672z = r2
            r7.mo2265c()
            float r0 = r8.getX()
            r7.f1624I = r0
            r7.f1622G = r0
            float r0 = r8.getY()
            r7.f1625J = r0
            r7.f1623H = r0
            int r8 = r8.getPointerId(r2)
        L_0x0146:
            r7.f1626K = r8
        L_0x0148:
            if (r2 == 0) goto L_0x014d
            android.support.p009v4.view.C0626s.m2857c(r7)
        L_0x014d:
            return r1
        L_0x014e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.view.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.f1670x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C0623p pVar) {
        if (this.f1650b != null) {
            this.f1650b.mo2486c((DataSetObserver) null);
            this.f1650b.mo1658a((ViewGroup) this);
            for (int i = 0; i < this.f1653g.size(); i++) {
                C0569b bVar = (C0569b) this.f1653g.get(i);
                this.f1650b.mo1659a((ViewGroup) this, bVar.f1680b, bVar.f1679a);
            }
            this.f1650b.mo1662b((ViewGroup) this);
            this.f1653g.clear();
            m2579i();
            this.f1651c = 0;
            scrollTo(0, 0);
        }
        C0623p pVar2 = this.f1650b;
        this.f1650b = pVar;
        this.f1652d = 0;
        if (this.f1650b != null) {
            if (this.f1661o == null) {
                this.f1661o = new C0575h();
            }
            this.f1650b.mo2486c((DataSetObserver) this.f1661o);
            this.f1672z = false;
            boolean z = this.f1636U;
            this.f1636U = true;
            this.f1652d = this.f1650b.mo2480b();
            if (this.f1656j >= 0) {
                this.f1650b.mo1657a(this.f1657k, this.f1658l);
                mo2250a(this.f1656j, false, true);
                this.f1656j = -1;
                this.f1657k = null;
                this.f1658l = null;
            } else if (!z) {
                mo2265c();
            } else {
                requestLayout();
            }
        }
        if (this.f1643ae != null && !this.f1643ae.isEmpty()) {
            int size = this.f1643ae.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C0572e) this.f1643ae.get(i2)).mo719a(this, pVar2, pVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f1672z = false;
        mo2250a(i, !this.f1636U, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i = 1;
        }
        if (i != this.f1616A) {
            this.f1616A = i;
            mo2265c();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C0573f fVar) {
        this.f1641ac = fVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f1662p;
        this.f1662p = i;
        int width = getWidth();
        m2565a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0452b.m2059a(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1663q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (this.f1649al != i) {
            this.f1649al = i;
            if (this.f1644af != null) {
                m2572b(i != 0);
            }
            m2578f(i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1663q;
    }
}
