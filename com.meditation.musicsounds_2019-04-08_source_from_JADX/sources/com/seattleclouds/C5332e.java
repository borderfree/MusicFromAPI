package com.seattleclouds;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.seattleclouds.e */
public class C5332e extends C6557s {

    /* renamed from: a */
    private C5376g f19109a;

    /* renamed from: b */
    private boolean f19110b;

    /* renamed from: c */
    private boolean f19111c;

    /* renamed from: d */
    private boolean f19112d;

    /* renamed from: d */
    private void mo20096d() {
        if (this.f19109a == null) {
            mo17522a(C5342f.m26816a(this));
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f19109a != null) {
            this.f19109a.mo17626d();
        }
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        if (this.f19109a != null) {
            this.f19109a.mo17627e();
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f19109a != null) {
            this.f19109a.mo17630h();
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = this.f19109a != null ? this.f19109a.mo17611a(layoutInflater, viewGroup, bundle) : null;
        if (a == null) {
            int b = this.f19109a != null ? this.f19109a.mo17620b() : 0;
            if (b <= 0) {
                b = mo1450b();
            }
            if (b > 0) {
                a = layoutInflater.inflate(b, viewGroup, false);
            }
        }
        return a == null ? mo17525c(layoutInflater, viewGroup, bundle) : a;
    }

    /* renamed from: a */
    public void mo1226a(Activity activity) {
        if (!this.f19110b) {
            mo17524b((Context) activity);
        }
        mo17523b(activity);
        super.mo1226a(activity);
    }

    /* renamed from: a */
    public void mo1228a(Context context) {
        mo17524b(context);
        super.mo1228a(context);
        if (!this.f19111c && (context instanceof Activity)) {
            mo17523b((Activity) context);
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (this.f19109a != null) {
            this.f19109a.mo17614a(bundle);
        }
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        super.mo1239a(menu);
        if (this.f19109a != null) {
            this.f19109a.mo17615a(menu);
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        if (this.f19109a != null) {
            this.f19109a.mo17616a(menu, menuInflater);
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        if (this.f19109a != null) {
            this.f19109a.mo17617a(view, bundle);
        }
    }

    /* renamed from: a */
    public void mo17522a(C5376g gVar) {
        this.f19109a = gVar;
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (this.f19109a != null) {
            this.f19109a.mo17618a(z);
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (this.f19109a == null || !this.f19109a.mo17619a(menuItem)) {
            return super.mo1245a(menuItem);
        }
        return true;
    }

    /* renamed from: b */
    public int mo1450b() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17523b(Activity activity) {
        mo17526c(activity);
        this.f19111c = true;
        if (this.f19109a != null) {
            this.f19109a.mo17612a(activity);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17524b(Context context) {
        mo20096d();
        mo17527c(context);
        this.f19110b = true;
        if (this.f19109a != null) {
            this.f19109a.mo17613a(context);
        }
    }

    /* renamed from: c */
    public View mo17525c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17526c(Activity activity) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17527c(Context context) {
    }

    /* renamed from: c */
    public boolean mo1453c() {
        return this.f19112d;
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        super.mo1278d(bundle);
        if (this.f19109a != null) {
            this.f19109a.mo17623b(bundle);
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        if (this.f19109a != null) {
            this.f19109a.mo17625c(bundle);
        }
    }

    /* renamed from: f */
    public void mo1285f() {
        if (this.f19109a != null) {
            this.f19109a.mo17631i();
        }
        super.mo1285f();
        this.f19110b = false;
        this.f19111c = false;
    }

    /* renamed from: g */
    public void mo1288g() {
        this.f19112d = true;
        super.mo1288g();
        if (this.f19109a != null) {
            this.f19109a.mo17624c();
        }
    }

    /* renamed from: h */
    public void mo1292h() {
        this.f19112d = false;
        super.mo1292h();
        if (this.f19109a != null) {
            this.f19109a.mo17628f();
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        if (this.f19109a != null) {
            this.f19109a.mo17629g();
        }
        super.mo1296i();
    }
}
