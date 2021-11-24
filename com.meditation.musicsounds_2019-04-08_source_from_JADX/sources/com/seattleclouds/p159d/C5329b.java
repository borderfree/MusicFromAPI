package com.seattleclouds.p159d;

/* renamed from: com.seattleclouds.d.b */
public class C5329b {

    /* renamed from: a */
    private String f19102a = "undefined";

    /* renamed from: b */
    private double f19103b = 0.0d;

    /* renamed from: a */
    public void mo17506a(double d) {
        this.f19103b = d;
    }

    /* renamed from: a */
    public void mo17507a(String str) {
        this.f19102a = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C5329b bVar = (C5329b) C5329b.class.cast(obj);
        return this.f19102a.compareTo(bVar.f19102a) == 0 && this.f19103b == bVar.f19103b;
    }

    /* renamed from: h */
    public String mo17509h() {
        return this.f19102a;
    }

    public int hashCode() {
        return this.f19102a.hashCode() + ((int) this.f19103b);
    }

    /* renamed from: i */
    public double mo17511i() {
        return this.f19103b;
    }
}
