package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.C0592b;
import android.support.p009v4.view.C0592b.C0593a;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.view.C0826a;
import android.support.p023v7.view.menu.ActionMenuItemView;
import android.support.p023v7.view.menu.ActionMenuItemView.C0841b;
import android.support.p023v7.view.menu.C0843b;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0859j;
import android.support.p023v7.view.menu.C0869n;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.view.menu.C0873p;
import android.support.p023v7.view.menu.C0873p.C0874a;
import android.support.p023v7.view.menu.C0877s;
import android.support.p023v7.view.menu.C0881u;
import android.support.p023v7.widget.ActionMenuView.C0897a;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.ActionMenuPresenter */
class ActionMenuPresenter extends C0843b implements C0593a {

    /* renamed from: A */
    private C0891b f2792A;

    /* renamed from: g */
    C0893d f2793g;

    /* renamed from: h */
    C0895e f2794h;

    /* renamed from: i */
    C0890a f2795i;

    /* renamed from: j */
    C0892c f2796j;

    /* renamed from: k */
    final C0896f f2797k = new C0896f();

    /* renamed from: l */
    int f2798l;

    /* renamed from: m */
    private Drawable f2799m;

    /* renamed from: n */
    private boolean f2800n;

    /* renamed from: o */
    private boolean f2801o;

    /* renamed from: p */
    private boolean f2802p;

    /* renamed from: q */
    private int f2803q;

    /* renamed from: r */
    private int f2804r;

    /* renamed from: s */
    private int f2805s;

    /* renamed from: t */
    private boolean f2806t;

    /* renamed from: u */
    private boolean f2807u;

    /* renamed from: v */
    private boolean f2808v;

    /* renamed from: w */
    private boolean f2809w;

    /* renamed from: x */
    private int f2810x;

    /* renamed from: y */
    private final SparseBooleanArray f2811y = new SparseBooleanArray();

    /* renamed from: z */
    private View f2812z;

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$SavedState */
    private static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        public int f2813a;

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f2813a = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2813a);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$a */
    private class C0890a extends C0869n {
        public C0890a(Context context, C0881u uVar, View view) {
            super(context, uVar, view, false, C0727a.actionOverflowMenuStyle);
            if (!((C0859j) uVar.getItem()).mo3588j()) {
                mo3679a(ActionMenuPresenter.this.f2793g == null ? (View) ActionMenuPresenter.this.f2562f : ActionMenuPresenter.this.f2793g);
            }
            mo3678a((C0872a) ActionMenuPresenter.this.f2797k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo3686e() {
            ActionMenuPresenter.this.f2795i = null;
            ActionMenuPresenter.this.f2798l = 0;
            super.mo3686e();
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$b */
    private class C0891b extends C0841b {
        C0891b() {
        }

        /* renamed from: a */
        public C0877s mo3367a() {
            if (ActionMenuPresenter.this.f2795i != null) {
                return ActionMenuPresenter.this.f2795i.mo3683b();
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$c */
    private class C0892c implements Runnable {

        /* renamed from: b */
        private C0895e f2817b;

        public C0892c(C0895e eVar) {
            this.f2817b = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f2559c != null) {
                ActionMenuPresenter.this.f2559c.mo3521f();
            }
            View view = (View) ActionMenuPresenter.this.f2562f;
            if (!(view == null || view.getWindowToken() == null || !this.f2817b.mo3684c())) {
                ActionMenuPresenter.this.f2794h = this.f2817b;
            }
            ActionMenuPresenter.this.f2796j = null;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$d */
    private class C0893d extends AppCompatImageView implements C0897a {

        /* renamed from: b */
        private final float[] f2819b = new float[2];

        public C0893d(Context context) {
            super(context, null, C0727a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C1082bm.m5951a(this, getContentDescription());
            setOnTouchListener(new C1023ak(this, ActionMenuPresenter.this) {
                /* renamed from: a */
                public C0877s mo3365a() {
                    if (ActionMenuPresenter.this.f2794h == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.f2794h.mo3683b();
                }

                /* renamed from: b */
                public boolean mo3366b() {
                    ActionMenuPresenter.this.mo3833f();
                    return true;
                }

                /* renamed from: c */
                public boolean mo3848c() {
                    if (ActionMenuPresenter.this.f2796j != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.mo3834g();
                    return true;
                }
            });
        }

        /* renamed from: c */
        public boolean mo3350c() {
            return false;
        }

        /* renamed from: d */
        public boolean mo3351d() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo3833f();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0311a.m1174a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$e */
    private class C0895e extends C0869n {
        public C0895e(Context context, C0855h hVar, View view, boolean z) {
            super(context, hVar, view, z, C0727a.actionOverflowMenuStyle);
            mo3677a(8388613);
            mo3678a((C0872a) ActionMenuPresenter.this.f2797k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo3686e() {
            if (ActionMenuPresenter.this.f2559c != null) {
                ActionMenuPresenter.this.f2559c.close();
            }
            ActionMenuPresenter.this.f2794h = null;
            super.mo3686e();
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$f */
    private class C0896f implements C0872a {
        C0896f() {
        }

        /* renamed from: a */
        public void mo3176a(C0855h hVar, boolean z) {
            if (hVar instanceof C0881u) {
                hVar.mo3535p().mo3505b(false);
            }
            C0872a d = ActionMenuPresenter.this.mo3426d();
            if (d != null) {
                d.mo3176a(hVar, z);
            }
        }

        /* renamed from: a */
        public boolean mo3177a(C0855h hVar) {
            boolean z = false;
            if (hVar == null) {
                return false;
            }
            ActionMenuPresenter.this.f2798l = ((C0881u) hVar).getItem().getItemId();
            C0872a d = ActionMenuPresenter.this.mo3426d();
            if (d != null) {
                z = d.mo3177a(hVar);
            }
            return z;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0733g.abc_action_menu_layout, C0733g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    private View m4319a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2562f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0874a) && ((C0874a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0873p mo3418a(ViewGroup viewGroup) {
        C0873p pVar = this.f2562f;
        C0873p a = super.mo3418a(viewGroup);
        if (pVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    /* renamed from: a */
    public View mo3419a(C0859j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo3592n()) {
            actionView = super.mo3419a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo316a(Context context, C0855h hVar) {
        super.mo316a(context, hVar);
        Resources resources = context.getResources();
        C0826a a = C0826a.m3900a(context);
        if (!this.f2802p) {
            this.f2801o = a.mo3279b();
        }
        if (!this.f2808v) {
            this.f2803q = a.mo3280c();
        }
        if (!this.f2806t) {
            this.f2805s = a.mo3278a();
        }
        int i = this.f2803q;
        if (this.f2801o) {
            if (this.f2793g == null) {
                this.f2793g = new C0893d(this.f2557a);
                if (this.f2800n) {
                    this.f2793g.setImageDrawable(this.f2799m);
                    this.f2799m = null;
                    this.f2800n = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f2793g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f2793g.getMeasuredWidth();
        } else {
            this.f2793g = null;
        }
        this.f2804r = i;
        this.f2810x = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f2812z = null;
    }

    /* renamed from: a */
    public void mo3827a(Configuration configuration) {
        if (!this.f2806t) {
            this.f2805s = C0826a.m3900a(this.f2558b).mo3278a();
        }
        if (this.f2559c != null) {
            this.f2559c.mo359a(true);
        }
    }

    /* renamed from: a */
    public void mo3828a(Drawable drawable) {
        if (this.f2793g != null) {
            this.f2793g.setImageDrawable(drawable);
            return;
        }
        this.f2800n = true;
        this.f2799m = drawable;
    }

    /* renamed from: a */
    public void mo319a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.f2813a > 0) {
                MenuItem findItem = this.f2559c.findItem(savedState.f2813a);
                if (findItem != null) {
                    mo328a((C0881u) findItem.getSubMenu());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo321a(C0855h hVar, boolean z) {
        mo3835h();
        super.mo321a(hVar, z);
    }

    /* renamed from: a */
    public void mo3421a(C0859j jVar, C0874a aVar) {
        aVar.mo273a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2562f);
        if (this.f2792A == null) {
            this.f2792A = new C0891b();
        }
        actionMenuItemView.setPopupCallback(this.f2792A);
    }

    /* renamed from: a */
    public void mo3829a(ActionMenuView actionMenuView) {
        this.f2562f = actionMenuView;
        actionMenuView.mo286a(this.f2559c);
    }

    /* renamed from: a */
    public void mo325a(boolean z) {
        super.mo325a(z);
        ((View) this.f2562f).requestLayout();
        boolean z2 = false;
        if (this.f2559c != null) {
            ArrayList k = this.f2559c.mo3530k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                C0592b a = ((C0859j) k.get(i)).mo1745a();
                if (a != null) {
                    a.mo2425a((C0593a) this);
                }
            }
        }
        ArrayList l = this.f2559c != null ? this.f2559c.mo3531l() : null;
        if (this.f2801o && l != null) {
            int size2 = l.size();
            if (size2 == 1) {
                z2 = !((C0859j) l.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2793g == null) {
                this.f2793g = new C0893d(this.f2557a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2793g.getParent();
            if (viewGroup != this.f2562f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2793g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2562f;
                actionMenuView.addView(this.f2793g, actionMenuView.mo3857c());
            }
        } else if (this.f2793g != null && this.f2793g.getParent() == this.f2562f) {
            ((ViewGroup) this.f2562f).removeView(this.f2793g);
        }
        ((ActionMenuView) this.f2562f).setOverflowReserved(this.f2801o);
    }

    /* renamed from: a */
    public boolean mo326a() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        int i5 = 0;
        if (actionMenuPresenter.f2559c != null) {
            arrayList = actionMenuPresenter.f2559c.mo3527i();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f2805s;
        int i7 = actionMenuPresenter.f2804r;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f2562f;
        int i8 = i6;
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            C0859j jVar = (C0859j) arrayList.get(i11);
            if (jVar.mo3590l()) {
                i9++;
            } else if (jVar.mo3589k()) {
                i10++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.f2809w && jVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (actionMenuPresenter.f2801o && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f2811y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f2807u) {
            i3 = i7 / actionMenuPresenter.f2810x;
            i2 = ((i7 % actionMenuPresenter.f2810x) / i3) + actionMenuPresenter.f2810x;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = i7;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i) {
            C0859j jVar2 = (C0859j) arrayList.get(i14);
            if (jVar2.mo3590l()) {
                View a = actionMenuPresenter.mo3419a(jVar2, actionMenuPresenter.f2812z, viewGroup);
                if (actionMenuPresenter.f2812z == null) {
                    actionMenuPresenter.f2812z = a;
                }
                if (actionMenuPresenter.f2807u) {
                    i3 -= ActionMenuView.m4362a(a, i2, i3, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i15 != 0) {
                    measuredWidth = i15;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                jVar2.mo3564d(z);
                i4 = i;
                i15 = measuredWidth;
            } else if (jVar2.mo3589k()) {
                int groupId2 = jVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i13 > 0 && (!actionMenuPresenter.f2807u || i3 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View a2 = actionMenuPresenter.mo3419a(jVar2, actionMenuPresenter.f2812z, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.f2812z == null) {
                        actionMenuPresenter.f2812z = a2;
                    }
                    if (actionMenuPresenter.f2807u) {
                        int a3 = ActionMenuView.m4362a(a2, i2, i3, makeMeasureSpec, 0);
                        i3 -= a3;
                        if (a3 == 0) {
                            z5 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z4 = z5 & (!actionMenuPresenter.f2807u ? i13 + i15 > 0 : i13 >= 0);
                } else {
                    boolean z6 = z4;
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i16 = 0;
                    while (i16 < i14) {
                        C0859j jVar3 = (C0859j) arrayList.get(i16);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.mo3588j()) {
                                i12++;
                            }
                            jVar3.mo3564d(false);
                        }
                        i16++;
                    }
                }
                if (z4) {
                    i12--;
                }
                jVar2.mo3564d(z4);
            } else {
                i4 = i;
                jVar2.mo3564d(false);
                i14++;
                i = i4;
                actionMenuPresenter = this;
                i5 = 0;
            }
            i14++;
            i = i4;
            actionMenuPresenter = this;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo3423a(int i, C0859j jVar) {
        return jVar.mo3588j();
    }

    /* renamed from: a */
    public boolean mo328a(C0881u uVar) {
        boolean z = false;
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        C0881u uVar2 = uVar;
        while (uVar2.mo3719s() != this.f2559c) {
            uVar2 = (C0881u) uVar2.mo3719s();
        }
        View a = m4319a(uVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f2798l = uVar.getItem().getItemId();
        int size = uVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = uVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f2795i = new C0890a(this.f2558b, uVar, a);
        this.f2795i.mo3681a(z);
        this.f2795i.mo3676a();
        super.mo328a(uVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo3424a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f2793g) {
            return false;
        }
        return super.mo3424a(viewGroup, i);
    }

    /* renamed from: b */
    public void mo2434b(boolean z) {
        if (z) {
            super.mo328a((C0881u) null);
        } else if (this.f2559c != null) {
            this.f2559c.mo3505b(false);
        }
    }

    /* renamed from: c */
    public Parcelable mo334c() {
        SavedState savedState = new SavedState();
        savedState.f2813a = this.f2798l;
        return savedState;
    }

    /* renamed from: c */
    public void mo3830c(boolean z) {
        this.f2801o = z;
        this.f2802p = true;
    }

    /* renamed from: d */
    public void mo3831d(boolean z) {
        this.f2809w = z;
    }

    /* renamed from: e */
    public Drawable mo3832e() {
        if (this.f2793g != null) {
            return this.f2793g.getDrawable();
        }
        if (this.f2800n) {
            return this.f2799m;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo3833f() {
        if (!this.f2801o || mo3837j() || this.f2559c == null || this.f2562f == null || this.f2796j != null || this.f2559c.mo3531l().isEmpty()) {
            return false;
        }
        C0895e eVar = new C0895e(this.f2558b, this.f2559c, this.f2793g, true);
        this.f2796j = new C0892c(eVar);
        ((View) this.f2562f).post(this.f2796j);
        super.mo328a((C0881u) null);
        return true;
    }

    /* renamed from: g */
    public boolean mo3834g() {
        if (this.f2796j == null || this.f2562f == null) {
            C0895e eVar = this.f2794h;
            if (eVar == null) {
                return false;
            }
            eVar.mo3685d();
            return true;
        }
        ((View) this.f2562f).removeCallbacks(this.f2796j);
        this.f2796j = null;
        return true;
    }

    /* renamed from: h */
    public boolean mo3835h() {
        return mo3834g() | mo3836i();
    }

    /* renamed from: i */
    public boolean mo3836i() {
        if (this.f2795i == null) {
            return false;
        }
        this.f2795i.mo3685d();
        return true;
    }

    /* renamed from: j */
    public boolean mo3837j() {
        return this.f2794h != null && this.f2794h.mo3687f();
    }

    /* renamed from: k */
    public boolean mo3838k() {
        return this.f2796j != null || mo3837j();
    }
}
