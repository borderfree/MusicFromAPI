package com.seattleclouds;

import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.util.C6597ap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.seattleclouds.i */
public class C5388i extends C5391l {

    /* renamed from: a */
    private ArrayList<Fragment> f19241a = new ArrayList<>();

    /* renamed from: d */
    private void m26963d(Fragment fragment) {
        this.f19241a.add(fragment);
    }

    /* renamed from: e */
    private boolean m26964e() {
        if (this.f19241a.size() <= 1) {
            return false;
        }
        this.f19241a.remove(this.f19241a.size() - 1);
        return true;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(C5460i.fragment_navigation, viewGroup, false);
        FragmentInfo fragmentInfo = (FragmentInfo) mo1307m().getParcelable("ARG_ROOT_FRAGMENT_INFO");
        if (fragmentInfo != null) {
            boolean z2 = fragmentInfo.mo16867a() != null;
            if (fragmentInfo.mo16869b() != null) {
                z = true;
            }
            if (z2 && z) {
                C0396q a = mo1323v().mo1536a();
                Fragment a2 = Fragment.m1271a((Context) mo1318s(), fragmentInfo.mo16867a(), fragmentInfo.mo16869b());
                m26963d(a2);
                a.mo1411a(C5458g.navigation_fragment_content, a2, "rootFragment");
                a.mo1428c();
                return inflate;
            }
        }
        Log.w("NavigationFragment", "Root fragment info not specified or invalid");
        return inflate;
    }

    /* renamed from: a */
    public void mo17649a(FragmentInfo fragmentInfo) {
        mo17650a(fragmentInfo, true);
    }

    /* renamed from: a */
    public void mo17650a(FragmentInfo fragmentInfo, boolean z) {
        mo17651b(fragmentInfo, z);
        mo1323v().mo1540b();
    }

    /* renamed from: b */
    public List<Fragment> mo1450b() {
        return this.f19241a;
    }

    /* renamed from: b */
    public void mo17651b(FragmentInfo fragmentInfo, boolean z) {
        C0396q a = mo1323v().mo1536a();
        if (z) {
            C6597ap.m31935a(fragmentInfo.mo16869b().getString("PAGE_TRANSITION"), a);
        }
        Fragment a2 = Fragment.m1271a((Context) mo1318s(), fragmentInfo.mo16867a(), fragmentInfo.mo16869b());
        if (this.f19241a.size() > 0) {
            a.mo1424b((Fragment) this.f19241a.get(this.f19241a.size() - 1));
            a.mo1411a(C5458g.navigation_fragment_content, a2, null);
        } else {
            a.mo1411a(C5458g.navigation_fragment_content, a2, "rootFragment");
        }
        m26963d(a2);
        a.mo1414a((String) null);
        a.mo1428c();
    }

    /* renamed from: c */
    public boolean mo1453c() {
        return mo17652d();
    }

    /* renamed from: d */
    public boolean mo17652d() {
        m26964e();
        return mo1323v().mo1541c();
    }
}
