package android.support.p009v4.app;

import android.arch.lifecycle.C0038o;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

/* renamed from: android.support.v4.app.FragmentState */
final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new Creator<FragmentState>() {
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: a */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    };

    /* renamed from: a */
    final String f980a;

    /* renamed from: b */
    final int f981b;

    /* renamed from: c */
    final boolean f982c;

    /* renamed from: d */
    final int f983d;

    /* renamed from: e */
    final int f984e;

    /* renamed from: f */
    final String f985f;

    /* renamed from: g */
    final boolean f986g;

    /* renamed from: h */
    final boolean f987h;

    /* renamed from: i */
    final Bundle f988i;

    /* renamed from: j */
    final boolean f989j;

    /* renamed from: k */
    Bundle f990k;

    /* renamed from: l */
    Fragment f991l;

    FragmentState(Parcel parcel) {
        this.f980a = parcel.readString();
        this.f981b = parcel.readInt();
        boolean z = false;
        this.f982c = parcel.readInt() != 0;
        this.f983d = parcel.readInt();
        this.f984e = parcel.readInt();
        this.f985f = parcel.readString();
        this.f986g = parcel.readInt() != 0;
        this.f987h = parcel.readInt() != 0;
        this.f988i = parcel.readBundle();
        if (parcel.readInt() != 0) {
            z = true;
        }
        this.f989j = z;
        this.f990k = parcel.readBundle();
    }

    FragmentState(Fragment fragment) {
        this.f980a = fragment.getClass().getName();
        this.f981b = fragment.f941o;
        this.f982c = fragment.f949w;
        this.f983d = fragment.f914H;
        this.f984e = fragment.f915I;
        this.f985f = fragment.f916J;
        this.f986g = fragment.f919M;
        this.f987h = fragment.f918L;
        this.f988i = fragment.f943q;
        this.f989j = fragment.f917K;
    }

    /* renamed from: a */
    public Fragment mo1346a(C0373k kVar, C0371i iVar, Fragment fragment, C0393n nVar, C0038o oVar) {
        if (this.f991l == null) {
            Context g = kVar.mo1529g();
            if (this.f988i != null) {
                this.f988i.setClassLoader(g.getClassLoader());
            }
            this.f991l = iVar != null ? iVar.mo1329a(g, this.f980a, this.f988i) : Fragment.m1271a(g, this.f980a, this.f988i);
            if (this.f990k != null) {
                this.f990k.setClassLoader(g.getClassLoader());
                this.f991l.f938l = this.f990k;
            }
            this.f991l.mo1223a(this.f981b, fragment);
            this.f991l.f949w = this.f982c;
            this.f991l.f951y = true;
            this.f991l.f914H = this.f983d;
            this.f991l.f915I = this.f984e;
            this.f991l.f916J = this.f985f;
            this.f991l.f919M = this.f986g;
            this.f991l.f918L = this.f987h;
            this.f991l.f917K = this.f989j;
            this.f991l.f908B = kVar.f1093d;
            if (C0377m.f1099a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiated fragment ");
                sb.append(this.f991l);
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f991l.f911E = nVar;
        this.f991l.f912F = oVar;
        return this.f991l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f980a);
        parcel.writeInt(this.f981b);
        parcel.writeInt(this.f982c ? 1 : 0);
        parcel.writeInt(this.f983d);
        parcel.writeInt(this.f984e);
        parcel.writeString(this.f985f);
        parcel.writeInt(this.f986g ? 1 : 0);
        parcel.writeInt(this.f987h ? 1 : 0);
        parcel.writeBundle(this.f988i);
        parcel.writeInt(this.f989j ? 1 : 0);
        parcel.writeBundle(this.f990k);
    }
}
