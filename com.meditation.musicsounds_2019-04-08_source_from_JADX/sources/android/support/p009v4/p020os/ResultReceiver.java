package android.support.p009v4.p020os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.p020os.C0557b.C0558a;

/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new Creator<ResultReceiver>() {
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: a */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    };

    /* renamed from: a */
    final boolean f1602a = false;

    /* renamed from: b */
    final Handler f1603b = null;

    /* renamed from: c */
    C0557b f1604c;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0554a extends C0558a {
        C0554a() {
        }

        /* renamed from: a */
        public void mo2229a(int i, Bundle bundle) {
            if (ResultReceiver.this.f1603b != null) {
                ResultReceiver.this.f1603b.post(new C0555b(i, bundle));
            } else {
                ResultReceiver.this.mo2038a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0555b implements Runnable {

        /* renamed from: a */
        final int f1606a;

        /* renamed from: b */
        final Bundle f1607b;

        C0555b(int i, Bundle bundle) {
            this.f1606a = i;
            this.f1607b = bundle;
        }

        public void run() {
            ResultReceiver.this.mo2038a(this.f1606a, this.f1607b);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f1604c = C0558a.m2555a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2038a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f1604c == null) {
                this.f1604c = new C0554a();
            }
            parcel.writeStrongBinder(this.f1604c.asBinder());
        }
    }
}
