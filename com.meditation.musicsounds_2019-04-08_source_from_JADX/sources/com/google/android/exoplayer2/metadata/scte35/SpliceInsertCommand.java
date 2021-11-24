package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2509q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Creator<SpliceInsertCommand> CREATOR = new Creator<SpliceInsertCommand>() {
        /* renamed from: a */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* renamed from: a */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    };

    /* renamed from: a */
    public final long f9232a;

    /* renamed from: b */
    public final boolean f9233b;

    /* renamed from: c */
    public final boolean f9234c;

    /* renamed from: d */
    public final boolean f9235d;

    /* renamed from: e */
    public final boolean f9236e;

    /* renamed from: f */
    public final long f9237f;

    /* renamed from: g */
    public final long f9238g;

    /* renamed from: h */
    public final List<C2704a> f9239h;

    /* renamed from: i */
    public final boolean f9240i;

    /* renamed from: j */
    public final long f9241j;

    /* renamed from: k */
    public final int f9242k;

    /* renamed from: l */
    public final int f9243l;

    /* renamed from: m */
    public final int f9244m;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public static final class C2704a {

        /* renamed from: a */
        public final int f9245a;

        /* renamed from: b */
        public final long f9246b;

        /* renamed from: c */
        public final long f9247c;

        private C2704a(int i, long j, long j2) {
            this.f9245a = i;
            this.f9246b = j;
            this.f9247c = j2;
        }

        /* renamed from: b */
        public static C2704a m12806b(Parcel parcel) {
            C2704a aVar = new C2704a(parcel.readInt(), parcel.readLong(), parcel.readLong());
            return aVar;
        }

        /* renamed from: a */
        public void mo9280a(Parcel parcel) {
            parcel.writeInt(this.f9245a);
            parcel.writeLong(this.f9246b);
            parcel.writeLong(this.f9247c);
        }
    }

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C2704a> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f9232a = j;
        this.f9233b = z;
        this.f9234c = z2;
        this.f9235d = z3;
        this.f9236e = z4;
        this.f9237f = j2;
        this.f9238g = j3;
        this.f9239h = Collections.unmodifiableList(list);
        this.f9240i = z5;
        this.f9241j = j4;
        this.f9242k = i;
        this.f9243l = i2;
        this.f9244m = i3;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f9232a = parcel.readLong();
        boolean z = false;
        this.f9233b = parcel.readByte() == 1;
        this.f9234c = parcel.readByte() == 1;
        this.f9235d = parcel.readByte() == 1;
        this.f9236e = parcel.readByte() == 1;
        this.f9237f = parcel.readLong();
        this.f9238g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C2704a.m12806b(parcel));
        }
        this.f9239h = Collections.unmodifiableList(arrayList);
        if (parcel.readByte() == 1) {
            z = true;
        }
        this.f9240i = z;
        this.f9241j = parcel.readLong();
        this.f9242k = parcel.readInt();
        this.f9243l = parcel.readInt();
        this.f9244m = parcel.readInt();
    }

    /* renamed from: a */
    static SpliceInsertCommand m12803a(C2500k kVar, long j, C2509q qVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        List list2;
        boolean z5;
        long j4;
        C2509q qVar2 = qVar;
        long l = kVar.mo8839l();
        boolean z6 = (kVar.mo8834g() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int g = kVar.mo8834g();
            boolean z7 = (g & 128) != 0;
            boolean z8 = (g & 64) != 0;
            boolean z9 = (g & 32) != 0;
            boolean z10 = (g & 16) != 0;
            long a = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.m12823a(kVar, j);
            if (!z8) {
                int g2 = kVar.mo8834g();
                list2 = new ArrayList(g2);
                for (int i4 = 0; i4 < g2; i4++) {
                    int g3 = kVar.mo8834g();
                    long a2 = !z10 ? TimeSignalCommand.m12823a(kVar, j) : -9223372036854775807L;
                    C2704a aVar = new C2704a(g3, a2, qVar2.mo8878b(a2));
                    list2.add(aVar);
                }
            } else {
                list2 = emptyList;
            }
            if (z9) {
                long g4 = (long) kVar.mo8834g();
                z5 = (128 & g4) != 0;
                j4 = kVar.mo8839l() | ((g4 & 1) << 32);
            } else {
                j4 = -9223372036854775807L;
                z5 = false;
            }
            i3 = kVar.mo8835h();
            i2 = kVar.mo8834g();
            i = kVar.mo8834g();
            z4 = z7;
            list = list2;
            long j5 = j4;
            z3 = z10;
            j3 = a;
            z2 = z5;
            j2 = j5;
            z = z8;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        SpliceInsertCommand spliceInsertCommand = new SpliceInsertCommand(l, z6, z4, z, z3, j3, qVar2.mo8878b(j3), list, z2, j2, i3, i2, i);
        return spliceInsertCommand;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9232a);
        parcel.writeByte(this.f9233b ? (byte) 1 : 0);
        parcel.writeByte(this.f9234c ? (byte) 1 : 0);
        parcel.writeByte(this.f9235d ? (byte) 1 : 0);
        parcel.writeByte(this.f9236e ? (byte) 1 : 0);
        parcel.writeLong(this.f9237f);
        parcel.writeLong(this.f9238g);
        int size = this.f9239h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C2704a) this.f9239h.get(i2)).mo9280a(parcel);
        }
        parcel.writeByte(this.f9240i ? (byte) 1 : 0);
        parcel.writeLong(this.f9241j);
        parcel.writeInt(this.f9242k);
        parcel.writeInt(this.f9243l);
        parcel.writeInt(this.f9244m);
    }
}
