package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C3177d;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.api.C3020a.C3031f;

/* renamed from: com.google.android.gms.common.internal.l */
public class C3251l {

    /* renamed from: a */
    private final SparseIntArray f11112a;

    /* renamed from: b */
    private C3182e f11113b;

    public C3251l() {
        this(C3177d.m14629a());
    }

    public C3251l(C3182e eVar) {
        this.f11112a = new SparseIntArray();
        C3266s.m14913a(eVar);
        this.f11113b = eVar;
    }

    /* renamed from: a */
    public int mo11282a(Context context, C3031f fVar) {
        C3266s.m14913a(context);
        C3266s.m14913a(fVar);
        if (!fVar.mo10819k()) {
            return 0;
        }
        int f = fVar.mo10738f();
        int i = this.f11112a.get(f, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f11112a.size()) {
                break;
            }
            int keyAt = this.f11112a.keyAt(i2);
            if (keyAt > f && this.f11112a.get(keyAt) == 0) {
                i = 0;
                break;
            }
            i2++;
        }
        if (i == -1) {
            i = this.f11113b.mo11117b(context, f);
        }
        this.f11112a.put(f, i);
        return i;
    }

    /* renamed from: a */
    public void mo11283a() {
        this.f11112a.clear();
    }
}
