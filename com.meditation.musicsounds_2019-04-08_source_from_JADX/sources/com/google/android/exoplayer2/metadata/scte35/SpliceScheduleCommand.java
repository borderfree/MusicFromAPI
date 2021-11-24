package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Creator<SpliceScheduleCommand> CREATOR = new Creator<SpliceScheduleCommand>() {
        /* renamed from: a */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        /* renamed from: a */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    };

    /* renamed from: a */
    public final List<C2708b> f9248a;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    public static final class C2707a {

        /* renamed from: a */
        public final int f9249a;

        /* renamed from: b */
        public final long f9250b;

        private C2707a(int i, long j) {
            this.f9249a = i;
            this.f9250b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C2707a m12815b(Parcel parcel) {
            return new C2707a(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m12816c(Parcel parcel) {
            parcel.writeInt(this.f9249a);
            parcel.writeLong(this.f9250b);
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C2708b {

        /* renamed from: a */
        public final long f9251a;

        /* renamed from: b */
        public final boolean f9252b;

        /* renamed from: c */
        public final boolean f9253c;

        /* renamed from: d */
        public final boolean f9254d;

        /* renamed from: e */
        public final long f9255e;

        /* renamed from: f */
        public final List<C2707a> f9256f;

        /* renamed from: g */
        public final boolean f9257g;

        /* renamed from: h */
        public final long f9258h;

        /* renamed from: i */
        public final int f9259i;

        /* renamed from: j */
        public final int f9260j;

        /* renamed from: k */
        public final int f9261k;

        private C2708b(long j, boolean z, boolean z2, boolean z3, List<C2707a> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f9251a = j;
            this.f9252b = z;
            this.f9253c = z2;
            this.f9254d = z3;
            this.f9256f = Collections.unmodifiableList(list);
            this.f9255e = j2;
            this.f9257g = z4;
            this.f9258h = j3;
            this.f9259i = i;
            this.f9260j = i2;
            this.f9261k = i3;
        }

        private C2708b(Parcel parcel) {
            this.f9251a = parcel.readLong();
            boolean z = false;
            this.f9252b = parcel.readByte() == 1;
            this.f9253c = parcel.readByte() == 1;
            this.f9254d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C2707a.m12815b(parcel));
            }
            this.f9256f = Collections.unmodifiableList(arrayList);
            this.f9255e = parcel.readLong();
            if (parcel.readByte() == 1) {
                z = true;
            }
            this.f9257g = z;
            this.f9258h = parcel.readLong();
            this.f9259i = parcel.readInt();
            this.f9260j = parcel.readInt();
            this.f9261k = parcel.readInt();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C2708b m12820b(C2500k kVar) {
            boolean z;
            int i;
            int i2;
            int i3;
            long j;
            boolean z2;
            long j2;
            ArrayList arrayList;
            boolean z3;
            long j3;
            boolean z4;
            long l = kVar.mo8839l();
            boolean z5 = (kVar.mo8834g() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int g = kVar.mo8834g();
                boolean z6 = (g & 128) != 0;
                boolean z7 = (g & 64) != 0;
                boolean z8 = (g & 32) != 0;
                long l2 = z7 ? kVar.mo8839l() : -9223372036854775807L;
                if (!z7) {
                    int g2 = kVar.mo8834g();
                    ArrayList arrayList3 = new ArrayList(g2);
                    for (int i4 = 0; i4 < g2; i4++) {
                        arrayList3.add(new C2707a(kVar.mo8834g(), kVar.mo8839l()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long g3 = (long) kVar.mo8834g();
                    z4 = (128 & g3) != 0;
                    j3 = kVar.mo8839l() | ((g3 & 1) << 32);
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int h = kVar.mo8835h();
                int g4 = kVar.mo8834g();
                i = kVar.mo8834g();
                z = z7;
                j2 = l2;
                j = j3;
                arrayList = arrayList2;
                i3 = h;
                i2 = g4;
                z3 = z6;
                z2 = z4;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j2 = -9223372036854775807L;
                z2 = false;
                j = -9223372036854775807L;
                i3 = 0;
                i2 = 0;
                i = 0;
                z = false;
            }
            C2708b bVar = new C2708b(l, z5, z3, z, arrayList, j2, z2, j, i3, i2, i);
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m12821b(Parcel parcel) {
            parcel.writeLong(this.f9251a);
            parcel.writeByte(this.f9252b ? (byte) 1 : 0);
            parcel.writeByte(this.f9253c ? (byte) 1 : 0);
            parcel.writeByte(this.f9254d ? (byte) 1 : 0);
            int size = this.f9256f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((C2707a) this.f9256f.get(i)).m12816c(parcel);
            }
            parcel.writeLong(this.f9255e);
            parcel.writeByte(this.f9257g ? (byte) 1 : 0);
            parcel.writeLong(this.f9258h);
            parcel.writeInt(this.f9259i);
            parcel.writeInt(this.f9260j);
            parcel.writeInt(this.f9261k);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static C2708b m12822c(Parcel parcel) {
            return new C2708b(parcel);
        }
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C2708b.m12822c(parcel));
        }
        this.f9248a = Collections.unmodifiableList(arrayList);
    }

    private SpliceScheduleCommand(List<C2708b> list) {
        this.f9248a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    static SpliceScheduleCommand m12810a(C2500k kVar) {
        int g = kVar.mo8834g();
        ArrayList arrayList = new ArrayList(g);
        for (int i = 0; i < g; i++) {
            arrayList.add(C2708b.m12820b(kVar));
        }
        return new SpliceScheduleCommand((List<C2708b>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f9248a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C2708b) this.f9248a.get(i2)).m12821b(parcel);
        }
    }
}
