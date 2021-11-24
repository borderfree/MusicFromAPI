package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3323b.C3324a;
import com.google.android.gms.internal.p129d.C4166a;
import com.google.android.gms.internal.p129d.C4168c;

/* renamed from: com.google.android.gms.dynamite.j */
public final class C3347j extends C4166a implements C3346i {
    C3347j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: a */
    public final int mo11357a() {
        Parcel a = mo14011a(6, mo14014c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final int mo11358a(C3323b bVar, String str, boolean z) {
        Parcel c = mo14014c();
        C4168c.m20808a(c, (IInterface) bVar);
        c.writeString(str);
        C4168c.m20810a(c, z);
        Parcel a = mo14011a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final C3323b mo11359a(C3323b bVar, String str, int i) {
        Parcel c = mo14014c();
        C4168c.m20808a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo14011a(2, c);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo11360b(C3323b bVar, String str, boolean z) {
        Parcel c = mo14014c();
        C4168c.m20808a(c, (IInterface) bVar);
        c.writeString(str);
        C4168c.m20810a(c, z);
        Parcel a = mo14011a(5, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C3323b mo11361b(C3323b bVar, String str, int i) {
        Parcel c = mo14014c();
        C4168c.m20808a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo14011a(4, c);
        C3323b a2 = C3324a.m15129a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
