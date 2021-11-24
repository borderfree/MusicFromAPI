package android.support.p023v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.C0604d;
import android.support.p009v4.view.C0608f;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.app.C0751a.C0752a;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.p026c.p027a.C0817b;
import android.support.p023v7.view.C0829c;
import android.support.p023v7.view.C0834g;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0855h.C0856a;
import android.support.p023v7.view.menu.C0859j;
import android.support.p023v7.view.menu.C0871o;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.view.menu.C0881u;
import android.support.p023v7.widget.ActionMenuView.C0901e;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f3347A;

    /* renamed from: B */
    private int f3348B;

    /* renamed from: C */
    private boolean f3349C;

    /* renamed from: D */
    private boolean f3350D;

    /* renamed from: E */
    private final ArrayList<View> f3351E;

    /* renamed from: F */
    private final ArrayList<View> f3352F;

    /* renamed from: G */
    private final int[] f3353G;

    /* renamed from: H */
    private final C0901e f3354H;

    /* renamed from: I */
    private C1079bl f3355I;

    /* renamed from: J */
    private ActionMenuPresenter f3356J;

    /* renamed from: K */
    private C0987a f3357K;

    /* renamed from: L */
    private C0872a f3358L;

    /* renamed from: M */
    private C0856a f3359M;

    /* renamed from: N */
    private boolean f3360N;

    /* renamed from: O */
    private final Runnable f3361O;

    /* renamed from: a */
    ImageButton f3362a;

    /* renamed from: b */
    View f3363b;

    /* renamed from: c */
    int f3364c;

    /* renamed from: d */
    C0989c f3365d;

    /* renamed from: e */
    private ActionMenuView f3366e;

    /* renamed from: f */
    private TextView f3367f;

    /* renamed from: g */
    private TextView f3368g;

    /* renamed from: h */
    private ImageButton f3369h;

    /* renamed from: i */
    private ImageView f3370i;

    /* renamed from: j */
    private Drawable f3371j;

    /* renamed from: k */
    private CharSequence f3372k;

    /* renamed from: l */
    private Context f3373l;

    /* renamed from: m */
    private int f3374m;

    /* renamed from: n */
    private int f3375n;

    /* renamed from: o */
    private int f3376o;

    /* renamed from: p */
    private int f3377p;

    /* renamed from: q */
    private int f3378q;

    /* renamed from: r */
    private int f3379r;

    /* renamed from: s */
    private int f3380s;

    /* renamed from: t */
    private int f3381t;

    /* renamed from: u */
    private C1058az f3382u;

    /* renamed from: v */
    private int f3383v;

    /* renamed from: w */
    private int f3384w;

    /* renamed from: x */
    private int f3385x;

    /* renamed from: y */
    private CharSequence f3386y;

    /* renamed from: z */
    private CharSequence f3387z;

    /* renamed from: android.support.v7.widget.Toolbar$SavedState */
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
        int f3391a;

        /* renamed from: b */
        boolean f3392b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3391a = parcel.readInt();
            this.f3392b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3391a);
            parcel.writeInt(this.f3392b ? 1 : 0);
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$a */
    private class C0987a implements C0871o {

        /* renamed from: a */
        C0855h f3393a;

        /* renamed from: b */
        C0859j f3394b;

        C0987a() {
        }

        /* renamed from: a */
        public void mo316a(Context context, C0855h hVar) {
            if (!(this.f3393a == null || this.f3394b == null)) {
                this.f3393a.mo3518d(this.f3394b);
            }
            this.f3393a = hVar;
        }

        /* renamed from: a */
        public void mo319a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo321a(C0855h hVar, boolean z) {
        }

        /* renamed from: a */
        public void mo323a(C0872a aVar) {
        }

        /* renamed from: a */
        public void mo325a(boolean z) {
            if (this.f3394b != null) {
                boolean z2 = false;
                if (this.f3393a != null) {
                    int size = this.f3393a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f3393a.getItem(i) == this.f3394b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo333b(this.f3393a, this.f3394b);
                }
            }
        }

        /* renamed from: a */
        public boolean mo326a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo327a(C0855h hVar, C0859j jVar) {
            Toolbar.this.mo4867i();
            ViewParent parent = Toolbar.this.f3362a.getParent();
            if (parent != Toolbar.this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(Toolbar.this.f3362a);
                }
                Toolbar.this.addView(Toolbar.this.f3362a);
            }
            Toolbar.this.f3363b = jVar.getActionView();
            this.f3394b = jVar;
            ViewParent parent2 = Toolbar.this.f3363b.getParent();
            if (parent2 != Toolbar.this) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(Toolbar.this.f3363b);
                }
                C0988b j = Toolbar.this.generateDefaultLayoutParams();
                j.f2207a = 8388611 | (Toolbar.this.f3364c & 112);
                j.f3396b = 2;
                Toolbar.this.f3363b.setLayoutParams(j);
                Toolbar.this.addView(Toolbar.this.f3363b);
            }
            Toolbar.this.mo4869k();
            Toolbar.this.requestLayout();
            jVar.mo3566e(true);
            if (Toolbar.this.f3363b instanceof C0829c) {
                ((C0829c) Toolbar.this.f3363b).mo3288a();
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo328a(C0881u uVar) {
            return false;
        }

        /* renamed from: b */
        public int mo329b() {
            return 0;
        }

        /* renamed from: b */
        public boolean mo333b(C0855h hVar, C0859j jVar) {
            if (Toolbar.this.f3363b instanceof C0829c) {
                ((C0829c) Toolbar.this.f3363b).mo3289b();
            }
            Toolbar.this.removeView(Toolbar.this.f3363b);
            Toolbar.this.removeView(Toolbar.this.f3362a);
            Toolbar.this.f3363b = null;
            Toolbar.this.mo4870l();
            this.f3394b = null;
            Toolbar.this.requestLayout();
            jVar.mo3566e(false);
            return true;
        }

        /* renamed from: c */
        public Parcelable mo334c() {
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public static class C0988b extends C0752a {

        /* renamed from: b */
        int f3396b;

        public C0988b(int i, int i2) {
            super(i, i2);
            this.f3396b = 0;
            this.f2207a = 8388627;
        }

        public C0988b(int i, int i2, int i3) {
            super(i, i2);
            this.f3396b = 0;
            this.f2207a = i3;
        }

        public C0988b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3396b = 0;
        }

        public C0988b(C0752a aVar) {
            super(aVar);
            this.f3396b = 0;
        }

        public C0988b(C0988b bVar) {
            super((C0752a) bVar);
            this.f3396b = 0;
            this.f3396b = bVar.f3396b;
        }

        public C0988b(LayoutParams layoutParams) {
            super(layoutParams);
            this.f3396b = 0;
        }

        public C0988b(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f3396b = 0;
            mo4912a(marginLayoutParams);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4912a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$c */
    public interface C0989c {
        /* renamed from: a */
        boolean mo4913a(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3385x = 8388627;
        this.f3351E = new ArrayList<>();
        this.f3352F = new ArrayList<>();
        this.f3353G = new int[2];
        this.f3354H = new C0901e() {
            /* renamed from: a */
            public boolean mo3883a(MenuItem menuItem) {
                if (Toolbar.this.f3365d != null) {
                    return Toolbar.this.f3365d.mo4913a(menuItem);
                }
                return false;
            }
        };
        this.f3361O = new Runnable() {
            public void run() {
                Toolbar.this.mo4833d();
            }
        };
        C1078bk a = C1078bk.m5881a(getContext(), attributeSet, C0736j.Toolbar, i, 0);
        this.f3375n = a.mo5370g(C0736j.Toolbar_titleTextAppearance, 0);
        this.f3376o = a.mo5370g(C0736j.Toolbar_subtitleTextAppearance, 0);
        this.f3385x = a.mo5362c(C0736j.Toolbar_android_gravity, this.f3385x);
        this.f3364c = a.mo5362c(C0736j.Toolbar_buttonGravity, 48);
        int d = a.mo5364d(C0736j.Toolbar_titleMargin, 0);
        if (a.mo5371g(C0736j.Toolbar_titleMargins)) {
            d = a.mo5364d(C0736j.Toolbar_titleMargins, d);
        }
        this.f3381t = d;
        this.f3380s = d;
        this.f3379r = d;
        this.f3378q = d;
        int d2 = a.mo5364d(C0736j.Toolbar_titleMarginStart, -1);
        if (d2 >= 0) {
            this.f3378q = d2;
        }
        int d3 = a.mo5364d(C0736j.Toolbar_titleMarginEnd, -1);
        if (d3 >= 0) {
            this.f3379r = d3;
        }
        int d4 = a.mo5364d(C0736j.Toolbar_titleMarginTop, -1);
        if (d4 >= 0) {
            this.f3380s = d4;
        }
        int d5 = a.mo5364d(C0736j.Toolbar_titleMarginBottom, -1);
        if (d5 >= 0) {
            this.f3381t = d5;
        }
        this.f3377p = a.mo5366e(C0736j.Toolbar_maxButtonHeight, -1);
        int d6 = a.mo5364d(C0736j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d7 = a.mo5364d(C0736j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = a.mo5366e(C0736j.Toolbar_contentInsetLeft, 0);
        int e2 = a.mo5366e(C0736j.Toolbar_contentInsetRight, 0);
        m5341s();
        this.f3382u.mo5286b(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f3382u.mo5283a(d6, d7);
        }
        this.f3383v = a.mo5364d(C0736j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f3384w = a.mo5364d(C0736j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f3371j = a.mo5357a(C0736j.Toolbar_collapseIcon);
        this.f3372k = a.mo5363c(C0736j.Toolbar_collapseContentDescription);
        CharSequence c = a.mo5363c(C0736j.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        CharSequence c2 = a.mo5363c(C0736j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c2)) {
            setSubtitle(c2);
        }
        this.f3373l = getContext();
        setPopupTheme(a.mo5370g(C0736j.Toolbar_popupTheme, 0));
        Drawable a2 = a.mo5357a(C0736j.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        CharSequence c3 = a.mo5363c(C0736j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c3)) {
            setNavigationContentDescription(c3);
        }
        Drawable a3 = a.mo5357a(C0736j.Toolbar_logo);
        if (a3 != null) {
            setLogo(a3);
        }
        CharSequence c4 = a.mo5363c(C0736j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c4)) {
            setLogoDescription(c4);
        }
        if (a.mo5371g(C0736j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo5360b(C0736j.Toolbar_titleTextColor, -1));
        }
        if (a.mo5371g(C0736j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo5360b(C0736j.Toolbar_subtitleTextColor, -1));
        }
        a.mo5358a();
    }

    /* renamed from: a */
    private int m5321a(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f3385x & 112;
    }

    /* renamed from: a */
    private int m5322a(View view, int i) {
        C0988b bVar = (C0988b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int a = m5321a(bVar.f2207a);
        if (a == 48) {
            return getPaddingTop() - i2;
        }
        if (a == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < bVar.topMargin) {
            i3 = bVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < bVar.bottomMargin) {
                i3 = Math.max(0, i3 - (bVar.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m5323a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m5324a(View view, int i, int[] iArr, int i2) {
        C0988b bVar = (C0988b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m5322a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + bVar.rightMargin;
    }

    /* renamed from: a */
    private int m5325a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = (View) list.get(i4);
            C0988b bVar = (C0988b) view.getLayoutParams();
            int i6 = bVar.leftMargin - i;
            int i7 = bVar.rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = Math.max(0, -i7);
            i = max3;
        }
        return i5;
    }

    /* renamed from: a */
    private void m5326a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m5327a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        C0988b bVar = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0988b) layoutParams;
        bVar.f3396b = 1;
        if (!z || this.f3363b == null) {
            addView(view, bVar);
            return;
        }
        view.setLayoutParams(bVar);
        this.f3352F.add(view);
    }

    /* renamed from: a */
    private void m5328a(List<View> list, int i) {
        boolean z = C0626s.m2861e(this) == 1;
        int childCount = getChildCount();
        int a = C0604d.m2741a(i, C0626s.m2861e(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0988b bVar = (C0988b) childAt.getLayoutParams();
                if (bVar.f3396b == 0 && m5329a(childAt) && m5330b(bVar.f2207a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0988b bVar2 = (C0988b) childAt2.getLayoutParams();
            if (bVar2.f3396b == 0 && m5329a(childAt2) && m5330b(bVar2.f2207a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private boolean m5329a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private int m5330b(int i) {
        int e = C0626s.m2861e(this);
        int a = C0604d.m2741a(i, e) & 7;
        if (a != 1) {
            int i2 = 3;
            if (!(a == 3 || a == 5)) {
                if (e == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return a;
    }

    /* renamed from: b */
    private int m5331b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C0608f.m2747a(marginLayoutParams) + C0608f.m2748b(marginLayoutParams);
    }

    /* renamed from: b */
    private int m5332b(View view, int i, int[] iArr, int i2) {
        C0988b bVar = (C0988b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m5322a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + bVar.leftMargin);
    }

    /* renamed from: c */
    private int m5333c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: d */
    private boolean m5334d(View view) {
        return view.getParent() == this || this.f3352F.contains(view);
    }

    private MenuInflater getMenuInflater() {
        return new C0834g(getContext());
    }

    /* renamed from: m */
    private void m5335m() {
        if (this.f3370i == null) {
            this.f3370i = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: n */
    private void m5336n() {
        m5337o();
        if (this.f3366e.mo3859d() == null) {
            C0855h hVar = (C0855h) this.f3366e.getMenu();
            if (this.f3357K == null) {
                this.f3357K = new C0987a();
            }
            this.f3366e.setExpandedActionViewsExclusive(true);
            hVar.mo3487a((C0871o) this.f3357K, this.f3373l);
        }
    }

    /* renamed from: o */
    private void m5337o() {
        if (this.f3366e == null) {
            this.f3366e = new ActionMenuView(getContext());
            this.f3366e.setPopupTheme(this.f3374m);
            this.f3366e.setOnMenuItemClickListener(this.f3354H);
            this.f3366e.mo3851a(this.f3358L, this.f3359M);
            C0988b j = generateDefaultLayoutParams();
            j.f2207a = 8388613 | (this.f3364c & 112);
            this.f3366e.setLayoutParams(j);
            m5327a((View) this.f3366e, false);
        }
    }

    /* renamed from: p */
    private void m5338p() {
        if (this.f3369h == null) {
            this.f3369h = new AppCompatImageButton(getContext(), null, C0727a.toolbarNavigationButtonStyle);
            C0988b j = generateDefaultLayoutParams();
            j.f2207a = 8388611 | (this.f3364c & 112);
            this.f3369h.setLayoutParams(j);
        }
    }

    /* renamed from: q */
    private void m5339q() {
        removeCallbacks(this.f3361O);
        post(this.f3361O);
    }

    /* renamed from: r */
    private boolean m5340r() {
        if (!this.f3360N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m5329a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m5341s() {
        if (this.f3382u == null) {
            this.f3382u = new C1058az();
        }
    }

    /* renamed from: a */
    public C0988b generateLayoutParams(AttributeSet attributeSet) {
        return new C0988b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0988b generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0988b ? new C0988b((C0988b) layoutParams) : layoutParams instanceof C0752a ? new C0988b((C0752a) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0988b((MarginLayoutParams) layoutParams) : new C0988b(layoutParams);
    }

    /* renamed from: a */
    public void mo4824a(int i, int i2) {
        m5341s();
        this.f3382u.mo5283a(i, i2);
    }

    /* renamed from: a */
    public void mo4825a(Context context, int i) {
        this.f3375n = i;
        if (this.f3367f != null) {
            this.f3367f.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo4826a(C0855h hVar, ActionMenuPresenter actionMenuPresenter) {
        if (hVar != null || this.f3366e != null) {
            m5337o();
            C0855h d = this.f3366e.mo3859d();
            if (d != hVar) {
                if (d != null) {
                    d.mo3504b((C0871o) this.f3356J);
                    d.mo3504b((C0871o) this.f3357K);
                }
                if (this.f3357K == null) {
                    this.f3357K = new C0987a();
                }
                actionMenuPresenter.mo3831d(true);
                if (hVar != null) {
                    hVar.mo3487a((C0871o) actionMenuPresenter, this.f3373l);
                    hVar.mo3487a((C0871o) this.f3357K, this.f3373l);
                } else {
                    actionMenuPresenter.mo316a(this.f3373l, (C0855h) null);
                    this.f3357K.mo316a(this.f3373l, (C0855h) null);
                    actionMenuPresenter.mo325a(true);
                    this.f3357K.mo325a(true);
                }
                this.f3366e.setPopupTheme(this.f3374m);
                this.f3366e.setPresenter(actionMenuPresenter);
                this.f3356J = actionMenuPresenter;
            }
        }
    }

    /* renamed from: a */
    public void mo4827a(C0872a aVar, C0856a aVar2) {
        this.f3358L = aVar;
        this.f3359M = aVar2;
        if (this.f3366e != null) {
            this.f3366e.mo3851a(aVar, aVar2);
        }
    }

    /* renamed from: a */
    public boolean mo4828a() {
        return getVisibility() == 0 && this.f3366e != null && this.f3366e.mo3852a();
    }

    /* renamed from: b */
    public void mo4829b(Context context, int i) {
        this.f3376o = i;
        if (this.f3368g != null) {
            this.f3368g.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean mo4830b() {
        return this.f3366e != null && this.f3366e.mo3863g();
    }

    /* renamed from: c */
    public boolean mo4831c() {
        return this.f3366e != null && this.f3366e.mo3871h();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0988b);
    }

    /* renamed from: d */
    public boolean mo4833d() {
        return this.f3366e != null && this.f3366e.mo3861e();
    }

    /* renamed from: e */
    public boolean mo4834e() {
        return this.f3366e != null && this.f3366e.mo3862f();
    }

    /* renamed from: f */
    public void mo4835f() {
        if (this.f3366e != null) {
            this.f3366e.mo3872i();
        }
    }

    /* renamed from: g */
    public boolean mo4836g() {
        return (this.f3357K == null || this.f3357K.f3394b == null) ? false : true;
    }

    public int getContentInsetEnd() {
        if (this.f3382u != null) {
            return this.f3382u.mo5288d();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        return this.f3384w != Integer.MIN_VALUE ? this.f3384w : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        if (this.f3382u != null) {
            return this.f3382u.mo5282a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.f3382u != null) {
            return this.f3382u.mo5285b();
        }
        return 0;
    }

    public int getContentInsetStart() {
        if (this.f3382u != null) {
            return this.f3382u.mo5287c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.f3383v != Integer.MIN_VALUE ? this.f3383v : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            android.support.v7.widget.ActionMenuView r0 = r3.f3366e
            r1 = 0
            if (r0 == 0) goto L_0x0015
            android.support.v7.widget.ActionMenuView r0 = r3.f3366e
            android.support.v7.view.menu.h r0 = r0.mo3859d()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0027
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f3384w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x002b
        L_0x0027:
            int r0 = r3.getContentInsetEnd()
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C0626s.m2861e(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0626s.m2861e(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3383v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        if (this.f3370i != null) {
            return this.f3370i.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        if (this.f3370i != null) {
            return this.f3370i.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m5336n();
        return this.f3366e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        if (this.f3369h != null) {
            return this.f3369h.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        if (this.f3369h != null) {
            return this.f3369h.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f3356J;
    }

    public Drawable getOverflowIcon() {
        m5336n();
        return this.f3366e.getOverflowIcon();
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.f3373l;
    }

    public int getPopupTheme() {
        return this.f3374m;
    }

    public CharSequence getSubtitle() {
        return this.f3387z;
    }

    public CharSequence getTitle() {
        return this.f3386y;
    }

    public int getTitleMarginBottom() {
        return this.f3381t;
    }

    public int getTitleMarginEnd() {
        return this.f3379r;
    }

    public int getTitleMarginStart() {
        return this.f3378q;
    }

    public int getTitleMarginTop() {
        return this.f3380s;
    }

    public C0999ae getWrapper() {
        if (this.f3355I == null) {
            this.f3355I = new C1079bl(this, true);
        }
        return this.f3355I;
    }

    /* renamed from: h */
    public void mo4866h() {
        C0859j jVar = this.f3357K == null ? null : this.f3357K.f3394b;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo4867i() {
        if (this.f3362a == null) {
            this.f3362a = new AppCompatImageButton(getContext(), null, C0727a.toolbarNavigationButtonStyle);
            this.f3362a.setImageDrawable(this.f3371j);
            this.f3362a.setContentDescription(this.f3372k);
            C0988b j = generateDefaultLayoutParams();
            j.f2207a = 8388611 | (this.f3364c & 112);
            j.f3396b = 2;
            this.f3362a.setLayoutParams(j);
            this.f3362a.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    Toolbar.this.mo4866h();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0988b generateDefaultLayoutParams() {
        return new C0988b(-2, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo4869k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0988b) childAt.getLayoutParams()).f3396b == 2 || childAt == this.f3366e)) {
                removeViewAt(childCount);
                this.f3352F.add(childAt);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4870l() {
        for (int size = this.f3352F.size() - 1; size >= 0; size--) {
            addView((View) this.f3352F.get(size));
        }
        this.f3352F.clear();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3361O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3350D = false;
        }
        if (!this.f3350D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3350D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3350D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02aa A[LOOP:0: B:101:0x02a8->B:102:0x02aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02cc A[LOOP:1: B:104:0x02ca->B:105:0x02cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0306 A[LOOP:2: B:112:0x0304->B:113:0x0306, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            r24 = this;
            r0 = r24
            int r1 = android.support.p009v4.view.C0626s.m2861e(r24)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r24.getWidth()
            int r5 = r24.getHeight()
            int r6 = r24.getPaddingLeft()
            int r7 = r24.getPaddingRight()
            int r8 = r24.getPaddingTop()
            int r9 = r24.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f3353G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = android.support.p009v4.view.C0626s.m2867j(r24)
            if (r12 < 0) goto L_0x003a
            int r13 = r29 - r27
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f3369h
            boolean r13 = r0.m5329a(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004d
            android.widget.ImageButton r13 = r0.f3369h
            int r13 = r0.m5332b(r13, r10, r11, r12)
            r14 = r6
            goto L_0x0057
        L_0x004d:
            android.widget.ImageButton r13 = r0.f3369h
            int r13 = r0.m5324a(r13, r6, r11, r12)
            r14 = r13
            goto L_0x0056
        L_0x0055:
            r14 = r6
        L_0x0056:
            r13 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f3362a
            boolean r15 = r0.m5329a(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f3362a
            int r13 = r0.m5332b(r15, r13, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f3362a
            int r14 = r0.m5324a(r15, r14, r11, r12)
        L_0x006e:
            android.support.v7.widget.ActionMenuView r15 = r0.f3366e
            boolean r15 = r0.m5329a(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            android.support.v7.widget.ActionMenuView r15 = r0.f3366e
            int r14 = r0.m5324a(r15, r14, r11, r12)
            goto L_0x0085
        L_0x007f:
            android.support.v7.widget.ActionMenuView r15 = r0.f3366e
            int r13 = r0.m5332b(r15, r13, r11, r12)
        L_0x0085:
            int r15 = r24.getCurrentContentInsetLeft()
            int r16 = r24.getCurrentContentInsetRight()
            int r2 = r15 - r14
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r13
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r14, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r13, r10)
            android.view.View r13 = r0.f3363b
            boolean r13 = r0.m5329a(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f3363b
            int r10 = r0.m5332b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f3363b
            int r2 = r0.m5324a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f3370i
            boolean r13 = r0.m5329a(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f3370i
            int r10 = r0.m5332b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f3370i
            int r2 = r0.m5324a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f3367f
            boolean r13 = r0.m5329a(r13)
            android.widget.TextView r14 = r0.f3368g
            boolean r14 = r0.m5329a(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f3367f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            android.support.v7.widget.Toolbar$b r15 = (android.support.p023v7.widget.Toolbar.C0988b) r15
            int r3 = r15.topMargin
            r19 = r7
            android.widget.TextView r7 = r0.f3367f
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r19 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f3368g
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$b r7 = (android.support.p023v7.widget.Toolbar.C0988b) r7
            int r15 = r7.topMargin
            r20 = r4
            android.widget.TextView r4 = r0.f3368g
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r20 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r21 = r6
            r22 = r12
        L_0x0128:
            r7 = 0
            goto L_0x029a
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f3367f
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f3368g
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f3368g
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f3367f
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.Toolbar$b r4 = (android.support.p023v7.widget.Toolbar.C0988b) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$b r7 = (android.support.p023v7.widget.Toolbar.C0988b) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f3367f
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.f3368g
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r21 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r21 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f3385x
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a9
            r12 = 80
            if (r6 == r12) goto L_0x019d
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r2
            int r2 = r0.f3380s
            int r12 = r12 + r2
            if (r6 >= r12) goto L_0x0184
            int r2 = r4.topMargin
            int r3 = r0.f3380s
            int r6 = r2 + r3
            goto L_0x019b
        L_0x0184:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f3381t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x019b
            int r2 = r7.bottomMargin
            int r3 = r0.f3381t
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x019b:
            int r8 = r8 + r6
            goto L_0x01b6
        L_0x019d:
            r23 = r2
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f3381t
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b6
        L_0x01a9:
            r23 = r2
            int r2 = r24.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f3380s
            int r8 = r2 + r3
        L_0x01b6:
            if (r1 == 0) goto L_0x022b
            if (r15 == 0) goto L_0x01be
            int r3 = r0.f3378q
            r1 = 1
            goto L_0x01c0
        L_0x01be:
            r1 = 1
            r3 = 0
        L_0x01c0:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01f6
            android.widget.TextView r1 = r0.f3367f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p023v7.widget.Toolbar.C0988b) r1
            android.widget.TextView r2 = r0.f3367f
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f3367f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f3367f
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f3379r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f7
        L_0x01f6:
            r2 = r10
        L_0x01f7:
            if (r14 == 0) goto L_0x021f
            android.widget.TextView r1 = r0.f3368g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p023v7.widget.Toolbar.C0988b) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f3368g
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f3368g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f3368g
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f3379r
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0220
        L_0x021f:
            r3 = r10
        L_0x0220:
            if (r15 == 0) goto L_0x0227
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0227:
            r2 = r23
            goto L_0x0128
        L_0x022b:
            if (r15 == 0) goto L_0x0233
            int r3 = r0.f3378q
            r18 = r3
            r7 = 0
            goto L_0x0236
        L_0x0233:
            r7 = 0
            r18 = 0
        L_0x0236:
            r1 = r11[r7]
            int r1 = r18 - r1
            int r2 = java.lang.Math.max(r7, r1)
            int r2 = r23 + r2
            int r1 = -r1
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x026c
            android.widget.TextView r1 = r0.f3367f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p023v7.widget.Toolbar.C0988b) r1
            android.widget.TextView r3 = r0.f3367f
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f3367f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f3367f
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f3379r
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x026d
        L_0x026c:
            r3 = r2
        L_0x026d:
            if (r14 == 0) goto L_0x0293
            android.widget.TextView r1 = r0.f3368g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p023v7.widget.Toolbar.C0988b) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f3368g
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f3368g
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f3368g
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.f3379r
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0294
        L_0x0293:
            r4 = r2
        L_0x0294:
            if (r15 == 0) goto L_0x029a
            int r2 = java.lang.Math.max(r3, r4)
        L_0x029a:
            java.util.ArrayList<android.view.View> r1 = r0.f3351E
            r3 = 3
            r0.m5328a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f3351E
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x02a8:
            if (r2 >= r1) goto L_0x02bb
            java.util.ArrayList<android.view.View> r4 = r0.f3351E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m5324a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02a8
        L_0x02bb:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f3351E
            r2 = 5
            r0.m5328a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f3351E
            int r1 = r1.size()
            r2 = 0
        L_0x02ca:
            if (r2 >= r1) goto L_0x02db
            java.util.ArrayList<android.view.View> r4 = r0.f3351E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m5332b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02ca
        L_0x02db:
            java.util.ArrayList<android.view.View> r1 = r0.f3351E
            r2 = 1
            r0.m5328a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f3351E
            int r1 = r0.m5325a(r1, r11)
            int r4 = r20 - r21
            int r4 = r4 - r19
            int r4 = r4 / 2
            int r6 = r21 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02f7
            goto L_0x02fe
        L_0x02f7:
            if (r1 <= r10) goto L_0x02fd
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02fe
        L_0x02fd:
            r3 = r2
        L_0x02fe:
            java.util.ArrayList<android.view.View> r1 = r0.f3351E
            int r1 = r1.size()
        L_0x0304:
            if (r7 >= r1) goto L_0x0315
            java.util.ArrayList<android.view.View> r2 = r0.f3351E
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m5324a(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x0304
        L_0x0315:
            java.util.ArrayList<android.view.View> r1 = r0.f3351E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f3353G;
        if (C1094bs.m6004a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m5329a((View) this.f3369h)) {
            m5326a((View) this.f3369h, i, 0, i2, 0, this.f3377p);
            i5 = this.f3369h.getMeasuredWidth() + m5331b((View) this.f3369h);
            i4 = Math.max(0, this.f3369h.getMeasuredHeight() + m5333c(this.f3369h));
            i3 = View.combineMeasuredStates(0, this.f3369h.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m5329a((View) this.f3362a)) {
            m5326a((View) this.f3362a, i, 0, i2, 0, this.f3377p);
            i5 = this.f3362a.getMeasuredWidth() + m5331b((View) this.f3362a);
            i4 = Math.max(i4, this.f3362a.getMeasuredHeight() + m5333c(this.f3362a));
            i3 = View.combineMeasuredStates(i3, this.f3362a.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5) + 0;
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m5329a((View) this.f3366e)) {
            m5326a((View) this.f3366e, i, max, i2, 0, this.f3377p);
            i6 = this.f3366e.getMeasuredWidth() + m5331b((View) this.f3366e);
            i4 = Math.max(i4, this.f3366e.getMeasuredHeight() + m5333c(this.f3366e));
            i3 = View.combineMeasuredStates(i3, this.f3366e.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m5329a(this.f3363b)) {
            max2 += m5323a(this.f3363b, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f3363b.getMeasuredHeight() + m5333c(this.f3363b));
            i3 = View.combineMeasuredStates(i3, this.f3363b.getMeasuredState());
        }
        if (m5329a((View) this.f3370i)) {
            max2 += m5323a((View) this.f3370i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f3370i.getMeasuredHeight() + m5333c(this.f3370i));
            i3 = View.combineMeasuredStates(i3, this.f3370i.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0988b) childAt.getLayoutParams()).f3396b == 0 && m5329a(childAt)) {
                i11 += m5323a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m5333c(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f3380s + this.f3381t;
        int i14 = this.f3378q + this.f3379r;
        if (m5329a((View) this.f3367f)) {
            m5323a((View) this.f3367f, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f3367f.getMeasuredWidth() + m5331b((View) this.f3367f);
            i7 = this.f3367f.getMeasuredHeight() + m5333c(this.f3367f);
            i9 = View.combineMeasuredStates(i3, this.f3367f.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m5329a((View) this.f3368g)) {
            int i15 = i7 + i13;
            int i16 = i9;
            i8 = Math.max(i8, m5323a((View) this.f3368g, i, i11 + i14, i2, i15, iArr));
            i7 += this.f3368g.getMeasuredHeight() + m5333c(this.f3368g);
            i9 = View.combineMeasuredStates(i16, this.f3368g.getMeasuredState());
        } else {
            int i17 = i9;
        }
        int i18 = i11 + i8;
        int max3 = Math.max(i10, i7) + getPaddingTop() + getPaddingBottom();
        int i19 = i;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i19, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m5340r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2234a());
        C0855h d = this.f3366e != null ? this.f3366e.mo3859d() : null;
        if (!(savedState.f3391a == 0 || this.f3357K == null || d == null)) {
            MenuItem findItem = d.findItem(savedState.f3391a);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (savedState.f3392b) {
            m5339q();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m5341s();
        C1058az azVar = this.f3382u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        azVar.mo5284a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (!(this.f3357K == null || this.f3357K.f3394b == null)) {
            savedState.f3391a = this.f3357K.f3394b.getItemId();
        }
        savedState.f3392b = mo4830b();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3349C = false;
        }
        if (!this.f3349C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3349C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3349C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f3360N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3384w) {
            this.f3384w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3383v) {
            this.f3383v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0817b.m3884b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m5335m();
            if (!m5334d(this.f3370i)) {
                m5327a((View) this.f3370i, true);
            }
        } else if (this.f3370i != null && m5334d(this.f3370i)) {
            removeView(this.f3370i);
            this.f3352F.remove(this.f3370i);
        }
        if (this.f3370i != null) {
            this.f3370i.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m5335m();
        }
        if (this.f3370i != null) {
            this.f3370i.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m5338p();
        }
        if (this.f3369h != null) {
            this.f3369h.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0817b.m3884b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m5338p();
            if (!m5334d(this.f3369h)) {
                m5327a((View) this.f3369h, true);
            }
        } else if (this.f3369h != null && m5334d(this.f3369h)) {
            removeView(this.f3369h);
            this.f3352F.remove(this.f3369h);
        }
        if (this.f3369h != null) {
            this.f3369h.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m5338p();
        this.f3369h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0989c cVar) {
        this.f3365d = cVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m5336n();
        this.f3366e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f3374m != i) {
            this.f3374m = i;
            if (i == 0) {
                this.f3373l = getContext();
            } else {
                this.f3373l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3368g == null) {
                Context context = getContext();
                this.f3368g = new C1127v(context);
                this.f3368g.setSingleLine();
                this.f3368g.setEllipsize(TruncateAt.END);
                if (this.f3376o != 0) {
                    this.f3368g.setTextAppearance(context, this.f3376o);
                }
                if (this.f3348B != 0) {
                    this.f3368g.setTextColor(this.f3348B);
                }
            }
            if (!m5334d(this.f3368g)) {
                m5327a((View) this.f3368g, true);
            }
        } else if (this.f3368g != null && m5334d(this.f3368g)) {
            removeView(this.f3368g);
            this.f3352F.remove(this.f3368g);
        }
        if (this.f3368g != null) {
            this.f3368g.setText(charSequence);
        }
        this.f3387z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f3348B = i;
        if (this.f3368g != null) {
            this.f3368g.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3367f == null) {
                Context context = getContext();
                this.f3367f = new C1127v(context);
                this.f3367f.setSingleLine();
                this.f3367f.setEllipsize(TruncateAt.END);
                if (this.f3375n != 0) {
                    this.f3367f.setTextAppearance(context, this.f3375n);
                }
                if (this.f3347A != 0) {
                    this.f3367f.setTextColor(this.f3347A);
                }
            }
            if (!m5334d(this.f3367f)) {
                m5327a((View) this.f3367f, true);
            }
        } else if (this.f3367f != null && m5334d(this.f3367f)) {
            removeView(this.f3367f);
            this.f3352F.remove(this.f3367f);
        }
        if (this.f3367f != null) {
            this.f3367f.setText(charSequence);
        }
        this.f3386y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f3381t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f3379r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f3378q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f3380s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f3347A = i;
        if (this.f3367f != null) {
            this.f3367f.setTextColor(i);
        }
    }
}
