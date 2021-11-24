package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.common.C2179a.C2183d;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class LoginClient implements Parcelable {
    public static final Creator<LoginClient> CREATOR = new Creator() {
        /* renamed from: a */
        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        /* renamed from: a */
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    };

    /* renamed from: a */
    LoginMethodHandler[] f7357a;

    /* renamed from: b */
    int f7358b = -1;

    /* renamed from: c */
    Fragment f7359c;

    /* renamed from: d */
    C2297b f7360d;

    /* renamed from: e */
    C2296a f7361e;

    /* renamed from: f */
    boolean f7362f;

    /* renamed from: g */
    Request f7363g;

    /* renamed from: h */
    Map<String, String> f7364h;

    /* renamed from: i */
    private C2305c f7365i;

    public static class Request implements Parcelable {
        public static final Creator<Request> CREATOR = new Creator() {
            /* renamed from: a */
            public Request createFromParcel(Parcel parcel) {
                return new Request(parcel);
            }

            /* renamed from: a */
            public Request[] newArray(int i) {
                return new Request[i];
            }
        };

        /* renamed from: a */
        private final LoginBehavior f7366a;

        /* renamed from: b */
        private Set<String> f7367b;

        /* renamed from: c */
        private final DefaultAudience f7368c;

        /* renamed from: d */
        private final String f7369d;

        /* renamed from: e */
        private final String f7370e;

        /* renamed from: f */
        private boolean f7371f;

        /* renamed from: g */
        private String f7372g;

        private Request(Parcel parcel) {
            boolean z = false;
            this.f7371f = false;
            String readString = parcel.readString();
            DefaultAudience defaultAudience = null;
            this.f7366a = readString != null ? LoginBehavior.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f7367b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                defaultAudience = DefaultAudience.valueOf(readString2);
            }
            this.f7368c = defaultAudience;
            this.f7369d = parcel.readString();
            this.f7370e = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            }
            this.f7371f = z;
            this.f7372g = parcel.readString();
        }

        Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2) {
            this.f7371f = false;
            this.f7366a = loginBehavior;
            if (set == null) {
                set = new HashSet<>();
            }
            this.f7367b = set;
            this.f7368c = defaultAudience;
            this.f7369d = str;
            this.f7370e = str2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Set<String> mo8027a() {
            return this.f7367b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8028a(Set<String> set) {
            C2264y.m10422a((Object) set, "permissions");
            this.f7367b = set;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8029a(boolean z) {
            this.f7371f = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public LoginBehavior mo8030b() {
            return this.f7366a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public DefaultAudience mo8031c() {
            return this.f7368c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public String mo8032d() {
            return this.f7369d;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public String mo8034e() {
            return this.f7370e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo8035f() {
            return this.f7371f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public String mo8036g() {
            return this.f7372g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public boolean mo8037h() {
            for (String a : this.f7367b) {
                if (C2306d.m10702a(a)) {
                    return true;
                }
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str = null;
            parcel.writeString(this.f7366a != null ? this.f7366a.name() : null);
            parcel.writeStringList(new ArrayList(this.f7367b));
            if (this.f7368c != null) {
                str = this.f7368c.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.f7369d);
            parcel.writeString(this.f7370e);
            parcel.writeByte(this.f7371f ? (byte) 1 : 0);
            parcel.writeString(this.f7372g);
        }
    }

    public static class Result implements Parcelable {
        public static final Creator<Result> CREATOR = new Creator() {
            /* renamed from: a */
            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel);
            }

            /* renamed from: a */
            public Result[] newArray(int i) {
                return new Result[i];
            }
        };

        /* renamed from: a */
        final Code f7373a;

        /* renamed from: b */
        final AccessToken f7374b;

        /* renamed from: c */
        final String f7375c;

        /* renamed from: d */
        final String f7376d;

        /* renamed from: e */
        final Request f7377e;

        /* renamed from: f */
        public Map<String, String> f7378f;

        enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            private final String loggingValue;

            private Code(String str) {
                this.loggingValue = str;
            }

            /* access modifiers changed from: 0000 */
            public String getLoggingValue() {
                return this.loggingValue;
            }
        }

        private Result(Parcel parcel) {
            this.f7373a = Code.valueOf(parcel.readString());
            this.f7374b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f7375c = parcel.readString();
            this.f7376d = parcel.readString();
            this.f7377e = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f7378f = C2258x.m10375a(parcel);
        }

        Result(Request request, Code code, AccessToken accessToken, String str, String str2) {
            C2264y.m10422a((Object) code, "code");
            this.f7377e = request;
            this.f7374b = accessToken;
            this.f7375c = str;
            this.f7373a = code;
            this.f7376d = str2;
        }

        /* renamed from: a */
        static Result m10619a(Request request, AccessToken accessToken) {
            Result result = new Result(request, Code.SUCCESS, accessToken, null, null);
            return result;
        }

        /* renamed from: a */
        static Result m10620a(Request request, String str) {
            Result result = new Result(request, Code.CANCEL, null, str, null);
            return result;
        }

        /* renamed from: a */
        static Result m10621a(Request request, String str, String str2) {
            return m10622a(request, str, str2, null);
        }

        /* renamed from: a */
        static Result m10622a(Request request, String str, String str2, String str3) {
            Request request2 = request;
            Result result = new Result(request2, Code.ERROR, null, TextUtils.join(": ", C2258x.m10395b((T[]) new String[]{str, str2})), str3);
            return result;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f7373a.name());
            parcel.writeParcelable(this.f7374b, i);
            parcel.writeString(this.f7375c);
            parcel.writeString(this.f7376d);
            parcel.writeParcelable(this.f7377e, i);
            C2258x.m10379a(parcel, this.f7378f);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    interface C2296a {
        /* renamed from: a */
        void mo8050a();

        /* renamed from: b */
        void mo8051b();
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    public interface C2297b {
        /* renamed from: a */
        void mo8052a(Result result);
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f7357a = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            this.f7357a[i] = (LoginMethodHandler) readParcelableArray[i];
            this.f7357a[i].mo8054a(this);
        }
        this.f7358b = parcel.readInt();
        this.f7363g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f7364h = C2258x.m10375a(parcel);
    }

    public LoginClient(Fragment fragment) {
        this.f7359c = fragment;
    }

    /* renamed from: a */
    private void m10575a(String str, Result result, Map<String, String> map) {
        m10576a(str, result.f7373a.getLoggingValue(), result.f7375c, result.f7376d, map);
    }

    /* renamed from: a */
    private void m10576a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f7363g == null) {
            m10582o().mo8073a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m10582o().mo8074a(this.f7363g.mo8034e(), str, str2, str3, str4, map);
        }
    }

    /* renamed from: a */
    private void m10577a(String str, String str2, boolean z) {
        if (this.f7364h == null) {
            this.f7364h = new HashMap();
        }
        if (this.f7364h.containsKey(str) && z) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f7364h.get(str));
            sb.append(",");
            sb.append(str2);
            str2 = sb.toString();
        }
        this.f7364h.put(str, str2);
    }

    /* renamed from: d */
    public static int m10578d() {
        return RequestCodeOffset.Login.toRequestCode();
    }

    /* renamed from: d */
    private void m10579d(Result result) {
        if (this.f7360d != null) {
            this.f7360d.mo8052a(result);
        }
    }

    /* renamed from: m */
    static String m10580m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: n */
    private void m10581n() {
        mo8009b(Result.m10621a(this.f7363g, "Login attempt failed.", null));
    }

    /* renamed from: o */
    private C2305c m10582o() {
        if (this.f7365i == null || !this.f7365i.mo8070a().equals(this.f7363g.mo8032d())) {
            this.f7365i = new C2305c(mo8007b(), this.f7363g.mo8032d());
        }
        return this.f7365i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo7999a(String str) {
        return mo8007b().checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public Fragment mo8000a() {
        return this.f7359c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8001a(Fragment fragment) {
        if (this.f7359c == null) {
            this.f7359c = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8002a(Request request) {
        if (!mo8014e()) {
            mo8008b(request);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8003a(Result result) {
        if (result.f7374b == null || AccessToken.m7985a() == null) {
            mo8009b(result);
        } else {
            mo8011c(result);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8004a(C2296a aVar) {
        this.f7361e = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8005a(C2297b bVar) {
        this.f7360d = bVar;
    }

    /* renamed from: a */
    public boolean mo8006a(int i, int i2, Intent intent) {
        if (this.f7363g != null) {
            return mo8016g().mo7935a(i, i2, intent);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0367h mo8007b() {
        return this.f7359c.mo1318s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8008b(Request request) {
        if (request != null) {
            if (this.f7363g != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (AccessToken.m7985a() == null || mo8017h()) {
                this.f7363g = request;
                this.f7357a = mo8012c(request);
                mo8018i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8009b(Result result) {
        LoginMethodHandler g = mo8016g();
        if (g != null) {
            m10575a(g.mo7933a(), result, g.f7380a);
        }
        if (this.f7364h != null) {
            result.f7378f = this.f7364h;
        }
        this.f7357a = null;
        this.f7358b = -1;
        this.f7363g = null;
        this.f7364h = null;
        m10579d(result);
    }

    /* renamed from: c */
    public Request mo8010c() {
        return this.f7363g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8011c(Result result) {
        Result result2;
        if (result.f7374b != null) {
            AccessToken a = AccessToken.m7985a();
            AccessToken accessToken = result.f7374b;
            if (!(a == null || accessToken == null)) {
                try {
                    if (a.mo6528i().equals(accessToken.mo6528i())) {
                        result2 = Result.m10619a(this.f7363g, result.f7374b);
                        mo8009b(result2);
                        return;
                    }
                } catch (Exception e) {
                    mo8009b(Result.m10621a(this.f7363g, "Caught exception", e.getMessage()));
                    return;
                }
            }
            result2 = Result.m10621a(this.f7363g, "User logged in as different Facebook user.", null);
            mo8009b(result2);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public LoginMethodHandler[] mo8012c(Request request) {
        ArrayList arrayList = new ArrayList();
        LoginBehavior b = request.mo8030b();
        if (b.allowsGetTokenAuth()) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (b.allowsKatanaAuth()) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (b.allowsFacebookLiteAuth()) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (b.allowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (b.allowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (b.allowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo8014e() {
        return this.f7363g != null && this.f7358b >= 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8015f() {
        if (this.f7358b >= 0) {
            mo8016g().mo7980b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public LoginMethodHandler mo8016g() {
        if (this.f7358b >= 0) {
            return this.f7357a[this.f7358b];
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo8017h() {
        if (this.f7362f) {
            return true;
        }
        if (mo7999a("android.permission.INTERNET") != 0) {
            C0367h b = mo8007b();
            mo8009b(Result.m10621a(this.f7363g, b.getString(C2183d.com_facebook_internet_permission_error_title), b.getString(C2183d.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.f7362f = true;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo8018i() {
        if (this.f7358b >= 0) {
            m10576a(mo8016g().mo7933a(), "skipped", null, null, mo8016g().f7380a);
        }
        while (this.f7357a != null && this.f7358b < this.f7357a.length - 1) {
            this.f7358b++;
            if (mo8019j()) {
                return;
            }
        }
        if (this.f7363g != null) {
            m10581n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo8019j() {
        LoginMethodHandler g = mo8016g();
        if (!g.mo8057d() || mo8017h()) {
            boolean a = g.mo7936a(this.f7363g);
            if (a) {
                m10582o().mo8072a(this.f7363g.mo8034e(), g.mo7933a());
            } else {
                m10582o().mo8076b(this.f7363g.mo8034e(), g.mo7933a());
                m10577a("not_tried", g.mo7933a(), true);
            }
            return a;
        }
        m10577a("no_internet_permission", "1", false);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo8020k() {
        if (this.f7361e != null) {
            this.f7361e.mo8050a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo8021l() {
        if (this.f7361e != null) {
            this.f7361e.mo8051b();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f7357a, i);
        parcel.writeInt(this.f7358b);
        parcel.writeParcelable(this.f7363g, i);
        C2258x.m10379a(parcel, this.f7364h);
    }
}
