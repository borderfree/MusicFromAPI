package com.seattleclouds.modules.esignature;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C6557s;
import com.seattleclouds.appauth.C5279b;

/* renamed from: com.seattleclouds.modules.esignature.d */
public abstract class C5602d extends C6557s {

    /* renamed from: a */
    protected View f19912a;

    /* renamed from: b */
    protected View f19913b;

    /* renamed from: c */
    protected MenuItem f19914c;

    /* renamed from: d */
    protected Button f19915d;

    /* renamed from: e */
    protected ViewGroup f19916e;

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19916e = (ViewGroup) layoutInflater.inflate(mo1450b(), viewGroup, false);
        if (this.f19916e != null) {
            mo18105a(this.f19916e, bundle);
            this.f19915d = (Button) this.f19916e.findViewById(C5458g.sign_in_button);
            this.f19912a = this.f19916e.findViewById(C5458g.container_list);
            this.f19913b = this.f19916e.findViewById(C5458g.container_message);
        }
        return this.f19916e;
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        if (this.f19914c != null) {
            this.f19914c.setVisible(C5279b.m26385c());
        }
        super.mo1239a(menu);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        if (C5279b.m26381b()) {
            menuInflater.inflate(C5461j.esignature_menu, menu);
            this.f19914c = menu.findItem(C5458g.sign_out);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18105a(ViewGroup viewGroup, Bundle bundle);

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            mo1453c();
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.sign_out) {
            return super.mo1245a(menuItem);
        }
        C5279b.m26375b((Activity) mo1318s(), false);
        mo1453c();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo1450b();

    /* renamed from: c */
    public void mo1453c() {
        View view;
        if (C5279b.m26385c()) {
            this.f19912a.setVisibility(0);
            view = this.f19913b;
        } else {
            this.f19913b.setVisibility(0);
            view = this.f19912a;
        }
        view.setVisibility(8);
        if (C5279b.m26381b()) {
            mo20292ay();
        }
    }
}
