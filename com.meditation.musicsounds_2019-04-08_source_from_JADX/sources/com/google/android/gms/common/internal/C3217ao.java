package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import com.google.android.gms.internal.p129d.C4166a;

/* renamed from: com.google.android.gms.common.internal.ao */
public final class C3217ao extends C4166a implements C3215am {
    C3217ao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public final C3323b mo11189a() {
        Parcel a = mo14011a(1, mo14014c());
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo11190b() {
        Parcel a = mo14011a(2, mo14014c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
