package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p009v4.content.C0452b;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p130e.C4174c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: com.google.firebase.iid.ay */
final class C4947ay {
    C4947ay() {
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0062=Splitter:B:19:0x0062, B:32:0x00a2=Splitter:B:32:0x00a2, B:53:0x00be=Splitter:B:53:0x00be} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C4948az m24584a(android.content.Context r9, java.lang.String r10, com.google.firebase.iid.C4948az r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "Writing key to properties file"
            android.util.Log.d(r0, r2)
        L_0x0010:
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r2 = "pub"
            java.lang.String r3 = r11.m24602b()
            r0.setProperty(r2, r3)
            java.lang.String r2 = "pri"
            java.lang.String r3 = r11.m24605c()
            r0.setProperty(r2, r3)
            java.lang.String r2 = "cre"
            long r3 = r11.f17748b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.setProperty(r2, r3)
            java.io.File r9 = m24598e(r9, r10)
            r10 = 0
            r9.createNewFile()     // Catch:{ IOException -> 0x00c2 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00c2 }
            java.lang.String r3 = "rw"
            r2.<init>(r9, r3)     // Catch:{ IOException -> 0x00c2 }
            java.nio.channels.FileChannel r9 = r2.getChannel()     // Catch:{ Throwable -> 0x00b8, all -> 0x00b5 }
            r9.lock()     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            r3 = 0
            if (r12 == 0) goto L_0x0093
            long r5 = r9.size()     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x0093
            r9.position(r3)     // Catch:{ zzaa | IOException -> 0x0066 }
            com.google.firebase.iid.az r12 = m24587a(r9)     // Catch:{ zzaa | IOException -> 0x0066 }
            if (r9 == 0) goto L_0x0062
            m24593a(r10, r9)     // Catch:{ Throwable -> 0x00b8, all -> 0x00b5 }
        L_0x0062:
            m24592a(r10, r2)     // Catch:{ IOException -> 0x00c2 }
            return r12
        L_0x0066:
            r12 = move-exception
            java.lang.String r5 = "FirebaseInstanceId"
            boolean r1 = android.util.Log.isLoggable(r5, r1)     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            if (r1 == 0) goto L_0x0093
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            java.lang.String r5 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            int r5 = r5.length()     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            int r5 = r5 + 64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            java.lang.String r5 = "Tried reading key pair before writing new one, but failed with: "
            r6.append(r5)     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            r6.append(r12)     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            java.lang.String r12 = r6.toString()     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            android.util.Log.d(r1, r12)     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
        L_0x0093:
            r9.position(r3)     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            java.io.OutputStream r12 = java.nio.channels.Channels.newOutputStream(r9)     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            r0.store(r12, r10)     // Catch:{ Throwable -> 0x00a9, all -> 0x00a6 }
            if (r9 == 0) goto L_0x00a2
            m24593a(r10, r9)     // Catch:{ Throwable -> 0x00b8, all -> 0x00b5 }
        L_0x00a2:
            m24592a(r10, r2)     // Catch:{ IOException -> 0x00c2 }
            return r11
        L_0x00a6:
            r11 = move-exception
            r12 = r10
            goto L_0x00af
        L_0x00a9:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r12 = move-exception
            r7 = r12
            r12 = r11
            r11 = r7
        L_0x00af:
            if (r9 == 0) goto L_0x00b4
            m24593a(r12, r9)     // Catch:{ Throwable -> 0x00b8, all -> 0x00b5 }
        L_0x00b4:
            throw r11     // Catch:{ Throwable -> 0x00b8, all -> 0x00b5 }
        L_0x00b5:
            r9 = move-exception
            r11 = r10
            goto L_0x00be
        L_0x00b8:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r11 = move-exception
            r7 = r11
            r11 = r9
            r9 = r7
        L_0x00be:
            m24592a(r11, r2)     // Catch:{ IOException -> 0x00c2 }
            throw r9     // Catch:{ IOException -> 0x00c2 }
        L_0x00c2:
            r9 = move-exception
            java.lang.String r11 = "FirebaseInstanceId"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r12 = java.lang.String.valueOf(r9)
            int r12 = r12.length()
            int r12 = r12 + 21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "Failed to write key: "
            r0.append(r12)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.util.Log.w(r11, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4947ay.m24584a(android.content.Context, java.lang.String, com.google.firebase.iid.az, boolean):com.google.firebase.iid.az");
    }

    /* renamed from: a */
    private static C4948az m24585a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C4971x.m24668a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(C4971x.m24668a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new C4948az(m24588a(string, string2), m24594b(sharedPreferences, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        m24591a(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C4948az m24586a(java.io.File r10) {
        /*
            r9 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            r10 = 0
            java.nio.channels.FileChannel r7 = r0.getChannel()     // Catch:{ Throwable -> 0x0034 }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r7
            r1.lock(r2, r4, r6)     // Catch:{ Throwable -> 0x0026, all -> 0x0023 }
            com.google.firebase.iid.az r1 = m24587a(r7)     // Catch:{ Throwable -> 0x0026, all -> 0x0023 }
            if (r7 == 0) goto L_0x001f
            m24593a(r10, r7)     // Catch:{ Throwable -> 0x0034 }
        L_0x001f:
            m24591a(r10, r0)
            return r1
        L_0x0023:
            r1 = move-exception
            r2 = r10
            goto L_0x002c
        L_0x0026:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
        L_0x002c:
            if (r7 == 0) goto L_0x0031
            m24593a(r2, r7)     // Catch:{ Throwable -> 0x0034 }
        L_0x0031:
            throw r1     // Catch:{ Throwable -> 0x0034 }
        L_0x0032:
            r1 = move-exception
            goto L_0x0036
        L_0x0034:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0032 }
        L_0x0036:
            m24591a(r10, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4947ay.m24586a(java.io.File):com.google.firebase.iid.az");
    }

    /* renamed from: a */
    private static C4948az m24587a(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new zzaa("Invalid properties file");
        }
        try {
            return new C4948az(m24588a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new zzaa((Exception) e);
        }
    }

    /* renamed from: a */
    private static KeyPair m24588a(String str, String str2) {
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
                Log.w("FirebaseInstanceId", sb.toString());
                throw new zzaa((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new zzaa((Exception) e2);
        }
    }

    /* renamed from: a */
    static void m24589a(Context context) {
        File[] listFiles;
        for (File file : m24595b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private final void m24590a(Context context, String str, C4948az azVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (azVar.equals(m24585a(sharedPreferences, str))) {
                return;
            }
        } catch (zzaa unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(C4971x.m24668a(str, "|P|"), azVar.m24602b());
        edit.putString(C4971x.m24668a(str, "|K|"), azVar.m24605c());
        edit.putString(C4971x.m24668a(str, "cre"), String.valueOf(azVar.f17748b));
        edit.commit();
    }

    /* renamed from: a */
    private static /* synthetic */ void m24591a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C4174c.m20814a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m24592a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C4174c.m20814a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m24593a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C4174c.m20814a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* renamed from: b */
    private static long m24594b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C4971x.m24668a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static File m24595b(Context context) {
        File b = C0452b.m2067b(context);
        if (b != null && b.isDirectory()) {
            return b;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: c */
    private final C4948az m24596c(Context context, String str) {
        try {
            C4948az d = m24597d(context, str);
            if (d != null) {
                m24590a(context, str, d);
                return d;
            }
            e = null;
            try {
                C4948az a = m24585a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m24584a(context, str, a, false);
                    return a;
                }
            } catch (zzaa e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (zzaa e2) {
            e = e2;
        }
    }

    /* renamed from: d */
    private final C4948az m24597d(Context context, String str) {
        File e = m24598e(context, str);
        if (!e.exists()) {
            return null;
        }
        try {
            return m24586a(e);
        } catch (zzaa | IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return m24586a(e);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new zzaa((Exception) e3);
            }
        }
    }

    /* renamed from: e */
    private static File m24598e(Context context, String str) {
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
        return new File(m24595b(context), str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4948az mo16211a(Context context, String str) {
        C4948az c = m24596c(context, str);
        return c != null ? c : mo16212b(context, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C4948az mo16212b(Context context, String str) {
        C4948az azVar = new C4948az(C4950c.m24614a(), System.currentTimeMillis());
        C4948az a = m24584a(context, str, azVar, true);
        if (a == null || a.equals(azVar)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Generated new key");
            }
            m24590a(context, str, azVar);
            return azVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
        }
        return a;
    }
}
