package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3021a;
import com.google.android.gms.common.api.C3020a.C3032g;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.internal.C3108c.C3109a;
import com.google.android.gms.internal.location.C4201aa;
import com.google.android.gms.internal.location.C4208ah;
import com.google.android.gms.internal.location.C4209b;
import com.google.android.gms.internal.location.C4226s;

/* renamed from: com.google.android.gms.location.h */
public class C4522h {

    /* renamed from: a */
    public static final C3020a<Object> f16525a = new C3020a<>("LocationServices.API", f16530f, f16529e);
    @Deprecated

    /* renamed from: b */
    public static final C4513a f16526b = new C4208ah();
    @Deprecated

    /* renamed from: c */
    public static final C4517c f16527c = new C4209b();
    @Deprecated

    /* renamed from: d */
    public static final C4525j f16528d = new C4201aa();

    /* renamed from: e */
    private static final C3032g<C4226s> f16529e = new C3032g<>();

    /* renamed from: f */
    private static final C3021a<C4226s, Object> f16530f = new C4529n();

    /* renamed from: com.google.android.gms.location.h$a */
    public static abstract class C4523a<R extends C3049h> extends C3109a<R, C4226s> {
        public C4523a(C3040d dVar) {
            super(C4522h.f16525a, dVar);
        }
    }

    /* renamed from: a */
    public static C4518d m22613a(Context context) {
        return new C4518d(context);
    }
}
