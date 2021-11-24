package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.design.C0087a.C0091d;
import android.support.design.C0087a.C0092e;
import android.support.design.C0087a.C0093f;
import android.support.design.C0087a.C0095h;
import android.support.p009v4.content.p015a.C0447b;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.C0577a;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.p021a.C0583b;
import android.support.p009v4.widget.C0711p;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.view.menu.C0859j;
import android.support.p023v7.view.menu.C0873p.C0874a;
import android.support.p023v7.widget.C1031an.C1032a;
import android.support.p023v7.widget.C1082bm;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView extends C0101a implements C0874a {

    /* renamed from: d */
    private static final int[] f206d = {16842912};

    /* renamed from: c */
    boolean f207c;

    /* renamed from: e */
    private final int f208e;

    /* renamed from: f */
    private boolean f209f;

    /* renamed from: g */
    private final CheckedTextView f210g;

    /* renamed from: h */
    private FrameLayout f211h;

    /* renamed from: i */
    private C0859j f212i;

    /* renamed from: j */
    private ColorStateList f213j;

    /* renamed from: k */
    private boolean f214k;

    /* renamed from: l */
    private Drawable f215l;

    /* renamed from: m */
    private final C0577a f216m;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f216m = new C0577a() {
            /* renamed from: a */
            public void mo285a(View view, C0583b bVar) {
                super.mo285a(view, bVar);
                bVar.mo2356a(NavigationMenuItemView.this.f207c);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0095h.design_navigation_menu_item, this, true);
        this.f208e = context.getResources().getDimensionPixelSize(C0091d.design_navigation_icon_size);
        this.f210g = (CheckedTextView) findViewById(C0093f.design_menu_item_text);
        this.f210g.setDuplicateParentStateEnabled(true);
        C0626s.m2844a((View) this.f210g, this.f216m);
    }

    /* renamed from: c */
    private boolean m254c() {
        return this.f212i.getTitle() == null && this.f212i.getIcon() == null && this.f212i.getActionView() != null;
    }

    /* renamed from: d */
    private void m255d() {
        C1032a aVar;
        int i;
        if (m254c()) {
            this.f210g.setVisibility(8);
            if (this.f211h != null) {
                aVar = (C1032a) this.f211h.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.f210g.setVisibility(0);
            if (this.f211h != null) {
                aVar = (C1032a) this.f211h.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        aVar.width = i;
        this.f211h.setLayoutParams(aVar);
    }

    /* renamed from: e */
    private StateListDrawable m256e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0727a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f206d, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f211h == null) {
                this.f211h = (FrameLayout) ((ViewStub) findViewById(C0093f.design_menu_item_action_area_stub)).inflate();
            }
            this.f211h.removeAllViews();
            this.f211h.addView(view);
        }
    }

    /* renamed from: a */
    public void mo272a() {
        if (this.f211h != null) {
            this.f211h.removeAllViews();
        }
        this.f210g.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: a */
    public void mo273a(C0859j jVar, int i) {
        this.f212i = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0626s.m2843a((View) this, (Drawable) m256e());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        C1082bm.m5951a(this, jVar.getTooltipText());
        m255d();
    }

    /* renamed from: b */
    public boolean mo274b() {
        return false;
    }

    public C0859j getItemData() {
        return this.f212i;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f212i != null && this.f212i.isCheckable() && this.f212i.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f206d);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f207c != z) {
            this.f207c = z;
            this.f216m.mo2327a((View) this.f210g, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f210g.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f214k) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0311a.m1186g(drawable).mutate();
                C0311a.m1175a(drawable, this.f213j);
            }
            drawable.setBounds(0, 0, this.f208e, this.f208e);
        } else if (this.f209f) {
            if (this.f215l == null) {
                this.f215l = C0447b.m2045a(getResources(), C0092e.navigation_empty_icon, getContext().getTheme());
                if (this.f215l != null) {
                    this.f215l.setBounds(0, 0, this.f208e, this.f208e);
                }
            }
            drawable = this.f215l;
        }
        C0711p.m3329a(this.f210g, drawable, null, null, null);
    }

    /* access modifiers changed from: 0000 */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f213j = colorStateList;
        this.f214k = this.f213j != null;
        if (this.f212i != null) {
            setIcon(this.f212i.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f209f = z;
    }

    public void setTextAppearance(int i) {
        C0711p.m3328a(this.f210g, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f210g.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f210g.setText(charSequence);
    }
}
