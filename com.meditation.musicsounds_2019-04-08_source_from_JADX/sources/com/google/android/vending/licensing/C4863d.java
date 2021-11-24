package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.vending.licensing.d */
public interface C4863d extends IInterface {

    /* renamed from: com.google.android.vending.licensing.d$a */
    public static abstract class C4864a extends Binder implements C4863d {

        /* renamed from: com.google.android.vending.licensing.d$a$a */
        private static class C4865a implements C4863d {

            /* renamed from: a */
            private IBinder f17527a;

            C4865a(IBinder iBinder) {
                this.f17527a = iBinder;
            }

            /* renamed from: a */
            public void mo16063a(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f17527a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f17527a;
            }
        }

        public C4864a() {
            attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
        }

        /* renamed from: a */
        public static C4863d m24332a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C4863d)) ? new C4865a(iBinder) : (C4863d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                mo16063a(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo16063a(int i, String str, String str2);
}
