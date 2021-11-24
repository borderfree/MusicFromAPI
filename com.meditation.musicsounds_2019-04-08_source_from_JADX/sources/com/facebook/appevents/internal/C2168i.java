package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.C2189f;
import p000a.C0000a;

/* renamed from: com.facebook.appevents.internal.i */
class C2168i {

    /* renamed from: a */
    private String f7074a;

    /* renamed from: b */
    private boolean f7075b;

    /* renamed from: com.facebook.appevents.internal.i$a */
    public static class C2170a {
        /* renamed from: a */
        public static C2168i m10048a(Activity activity) {
            String str = "";
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                str = callingActivity.getPackageName();
                if (str.equals(activity.getPackageName())) {
                    return null;
                }
            }
            Intent intent = activity.getIntent();
            boolean z = false;
            if (intent != null && !intent.getBooleanExtra("_fbSourceApplicationHasBeenSet", false)) {
                intent.putExtra("_fbSourceApplicationHasBeenSet", true);
                Bundle a = C0000a.m0a(intent);
                if (a != null) {
                    Bundle bundle = a.getBundle("referer_app_link");
                    if (bundle != null) {
                        str = bundle.getString("package");
                    }
                    z = true;
                }
            }
            intent.putExtra("_fbSourceApplicationHasBeenSet", true);
            return new C2168i(str, z);
        }
    }

    private C2168i(String str, boolean z) {
        this.f7074a = str;
        this.f7075b = z;
    }

    /* renamed from: a */
    public static C2168i m10045a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2189f.m10092f());
        if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return null;
        }
        return new C2168i(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    /* renamed from: b */
    public static void m10046b() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C2189f.m10092f()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    /* renamed from: c */
    public void mo7732c() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C2189f.m10092f()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f7074a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f7075b);
        edit.apply();
    }

    public String toString() {
        String str = "Unclassified";
        if (this.f7075b) {
            str = "Applink";
        }
        if (this.f7074a == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(");
        sb.append(this.f7074a);
        sb.append(")");
        return sb.toString();
    }
}
