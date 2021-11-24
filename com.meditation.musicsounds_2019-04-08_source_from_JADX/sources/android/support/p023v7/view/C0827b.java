package android.support.p023v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
public abstract class C0827b {

    /* renamed from: a */
    private Object f2434a;

    /* renamed from: b */
    private boolean f2435b;

    /* renamed from: android.support.v7.view.b$a */
    public interface C0828a {
        /* renamed from: a */
        void mo3178a(C0827b bVar);

        /* renamed from: a */
        boolean mo3179a(C0827b bVar, Menu menu);

        /* renamed from: a */
        boolean mo3180a(C0827b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo3181b(C0827b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo3218a();

    /* renamed from: a */
    public abstract void mo3219a(int i);

    /* renamed from: a */
    public abstract void mo3220a(View view);

    /* renamed from: a */
    public abstract void mo3221a(CharSequence charSequence);

    /* renamed from: a */
    public void mo3285a(Object obj) {
        this.f2434a = obj;
    }

    /* renamed from: a */
    public void mo3222a(boolean z) {
        this.f2435b = z;
    }

    /* renamed from: b */
    public abstract Menu mo3223b();

    /* renamed from: b */
    public abstract void mo3224b(int i);

    /* renamed from: b */
    public abstract void mo3225b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo3226c();

    /* renamed from: d */
    public abstract void mo3227d();

    /* renamed from: f */
    public abstract CharSequence mo3229f();

    /* renamed from: g */
    public abstract CharSequence mo3230g();

    /* renamed from: h */
    public boolean mo3231h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo3232i();

    /* renamed from: j */
    public Object mo3286j() {
        return this.f2434a;
    }

    /* renamed from: k */
    public boolean mo3287k() {
        return this.f2435b;
    }
}
