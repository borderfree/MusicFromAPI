package com.seattleclouds;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.widget.SCFragmentTabHost;

public class SCTabsAppActivity extends C5326d {

    /* renamed from: n */
    private SCFragmentTabHost f18578n;

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo16842m() {
        TabSpec tabSpec;
        Bundle bundle;
        setContentView(C5460i.activity_sc_tabs_app);
        this.f18578n = (SCFragmentTabHost) findViewById(16908306);
        this.f18578n.mo20686a(this, mo1469g(), C5458g.real_tab_content, App.f18501c.mo16946e(), App.f18501c.mo16942d());
        for (int i = 0; i < App.f18501c.mo16942d().size(); i++) {
            String c = m26668c(i);
            if (App.f18501c.mo16946e().mo17687f()) {
                C5389j jVar = (C5389j) App.f18501c.mo16942d().get(i);
                BitmapDrawable k = App.m25660k(jVar.mo17657b());
                String a = jVar.mo17653a();
                if (a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getString(C5462k.tab));
                    sb.append(" ");
                    sb.append(i);
                    a = sb.toString();
                }
                tabSpec = this.f18578n.newTabSpec(c).setIndicator(a, k);
            } else {
                tabSpec = this.f18578n.newTabSpec(c).setIndicator(new View(this));
            }
            FragmentInfo a2 = super.mo16878a(c);
            Class cls = null;
            if (App.f18501c.mo16946e().mo17688g()) {
                cls = C5388i.class;
                bundle = new Bundle();
                bundle.putParcelable("ARG_ROOT_FRAGMENT_INFO", a2);
            } else {
                try {
                    cls = getClassLoader().loadClass(a2.mo16867a());
                } catch (ClassNotFoundException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Fragment class not found: ");
                    sb2.append(a2.mo16867a());
                    Log.e("SCTabsAppActivity", sb2.toString(), e);
                }
                if (cls == null) {
                } else {
                    bundle = a2.mo16869b();
                }
            }
            this.f18578n.mo20667a(tabSpec, cls, bundle);
        }
        this.f18578n.setOnTabChangedListener(new OnTabChangeListener() {
            public void onTabChanged(String str) {
                SCTabsAppActivity.this.mo17482b(str);
            }
        });
    }

    public void onBackPressed() {
        Fragment a = mo1469g().mo1535a(this.f18578n.getCurrentTabTag());
        if (!(a instanceof C5388i) || !((C5388i) a).mo1453c()) {
            super.onBackPressed();
        }
    }

    /* renamed from: q */
    public void mo16887q() {
        this.f18578n.mo20685a();
    }

    /* renamed from: r */
    public void mo16888r() {
        this.f18578n.mo20687b();
    }
}
