package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p005b.C0042a.C0043a;
import android.support.p005b.C0042a.C0044b;
import android.support.p005b.C0042a.C0045c;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.p014c.C0430a;
import android.support.p009v4.p019g.C0503i;
import android.support.p009v4.p019g.C0505k.C0506a;
import android.support.p009v4.p019g.C0505k.C0508c;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.C0591aa;
import android.support.p009v4.view.C0604d;
import android.support.p009v4.view.C0620m;
import android.support.p009v4.view.C0621n;
import android.support.p009v4.view.C0622o;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.widget.C0694h;
import android.support.p009v4.widget.C0725t;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C0620m {

    /* renamed from: a */
    static final String f311a;

    /* renamed from: b */
    static final Class<?>[] f312b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<C0131b>>> f313c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f314d;

    /* renamed from: f */
    private static final C0506a<Rect> f315f = new C0508c(12);

    /* renamed from: e */
    OnHierarchyChangeListener f316e;

    /* renamed from: g */
    private final List<View> f317g;

    /* renamed from: h */
    private final C0694h<View> f318h;

    /* renamed from: i */
    private final List<View> f319i;

    /* renamed from: j */
    private final List<View> f320j;

    /* renamed from: k */
    private final int[] f321k;

    /* renamed from: l */
    private Paint f322l;

    /* renamed from: m */
    private boolean f323m;

    /* renamed from: n */
    private boolean f324n;

    /* renamed from: o */
    private int[] f325o;

    /* renamed from: p */
    private View f326p;

    /* renamed from: q */
    private View f327q;

    /* renamed from: r */
    private C0135f f328r;

    /* renamed from: s */
    private boolean f329s;

    /* renamed from: t */
    private C0591aa f330t;

    /* renamed from: u */
    private boolean f331u;

    /* renamed from: v */
    private Drawable f332v;

    /* renamed from: w */
    private C0622o f333w;

    /* renamed from: x */
    private final C0621n f334x;

    protected static class SavedState extends AbsSavedState {
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
        SparseArray<Parcelable> f336a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f336a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f336a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int size = this.f336a != null ? this.f336a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f336a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f336a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$a */
    public interface C0130a {
        /* renamed from: a */
        C0131b mo544a();
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$b */
    public static abstract class C0131b<V extends View> {
        public C0131b() {
        }

        public C0131b(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public C0591aa mo545a(CoordinatorLayout coordinatorLayout, V v, C0591aa aaVar) {
            return aaVar;
        }

        /* renamed from: a */
        public void mo546a(C0134e eVar) {
        }

        /* renamed from: a */
        public void mo402a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo403a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo453c(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo547a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo404a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo547a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo443a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public void mo405a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo443a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public boolean mo411a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo412a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo548a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo432a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo445a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo433a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo446a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo549a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo447a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo413a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo447a(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: b */
        public Parcelable mo418b(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: b */
        public void mo550b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: b */
        public void mo551b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo550b(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: b */
        public boolean mo451b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo436b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: c */
        public int mo552c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: c */
        public void mo553c() {
        }

        @Deprecated
        /* renamed from: c */
        public void mo453c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public float mo554d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: d */
        public void mo555d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: e */
        public boolean mo556e(CoordinatorLayout coordinatorLayout, V v) {
            return mo554d(coordinatorLayout, v) > 0.0f;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.design.widget.CoordinatorLayout$c */
    public @interface C0132c {
        /* renamed from: a */
        Class<? extends C0131b> mo557a();
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$d */
    private class C0133d implements OnHierarchyChangeListener {
        C0133d() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f316e != null) {
                CoordinatorLayout.this.f316e.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo480a(2);
            if (CoordinatorLayout.this.f316e != null) {
                CoordinatorLayout.this.f316e.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$e */
    public static class C0134e extends MarginLayoutParams {

        /* renamed from: a */
        C0131b f338a;

        /* renamed from: b */
        boolean f339b = false;

        /* renamed from: c */
        public int f340c = 0;

        /* renamed from: d */
        public int f341d = 0;

        /* renamed from: e */
        public int f342e = -1;

        /* renamed from: f */
        int f343f = -1;

        /* renamed from: g */
        public int f344g = 0;

        /* renamed from: h */
        public int f345h = 0;

        /* renamed from: i */
        int f346i;

        /* renamed from: j */
        int f347j;

        /* renamed from: k */
        View f348k;

        /* renamed from: l */
        View f349l;

        /* renamed from: m */
        final Rect f350m = new Rect();

        /* renamed from: n */
        Object f351n;

        /* renamed from: o */
        private boolean f352o;

        /* renamed from: p */
        private boolean f353p;

        /* renamed from: q */
        private boolean f354q;

        /* renamed from: r */
        private boolean f355r;

        public C0134e(int i, int i2) {
            super(i, i2);
        }

        C0134e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045c.CoordinatorLayout_Layout);
            this.f340c = obtainStyledAttributes.getInteger(C0045c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f343f = obtainStyledAttributes.getResourceId(C0045c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f341d = obtainStyledAttributes.getInteger(C0045c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f342e = obtainStyledAttributes.getInteger(C0045c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f344g = obtainStyledAttributes.getInt(C0045c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f345h = obtainStyledAttributes.getInt(C0045c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f339b = obtainStyledAttributes.hasValue(C0045c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f339b) {
                this.f338a = CoordinatorLayout.m423a(context, attributeSet, obtainStyledAttributes.getString(C0045c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            if (this.f338a != null) {
                this.f338a.mo546a(this);
            }
        }

        public C0134e(C0134e eVar) {
            super(eVar);
        }

        public C0134e(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0134e(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        private void m506a(View view, CoordinatorLayout coordinatorLayout) {
            this.f348k = coordinatorLayout.findViewById(this.f343f);
            if (this.f348k != null) {
                if (this.f348k != coordinatorLayout) {
                    View view2 = this.f348k;
                    ViewParent parent = this.f348k.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f349l = view2;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find CoordinatorLayout descendant view with id ");
                sb.append(coordinatorLayout.getResources().getResourceName(this.f343f));
                sb.append(" to anchor view ");
                sb.append(view);
                throw new IllegalStateException(sb.toString());
            }
            this.f349l = null;
            this.f348k = null;
        }

        /* renamed from: a */
        private boolean m507a(View view, int i) {
            int a = C0604d.m2741a(((C0134e) view.getLayoutParams()).f344g, i);
            return a != 0 && (C0604d.m2741a(this.f345h, i) & a) == a;
        }

        /* renamed from: b */
        private boolean m508b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f348k.getId() != this.f343f) {
                return false;
            }
            View view2 = this.f348k;
            for (ViewParent parent = this.f348k.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f349l = null;
                    this.f348k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f349l = view2;
            return true;
        }

        /* renamed from: a */
        public int mo560a() {
            return this.f343f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo561a(int i) {
            mo562a(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo562a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f353p = z;
                    return;
                case 1:
                    this.f354q = z;
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo563a(Rect rect) {
            this.f350m.set(rect);
        }

        /* renamed from: a */
        public void mo564a(C0131b bVar) {
            if (this.f338a != bVar) {
                if (this.f338a != null) {
                    this.f338a.mo553c();
                }
                this.f338a = bVar;
                this.f351n = null;
                this.f339b = true;
                if (bVar != null) {
                    bVar.mo546a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo565a(boolean z) {
            this.f355r = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo566a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f352o) {
                return true;
            }
            boolean e = (this.f338a != null ? this.f338a.mo556e(coordinatorLayout, view) : false) | this.f352o;
            this.f352o = e;
            return e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo567a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 == this.f349l || m507a(view2, C0626s.m2861e(coordinatorLayout)) || (this.f338a != null && this.f338a.mo433a(coordinatorLayout, view, view2));
        }

        /* renamed from: b */
        public C0131b mo568b() {
            return this.f338a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public View mo569b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f343f == -1) {
                this.f349l = null;
                this.f348k = null;
                return null;
            }
            if (this.f348k == null || !m508b(view, coordinatorLayout)) {
                m506a(view, coordinatorLayout);
            }
            return this.f348k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo570b(int i) {
            switch (i) {
                case 0:
                    return this.f353p;
                case 1:
                    return this.f354q;
                default:
                    return false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Rect mo571c() {
            return this.f350m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo572d() {
            return this.f348k == null && this.f343f != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo573e() {
            if (this.f338a == null) {
                this.f352o = false;
            }
            return this.f352o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo574f() {
            this.f352o = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo575g() {
            return this.f355r;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo576h() {
            this.f355r = false;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$f */
    class C0135f implements OnPreDrawListener {
        C0135f() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo480a(0);
            return true;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$g */
    static class C0136g implements Comparator<View> {
        C0136g() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float x = C0626s.m2881x(view);
            float x2 = C0626s.m2881x(view2);
            if (x > x2) {
                return -1;
            }
            return x < x2 ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f311a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f314d = new C0136g();
        } else {
            f314d = null;
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0043a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f317g = new ArrayList();
        this.f318h = new C0694h<>();
        this.f319i = new ArrayList();
        this.f320j = new ArrayList();
        this.f321k = new int[2];
        this.f334x = new C0621n(this);
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, C0045c.CoordinatorLayout, 0, C0044b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, C0045c.CoordinatorLayout, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C0045c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f325o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f325o.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f325o[i2] = (int) (((float) this.f325o[i2]) * f);
            }
        }
        this.f332v = obtainStyledAttributes.getDrawable(C0045c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m444g();
        super.setOnHierarchyChangeListener(new C0133d());
    }

    /* renamed from: a */
    static C0131b m423a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f311a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f311a);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f313c.get();
            if (map == null) {
                map = new HashMap();
                f313c.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f312b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0131b) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    /* renamed from: a */
    private static void m424a(Rect rect) {
        rect.setEmpty();
        f315f.mo2002a(rect);
    }

    /* renamed from: a */
    private void m425a(C0134e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    private void m426a(View view, int i, Rect rect, Rect rect2, C0134e eVar, int i2, int i3) {
        int a = C0604d.m2741a(m438e(eVar.f340c), i);
        int a2 = C0604d.m2741a(m435c(eVar.f341d), i);
        int i4 = a & 7;
        int i5 = a & 112;
        int i6 = a2 & 7;
        int i7 = a2 & 112;
        int i8 = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int i9 = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            i8 -= i2 / 2;
        } else if (i4 != 5) {
            i8 -= i2;
        }
        if (i5 == 16) {
            i9 -= i3 / 2;
        } else if (i5 != 80) {
            i9 -= i3;
        }
        rect2.set(i8, i9, i2 + i8, i3 + i9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m427a(android.view.View r9, android.graphics.Rect r10, int r11) {
        /*
            r8 = this;
            boolean r0 = android.support.p009v4.view.C0626s.m2880w(r9)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto L_0x0104
            int r0 = r9.getHeight()
            if (r0 > 0) goto L_0x0015
            goto L_0x0104
        L_0x0015:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$e r0 = (android.support.design.widget.CoordinatorLayout.C0134e) r0
            android.support.design.widget.CoordinatorLayout$b r1 = r0.mo568b()
            android.graphics.Rect r2 = m439e()
            android.graphics.Rect r3 = m439e()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r1.mo548a(r8, r9, r2)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L_0x0049
            goto L_0x0073
        L_0x0049:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.append(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0070:
            r2.set(r3)
        L_0x0073:
            m424a(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0080
            m424a(r2)
            return
        L_0x0080:
            int r1 = r0.f345h
            int r11 = android.support.p009v4.view.C0604d.m2741a(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x00a2
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f347j
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L_0x00a2
            int r3 = r10.top
            int r3 = r3 - r1
            r8.m443f(r9, r3)
            r1 = 1
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto L_0x00c1
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.f347j
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto L_0x00c1
            int r1 = r10.bottom
            int r3 = r3 - r1
            r8.m443f(r9, r3)
            r1 = 1
        L_0x00c1:
            if (r1 != 0) goto L_0x00c6
            r8.m443f(r9, r5)
        L_0x00c6:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto L_0x00df
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f346i
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto L_0x00df
            int r3 = r10.left
            int r3 = r3 - r1
            r8.m440e(r9, r3)
            r1 = 1
            goto L_0x00e0
        L_0x00df:
            r1 = 0
        L_0x00e0:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto L_0x00fc
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.f346i
            int r11 = r11 + r0
            int r0 = r10.right
            if (r11 >= r0) goto L_0x00fc
            int r10 = r10.right
            int r11 = r11 - r10
            r8.m440e(r9, r11)
            r1 = 1
        L_0x00fc:
            if (r1 != 0) goto L_0x0101
            r8.m440e(r9, r5)
        L_0x0101:
            m424a(r2)
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.m427a(android.view.View, android.graphics.Rect, int):void");
    }

    /* renamed from: a */
    private void m428a(View view, View view2, int i) {
        C0134e eVar = (C0134e) view.getLayoutParams();
        Rect e = m439e();
        Rect e2 = m439e();
        try {
            mo486a(view2, e);
            mo485a(view, i, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        } finally {
            m424a(e);
            m424a(e2);
        }
    }

    /* renamed from: a */
    private void m429a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        if (f314d != null) {
            Collections.sort(list, f314d);
        }
    }

    /* renamed from: a */
    private void m430a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0131b b = ((C0134e) childAt.getLayoutParams()).mo568b();
            if (b != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    b.mo445a(this, childAt, obtain);
                } else {
                    b.mo451b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0134e) getChildAt(i2).getLayoutParams()).mo574f();
        }
        this.f326p = null;
        this.f323m = false;
    }

    /* renamed from: a */
    private boolean m431a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f319i;
        m429a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C0134e eVar = (C0134e) view.getLayoutParams();
            C0131b b = eVar.mo568b();
            if ((z || z2) && actionMasked != 0) {
                if (b != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            b.mo445a(this, view, motionEvent3);
                            break;
                        case 1:
                            b.mo451b(this, view, motionEvent3);
                            break;
                    }
                }
            } else {
                if (!z && b != null) {
                    switch (i) {
                        case 0:
                            z = b.mo445a(this, view, motionEvent2);
                            break;
                        case 1:
                            z = b.mo451b(this, view, motionEvent2);
                            break;
                    }
                    if (z) {
                        this.f326p = view;
                    }
                }
                boolean e = eVar.mo573e();
                boolean a = eVar.mo566a(this, view);
                z2 = a && !e;
                if (a && !z2) {
                    list.clear();
                    return z;
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: b */
    private int m432b(int i) {
        String str;
        StringBuilder sb;
        if (this.f325o == null) {
            str = "CoordinatorLayout";
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < this.f325o.length) {
            return this.f325o[i];
        } else {
            str = "CoordinatorLayout";
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e(str, sb.toString());
        return 0;
    }

    /* renamed from: b */
    private C0591aa m433b(C0591aa aaVar) {
        if (aaVar.mo2420f()) {
            return aaVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0626s.m2873p(childAt)) {
                C0131b b = ((C0134e) childAt.getLayoutParams()).mo568b();
                if (b != null) {
                    aaVar = b.mo545a(this, childAt, aaVar);
                    if (aaVar.mo2420f()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return aaVar;
    }

    /* renamed from: b */
    private void m434b(View view, int i, int i2) {
        C0134e eVar = (C0134e) view.getLayoutParams();
        int a = C0604d.m2741a(m436d(eVar.f340c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m432b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: c */
    private static int m435c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m436d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: d */
    private void m437d(View view, int i) {
        C0134e eVar = (C0134e) view.getLayoutParams();
        Rect e = m439e();
        e.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (this.f330t != null && C0626s.m2873p(this) && !C0626s.m2873p(view)) {
            e.left += this.f330t.mo2413a();
            e.top += this.f330t.mo2415b();
            e.right -= this.f330t.mo2416c();
            e.bottom -= this.f330t.mo2417d();
        }
        Rect e2 = m439e();
        C0604d.m2742a(m435c(eVar.f340c), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, i);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        m424a(e);
        m424a(e2);
    }

    /* renamed from: e */
    private static int m438e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: e */
    private static Rect m439e() {
        Rect rect = (Rect) f315f.mo2001a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: e */
    private void m440e(View view, int i) {
        C0134e eVar = (C0134e) view.getLayoutParams();
        if (eVar.f346i != i) {
            C0626s.m2862e(view, i - eVar.f346i);
            eVar.f346i = i;
        }
    }

    /* renamed from: e */
    private boolean m441e(View view) {
        return this.f318h.mo2891e(view);
    }

    /* renamed from: f */
    private void m442f() {
        this.f317g.clear();
        this.f318h.mo2884a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0134e a = mo476a(childAt);
            a.mo569b(this, childAt);
            this.f318h.mo2885a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (a.mo567a(this, childAt, childAt2)) {
                        if (!this.f318h.mo2888b(childAt2)) {
                            this.f318h.mo2885a(childAt2);
                        }
                        this.f318h.mo2886a(childAt2, childAt);
                    }
                }
            }
        }
        this.f317g.addAll(this.f318h.mo2887b());
        Collections.reverse(this.f317g);
    }

    /* renamed from: f */
    private void m443f(View view, int i) {
        C0134e eVar = (C0134e) view.getLayoutParams();
        if (eVar.f347j != i) {
            C0626s.m2860d(view, i - eVar.f347j);
            eVar.f347j = i;
        }
    }

    /* renamed from: g */
    private void m444g() {
        if (VERSION.SDK_INT >= 21) {
            if (C0626s.m2873p(this)) {
                if (this.f333w == null) {
                    this.f333w = new C0622o() {
                        /* renamed from: a */
                        public C0591aa mo364a(View view, C0591aa aaVar) {
                            return CoordinatorLayout.this.mo478a(aaVar);
                        }
                    };
                }
                C0626s.m2845a((View) this, this.f333w);
                setSystemUiVisibility(1280);
            } else {
                C0626s.m2845a((View) this, (C0622o) null);
            }
        }
    }

    /* renamed from: a */
    public C0134e generateLayoutParams(AttributeSet attributeSet) {
        return new C0134e(getContext(), attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0134e mo476a(View view) {
        C0134e eVar = (C0134e) view.getLayoutParams();
        if (!eVar.f339b) {
            if (view instanceof C0130a) {
                C0131b a = ((C0130a) view).mo544a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.mo564a(a);
            } else {
                C0132c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (C0132c) cls.getAnnotation(C0132c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.mo564a((C0131b) cVar.mo557a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(cVar.mo557a().getName());
                        sb.append(" could not be instantiated. Did you forget");
                        sb.append(" a default constructor?");
                        Log.e("CoordinatorLayout", sb.toString(), e);
                    }
                }
            }
            eVar.f339b = true;
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0134e generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0134e ? new C0134e((C0134e) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0134e((MarginLayoutParams) layoutParams) : new C0134e(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0591aa mo478a(C0591aa aaVar) {
        if (C0503i.m2243a(this.f330t, aaVar)) {
            return aaVar;
        }
        this.f330t = aaVar;
        boolean z = true;
        this.f331u = aaVar != null && aaVar.mo2415b() > 0;
        if (this.f331u || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0591aa b = m433b(aaVar);
        requestLayout();
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo479a() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m441e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f329s) {
            return;
        }
        if (z) {
            mo490b();
        } else {
            mo496c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo480a(int i) {
        boolean z;
        int i2 = i;
        int e = C0626s.m2861e(this);
        int size = this.f317g.size();
        Rect e2 = m439e();
        Rect e3 = m439e();
        Rect e4 = m439e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f317g.get(i3);
            C0134e eVar = (C0134e) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (eVar.f349l == ((View) this.f317g.get(i4))) {
                        mo492b(view, e);
                    }
                }
                mo487a(view, true, e3);
                if (eVar.f344g != 0 && !e3.isEmpty()) {
                    int a = C0604d.m2741a(eVar.f344g, e);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        e2.top = Math.max(e2.top, e3.bottom);
                    } else if (i5 == 80) {
                        e2.bottom = Math.max(e2.bottom, getHeight() - e3.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        e2.left = Math.max(e2.left, e3.right);
                    } else if (i6 == 5) {
                        e2.right = Math.max(e2.right, getWidth() - e3.left);
                    }
                }
                if (eVar.f345h != 0 && view.getVisibility() == 0) {
                    m427a(view, e2, e);
                }
                if (i2 != 2) {
                    mo498c(view, e4);
                    if (!e4.equals(e3)) {
                        mo493b(view, e3);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = (View) this.f317g.get(i7);
                    C0134e eVar2 = (C0134e) view2.getLayoutParams();
                    C0131b b = eVar2.mo568b();
                    if (b != null && b.mo433a(this, view2, view)) {
                        if (i2 != 0 || !eVar2.mo575g()) {
                            if (i2 != 2) {
                                z = b.mo436b(this, view2, view);
                            } else {
                                b.mo555d(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                eVar2.mo565a(z);
                            }
                        } else {
                            eVar2.mo576h();
                        }
                    }
                }
            }
        }
        m424a(e2);
        m424a(e3);
        m424a(e4);
    }

    /* renamed from: a */
    public void mo481a(View view, int i) {
        C0134e eVar = (C0134e) view.getLayoutParams();
        if (eVar.mo572d()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (eVar.f348k != null) {
            m428a(view, eVar.f348k, i);
        } else if (eVar.f342e >= 0) {
            m434b(view, eVar.f342e, i);
        } else {
            m437d(view, i);
        }
    }

    /* renamed from: a */
    public void mo482a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo483a(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i5;
            } else {
                C0134e eVar = (C0134e) childAt.getLayoutParams();
                if (eVar.mo570b(i5)) {
                    C0131b b = eVar.mo568b();
                    if (b != null) {
                        b.mo404a(this, childAt, view, i, i2, i3, i4, i5);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            mo480a(1);
        }
    }

    /* renamed from: a */
    public void mo484a(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0134e eVar = (C0134e) childAt.getLayoutParams();
                if (eVar.mo570b(i3)) {
                    C0131b b = eVar.mo568b();
                    if (b != null) {
                        int[] iArr2 = this.f321k;
                        this.f321k[1] = 0;
                        iArr2[0] = 0;
                        b.mo405a(this, childAt, view, i, i2, this.f321k, i3);
                        i4 = i > 0 ? Math.max(i4, this.f321k[0]) : Math.min(i4, this.f321k[0]);
                        i5 = i2 > 0 ? Math.max(i5, this.f321k[1]) : Math.min(i5, this.f321k[1]);
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo480a(1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo485a(View view, int i, Rect rect, Rect rect2) {
        C0134e eVar = (C0134e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m426a(view, i, rect, rect2, eVar, measuredWidth, measuredHeight);
        m425a(eVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo486a(View view, Rect rect) {
        C0725t.m3404b(this, view, rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo487a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (z) {
            mo486a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public boolean mo488a(View view, int i, int i2) {
        Rect e = m439e();
        mo486a(view, e);
        try {
            return e.contains(i, i2);
        } finally {
            m424a(e);
        }
    }

    /* renamed from: a */
    public boolean mo489a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0134e eVar = (C0134e) childAt.getLayoutParams();
                C0131b b = eVar.mo568b();
                if (b != null) {
                    boolean a = b.mo413a(this, childAt, view, view2, i, i2);
                    boolean z2 = z | a;
                    eVar.mo562a(i3, a);
                    z = z2;
                } else {
                    eVar.mo562a(i3, false);
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo490b() {
        if (this.f324n) {
            if (this.f328r == null) {
                this.f328r = new C0135f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f328r);
        }
        this.f329s = true;
    }

    /* renamed from: b */
    public void mo491b(View view) {
        List c = this.f318h.mo2889c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                C0131b b = ((C0134e) view2.getLayoutParams()).mo568b();
                if (b != null) {
                    b.mo436b(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo492b(View view, int i) {
        View view2 = view;
        C0134e eVar = (C0134e) view.getLayoutParams();
        if (eVar.f348k != null) {
            Rect e = m439e();
            Rect e2 = m439e();
            Rect e3 = m439e();
            mo486a(eVar.f348k, e);
            boolean z = false;
            mo487a(view2, false, e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m426a(view, i, e, e3, eVar, measuredWidth, measuredHeight);
            if (!(e3.left == e2.left && e3.top == e2.top)) {
                z = true;
            }
            m425a(eVar, e3, measuredWidth, i2);
            int i3 = e3.left - e2.left;
            int i4 = e3.top - e2.top;
            if (i3 != 0) {
                C0626s.m2862e(view2, i3);
            }
            if (i4 != 0) {
                C0626s.m2860d(view2, i4);
            }
            if (z) {
                C0131b b = eVar.mo568b();
                if (b != null) {
                    b.mo436b(this, view2, eVar.f348k);
                }
            }
            m424a(e);
            m424a(e2);
            m424a(e3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo493b(View view, Rect rect) {
        ((C0134e) view.getLayoutParams()).mo563a(rect);
    }

    /* renamed from: b */
    public void mo494b(View view, View view2, int i, int i2) {
        this.f334x.mo2474a(view, view2, i, i2);
        this.f327q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0134e eVar = (C0134e) childAt.getLayoutParams();
            if (eVar.mo570b(i2)) {
                C0131b b = eVar.mo568b();
                if (b != null) {
                    b.mo551b(this, childAt, view, view2, i, i2);
                }
            }
        }
    }

    /* renamed from: c */
    public List<View> mo495c(View view) {
        List d = this.f318h.mo2890d(view);
        this.f320j.clear();
        if (d != null) {
            this.f320j.addAll(d);
        }
        return this.f320j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo496c() {
        if (this.f324n && this.f328r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f328r);
        }
        this.f329s = false;
    }

    /* renamed from: c */
    public void mo497c(View view, int i) {
        this.f334x.mo2472a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0134e eVar = (C0134e) childAt.getLayoutParams();
            if (eVar.mo570b(i)) {
                C0131b b = eVar.mo568b();
                if (b != null) {
                    b.mo403a(this, childAt, view, i);
                }
                eVar.mo561a(i);
                eVar.mo576h();
            }
        }
        this.f327q = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo498c(View view, Rect rect) {
        rect.set(((C0134e) view.getLayoutParams()).mo571c());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0134e) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0134e generateDefaultLayoutParams() {
        return new C0134e(-2, -2);
    }

    /* renamed from: d */
    public List<View> mo501d(View view) {
        List c = this.f318h.mo2889c(view);
        this.f320j.clear();
        if (c != null) {
            this.f320j.addAll(c);
        }
        return this.f320j;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0134e eVar = (C0134e) view.getLayoutParams();
        if (eVar.f338a != null) {
            float d = eVar.f338a.mo554d(this, view);
            if (d > 0.0f) {
                if (this.f322l == null) {
                    this.f322l = new Paint();
                }
                this.f322l.setColor(eVar.f338a.mo552c(this, view));
                this.f322l.setAlpha(C0430a.m1985a(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f322l);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f332v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        m442f();
        return Collections.unmodifiableList(this.f317g);
    }

    public final C0591aa getLastWindowInsets() {
        return this.f330t;
    }

    public int getNestedScrollAxes() {
        return this.f334x.mo2470a();
    }

    public Drawable getStatusBarBackground() {
        return this.f332v;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m430a(false);
        if (this.f329s) {
            if (this.f328r == null) {
                this.f328r = new C0135f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f328r);
        }
        if (this.f330t == null && C0626s.m2873p(this)) {
            C0626s.m2872o(this);
        }
        this.f324n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m430a(false);
        if (this.f329s && this.f328r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f328r);
        }
        if (this.f327q != null) {
            onStopNestedScroll(this.f327q);
        }
        this.f324n = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f331u && this.f332v != null) {
            int b = this.f330t != null ? this.f330t.mo2415b() : 0;
            if (b > 0) {
                this.f332v.setBounds(0, 0, getWidth(), b);
                this.f332v.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m430a(true);
        }
        boolean a = m431a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m430a(true);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int e = C0626s.m2861e(this);
        int size = this.f317g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f317g.get(i5);
            if (view.getVisibility() != 8) {
                C0131b b = ((C0134e) view.getLayoutParams()).mo568b();
                if (b == null || !b.mo411a(this, view, e)) {
                    mo481a(view, e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0119, code lost:
        if (r0.mo412a(r30, r20, r11, r21, r23, 0) == false) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m442f()
            r30.mo479a()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = android.support.p009v4.view.C0626s.m2861e(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            android.support.v4.view.aa r3 = r7.f330t
            if (r3 == 0) goto L_0x004b
            boolean r3 = android.support.p009v4.view.C0626s.m2873p(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f317g
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x016e
            java.util.List<android.view.View> r0 = r7.f317g
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0071
            r22 = r5
            r29 = r6
            goto L_0x0168
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            android.support.design.widget.CoordinatorLayout$e r1 = (android.support.design.widget.CoordinatorLayout.C0134e) r1
            int r0 = r1.f342e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r1.f342e
            int r0 = r7.m432b(r0)
            int r11 = r1.f340c
            int r11 = m436d(r11)
            int r11 = android.support.p009v4.view.C0604d.m2741a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = android.support.p009v4.view.C0626s.m2873p(r20)
            if (r0 != 0) goto L_0x00f1
            android.support.v4.view.aa r0 = r7.f330t
            int r0 = r0.mo2413a()
            android.support.v4.view.aa r2 = r7.f330t
            int r2 = r2.mo2416c()
            int r0 = r0 + r2
            android.support.v4.view.aa r2 = r7.f330t
            int r2 = r2.mo2415b()
            android.support.v4.view.aa r11 = r7.f330t
            int r11 = r11.mo2417d()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            android.support.design.widget.CoordinatorLayout$b r0 = r1.mo568b()
            if (r0 == 0) goto L_0x011c
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r11
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo412a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0135
            goto L_0x0128
        L_0x011c:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x0128:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo482a(r1, r2, r3, r4, r5)
        L_0x0135:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r27
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r4 = r0
            r3 = r2
            r2 = r1
        L_0x0168:
            int r5 = r22 + 1
            r6 = r29
            goto L_0x0057
        L_0x016e:
            r1 = r2
            r11 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0134e eVar = (C0134e) childAt.getLayoutParams();
                if (eVar.mo570b(0)) {
                    C0131b b = eVar.mo568b();
                    if (b != null) {
                        z2 |= b.mo549a(this, childAt, view, f, f2, z);
                    }
                }
            }
        }
        if (z2) {
            mo480a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0134e eVar = (C0134e) childAt.getLayoutParams();
                if (eVar.mo570b(0)) {
                    C0131b b = eVar.mo568b();
                    if (b != null) {
                        z |= b.mo446a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo484a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo483a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo494b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2234a());
        SparseArray<Parcelable> sparseArray = savedState.f336a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0131b b = mo476a(childAt).mo568b();
            if (!(id == -1 || b == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    b.mo402a(this, childAt, parcelable2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0131b b = ((C0134e) childAt.getLayoutParams()).mo568b();
            if (!(id == -1 || b == null)) {
                Parcelable b2 = b.mo418b(this, childAt);
                if (b2 != null) {
                    sparseArray.append(id, b2);
                }
            }
        }
        savedState.f336a = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo489a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo497c(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f326p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.m431a(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = 0
            goto L_0x002c
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.view.View r6 = r0.f326p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$e r6 = (android.support.design.widget.CoordinatorLayout.C0134e) r6
            android.support.design.widget.CoordinatorLayout$b r6 = r6.mo568b()
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f326p
            boolean r6 = r6.mo451b(r0, r7, r1)
        L_0x002c:
            android.view.View r7 = r0.f326p
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m430a(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0131b b = ((C0134e) view.getLayoutParams()).mo568b();
        if (b == null || !b.mo432a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f323m) {
            m430a(false);
            this.f323m = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m444g();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f316e = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        if (this.f332v != drawable) {
            Drawable drawable2 = null;
            if (this.f332v != null) {
                this.f332v.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f332v = drawable2;
            if (this.f332v != null) {
                if (this.f332v.isStateful()) {
                    this.f332v.setState(getDrawableState());
                }
                C0311a.m1181b(this.f332v, C0626s.m2861e(this));
                this.f332v.setVisible(getVisibility() == 0, false);
                this.f332v.setCallback(this);
            }
            C0626s.m2857c(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0452b.m2059a(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f332v != null && this.f332v.isVisible() != z) {
            this.f332v.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f332v;
    }
}
