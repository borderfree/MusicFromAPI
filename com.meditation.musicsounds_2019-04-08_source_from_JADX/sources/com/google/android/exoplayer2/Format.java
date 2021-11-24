package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
    public static final Creator<Format> CREATOR = new Creator<Format>() {
        /* renamed from: a */
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        /* renamed from: a */
        public Format[] newArray(int i) {
            return new Format[i];
        }
    };

    /* renamed from: A */
    private int f7732A;

    /* renamed from: a */
    public final String f7733a;

    /* renamed from: b */
    public final int f7734b;

    /* renamed from: c */
    public final String f7735c;

    /* renamed from: d */
    public final Metadata f7736d;

    /* renamed from: e */
    public final String f7737e;

    /* renamed from: f */
    public final String f7738f;

    /* renamed from: g */
    public final int f7739g;

    /* renamed from: h */
    public final List<byte[]> f7740h;

    /* renamed from: i */
    public final DrmInitData f7741i;

    /* renamed from: j */
    public final int f7742j;

    /* renamed from: k */
    public final int f7743k;

    /* renamed from: l */
    public final float f7744l;

    /* renamed from: m */
    public final int f7745m;

    /* renamed from: n */
    public final float f7746n;

    /* renamed from: o */
    public final int f7747o;

    /* renamed from: p */
    public final byte[] f7748p;

    /* renamed from: q */
    public final ColorInfo f7749q;

    /* renamed from: r */
    public final int f7750r;

    /* renamed from: s */
    public final int f7751s;

    /* renamed from: t */
    public final int f7752t;

    /* renamed from: u */
    public final int f7753u;

    /* renamed from: v */
    public final int f7754v;

    /* renamed from: w */
    public final long f7755w;

    /* renamed from: x */
    public final int f7756x;

    /* renamed from: y */
    public final String f7757y;

    /* renamed from: z */
    public final int f7758z;

    Format(Parcel parcel) {
        this.f7733a = parcel.readString();
        this.f7737e = parcel.readString();
        this.f7738f = parcel.readString();
        this.f7735c = parcel.readString();
        this.f7734b = parcel.readInt();
        this.f7739g = parcel.readInt();
        this.f7742j = parcel.readInt();
        this.f7743k = parcel.readInt();
        this.f7744l = parcel.readFloat();
        this.f7745m = parcel.readInt();
        this.f7746n = parcel.readFloat();
        this.f7748p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f7747o = parcel.readInt();
        this.f7749q = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f7750r = parcel.readInt();
        this.f7751s = parcel.readInt();
        this.f7752t = parcel.readInt();
        this.f7753u = parcel.readInt();
        this.f7754v = parcel.readInt();
        this.f7756x = parcel.readInt();
        this.f7757y = parcel.readString();
        this.f7758z = parcel.readInt();
        this.f7755w = parcel.readLong();
        int readInt = parcel.readInt();
        this.f7740h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f7740h.add(parcel.createByteArray());
        }
        this.f7741i = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f7736d = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, DrmInitData drmInitData, Metadata metadata) {
        this.f7733a = str;
        this.f7737e = str2;
        this.f7738f = str3;
        this.f7735c = str4;
        this.f7734b = i;
        this.f7739g = i2;
        this.f7742j = i3;
        this.f7743k = i4;
        this.f7744l = f;
        this.f7745m = i5;
        this.f7746n = f2;
        this.f7748p = bArr;
        this.f7747o = i6;
        this.f7749q = colorInfo;
        this.f7750r = i7;
        this.f7751s = i8;
        this.f7752t = i9;
        this.f7753u = i10;
        this.f7754v = i11;
        this.f7756x = i12;
        this.f7757y = str5;
        this.f7758z = i13;
        this.f7755w = j;
        this.f7740h = list == null ? Collections.emptyList() : list;
        this.f7741i = drmInitData;
        this.f7736d = metadata;
    }

    /* renamed from: a */
    public static Format m11311a(String str, String str2, long j) {
        Format format = new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
        return format;
    }

    /* renamed from: a */
    public static Format m11312a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData) {
        return m11313a(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (ColorInfo) null, drmInitData);
    }

    /* renamed from: a */
    public static Format m11313a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, DrmInitData drmInitData) {
        Format format = new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
        return format;
    }

    /* renamed from: a */
    public static Format m11314a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, DrmInitData drmInitData, int i8, String str4, Metadata metadata) {
        Format format = new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
        return format;
    }

    /* renamed from: a */
    public static Format m11315a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData, int i6, String str4) {
        return m11314a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, (Metadata) null);
    }

    /* renamed from: a */
    public static Format m11316a(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, DrmInitData drmInitData, int i5, String str4) {
        return m11315a(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    /* renamed from: a */
    public static Format m11317a(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData) {
        return m11318a(str, str2, str3, i, i2, str4, i3, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static Format m11318a(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData, long j, List<byte[]> list) {
        Format format = new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
        return format;
    }

    /* renamed from: a */
    public static Format m11319a(String str, String str2, String str3, int i, int i2, String str4, DrmInitData drmInitData) {
        return m11318a(str, str2, str3, i, i2, str4, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static Format m11320a(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        Format format = new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
        return format;
    }

    /* renamed from: a */
    public static Format m11321a(String str, String str2, String str3, int i, List<byte[]> list, String str4, DrmInitData drmInitData) {
        Format format = new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
        return format;
    }

    @TargetApi(24)
    /* renamed from: a */
    private static void m11322a(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            m11324a(mediaFormat, "color-transfer", colorInfo.f9778c);
            m11324a(mediaFormat, "color-standard", colorInfo.f9776a);
            m11324a(mediaFormat, "color-range", colorInfo.f9777b);
            m11326a(mediaFormat, "hdr-static-info", colorInfo.f9779d);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m11323a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m11324a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m11325a(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m11326a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: a */
    public int mo8596a() {
        if (this.f7742j == -1 || this.f7743k == -1) {
            return -1;
        }
        return this.f7743k * this.f7742j;
    }

    /* renamed from: a */
    public Format mo8597a(int i) {
        int i2 = i;
        Format format = new Format(this.f7733a, this.f7737e, this.f7738f, this.f7735c, this.f7734b, i2, this.f7742j, this.f7743k, this.f7744l, this.f7745m, this.f7746n, this.f7748p, this.f7747o, this.f7749q, this.f7750r, this.f7751s, this.f7752t, this.f7753u, this.f7754v, this.f7756x, this.f7757y, this.f7758z, this.f7755w, this.f7740h, this.f7741i, this.f7736d);
        return format;
    }

    /* renamed from: a */
    public Format mo8598a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        Format format = new Format(this.f7733a, this.f7737e, this.f7738f, this.f7735c, this.f7734b, this.f7739g, this.f7742j, this.f7743k, this.f7744l, this.f7745m, this.f7746n, this.f7748p, this.f7747o, this.f7749q, this.f7750r, this.f7751s, this.f7752t, i3, i4, this.f7756x, this.f7757y, this.f7758z, this.f7755w, this.f7740h, this.f7741i, this.f7736d);
        return format;
    }

    /* renamed from: a */
    public Format mo8599a(long j) {
        Format format = new Format(this.f7733a, this.f7737e, this.f7738f, this.f7735c, this.f7734b, this.f7739g, this.f7742j, this.f7743k, this.f7744l, this.f7745m, this.f7746n, this.f7748p, this.f7747o, this.f7749q, this.f7750r, this.f7751s, this.f7752t, this.f7753u, this.f7754v, this.f7756x, this.f7757y, this.f7758z, j, this.f7740h, this.f7741i, this.f7736d);
        return format;
    }

    /* renamed from: a */
    public Format mo8600a(DrmInitData drmInitData) {
        DrmInitData drmInitData2 = drmInitData;
        Format format = new Format(this.f7733a, this.f7737e, this.f7738f, this.f7735c, this.f7734b, this.f7739g, this.f7742j, this.f7743k, this.f7744l, this.f7745m, this.f7746n, this.f7748p, this.f7747o, this.f7749q, this.f7750r, this.f7751s, this.f7752t, this.f7753u, this.f7754v, this.f7756x, this.f7757y, this.f7758z, this.f7755w, this.f7740h, drmInitData2, this.f7736d);
        return format;
    }

    /* renamed from: a */
    public Format mo8601a(Metadata metadata) {
        Metadata metadata2 = metadata;
        Format format = new Format(this.f7733a, this.f7737e, this.f7738f, this.f7735c, this.f7734b, this.f7739g, this.f7742j, this.f7743k, this.f7744l, this.f7745m, this.f7746n, this.f7748p, this.f7747o, this.f7749q, this.f7750r, this.f7751s, this.f7752t, this.f7753u, this.f7754v, this.f7756x, this.f7757y, this.f7758z, this.f7755w, this.f7740h, this.f7741i, metadata2);
        return format;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: b */
    public final MediaFormat mo8602b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f7738f);
        m11325a(mediaFormat, "language", this.f7757y);
        m11324a(mediaFormat, "max-input-size", this.f7739g);
        m11324a(mediaFormat, "width", this.f7742j);
        m11324a(mediaFormat, "height", this.f7743k);
        m11323a(mediaFormat, "frame-rate", this.f7744l);
        m11324a(mediaFormat, "rotation-degrees", this.f7745m);
        m11324a(mediaFormat, "channel-count", this.f7750r);
        m11324a(mediaFormat, "sample-rate", this.f7751s);
        m11324a(mediaFormat, "encoder-delay", this.f7753u);
        m11324a(mediaFormat, "encoder-padding", this.f7754v);
        for (int i = 0; i < this.f7740h.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) this.f7740h.get(i)));
        }
        m11322a(mediaFormat, this.f7749q);
        return mediaFormat;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Format format = (Format) obj;
            if (this.f7734b == format.f7734b && this.f7739g == format.f7739g && this.f7742j == format.f7742j && this.f7743k == format.f7743k && this.f7744l == format.f7744l && this.f7745m == format.f7745m && this.f7746n == format.f7746n && this.f7747o == format.f7747o && this.f7750r == format.f7750r && this.f7751s == format.f7751s && this.f7752t == format.f7752t && this.f7753u == format.f7753u && this.f7754v == format.f7754v && this.f7755w == format.f7755w && this.f7756x == format.f7756x && C2511s.m11809a((Object) this.f7733a, (Object) format.f7733a) && C2511s.m11809a((Object) this.f7757y, (Object) format.f7757y) && this.f7758z == format.f7758z && C2511s.m11809a((Object) this.f7737e, (Object) format.f7737e) && C2511s.m11809a((Object) this.f7738f, (Object) format.f7738f) && C2511s.m11809a((Object) this.f7735c, (Object) format.f7735c) && C2511s.m11809a((Object) this.f7741i, (Object) format.f7741i) && C2511s.m11809a((Object) this.f7736d, (Object) format.f7736d) && C2511s.m11809a((Object) this.f7749q, (Object) format.f7749q) && Arrays.equals(this.f7748p, format.f7748p) && this.f7740h.size() == format.f7740h.size()) {
                for (int i = 0; i < this.f7740h.size(); i++) {
                    if (!Arrays.equals((byte[]) this.f7740h.get(i), (byte[]) format.f7740h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f7732A == 0) {
            int i = 0;
            int hashCode = (((((((((((((((((((((((527 + (this.f7733a == null ? 0 : this.f7733a.hashCode())) * 31) + (this.f7737e == null ? 0 : this.f7737e.hashCode())) * 31) + (this.f7738f == null ? 0 : this.f7738f.hashCode())) * 31) + (this.f7735c == null ? 0 : this.f7735c.hashCode())) * 31) + this.f7734b) * 31) + this.f7742j) * 31) + this.f7743k) * 31) + this.f7750r) * 31) + this.f7751s) * 31) + (this.f7757y == null ? 0 : this.f7757y.hashCode())) * 31) + this.f7758z) * 31) + (this.f7741i == null ? 0 : this.f7741i.hashCode())) * 31;
            if (this.f7736d != null) {
                i = this.f7736d.hashCode();
            }
            this.f7732A = hashCode + i;
        }
        return this.f7732A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Format(");
        sb.append(this.f7733a);
        sb.append(", ");
        sb.append(this.f7737e);
        sb.append(", ");
        sb.append(this.f7738f);
        sb.append(", ");
        sb.append(this.f7734b);
        sb.append(", ");
        sb.append(this.f7757y);
        sb.append(", [");
        sb.append(this.f7742j);
        sb.append(", ");
        sb.append(this.f7743k);
        sb.append(", ");
        sb.append(this.f7744l);
        sb.append("]");
        sb.append(", [");
        sb.append(this.f7750r);
        sb.append(", ");
        sb.append(this.f7751s);
        sb.append("])");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7733a);
        parcel.writeString(this.f7737e);
        parcel.writeString(this.f7738f);
        parcel.writeString(this.f7735c);
        parcel.writeInt(this.f7734b);
        parcel.writeInt(this.f7739g);
        parcel.writeInt(this.f7742j);
        parcel.writeInt(this.f7743k);
        parcel.writeFloat(this.f7744l);
        parcel.writeInt(this.f7745m);
        parcel.writeFloat(this.f7746n);
        parcel.writeInt(this.f7748p != null ? 1 : 0);
        if (this.f7748p != null) {
            parcel.writeByteArray(this.f7748p);
        }
        parcel.writeInt(this.f7747o);
        parcel.writeParcelable(this.f7749q, i);
        parcel.writeInt(this.f7750r);
        parcel.writeInt(this.f7751s);
        parcel.writeInt(this.f7752t);
        parcel.writeInt(this.f7753u);
        parcel.writeInt(this.f7754v);
        parcel.writeInt(this.f7756x);
        parcel.writeString(this.f7757y);
        parcel.writeInt(this.f7758z);
        parcel.writeLong(this.f7755w);
        int size = this.f7740h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f7740h.get(i2));
        }
        parcel.writeParcelable(this.f7741i, 0);
        parcel.writeParcelable(this.f7736d, 0);
    }
}
