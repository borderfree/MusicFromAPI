package android.support.p007d.p008a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.p009v4.content.p015a.C0451c;
import android.support.p009v4.p010a.C0321b;
import android.support.p009v4.p010a.C0321b.C0323b;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.p019g.C0488a;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.d.a.i */
public class C0079i extends C0078h {

    /* renamed from: a */
    static final Mode f136a = Mode.SRC_IN;

    /* renamed from: c */
    private C0085f f137c;

    /* renamed from: d */
    private PorterDuffColorFilter f138d;

    /* renamed from: e */
    private ColorFilter f139e;

    /* renamed from: f */
    private boolean f140f;

    /* renamed from: g */
    private boolean f141g;

    /* renamed from: h */
    private ConstantState f142h;

    /* renamed from: i */
    private final float[] f143i;

    /* renamed from: j */
    private final Matrix f144j;

    /* renamed from: k */
    private final Rect f145k;

    /* renamed from: android.support.d.a.i$a */
    private static class C0080a extends C0083d {
        public C0080a() {
        }

        public C0080a(C0080a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        private void m223a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f173n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f172m = C0321b.m1210b(string2);
            }
        }

        /* renamed from: a */
        public void mo208a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0451c.m2055a(xmlPullParser, "pathData")) {
                TypedArray a = C0451c.m2052a(resources, theme, attributeSet, C0066a.f109d);
                m223a(a);
                a.recycle();
            }
        }

        /* renamed from: a */
        public boolean mo209a() {
            return true;
        }
    }

    /* renamed from: android.support.d.a.i$b */
    private static class C0081b extends C0083d {

        /* renamed from: a */
        int f146a = 0;

        /* renamed from: b */
        float f147b = 0.0f;

        /* renamed from: c */
        int f148c = 0;

        /* renamed from: d */
        float f149d = 1.0f;

        /* renamed from: e */
        int f150e = 0;

        /* renamed from: f */
        float f151f = 1.0f;

        /* renamed from: g */
        float f152g = 0.0f;

        /* renamed from: h */
        float f153h = 1.0f;

        /* renamed from: i */
        float f154i = 0.0f;

        /* renamed from: j */
        Cap f155j = Cap.BUTT;

        /* renamed from: k */
        Join f156k = Join.MITER;

        /* renamed from: l */
        float f157l = 4.0f;

        /* renamed from: p */
        private int[] f158p;

        public C0081b() {
        }

        public C0081b(C0081b bVar) {
            super(bVar);
            this.f158p = bVar.f158p;
            this.f146a = bVar.f146a;
            this.f147b = bVar.f147b;
            this.f149d = bVar.f149d;
            this.f148c = bVar.f148c;
            this.f150e = bVar.f150e;
            this.f151f = bVar.f151f;
            this.f152g = bVar.f152g;
            this.f153h = bVar.f153h;
            this.f154i = bVar.f154i;
            this.f155j = bVar.f155j;
            this.f156k = bVar.f156k;
            this.f157l = bVar.f157l;
        }

        /* renamed from: a */
        private Cap m226a(int i, Cap cap) {
            switch (i) {
                case 0:
                    return Cap.BUTT;
                case 1:
                    return Cap.ROUND;
                case 2:
                    return Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Join m227a(int i, Join join) {
            switch (i) {
                case 0:
                    return Join.MITER;
                case 1:
                    return Join.ROUND;
                case 2:
                    return Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        private void m228a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f158p = null;
            if (C0451c.m2055a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f173n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f172m = C0321b.m1210b(string2);
                }
                this.f148c = C0451c.m2056b(typedArray, xmlPullParser, "fillColor", 1, this.f148c);
                this.f151f = C0451c.m2050a(typedArray, xmlPullParser, "fillAlpha", 12, this.f151f);
                this.f155j = m226a(C0451c.m2051a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f155j);
                this.f156k = m227a(C0451c.m2051a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f156k);
                this.f157l = C0451c.m2050a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f157l);
                this.f146a = C0451c.m2056b(typedArray, xmlPullParser, "strokeColor", 3, this.f146a);
                this.f149d = C0451c.m2050a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f149d);
                this.f147b = C0451c.m2050a(typedArray, xmlPullParser, "strokeWidth", 4, this.f147b);
                this.f153h = C0451c.m2050a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f153h);
                this.f154i = C0451c.m2050a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f154i);
                this.f152g = C0451c.m2050a(typedArray, xmlPullParser, "trimPathStart", 5, this.f152g);
                this.f150e = C0451c.m2051a(typedArray, xmlPullParser, "fillType", 13, this.f150e);
            }
        }

        /* renamed from: a */
        public void mo210a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0451c.m2052a(resources, theme, attributeSet, C0066a.f108c);
            m228a(a, xmlPullParser);
            a.recycle();
        }

        /* access modifiers changed from: 0000 */
        public float getFillAlpha() {
            return this.f151f;
        }

        /* access modifiers changed from: 0000 */
        public int getFillColor() {
            return this.f148c;
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeAlpha() {
            return this.f149d;
        }

        /* access modifiers changed from: 0000 */
        public int getStrokeColor() {
            return this.f146a;
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeWidth() {
            return this.f147b;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathEnd() {
            return this.f153h;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathOffset() {
            return this.f154i;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathStart() {
            return this.f152g;
        }

        /* access modifiers changed from: 0000 */
        public void setFillAlpha(float f) {
            this.f151f = f;
        }

        /* access modifiers changed from: 0000 */
        public void setFillColor(int i) {
            this.f148c = i;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeAlpha(float f) {
            this.f149d = f;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeColor(int i) {
            this.f146a = i;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeWidth(float f) {
            this.f147b = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathEnd(float f) {
            this.f153h = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathOffset(float f) {
            this.f154i = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathStart(float f) {
            this.f152g = f;
        }
    }

    /* renamed from: android.support.d.a.i$c */
    private static class C0082c {

        /* renamed from: a */
        final ArrayList<Object> f159a = new ArrayList<>();

        /* renamed from: b */
        float f160b = 0.0f;

        /* renamed from: c */
        int f161c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Matrix f162d = new Matrix();

        /* renamed from: e */
        private float f163e = 0.0f;

        /* renamed from: f */
        private float f164f = 0.0f;

        /* renamed from: g */
        private float f165g = 1.0f;

        /* renamed from: h */
        private float f166h = 1.0f;

        /* renamed from: i */
        private float f167i = 0.0f;

        /* renamed from: j */
        private float f168j = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public final Matrix f169k = new Matrix();

        /* renamed from: l */
        private int[] f170l;

        /* renamed from: m */
        private String f171m = null;

        public C0082c() {
        }

        public C0082c(C0082c cVar, C0488a<String, Object> aVar) {
            C0083d dVar;
            this.f160b = cVar.f160b;
            this.f163e = cVar.f163e;
            this.f164f = cVar.f164f;
            this.f165g = cVar.f165g;
            this.f166h = cVar.f166h;
            this.f167i = cVar.f167i;
            this.f168j = cVar.f168j;
            this.f170l = cVar.f170l;
            this.f171m = cVar.f171m;
            this.f161c = cVar.f161c;
            if (this.f171m != null) {
                aVar.put(this.f171m, this);
            }
            this.f169k.set(cVar.f169k);
            ArrayList<Object> arrayList = cVar.f159a;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0082c) {
                    this.f159a.add(new C0082c((C0082c) obj, aVar));
                } else {
                    if (obj instanceof C0081b) {
                        dVar = new C0081b((C0081b) obj);
                    } else if (obj instanceof C0080a) {
                        dVar = new C0080a((C0080a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f159a.add(dVar);
                    if (dVar.f173n != null) {
                        aVar.put(dVar.f173n, dVar);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m231a() {
            this.f169k.reset();
            this.f169k.postTranslate(-this.f163e, -this.f164f);
            this.f169k.postScale(this.f165g, this.f166h);
            this.f169k.postRotate(this.f160b, 0.0f, 0.0f);
            this.f169k.postTranslate(this.f167i + this.f163e, this.f168j + this.f164f);
        }

        /* renamed from: a */
        private void m232a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f170l = null;
            this.f160b = C0451c.m2050a(typedArray, xmlPullParser, "rotation", 5, this.f160b);
            this.f163e = typedArray.getFloat(1, this.f163e);
            this.f164f = typedArray.getFloat(2, this.f164f);
            this.f165g = C0451c.m2050a(typedArray, xmlPullParser, "scaleX", 3, this.f165g);
            this.f166h = C0451c.m2050a(typedArray, xmlPullParser, "scaleY", 4, this.f166h);
            this.f167i = C0451c.m2050a(typedArray, xmlPullParser, "translateX", 6, this.f167i);
            this.f168j = C0451c.m2050a(typedArray, xmlPullParser, "translateY", 7, this.f168j);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f171m = string;
            }
            m231a();
        }

        /* renamed from: a */
        public void mo227a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0451c.m2052a(resources, theme, attributeSet, C0066a.f107b);
            m232a(a, xmlPullParser);
            a.recycle();
        }

        public String getGroupName() {
            return this.f171m;
        }

        public Matrix getLocalMatrix() {
            return this.f169k;
        }

        public float getPivotX() {
            return this.f163e;
        }

        public float getPivotY() {
            return this.f164f;
        }

        public float getRotation() {
            return this.f160b;
        }

        public float getScaleX() {
            return this.f165g;
        }

        public float getScaleY() {
            return this.f166h;
        }

        public float getTranslateX() {
            return this.f167i;
        }

        public float getTranslateY() {
            return this.f168j;
        }

        public void setPivotX(float f) {
            if (f != this.f163e) {
                this.f163e = f;
                m231a();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f164f) {
                this.f164f = f;
                m231a();
            }
        }

        public void setRotation(float f) {
            if (f != this.f160b) {
                this.f160b = f;
                m231a();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f165g) {
                this.f165g = f;
                m231a();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f166h) {
                this.f166h = f;
                m231a();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f167i) {
                this.f167i = f;
                m231a();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f168j) {
                this.f168j = f;
                m231a();
            }
        }
    }

    /* renamed from: android.support.d.a.i$d */
    private static class C0083d {

        /* renamed from: m */
        protected C0323b[] f172m = null;

        /* renamed from: n */
        String f173n;

        /* renamed from: o */
        int f174o;

        public C0083d() {
        }

        public C0083d(C0083d dVar) {
            this.f173n = dVar.f173n;
            this.f174o = dVar.f174o;
            this.f172m = C0321b.m1208a(dVar.f172m);
        }

        /* renamed from: a */
        public void mo244a(Path path) {
            path.reset();
            if (this.f172m != null) {
                C0323b.m1215a(this.f172m, path);
            }
        }

        /* renamed from: a */
        public boolean mo209a() {
            return false;
        }

        public C0323b[] getPathData() {
            return this.f172m;
        }

        public String getPathName() {
            return this.f173n;
        }

        public void setPathData(C0323b[] bVarArr) {
            if (!C0321b.m1206a(this.f172m, bVarArr)) {
                this.f172m = C0321b.m1208a(bVarArr);
            } else {
                C0321b.m1209b(this.f172m, bVarArr);
            }
        }
    }

    /* renamed from: android.support.d.a.i$e */
    private static class C0084e {

        /* renamed from: k */
        private static final Matrix f175k = new Matrix();

        /* renamed from: a */
        final C0082c f176a;

        /* renamed from: b */
        float f177b;

        /* renamed from: c */
        float f178c;

        /* renamed from: d */
        float f179d;

        /* renamed from: e */
        float f180e;

        /* renamed from: f */
        int f181f;

        /* renamed from: g */
        String f182g;

        /* renamed from: h */
        final C0488a<String, Object> f183h;

        /* renamed from: i */
        private final Path f184i;

        /* renamed from: j */
        private final Path f185j;

        /* renamed from: l */
        private final Matrix f186l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Paint f187m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Paint f188n;

        /* renamed from: o */
        private PathMeasure f189o;

        /* renamed from: p */
        private int f190p;

        public C0084e() {
            this.f186l = new Matrix();
            this.f177b = 0.0f;
            this.f178c = 0.0f;
            this.f179d = 0.0f;
            this.f180e = 0.0f;
            this.f181f = 255;
            this.f182g = null;
            this.f183h = new C0488a<>();
            this.f176a = new C0082c();
            this.f184i = new Path();
            this.f185j = new Path();
        }

        public C0084e(C0084e eVar) {
            this.f186l = new Matrix();
            this.f177b = 0.0f;
            this.f178c = 0.0f;
            this.f179d = 0.0f;
            this.f180e = 0.0f;
            this.f181f = 255;
            this.f182g = null;
            this.f183h = new C0488a<>();
            this.f176a = new C0082c(eVar.f176a, this.f183h);
            this.f184i = new Path(eVar.f184i);
            this.f185j = new Path(eVar.f185j);
            this.f177b = eVar.f177b;
            this.f178c = eVar.f178c;
            this.f179d = eVar.f179d;
            this.f180e = eVar.f180e;
            this.f190p = eVar.f190p;
            this.f181f = eVar.f181f;
            this.f182g = eVar.f182g;
            if (eVar.f182g != null) {
                this.f183h.put(eVar.f182g, this);
            }
        }

        /* renamed from: a */
        private static float m237a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m238a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m237a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m241a(C0082c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f162d.set(matrix);
            cVar.f162d.preConcat(cVar.f169k);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f159a.size(); i3++) {
                Object obj = cVar.f159a.get(i3);
                if (obj instanceof C0082c) {
                    m241a((C0082c) obj, cVar.f162d, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0083d) {
                    m242a(cVar, (C0083d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        private void m242a(C0082c cVar, C0083d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f179d;
            float f2 = ((float) i2) / this.f180e;
            float min = Math.min(f, f2);
            Matrix a = cVar.f162d;
            this.f186l.set(a);
            this.f186l.postScale(f, f2);
            float a2 = m238a(a);
            if (a2 != 0.0f) {
                dVar.mo244a(this.f184i);
                Path path = this.f184i;
                this.f185j.reset();
                if (dVar.mo209a()) {
                    this.f185j.addPath(path, this.f186l);
                    canvas.clipPath(this.f185j);
                } else {
                    C0081b bVar = (C0081b) dVar;
                    if (!(bVar.f152g == 0.0f && bVar.f153h == 1.0f)) {
                        float f3 = (bVar.f152g + bVar.f154i) % 1.0f;
                        float f4 = (bVar.f153h + bVar.f154i) % 1.0f;
                        if (this.f189o == null) {
                            this.f189o = new PathMeasure();
                        }
                        this.f189o.setPath(this.f184i, false);
                        float length = this.f189o.getLength();
                        float f5 = f3 * length;
                        float f6 = f4 * length;
                        path.reset();
                        if (f5 > f6) {
                            this.f189o.getSegment(f5, length, path, true);
                            this.f189o.getSegment(0.0f, f6, path, true);
                        } else {
                            this.f189o.getSegment(f5, f6, path, true);
                        }
                        path.rLineTo(0.0f, 0.0f);
                    }
                    this.f185j.addPath(path, this.f186l);
                    if (bVar.f148c != 0) {
                        if (this.f188n == null) {
                            this.f188n = new Paint();
                            this.f188n.setStyle(Style.FILL);
                            this.f188n.setAntiAlias(true);
                        }
                        Paint paint = this.f188n;
                        paint.setColor(C0079i.m213a(bVar.f148c, bVar.f151f));
                        paint.setColorFilter(colorFilter);
                        this.f185j.setFillType(bVar.f150e == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f185j, paint);
                    }
                    if (bVar.f146a != 0) {
                        if (this.f187m == null) {
                            this.f187m = new Paint();
                            this.f187m.setStyle(Style.STROKE);
                            this.f187m.setAntiAlias(true);
                        }
                        Paint paint2 = this.f187m;
                        if (bVar.f156k != null) {
                            paint2.setStrokeJoin(bVar.f156k);
                        }
                        if (bVar.f155j != null) {
                            paint2.setStrokeCap(bVar.f155j);
                        }
                        paint2.setStrokeMiter(bVar.f157l);
                        paint2.setColor(C0079i.m213a(bVar.f146a, bVar.f149d));
                        paint2.setColorFilter(colorFilter);
                        paint2.setStrokeWidth(bVar.f147b * min * a2);
                        canvas.drawPath(this.f185j, paint2);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo248a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m241a(this.f176a, f175k, canvas, i, i2, colorFilter);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f181f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f181f = i;
        }
    }

    /* renamed from: android.support.d.a.i$f */
    private static class C0085f extends ConstantState {

        /* renamed from: a */
        int f191a;

        /* renamed from: b */
        C0084e f192b;

        /* renamed from: c */
        ColorStateList f193c;

        /* renamed from: d */
        Mode f194d;

        /* renamed from: e */
        boolean f195e;

        /* renamed from: f */
        Bitmap f196f;

        /* renamed from: g */
        ColorStateList f197g;

        /* renamed from: h */
        Mode f198h;

        /* renamed from: i */
        int f199i;

        /* renamed from: j */
        boolean f200j;

        /* renamed from: k */
        boolean f201k;

        /* renamed from: l */
        Paint f202l;

        public C0085f() {
            this.f193c = null;
            this.f194d = C0079i.f136a;
            this.f192b = new C0084e();
        }

        public C0085f(C0085f fVar) {
            this.f193c = null;
            this.f194d = C0079i.f136a;
            if (fVar != null) {
                this.f191a = fVar.f191a;
                this.f192b = new C0084e(fVar.f192b);
                if (fVar.f192b.f188n != null) {
                    this.f192b.f188n = new Paint(fVar.f192b.f188n);
                }
                if (fVar.f192b.f187m != null) {
                    this.f192b.f187m = new Paint(fVar.f192b.f187m);
                }
                this.f193c = fVar.f193c;
                this.f194d = fVar.f194d;
                this.f195e = fVar.f195e;
            }
        }

        /* renamed from: a */
        public Paint mo253a(ColorFilter colorFilter) {
            if (!mo256a() && colorFilter == null) {
                return null;
            }
            if (this.f202l == null) {
                this.f202l = new Paint();
                this.f202l.setFilterBitmap(true);
            }
            this.f202l.setAlpha(this.f192b.getRootAlpha());
            this.f202l.setColorFilter(colorFilter);
            return this.f202l;
        }

        /* renamed from: a */
        public void mo254a(int i, int i2) {
            this.f196f.eraseColor(0);
            this.f192b.mo248a(new Canvas(this.f196f), i, i2, (ColorFilter) null);
        }

        /* renamed from: a */
        public void mo255a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f196f, null, rect, mo253a(colorFilter));
        }

        /* renamed from: a */
        public boolean mo256a() {
            return this.f192b.getRootAlpha() < 255;
        }

        /* renamed from: b */
        public void mo257b(int i, int i2) {
            if (this.f196f == null || !mo260c(i, i2)) {
                this.f196f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f201k = true;
            }
        }

        /* renamed from: b */
        public boolean mo258b() {
            return !this.f201k && this.f197g == this.f193c && this.f198h == this.f194d && this.f200j == this.f195e && this.f199i == this.f192b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo259c() {
            this.f197g = this.f193c;
            this.f198h = this.f194d;
            this.f199i = this.f192b.getRootAlpha();
            this.f200j = this.f195e;
            this.f201k = false;
        }

        /* renamed from: c */
        public boolean mo260c(int i, int i2) {
            return i == this.f196f.getWidth() && i2 == this.f196f.getHeight();
        }

        public int getChangingConfigurations() {
            return this.f191a;
        }

        public Drawable newDrawable() {
            return new C0079i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0079i(this);
        }
    }

    /* renamed from: android.support.d.a.i$g */
    private static class C0086g extends ConstantState {

        /* renamed from: a */
        private final ConstantState f203a;

        public C0086g(ConstantState constantState) {
            this.f203a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f203a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f203a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0079i iVar = new C0079i();
            iVar.f135b = (VectorDrawable) this.f203a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0079i iVar = new C0079i();
            iVar.f135b = (VectorDrawable) this.f203a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C0079i iVar = new C0079i();
            iVar.f135b = (VectorDrawable) this.f203a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C0079i() {
        this.f141g = true;
        this.f143i = new float[9];
        this.f144j = new Matrix();
        this.f145k = new Rect();
        this.f137c = new C0085f();
    }

    C0079i(C0085f fVar) {
        this.f141g = true;
        this.f143i = new float[9];
        this.f144j = new Matrix();
        this.f145k = new Rect();
        this.f137c = fVar;
        this.f138d = mo184a(this.f138d, fVar.f193c, fVar.f194d);
    }

    /* renamed from: a */
    static int m213a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private static Mode m214a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p007d.p008a.C0079i m215a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            android.support.d.a.i r0 = new android.support.d.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r4 = android.support.p009v4.content.p015a.C0447b.m2045a(r4, r5, r6)
            r0.f135b = r4
            android.support.d.a.i$g r4 = new android.support.d.a.i$g
            android.graphics.drawable.Drawable r5 = r0.f135b
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f142h = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x0032
            r3 = 1
            if (r1 == r3) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            if (r1 != r2) goto L_0x0039
            android.support.d.a.i r4 = m216a(r4, r5, r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            return r4
        L_0x0039:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0041:
            r4 = move-exception
            java.lang.String r5 = "VectorDrawableCompat"
            java.lang.String r6 = "parser error"
            android.util.Log.e(r5, r6, r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007d.p008a.C0079i.m215a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.d.a.i");
    }

    /* renamed from: a */
    public static C0079i m216a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0079i iVar = new C0079i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: a */
    private void m217a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0085f fVar = this.f137c;
        C0084e eVar = fVar.f192b;
        fVar.f194d = m214a(C0451c.m2051a(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.f193c = colorStateList;
        }
        fVar.f195e = C0451c.m2054a(typedArray, xmlPullParser, "autoMirrored", 5, fVar.f195e);
        eVar.f179d = C0451c.m2050a(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f179d);
        eVar.f180e = C0451c.m2050a(typedArray, xmlPullParser, "viewportHeight", 8, eVar.f180e);
        if (eVar.f179d <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (eVar.f180e > 0.0f) {
            eVar.f177b = typedArray.getDimension(3, eVar.f177b);
            eVar.f178c = typedArray.getDimension(2, eVar.f178c);
            if (eVar.f177b <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (eVar.f178c > 0.0f) {
                eVar.setAlpha(C0451c.m2050a(typedArray, xmlPullParser, "alpha", 4, eVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    eVar.f182g = string;
                    eVar.f183h.put(string, eVar);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    /* renamed from: a */
    private boolean m218a() {
        return VERSION.SDK_INT >= 17 && isAutoMirrored() && C0311a.m1188i(this) == 1;
    }

    /* renamed from: b */
    private void m219b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int i;
        int i2;
        C0085f fVar = this.f137c;
        C0084e eVar = fVar.f192b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(eVar.f176a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0082c cVar = (C0082c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0081b bVar = new C0081b();
                    bVar.mo210a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f159a.add(bVar);
                    if (bVar.getPathName() != null) {
                        eVar.f183h.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    i = fVar.f191a;
                    i2 = bVar.f174o;
                } else if ("clip-path".equals(name)) {
                    C0080a aVar = new C0080a();
                    aVar.mo208a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f159a.add(aVar);
                    if (aVar.getPathName() != null) {
                        eVar.f183h.put(aVar.getPathName(), aVar);
                    }
                    i = fVar.f191a;
                    i2 = aVar.f174o;
                } else if ("group".equals(name)) {
                    C0082c cVar2 = new C0082c();
                    cVar2.mo227a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f159a.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        eVar.f183h.put(cVar2.getGroupName(), cVar2);
                    }
                    i = fVar.f191a;
                    i2 = cVar2.f161c;
                }
                fVar.f191a = i2 | i;
            } else if (eventType == 3) {
                if ("group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PorterDuffColorFilter mo184a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo185a(String str) {
        return this.f137c.f192b.f183h.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo186a(boolean z) {
        this.f141g = z;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        if (this.f135b != null) {
            C0311a.m1183d(this.f135b);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.f135b != null) {
            this.f135b.draw(canvas);
            return;
        }
        copyBounds(this.f145k);
        if (this.f145k.width() > 0 && this.f145k.height() > 0) {
            ColorFilter colorFilter = this.f139e == null ? this.f138d : this.f139e;
            canvas.getMatrix(this.f144j);
            this.f144j.getValues(this.f143i);
            float abs = Math.abs(this.f143i[0]);
            float abs2 = Math.abs(this.f143i[4]);
            float abs3 = Math.abs(this.f143i[1]);
            float abs4 = Math.abs(this.f143i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int height = (int) (((float) this.f145k.height()) * abs2);
            int min = Math.min(2048, (int) (((float) this.f145k.width()) * abs));
            int min2 = Math.min(2048, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f145k.left, (float) this.f145k.top);
                if (m218a()) {
                    canvas.translate((float) this.f145k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f145k.offsetTo(0, 0);
                this.f137c.mo257b(min, min2);
                if (!this.f141g) {
                    this.f137c.mo254a(min, min2);
                } else if (!this.f137c.mo258b()) {
                    this.f137c.mo254a(min, min2);
                    this.f137c.mo259c();
                }
                this.f137c.mo255a(canvas, colorFilter, this.f145k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        return this.f135b != null ? C0311a.m1182c(this.f135b) : this.f137c.f192b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        return this.f135b != null ? this.f135b.getChangingConfigurations() : super.getChangingConfigurations() | this.f137c.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public ConstantState getConstantState() {
        if (this.f135b != null && VERSION.SDK_INT >= 24) {
            return new C0086g(this.f135b.getConstantState());
        }
        this.f137c.f191a = getChangingConfigurations();
        return this.f137c;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f135b != null ? this.f135b.getIntrinsicHeight() : (int) this.f137c.f192b.f178c;
    }

    public int getIntrinsicWidth() {
        return this.f135b != null ? this.f135b.getIntrinsicWidth() : (int) this.f137c.f192b.f177b;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        if (this.f135b != null) {
            return this.f135b.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f135b != null) {
            this.f135b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.f135b != null) {
            C0311a.m1177a(this.f135b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0085f fVar = this.f137c;
        fVar.f192b = new C0084e();
        TypedArray a = C0451c.m2052a(resources, theme, attributeSet, C0066a.f106a);
        m217a(a, xmlPullParser);
        a.recycle();
        fVar.f191a = getChangingConfigurations();
        fVar.f201k = true;
        m219b(resources, xmlPullParser, attributeSet, theme);
        this.f138d = mo184a(this.f138d, fVar.f193c, fVar.f194d);
    }

    public void invalidateSelf() {
        if (this.f135b != null) {
            this.f135b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        return this.f135b != null ? C0311a.m1180b(this.f135b) : this.f137c.f195e;
    }

    public boolean isStateful() {
        if (this.f135b != null) {
            return this.f135b.isStateful();
        }
        return super.isStateful() || !(this.f137c == null || this.f137c.f193c == null || !this.f137c.f193c.isStateful());
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.f135b != null) {
            this.f135b.mutate();
            return this;
        }
        if (!this.f140f && super.mutate() == this) {
            this.f137c = new C0085f(this.f137c);
            this.f140f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f135b != null) {
            this.f135b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f135b != null) {
            return this.f135b.setState(iArr);
        }
        C0085f fVar = this.f137c;
        if (fVar.f193c == null || fVar.f194d == null) {
            return false;
        }
        this.f138d = mo184a(this.f138d, fVar.f193c, fVar.f194d);
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f135b != null) {
            this.f135b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f135b != null) {
            this.f135b.setAlpha(i);
            return;
        }
        if (this.f137c.f192b.getRootAlpha() != i) {
            this.f137c.f192b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f135b != null) {
            C0311a.m1179a(this.f135b, z);
        } else {
            this.f137c.f195e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f135b != null) {
            this.f135b.setColorFilter(colorFilter);
            return;
        }
        this.f139e = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.f135b != null) {
            C0311a.m1173a(this.f135b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f135b != null) {
            C0311a.m1175a(this.f135b, colorStateList);
            return;
        }
        C0085f fVar = this.f137c;
        if (fVar.f193c != colorStateList) {
            fVar.f193c = colorStateList;
            this.f138d = mo184a(this.f138d, colorStateList, fVar.f194d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        if (this.f135b != null) {
            C0311a.m1178a(this.f135b, mode);
            return;
        }
        C0085f fVar = this.f137c;
        if (fVar.f194d != mode) {
            fVar.f194d = mode;
            this.f138d = mo184a(this.f138d, fVar.f193c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f135b != null ? this.f135b.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.f135b != null) {
            this.f135b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
