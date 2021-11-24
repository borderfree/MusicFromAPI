package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3020a.C3031f;
import com.google.android.gms.common.internal.C3227d.C3230c;
import com.google.android.gms.common.internal.C3251l;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.aa */
final class C3054aa extends C3061ah {

    /* renamed from: a */
    final /* synthetic */ C3161x f10639a;

    /* renamed from: b */
    private final Map<C3031f, C3163z> f10640b;

    public C3054aa(C3161x xVar, Map<C3031f, C3163z> map) {
        this.f10639a = xVar;
        super(xVar, null);
        this.f10640b = map;
    }

    /* renamed from: a */
    public final void mo10893a() {
        C3251l lVar = new C3251l(this.f10639a.f10921d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C3031f fVar : this.f10640b.keySet()) {
            if (!fVar.mo10819k() || ((C3163z) this.f10640b.get(fVar)).f10942c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = arrayList;
            int size = arrayList3.size();
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                i = lVar.mo11282a(this.f10639a.f10920c, (C3031f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            ArrayList arrayList4 = arrayList2;
            int size2 = arrayList4.size();
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                i = lVar.mo11282a(this.f10639a.f10920c, (C3031f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f10639a.f10918a.mo10922a((C3073at) new C3055ab(this, this.f10639a, new ConnectionResult(i, null)));
            return;
        }
        if (this.f10639a.f10930m) {
            this.f10639a.f10928k.mo15889A();
        }
        for (C3031f fVar2 : this.f10640b.keySet()) {
            C3230c cVar = (C3230c) this.f10640b.get(fVar2);
            if (!fVar2.mo10819k() || lVar.mo11282a(this.f10639a.f10920c, fVar2) == 0) {
                fVar2.mo10811a(cVar);
            } else {
                this.f10639a.f10918a.mo10922a((C3073at) new C3056ac(this, this.f10639a, cVar));
            }
        }
    }
}
