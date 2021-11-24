package com.seattleclouds.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C2177c;
import com.facebook.C2177c.C2178a;
import com.facebook.C2185d;
import com.facebook.C2199i;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookRequestError.Category;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1610c;
import com.facebook.Profile;
import com.facebook.login.C2306d;
import com.facebook.login.C2311e;
import com.facebook.share.model.ShareLinkContent.C2361a;
import com.facebook.share.widget.ShareDialog;
import com.facebook.share.widget.ShareDialog.Mode;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6555r;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.util.ag */
public class C6578ag implements C2185d<C2311e> {

    /* renamed from: a */
    public static final String[] f23264a = {"public_profile", "email"};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f23265e = "ag";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Boolean f23266f = Boolean.valueOf(true);

    /* renamed from: b */
    C6583b f23267b;

    /* renamed from: c */
    C2177c f23268c;

    /* renamed from: d */
    C2185d<C2311e> f23269d = new C2185d<C2311e>() {
        /* renamed from: a */
        public void mo7742a() {
            if (C6578ag.f23266f.booleanValue()) {
                Log.d(C6578ag.f23265e, "onCancel: ");
            }
        }

        /* renamed from: a */
        public void mo7743a(FacebookException facebookException) {
            String g = C6578ag.f23265e;
            StringBuilder sb = new StringBuilder();
            sb.append("onError: ");
            sb.append(facebookException.getLocalizedMessage());
            Log.e(g, sb.toString());
            C6578ag.this.f23267b.mo17563a(C6578ag.this.m31841b(facebookException));
        }

        /* renamed from: a */
        public void mo7744a(C2311e eVar) {
            C6578ag.this.m31842b(eVar);
        }
    };

    /* renamed from: g */
    private boolean f23270g;

    /* renamed from: com.seattleclouds.util.ag$a */
    public class C6582a {

        /* renamed from: a */
        String f23275a;

        /* renamed from: b */
        String f23276b;

        /* renamed from: c */
        String f23277c;

        /* renamed from: d */
        String f23278d;

        /* renamed from: e */
        String f23279e;

        /* renamed from: f */
        String f23280f;

        /* renamed from: g */
        String f23281g;

        /* renamed from: h */
        String f23282h;

        /* renamed from: i */
        String f23283i;

        /* renamed from: j */
        String f23284j;

        public C6582a() {
        }

        /* renamed from: a */
        public String mo20558a() {
            return this.f23275a;
        }

        /* renamed from: b */
        public String mo20559b() {
            return this.f23281g;
        }

        /* renamed from: c */
        public String mo20560c() {
            return this.f23276b;
        }

        /* renamed from: d */
        public String mo20561d() {
            return this.f23278d;
        }

        /* renamed from: e */
        public String mo20562e() {
            return this.f23277c;
        }

        /* renamed from: f */
        public String mo20563f() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f23277c);
            sb.append(" ");
            sb.append(this.f23278d);
            return sb.toString().trim();
        }

        /* renamed from: g */
        public String mo20564g() {
            return this.f23279e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FacebookUser{id='");
            sb.append(this.f23275a);
            sb.append('\'');
            sb.append(", token='");
            sb.append(this.f23276b);
            sb.append('\'');
            sb.append(", firstname='");
            sb.append(this.f23277c);
            sb.append('\'');
            sb.append(", lastname='");
            sb.append(this.f23278d);
            sb.append('\'');
            sb.append(", gender='");
            sb.append(this.f23279e);
            sb.append('\'');
            sb.append(", birthdate='");
            sb.append(this.f23280f);
            sb.append('\'');
            sb.append(", email='");
            sb.append(this.f23281g);
            sb.append('\'');
            sb.append(", urlPicture='");
            sb.append(this.f23284j);
            sb.append('\'');
            sb.append(", city='");
            sb.append(this.f23282h);
            sb.append('\'');
            sb.append(", country='");
            sb.append(this.f23283i);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: com.seattleclouds.util.ag$b */
    public interface C6583b {
        /* renamed from: a */
        void mo17562a(C6582a aVar);

        /* renamed from: a */
        void mo17563a(C6584c cVar);
    }

    /* renamed from: com.seattleclouds.util.ag$c */
    public static class C6584c {

        /* renamed from: a */
        public static final long f23286a = ((long) Category.LOGIN_RECOVERABLE.hashCode());

        /* renamed from: b */
        public static final long f23287b = ((long) Category.TRANSIENT.hashCode());

        /* renamed from: c */
        public static final long f23288c = ((long) Category.OTHER.hashCode());

        /* renamed from: d */
        private String f23289d = "";

        /* renamed from: e */
        private String f23290e = "";

        /* renamed from: f */
        private long f23291f = f23288c;

        /* renamed from: a */
        public String mo20566a() {
            return this.f23289d;
        }

        /* renamed from: a */
        public void mo20567a(long j) {
            this.f23291f = j;
        }

        /* renamed from: a */
        public void mo20568a(String str) {
            this.f23289d = str;
        }

        /* renamed from: b */
        public String mo20569b() {
            return this.f23290e;
        }

        /* renamed from: b */
        public void mo20570b(String str) {
            this.f23290e = str;
        }

        /* renamed from: c */
        public long mo20571c() {
            return this.f23291f;
        }
    }

    public C6578ag(C6583b bVar) {
        m31839a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C6582a m31833a(JSONObject jSONObject) {
        try {
            C6582a aVar = new C6582a();
            if (jSONObject.has("id")) {
                aVar.f23275a = jSONObject.getString("id");
            }
            if (jSONObject.has("picture")) {
                StringBuilder sb = new StringBuilder();
                sb.append("https://graph.facebook.com/");
                sb.append(aVar.f23275a);
                sb.append("/picture?width=200&height=150");
                aVar.f23284j = sb.toString();
            }
            if (jSONObject.has("first_name")) {
                aVar.f23277c = jSONObject.getString("first_name");
            }
            if (jSONObject.has("last_name")) {
                aVar.f23278d = jSONObject.getString("last_name");
            }
            if (jSONObject.has("email")) {
                aVar.f23281g = jSONObject.getString("email");
            }
            if (jSONObject.has("gender")) {
                aVar.f23279e = jSONObject.getString("gender");
            }
            if (jSONObject.has("birthday")) {
                aVar.f23280f = jSONObject.getString("birthday");
            }
            return aVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return new C6582a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C6584c m31834a(FacebookRequestError facebookRequestError) {
        return m31835a(facebookRequestError, (FacebookException) null);
    }

    /* renamed from: a */
    private C6584c m31835a(FacebookRequestError facebookRequestError, FacebookException facebookException) {
        String str;
        Resources f;
        int i;
        Object[] objArr;
        C6584c cVar = new C6584c();
        if (facebookException == null) {
            cVar.mo20570b(facebookRequestError.mo6560g());
            switch (facebookRequestError.mo6553a()) {
                case LOGIN_RECOVERABLE:
                    cVar.mo20567a(C6584c.f23286a);
                    f = App.m25651f();
                    i = C5462k.facebook_error_authentication_retry;
                    objArr = new Object[]{facebookRequestError.mo6559f()};
                    break;
                case TRANSIENT:
                    cVar.mo20567a(C6584c.f23287b);
                    f = App.m25651f();
                    i = C5462k.facebook_error_transient;
                    objArr = new Object[]{facebookRequestError.mo6559f()};
                    break;
                default:
                    cVar.mo20567a(C6584c.f23288c);
                    f = App.m25651f();
                    i = C5462k.facebook_error_unknown;
                    objArr = new Object[]{facebookRequestError.mo6559f()};
                    break;
            }
            str = f.getString(i, objArr);
        } else {
            cVar.mo20567a(100);
            str = facebookException.getLocalizedMessage();
        }
        cVar.mo20568a(str);
        return cVar;
    }

    /* renamed from: a */
    public static void m31838a(Activity activity, Bundle bundle) {
        new ShareDialog(activity).mo8349a(((C2361a) new C2361a().mo8192a(Uri.parse(bundle.getString("slink")))).mo8218a(), Mode.AUTOMATIC);
    }

    /* renamed from: a */
    private void m31839a(C6583b bVar) {
        this.f23268c = C2178a.m10067a();
        this.f23267b = bVar;
        if (App.f18515q) {
            C2306d.m10693a().mo8081a(this.f23268c, this.f23269d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C6584c m31841b(FacebookException facebookException) {
        return m31835a((FacebookRequestError) null, facebookException);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m31842b(C2311e eVar) {
        mo20549a(eVar.mo8087a());
    }

    /* renamed from: c */
    public static void m31843c() {
        if (App.f18515q) {
            C2306d.m10693a().mo8084b();
        }
    }

    /* renamed from: a */
    public void mo7742a() {
        Log.d(f23265e, "User canceled login");
    }

    /* renamed from: a */
    public void mo20549a(final AccessToken accessToken) {
        GraphRequest a = GraphRequest.m8024a(accessToken, (C1610c) new C1610c() {
            /* renamed from: a */
            public void mo6602a(JSONObject jSONObject, C2199i iVar) {
                if (iVar.mo7795a() != null) {
                    C6578ag.this.f23267b.mo17563a(C6578ag.this.m31834a(iVar.mo7795a()));
                    return;
                }
                Log.i("LoginActivity", iVar.toString());
                C6582a a = C6578ag.this.m31833a(jSONObject);
                a.f23276b = accessToken.mo6518b();
                C6578ag.this.f23267b.mo17562a(a);
            }
        });
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id, first_name, last_name, email, gender, birthday, location");
        a.mo6571a(bundle);
        a.mo6585j();
    }

    /* renamed from: a */
    public void mo7743a(FacebookException facebookException) {
        Log.d(f23265e, "Login failed", facebookException);
    }

    /* renamed from: a */
    public void mo7744a(C2311e eVar) {
        Log.w(f23265e, "LoginManager FacebookCallback onSuccess");
        String str = f23265e;
        StringBuilder sb = new StringBuilder();
        sb.append("Access Token:: ");
        sb.append(eVar.mo8087a());
        Log.w(str, sb.toString());
        mo20555d();
        eVar.mo8087a();
    }

    /* renamed from: a */
    public void mo20551a(C6555r rVar) {
        if (mo20554b(rVar)) {
            C2306d.m10693a().mo8080a((Fragment) rVar, (Collection<String>) Arrays.asList(new String[]{"public_profile"}));
        }
    }

    /* renamed from: a */
    public boolean mo20552a(int i, int i2, Intent intent) {
        return this.f23268c.mo7741a(i, i2, intent);
    }

    /* renamed from: b */
    public Profile mo20553b() {
        return Profile.m8106a();
    }

    /* renamed from: b */
    public boolean mo20554b(C6555r rVar) {
        if (App.f18515q) {
            return true;
        }
        if (rVar != null) {
            C6620n.m32028a((Context) rVar.mo1318s(), C5462k.warning, C5462k.facebook_error_no_app_id_provided);
        }
        return false;
    }

    /* renamed from: d */
    public void mo20555d() {
        Log.w(f23265e, "update status ");
        boolean z = AccessToken.m7985a() != null;
        Profile a = Profile.m8106a();
        if (!z || a == null) {
            this.f23270g = false;
        } else {
            this.f23270g = true;
        }
    }

    /* renamed from: e */
    public boolean mo20556e() {
        mo20555d();
        return this.f23270g;
    }
}
