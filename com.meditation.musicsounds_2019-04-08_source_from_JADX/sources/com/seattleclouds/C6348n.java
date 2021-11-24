package com.seattleclouds;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p009v4.view.C0605e;
import android.support.p023v7.app.C0751a;
import android.support.p023v7.app.C0767e;
import android.support.p023v7.view.C0827b;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.billing.C5319d;
import com.seattleclouds.modules.loginregister.C5799d;
import com.seattleclouds.modules.loginregister.LoginRegisterEditProfile;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.p160e.C5338d;
import com.seattleclouds.p160e.C5340f;
import com.seattleclouds.util.C6597ap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.seattleclouds.n */
public abstract class C6348n extends C0767e {

    /* renamed from: n */
    private C6350o f22548n = new C6350o();

    /* renamed from: o */
    private String f22549o;

    /* renamed from: p */
    private C5338d f22550p;

    /* renamed from: q */
    private boolean f22551q = false;

    /* renamed from: r */
    private boolean f22552r = true;

    /* renamed from: s */
    private List<C6349a> f22553s = new LinkedList();

    /* renamed from: com.seattleclouds.n$a */
    public interface C6349a {
        /* renamed from: w_ */
        boolean mo17583w_();
    }

    /* renamed from: m */
    private void mo16842m() {
        Bundle extras = getIntent().getExtras();
        C6597ap.m31934a(extras != null ? extras.getString("PAGE_TRANSITION") : null, (Activity) this);
    }

    /* renamed from: n */
    private void mo17205n() {
        LayoutInflater from = LayoutInflater.from(this);
        if (from.getFactory() == null) {
            C0605e.m2744b(from, new C5340f(this, mo19778o()));
        } else {
            Log.i("SCActivity", "The Activity's LayoutInflater already has a Factory installed so we can not install SCViewFactory");
        }
    }

    /* renamed from: q */
    private void mo16887q() {
        C5799d.m28557c();
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    /* renamed from: a */
    public void mo3071a(C0827b bVar) {
        super.mo3071a(bVar);
        C5334b.m26774b(mo19778o(), (C0767e) this);
    }

    /* renamed from: a */
    public void mo19774a(C5338d dVar) {
        this.f22549o = null;
        this.f22550p = dVar;
    }

    /* renamed from: a */
    public void mo19775a(C6349a aVar) {
        this.f22553s.add(aVar);
    }

    /* renamed from: b */
    public void mo19776b(C6349a aVar) {
        this.f22553s.remove(aVar);
    }

    /* renamed from: b */
    public void mo19777b(boolean z) {
        this.f22551q = z;
    }

    /* renamed from: e */
    public void mo1467e() {
        this.f22552r = true;
        super.mo1467e();
    }

    public void finish() {
        super.finish();
        Bundle extras = getIntent().getExtras();
        C6597ap.m31936b(extras != null ? extras.getString("PAGE_TRANSITION") : null, this);
    }

    /* renamed from: o */
    public C5338d mo19778o() {
        if (this.f22550p != null) {
            return this.f22550p;
        }
        if (this.f22549o != null) {
            this.f22550p = C5338d.m26782e(this.f22549o);
            return this.f22550p;
        }
        C5338d e = C5338d.m26782e("Theme.App");
        if (e == null) {
            e = C5338d.f19131a;
        }
        return e;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C5319d c = C5319d.m26613c();
        if (c == null || !c.mo5613a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
        this.f22548n.mo19780a(i, i2, intent);
    }

    public void onBackPressed() {
        if (this.f22553s.size() > 0) {
            boolean z = false;
            for (C6349a w_ : this.f22553s) {
                z |= w_.mo17583w_();
            }
            if (z) {
                return;
            }
        }
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f22548n.mo19782a((Activity) this, configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo16842m();
        mo17205n();
        C5338d o = mo19778o();
        C5334b.m26769a(o, (C0767e) this, this.f22551q);
        C0751a i = mo3083i();
        if (i != null) {
            i.mo2992a(true);
        }
        super.onCreate(bundle);
        C5334b.m26767a(o, (C0767e) this);
        this.f22548n.mo19783a((Activity) this, bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        this.f22552r = true;
        return onCreateOptionsMenu;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f22548n.mo19788e(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == C5458g.login_register_logout) {
            mo16887q();
            return true;
        } else if (menuItem.getItemId() != C5458g.login_registeredit_profie) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, LoginRegisterEditProfile.class));
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f22548n.mo19786c(this);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        if (this.f22552r) {
            C5334b.m26768a(mo19778o(), (C0767e) this, menu);
            this.f22552r = false;
        }
        return onPrepareOptionsMenu;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f22548n.mo19784b(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f22548n.mo19785b(this, bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f22548n.mo19781a(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f22548n.mo19787d(this);
    }

    /* renamed from: p */
    public boolean mo19779p() {
        return this.f22551q;
    }
}
