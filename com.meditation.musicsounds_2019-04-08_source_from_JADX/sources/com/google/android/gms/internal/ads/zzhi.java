package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
public final class zzhi extends AbstractSafeParcelable {
    public static final Creator<zzhi> CREATOR = new akn();
    @GuardedBy("this")

    /* renamed from: a */
    private ParcelFileDescriptor f15448a;

    public zzhi() {
        this(null);
    }

    public zzhi(ParcelFileDescriptor parcelFileDescriptor) {
        this.f15448a = parcelFileDescriptor;
    }

    /* renamed from: c */
    private final synchronized ParcelFileDescriptor m20750c() {
        return this.f15448a;
    }

    /* renamed from: a */
    public final synchronized boolean mo13974a() {
        return this.f15448a != null;
    }

    /* renamed from: b */
    public final synchronized InputStream mo13975b() {
        if (this.f15448a == null) {
            return null;
        }
        AutoCloseInputStream autoCloseInputStream = new AutoCloseInputStream(this.f15448a);
        this.f15448a = null;
        return autoCloseInputStream;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14964a(parcel, 2, (Parcelable) m20750c(), i, false);
        C3267a.m14956a(parcel, a);
    }
}
