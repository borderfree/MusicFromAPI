package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.lt */
public final class C3719lt {

    /* renamed from: a */
    public static final Handler f14416a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static final String f14417b = AdView.class.getName();

    /* renamed from: c */
    private static final String f14418c = InterstitialAd.class.getName();

    /* renamed from: d */
    private static final String f14419d = PublisherAdView.class.getName();

    /* renamed from: e */
    private static final String f14420e = PublisherInterstitialAd.class.getName();

    /* renamed from: f */
    private static final String f14421f = SearchAdView.class.getName();

    /* renamed from: g */
    private static final String f14422g = AdLoader.class.getName();

    /* renamed from: a */
    public static int m19107a(Context context, int i) {
        return m19108a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public static int m19108a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: a */
    public static String m19109a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
        if (string == null || m19116a()) {
            string = "emulator";
        }
        return m19110a(string);
    }

    /* renamed from: a */
    public static String m19110a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m19111a(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f14417b.equalsIgnoreCase(className) && !f14418c.equalsIgnoreCase(className) && !f14419d.equalsIgnoreCase(className) && !f14420e.equalsIgnoreCase(className) && !f14421f.equalsIgnoreCase(className) && !f14422g.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: a */
    public static Throwable m19112a(Throwable th) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12793d)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m19121b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!(!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java.")))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: a */
    public static void m19113a(Context context, String str, String str2, Bundle bundle, boolean z, C3722lw lwVar) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                int d = C3182e.m14660b().mo11136d(context);
                StringBuilder sb = new StringBuilder(20);
                sb.append(d);
                sb.append(".12451000");
                str = sb.toString();
            }
            bundle.putString("js", str);
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        lwVar.mo13140a(appendQueryParameter.toString());
    }

    /* renamed from: a */
    private final void m19114a(ViewGroup viewGroup, zzjn zzjn, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m19107a(context, 3);
            frameLayout.addView(textView, new LayoutParams(zzjn.f15504f - a, zzjn.f15501c - a, 17));
            viewGroup.addView(frameLayout, zzjn.f15504f, zzjn.f15501c);
        }
    }

    /* renamed from: a */
    public static void m19115a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static boolean m19116a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: b */
    public static int m19117b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m19118b(displayMetrics, i);
    }

    /* renamed from: b */
    public static int m19118b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: b */
    public static String m19119b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Secure.getString(contentResolver, "android_id");
    }

    /* renamed from: b */
    public static boolean m19120b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static boolean m19121b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) ane.m16650f().mo12297a(aqm.f12846e))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(C3464ci.class);
        } catch (Exception e) {
            String str2 = "Fail to check class type for class ";
            String valueOf = String.valueOf(str);
            C3731me.m19170a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return false;
        }
    }

    /* renamed from: c */
    public static String m19122c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: c */
    public static boolean m19123c(Context context) {
        return C3182e.m14660b().mo11117b(context, (int) C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0;
    }

    /* renamed from: d */
    public static int m19124d(Context context) {
        return DynamiteModule.m15151b(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: e */
    public static int m19125e(Context context) {
        return DynamiteModule.m15144a(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: f */
    public static boolean m19126f(Context context) {
        int b = C3182e.m14660b().mo11117b(context, (int) C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return b == 0 || b == 2;
    }

    /* renamed from: g */
    public static boolean m19127g(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    /* renamed from: h */
    public static boolean m19128h(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (C3309n.m15073e()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            try {
                i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (i3 == i2 && i4 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static int m19129i(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo13233a(Context context, String str, String str2, Bundle bundle, boolean z) {
        m19113a(context, null, str2, bundle, true, new C3720lu(this));
    }

    /* renamed from: a */
    public final void mo13234a(ViewGroup viewGroup, zzjn zzjn, String str) {
        m19114a(viewGroup, zzjn, str, -16777216, -1);
    }

    /* renamed from: a */
    public final void mo13235a(ViewGroup viewGroup, zzjn zzjn, String str, String str2) {
        C3731me.m19178e(str2);
        m19114a(viewGroup, zzjn, str, -65536, -16777216);
    }
}
