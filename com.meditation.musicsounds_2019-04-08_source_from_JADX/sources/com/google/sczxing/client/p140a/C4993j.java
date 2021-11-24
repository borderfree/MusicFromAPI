package com.google.sczxing.client.p140a;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import com.google.sczxing.client.result.C5009m;
import com.google.sczxing.client.result.C5012p;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.google.sczxing.client.a.j */
public final class C4993j extends C4990h {

    /* renamed from: a */
    private static final int[] f17853a = {C5462k.barcode_button_sms, C5462k.barcode_button_mms};

    public C4993j(Activity activity, C5009m mVar) {
        super(activity, mVar);
    }

    /* renamed from: a */
    public int mo16285a() {
        return f17853a.length;
    }

    /* renamed from: a */
    public int mo16286a(int i) {
        return f17853a[i];
    }

    /* renamed from: b */
    public CharSequence mo16287b() {
        C5012p pVar = (C5012p) mo16308d();
        StringBuilder sb = new StringBuilder(50);
        String[] a = pVar.mo16350a();
        String[] strArr = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            strArr[i] = PhoneNumberUtils.formatNumber(a[i]);
        }
        C5009m.m24846a(strArr, sb);
        C5009m.m24845a(pVar.mo16351b(), sb);
        C5009m.m24845a(pVar.mo16352c(), sb);
        return sb.toString();
    }

    /* renamed from: b */
    public void mo16288b(int i) {
        C5012p pVar = (C5012p) mo16308d();
        switch (i) {
            case 0:
                mo16296a(pVar.mo16350a()[0], pVar.mo16352c());
                return;
            case 1:
                mo16304b(pVar.mo16350a()[0], pVar.mo16351b(), pVar.mo16352c());
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public int mo16289c() {
        return C5462k.barcode_result_sms;
    }
}
