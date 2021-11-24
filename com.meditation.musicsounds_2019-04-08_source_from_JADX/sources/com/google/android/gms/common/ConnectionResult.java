package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Creator<ConnectionResult> CREATOR = new C3275j();

    /* renamed from: a */
    public static final ConnectionResult f10553a = new ConnectionResult(0);

    /* renamed from: b */
    private final int f10554b;

    /* renamed from: c */
    private final int f10555c;

    /* renamed from: d */
    private final PendingIntent f10556d;

    /* renamed from: e */
    private final String f10557e;

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f10554b = i;
        this.f10555c = i2;
        this.f10556d = pendingIntent;
        this.f10557e = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: a */
    static String m13974a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: a */
    public final boolean mo10758a() {
        return (this.f10555c == 0 || this.f10556d == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo10759b() {
        return this.f10555c == 0;
    }

    /* renamed from: c */
    public final int mo10760c() {
        return this.f10555c;
    }

    /* renamed from: d */
    public final PendingIntent mo10761d() {
        return this.f10556d;
    }

    /* renamed from: e */
    public final String mo10762e() {
        return this.f10557e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f10555c == connectionResult.f10555c && C3261q.m14906a(this.f10556d, connectionResult.f10556d) && C3261q.m14906a(this.f10557e, connectionResult.f10557e);
    }

    public final int hashCode() {
        return C3261q.m14904a(Integer.valueOf(this.f10555c), this.f10556d, this.f10557e);
    }

    public final String toString() {
        return C3261q.m14905a((Object) this).mo11288a("statusCode", m13974a(this.f10555c)).mo11288a("resolution", this.f10556d).mo11288a("message", this.f10557e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f10554b);
        C3267a.m14960a(parcel, 2, mo10760c());
        C3267a.m14964a(parcel, 3, (Parcelable) mo10761d(), i, false);
        C3267a.m14968a(parcel, 4, mo10762e(), false);
        C3267a.m14956a(parcel, a);
    }
}
