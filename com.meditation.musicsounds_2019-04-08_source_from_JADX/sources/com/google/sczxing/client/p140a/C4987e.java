package com.google.sczxing.client.p140a;

import android.app.Activity;
import com.google.sczxing.client.result.C5007k;
import com.google.sczxing.client.result.C5009m;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.google.sczxing.client.a.e */
public final class C4987e extends C4990h {

    /* renamed from: a */
    private static final int[] f17836a = {C5462k.barcode_button_show_map};

    public C4987e(Activity activity, C5009m mVar) {
        super(activity, mVar);
    }

    /* renamed from: a */
    public int mo16285a() {
        return f17836a.length;
    }

    /* renamed from: a */
    public int mo16286a(int i) {
        return f17836a[i];
    }

    /* renamed from: b */
    public void mo16288b(int i) {
        C5007k kVar = (C5007k) mo16308d();
        if (i == 0) {
            mo16310e(kVar.mo16345a());
        }
    }

    /* renamed from: c */
    public int mo16289c() {
        return C5462k.barcode_result_geo;
    }
}
