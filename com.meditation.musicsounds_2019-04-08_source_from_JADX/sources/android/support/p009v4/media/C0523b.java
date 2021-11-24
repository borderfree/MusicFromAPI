package android.support.p009v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;

/* renamed from: android.support.v4.media.b */
class C0523b extends C0521a {

    /* renamed from: android.support.v4.media.b$a */
    static class C0524a extends C0522a {
        /* renamed from: b */
        public static void m2334b(Object obj, Uri uri) {
            ((Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: h */
    public static Uri m2333h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
