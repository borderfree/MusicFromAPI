package com.google.android.gms.auth;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.C3171b;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.C3248j;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p121b.C3172a;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.b */
public class C3002b {
    @SuppressLint({"InlinedApi"})

    /* renamed from: a */
    public static final String f10526a = "callerUid";
    @SuppressLint({"InlinedApi"})

    /* renamed from: b */
    public static final String f10527b = "androidPackageName";

    /* renamed from: c */
    private static final String[] f10528c = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: d */
    private static final ComponentName f10529d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C3172a f10530e = new C3172a("Auth", "GoogleAuthUtil");

    /* renamed from: a */
    private static <T> T m13954a(Context context, ComponentName componentName, C3005e<T> eVar) {
        C3171b bVar = new C3171b();
        C3248j a = C3248j.m14881a(context);
        if (a.mo11273a(componentName, (ServiceConnection) bVar, "GoogleAuthUtil")) {
            try {
                T a2 = eVar.mo10750a(bVar.mo11093a());
                a.mo11274b(componentName, (ServiceConnection) bVar, "GoogleAuthUtil");
                return a2;
            } catch (RemoteException | InterruptedException e) {
                f10530e.mo11099b("GoogleAuthUtil", "Error on service connection.", e);
                throw new IOException("Error on service connection.", e);
            } catch (Throwable th) {
                a.mo11274b(componentName, (ServiceConnection) bVar, "GoogleAuthUtil");
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service.");
        }
    }

    /* renamed from: a */
    public static String m13956a(Context context, Account account, String str, Bundle bundle) {
        m13957a(account);
        return m13959b(context, account, str, bundle).mo10659a();
    }

    /* renamed from: a */
    private static void m13957a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = f10528c;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        } else {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
    }

    /* renamed from: a */
    private static void m13958a(Context context, int i) {
        try {
            C3183f.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (GooglePlayServicesRepairableException e) {
            throw new GooglePlayServicesAvailabilityException(e.getConnectionStatusCode(), e.getMessage(), e.getIntent());
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new GoogleAuthException(e2.getMessage());
        }
    }

    /* renamed from: b */
    public static TokenData m13959b(Context context, Account account, String str, Bundle bundle) {
        C3266s.m14926c("Calling this from your main thread can lead to deadlock");
        C3266s.m14916a(str, (Object) "Scope cannot be empty or null.");
        m13957a(account);
        m13958a(context, 8400000);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(f10527b))) {
            bundle2.putString(f10527b, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) m13954a(context, f10529d, new C3003c(account, str, bundle2));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> T m13960b(T t) {
        if (t != null) {
            return t;
        }
        f10530e.mo11100c("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }

    /* renamed from: b */
    public static String m13961b(Context context, Account account, String str) {
        return m13956a(context, account, str, new Bundle());
    }

    /* renamed from: b */
    public static void m13962b(Context context, String str) {
        C3266s.m14926c("Calling this from your main thread can lead to deadlock");
        m13958a(context, 8400000);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(f10527b)) {
            bundle.putString(f10527b, str2);
        }
        m13954a(context, f10529d, new C3004d(str, bundle));
    }
}
