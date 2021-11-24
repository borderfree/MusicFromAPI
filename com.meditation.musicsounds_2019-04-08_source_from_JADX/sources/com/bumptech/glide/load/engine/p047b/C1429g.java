package com.bumptech.glide.load.engine.p047b;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p047b.C1430h.C1431a;
import com.bumptech.glide.p040g.C1254f;

/* renamed from: com.bumptech.glide.load.engine.b.g */
public class C1429g extends C1254f<C1375c, C1482s<?>> implements C1430h {

    /* renamed from: a */
    private C1431a f4762a;

    public C1429g(long j) {
        super(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo5895a(C1482s<?> sVar) {
        return sVar == null ? super.mo5895a(null) : sVar.mo6273e();
    }

    /* renamed from: a */
    public /* synthetic */ C1482s mo6182a(C1375c cVar) {
        return (C1482s) super.mo5902c(cVar);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo6183a(int i) {
        if (i >= 40) {
            mo5896a();
        } else if (i >= 20 || i == 15) {
            mo5897a(mo5899b() / 2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5898a(C1375c cVar, C1482s<?> sVar) {
        if (this.f4762a != null && sVar != null) {
            this.f4762a.mo6188b(sVar);
        }
    }

    /* renamed from: a */
    public void mo6185a(C1431a aVar) {
        this.f4762a = aVar;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ C1482s mo6186b(C1375c cVar, C1482s sVar) {
        return (C1482s) super.mo5901b(cVar, sVar);
    }
}
