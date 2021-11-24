package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.C3037c;
import com.google.android.gms.common.api.internal.C3053a;
import com.google.android.gms.common.api.internal.C3149l;
import com.google.android.gms.common.internal.C3263r;
import com.google.android.gms.tasks.C4796f;

/* renamed from: com.google.android.gms.location.d */
public class C4518d extends C3037c<Object> {
    public C4518d(Context context) {
        super(context, C4522h.f16525a, null, (C3149l) new C3053a());
    }

    /* renamed from: a */
    public C4796f<Void> mo14978a(PendingIntent pendingIntent) {
        return C3263r.m14908a(C4522h.f16527c.mo14055a(mo10833d(), pendingIntent));
    }

    /* renamed from: a */
    public C4796f<Void> mo14979a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return C3263r.m14908a(C4522h.f16527c.mo14056a(mo10833d(), geofencingRequest, pendingIntent));
    }
}
