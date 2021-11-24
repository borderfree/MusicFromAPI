package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.Arrays;

public final class EventMessage implements Entry {
    public static final Creator<EventMessage> CREATOR = new Creator<EventMessage>() {
        /* renamed from: a */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        /* renamed from: a */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    };

    /* renamed from: a */
    public final String f9188a;

    /* renamed from: b */
    public final String f9189b;

    /* renamed from: c */
    public final long f9190c;

    /* renamed from: d */
    public final long f9191d;

    /* renamed from: e */
    public final byte[] f9192e;

    /* renamed from: f */
    private int f9193f;

    EventMessage(Parcel parcel) {
        this.f9188a = parcel.readString();
        this.f9189b = parcel.readString();
        this.f9190c = parcel.readLong();
        this.f9191d = parcel.readLong();
        this.f9192e = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f9188a = str;
        this.f9189b = str2;
        this.f9190c = j;
        this.f9191d = j2;
        this.f9192e = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.f9190c != eventMessage.f9190c || this.f9191d != eventMessage.f9191d || !C2511s.m11809a((Object) this.f9188a, (Object) eventMessage.f9188a) || !C2511s.m11809a((Object) this.f9189b, (Object) eventMessage.f9189b) || !Arrays.equals(this.f9192e, eventMessage.f9192e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f9193f == 0) {
            int i = 0;
            int hashCode = (527 + (this.f9188a != null ? this.f9188a.hashCode() : 0)) * 31;
            if (this.f9189b != null) {
                i = this.f9189b.hashCode();
            }
            this.f9193f = ((((((hashCode + i) * 31) + ((int) (this.f9190c ^ (this.f9190c >>> 32)))) * 31) + ((int) (this.f9191d ^ (this.f9191d >>> 32)))) * 31) + Arrays.hashCode(this.f9192e);
        }
        return this.f9193f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9188a);
        parcel.writeString(this.f9189b);
        parcel.writeLong(this.f9190c);
        parcel.writeLong(this.f9191d);
        parcel.writeByteArray(this.f9192e);
    }
}
