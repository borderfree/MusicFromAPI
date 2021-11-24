package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C3266s;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C2981b {

    /* renamed from: a */
    private static final Lock f10509a = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: b */
    private static C2981b f10510b;

    /* renamed from: c */
    private final Lock f10511c = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: d */
    private final SharedPreferences f10512d;

    private C2981b(Context context) {
        this.f10512d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @Nullable
    /* renamed from: a */
    private final GoogleSignInAccount m13902a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m13907c(m13906b("googleSignInAccount", str));
        if (c != null) {
            try {
                return GoogleSignInAccount.m13849a(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C2981b m13903a(Context context) {
        C3266s.m14913a(context);
        f10509a.lock();
        try {
            if (f10510b == null) {
                f10510b = new C2981b(context.getApplicationContext());
            }
            return f10510b;
        } finally {
            f10509a.unlock();
        }
    }

    /* renamed from: a */
    private final void m13904a(String str, String str2) {
        this.f10511c.lock();
        try {
            this.f10512d.edit().putString(str, str2).apply();
        } finally {
            this.f10511c.unlock();
        }
    }

    @Nullable
    /* renamed from: b */
    private final GoogleSignInOptions m13905b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m13907c(m13906b("googleSignInOptions", str));
        if (c != null) {
            try {
                return GoogleSignInOptions.m13864a(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m13906b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    /* renamed from: c */
    private final String m13907c(String str) {
        this.f10511c.lock();
        try {
            return this.f10512d.getString(str, null);
        } finally {
            this.f10511c.unlock();
        }
    }

    /* renamed from: d */
    private final void m13908d(String str) {
        this.f10511c.lock();
        try {
            this.f10512d.edit().remove(str).apply();
        } finally {
            this.f10511c.unlock();
        }
    }

    @Nullable
    /* renamed from: a */
    public GoogleSignInAccount mo10720a() {
        return m13902a(m13907c("defaultGoogleSignInAccount"));
    }

    /* renamed from: a */
    public void mo10721a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C3266s.m14913a(googleSignInAccount);
        C3266s.m14913a(googleSignInOptions);
        m13904a("defaultGoogleSignInAccount", googleSignInAccount.mo10679j());
        C3266s.m14913a(googleSignInAccount);
        C3266s.m14913a(googleSignInOptions);
        String j = googleSignInAccount.mo10679j();
        m13904a(m13906b("googleSignInAccount", j), googleSignInAccount.mo10681l());
        m13904a(m13906b("googleSignInOptions", j), googleSignInOptions.mo10691h());
    }

    @Nullable
    /* renamed from: b */
    public GoogleSignInOptions mo10722b() {
        return m13905b(m13907c("defaultGoogleSignInAccount"));
    }

    @Nullable
    /* renamed from: c */
    public String mo10723c() {
        return m13907c("refreshToken");
    }

    /* renamed from: d */
    public final void mo10724d() {
        String c = m13907c("defaultGoogleSignInAccount");
        m13908d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c)) {
            m13908d(m13906b("googleSignInAccount", c));
            m13908d(m13906b("googleSignInOptions", c));
        }
    }

    /* renamed from: e */
    public void mo10725e() {
        this.f10511c.lock();
        try {
            this.f10512d.edit().clear().apply();
        } finally {
            this.f10511c.unlock();
        }
    }
}
