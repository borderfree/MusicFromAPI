package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class zzatv extends AbstractSafeParcelable {
    public static final Creator<zzatv> CREATOR = new C3911sw();

    /* renamed from: a */
    private final int f15368a;

    /* renamed from: b */
    private C4110yz f15369b = null;

    /* renamed from: c */
    private byte[] f15370c;

    zzatv(int i, byte[] bArr) {
        this.f15368a = i;
        this.f15370c = bArr;
        m20620b();
    }

    /* renamed from: b */
    private final void m20620b() {
        if (this.f15369b == null && this.f15370c != null) {
            return;
        }
        if (this.f15369b != null && this.f15370c == null) {
            return;
        }
        if (this.f15369b != null && this.f15370c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f15369b == null && this.f15370c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: a */
    public final C4110yz mo13896a() {
        if (!(this.f15369b != null)) {
            try {
                this.f15369b = (C4110yz) C3401ads.m16011a(new C4110yz(), this.f15370c);
                this.f15370c = null;
            } catch (zzbfh e) {
                throw new IllegalStateException(e);
            }
        }
        m20620b();
        return this.f15369b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f15368a);
        C3267a.m14972a(parcel, 2, this.f15370c != null ? this.f15370c : C3401ads.m16013a((C3401ads) this.f15369b), false);
        C3267a.m14956a(parcel, a);
    }
}
