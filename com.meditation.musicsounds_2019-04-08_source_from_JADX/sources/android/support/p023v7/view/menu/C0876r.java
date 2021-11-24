package android.support.p023v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p009v4.p012b.p013a.C0427a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.r */
class C0876r extends C0844c<C0427a> implements Menu {
    C0876r(Context context, C0427a aVar) {
        super(context, aVar);
    }

    public MenuItem add(int i) {
        return mo3427a(((C0427a) this.f2570b).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo3427a(((C0427a) this.f2570b).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo3427a(((C0427a) this.f2570b).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo3427a(((C0427a) this.f2570b).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((C0427a) this.f2570b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo3427a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo3428a(((C0427a) this.f2570b).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo3428a(((C0427a) this.f2570b).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo3428a(((C0427a) this.f2570b).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo3428a(((C0427a) this.f2570b).addSubMenu(charSequence));
    }

    public void clear() {
        mo3429a();
        ((C0427a) this.f2570b).clear();
    }

    public void close() {
        ((C0427a) this.f2570b).close();
    }

    public MenuItem findItem(int i) {
        return mo3427a(((C0427a) this.f2570b).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo3427a(((C0427a) this.f2570b).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C0427a) this.f2570b).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0427a) this.f2570b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0427a) this.f2570b).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0427a) this.f2570b).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo3430a(i);
        ((C0427a) this.f2570b).removeGroup(i);
    }

    public void removeItem(int i) {
        mo3431b(i);
        ((C0427a) this.f2570b).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0427a) this.f2570b).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0427a) this.f2570b).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0427a) this.f2570b).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C0427a) this.f2570b).setQwertyMode(z);
    }

    public int size() {
        return ((C0427a) this.f2570b).size();
    }
}
