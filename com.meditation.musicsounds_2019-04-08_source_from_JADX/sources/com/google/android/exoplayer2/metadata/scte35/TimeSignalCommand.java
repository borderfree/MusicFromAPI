package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2509q;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Creator<TimeSignalCommand> CREATOR = new Creator<TimeSignalCommand>() {
        /* renamed from: a */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            TimeSignalCommand timeSignalCommand = new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            return timeSignalCommand;
        }

        /* renamed from: a */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    };

    /* renamed from: a */
    public final long f9262a;

    /* renamed from: b */
    public final long f9263b;

    private TimeSignalCommand(long j, long j2) {
        this.f9262a = j;
        this.f9263b = j2;
    }

    /* renamed from: a */
    static long m12823a(C2500k kVar, long j) {
        long g = (long) kVar.mo8834g();
        if ((128 & g) != 0) {
            return 8589934591L & ((((g & 1) << 32) | kVar.mo8839l()) + j);
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    static TimeSignalCommand m12824a(C2500k kVar, long j, C2509q qVar) {
        long a = m12823a(kVar, j);
        return new TimeSignalCommand(a, qVar.mo8878b(a));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9262a);
        parcel.writeLong(this.f9263b);
    }
}
