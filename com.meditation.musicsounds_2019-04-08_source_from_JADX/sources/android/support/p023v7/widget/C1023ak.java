package android.support.p023v7.widget;

import android.os.SystemClock;
import android.support.p023v7.view.menu.C0877s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.ak */
public abstract class C1023ak implements OnAttachStateChangeListener, OnTouchListener {

    /* renamed from: a */
    private final float f3523a;

    /* renamed from: b */
    private final int f3524b;

    /* renamed from: c */
    final View f3525c;

    /* renamed from: d */
    private final int f3526d;

    /* renamed from: e */
    private Runnable f3527e;

    /* renamed from: f */
    private Runnable f3528f;

    /* renamed from: g */
    private boolean f3529g;

    /* renamed from: h */
    private int f3530h;

    /* renamed from: i */
    private final int[] f3531i = new int[2];

    /* renamed from: android.support.v7.widget.ak$a */
    private class C1024a implements Runnable {
        C1024a() {
        }

        public void run() {
            ViewParent parent = C1023ak.this.f3525c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ak$b */
    private class C1025b implements Runnable {
        C1025b() {
        }

        public void run() {
            C1023ak.this.mo5062d();
        }
    }

    public C1023ak(View view) {
        this.f3525c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3523a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3524b = ViewConfiguration.getTapTimeout();
        this.f3526d = (this.f3524b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m5570a(MotionEvent motionEvent) {
        View view = this.f3525c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f3530h = motionEvent.getPointerId(0);
                if (this.f3527e == null) {
                    this.f3527e = new C1024a();
                }
                view.postDelayed(this.f3527e, (long) this.f3524b);
                if (this.f3528f == null) {
                    this.f3528f = new C1025b();
                }
                view.postDelayed(this.f3528f, (long) this.f3526d);
                break;
            case 1:
            case 3:
                m5575e();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f3530h);
                if (findPointerIndex >= 0 && !m5571a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f3523a)) {
                    m5575e();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5571a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m5572a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3531i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private boolean m5573b(MotionEvent motionEvent) {
        View view = this.f3525c;
        C0877s a = mo3365a();
        if (a != null && a.mo3442f()) {
            C1012ah ahVar = (C1012ah) a.mo3443g();
            if (ahVar != null && ahVar.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                m5574b(view, obtainNoHistory);
                m5572a(ahVar, obtainNoHistory);
                boolean a2 = ahVar.mo5036a(obtainNoHistory, this.f3530h);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z = true;
                boolean z2 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!a2 || !z2) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m5574b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3531i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: e */
    private void m5575e() {
        if (this.f3528f != null) {
            this.f3525c.removeCallbacks(this.f3528f);
        }
        if (this.f3527e != null) {
            this.f3525c.removeCallbacks(this.f3527e);
        }
    }

    /* renamed from: a */
    public abstract C0877s mo3365a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo3366b() {
        C0877s a = mo3365a();
        if (a != null && !a.mo3442f()) {
            a.mo3440d();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3848c() {
        C0877s a = mo3365a();
        if (a != null && a.mo3442f()) {
            a.mo3441e();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5062d() {
        m5575e();
        View view = this.f3525c;
        if (view.isEnabled() && !view.isLongClickable() && mo3366b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f3529g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f3529g;
        if (z2) {
            z = m5573b(motionEvent) || !mo3848c();
        } else {
            z = m5570a(motionEvent) && mo3366b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3525c.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f3529g = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f3529g = false;
        this.f3530h = -1;
        if (this.f3527e != null) {
            this.f3525c.removeCallbacks(this.f3527e);
        }
    }
}
