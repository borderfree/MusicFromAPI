package android.support.p023v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p023v7.view.menu.C0855h.C0856a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.u */
public class C0881u extends C0855h implements SubMenu {

    /* renamed from: d */
    private C0855h f2735d;

    /* renamed from: e */
    private C0859j f2736e;

    public C0881u(Context context, C0855h hVar, C0859j jVar) {
        super(context);
        this.f2735d = hVar;
        this.f2736e = jVar;
    }

    /* renamed from: a */
    public String mo3482a() {
        int itemId = this.f2736e != null ? this.f2736e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo3482a());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo3484a(C0856a aVar) {
        this.f2735d.mo3484a(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3490a(C0855h hVar, MenuItem menuItem) {
        return super.mo3490a(hVar, menuItem) || this.f2735d.mo3490a(hVar, menuItem);
    }

    /* renamed from: b */
    public boolean mo3506b() {
        return this.f2735d.mo3506b();
    }

    /* renamed from: c */
    public boolean mo3510c() {
        return this.f2735d.mo3510c();
    }

    /* renamed from: c */
    public boolean mo3511c(C0859j jVar) {
        return this.f2735d.mo3511c(jVar);
    }

    /* renamed from: d */
    public boolean mo3518d(C0859j jVar) {
        return this.f2735d.mo3518d(jVar);
    }

    public MenuItem getItem() {
        return this.f2736e;
    }

    /* renamed from: p */
    public C0855h mo3535p() {
        return this.f2735d.mo3535p();
    }

    /* renamed from: s */
    public Menu mo3719s() {
        return this.f2735d;
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo3520e(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo3477a(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo3516d(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo3479a(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo3478a(view);
    }

    public SubMenu setIcon(int i) {
        this.f2736e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f2736e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f2735d.setQwertyMode(z);
    }
}
