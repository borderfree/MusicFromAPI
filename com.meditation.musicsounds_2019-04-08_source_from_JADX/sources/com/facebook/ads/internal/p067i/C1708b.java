package com.facebook.ads.internal.p067i;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.ads.internal.p066h.C1703d;
import com.facebook.ads.internal.p077s.p078a.C1789e;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.i.b */
public class C1708b {

    /* renamed from: a */
    public static final String f5624a = VERSION.RELEASE;

    /* renamed from: b */
    private final Context f5625b;

    /* renamed from: c */
    private final AtomicBoolean f5626c = new AtomicBoolean();

    public C1708b(Context context) {
        this.f5625b = context.getApplicationContext();
    }

    /* renamed from: k */
    private void m8543k() {
        if (!this.f5626c.getAndSet(true)) {
            HashMap hashMap = new HashMap();
            hashMap.put("subtype", "generic");
            hashMap.put("subtype_code", String.valueOf(1304));
            C1703d.m8517a(new Exception("PI_NULL"), this.f5625b, hashMap);
        }
    }

    /* renamed from: a */
    public String mo6887a() {
        return (Build.MANUFACTURER == null || Build.MANUFACTURER.length() <= 0) ? "" : Build.MANUFACTURER;
    }

    /* renamed from: b */
    public String mo6888b() {
        return (Build.MODEL == null || Build.MODEL.length() <= 0) ? "" : Build.MODEL;
    }

    /* renamed from: c */
    public String mo6889c() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5625b.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName != null && networkOperatorName.length() > 0) {
                return networkOperatorName;
            }
        }
        return "";
    }

    /* renamed from: d */
    public String mo6890d() {
        try {
            CharSequence applicationLabel = this.f5625b.getPackageManager().getApplicationLabel(this.f5625b.getPackageManager().getApplicationInfo(mo6892f(), 0));
            if (applicationLabel != null && applicationLabel.length() > 0) {
                return applicationLabel.toString();
            }
        } catch (NameNotFoundException unused) {
        }
        return "";
    }

    /* renamed from: e */
    public String mo6891e() {
        try {
            String f = mo6892f();
            if (f != null && f.length() >= 0) {
                String installerPackageName = this.f5625b.getPackageManager().getInstallerPackageName(f);
                if (installerPackageName != null && installerPackageName.length() > 0) {
                    return installerPackageName;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: f */
    public String mo6892f() {
        PendingIntent activity = PendingIntent.getActivity(this.f5625b, 0, new Intent(), 0);
        if (activity == null) {
            m8543k();
            return "";
        }
        return VERSION.SDK_INT >= 17 ? activity.getCreatorPackage() : activity.getTargetPackage();
    }

    /* renamed from: g */
    public String mo6893g() {
        String str;
        try {
            str = this.f5625b.getPackageManager().getPackageInfo(mo6892f(), 0).versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            str = null;
        }
        return !TextUtils.isEmpty(str) ? str : "";
    }

    /* renamed from: h */
    public int mo6894h() {
        try {
            return this.f5625b.getPackageManager().getPackageInfo(mo6892f(), 0).versionCode;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public boolean mo6895i() {
        return this.f5625b.checkCallingOrSelfPermission("android.permission.BIND_ACCESSIBILITY_SERVICE") == 0;
    }

    /* renamed from: j */
    public int mo6896j() {
        return C1789e.m8885b(this.f5625b);
    }
}
