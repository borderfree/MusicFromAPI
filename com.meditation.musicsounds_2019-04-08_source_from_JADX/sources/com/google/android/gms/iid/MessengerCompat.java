package com.google.android.gms.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class MessengerCompat implements ReflectedParcelable {
    public static final Creator<MessengerCompat> CREATOR = new C3374u();

    /* renamed from: a */
    private Messenger f11261a;

    /* renamed from: b */
    private C3370q f11262b;

    public MessengerCompat(IBinder iBinder) {
        C3370q qVar;
        if (VERSION.SDK_INT >= 21) {
            this.f11261a = new Messenger(iBinder);
            return;
        }
        if (iBinder == null) {
            qVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            qVar = queryLocalInterface instanceof C3370q ? (C3370q) queryLocalInterface : new C3371r(iBinder);
        }
        this.f11262b = qVar;
    }

    /* renamed from: a */
    private final IBinder m15187a() {
        return this.f11261a != null ? this.f11261a.getBinder() : this.f11262b.asBinder();
    }

    /* renamed from: a */
    public final void mo11364a(Message message) {
        if (this.f11261a != null) {
            this.f11261a.send(message);
        } else {
            this.f11262b.mo11399a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m15187a().equals(((MessengerCompat) obj).m15187a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m15187a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f11261a != null ? this.f11261a.getBinder() : this.f11262b.asBinder());
    }
}
