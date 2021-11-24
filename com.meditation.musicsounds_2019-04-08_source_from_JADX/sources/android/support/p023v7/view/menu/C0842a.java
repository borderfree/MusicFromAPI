package android.support.p023v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.p012b.p013a.C0428b;
import android.support.p009v4.view.C0592b;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.a */
public class C0842a implements C0428b {

    /* renamed from: a */
    private final int f2535a;

    /* renamed from: b */
    private final int f2536b;

    /* renamed from: c */
    private final int f2537c;

    /* renamed from: d */
    private final int f2538d;

    /* renamed from: e */
    private CharSequence f2539e;

    /* renamed from: f */
    private CharSequence f2540f;

    /* renamed from: g */
    private Intent f2541g;

    /* renamed from: h */
    private char f2542h;

    /* renamed from: i */
    private int f2543i = 4096;

    /* renamed from: j */
    private char f2544j;

    /* renamed from: k */
    private int f2545k = 4096;

    /* renamed from: l */
    private Drawable f2546l;

    /* renamed from: m */
    private int f2547m = 0;

    /* renamed from: n */
    private Context f2548n;

    /* renamed from: o */
    private OnMenuItemClickListener f2549o;

    /* renamed from: p */
    private CharSequence f2550p;

    /* renamed from: q */
    private CharSequence f2551q;

    /* renamed from: r */
    private ColorStateList f2552r = null;

    /* renamed from: s */
    private Mode f2553s = null;

    /* renamed from: t */
    private boolean f2554t = false;

    /* renamed from: u */
    private boolean f2555u = false;

    /* renamed from: v */
    private int f2556v = 16;

    public C0842a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f2548n = context;
        this.f2535a = i2;
        this.f2536b = i;
        this.f2537c = i3;
        this.f2538d = i4;
        this.f2539e = charSequence;
    }

    /* renamed from: b */
    private void m3998b() {
        if (this.f2546l == null) {
            return;
        }
        if (this.f2554t || this.f2555u) {
            this.f2546l = C0311a.m1186g(this.f2546l);
            this.f2546l = this.f2546l.mutate();
            if (this.f2554t) {
                C0311a.m1175a(this.f2546l, this.f2552r);
            }
            if (this.f2555u) {
                C0311a.m1178a(this.f2546l, this.f2553s);
            }
        }
    }

    /* renamed from: a */
    public C0428b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0428b mo1743a(C0592b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0428b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0428b setContentDescription(CharSequence charSequence) {
        this.f2550p = charSequence;
        return this;
    }

    /* renamed from: a */
    public C0592b mo1745a() {
        return null;
    }

    /* renamed from: b */
    public C0428b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: b */
    public C0428b setTooltipText(CharSequence charSequence) {
        this.f2551q = charSequence;
        return this;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f2545k;
    }

    public char getAlphabeticShortcut() {
        return this.f2544j;
    }

    public CharSequence getContentDescription() {
        return this.f2550p;
    }

    public int getGroupId() {
        return this.f2536b;
    }

    public Drawable getIcon() {
        return this.f2546l;
    }

    public ColorStateList getIconTintList() {
        return this.f2552r;
    }

    public Mode getIconTintMode() {
        return this.f2553s;
    }

    public Intent getIntent() {
        return this.f2541g;
    }

    public int getItemId() {
        return this.f2535a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f2543i;
    }

    public char getNumericShortcut() {
        return this.f2542h;
    }

    public int getOrder() {
        return this.f2538d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f2539e;
    }

    public CharSequence getTitleCondensed() {
        return this.f2540f != null ? this.f2540f : this.f2539e;
    }

    public CharSequence getTooltipText() {
        return this.f2551q;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f2556v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f2556v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f2556v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f2556v & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f2544j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2544j = Character.toLowerCase(c);
        this.f2545k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f2556v = z | (this.f2556v & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f2556v = (z ? 2 : 0) | (this.f2556v & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f2556v = (z ? 16 : 0) | (this.f2556v & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2547m = i;
        this.f2546l = C0452b.m2059a(this.f2548n, i);
        m3998b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2546l = drawable;
        this.f2547m = 0;
        m3998b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2552r = colorStateList;
        this.f2554t = true;
        m3998b();
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f2553s = mode;
        this.f2555u = true;
        m3998b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2541g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f2542h = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f2542h = c;
        this.f2543i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f2549o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2542h = c;
        this.f2544j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2542h = c;
        this.f2543i = KeyEvent.normalizeMetaState(i);
        this.f2544j = Character.toLowerCase(c2);
        this.f2545k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(int i) {
        this.f2539e = this.f2548n.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2539e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2540f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f2556v & 8;
        if (z) {
            i = 0;
        }
        this.f2556v = i2 | i;
        return this;
    }
}
