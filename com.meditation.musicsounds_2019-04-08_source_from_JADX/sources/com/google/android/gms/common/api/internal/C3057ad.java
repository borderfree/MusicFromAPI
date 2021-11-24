package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3020a.C3031f;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.ad */
final class C3057ad extends C3061ah {

    /* renamed from: a */
    private final ArrayList<C3031f> f10644a;

    /* renamed from: b */
    private final /* synthetic */ C3161x f10645b;

    public C3057ad(C3161x xVar, ArrayList<C3031f> arrayList) {
        this.f10645b = xVar;
        super(xVar, null);
        this.f10644a = arrayList;
    }

    /* renamed from: a */
    public final void mo10893a() {
        this.f10645b.f10918a.f10692d.f10654c = this.f10645b.m14597i();
        ArrayList arrayList = this.f10644a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C3031f) obj).mo10813a(this.f10645b.f10932o, this.f10645b.f10918a.f10692d.f10654c);
        }
    }
}
