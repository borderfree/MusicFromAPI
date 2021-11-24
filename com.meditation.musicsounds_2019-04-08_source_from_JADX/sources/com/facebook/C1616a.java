package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C2264y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a */
class C1616a {

    /* renamed from: a */
    private final SharedPreferences f5257a;

    /* renamed from: b */
    private final C1617a f5258b;

    /* renamed from: c */
    private C2275j f5259c;

    /* renamed from: com.facebook.a$a */
    static class C1617a {
        C1617a() {
        }

        /* renamed from: a */
        public C2275j mo6630a() {
            return new C2275j(C2189f.m10092f());
        }
    }

    public C1616a() {
        this(C2189f.m10092f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new C1617a());
    }

    C1616a(SharedPreferences sharedPreferences, C1617a aVar) {
        this.f5257a = sharedPreferences;
        this.f5258b = aVar;
    }

    /* renamed from: c */
    private boolean m8116c() {
        return this.f5257a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: d */
    private AccessToken m8117d() {
        String string = this.f5257a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                return AccessToken.m7987a(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    private boolean m8118e() {
        return C2189f.m10089c();
    }

    /* renamed from: f */
    private AccessToken m8119f() {
        Bundle a = m8120g().mo7925a();
        if (a == null || !C2275j.m10473a(a)) {
            return null;
        }
        return AccessToken.m7986a(a);
    }

    /* renamed from: g */
    private C2275j m8120g() {
        if (this.f5259c == null) {
            synchronized (this) {
                if (this.f5259c == null) {
                    this.f5259c = this.f5258b.mo6630a();
                }
            }
        }
        return this.f5259c;
    }

    /* renamed from: a */
    public AccessToken mo6627a() {
        if (m8116c()) {
            return m8117d();
        }
        if (!m8118e()) {
            return null;
        }
        AccessToken f = m8119f();
        if (f == null) {
            return f;
        }
        mo6628a(f);
        m8120g().mo7926b();
        return f;
    }

    /* renamed from: a */
    public void mo6628a(AccessToken accessToken) {
        C2264y.m10422a((Object) accessToken, "accessToken");
        try {
            this.f5257a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.mo6530k().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public void mo6629b() {
        this.f5257a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m8118e()) {
            m8120g().mo7926b();
        }
    }
}
