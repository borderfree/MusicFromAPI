package android.support.p023v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p009v4.view.p021a.C0583b;
import android.support.p009v4.view.p021a.C0583b.C0586c;
import android.support.p023v7.widget.RecyclerView.C0937i.C0940a;
import android.support.p023v7.widget.RecyclerView.C0942j;
import android.support.p023v7.widget.RecyclerView.C0949p;
import android.support.p023v7.widget.RecyclerView.C0955t;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

/* renamed from: android.support.v7.widget.GridLayoutManager */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    boolean f2921a = false;

    /* renamed from: b */
    int f2922b = -1;

    /* renamed from: c */
    int[] f2923c;

    /* renamed from: d */
    View[] f2924d;

    /* renamed from: e */
    final SparseIntArray f2925e = new SparseIntArray();

    /* renamed from: f */
    final SparseIntArray f2926f = new SparseIntArray();

    /* renamed from: g */
    C0914c f2927g = new C0912a();

    /* renamed from: h */
    final Rect f2928h = new Rect();

    /* renamed from: android.support.v7.widget.GridLayoutManager$a */
    public static final class C0912a extends C0914c {
        /* renamed from: a */
        public int mo4066a(int i) {
            return 1;
        }

        /* renamed from: a */
        public int mo4067a(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$b */
    public static class C0913b extends C0942j {

        /* renamed from: a */
        int f2929a = -1;

        /* renamed from: b */
        int f2930b = 0;

        public C0913b(int i, int i2) {
            super(i, i2);
        }

        public C0913b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0913b(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0913b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        public int mo4068a() {
            return this.f2929a;
        }

        /* renamed from: b */
        public int mo4069b() {
            return this.f2930b;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$c */
    public static abstract class C0914c {

        /* renamed from: a */
        final SparseIntArray f2931a = new SparseIntArray();

        /* renamed from: b */
        private boolean f2932b = false;

        /* renamed from: a */
        public abstract int mo4066a(int i);

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4067a(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo4066a(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f2932b
                if (r2 == 0) goto L_0x0026
                android.util.SparseIntArray r2 = r5.f2931a
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0026
                int r2 = r5.mo4071b(r6)
                if (r2 < 0) goto L_0x0026
                android.util.SparseIntArray r3 = r5.f2931a
                int r3 = r3.get(r2)
                int r4 = r5.mo4066a(r2)
                int r3 = r3 + r4
                goto L_0x0036
            L_0x0026:
                r2 = 0
                r3 = 0
            L_0x0028:
                if (r2 >= r6) goto L_0x0039
                int r4 = r5.mo4066a(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x0033
                r3 = 0
                goto L_0x0036
            L_0x0033:
                if (r3 <= r7) goto L_0x0036
                r3 = r4
            L_0x0036:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0039:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x003d
                return r3
            L_0x003d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.GridLayoutManager.C0914c.mo4067a(int, int):int");
        }

        /* renamed from: a */
        public void mo4070a() {
            this.f2931a.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4071b(int i) {
            int size = this.f2931a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f2931a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.f2931a.size()) {
                return -1;
            }
            return this.f2931a.keyAt(i4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4072b(int i, int i2) {
            if (!this.f2932b) {
                return mo4067a(i, i2);
            }
            int i3 = this.f2931a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = mo4067a(i, i2);
            this.f2931a.put(i, a);
            return a;
        }

        /* renamed from: c */
        public int mo4073c(int i, int i2) {
            int a = mo4066a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int a2 = mo4066a(i5);
                i3 += a2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = a2;
                }
            }
            return i3 + a > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo4048a(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo4048a(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo4048a(m4794a(context, attributeSet, i, i2).f3095b);
    }

    /* renamed from: M */
    private void m4436M() {
        this.f2925e.clear();
        this.f2926f.clear();
    }

    /* renamed from: N */
    private void m4437N() {
        int w = mo4465w();
        for (int i = 0; i < w; i++) {
            C0913b bVar = (C0913b) mo4448i(i).getLayoutParams();
            int f = bVar.mo4478f();
            this.f2925e.put(f, bVar.mo4069b());
            this.f2926f.put(f, bVar.mo4068a());
        }
    }

    /* renamed from: O */
    private void m4438O() {
        int A;
        int C;
        if (mo4100g() == 1) {
            A = mo4468z() - mo4379D();
            C = mo4377B();
        } else {
            A = mo4376A() - mo4380E();
            C = mo4378C();
        }
        m4449m(A - C);
    }

    /* renamed from: P */
    private void m4439P() {
        if (this.f2924d == null || this.f2924d.length != this.f2922b) {
            this.f2924d = new View[this.f2922b];
        }
    }

    /* renamed from: a */
    private int m4440a(C0949p pVar, C0955t tVar, int i) {
        if (!tVar.mo4557a()) {
            return this.f2927g.mo4073c(i, this.f2922b);
        }
        int b = pVar.mo4511b(i);
        if (b != -1) {
            return this.f2927g.mo4073c(b, this.f2922b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: a */
    private void m4441a(float f, int i) {
        m4449m(Math.max(Math.round(f * ((float) this.f2922b)), i));
    }

    /* renamed from: a */
    private void m4442a(C0949p pVar, C0955t tVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = -1;
        int i6 = 0;
        if (z) {
            i5 = i;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View view = this.f2924d[i4];
            C0913b bVar = (C0913b) view.getLayoutParams();
            bVar.f2930b = m4448c(pVar, tVar, mo4431d(view));
            bVar.f2929a = i6;
            i6 += bVar.f2930b;
            i4 += i3;
        }
    }

    /* renamed from: a */
    private void m4443a(View view, int i, int i2, boolean z) {
        C0942j jVar = (C0942j) view.getLayoutParams();
        if (z ? mo4413a(view, i, i2, jVar) : mo4423b(view, i, i2, jVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m4444a(View view, int i, boolean z) {
        int i2;
        int i3;
        C0913b bVar = (C0913b) view.getLayoutParams();
        Rect rect = bVar.f3099d;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int a = mo4040a(bVar.f2929a, bVar.f2930b);
        if (this.f2941i == 1) {
            i2 = m4793a(a, i, i5, bVar.width, false);
            i3 = m4793a(this.f2942j.mo5190f(), mo4467y(), i4, bVar.height, true);
        } else {
            int a2 = m4793a(a, i, i4, bVar.height, false);
            int a3 = m4793a(this.f2942j.mo5190f(), mo4466x(), i5, bVar.width, true);
            i3 = a2;
            i2 = a3;
        }
        m4443a(view, i2, i3, z);
    }

    /* renamed from: a */
    static int[] m4445a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: b */
    private int m4446b(C0949p pVar, C0955t tVar, int i) {
        if (!tVar.mo4557a()) {
            return this.f2927g.mo4072b(i, this.f2922b);
        }
        int i2 = this.f2926f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = pVar.mo4511b(i);
        if (b != -1) {
            return this.f2927g.mo4072b(b, this.f2922b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: b */
    private void m4447b(C0949p pVar, C0955t tVar, C0916a aVar, int i) {
        boolean z = i == 1;
        int b = m4446b(pVar, tVar, aVar.f2952b);
        if (z) {
            while (b > 0 && aVar.f2952b > 0) {
                aVar.f2952b--;
                b = m4446b(pVar, tVar, aVar.f2952b);
            }
            return;
        }
        int e = tVar.mo4561e() - 1;
        int i2 = aVar.f2952b;
        while (i2 < e) {
            int i3 = i2 + 1;
            int b2 = m4446b(pVar, tVar, i3);
            if (b2 <= b) {
                break;
            }
            i2 = i3;
            b = b2;
        }
        aVar.f2952b = i2;
    }

    /* renamed from: c */
    private int m4448c(C0949p pVar, C0955t tVar, int i) {
        if (!tVar.mo4557a()) {
            return this.f2927g.mo4066a(i);
        }
        int i2 = this.f2925e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = pVar.mo4511b(i);
        if (b != -1) {
            return this.f2927g.mo4066a(b);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 1;
    }

    /* renamed from: m */
    private void m4449m(int i) {
        this.f2923c = m4445a(this.f2923c, this.f2922b, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo4040a(int i, int i2) {
        return (this.f2941i != 1 || !mo4103h()) ? this.f2923c[i2 + i] - this.f2923c[i] : this.f2923c[this.f2922b - i] - this.f2923c[(this.f2922b - i) - i2];
    }

    /* renamed from: a */
    public int mo4041a(int i, C0949p pVar, C0955t tVar) {
        m4438O();
        m4439P();
        return super.mo4041a(i, pVar, tVar);
    }

    /* renamed from: a */
    public int mo4042a(C0949p pVar, C0955t tVar) {
        if (this.f2941i == 0) {
            return this.f2922b;
        }
        if (tVar.mo4561e() < 1) {
            return 0;
        }
        return m4440a(pVar, tVar, tVar.mo4561e() - 1) + 1;
    }

    /* renamed from: a */
    public C0942j mo4043a() {
        return this.f2941i == 0 ? new C0913b(-2, -1) : new C0913b(-1, -2);
    }

    /* renamed from: a */
    public C0942j mo4044a(Context context, AttributeSet attributeSet) {
        return new C0913b(context, attributeSet);
    }

    /* renamed from: a */
    public C0942j mo4045a(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new C0913b((MarginLayoutParams) layoutParams) : new C0913b(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4046a(C0949p pVar, C0955t tVar, int i, int i2, int i3) {
        mo4104i();
        int c = this.f2942j.mo5184c();
        int d = this.f2942j.mo5186d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View i5 = mo4448i(i);
            int d2 = mo4431d(i5);
            if (d2 >= 0 && d2 < i3 && m4446b(pVar, tVar, d2) == 0) {
                if (((C0942j) i5.getLayoutParams()).mo4476d()) {
                    if (view2 == null) {
                        view2 = i5;
                    }
                } else if (this.f2942j.mo5179a(i5) < d && this.f2942j.mo5183b(i5) >= c) {
                    return i5;
                } else {
                    if (view == null) {
                        view = i5;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r13 == (r2 > r8)) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f5, code lost:
        if (r13 == r10) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0104  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4047a(android.view.View r26, int r27, android.support.p023v7.widget.RecyclerView.C0949p r28, android.support.p023v7.widget.RecyclerView.C0955t r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r28
            r2 = r29
            android.view.View r3 = r25.mo4435e(r26)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$b r5 = (android.support.p023v7.widget.GridLayoutManager.C0913b) r5
            int r6 = r5.f2929a
            int r7 = r5.f2929a
            int r5 = r5.f2930b
            int r7 = r7 + r5
            android.view.View r5 = super.mo4047a(r26, r27, r28, r29)
            if (r5 != 0) goto L_0x0022
            return r4
        L_0x0022:
            r5 = r27
            int r5 = r0.mo4097f(r5)
            r9 = 1
            if (r5 != r9) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            boolean r10 = r0.f2943k
            if (r5 == r10) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            r10 = -1
            if (r5 == 0) goto L_0x0040
            int r5 = r25.mo4465w()
            int r5 = r5 - r9
            r11 = -1
            r12 = -1
            goto L_0x0047
        L_0x0040:
            int r5 = r25.mo4465w()
            r11 = r5
            r5 = 0
            r12 = 1
        L_0x0047:
            int r13 = r0.f2941i
            if (r13 != r9) goto L_0x0053
            boolean r13 = r25.mo4103h()
            if (r13 == 0) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            int r14 = r0.m4440a(r1, r2, r5)
            r10 = r4
            r8 = -1
            r15 = 0
            r17 = 0
            r18 = -1
        L_0x005f:
            if (r5 == r11) goto L_0x0146
            int r9 = r0.m4440a(r1, r2, r5)
            android.view.View r1 = r0.mo4448i(r5)
            if (r1 != r3) goto L_0x006d
            goto L_0x0146
        L_0x006d:
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x0087
            if (r9 == r14) goto L_0x0087
            if (r4 == 0) goto L_0x0079
            goto L_0x0146
        L_0x0079:
            r21 = r3
            r23 = r8
            r24 = r10
            r22 = r11
            r8 = r17
            r11 = r18
            goto L_0x0132
        L_0x0087:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            android.support.v7.widget.GridLayoutManager$b r9 = (android.support.p023v7.widget.GridLayoutManager.C0913b) r9
            int r2 = r9.f2929a
            r21 = r3
            int r3 = r9.f2929a
            r22 = r11
            int r11 = r9.f2930b
            int r3 = r3 + r11
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00a3
            if (r2 != r6) goto L_0x00a3
            if (r3 != r7) goto L_0x00a3
            return r1
        L_0x00a3:
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x00ab
            if (r4 == 0) goto L_0x00b3
        L_0x00ab:
            boolean r11 = r1.hasFocusable()
            if (r11 != 0) goto L_0x00be
            if (r10 != 0) goto L_0x00be
        L_0x00b3:
            r23 = r8
            r24 = r10
            r8 = r17
        L_0x00b9:
            r11 = r18
        L_0x00bb:
            r19 = 1
            goto L_0x0102
        L_0x00be:
            int r11 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r7)
            int r11 = r20 - r11
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x00db
            if (r11 <= r15) goto L_0x00d1
            goto L_0x00b3
        L_0x00d1:
            if (r11 != r15) goto L_0x00f8
            if (r2 <= r8) goto L_0x00d7
            r11 = 1
            goto L_0x00d8
        L_0x00d7:
            r11 = 0
        L_0x00d8:
            if (r13 != r11) goto L_0x00f8
            goto L_0x00b3
        L_0x00db:
            if (r4 != 0) goto L_0x00f8
            r23 = r8
            r24 = r10
            r8 = 1
            r10 = 0
            boolean r16 = r0.mo4415a(r1, r10, r8)
            if (r16 == 0) goto L_0x00fc
            r8 = r17
            if (r11 <= r8) goto L_0x00ee
            goto L_0x00b9
        L_0x00ee:
            if (r11 != r8) goto L_0x00fe
            r11 = r18
            if (r2 <= r11) goto L_0x00f5
            r10 = 1
        L_0x00f5:
            if (r13 != r10) goto L_0x0100
            goto L_0x00bb
        L_0x00f8:
            r23 = r8
            r24 = r10
        L_0x00fc:
            r8 = r17
        L_0x00fe:
            r11 = r18
        L_0x0100:
            r19 = 0
        L_0x0102:
            if (r19 == 0) goto L_0x0132
            boolean r10 = r1.hasFocusable()
            if (r10 == 0) goto L_0x011f
            int r4 = r9.f2929a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r17 = r8
            r18 = r11
            r10 = r24
            r8 = r4
            r4 = r1
            goto L_0x013a
        L_0x011f:
            int r8 = r9.f2929a
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r17 = r3
            r18 = r8
            r8 = r23
            goto L_0x013a
        L_0x0132:
            r17 = r8
            r18 = r11
            r8 = r23
            r10 = r24
        L_0x013a:
            int r5 = r5 + r12
            r3 = r21
            r11 = r22
            r1 = r28
            r2 = r29
            r9 = 1
            goto L_0x005f
        L_0x0146:
            r24 = r10
            if (r4 == 0) goto L_0x014b
            goto L_0x014d
        L_0x014b:
            r4 = r24
        L_0x014d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.GridLayoutManager.mo4047a(android.view.View, int, android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$t):android.view.View");
    }

    /* renamed from: a */
    public void mo4048a(int i) {
        if (i != this.f2922b) {
            this.f2921a = true;
            if (i >= 1) {
                this.f2922b = i;
                this.f2927g.mo4070a();
                mo4458p();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo4049a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f2923c == null) {
            super.mo4049a(rect, i, i2);
        }
        int B = mo4377B() + mo4379D();
        int C = mo4378C() + mo4380E();
        if (this.f2941i == 1) {
            i4 = m4792a(i2, rect.height() + C, mo4384I());
            i3 = m4792a(i, this.f2923c[this.f2923c.length - 1] + B, mo4383H());
        } else {
            i3 = m4792a(i, rect.width() + B, mo4383H());
            i4 = m4792a(i2, this.f2923c[this.f2923c.length - 1] + C, mo4384I());
        }
        mo4444g(i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4050a(C0949p pVar, C0955t tVar, C0916a aVar, int i) {
        super.mo4050a(pVar, tVar, aVar, i);
        m4438O();
        if (tVar.mo4561e() > 0 && !tVar.mo4557a()) {
            m4447b(pVar, tVar, aVar, i);
        }
        m4439P();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4051a(C0949p pVar, C0955t tVar, C0918c cVar, C0917b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        C0949p pVar2 = pVar;
        C0955t tVar2 = tVar;
        C0918c cVar2 = cVar;
        C0917b bVar2 = bVar;
        int i9 = this.f2942j.mo5194i();
        boolean z2 = i9 != 1073741824;
        int i10 = mo4465w() > 0 ? this.f2923c[this.f2922b] : 0;
        if (z2) {
            m4438O();
        }
        boolean z3 = cVar2.f2964e == 1;
        int i11 = this.f2922b;
        if (!z3) {
            i11 = m4446b(pVar2, tVar2, cVar2.f2963d) + m4448c(pVar2, tVar2, cVar2.f2963d);
        }
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.f2922b && cVar2.mo4129a(tVar2) && i11 > 0) {
            int i14 = cVar2.f2963d;
            int c = m4448c(pVar2, tVar2, i14);
            if (c <= this.f2922b) {
                i11 -= c;
                if (i11 < 0) {
                    break;
                }
                View a = cVar2.mo4126a(pVar2);
                if (a == null) {
                    break;
                }
                i12 += c;
                this.f2924d[i13] = a;
                i13++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(i14);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.f2922b);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i13 == 0) {
            bVar2.f2957b = true;
            return;
        }
        float f = 0.0f;
        int i15 = i13;
        m4442a(pVar, tVar, i13, i12, z3);
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            View view = this.f2924d[i17];
            if (cVar2.f2970k != null) {
                z = false;
                if (z3) {
                    mo4396a(view);
                } else {
                    mo4397a(view, 0);
                }
            } else if (z3) {
                mo4420b(view);
                z = false;
            } else {
                z = false;
                mo4421b(view, 0);
            }
            mo4422b(view, this.f2928h);
            m4444a(view, i9, z);
            int e = this.f2942j.mo5189e(view);
            if (e > i16) {
                i16 = e;
            }
            float f2 = (((float) this.f2942j.mo5191f(view)) * 1.0f) / ((float) ((C0913b) view.getLayoutParams()).f2930b);
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            m4441a(f, i10);
            i16 = 0;
            for (int i18 = 0; i18 < i15; i18++) {
                View view2 = this.f2924d[i18];
                m4444a(view2, 1073741824, true);
                int e2 = this.f2942j.mo5189e(view2);
                if (e2 > i16) {
                    i16 = e2;
                }
            }
        }
        for (int i19 = 0; i19 < i15; i19++) {
            View view3 = this.f2924d[i19];
            if (this.f2942j.mo5189e(view3) != i16) {
                C0913b bVar3 = (C0913b) view3.getLayoutParams();
                Rect rect = bVar3.f3099d;
                int i20 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i21 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int a2 = mo4040a(bVar3.f2929a, bVar3.f2930b);
                if (this.f2941i == 1) {
                    i8 = m4793a(a2, 1073741824, i21, bVar3.width, false);
                    i7 = MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    i7 = m4793a(a2, 1073741824, i20, bVar3.height, false);
                    i8 = makeMeasureSpec;
                }
                m4443a(view3, i8, i7, true);
            }
        }
        int i22 = 0;
        bVar2.f2956a = i16;
        if (this.f2941i == 1) {
            if (cVar2.f2965f == -1) {
                int i23 = cVar2.f2961b;
                i = i23;
                i2 = i23 - i16;
            } else {
                int i24 = cVar2.f2961b;
                i2 = i24;
                i = i16 + i24;
            }
            i4 = 0;
            i3 = 0;
        } else if (cVar2.f2965f == -1) {
            int i25 = cVar2.f2961b;
            i2 = 0;
            i = 0;
            int i26 = i25 - i16;
            i3 = i25;
            i4 = i26;
        } else {
            i4 = cVar2.f2961b;
            i3 = i16 + i4;
            i2 = 0;
            i = 0;
        }
        while (i22 < i15) {
            View view4 = this.f2924d[i22];
            C0913b bVar4 = (C0913b) view4.getLayoutParams();
            if (this.f2941i != 1) {
                i2 = mo4378C() + this.f2923c[bVar4.f2929a];
                i = this.f2942j.mo5191f(view4) + i2;
            } else if (mo4103h()) {
                int B = mo4377B() + this.f2923c[this.f2922b - bVar4.f2929a];
                i5 = B;
                i6 = B - this.f2942j.mo5191f(view4);
                int i27 = i2;
                int i28 = i;
                mo4399a(view4, i6, i27, i5, i28);
                if (!bVar4.mo4476d() || bVar4.mo4477e()) {
                    bVar2.f2958c = true;
                }
                bVar2.f2959d |= view4.hasFocusable();
                i22++;
                i4 = i6;
                i2 = i27;
                i3 = i5;
                i = i28;
            } else {
                i4 = mo4377B() + this.f2923c[bVar4.f2929a];
                i3 = this.f2942j.mo5191f(view4) + i4;
            }
            i6 = i4;
            i5 = i3;
            int i272 = i2;
            int i282 = i;
            mo4399a(view4, i6, i272, i5, i282);
            if (!bVar4.mo4476d()) {
            }
            bVar2.f2958c = true;
            bVar2.f2959d |= view4.hasFocusable();
            i22++;
            i4 = i6;
            i2 = i272;
            i3 = i5;
            i = i282;
        }
        Arrays.fill(this.f2924d, null);
    }

    /* renamed from: a */
    public void mo4052a(C0949p pVar, C0955t tVar, View view, C0583b bVar) {
        int i;
        int a;
        int b;
        boolean z;
        boolean z2;
        int i2;
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0913b)) {
            super.mo4402a(view, bVar);
            return;
        }
        C0913b bVar2 = (C0913b) layoutParams;
        int a2 = m4440a(pVar, tVar, bVar2.mo4478f());
        if (this.f2941i == 0) {
            int a3 = bVar2.mo4068a();
            i = bVar2.mo4069b();
            b = 1;
            z = this.f2922b > 1 && bVar2.mo4069b() == this.f2922b;
            z2 = false;
            i2 = a3;
            a = a2;
        } else {
            i = 1;
            a = bVar2.mo4068a();
            b = bVar2.mo4069b();
            z = this.f2922b > 1 && bVar2.mo4069b() == this.f2922b;
            z2 = false;
            i2 = a2;
        }
        bVar.mo2362b((Object) C0586c.m2697a(i2, i, a, b, z, z2));
    }

    /* renamed from: a */
    public void mo4053a(C0955t tVar) {
        super.mo4053a(tVar);
        this.f2921a = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4054a(C0955t tVar, C0918c cVar, C0940a aVar) {
        int i = this.f2922b;
        for (int i2 = 0; i2 < this.f2922b && cVar.mo4129a(tVar) && i > 0; i2++) {
            int i3 = cVar.f2963d;
            aVar.mo4474b(i3, Math.max(0, cVar.f2966g));
            i -= this.f2927g.mo4066a(i3);
            cVar.f2963d += cVar.f2964e;
        }
    }

    /* renamed from: a */
    public void mo4055a(RecyclerView recyclerView) {
        this.f2927g.mo4070a();
    }

    /* renamed from: a */
    public void mo4056a(RecyclerView recyclerView, int i, int i2) {
        this.f2927g.mo4070a();
    }

    /* renamed from: a */
    public void mo4057a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f2927g.mo4070a();
    }

    /* renamed from: a */
    public void mo4058a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f2927g.mo4070a();
    }

    /* renamed from: a */
    public void mo4059a(boolean z) {
        if (!z) {
            super.mo4059a(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: a */
    public boolean mo4060a(C0942j jVar) {
        return jVar instanceof C0913b;
    }

    /* renamed from: b */
    public int mo4061b(int i, C0949p pVar, C0955t tVar) {
        m4438O();
        m4439P();
        return super.mo4061b(i, pVar, tVar);
    }

    /* renamed from: b */
    public int mo4062b(C0949p pVar, C0955t tVar) {
        if (this.f2941i == 1) {
            return this.f2922b;
        }
        if (tVar.mo4561e() < 1) {
            return 0;
        }
        return m4440a(pVar, tVar, tVar.mo4561e() - 1) + 1;
    }

    /* renamed from: b */
    public void mo4063b(RecyclerView recyclerView, int i, int i2) {
        this.f2927g.mo4070a();
    }

    /* renamed from: b */
    public boolean mo4064b() {
        return this.f2946n == null && !this.f2921a;
    }

    /* renamed from: c */
    public void mo4065c(C0949p pVar, C0955t tVar) {
        if (tVar.mo4557a()) {
            m4437N();
        }
        super.mo4065c(pVar, tVar);
        m4436M();
    }
}
