package com.facebook.ads.internal.view.hscroll;

import android.content.Context;
import android.graphics.PointF;
import android.support.p023v7.widget.C1033ao;
import android.support.p023v7.widget.LinearLayoutManager;
import android.support.p023v7.widget.RecyclerView.C0937i;
import android.support.p023v7.widget.RecyclerView.C0942j;
import android.support.p023v7.widget.RecyclerView.C0949p;
import android.support.p023v7.widget.RecyclerView.C0955t;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;

public class HScrollLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private final C2109b f6900a;

    /* renamed from: b */
    private final C2108a f6901b;

    /* renamed from: c */
    private final Context f6902c;

    /* renamed from: d */
    private int[] f6903d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f6904e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f6905f = 50.0f;

    /* renamed from: g */
    private C2107a f6906g;

    /* renamed from: h */
    private int f6907h;

    /* renamed from: com.facebook.ads.internal.view.hscroll.HScrollLinearLayoutManager$a */
    private class C2107a extends C1033ao {
        public C2107a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo5123a(DisplayMetrics displayMetrics) {
            return HScrollLinearLayoutManager.this.f6905f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: b */
        public int mo5129b(View view, int i) {
            C0937i e = mo4544e();
            if (!e.mo4096e()) {
                return 0;
            }
            C0942j jVar = (C0942j) view.getLayoutParams();
            return mo5125a(e.mo4445h(view) - jVar.leftMargin, e.mo4449j(view) + jVar.rightMargin, e.mo4377B(), e.mo4468z() - e.mo4379D(), i) + HScrollLinearLayoutManager.this.f6904e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo5130c() {
            return -1;
        }

        /* renamed from: c */
        public PointF mo5131c(int i) {
            return HScrollLinearLayoutManager.this.mo4092d(i);
        }
    }

    public HScrollLinearLayoutManager(Context context, C2109b bVar, C2108a aVar) {
        super(context);
        this.f6902c = context;
        this.f6900a = bVar;
        this.f6901b = aVar;
        this.f6907h = -1;
        this.f6906g = new C2107a(this.f6902c);
    }

    /* renamed from: a */
    public void mo4392a(C0949p pVar, C0955t tVar, int i, int i2) {
        int[] iArr;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if ((mode == 1073741824 && mo4100g() == 1) || (mode2 == 1073741824 && mo4100g() == 0)) {
            super.mo4392a(pVar, tVar, i, i2);
            return;
        }
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (this.f6901b.mo7648b(this.f6907h)) {
            iArr = this.f6901b.mo7647a(this.f6907h);
        } else {
            int[] iArr2 = {0, 0};
            if (tVar.mo4561e() >= 1) {
                int w = mo4465w() > 0 ? 1 : mo4465w();
                for (int i3 = 0; i3 < w; i3++) {
                    this.f6903d = this.f6900a.mo7649a(mo4088c(i3), MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
                    if (mo4100g() == 0) {
                        iArr2[0] = iArr2[0] + this.f6903d[0];
                        if (i3 == 0) {
                            iArr2[1] = this.f6903d[1] + mo4378C() + mo4380E();
                        }
                    } else {
                        iArr2[1] = iArr2[1] + this.f6903d[1];
                        if (i3 == 0) {
                            iArr2[0] = this.f6903d[0] + mo4377B() + mo4379D();
                        }
                    }
                }
                if (this.f6907h != -1) {
                    this.f6901b.mo7646a(this.f6907h, iArr2);
                }
            }
            iArr = iArr2;
        }
        if (mode == 1073741824) {
            iArr[0] = size;
        }
        if (mode2 == 1073741824) {
            iArr[1] = size2;
        }
        mo4444g(iArr[0], iArr[1]);
    }

    /* renamed from: e */
    public void mo4095e(int i) {
        super.mo4084b(i, this.f6904e);
    }
}
