package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C3309n;
import com.google.firebase.C4890b;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.o */
public final class C4962o {

    /* renamed from: a */
    private final Context f17771a;
    @GuardedBy("this")

    /* renamed from: b */
    private String f17772b;
    @GuardedBy("this")

    /* renamed from: c */
    private String f17773c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f17774d;
    @GuardedBy("this")

    /* renamed from: e */
    private int f17775e = 0;

    public C4962o(Context context) {
        this.f17771a = context;
    }

    /* renamed from: a */
    private final PackageInfo m24638a(String str) {
        try {
            return this.f17771a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m24639a(C4890b bVar) {
        String b = bVar.mo16098c().mo16109b();
        if (b != null) {
            return b;
        }
        String a = bVar.mo16098c().mo16108a();
        if (!a.startsWith("1:")) {
            return a;
        }
        String[] split = a.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static String m24640a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: e */
    private final synchronized void m24641e() {
        PackageInfo a = m24638a(this.f17771a.getPackageName());
        if (a != null) {
            this.f17772b = Integer.toString(a.versionCode);
            this.f17773c = a.versionName;
        }
    }

    /* renamed from: a */
    public final synchronized int mo16236a() {
        if (this.f17775e != 0) {
            return this.f17775e;
        }
        PackageManager packageManager = this.f17771a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C3309n.m15080l()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f17775e = 1;
                return this.f17775e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C3309n.m15080l()) {
                this.f17775e = 2;
            } else {
                this.f17775e = 1;
            }
            return this.f17775e;
        }
        this.f17775e = 2;
        return this.f17775e;
    }

    /* renamed from: b */
    public final synchronized String mo16237b() {
        if (this.f17772b == null) {
            m24641e();
        }
        return this.f17772b;
    }

    /* renamed from: c */
    public final synchronized String mo16238c() {
        if (this.f17773c == null) {
            m24641e();
        }
        return this.f17773c;
    }

    /* renamed from: d */
    public final synchronized int mo16239d() {
        if (this.f17774d == 0) {
            PackageInfo a = m24638a("com.google.android.gms");
            if (a != null) {
                this.f17774d = a.versionCode;
            }
        }
        return this.f17774d;
    }
}
