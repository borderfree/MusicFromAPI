package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.kn */
public final class C3686kn {

    /* renamed from: a */
    private final String[] f14338a;

    /* renamed from: b */
    private final double[] f14339b;

    /* renamed from: c */
    private final double[] f14340c;

    /* renamed from: d */
    private final int[] f14341d;

    /* renamed from: e */
    private int f14342e;

    private C3686kn(C3689kq kqVar) {
        int size = kqVar.f14349b.size();
        this.f14338a = (String[]) kqVar.f14348a.toArray(new String[size]);
        this.f14339b = m19031a(kqVar.f14349b);
        this.f14340c = m19031a(kqVar.f14350c);
        this.f14341d = new int[size];
        this.f14342e = 0;
    }

    /* renamed from: a */
    private static double[] m19031a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final List<C3688kp> mo13199a() {
        ArrayList arrayList = new ArrayList(this.f14338a.length);
        for (int i = 0; i < this.f14338a.length; i++) {
            String str = this.f14338a[i];
            double d = this.f14340c[i];
            double d2 = this.f14339b[i];
            double d3 = (double) this.f14341d[i];
            double d4 = (double) this.f14342e;
            Double.isNaN(d3);
            Double.isNaN(d4);
            C3688kp kpVar = new C3688kp(str, d, d2, d3 / d4, this.f14341d[i]);
            arrayList.add(kpVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo13200a(double d) {
        this.f14342e++;
        int i = 0;
        while (i < this.f14340c.length) {
            if (this.f14340c[i] <= d && d < this.f14339b[i]) {
                int[] iArr = this.f14341d;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.f14340c[i]) {
                i++;
            } else {
                return;
            }
        }
    }
}
