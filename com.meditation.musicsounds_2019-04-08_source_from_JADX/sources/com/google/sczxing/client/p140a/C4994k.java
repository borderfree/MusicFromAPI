package com.google.sczxing.client.p140a;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import com.google.sczxing.client.result.C5009m;
import com.google.sczxing.client.result.C5014r;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.google.sczxing.client.a.k */
public final class C4994k extends C4990h {

    /* renamed from: a */
    private static final int[] f17854a = {C5462k.barcode_button_dial, C5462k.barcode_button_add_contact};

    public C4994k(Activity activity, C5009m mVar) {
        super(activity, mVar);
    }

    /* renamed from: a */
    public int mo16285a() {
        return f17854a.length;
    }

    /* renamed from: a */
    public int mo16286a(int i) {
        return f17854a[i];
    }

    /* renamed from: b */
    public CharSequence mo16287b() {
        return PhoneNumberUtils.formatNumber(mo16308d().mo16330o().replace("\r", ""));
    }

    /* renamed from: b */
    public void mo16288b(int i) {
        C5014r rVar = (C5014r) mo16308d();
        switch (i) {
            case 0:
                mo16309d(rVar.mo16355b());
                return;
            case 1:
                mo16301a(new String[]{rVar.mo16354a()}, (String[]) null);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public int mo16289c() {
        return C5462k.barcode_result_tel;
    }
}
