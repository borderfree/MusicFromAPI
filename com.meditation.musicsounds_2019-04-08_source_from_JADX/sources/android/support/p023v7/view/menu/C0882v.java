package android.support.p023v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p009v4.p012b.p013a.C0429c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v */
class C0882v extends C0876r implements SubMenu {
    C0882v(Context context, C0429c cVar) {
        super(context, cVar);
    }

    /* renamed from: b */
    public C0429c mo3727b() {
        return (C0429c) this.f2570b;
    }

    public void clearHeader() {
        mo3727b().clearHeader();
    }

    public MenuItem getItem() {
        return mo3427a(mo3727b().getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        mo3727b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo3727b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        mo3727b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo3727b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo3727b().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        mo3727b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        mo3727b().setIcon(drawable);
        return this;
    }
}
