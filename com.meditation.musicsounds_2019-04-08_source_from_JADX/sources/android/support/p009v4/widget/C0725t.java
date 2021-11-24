package android.support.p009v4.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: android.support.v4.widget.t */
public class C0725t {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f2080a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f2081b = new ThreadLocal<>();

    /* renamed from: a */
    static void m3402a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f2080a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f2080a.set(matrix);
        } else {
            matrix.reset();
        }
        m3403a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f2081b.get();
        if (rectF == null) {
            rectF = new RectF();
            f2081b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m3403a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m3403a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    public static void m3404b(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m3402a(viewGroup, view, rect);
    }
}
