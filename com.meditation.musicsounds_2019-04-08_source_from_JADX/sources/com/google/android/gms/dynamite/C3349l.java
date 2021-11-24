package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import com.google.android.gms.internal.p129d.C4166a;
import com.google.android.gms.internal.p129d.C4168c;

/* renamed from: com.google.android.gms.dynamite.l */
public final class C3349l extends C4166a implements C3348k {
    C3349l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final C3323b mo11362a(C3323b bVar, String str, int i, C3323b bVar2) {
        Parcel c = mo14014c();
        C4168c.m20808a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        C4168c.m20808a(c, (IInterface) bVar2);
        Parcel a = mo14011a(2, c);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C3323b mo11363b(C3323b bVar, String str, int i, C3323b bVar2) {
        Parcel c = mo14014c();
        C4168c.m20808a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        C4168c.m20808a(c, (IInterface) bVar2);
        Parcel a = mo14011a(3, c);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
