package android.support.p009v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.p009v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new Creator<QueueItem>() {
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: a */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };

        /* renamed from: a */
        private final MediaDescriptionCompat f1571a;

        /* renamed from: b */
        private final long f1572b;

        /* renamed from: c */
        private Object f1573c;

        QueueItem(Parcel parcel) {
            this.f1571a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f1572b = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f1571a = mediaDescriptionCompat;
                this.f1572b = j;
                this.f1573c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m2379a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m2297a(C0549a.m2533a(obj)), C0549a.m2534b(obj));
        }

        /* renamed from: a */
        public static List<QueueItem> m2380a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m2379a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaSession.QueueItem {Description=");
            sb.append(this.f1571a);
            sb.append(", Id=");
            sb.append(this.f1572b);
            sb.append(" }");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f1571a.writeToParcel(parcel, i);
            parcel.writeLong(this.f1572b);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new Creator<ResultReceiverWrapper>() {
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: a */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };

        /* renamed from: a */
        private ResultReceiver f1574a;

        ResultReceiverWrapper(Parcel parcel) {
            this.f1574a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f1574a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new Creator<Token>() {
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            /* renamed from: a */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        };

        /* renamed from: a */
        private final Object f1575a;

        /* renamed from: b */
        private final C0541b f1576b;

        Token(Object obj) {
            this(obj, null);
        }

        Token(Object obj, C0541b bVar) {
            this.f1575a = obj;
            this.f1576b = bVar;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.f1575a == null) {
                if (token.f1575a != null) {
                    z = false;
                }
                return z;
            } else if (token.f1575a == null) {
                return false;
            } else {
                return this.f1575a.equals(token.f1575a);
            }
        }

        public int hashCode() {
            if (this.f1575a == null) {
                return 0;
            }
            return this.f1575a.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f1575a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f1575a);
            }
        }
    }
}
