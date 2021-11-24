package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Creator<GeofencingRequest> CREATOR = new C4533r();

    /* renamed from: a */
    private final List<zzbh> f16491a;

    /* renamed from: b */
    private final int f16492b;

    /* renamed from: c */
    private final String f16493c;

    /* renamed from: com.google.android.gms.location.GeofencingRequest$a */
    public static final class C4512a {

        /* renamed from: a */
        private final List<zzbh> f16494a = new ArrayList();

        /* renamed from: b */
        private int f16495b = 5;

        /* renamed from: c */
        private String f16496c = "";

        /* renamed from: a */
        public final C4512a mo14953a(int i) {
            this.f16495b = i & 7;
            return this;
        }

        /* renamed from: a */
        public final C4512a mo14954a(C4515b bVar) {
            C3266s.m14914a(bVar, (Object) "geofence can't be null.");
            C3266s.m14924b(bVar instanceof zzbh, "Geofence must be created using Geofence.Builder.");
            this.f16494a.add((zzbh) bVar);
            return this;
        }

        /* renamed from: a */
        public final C4512a mo14955a(List<C4515b> list) {
            if (list != null && !list.isEmpty()) {
                for (C4515b bVar : list) {
                    if (bVar != null) {
                        mo14954a(bVar);
                    }
                }
            }
            return this;
        }

        /* renamed from: a */
        public final GeofencingRequest mo14956a() {
            C3266s.m14924b(!this.f16494a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.f16494a, this.f16495b, this.f16496c);
        }
    }

    GeofencingRequest(List<zzbh> list, int i, String str) {
        this.f16491a = list;
        this.f16492b = i;
        this.f16493c = str;
    }

    /* renamed from: a */
    public int mo14950a() {
        return this.f16492b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f16491a);
        int i = this.f16492b;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String str = "tag=";
        String valueOf = String.valueOf(this.f16493c);
        sb.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14980c(parcel, 1, this.f16491a, false);
        C3267a.m14960a(parcel, 2, mo14950a());
        C3267a.m14968a(parcel, 3, this.f16493c, false);
        C3267a.m14956a(parcel, a);
    }
}
