package android.support.p009v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.content.C0452b;

/* renamed from: android.support.v4.app.a */
public class C0345a extends C0452b {

    /* renamed from: a */
    private static C0348b f1007a;

    /* renamed from: android.support.v4.app.a$a */
    public interface C0347a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.a$b */
    public interface C0348b {
        /* renamed from: a */
        boolean mo1375a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean mo1376a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: android.support.v4.app.a$c */
    public interface C0349c {
        /* renamed from: a */
        void mo1377a(int i);
    }

    /* renamed from: a */
    public static C0348b m1453a() {
        return f1007a;
    }

    /* renamed from: a */
    public static void m1454a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m1455a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m1456a(final Activity activity, final String[] strArr, final int i) {
        if (f1007a == null || !f1007a.mo1376a(activity, strArr, i)) {
            if (VERSION.SDK_INT >= 23) {
                if (activity instanceof C0349c) {
                    ((C0349c) activity).mo1377a(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof C0347a) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        int[] iArr = new int[strArr.length];
                        PackageManager packageManager = activity.getPackageManager();
                        String packageName = activity.getPackageName();
                        int length = strArr.length;
                        for (int i = 0; i < length; i++) {
                            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                        }
                        ((C0347a) activity).onRequestPermissionsResult(i, strArr, iArr);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static boolean m1457a(Activity activity, String str) {
        if (VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
