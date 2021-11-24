package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Creator<ClientIdentity> CREATOR = new C3270v();

    /* renamed from: a */
    private final int f10971a;

    /* renamed from: b */
    private final String f10972b;

    public ClientIdentity(int i, String str) {
        this.f10971a = i;
        this.f10972b = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            return clientIdentity.f10971a == this.f10971a && C3261q.m14906a(clientIdentity.f10972b, this.f10972b);
        }
    }

    public int hashCode() {
        return this.f10971a;
    }

    public String toString() {
        int i = this.f10971a;
        String str = this.f10972b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f10971a);
        C3267a.m14968a(parcel, 2, this.f10972b, false);
        C3267a.m14956a(parcel, a);
    }
}
