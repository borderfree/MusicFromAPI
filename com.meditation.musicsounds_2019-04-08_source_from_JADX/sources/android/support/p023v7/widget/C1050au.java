package android.support.p023v7.widget;

import android.support.p023v7.widget.RecyclerView.C0937i;
import android.support.p023v7.widget.RecyclerView.C0952s.C0953a;
import android.support.p023v7.widget.RecyclerView.C0952s.C0954b;
import android.support.p023v7.widget.RecyclerView.C0955t;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: android.support.v7.widget.au */
public class C1050au extends C1068bd {

    /* renamed from: b */
    private C1047at f3634b;

    /* renamed from: c */
    private C1047at f3635c;

    /* renamed from: a */
    private int m5735a(C0937i iVar, View view, C1047at atVar) {
        return (atVar.mo5179a(view) + (atVar.mo5189e(view) / 2)) - (iVar.mo4461s() ? atVar.mo5184c() + (atVar.mo5190f() / 2) : atVar.mo5188e() / 2);
    }

    /* renamed from: a */
    private View m5736a(C0937i iVar, C1047at atVar) {
        int w = iVar.mo4465w();
        View view = null;
        if (w == 0) {
            return null;
        }
        int c = iVar.mo4461s() ? atVar.mo5184c() + (atVar.mo5190f() / 2) : atVar.mo5188e() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < w; i2++) {
            View i3 = iVar.mo4448i(i2);
            int abs = Math.abs((atVar.mo5179a(i3) + (atVar.mo5189e(i3) / 2)) - c);
            if (abs < i) {
                view = i3;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: b */
    private View m5737b(C0937i iVar, C1047at atVar) {
        int w = iVar.mo4465w();
        View view = null;
        if (w == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < w; i2++) {
            View i3 = iVar.mo4448i(i2);
            int a = atVar.mo5179a(i3);
            if (a < i) {
                view = i3;
                i = a;
            }
        }
        return view;
    }

    /* renamed from: d */
    private C1047at m5738d(C0937i iVar) {
        if (this.f3634b == null || this.f3634b.f3631a != iVar) {
            this.f3634b = C1047at.m5690b(iVar);
        }
        return this.f3634b;
    }

    /* renamed from: e */
    private C1047at m5739e(C0937i iVar) {
        if (this.f3635c == null || this.f3635c.f3631a != iVar) {
            this.f3635c = C1047at.m5688a(iVar);
        }
        return this.f3635c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo5195a(android.support.p023v7.widget.RecyclerView.C0937i r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r6.mo4382G()
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r2 = 0
            boolean r3 = r6.mo4099f()
            if (r3 == 0) goto L_0x0018
            android.support.v7.widget.at r2 = r5.m5738d(r6)
        L_0x0013:
            android.view.View r2 = r5.m5737b(r6, r2)
            goto L_0x0023
        L_0x0018:
            boolean r3 = r6.mo4096e()
            if (r3 == 0) goto L_0x0023
            android.support.v7.widget.at r2 = r5.m5739e(r6)
            goto L_0x0013
        L_0x0023:
            if (r2 != 0) goto L_0x0026
            return r1
        L_0x0026:
            int r2 = r6.mo4431d(r2)
            if (r2 != r1) goto L_0x002d
            return r1
        L_0x002d:
            boolean r1 = r6.mo4096e()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x003b
            if (r7 <= 0) goto L_0x0039
        L_0x0037:
            r7 = 1
            goto L_0x003e
        L_0x0039:
            r7 = 0
            goto L_0x003e
        L_0x003b:
            if (r8 <= 0) goto L_0x0039
            goto L_0x0037
        L_0x003e:
            boolean r8 = r6 instanceof android.support.p023v7.widget.RecyclerView.C0952s.C0954b
            if (r8 == 0) goto L_0x0059
            android.support.v7.widget.RecyclerView$s$b r6 = (android.support.p023v7.widget.RecyclerView.C0952s.C0954b) r6
            int r0 = r0 - r4
            android.graphics.PointF r6 = r6.mo4092d(r0)
            if (r6 == 0) goto L_0x0059
            float r8 = r6.x
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x0058
            float r6 = r6.y
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0059
        L_0x0058:
            r3 = 1
        L_0x0059:
            if (r3 == 0) goto L_0x0060
            if (r7 == 0) goto L_0x0064
            int r2 = r2 + -1
            goto L_0x0064
        L_0x0060:
            if (r7 == 0) goto L_0x0064
            int r2 = r2 + 1
        L_0x0064:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1050au.mo5195a(android.support.v7.widget.RecyclerView$i, int, int):int");
    }

    /* renamed from: a */
    public View mo5196a(C0937i iVar) {
        C1047at e;
        if (iVar.mo4099f()) {
            e = m5738d(iVar);
        } else if (!iVar.mo4096e()) {
            return null;
        } else {
            e = m5739e(iVar);
        }
        return m5736a(iVar, e);
    }

    /* renamed from: a */
    public int[] mo5197a(C0937i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.mo4096e()) {
            iArr[0] = m5735a(iVar, view, m5739e(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo4099f()) {
            iArr[1] = m5735a(iVar, view, m5738d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1033ao mo5198b(C0937i iVar) {
        if (!(iVar instanceof C0954b)) {
            return null;
        }
        return new C1033ao(this.f3705a.getContext()) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public float mo5123a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo4540a(View view, C0955t tVar, C0953a aVar) {
                int[] a = C1050au.this.mo5197a(C1050au.this.f3705a.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int a2 = mo5124a(Math.max(Math.abs(i), Math.abs(i2)));
                if (a2 > 0) {
                    aVar.mo4552a(i, i2, a2, this.f3576b);
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public int mo5128b(int i) {
                return Math.min(100, super.mo5128b(i));
            }
        };
    }
}
