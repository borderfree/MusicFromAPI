package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: android.support.v7.widget.y */
class C1131y implements C0994ab {
    C1131y() {
    }

    /* renamed from: j */
    private C1055ax m6190j(C0993aa aaVar) {
        return (C1055ax) aaVar.mo4022c();
    }

    /* renamed from: a */
    public float mo4931a(C0993aa aaVar) {
        return m6190j(aaVar).mo5245a();
    }

    /* renamed from: a */
    public void mo4932a() {
    }

    /* renamed from: a */
    public void mo4933a(C0993aa aaVar, float f) {
        m6190j(aaVar).mo5246a(f);
    }

    /* renamed from: a */
    public void mo4934a(C0993aa aaVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        aaVar.mo4019a(new C1055ax(colorStateList, f));
        View d = aaVar.mo4023d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo4937b(aaVar, f3);
    }

    /* renamed from: a */
    public void mo4935a(C0993aa aaVar, ColorStateList colorStateList) {
        m6190j(aaVar).mo5248a(colorStateList);
    }

    /* renamed from: b */
    public float mo4936b(C0993aa aaVar) {
        return mo4940d(aaVar) * 2.0f;
    }

    /* renamed from: b */
    public void mo4937b(C0993aa aaVar, float f) {
        m6190j(aaVar).mo5247a(f, aaVar.mo4020a(), aaVar.mo4021b());
        mo5571f(aaVar);
    }

    /* renamed from: c */
    public float mo4938c(C0993aa aaVar) {
        return mo4940d(aaVar) * 2.0f;
    }

    /* renamed from: c */
    public void mo4939c(C0993aa aaVar, float f) {
        aaVar.mo4023d().setElevation(f);
    }

    /* renamed from: d */
    public float mo4940d(C0993aa aaVar) {
        return m6190j(aaVar).mo5249b();
    }

    /* renamed from: e */
    public float mo4941e(C0993aa aaVar) {
        return aaVar.mo4023d().getElevation();
    }

    /* renamed from: f */
    public void mo5571f(C0993aa aaVar) {
        if (!aaVar.mo4020a()) {
            aaVar.mo4018a(0, 0, 0, 0);
            return;
        }
        float a = mo4931a(aaVar);
        float d = mo4940d(aaVar);
        int ceil = (int) Math.ceil((double) C1056ay.m5766b(a, d, aaVar.mo4021b()));
        int ceil2 = (int) Math.ceil((double) C1056ay.m5763a(a, d, aaVar.mo4021b()));
        aaVar.mo4018a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: g */
    public void mo4942g(C0993aa aaVar) {
        mo4937b(aaVar, mo4931a(aaVar));
    }

    /* renamed from: h */
    public void mo4943h(C0993aa aaVar) {
        mo4937b(aaVar, mo4931a(aaVar));
    }

    /* renamed from: i */
    public ColorStateList mo4944i(C0993aa aaVar) {
        return m6190j(aaVar).mo5250c();
    }
}
