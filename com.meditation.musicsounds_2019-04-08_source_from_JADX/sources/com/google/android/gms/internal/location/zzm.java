package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

public final class zzm extends AbstractSafeParcelable {
    public static final Creator<zzm> CREATOR = new C4206af();

    /* renamed from: a */
    static final List<ClientIdentity> f15682a = Collections.emptyList();

    /* renamed from: b */
    static final zzj f15683b = new zzj();

    /* renamed from: c */
    private zzj f15684c;

    /* renamed from: d */
    private List<ClientIdentity> f15685d;

    /* renamed from: e */
    private String f15686e;

    zzm(zzj zzj, List<ClientIdentity> list, String str) {
        this.f15684c = zzj;
        this.f15685d = list;
        this.f15686e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return C3261q.m14906a(this.f15684c, zzm.f15684c) && C3261q.m14906a(this.f15685d, zzm.f15685d) && C3261q.m14906a(this.f15686e, zzm.f15686e);
    }

    public final int hashCode() {
        return this.f15684c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14964a(parcel, 1, (Parcelable) this.f15684c, i, false);
        C3267a.m14980c(parcel, 2, this.f15685d, false);
        C3267a.m14968a(parcel, 3, this.f15686e, false);
        C3267a.m14956a(parcel, a);
    }
}
