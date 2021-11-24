package android.support.p023v7.widget;

import android.content.Context;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.widget.C1031an.C1032a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.AlertDialogLayout */
public class AlertDialogLayout extends C1031an {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m4403a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: c */
    private static int m4404c(View view) {
        int j = C0626s.m2867j(view);
        if (j > 0) {
            return j;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m4404c(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* renamed from: c */
    private boolean m4405c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C0732f.topPanel) {
                    view = childAt;
                } else if (id == C0732f.buttonPanel) {
                    view2 = childAt;
                } else if ((id != C0732f.contentPanel && id != C0732f.customPanel) || view3 != null) {
                    return false;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i7, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i7, 0);
            i5 = m4404c(view2);
            i4 = view2.getMeasuredHeight() - i5;
            paddingTop += i5;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (view3 != null) {
            view3.measure(i7, mode == 0 ? 0 : MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i10 = size - paddingTop;
        if (view2 != null) {
            int i11 = paddingTop - i5;
            int min = Math.min(i10, i4);
            if (min > 0) {
                i10 -= min;
                i5 += min;
            }
            view2.measure(i7, MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingTop = i11 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i10 > 0) {
            int i12 = paddingTop - i6;
            view3.measure(i7, MeasureSpec.makeMeasureSpec(i6 + i10, mode));
            paddingTop = i12 + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                i13 = Math.max(i13, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i13 + getPaddingLeft() + getPaddingRight(), i7, i3), View.resolveSizeAndState(paddingTop, i8, 0));
        if (mode2 != 1073741824) {
            m4406d(childCount, i8);
        }
        return true;
    }

    /* renamed from: d */
    private void m4406d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C1032a aVar = (C1032a) childAt.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r2 = r21 - r19
            int r3 = r17.getPaddingRight()
            int r8 = r2 - r3
            int r2 = r2 - r7
            int r3 = r17.getPaddingRight()
            int r9 = r2 - r3
            int r2 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r3 = r17.getGravity()
            r4 = r3 & 112(0x70, float:1.57E-43)
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r3 & r5
            r3 = 16
            if (r4 == r3) goto L_0x0040
            r3 = 80
            if (r4 == r3) goto L_0x0035
            int r0 = r17.getPaddingTop()
            goto L_0x004a
        L_0x0035:
            int r3 = r17.getPaddingTop()
            int r3 = r3 + r22
            int r3 = r3 - r20
            int r0 = r3 - r2
            goto L_0x004a
        L_0x0040:
            int r3 = r17.getPaddingTop()
            int r0 = r22 - r20
            int r0 = r0 - r2
            int r0 = r0 / 2
            int r0 = r0 + r3
        L_0x004a:
            android.graphics.drawable.Drawable r1 = r17.getDividerDrawable()
            r2 = 0
            if (r1 != 0) goto L_0x0053
            r12 = 0
            goto L_0x0058
        L_0x0053:
            int r1 = r1.getIntrinsicHeight()
            r12 = r1
        L_0x0058:
            r13 = 0
        L_0x0059:
            if (r13 >= r10) goto L_0x00bc
            android.view.View r1 = r6.getChildAt(r13)
            if (r1 == 0) goto L_0x00b9
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x00b9
            int r4 = r1.getMeasuredWidth()
            int r14 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r15 = r2
            android.support.v7.widget.an$a r15 = (android.support.p023v7.widget.C1031an.C1032a) r15
            int r2 = r15.f3574h
            if (r2 >= 0) goto L_0x007d
            r2 = r11
        L_0x007d:
            int r3 = android.support.p009v4.view.C0626s.m2861e(r17)
            int r2 = android.support.p009v4.view.C0604d.m2741a(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L_0x0094
            r3 = 5
            if (r2 == r3) goto L_0x0091
            int r2 = r15.leftMargin
            int r2 = r2 + r7
            goto L_0x009f
        L_0x0091:
            int r2 = r8 - r4
            goto L_0x009c
        L_0x0094:
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r7
            int r3 = r15.leftMargin
            int r2 = r2 + r3
        L_0x009c:
            int r3 = r15.rightMargin
            int r2 = r2 - r3
        L_0x009f:
            boolean r3 = r6.mo5096c(r13)
            if (r3 == 0) goto L_0x00a6
            int r0 = r0 + r12
        L_0x00a6:
            int r3 = r15.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r5 = r14
            r0.m4403a(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r14 = r14 + r0
            int r16 = r16 + r14
            r0 = r16
        L_0x00b9:
            int r13 = r13 + 1
            goto L_0x0059
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!m4405c(i, i2)) {
            super.onMeasure(i, i2);
        }
    }
}
