package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;
import android.support.p009v4.p019g.C0488a;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: com.google.android.gms.iid.a */
public class C3350a {

    /* renamed from: a */
    private static Map<String, C3350a> f11263a = new C0488a();

    /* renamed from: b */
    private static long f11264b = TimeUnit.DAYS.toSeconds(7);

    /* renamed from: c */
    private static C3365l f11265c;

    /* renamed from: d */
    private static C3360g f11266d;

    /* renamed from: e */
    private static String f11267e;

    /* renamed from: f */
    private Context f11268f;

    /* renamed from: g */
    private String f11269g = "";

    private C3350a(Context context, String str) {
        this.f11268f = context.getApplicationContext();
        this.f11269g = str;
    }

    /* renamed from: a */
    static int m15189a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Never happens: can't find own package ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return 0;
        }
    }

    /* renamed from: a */
    public static synchronized C3350a m15190a(Context context, Bundle bundle) {
        C3350a aVar;
        synchronized (C3350a.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            Context applicationContext = context.getApplicationContext();
            if (f11265c == null) {
                String packageName = applicationContext.getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 73);
                sb.append("Instance ID SDK is deprecated, ");
                sb.append(packageName);
                sb.append(" should update to use Firebase Instance ID");
                Log.w("InstanceID", sb.toString());
                f11265c = new C3365l(applicationContext);
                f11266d = new C3360g(applicationContext);
            }
            f11267e = Integer.toString(m15189a(applicationContext));
            aVar = (C3350a) f11263a.get(string);
            if (aVar == null) {
                aVar = new C3350a(applicationContext, string);
                f11263a.put(string, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    static String m15191a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: b */
    public static C3365l m15192b() {
        return f11265c;
    }

    /* renamed from: b */
    static String m15193b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Never happens: can't find own package ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return null;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static C3350a m15194c(Context context) {
        return m15190a(context, (Bundle) null);
    }

    /* renamed from: c */
    private final KeyPair m15195c() {
        return f11265c.mo11394c(this.f11269g).mo11402a();
    }

    @Deprecated
    /* renamed from: a */
    public String mo11369a(String str, String str2) {
        return mo11370a(str, str2, null);
    }

    @Deprecated
    /* renamed from: a */
    public String mo11370a(String str, String str2, Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String str3 = null;
            String a = f11265c.mo11388a("appVersion");
            boolean z = true;
            if (a != null && a.equals(f11267e)) {
                String a2 = f11265c.mo11388a("lastToken");
                if (a2 != null) {
                    if ((System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(a2)).longValue() <= f11264b) {
                        z = false;
                    }
                }
            }
            if (!z) {
                str3 = f11265c.mo11389a(this.f11269g, str, str2);
            }
            if (str3 != null) {
                return str3;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            String b = mo11372b(str, str2, bundle);
            if (b == null) {
                return b;
            }
            f11265c.mo11390a(this.f11269g, str, str2, b, f11267e);
            return b;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11371a() {
        f11265c.mo11395d(this.f11269g);
    }

    /* renamed from: b */
    public final String mo11372b(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.f11269g) ? str : this.f11269g;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        String a = C3360g.m15212a(f11266d.mo11383a(bundle, m15195c()));
        if (!"RST".equals(a) && !a.startsWith("RST|")) {
            return a;
        }
        C3355b.m15203a(this.f11268f, f11265c);
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
