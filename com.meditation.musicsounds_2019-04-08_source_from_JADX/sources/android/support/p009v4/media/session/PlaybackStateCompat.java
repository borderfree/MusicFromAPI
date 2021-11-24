package android.support.p009v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new Creator<PlaybackStateCompat>() {
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: a */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };

    /* renamed from: a */
    final int f1582a;

    /* renamed from: b */
    final long f1583b;

    /* renamed from: c */
    final long f1584c;

    /* renamed from: d */
    final float f1585d;

    /* renamed from: e */
    final long f1586e;

    /* renamed from: f */
    final int f1587f;

    /* renamed from: g */
    final CharSequence f1588g;

    /* renamed from: h */
    final long f1589h;

    /* renamed from: i */
    List<CustomAction> f1590i;

    /* renamed from: j */
    final long f1591j;

    /* renamed from: k */
    final Bundle f1592k;

    /* renamed from: l */
    private Object f1593l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new Creator<CustomAction>() {
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: a */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };

        /* renamed from: a */
        private final String f1594a;

        /* renamed from: b */
        private final CharSequence f1595b;

        /* renamed from: c */
        private final int f1596c;

        /* renamed from: d */
        private final Bundle f1597d;

        /* renamed from: e */
        private Object f1598e;

        CustomAction(Parcel parcel) {
            this.f1594a = parcel.readString();
            this.f1595b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1596c = parcel.readInt();
            this.f1597d = parcel.readBundle();
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1594a = str;
            this.f1595b = charSequence;
            this.f1596c = i;
            this.f1597d = bundle;
        }

        /* renamed from: a */
        public static CustomAction m2392a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0551a.m2544a(obj), C0551a.m2545b(obj), C0551a.m2546c(obj), C0551a.m2547d(obj));
            customAction.f1598e = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Action:mName='");
            sb.append(this.f1595b);
            sb.append(", mIcon=");
            sb.append(this.f1596c);
            sb.append(", mExtras=");
            sb.append(this.f1597d);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1594a);
            TextUtils.writeToParcel(this.f1595b, parcel, i);
            parcel.writeInt(this.f1596c);
            parcel.writeBundle(this.f1597d);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f1582a = i;
        this.f1583b = j;
        this.f1584c = j2;
        this.f1585d = f;
        this.f1586e = j3;
        this.f1587f = i2;
        this.f1588g = charSequence;
        this.f1589h = j4;
        this.f1590i = new ArrayList(list);
        this.f1591j = j5;
        this.f1592k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f1582a = parcel.readInt();
        this.f1583b = parcel.readLong();
        this.f1585d = parcel.readFloat();
        this.f1589h = parcel.readLong();
        this.f1584c = parcel.readLong();
        this.f1586e = parcel.readLong();
        this.f1588g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1590i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1591j = parcel.readLong();
        this.f1592k = parcel.readBundle();
        this.f1587f = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m2389a(Object obj) {
        List list;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> h = C0550e.m2542h(obj);
        if (h != null) {
            ArrayList arrayList = new ArrayList(h.size());
            for (Object a : h) {
                arrayList.add(CustomAction.m2392a(a));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            bundle = C0552f.m2548a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0550e.m2535a(obj), C0550e.m2536b(obj), C0550e.m2537c(obj), C0550e.m2538d(obj), C0550e.m2539e(obj), 0, C0550e.m2540f(obj), C0550e.m2541g(obj), list, C0550e.m2543i(obj), bundle);
        playbackStateCompat.f1593l = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f1582a);
        sb.append(", position=");
        sb.append(this.f1583b);
        sb.append(", buffered position=");
        sb.append(this.f1584c);
        sb.append(", speed=");
        sb.append(this.f1585d);
        sb.append(", updated=");
        sb.append(this.f1589h);
        sb.append(", actions=");
        sb.append(this.f1586e);
        sb.append(", error code=");
        sb.append(this.f1587f);
        sb.append(", error message=");
        sb.append(this.f1588g);
        sb.append(", custom actions=");
        sb.append(this.f1590i);
        sb.append(", active item id=");
        sb.append(this.f1591j);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1582a);
        parcel.writeLong(this.f1583b);
        parcel.writeFloat(this.f1585d);
        parcel.writeLong(this.f1589h);
        parcel.writeLong(this.f1584c);
        parcel.writeLong(this.f1586e);
        TextUtils.writeToParcel(this.f1588g, parcel, i);
        parcel.writeTypedList(this.f1590i);
        parcel.writeLong(this.f1591j);
        parcel.writeBundle(this.f1592k);
        parcel.writeInt(this.f1587f);
    }
}
