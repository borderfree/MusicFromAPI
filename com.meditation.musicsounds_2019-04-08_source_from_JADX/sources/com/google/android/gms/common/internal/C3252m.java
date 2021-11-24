package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.p129d.C4166a;
import com.google.android.gms.internal.p129d.C4167b;
import com.google.android.gms.internal.p129d.C4168c;

/* renamed from: com.google.android.gms.common.internal.m */
public interface C3252m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static abstract class C3253a extends C4167b implements C3252m {

        /* renamed from: com.google.android.gms.common.internal.m$a$a */
        public static class C3254a extends C4166a implements C3252m {
            C3254a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: a */
            public final Account mo11154a() {
                Parcel a = mo14011a(2, mo14014c());
                Account account = (Account) C4168c.m20807a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        /* renamed from: a */
        public static C3252m m14894a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C3252m ? (C3252m) queryLocalInterface : new C3254a(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo11191a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Account a = mo11154a();
            parcel2.writeNoException();
            C4168c.m20812b(parcel2, a);
            return true;
        }
    }

    /* renamed from: a */
    Account mo11154a();
}
