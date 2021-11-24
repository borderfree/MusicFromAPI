package com.seattleclouds.modules.loginregister;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.seattleclouds.App;
import com.seattleclouds.C5391l;
import com.seattleclouds.C5451m.C5452a;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.loginregister.C5800e.C5807b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.seattleclouds.modules.loginregister.d */
public class C5799d extends C5391l implements C5807b {

    /* renamed from: a */
    public static boolean f20543a = false;

    /* renamed from: ae */
    private static String f20544ae = "userUpdatedCredentials";

    /* renamed from: ak */
    private static long f20545ak = 86400;

    /* renamed from: al */
    private static SimpleDateFormat f20546al = new SimpleDateFormat("\"dd-MMM-yyyy hh:mm:ss aa\"");

    /* renamed from: am */
    private static boolean f20547am = false;

    /* renamed from: b */
    public static boolean f20548b = false;

    /* renamed from: c */
    public static ArrayList<String> f20549c = new ArrayList<>();

    /* renamed from: d */
    private static String f20550d = C5799d.class.toString();

    /* renamed from: e */
    private static String f20551e = "userEmailKey";

    /* renamed from: f */
    private static String f20552f = "userPassKey";

    /* renamed from: g */
    private static String f20553g = "userSetKeepLogin";

    /* renamed from: h */
    private static String f20554h = "userLoginAtDateTimeKey";

    /* renamed from: i */
    private static String f20555i = "userSetFingeprintEnabled";

    /* renamed from: af */
    private Bundle f20556af;

    /* renamed from: ag */
    private String f20557ag = "";

    /* renamed from: ah */
    private String f20558ah = "";

    /* renamed from: ai */
    private boolean f20559ai = false;

    /* renamed from: aj */
    private Fragment f20560aj;

    /* renamed from: a */
    public static void m28546a(String str, String str2) {
        Editor edit = App.m25647e().getSharedPreferences("LoginRegisterInfo", 0).edit();
        edit.putString(str, str2.toString());
        edit.commit();
    }

    /* renamed from: a */
    public static void m28547a(String str, Set<String> set) {
        Editor edit = App.m25647e().getSharedPreferences("LoginRegisterInfo", 0).edit();
        edit.putStringSet(str, set);
        edit.commit();
    }

    /* renamed from: aA */
    public static String m28548aA() {
        StringBuilder sb = new StringBuilder();
        sb.append(f20555i);
        sb.append("_");
        sb.append(m28553as());
        return m28565g(sb.toString());
    }

    /* renamed from: aB */
    public static boolean m28549aB() {
        return Boolean.parseBoolean(m28548aA());
    }

    /* renamed from: aC */
    public static boolean m28550aC() {
        return Boolean.parseBoolean(m28554az());
    }

    /* renamed from: aD */
    private static void m28551aD() {
        Date time = Calendar.getInstance().getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(f20554h);
        sb.append("_");
        sb.append(m28553as());
        m28546a(sb.toString(), f20546al.format(time));
    }

    /* renamed from: aE */
    private boolean m28552aE() {
        this.f20560aj = mo1323v().mo1535a("loginRegisterCurrentNested");
        if (this.f20560aj instanceof C5800e) {
            ((C5800e) this.f20560aj).mo18510a((C5807b) this);
        }
        String str = f20547am ? this.f20558ah : "$LOGIN_FAKE_PAGE_ID";
        if (this.f20557ag.equals(str)) {
            return false;
        }
        this.f20557ag = str;
        if (f20547am) {
            String h = App.m25655h(this.f20558ah);
            if (this.f20559ai) {
                h = this.f20558ah;
                if (h == null || h.isEmpty()) {
                    App.m25625a((Fragment) this);
                    Log.w(f20550d, "Page URL is not valid or is missing");
                    return true;
                } else if (App.m25643c(h, (Fragment) this)) {
                    App.m25625a((Fragment) this);
                    return true;
                }
            }
            FragmentInfo a = App.m25607a(h, (Context) mo1318s(), Boolean.valueOf(true));
            Intent a2 = App.m25605a(h, a, (Activity) mo1318s());
            if (a2 == null || mo1318s() == null) {
                m28560d(Fragment.m1271a((Context) mo1318s(), a.mo16867a(), a.mo16869b()));
            } else {
                mo1318s().startActivity(a2);
                App.m25625a((Fragment) this);
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("NEXT_PAGE_ID", this.f20558ah);
            if (this.f20556af != null) {
                bundle.putBundle("LOGIN_REGISTER_PAGE_STYLE", this.f20556af);
            }
            C5800e eVar = new C5800e();
            eVar.mo1289g(bundle);
            eVar.mo18510a((C5807b) this);
            m28560d((Fragment) eVar);
        }
        return true;
    }

    /* renamed from: as */
    public static String m28553as() {
        return m28565g(f20551e);
    }

    /* renamed from: az */
    public static String m28554az() {
        StringBuilder sb = new StringBuilder();
        sb.append(f20553g);
        sb.append("_");
        sb.append(m28553as());
        return m28565g(sb.toString());
    }

    /* renamed from: b */
    public static void m28555b(String str, String str2) {
        m28568j(str);
        m28569k(str2);
        m28558c(str);
    }

    /* renamed from: b */
    public static boolean m28556b() {
        if (m28550aC()) {
            m28571m(true);
            return true;
        }
        if (!m28550aC() && !m28563e()) {
            m28571m(false);
        }
        return f20547am;
    }

    /* renamed from: c */
    public static void m28557c() {
        m28571m(false);
        m28562e(Boolean.FALSE.toString());
        Date date = new Date(Long.MIN_VALUE);
        StringBuilder sb = new StringBuilder();
        sb.append(f20554h);
        sb.append("_");
        sb.append(m28553as());
        m28546a(sb.toString(), f20546al.format(date));
    }

    /* renamed from: c */
    public static void m28558c(String str) {
        if (!m28561d(str)) {
            HashSet hashSet = new HashSet();
            if (m28559d() != null) {
                hashSet.addAll(m28559d());
            }
            hashSet.add(str);
            m28547a(f20544ae, (Set<String>) hashSet);
        }
    }

    /* renamed from: d */
    public static Set<String> m28559d() {
        return m28566h(f20544ae);
    }

    /* renamed from: d */
    private void m28560d(Fragment fragment) {
        C0396q a = mo1323v().mo1536a();
        a.mo1408a(C5452a.freeze, 0);
        if (this.f20560aj == null) {
            a.mo1411a(C5458g.login_register_fragment, fragment, "loginRegisterCurrentNested");
        } else {
            a.mo1423b(C5458g.login_register_fragment, fragment, "loginRegisterCurrentNested");
        }
        this.f20560aj = fragment;
        mo17695c(fragment);
        a.mo1428c();
    }

    /* renamed from: d */
    public static boolean m28561d(String str) {
        Set d = m28559d();
        if (d != null) {
            ArrayList arrayList = new ArrayList(d);
            if (arrayList.size() > 0) {
                str.equalsIgnoreCase(((String) arrayList.get(0)).toString());
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static void m28562e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f20553g);
        sb.append("_");
        sb.append(m28553as());
        m28546a(sb.toString(), str);
    }

    /* renamed from: e */
    public static boolean m28563e() {
        Date date;
        StringBuilder sb = new StringBuilder();
        sb.append(f20554h);
        sb.append("_");
        sb.append(m28553as());
        sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f20554h);
        sb2.append("_");
        sb2.append(m28553as());
        String g = m28565g(sb2.toString());
        Date time = Calendar.getInstance().getTime();
        try {
            date = f20546al.parse(g);
        } catch (ParseException unused) {
            date = new Date(Long.MIN_VALUE);
        }
        long time2 = time.getTime() - date.getTime();
        return time2 < f20545ak && time2 > 0;
    }

    /* renamed from: f */
    public static void m28564f(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f20555i);
        sb.append("_");
        sb.append(m28553as());
        m28546a(sb.toString(), str);
    }

    /* renamed from: g */
    public static String m28565g(String str) {
        return App.m25647e().getSharedPreferences("LoginRegisterInfo", 0).getString(str, "");
    }

    /* renamed from: h */
    public static Set<String> m28566h(String str) {
        return App.m25647e().getSharedPreferences("LoginRegisterInfo", 0).getStringSet(str, null);
    }

    /* renamed from: i */
    public static boolean m28567i(String str) {
        m28572n(f20549c.contains(str));
        return f20548b;
    }

    /* renamed from: j */
    private static void m28568j(String str) {
        m28546a(f20551e, str);
    }

    /* renamed from: k */
    private static void m28569k(String str) {
        m28546a(f20552f, str);
    }

    /* renamed from: l */
    private static void m28570l(String str) {
        if (f20543a) {
            Log.d(f20550d, str);
        }
    }

    /* renamed from: m */
    public static void m28571m(boolean z) {
        if (z && !m28550aC()) {
            m28551aD();
        }
        f20547am = z;
    }

    /* renamed from: n */
    public static void m28572n(boolean z) {
        f20548b = z;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo1217a(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(C5460i.login_register_fragment, viewGroup, false);
        m28552aE();
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f20558ah = m.getString("NEXT_PAGE_ID");
            this.f20559ai = m.getBoolean("IS_LOGIN_REGISTER_PAGE", false);
            this.f20556af = m.getBundle("LOGIN_REGISTER_PAGE_STYLE");
        }
        if (bundle != null) {
            this.f20557ag = bundle.getString("STATE_CURRENT_PAGE_ID");
        }
    }

    /* renamed from: a */
    public void mo18508a(HashMap<String, String> hashMap) {
        m28570l(hashMap.toString());
        m28568j((String) hashMap.get("email"));
        m28569k((String) hashMap.get("password"));
        m28562e((String) hashMap.get("keepLogin"));
        m28571m(true);
        m28552aE();
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            m28552aE();
        }
    }

    /* renamed from: at */
    public String mo18509at() {
        return m28565g(f20552f);
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putString("STATE_CURRENT_PAGE_ID", this.f20557ag);
        super.mo1282e(bundle);
    }
}
