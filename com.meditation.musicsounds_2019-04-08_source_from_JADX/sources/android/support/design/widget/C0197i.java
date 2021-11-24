package android.support.design.widget;

import android.content.Context;
import android.support.p009v4.p014c.C0430a;
import android.support.p009v4.view.C0626s;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* renamed from: android.support.design.widget.i */
abstract class C0197i<V extends View> extends C0212r<V> {

    /* renamed from: a */
    OverScroller f608a;

    /* renamed from: b */
    private Runnable f609b;

    /* renamed from: c */
    private boolean f610c;

    /* renamed from: d */
    private int f611d = -1;

    /* renamed from: e */
    private int f612e;

    /* renamed from: f */
    private int f613f = -1;

    /* renamed from: g */
    private VelocityTracker f614g;

    /* renamed from: android.support.design.widget.i$a */
    private class C0198a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f616b;

        /* renamed from: c */
        private final V f617c;

        C0198a(CoordinatorLayout coordinatorLayout, V v) {
            this.f616b = coordinatorLayout;
            this.f617c = v;
        }

        public void run() {
            if (this.f617c != null && C0197i.this.f608a != null) {
                if (C0197i.this.f608a.computeScrollOffset()) {
                    C0197i.this.mo913a_(this.f616b, this.f617c, C0197i.this.f608a.getCurrY());
                    C0626s.m2847a((View) this.f617c, (Runnable) this);
                    return;
                }
                C0197i.this.mo401a(this.f616b, this.f617c);
            }
        }
    }

    public C0197i() {
    }

    public C0197i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    private void m773d() {
        if (this.f614g == null) {
            this.f614g = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo392a() {
        return mo414b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo394a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b = mo414b();
        if (i2 != 0 && b >= i2 && b <= i3) {
            int a = C0430a.m1985a(i, i2, i3);
            if (b != a) {
                mo406a(a);
                return b - a;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo395a(V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo401a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo912a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        if (this.f609b != null) {
            v.removeCallbacks(this.f609b);
            this.f609b = null;
        }
        if (this.f608a == null) {
            this.f608a = new OverScroller(v.getContext());
        }
        this.f608a.fling(0, mo414b(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f608a.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            this.f609b = new C0198a(coordinatorLayout, v);
            C0626s.m2847a((View) v, this.f609b);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo401a(coordinatorLayout, v);
        return false;
    }

    /* renamed from: a */
    public boolean mo445a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f613f < 0) {
            this.f613f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f610c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f610c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo420c(v) && coordinatorLayout.mo488a((View) v, x, y)) {
                    this.f612e = y;
                    this.f611d = motionEvent.getPointerId(0);
                    m773d();
                    break;
                }
            case 1:
            case 3:
                this.f610c = false;
                this.f611d = -1;
                if (this.f614g != null) {
                    this.f614g.recycle();
                    this.f614g = null;
                    break;
                }
                break;
            case 2:
                int i = this.f611d;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex != -1) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y2 - this.f612e) > this.f613f) {
                            this.f610c = true;
                            this.f612e = y2;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.f614g != null) {
            this.f614g.addMovement(motionEvent);
        }
        return this.f610c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a_ */
    public int mo913a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo394a(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo914b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo394a(coordinatorLayout, v, mo392a() - i, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo416b(V v) {
        return -v.getHeight();
    }

    /* renamed from: b */
    public boolean mo451b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f613f < 0) {
            this.f613f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.mo488a((View) v, (int) motionEvent.getX(), y) && mo420c(v)) {
                    this.f612e = y;
                    this.f611d = motionEvent.getPointerId(0);
                    m773d();
                    break;
                } else {
                    return false;
                }
            case 1:
                if (this.f614g != null) {
                    this.f614g.addMovement(motionEvent);
                    this.f614g.computeCurrentVelocity(1000);
                    mo912a(coordinatorLayout, v, -mo395a(v), 0, this.f614g.getYVelocity(this.f611d));
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f611d);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i = this.f612e - y2;
                    if (!this.f610c && Math.abs(i) > this.f613f) {
                        this.f610c = true;
                        i = i > 0 ? i - this.f613f : i + this.f613f;
                    }
                    int i2 = i;
                    if (this.f610c) {
                        this.f612e = y2;
                        mo914b(coordinatorLayout, v, i2, mo416b(v), 0);
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                break;
        }
        this.f610c = false;
        this.f611d = -1;
        if (this.f614g != null) {
            this.f614g.recycle();
            this.f614g = null;
        }
        if (this.f614g != null) {
            this.f614g.addMovement(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo420c(V v) {
        return false;
    }
}
