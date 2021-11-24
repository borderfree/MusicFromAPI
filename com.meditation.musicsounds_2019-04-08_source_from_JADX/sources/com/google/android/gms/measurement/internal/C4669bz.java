package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.measurement.internal.bz */
public final class C4669bz {

    /* renamed from: a */
    final Context f16833a;

    /* renamed from: b */
    String f16834b;

    /* renamed from: c */
    String f16835c;

    /* renamed from: d */
    String f16836d;

    /* renamed from: e */
    boolean f16837e = true;

    /* renamed from: f */
    Boolean f16838f;

    /* renamed from: g */
    C4762m f16839g;

    public C4669bz(Context context, C4762m mVar) {
        C3266s.m14913a(context);
        Context applicationContext = context.getApplicationContext();
        C3266s.m14913a(applicationContext);
        this.f16833a = applicationContext;
        if (mVar != null) {
            this.f16839g = mVar;
            this.f16834b = mVar.f17210f;
            this.f16835c = mVar.f17209e;
            this.f16836d = mVar.f17208d;
            this.f16837e = mVar.f17207c;
            if (mVar.f17211g != null) {
                this.f16838f = Boolean.valueOf(mVar.f17211g.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
