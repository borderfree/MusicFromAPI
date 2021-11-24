package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.p123d.C3181c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.util.t */
public class C3315t {

    /* renamed from: a */
    private static final int f11212a = Process.myUid();

    /* renamed from: b */
    private static final Method f11213b = m15093a();

    /* renamed from: c */
    private static final Method f11214c = m15098b();

    /* renamed from: d */
    private static final Method f11215d = m15099c();

    /* renamed from: e */
    private static final Method f11216e = m15100d();

    /* renamed from: f */
    private static final Method f11217f = m15101e();

    /* renamed from: g */
    private static final Method f11218g = m15102f();

    /* renamed from: h */
    private static final Method f11219h = m15103g();

    /* renamed from: a */
    private static WorkSource m15090a(int i, String str) {
        WorkSource workSource = new WorkSource();
        m15095a(workSource, i, str);
        return workSource;
    }

    /* renamed from: a */
    public static WorkSource m15091a(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo a = C3181c.m14658a(context).mo11124a(str, 0);
                if (a != null) {
                    return m15090a(a.uid, str);
                }
                String str2 = "WorkSourceUtil";
                String str3 = "Could not get applicationInfo from package: ";
                String valueOf = String.valueOf(str);
                Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return null;
            } catch (NameNotFoundException unused) {
                String str4 = "WorkSourceUtil";
                String str5 = "Could not find package: ";
                String valueOf2 = String.valueOf(str);
                Log.e(str4, valueOf2.length() != 0 ? str5.concat(valueOf2) : new String(str5));
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m15092a(WorkSource workSource, int i) {
        if (f11217f != null) {
            try {
                return (String) f11217f.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Method m15093a() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static List<String> m15094a(WorkSource workSource) {
        int b = workSource == null ? 0 : m15097b(workSource);
        if (b == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            String a = m15092a(workSource, i);
            if (!C3313r.m15087a(a)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m15095a(WorkSource workSource, int i, String str) {
        if (f11214c != null) {
            if (str == null) {
                str = "";
            }
            try {
                f11214c.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            if (f11213b != null) {
                try {
                    f11213b.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m15096a(Context context) {
        return (context == null || context.getPackageManager() == null || C3181c.m14658a(context).mo11123a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    /* renamed from: b */
    private static int m15097b(WorkSource workSource) {
        if (f11215d != null) {
            try {
                return ((Integer) f11215d.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static Method m15098b() {
        if (C3309n.m15074f()) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static Method m15099c() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m15100d() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m15101e() {
        if (C3309n.m15074f()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static final Method m15102f() {
        if (C3309n.m15081m()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: g */
    private static final Method m15103g() {
        if (C3309n.m15081m()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e);
            }
        }
        return null;
    }
}
