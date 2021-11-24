package com.google.sczxing.client.p140a;

import android.app.Activity;
import com.google.sczxing.client.result.C5009m;
import com.google.sczxing.client.result.C5017u;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.google.sczxing.client.a.m */
public final class C4996m extends C4990h {

    /* renamed from: a */
    private static final String[] f17856a = {"otpauth:"};

    /* renamed from: b */
    private static final int[] f17857b = {C5462k.barcode_button_open_browser, C5462k.barcode_button_share_by_email, C5462k.barcode_button_share_by_sms};

    public C4996m(Activity activity, C5009m mVar) {
        super(activity, mVar);
    }

    /* renamed from: a */
    public int mo16285a() {
        return f17857b.length - 1;
    }

    /* renamed from: a */
    public int mo16286a(int i) {
        return f17857b[i];
    }

    /* renamed from: b */
    public void mo16288b(int i) {
        String a = ((C5017u) mo16308d()).mo16357a();
        switch (i) {
            case 0:
                mo16311f(a);
                return;
            case 1:
                mo16294a(a);
                return;
            case 2:
                mo16302b(a);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public int mo16289c() {
        return C5462k.barcode_result_uri;
    }
}
