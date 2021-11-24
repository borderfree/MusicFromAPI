package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class afl extends afk {
    private afl(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: a */
    public static afl m16116a(String str, Context context, boolean z) {
        m16108a(context, z);
        return new afl(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<Callable<Void>> mo11848a(aga aga, C4110yz yzVar, C4015wb wbVar) {
        if (aga.mo11872c() == null || !this.f11899r) {
            return super.mo11848a(aga, yzVar, wbVar);
        }
        int n = aga.mo11883n();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo11848a(aga, yzVar, wbVar));
        agu agu = new agu(aga, "1QeH3Cf7T53ayw17Ebbo9YTdhU+IFx0X5nCtC5gZQym4uicOVPXxYWmMK9k58i8n", "bHJRpFJ+2R5LAbYQUBDMyfYpLd1oiGixlpIqMJOBQPY=", yzVar, n, 24);
        arrayList.add(agu);
        return arrayList;
    }
}
