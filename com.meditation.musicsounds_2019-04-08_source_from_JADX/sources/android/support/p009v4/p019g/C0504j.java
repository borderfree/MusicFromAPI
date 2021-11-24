package android.support.p009v4.p019g;

/* renamed from: android.support.v4.g.j */
public class C0504j<F, S> {

    /* renamed from: a */
    public final F f1500a;

    /* renamed from: b */
    public final S f1501b;

    /* renamed from: a */
    private static boolean m2244a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0504j)) {
            return false;
        }
        C0504j jVar = (C0504j) obj;
        if (m2244a(jVar.f1500a, this.f1500a) && m2244a(jVar.f1501b, this.f1501b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f1500a == null ? 0 : this.f1500a.hashCode();
        if (this.f1501b != null) {
            i = this.f1501b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.f1500a));
        sb.append(" ");
        sb.append(String.valueOf(this.f1501b));
        sb.append("}");
        return sb.toString();
    }
}
