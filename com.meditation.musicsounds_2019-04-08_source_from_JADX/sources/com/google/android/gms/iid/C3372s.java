package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p009v4.content.C0452b;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p131f.C4183c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: com.google.android.gms.iid.s */
final class C3372s {
    C3372s() {
    }

    /* renamed from: a */
    private static C3373t m15243a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C3365l.m15227a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(C3365l.m15227a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new C3373t(m15245a(string, string2), m15250b(sharedPreferences, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        m15248a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.iid.C3373t m15244a(java.io.File r5) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r5)
            r5 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ Throwable -> 0x0043 }
            r1.<init>()     // Catch:{ Throwable -> 0x0043 }
            r1.load(r0)     // Catch:{ Throwable -> 0x0043 }
            java.lang.String r2 = "pub"
            java.lang.String r2 = r1.getProperty(r2)     // Catch:{ Throwable -> 0x0043 }
            java.lang.String r3 = "pri"
            java.lang.String r3 = r1.getProperty(r3)     // Catch:{ Throwable -> 0x0043 }
            if (r2 == 0) goto L_0x003d
            if (r3 != 0) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.security.KeyPair r2 = m15245a(r2, r3)     // Catch:{ Throwable -> 0x0043 }
            java.lang.String r3 = "cre"
            java.lang.String r1 = r1.getProperty(r3)     // Catch:{ NumberFormatException -> 0x0036 }
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0036 }
            com.google.android.gms.iid.t r1 = new com.google.android.gms.iid.t     // Catch:{ Throwable -> 0x0043 }
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x0043 }
            m15248a(r5, r0)
            return r1
        L_0x0036:
            r1 = move-exception
            com.google.android.gms.iid.zzp r2 = new com.google.android.gms.iid.zzp     // Catch:{ Throwable -> 0x0043 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0043 }
            throw r2     // Catch:{ Throwable -> 0x0043 }
        L_0x003d:
            m15248a(r5, r0)
            return r5
        L_0x0041:
            r1 = move-exception
            goto L_0x0045
        L_0x0043:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0041 }
        L_0x0045:
            m15248a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.C3372s.m15244a(java.io.File):com.google.android.gms.iid.t");
    }

    /* renamed from: a */
    private static KeyPair m15245a(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
                throw new zzp(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new zzp(e2);
        }
    }

    /* renamed from: a */
    static void m15246a(Context context) {
        File[] listFiles;
        for (File file : m15251b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private static void m15247a(Context context, String str, C3373t tVar) {
        FileOutputStream fileOutputStream;
        try {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Writing key to properties file");
            }
            File f = m15256f(context, str);
            f.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", tVar.m15260b());
            properties.setProperty("pri", tVar.m15263c());
            properties.setProperty("cre", String.valueOf(tVar.f11310b));
            fileOutputStream = new FileOutputStream(f);
            properties.store(fileOutputStream, null);
            m15249a((Throwable) null, fileOutputStream);
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to write key: ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
        } catch (Throwable th) {
            m15249a(r3, fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m15248a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C4183c.m20824a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m15249a(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C4183c.m20824a(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    /* renamed from: b */
    private static long m15250b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C3365l.m15227a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static File m15251b(Context context) {
        File b = C0452b.m2067b(context);
        if (b != null && b.isDirectory()) {
            return b;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: b */
    private final void m15252b(Context context, String str, C3373t tVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (tVar.equals(m15243a(sharedPreferences, str))) {
                return;
            }
        } catch (zzp unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Writing key to shared preferences");
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(C3365l.m15227a(str, "|P|"), tVar.m15260b());
        edit.putString(C3365l.m15227a(str, "|K|"), tVar.m15263c());
        edit.putString(C3365l.m15227a(str, "cre"), String.valueOf(tVar.f11310b));
        edit.commit();
    }

    /* renamed from: c */
    static void m15253c(Context context, String str) {
        File f = m15256f(context, str);
        if (f.exists()) {
            f.delete();
        }
    }

    /* renamed from: d */
    private final C3373t m15254d(Context context, String str) {
        try {
            C3373t e = m15255e(context, str);
            if (e != null) {
                m15252b(context, str, e);
                return e;
            }
            e = null;
            try {
                C3373t a = m15243a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m15247a(context, str, a);
                    return a;
                }
            } catch (zzp e2) {
                e = e2;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (zzp e3) {
            e = e3;
        }
    }

    /* renamed from: e */
    private final C3373t m15255e(Context context, String str) {
        File f = m15256f(context, str);
        if (!f.exists()) {
            return null;
        }
        try {
            return m15244a(f);
        } catch (IOException e) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("InstanceID", sb.toString());
            }
            try {
                return m15244a(f);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("InstanceID", sb2.toString());
                throw new zzp(e2);
            }
        }
    }

    /* renamed from: f */
    private static File m15256f(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m15251b(context), str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C3373t mo11400a(Context context, String str) {
        C3373t d = m15254d(context, str);
        return d != null ? d : mo11401b(context, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C3373t mo11401b(Context context, String str) {
        C3373t tVar = new C3373t(C3366m.m15237a(), System.currentTimeMillis());
        try {
            C3373t d = m15254d(context, str);
            if (d != null) {
                if (Log.isLoggable("InstanceID", 3)) {
                    Log.d("InstanceID", "Loaded key after generating new one, using loaded one");
                }
                return d;
            }
        } catch (zzp unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Generated new key");
        }
        m15247a(context, str, tVar);
        m15252b(context, str, tVar);
        return tVar;
    }
}
