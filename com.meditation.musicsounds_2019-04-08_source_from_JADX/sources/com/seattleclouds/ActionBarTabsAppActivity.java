package com.seattleclouds;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0751a;
import android.support.p023v7.app.C0751a.C0754c;
import android.support.p023v7.app.C0751a.C0755d;
import com.seattleclouds.C5451m.C5462k;

public class ActionBarTabsAppActivity extends C5326d {

    /* renamed from: n */
    private boolean f18463n = false;

    /* renamed from: com.seattleclouds.ActionBarTabsAppActivity$a */
    private static class C5185a implements C0755d {

        /* renamed from: a */
        private Fragment f18464a;

        /* renamed from: b */
        private final ActionBarTabsAppActivity f18465b;

        /* renamed from: c */
        private final String f18466c;

        /* renamed from: d */
        private final FragmentInfo f18467d;

        public C5185a(ActionBarTabsAppActivity actionBarTabsAppActivity, String str, FragmentInfo fragmentInfo) {
            this.f18465b = actionBarTabsAppActivity;
            this.f18466c = str;
            this.f18467d = fragmentInfo;
        }

        /* renamed from: a */
        public void mo3024a(C0754c cVar, C0396q qVar) {
            if (this.f18464a == null) {
                this.f18464a = Fragment.m1271a((Context) this.f18465b, this.f18467d.mo16867a(), this.f18467d.mo16869b());
                qVar.mo1411a(16908290, this.f18464a, this.f18466c);
            } else {
                qVar.mo1429c(this.f18464a);
            }
            this.f18465b.mo17482b(this.f18466c);
        }

        /* renamed from: b */
        public void mo3025b(C0754c cVar, C0396q qVar) {
            if (this.f18464a != null) {
                qVar.mo1424b(this.f18464a);
            }
        }

        /* renamed from: c */
        public void mo3026c(C0754c cVar, C0396q qVar) {
        }
    }

    /* renamed from: d */
    private void m25597d(int i) {
        C0751a i2 = mo3083i();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        i2.mo2999b(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo16842m() {
        m25597d(getResources().getConfiguration().orientation);
        C0751a i = mo3083i();
        i.mo2986a(2);
        for (int i2 = 0; i2 < App.f18501c.mo16942d().size(); i2++) {
            String c = m26668c(i2);
            String a = ((C5389j) App.f18501c.mo16942d().get(i2)).mo17653a();
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getString(C5462k.tab));
                sb.append(" ");
                sb.append(i2);
                a = sb.toString();
            }
            i.mo2989a(i.mo2995b().mo3018a((CharSequence) a).mo3017a((C0755d) new C5185a(this, c, super.mo16878a(c))));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.f18463n) {
            m25597d(configuration.orientation);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f18463n = true;
    }
}
