package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.bz */
public final class C4287bz extends C4497s {

    /* renamed from: a */
    protected boolean f15844a;

    /* renamed from: b */
    protected int f15845b;

    /* renamed from: c */
    private String f15846c;

    /* renamed from: d */
    private String f15847d;

    /* renamed from: e */
    private int f15848e;

    /* renamed from: f */
    private boolean f15849f;

    /* renamed from: g */
    private boolean f15850g;

    public C4287bz(C4499u uVar) {
        super(uVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10611a() {
        ApplicationInfo applicationInfo;
        Context i = mo14826i();
        try {
            applicationInfo = i.getPackageManager().getApplicationInfo(i.getPackageName(), 128);
        } catch (NameNotFoundException e) {
            mo14819d("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            mo14821e("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i2 = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (i2 > 0) {
                C4266be beVar = (C4266be) new C4264bc(mo14824g()).mo14143a(i2);
                if (beVar != null) {
                    mo14811b("Loading global XML config values");
                    boolean z = false;
                    if (beVar.f15789a != null) {
                        String str = beVar.f15789a;
                        this.f15847d = str;
                        mo14812b("XML config - app name", str);
                    }
                    if (beVar.f15790b != null) {
                        String str2 = beVar.f15790b;
                        this.f15846c = str2;
                        mo14812b("XML config - app version", str2);
                    }
                    if (beVar.f15791c != null) {
                        String lowerCase = beVar.f15791c.toLowerCase(Locale.US);
                        int i3 = "verbose".equals(lowerCase) ? 0 : "info".equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : "error".equals(lowerCase) ? 3 : -1;
                        if (i3 >= 0) {
                            this.f15848e = i3;
                            mo14808a("XML config - log level", Integer.valueOf(i3));
                        }
                    }
                    if (beVar.f15792d >= 0) {
                        int i4 = beVar.f15792d;
                        this.f15845b = i4;
                        this.f15844a = true;
                        mo14812b("XML config - dispatch period (sec)", Integer.valueOf(i4));
                    }
                    if (beVar.f15793e != -1) {
                        if (beVar.f15793e == 1) {
                            z = true;
                        }
                        this.f15850g = z;
                        this.f15849f = true;
                        mo14812b("XML config - dry run", Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo14212b() {
        mo14840x();
        return this.f15846c;
    }

    /* renamed from: c */
    public final String mo14213c() {
        mo14840x();
        return this.f15847d;
    }

    /* renamed from: d */
    public final boolean mo14214d() {
        mo14840x();
        return false;
    }

    /* renamed from: e */
    public final boolean mo14215e() {
        mo14840x();
        return this.f15849f;
    }

    /* renamed from: f */
    public final boolean mo14216f() {
        mo14840x();
        return this.f15850g;
    }
}
