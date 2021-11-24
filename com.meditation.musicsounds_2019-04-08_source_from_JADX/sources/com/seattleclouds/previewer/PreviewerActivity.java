package com.seattleclouds.previewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0751a;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.seattleclouds.App;
import com.seattleclouds.C5232ac;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.previewer.C6452c.C6463b;
import com.seattleclouds.previewer.appmart.C6364a;
import com.seattleclouds.previewer.appmart.PreviewerAppMartActivity;
import com.seattleclouds.util.C6578ag;

public class PreviewerActivity extends C5232ac implements C6463b, C6503d {

    /* renamed from: n */
    private static boolean f22575n = false;

    /* renamed from: o */
    private boolean f22576o = false;

    /* renamed from: p */
    private Fragment f22577p;

    /* renamed from: b */
    private void m30884b(String str) {
        if (f22575n) {
            Log.d("PreviewerActivity", str);
        }
    }

    /* renamed from: s */
    private void m30885s() {
        m30884b("refresh");
        m30886t();
        if (!App.f18511m || !App.f18473F) {
            this.f22577p = App.f18473F ? new C6452c() : new C6491g();
            this.f22577p.mo1280d(true);
            C0396q a = mo1469g().mo1536a();
            a.mo1407a(4099);
            StringBuilder sb = new StringBuilder();
            sb.append("Initial Fragment added: ");
            sb.append(this.f22576o);
            m30884b(sb.toString());
            if (this.f22576o) {
                m30884b("replacing fragment");
                a.mo1422b(16908290, this.f22577p).mo1431d();
                return;
            }
            m30884b("adding fragment");
            a.mo1410a(16908290, this.f22577p).mo1428c();
            this.f22576o = true;
            return;
        }
        Intent intent = new Intent(this, PreviewerAppMartActivity.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* renamed from: t */
    private void m30886t() {
        String str;
        C0751a aVar;
        if (!App.f18473F || !App.f18485R) {
            aVar = mo3083i();
            str = null;
        } else {
            aVar = mo3083i();
            str = getString(C5462k.previewer_logged_in_as, new Object[]{App.f18484Q, App.f18523y});
        }
        aVar.mo2998b((CharSequence) str);
    }

    /* renamed from: a */
    public void mo19804a(String str) {
        App.f18523y = str;
        App.f18469B = "";
        ((App) getApplication()).mo16844d();
        m30886t();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        m30884b("onCreate");
        App.f18480M = true;
        super.onCreate(bundle);
        C0751a i = mo3083i();
        if (i != null) {
            i.mo2992a(false);
        }
        if (bundle == null) {
            m30884b("Initial onCreate => adding new fragment");
            m30885s();
        } else {
            this.f22576o = true;
            this.f22577p = mo1469g().mo1533a(16908290);
            m30886t();
            m30884b("savedInstanceState NOT NULL => no need to create fragment");
        }
        C6364a.m30917a(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(C5461j.previewer_activity, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.about) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent(this, PreviewerAboutActivity.class));
        return true;
    }

    /* renamed from: q */
    public void mo16887q() {
        m30885s();
    }

    /* renamed from: r */
    public void mo19805r() {
        if (this.f22577p instanceof C6452c) {
            ((C6452c) this.f22577p).mo20096d();
        }
        App.f18473F = false;
        App.f18469B = "";
        App.f18523y = App.f18485R ? App.f18484Q : "";
        ((App) getApplication()).mo16844d();
        C5268b.m26272a().mo17322f();
        C6578ag.m31843c();
        m30885s();
    }
}
