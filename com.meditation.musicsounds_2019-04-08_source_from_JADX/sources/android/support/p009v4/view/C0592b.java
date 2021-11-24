package android.support.p009v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.view.b */
public abstract class C0592b {

    /* renamed from: a */
    private final Context f1738a;

    /* renamed from: b */
    private C0593a f1739b;

    /* renamed from: c */
    private C0594b f1740c;

    /* renamed from: android.support.v4.view.b$a */
    public interface C0593a {
        /* renamed from: b */
        void mo2434b(boolean z);
    }

    /* renamed from: android.support.v4.view.b$b */
    public interface C0594b {
        /* renamed from: a */
        void mo2435a(boolean z);
    }

    public C0592b(Context context) {
        this.f1738a = context;
    }

    /* renamed from: a */
    public abstract View mo2423a();

    /* renamed from: a */
    public View mo2424a(MenuItem menuItem) {
        return mo2423a();
    }

    /* renamed from: a */
    public void mo2425a(C0593a aVar) {
        this.f1739b = aVar;
    }

    /* renamed from: a */
    public void mo2426a(C0594b bVar) {
        if (!(this.f1740c == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.f1740c = bVar;
    }

    /* renamed from: a */
    public void mo2427a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void mo2428a(boolean z) {
        if (this.f1739b != null) {
            this.f1739b.mo2434b(z);
        }
    }

    /* renamed from: b */
    public boolean mo2429b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo2430c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo2431d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo2432e() {
        return false;
    }

    /* renamed from: f */
    public void mo2433f() {
        this.f1740c = null;
        this.f1739b = null;
    }
}
