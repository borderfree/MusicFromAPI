package com.seattleclouds.ads;

import android.app.Activity;
import android.widget.LinearLayout;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5326d;
import com.seattleclouds.SCPageFragmentActivity;
import com.seattleclouds.modules.search.SearchActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.seattleclouds.ads.a */
public class C5244a {

    /* renamed from: a */
    private Object f18807a;

    public C5244a() {
        Method a = App.m25615a("com.seattleclouds.ads.AdManager", "getInstance", (Class<?>[]) new Class[0]);
        if (a != null) {
            this.f18807a = App.m25613a(a, (Object) null, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m26178a(Activity activity) {
        if ((activity instanceof C5326d) || (activity instanceof SCPageFragmentActivity) || (activity instanceof SearchActivity)) {
            App.m25613a(App.m25615a("com.seattleclouds.ads.pollfish.PollfishManager", "show", (Class<?>[]) new Class[]{Activity.class}), (Object) null, activity);
        }
    }

    /* renamed from: a */
    public void mo17248a() {
        if (this.f18807a != null) {
            Method a = App.m25615a("com.seattleclouds.ads.AdManager", "resume", (Class<?>[]) new Class[0]);
            if (a != null) {
                try {
                    a.invoke(this.f18807a, new Object[0]);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17249a(Activity activity, LinearLayout linearLayout, C5230aa aaVar) {
        if (this.f18807a != null) {
            Method a = App.m25615a("com.seattleclouds.ads.AdManager", "showAds", (Class<?>[]) new Class[]{Activity.class, LinearLayout.class, C5230aa.class});
            if (a != null) {
                try {
                    a.invoke(this.f18807a, new Object[]{activity, linearLayout, aaVar});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo17250b() {
        if (this.f18807a != null) {
            Method a = App.m25615a("com.seattleclouds.ads.AdManager", "pause", (Class<?>[]) new Class[0]);
            if (a != null) {
                try {
                    a.invoke(this.f18807a, new Object[0]);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo17251c() {
        if (this.f18807a != null) {
            Method a = App.m25615a("com.seattleclouds.ads.AdManager", "destroy", (Class<?>[]) new Class[0]);
            if (a != null) {
                try {
                    a.invoke(this.f18807a, new Object[0]);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
