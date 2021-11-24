package kankan.wheel.widget;

/* renamed from: kankan.wheel.widget.a */
public class C6690a {

    /* renamed from: a */
    private int f23527a;

    /* renamed from: b */
    private int f23528b;

    public C6690a() {
        this(0, 0);
    }

    public C6690a(int i, int i2) {
        this.f23527a = i;
        this.f23528b = i2;
    }

    /* renamed from: a */
    public int mo20800a() {
        return this.f23527a;
    }

    /* renamed from: a */
    public boolean mo20801a(int i) {
        return i >= mo20800a() && i <= mo20802b();
    }

    /* renamed from: b */
    public int mo20802b() {
        return (mo20800a() + mo20803c()) - 1;
    }

    /* renamed from: c */
    public int mo20803c() {
        return this.f23528b;
    }
}
