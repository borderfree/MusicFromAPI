package android.support.p023v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.p023v7.widget.RecyclerView.C0937i;
import android.support.p023v7.widget.RecyclerView.C0942j;
import android.support.p023v7.widget.RecyclerView.C0952s;
import android.support.p023v7.widget.RecyclerView.C0952s.C0953a;
import android.support.p023v7.widget.RecyclerView.C0952s.C0954b;
import android.support.p023v7.widget.RecyclerView.C0955t;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.v7.widget.ao */
public class C1033ao extends C0952s {

    /* renamed from: a */
    protected final LinearInterpolator f3575a = new LinearInterpolator();

    /* renamed from: b */
    protected final DecelerateInterpolator f3576b = new DecelerateInterpolator();

    /* renamed from: c */
    protected PointF f3577c;

    /* renamed from: d */
    protected int f3578d = 0;

    /* renamed from: e */
    protected int f3579e = 0;

    /* renamed from: f */
    private final float f3580f;

    public C1033ao(Context context) {
        this.f3580f = mo5123a(context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    private int m5620a(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo5123a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo5124a(int i) {
        double b = (double) mo5128b(i);
        Double.isNaN(b);
        return (int) Math.ceil(b / 0.3356d);
    }

    /* renamed from: a */
    public int mo5125a(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                int i7 = i4 - i2;
                if (i7 < 0) {
                    return i7;
                }
                return 0;
            case 1:
                return i4 - i2;
            default:
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: a */
    public int mo5126a(View view, int i) {
        C0937i e = mo4544e();
        if (e == null || !e.mo4099f()) {
            return 0;
        }
        C0942j jVar = (C0942j) view.getLayoutParams();
        return mo5125a(e.mo4447i(view) - jVar.topMargin, e.mo4451k(view) + jVar.bottomMargin, e.mo4378C(), e.mo4376A() - e.mo4380E(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4536a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4537a(int i, int i2, C0955t tVar, C0953a aVar) {
        if (mo4550j() == 0) {
            mo4546f();
            return;
        }
        this.f3578d = m5620a(this.f3578d, i);
        this.f3579e = m5620a(this.f3579e, i2);
        if (this.f3578d == 0 && this.f3579e == 0) {
            mo5127a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5127a(C0953a aVar) {
        PointF c = mo5131c(mo4549i());
        if (c == null || (c.x == 0.0f && c.y == 0.0f)) {
            aVar.mo4551a(mo4549i());
            mo4546f();
            return;
        }
        mo4538a(c);
        this.f3577c = c;
        this.f3578d = (int) (c.x * 10000.0f);
        this.f3579e = (int) (c.y * 10000.0f);
        aVar.mo4552a((int) (((float) this.f3578d) * 1.2f), (int) (((float) this.f3579e) * 1.2f), (int) (((float) mo5128b(10000)) * 1.2f), this.f3575a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4540a(View view, C0955t tVar, C0953a aVar) {
        int b = mo5129b(view, mo5130c());
        int a = mo5126a(view, mo5132d());
        int a2 = mo5124a((int) Math.sqrt((double) ((b * b) + (a * a))));
        if (a2 > 0) {
            aVar.mo4552a(-b, -a, a2, this.f3576b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo5128b(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.f3580f));
    }

    /* renamed from: b */
    public int mo5129b(View view, int i) {
        C0937i e = mo4544e();
        if (e == null || !e.mo4096e()) {
            return 0;
        }
        C0942j jVar = (C0942j) view.getLayoutParams();
        return mo5125a(e.mo4445h(view) - jVar.leftMargin, e.mo4449j(view) + jVar.rightMargin, e.mo4377B(), e.mo4468z() - e.mo4379D(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4541b() {
        this.f3579e = 0;
        this.f3578d = 0;
        this.f3577c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo5130c() {
        if (this.f3577c == null || this.f3577c.x == 0.0f) {
            return 0;
        }
        return this.f3577c.x > 0.0f ? 1 : -1;
    }

    /* renamed from: c */
    public PointF mo5131c(int i) {
        C0937i e = mo4544e();
        if (e instanceof C0954b) {
            return ((C0954b) e).mo4092d(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
        sb.append(C0954b.class.getCanonicalName());
        Log.w("LinearSmoothScroller", sb.toString());
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo5132d() {
        if (this.f3577c == null || this.f3577c.y == 0.0f) {
            return 0;
        }
        return this.f3577c.y > 0.0f ? 1 : -1;
    }
}
