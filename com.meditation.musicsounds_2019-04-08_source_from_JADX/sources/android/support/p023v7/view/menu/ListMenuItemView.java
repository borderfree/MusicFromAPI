package android.support.p023v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.view.menu.C0873p.C0874a;
import android.support.p023v7.widget.C1078bk;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C0874a {

    /* renamed from: a */
    private C0859j f2520a;

    /* renamed from: b */
    private ImageView f2521b;

    /* renamed from: c */
    private RadioButton f2522c;

    /* renamed from: d */
    private TextView f2523d;

    /* renamed from: e */
    private CheckBox f2524e;

    /* renamed from: f */
    private TextView f2525f;

    /* renamed from: g */
    private ImageView f2526g;

    /* renamed from: h */
    private Drawable f2527h;

    /* renamed from: i */
    private int f2528i;

    /* renamed from: j */
    private Context f2529j;

    /* renamed from: k */
    private boolean f2530k;

    /* renamed from: l */
    private Drawable f2531l;

    /* renamed from: m */
    private int f2532m;

    /* renamed from: n */
    private LayoutInflater f2533n;

    /* renamed from: o */
    private boolean f2534o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C1078bk a = C1078bk.m5881a(getContext(), attributeSet, C0736j.MenuView, i, 0);
        this.f2527h = a.mo5357a(C0736j.MenuView_android_itemBackground);
        this.f2528i = a.mo5370g(C0736j.MenuView_android_itemTextAppearance, -1);
        this.f2530k = a.mo5359a(C0736j.MenuView_preserveIconSpacing, false);
        this.f2529j = context;
        this.f2531l = a.mo5357a(C0736j.MenuView_subMenuArrow);
        a.mo5358a();
    }

    /* renamed from: a */
    private void m3992a() {
        this.f2521b = (ImageView) getInflater().inflate(C0733g.abc_list_menu_item_icon, this, false);
        addView(this.f2521b, 0);
    }

    /* renamed from: c */
    private void m3993c() {
        this.f2522c = (RadioButton) getInflater().inflate(C0733g.abc_list_menu_item_radio, this, false);
        addView(this.f2522c);
    }

    /* renamed from: d */
    private void m3994d() {
        this.f2524e = (CheckBox) getInflater().inflate(C0733g.abc_list_menu_item_checkbox, this, false);
        addView(this.f2524e);
    }

    private LayoutInflater getInflater() {
        if (this.f2533n == null) {
            this.f2533n = LayoutInflater.from(getContext());
        }
        return this.f2533n;
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f2526g != null) {
            this.f2526g.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo273a(C0859j jVar, int i) {
        this.f2520a = jVar;
        this.f2532m = i;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.mo3554a((C0874a) this));
        setCheckable(jVar.isCheckable());
        mo3372a(jVar.mo3567f(), jVar.mo3563d());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    /* renamed from: a */
    public void mo3372a(boolean z, char c) {
        int i = (!z || !this.f2520a.mo3567f()) ? 8 : 0;
        if (i == 0) {
            this.f2525f.setText(this.f2520a.mo3565e());
        }
        if (this.f2525f.getVisibility() != i) {
            this.f2525f.setVisibility(i);
        }
    }

    /* renamed from: b */
    public boolean mo274b() {
        return false;
    }

    public C0859j getItemData() {
        return this.f2520a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0626s.m2843a((View) this, this.f2527h);
        this.f2523d = (TextView) findViewById(C0732f.title);
        if (this.f2528i != -1) {
            this.f2523d.setTextAppearance(this.f2529j, this.f2528i);
        }
        this.f2525f = (TextView) findViewById(C0732f.shortcut);
        this.f2526g = (ImageView) findViewById(C0732f.submenuarrow);
        if (this.f2526g != null) {
            this.f2526g.setImageDrawable(this.f2531l);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2521b != null && this.f2530k) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2521b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f2522c != null || this.f2524e != null) {
            if (this.f2520a.mo3568g()) {
                if (this.f2522c == null) {
                    m3993c();
                }
                compoundButton2 = this.f2522c;
                compoundButton = this.f2524e;
            } else {
                if (this.f2524e == null) {
                    m3994d();
                }
                compoundButton2 = this.f2524e;
                compoundButton = this.f2522c;
            }
            if (z) {
                compoundButton2.setChecked(this.f2520a.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton2.getVisibility() != i) {
                    compoundButton2.setVisibility(i);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                if (this.f2524e != null) {
                    this.f2524e.setVisibility(8);
                }
                if (this.f2522c != null) {
                    this.f2522c.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2520a.mo3568g()) {
            if (this.f2522c == null) {
                m3993c();
            }
            compoundButton = this.f2522c;
        } else {
            if (this.f2524e == null) {
                m3994d();
            }
            compoundButton = this.f2524e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f2534o = z;
        this.f2530k = z;
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f2520a.mo3583i() || this.f2534o;
        if (!z && !this.f2530k) {
            return;
        }
        if (this.f2521b != null || drawable != null || this.f2530k) {
            if (this.f2521b == null) {
                m3992a();
            }
            if (drawable != null || this.f2530k) {
                ImageView imageView = this.f2521b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f2521b.getVisibility() != 0) {
                    this.f2521b.setVisibility(0);
                }
            } else {
                this.f2521b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f2523d.setText(charSequence);
            if (this.f2523d.getVisibility() != 0) {
                textView = this.f2523d;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f2523d.getVisibility() != 8) {
                textView = this.f2523d;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
