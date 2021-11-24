package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2258x.C2261a;
import com.facebook.internal.C2264y;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    public static final Creator<Profile> CREATOR = new Creator() {
        /* renamed from: a */
        public Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel);
        }

        /* renamed from: a */
        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    };

    /* renamed from: a */
    private final String f5251a;

    /* renamed from: b */
    private final String f5252b;

    /* renamed from: c */
    private final String f5253c;

    /* renamed from: d */
    private final String f5254d;

    /* renamed from: e */
    private final String f5255e;

    /* renamed from: f */
    private final Uri f5256f;

    private Profile(Parcel parcel) {
        this.f5251a = parcel.readString();
        this.f5252b = parcel.readString();
        this.f5253c = parcel.readString();
        this.f5254d = parcel.readString();
        this.f5255e = parcel.readString();
        String readString = parcel.readString();
        this.f5256f = readString == null ? null : Uri.parse(readString);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C2264y.m10423a(str, "id");
        this.f5251a = str;
        this.f5252b = str2;
        this.f5253c = str3;
        this.f5254d = str4;
        this.f5255e = str5;
        this.f5256f = uri;
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f5251a = jSONObject.optString("id", null);
        this.f5252b = jSONObject.optString("first_name", null);
        this.f5253c = jSONObject.optString("middle_name", null);
        this.f5254d = jSONObject.optString("last_name", null);
        this.f5255e = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        if (optString != null) {
            uri = Uri.parse(optString);
        }
        this.f5256f = uri;
    }

    /* renamed from: a */
    public static Profile m8106a() {
        return C2277l.m10482a().mo7931b();
    }

    /* renamed from: a */
    public static void m8107a(Profile profile) {
        C2277l.m10482a().mo7930a(profile);
    }

    /* renamed from: b */
    public static void m8108b() {
        AccessToken a = AccessToken.m7985a();
        if (a == null) {
            m8107a(null);
        } else {
            C2258x.m10382a(a.mo6518b(), (C2261a) new C2261a() {
                /* renamed from: a */
                public void mo6621a(FacebookException facebookException) {
                }

                /* renamed from: a */
                public void mo6622a(JSONObject jSONObject) {
                    String optString = jSONObject.optString("id");
                    if (optString != null) {
                        String optString2 = jSONObject.optString("link");
                        Profile profile = new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null);
                        Profile.m8107a(profile);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public String mo6614c() {
        return this.f5251a;
    }

    /* renamed from: d */
    public String mo6615d() {
        return this.f5255e;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public JSONObject mo6617e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f5251a);
            jSONObject.put("first_name", this.f5252b);
            jSONObject.put("middle_name", this.f5253c);
            jSONObject.put("last_name", this.f5254d);
            jSONObject.put("name", this.f5255e);
            if (this.f5256f == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.f5256f.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r5.f5252b == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r5.f5253c == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r5.f5254d == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r5.f5255e == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if (r5.f5256f == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.facebook.Profile
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.Profile r5 = (com.facebook.Profile) r5
            java.lang.String r1 = r4.f5251a
            java.lang.String r3 = r5.f5251a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = r4.f5252b
            if (r1 != 0) goto L_0x0021
            java.lang.String r5 = r5.f5252b
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x001f:
            r0 = 0
            goto L_0x0075
        L_0x0021:
            java.lang.String r1 = r4.f5252b
            java.lang.String r3 = r5.f5252b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = r4.f5253c
            if (r1 != 0) goto L_0x0034
            java.lang.String r5 = r5.f5253c
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x0034:
            java.lang.String r1 = r4.f5253c
            java.lang.String r3 = r5.f5253c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = r4.f5254d
            if (r1 != 0) goto L_0x0047
            java.lang.String r5 = r5.f5254d
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x0047:
            java.lang.String r1 = r4.f5254d
            java.lang.String r3 = r5.f5254d
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = r4.f5255e
            if (r1 != 0) goto L_0x005a
            java.lang.String r5 = r5.f5255e
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x005a:
            java.lang.String r1 = r4.f5255e
            java.lang.String r3 = r5.f5255e
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            android.net.Uri r1 = r4.f5256f
            if (r1 != 0) goto L_0x006d
            android.net.Uri r5 = r5.f5256f
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x006d:
            android.net.Uri r0 = r4.f5256f
            android.net.Uri r5 = r5.f5256f
            boolean r0 = r0.equals(r5)
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.Profile.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = 527 + this.f5251a.hashCode();
        if (this.f5252b != null) {
            hashCode = (hashCode * 31) + this.f5252b.hashCode();
        }
        if (this.f5253c != null) {
            hashCode = (hashCode * 31) + this.f5253c.hashCode();
        }
        if (this.f5254d != null) {
            hashCode = (hashCode * 31) + this.f5254d.hashCode();
        }
        if (this.f5255e != null) {
            hashCode = (hashCode * 31) + this.f5255e.hashCode();
        }
        return this.f5256f != null ? (hashCode * 31) + this.f5256f.hashCode() : hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5251a);
        parcel.writeString(this.f5252b);
        parcel.writeString(this.f5253c);
        parcel.writeString(this.f5254d);
        parcel.writeString(this.f5255e);
        parcel.writeString(this.f5256f == null ? null : this.f5256f.toString());
    }
}
