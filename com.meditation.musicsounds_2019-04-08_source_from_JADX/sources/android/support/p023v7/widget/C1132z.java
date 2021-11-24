package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: android.support.v7.widget.z */
class C1132z implements C0994ab {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RectF f3928a = new RectF();

    C1132z() {
    }

    /* renamed from: a */
    private C1056ay m6207a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1056ay ayVar = new C1056ay(context.getResources(), colorStateList, f, f2, f3);
        return ayVar;
    }

    /* renamed from: j */
    private C1056ay m6208j(C0993aa aaVar) {
        return (C1056ay) aaVar.mo4022c();
    }

    /* renamed from: a */
    public float mo4931a(C0993aa aaVar) {
        return m6208j(aaVar).mo5268c();
    }

    /* renamed from: a */
    public void mo4932a() {
        C1056ay.f3652a = new C1057a() {
            /* renamed from: a */
            public void mo5281a(Canvas canvas, RectF rectF, float f, Paint paint) {
                Canvas canvas2 = canvas;
                RectF rectF2 = rectF;
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    C1132z.this.f3928a.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                    canvas.drawArc(C1132z.this.f3928a, 180.0f, 90.0f, true, paint);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    Paint paint2 = paint;
                    canvas.drawArc(C1132z.this.f3928a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(height, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(C1132z.this.f3928a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(C1132z.this.f3928a, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.top, (rectF2.right - f3) + 1.0f, rectF2.top + f3, paint);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.bottom - f3, (rectF2.right - f3) + 1.0f, rectF2.bottom, paint);
                }
                canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
            }
        };
    }

    /* renamed from: a */
    public void mo4933a(C0993aa aaVar, float f) {
        m6208j(aaVar).mo5262a(f);
        mo5572f(aaVar);
    }

    /* renamed from: a */
    public void mo4934a(C0993aa aaVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1056ay a = m6207a(context, colorStateList, f, f2, f3);
        a.mo5265a(aaVar.mo4021b());
        aaVar.mo4019a(a);
        mo5572f(aaVar);
    }

    /* renamed from: a */
    public void mo4935a(C0993aa aaVar, ColorStateList colorStateList) {
        m6208j(aaVar).mo5263a(colorStateList);
    }

    /* renamed from: b */
    public float mo4936b(C0993aa aaVar) {
        return m6208j(aaVar).mo5270d();
    }

    /* renamed from: b */
    public void mo4937b(C0993aa aaVar, float f) {
        m6208j(aaVar).mo5269c(f);
        mo5572f(aaVar);
    }

    /* renamed from: c */
    public float mo4938c(C0993aa aaVar) {
        return m6208j(aaVar).mo5272e();
    }

    /* renamed from: c */
    public void mo4939c(C0993aa aaVar, float f) {
        m6208j(aaVar).mo5267b(f);
    }

    /* renamed from: d */
    public float mo4940d(C0993aa aaVar) {
        return m6208j(aaVar).mo5261a();
    }

    /* renamed from: e */
    public float mo4941e(C0993aa aaVar) {
        return m6208j(aaVar).mo5266b();
    }

    /* renamed from: f */
    public void mo5572f(C0993aa aaVar) {
        Rect rect = new Rect();
        m6208j(aaVar).mo5264a(rect);
        aaVar.mo4017a((int) Math.ceil((double) mo4936b(aaVar)), (int) Math.ceil((double) mo4938c(aaVar)));
        aaVar.mo4018a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: g */
    public void mo4942g(C0993aa aaVar) {
    }

    /* renamed from: h */
    public void mo4943h(C0993aa aaVar) {
        m6208j(aaVar).mo5265a(aaVar.mo4021b());
        mo5572f(aaVar);
    }

    /* renamed from: i */
    public ColorStateList mo4944i(C0993aa aaVar) {
        return m6208j(aaVar).mo5273f();
    }
}
