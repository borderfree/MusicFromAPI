package android.support.p023v7.widget;

import android.graphics.Rect;
import android.support.p023v7.widget.RecyclerView.C0937i;
import android.support.p023v7.widget.RecyclerView.C0942j;
import android.view.View;

/* renamed from: android.support.v7.widget.at */
public abstract class C1047at {

    /* renamed from: a */
    protected final C0937i f3631a;

    /* renamed from: b */
    final Rect f3632b;

    /* renamed from: c */
    private int f3633c;

    private C1047at(C0937i iVar) {
        this.f3633c = Integer.MIN_VALUE;
        this.f3632b = new Rect();
        this.f3631a = iVar;
    }

    /* renamed from: a */
    public static C1047at m5688a(C0937i iVar) {
        return new C1047at(iVar) {
            /* renamed from: a */
            public int mo5179a(View view) {
                return this.f3631a.mo4445h(view) - ((C0942j) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: a */
            public void mo5181a(int i) {
                this.f3631a.mo4450j(i);
            }

            /* renamed from: b */
            public int mo5183b(View view) {
                return this.f3631a.mo4449j(view) + ((C0942j) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: c */
            public int mo5184c() {
                return this.f3631a.mo4377B();
            }

            /* renamed from: c */
            public int mo5185c(View view) {
                this.f3631a.mo4404a(view, true, this.f3632b);
                return this.f3632b.right;
            }

            /* renamed from: d */
            public int mo5186d() {
                return this.f3631a.mo4468z() - this.f3631a.mo4379D();
            }

            /* renamed from: d */
            public int mo5187d(View view) {
                this.f3631a.mo4404a(view, true, this.f3632b);
                return this.f3632b.left;
            }

            /* renamed from: e */
            public int mo5188e() {
                return this.f3631a.mo4468z();
            }

            /* renamed from: e */
            public int mo5189e(View view) {
                C0942j jVar = (C0942j) view.getLayoutParams();
                return this.f3631a.mo4439f(view) + jVar.leftMargin + jVar.rightMargin;
            }

            /* renamed from: f */
            public int mo5190f() {
                return (this.f3631a.mo4468z() - this.f3631a.mo4377B()) - this.f3631a.mo4379D();
            }

            /* renamed from: f */
            public int mo5191f(View view) {
                C0942j jVar = (C0942j) view.getLayoutParams();
                return this.f3631a.mo4442g(view) + jVar.topMargin + jVar.bottomMargin;
            }

            /* renamed from: g */
            public int mo5192g() {
                return this.f3631a.mo4379D();
            }

            /* renamed from: h */
            public int mo5193h() {
                return this.f3631a.mo4466x();
            }

            /* renamed from: i */
            public int mo5194i() {
                return this.f3631a.mo4467y();
            }
        };
    }

    /* renamed from: a */
    public static C1047at m5689a(C0937i iVar, int i) {
        switch (i) {
            case 0:
                return m5688a(iVar);
            case 1:
                return m5690b(iVar);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    /* renamed from: b */
    public static C1047at m5690b(C0937i iVar) {
        return new C1047at(iVar) {
            /* renamed from: a */
            public int mo5179a(View view) {
                return this.f3631a.mo4447i(view) - ((C0942j) view.getLayoutParams()).topMargin;
            }

            /* renamed from: a */
            public void mo5181a(int i) {
                this.f3631a.mo4452k(i);
            }

            /* renamed from: b */
            public int mo5183b(View view) {
                return this.f3631a.mo4451k(view) + ((C0942j) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: c */
            public int mo5184c() {
                return this.f3631a.mo4378C();
            }

            /* renamed from: c */
            public int mo5185c(View view) {
                this.f3631a.mo4404a(view, true, this.f3632b);
                return this.f3632b.bottom;
            }

            /* renamed from: d */
            public int mo5186d() {
                return this.f3631a.mo4376A() - this.f3631a.mo4380E();
            }

            /* renamed from: d */
            public int mo5187d(View view) {
                this.f3631a.mo4404a(view, true, this.f3632b);
                return this.f3632b.top;
            }

            /* renamed from: e */
            public int mo5188e() {
                return this.f3631a.mo4376A();
            }

            /* renamed from: e */
            public int mo5189e(View view) {
                C0942j jVar = (C0942j) view.getLayoutParams();
                return this.f3631a.mo4442g(view) + jVar.topMargin + jVar.bottomMargin;
            }

            /* renamed from: f */
            public int mo5190f() {
                return (this.f3631a.mo4376A() - this.f3631a.mo4378C()) - this.f3631a.mo4380E();
            }

            /* renamed from: f */
            public int mo5191f(View view) {
                C0942j jVar = (C0942j) view.getLayoutParams();
                return this.f3631a.mo4439f(view) + jVar.leftMargin + jVar.rightMargin;
            }

            /* renamed from: g */
            public int mo5192g() {
                return this.f3631a.mo4380E();
            }

            /* renamed from: h */
            public int mo5193h() {
                return this.f3631a.mo4467y();
            }

            /* renamed from: i */
            public int mo5194i() {
                return this.f3631a.mo4466x();
            }
        };
    }

    /* renamed from: a */
    public abstract int mo5179a(View view);

    /* renamed from: a */
    public void mo5180a() {
        this.f3633c = mo5190f();
    }

    /* renamed from: a */
    public abstract void mo5181a(int i);

    /* renamed from: b */
    public int mo5182b() {
        if (Integer.MIN_VALUE == this.f3633c) {
            return 0;
        }
        return mo5190f() - this.f3633c;
    }

    /* renamed from: b */
    public abstract int mo5183b(View view);

    /* renamed from: c */
    public abstract int mo5184c();

    /* renamed from: c */
    public abstract int mo5185c(View view);

    /* renamed from: d */
    public abstract int mo5186d();

    /* renamed from: d */
    public abstract int mo5187d(View view);

    /* renamed from: e */
    public abstract int mo5188e();

    /* renamed from: e */
    public abstract int mo5189e(View view);

    /* renamed from: f */
    public abstract int mo5190f();

    /* renamed from: f */
    public abstract int mo5191f(View view);

    /* renamed from: g */
    public abstract int mo5192g();

    /* renamed from: h */
    public abstract int mo5193h();

    /* renamed from: i */
    public abstract int mo5194i();
}
