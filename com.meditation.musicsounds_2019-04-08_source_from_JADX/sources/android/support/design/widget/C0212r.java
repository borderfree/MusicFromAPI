package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout.C0131b;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.design.widget.r */
class C0212r<V extends View> extends C0131b<V> {

    /* renamed from: a */
    private C0213s f659a;

    /* renamed from: b */
    private int f660b = 0;

    /* renamed from: c */
    private int f661c = 0;

    public C0212r() {
    }

    public C0212r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo406a(int i) {
        if (this.f659a != null) {
            return this.f659a.mo948a(i);
        }
        this.f660b = i;
        return false;
    }

    /* renamed from: a */
    public boolean mo411a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo918b(coordinatorLayout, v, i);
        if (this.f659a == null) {
            this.f659a = new C0213s(v);
        }
        this.f659a.mo947a();
        if (this.f660b != 0) {
            this.f659a.mo948a(this.f660b);
            this.f660b = 0;
        }
        if (this.f661c != 0) {
            this.f659a.mo950b(this.f661c);
            this.f661c = 0;
        }
        return true;
    }

    /* renamed from: b */
    public int mo414b() {
        if (this.f659a != null) {
            return this.f659a.mo949b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo918b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo481a((View) v, i);
    }
}
