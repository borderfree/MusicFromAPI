package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.C2225j;
import com.facebook.internal.C2230m;
import com.facebook.internal.C2232n;
import com.facebook.internal.C2258x;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Creator<FacebookRequestError> CREATOR = new Creator<FacebookRequestError>() {
        /* renamed from: a */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel);
        }

        /* renamed from: a */
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    };

    /* renamed from: a */
    static final C1602a f5199a = new C1602a(200, 299);

    /* renamed from: b */
    private final Category f5200b;

    /* renamed from: c */
    private final int f5201c;

    /* renamed from: d */
    private final int f5202d;

    /* renamed from: e */
    private final int f5203e;

    /* renamed from: f */
    private final String f5204f;

    /* renamed from: g */
    private final String f5205g;

    /* renamed from: h */
    private final String f5206h;

    /* renamed from: i */
    private final String f5207i;

    /* renamed from: j */
    private final String f5208j;

    /* renamed from: k */
    private final JSONObject f5209k;

    /* renamed from: l */
    private final JSONObject f5210l;

    /* renamed from: m */
    private final Object f5211m;

    /* renamed from: n */
    private final HttpURLConnection f5212n;

    /* renamed from: o */
    private final FacebookException f5213o;

    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$a */
    private static class C1602a {

        /* renamed from: a */
        private final int f5215a;

        /* renamed from: b */
        private final int f5216b;

        private C1602a(int i, int i2) {
            this.f5215a = i;
            this.f5216b = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo6568a(int i) {
            return this.f5215a <= i && i <= this.f5216b;
        }
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        boolean z2;
        this.f5201c = i;
        this.f5202d = i2;
        this.f5203e = i3;
        this.f5204f = str;
        this.f5205g = str2;
        this.f5210l = jSONObject;
        this.f5209k = jSONObject2;
        this.f5211m = obj;
        this.f5212n = httpURLConnection;
        this.f5206h = str3;
        this.f5207i = str4;
        if (facebookException != null) {
            this.f5213o = facebookException;
            z2 = true;
        } else {
            this.f5213o = new FacebookServiceException(this, str2);
            z2 = false;
        }
        C2225j i4 = m8012i();
        this.f5200b = z2 ? Category.OTHER : i4.mo7842a(i2, i3, z);
        this.f5208j = i4.mo7843a(this.f5200b);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }

    FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        Exception exc2 = exc;
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, exc2 instanceof FacebookException ? (FacebookException) exc2 : new FacebookException((Throwable) exc2));
    }

    /* renamed from: a */
    static FacebookRequestError m8011a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        int i;
        JSONObject jSONObject2 = jSONObject;
        try {
            if (jSONObject2.has("code")) {
                int i2 = jSONObject2.getInt("code");
                Object a = C2258x.m10361a(jSONObject2, "body", "FACEBOOK_NON_JSON_RESULT");
                if (a != null && (a instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) a;
                    boolean z2 = true;
                    int i3 = -1;
                    if (jSONObject3.has("error")) {
                        JSONObject jSONObject4 = (JSONObject) C2258x.m10361a(jSONObject3, "error", (String) null);
                        str4 = jSONObject4.optString("type", null);
                        str3 = jSONObject4.optString("message", null);
                        int optInt = jSONObject4.optInt("code", -1);
                        int optInt2 = jSONObject4.optInt("error_subcode", -1);
                        String optString = jSONObject4.optString("error_user_msg", null);
                        str = jSONObject4.optString("error_user_title", null);
                        i = optInt2;
                        i3 = optInt;
                        str2 = optString;
                        z = jSONObject4.optBoolean("is_transient", false);
                    } else {
                        if (!jSONObject3.has("error_code") && !jSONObject3.has("error_msg")) {
                            if (!jSONObject3.has("error_reason")) {
                                str4 = null;
                                str3 = null;
                                str2 = null;
                                str = null;
                                z2 = false;
                                i = -1;
                                z = false;
                            }
                        }
                        String optString2 = jSONObject3.optString("error_reason", null);
                        String optString3 = jSONObject3.optString("error_msg", null);
                        int optInt3 = jSONObject3.optInt("error_code", -1);
                        i = jSONObject3.optInt("error_subcode", -1);
                        i3 = optInt3;
                        str2 = null;
                        str = null;
                        z = false;
                        str3 = optString3;
                        str4 = optString2;
                    }
                    if (z2) {
                        FacebookRequestError facebookRequestError = new FacebookRequestError(i2, i3, i, str4, str3, str, str2, z, jSONObject3, jSONObject, obj, httpURLConnection, null);
                        return facebookRequestError;
                    }
                }
                if (!f5199a.mo6568a(i2)) {
                    FacebookRequestError facebookRequestError2 = new FacebookRequestError(i2, -1, -1, null, null, null, null, false, jSONObject2.has("body") ? (JSONObject) C2258x.m10361a(jSONObject2, "body", "FACEBOOK_NON_JSON_RESULT") : null, jSONObject, obj, httpURLConnection, null);
                    return facebookRequestError2;
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* renamed from: i */
    static synchronized C2225j m8012i() {
        synchronized (FacebookRequestError.class) {
            C2230m a = C2232n.m10235a(C2189f.m10096j());
            if (a == null) {
                C2225j a2 = C2225j.m10209a();
                return a2;
            }
            C2225j g = a.mo7853g();
            return g;
        }
    }

    /* renamed from: a */
    public Category mo6553a() {
        return this.f5200b;
    }

    /* renamed from: b */
    public int mo6554b() {
        return this.f5201c;
    }

    /* renamed from: c */
    public int mo6555c() {
        return this.f5202d;
    }

    /* renamed from: d */
    public int mo6556d() {
        return this.f5203e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo6558e() {
        return this.f5204f;
    }

    /* renamed from: f */
    public String mo6559f() {
        return this.f5205g != null ? this.f5205g : this.f5213o.getLocalizedMessage();
    }

    /* renamed from: g */
    public String mo6560g() {
        return this.f5206h;
    }

    /* renamed from: h */
    public FacebookException mo6561h() {
        return this.f5213o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{HttpStatus: ");
        sb.append(this.f5201c);
        sb.append(", errorCode: ");
        sb.append(this.f5202d);
        sb.append(", errorType: ");
        sb.append(this.f5204f);
        sb.append(", errorMessage: ");
        sb.append(mo6559f());
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5201c);
        parcel.writeInt(this.f5202d);
        parcel.writeInt(this.f5203e);
        parcel.writeString(this.f5204f);
        parcel.writeString(this.f5205g);
        parcel.writeString(this.f5206h);
        parcel.writeString(this.f5207i);
    }
}
