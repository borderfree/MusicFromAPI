package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.location.C4515b;
import java.util.Locale;

public final class zzbh extends AbstractSafeParcelable implements C4515b {
    public static final Creator<zzbh> CREATOR = new C4232y();

    /* renamed from: a */
    private final String f15673a;

    /* renamed from: b */
    private final long f15674b;

    /* renamed from: c */
    private final short f15675c;

    /* renamed from: d */
    private final double f15676d;

    /* renamed from: e */
    private final double f15677e;

    /* renamed from: f */
    private final float f15678f;

    /* renamed from: g */
    private final int f15679g;

    /* renamed from: h */
    private final int f15680h;

    /* renamed from: i */
    private final int f15681i;

    public zzbh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            String str2 = "requestId is null or too long: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f15675c = s;
                this.f15673a = str;
                this.f15676d = d;
                this.f15677e = d2;
                this.f15678f = f;
                this.f15674b = j;
                this.f15679g = i4;
                this.f15680h = i2;
                this.f15681i = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: a */
    public static zzbh m20921a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        zzbh zzbh = (zzbh) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return zzbh;
    }

    /* renamed from: a */
    public final String mo14087a() {
        return this.f15673a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.f15678f == zzbh.f15678f && this.f15676d == zzbh.f15676d && this.f15677e == zzbh.f15677e && this.f15675c == zzbh.f15675c;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f15676d);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f15677e);
        return (((((((i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31) + Float.floatToIntBits(this.f15678f)) * 31) + this.f15675c) * 31) + this.f15679g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]";
        Object[] objArr = new Object[9];
        objArr[0] = this.f15675c != 1 ? null : "CIRCLE";
        objArr[1] = this.f15673a.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f15679g);
        objArr[3] = Double.valueOf(this.f15676d);
        objArr[4] = Double.valueOf(this.f15677e);
        objArr[5] = Float.valueOf(this.f15678f);
        objArr[6] = Integer.valueOf(this.f15680h / 1000);
        objArr[7] = Integer.valueOf(this.f15681i);
        objArr[8] = Long.valueOf(this.f15674b);
        return String.format(locale, str, objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 1, mo14087a(), false);
        C3267a.m14961a(parcel, 2, this.f15674b);
        C3267a.m14970a(parcel, 3, this.f15675c);
        C3267a.m14958a(parcel, 4, this.f15676d);
        C3267a.m14958a(parcel, 5, this.f15677e);
        C3267a.m14959a(parcel, 6, this.f15678f);
        C3267a.m14960a(parcel, 7, this.f15679g);
        C3267a.m14960a(parcel, 8, this.f15680h);
        C3267a.m14960a(parcel, 9, this.f15681i);
        C3267a.m14956a(parcel, a);
    }
}
