package com.facebook.ads.internal.p077s.p078a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.Signature;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;

/* renamed from: com.facebook.ads.internal.s.a.g */
public class C1795g {

    /* renamed from: a */
    private static final String f5844a = "g";

    /* renamed from: com.facebook.ads.internal.s.a.g$a */
    public enum C1796a {
        UNKNOWN(0),
        UNROOTED(1),
        ROOTED(2);
        

        /* renamed from: d */
        public final int f5849d;

        private C1796a(int i) {
            this.f5849d = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a A[Catch:{ Throwable -> 0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[Catch:{ Throwable -> 0x0020 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.ads.internal.p077s.p078a.C1795g.C1796a m8900a() {
        /*
            boolean r0 = m8906c()     // Catch:{ Throwable -> 0x0020 }
            if (r0 != 0) goto L_0x0017
            boolean r0 = m8905b()     // Catch:{ Throwable -> 0x0020 }
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "su"
            boolean r0 = m8903a(r0)     // Catch:{ Throwable -> 0x0020 }
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            if (r0 == 0) goto L_0x001d
            com.facebook.ads.internal.s.a.g$a r0 = com.facebook.ads.internal.p077s.p078a.C1795g.C1796a.ROOTED     // Catch:{ Throwable -> 0x0020 }
            return r0
        L_0x001d:
            com.facebook.ads.internal.s.a.g$a r0 = com.facebook.ads.internal.p077s.p078a.C1795g.C1796a.UNROOTED     // Catch:{ Throwable -> 0x0020 }
            return r0
        L_0x0020:
            com.facebook.ads.internal.s.a.g$a r0 = com.facebook.ads.internal.p077s.p078a.C1795g.C1796a.UNKNOWN
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p077s.p078a.C1795g.m8900a():com.facebook.ads.internal.s.a.g$a");
    }

    /* renamed from: a */
    public static String m8901a(Context context) {
        try {
            return m8904b(context);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static PublicKey m8902a(Signature signature) {
        return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getPublicKey();
    }

    /* renamed from: a */
    private static boolean m8903a(String str) {
        for (String file : System.getenv("PATH").split(":")) {
            File file2 = new File(file);
            if (file2.exists() && file2.isDirectory()) {
                File[] listFiles = file2.listFiles();
                if (listFiles == null) {
                    continue;
                } else {
                    for (File name : listFiles) {
                        if (name.getName().equals(str)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: b */
    private static String m8904b(Context context) {
        StringBuilder sb = new StringBuilder();
        for (Signature a : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
            sb.append(C1798i.m8911a(MessageDigest.getInstance("SHA1").digest(m8902a(a).getEncoded())));
            sb.append(";");
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m8905b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: c */
    private static boolean m8906c() {
        return new File("/system/app/Superuser.apk").exists();
    }
}
