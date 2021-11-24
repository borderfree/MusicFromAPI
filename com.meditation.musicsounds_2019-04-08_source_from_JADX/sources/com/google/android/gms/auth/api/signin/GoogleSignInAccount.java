package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.common.util.C3303h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C2975c();

    /* renamed from: a */
    private static C3300e f10451a = C3303h.m15052d();

    /* renamed from: b */
    private final int f10452b;

    /* renamed from: c */
    private String f10453c;

    /* renamed from: d */
    private String f10454d;

    /* renamed from: e */
    private String f10455e;

    /* renamed from: f */
    private String f10456f;

    /* renamed from: g */
    private Uri f10457g;

    /* renamed from: h */
    private String f10458h;

    /* renamed from: i */
    private long f10459i;

    /* renamed from: j */
    private String f10460j;

    /* renamed from: k */
    private List<Scope> f10461k;

    /* renamed from: l */
    private String f10462l;

    /* renamed from: m */
    private String f10463m;

    /* renamed from: n */
    private Set<Scope> f10464n = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f10452b = i;
        this.f10453c = str;
        this.f10454d = str2;
        this.f10455e = str3;
        this.f10456f = str4;
        this.f10457g = uri;
        this.f10458h = str5;
        this.f10459i = j;
        this.f10460j = str6;
        this.f10461k = list;
        this.f10462l = str7;
        this.f10463m = str8;
    }

    /* renamed from: a */
    public static GoogleSignInAccount m13849a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m13850a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.f10458h = jSONObject.optString("serverAuthCode", null);
        return a;
    }

    /* renamed from: a */
    private static GoogleSignInAccount m13850a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? Long.valueOf(f10451a.mo11326a() / 1000) : l).longValue(), C3266s.m14915a(str7), new ArrayList((Collection) C3266s.m14913a(set)), str5, str6);
        return googleSignInAccount;
    }

    /* renamed from: m */
    private final JSONObject m13851m() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo10668a() != null) {
                jSONObject.put("id", mo10668a());
            }
            if (mo10669b() != null) {
                jSONObject.put("tokenId", mo10669b());
            }
            if (mo10670c() != null) {
                jSONObject.put("email", mo10670c());
            }
            if (mo10672e() != null) {
                jSONObject.put("displayName", mo10672e());
            }
            if (mo10674f() != null) {
                jSONObject.put("givenName", mo10674f());
            }
            if (mo10675g() != null) {
                jSONObject.put("familyName", mo10675g());
            }
            if (mo10676h() != null) {
                jSONObject.put("photoUrl", mo10676h().toString());
            }
            if (mo10678i() != null) {
                jSONObject.put("serverAuthCode", mo10678i());
            }
            jSONObject.put("expirationTime", this.f10459i);
            jSONObject.put("obfuscatedIdentifier", this.f10460j);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.f10461k.toArray(new Scope[this.f10461k.size()]);
            Arrays.sort(scopeArr, C2974b.f10494a);
            for (Scope a : scopeArr) {
                jSONArray.put(a.mo10786a());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public String mo10668a() {
        return this.f10453c;
    }

    /* renamed from: b */
    public String mo10669b() {
        return this.f10454d;
    }

    /* renamed from: c */
    public String mo10670c() {
        return this.f10455e;
    }

    /* renamed from: d */
    public Account mo10671d() {
        if (this.f10455e == null) {
            return null;
        }
        return new Account(this.f10455e, "com.google");
    }

    /* renamed from: e */
    public String mo10672e() {
        return this.f10456f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f10460j.equals(this.f10460j) && googleSignInAccount.mo10680k().equals(mo10680k());
    }

    /* renamed from: f */
    public String mo10674f() {
        return this.f10462l;
    }

    /* renamed from: g */
    public String mo10675g() {
        return this.f10463m;
    }

    /* renamed from: h */
    public Uri mo10676h() {
        return this.f10457g;
    }

    public int hashCode() {
        return ((this.f10460j.hashCode() + 527) * 31) + mo10680k().hashCode();
    }

    /* renamed from: i */
    public String mo10678i() {
        return this.f10458h;
    }

    /* renamed from: j */
    public final String mo10679j() {
        return this.f10460j;
    }

    /* renamed from: k */
    public Set<Scope> mo10680k() {
        HashSet hashSet = new HashSet(this.f10461k);
        hashSet.addAll(this.f10464n);
        return hashSet;
    }

    /* renamed from: l */
    public final String mo10681l() {
        JSONObject m = m13851m();
        m.remove("serverAuthCode");
        return m.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f10452b);
        C3267a.m14968a(parcel, 2, mo10668a(), false);
        C3267a.m14968a(parcel, 3, mo10669b(), false);
        C3267a.m14968a(parcel, 4, mo10670c(), false);
        C3267a.m14968a(parcel, 5, mo10672e(), false);
        C3267a.m14964a(parcel, 6, (Parcelable) mo10676h(), i, false);
        C3267a.m14968a(parcel, 7, mo10678i(), false);
        C3267a.m14961a(parcel, 8, this.f10459i);
        C3267a.m14968a(parcel, 9, this.f10460j, false);
        C3267a.m14980c(parcel, 10, this.f10461k, false);
        C3267a.m14968a(parcel, 11, mo10674f(), false);
        C3267a.m14968a(parcel, 12, mo10675g(), false);
        C3267a.m14956a(parcel, a);
    }
}
