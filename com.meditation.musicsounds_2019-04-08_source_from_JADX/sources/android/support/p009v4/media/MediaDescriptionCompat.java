package android.support.p009v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new Creator<MediaDescriptionCompat>() {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m2297a(C0521a.m2315a(parcel));
        }

        /* renamed from: a */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };

    /* renamed from: a */
    private final String f1530a;

    /* renamed from: b */
    private final CharSequence f1531b;

    /* renamed from: c */
    private final CharSequence f1532c;

    /* renamed from: d */
    private final CharSequence f1533d;

    /* renamed from: e */
    private final Bitmap f1534e;

    /* renamed from: f */
    private final Uri f1535f;

    /* renamed from: g */
    private final Bundle f1536g;

    /* renamed from: h */
    private final Uri f1537h;

    /* renamed from: i */
    private Object f1538i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0518a {

        /* renamed from: a */
        private String f1539a;

        /* renamed from: b */
        private CharSequence f1540b;

        /* renamed from: c */
        private CharSequence f1541c;

        /* renamed from: d */
        private CharSequence f1542d;

        /* renamed from: e */
        private Bitmap f1543e;

        /* renamed from: f */
        private Uri f1544f;

        /* renamed from: g */
        private Bundle f1545g;

        /* renamed from: h */
        private Uri f1546h;

        /* renamed from: a */
        public C0518a mo2061a(Bitmap bitmap) {
            this.f1543e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0518a mo2062a(Uri uri) {
            this.f1544f = uri;
            return this;
        }

        /* renamed from: a */
        public C0518a mo2063a(Bundle bundle) {
            this.f1545g = bundle;
            return this;
        }

        /* renamed from: a */
        public C0518a mo2064a(CharSequence charSequence) {
            this.f1540b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0518a mo2065a(String str) {
            this.f1539a = str;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo2066a() {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(this.f1539a, this.f1540b, this.f1541c, this.f1542d, this.f1543e, this.f1544f, this.f1545g, this.f1546h);
            return mediaDescriptionCompat;
        }

        /* renamed from: b */
        public C0518a mo2067b(Uri uri) {
            this.f1546h = uri;
            return this;
        }

        /* renamed from: b */
        public C0518a mo2068b(CharSequence charSequence) {
            this.f1541c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0518a mo2069c(CharSequence charSequence) {
            this.f1542d = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f1530a = parcel.readString();
        this.f1531b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1532c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1533d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1534e = (Bitmap) parcel.readParcelable(null);
        this.f1535f = (Uri) parcel.readParcelable(null);
        this.f1536g = parcel.readBundle();
        this.f1537h = (Uri) parcel.readParcelable(null);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1530a = str;
        this.f1531b = charSequence;
        this.f1532c = charSequence2;
        this.f1533d = charSequence3;
        this.f1534e = bitmap;
        this.f1535f = uri;
        this.f1536g = bundle;
        this.f1537h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p009v4.media.MediaDescriptionCompat m2297a(java.lang.Object r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0081
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0081
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            java.lang.String r2 = android.support.p009v4.media.C0521a.m2316a(r6)
            r1.mo2065a(r2)
            java.lang.CharSequence r2 = android.support.p009v4.media.C0521a.m2318b(r6)
            r1.mo2064a(r2)
            java.lang.CharSequence r2 = android.support.p009v4.media.C0521a.m2319c(r6)
            r1.mo2068b(r2)
            java.lang.CharSequence r2 = android.support.p009v4.media.C0521a.m2320d(r6)
            r1.mo2069c(r2)
            android.graphics.Bitmap r2 = android.support.p009v4.media.C0521a.m2321e(r6)
            r1.mo2061a(r2)
            android.net.Uri r2 = android.support.p009v4.media.C0521a.m2322f(r6)
            r1.mo2062a(r2)
            android.os.Bundle r2 = android.support.p009v4.media.C0521a.m2323g(r6)
            if (r2 != 0) goto L_0x0040
            r3 = r0
            goto L_0x0048
        L_0x0040:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            android.net.Uri r3 = (android.net.Uri) r3
        L_0x0048:
            if (r3 == 0) goto L_0x0064
            java.lang.String r4 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L_0x005a
            int r4 = r2.size()
            r5 = 2
            if (r4 != r5) goto L_0x005a
            goto L_0x0065
        L_0x005a:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            r2.remove(r0)
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r2.remove(r0)
        L_0x0064:
            r0 = r2
        L_0x0065:
            r1.mo2063a(r0)
            if (r3 == 0) goto L_0x006e
            r1.mo2067b(r3)
            goto L_0x007b
        L_0x006e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007b
            android.net.Uri r0 = android.support.p009v4.media.C0523b.m2333h(r6)
            r1.mo2067b(r0)
        L_0x007b:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo2066a()
            r0.f1538i = r6
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.media.MediaDescriptionCompat.m2297a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: a */
    public Object mo2053a() {
        if (this.f1538i != null || VERSION.SDK_INT < 21) {
            return this.f1538i;
        }
        Object a = C0522a.m2324a();
        C0522a.m2330a(a, this.f1530a);
        C0522a.m2329a(a, this.f1531b);
        C0522a.m2331b(a, this.f1532c);
        C0522a.m2332c(a, this.f1533d);
        C0522a.m2326a(a, this.f1534e);
        C0522a.m2327a(a, this.f1535f);
        Bundle bundle = this.f1536g;
        if (VERSION.SDK_INT < 23 && this.f1537h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f1537h);
        }
        C0522a.m2328a(a, bundle);
        if (VERSION.SDK_INT >= 23) {
            C0524a.m2334b(a, this.f1537h);
        }
        this.f1538i = C0522a.m2325a(a);
        return this.f1538i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1531b);
        sb.append(", ");
        sb.append(this.f1532c);
        sb.append(", ");
        sb.append(this.f1533d);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f1530a);
            TextUtils.writeToParcel(this.f1531b, parcel, i);
            TextUtils.writeToParcel(this.f1532c, parcel, i);
            TextUtils.writeToParcel(this.f1533d, parcel, i);
            parcel.writeParcelable(this.f1534e, i);
            parcel.writeParcelable(this.f1535f, i);
            parcel.writeBundle(this.f1536g);
            parcel.writeParcelable(this.f1537h, i);
            return;
        }
        C0521a.m2317a(mo2053a(), parcel, i);
    }
}
