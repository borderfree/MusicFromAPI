package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout.C0134e;
import android.support.p009v4.p014c.C0430a;
import android.support.p009v4.view.C0591aa;
import android.support.p009v4.view.C0604d;
import android.support.p009v4.view.C0626s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

/* renamed from: android.support.design.widget.j */
abstract class C0199j extends C0212r<View> {

    /* renamed from: a */
    final Rect f618a = new Rect();

    /* renamed from: b */
    final Rect f619b = new Rect();

    /* renamed from: c */
    private int f620c = 0;

    /* renamed from: d */
    private int f621d;

    public C0199j() {
    }

    public C0199j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private static int m785c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo430a(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo916a() {
        return this.f620c;
    }

    /* renamed from: a */
    public boolean mo412a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View b = mo435b(coordinatorLayout.mo495c(view));
            if (b != null) {
                if (!C0626s.m2873p(b) || C0626s.m2873p(view)) {
                    View view2 = view;
                } else {
                    View view3 = view;
                    C0626s.m2855b(view, true);
                    if (C0626s.m2873p(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.mo482a(view, i, i2, MeasureSpec.makeMeasureSpec((size - b.getMeasuredHeight()) + mo434b(b), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo434b(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract View mo435b(List<View> list);

    /* renamed from: b */
    public final void mo917b(int i) {
        this.f621d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo918b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View b = mo435b(coordinatorLayout.mo495c(view));
        if (b != null) {
            C0134e eVar = (C0134e) view.getLayoutParams();
            Rect rect = this.f618a;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, b.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + b.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            C0591aa lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0626s.m2873p(coordinatorLayout) && !C0626s.m2873p(view)) {
                rect.left += lastWindowInsets.mo2413a();
                rect.right -= lastWindowInsets.mo2416c();
            }
            Rect rect2 = this.f619b;
            C0604d.m2742a(m785c(eVar.f340c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c = mo919c(b);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            i2 = rect2.top - b.getBottom();
        } else {
            super.mo918b(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f620c = i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo919c(View view) {
        if (this.f621d == 0) {
            return 0;
        }
        return C0430a.m1985a((int) (mo430a(view) * ((float) this.f621d)), 0, this.f621d);
    }

    /* renamed from: d */
    public final int mo920d() {
        return this.f621d;
    }
}
