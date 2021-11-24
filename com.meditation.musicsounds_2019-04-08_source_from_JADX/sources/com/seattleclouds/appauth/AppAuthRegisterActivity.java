package com.seattleclouds.appauth;

import android.app.Activity;
import android.os.Bundle;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0751a;
import android.text.GetChars;
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5451m.C5452a;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5459h;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.util.C6590ak;
import com.seattleclouds.util.C6592al;
import java.util.List;

public class AppAuthRegisterActivity extends C6348n {

    /* renamed from: n */
    private static int f18893n;

    /* renamed from: o */
    private boolean f18894o;

    /* renamed from: p */
    private C6590ak f18895p;

    /* renamed from: q */
    private boolean f18896q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Fragment f18897r;

    /* renamed from: s */
    private C5274b f18898s;

    /* renamed from: com.seattleclouds.appauth.AppAuthRegisterActivity$a */
    public interface C5273a {
        /* renamed from: a */
        void mo17346a(boolean z, boolean z2);
    }

    /* renamed from: com.seattleclouds.appauth.AppAuthRegisterActivity$b */
    static class C5274b {

        /* renamed from: a */
        public String f18900a;

        /* renamed from: b */
        public char[] f18901b;

        private C5274b(GetChars getChars, GetChars getChars2) {
            this.f18900a = getChars.toString();
            this.f18901b = C6592al.m31908a(getChars2);
        }

        private C5274b(String str, char[] cArr) {
            this.f18900a = str;
            this.f18901b = cArr;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m26349a() {
            C5279b.m26371a(this.f18901b);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C5274b m26352b(Bundle bundle, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".email");
            String sb2 = sb.toString();
            if (!bundle.containsKey(sb2)) {
                return null;
            }
            String string = bundle.getString(sb2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(".pwd");
            return new C5274b(string, bundle.getCharArray(sb3.toString()));
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m26353c(Bundle bundle, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".email");
            bundle.putString(sb.toString(), this.f18900a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".pwd");
            bundle.putCharArray(sb2.toString(), this.f18901b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26334a(boolean z, Fragment fragment) {
        if (z != this.f18894o) {
            this.f18894o = z;
            if (z) {
                this.f18897r = fragment;
            }
            List<Fragment> e = mo1469g().mo1543e();
            if (e != null) {
                for (Fragment fragment2 : e) {
                    if (fragment2 instanceof C5273a) {
                        ((C5273a) fragment2).mo17346a(z, fragment2 == fragment);
                    }
                }
                if (z) {
                    m26339w();
                } else {
                    m26340x();
                }
            }
        }
    }

    /* renamed from: c */
    private void m26335c(boolean z) {
        if (z != this.f18896q) {
            this.f18896q = z;
            setTitle(z ? C5462k.app_auth_title_register : C5462k.app_auth_title_sign_in);
        }
    }

    /* renamed from: m */
    public static boolean m26336m() {
        return f18893n > 0;
    }

    /* renamed from: u */
    private void m26337u() {
        mo1469g().mo1536a().mo1411a(C5458g.app_auth_fragment_container, new C5289d(), "AUTHENTICATE_FRAGMENT_TAG").mo1428c();
        m26335c(false);
    }

    /* renamed from: v */
    private void m26338v() {
        mo1469g().mo1536a().mo1411a(C5458g.app_auth_fragment_container, new C5294e(), "REGISTER_FRAGMENT_TAG").mo1428c();
        m26335c(true);
    }

    /* renamed from: w */
    private void m26339w() {
        if (this.f18895p == null) {
            this.f18895p = new C6590ak(new Runnable() {
                public void run() {
                    AppAuthRegisterActivity.this.m26334a(false, AppAuthRegisterActivity.this.f18897r);
                    AppAuthRegisterActivity.this.f18897r = null;
                }
            });
        }
        this.f18895p.mo20590a((long) (getResources().getInteger(C5459h.default_anim_duration) + 100));
    }

    /* renamed from: x */
    private void m26340x() {
        if (this.f18895p != null) {
            this.f18895p.mo20589a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17341a(GetChars getChars, GetChars getChars2) {
        if (this.f18898s != null) {
            this.f18898s.m26349a();
        }
        this.f18898s = new C5274b(getChars, getChars2);
    }

    /* renamed from: n */
    public boolean mo17205n() {
        return this.f18894o;
    }

    public void onBackPressed() {
        if (C5279b.m26394g() || C5279b.m26393f()) {
            C5279b.m26395h();
        } else if (C5279b.m26373a(getIntent())) {
            finish();
        } else {
            AppStarterActivity.m25710e((Activity) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5460i.activity_app_auth_register);
        C0751a i = mo3083i();
        if (i != null) {
            i.mo2992a(false);
        }
        if (bundle == null) {
            m26337u();
        } else {
            this.f18898s = C5274b.m26352b(bundle, "saveUserCredentials");
            m26335c(bundle.getBoolean("saveRegisterScreenIsActive"));
        }
        f18893n++;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        f18893n--;
        if (this.f18895p != null) {
            this.f18895p.mo20589a();
        }
        mo17344t();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f18898s != null) {
            this.f18898s.m26353c(bundle, "saveUserCredentials");
        }
        bundle.putBoolean("saveRegisterScreenIsActive", this.f18896q);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (C5279b.m26385c() || (!C5279b.m26372a() && !C5279b.m26381b())) {
            finish();
        }
    }

    /* renamed from: q */
    public void mo16887q() {
        if (!this.f18894o) {
            C0374l g = mo1469g();
            Fragment a = g.mo1535a("AUTHENTICATE_FRAGMENT_TAG");
            if (a == null) {
                a = new C5289d();
            }
            C0396q a2 = g.mo1536a();
            a2.mo1408a(C5452a.sc_push_left_enter, C5452a.sc_push_left_exit);
            a2.mo1414a((String) null);
            a2.mo1423b(C5458g.app_auth_fragment_container, a, "AUTHENTICATE_FRAGMENT_TAG");
            a2.mo1428c();
            m26335c(false);
            m26334a(true, a);
        }
    }

    /* renamed from: r */
    public void mo17342r() {
        if (!this.f18894o) {
            C0374l g = mo1469g();
            Fragment a = g.mo1535a("REGISTER_FRAGMENT_TAG");
            if (a == null) {
                a = new C5294e();
            }
            C0396q a2 = g.mo1536a();
            a2.mo1408a(C5452a.sc_push_right_enter, C5452a.sc_push_right_exit);
            a2.mo1414a((String) null);
            a2.mo1423b(C5458g.app_auth_fragment_container, a, "REGISTER_FRAGMENT_TAG");
            a2.mo1428c();
            m26335c(true);
            m26334a(true, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public C5274b mo17343s() {
        return this.f18898s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo17344t() {
        if (this.f18898s != null) {
            this.f18898s.m26349a();
            this.f18898s = null;
        }
    }
}
