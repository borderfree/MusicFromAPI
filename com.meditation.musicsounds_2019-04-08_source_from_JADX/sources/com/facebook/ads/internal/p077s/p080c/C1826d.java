package com.facebook.ads.internal.p077s.p080c;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.facebook.ads.internal.p067i.C1708b;
import com.facebook.ads.internal.p073r.p074a.C1735a;
import com.facebook.ads.internal.settings.C1837b;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.s.c.d */
public class C1826d {

    /* renamed from: a */
    private static String f5963a;

    /* renamed from: b */
    private static final Set<String> f5964b = new HashSet(1);

    /* renamed from: c */
    private static final Set<String> f5965c = new HashSet(2);

    static {
        f5964b.add("1ww8E0AYsR2oX5lndk2hwp2Uosk=\n");
        f5965c.add("toZ2GRnRjC9P5VVUdCpOrFH8lfQ=\n");
        f5965c.add("3lKvjNsfmrn+WmfDhvr2iVh/yRs=\n");
        f5965c.add("B08QtE4yLCdli4rptyqAEczXOeA=\n");
        f5965c.add("XZXI6anZbdKf+taURdnyUH5ipgM=\n");
    }

    /* renamed from: a */
    public static C1735a m8971a(Context context) {
        return m8972a(context, true);
    }

    /* renamed from: a */
    public static C1735a m8972a(Context context, boolean z) {
        C1735a aVar = new C1735a();
        m8974a(context, aVar, z);
        return aVar;
    }

    /* renamed from: a */
    private static String m8973a(Context context, String str, String str2) {
        Class cls = Class.forName(str);
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{Context.class, Class.forName(str2)});
        declaredConstructor.setAccessible(true);
        try {
            return (String) cls.getMethod("getUserAgentString", new Class[0]).invoke(declaredConstructor.newInstance(new Object[]{context, null}), new Object[0]);
        } finally {
            declaredConstructor.setAccessible(false);
        }
    }

    /* renamed from: a */
    private static void m8974a(Context context, C1735a aVar, boolean z) {
        C1708b bVar = new C1708b(context);
        if (m8975a()) {
            aVar.mo6968b(360000);
            aVar.mo6970c(120000);
        } else {
            aVar.mo6968b(30000);
        }
        aVar.mo6963a(3);
        StringBuilder sb = new StringBuilder();
        sb.append(m8979c(context, z));
        sb.append(" [FBAN/AudienceNetworkForAndroid;FBSN/");
        sb.append("Android");
        sb.append(";FBSV/");
        sb.append(C1708b.f5624a);
        sb.append(";FBAB/");
        sb.append(bVar.mo6892f());
        sb.append(";FBAV/");
        sb.append(bVar.mo6893g());
        sb.append(";FBBV/");
        sb.append(bVar.mo6894h());
        sb.append(";FBVS/");
        sb.append("5.0.0");
        sb.append(";FBLC/");
        sb.append(Locale.getDefault().toString());
        sb.append("]");
        aVar.mo6957a("user-agent", sb.toString());
    }

    /* renamed from: a */
    public static boolean m8975a() {
        String b = C1837b.m9007b();
        return !TextUtils.isEmpty(b) && b.endsWith(".sb");
    }

    /* renamed from: b */
    public static C1735a m8976b(Context context) {
        return m8977b(context, true);
    }

    /* renamed from: b */
    public static C1735a m8977b(Context context, boolean z) {
        C1735a aVar = new C1735a();
        m8974a(context, aVar, z);
        if (!m8975a()) {
            aVar.mo6969b(f5965c);
            aVar.mo6965a(f5964b);
        }
        return aVar;
    }

    @TargetApi(17)
    /* renamed from: c */
    private static String m8978c(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:31|30|32|33|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0046 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8979c(android.content.Context r2, boolean r3) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r2 = "Unknown"
            return r2
        L_0x0005:
            if (r3 == 0) goto L_0x000e
            java.lang.String r2 = "http.agent"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            return r2
        L_0x000e:
            java.lang.String r3 = f5963a
            if (r3 == 0) goto L_0x0015
            java.lang.String r2 = f5963a
            return r2
        L_0x0015:
            java.lang.Class<com.facebook.ads.internal.s.c.d> r3 = com.facebook.ads.internal.p077s.p080c.C1826d.class
            monitor-enter(r3)
            java.lang.String r0 = f5963a     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0020
            java.lang.String r2 = f5963a     // Catch:{ all -> 0x0060 }
            monitor-exit(r3)     // Catch:{ all -> 0x0060 }
            return r2
        L_0x0020:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0060 }
            r1 = 17
            if (r0 < r1) goto L_0x0030
            java.lang.String r0 = m8978c(r2)     // Catch:{ Exception -> 0x0030 }
            f5963a = r0     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = f5963a     // Catch:{ Exception -> 0x0030 }
            monitor-exit(r3)     // Catch:{ all -> 0x0060 }
            return r0
        L_0x0030:
            java.lang.String r0 = "android.webkit.WebSettings"
            java.lang.String r1 = "android.webkit.WebView"
            java.lang.String r0 = m8973a(r2, r0, r1)     // Catch:{ Exception -> 0x003b }
            f5963a = r0     // Catch:{ Exception -> 0x003b }
            goto L_0x005c
        L_0x003b:
            java.lang.String r0 = "android.webkit.WebSettingsClassic"
            java.lang.String r1 = "android.webkit.WebViewClassic"
            java.lang.String r0 = m8973a(r2, r0, r1)     // Catch:{ Exception -> 0x0046 }
            f5963a = r0     // Catch:{ Exception -> 0x0046 }
            goto L_0x005c
        L_0x0046:
            android.webkit.WebView r0 = new android.webkit.WebView     // Catch:{ all -> 0x0060 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0060 }
            r0.<init>(r2)     // Catch:{ all -> 0x0060 }
            android.webkit.WebSettings r2 = r0.getSettings()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = r2.getUserAgentString()     // Catch:{ all -> 0x0060 }
            f5963a = r2     // Catch:{ all -> 0x0060 }
            r0.destroy()     // Catch:{ all -> 0x0060 }
        L_0x005c:
            monitor-exit(r3)     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = f5963a
            return r2
        L_0x0060:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0060 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p077s.p080c.C1826d.m8979c(android.content.Context, boolean):java.lang.String");
    }
}
