package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.Iterator;

public final class zzad extends AbstractSafeParcelable implements Iterable<String> {
    public static final Creator<zzad> CREATOR = new C4752f();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Bundle f17251a;

    zzad(Bundle bundle) {
        this.f17251a = bundle;
    }

    /* renamed from: a */
    public final int mo15866a() {
        return this.f17251a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo15867a(String str) {
        return this.f17251a.get(str);
    }

    /* renamed from: b */
    public final Bundle mo15868b() {
        return new Bundle(this.f17251a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Long mo15869b(String str) {
        return Long.valueOf(this.f17251a.getLong(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Double mo15870c(String str) {
        return Double.valueOf(this.f17251a.getDouble(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo15871d(String str) {
        return this.f17251a.getString(str);
    }

    public final Iterator<String> iterator() {
        return new C4724e(this);
    }

    public final String toString() {
        return this.f17251a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14962a(parcel, 2, mo15868b(), false);
        C3267a.m14956a(parcel, a);
    }
}
