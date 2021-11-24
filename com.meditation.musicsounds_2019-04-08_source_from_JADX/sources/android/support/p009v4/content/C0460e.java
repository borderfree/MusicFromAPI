package android.support.p009v4.content;

import android.content.Context;
import android.os.Process;
import android.support.p009v4.app.C0359b;

/* renamed from: android.support.v4.content.e */
public final class C0460e {
    /* renamed from: a */
    public static int m2103a(Context context, String str) {
        return m2104a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m2104a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0359b.m1493a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0359b.m1492a(context, a, str2) != 0 ? -2 : 0;
    }
}
