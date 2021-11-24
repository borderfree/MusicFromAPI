package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.common.util.C3301f;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.google.android.gms.measurement.internal.ek */
public final class C4736ek extends C4662bs {

    /* renamed from: a */
    private static final String[] f17050a = {"firebase_", "google_", "ga_"};

    /* renamed from: b */
    private SecureRandom f17051b;

    /* renamed from: c */
    private final AtomicLong f17052c = new AtomicLong(0);

    /* renamed from: d */
    private int f17053d;

    /* renamed from: e */
    private Integer f17054e = null;

    C4736ek(C4638av avVar) {
        super(avVar);
    }

    /* renamed from: a */
    public static long m23524a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* renamed from: a */
    static long m23525a(byte[] bArr) {
        C3266s.m14913a(bArr);
        int i = 0;
        C3266s.m14919a(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: a */
    private static Object m23526a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m23527a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m23527a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: a */
    private static void m23528a(Bundle bundle, Object obj) {
        C3266s.m14913a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* renamed from: a */
    static boolean m23529a(Context context, boolean z) {
        C3266s.m14913a(context);
        return m23538b(context, VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a */
    static boolean m23530a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: a */
    private static boolean m23531a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: a */
    static boolean m23532a(String str) {
        C3266s.m14915a(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: a */
    private final boolean m23533a(String str, String str2, int i, Object obj, boolean z) {
        Parcelable[] parcelableArr;
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    mo15253r().mo15849i().mo15861a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            mo15253r().mo15849i().mo15860a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            mo15253r().mo15849i().mo15860a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    static boolean m23534a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: a */
    static byte[] m23535a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    static Bundle[] m23536a(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    /* renamed from: b */
    public static Bundle m23537b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: b */
    private static boolean m23538b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: c */
    private final boolean m23539c(Context context, String str) {
        C4769t tVar;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C3181c.m14658a(context).mo11129b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            e = e;
            tVar = mo15253r().mo15852u_();
            str2 = "Error obtaining certificate";
            tVar.mo15859a(str2, e);
            return true;
        } catch (NameNotFoundException e2) {
            e = e2;
            tVar = mo15253r().mo15852u_();
            str2 = "Package name not found";
            tVar.mo15859a(str2, e);
            return true;
        }
        return true;
    }

    /* renamed from: c */
    static boolean m23540c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: d */
    private final boolean m23541d(String str, String str2) {
        if (str2 == null) {
            mo15253r().mo15852u_().mo15859a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo15253r().mo15852u_().mo15859a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo15253r().mo15852u_().mo15860a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo15253r().mo15852u_().mo15860a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* renamed from: e */
    static boolean m23542e(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: g */
    private static boolean m23543g(String str) {
        C3266s.m14913a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: h */
    private static int m23544h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    /* renamed from: i */
    static MessageDigest m23545i() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int mo15577a(int i) {
        return C3182e.m14660b().mo11117b(mo15249n(), (int) C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo15578a(Context context, String str) {
        mo15239d();
        C3266s.m14913a(context);
        C3266s.m14915a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest i = m23545i();
        if (i == null) {
            mo15253r().mo15852u_().mo15858a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m23539c(context, str)) {
                    PackageInfo b = C3181c.m14658a(context).mo11129b(mo15249n().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m23525a(i.digest(b.signatures[0].toByteArray()));
                    }
                    mo15253r().mo15849i().mo15858a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                mo15253r().mo15852u_().mo15859a("Package name not found", e);
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo15579a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo15253r().mo15849i().mo15859a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo15580a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = mo15583a(str, bundle.get(str));
                if (a == null) {
                    mo15253r().mo15849i().mo15859a("Param value can't be null", mo15250o().mo15842b(str));
                } else {
                    mo15586a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (mo15588a("event param", 40, r14) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (mo15588a("event param", 40, r14) == false) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo15581a(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r6 = r17
            r7 = r20
            r8 = r21
            r9 = 0
            if (r7 == 0) goto L_0x016a
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r7)
            java.util.Set r0 = r20.keySet()
            java.util.Iterator r11 = r0.iterator()
            r12 = 0
            r13 = 0
        L_0x0018:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r11.next()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            r15 = 40
            r0 = 3
            if (r8 == 0) goto L_0x0033
            boolean r1 = r8.contains(r14)
            if (r1 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0075
        L_0x0033:
            r1 = 14
            if (r22 == 0) goto L_0x0055
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo15589a(r2, r14)
            if (r2 != 0) goto L_0x0041
        L_0x003f:
            r2 = 3
            goto L_0x0056
        L_0x0041:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo15590a(r2, r9, r14)
            if (r2 != 0) goto L_0x004c
            r2 = 14
            goto L_0x0056
        L_0x004c:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo15588a(r2, r15, r14)
            if (r2 != 0) goto L_0x0055
            goto L_0x003f
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 != 0) goto L_0x0074
            java.lang.String r2 = "event param"
            boolean r2 = r6.m23541d(r2, r14)
            if (r2 != 0) goto L_0x0062
        L_0x0060:
            r1 = 3
            goto L_0x0075
        L_0x0062:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo15590a(r2, r9, r14)
            if (r2 != 0) goto L_0x006b
            goto L_0x0075
        L_0x006b:
            java.lang.String r1 = "event param"
            boolean r1 = r6.mo15588a(r1, r15, r14)
            if (r1 != 0) goto L_0x0031
            goto L_0x0060
        L_0x0074:
            r1 = r2
        L_0x0075:
            r5 = 1
            if (r1 == 0) goto L_0x008e
            boolean r2 = m23531a(r10, r1)
            if (r2 == 0) goto L_0x0163
            java.lang.String r2 = m23527a(r14, r15, r5)
            java.lang.String r3 = "_ev"
            r10.putString(r3, r2)
            if (r1 != r0) goto L_0x0163
            m23528a(r10, r14)
            goto L_0x0163
        L_0x008e:
            java.lang.Object r4 = r7.get(r14)
            r17.mo15239d()
            if (r23 == 0) goto L_0x00cb
            java.lang.String r0 = "param"
            boolean r1 = r4 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x00a2
            r1 = r4
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            int r1 = r1.length
            goto L_0x00ad
        L_0x00a2:
            boolean r1 = r4 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x00c4
            r1 = r4
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
        L_0x00ad:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r2) goto L_0x00c4
            com.google.android.gms.measurement.internal.r r2 = r17.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15849i()
            java.lang.String r3 = "Parameter array is too long; discarded. Value kind, name, array length"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo15861a(r3, r0, r14, r1)
            r0 = 0
            goto L_0x00c5
        L_0x00c4:
            r0 = 1
        L_0x00c5:
            if (r0 != 0) goto L_0x00cb
            r0 = 17
            r9 = 1
            goto L_0x0102
        L_0x00cb:
            com.google.android.gms.measurement.internal.es r0 = r17.mo15255t()
            r3 = r18
            boolean r0 = r0.mo15743f(r3)
            if (r0 == 0) goto L_0x00dd
            boolean r0 = m23542e(r19)
            if (r0 != 0) goto L_0x00e3
        L_0x00dd:
            boolean r0 = m23542e(r14)
            if (r0 == 0) goto L_0x00f4
        L_0x00e3:
            java.lang.String r1 = "param"
            r16 = 256(0x100, float:3.59E-43)
            r0 = r17
            r2 = r14
            r3 = r16
            r9 = 1
        L_0x00ed:
            r5 = r23
            boolean r0 = r0.m23533a(r1, r2, r3, r4, r5)
            goto L_0x00fd
        L_0x00f4:
            r9 = 1
            java.lang.String r1 = "param"
            r3 = 100
            r0 = r17
            r2 = r14
            goto L_0x00ed
        L_0x00fd:
            if (r0 == 0) goto L_0x0101
            r0 = 0
            goto L_0x0102
        L_0x0101:
            r0 = 4
        L_0x0102:
            if (r0 == 0) goto L_0x0126
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0126
            boolean r0 = m23531a(r10, r0)
            if (r0 == 0) goto L_0x0163
            java.lang.String r0 = m23527a(r14, r15, r9)
            java.lang.String r1 = "_ev"
            r10.putString(r1, r0)
            java.lang.Object r0 = r7.get(r14)
            m23528a(r10, r0)
            goto L_0x0163
        L_0x0123:
            r9 = 0
            goto L_0x0018
        L_0x0126:
            boolean r0 = m23532a(r14)
            if (r0 == 0) goto L_0x0167
            int r13 = r13 + 1
            r0 = 25
            if (r13 <= r0) goto L_0x0167
            r0 = 48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Event can't contain more than 25 params"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.measurement.internal.r r1 = r17.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15852u_()
            com.google.android.gms.measurement.internal.p r2 = r17.mo15250o()
            r3 = r19
            java.lang.String r2 = r2.mo15841a(r3)
            com.google.android.gms.measurement.internal.p r4 = r17.mo15250o()
            java.lang.String r4 = r4.mo15838a(r7)
            r1.mo15860a(r0, r2, r4)
            r0 = 5
            m23531a(r10, r0)
        L_0x0163:
            r10.remove(r14)
            goto L_0x0123
        L_0x0167:
            r3 = r19
            goto L_0x0123
        L_0x016a:
            r10 = 0
        L_0x016b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4736ek.mo15581a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzag mo15582a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo15591b(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            zzag zzag = new zzag(str2, new zzad(mo15580a(mo15581a(str, str2, bundle2, C3301f.m15042a("_o"), false, false))), str3, j);
            return zzag;
        }
        mo15253r().mo15852u_().mo15859a("Invalid conditional property event name", mo15250o().mo15843c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo15583a(String str, Object obj) {
        boolean z;
        int i = 256;
        if ("_ev".equals(str)) {
            z = true;
        } else {
            if (!m23542e(str)) {
                i = 100;
            }
            z = false;
        }
        return m23526a(i, obj, z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* renamed from: a */
    public final void mo15584a(int i, String str, String str2, int i2) {
        mo15587a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15585a(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            mo15253r().mo15849i().mo15859a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15586a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    mo15253r().mo15851k().mo15860a("Not putting event parameter. Invalid value type. name, type", mo15250o().mo15842b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15587a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m23531a(bundle, i);
        if (!mo15255t().mo15740d(str, C4756h.f17159au) ? !TextUtils.isEmpty(str2) : !(TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3))) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f16825q.mo15256u();
        this.f16825q.mo15341h().mo15413a("auto", "_err", bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo15588a(String str, int i, String str2) {
        if (str2 == null) {
            mo15253r().mo15852u_().mo15859a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo15253r().mo15852u_().mo15861a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo15589a(String str, String str2) {
        if (str2 == null) {
            mo15253r().mo15852u_().mo15859a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo15253r().mo15852u_().mo15859a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo15253r().mo15852u_().mo15860a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo15253r().mo15852u_().mo15860a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo15590a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo15253r().mo15852u_().mo15859a("Name is required and can't be null. Type", str);
            return false;
        }
        C3266s.m14913a(str2);
        String[] strArr2 = f17050a;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo15253r().mo15852u_().mo15860a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C3266s.m14913a(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (m23540c(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                mo15253r().mo15852u_().mo15860a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo15591b(String str) {
        if (!m23541d("event", str)) {
            return 2;
        }
        if (!mo15590a("event", C4664bu.f16827a, str)) {
            return 13;
        }
        return !mo15588a("event", 40, str) ? 2 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo15592b(String str, Object obj) {
        return "_ldl".equals(str) ? m23533a("user property referrer", str, m23544h(str), obj, false) : m23533a("user property", str, m23544h(str), obj, false) ? 0 : 7;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo15593b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!m23543g(str)) {
                if (this.f16825q.mo15346o()) {
                    mo15253r().mo15852u_().mo15859a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C4767r.m23924a(str));
                }
                return false;
            }
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f16825q.mo15346o()) {
                mo15253r().mo15852u_().mo15858a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (!m23543g(str2)) {
            mo15253r().mo15852u_().mo15859a("Invalid admob_app_id. Analytics disabled.", C4767r.m23924a(str2));
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo15594c(String str) {
        if (!m23541d("user property", str)) {
            return 6;
        }
        if (!mo15590a("user property", C4666bw.f16831a, str)) {
            return 15;
        }
        return !mo15588a("user property", 24, str) ? 6 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Object mo15595c(String str, Object obj) {
        int h;
        boolean z;
        if ("_ldl".equals(str)) {
            h = m23544h(str);
            z = true;
        } else {
            h = m23544h(str);
            z = false;
        }
        return m23526a(h, obj, z);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15239d() {
        super.mo15239d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo15596d(String str) {
        mo15239d();
        if (C3181c.m14658a(mo15249n()).mo11122a(str) == 0) {
            return true;
        }
        mo15253r().mo15854w().mo15859a("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15271e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo15272f() {
        mo15239d();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo15253r().mo15849i().mo15858a("Utils falling back to Random for random id");
            }
        }
        this.f17052c.set(nextLong);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo15597f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String v = mo15255t().mo15761v();
        mo15256u();
        return v.equals(str);
    }

    /* renamed from: g */
    public final long mo15598g() {
        long andIncrement;
        long j;
        if (this.f17052c.get() == 0) {
            synchronized (this.f17052c) {
                long nextLong = new Random(System.nanoTime() ^ mo15248m().mo11326a()).nextLong();
                int i = this.f17053d + 1;
                this.f17053d = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f17052c) {
            this.f17052c.compareAndSet(-1, 1);
            andIncrement = this.f17052c.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final SecureRandom mo15599h() {
        mo15239d();
        if (this.f17051b == null) {
            this.f17051b = new SecureRandom();
        }
        return this.f17051b;
    }

    /* renamed from: j */
    public final int mo15600j() {
        if (this.f17054e == null) {
            this.f17054e = Integer.valueOf(C3182e.m14660b().mo11136d(mo15249n()) / 1000);
        }
        return this.f17054e.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final String mo15601k() {
        byte[] bArr = new byte[16];
        mo15599h().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4643b mo15247l() {
        return super.mo15247l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3300e mo15248m() {
        return super.mo15248m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo15249n() {
        return super.mo15249n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4765p mo15250o() {
        return super.mo15250o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4736ek mo15251p() {
        return super.mo15251p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4634ar mo15252q() {
        return super.mo15252q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4767r mo15253r() {
        return super.mo15253r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4620ad mo15254s() {
        return super.mo15254s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4744es mo15255t() {
        return super.mo15255t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4742eq mo15256u() {
        return super.mo15256u();
    }
}
