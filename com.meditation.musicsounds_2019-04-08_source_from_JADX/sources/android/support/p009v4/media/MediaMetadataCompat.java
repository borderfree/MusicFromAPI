package android.support.p009v4.media;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.p019g.C0488a;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new Creator<MediaMetadataCompat>() {
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: a */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    };

    /* renamed from: a */
    static final C0488a<String, Integer> f1547a = new C0488a<>();

    /* renamed from: c */
    private static final String[] f1548c = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: d */
    private static final String[] f1549d = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: e */
    private static final String[] f1550e = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b */
    final Bundle f1551b;

    /* renamed from: f */
    private Object f1552f;

    static {
        f1547a.put("android.media.metadata.TITLE", Integer.valueOf(1));
        f1547a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        f1547a.put("android.media.metadata.DURATION", Integer.valueOf(0));
        f1547a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        f1547a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        f1547a.put("android.media.metadata.WRITER", Integer.valueOf(1));
        f1547a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        f1547a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        f1547a.put("android.media.metadata.DATE", Integer.valueOf(1));
        f1547a.put("android.media.metadata.YEAR", Integer.valueOf(0));
        f1547a.put("android.media.metadata.GENRE", Integer.valueOf(1));
        f1547a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        f1547a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        f1547a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        f1547a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        f1547a.put("android.media.metadata.ART", Integer.valueOf(2));
        f1547a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        f1547a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        f1547a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        f1547a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        f1547a.put("android.media.metadata.RATING", Integer.valueOf(3));
        f1547a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        f1547a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        f1547a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        f1547a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        f1547a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        f1547a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
        f1547a.put("android.media.metadata.BT_FOLDER_TYPE", Integer.valueOf(0));
        f1547a.put("android.media.metadata.MEDIA_URI", Integer.valueOf(1));
        f1547a.put("android.media.metadata.ADVERTISEMENT", Integer.valueOf(0));
        f1547a.put("android.media.metadata.DOWNLOAD_STATUS", Integer.valueOf(0));
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f1551b = parcel.readBundle();
        this.f1551b.setClassLoader(MediaMetadataCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m2310a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0525c.m2335a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f1552f = obj;
        return mediaMetadataCompat;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1551b);
    }
}
