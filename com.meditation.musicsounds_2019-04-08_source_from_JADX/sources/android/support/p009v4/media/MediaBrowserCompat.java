package android.support.p009v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.p020os.ResultReceiver;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f1519a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f1520d;

        /* renamed from: e */
        private final Bundle f1521e;

        /* renamed from: f */
        private final C0514a f1522f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo2038a(int i, Bundle bundle) {
            if (this.f1522f != null) {
                switch (i) {
                    case -1:
                        this.f1522f.mo2048c(this.f1520d, this.f1521e, bundle);
                        break;
                    case 0:
                        this.f1522f.mo2047b(this.f1520d, this.f1521e, bundle);
                        break;
                    case 1:
                        this.f1522f.mo2046a(this.f1520d, this.f1521e, bundle);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown result code: ");
                        sb.append(i);
                        sb.append(" (extras=");
                        sb.append(this.f1521e);
                        sb.append(", resultData=");
                        sb.append(bundle);
                        sb.append(")");
                        Log.w("MediaBrowserCompat", sb.toString());
                        break;
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f1523d;

        /* renamed from: e */
        private final C0515b f1524e;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo2038a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f1524e.mo2050a(this.f1523d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f1524e.mo2049a((MediaItem) parcelable);
            } else {
                this.f1524e.mo2050a(this.f1523d);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new Creator<MediaItem>() {
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: a */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };

        /* renamed from: a */
        private final int f1525a;

        /* renamed from: b */
        private final MediaDescriptionCompat f1526b;

        MediaItem(Parcel parcel) {
            this.f1525a = parcel.readInt();
            this.f1526b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.f1525a);
            sb.append(", mDescription=");
            sb.append(this.f1526b);
            sb.append('}');
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1525a);
            this.f1526b.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f1527d;

        /* renamed from: e */
        private final Bundle f1528e;

        /* renamed from: f */
        private final C0516c f1529f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo2038a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f1529f.mo2051a(this.f1527d, this.f1528e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.f1529f.mo2052a(this.f1527d, this.f1528e, arrayList);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static abstract class C0514a {
        /* renamed from: a */
        public void mo2046a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void mo2047b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void mo2048c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static abstract class C0515b {
        /* renamed from: a */
        public void mo2049a(MediaItem mediaItem) {
        }

        /* renamed from: a */
        public void mo2050a(String str) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0516c {
        /* renamed from: a */
        public void mo2051a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2052a(String str, Bundle bundle, List<MediaItem> list) {
        }
    }
}
