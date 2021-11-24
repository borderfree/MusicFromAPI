package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.C0626s;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.transition.aj */
class C0240aj implements C0243al {

    /* renamed from: a */
    protected C0241a f706a;

    /* renamed from: android.support.transition.aj$a */
    static class C0241a extends ViewGroup {

        /* renamed from: a */
        static Method f707a;

        /* renamed from: b */
        ViewGroup f708b;

        /* renamed from: c */
        View f709c;

        /* renamed from: d */
        ArrayList<Drawable> f710d = null;

        /* renamed from: e */
        C0240aj f711e;

        static {
            try {
                f707a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C0241a(Context context, ViewGroup viewGroup, View view, C0240aj ajVar) {
            super(context);
            this.f708b = viewGroup;
            this.f709c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f711e = ajVar;
        }

        /* renamed from: a */
        private void m931a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f708b.getLocationOnScreen(iArr2);
            this.f709c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo985a(Drawable drawable) {
            if (this.f710d == null) {
                this.f710d = new ArrayList<>();
            }
            if (!this.f710d.contains(drawable)) {
                this.f710d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: a */
        public void mo986a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f708b || viewGroup.getParent() == null || !C0626s.m2883z(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f708b.getLocationOnScreen(iArr2);
                    C0626s.m2862e(view, iArr[0] - iArr2[0]);
                    C0626s.m2860d(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo987a() {
            return getChildCount() == 0 && (this.f710d == null || this.f710d.size() == 0);
        }

        /* renamed from: b */
        public void mo988b(Drawable drawable) {
            if (this.f710d != null) {
                this.f710d.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* renamed from: b */
        public void mo989b(View view) {
            super.removeView(view);
            if (mo987a()) {
                this.f708b.removeView(this);
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f708b.getLocationOnScreen(iArr);
            this.f709c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f709c.getWidth(), this.f709c.getHeight()));
            super.dispatchDraw(canvas);
            int size = this.f710d == null ? 0 : this.f710d.size();
            for (int i = 0; i < size; i++) {
                ((Drawable) this.f710d.get(i)).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f708b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f708b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m931a(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            return super.verifyDrawable(drawable) || (this.f710d != null && this.f710d.contains(drawable));
        }
    }

    C0240aj(Context context, ViewGroup viewGroup, View view) {
        this.f706a = new C0241a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static ViewGroup m927c(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: d */
    static C0240aj m928d(View view) {
        ViewGroup c = m927c(view);
        if (c == null) {
            return null;
        }
        int childCount = c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c.getChildAt(i);
            if (childAt instanceof C0241a) {
                return ((C0241a) childAt).f711e;
            }
        }
        return new C0232ac(c.getContext(), c, view);
    }

    /* renamed from: a */
    public void mo980a(Drawable drawable) {
        this.f706a.mo985a(drawable);
    }

    /* renamed from: b */
    public void mo981b(Drawable drawable) {
        this.f706a.mo988b(drawable);
    }
}
