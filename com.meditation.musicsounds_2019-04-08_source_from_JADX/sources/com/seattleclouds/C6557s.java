package com.seattleclouds;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.ads.C5244a;
import com.seattleclouds.ads.C5260d;
import com.seattleclouds.modules.loginregister.C5799d;
import com.seattleclouds.p160e.C5338d;

/* renamed from: com.seattleclouds.s */
public class C6557s extends Fragment implements C6563u {

    /* renamed from: a */
    private C6649v f23210a;

    /* renamed from: b */
    private View f23211b;

    /* renamed from: c */
    private ViewGroup f23212c;

    /* renamed from: d */
    private boolean f23213d = false;

    /* renamed from: e */
    private CharSequence f23214e;

    /* renamed from: f */
    private boolean f23215f = false;

    /* renamed from: g */
    private C5244a f23216g;

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        C6561t.m31728a().mo20308f(this);
        if (this.f23216g != null) {
            this.f23216g.mo17248a();
        }
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        if (this.f23216g != null) {
            this.f23216g.mo17250b();
        }
        C6561t.m31728a().mo20309g(this);
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        boolean z = true;
        mo1283e(true);
        if (bundle == null || !mo1197G()) {
            z = false;
        }
        this.f23215f = z;
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        C6561t.m31728a();
        C5230aa d = C6561t.m31743d(this);
        if (((d == null || !d.mo17019M()) && !C5799d.f20548b) || !C5799d.m28556b()) {
            super.mo1240a(menu, menuInflater);
        } else if (mo1318s() != null) {
            mo1318s().getMenuInflater().inflate(C5461j.app_main_login, menu);
        }
        C6561t.m31728a().mo20305a((Fragment) this, menu, menuInflater);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        if (this.f23213d && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            this.f23211b = view;
            this.f23212c = (ViewGroup) view.getParent();
        }
        mo20284a((LinearLayout) view.findViewById(C5458g.sc_ad_container));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20284a(LinearLayout linearLayout) {
        if (linearLayout != null) {
            Bundle m = mo1307m();
            if (m != null) {
                mo20286a(linearLayout, m.getString("PAGE_ID"));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20285a(LinearLayout linearLayout, C5230aa aaVar) {
        if (!C5260d.m26241a().mo17273c()) {
            this.f23216g = new C5244a();
            this.f23216g.mo17249a(mo1318s(), linearLayout, aaVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20286a(LinearLayout linearLayout, String str) {
        mo20285a(linearLayout, (C5230aa) App.f18501c.mo16902D().get(str));
    }

    /* renamed from: a */
    public void mo20287a(CharSequence charSequence) {
        this.f23214e = charSequence;
        C6561t.m31734a((Fragment) this, charSequence);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        C6561t.m31728a().mo20307d(this, z);
    }

    /* renamed from: au */
    public C6649v mo20288au() {
        if (this.f23210a != null) {
            return this.f23210a;
        }
        this.f23210a = new C6649v(mo1307m());
        return this.f23210a;
    }

    /* renamed from: av */
    public boolean mo20289av() {
        return C6649v.m32117a(mo1307m());
    }

    /* renamed from: aw */
    public CharSequence mo20290aw() {
        return this.f23214e;
    }

    /* renamed from: ax */
    public C5338d mo20291ax() {
        if (mo1318s() instanceof C6348n) {
            return ((C6348n) mo1318s()).mo19778o();
        }
        return null;
    }

    /* renamed from: ay */
    public void mo20292ay() {
        if (mo1318s() != null) {
            mo1318s().invalidateOptionsMenu();
        }
    }

    /* renamed from: b */
    public void mo20293b(boolean z) {
        this.f23213d = z;
    }

    /* renamed from: c */
    public void mo1274c(boolean z) {
        if (this.f23211b != null) {
            if (z) {
                this.f23212c.removeView(this.f23211b);
            } else {
                this.f23212c.addView(this.f23211b);
            }
        }
        super.mo1274c(z);
        mo17454a(!z);
    }

    /* renamed from: d */
    public void mo20294d(int i) {
        mo20287a((CharSequence) mo1219a(i));
    }

    /* renamed from: g */
    public void mo1290g(boolean z) {
        super.mo1290g(z);
        if (this.f23215f) {
            if (z) {
                this.f23215f = false;
            }
            return;
        }
        if (mo1192B()) {
            mo17454a(z);
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        if (this.f23216g != null) {
            this.f23216g.mo17251c();
            this.f23216g = null;
        }
        super.mo1296i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C6561t.m31728a().mo20304a((Fragment) this, configuration);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!C6561t.m31728a().mo20306a((Fragment) this, intent, i)) {
            super.startActivityForResult(intent, i);
        }
    }
}
