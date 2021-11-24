package android.support.p023v7.view.menu;

import android.content.Context;
import android.support.p009v4.p012b.p013a.C0428b;
import android.support.p009v4.p012b.p013a.C0429c;
import android.support.p009v4.p019g.C0488a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.c */
abstract class C0844c<T> extends C0845d<T> {

    /* renamed from: a */
    final Context f2567a;

    /* renamed from: c */
    private Map<C0428b, MenuItem> f2568c;

    /* renamed from: d */
    private Map<C0429c, SubMenu> f2569d;

    C0844c(Context context, T t) {
        super(t);
        this.f2567a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final MenuItem mo3427a(MenuItem menuItem) {
        if (!(menuItem instanceof C0428b)) {
            return menuItem;
        }
        C0428b bVar = (C0428b) menuItem;
        if (this.f2568c == null) {
            this.f2568c = new C0488a();
        }
        MenuItem menuItem2 = (MenuItem) this.f2568c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C0875q.m4242a(this.f2567a, bVar);
        this.f2568c.put(bVar, a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SubMenu mo3428a(SubMenu subMenu) {
        if (!(subMenu instanceof C0429c)) {
            return subMenu;
        }
        C0429c cVar = (C0429c) subMenu;
        if (this.f2569d == null) {
            this.f2569d = new C0488a();
        }
        SubMenu subMenu2 = (SubMenu) this.f2569d.get(cVar);
        if (subMenu2 == null) {
            subMenu2 = C0875q.m4243a(this.f2567a, cVar);
            this.f2569d.put(cVar, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3429a() {
        if (this.f2568c != null) {
            this.f2568c.clear();
        }
        if (this.f2569d != null) {
            this.f2569d.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3430a(int i) {
        if (this.f2568c != null) {
            Iterator it = this.f2568c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo3431b(int i) {
        if (this.f2568c != null) {
            Iterator it = this.f2568c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
