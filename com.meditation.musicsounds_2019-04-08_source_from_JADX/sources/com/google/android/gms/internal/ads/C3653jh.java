package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3302g;
import com.google.android.gms.common.util.C3307l;
import com.google.android.gms.common.util.C3309n;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.jh */
public final class C3653jh {

    /* renamed from: a */
    public static final Handler f14275a = new C3644iz(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f14276b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f14277c = true;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: d */
    public String f14278d;

    /* renamed from: e */
    private boolean f14279e = false;

    /* renamed from: f */
    private boolean f14280f = false;
    @GuardedBy("this")

    /* renamed from: g */
    private Pattern f14281g;
    @GuardedBy("this")

    /* renamed from: h */
    private Pattern f14282h;

    /* renamed from: a */
    public static Bitmap m18859a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bundle m18860a(ajo ajo) {
        String str;
        String str2;
        String str3;
        if (ajo == null) {
            return null;
        }
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12630W)).booleanValue()) {
            if (!((Boolean) ane.m16650f().mo12297a(aqm.f12632Y)).booleanValue()) {
                return null;
            }
        }
        if (zzbv.zzeo().mo13060l().mo13104b() && zzbv.zzeo().mo13060l().mo13110d()) {
            return null;
        }
        if (ajo.mo12047d()) {
            ajo.mo12046c();
        }
        aji b = ajo.mo12045b();
        if (b != null) {
            str3 = b.mo12008b();
            str2 = b.mo12010c();
            str = b.mo12011d();
            if (str3 != null) {
                zzbv.zzeo().mo13060l().mo13096a(str3);
            }
            if (str != null) {
                zzbv.zzeo().mo13060l().mo13102b(str);
            }
        } else {
            str3 = zzbv.zzeo().mo13060l().mo13105c();
            str = zzbv.zzeo().mo13060l().mo13111e();
            str2 = null;
        }
        Bundle bundle = new Bundle(1);
        if (str != null) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12632Y)).booleanValue() && !zzbv.zzeo().mo13060l().mo13110d()) {
                bundle.putString("v_fp_vertical", str);
            }
        }
        if (str3 != null) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12630W)).booleanValue() && !zzbv.zzeo().mo13060l().mo13104b()) {
                bundle.putString("fingerprint", str3);
                if (!str3.equals(str2)) {
                    bundle.putString("v_fp", str2);
                }
            }
        }
        if (!bundle.isEmpty()) {
            return bundle;
        }
        return null;
    }

    /* renamed from: a */
    public static DisplayMetrics m18861a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public static WebResourceResponse m18862a(HttpURLConnection httpURLConnection) {
        String str;
        zzbv.zzek();
        String contentType = httpURLConnection.getContentType();
        String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        zzbv.zzek();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        str = "";
        String str2 = str;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return zzbv.zzem().mo13145a(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: a */
    public static PopupWindow m18863a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    /* renamed from: a */
    public static String m18865a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m18866a(Context context, View view, zzjn zzjn) {
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12671ak)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzjn.f15503e);
            jSONObject2.put("height", zzjn.f15500b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", m18911l(context));
            if (!zzjn.f15502d) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            C3643iy.m19175c("Fail to get view hierarchy json", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m18868a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: a */
    public static String m18869a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    /* renamed from: a */
    public static Map<String, String> m18870a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : zzbv.zzem().mo13149a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    private final JSONArray m18871a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m18879a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final JSONObject m18872a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m18880a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m18873a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    /* renamed from: a */
    public static void m18874a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12752cL)).booleanValue()) {
                m18891b(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            C3643iy.m19172b(sb.toString());
        } catch (ActivityNotFoundException e) {
            C3643iy.m19173b("No browser is found.", e);
        }
    }

    /* renamed from: a */
    public static void m18875a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        m18876a(context, str, (List<String>) arrayList);
    }

    /* renamed from: a */
    public static void m18876a(Context context, String str, List<String> list) {
        for (String lhVar : list) {
            new C3707lh(context, str, lhVar).mo11913c();
        }
    }

    /* renamed from: a */
    public static void m18877a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = ((Boolean) ane.m16650f().mo12297a(aqm.f12740c)).booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                C3302g.m15050a(context, th);
            }
        }
    }

    /* renamed from: a */
    public static void m18878a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            C3651jf.m18855a(runnable);
        }
    }

    /* renamed from: a */
    private final void m18879a(JSONArray jSONArray, Object obj) {
        Object a;
        if (obj instanceof Bundle) {
            a = m18872a((Bundle) obj);
        } else if (obj instanceof Map) {
            a = mo13124a((Map) obj);
        } else if (obj instanceof Collection) {
            a = m18871a((Collection) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object a2 : objArr) {
                m18879a(jSONArray2, a2);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(a);
    }

    /* renamed from: a */
    private final void m18880a(JSONObject jSONObject, String str, Object obj) {
        Collection asList;
        Object a;
        if (obj instanceof Bundle) {
            a = m18872a((Bundle) obj);
        } else if (obj instanceof Map) {
            a = mo13124a((Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            a = m18871a(asList);
        }
        jSONObject.put(str, a);
    }

    /* renamed from: a */
    private static boolean m18881a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @TargetApi(24)
    /* renamed from: a */
    public static boolean m18882a(Activity activity, Configuration configuration) {
        ane.m16645a();
        int a = C3719lt.m19107a((Context) activity, configuration.screenHeightDp);
        int a2 = C3719lt.m19107a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a3 = m18861a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a3.heightPixels;
        int i2 = a3.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int round = ((int) Math.round(d + 0.5d)) * ((Integer) ane.m16650f().mo12297a(aqm.f12764cX)).intValue();
        return m18881a(i, a + dimensionPixelSize, round) && m18881a(i2, a2, round);
    }

    /* renamed from: a */
    public static boolean m18883a(Context context) {
        String str;
        boolean z;
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        boolean z2 = false;
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                str = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
            } else {
                String str2 = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
                if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                    C3643iy.m19178e(String.format(str2, new Object[]{"keyboard"}));
                    z = false;
                } else {
                    z = true;
                }
                if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                    C3643iy.m19178e(String.format(str2, new Object[]{"keyboardHidden"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                    C3643iy.m19178e(String.format(str2, new Object[]{"orientation"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                    C3643iy.m19178e(String.format(str2, new Object[]{"screenLayout"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                    C3643iy.m19178e(String.format(str2, new Object[]{"uiMode"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
                    C3643iy.m19178e(String.format(str2, new Object[]{"screenSize"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 2048) == 0) {
                    str = String.format(str2, new Object[]{"smallestScreenSize"});
                } else {
                    z2 = z;
                    return z2;
                }
            }
            C3643iy.m19178e(str);
            return z2;
        } catch (Exception e) {
            C3643iy.m19175c("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", e);
            zzbv.zzeo().mo13047a((Throwable) e, "AdUtil.hasAdActivity");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m18884a(Context context, String str) {
        return C3181c.m14658a(context).mo11123a(str, context.getPackageName()) == 0;
    }

    /* renamed from: a */
    public static boolean m18886a(ClassLoader classLoader, Class<?> cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int[] m18887a(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                return new int[]{findViewById.getWidth(), findViewById.getHeight()};
            }
        }
        return m18903e();
    }

    /* renamed from: b */
    public static int m18888b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            C3643iy.m19178e(sb.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public static Bitmap m18889b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap f = m18904f(view);
        if (f == null) {
            f = m18902e(view);
        }
        return f;
    }

    /* renamed from: b */
    public static String m18890b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    @TargetApi(18)
    /* renamed from: b */
    public static void m18891b(Context context, Intent intent) {
        if (intent != null && C3309n.m15074f()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: b */
    public static void m18892b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e) {
            C3643iy.m19173b("Error writing to file in internal storage.", e);
        }
    }

    /* renamed from: c */
    public static Bundle m18893c() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12610C)).booleanValue()) {
                MemoryInfo memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12611D)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", zzbv.zzeo().mo13059k());
        } catch (Exception e) {
            C3643iy.m19175c("Unable to gather memory stats", e);
        }
        return bundle;
    }

    /* renamed from: c */
    public static WebResourceResponse m18894c(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", zzbv.zzek().mo13131b(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new C3690kr(context).mo13208a(str2, (Map<String, String>) hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            C3643iy.m19175c("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    /* renamed from: c */
    public static String m18895c(Context context, String str) {
        try {
            return new String(C3307l.m15067a(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            C3643iy.m19172b("Error reading from internal storage.");
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m18896c(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3653jh.m18896c(android.view.View):boolean");
    }

    /* renamed from: c */
    public static boolean m18897c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: d */
    public static int m18898d(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: d */
    private static String m18899d() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* renamed from: d */
    protected static String m18900d(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m18899d();
        }
    }

    /* renamed from: e */
    public static Builder m18901e(Context context) {
        return new Builder(context);
    }

    /* renamed from: e */
    private static Bitmap m18902e(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            C3643iy.m19178e("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            C3643iy.m19173b("Fail to capture the webview", e);
            return null;
        }
    }

    /* renamed from: e */
    private static int[] m18903e() {
        return new int[]{0, 0};
    }

    /* renamed from: f */
    private static Bitmap m18904f(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            C3643iy.m19173b("Fail to capture the web view", e);
        }
        return bitmap;
    }

    /* renamed from: f */
    public static apx m18905f(Context context) {
        return new apx(context);
    }

    /* renamed from: g */
    public static boolean m18906g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                            if (Process.myPid() == runningAppProcessInfo.pid) {
                                if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                    if (powerManager == null ? false : powerManager.isScreenOn()) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: h */
    public static Bitmap m18907h(Context context) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12706bS)).booleanValue()) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    bitmap = m18904f(window.getDecorView().getRootView());
                }
                return bitmap2;
            }
            bitmap = m18902e(((Activity) context).getWindow().getDecorView());
            bitmap2 = bitmap;
        } catch (RuntimeException e) {
            C3643iy.m19173b("Fail to capture screen shot", e);
        }
        return bitmap2;
    }

    /* renamed from: i */
    public static int m18908i(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    @TargetApi(16)
    /* renamed from: j */
    public static boolean m18909j(Context context) {
        if (context != null && C3309n.m15072d()) {
            KeyguardManager m = m18912m(context);
            if (m != null && m.isKeyguardLocked()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m18910k(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            C3643iy.m19173b("Error loading class.", th);
            zzbv.zzeo().mo13047a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: l */
    private static String m18911l(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks != null && !runningTasks.isEmpty()) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    private static KeyguardManager m18912m(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* renamed from: a */
    public final JSONObject mo13123a(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return m18872a(bundle);
            } catch (JSONException e) {
                C3643iy.m19173b("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final JSONObject mo13124a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m18880a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String str2 = "Could not convert map to JSON: ";
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: a */
    public final void mo13125a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(mo13131b(context, str));
    }

    /* renamed from: a */
    public final void mo13126a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            zzbv.zzek();
            bundle.putString("device", m18890b());
            bundle.putString("eids", TextUtils.join(",", aqm.m16919a()));
        }
        ane.m16645a();
        C3719lt.m19113a(context, str, str2, bundle, z, new C3656jk(this, context, str));
    }

    /* renamed from: a */
    public final void mo13127a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", mo13131b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public final void mo13128a(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(aeg.m16058a(activity))) {
                if (list == null) {
                    C3643iy.m18780a("Cannot ping urls: empty list.");
                } else if (!arj.m16981a(context)) {
                    C3643iy.m18780a("Cannot ping url because custom tabs is not supported");
                } else {
                    arj arj = new arj();
                    arj.mo12335a((ark) new C3654ji(this, list, arj, context));
                    arj.mo12337b(activity);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo13129a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return mo13130a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m18912m(context));
    }

    /* renamed from: a */
    public final boolean mo13130a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (!zzbv.zzek().f14277c) {
            if (keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) {
                if (!((Boolean) ane.m16650f().mo12297a(aqm.f12728bo)).booleanValue() || !m18896c(view)) {
                    z = false;
                    if (view.getVisibility() == 0 && view.isShown()) {
                        if ((powerManager != null || powerManager.isScreenOn()) && z) {
                            if (((Boolean) ane.m16650f().mo12297a(aqm.f12726bm)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        z = true;
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12726bm)).booleanValue()) {
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x003b, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7 A[Catch:{ Exception -> 0x00b6 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo13131b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f14276b
            monitor-enter(r0)
            java.lang.String r1 = r4.f14278d     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.f14278d     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = m18899d()     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x0013:
            com.google.android.gms.internal.ads.jn r1 = com.google.android.gms.ads.internal.zzbv.zzem()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.mo13147a(r5)     // Catch:{ Exception -> 0x001d }
            r4.f14278d = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.f14278d     // Catch:{ all -> 0x00d2 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.ane.m16645a()     // Catch:{ all -> 0x00d2 }
            boolean r1 = com.google.android.gms.internal.ads.C3719lt.m19120b()     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x0068
            r1 = 0
            r4.f14278d = r1     // Catch:{ all -> 0x00d2 }
            android.os.Handler r1 = f14275a     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.internal.ads.jj r2 = new com.google.android.gms.internal.ads.jj     // Catch:{ all -> 0x00d2 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00d2 }
            r1.post(r2)     // Catch:{ all -> 0x00d2 }
        L_0x003b:
            java.lang.String r1 = r4.f14278d     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x006e
            java.lang.Object r1 = r4.f14276b     // Catch:{ InterruptedException -> 0x0045 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x003b
        L_0x0045:
            java.lang.String r1 = m18899d()     // Catch:{ all -> 0x00d2 }
            r4.f14278d = r1     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "Interrupted, use default user agent: "
            java.lang.String r2 = r4.f14278d     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00d2 }
            int r3 = r2.length()     // Catch:{ all -> 0x00d2 }
            if (r3 == 0) goto L_0x005e
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00d2 }
            goto L_0x0064
        L_0x005e:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00d2 }
            r2.<init>(r1)     // Catch:{ all -> 0x00d2 }
            r1 = r2
        L_0x0064:
            com.google.android.gms.internal.ads.C3643iy.m19178e(r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x003b
        L_0x0068:
            java.lang.String r1 = m18900d(r5)     // Catch:{ all -> 0x00d2 }
            r4.f14278d = r1     // Catch:{ all -> 0x00d2 }
        L_0x006e:
            java.lang.String r1 = r4.f14278d     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            int r2 = r2.length()     // Catch:{ all -> 0x00d2 }
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00d2 }
            int r3 = r3.length()     // Catch:{ all -> 0x00d2 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r3.<init>(r2)     // Catch:{ all -> 0x00d2 }
            r3.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00d2 }
            r3.append(r6)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00d2 }
            r4.f14278d = r6     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.common.d.b r5 = com.google.android.gms.common.p123d.C3181c.m14658a(r5)     // Catch:{ Exception -> 0x00b6 }
            boolean r5 = r5.mo11126a()     // Catch:{ Exception -> 0x00b6 }
            if (r5 == 0) goto L_0x00c0
            java.lang.String r5 = r4.f14278d     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b6 }
            r4.f14278d = r5     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00c0
        L_0x00b6:
            r5 = move-exception
            com.google.android.gms.internal.ads.ii r6 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo13047a(r5, r1)     // Catch:{ all -> 0x00d2 }
        L_0x00c0:
            java.lang.String r5 = r4.f14278d     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00d2 }
            r4.f14278d = r5     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = r4.f14278d     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x00d2:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3653jh.mo13131b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final void mo13132b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12731br)).booleanValue()) {
            mo13126a(context, str, str2, bundle, z);
        }
    }

    /* renamed from: b */
    public final boolean mo13133b(Context context) {
        if (this.f14279e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C3658jm(this, null), intentFilter);
        this.f14279e = true;
        return true;
    }

    /* renamed from: b */
    public final int[] mo13134b(Activity activity) {
        int[] a = m18887a(activity);
        ane.m16645a();
        ane.m16645a();
        return new int[]{C3719lt.m19117b((Context) activity, a[0]), C3719lt.m19117b((Context) activity, a[1])};
    }

    /* renamed from: c */
    public final boolean mo13135c(Context context) {
        if (this.f14280f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new C3657jl(this, null), intentFilter);
        this.f14280f = true;
        return true;
    }

    /* renamed from: c */
    public final int[] mo13136c(Activity activity) {
        int[] iArr;
        Window window = activity.getWindow();
        if (window != null) {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                iArr = new int[]{findViewById.getTop(), findViewById.getBottom()};
                ane.m16645a();
                ane.m16645a();
                return new int[]{C3719lt.m19117b((Context) activity, iArr[0]), C3719lt.m19117b((Context) activity, iArr[1])};
            }
        }
        iArr = m18903e();
        ane.m16645a();
        ane.m16645a();
        return new int[]{C3719lt.m19117b((Context) activity, iArr[0]), C3719lt.m19117b((Context) activity, iArr[1])};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) com.google.android.gms.internal.ads.ane.m16650f().mo12297a(com.google.android.gms.internal.ads.aqm.f12677aq)).equals(r3.f14281g.pattern()) == false) goto L_0x0025;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13137d(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.f14281g     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.aqc<java.lang.String> r0 = com.google.android.gms.internal.ads.aqm.f12677aq     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo12297a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.f14281g     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            com.google.android.gms.internal.ads.aqc<java.lang.String> r0 = com.google.android.gms.internal.ads.aqm.f12677aq     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo12297a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.f14281g = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.f14281g     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ PatternSyntaxException -> 0x0046 }
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3653jh.mo13137d(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) com.google.android.gms.internal.ads.ane.m16650f().mo12297a(com.google.android.gms.internal.ads.aqm.f12678ar)).equals(r3.f14282h.pattern()) == false) goto L_0x0025;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13138e(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.f14282h     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.aqc<java.lang.String> r0 = com.google.android.gms.internal.ads.aqm.f12678ar     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo12297a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.f14282h     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            com.google.android.gms.internal.ads.aqc<java.lang.String> r0 = com.google.android.gms.internal.ads.aqm.f12678ar     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo12297a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.f14282h = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.f14282h     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ PatternSyntaxException -> 0x0046 }
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3653jh.mo13138e(java.lang.String):boolean");
    }
}
