package android.support.p023v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p009v4.p012b.p013a.C0428b;
import android.support.p009v4.view.C0592b;
import android.support.p023v7.view.C0829c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.k */
public class C0861k extends C0844c<C0428b> implements MenuItem {

    /* renamed from: c */
    private Method f2691c;

    /* renamed from: android.support.v7.view.menu.k$a */
    class C0862a extends C0592b {

        /* renamed from: a */
        final ActionProvider f2692a;

        public C0862a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2692a = actionProvider;
        }

        /* renamed from: a */
        public View mo2423a() {
            return this.f2692a.onCreateActionView();
        }

        /* renamed from: a */
        public void mo2427a(SubMenu subMenu) {
            this.f2692a.onPrepareSubMenu(C0861k.this.mo3428a(subMenu));
        }

        /* renamed from: d */
        public boolean mo2431d() {
            return this.f2692a.onPerformDefaultAction();
        }

        /* renamed from: e */
        public boolean mo2432e() {
            return this.f2692a.hasSubMenu();
        }
    }

    /* renamed from: android.support.v7.view.menu.k$b */
    static class C0863b extends FrameLayout implements C0829c {

        /* renamed from: a */
        final CollapsibleActionView f2694a;

        C0863b(View view) {
            super(view.getContext());
            this.f2694a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo3288a() {
            this.f2694a.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo3289b() {
            this.f2694a.onActionViewCollapsed();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public View mo3668c() {
            return (View) this.f2694a;
        }
    }

    /* renamed from: android.support.v7.view.menu.k$c */
    private class C0864c extends C0845d<OnActionExpandListener> implements OnActionExpandListener {
        C0864c(OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f2570b).onMenuItemActionCollapse(C0861k.this.mo3427a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f2570b).onMenuItemActionExpand(C0861k.this.mo3427a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$d */
    private class C0865d extends C0845d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        C0865d(OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.f2570b).onMenuItemClick(C0861k.this.mo3427a(menuItem));
        }
    }

    C0861k(Context context, C0428b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0862a mo3612a(ActionProvider actionProvider) {
        return new C0862a(this.f2567a, actionProvider);
    }

    /* renamed from: a */
    public void mo3613a(boolean z) {
        try {
            if (this.f2691c == null) {
                this.f2691c = ((C0428b) this.f2570b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f2691c.invoke(this.f2570b, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return ((C0428b) this.f2570b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0428b) this.f2570b).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0592b a = ((C0428b) this.f2570b).mo1745a();
        if (a instanceof C0862a) {
            return ((C0862a) a).f2692a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C0428b) this.f2570b).getActionView();
        return actionView instanceof C0863b ? ((C0863b) actionView).mo3668c() : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C0428b) this.f2570b).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0428b) this.f2570b).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0428b) this.f2570b).getContentDescription();
    }

    public int getGroupId() {
        return ((C0428b) this.f2570b).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0428b) this.f2570b).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0428b) this.f2570b).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((C0428b) this.f2570b).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0428b) this.f2570b).getIntent();
    }

    public int getItemId() {
        return ((C0428b) this.f2570b).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0428b) this.f2570b).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0428b) this.f2570b).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0428b) this.f2570b).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0428b) this.f2570b).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo3428a(((C0428b) this.f2570b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0428b) this.f2570b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0428b) this.f2570b).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0428b) this.f2570b).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0428b) this.f2570b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0428b) this.f2570b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0428b) this.f2570b).isCheckable();
    }

    public boolean isChecked() {
        return ((C0428b) this.f2570b).isChecked();
    }

    public boolean isEnabled() {
        return ((C0428b) this.f2570b).isEnabled();
    }

    public boolean isVisible() {
        return ((C0428b) this.f2570b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0428b) this.f2570b).mo1743a((C0592b) actionProvider != null ? mo3612a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0428b) this.f2570b).setActionView(i);
        View actionView = ((C0428b) this.f2570b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0428b) this.f2570b).setActionView((View) new C0863b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0863b(view);
        }
        ((C0428b) this.f2570b).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0428b) this.f2570b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0428b) this.f2570b).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0428b) this.f2570b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0428b) this.f2570b).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0428b) this.f2570b).mo1744a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0428b) this.f2570b).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0428b) this.f2570b).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0428b) this.f2570b).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0428b) this.f2570b).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0428b) this.f2570b).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0428b) this.f2570b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0428b) this.f2570b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0428b) this.f2570b).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0428b) this.f2570b).setOnActionExpandListener(onActionExpandListener != null ? new C0864c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0428b) this.f2570b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0865d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0428b) this.f2570b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0428b) this.f2570b).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0428b) this.f2570b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0428b) this.f2570b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0428b) this.f2570b).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0428b) this.f2570b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0428b) this.f2570b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0428b) this.f2570b).mo1746b(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0428b) this.f2570b).setVisible(z);
    }
}
