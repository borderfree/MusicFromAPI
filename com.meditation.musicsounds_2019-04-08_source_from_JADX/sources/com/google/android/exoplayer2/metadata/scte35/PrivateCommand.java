package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2500k;

public final class PrivateCommand extends SpliceCommand {
    public static final Creator<PrivateCommand> CREATOR = new Creator<PrivateCommand>() {
        /* renamed from: a */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        /* renamed from: a */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    };

    /* renamed from: a */
    public final long f9229a;

    /* renamed from: b */
    public final long f9230b;

    /* renamed from: c */
    public final byte[] f9231c;

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.f9229a = j2;
        this.f9230b = j;
        this.f9231c = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f9229a = parcel.readLong();
        this.f9230b = parcel.readLong();
        this.f9231c = new byte[parcel.readInt()];
        parcel.readByteArray(this.f9231c);
    }

    /* renamed from: a */
    static PrivateCommand m12800a(C2500k kVar, int i, long j) {
        long l = kVar.mo8839l();
        byte[] bArr = new byte[(i - 4)];
        kVar.mo8823a(bArr, 0, bArr.length);
        PrivateCommand privateCommand = new PrivateCommand(l, bArr, j);
        return privateCommand;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9229a);
        parcel.writeLong(this.f9230b);
        parcel.writeInt(this.f9231c.length);
        parcel.writeByteArray(this.f9231c);
    }
}
