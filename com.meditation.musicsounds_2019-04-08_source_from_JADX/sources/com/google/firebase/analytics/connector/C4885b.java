package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C4638av;
import com.google.android.gms.measurement.internal.C4762m;
import com.google.firebase.C4879a;
import com.google.firebase.C4890b;
import com.google.firebase.analytics.connector.internal.C4889b;
import com.google.firebase.p134a.C4880a;
import com.google.firebase.p134a.C4883d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.connector.b */
public class C4885b implements C4884a {

    /* renamed from: b */
    private static volatile C4884a f17581b;

    /* renamed from: a */
    final Map<String, Object> f17582a = new ConcurrentHashMap();

    /* renamed from: c */
    private final AppMeasurement f17583c;

    private C4885b(AppMeasurement appMeasurement) {
        C3266s.m14913a(appMeasurement);
        this.f17583c = appMeasurement;
    }

    /* renamed from: a */
    public static C4884a m24396a(C4890b bVar, Context context, C4883d dVar) {
        C3266s.m14913a(bVar);
        C3266s.m14913a(context);
        C3266s.m14913a(dVar);
        C3266s.m14913a(context.getApplicationContext());
        if (f17581b == null) {
            synchronized (C4885b.class) {
                if (f17581b == null) {
                    Bundle bundle = new Bundle(1);
                    if (bVar.mo16101f()) {
                        dVar.mo16086a(C4879a.class, C4886c.f17584a, C4887d.f17585a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", bVar.mo16099e());
                    }
                    f17581b = new C4885b(C4638av.m23035a(context, C4762m.m23862a(bundle)).mo15342i());
                }
            }
        }
        return f17581b;
    }

    /* renamed from: a */
    static final /* synthetic */ void m24397a(C4880a aVar) {
        boolean z = ((C4879a) aVar.mo16082b()).f17575a;
        synchronized (C4885b.class) {
            ((C4885b) f17581b).f17583c.mo15196a(z);
        }
    }

    /* renamed from: a */
    public void mo16090a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C4889b.m24402a(str) && C4889b.m24403a(str2, bundle) && C4889b.m24405a(str, str2, bundle)) {
            this.f17583c.logEventInternal(str, str2, bundle);
        }
    }

    /* renamed from: a */
    public void mo16091a(String str, String str2, Object obj) {
        if (C4889b.m24402a(str) && C4889b.m24404a(str, str2)) {
            this.f17583c.mo15195a(str, str2, obj);
        }
    }
}
