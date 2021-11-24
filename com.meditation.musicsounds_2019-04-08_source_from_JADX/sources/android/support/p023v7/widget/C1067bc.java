package android.support.p023v7.widget;

import android.support.p023v7.widget.RecyclerView.C0931f;
import android.support.p023v7.widget.RecyclerView.C0931f.C0934c;
import android.support.p023v7.widget.RecyclerView.C0958w;
import android.view.View;

/* renamed from: android.support.v7.widget.bc */
public abstract class C1067bc extends C0931f {

    /* renamed from: h */
    boolean f3704h = true;

    /* renamed from: a */
    public final void mo5322a(C0958w wVar, boolean z) {
        mo5325d(wVar, z);
        mo4359f(wVar);
    }

    /* renamed from: a */
    public abstract boolean mo5012a(C0958w wVar);

    /* renamed from: a */
    public abstract boolean mo5013a(C0958w wVar, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo4349a(C0958w wVar, C0934c cVar, C0934c cVar2) {
        int i = cVar.f3069a;
        int i2 = cVar.f3070b;
        View view = wVar.f3157a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3069a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3070b;
        if (wVar.mo4597q() || (i == left && i2 == top)) {
            return mo5012a(wVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo5013a(wVar, i, i2, left, top);
    }

    /* renamed from: a */
    public abstract boolean mo5014a(C0958w wVar, C0958w wVar2, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo4350a(C0958w wVar, C0958w wVar2, C0934c cVar, C0934c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3069a;
        int i4 = cVar.f3070b;
        if (wVar2.mo4583c()) {
            int i5 = cVar.f3069a;
            i = cVar.f3070b;
            i2 = i5;
        } else {
            i2 = cVar2.f3069a;
            i = cVar2.f3070b;
        }
        return mo5014a(wVar, wVar2, i3, i4, i2, i);
    }

    /* renamed from: b */
    public final void mo5323b(C0958w wVar, boolean z) {
        mo5324c(wVar, z);
    }

    /* renamed from: b */
    public abstract boolean mo5016b(C0958w wVar);

    /* renamed from: b */
    public boolean mo4353b(C0958w wVar, C0934c cVar, C0934c cVar2) {
        if (cVar == null || (cVar.f3069a == cVar2.f3069a && cVar.f3070b == cVar2.f3070b)) {
            return mo5016b(wVar);
        }
        return mo5013a(wVar, cVar.f3069a, cVar.f3070b, cVar2.f3069a, cVar2.f3070b);
    }

    /* renamed from: c */
    public void mo5324c(C0958w wVar, boolean z) {
    }

    /* renamed from: c */
    public boolean mo4354c(C0958w wVar, C0934c cVar, C0934c cVar2) {
        if (cVar.f3069a == cVar2.f3069a && cVar.f3070b == cVar2.f3070b) {
            mo5327j(wVar);
            return false;
        }
        return mo5013a(wVar, cVar.f3069a, cVar.f3070b, cVar2.f3069a, cVar2.f3070b);
    }

    /* renamed from: d */
    public void mo5325d(C0958w wVar, boolean z) {
    }

    /* renamed from: h */
    public boolean mo4363h(C0958w wVar) {
        return !this.f3704h || wVar.mo4594n();
    }

    /* renamed from: i */
    public final void mo5326i(C0958w wVar) {
        mo5333p(wVar);
        mo4359f(wVar);
    }

    /* renamed from: j */
    public final void mo5327j(C0958w wVar) {
        mo5337t(wVar);
        mo4359f(wVar);
    }

    /* renamed from: k */
    public final void mo5328k(C0958w wVar) {
        mo5335r(wVar);
        mo4359f(wVar);
    }

    /* renamed from: l */
    public final void mo5329l(C0958w wVar) {
        mo5332o(wVar);
    }

    /* renamed from: m */
    public final void mo5330m(C0958w wVar) {
        mo5336s(wVar);
    }

    /* renamed from: n */
    public final void mo5331n(C0958w wVar) {
        mo5334q(wVar);
    }

    /* renamed from: o */
    public void mo5332o(C0958w wVar) {
    }

    /* renamed from: p */
    public void mo5333p(C0958w wVar) {
    }

    /* renamed from: q */
    public void mo5334q(C0958w wVar) {
    }

    /* renamed from: r */
    public void mo5335r(C0958w wVar) {
    }

    /* renamed from: s */
    public void mo5336s(C0958w wVar) {
    }

    /* renamed from: t */
    public void mo5337t(C0958w wVar) {
    }
}
