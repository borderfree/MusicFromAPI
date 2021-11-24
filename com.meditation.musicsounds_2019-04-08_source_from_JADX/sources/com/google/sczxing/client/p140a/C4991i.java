package com.google.sczxing.client.p140a;

import android.app.Activity;
import com.google.sczxing.client.result.C5009m;
import com.google.sczxing.client.result.C5010n;

/* renamed from: com.google.sczxing.client.a.i */
public final class C4991i {
    /* renamed from: a */
    public static C4990h m24774a(Activity activity, C4988f fVar) {
        C5009m a = m24775a(fVar);
        switch (a.mo16347p()) {
            case ADDRESSBOOK:
                return new C4983a(activity, a);
            case EMAIL_ADDRESS:
                return new C4986d(activity, a);
            case URI:
                return new C4996m(activity, a);
            case GEO:
                return new C4987e(activity, a);
            case TEL:
                return new C4994k(activity, a);
            case SMS:
                return new C4993j(activity, a);
            case CALENDAR:
                return new C4984b(activity, a);
            default:
                return new C4995l(activity, a);
        }
    }

    /* renamed from: a */
    private static C5009m m24775a(C4988f fVar) {
        return C5010n.m24855c(fVar);
    }
}
