package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C2189f;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.DefaultAudience;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.t */
public final class C2244t {

    /* renamed from: a */
    private static final String f7240a = "com.facebook.internal.t";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<C2250e> f7241b = m10316e();

    /* renamed from: c */
    private static final List<C2250e> f7242c = m10317f();

    /* renamed from: d */
    private static final Map<String, List<C2250e>> f7243d = m10320g();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final AtomicBoolean f7244e = new AtomicBoolean(false);

    /* renamed from: f */
    private static final List<Integer> f7245f = Arrays.asList(new Integer[]{Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101)});

    /* renamed from: com.facebook.internal.t$a */
    private static class C2246a extends C2250e {
        private C2246a() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo7872a() {
            return "com.facebook.arstudio.player";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo7873b() {
            return null;
        }
    }

    /* renamed from: com.facebook.internal.t$b */
    private static class C2247b extends C2250e {
        private C2247b() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo7872a() {
            return "com.facebook.lite";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo7873b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }
    }

    /* renamed from: com.facebook.internal.t$c */
    private static class C2248c extends C2250e {
        private C2248c() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo7872a() {
            return "com.facebook.katana";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo7873b() {
            return "com.facebook.katana.ProxyAuth";
        }
    }

    /* renamed from: com.facebook.internal.t$d */
    private static class C2249d extends C2250e {
        private C2249d() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo7872a() {
            return "com.facebook.orca";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo7873b() {
            return null;
        }
    }

    /* renamed from: com.facebook.internal.t$e */
    private static abstract class C2250e {

        /* renamed from: a */
        private TreeSet<Integer> f7246a;

        private C2250e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public synchronized void m10330a(boolean z) {
            if (!z) {
                try {
                    if (this.f7246a == null) {
                    }
                } finally {
                }
            }
            this.f7246a = C2244t.m10307b(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract String mo7872a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo7873b();

        /* renamed from: c */
        public TreeSet<Integer> mo7874c() {
            if (this.f7246a == null) {
                m10330a(false);
            }
            return this.f7246a;
        }
    }

    /* renamed from: com.facebook.internal.t$f */
    public static class C2251f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C2250e f7247a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f7248b;

        private C2251f() {
        }

        /* renamed from: a */
        public static C2251f m10335a() {
            C2251f fVar = new C2251f();
            fVar.f7248b = -1;
            return fVar;
        }

        /* renamed from: a */
        public static C2251f m10336a(C2250e eVar, int i) {
            C2251f fVar = new C2251f();
            fVar.f7247a = eVar;
            fVar.f7248b = i;
            return fVar;
        }

        /* renamed from: b */
        public int mo7875b() {
            return this.f7248b;
        }
    }

    /* renamed from: com.facebook.internal.t$g */
    private static class C2252g extends C2250e {
        private C2252g() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo7872a() {
            return "com.facebook.wakizashi";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo7873b() {
            return "com.facebook.katana.ProxyAuth";
        }
    }

    /* renamed from: a */
    public static final int m10288a() {
        return ((Integer) f7245f.get(0)).intValue();
    }

    /* renamed from: a */
    public static int m10289a(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    /* renamed from: a */
    public static int m10290a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        Iterator descendingIterator = treeSet.descendingIterator();
        int i2 = -1;
        int i3 = length;
        int i4 = -1;
        while (true) {
            if (!descendingIterator.hasNext()) {
                break;
            }
            int intValue = ((Integer) descendingIterator.next()).intValue();
            i4 = Math.max(i4, intValue);
            while (i3 >= 0 && iArr[i3] > intValue) {
                i3--;
            }
            if (i3 < 0) {
                return -1;
            }
            if (iArr[i3] == intValue) {
                if (i3 % 2 == 0) {
                    i2 = Math.min(i4, i);
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static Intent m10291a(Context context) {
        for (C2250e eVar : f7241b) {
            Intent b = m10305b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.mo7872a()).addCategory("android.intent.category.DEFAULT"), eVar);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    static Intent m10292a(Context context, Intent intent, C2250e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity != null && C2227k.m10216a(context, resolveActivity.activityInfo.packageName)) {
            return intent;
        }
        return null;
    }

    /* renamed from: a */
    public static Intent m10293a(Context context, String str, String str2, C2251f fVar, Bundle bundle) {
        if (fVar == null) {
            return null;
        }
        C2250e a = fVar.f7247a;
        if (a == null) {
            return null;
        }
        Intent a2 = m10292a(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(a.mo7872a()).addCategory("android.intent.category.DEFAULT"), a);
        if (a2 == null) {
            return null;
        }
        m10302a(a2, str, str2, fVar.f7248b, bundle);
        return a2;
    }

    /* renamed from: a */
    public static Intent m10294a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3) {
        C2247b bVar = new C2247b();
        Context context2 = context;
        return m10292a(context, m10296a((C2250e) bVar, str, collection, str2, z, z2, defaultAudience, str3), (C2250e) bVar);
    }

    /* renamed from: a */
    public static Intent m10295a(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID b = m10308b(intent);
        if (b == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m10289a(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", b.toString());
        if (facebookException != null) {
            bundle2.putBundle("error", m10297a(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* renamed from: a */
    private static Intent m10296a(C2250e eVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3) {
        String b = eVar.mo7873b();
        if (b == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(eVar.mo7872a(), b).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", C2189f.m10094h());
        if (!C2258x.m10393a(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!C2258x.m10392a(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
        }
        putExtra.putExtra("legacy_override", C2189f.m10093g());
        putExtra.putExtra("auth_type", "rerequest");
        return putExtra;
    }

    /* renamed from: a */
    public static Bundle m10297a(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (facebookException instanceof FacebookOperationCanceledException) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* renamed from: a */
    public static FacebookException m10298a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        return (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
    }

    /* renamed from: a */
    public static C2251f m10299a(String str, int[] iArr) {
        return m10300a((List) f7243d.get(str), iArr);
    }

    /* renamed from: a */
    private static C2251f m10300a(List<C2250e> list, int[] iArr) {
        m10309b();
        if (list == null) {
            return C2251f.m10335a();
        }
        for (C2250e eVar : list) {
            int a = m10290a(eVar.mo7874c(), m10288a(), iArr);
            if (a != -1) {
                return C2251f.m10336a(eVar, a);
            }
        }
        return C2251f.m10335a();
    }

    /* renamed from: a */
    public static void m10302a(Intent intent, String str, String str2, int i, Bundle bundle) {
        String j = C2189f.m10096j();
        String k = C2189f.m10097k();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", j);
        if (m10303a(i)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            C2258x.m10378a(bundle2, "app_name", k);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
            return;
        }
        intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
        if (!C2258x.m10392a(k)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", k);
        }
        intent.putExtras(bundle);
    }

    /* renamed from: a */
    public static boolean m10303a(int i) {
        return f7245f.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    /* renamed from: b */
    public static int m10304b(int i) {
        return m10300a(f7241b, new int[]{i}).mo7875b();
    }

    /* renamed from: b */
    static Intent m10305b(Context context, Intent intent, C2250e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && C2227k.m10216a(context, resolveService.serviceInfo.packageName)) {
            return intent;
        }
        return null;
    }

    /* renamed from: b */
    public static Intent m10306b(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3) {
        for (C2250e eVar : f7241b) {
            Context context2 = context;
            Intent a = m10292a(context, m10296a(eVar, str, collection, str2, z, z2, defaultAudience, str3), eVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        android.util.Log.e(f7240a, "Failed to query content resolver.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0051 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.TreeSet<java.lang.Integer> m10307b(com.facebook.internal.C2244t.C2250e r9) {
        /*
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            android.content.Context r1 = com.facebook.C2189f.m10092f()
            android.content.ContentResolver r2 = r1.getContentResolver()
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.String r1 = "version"
            r3 = 0
            r4[r3] = r1
            android.net.Uri r1 = m10310c(r9)
            r8 = 0
            android.content.Context r5 = com.facebook.C2189f.m10092f()     // Catch:{ all -> 0x0078 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r6.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r9 = r9.mo7872a()     // Catch:{ all -> 0x0078 }
            r6.append(r9)     // Catch:{ all -> 0x0078 }
            java.lang.String r9 = ".provider.PlatformProvider"
            r6.append(r9)     // Catch:{ all -> 0x0078 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x0078 }
            android.content.pm.ProviderInfo r9 = r5.resolveContentProvider(r9, r3)     // Catch:{ RuntimeException -> 0x003c }
            goto L_0x0045
        L_0x003c:
            r9 = move-exception
            java.lang.String r3 = f7240a     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Failed to query content resolver."
            android.util.Log.e(r3, r5, r9)     // Catch:{ all -> 0x0078 }
            r9 = r8
        L_0x0045:
            if (r9 == 0) goto L_0x0072
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r1
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ NullPointerException | SecurityException -> 0x0051 }
            r8 = r9
            goto L_0x0058
        L_0x0051:
            java.lang.String r9 = f7240a     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Failed to query content resolver."
            android.util.Log.e(r9, r1)     // Catch:{ all -> 0x0078 }
        L_0x0058:
            if (r8 == 0) goto L_0x0072
        L_0x005a:
            boolean r9 = r8.moveToNext()     // Catch:{ all -> 0x0078 }
            if (r9 == 0) goto L_0x0072
            java.lang.String r9 = "version"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0078 }
            int r9 = r8.getInt(r9)     // Catch:{ all -> 0x0078 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0078 }
            r0.add(r9)     // Catch:{ all -> 0x0078 }
            goto L_0x005a
        L_0x0072:
            if (r8 == 0) goto L_0x0077
            r8.close()
        L_0x0077:
            return r0
        L_0x0078:
            r9 = move-exception
            if (r8 == 0) goto L_0x007e
            r8.close()
        L_0x007e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2244t.m10307b(com.facebook.internal.t$e):java.util.TreeSet");
    }

    /* renamed from: b */
    public static UUID m10308b(Intent intent) {
        String str;
        UUID uuid;
        if (intent == null) {
            return null;
        }
        if (m10303a(m10289a(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str != null) {
            try {
                uuid = UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
            }
            return uuid;
        }
        uuid = null;
        return uuid;
    }

    /* renamed from: b */
    public static void m10309b() {
        if (f7244e.compareAndSet(false, true)) {
            C2189f.m10090d().execute(new Runnable() {
                public void run() {
                    try {
                        for (C2250e a : C2244t.f7241b) {
                            a.m10330a(true);
                        }
                    } finally {
                        C2244t.f7244e.set(false);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    private static Uri m10310c(C2250e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("content://");
        sb.append(eVar.mo7872a());
        sb.append(".provider.PlatformProvider/versions");
        return Uri.parse(sb.toString());
    }

    /* renamed from: c */
    public static Bundle m10311c(Intent intent) {
        if (!m10303a(m10289a(intent))) {
            return null;
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
    }

    /* renamed from: d */
    public static Bundle m10313d(Intent intent) {
        return !m10303a(m10289a(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    /* renamed from: e */
    public static Bundle m10315e(Intent intent) {
        int a = m10289a(intent);
        Bundle extras = intent.getExtras();
        return (!m10303a(a) || extras == null) ? extras : extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
    }

    /* renamed from: e */
    private static List<C2250e> m10316e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2248c());
        arrayList.add(new C2252g());
        return arrayList;
    }

    /* renamed from: f */
    private static List<C2250e> m10317f() {
        ArrayList arrayList = new ArrayList(m10316e());
        arrayList.add(0, new C2246a());
        return arrayList;
    }

    /* renamed from: f */
    public static boolean m10318f(Intent intent) {
        Bundle c = m10311c(intent);
        return c != null ? c.containsKey("error") : intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
    }

    /* renamed from: g */
    public static Bundle m10319g(Intent intent) {
        if (!m10318f(intent)) {
            return null;
        }
        Bundle c = m10311c(intent);
        return c != null ? c.getBundle("error") : intent.getExtras();
    }

    /* renamed from: g */
    private static Map<String, List<C2250e>> m10320g() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2249d());
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", f7241b);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", f7241b);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", f7241b);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", f7241b);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f7242c);
        return hashMap;
    }
}
