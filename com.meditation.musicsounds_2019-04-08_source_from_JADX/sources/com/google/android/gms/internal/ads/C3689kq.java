package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kq */
public final class C3689kq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<String> f14348a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<Double> f14349b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Double> f14350c = new ArrayList();

    /* renamed from: a */
    public final C3686kn mo13204a() {
        return new C3686kn(this);
    }

    /* renamed from: a */
    public final C3689kq mo13205a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f14348a.size()) {
            double doubleValue = ((Double) this.f14350c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.f14349b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f14348a.add(i, str);
        this.f14350c.add(i, Double.valueOf(d));
        this.f14349b.add(i, Double.valueOf(d2));
        return this;
    }
}
