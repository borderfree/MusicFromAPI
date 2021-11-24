package com.google.android.gms.common.p123d;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C3309n;

/* renamed from: com.google.android.gms.common.d.b */
public class C3180b {

    /* renamed from: a */
    private final Context f10962a;

    public C3180b(Context context) {
        this.f10962a = context;
    }

    /* renamed from: a */
    public int mo11122a(String str) {
        return this.f10962a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public int mo11123a(String str, String str2) {
        return this.f10962a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: a */
    public ApplicationInfo mo11124a(String str, int i) {
        return this.f10962a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: a */
    public final PackageInfo mo11125a(String str, int i, int i2) {
        return this.f10962a.getPackageManager().getPackageInfo(str, 64);
    }

    /* renamed from: a */
    public boolean mo11126a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return C3179a.m14648a(this.f10962a);
        }
        if (C3309n.m15080l()) {
            String nameForUid = this.f10962a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f10962a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean mo11127a(int i, String str) {
        if (C3309n.m15075g()) {
            try {
                ((AppOpsManager) this.f10962a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f10962a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final String[] mo11128a(int i) {
        return this.f10962a.getPackageManager().getPackagesForUid(i);
    }

    /* renamed from: b */
    public PackageInfo mo11129b(String str, int i) {
        return this.f10962a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: b */
    public CharSequence mo11130b(String str) {
        return this.f10962a.getPackageManager().getApplicationLabel(this.f10962a.getPackageManager().getApplicationInfo(str, 0));
    }
}
