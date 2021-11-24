package com.seattleclouds.modules.pollpage.Pacpie;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.seattleclouds.modules.pollpage.Pacpie.a */
public final class C6167a extends Animation {

    /* renamed from: a */
    public static final boolean f21866a = (Integer.valueOf(VERSION.SDK).intValue() < 11);

    /* renamed from: b */
    private static final WeakHashMap<View, C6167a> f21867b = new WeakHashMap<>();

    /* renamed from: c */
    private final WeakReference<View> f21868c;

    /* renamed from: d */
    private final Camera f21869d = new Camera();

    /* renamed from: e */
    private boolean f21870e;

    /* renamed from: f */
    private float f21871f = 1.0f;

    /* renamed from: g */
    private float f21872g;

    /* renamed from: h */
    private float f21873h;

    /* renamed from: i */
    private float f21874i;

    /* renamed from: j */
    private float f21875j;

    /* renamed from: k */
    private float f21876k;

    /* renamed from: l */
    private float f21877l = 1.0f;

    /* renamed from: m */
    private float f21878m = 1.0f;

    /* renamed from: n */
    private float f21879n;

    /* renamed from: o */
    private float f21880o;

    /* renamed from: p */
    private final RectF f21881p = new RectF();

    /* renamed from: q */
    private final RectF f21882q = new RectF();

    /* renamed from: r */
    private final Matrix f21883r = new Matrix();

    private C6167a(View view) {
        setDuration(0);
        setFillAfter(true);
        view.setAnimation(this);
        this.f21868c = new WeakReference<>(view);
    }

    /* renamed from: a */
    public static C6167a m30049a(View view) {
        C6167a aVar = (C6167a) f21867b.get(view);
        if (aVar != null && aVar == view.getAnimation()) {
            return aVar;
        }
        C6167a aVar2 = new C6167a(view);
        f21867b.put(view, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private void m30050a() {
        View view = (View) this.f21868c.get();
        if (view != null) {
            m30052a(this.f21881p, view);
        }
    }

    /* renamed from: a */
    private void m30051a(Matrix matrix, View view) {
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        boolean z = this.f21870e;
        float f = z ? this.f21872g : width / 2.0f;
        float f2 = z ? this.f21873h : height / 2.0f;
        float f3 = this.f21874i;
        float f4 = this.f21875j;
        float f5 = this.f21876k;
        if (!(f3 == 0.0f && f4 == 0.0f && f5 == 0.0f)) {
            Camera camera = this.f21869d;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.f21877l;
        float f7 = this.f21878m;
        if (!(f6 == 1.0f && f7 == 1.0f)) {
            matrix.postScale(f6, f7);
            matrix.postTranslate((-(f / width)) * ((f6 * width) - width), (-(f2 / height)) * ((f7 * height) - height));
        }
        matrix.postTranslate(this.f21879n, this.f21880o);
    }

    /* renamed from: a */
    private void m30052a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        Matrix matrix = this.f21883r;
        matrix.reset();
        m30051a(matrix, view);
        this.f21883r.mapRect(rectF);
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        if (rectF.right < rectF.left) {
            float f = rectF.right;
            rectF.right = rectF.left;
            rectF.left = f;
        }
        if (rectF.bottom < rectF.top) {
            float f2 = rectF.top;
            rectF.top = rectF.bottom;
            rectF.bottom = f2;
        }
    }

    /* renamed from: b */
    private void m30053b() {
        View view = (View) this.f21868c.get();
        if (view != null && view.getParent() != null) {
            RectF rectF = this.f21882q;
            m30052a(rectF, view);
            rectF.union(this.f21881p);
            ((View) view.getParent()).invalidate((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
    }

    /* renamed from: a */
    public void mo19386a(float f) {
        if (this.f21876k != f) {
            m30050a();
            this.f21876k = f;
            m30053b();
        }
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        View view = (View) this.f21868c.get();
        if (view != null) {
            transformation.setAlpha(this.f21871f);
            m30051a(transformation.getMatrix(), view);
        }
    }

    /* renamed from: b */
    public void mo19388b(float f) {
        if (this.f21877l != f) {
            m30050a();
            this.f21877l = f;
            m30053b();
        }
    }

    /* renamed from: c */
    public void mo19389c(float f) {
        if (this.f21878m != f) {
            m30050a();
            this.f21878m = f;
            m30053b();
        }
    }
}
