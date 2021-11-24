package com.google.sczxing.client.p140a;

import android.app.Activity;
import com.google.sczxing.client.result.C5009m;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.google.sczxing.client.a.l */
public final class C4995l extends C4990h {

    /* renamed from: a */
    private static final int[] f17855a = {C5462k.barcode_button_search_book_contents, C5462k.barcode_button_share_by_email, C5462k.barcode_button_share_by_sms};

    public C4995l(Activity activity, C5009m mVar) {
        super(activity, mVar);
    }

    /* renamed from: a */
    public int mo16285a() {
        return f17855a.length;
    }

    /* renamed from: a */
    public int mo16286a(int i) {
        return f17855a[i];
    }

    /* renamed from: b */
    public void mo16288b(int i) {
        String o = mo16308d().mo16330o();
        switch (i) {
            case 0:
                mo16312g(o);
                return;
            case 1:
                mo16294a(o);
                return;
            case 2:
                mo16302b(o);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public int mo16289c() {
        return C5462k.barcode_result_text;
    }
}
