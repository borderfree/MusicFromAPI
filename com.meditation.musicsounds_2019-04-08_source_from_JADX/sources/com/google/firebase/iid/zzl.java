package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

public class zzl implements Parcelable {
    public static final Creator<zzl> CREATOR = new C4935am();

    /* renamed from: a */
    private Messenger f17809a;

    /* renamed from: b */
    private C4944av f17810b;

    /* renamed from: com.google.firebase.iid.zzl$a */
    public static final class C4974a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (FirebaseInstanceId.m24505h()) {
                Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            }
            return zzl.class;
        }
    }

    public zzl(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f17809a = new Messenger(iBinder);
        } else {
            this.f17810b = new C4945aw(iBinder);
        }
    }

    /* renamed from: a */
    private final IBinder m24686a() {
        return this.f17809a != null ? this.f17809a.getBinder() : this.f17810b.asBinder();
    }

    /* renamed from: a */
    public final void mo16258a(Message message) {
        if (this.f17809a != null) {
            this.f17809a.send(message);
        } else {
            this.f17810b.mo16209a(message);
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
            return m24686a().equals(((zzl) obj).m24686a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m24686a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f17809a != null ? this.f17809a.getBinder() : this.f17810b.asBinder());
    }
}
