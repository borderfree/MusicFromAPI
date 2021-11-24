package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.C3300e;

/* renamed from: com.google.android.gms.internal.measurement.bi */
public final class C4270bi {

    /* renamed from: a */
    private final long f15801a;

    /* renamed from: b */
    private final int f15802b;

    /* renamed from: c */
    private double f15803c;

    /* renamed from: d */
    private long f15804d;

    /* renamed from: e */
    private final Object f15805e;

    /* renamed from: f */
    private final String f15806f;

    /* renamed from: g */
    private final C3300e f15807g;

    private C4270bi(int i, long j, String str, C3300e eVar) {
        this.f15805e = new Object();
        this.f15802b = 60;
        this.f15803c = (double) this.f15802b;
        this.f15801a = 2000;
        this.f15806f = str;
        this.f15807g = eVar;
    }

    public C4270bi(String str, C3300e eVar) {
        this(60, 2000, str, eVar);
    }

    /* renamed from: a */
    public final boolean mo14177a() {
        synchronized (this.f15805e) {
            long a = this.f15807g.mo11326a();
            if (this.f15803c < ((double) this.f15802b)) {
                double d = (double) (a - this.f15804d);
                double d2 = (double) this.f15801a;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                if (d3 > 0.0d) {
                    this.f15803c = Math.min((double) this.f15802b, this.f15803c + d3);
                }
            }
            this.f15804d = a;
            if (this.f15803c >= 1.0d) {
                this.f15803c -= 1.0d;
                return true;
            }
            String str = this.f15806f;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Excessive ");
            sb.append(str);
            sb.append(" detected; call ignored.");
            C4271bj.m21062a(sb.toString());
            return false;
        }
    }
}
