package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.C4316da;
import com.google.android.gms.internal.measurement.C4324di;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.k */
public final class C4760k extends C4316da implements C4758i {
    C4760k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final List<zzfv> mo15356a(zzk zzk, boolean z) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzk);
        C4324di.m21255a(a, z);
        Parcel a2 = mo14268a(7, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzo> mo15357a(String str, String str2, zzk zzk) {
        Parcel a = mo14267a();
        a.writeString(str);
        a.writeString(str2);
        C4324di.m21254a(a, (Parcelable) zzk);
        Parcel a2 = mo14268a(16, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzo.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzo> mo15358a(String str, String str2, String str3) {
        Parcel a = mo14267a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Parcel a2 = mo14268a(17, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzo.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzfv> mo15359a(String str, String str2, String str3, boolean z) {
        Parcel a = mo14267a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        C4324di.m21255a(a, z);
        Parcel a2 = mo14268a(15, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzfv> mo15360a(String str, String str2, boolean z, zzk zzk) {
        Parcel a = mo14267a();
        a.writeString(str);
        a.writeString(str2);
        C4324di.m21255a(a, z);
        C4324di.m21254a(a, (Parcelable) zzk);
        Parcel a2 = mo14268a(14, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final void mo15361a(long j, String str, String str2, String str3) {
        Parcel a = mo14267a();
        a.writeLong(j);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        mo14270b(10, a);
    }

    /* renamed from: a */
    public final void mo15362a(zzag zzag, zzk zzk) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzag);
        C4324di.m21254a(a, (Parcelable) zzk);
        mo14270b(1, a);
    }

    /* renamed from: a */
    public final void mo15363a(zzag zzag, String str, String str2) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzag);
        a.writeString(str);
        a.writeString(str2);
        mo14270b(5, a);
    }

    /* renamed from: a */
    public final void mo15364a(zzfv zzfv, zzk zzk) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzfv);
        C4324di.m21254a(a, (Parcelable) zzk);
        mo14270b(2, a);
    }

    /* renamed from: a */
    public final void mo15365a(zzk zzk) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzk);
        mo14270b(4, a);
    }

    /* renamed from: a */
    public final void mo15366a(zzo zzo) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzo);
        mo14270b(13, a);
    }

    /* renamed from: a */
    public final void mo15367a(zzo zzo, zzk zzk) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzo);
        C4324di.m21254a(a, (Parcelable) zzk);
        mo14270b(12, a);
    }

    /* renamed from: a */
    public final byte[] mo15368a(zzag zzag, String str) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzag);
        a.writeString(str);
        Parcel a2 = mo14268a(9, a);
        byte[] createByteArray = a2.createByteArray();
        a2.recycle();
        return createByteArray;
    }

    /* renamed from: b */
    public final void mo15370b(zzk zzk) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzk);
        mo14270b(6, a);
    }

    /* renamed from: c */
    public final String mo15371c(zzk zzk) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzk);
        Parcel a2 = mo14268a(11, a);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    /* renamed from: d */
    public final void mo15372d(zzk zzk) {
        Parcel a = mo14267a();
        C4324di.m21254a(a, (Parcelable) zzk);
        mo14270b(18, a);
    }
}
