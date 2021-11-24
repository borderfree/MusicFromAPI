package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout.C0131b;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.widget.C0721s;
import android.support.p009v4.widget.C0721s.C0724a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class SwipeDismissBehavior<V extends View> extends C0131b<V> {

    /* renamed from: a */
    private boolean f385a;

    /* renamed from: b */
    C0721s f386b;

    /* renamed from: c */
    C0144a f387c;

    /* renamed from: d */
    int f388d = 2;

    /* renamed from: e */
    float f389e = 0.5f;

    /* renamed from: f */
    float f390f = 0.0f;

    /* renamed from: g */
    float f391g = 0.5f;

    /* renamed from: h */
    private float f392h = 0.0f;

    /* renamed from: i */
    private boolean f393i;

    /* renamed from: j */
    private final C0724a f394j = new C0724a() {

        /* renamed from: b */
        private int f396b;

        /* renamed from: c */
        private int f397c = -1;

        /* renamed from: a */
        private boolean m577a(View view, float f) {
            boolean z = false;
            if (f != 0.0f) {
                boolean z2 = C0626s.m2861e(view) == 1;
                if (SwipeDismissBehavior.this.f388d == 2) {
                    return true;
                }
                if (SwipeDismissBehavior.this.f388d == 0) {
                    return z2 ? z : z;
                    z = true;
                }
                if (SwipeDismissBehavior.this.f388d == 1) {
                    if (z2) {
                    }
                    z = true;
                }
                return z;
            }
            if (Math.abs(view.getLeft() - this.f396b) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f389e)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public int mo455a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo456a(int i) {
            if (SwipeDismissBehavior.this.f387c != null) {
                SwipeDismissBehavior.this.f387c.mo656a(i);
            }
        }

        /* renamed from: a */
        public void mo457a(View view, float f, float f2) {
            boolean z;
            int i;
            this.f397c = -1;
            int width = view.getWidth();
            if (m577a(view, f)) {
                i = view.getLeft() < this.f396b ? this.f396b - width : this.f396b + width;
                z = true;
            } else {
                i = this.f396b;
                z = false;
            }
            if (SwipeDismissBehavior.this.f386b.mo2917a(i, view.getTop())) {
                C0626s.m2847a(view, (Runnable) new C0145b(view, z));
            } else if (z && SwipeDismissBehavior.this.f387c != null) {
                SwipeDismissBehavior.this.f387c.mo657a(view);
            }
        }

        /* renamed from: a */
        public void mo458a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f396b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f390f);
            float width2 = ((float) this.f396b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f391g);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m566a(0.0f, 1.0f - SwipeDismissBehavior.m569b(width, width2, f), 1.0f));
            }
        }

        /* renamed from: a */
        public boolean mo459a(View view, int i) {
            return this.f397c == -1 && SwipeDismissBehavior.this.mo652a(view);
        }

        /* renamed from: b */
        public int mo654b(View view) {
            return view.getWidth();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f396b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo460b(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = android.support.p009v4.view.C0626s.m2861e(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                android.support.design.widget.SwipeDismissBehavior r1 = android.support.design.widget.SwipeDismissBehavior.this
                int r1 = r1.f388d
                if (r1 != 0) goto L_0x0026
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f396b
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f396b
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f396b
            L_0x001e:
                int r0 = r2.f396b
                int r3 = r3.getWidth()
                int r3 = r3 + r0
                goto L_0x0037
            L_0x0026:
                android.support.design.widget.SwipeDismissBehavior r1 = android.support.design.widget.SwipeDismissBehavior.this
                int r1 = r1.f388d
                if (r1 != r0) goto L_0x002f
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x002f:
                int r5 = r2.f396b
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                goto L_0x001e
            L_0x0037:
                int r3 = android.support.design.widget.SwipeDismissBehavior.m567a(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.C01431.mo460b(android.view.View, int, int):int");
        }

        /* renamed from: b */
        public void mo655b(View view, int i) {
            this.f397c = i;
            this.f396b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    };

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$a */
    public interface C0144a {
        /* renamed from: a */
        void mo656a(int i);

        /* renamed from: a */
        void mo657a(View view);
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$b */
    private class C0145b implements Runnable {

        /* renamed from: b */
        private final View f399b;

        /* renamed from: c */
        private final boolean f400c;

        C0145b(View view, boolean z) {
            this.f399b = view;
            this.f400c = z;
        }

        public void run() {
            if (SwipeDismissBehavior.this.f386b != null && SwipeDismissBehavior.this.f386b.mo2920a(true)) {
                C0626s.m2847a(this.f399b, (Runnable) this);
            } else if (this.f400c && SwipeDismissBehavior.this.f387c != null) {
                SwipeDismissBehavior.this.f387c.mo657a(this.f399b);
            }
        }
    }

    /* renamed from: a */
    static float m566a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m567a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    private void m568a(ViewGroup viewGroup) {
        if (this.f386b == null) {
            this.f386b = this.f393i ? C0721s.m3350a(viewGroup, this.f392h, this.f394j) : C0721s.m3351a(viewGroup, this.f394j);
        }
    }

    /* renamed from: b */
    static float m569b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public void mo649a(float f) {
        this.f390f = m566a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    public void mo650a(int i) {
        this.f388d = i;
    }

    /* renamed from: a */
    public void mo651a(C0144a aVar) {
        this.f387c = aVar;
    }

    /* renamed from: a */
    public boolean mo445a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f385a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    this.f385a = coordinatorLayout.mo488a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                    z = this.f385a;
                    break;
                case 1:
                    break;
            }
        }
        this.f385a = false;
        if (!z) {
            return false;
        }
        m568a((ViewGroup) coordinatorLayout);
        return this.f386b.mo2918a(motionEvent);
    }

    /* renamed from: a */
    public boolean mo652a(View view) {
        return true;
    }

    /* renamed from: b */
    public void mo653b(float f) {
        this.f391g = m566a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    public boolean mo451b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f386b == null) {
            return false;
        }
        this.f386b.mo2922b(motionEvent);
        return true;
    }
}
