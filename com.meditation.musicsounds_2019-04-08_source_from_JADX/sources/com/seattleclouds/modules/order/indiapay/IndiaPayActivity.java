package com.seattleclouds.modules.order.indiapay;

import android.os.Bundle;
import android.support.p009v4.app.C0396q;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6348n;
import com.seattleclouds.modules.order.indiapay.p179b.C5988e;
import com.seattleclouds.modules.order.indiapay.p180c.C5999b;
import com.seattleclouds.modules.order.indiapay.p180c.C6000c;
import com.seattleclouds.modules.order.indiapay.p180c.C6001d;
import com.seattleclouds.util.C6592al;
import java.util.Random;

public class IndiaPayActivity extends C6348n {

    /* renamed from: n */
    private static final String f21175n = "IndiaPayActivity";

    /* renamed from: c */
    private static String m29296c(int i) {
        Random random = new Random();
        char[] cArr = new char[i];
        cArr[0] = (char) (random.nextInt(9) + 49);
        for (int i2 = 1; i2 < i; i2++) {
            cArr[i2] = (char) (random.nextInt(10) + 48);
        }
        return new String(cArr);
    }

    /* renamed from: m */
    private void m29297m() {
        C6000c b = C6001d.m29442a().mo18963b();
        if (b != null) {
            b.mo18928g(m29296c(12));
            StringBuilder sb = new StringBuilder();
            sb.append("ORD");
            sb.append(m29296c(5));
            b.mo18930h(sb.toString());
            b.mo18915b(App.f18524z);
            b.mo18924e(C5999b.f21272j);
            b.mo18916b(true);
            String i = b.mo18931i();
            b.mo18935k(null);
            if (!C6592al.m31909b(i)) {
                try {
                    int parseInt = Integer.parseInt(i);
                    if (parseInt > 0 && parseInt <= 32400) {
                        b.mo18935k(String.valueOf(parseInt));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5460i.activity_indiapay);
        if (bundle == null) {
            m29297m();
            C0396q a = mo1469g().mo1536a();
            a.mo1411a(C5458g.indiaPay_container, new C5988e(), "tag input form");
            a.mo1428c();
        }
    }
}
