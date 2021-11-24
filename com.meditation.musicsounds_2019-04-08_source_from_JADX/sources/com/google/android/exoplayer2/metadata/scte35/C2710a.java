package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.C2682a;
import com.google.android.exoplayer2.metadata.C2685c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.p102c.C2499j;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2509q;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.a */
public final class C2710a implements C2682a {

    /* renamed from: a */
    private final C2500k f9264a = new C2500k();

    /* renamed from: b */
    private final C2499j f9265b = new C2499j();

    /* renamed from: c */
    private C2509q f9266c;

    /* renamed from: a */
    public Metadata mo9191a(C2685c cVar) {
        if (this.f9266c == null || cVar.f9176d != this.f9266c.mo8879c()) {
            this.f9266c = new C2509q(cVar.f7789c);
            this.f9266c.mo8880c(cVar.f7789c - cVar.f9176d);
        }
        ByteBuffer byteBuffer = cVar.f7788b;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f9264a.mo8822a(array, limit);
        this.f9265b.mo8809a(array, limit);
        this.f9265b.mo8812b(39);
        long c = (((long) this.f9265b.mo8814c(1)) << 32) | ((long) this.f9265b.mo8814c(32));
        this.f9265b.mo8812b(20);
        int c2 = this.f9265b.mo8814c(12);
        int c3 = this.f9265b.mo8814c(8);
        Entry entry = null;
        this.f9264a.mo8829d(14);
        if (c3 == 0) {
            entry = new SpliceNullCommand();
        } else if (c3 != 255) {
            switch (c3) {
                case 4:
                    entry = SpliceScheduleCommand.m12810a(this.f9264a);
                    break;
                case 5:
                    entry = SpliceInsertCommand.m12803a(this.f9264a, c, this.f9266c);
                    break;
                case 6:
                    entry = TimeSignalCommand.m12824a(this.f9264a, c, this.f9266c);
                    break;
            }
        } else {
            entry = PrivateCommand.m12800a(this.f9264a, c2, c);
        }
        if (entry == null) {
            return new Metadata(new Entry[0]);
        }
        return new Metadata(entry);
    }
}
