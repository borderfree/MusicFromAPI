package android.support.p009v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.a */
class C0521a {

    /* renamed from: android.support.v4.media.a$a */
    static class C0522a {
        /* renamed from: a */
        public static Object m2324a() {
            return new Builder();
        }

        /* renamed from: a */
        public static Object m2325a(Object obj) {
            return ((Builder) obj).build();
        }

        /* renamed from: a */
        public static void m2326a(Object obj, Bitmap bitmap) {
            ((Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m2327a(Object obj, Uri uri) {
            ((Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m2328a(Object obj, Bundle bundle) {
            ((Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static void m2329a(Object obj, CharSequence charSequence) {
            ((Builder) obj).setTitle(charSequence);
        }

        /* renamed from: a */
        public static void m2330a(Object obj, String str) {
            ((Builder) obj).setMediaId(str);
        }

        /* renamed from: b */
        public static void m2331b(Object obj, CharSequence charSequence) {
            ((Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m2332c(Object obj, CharSequence charSequence) {
            ((Builder) obj).setDescription(charSequence);
        }
    }

    /* renamed from: a */
    public static Object m2315a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static String m2316a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: a */
    public static void m2317a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: b */
    public static CharSequence m2318b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: c */
    public static CharSequence m2319c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: d */
    public static CharSequence m2320d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: e */
    public static Bitmap m2321e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m2322f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: g */
    public static Bundle m2323g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }
}
