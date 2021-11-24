package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: a */
    public abstract long mo11305a();

    /* renamed from: b */
    public abstract int mo11306b();

    /* renamed from: c */
    public abstract long mo11307c();

    /* renamed from: d */
    public abstract String mo11308d();

    public String toString() {
        long a = mo11305a();
        int b = mo11306b();
        long c = mo11307c();
        String d = mo11308d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 53);
        sb.append(a);
        sb.append("\t");
        sb.append(b);
        sb.append("\t");
        sb.append(c);
        sb.append(d);
        return sb.toString();
    }
}
