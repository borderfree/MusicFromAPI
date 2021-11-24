package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.internal.measurement.w */
public final class C4501w {

    /* renamed from: a */
    private final Context f16385a;

    /* renamed from: b */
    private final Context f16386b;

    public C4501w(Context context) {
        C3266s.m14913a(context);
        Context applicationContext = context.getApplicationContext();
        C3266s.m14914a(applicationContext, (Object) "Application context can't be null");
        this.f16385a = applicationContext;
        this.f16386b = applicationContext;
    }

    /* renamed from: a */
    public final Context mo14860a() {
        return this.f16385a;
    }

    /* renamed from: b */
    public final Context mo14861b() {
        return this.f16386b;
    }
}
