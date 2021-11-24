package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3304i;
import com.google.android.gms.common.util.C3309n;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.ex */
public final class C3534ex {

    /* renamed from: A */
    private String f13937A;

    /* renamed from: B */
    private boolean f13938B;

    /* renamed from: a */
    private int f13939a;

    /* renamed from: b */
    private boolean f13940b;

    /* renamed from: c */
    private boolean f13941c;

    /* renamed from: d */
    private int f13942d;

    /* renamed from: e */
    private int f13943e;

    /* renamed from: f */
    private int f13944f;

    /* renamed from: g */
    private String f13945g;

    /* renamed from: h */
    private int f13946h;

    /* renamed from: i */
    private int f13947i;

    /* renamed from: j */
    private int f13948j;

    /* renamed from: k */
    private boolean f13949k;

    /* renamed from: l */
    private int f13950l;

    /* renamed from: m */
    private double f13951m;

    /* renamed from: n */
    private boolean f13952n;

    /* renamed from: o */
    private String f13953o;

    /* renamed from: p */
    private String f13954p;

    /* renamed from: q */
    private boolean f13955q;

    /* renamed from: r */
    private boolean f13956r;

    /* renamed from: s */
    private String f13957s;

    /* renamed from: t */
    private boolean f13958t;

    /* renamed from: u */
    private boolean f13959u;

    /* renamed from: v */
    private String f13960v;

    /* renamed from: w */
    private String f13961w;

    /* renamed from: x */
    private float f13962x;

    /* renamed from: y */
    private int f13963y;

    /* renamed from: z */
    private int f13964z;

    public C3534ex(Context context) {
        PackageManager packageManager = context.getPackageManager();
        m18380a(context);
        m18382b(context);
        m18383c(context);
        Locale locale = Locale.getDefault();
        boolean z = false;
        this.f13955q = m18378a(packageManager, "geo:0,0?q=donuts") != null;
        if (m18378a(packageManager, "http://www.google.com") != null) {
            z = true;
        }
        this.f13956r = z;
        this.f13957s = locale.getCountry();
        ane.m16645a();
        this.f13958t = C3719lt.m19116a();
        this.f13959u = C3304i.m15059c(context);
        this.f13960v = locale.getLanguage();
        this.f13961w = m18381b(context, packageManager);
        this.f13937A = m18379a(context, packageManager);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.f13962x = displayMetrics.density;
                this.f13963y = displayMetrics.widthPixels;
                this.f13964z = displayMetrics.heightPixels;
            }
        }
    }

    public C3534ex(Context context, C3533ew ewVar) {
        context.getPackageManager();
        m18380a(context);
        m18382b(context);
        m18383c(context);
        this.f13953o = Build.FINGERPRINT;
        this.f13954p = Build.DEVICE;
        this.f13938B = C3309n.m15071c() && arj.m16981a(context);
        this.f13955q = ewVar.f13912b;
        this.f13956r = ewVar.f13913c;
        this.f13957s = ewVar.f13915e;
        this.f13958t = ewVar.f13916f;
        this.f13959u = ewVar.f13917g;
        this.f13960v = ewVar.f13920j;
        this.f13961w = ewVar.f13921k;
        this.f13937A = ewVar.f13922l;
        this.f13962x = ewVar.f13929s;
        this.f13963y = ewVar.f13930t;
        this.f13964z = ewVar.f13931u;
    }

    /* renamed from: a */
    private static ResolveInfo m18378a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzbv.zzeo().mo13047a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: a */
    private static String m18379a(Context context, PackageManager packageManager) {
        try {
            PackageInfo b = C3181c.m14658a(context).mo11129b("com.android.vending", 128);
            if (b != null) {
                int i = b.versionCode;
                String str = b.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private final void m18380a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f13939a = audioManager.getMode();
                this.f13940b = audioManager.isMusicActive();
                this.f13941c = audioManager.isSpeakerphoneOn();
                this.f13942d = audioManager.getStreamVolume(3);
                this.f13943e = audioManager.getRingerMode();
                this.f13944f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzbv.zzeo().mo13047a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f13939a = -2;
        this.f13940b = false;
        this.f13941c = false;
        this.f13942d = 0;
        this.f13943e = 0;
        this.f13944f = 0;
    }

    /* renamed from: b */
    private static String m18381b(Context context, PackageManager packageManager) {
        ResolveInfo a = m18378a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null) {
            return null;
        }
        ActivityInfo activityInfo = a.activityInfo;
        if (activityInfo == null) {
            return null;
        }
        try {
            PackageInfo b = C3181c.m14658a(context).mo11129b(activityInfo.packageName, 0);
            if (b != null) {
                int i = b.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (NameNotFoundException unused) {
        }
        return null;
    }

    @TargetApi(16)
    /* renamed from: b */
    private final void m18382b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f13945g = telephonyManager.getNetworkOperator();
        this.f13947i = telephonyManager.getNetworkType();
        this.f13948j = telephonyManager.getPhoneType();
        this.f13946h = -2;
        this.f13949k = false;
        this.f13950l = -1;
        zzbv.zzek();
        if (C3653jh.m18884a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f13946h = activeNetworkInfo.getType();
                this.f13950l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f13946h = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.f13949k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* renamed from: c */
    private final void m18383c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f13951m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f13952n = z;
            return;
        }
        this.f13951m = -1.0d;
        this.f13952n = false;
    }

    /* renamed from: a */
    public final C3533ew mo12895a() {
        C3533ew ewVar = new C3533ew(this.f13939a, this.f13955q, this.f13956r, this.f13945g, this.f13957s, this.f13958t, this.f13959u, this.f13940b, this.f13941c, this.f13960v, this.f13961w, this.f13937A, this.f13942d, this.f13946h, this.f13947i, this.f13948j, this.f13943e, this.f13944f, this.f13962x, this.f13963y, this.f13964z, this.f13951m, this.f13952n, this.f13949k, this.f13950l, this.f13953o, this.f13938B, this.f13954p);
        return ewVar;
    }
}
