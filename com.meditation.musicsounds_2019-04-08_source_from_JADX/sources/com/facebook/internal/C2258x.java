package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C2189f;
import com.facebook.C2199i;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1609b;
import com.facebook.HttpMethod;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.x */
public final class C2258x {

    /* renamed from: a */
    private static int f7263a = 0;

    /* renamed from: b */
    private static long f7264b = -1;

    /* renamed from: c */
    private static long f7265c = -1;

    /* renamed from: d */
    private static long f7266d = -1;

    /* renamed from: e */
    private static String f7267e = "";

    /* renamed from: f */
    private static String f7268f = "";

    /* renamed from: g */
    private static String f7269g = "NoCarrier";

    /* renamed from: com.facebook.internal.x$a */
    public interface C2261a {
        /* renamed from: a */
        void mo6621a(FacebookException facebookException);

        /* renamed from: a */
        void mo6622a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.internal.x$b */
    public interface C2262b<T, K> {
        /* renamed from: a */
        K mo7886a(T t);
    }

    /* renamed from: com.facebook.internal.x$c */
    public static class C2263c {

        /* renamed from: a */
        List<String> f7272a;

        /* renamed from: b */
        List<String> f7273b;

        public C2263c(List<String> list, List<String> list2) {
            this.f7272a = list;
            this.f7273b = list2;
        }

        /* renamed from: a */
        public List<String> mo7887a() {
            return this.f7272a;
        }

        /* renamed from: b */
        public List<String> mo7888b() {
            return this.f7273b;
        }
    }

    /* renamed from: a */
    private static int m10355a() {
        if (f7263a > 0) {
            return f7263a;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]+", str);
                }
            });
            if (listFiles != null) {
                f7263a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f7263a <= 0) {
            f7263a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f7263a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m10356a(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0023 }
            r1.<init>(r6)     // Catch:{ all -> 0x0023 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0021 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            r1.close()
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r3
        L_0x0021:
            r7 = move-exception
            goto L_0x0025
        L_0x0023:
            r7 = move-exception
            r1 = r0
        L_0x0025:
            if (r1 == 0) goto L_0x002a
            r1.close()
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.close()
        L_0x002f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2258x.m10356a(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: a */
    private static long m10357a(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: a */
    public static Uri m10358a(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: a */
    public static C2263c m10359a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("permission");
            if (optString != null && !optString.equals("installed")) {
                String optString2 = optJSONObject.optString("status");
                if (optString2 != null) {
                    if (optString2.equals("granted")) {
                        arrayList.add(optString);
                    } else if (optString2.equals("declined")) {
                        arrayList2.add(optString);
                    }
                }
            }
        }
        return new C2263c(arrayList, arrayList2);
    }

    /* renamed from: a */
    public static Object m10360a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m10361a(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    /* renamed from: a */
    public static String m10362a(int i) {
        return new BigInteger(i * 5, new Random()).toString(32);
    }

    /* renamed from: a */
    public static String m10363a(Context context) {
        C2264y.m10422a((Object) context, "context");
        C2189f.m10080a(context);
        return C2189f.m10096j();
    }

    /* renamed from: a */
    public static String m10364a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    /* renamed from: a */
    public static String m10365a(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            m10380a((Closeable) bufferedInputStream);
                            m10380a((Closeable) inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m10380a((Closeable) bufferedInputStream);
                    m10380a((Closeable) inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m10380a((Closeable) bufferedInputStream);
                m10380a((Closeable) inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m10380a((Closeable) bufferedInputStream);
            m10380a((Closeable) inputStreamReader);
            throw th;
        }
    }

    /* renamed from: a */
    private static String m10366a(String str, byte[] bArr) {
        try {
            return m10367a(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m10367a(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m10368a(byte[] bArr) {
        return m10366a("SHA-1", bArr);
    }

    /* renamed from: a */
    public static Method m10369a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m10370a(String str, String str2, Class<?>... clsArr) {
        try {
            return m10369a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T> Collection<T> m10371a(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    /* renamed from: a */
    public static Date m10372a(Bundle bundle, String str, Date date) {
        long j;
        Date date2 = null;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    j = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return date2;
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        date2 = new Date(date.getTime() + (j * 1000));
        return date2;
    }

    /* renamed from: a */
    public static <T, K> List<K> m10373a(List<T> list, C2262b<T, K> bVar) {
        List<K> list2 = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T a : list) {
            Object a2 = bVar.mo7886a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.size() != 0) {
            list2 = arrayList;
        }
        return list2;
    }

    /* renamed from: a */
    public static List<String> m10374a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, String> m10375a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m10376a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split2[0].trim());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    instance.setCookie(str, sb.toString());
                }
            }
            instance.removeExpiredCookie();
        }
    }

    /* renamed from: a */
    public static void m10377a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m10378a(bundle, str, uri.toString());
        }
    }

    /* renamed from: a */
    public static void m10378a(Bundle bundle, String str, String str2) {
        if (!m10392a(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public static void m10379a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    /* renamed from: a */
    public static void m10380a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m10381a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File a : listFiles) {
                        m10381a(a);
                    }
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public static void m10382a(final String str, final C2261a aVar) {
        JSONObject a = C2256v.m10349a(str);
        if (a != null) {
            aVar.mo6622a(a);
            return;
        }
        C22591 r0 = new C1609b() {
            /* renamed from: a */
            public void mo6589a(C2199i iVar) {
                if (iVar.mo7795a() != null) {
                    aVar.mo6621a(iVar.mo7795a().mo6561h());
                    return;
                }
                C2256v.m10350a(str, iVar.mo7796b());
                aVar.mo6622a(iVar.mo7796b());
            }
        };
        GraphRequest d = m10404d(str);
        d.mo6572a((C1609b) r0);
        d.mo6585j();
    }

    /* renamed from: a */
    public static void m10383a(String str, Exception exc) {
        if (C2189f.m10086b() && str != null && exc != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(exc.getClass().getSimpleName());
            sb.append(": ");
            sb.append(exc.getMessage());
            Log.d(str, sb.toString());
        }
    }

    /* renamed from: a */
    public static void m10384a(String str, String str2) {
        if (C2189f.m10086b() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m10385a(String str, String str2, Throwable th) {
        if (C2189f.m10086b() && !m10392a(str)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m10386a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: a */
    public static void m10387a(JSONObject jSONObject, Context context) {
        int i;
        Locale locale;
        int i2;
        int i3;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        m10411f(context);
        String packageName = context.getPackageName();
        String str = "";
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i = packageInfo.versionCode;
            try {
                str = packageInfo.versionName;
            } catch (NameNotFoundException unused) {
            }
        } catch (NameNotFoundException unused2) {
            i = -1;
        }
        jSONArray.put(packageName);
        jSONArray.put(i);
        jSONArray.put(str);
        jSONArray.put(VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused3) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(f7267e);
        jSONArray.put(f7269g);
        double d = 0.0d;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i2 = displayMetrics.widthPixels;
                try {
                    i3 = displayMetrics.heightPixels;
                    try {
                        d = (double) displayMetrics.density;
                    } catch (Exception unused4) {
                    }
                } catch (Exception unused5) {
                }
                jSONArray.put(i2);
                jSONArray.put(i3);
                jSONArray.put(String.format("%.2f", new Object[]{Double.valueOf(d)}));
                jSONArray.put(m10355a());
                jSONArray.put(f7265c);
                jSONArray.put(f7266d);
                jSONArray.put(f7268f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused6) {
        }
        i2 = 0;
        i3 = 0;
        jSONArray.put(i2);
        jSONArray.put(i3);
        jSONArray.put(String.format("%.2f", new Object[]{Double.valueOf(d)}));
        jSONArray.put(m10355a());
        jSONArray.put(f7265c);
        jSONArray.put(f7266d);
        jSONArray.put(f7268f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: a */
    public static void m10388a(JSONObject jSONObject, C2202b bVar, String str, boolean z) {
        if (!(bVar == null || bVar.mo7813a() == null)) {
            jSONObject.put("attribution", bVar.mo7813a());
        }
        if (!(bVar == null || bVar.mo7814b() == null)) {
            jSONObject.put("advertiser_id", bVar.mo7814b());
            jSONObject.put("advertiser_tracking_enabled", !bVar.mo7816d());
        }
        if (!(bVar == null || bVar.mo7815c() == null)) {
            jSONObject.put("installer_package", bVar.mo7815c());
        }
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
    }

    /* renamed from: a */
    public static boolean m10389a(Bundle bundle, String str, Object obj) {
        String obj2;
        if (obj == null) {
            bundle.remove(str);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else {
            if (obj instanceof String) {
                obj2 = (String) obj;
            } else if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
                return false;
            } else {
                obj2 = obj.toString();
            }
            bundle.putString(str, obj2);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m10390a(AccessToken accessToken) {
        if (accessToken != null) {
            return accessToken.equals(AccessToken.m7985a());
        }
        return false;
    }

    /* renamed from: a */
    public static <T> boolean m10391a(T t, T t2) {
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    /* renamed from: a */
    public static boolean m10392a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public static <T> boolean m10393a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: b */
    public static Bundle m10394b(String str) {
        Bundle bundle = new Bundle();
        if (!m10392a(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8"));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    m10383a("FacebookSDK", (Exception) e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static <T> List<T> m10395b(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Set<String> m10396b(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    /* renamed from: b */
    private static void m10397b() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f7267e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f7268f = timeZone.getID();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m10398b(Context context) {
        m10376a(context, "facebook.com");
        m10376a(context, ".facebook.com");
        m10376a(context, "https://facebook.com");
        m10376a(context, "https://.facebook.com");
    }

    /* renamed from: b */
    public static boolean m10399b(Uri uri) {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
    }

    /* renamed from: c */
    public static String m10400c(Context context) {
        return context == null ? "null" : context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    /* renamed from: c */
    public static JSONObject m10401c(String str) {
        JSONObject a = C2256v.m10349a(str);
        if (a != null) {
            return a;
        }
        C2199i i = m10404d(str).mo6584i();
        if (i.mo7795a() != null) {
            return null;
        }
        return i.mo7796b();
    }

    /* renamed from: c */
    private static boolean m10402c() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: c */
    public static boolean m10403c(Uri uri) {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    /* renamed from: d */
    private static GraphRequest m10404d(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        GraphRequest graphRequest = new GraphRequest(null, "me", bundle, HttpMethod.GET, null);
        return graphRequest;
    }

    /* renamed from: d */
    private static void m10405d() {
        try {
            if (m10402c()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f7266d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f7266d = m10357a((double) f7266d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static boolean m10406d(Context context) {
        return m10410e(context);
    }

    /* renamed from: d */
    public static boolean m10407d(Uri uri) {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m10408e(android.net.Uri r9) {
        /*
            r0 = 0
            android.content.Context r1 = com.facebook.C2189f.m10092f()     // Catch:{ all -> 0x0027 }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ all -> 0x0027 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "_size"
            int r0 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0025 }
            r9.moveToFirst()     // Catch:{ all -> 0x0025 }
            long r0 = r9.getLong(r0)     // Catch:{ all -> 0x0025 }
            if (r9 == 0) goto L_0x0024
            r9.close()
        L_0x0024:
            return r0
        L_0x0025:
            r0 = move-exception
            goto L_0x002b
        L_0x0027:
            r9 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        L_0x002b:
            if (r9 == 0) goto L_0x0030
            r9.close()
        L_0x0030:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2258x.m10408e(android.net.Uri):long");
    }

    /* renamed from: e */
    private static void m10409e() {
        try {
            if (m10402c()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f7265c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f7265c = m10357a((double) f7265c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static boolean m10410e(Context context) {
        boolean z = false;
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    private static void m10411f(Context context) {
        if (f7264b == -1 || System.currentTimeMillis() - f7264b >= 1800000) {
            f7264b = System.currentTimeMillis();
            m10397b();
            m10412g(context);
            m10409e();
            m10405d();
        }
    }

    /* renamed from: g */
    private static void m10412g(Context context) {
        if (f7269g.equals("NoCarrier")) {
            try {
                f7269g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }
}
