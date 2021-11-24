package com.google.android.exoplayer2.p101b;

import com.google.android.exoplayer2.C2711n;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.source.C2740i;

/* renamed from: com.google.android.exoplayer2.b.i */
public final class C2486i {

    /* renamed from: a */
    public final C2740i f8043a;

    /* renamed from: b */
    public final C2483g f8044b;

    /* renamed from: c */
    public final Object f8045c;

    /* renamed from: d */
    public final C2711n[] f8046d;

    public C2486i(C2740i iVar, C2483g gVar, Object obj, C2711n[] nVarArr) {
        this.f8043a = iVar;
        this.f8044b = gVar;
        this.f8045c = obj;
        this.f8046d = nVarArr;
    }

    /* renamed from: a */
    public boolean mo8789a(C2486i iVar) {
        if (iVar == null) {
            return false;
        }
        for (int i = 0; i < this.f8044b.f8039a; i++) {
            if (!mo8790a(iVar, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo8790a(C2486i iVar, int i) {
        boolean z = false;
        if (iVar == null) {
            return false;
        }
        if (C2511s.m11809a((Object) this.f8044b.mo8784a(i), (Object) iVar.f8044b.mo8784a(i)) && C2511s.m11809a((Object) this.f8046d[i], (Object) iVar.f8046d[i])) {
            z = true;
        }
        return z;
    }
}
