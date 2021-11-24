package android.support.transition;

import android.graphics.Matrix;
import android.support.transition.C0290r.C0291a;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.transition.an */
class C0247an implements C0252as {
    C0247an() {
    }

    /* renamed from: a */
    public C0243al mo1004a(View view) {
        return C0240aj.m928d(view);
    }

    /* renamed from: a */
    public void mo1005a(View view, float f) {
        Float f2 = (Float) view.getTag(C0291a.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    public void mo1006a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    /* renamed from: a */
    public void mo1007a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo1007a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: b */
    public C0259aw mo1008b(View view) {
        return new C0257au(view.getWindowToken());
    }

    /* renamed from: b */
    public void mo1009b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo1009b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: c */
    public float mo1010c(View view) {
        Float f = (Float) view.getTag(C0291a.save_non_transition_alpha);
        return f != null ? view.getAlpha() / f.floatValue() : view.getAlpha();
    }

    /* renamed from: d */
    public void mo1011d(View view) {
        if (view.getTag(C0291a.save_non_transition_alpha) == null) {
            view.setTag(C0291a.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo1012e(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0291a.save_non_transition_alpha, null);
        }
    }
}
