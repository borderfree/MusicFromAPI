package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class Status extends AbstractSafeParcelable implements C3049h, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C3170p();

    /* renamed from: a */
    public static final Status f10570a = new Status(0);

    /* renamed from: b */
    public static final Status f10571b = new Status(14);

    /* renamed from: c */
    public static final Status f10572c = new Status(8);

    /* renamed from: d */
    public static final Status f10573d = new Status(15);

    /* renamed from: e */
    public static final Status f10574e = new Status(16);

    /* renamed from: f */
    public static final Status f10575f = new Status(18);

    /* renamed from: g */
    private static final Status f10576g = new Status(17);

    /* renamed from: h */
    private final int f10577h;

    /* renamed from: i */
    private final int f10578i;

    /* renamed from: j */
    private final String f10579j;

    /* renamed from: k */
    private final PendingIntent f10580k;

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f10577h = i;
        this.f10578i = i2;
        this.f10579j = str;
        this.f10580k = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: a */
    public final Status mo10791a() {
        return this;
    }

    /* renamed from: a */
    public final void mo10792a(Activity activity, int i) {
        if (mo10794c()) {
            activity.startIntentSenderForResult(this.f10580k.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    /* renamed from: b */
    public final String mo10793b() {
        return this.f10579j;
    }

    /* renamed from: c */
    public final boolean mo10794c() {
        return this.f10580k != null;
    }

    /* renamed from: d */
    public final boolean mo10795d() {
        return this.f10578i <= 0;
    }

    /* renamed from: e */
    public final int mo10796e() {
        return this.f10578i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f10577h == status.f10577h && this.f10578i == status.f10578i && C3261q.m14906a(this.f10579j, status.f10579j) && C3261q.m14906a(this.f10580k, status.f10580k);
    }

    /* renamed from: f */
    public final PendingIntent mo10798f() {
        return this.f10580k;
    }

    /* renamed from: g */
    public final String mo10799g() {
        return this.f10579j != null ? this.f10579j : C3036b.m14027a(this.f10578i);
    }

    public final int hashCode() {
        return C3261q.m14904a(Integer.valueOf(this.f10577h), Integer.valueOf(this.f10578i), this.f10579j, this.f10580k);
    }

    public final String toString() {
        return C3261q.m14905a((Object) this).mo11288a("statusCode", mo10799g()).mo11288a("resolution", this.f10580k).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, mo10796e());
        C3267a.m14968a(parcel, 2, mo10793b(), false);
        C3267a.m14964a(parcel, 3, (Parcelable) this.f10580k, i, false);
        C3267a.m14960a(parcel, 1000, this.f10577h);
        C3267a.m14956a(parcel, a);
    }
}
