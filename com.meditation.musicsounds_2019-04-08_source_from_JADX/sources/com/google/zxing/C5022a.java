package com.google.zxing;

/* renamed from: com.google.zxing.a */
public final class C5022a {

    /* renamed from: a */
    private final int f17921a;

    /* renamed from: b */
    private final int f17922b;

    /* renamed from: a */
    public int mo16363a() {
        return this.f17921a;
    }

    /* renamed from: b */
    public int mo16364b() {
        return this.f17922b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5022a) {
            C5022a aVar = (C5022a) obj;
            if (this.f17921a == aVar.f17921a && this.f17922b == aVar.f17922b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f17921a * 32713) + this.f17922b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17921a);
        sb.append("x");
        sb.append(this.f17922b);
        return sb.toString();
    }
}
