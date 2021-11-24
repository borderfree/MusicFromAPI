package android.support.p023v7.view;

import android.content.Context;
import android.support.p023v7.view.C0827b.C0828a;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0855h.C0856a;
import android.support.p023v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.e */
public class C0831e extends C0827b implements C0856a {

    /* renamed from: a */
    private Context f2441a;

    /* renamed from: b */
    private ActionBarContextView f2442b;

    /* renamed from: c */
    private C0828a f2443c;

    /* renamed from: d */
    private WeakReference<View> f2444d;

    /* renamed from: e */
    private boolean f2445e;

    /* renamed from: f */
    private boolean f2446f;

    /* renamed from: g */
    private C0855h f2447g;

    public C0831e(Context context, ActionBarContextView actionBarContextView, C0828a aVar, boolean z) {
        this.f2441a = context;
        this.f2442b = actionBarContextView;
        this.f2443c = aVar;
        this.f2447g = new C0855h(actionBarContextView.getContext()).mo3476a(1);
        this.f2447g.mo3484a((C0856a) this);
        this.f2446f = z;
    }

    /* renamed from: a */
    public MenuInflater mo3218a() {
        return new C0834g(this.f2442b.getContext());
    }

    /* renamed from: a */
    public void mo3219a(int i) {
        mo3225b((CharSequence) this.f2441a.getString(i));
    }

    /* renamed from: a */
    public void mo639a(C0855h hVar) {
        mo3227d();
        this.f2442b.mo3757a();
    }

    /* renamed from: a */
    public void mo3220a(View view) {
        this.f2442b.setCustomView(view);
        this.f2444d = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo3221a(CharSequence charSequence) {
        this.f2442b.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo3222a(boolean z) {
        super.mo3222a(z);
        this.f2442b.setTitleOptional(z);
    }

    /* renamed from: a */
    public boolean mo640a(C0855h hVar, MenuItem menuItem) {
        return this.f2443c.mo3180a((C0827b) this, menuItem);
    }

    /* renamed from: b */
    public Menu mo3223b() {
        return this.f2447g;
    }

    /* renamed from: b */
    public void mo3224b(int i) {
        mo3221a((CharSequence) this.f2441a.getString(i));
    }

    /* renamed from: b */
    public void mo3225b(CharSequence charSequence) {
        this.f2442b.setTitle(charSequence);
    }

    /* renamed from: c */
    public void mo3226c() {
        if (!this.f2445e) {
            this.f2445e = true;
            this.f2442b.sendAccessibilityEvent(32);
            this.f2443c.mo3178a(this);
        }
    }

    /* renamed from: d */
    public void mo3227d() {
        this.f2443c.mo3181b(this, this.f2447g);
    }

    /* renamed from: f */
    public CharSequence mo3229f() {
        return this.f2442b.getTitle();
    }

    /* renamed from: g */
    public CharSequence mo3230g() {
        return this.f2442b.getSubtitle();
    }

    /* renamed from: h */
    public boolean mo3231h() {
        return this.f2442b.mo3760d();
    }

    /* renamed from: i */
    public View mo3232i() {
        if (this.f2444d != null) {
            return (View) this.f2444d.get();
        }
        return null;
    }
}
