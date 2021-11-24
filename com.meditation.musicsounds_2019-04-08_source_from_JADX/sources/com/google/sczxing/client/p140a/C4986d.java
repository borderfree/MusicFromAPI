package com.google.sczxing.client.p140a;

import android.app.Activity;
import com.google.sczxing.client.result.C5004h;
import com.google.sczxing.client.result.C5009m;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.google.sczxing.client.a.d */
public final class C4986d extends C4990h {

    /* renamed from: a */
    private static final int[] f17835a = {C5462k.barcode_button_email, C5462k.barcode_button_add_contact};

    public C4986d(Activity activity, C5009m mVar) {
        super(activity, mVar);
    }

    /* renamed from: a */
    public int mo16285a() {
        return f17835a.length;
    }

    /* renamed from: a */
    public int mo16286a(int i) {
        return f17835a[i];
    }

    /* renamed from: b */
    public void mo16288b(int i) {
        C5004h hVar = (C5004h) mo16308d();
        switch (i) {
            case 0:
                mo16298a(hVar.mo16342d(), hVar.mo16339a(), hVar.mo16340b(), hVar.mo16341c());
                return;
            case 1:
                mo16305b(new String[]{hVar.mo16339a()}, (String[]) null);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public int mo16289c() {
        return C5462k.barcode_result_email_address;
    }
}
