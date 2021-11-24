package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.C3269u;
import com.google.android.gms.common.util.C3313r;

/* renamed from: com.google.firebase.c */
public final class C4897c {

    /* renamed from: a */
    private final String f17618a;

    /* renamed from: b */
    private final String f17619b;

    /* renamed from: c */
    private final String f17620c;

    /* renamed from: d */
    private final String f17621d;

    /* renamed from: e */
    private final String f17622e;

    /* renamed from: f */
    private final String f17623f;

    /* renamed from: g */
    private final String f17624g;

    /* renamed from: com.google.firebase.c$a */
    public static final class C4898a {

        /* renamed from: a */
        private String f17625a;

        /* renamed from: b */
        private String f17626b;

        /* renamed from: c */
        private String f17627c;

        /* renamed from: d */
        private String f17628d;

        /* renamed from: e */
        private String f17629e;

        /* renamed from: f */
        private String f17630f;

        /* renamed from: g */
        private String f17631g;

        /* renamed from: a */
        public final C4898a mo16113a(String str) {
            this.f17625a = C3266s.m14916a(str, (Object) "ApiKey must be set.");
            return this;
        }

        /* renamed from: a */
        public final C4897c mo16114a() {
            C4897c cVar = new C4897c(this.f17626b, this.f17625a, this.f17627c, this.f17628d, this.f17629e, this.f17630f, this.f17631g, 0);
            return cVar;
        }

        /* renamed from: b */
        public final C4898a mo16115b(String str) {
            this.f17626b = C3266s.m14916a(str, (Object) "ApplicationId must be set.");
            return this;
        }
    }

    private C4897c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C3266s.m14920a(!C3313r.m15087a(str), (Object) "ApplicationId must be set.");
        this.f17619b = str;
        this.f17618a = str2;
        this.f17620c = str3;
        this.f17621d = str4;
        this.f17622e = str5;
        this.f17623f = str6;
        this.f17624g = str7;
    }

    /* synthetic */ C4897c(String str, String str2, String str3, String str4, String str5, String str6, String str7, byte b) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    /* renamed from: a */
    public static C4897c m24431a(Context context) {
        C3269u uVar = new C3269u(context);
        String a = uVar.mo11291a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        C4897c cVar = new C4897c(a, uVar.mo11291a("google_api_key"), uVar.mo11291a("firebase_database_url"), uVar.mo11291a("ga_trackingId"), uVar.mo11291a("gcm_defaultSenderId"), uVar.mo11291a("google_storage_bucket"), uVar.mo11291a("project_id"));
        return cVar;
    }

    /* renamed from: a */
    public final String mo16108a() {
        return this.f17619b;
    }

    /* renamed from: b */
    public final String mo16109b() {
        return this.f17622e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4897c)) {
            return false;
        }
        C4897c cVar = (C4897c) obj;
        return C3261q.m14906a(this.f17619b, cVar.f17619b) && C3261q.m14906a(this.f17618a, cVar.f17618a) && C3261q.m14906a(this.f17620c, cVar.f17620c) && C3261q.m14906a(this.f17621d, cVar.f17621d) && C3261q.m14906a(this.f17622e, cVar.f17622e) && C3261q.m14906a(this.f17623f, cVar.f17623f) && C3261q.m14906a(this.f17624g, cVar.f17624g);
    }

    public final int hashCode() {
        return C3261q.m14904a(this.f17619b, this.f17618a, this.f17620c, this.f17621d, this.f17622e, this.f17623f, this.f17624g);
    }

    public final String toString() {
        return C3261q.m14905a((Object) this).mo11288a("applicationId", this.f17619b).mo11288a("apiKey", this.f17618a).mo11288a("databaseUrl", this.f17620c).mo11288a("gcmSenderId", this.f17622e).mo11288a("storageBucket", this.f17623f).mo11288a("projectId", this.f17624g).toString();
    }
}
