package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.C0604d;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v7.widget.an */
public class C1031an extends ViewGroup {

    /* renamed from: a */
    private boolean f3558a;

    /* renamed from: b */
    private int f3559b;

    /* renamed from: c */
    private int f3560c;

    /* renamed from: d */
    private int f3561d;

    /* renamed from: e */
    private int f3562e;

    /* renamed from: f */
    private int f3563f;

    /* renamed from: g */
    private float f3564g;

    /* renamed from: h */
    private boolean f3565h;

    /* renamed from: i */
    private int[] f3566i;

    /* renamed from: j */
    private int[] f3567j;

    /* renamed from: k */
    private Drawable f3568k;

    /* renamed from: l */
    private int f3569l;

    /* renamed from: m */
    private int f3570m;

    /* renamed from: n */
    private int f3571n;

    /* renamed from: o */
    private int f3572o;

    /* renamed from: android.support.v7.widget.an$a */
    public static class C1032a extends MarginLayoutParams {

        /* renamed from: g */
        public float f3573g;

        /* renamed from: h */
        public int f3574h;

        public C1032a(int i, int i2) {
            super(i, i2);
            this.f3574h = -1;
            this.f3573g = 0.0f;
        }

        public C1032a(int i, int i2, float f) {
            super(i, i2);
            this.f3574h = -1;
            this.f3573g = f;
        }

        public C1032a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3574h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736j.LinearLayoutCompat_Layout);
            this.f3573g = obtainStyledAttributes.getFloat(C0736j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f3574h = obtainStyledAttributes.getInt(C0736j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C1032a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f3574h = -1;
        }
    }

    public C1031an(Context context) {
        this(context, null);
    }

    public C1031an(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1031an(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3558a = true;
        this.f3559b = -1;
        this.f3560c = 0;
        this.f3562e = 8388659;
        C1078bk a = C1078bk.m5881a(context, attributeSet, C0736j.LinearLayoutCompat, i, 0);
        int a2 = a.mo5355a(C0736j.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo5355a(C0736j.LinearLayoutCompat_android_gravity, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo5359a(C0736j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f3564g = a.mo5354a(C0736j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f3559b = a.mo5355a(C0736j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f3565h = a.mo5359a(C0736j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo5357a(C0736j.LinearLayoutCompat_divider));
        this.f3571n = a.mo5355a(C0736j.LinearLayoutCompat_showDividers, 0);
        this.f3572o = a.mo5366e(C0736j.LinearLayoutCompat_dividerPadding, 0);
        a.mo5358a();
    }

    /* renamed from: a */
    private void m5599a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: c */
    private void m5600c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo5091b(i3);
            if (b.getVisibility() != 8) {
                C1032a aVar = (C1032a) b.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m5601d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo5091b(i3);
            if (b.getVisibility() != 8) {
                C1032a aVar = (C1032a) b.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5083a(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5084a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02dd, code lost:
        if (r15 > 0) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e8, code lost:
        if (r15 < 0) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ea, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02eb, code lost:
        r13.measure(r9, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & -256);
        r9 = r34;
        r10 = r35;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x032a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5085a(int r41, int r42) {
        /*
            r40 = this;
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = 0
            r7.f3563f = r10
            int r11 = r40.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r41)
            int r13 = android.view.View.MeasureSpec.getMode(r42)
            int r14 = r7.f3559b
            boolean r15 = r7.f3565h
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x019d
            android.view.View r4 = r7.mo5091b(r6)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.f3563f
            int r10 = r7.mo5097d(r6)
            int r4 = r4 + r10
            r7.f3563f = r4
            r32 = r11
            r31 = r13
            r4 = r22
            goto L_0x0191
        L_0x0047:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005e
            int r1 = r7.mo5084a(r4, r6)
            int r6 = r6 + r1
            r32 = r11
            r31 = r13
            r4 = r22
            r1 = r24
            goto L_0x0191
        L_0x005e:
            boolean r1 = r7.mo5096c(r6)
            if (r1 == 0) goto L_0x006b
            int r1 = r7.f3563f
            int r10 = r7.f3570m
            int r1 = r1 + r10
            r7.f3563f = r1
        L_0x006b:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            android.support.v7.widget.an$a r10 = (android.support.p023v7.widget.C1031an.C1032a) r10
            float r1 = r10.f3573g
            float r25 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00a7
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a7
            float r0 = r10.f3573g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a7
            int r0 = r7.f3563f
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f3563f = r0
            r0 = r3
            r3 = r4
            r33 = r5
            r32 = r11
            r31 = r13
            r13 = r22
            r8 = r24
            r29 = r26
            r18 = 1
            r11 = r6
            goto L_0x0117
        L_0x00a7:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b8
            float r0 = r10.f3573g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b8
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00ba
        L_0x00b8:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00ba:
            r23 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c5
            int r0 = r7.f3563f
            r27 = r0
            goto L_0x00c7
        L_0x00c5:
            r27 = 0
        L_0x00c7:
            r0 = r40
            r8 = r24
            r24 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r28 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r41
            r30 = r4
            r32 = r11
            r31 = r13
            r13 = r22
            r11 = 1073741824(0x40000000, float:2.0)
            r4 = r23
            r33 = r5
            r5 = r42
            r11 = r6
            r6 = r27
            r0.mo5089a(r1, r2, r3, r4, r5, r6)
            r0 = r28
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f4
            r10.height = r0
        L_0x00f4:
            int r0 = r30.getMeasuredHeight()
            int r1 = r7.f3563f
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r30
            int r4 = r7.mo5090b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f3563f = r1
            if (r15 == 0) goto L_0x0116
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0117
        L_0x0116:
            r0 = r9
        L_0x0117:
            if (r14 < 0) goto L_0x0121
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x0121
            int r1 = r7.f3563f
            r7.f3560c = r1
        L_0x0121:
            if (r11 >= r14) goto L_0x0132
            float r1 = r10.f3573g
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x012a
            goto L_0x0132
        L_0x012a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0132:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x013f
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x013f
            r1 = 1
            r20 = 1
            goto L_0x0140
        L_0x013f:
            r1 = 0
        L_0x0140:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0161
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0161
            r8 = 1
            goto L_0x0162
        L_0x0161:
            r8 = 0
        L_0x0162:
            float r9 = r10.f3573g
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0174
            if (r1 == 0) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r2 = r4
        L_0x016c:
            int r4 = java.lang.Math.max(r13, r2)
            r13 = r4
            r1 = r33
            goto L_0x017f
        L_0x0174:
            if (r1 == 0) goto L_0x0179
        L_0x0176:
            r1 = r33
            goto L_0x017b
        L_0x0179:
            r2 = r4
            goto L_0x0176
        L_0x017b:
            int r1 = java.lang.Math.max(r1, r2)
        L_0x017f:
            int r2 = r7.mo5084a(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r19 = r8
            r4 = r13
            r0 = r25
            r39 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r39
        L_0x0191:
            int r6 = r6 + 1
            r13 = r31
            r11 = r32
            r8 = r41
            r9 = r42
            goto L_0x002a
        L_0x019d:
            r8 = r1
            r9 = r3
            r1 = r5
            r32 = r11
            r31 = r13
            r13 = r22
            r5 = r2
            int r2 = r7.f3563f
            if (r2 <= 0) goto L_0x01bb
            r2 = r32
            boolean r3 = r7.mo5096c(r2)
            if (r3 == 0) goto L_0x01bd
            int r3 = r7.f3563f
            int r4 = r7.f3570m
            int r3 = r3 + r4
            r7.f3563f = r3
            goto L_0x01bd
        L_0x01bb:
            r2 = r32
        L_0x01bd:
            if (r15 == 0) goto L_0x020b
            r3 = r31
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c7
            if (r3 != 0) goto L_0x020d
        L_0x01c7:
            r4 = 0
            r7.f3563f = r4
            r4 = 0
        L_0x01cb:
            if (r4 >= r2) goto L_0x020d
            android.view.View r6 = r7.mo5091b(r4)
            if (r6 != 0) goto L_0x01dd
            int r6 = r7.f3563f
            int r11 = r7.mo5097d(r4)
            int r6 = r6 + r11
        L_0x01da:
            r7.f3563f = r6
            goto L_0x0206
        L_0x01dd:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01e9
            int r6 = r7.mo5084a(r6, r4)
            int r4 = r4 + r6
            goto L_0x0206
        L_0x01e9:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            android.support.v7.widget.an$a r11 = (android.support.p023v7.widget.C1031an.C1032a) r11
            int r14 = r7.f3563f
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.mo5090b(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            goto L_0x01da
        L_0x0206:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01cb
        L_0x020b:
            r3 = r31
        L_0x020d:
            int r4 = r7.f3563f
            int r6 = r40.getPaddingTop()
            int r10 = r40.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f3563f = r4
            int r4 = r7.f3563f
            int r6 = r40.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r10 = r9
            r6 = r42
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f3563f
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x027e
            if (r9 == 0) goto L_0x023d
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x023d
            goto L_0x027e
        L_0x023d:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0279
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0279
            r1 = 0
        L_0x0248:
            if (r1 >= r2) goto L_0x0279
            android.view.View r3 = r7.mo5091b(r1)
            if (r3 == 0) goto L_0x0276
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0259
            goto L_0x0276
        L_0x0259:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            android.support.v7.widget.an$a r9 = (android.support.p023v7.widget.C1031an.C1032a) r9
            float r9 = r9.f3573g
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0276
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x0276:
            int r1 = r1 + 1
            goto L_0x0248
        L_0x0279:
            r1 = r8
            r11 = r41
            goto L_0x0373
        L_0x027e:
            float r10 = r7.f3564g
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0286
            float r0 = r7.f3564g
        L_0x0286:
            r10 = 0
            r7.f3563f = r10
            r11 = r0
            r0 = 0
            r39 = r8
            r8 = r1
            r1 = r39
        L_0x0290:
            if (r0 >= r2) goto L_0x0362
            android.view.View r13 = r7.mo5091b(r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x02a5
            r38 = r3
            r10 = r11
            r11 = r41
            goto L_0x035a
        L_0x02a5:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.support.v7.widget.an$a r14 = (android.support.p023v7.widget.C1031an.C1032a) r14
            float r10 = r14.f3573g
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0301
            float r15 = (float) r9
            float r15 = r15 * r10
            float r15 = r15 / r11
            int r15 = (int) r15
            float r11 = r11 - r10
            int r9 = r9 - r15
            int r10 = r40.getPaddingLeft()
            int r18 = r40.getPaddingRight()
            int r10 = r10 + r18
            r34 = r9
            int r9 = r14.leftMargin
            int r10 = r10 + r9
            int r9 = r14.rightMargin
            int r10 = r10 + r9
            int r9 = r14.width
            r35 = r11
            r11 = r41
            int r9 = getChildMeasureSpec(r11, r10, r9)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02e0
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02dd
            goto L_0x02e2
        L_0x02dd:
            if (r15 <= 0) goto L_0x02ea
            goto L_0x02eb
        L_0x02e0:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02e2:
            int r18 = r13.getMeasuredHeight()
            int r15 = r18 + r15
            if (r15 >= 0) goto L_0x02eb
        L_0x02ea:
            r15 = 0
        L_0x02eb:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
            int r9 = r13.getMeasuredState()
            r9 = r9 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r9)
            r9 = r34
            r10 = r35
            goto L_0x0304
        L_0x0301:
            r10 = r11
            r11 = r41
        L_0x0304:
            int r15 = r14.leftMargin
            r36 = r1
            int r1 = r14.rightMargin
            int r15 = r15 + r1
            int r1 = r13.getMeasuredWidth()
            int r1 = r1 + r15
            int r5 = java.lang.Math.max(r5, r1)
            r37 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0323
            int r1 = r14.width
            r38 = r3
            r3 = -1
            if (r1 != r3) goto L_0x0326
            r1 = 1
            goto L_0x0327
        L_0x0323:
            r38 = r3
            r3 = -1
        L_0x0326:
            r1 = 0
        L_0x0327:
            if (r1 == 0) goto L_0x032a
            goto L_0x032c
        L_0x032a:
            r15 = r37
        L_0x032c:
            int r1 = java.lang.Math.max(r8, r15)
            if (r19 == 0) goto L_0x0338
            int r8 = r14.width
            if (r8 != r3) goto L_0x0338
            r8 = 1
            goto L_0x0339
        L_0x0338:
            r8 = 0
        L_0x0339:
            int r15 = r7.f3563f
            int r18 = r13.getMeasuredHeight()
            int r18 = r15 + r18
            int r3 = r14.topMargin
            int r18 = r18 + r3
            int r3 = r14.bottomMargin
            int r18 = r18 + r3
            int r3 = r7.mo5090b(r13)
            int r3 = r18 + r3
            int r3 = java.lang.Math.max(r15, r3)
            r7.f3563f = r3
            r19 = r8
            r8 = r1
            r1 = r36
        L_0x035a:
            int r0 = r0 + 1
            r11 = r10
            r3 = r38
            r10 = 0
            goto L_0x0290
        L_0x0362:
            r11 = r41
            int r0 = r7.f3563f
            int r3 = r40.getPaddingTop()
            int r9 = r40.getPaddingBottom()
            int r3 = r3 + r9
            int r0 = r0 + r3
            r7.f3563f = r0
            r0 = r8
        L_0x0373:
            if (r19 != 0) goto L_0x037a
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x037a
            goto L_0x037b
        L_0x037a:
            r0 = r5
        L_0x037b:
            int r3 = r40.getPaddingLeft()
            int r5 = r40.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r40.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x0399
            r7.m5600c(r2, r6)
        L_0x0399:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1031an.mo5085a(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5086a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f3562e & 112;
        int i9 = this.f3562e & 8388615;
        int i10 = i8 != 16 ? i8 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f3563f : (((i4 - i2) - this.f3563f) / 2) + getPaddingTop();
        int i11 = 0;
        while (i11 < virtualChildCount) {
            View b = mo5091b(i11);
            if (b == null) {
                i10 += mo5097d(i11);
            } else if (b.getVisibility() != 8) {
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C1032a aVar = (C1032a) b.getLayoutParams();
                int i12 = aVar.f3574h;
                if (i12 < 0) {
                    i12 = i9;
                }
                int a = C0604d.m2741a(i12, C0626s.m2861e(this)) & 7;
                if (a == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + aVar.leftMargin;
                    i6 = i5 - aVar.rightMargin;
                } else if (a != 5) {
                    i6 = aVar.leftMargin + paddingLeft;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = i5 - aVar.rightMargin;
                }
                int i13 = i6;
                if (mo5096c(i11)) {
                    i10 += this.f3570m;
                }
                int i14 = i10 + aVar.topMargin;
                C1032a aVar2 = aVar;
                m5599a(b, i13, i14 + mo5083a(b), measuredWidth, measuredHeight);
                i11 += mo5084a(b, i11);
                i10 = i14 + measuredHeight + aVar2.bottomMargin + mo5090b(b);
            }
            i11++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5087a(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View b = mo5091b(i2);
            if (!(b == null || b.getVisibility() == 8 || !mo5096c(i2))) {
                mo5088a(canvas, (b.getTop() - ((C1032a) b.getLayoutParams()).topMargin) - this.f3570m);
            }
        }
        if (mo5096c(virtualChildCount)) {
            View b2 = mo5091b(virtualChildCount - 1);
            if (b2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.f3570m;
            } else {
                i = b2.getBottom() + ((C1032a) b2.getLayoutParams()).bottomMargin;
            }
            mo5088a(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5088a(Canvas canvas, int i) {
        this.f3568k.setBounds(getPaddingLeft() + this.f3572o, i, (getWidth() - getPaddingRight()) - this.f3572o, this.f3570m + i);
        this.f3568k.draw(canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5089a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5090b(View view) {
        return 0;
    }

    /* renamed from: b */
    public C1032a generateLayoutParams(AttributeSet attributeSet) {
        return new C1032a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1032a generateLayoutParams(LayoutParams layoutParams) {
        return new C1032a(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo5091b(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03b0, code lost:
        if (r8 > 0) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03bb, code lost:
        if (r8 < 0) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03bd, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03be, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r4), r2);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & -16777216);
        r2 = r40;
        r4 = r41;
     */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5092b(int r45, int r46) {
        /*
            r44 = this;
            r7 = r44
            r8 = r45
            r9 = r46
            r10 = 0
            r7.f3563f = r10
            int r11 = r44.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r45)
            int r13 = android.view.View.MeasureSpec.getMode(r46)
            int[] r0 = r7.f3566i
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f3567j
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f3566i = r0
            int[] r0 = new int[r14]
            r7.f3567j = r0
        L_0x0026:
            int[] r15 = r7.f3566i
            int[] r6 = r7.f3567j
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f3558a
            boolean r3 = r7.f3565h
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 1
            r28 = 0
        L_0x0061:
            r29 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x0203
            android.view.View r6 = r7.mo5091b(r1)
            if (r6 != 0) goto L_0x007c
            int r5 = r7.f3563f
            int r6 = r7.mo5097d(r1)
            int r5 = r5 + r6
            r7.f3563f = r5
        L_0x0076:
            r32 = r3
            r36 = r4
            goto L_0x01f3
        L_0x007c:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x0088
            int r5 = r7.mo5084a(r6, r1)
            int r1 = r1 + r5
            goto L_0x0076
        L_0x0088:
            boolean r5 = r7.mo5096c(r1)
            if (r5 == 0) goto L_0x0095
            int r5 = r7.f3563f
            int r10 = r7.f3569l
            int r5 = r5 + r10
            r7.f3563f = r5
        L_0x0095:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            android.support.v7.widget.an$a r10 = (android.support.p023v7.widget.C1031an.C1032a) r10
            float r5 = r10.f3573g
            float r31 = r0 + r5
            if (r12 != r2) goto L_0x00ea
            int r0 = r10.width
            if (r0 != 0) goto L_0x00ea
            float r0 = r10.f3573g
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ea
            if (r19 == 0) goto L_0x00b9
            int r0 = r7.f3563f
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x00b6:
            r7.f3563f = r0
            goto L_0x00c6
        L_0x00b9:
            int r0 = r7.f3563f
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            goto L_0x00b6
        L_0x00c6:
            if (r4 == 0) goto L_0x00db
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r30 = -2
            goto L_0x0163
        L_0x00db:
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r22 = 1
            r30 = -2
            goto L_0x0165
        L_0x00ea:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f9
            float r0 = r10.f3573g
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fc
        L_0x00f9:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fc:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0105
            int r0 = r7.f3563f
            r30 = r0
            goto L_0x0107
        L_0x0105:
            r30 = 0
        L_0x0107:
            r33 = 0
            r0 = r44
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r45
            r36 = r4
            r4 = r30
            r9 = -1
            r30 = -2
            r5 = r46
            r37 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r33
            r0.mo5089a(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L_0x012e
            r10.width = r0
        L_0x012e:
            int r0 = r37.getMeasuredWidth()
            if (r19 == 0) goto L_0x0147
            int r1 = r7.f3563f
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r37
            int r4 = r7.mo5090b(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
        L_0x0144:
            r7.f3563f = r1
            goto L_0x015d
        L_0x0147:
            r3 = r37
            int r1 = r7.f3563f
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo5090b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            goto L_0x0144
        L_0x015d:
            if (r32 == 0) goto L_0x0163
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0163:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0165:
            if (r13 == r1) goto L_0x0170
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0170
            r0 = 1
            r28 = 1
            goto L_0x0171
        L_0x0170:
            r0 = 0
        L_0x0171:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r26
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r36 == 0) goto L_0x01b3
            int r6 = r3.getBaseline()
            r9 = -1
            if (r6 == r9) goto L_0x01b3
            int r9 = r10.f3574h
            if (r9 >= 0) goto L_0x0195
            int r9 = r7.f3562e
            goto L_0x0197
        L_0x0195:
            int r9 = r10.f3574h
        L_0x0197:
            r9 = r9 & 112(0x70, float:1.57E-43)
            r25 = 4
            int r9 = r9 >> 4
            r9 = r9 & -2
            int r9 = r9 >> 1
            r1 = r15[r9]
            int r1 = java.lang.Math.max(r1, r6)
            r15[r9] = r1
            r1 = r29[r9]
            int r6 = r4 - r6
            int r1 = java.lang.Math.max(r1, r6)
            r29[r9] = r1
        L_0x01b3:
            r1 = r21
            int r1 = java.lang.Math.max(r1, r4)
            if (r27 == 0) goto L_0x01c2
            int r6 = r10.height
            r9 = -1
            if (r6 != r9) goto L_0x01c2
            r6 = 1
            goto L_0x01c3
        L_0x01c2:
            r6 = 0
        L_0x01c3:
            float r9 = r10.f3573g
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x01d7
            if (r0 == 0) goto L_0x01ce
        L_0x01cb:
            r10 = r24
            goto L_0x01d0
        L_0x01ce:
            r2 = r4
            goto L_0x01cb
        L_0x01d0:
            int r24 = java.lang.Math.max(r10, r2)
        L_0x01d4:
            r10 = r34
            goto L_0x01e5
        L_0x01d7:
            r10 = r24
            if (r0 == 0) goto L_0x01dc
            r4 = r2
        L_0x01dc:
            r2 = r23
            int r23 = java.lang.Math.max(r2, r4)
            r24 = r10
            goto L_0x01d4
        L_0x01e5:
            int r0 = r7.mo5084a(r3, r10)
            int r0 = r0 + r10
            r21 = r1
            r26 = r5
            r27 = r6
            r1 = r0
            r0 = r31
        L_0x01f3:
            int r1 = r1 + 1
            r6 = r29
            r3 = r32
            r4 = r36
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r9 = r46
            r10 = 0
            goto L_0x0061
        L_0x0203:
            r32 = r3
            r36 = r4
            r1 = r21
            r2 = r23
            r10 = r24
            r6 = r26
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.f3563f
            if (r3 <= 0) goto L_0x0224
            boolean r3 = r7.mo5096c(r11)
            if (r3 == 0) goto L_0x0224
            int r3 = r7.f3563f
            int r4 = r7.f3569l
            int r3 = r3 + r4
            r7.f3563f = r3
        L_0x0224:
            r3 = r15[r18]
            r4 = -1
            if (r3 != r4) goto L_0x023a
            r3 = 0
            r5 = r15[r3]
            if (r5 != r4) goto L_0x023a
            r3 = r15[r17]
            if (r3 != r4) goto L_0x023a
            r3 = r15[r16]
            if (r3 == r4) goto L_0x0237
            goto L_0x023a
        L_0x0237:
            r38 = r6
            goto L_0x026d
        L_0x023a:
            r3 = r15[r16]
            r4 = 0
            r5 = r15[r4]
            r9 = r15[r18]
            r4 = r15[r17]
            int r4 = java.lang.Math.max(r9, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r29[r16]
            r5 = 0
            r9 = r29[r5]
            r5 = r29[r18]
            r38 = r6
            r6 = r29[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = r3 + r4
            int r21 = java.lang.Math.max(r1, r3)
            r1 = r21
        L_0x026d:
            if (r32 == 0) goto L_0x02d0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r3) goto L_0x0275
            if (r12 != 0) goto L_0x02d0
        L_0x0275:
            r3 = 0
            r7.f3563f = r3
            r3 = 0
        L_0x0279:
            if (r3 >= r11) goto L_0x02d0
            android.view.View r4 = r7.mo5091b(r3)
            if (r4 != 0) goto L_0x028b
            int r4 = r7.f3563f
            int r5 = r7.mo5097d(r3)
            int r4 = r4 + r5
            r7.f3563f = r4
            goto L_0x0298
        L_0x028b:
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x029b
            int r4 = r7.mo5084a(r4, r3)
            int r3 = r3 + r4
        L_0x0298:
            r39 = r1
            goto L_0x02cb
        L_0x029b:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.an$a r5 = (android.support.p023v7.widget.C1031an.C1032a) r5
            if (r19 == 0) goto L_0x02b4
            int r6 = r7.f3563f
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r4 = r7.mo5090b(r4)
            int r9 = r9 + r4
            int r6 = r6 + r9
            r7.f3563f = r6
            goto L_0x0298
        L_0x02b4:
            int r6 = r7.f3563f
            int r9 = r6 + r14
            r39 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo5090b(r4)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f3563f = r1
        L_0x02cb:
            int r3 = r3 + 1
            r1 = r39
            goto L_0x0279
        L_0x02d0:
            r39 = r1
            int r1 = r7.f3563f
            int r3 = r44.getPaddingLeft()
            int r4 = r44.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r7.f3563f = r1
            int r1 = r7.f3563f
            int r3 = r44.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r3 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r4 = r7.f3563f
            int r3 = r3 - r4
            if (r22 != 0) goto L_0x0341
            if (r3 == 0) goto L_0x02ff
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02ff
            goto L_0x0341
        L_0x02ff:
            int r0 = java.lang.Math.max(r2, r10)
            if (r32 == 0) goto L_0x033b
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x033b
            r2 = 0
        L_0x030a:
            if (r2 >= r11) goto L_0x033b
            android.view.View r3 = r7.mo5091b(r2)
            if (r3 == 0) goto L_0x0338
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x031b
            goto L_0x0338
        L_0x031b:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.an$a r5 = (android.support.p023v7.widget.C1031an.C1032a) r5
            float r5 = r5.f3573g
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x0338
            r5 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r9 = r3.getMeasuredHeight()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5)
            r3.measure(r6, r9)
        L_0x0338:
            int r2 = r2 + 1
            goto L_0x030a
        L_0x033b:
            r42 = r11
            r3 = r46
            goto L_0x04e0
        L_0x0341:
            float r5 = r7.f3564g
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x0349
            float r0 = r7.f3564g
        L_0x0349:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r29[r16] = r5
            r29[r17] = r5
            r29[r18] = r5
            r29[r6] = r5
            r7.f3563f = r6
            r10 = r2
            r9 = r38
            r6 = -1
            r2 = r0
            r0 = 0
        L_0x0363:
            if (r0 >= r11) goto L_0x0486
            android.view.View r14 = r7.mo5091b(r0)
            if (r14 == 0) goto L_0x0475
            int r5 = r14.getVisibility()
            r4 = 8
            if (r5 != r4) goto L_0x0375
            goto L_0x0475
        L_0x0375:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            android.support.v7.widget.an$a r5 = (android.support.p023v7.widget.C1031an.C1032a) r5
            float r4 = r5.f3573g
            int r21 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r21 <= 0) goto L_0x03d5
            float r8 = (float) r3
            float r8 = r8 * r4
            float r8 = r8 / r2
            int r8 = (int) r8
            float r2 = r2 - r4
            int r3 = r3 - r8
            int r4 = r44.getPaddingTop()
            int r21 = r44.getPaddingBottom()
            int r4 = r4 + r21
            r40 = r2
            int r2 = r5.topMargin
            int r4 = r4 + r2
            int r2 = r5.bottomMargin
            int r4 = r4 + r2
            int r2 = r5.height
            r41 = r3
            r42 = r11
            r3 = r46
            r11 = -1
            int r2 = getChildMeasureSpec(r3, r4, r2)
            int r4 = r5.width
            if (r4 != 0) goto L_0x03b3
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x03b0
            goto L_0x03b5
        L_0x03b0:
            if (r8 <= 0) goto L_0x03bd
            goto L_0x03be
        L_0x03b3:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x03b5:
            int r21 = r14.getMeasuredWidth()
            int r8 = r21 + r8
            if (r8 >= 0) goto L_0x03be
        L_0x03bd:
            r8 = 0
        L_0x03be:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r14.measure(r8, r2)
            int r2 = r14.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r4
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r2 = r40
            r4 = r41
            goto L_0x03db
        L_0x03d5:
            r4 = r3
            r42 = r11
            r3 = r46
            r11 = -1
        L_0x03db:
            if (r19 == 0) goto L_0x03fa
            int r8 = r7.f3563f
            int r21 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r21 = r21 + r11
            int r11 = r5.rightMargin
            int r21 = r21 + r11
            int r11 = r7.mo5090b(r14)
            int r21 = r21 + r11
            int r8 = r8 + r21
            r7.f3563f = r8
            r43 = r2
        L_0x03f7:
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x0415
        L_0x03fa:
            int r8 = r7.f3563f
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r43 = r2
            int r2 = r5.leftMargin
            int r11 = r11 + r2
            int r2 = r5.rightMargin
            int r11 = r11 + r2
            int r2 = r7.mo5090b(r14)
            int r11 = r11 + r2
            int r2 = java.lang.Math.max(r8, r11)
            r7.f3563f = r2
            goto L_0x03f7
        L_0x0415:
            if (r13 == r2) goto L_0x041e
            int r2 = r5.height
            r8 = -1
            if (r2 != r8) goto L_0x041e
            r2 = 1
            goto L_0x041f
        L_0x041e:
            r2 = 0
        L_0x041f:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r6 = java.lang.Math.max(r6, r11)
            if (r2 == 0) goto L_0x0430
            goto L_0x0431
        L_0x0430:
            r8 = r11
        L_0x0431:
            int r2 = java.lang.Math.max(r10, r8)
            if (r27 == 0) goto L_0x043e
            int r8 = r5.height
            r10 = -1
            if (r8 != r10) goto L_0x043f
            r8 = 1
            goto L_0x0440
        L_0x043e:
            r10 = -1
        L_0x043f:
            r8 = 0
        L_0x0440:
            if (r36 == 0) goto L_0x046d
            int r14 = r14.getBaseline()
            if (r14 == r10) goto L_0x046d
            int r10 = r5.f3574h
            if (r10 >= 0) goto L_0x044f
            int r5 = r7.f3562e
            goto L_0x0451
        L_0x044f:
            int r5 = r5.f3574h
        L_0x0451:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r5 = r5 >> 4
            r5 = r5 & -2
            int r5 = r5 >> 1
            r10 = r15[r5]
            int r10 = java.lang.Math.max(r10, r14)
            r15[r5] = r10
            r10 = r29[r5]
            int r11 = r11 - r14
            int r10 = java.lang.Math.max(r10, r11)
            r29[r5] = r10
            goto L_0x046f
        L_0x046d:
            r21 = 4
        L_0x046f:
            r10 = r2
            r27 = r8
            r2 = r43
            goto L_0x047c
        L_0x0475:
            r4 = r3
            r42 = r11
            r3 = r46
            r21 = 4
        L_0x047c:
            int r0 = r0 + 1
            r3 = r4
            r11 = r42
            r5 = -1
            r8 = r45
            goto L_0x0363
        L_0x0486:
            r42 = r11
            r3 = r46
            int r0 = r7.f3563f
            int r2 = r44.getPaddingLeft()
            int r4 = r44.getPaddingRight()
            int r2 = r2 + r4
            int r0 = r0 + r2
            r7.f3563f = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x04ad
            r0 = 0
            r4 = r15[r0]
            if (r4 != r2) goto L_0x04ad
            r0 = r15[r17]
            if (r0 != r2) goto L_0x04ad
            r0 = r15[r16]
            if (r0 == r2) goto L_0x04ab
            goto L_0x04ad
        L_0x04ab:
            r0 = r6
            goto L_0x04db
        L_0x04ad:
            r0 = r15[r16]
            r2 = 0
            r4 = r15[r2]
            r5 = r15[r18]
            r8 = r15[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r4 = java.lang.Math.max(r4, r5)
            int r0 = java.lang.Math.max(r0, r4)
            r4 = r29[r16]
            r2 = r29[r2]
            r5 = r29[r18]
            r8 = r29[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r6, r0)
        L_0x04db:
            r39 = r0
            r38 = r9
            r0 = r10
        L_0x04e0:
            if (r27 != 0) goto L_0x04e8
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x04e8
            r39 = r0
        L_0x04e8:
            int r0 = r44.getPaddingTop()
            int r2 = r44.getPaddingBottom()
            int r0 = r0 + r2
            int r0 = r39 + r0
            int r2 = r44.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r38 & r2
            r1 = r1 | r2
            int r2 = r38 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r28 == 0) goto L_0x0512
            r1 = r42
            r0 = r45
            r7.m5601d(r1, r0)
        L_0x0512:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1031an.mo5092b(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5093b(int r28, int r29, int r30, int r31) {
        /*
            r27 = this;
            r6 = r27
            boolean r2 = android.support.p023v7.widget.C1094bs.m6004a(r27)
            int r7 = r27.getPaddingTop()
            int r3 = r31 - r29
            int r4 = r27.getPaddingBottom()
            int r8 = r3 - r4
            int r3 = r3 - r7
            int r4 = r27.getPaddingBottom()
            int r9 = r3 - r4
            int r10 = r27.getVirtualChildCount()
            int r3 = r6.f3562e
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r4
            int r4 = r6.f3562e
            r11 = r4 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f3558a
            int[] r13 = r6.f3566i
            int[] r14 = r6.f3567j
            int r4 = android.support.p009v4.view.C0626s.m2861e(r27)
            int r3 = android.support.p009v4.view.C0604d.m2741a(r3, r4)
            r15 = 2
            r5 = 1
            if (r3 == r5) goto L_0x004e
            r4 = 5
            if (r3 == r4) goto L_0x0041
            int r0 = r27.getPaddingLeft()
            goto L_0x0059
        L_0x0041:
            int r3 = r27.getPaddingLeft()
            int r3 = r3 + r30
            int r3 = r3 - r28
            int r0 = r6.f3563f
            int r0 = r3 - r0
            goto L_0x0059
        L_0x004e:
            int r3 = r27.getPaddingLeft()
            int r0 = r30 - r28
            int r1 = r6.f3563f
            int r0 = r0 - r1
            int r0 = r0 / r15
            int r0 = r0 + r3
        L_0x0059:
            r1 = 0
            if (r2 == 0) goto L_0x0063
            int r2 = r10 + -1
            r16 = r2
            r17 = -1
            goto L_0x0067
        L_0x0063:
            r16 = 0
            r17 = 1
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 >= r10) goto L_0x014b
            int r1 = r17 * r3
            int r2 = r16 + r1
            android.view.View r1 = r6.mo5091b(r2)
            if (r1 != 0) goto L_0x0085
            int r1 = r6.mo5097d(r2)
            int r0 = r0 + r1
        L_0x0079:
            r26 = r7
            r23 = r10
            r24 = r11
            r18 = 1
            r20 = -1
            goto L_0x013f
        L_0x0085:
            int r5 = r1.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x013b
            int r15 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r20 = r1.getLayoutParams()
            r4 = r20
            android.support.v7.widget.an$a r4 = (android.support.p023v7.widget.C1031an.C1032a) r4
            if (r12 == 0) goto L_0x00ad
            r22 = r3
            int r3 = r4.height
            r23 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00b1
            int r3 = r1.getBaseline()
            goto L_0x00b2
        L_0x00ad:
            r22 = r3
            r23 = r10
        L_0x00b1:
            r3 = -1
        L_0x00b2:
            int r10 = r4.f3574h
            if (r10 >= 0) goto L_0x00b7
            r10 = r11
        L_0x00b7:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r24 = r11
            r11 = 16
            if (r10 == r11) goto L_0x00f6
            r11 = 48
            if (r10 == r11) goto L_0x00e3
            r11 = 80
            if (r10 == r11) goto L_0x00cc
            r3 = r7
            r11 = -1
        L_0x00c9:
            r18 = 1
            goto L_0x0104
        L_0x00cc:
            int r10 = r8 - r5
            int r11 = r4.bottomMargin
            int r10 = r10 - r11
            r11 = -1
            if (r3 == r11) goto L_0x00e1
            int r20 = r1.getMeasuredHeight()
            int r20 = r20 - r3
            r3 = 2
            r21 = r14[r3]
            int r21 = r21 - r20
            int r10 = r10 - r21
        L_0x00e1:
            r3 = r10
            goto L_0x00c9
        L_0x00e3:
            r11 = -1
            int r10 = r4.topMargin
            int r10 = r10 + r7
            if (r3 == r11) goto L_0x00f2
            r18 = 1
            r20 = r13[r18]
            int r20 = r20 - r3
            int r10 = r10 + r20
            goto L_0x00f4
        L_0x00f2:
            r18 = 1
        L_0x00f4:
            r3 = r10
            goto L_0x0104
        L_0x00f6:
            r11 = -1
            r18 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x0104:
            boolean r10 = r6.mo5096c(r2)
            if (r10 == 0) goto L_0x010d
            int r10 = r6.f3569l
            int r0 = r0 + r10
        L_0x010d:
            int r10 = r4.leftMargin
            int r10 = r10 + r0
            int r0 = r6.mo5083a(r1)
            int r19 = r10 + r0
            r0 = r27
            r25 = r1
            r11 = r2
            r2 = r19
            r19 = r22
            r26 = r7
            r20 = -1
            r7 = r4
            r4 = r15
            r0.m5599a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo5090b(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo5084a(r0, r11)
            int r3 = r19 + r0
            r0 = r10
            goto L_0x013f
        L_0x013b:
            r19 = r3
            goto L_0x0079
        L_0x013f:
            int r3 = r3 + 1
            r10 = r23
            r11 = r24
            r7 = r26
            r5 = 1
            r15 = 2
            goto L_0x0068
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1031an.mo5093b(int, int, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5094b(Canvas canvas) {
        int i;
        int left;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C1094bs.m6004a(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View b = mo5091b(i3);
            if (!(b == null || b.getVisibility() == 8 || !mo5096c(i3))) {
                C1032a aVar = (C1032a) b.getLayoutParams();
                mo5095b(canvas, a ? b.getRight() + aVar.rightMargin : (b.getLeft() - aVar.leftMargin) - this.f3569l);
            }
        }
        if (mo5096c(virtualChildCount)) {
            View b2 = mo5091b(virtualChildCount - 1);
            if (b2 != null) {
                C1032a aVar2 = (C1032a) b2.getLayoutParams();
                if (a) {
                    left = b2.getLeft();
                    i2 = aVar2.leftMargin;
                } else {
                    i = b2.getRight() + aVar2.rightMargin;
                    mo5095b(canvas, i);
                }
            } else if (a) {
                i = getPaddingLeft();
                mo5095b(canvas, i);
            } else {
                left = getWidth();
                i2 = getPaddingRight();
            }
            i = (left - i2) - this.f3569l;
            mo5095b(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5095b(Canvas canvas, int i) {
        this.f3568k.setBounds(i, getPaddingTop() + this.f3572o, this.f3569l + i, (getHeight() - getPaddingBottom()) - this.f3572o);
        this.f3568k.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo5096c(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.f3571n & 1) != 0) {
                z = true;
            }
            return z;
        } else if (i == getChildCount()) {
            if ((this.f3571n & 4) != 0) {
                z = true;
            }
            return z;
        } else {
            if ((this.f3571n & 2) != 0) {
                int i2 = i - 1;
                while (true) {
                    if (i2 < 0) {
                        break;
                    } else if (getChildAt(i2).getVisibility() != 8) {
                        z = true;
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            return z;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C1032a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo5097d(int i) {
        return 0;
    }

    public int getBaseline() {
        if (this.f3559b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() > this.f3559b) {
            View childAt = getChildAt(this.f3559b);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i = this.f3560c;
                if (this.f3561d == 1) {
                    int i2 = this.f3562e & 112;
                    if (i2 != 48) {
                        if (i2 == 16) {
                            i += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3563f) / 2;
                        } else if (i2 == 80) {
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3563f;
                        }
                    }
                }
                return i + ((C1032a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f3559b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3559b;
    }

    public Drawable getDividerDrawable() {
        return this.f3568k;
    }

    public int getDividerPadding() {
        return this.f3572o;
    }

    public int getDividerWidth() {
        return this.f3569l;
    }

    public int getGravity() {
        return this.f3562e;
    }

    public int getOrientation() {
        return this.f3561d;
    }

    public int getShowDividers() {
        return this.f3571n;
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3564g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C1032a generateDefaultLayoutParams() {
        if (this.f3561d == 0) {
            return new C1032a(-2, -2);
        }
        if (this.f3561d == 1) {
            return new C1032a(-1, -2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f3568k != null) {
            if (this.f3561d == 1) {
                mo5087a(canvas);
            } else {
                mo5094b(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C1031an.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C1031an.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f3561d == 1) {
            mo5086a(i, i2, i3, i4);
        } else {
            mo5093b(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f3561d == 1) {
            mo5085a(i, i2);
        } else {
            mo5092b(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f3558a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder();
            sb.append("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f3559b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f3568k) {
            this.f3568k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f3569l = drawable.getIntrinsicWidth();
                this.f3570m = drawable.getIntrinsicHeight();
            } else {
                this.f3569l = 0;
                this.f3570m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f3572o = i;
    }

    public void setGravity(int i) {
        if (this.f3562e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3562e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((8388615 & this.f3562e) != i2) {
            this.f3562e = i2 | (this.f3562e & -8388616);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f3565h = z;
    }

    public void setOrientation(int i) {
        if (this.f3561d != i) {
            this.f3561d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f3571n) {
            requestLayout();
        }
        this.f3571n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.f3562e & 112) != i2) {
            this.f3562e = i2 | (this.f3562e & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f3564g = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
