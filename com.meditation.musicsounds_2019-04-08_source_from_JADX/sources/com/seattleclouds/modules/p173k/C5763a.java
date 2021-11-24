package com.seattleclouds.modules.p173k;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5391l;
import com.seattleclouds.C5451m.C5452a;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.p173k.C5765b.C5769b;
import com.seattleclouds.util.C6620n;
import java.util.Map;

/* renamed from: com.seattleclouds.modules.k.a */
public class C5763a extends C5391l {

    /* renamed from: a */
    public static String f20423a;

    /* renamed from: b */
    public static String f20424b;

    /* renamed from: c */
    private static String f20425c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f20426d = false;

    /* renamed from: e */
    private String f20427e;

    /* renamed from: f */
    private C5230aa f20428f;

    /* renamed from: g */
    private String f20429g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f20430h;

    /* renamed from: i */
    private Fragment f20431i;

    /* renamed from: a */
    private static String m28383a(C5230aa aaVar, Activity activity) {
        String a = (f20423a == null || f20424b == null || !aaVar.mo17118b().equals("login")) ? null : m28384a(f20423a, f20424b, aaVar.mo17046a(), false, activity);
        if (a == null) {
            return null;
        }
        if (!a.startsWith("http")) {
            if (App.m25667n(a)) {
                a = App.m25655h(a);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                sb.append(a);
                a = sb.toString();
            }
        }
        return a;
    }

    /* renamed from: a */
    static String m28384a(String str, String str2, String str3, boolean z, Activity activity) {
        int i;
        if (activity == null) {
            return null;
        }
        C5230aa aaVar = (C5230aa) App.f18501c.mo16902D().get(str3);
        String str4 = null;
        for (int i2 = 0; i2 < aaVar.f18728b.size(); i2++) {
            Map map = (Map) aaVar.f18728b.get(i2);
            String str5 = (String) map.get("login");
            if (str == null || !str.equalsIgnoreCase(str5)) {
                i = C5462k.login_message_username_does_not_exist;
            } else if (map.containsValue(new String(Base64.encode(str2.getBytes(), 2)))) {
                f20425c = str3;
                return (String) map.get("url");
            } else {
                i = C5462k.f19439x6da3077f;
            }
            str4 = activity.getString(i);
        }
        if (aaVar.f18728b.size() == 0) {
            str4 = activity.getString(C5462k.login_message_username_and_password_do_not_exist);
        }
        if (str4 != null && z) {
            C6620n.m32034a((Context) activity, activity.getString(C5462k.error), str4);
        }
        return null;
    }

    /* renamed from: a */
    public static void m28385a(WebView webView, Fragment fragment) {
        if (f20425c != null) {
            String h = App.m25655h(f20425c);
            StringBuilder sb = new StringBuilder();
            sb.append("localStorage.setItem(\"");
            sb.append(h);
            sb.append("username\",\"\");");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("localStorage.setItem(\"");
            sb3.append(h);
            sb3.append("password\",\"\");");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append("localStorage.setItem(\"");
            sb5.append(h);
            sb5.append("checked\",\"\");");
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("javascript:");
            sb7.append(sb6);
            webView.loadUrl(sb7.toString());
        }
        f20423a = null;
        f20424b = null;
        f20425c = null;
        Fragment x = fragment.mo1325x();
        if (x == null || !(x instanceof C5763a)) {
            App.m25625a(fragment);
        } else {
            ((C5763a) x).m28389c(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m28389c(String str) {
        if (str == null) {
            str = this.f20427e;
        }
        if (this.f20429g != null && this.f20429g.equals(str)) {
            return false;
        }
        this.f20429g = str;
        Fragment d = m28390d(str);
        Intent a = App.m25605a(str, App.m25606a(str, (Context) mo1318s()), (Activity) mo1318s());
        if (a == null) {
            m28391d(d);
        } else {
            mo1318s().startActivity(a);
            App.m25625a((Fragment) this);
        }
        return true;
    }

    /* renamed from: d */
    private Fragment m28390d(String str) {
        if (!str.equals(this.f20427e)) {
            FragmentInfo a = App.m25606a(str, (Context) mo1318s());
            return Fragment.m1271a((Context) mo1318s(), a.mo16867a(), a.mo16869b());
        }
        Bundle bundle = new Bundle();
        bundle.putString("ARG_URL", this.f20427e);
        C5765b bVar = new C5765b();
        bVar.mo1289g(bundle);
        bVar.mo18443a((C5769b) new C5769b() {
            /* renamed from: a */
            public void mo18441a() {
                Bundle bundle = new Bundle();
                bundle.putString("pageId", C5763a.this.f20430h);
                App.m25619a(new FragmentInfo(C5770c.class.getName(), bundle), (Activity) C5763a.this.mo1318s());
            }

            /* renamed from: a */
            public void mo18442a(String str) {
                if (C5763a.this.f20426d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLogIn: ");
                    sb.append(str);
                    Log.v("LoginFragment", sb.toString());
                }
                C5763a.this.m28389c(str);
            }
        });
        return bVar;
    }

    /* renamed from: d */
    private void m28391d(Fragment fragment) {
        C0396q a = mo1323v().mo1536a();
        a.mo1408a(C5452a.freeze, 0);
        if (this.f20431i == null) {
            a.mo1410a(C5458g.page_fragment, fragment);
        } else {
            a.mo1422b(C5458g.page_fragment, fragment);
        }
        this.f20431i = fragment;
        mo17695c(fragment);
        a.mo1428c();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_login, viewGroup, false);
        if (this.f20430h != null) {
            return inflate;
        }
        throw new IllegalArgumentException(mo1318s().getString(C5462k.login_message_page_id_cannot_be_null));
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        this.f20430h = mo1307m().getString("ARG_PAGE_ID");
        this.f20427e = App.m25655h(this.f20430h);
        this.f20428f = (C5230aa) App.f18501c.mo16902D().get(this.f20430h);
        if (this.f20428f == null) {
            this.f20428f = new C5230aa(this.f20430h);
        }
        if (bundle != null) {
            this.f20429g = bundle.getString("currentPageUrl");
            f20423a = bundle.getString("sessionUserLogin");
            f20424b = bundle.getString("sessionUserPassword");
            f20425c = bundle.getString("sessionLoginPageId");
        }
        super.mo1234a(bundle);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            m28389c(m28383a(this.f20428f, (Activity) mo1318s()));
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putString("currentPageUrl", this.f20429g);
        bundle.putString("sessionUserLogin", f20423a);
        bundle.putString("sessionUserPassword", f20424b);
        bundle.putString("sessionLoginPageId", f20425c);
        super.mo1282e(bundle);
    }
}
