package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p023v7.view.menu.ActionMenuItemView;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0855h.C0856a;
import android.support.p023v7.view.menu.C0855h.C0857b;
import android.support.p023v7.view.menu.C0859j;
import android.support.p023v7.view.menu.C0871o;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.view.menu.C0873p;
import android.support.p023v7.widget.C1031an.C1032a;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends C1031an implements C0857b, C0873p {

    /* renamed from: a */
    C0856a f2824a;

    /* renamed from: b */
    C0901e f2825b;

    /* renamed from: c */
    private C0855h f2826c;

    /* renamed from: d */
    private Context f2827d;

    /* renamed from: e */
    private int f2828e;

    /* renamed from: f */
    private boolean f2829f;

    /* renamed from: g */
    private ActionMenuPresenter f2830g;

    /* renamed from: h */
    private C0872a f2831h;

    /* renamed from: i */
    private boolean f2832i;

    /* renamed from: j */
    private int f2833j;

    /* renamed from: k */
    private int f2834k;

    /* renamed from: l */
    private int f2835l;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C0897a {
        /* renamed from: c */
        boolean mo3350c();

        /* renamed from: d */
        boolean mo3351d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    private static class C0898b implements C0872a {
        C0898b() {
        }

        /* renamed from: a */
        public void mo3176a(C0855h hVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo3177a(C0855h hVar) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    public static class C0899c extends C1032a {
        @ExportedProperty

        /* renamed from: a */
        public boolean f2836a;
        @ExportedProperty

        /* renamed from: b */
        public int f2837b;
        @ExportedProperty

        /* renamed from: c */
        public int f2838c;
        @ExportedProperty

        /* renamed from: d */
        public boolean f2839d;
        @ExportedProperty

        /* renamed from: e */
        public boolean f2840e;

        /* renamed from: f */
        boolean f2841f;

        public C0899c(int i, int i2) {
            super(i, i2);
            this.f2836a = false;
        }

        public C0899c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0899c(C0899c cVar) {
            super(cVar);
            this.f2836a = cVar.f2836a;
        }

        public C0899c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    private class C0900d implements C0856a {
        C0900d() {
        }

        /* renamed from: a */
        public void mo639a(C0855h hVar) {
            if (ActionMenuView.this.f2824a != null) {
                ActionMenuView.this.f2824a.mo639a(hVar);
            }
        }

        /* renamed from: a */
        public boolean mo640a(C0855h hVar, MenuItem menuItem) {
            return ActionMenuView.this.f2825b != null && ActionMenuView.this.f2825b.mo3883a(menuItem);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    public interface C0901e {
        /* renamed from: a */
        boolean mo3883a(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2834k = (int) (56.0f * f);
        this.f2835l = (int) (f * 4.0f);
        this.f2827d = context;
        this.f2828e = 0;
    }

    /* renamed from: a */
    static int m4362a(View view, int i, int i2, int i3, int i4) {
        C0899c cVar = (C0899c) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo3349a();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f2836a || !z2) {
            z = false;
        }
        cVar.f2839d = z;
        cVar.f2837b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x024f A[LOOP:5: B:136:0x024f->B:141:0x0272, LOOP_START, PHI: r3 r32 
      PHI: (r3v5 int) = (r3v4 int), (r3v6 int) binds: [B:135:0x024d, B:141:0x0272] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r32v1 int) = (r32v0 int), (r32v2 int) binds: [B:135:0x024d, B:141:0x0272] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x027e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4363c(int r35, int r36) {
        /*
            r34 = this;
            r0 = r34
            int r1 = android.view.View.MeasureSpec.getMode(r36)
            int r2 = android.view.View.MeasureSpec.getSize(r35)
            int r3 = android.view.View.MeasureSpec.getSize(r36)
            int r4 = r34.getPaddingLeft()
            int r5 = r34.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r34.getPaddingTop()
            int r6 = r34.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r36
            int r6 = getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r4 = r0.f2834k
            int r4 = r2 / r4
            int r7 = r0.f2834k
            int r7 = r2 % r7
            r8 = 0
            if (r4 != 0) goto L_0x0037
            r0.setMeasuredDimension(r2, r8)
            return
        L_0x0037:
            int r9 = r0.f2834k
            int r7 = r7 / r4
            int r9 = r9 + r7
            int r7 = r34.getChildCount()
            r14 = r4
            r4 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r19 = 0
        L_0x0049:
            if (r4 >= r7) goto L_0x00d6
            android.view.View r11 = r0.getChildAt(r4)
            int r8 = r11.getVisibility()
            r21 = r3
            r3 = 8
            if (r8 != r3) goto L_0x005d
            r23 = r2
            goto L_0x00cd
        L_0x005d:
            boolean r3 = r11 instanceof android.support.p023v7.view.menu.ActionMenuItemView
            int r13 = r13 + 1
            if (r3 == 0) goto L_0x0070
            int r8 = r0.f2835l
            r22 = r13
            int r13 = r0.f2835l
            r23 = r2
            r2 = 0
            r11.setPadding(r8, r2, r13, r2)
            goto L_0x0075
        L_0x0070:
            r23 = r2
            r22 = r13
            r2 = 0
        L_0x0075:
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r8 = (android.support.p023v7.widget.ActionMenuView.C0899c) r8
            r8.f2841f = r2
            r8.f2838c = r2
            r8.f2837b = r2
            r8.f2839d = r2
            r8.leftMargin = r2
            r8.rightMargin = r2
            if (r3 == 0) goto L_0x0094
            r2 = r11
            android.support.v7.view.menu.ActionMenuItemView r2 = (android.support.p023v7.view.menu.ActionMenuItemView) r2
            boolean r2 = r2.mo3349a()
            if (r2 == 0) goto L_0x0094
            r2 = 1
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            r8.f2840e = r2
            boolean r2 = r8.f2836a
            if (r2 == 0) goto L_0x009d
            r2 = 1
            goto L_0x009e
        L_0x009d:
            r2 = r14
        L_0x009e:
            int r2 = m4362a(r11, r9, r2, r6, r5)
            int r3 = java.lang.Math.max(r15, r2)
            boolean r13 = r8.f2839d
            if (r13 == 0) goto L_0x00ac
            int r16 = r16 + 1
        L_0x00ac:
            boolean r8 = r8.f2836a
            if (r8 == 0) goto L_0x00b1
            r12 = 1
        L_0x00b1:
            int r14 = r14 - r2
            int r8 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r8)
            r8 = 1
            if (r2 != r8) goto L_0x00c7
            int r2 = r8 << r4
            r24 = r3
            long r2 = (long) r2
            long r2 = r19 | r2
            r19 = r2
            goto L_0x00c9
        L_0x00c7:
            r24 = r3
        L_0x00c9:
            r13 = r22
            r15 = r24
        L_0x00cd:
            int r4 = r4 + 1
            r3 = r21
            r2 = r23
            r8 = 0
            goto L_0x0049
        L_0x00d6:
            r23 = r2
            r21 = r3
            r2 = 2
            if (r12 == 0) goto L_0x00e1
            if (r13 != r2) goto L_0x00e1
            r3 = 1
            goto L_0x00e2
        L_0x00e1:
            r3 = 0
        L_0x00e2:
            r4 = 0
        L_0x00e3:
            r24 = 1
            if (r16 <= 0) goto L_0x0182
            if (r14 <= 0) goto L_0x0182
            r5 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r8 = 0
            r11 = 2147483647(0x7fffffff, float:NaN)
            r26 = 0
        L_0x00f3:
            if (r5 >= r7) goto L_0x0123
            android.view.View r22 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r22 = r22.getLayoutParams()
            r2 = r22
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.p023v7.widget.ActionMenuView.C0899c) r2
            r28 = r4
            boolean r4 = r2.f2839d
            if (r4 != 0) goto L_0x0108
            goto L_0x011d
        L_0x0108:
            int r4 = r2.f2837b
            if (r4 >= r11) goto L_0x0113
            int r2 = r2.f2837b
            long r26 = r24 << r5
            r11 = r2
            r8 = 1
            goto L_0x011d
        L_0x0113:
            int r2 = r2.f2837b
            if (r2 != r11) goto L_0x011d
            long r29 = r24 << r5
            long r26 = r26 | r29
            int r8 = r8 + 1
        L_0x011d:
            int r5 = r5 + 1
            r4 = r28
            r2 = 2
            goto L_0x00f3
        L_0x0123:
            r28 = r4
            long r19 = r19 | r26
            if (r8 <= r14) goto L_0x0130
        L_0x0129:
            r32 = r6
            r33 = r7
            r31 = r10
            goto L_0x0185
        L_0x0130:
            int r11 = r11 + 1
            r2 = 0
        L_0x0133:
            if (r2 >= r7) goto L_0x017e
            android.view.View r4 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r5 = (android.support.p023v7.widget.ActionMenuView.C0899c) r5
            r31 = r10
            r8 = 1
            int r10 = r8 << r2
            r32 = r6
            r33 = r7
            long r6 = (long) r10
            long r24 = r26 & r6
            r17 = 0
            int r8 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r8 != 0) goto L_0x0158
            int r4 = r5.f2837b
            if (r4 != r11) goto L_0x0175
            long r19 = r19 | r6
            goto L_0x0175
        L_0x0158:
            if (r3 == 0) goto L_0x016b
            boolean r6 = r5.f2840e
            if (r6 == 0) goto L_0x016b
            r6 = 1
            if (r14 != r6) goto L_0x016c
            int r7 = r0.f2835l
            int r7 = r7 + r9
            int r8 = r0.f2835l
            r10 = 0
            r4.setPadding(r7, r10, r8, r10)
            goto L_0x016c
        L_0x016b:
            r6 = 1
        L_0x016c:
            int r4 = r5.f2837b
            int r4 = r4 + r6
            r5.f2837b = r4
            r5.f2841f = r6
            int r14 = r14 + -1
        L_0x0175:
            int r2 = r2 + 1
            r10 = r31
            r6 = r32
            r7 = r33
            goto L_0x0133
        L_0x017e:
            r2 = 2
            r4 = 1
            goto L_0x00e3
        L_0x0182:
            r28 = r4
            goto L_0x0129
        L_0x0185:
            if (r12 != 0) goto L_0x018c
            r2 = 1
            if (r13 != r2) goto L_0x018d
            r3 = 1
            goto L_0x018e
        L_0x018c:
            r2 = 1
        L_0x018d:
            r3 = 0
        L_0x018e:
            if (r14 <= 0) goto L_0x0248
            r4 = 0
            int r6 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0248
            int r13 = r13 - r2
            if (r14 < r13) goto L_0x019d
            if (r3 != 0) goto L_0x019d
            if (r15 <= r2) goto L_0x0248
        L_0x019d:
            int r2 = java.lang.Long.bitCount(r19)
            float r2 = (float) r2
            if (r3 != 0) goto L_0x01de
            long r3 = r19 & r24
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01bf
            r3 = 0
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r4 = (android.support.p023v7.widget.ActionMenuView.C0899c) r4
            boolean r4 = r4.f2840e
            if (r4 != 0) goto L_0x01c0
            float r2 = r2 - r5
            goto L_0x01c0
        L_0x01bf:
            r3 = 0
        L_0x01c0:
            int r7 = r33 + -1
            r4 = 1
            int r6 = r4 << r7
            long r10 = (long) r6
            long r10 = r19 & r10
            r12 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x01df
            android.view.View r4 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r4 = (android.support.p023v7.widget.ActionMenuView.C0899c) r4
            boolean r4 = r4.f2840e
            if (r4 != 0) goto L_0x01df
            float r2 = r2 - r5
            goto L_0x01df
        L_0x01de:
            r3 = 0
        L_0x01df:
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x01ea
            int r14 = r14 * r9
            float r4 = (float) r14
            float r4 = r4 / r2
            int r8 = (int) r4
            goto L_0x01eb
        L_0x01ea:
            r8 = 0
        L_0x01eb:
            r11 = r28
            r2 = r33
            r4 = 0
        L_0x01f0:
            if (r4 >= r2) goto L_0x0245
            r5 = 1
            int r6 = r5 << r4
            long r5 = (long) r6
            long r5 = r19 & r5
            r12 = 0
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x0201
            r5 = 1
            r7 = 2
            goto L_0x0242
        L_0x0201:
            android.view.View r5 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p023v7.widget.ActionMenuView.C0899c) r6
            boolean r5 = r5 instanceof android.support.p023v7.view.menu.ActionMenuItemView
            if (r5 == 0) goto L_0x0224
            r6.f2838c = r8
            r5 = 1
            r6.f2841f = r5
            if (r4 != 0) goto L_0x0220
            boolean r5 = r6.f2840e
            if (r5 != 0) goto L_0x0220
            int r5 = -r8
            r7 = 2
            int r5 = r5 / r7
            r6.leftMargin = r5
            goto L_0x0221
        L_0x0220:
            r7 = 2
        L_0x0221:
            r5 = 1
        L_0x0222:
            r11 = 1
            goto L_0x0242
        L_0x0224:
            r7 = 2
            boolean r5 = r6.f2836a
            if (r5 == 0) goto L_0x0233
            r6.f2838c = r8
            r5 = 1
            r6.f2841f = r5
            int r10 = -r8
            int r10 = r10 / r7
            r6.rightMargin = r10
            goto L_0x0222
        L_0x0233:
            r5 = 1
            if (r4 == 0) goto L_0x023a
            int r10 = r8 / 2
            r6.leftMargin = r10
        L_0x023a:
            int r10 = r2 + -1
            if (r4 == r10) goto L_0x0242
            int r10 = r8 / 2
            r6.rightMargin = r10
        L_0x0242:
            int r4 = r4 + 1
            goto L_0x01f0
        L_0x0245:
            r28 = r11
            goto L_0x024b
        L_0x0248:
            r2 = r33
            r3 = 0
        L_0x024b:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r28 == 0) goto L_0x0277
        L_0x024f:
            if (r3 >= r2) goto L_0x0277
            android.view.View r5 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p023v7.widget.ActionMenuView.C0899c) r6
            boolean r7 = r6.f2841f
            if (r7 != 0) goto L_0x0262
            r7 = r32
            goto L_0x0272
        L_0x0262:
            int r7 = r6.f2837b
            int r7 = r7 * r9
            int r6 = r6.f2838c
            int r7 = r7 + r6
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r7 = r32
            r5.measure(r6, r7)
        L_0x0272:
            int r3 = r3 + 1
            r32 = r7
            goto L_0x024f
        L_0x0277:
            if (r1 == r4) goto L_0x027e
            r2 = r23
            r1 = r31
            goto L_0x0282
        L_0x027e:
            r1 = r21
            r2 = r23
        L_0x0282:
            r0.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.ActionMenuView.m4363c(int, int):void");
    }

    /* renamed from: a */
    public C0899c generateLayoutParams(AttributeSet attributeSet) {
        return new C0899c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0899c generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo3873j();
        }
        C0899c cVar = layoutParams instanceof C0899c ? new C0899c((C0899c) layoutParams) : new C0899c(layoutParams);
        if (cVar.f3574h <= 0) {
            cVar.f3574h = 16;
        }
        return cVar;
    }

    /* renamed from: a */
    public void mo286a(C0855h hVar) {
        this.f2826c = hVar;
    }

    /* renamed from: a */
    public void mo3851a(C0872a aVar, C0856a aVar2) {
        this.f2831h = aVar;
        this.f2824a = aVar2;
    }

    /* renamed from: a */
    public boolean mo3852a() {
        return this.f2829f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3853a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0897a)) {
            z = false | ((C0897a) childAt).mo3351d();
        }
        if (i > 0 && (childAt2 instanceof C0897a)) {
            z |= ((C0897a) childAt2).mo3350c();
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo3368a(C0859j jVar) {
        return this.f2826c.mo3491a((MenuItem) jVar, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0899c mo3873j() {
        C0899c cVar = new C0899c(-2, -2);
        cVar.f3574h = 16;
        return cVar;
    }

    /* renamed from: c */
    public C0899c mo3857c() {
        C0899c b = mo3873j();
        b.f2836a = true;
        return b;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0899c);
    }

    /* renamed from: d */
    public C0855h mo3859d() {
        return this.f2826c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public boolean mo3861e() {
        return this.f2830g != null && this.f2830g.mo3833f();
    }

    /* renamed from: f */
    public boolean mo3862f() {
        return this.f2830g != null && this.f2830g.mo3834g();
    }

    /* renamed from: g */
    public boolean mo3863g() {
        return this.f2830g != null && this.f2830g.mo3837j();
    }

    public Menu getMenu() {
        if (this.f2826c == null) {
            Context context = getContext();
            this.f2826c = new C0855h(context);
            this.f2826c.mo3484a((C0856a) new C0900d());
            this.f2830g = new ActionMenuPresenter(context);
            this.f2830g.mo3830c(true);
            this.f2830g.mo323a(this.f2831h != null ? this.f2831h : new C0898b());
            this.f2826c.mo3487a((C0871o) this.f2830g, this.f2827d);
            this.f2830g.mo3829a(this);
        }
        return this.f2826c;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f2830g.mo3832e();
    }

    public int getPopupTheme() {
        return this.f2828e;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean mo3871h() {
        return this.f2830g != null && this.f2830g.mo3838k();
    }

    /* renamed from: i */
    public void mo3872i() {
        if (this.f2830g != null) {
            this.f2830g.mo3835h();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2830g != null) {
            this.f2830g.mo325a(false);
            if (this.f2830g.mo3837j()) {
                this.f2830g.mo3834g();
                this.f2830g.mo3833f();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3872i();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f2832i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C1094bs.m6004a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0899c cVar = (C0899c) childAt.getLayoutParams();
                if (cVar.f2836a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo3853a(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean a2 = mo3853a(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C0899c cVar2 = (C0899c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f2836a) {
                    int i19 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i6++;
            }
        } else {
            int paddingLeft = getPaddingLeft();
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                C0899c cVar3 = (C0899c) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !cVar3.f2836a) {
                    int i21 = paddingLeft + cVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i22 = i9 - (measuredHeight4 / 2);
                    childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                    paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
                }
                i6++;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.f2832i;
        this.f2832i = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f2832i) {
            this.f2833j = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.f2832i || this.f2826c == null || size == this.f2833j)) {
            this.f2833j = size;
            this.f2826c.mo359a(true);
        }
        int childCount = getChildCount();
        if (!this.f2832i || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0899c cVar = (C0899c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m4363c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2830g.mo3831d(z);
    }

    public void setOnMenuItemClickListener(C0901e eVar) {
        this.f2825b = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f2830g.mo3828a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f2829f = z;
    }

    public void setPopupTheme(int i) {
        if (this.f2828e != i) {
            this.f2828e = i;
            if (i == 0) {
                this.f2827d = getContext();
            } else {
                this.f2827d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f2830g = actionMenuPresenter;
        this.f2830g.mo3829a(this);
    }
}
