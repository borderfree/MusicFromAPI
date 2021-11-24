package android.support.p023v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.p012b.p013a.C0428b;
import android.support.p009v4.view.C0592b;
import android.support.p009v4.view.C0592b.C0594b;
import android.support.p023v7.p026c.p027a.C0817b;
import android.support.p023v7.view.menu.C0873p.C0874a;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.view.menu.j */
public final class C0859j implements C0428b {

    /* renamed from: F */
    private static String f2655F;

    /* renamed from: G */
    private static String f2656G;

    /* renamed from: H */
    private static String f2657H;

    /* renamed from: I */
    private static String f2658I;

    /* renamed from: A */
    private View f2659A;

    /* renamed from: B */
    private C0592b f2660B;

    /* renamed from: C */
    private OnActionExpandListener f2661C;

    /* renamed from: D */
    private boolean f2662D = false;

    /* renamed from: E */
    private ContextMenuInfo f2663E;

    /* renamed from: a */
    C0855h f2664a;

    /* renamed from: b */
    private final int f2665b;

    /* renamed from: c */
    private final int f2666c;

    /* renamed from: d */
    private final int f2667d;

    /* renamed from: e */
    private final int f2668e;

    /* renamed from: f */
    private CharSequence f2669f;

    /* renamed from: g */
    private CharSequence f2670g;

    /* renamed from: h */
    private Intent f2671h;

    /* renamed from: i */
    private char f2672i;

    /* renamed from: j */
    private int f2673j = 4096;

    /* renamed from: k */
    private char f2674k;

    /* renamed from: l */
    private int f2675l = 4096;

    /* renamed from: m */
    private Drawable f2676m;

    /* renamed from: n */
    private int f2677n = 0;

    /* renamed from: o */
    private C0881u f2678o;

    /* renamed from: p */
    private Runnable f2679p;

    /* renamed from: q */
    private OnMenuItemClickListener f2680q;

    /* renamed from: r */
    private CharSequence f2681r;

    /* renamed from: s */
    private CharSequence f2682s;

    /* renamed from: t */
    private ColorStateList f2683t = null;

    /* renamed from: u */
    private Mode f2684u = null;

    /* renamed from: v */
    private boolean f2685v = false;

    /* renamed from: w */
    private boolean f2686w = false;

    /* renamed from: x */
    private boolean f2687x = false;

    /* renamed from: y */
    private int f2688y = 16;

    /* renamed from: z */
    private int f2689z = 0;

    C0859j(C0855h hVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2664a = hVar;
        this.f2665b = i2;
        this.f2666c = i;
        this.f2667d = i3;
        this.f2668e = i4;
        this.f2669f = charSequence;
        this.f2689z = i5;
    }

    /* renamed from: a */
    private Drawable m4149a(Drawable drawable) {
        if (drawable != null && this.f2687x && (this.f2685v || this.f2686w)) {
            drawable = C0311a.m1186g(drawable).mutate();
            if (this.f2685v) {
                C0311a.m1175a(drawable, this.f2683t);
            }
            if (this.f2686w) {
                C0311a.m1178a(drawable, this.f2684u);
            }
            this.f2687x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    public C0428b setActionView(int i) {
        Context e = this.f2664a.mo3519e();
        setActionView(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    /* renamed from: a */
    public C0428b mo1743a(C0592b bVar) {
        if (this.f2660B != null) {
            this.f2660B.mo2433f();
        }
        this.f2659A = null;
        this.f2660B = bVar;
        this.f2664a.mo359a(true);
        if (this.f2660B != null) {
            this.f2660B.mo2426a((C0594b) new C0594b() {
                /* renamed from: a */
                public void mo2435a(boolean z) {
                    C0859j.this.f2664a.mo3485a(C0859j.this);
                }
            });
        }
        return this;
    }

    /* renamed from: a */
    public C0428b setActionView(View view) {
        this.f2659A = view;
        this.f2660B = null;
        if (view != null && view.getId() == -1 && this.f2665b > 0) {
            view.setId(this.f2665b);
        }
        this.f2664a.mo3503b(this);
        return this;
    }

    /* renamed from: a */
    public C0428b setContentDescription(CharSequence charSequence) {
        this.f2681r = charSequence;
        this.f2664a.mo359a(false);
        return this;
    }

    /* renamed from: a */
    public C0592b mo1745a() {
        return this.f2660B;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo3554a(C0874a aVar) {
        return (aVar == null || !aVar.mo274b()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: a */
    public void mo3555a(C0881u uVar) {
        this.f2678o = uVar;
        uVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3556a(ContextMenuInfo contextMenuInfo) {
        this.f2663E = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo3557a(boolean z) {
        this.f2688y = (z ? 4 : 0) | (this.f2688y & -5);
    }

    /* renamed from: b */
    public C0428b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: b */
    public C0428b setTooltipText(CharSequence charSequence) {
        this.f2682s = charSequence;
        this.f2664a.mo359a(false);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3559b(boolean z) {
        int i = this.f2688y;
        this.f2688y = (z ? 2 : 0) | (this.f2688y & -3);
        if (i != this.f2688y) {
            this.f2664a.mo359a(false);
        }
    }

    /* renamed from: b */
    public boolean mo3560b() {
        if ((this.f2680q != null && this.f2680q.onMenuItemClick(this)) || this.f2664a.mo3490a(this.f2664a, (MenuItem) this)) {
            return true;
        }
        if (this.f2679p != null) {
            this.f2679p.run();
            return true;
        }
        if (this.f2671h != null) {
            try {
                this.f2664a.mo3519e().startActivity(this.f2671h);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f2660B != null && this.f2660B.mo2431d();
    }

    /* renamed from: c */
    public int mo3561c() {
        return this.f2668e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo3562c(boolean z) {
        int i = this.f2688y;
        this.f2688y = (z ? 0 : 8) | (this.f2688y & -9);
        return i != this.f2688y;
    }

    public boolean collapseActionView() {
        if ((this.f2689z & 8) == 0) {
            return false;
        }
        if (this.f2659A == null) {
            return true;
        }
        if (this.f2661C == null || this.f2661C.onMenuItemActionCollapse(this)) {
            return this.f2664a.mo3518d(this);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public char mo3563d() {
        return this.f2664a.mo3506b() ? this.f2674k : this.f2672i;
    }

    /* renamed from: d */
    public void mo3564d(boolean z) {
        this.f2688y = z ? this.f2688y | 32 : this.f2688y & -33;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo3565e() {
        String str;
        char d = mo3563d();
        if (d == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(f2655F);
        if (d == 8) {
            str = f2657H;
        } else if (d == 10) {
            str = f2656G;
        } else if (d != ' ') {
            sb.append(d);
            return sb.toString();
        } else {
            str = f2658I;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: e */
    public void mo3566e(boolean z) {
        this.f2662D = z;
        this.f2664a.mo359a(false);
    }

    public boolean expandActionView() {
        if (!mo3592n()) {
            return false;
        }
        if (this.f2661C == null || this.f2661C.onMenuItemActionExpand(this)) {
            return this.f2664a.mo3511c(this);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo3567f() {
        return this.f2664a.mo3510c() && mo3563d() != 0;
    }

    /* renamed from: g */
    public boolean mo3568g() {
        return (this.f2688y & 4) != 0;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        if (this.f2659A != null) {
            return this.f2659A;
        }
        if (this.f2660B == null) {
            return null;
        }
        this.f2659A = this.f2660B.mo2424a((MenuItem) this);
        return this.f2659A;
    }

    public int getAlphabeticModifiers() {
        return this.f2675l;
    }

    public char getAlphabeticShortcut() {
        return this.f2674k;
    }

    public CharSequence getContentDescription() {
        return this.f2681r;
    }

    public int getGroupId() {
        return this.f2666c;
    }

    public Drawable getIcon() {
        Drawable b;
        if (this.f2676m != null) {
            b = this.f2676m;
        } else if (this.f2677n == 0) {
            return null;
        } else {
            b = C0817b.m3884b(this.f2664a.mo3519e(), this.f2677n);
            this.f2677n = 0;
            this.f2676m = b;
        }
        return m4149a(b);
    }

    public ColorStateList getIconTintList() {
        return this.f2683t;
    }

    public Mode getIconTintMode() {
        return this.f2684u;
    }

    public Intent getIntent() {
        return this.f2671h;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f2665b;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f2663E;
    }

    public int getNumericModifiers() {
        return this.f2673j;
    }

    public char getNumericShortcut() {
        return this.f2672i;
    }

    public int getOrder() {
        return this.f2667d;
    }

    public SubMenu getSubMenu() {
        return this.f2678o;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f2669f;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2670g != null ? this.f2670g : this.f2669f;
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f2682s;
    }

    /* renamed from: h */
    public void mo3581h() {
        this.f2664a.mo3503b(this);
    }

    public boolean hasSubMenu() {
        return this.f2678o != null;
    }

    /* renamed from: i */
    public boolean mo3583i() {
        return this.f2664a.mo3538q();
    }

    public boolean isActionViewExpanded() {
        return this.f2662D;
    }

    public boolean isCheckable() {
        return (this.f2688y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f2688y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f2688y & 16) != 0;
    }

    public boolean isVisible() {
        boolean z = false;
        if (this.f2660B == null || !this.f2660B.mo2429b()) {
            if ((this.f2688y & 8) == 0) {
                z = true;
            }
            return z;
        }
        if ((this.f2688y & 8) == 0 && this.f2660B.mo2430c()) {
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo3588j() {
        return (this.f2688y & 32) == 32;
    }

    /* renamed from: k */
    public boolean mo3589k() {
        return (this.f2689z & 1) == 1;
    }

    /* renamed from: l */
    public boolean mo3590l() {
        return (this.f2689z & 2) == 2;
    }

    /* renamed from: m */
    public boolean mo3591m() {
        return (this.f2689z & 4) == 4;
    }

    /* renamed from: n */
    public boolean mo3592n() {
        if ((this.f2689z & 8) == 0) {
            return false;
        }
        if (this.f2659A == null && this.f2660B != null) {
            this.f2659A = this.f2660B.mo2424a((MenuItem) this);
        }
        return this.f2659A != null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f2674k == c) {
            return this;
        }
        this.f2674k = Character.toLowerCase(c);
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f2674k == c && this.f2675l == i) {
            return this;
        }
        this.f2674k = Character.toLowerCase(c);
        this.f2675l = KeyEvent.normalizeMetaState(i);
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f2688y;
        this.f2688y = z | (this.f2688y & true) ? 1 : 0;
        if (i != this.f2688y) {
            this.f2664a.mo359a(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f2688y & 4) != 0) {
            this.f2664a.mo3488a((MenuItem) this);
        } else {
            mo3559b(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f2688y = z ? this.f2688y | 16 : this.f2688y & -17;
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2676m = null;
        this.f2677n = i;
        this.f2687x = true;
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2677n = 0;
        this.f2676m = drawable;
        this.f2687x = true;
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2683t = colorStateList;
        this.f2685v = true;
        this.f2687x = true;
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f2684u = mode;
        this.f2686w = true;
        this.f2687x = true;
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2671h = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f2672i == c) {
            return this;
        }
        this.f2672i = c;
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f2672i == c && this.f2673j == i) {
            return this;
        }
        this.f2672i = c;
        this.f2673j = KeyEvent.normalizeMetaState(i);
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f2661C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f2680q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2672i = c;
        this.f2674k = Character.toLowerCase(c2);
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2672i = c;
        this.f2673j = KeyEvent.normalizeMetaState(i);
        this.f2674k = Character.toLowerCase(c2);
        this.f2675l = KeyEvent.normalizeMetaState(i2);
        this.f2664a.mo359a(false);
        return this;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f2689z = i;
                this.f2664a.mo3503b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f2664a.mo3519e().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2669f = charSequence;
        this.f2664a.mo359a(false);
        if (this.f2678o != null) {
            this.f2678o.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2670g = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f2669f;
        }
        this.f2664a.mo359a(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo3562c(z)) {
            this.f2664a.mo3485a(this);
        }
        return this;
    }

    public String toString() {
        if (this.f2669f != null) {
            return this.f2669f.toString();
        }
        return null;
    }
}
