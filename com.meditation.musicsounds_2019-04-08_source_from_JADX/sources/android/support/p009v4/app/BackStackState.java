package android.support.p009v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.BackStackState */
final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new Creator<BackStackState>() {
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: a */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    };

    /* renamed from: a */
    final int[] f893a;

    /* renamed from: b */
    final int f894b;

    /* renamed from: c */
    final int f895c;

    /* renamed from: d */
    final String f896d;

    /* renamed from: e */
    final int f897e;

    /* renamed from: f */
    final int f898f;

    /* renamed from: g */
    final CharSequence f899g;

    /* renamed from: h */
    final int f900h;

    /* renamed from: i */
    final CharSequence f901i;

    /* renamed from: j */
    final ArrayList<String> f902j;

    /* renamed from: k */
    final ArrayList<String> f903k;

    /* renamed from: l */
    final boolean f904l;

    public BackStackState(Parcel parcel) {
        this.f893a = parcel.createIntArray();
        this.f894b = parcel.readInt();
        this.f895c = parcel.readInt();
        this.f896d = parcel.readString();
        this.f897e = parcel.readInt();
        this.f898f = parcel.readInt();
        this.f899g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f900h = parcel.readInt();
        this.f901i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f902j = parcel.createStringArrayList();
        this.f903k = parcel.createStringArrayList();
        this.f904l = parcel.readInt() != 0;
    }

    public BackStackState(C0360c cVar) {
        int size = cVar.f1031b.size();
        this.f893a = new int[(size * 6)];
        if (cVar.f1038i) {
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0361a aVar = (C0361a) cVar.f1031b.get(i);
                int i3 = i2 + 1;
                this.f893a[i2] = aVar.f1051a;
                int i4 = i3 + 1;
                this.f893a[i3] = aVar.f1052b != null ? aVar.f1052b.f941o : -1;
                int i5 = i4 + 1;
                this.f893a[i4] = aVar.f1053c;
                int i6 = i5 + 1;
                this.f893a[i5] = aVar.f1054d;
                int i7 = i6 + 1;
                this.f893a[i6] = aVar.f1055e;
                int i8 = i7 + 1;
                this.f893a[i7] = aVar.f1056f;
                i++;
                i2 = i8;
            }
            this.f894b = cVar.f1036g;
            this.f895c = cVar.f1037h;
            this.f896d = cVar.f1040k;
            this.f897e = cVar.f1042m;
            this.f898f = cVar.f1043n;
            this.f899g = cVar.f1044o;
            this.f900h = cVar.f1045p;
            this.f901i = cVar.f1046q;
            this.f902j = cVar.f1047r;
            this.f903k = cVar.f1048s;
            this.f904l = cVar.f1049t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0360c mo1184a(C0377m mVar) {
        C0360c cVar = new C0360c(mVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f893a.length) {
            C0361a aVar = new C0361a();
            int i3 = i + 1;
            aVar.f1051a = this.f893a[i];
            if (C0377m.f1099a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(cVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f893a[i3]);
                Log.v("FragmentManager", sb.toString());
            }
            int i4 = i3 + 1;
            int i5 = this.f893a[i3];
            aVar.f1052b = i5 >= 0 ? (Fragment) mVar.f1111f.get(i5) : null;
            int i6 = i4 + 1;
            aVar.f1053c = this.f893a[i4];
            int i7 = i6 + 1;
            aVar.f1054d = this.f893a[i6];
            int i8 = i7 + 1;
            aVar.f1055e = this.f893a[i7];
            int i9 = i8 + 1;
            aVar.f1056f = this.f893a[i8];
            cVar.f1032c = aVar.f1053c;
            cVar.f1033d = aVar.f1054d;
            cVar.f1034e = aVar.f1055e;
            cVar.f1035f = aVar.f1056f;
            cVar.mo1416a(aVar);
            i2++;
            i = i9;
        }
        cVar.f1036g = this.f894b;
        cVar.f1037h = this.f895c;
        cVar.f1040k = this.f896d;
        cVar.f1042m = this.f897e;
        cVar.f1038i = true;
        cVar.f1043n = this.f898f;
        cVar.f1044o = this.f899g;
        cVar.f1045p = this.f900h;
        cVar.f1046q = this.f901i;
        cVar.f1047r = this.f902j;
        cVar.f1048s = this.f903k;
        cVar.f1049t = this.f904l;
        cVar.mo1426b(1);
        return cVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f893a);
        parcel.writeInt(this.f894b);
        parcel.writeInt(this.f895c);
        parcel.writeString(this.f896d);
        parcel.writeInt(this.f897e);
        parcel.writeInt(this.f898f);
        TextUtils.writeToParcel(this.f899g, parcel, 0);
        parcel.writeInt(this.f900h);
        TextUtils.writeToParcel(this.f901i, parcel, 0);
        parcel.writeStringList(this.f902j);
        parcel.writeStringList(this.f903k);
        parcel.writeInt(this.f904l ? 1 : 0);
    }
}
