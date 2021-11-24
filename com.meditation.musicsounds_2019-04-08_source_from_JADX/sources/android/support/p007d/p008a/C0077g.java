package android.support.p007d.p008a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.p009v4.content.p015a.C0451c;
import android.support.p009v4.p010a.C0321b;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.d.a.g */
public class C0077g implements Interpolator {

    /* renamed from: a */
    private float[] f133a;

    /* renamed from: b */
    private float[] f134b;

    public C0077g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public C0077g(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0451c.m2052a(resources, theme, attributeSet, C0066a.f117l);
        m211a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m209a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m212a(path);
    }

    /* renamed from: a */
    private void m210a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m212a(path);
    }

    /* renamed from: a */
    private void m211a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0451c.m2055a(xmlPullParser, "pathData")) {
            String a = C0451c.m2053a(typedArray, xmlPullParser, "pathData", 4);
            Path a2 = C0321b.m1203a(a);
            if (a2 != null) {
                m212a(a2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The path is null, which is created from ");
            sb.append(a);
            throw new InflateException(sb.toString());
        } else if (!C0451c.m2055a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0451c.m2055a(xmlPullParser, "controlY1")) {
            float a3 = C0451c.m2050a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float a4 = C0451c.m2050a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a5 = C0451c.m2055a(xmlPullParser, "controlX2");
            if (a5 != C0451c.m2055a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a5) {
                m209a(a3, a4);
            } else {
                m210a(a3, a4, C0451c.m2050a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0451c.m2050a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    /* renamed from: a */
    private void m212a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f133a = new float[min];
            this.f134b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.f133a[i2] = fArr[0];
                this.f134b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f133a[0])) <= 1.0E-5d && ((double) Math.abs(this.f134b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f133a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f134b[i3] - 1.0f)) <= 1.0E-5d) {
                    int i4 = 0;
                    float f = 0.0f;
                    while (i < min) {
                        int i5 = i4 + 1;
                        float f2 = this.f133a[i4];
                        if (f2 >= f) {
                            this.f133a[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("The Path cannot loop back on itself, x :");
                            sb.append(f2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.f133a[0]);
            sb2.append(",");
            sb2.append(this.f134b[0]);
            sb2.append(" end:");
            int i6 = min - 1;
            sb2.append(this.f133a[i6]);
            sb2.append(",");
            sb2.append(this.f134b[i6]);
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("The Path has a invalid length ");
        sb3.append(length);
        throw new IllegalArgumentException(sb3.toString());
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f133a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f133a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f133a[length] - this.f133a[i];
        if (f2 == 0.0f) {
            return this.f134b[i];
        }
        float f3 = (f - this.f133a[i]) / f2;
        float f4 = this.f134b[i];
        return f4 + (f3 * (this.f134b[length] - f4));
    }
}
