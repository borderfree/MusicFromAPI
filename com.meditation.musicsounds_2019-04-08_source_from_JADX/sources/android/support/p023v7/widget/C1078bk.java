package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p009v4.content.p015a.C0447b;
import android.support.p009v4.content.p015a.C0447b.C0448a;
import android.support.p023v7.p026c.p027a.C0817b;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.bk */
public class C1078bk {

    /* renamed from: a */
    private final Context f3750a;

    /* renamed from: b */
    private final TypedArray f3751b;

    /* renamed from: c */
    private TypedValue f3752c;

    private C1078bk(Context context, TypedArray typedArray) {
        this.f3750a = context;
        this.f3751b = typedArray;
    }

    /* renamed from: a */
    public static C1078bk m5879a(Context context, int i, int[] iArr) {
        return new C1078bk(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C1078bk m5880a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1078bk(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C1078bk m5881a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C1078bk(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float mo5354a(int i, float f) {
        return this.f3751b.getFloat(i, f);
    }

    /* renamed from: a */
    public int mo5355a(int i, int i2) {
        return this.f3751b.getInt(i, i2);
    }

    /* renamed from: a */
    public Typeface mo5356a(int i, int i2, C0448a aVar) {
        int resourceId = this.f3751b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3752c == null) {
            this.f3752c = new TypedValue();
        }
        return C0447b.m2042a(this.f3750a, resourceId, this.f3752c, i2, aVar);
    }

    /* renamed from: a */
    public Drawable mo5357a(int i) {
        if (this.f3751b.hasValue(i)) {
            int resourceId = this.f3751b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0817b.m3884b(this.f3750a, resourceId);
            }
        }
        return this.f3751b.getDrawable(i);
    }

    /* renamed from: a */
    public void mo5358a() {
        this.f3751b.recycle();
    }

    /* renamed from: a */
    public boolean mo5359a(int i, boolean z) {
        return this.f3751b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo5360b(int i, int i2) {
        return this.f3751b.getColor(i, i2);
    }

    /* renamed from: b */
    public Drawable mo5361b(int i) {
        if (this.f3751b.hasValue(i)) {
            int resourceId = this.f3751b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C1111k.m6081a().mo5491a(this.f3750a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: c */
    public int mo5362c(int i, int i2) {
        return this.f3751b.getInteger(i, i2);
    }

    /* renamed from: c */
    public CharSequence mo5363c(int i) {
        return this.f3751b.getText(i);
    }

    /* renamed from: d */
    public int mo5364d(int i, int i2) {
        return this.f3751b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public String mo5365d(int i) {
        return this.f3751b.getString(i);
    }

    /* renamed from: e */
    public int mo5366e(int i, int i2) {
        return this.f3751b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: e */
    public ColorStateList mo5367e(int i) {
        if (this.f3751b.hasValue(i)) {
            int resourceId = this.f3751b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0817b.m3881a(this.f3750a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f3751b.getColorStateList(i);
    }

    /* renamed from: f */
    public int mo5368f(int i, int i2) {
        return this.f3751b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo5369f(int i) {
        return this.f3751b.getTextArray(i);
    }

    /* renamed from: g */
    public int mo5370g(int i, int i2) {
        return this.f3751b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean mo5371g(int i) {
        return this.f3751b.hasValue(i);
    }
}
