package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.m */
class C0285m<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f789a;

    /* renamed from: b */
    private final PathMeasure f790b;

    /* renamed from: c */
    private final float f791c;

    /* renamed from: d */
    private final float[] f792d = new float[2];

    /* renamed from: e */
    private final PointF f793e = new PointF();

    /* renamed from: f */
    private float f794f;

    C0285m(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f789a = property;
        this.f790b = new PathMeasure(path, false);
        this.f791c = this.f790b.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f794f);
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f794f = f.floatValue();
        this.f790b.getPosTan(this.f791c * f.floatValue(), this.f792d, null);
        this.f793e.x = this.f792d[0];
        this.f793e.y = this.f792d[1];
        this.f789a.set(t, this.f793e);
    }
}
