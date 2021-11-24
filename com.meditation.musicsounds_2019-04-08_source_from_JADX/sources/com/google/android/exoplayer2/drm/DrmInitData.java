package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.C2468b;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData implements Parcelable, Comparator<SchemeData> {
    public static final Creator<DrmInitData> CREATOR = new Creator<DrmInitData>() {
        /* renamed from: a */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        /* renamed from: a */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    };

    /* renamed from: a */
    public final int f8137a;

    /* renamed from: b */
    private final SchemeData[] f8138b;

    /* renamed from: c */
    private int f8139c;

    public static final class SchemeData implements Parcelable {
        public static final Creator<SchemeData> CREATOR = new Creator<SchemeData>() {
            /* renamed from: a */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            /* renamed from: a */
            public SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        };

        /* renamed from: a */
        public final String f8140a;

        /* renamed from: b */
        public final byte[] f8141b;

        /* renamed from: c */
        public final boolean f8142c;

        /* renamed from: d */
        private int f8143d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final UUID f8144e;

        SchemeData(Parcel parcel) {
            this.f8144e = new UUID(parcel.readLong(), parcel.readLong());
            this.f8140a = parcel.readString();
            this.f8141b = parcel.createByteArray();
            this.f8142c = parcel.readByte() != 0;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f8144e = (UUID) C2488a.m11664a(uuid);
            this.f8140a = (String) C2488a.m11664a(str);
            this.f8141b = (byte[]) C2488a.m11664a(bArr);
            this.f8142c = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            boolean z = true;
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!this.f8140a.equals(schemeData.f8140a) || !C2511s.m11809a((Object) this.f8144e, (Object) schemeData.f8144e) || !Arrays.equals(this.f8141b, schemeData.f8141b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            if (this.f8143d == 0) {
                this.f8143d = (((this.f8144e.hashCode() * 31) + this.f8140a.hashCode()) * 31) + Arrays.hashCode(this.f8141b);
            }
            return this.f8143d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f8144e.getMostSignificantBits());
            parcel.writeLong(this.f8144e.getLeastSignificantBits());
            parcel.writeString(this.f8140a);
            parcel.writeByteArray(this.f8141b);
            parcel.writeByte(this.f8142c ? (byte) 1 : 0);
        }
    }

    DrmInitData(Parcel parcel) {
        this.f8138b = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.f8137a = this.f8138b.length;
    }

    public DrmInitData(List<SchemeData> list) {
        this(false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    private DrmInitData(boolean z, SchemeData... schemeDataArr) {
        if (z) {
            schemeDataArr = (SchemeData[]) schemeDataArr.clone();
        }
        Arrays.sort(schemeDataArr, this);
        int i = 1;
        while (i < schemeDataArr.length) {
            if (!schemeDataArr[i - 1].f8144e.equals(schemeDataArr[i].f8144e)) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Duplicate data for uuid: ");
                sb.append(schemeDataArr[i].f8144e);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f8138b = schemeDataArr;
        this.f8137a = schemeDataArr.length;
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(true, schemeDataArr);
    }

    /* renamed from: a */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        return C2468b.f7982b.equals(schemeData.f8144e) ? C2468b.f7982b.equals(schemeData2.f8144e) ? 0 : 1 : schemeData.f8144e.compareTo(schemeData2.f8144e);
    }

    /* renamed from: a */
    public SchemeData mo8891a(int i) {
        return this.f8138b[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8138b, ((DrmInitData) obj).f8138b);
    }

    public int hashCode() {
        if (this.f8139c == 0) {
            this.f8139c = Arrays.hashCode(this.f8138b);
        }
        return this.f8139c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f8138b, 0);
    }
}
