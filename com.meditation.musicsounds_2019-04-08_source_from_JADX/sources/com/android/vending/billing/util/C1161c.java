package com.android.vending.billing.util;

/* renamed from: com.android.vending.billing.util.c */
public class C1161c {

    /* renamed from: a */
    int f4180a;

    /* renamed from: b */
    String f4181b;

    public C1161c(int i, String str) {
        String str2;
        this.f4180a = i;
        if (str == null || str.trim().length() == 0) {
            str2 = C1149b.m6254a(i);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (response: ");
            sb.append(C1149b.m6254a(i));
            sb.append(")");
            str2 = sb.toString();
        }
        this.f4181b = str2;
    }

    /* renamed from: a */
    public int mo5631a() {
        return this.f4180a;
    }

    /* renamed from: b */
    public String mo5632b() {
        return this.f4181b;
    }

    /* renamed from: c */
    public boolean mo5633c() {
        return this.f4180a == 0;
    }

    /* renamed from: d */
    public boolean mo5634d() {
        return !mo5633c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IabResult: ");
        sb.append(mo5632b());
        return sb.toString();
    }
}
