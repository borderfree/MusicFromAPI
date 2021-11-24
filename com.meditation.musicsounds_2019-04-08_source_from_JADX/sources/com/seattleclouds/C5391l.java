package com.seattleclouds;

import android.content.Intent;
import android.support.p009v4.app.Fragment;
import java.util.List;

/* renamed from: com.seattleclouds.l */
public class C5391l extends C6557s {
    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        List<Fragment> e = mo1323v().mo1543e();
        if (e != null) {
            for (Fragment fragment : e) {
                if (fragment != null && !fragment.mo1194D()) {
                    fragment.mo1222a(i, i2, intent);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo17695c(Fragment fragment) {
        fragment.mo1287f(mo1195E());
        fragment.mo1290g(mo1197G());
    }

    /* renamed from: c */
    public void mo1274c(boolean z) {
        super.mo1274c(z);
        List<Fragment> e = mo1323v().mo1543e();
        if (e != null) {
            for (Fragment fragment : e) {
                if (fragment != null && !fragment.mo1194D()) {
                    fragment.mo1274c(z);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo1287f(boolean z) {
        super.mo1287f(z);
        if (mo1318s() != null) {
            List<Fragment> e = mo1323v().mo1543e();
            if (e != null) {
                for (Fragment fragment : e) {
                    if (fragment != null) {
                        fragment.mo1287f(z);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public void mo1290g(boolean z) {
        super.mo1290g(z);
        if (mo1318s() != null) {
            List<Fragment> e = mo1323v().mo1543e();
            if (e != null) {
                for (Fragment fragment : e) {
                    if (fragment != null) {
                        fragment.mo1290g(z);
                    }
                }
            }
        }
    }
}
