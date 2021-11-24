package android.support.design.widget;

import android.support.p009v4.view.C0626s;
import android.view.View;

/* renamed from: android.support.design.widget.s */
class C0213s {

    /* renamed from: a */
    private final View f662a;

    /* renamed from: b */
    private int f663b;

    /* renamed from: c */
    private int f664c;

    /* renamed from: d */
    private int f665d;

    /* renamed from: e */
    private int f666e;

    public C0213s(View view) {
        this.f662a = view;
    }

    /* renamed from: c */
    private void m836c() {
        C0626s.m2860d(this.f662a, this.f665d - (this.f662a.getTop() - this.f663b));
        C0626s.m2862e(this.f662a, this.f666e - (this.f662a.getLeft() - this.f664c));
    }

    /* renamed from: a */
    public void mo947a() {
        this.f663b = this.f662a.getTop();
        this.f664c = this.f662a.getLeft();
        m836c();
    }

    /* renamed from: a */
    public boolean mo948a(int i) {
        if (this.f665d == i) {
            return false;
        }
        this.f665d = i;
        m836c();
        return true;
    }

    /* renamed from: b */
    public int mo949b() {
        return this.f665d;
    }

    /* renamed from: b */
    public boolean mo950b(int i) {
        if (this.f666e == i) {
            return false;
        }
        this.f666e = i;
        m836c();
        return true;
    }
}
