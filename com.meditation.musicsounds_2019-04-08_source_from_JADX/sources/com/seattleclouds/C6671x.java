package com.seattleclouds;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p009v4.app.C0412u;
import android.support.p009v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.modules.loginregister.C5799d;
import com.seattleclouds.p160e.C5338d;

/* renamed from: com.seattleclouds.x */
public class C6671x extends C0412u implements C6563u {

    /* renamed from: ae */
    private boolean f23465ae = false;

    /* renamed from: i */
    private CharSequence f23466i;

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        C6561t.m31728a().mo20308f(this);
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
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
        this.f23465ae = z;
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        C6561t.m31728a();
        C5230aa d = C6561t.m31743d(this);
        if (d == null || !d.mo17019M() || !C5799d.m28556b()) {
            super.mo1240a(menu, menuInflater);
        } else {
            mo1318s().getMenuInflater().inflate(C5461j.app_main_login, menu);
        }
        C6561t.m31728a().mo20305a((Fragment) this, menu, menuInflater);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        C6561t.m31728a().mo20307d(this, z);
    }

    /* renamed from: aw */
    public CharSequence mo20290aw() {
        return this.f23466i;
    }

    /* renamed from: b */
    public void mo20720b(CharSequence charSequence) {
        this.f23466i = charSequence;
        C6561t.m31734a((Fragment) this, charSequence);
    }

    /* renamed from: c */
    public C5338d mo1453c() {
        if (mo1318s() instanceof C6348n) {
            return ((C6348n) mo1318s()).mo19778o();
        }
        return null;
    }

    /* renamed from: c */
    public void mo1274c(boolean z) {
        super.mo1274c(z);
        mo17454a(!z);
    }

    /* renamed from: d */
    public void mo20721d() {
        if (mo1318s() != null) {
            mo1318s().invalidateOptionsMenu();
        }
    }

    /* renamed from: d */
    public void mo20722d(int i) {
        mo20720b(mo1219a(i));
    }

    /* renamed from: g */
    public void mo1290g(boolean z) {
        super.mo1290g(z);
        if (this.f23465ae) {
            if (z) {
                this.f23465ae = false;
            }
            return;
        }
        if (mo1192B()) {
            mo17454a(z);
        }
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
