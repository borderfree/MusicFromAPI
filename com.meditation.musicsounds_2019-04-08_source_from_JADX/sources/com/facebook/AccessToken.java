package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final Creator<AccessToken> CREATOR = new Creator() {
        /* renamed from: a */
        public AccessToken createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }

        /* renamed from: a */
        public AccessToken[] newArray(int i) {
            return new AccessToken[i];
        }
    };

    /* renamed from: a */
    private static final Date f5171a = new Date(Long.MAX_VALUE);

    /* renamed from: b */
    private static final Date f5172b = f5171a;

    /* renamed from: c */
    private static final Date f5173c = new Date();

    /* renamed from: d */
    private static final AccessTokenSource f5174d = AccessTokenSource.FACEBOOK_APPLICATION_WEB;

    /* renamed from: e */
    private final Date f5175e;

    /* renamed from: f */
    private final Set<String> f5176f;

    /* renamed from: g */
    private final Set<String> f5177g;

    /* renamed from: h */
    private final String f5178h;

    /* renamed from: i */
    private final AccessTokenSource f5179i;

    /* renamed from: j */
    private final Date f5180j;

    /* renamed from: k */
    private final String f5181k;

    /* renamed from: l */
    private final String f5182l;

    /* renamed from: com.facebook.AccessToken$a */
    public interface C1598a {
        /* renamed from: a */
        void mo6537a(AccessToken accessToken);

        /* renamed from: a */
        void mo6538a(FacebookException facebookException);
    }

    AccessToken(Parcel parcel) {
        this.f5175e = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f5176f = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f5177g = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f5178h = parcel.readString();
        this.f5179i = AccessTokenSource.valueOf(parcel.readString());
        this.f5180j = new Date(parcel.readLong());
        this.f5181k = parcel.readString();
        this.f5182l = parcel.readString();
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, AccessTokenSource accessTokenSource, Date date, Date date2) {
        C2264y.m10423a(str, "accessToken");
        C2264y.m10423a(str2, "applicationId");
        C2264y.m10423a(str3, "userId");
        if (date == null) {
            date = f5172b;
        }
        this.f5175e = date;
        this.f5176f = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.f5177g = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.f5178h = str;
        if (accessTokenSource == null) {
            accessTokenSource = f5174d;
        }
        this.f5179i = accessTokenSource;
        if (date2 == null) {
            date2 = f5173c;
        }
        this.f5180j = date2;
        this.f5181k = str2;
        this.f5182l = str3;
    }

    /* renamed from: a */
    public static AccessToken m7985a() {
        return C2171b.m10050a().mo7736b();
    }

    /* renamed from: a */
    static AccessToken m7986a(Bundle bundle) {
        List a = m7988a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List a2 = m7988a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        String d = C2275j.m10476d(bundle);
        if (C2258x.m10392a(d)) {
            d = C2189f.m10096j();
        }
        String str = d;
        String b = C2275j.m10474b(bundle);
        try {
            AccessToken accessToken = new AccessToken(b, str, C2258x.m10401c(b).getString("id"), a, a2, C2275j.m10475c(bundle), C2275j.m10471a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), C2275j.m10471a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
            return accessToken;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static AccessToken m7987a(JSONObject jSONObject) {
        if (jSONObject.getInt("version") <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            AccessToken accessToken = new AccessToken(string, jSONObject.getString("application_id"), jSONObject.getString("user_id"), C2258x.m10374a(jSONArray), C2258x.m10374a(jSONArray2), AccessTokenSource.valueOf(jSONObject.getString("source")), date, date2);
            return accessToken;
        }
        throw new FacebookException("Unknown AccessToken serialization format.");
    }

    /* renamed from: a */
    static List<String> m7988a(Bundle bundle, String str) {
        ArrayList stringArrayList = bundle.getStringArrayList(str);
        return stringArrayList == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    /* renamed from: a */
    public static void m7989a(AccessToken accessToken) {
        C2171b.m10050a().mo7735a(accessToken);
    }

    /* renamed from: a */
    private void m7990a(StringBuilder sb) {
        String str;
        sb.append(" permissions:");
        if (this.f5176f == null) {
            str = "null";
        } else {
            sb.append("[");
            sb.append(TextUtils.join(", ", this.f5176f));
            str = "]";
        }
        sb.append(str);
    }

    /* renamed from: l */
    private String m7991l() {
        return this.f5178h == null ? "null" : C2189f.m10084a(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.f5178h : "ACCESS_TOKEN_REMOVED";
    }

    /* renamed from: b */
    public String mo6518b() {
        return this.f5178h;
    }

    /* renamed from: c */
    public Date mo6519c() {
        return this.f5175e;
    }

    /* renamed from: d */
    public Set<String> mo6520d() {
        return this.f5176f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Set<String> mo6522e() {
        return this.f5177g;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (!this.f5175e.equals(accessToken.f5175e) || !this.f5176f.equals(accessToken.f5176f) || !this.f5177g.equals(accessToken.f5177g) || !this.f5178h.equals(accessToken.f5178h) || this.f5179i != accessToken.f5179i || !this.f5180j.equals(accessToken.f5180j) || (this.f5181k != null ? !this.f5181k.equals(accessToken.f5181k) : accessToken.f5181k != null) || !this.f5182l.equals(accessToken.f5182l)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public AccessTokenSource mo6524f() {
        return this.f5179i;
    }

    /* renamed from: g */
    public Date mo6525g() {
        return this.f5180j;
    }

    /* renamed from: h */
    public String mo6526h() {
        return this.f5181k;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f5175e.hashCode()) * 31) + this.f5176f.hashCode()) * 31) + this.f5177g.hashCode()) * 31) + this.f5178h.hashCode()) * 31) + this.f5179i.hashCode()) * 31) + this.f5180j.hashCode()) * 31) + (this.f5181k == null ? 0 : this.f5181k.hashCode())) * 31) + this.f5182l.hashCode();
    }

    /* renamed from: i */
    public String mo6528i() {
        return this.f5182l;
    }

    /* renamed from: j */
    public boolean mo6529j() {
        return new Date().after(this.f5175e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public JSONObject mo6530k() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f5178h);
        jSONObject.put("expires_at", this.f5175e.getTime());
        jSONObject.put("permissions", new JSONArray(this.f5176f));
        jSONObject.put("declined_permissions", new JSONArray(this.f5177g));
        jSONObject.put("last_refresh", this.f5180j.getTime());
        jSONObject.put("source", this.f5179i.name());
        jSONObject.put("application_id", this.f5181k);
        jSONObject.put("user_id", this.f5182l);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m7991l());
        m7990a(sb);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5175e.getTime());
        parcel.writeStringList(new ArrayList(this.f5176f));
        parcel.writeStringList(new ArrayList(this.f5177g));
        parcel.writeString(this.f5178h);
        parcel.writeString(this.f5179i.name());
        parcel.writeLong(this.f5180j.getTime());
        parcel.writeString(this.f5181k);
        parcel.writeString(this.f5182l);
    }
}
