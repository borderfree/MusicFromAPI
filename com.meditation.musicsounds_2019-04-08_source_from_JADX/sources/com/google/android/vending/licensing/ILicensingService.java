package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.vending.licensing.C4863d.C4864a;

public interface ILicensingService extends IInterface {

    /* renamed from: com.google.android.vending.licensing.ILicensingService$a */
    public static abstract class C4858a extends Binder implements ILicensingService {

        /* renamed from: com.google.android.vending.licensing.ILicensingService$a$a */
        private static class C4859a implements ILicensingService {

            /* renamed from: a */
            private IBinder f17513a;

            C4859a(IBinder iBinder) {
                this.f17513a = iBinder;
            }

            /* renamed from: a */
            public void mo16047a(long j, String str, C4863d dVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f17513a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f17513a;
            }
        }

        /* renamed from: a */
        public static ILicensingService m24310a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ILicensingService)) ? new C4859a(iBinder) : (ILicensingService) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.android.vending.licensing.ILicensingService");
                mo16047a(parcel.readLong(), parcel.readString(), C4864a.m24332a(parcel.readStrongBinder()));
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.android.vending.licensing.ILicensingService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16047a(long j, String str, C4863d dVar);
}
