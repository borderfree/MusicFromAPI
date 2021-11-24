package com.pollfish.p150f;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.pollfish.constants.Position;
import com.pollfish.interfaces.C5174a.C5176b;
import com.pollfish.interfaces.C5174a.C5178d;
import com.pollfish.p145a.C5106b;
import com.pollfish.p145a.C5108c;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: com.pollfish.f.c */
public class C5166c {
    /* renamed from: a */
    public static float m25525a(float f, Context context) {
        return f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    /* renamed from: a */
    public static int m25526a(int i, Context context) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static int m25527a(Activity activity, String str) {
        SharedPreferences sharedPreferences = activity.getBaseContext().getSharedPreferences("pollfish_pref", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("pollfish_pref");
        sb.append(str);
        int i = sharedPreferences.getInt(sb.toString(), 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("retrieveKeyFromPref: ");
        sb2.append(i);
        C5162b.m25518a("PollfishUtilities", sb2.toString());
        return i;
    }

    /* renamed from: a */
    public static int m25528a(Bitmap bitmap, String str) {
        String str2;
        String str3 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(bitmap.getWidth() + bitmap.getHeight());
            sb.append(str);
            sb.append(bitmap.getPixel(0, 0) + bitmap.getPixel((bitmap.getWidth() / 2) - 1, (bitmap.getHeight() / 3) - 1) + bitmap.getPixel(bitmap.getWidth() - 1, bitmap.getHeight() - 1));
            str2 = sb.toString();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getBitmapSecurityHash Exception: ");
            sb2.append(e);
            C5162b.m25519b("PollfishUtilities", sb2.toString());
            str2 = str3;
        }
        return str2.hashCode();
    }

    /* renamed from: a */
    public static Animation m25529a(View view, Position position, int i, long j) {
        if (view == null) {
            return null;
        }
        TranslateAnimation translateAnimation = position == Position.TOP_LEFT ? new TranslateAnimation((float) (-(view.getWidth() * 2)), 0.0f, 0.0f, 0.0f) : position == Position.BOTTOM_LEFT ? new TranslateAnimation((float) (-(view.getWidth() * 2)), 0.0f, 0.0f, 0.0f) : position == Position.TOP_RIGHT ? new TranslateAnimation((float) (view.getWidth() * 2), 0.0f, 0.0f, 0.0f) : position == Position.BOTTOM_RIGHT ? new TranslateAnimation((float) (view.getWidth() * 2), 0.0f, 0.0f, 0.0f) : position == Position.MIDDLE_RIGHT ? new TranslateAnimation((float) (view.getWidth() * 2), 0.0f, 0.0f, 0.0f) : position == Position.MIDDLE_LEFT ? new TranslateAnimation((float) (-(view.getWidth() * 2)), 0.0f, 0.0f, 0.0f) : new TranslateAnimation((float) (-(view.getWidth() * 2)), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(j);
        translateAnimation.setStartOffset((long) i);
        view.startAnimation(translateAnimation);
        return translateAnimation;
    }

    /* renamed from: a */
    public static C5106b m25530a(String str, C5108c cVar, C5178d dVar, C5176b bVar, Activity activity, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        String str2 = str;
        C5162b.m25518a("PollfishUtilities", "parse Register Response ");
        StringBuilder sb = new StringBuilder();
        sb.append("hasAccepted: ");
        sb.append(z);
        C5162b.m25518a("PollfishUtilities", sb.toString());
        if (str2 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("response_type");
            int i2 = jSONObject.getInt("intrusion");
            int i3 = jSONObject.getInt("width_percentage");
            int i4 = jSONObject.getInt("height_percentage");
            String string2 = jSONObject.getString("content");
            String string3 = jSONObject.getString("s_id");
            boolean z4 = jSONObject.getBoolean("custom_indicator");
            String string4 = jSONObject.getString("indicator_image_left");
            String string5 = jSONObject.getString("indicator_image_right");
            String string6 = jSONObject.getString("mobile_data");
            String string7 = jSONObject.getString("assets");
            String string8 = jSONObject.getString("background_color");
            try {
                z3 = jSONObject.getBoolean("short_survey");
                try {
                    i = jSONObject.getInt("survey_price");
                    z2 = z3;
                } catch (Exception e) {
                    e = e;
                    String str3 = "PollfishUtilities";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("error while parsing short surveys pair: ");
                    sb2.append(e);
                    C5162b.m25519b(str3, sb2.toString());
                    z2 = z3;
                    i = 0;
                    C5106b bVar2 = new C5106b(string3, string, i2, string2, z4, string4, string5, i3, i4, cVar.mo16613C(), dVar, string6, string7, bVar, activity, string8, z, z2, i);
                    return bVar2;
                }
            } catch (Exception e2) {
                e = e2;
                z3 = false;
                String str32 = "PollfishUtilities";
                StringBuilder sb22 = new StringBuilder();
                sb22.append("error while parsing short surveys pair: ");
                sb22.append(e);
                C5162b.m25519b(str32, sb22.toString());
                z2 = z3;
                i = 0;
                C5106b bVar22 = new C5106b(string3, string, i2, string2, z4, string4, string5, i3, i4, cVar.mo16613C(), dVar, string6, string7, bVar, activity, string8, z, z2, i);
                return bVar22;
            }
            C5106b bVar222 = new C5106b(string3, string, i2, string2, z4, string4, string5, i3, i4, cVar.mo16613C(), dVar, string6, string7, bVar, activity, string8, z, z2, i);
            return bVar222;
        } catch (Exception e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("error while parsing server register response: ");
            sb3.append(e3);
            C5162b.m25519b("PollfishUtilities", sb3.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m25531a() {
        try {
            return VERSION.RELEASE;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getOSversion:");
            sb.append(e);
            C5162b.m25519b("PollfishUtilities", sb.toString());
            return "unknown";
        }
    }

    /* renamed from: a */
    public static String m25532a(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "HmacSHA256");
            Mac instance = Mac.getInstance(secretKeySpec.getAlgorithm());
            instance.init(secretKeySpec);
            return m25533a(instance.doFinal(str.getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            throw new SignatureException("error building signature, no such algorithm in device HmacSHA256");
        } catch (InvalidKeyException unused2) {
            throw new SignatureException("error building signature, invalid key HmacSHA256");
        }
    }

    /* renamed from: a */
    public static String m25533a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        Formatter formatter = new Formatter(sb);
        for (byte valueOf : bArr) {
            formatter.format("%02x", new Object[]{Byte.valueOf(valueOf)});
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static JSONObject m25534a(C5108c cVar) {
        JSONObject jSONObject = new JSONObject();
        if (cVar != null) {
            try {
                jSONObject.put("device_descr", cVar.mo16630d());
                if (cVar.mo16645r() != null) {
                    jSONObject.put("provider", cVar.mo16645r());
                }
                if (cVar.mo16632e() != null) {
                    jSONObject.put("provider_mcc", cVar.mo16632e());
                }
                if (cVar.mo16633f() != null) {
                    jSONObject.put("provider_mnc", cVar.mo16633f());
                }
                if (cVar.mo16644q() != null) {
                    jSONObject.put("nfc_enabled", cVar.mo16644q());
                }
                if (cVar.mo16643p() != null) {
                    jSONObject.put("nfc_exists", cVar.mo16643p());
                }
                if (cVar.mo16622L() != null) {
                    jSONObject.put("app_id", cVar.mo16622L());
                }
                jSONObject.put("os", cVar.mo16634g());
                jSONObject.put("os_ver", cVar.mo16635h());
                if (cVar.mo16649v() != null) {
                    jSONObject.put("scr_h", cVar.mo16649v());
                }
                if (cVar.mo16650w() != null) {
                    jSONObject.put("scr_w", cVar.mo16650w());
                }
                jSONObject.put("manufacturer", cVar.mo16637j());
                if (cVar.mo16618H() != null) {
                    jSONObject.put("app_version", cVar.mo16618H());
                }
                if (cVar.mo16619I() != null) {
                    jSONObject.put("con_type", cVar.mo16619I());
                }
                if (cVar.mo16647t() != null) {
                    if (cVar.mo16651x() != null) {
                        jSONObject.put("lat", cVar.mo16651x());
                    }
                    if (cVar.mo16652y() != null) {
                        jSONObject.put("lon", cVar.mo16652y());
                    }
                    if (cVar.mo16653z() != null) {
                        jSONObject.put("accuracy", cVar.mo16653z());
                    }
                }
                if (cVar.mo16636i() != null) {
                    jSONObject.put("locale", cVar.mo16636i());
                }
                jSONObject.put("scr_size", cVar.mo16646s());
                if (cVar.mo16638k() != null) {
                    jSONObject.put("is_roaming", cVar.mo16638k());
                }
                if (cVar.mo16640m() != null) {
                    jSONObject.put("accessibility_enabled", cVar.mo16640m());
                }
                if (cVar.mo16641n() != null) {
                    jSONObject.put("developer_enabled", cVar.mo16641n());
                }
                if (cVar.mo16642o() != null) {
                    jSONObject.put("install_non_market_apps", cVar.mo16642o());
                }
                jSONObject.put("hardware_accelerated", cVar.mo16616F());
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("error: ");
                sb.append(e);
                C5162b.m25519b("PollfishUtilities", sb.toString());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m25535a(Activity activity, String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("saveKeyInPref: ");
        sb.append(i);
        C5162b.m25518a("PollfishUtilities", sb.toString());
        Editor edit = activity.getBaseContext().getSharedPreferences("pollfish_pref", 0).edit();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("pollfish_pref");
        sb2.append(str);
        edit.putInt(sb2.toString(), i);
        edit.commit();
    }

    /* renamed from: a */
    public static void m25536a(Context context, Runnable runnable, int i) {
        try {
            new Handler(context.getMainLooper()).postDelayed(runnable, (long) i);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("postRunnableInMainThread:");
            sb.append(e);
            C5162b.m25519b("PollfishUtilities", sb.toString());
        }
    }

    /* renamed from: a */
    public static boolean m25537a(Activity activity) {
        boolean z = false;
        try {
            if (activity.getPackageManager().checkPermission("android.permission.INTERNET", activity.getPackageName()) == 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("permissionsGranted:");
            sb.append(e);
            C5162b.m25519b("PollfishUtilities", sb.toString());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m25538a(View view) {
        try {
            return view.isHardwareAccelerated();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m25539a(String str, int i) {
        return i < str.length() && str.charAt(i) == '1';
    }

    /* renamed from: b */
    public static Animation m25540b(View view, Position position, int i, long j) {
        if (view == null) {
            return null;
        }
        TranslateAnimation translateAnimation = position == Position.TOP_LEFT ? new TranslateAnimation(0.0f, (float) (-(view.getWidth() * 2)), 0.0f, 0.0f) : position == Position.BOTTOM_LEFT ? new TranslateAnimation(0.0f, (float) (-(view.getWidth() * 2)), 0.0f, 0.0f) : position == Position.TOP_RIGHT ? new TranslateAnimation(0.0f, (float) (view.getWidth() * 2), 0.0f, 0.0f) : position == Position.BOTTOM_RIGHT ? new TranslateAnimation(0.0f, (float) (view.getWidth() * 2), 0.0f, 0.0f) : position == Position.MIDDLE_RIGHT ? new TranslateAnimation(0.0f, (float) (view.getWidth() * 2), 0.0f, 0.0f) : position == Position.BOTTOM_LEFT ? new TranslateAnimation(0.0f, (float) (-(view.getWidth() * 2)), 0.0f, 0.0f) : new TranslateAnimation(0.0f, (float) (-(view.getWidth() * 2)), 0.0f, 0.0f);
        translateAnimation.setDuration(j);
        translateAnimation.setStartOffset((long) i);
        view.startAnimation(translateAnimation);
        return translateAnimation;
    }

    /* renamed from: b */
    public static String m25541b() {
        String language = Locale.getDefault().getLanguage();
        if (language.equalsIgnoreCase("") || language == null) {
            return null;
        }
        return language;
    }

    /* renamed from: b */
    public static boolean m25542b(Activity activity) {
        C5162b.m25518a("PollfishUtilities", "--isRunningOnEmulator()--");
        boolean z = true;
        try {
            String str = Build.MODEL;
            StringBuilder sb = new StringBuilder();
            sb.append("model :");
            sb.append(str);
            C5162b.m25518a("PollfishUtilities", sb.toString());
            String str2 = Build.PRODUCT;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("product: ");
            sb2.append(str2);
            C5162b.m25518a("PollfishUtilities", sb2.toString());
            String str3 = Build.MANUFACTURER;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("manufacturer: ");
            sb3.append(str3);
            C5162b.m25518a("PollfishUtilities", sb3.toString());
            String str4 = Build.FINGERPRINT;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("fingerprint: ");
            sb4.append(str3);
            C5162b.m25518a("PollfishUtilities", sb4.toString());
            String str5 = Build.DEVICE;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Device: ");
            sb5.append(str5);
            C5162b.m25518a("PollfishUtilities", sb5.toString());
            String str6 = Build.BRAND;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Brand: ");
            sb6.append(str6);
            C5162b.m25518a("PollfishUtilities", sb6.toString());
            String str7 = Build.HARDWARE;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Hardware: ");
            sb7.append(str7);
            C5162b.m25518a("PollfishUtilities", sb7.toString());
            if (!str4.startsWith("generic") && !str4.startsWith("unknown") && !str.contains("google_sdk") && !str.contains("Emulator") && !str.contains("Android SDK built for x86") && !str3.contains("Genymotion") && !str2.equals("sdk") && !str2.contains("_sdk") && !str2.contains("sdk_") && !str2.matches(".*_?sdk_?.*") && !str2.contains("google_sdk") && !str6.startsWith("generic") && !str5.startsWith("generic") && !str7.equalsIgnoreCase("goldfish")) {
                z = false;
            }
        } catch (Exception e) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("isRunningOnEmulator exception: ");
            sb8.append(e);
            C5162b.m25519b("PollfishUtilities", sb8.toString());
        }
        StringBuilder sb9 = new StringBuilder();
        sb9.append("runningOnEmulator: ");
        sb9.append(z);
        C5162b.m25518a("PollfishUtilities", sb9.toString());
        return z;
    }

    /* renamed from: c */
    public static String m25543c() {
        try {
            return String.valueOf(VERSION.SDK_INT);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getAPIVersion e:");
            sb.append(e);
            C5162b.m25519b("PollfishUtilities", sb.toString());
            return "unknown";
        }
    }

    /* renamed from: c */
    public static boolean m25544c(Activity activity) {
        try {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            View view = null;
            if (viewGroup != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("DecorView getChildCount(): ");
                sb.append(viewGroup.getChildCount());
                C5162b.m25518a("PollfishUtilities", sb.toString());
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    } else if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                        C5162b.m25518a("PollfishUtilities", "found a child view with type ViewGroup");
                        view = viewGroup.getChildAt(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (view != null) {
                return view.isHardwareAccelerated();
            }
            return false;
        } catch (NoSuchMethodError e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isTopViewHardwareAccelerated - NoSuchMethodError:");
            sb2.append(e);
            C5162b.m25520c("PollfishUtilities", sb2.toString());
            return false;
        } catch (ClassCastException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("isTopViewHardwareAccelerated - ClassCastException:");
            sb3.append(e2);
            C5162b.m25519b("PollfishUtilities", sb3.toString());
            return false;
        } catch (Exception e3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("isTopViewHardwareAccelerated - Exception:");
            sb4.append(e3);
            C5162b.m25519b("PollfishUtilities", sb4.toString());
            return false;
        }
    }

    /* renamed from: d */
    public static String m25545d() {
        try {
            String str = Build.MANUFACTURER;
            return str != null ? str : "unknown";
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getManufacturer e:");
            sb.append(e);
            C5162b.m25519b("PollfishUtilities", sb.toString());
            return "unknown";
        }
    }

    /* renamed from: d */
    public static String m25546d(Activity activity) {
        try {
            String networkOperator = ((TelephonyManager) activity.getSystemService("phone")).getNetworkOperator();
            if (networkOperator == null || networkOperator.length() < 3) {
                return null;
            }
            return networkOperator.substring(0, 3);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getMCC:");
            sb.append(e);
            C5162b.m25519b("PollfishUtilities", sb.toString());
            return null;
        }
    }

    /* renamed from: e */
    public static String m25547e() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MODEL);
            sb.append(" (");
            sb.append(Build.PRODUCT);
            sb.append(")");
            return sb.toString();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getModelProductName e:");
            sb2.append(e);
            C5162b.m25519b("PollfishUtilities", sb2.toString());
            return "unknown";
        }
    }

    /* renamed from: e */
    public static String m25548e(Activity activity) {
        try {
            String networkOperator = ((TelephonyManager) activity.getSystemService("phone")).getNetworkOperator();
            if (networkOperator == null || networkOperator.length() < 3) {
                return null;
            }
            return networkOperator.substring(3);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getMNC:");
            sb.append(e);
            C5162b.m25519b("PollfishUtilities", sb.toString());
            return null;
        }
    }

    /* renamed from: f */
    public static String m25549f(Activity activity) {
        try {
            return ((TelephonyManager) activity.getSystemService("phone")).isNetworkRoaming() ? "true" : "false";
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("isRoaming:");
            sb.append(e);
            C5162b.m25519b("PollfishUtilities", sb.toString());
            return null;
        }
    }

    /* renamed from: g */
    public static String m25550g(Activity activity) {
        try {
            return Secure.getInt(activity.getContentResolver(), "accessibility_enabled") == 1 ? "true" : "false";
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("isAccessibilityEnabled:");
            sb.append(e);
            C5162b.m25520c("PollfishUtilities", sb.toString());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[Catch:{ SettingNotFoundException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[Catch:{ SettingNotFoundException -> 0x0045 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m25551h(android.app.Activity r5) {
        /*
            r0 = 1
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch:{ Exception -> 0x001c, NoClassDefFoundError -> 0x0013 }
            java.lang.String r2 = "adb_enabled"
            int r1 = android.provider.Settings.Global.getInt(r1, r2)     // Catch:{ Exception -> 0x001c, NoClassDefFoundError -> 0x0013 }
            if (r1 != r0) goto L_0x0010
            java.lang.String r1 = "true"
            goto L_0x0012
        L_0x0010:
            java.lang.String r1 = "false"
        L_0x0012:
            return r1
        L_0x0013:
            r1 = move-exception
            java.lang.String r2 = "PollfishUtilities"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0024
        L_0x001c:
            r1 = move-exception
            java.lang.String r2 = "PollfishUtilities"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0024:
            java.lang.String r4 = "isUsbDebuggindEnabled:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.pollfish.p150f.C5162b.m25520c(r2, r1)
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0045 }
            java.lang.String r1 = "adb_enabled"
            int r5 = android.provider.Settings.Secure.getInt(r5, r1)     // Catch:{ SettingNotFoundException -> 0x0045 }
            if (r5 != r0) goto L_0x0042
            java.lang.String r5 = "true"
            goto L_0x0044
        L_0x0042:
            java.lang.String r5 = "false"
        L_0x0044:
            return r5
        L_0x0045:
            r5 = move-exception
            java.lang.String r0 = "PollfishUtilities"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isUsbDebuggindEnabled:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.pollfish.p150f.C5162b.m25519b(r0, r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p150f.C5166c.m25551h(android.app.Activity):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[Catch:{ SettingNotFoundException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[Catch:{ SettingNotFoundException -> 0x0045 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m25552i(android.app.Activity r5) {
        /*
            r0 = 1
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch:{ Exception -> 0x001c, NoClassDefFoundError -> 0x0013 }
            java.lang.String r2 = "install_non_market_apps"
            int r1 = android.provider.Settings.Global.getInt(r1, r2)     // Catch:{ Exception -> 0x001c, NoClassDefFoundError -> 0x0013 }
            if (r1 != r0) goto L_0x0010
            java.lang.String r1 = "true"
            goto L_0x0012
        L_0x0010:
            java.lang.String r1 = "false"
        L_0x0012:
            return r1
        L_0x0013:
            r1 = move-exception
            java.lang.String r2 = "PollfishUtilities"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0024
        L_0x001c:
            r1 = move-exception
            java.lang.String r2 = "PollfishUtilities"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0024:
            java.lang.String r4 = "isInstallNonMarkerAppsEnabled:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.pollfish.p150f.C5162b.m25520c(r2, r1)
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0045 }
            java.lang.String r1 = "install_non_market_apps"
            int r5 = android.provider.Settings.Secure.getInt(r5, r1)     // Catch:{ SettingNotFoundException -> 0x0045 }
            if (r5 != r0) goto L_0x0042
            java.lang.String r5 = "true"
            goto L_0x0044
        L_0x0042:
            java.lang.String r5 = "false"
        L_0x0044:
            return r5
        L_0x0045:
            r5 = move-exception
            java.lang.String r0 = "PollfishUtilities"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isInstallNonMarkerAppsEnabled:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.pollfish.p150f.C5162b.m25519b(r0, r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p150f.C5166c.m25552i(android.app.Activity):java.lang.String");
    }

    /* renamed from: j */
    public static String m25553j(Activity activity) {
        String str;
        StringBuilder sb;
        try {
            return ((NfcManager) activity.getSystemService("nfc")).getDefaultAdapter() != null ? "true" : "false";
        } catch (NoSuchMethodError e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getIfNFCExists:");
            sb2.append(e);
            C5162b.m25520c("PollfishUtilities", sb2.toString());
            return "false";
        } catch (Exception e2) {
            e = e2;
            str = "PollfishUtilities";
            sb = new StringBuilder();
            sb.append("getIfNFCExists:");
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return "false";
        } catch (NoClassDefFoundError e3) {
            e = e3;
            str = "PollfishUtilities";
            sb = new StringBuilder();
            sb.append("getIfNFCExists:");
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return "false";
        }
    }

    /* renamed from: k */
    public static String m25554k(Activity activity) {
        String str;
        StringBuilder sb;
        String str2;
        try {
            NfcAdapter defaultAdapter = ((NfcManager) activity.getSystemService("nfc")).getDefaultAdapter();
            return (defaultAdapter == null || !defaultAdapter.isEnabled()) ? "false" : "true";
        } catch (NoSuchMethodError e) {
            e = e;
            str = "PollfishUtilities";
            sb = new StringBuilder();
            str2 = "getIfNFCExists:";
            sb.append(str2);
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return "false";
        } catch (Exception e2) {
            e = e2;
            str = "PollfishUtilities";
            sb = new StringBuilder();
            str2 = "getIfNFCEnabled:";
            sb.append(str2);
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return "false";
        } catch (NoClassDefFoundError e3) {
            e = e3;
            str = "PollfishUtilities";
            sb = new StringBuilder();
            str2 = "getIfNFCExists:";
            sb.append(str2);
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return "false";
        }
    }

    /* renamed from: l */
    public static String m25555l(Activity activity) {
        StringBuilder sb;
        String str;
        C5162b.m25518a("PollfishUtilities", "getAppPackageName");
        try {
            String packageName = activity.getApplicationContext().getPackageName();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("packageName: ");
            sb2.append(packageName);
            C5162b.m25518a("PollfishUtilities", sb2.toString());
            return packageName;
        } catch (Exception e) {
            e = e;
            str = "PollfishUtilities";
            sb = new StringBuilder();
            sb.append("getAppPackageName:");
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return null;
        } catch (NoClassDefFoundError e2) {
            e = e2;
            str = "PollfishUtilities";
            sb = new StringBuilder();
            sb.append("getAppPackageName:");
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return null;
        }
    }

    /* renamed from: m */
    public static String m25556m(Activity activity) {
        String str;
        StringBuilder sb;
        C5162b.m25518a("PollfishUtilities", "getInstalledApps");
        try {
            PackageManager packageManager = activity.getPackageManager();
            C5162b.m25518a("PollfishUtilities", "getInstalledApps begin");
            List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
            ArrayList arrayList = new ArrayList();
            for (ApplicationInfo applicationInfo : installedApplications) {
                if ((applicationInfo.flags & 1) != 1) {
                    arrayList.add(applicationInfo.packageName.toString());
                }
            }
            return arrayList.toString();
        } catch (Exception e) {
            e = e;
            str = "PollfishUtilities";
            sb = new StringBuilder();
            sb.append("getInstalledApps:");
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return null;
        } catch (NoClassDefFoundError e2) {
            e = e2;
            str = "PollfishUtilities";
            sb = new StringBuilder();
            sb.append("getInstalledApps:");
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return null;
        }
    }

    /* renamed from: n */
    public static String m25557n(Activity activity) {
        try {
            return ((WifiManager) activity.getSystemService("wifi")).getScanResults().toString();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWifis:");
            sb.append(e);
            C5162b.m25520c("PollfishUtilities", sb.toString());
            return null;
        } catch (NoClassDefFoundError e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getWifis:");
            sb2.append(e2);
            C5162b.m25519b("PollfishUtilities", sb2.toString());
            return null;
        }
    }

    /* renamed from: o */
    public static String m25558o(Activity activity) {
        C5162b.m25518a("PollfishUtilities", "getMacAddress");
        if (activity.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", activity.getPackageName()) == 0) {
            C5162b.m25518a("PollfishUtilities", "ACCESS_WIFI_STATE permission in place");
            try {
                String macAddress = ((WifiManager) activity.getSystemService("wifi")).getConnectionInfo().getMacAddress();
                if (macAddress == null) {
                    macAddress = "noMac";
                }
                return macAddress;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("noMac exception: ");
                sb.append(e);
                C5162b.m25519b("PollfishUtilities", sb.toString());
            }
        } else {
            C5162b.m25518a("PollfishUtilities", "No ACCESS_WIFI_STATE permission in place");
            return "noMac";
        }
    }

    /* renamed from: p */
    public static String m25559p(Activity activity) {
        try {
            String networkOperatorName = ((TelephonyManager) activity.getSystemService("phone")).getNetworkOperatorName();
            if (networkOperatorName == null) {
                return null;
            }
            return networkOperatorName;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getNetworkOperatorName e:");
            sb.append(e);
            C5162b.m25519b("PollfishUtilities", sb.toString());
            return null;
        }
    }

    /* renamed from: q */
    public static String m25560q(Activity activity) {
        try {
            PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
            String str = packageInfo.versionName;
            int i = packageInfo.versionCode;
            StringBuilder sb = new StringBuilder();
            sb.append("versionName:");
            sb.append(str);
            C5162b.m25518a("PollfishUtilities", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("versionCode:");
            sb2.append(i);
            C5162b.m25518a("PollfishUtilities", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("getAppVersion:");
            sb3.append(str);
            sb3.append(i);
            C5162b.m25518a("PollfishUtilities", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(i);
            return sb4.toString();
        } catch (Exception e) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("getAppVersion exception:");
            sb5.append(e);
            C5162b.m25518a("PollfishUtilities", sb5.toString());
            return null;
        }
    }

    /* renamed from: r */
    public static String m25561r(Activity activity) {
        C5162b.m25518a("PollfishUtilities", "getDeviceIMEI");
        try {
            if (activity.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", activity.getPackageName()) == 0) {
                C5162b.m25518a("PollfishUtilities", "READ_PHONE_STATE permission at place");
                String deviceId = ((TelephonyManager) activity.getSystemService("phone")).getDeviceId();
                StringBuilder sb = new StringBuilder();
                sb.append("getDeviceIME:");
                sb.append(deviceId);
                C5162b.m25518a("PollfishUtilities", sb.toString());
                return deviceId;
            }
            C5162b.m25518a("PollfishUtilities", "READ_PHONE_STATE permission not at place");
            return null;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getDeviceIME exception:");
            sb2.append(e);
            C5162b.m25518a("PollfishUtilities", sb2.toString());
            return null;
        }
    }

    /* renamed from: s */
    public static String m25562s(Activity activity) {
        NetworkInfo[] allNetworkInfo;
        C5162b.m25518a("PollfishUtilities", "getConnectionType");
        try {
            if (activity.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", activity.getPackageName()) == 0) {
                C5162b.m25518a("PollfishUtilities", "ACCESS_NETWORK_STATE permission at place");
                String str = null;
                for (NetworkInfo networkInfo : ((ConnectivityManager) activity.getSystemService("connectivity")).getAllNetworkInfo()) {
                    if (networkInfo.isConnected()) {
                        str = networkInfo.getTypeName();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getConnectionType:");
                sb.append(str);
                C5162b.m25518a("PollfishUtilities", sb.toString());
                return str;
            }
            C5162b.m25518a("PollfishUtilities", "ACCESS_NETWORK_STATE permission not at place");
            return null;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getDeviceIME exception:");
            sb2.append(e);
            C5162b.m25518a("PollfishUtilities", sb2.toString());
            return null;
        }
    }

    /* renamed from: t */
    public static Location m25563t(Activity activity) {
        Location location;
        Location location2;
        C5162b.m25518a("PollfishUtilities", "getUserLocationFromManager");
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", activity.getPackageName()) == 0 || packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", activity.getPackageName()) == 0) {
            LocationManager locationManager = (LocationManager) activity.getSystemService("location");
            C5162b.m25518a("PollfishUtilities", "At least one location permission at place");
            try {
                C5162b.m25518a("PollfishUtilities", "getting last known location from LocationManager.GPS_PROVIDER");
                location2 = locationManager.getLastKnownLocation("gps");
            } catch (Exception unused) {
                C5162b.m25519b("PollfishUtilities", "Exception in getting last known location from LocationManager.GPS_PROVIDER");
                location2 = null;
            }
            if (location2 == null) {
                try {
                    C5162b.m25518a("PollfishUtilities", "getting last known location from LocationManager.NETWORK_PROVIDER");
                    location2 = locationManager.getLastKnownLocation("network");
                } catch (Exception unused2) {
                    C5162b.m25519b("PollfishUtilities", "Exception in getting known knwon location from LocationManager.NETWORK_PROVIDER");
                }
            }
            if (location2 == null) {
                try {
                    C5162b.m25518a("PollfishUtilities", "getting last known location from LocationManager.PASSIVE_PROVIDER");
                    location = locationManager.getLastKnownLocation("passive");
                } catch (Exception unused3) {
                    C5162b.m25519b("PollfishUtilities", "Exception in getting last knwon location from LocationManager.NETWORK_PROVIDER");
                }
            }
            location = location2;
        } else {
            C5162b.m25518a("PollfishUtilities", "No location permission at place");
            location = null;
        }
        if (location == null) {
            C5162b.m25518a("PollfishUtilities", "Location == null");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Location-> lat: ");
        sb.append(location.getLatitude());
        sb.append(" lon: ");
        sb.append(location.getLongitude());
        C5162b.m25518a("PollfishUtilities", sb.toString());
        return location;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point m25564u(android.app.Activity r3) {
        /*
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch:{ Exception -> 0x0050 }
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch:{ Exception -> 0x0050 }
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch:{ Exception -> 0x0050 }
            android.graphics.Point r0 = new android.graphics.Point     // Catch:{ Exception -> 0x0050 }
            r0.<init>()     // Catch:{ Exception -> 0x0050 }
            r3.getSize(r0)     // Catch:{ NoSuchMethodError -> 0x0022, Exception -> 0x0015 }
            goto L_0x002d
        L_0x0015:
            int r1 = r3.getWidth()     // Catch:{ Exception -> 0x0050 }
            r0.x = r1     // Catch:{ Exception -> 0x0050 }
            int r3 = r3.getHeight()     // Catch:{ Exception -> 0x0050 }
        L_0x001f:
            r0.y = r3     // Catch:{ Exception -> 0x0050 }
            goto L_0x002d
        L_0x0022:
            int r1 = r3.getWidth()     // Catch:{ Exception -> 0x0050 }
            r0.x = r1     // Catch:{ Exception -> 0x0050 }
            int r3 = r3.getHeight()     // Catch:{ Exception -> 0x0050 }
            goto L_0x001f
        L_0x002d:
            java.lang.String r3 = "PollfishUtilities"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0050 }
            r1.<init>()     // Catch:{ Exception -> 0x0050 }
            java.lang.String r2 = "getScreenDimensions screen width:"
            r1.append(r2)     // Catch:{ Exception -> 0x0050 }
            int r2 = r0.x     // Catch:{ Exception -> 0x0050 }
            r1.append(r2)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r2 = "  screen height:"
            r1.append(r2)     // Catch:{ Exception -> 0x0050 }
            int r2 = r0.y     // Catch:{ Exception -> 0x0050 }
            r1.append(r2)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0050 }
            com.pollfish.p150f.C5162b.m25518a(r3, r1)     // Catch:{ Exception -> 0x0050 }
            return r0
        L_0x0050:
            r3 = move-exception
            java.lang.String r0 = "PollfishUtilities"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getScreenDimensions e:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            com.pollfish.p150f.C5162b.m25519b(r0, r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p150f.C5166c.m25564u(android.app.Activity):android.graphics.Point");
    }

    /* renamed from: v */
    public static String m25565v(Activity activity) {
        int i;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getMetrics(displayMetrics);
            Point point = new Point();
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            try {
                defaultDisplay.getSize(point);
                i = point.x;
                try {
                    i3 = point.y;
                } catch (NoSuchMethodError unused) {
                    C5162b.m25520c("PollfishUtilities", "NoSuchMethodError getScreenInch from metrics");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Screen width  : ");
                    sb.append(i);
                    C5162b.m25518a("PollfishUtilities", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Screen height  : ");
                    sb2.append(i3);
                    C5162b.m25518a("PollfishUtilities", sb2.toString());
                    double d = (double) i;
                    double d2 = (double) displayMetrics.densityDpi;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    double d3 = d / d2;
                    double d4 = (double) i3;
                    Double.isNaN(d4);
                    Double.isNaN(d2);
                    double sqrt = Math.sqrt(Math.pow(d3, 2.0d) + Math.pow(d4 / d2, 2.0d));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Screen dm.xdpi  : ");
                    sb3.append(displayMetrics.xdpi);
                    C5162b.m25518a("PollfishUtilities", sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Screen dm.ydpi  : ");
                    sb4.append(displayMetrics.ydpi);
                    C5162b.m25518a("PollfishUtilities", sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Screen dm.density : ");
                    sb5.append(displayMetrics.density);
                    C5162b.m25518a("PollfishUtilities", sb5.toString());
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Screen inches : ");
                    sb6.append(sqrt);
                    C5162b.m25518a("PollfishUtilities", sb6.toString());
                    return String.valueOf(sqrt);
                } catch (Exception e) {
                    e = e;
                    String str = "PollfishUtilities";
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("Exception get screen from metrics: ");
                    sb7.append(e);
                    C5162b.m25520c(str, sb7.toString());
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Screen width  : ");
                    sb8.append(i);
                    C5162b.m25518a("PollfishUtilities", sb8.toString());
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("Screen height  : ");
                    sb22.append(i3);
                    C5162b.m25518a("PollfishUtilities", sb22.toString());
                    double d5 = (double) i;
                    double d22 = (double) displayMetrics.densityDpi;
                    Double.isNaN(d5);
                    Double.isNaN(d22);
                    double d32 = d5 / d22;
                    double d42 = (double) i3;
                    Double.isNaN(d42);
                    Double.isNaN(d22);
                    double sqrt2 = Math.sqrt(Math.pow(d32, 2.0d) + Math.pow(d42 / d22, 2.0d));
                    StringBuilder sb32 = new StringBuilder();
                    sb32.append("Screen dm.xdpi  : ");
                    sb32.append(displayMetrics.xdpi);
                    C5162b.m25518a("PollfishUtilities", sb32.toString());
                    StringBuilder sb42 = new StringBuilder();
                    sb42.append("Screen dm.ydpi  : ");
                    sb42.append(displayMetrics.ydpi);
                    C5162b.m25518a("PollfishUtilities", sb42.toString());
                    StringBuilder sb52 = new StringBuilder();
                    sb52.append("Screen dm.density : ");
                    sb52.append(displayMetrics.density);
                    C5162b.m25518a("PollfishUtilities", sb52.toString());
                    StringBuilder sb62 = new StringBuilder();
                    sb62.append("Screen inches : ");
                    sb62.append(sqrt2);
                    C5162b.m25518a("PollfishUtilities", sb62.toString());
                    return String.valueOf(sqrt2);
                }
            } catch (NoSuchMethodError unused2) {
                i = i2;
                C5162b.m25520c("PollfishUtilities", "NoSuchMethodError getScreenInch from metrics");
                StringBuilder sb82 = new StringBuilder();
                sb82.append("Screen width  : ");
                sb82.append(i);
                C5162b.m25518a("PollfishUtilities", sb82.toString());
                StringBuilder sb222 = new StringBuilder();
                sb222.append("Screen height  : ");
                sb222.append(i3);
                C5162b.m25518a("PollfishUtilities", sb222.toString());
                double d52 = (double) i;
                double d222 = (double) displayMetrics.densityDpi;
                Double.isNaN(d52);
                Double.isNaN(d222);
                double d322 = d52 / d222;
                double d422 = (double) i3;
                Double.isNaN(d422);
                Double.isNaN(d222);
                double sqrt22 = Math.sqrt(Math.pow(d322, 2.0d) + Math.pow(d422 / d222, 2.0d));
                StringBuilder sb322 = new StringBuilder();
                sb322.append("Screen dm.xdpi  : ");
                sb322.append(displayMetrics.xdpi);
                C5162b.m25518a("PollfishUtilities", sb322.toString());
                StringBuilder sb422 = new StringBuilder();
                sb422.append("Screen dm.ydpi  : ");
                sb422.append(displayMetrics.ydpi);
                C5162b.m25518a("PollfishUtilities", sb422.toString());
                StringBuilder sb522 = new StringBuilder();
                sb522.append("Screen dm.density : ");
                sb522.append(displayMetrics.density);
                C5162b.m25518a("PollfishUtilities", sb522.toString());
                StringBuilder sb622 = new StringBuilder();
                sb622.append("Screen inches : ");
                sb622.append(sqrt22);
                C5162b.m25518a("PollfishUtilities", sb622.toString());
                return String.valueOf(sqrt22);
            } catch (Exception e2) {
                e = e2;
                i = i2;
                String str2 = "PollfishUtilities";
                StringBuilder sb72 = new StringBuilder();
                sb72.append("Exception get screen from metrics: ");
                sb72.append(e);
                C5162b.m25520c(str2, sb72.toString());
                StringBuilder sb822 = new StringBuilder();
                sb822.append("Screen width  : ");
                sb822.append(i);
                C5162b.m25518a("PollfishUtilities", sb822.toString());
                StringBuilder sb2222 = new StringBuilder();
                sb2222.append("Screen height  : ");
                sb2222.append(i3);
                C5162b.m25518a("PollfishUtilities", sb2222.toString());
                double d522 = (double) i;
                double d2222 = (double) displayMetrics.densityDpi;
                Double.isNaN(d522);
                Double.isNaN(d2222);
                double d3222 = d522 / d2222;
                double d4222 = (double) i3;
                Double.isNaN(d4222);
                Double.isNaN(d2222);
                double sqrt222 = Math.sqrt(Math.pow(d3222, 2.0d) + Math.pow(d4222 / d2222, 2.0d));
                StringBuilder sb3222 = new StringBuilder();
                sb3222.append("Screen dm.xdpi  : ");
                sb3222.append(displayMetrics.xdpi);
                C5162b.m25518a("PollfishUtilities", sb3222.toString());
                StringBuilder sb4222 = new StringBuilder();
                sb4222.append("Screen dm.ydpi  : ");
                sb4222.append(displayMetrics.ydpi);
                C5162b.m25518a("PollfishUtilities", sb4222.toString());
                StringBuilder sb5222 = new StringBuilder();
                sb5222.append("Screen dm.density : ");
                sb5222.append(displayMetrics.density);
                C5162b.m25518a("PollfishUtilities", sb5222.toString());
                StringBuilder sb6222 = new StringBuilder();
                sb6222.append("Screen inches : ");
                sb6222.append(sqrt222);
                C5162b.m25518a("PollfishUtilities", sb6222.toString());
                return String.valueOf(sqrt222);
            }
            StringBuilder sb8222 = new StringBuilder();
            sb8222.append("Screen width  : ");
            sb8222.append(i);
            C5162b.m25518a("PollfishUtilities", sb8222.toString());
            StringBuilder sb22222 = new StringBuilder();
            sb22222.append("Screen height  : ");
            sb22222.append(i3);
            C5162b.m25518a("PollfishUtilities", sb22222.toString());
            double d5222 = (double) i;
            double d22222 = (double) displayMetrics.densityDpi;
            Double.isNaN(d5222);
            Double.isNaN(d22222);
            double d32222 = d5222 / d22222;
            double d42222 = (double) i3;
            Double.isNaN(d42222);
            Double.isNaN(d22222);
            double sqrt2222 = Math.sqrt(Math.pow(d32222, 2.0d) + Math.pow(d42222 / d22222, 2.0d));
            StringBuilder sb32222 = new StringBuilder();
            sb32222.append("Screen dm.xdpi  : ");
            sb32222.append(displayMetrics.xdpi);
            C5162b.m25518a("PollfishUtilities", sb32222.toString());
            StringBuilder sb42222 = new StringBuilder();
            sb42222.append("Screen dm.ydpi  : ");
            sb42222.append(displayMetrics.ydpi);
            C5162b.m25518a("PollfishUtilities", sb42222.toString());
            StringBuilder sb52222 = new StringBuilder();
            sb52222.append("Screen dm.density : ");
            sb52222.append(displayMetrics.density);
            C5162b.m25518a("PollfishUtilities", sb52222.toString());
            StringBuilder sb62222 = new StringBuilder();
            sb62222.append("Screen inches : ");
            sb62222.append(sqrt2222);
            C5162b.m25518a("PollfishUtilities", sb62222.toString());
            return String.valueOf(sqrt2222);
        } catch (Exception e3) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("getScreenInch e:");
            sb9.append(e3);
            C5162b.m25519b("PollfishUtilities", sb9.toString());
            return "unknown";
        }
    }
}
