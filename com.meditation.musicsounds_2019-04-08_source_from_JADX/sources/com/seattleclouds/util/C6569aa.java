package com.seattleclouds.util;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.C0345a;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.support.p023v7.app.C0767e;
import android.util.Log;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.seattleclouds.util.aa */
public abstract class C6569aa {
    @TargetApi(23)

    /* renamed from: a */
    public static String[] f23242a = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"};
    @TargetApi(23)

    /* renamed from: b */
    public static String[] f23243b = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: c */
    public static String[] f23244c = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: com.seattleclouds.util.aa$a */
    public static class C6570a extends C0366g {

        /* renamed from: ae */
        private boolean f23245ae = false;

        /* renamed from: af */
        private int f23246af;

        /* renamed from: a */
        public static C6570a m31804a(boolean z, int i) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("finish", z);
            bundle.putInt("message", i);
            C6570a aVar = new C6570a();
            aVar.mo1289g(bundle);
            return aVar;
        }

        /* renamed from: c */
        public Dialog mo1452c(Bundle bundle) {
            this.f23245ae = mo1307m().getBoolean("finish");
            this.f23246af = mo1307m().getInt("message");
            return new Builder(mo1318s()).setMessage(String.format(mo1219a(this.f23246af), new Object[]{mo1219a(C5462k.app_name)})).setPositiveButton(C5462k.f19438OK, null).create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            if (this.f23245ae) {
                Toast.makeText(mo1318s(), this.f23246af, 0).show();
                mo1318s().finish();
            }
        }
    }

    /* renamed from: com.seattleclouds.util.aa$b */
    public static class C6571b extends C0366g {
        /* access modifiers changed from: private */

        /* renamed from: ae */
        public boolean f23247ae = false;
        /* access modifiers changed from: private */

        /* renamed from: af */
        public String[] f23248af;

        /* renamed from: ag */
        private int[] f23249ag;
        /* access modifiers changed from: private */

        /* renamed from: ah */
        public String f23250ah = null;
        /* access modifiers changed from: private */

        /* renamed from: ai */
        public String f23251ai = null;

        /* renamed from: a */
        public static C6571b m31806a(int i, String str, String str2, String[] strArr, int[] iArr) {
            Bundle bundle = new Bundle();
            bundle.putInt("requestCode", i);
            bundle.putBoolean("finish", false);
            bundle.putString("fragmentTag", str);
            bundle.putString("mRootFragmentTag", str2);
            bundle.putStringArray("permissions", strArr);
            bundle.putIntArray("messages", iArr);
            C6571b bVar = new C6571b();
            bVar.mo1289g(bundle);
            return bVar;
        }

        /* renamed from: a */
        public static C6571b m31807a(int i, boolean z, String[] strArr, int[] iArr) {
            Bundle bundle = new Bundle();
            bundle.putInt("requestCode", i);
            bundle.putBoolean("finish", z);
            bundle.putStringArray("permissions", strArr);
            bundle.putIntArray("messages", iArr);
            C6571b bVar = new C6571b();
            bVar.mo1289g(bundle);
            return bVar;
        }

        /* renamed from: c */
        public Dialog mo1452c(Bundle bundle) {
            Bundle m = mo1307m();
            final int i = m.getInt("requestCode");
            this.f23247ae = m.getBoolean("finish");
            this.f23248af = m.getStringArray("permissions");
            this.f23250ah = m.getString("fragmentTag");
            this.f23251ai = m.getString("mRootFragmentTag");
            this.f23249ag = m.getIntArray("messages");
            return new Builder(mo1318s()).setMessage(this.f23249ag[0]).setPositiveButton(C5462k.f19438OK, new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (C6571b.this.f23250ah == null) {
                        C0345a.m1456a(C6571b.this.mo1318s(), C6571b.this.f23248af, i);
                    } else if (C6571b.this.mo1318s() != null) {
                        Fragment a = C6571b.this.mo1318s().mo1469g().mo1535a(C6571b.this.f23250ah);
                        if (a == null) {
                            if (C6571b.this.f23251ai != null) {
                                Fragment a2 = C6571b.this.mo1318s().mo1469g().mo1535a(C6571b.this.f23251ai);
                                if (a2 != null) {
                                    Fragment a3 = a2.mo1323v().mo1535a(C6571b.this.f23250ah);
                                    if (a3 != null) {
                                        a3.mo1244a(C6571b.this.f23248af, i);
                                    }
                                }
                            }
                            Log.e("PermissionUtils", "Error: Unable find fragment by id");
                            return;
                        }
                        a.mo1244a(C6571b.this.f23248af, i);
                    } else {
                        return;
                    }
                    C6571b.this.f23247ae = false;
                }
            }).setNegativeButton(C5462k.cancel, null).create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            if (this.f23247ae) {
                Toast.makeText(mo1318s(), this.f23249ag[1], 0).show();
                mo1318s().finish();
            }
        }
    }

    /* renamed from: a */
    public static void m31791a(Fragment fragment, int i, String str, int[] iArr) {
        m31793a(fragment, (Fragment) null, i, str, iArr);
    }

    /* renamed from: a */
    public static void m31792a(Fragment fragment, int i, String[] strArr, int[] iArr) {
        if (!m31799a(fragment, strArr)) {
            fragment.mo1244a(strArr, i);
        } else if (!m31800a(fragment.mo1322u()) && fragment.mo1318s() != null) {
            C6571b.m31806a(i, fragment.mo1304l(), null, strArr, iArr).mo1448a(fragment.mo1318s().mo1469g(), "permissionDialog");
        }
    }

    /* renamed from: a */
    public static void m31793a(Fragment fragment, Fragment fragment2, int i, String str, int[] iArr) {
        if (fragment != null) {
            if (!fragment.mo1272b_(str)) {
                fragment.mo1244a(new String[]{str}, i);
            } else if (!m31800a(fragment.mo1322u()) && fragment.mo1318s() != null) {
                C6571b.m31806a(i, fragment.mo1304l(), fragment2 != null ? fragment2.mo1304l() : null, new String[]{str}, iArr).mo1448a(fragment.mo1318s().mo1469g(), "permissionDialog");
            }
        }
    }

    /* renamed from: a */
    public static void m31794a(C0767e eVar, int i, String str, boolean z, int[] iArr) {
        if (eVar != null) {
            if (!C0345a.m1457a(eVar, str)) {
                C0345a.m1456a(eVar, new String[]{str}, i);
            } else if (!m31800a(eVar.mo1469g())) {
                C6571b.m31807a(i, z, new String[]{str}, iArr).mo1448a(eVar.mo1469g(), "permissionDialog");
            }
        }
    }

    /* renamed from: a */
    public static void m31795a(C0767e eVar, int i, String str, int[] iArr) {
        m31794a(eVar, i, str, false, iArr);
    }

    /* renamed from: a */
    public static boolean m31796a() {
        return VERSION.SDK_INT >= 23;
    }

    /* renamed from: a */
    public static boolean m31797a(Context context, String str) {
        return C0452b.m2065b(context, str) == 0;
    }

    /* renamed from: a */
    public static boolean m31798a(Context context, String... strArr) {
        if (!(context == null || strArr == null)) {
            for (String b : strArr) {
                if (C0345a.m2065b(context, b) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m31799a(Fragment fragment, String[] strArr) {
        if (!(fragment == null || strArr == null)) {
            for (String b_ : strArr) {
                if (!fragment.mo1272b_(b_)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m31800a(C0374l lVar) {
        boolean z = false;
        if (lVar == null) {
            return false;
        }
        if (lVar.mo1535a("permissionDialog") != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m31801a(String[] strArr, int[] iArr, String str) {
        boolean z = false;
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                if (iArr[i] == 0) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m31802a(String[] strArr, int[] iArr, String[] strArr2) {
        int i = 0;
        boolean z = false;
        while (i < strArr.length) {
            boolean z2 = z;
            for (String equals : strArr2) {
                if (equals.equals(strArr[i])) {
                    z2 = iArr[i] == 0;
                }
            }
            if (!z2) {
                return false;
            }
            i++;
            z = z2;
        }
        return z;
    }

    /* renamed from: b */
    public static String m31803b(String[] strArr, int[] iArr, String[] strArr2) {
        for (int i = 0; i < strArr.length; i++) {
            for (String equals : strArr2) {
                if (equals.equals(strArr[i]) && iArr[i] != 0) {
                    return strArr[i];
                }
            }
        }
        return null;
    }
}
