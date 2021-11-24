package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p123d.C3181c;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.g */
public class C3184g {

    /* renamed from: a */
    private static C3184g f10967a;

    /* renamed from: b */
    private final Context f10968b;

    private C3184g(Context context) {
        this.f10968b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C3184g m14674a(Context context) {
        C3266s.m14913a(context);
        synchronized (C3184g.class) {
            if (f10967a == null) {
                C3277l.m14995a(context);
                f10967a = new C3184g(context);
            }
        }
        return f10967a;
    }

    /* renamed from: a */
    private static C3279n m14675a(PackageInfo packageInfo, C3279n... nVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C3280o oVar = new C3280o(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].equals(oVar)) {
                return nVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    private final C3291u m14676a(String str, int i) {
        try {
            return m14678b(C3181c.m14658a(this.f10968b).mo11125a(str, 64, i));
        } catch (NameNotFoundException unused) {
            String str2 = "no pkg ";
            String valueOf = String.valueOf(str);
            return C3291u.m15023a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: a */
    public static boolean m14677a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (m14675a(packageInfo, z ? C3282q.f11144a : new C3279n[]{C3282q.f11144a[0]}) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final C3291u m14678b(PackageInfo packageInfo) {
        String str;
        boolean honorsDebugCertificates = C3183f.honorsDebugCertificates(this.f10968b);
        if (packageInfo == null) {
            str = "null pkg";
        } else if (packageInfo.signatures.length != 1) {
            str = "single cert required";
        } else {
            C3280o oVar = new C3280o(packageInfo.signatures[0].toByteArray());
            String str2 = packageInfo.packageName;
            C3291u a = C3277l.m14993a(str2, (C3279n) oVar, honorsDebugCertificates);
            if (!a.f11180a || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || (honorsDebugCertificates && !C3277l.m14993a(str2, (C3279n) oVar, false).f11180a)) {
                return a;
            }
            str = "debuggable release cert app rejected";
        }
        return C3291u.m15023a(str);
    }

    /* renamed from: a */
    public boolean mo11137a(int i) {
        C3291u uVar;
        String[] a = C3181c.m14658a(this.f10968b).mo11128a(i);
        if (a != null && a.length != 0) {
            uVar = null;
            for (String a2 : a) {
                uVar = m14676a(a2, i);
                if (uVar.f11180a) {
                    break;
                }
            }
        } else {
            uVar = C3291u.m15023a("no pkgs");
        }
        uVar.mo11321c();
        return uVar.f11180a;
    }

    /* renamed from: a */
    public boolean mo11138a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m14677a(packageInfo, false)) {
            return true;
        }
        if (m14677a(packageInfo, true)) {
            if (C3183f.honorsDebugCertificates(this.f10968b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}
