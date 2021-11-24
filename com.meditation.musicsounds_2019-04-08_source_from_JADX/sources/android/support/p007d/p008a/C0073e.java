package android.support.p007d.p008a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.support.p009v4.content.p015a.C0451c;
import android.support.p009v4.p010a.C0321b;
import android.support.p009v4.p010a.C0321b.C0323b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.d.a.e */
public class C0073e {

    /* renamed from: android.support.d.a.e$a */
    private static class C0075a implements TypeEvaluator<C0323b[]> {

        /* renamed from: a */
        private C0323b[] f131a;

        private C0075a() {
        }

        /* renamed from: a */
        public C0323b[] evaluate(float f, C0323b[] bVarArr, C0323b[] bVarArr2) {
            if (C0321b.m1206a(bVarArr, bVarArr2)) {
                if (this.f131a == null || !C0321b.m1206a(this.f131a, bVarArr)) {
                    this.f131a = C0321b.m1208a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f131a[i].mo1172a(bVarArr[i], bVarArr2[i], f);
                }
                return this.f131a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static int m188a(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0451c.m2052a(resources, theme, attributeSet, C0066a.f115j);
        int i = 0;
        TypedValue b = C0451c.m2057b(a, xmlPullParser, "value", 0);
        if ((b != null) && m205a(b.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    private static int m189a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        return ((!z2 || !m205a(i3)) && (!z || !m205a(z ? peekValue2.type : 0))) ? 0 : 3;
    }

    /* renamed from: a */
    public static Animator m190a(Context context, int i) {
        return VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m191a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    public static Animator m191a(Context context, Resources resources, Theme theme, int i) {
        return m192a(context, resources, theme, i, 1.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator m192a(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, int r5, float r6) {
        /*
            r0 = 0
            android.content.res.XmlResourceParser r1 = r3.getAnimation(r5)     // Catch:{ XmlPullParserException -> 0x0039, IOException -> 0x001a }
            android.animation.Animator r2 = m193a(r2, r3, r4, r1, r6)     // Catch:{ XmlPullParserException -> 0x0015, IOException -> 0x0012, all -> 0x000f }
            if (r1 == 0) goto L_0x000e
            r1.close()
        L_0x000e:
            return r2
        L_0x000f:
            r2 = move-exception
            r0 = r1
            goto L_0x0058
        L_0x0012:
            r2 = move-exception
            r0 = r1
            goto L_0x001b
        L_0x0015:
            r2 = move-exception
            r0 = r1
            goto L_0x003a
        L_0x0018:
            r2 = move-exception
            goto L_0x0058
        L_0x001a:
            r2 = move-exception
        L_0x001b:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0018 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0018 }
            r4.<init>()     // Catch:{ all -> 0x0018 }
            java.lang.String r6 = "Can't load animation resource ID #0x"
            r4.append(r6)     // Catch:{ all -> 0x0018 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0018 }
            r4.append(r5)     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0018 }
            r3.<init>(r4)     // Catch:{ all -> 0x0018 }
            r3.initCause(r2)     // Catch:{ all -> 0x0018 }
            throw r3     // Catch:{ all -> 0x0018 }
        L_0x0039:
            r2 = move-exception
        L_0x003a:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0018 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0018 }
            r4.<init>()     // Catch:{ all -> 0x0018 }
            java.lang.String r6 = "Can't load animation resource ID #0x"
            r4.append(r6)     // Catch:{ all -> 0x0018 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0018 }
            r4.append(r5)     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0018 }
            r3.<init>(r4)     // Catch:{ all -> 0x0018 }
            r3.initCause(r2)     // Catch:{ all -> 0x0018 }
            throw r3     // Catch:{ all -> 0x0018 }
        L_0x0058:
            if (r0 == 0) goto L_0x005d
            r0.close()
        L_0x005d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007d.p008a.C0073e.m192a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static Animator m193a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, float f) {
        return m194a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m194a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00e1
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00e1
            r3 = 2
            if (r1 == r3) goto L_0x0023
            goto L_0x000e
        L_0x0023:
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0043
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = m197a(r0, r1, r2, r3, r4, r5)
        L_0x003f:
            r3 = r18
            goto L_0x00b6
        L_0x0043:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005d
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = m200a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003f
        L_0x005d:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0095
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = android.support.p007d.p008a.C0066a.f113h
            r7 = r22
            android.content.res.TypedArray r6 = android.support.p009v4.content.p015a.C0451c.m2052a(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = android.support.p009v4.content.p015a.C0451c.m2051a(r6, r10, r0, r14, r14)
            r5 = r15
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r17 = r6
            r6 = r16
            r7 = r25
            m194a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto L_0x00b6
        L_0x0095:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c6
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = m206a(r3, r8, r9, r10, r1)
            if (r1 == 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00b5
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b5
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b5:
            r14 = 1
        L_0x00b6:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00c1
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00c1:
            r13.add(r0)
            goto L_0x000e
        L_0x00c6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown animator name: "
            r1.append(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            if (r11 == 0) goto L_0x010a
            if (r13 == 0) goto L_0x010a
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x00ef:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0101
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x00ef
        L_0x0101:
            if (r24 != 0) goto L_0x0107
            r11.playTogether(r1)
            goto L_0x010a
        L_0x0107:
            r11.playSequentially(r1)
        L_0x010a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007d.p008a.C0073e.m194a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static Keyframe m195a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static Keyframe m196a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        Keyframe keyframe;
        TypedArray a = C0451c.m2052a(resources, theme, attributeSet, C0066a.f115j);
        float a2 = C0451c.m2050a(a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b = C0451c.m2057b(a, xmlPullParser, "value", 0);
        boolean z = b != null;
        if (i == 4) {
            i = (!z || !m205a(b.type)) ? 0 : 3;
        }
        if (z) {
            if (i != 3) {
                switch (i) {
                    case 0:
                        keyframe = Keyframe.ofFloat(a2, C0451c.m2050a(a, xmlPullParser, "value", 0, 0.0f));
                        break;
                    case 1:
                        break;
                    default:
                        keyframe = null;
                        break;
                }
            }
            keyframe = Keyframe.ofInt(a2, C0451c.m2051a(a, xmlPullParser, "value", 0, 0));
        } else {
            keyframe = i == 0 ? Keyframe.ofFloat(a2) : Keyframe.ofInt(a2);
        }
        int c = C0451c.m2058c(a, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            keyframe.setInterpolator(C0072d.m186a(context, c));
        }
        a.recycle();
        return keyframe;
    }

    /* renamed from: a */
    private static ObjectAnimator m197a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m200a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m198a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            r1 = r14
            r14 = r0
        L_0x0003:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0041
            r4 = 1
            if (r2 == r4) goto L_0x0041
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0003
            r2 = 4
            if (r1 != r2) goto L_0x0024
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r12)
            int r1 = m188a(r10, r11, r1, r12)
        L_0x0024:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r1
            r7 = r12
            android.animation.Keyframe r2 = m196a(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x003d
            if (r14 != 0) goto L_0x003a
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x003a:
            r14.add(r2)
        L_0x003d:
            r12.next()
            goto L_0x0003
        L_0x0041:
            if (r14 == 0) goto L_0x00ea
            int r9 = r14.size()
            if (r9 <= 0) goto L_0x00ea
            r10 = 0
            java.lang.Object r11 = r14.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + -1
            java.lang.Object r12 = r14.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0078
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            r12.setFraction(r2)
            goto L_0x0078
        L_0x006b:
            int r0 = r14.size()
            android.animation.Keyframe r12 = m195a(r12, r2)
            r14.add(r0, r12)
            int r9 = r9 + 1
        L_0x0078:
            float r12 = r11.getFraction()
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0091
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0088
            r11.setFraction(r4)
            goto L_0x0091
        L_0x0088:
            android.animation.Keyframe r11 = m195a(r11, r4)
            r14.add(r10, r11)
            int r9 = r9 + 1
        L_0x0091:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r14.toArray(r11)
        L_0x0096:
            if (r10 >= r9) goto L_0x00dd
            r12 = r11[r10]
            float r14 = r12.getFraction()
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00da
            if (r10 != 0) goto L_0x00a8
            r12.setFraction(r4)
            goto L_0x00da
        L_0x00a8:
            int r14 = r9 + -1
            if (r10 != r14) goto L_0x00b0
            r12.setFraction(r2)
            goto L_0x00da
        L_0x00b0:
            int r12 = r10 + 1
            r0 = r10
        L_0x00b3:
            if (r12 >= r14) goto L_0x00c6
            r5 = r11[r12]
            float r5 = r5.getFraction()
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 < 0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            int r0 = r12 + 1
            r8 = r0
            r0 = r12
            r12 = r8
            goto L_0x00b3
        L_0x00c6:
            int r12 = r0 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r14 = r10 + -1
            r14 = r11[r14]
            float r14 = r14.getFraction()
            float r12 = r12 - r14
            m204a(r11, r12, r10, r0)
        L_0x00da:
            int r10 = r10 + 1
            goto L_0x0096
        L_0x00dd:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r1 != r3) goto L_0x00ea
            android.support.d.a.f r9 = android.support.p007d.p008a.C0076f.m208a()
            r0.setEvaluator(r9)
        L_0x00ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007d.p008a.C0073e.m198a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* renamed from: a */
    private static PropertyValuesHolder m199a(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolder;
        Object[] objArr;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !m205a(i4)) && (!z2 || !m205a(i5))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder2 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0323b[] b = C0321b.m1210b(string);
            C0323b[] b2 = C0321b.m1210b(string2);
            if (b == null && b2 == null) {
                return null;
            }
            if (b != null) {
                C0075a aVar = new C0075a();
                if (b2 == null) {
                    objArr = new Object[]{b};
                } else if (C0321b.m1206a(b, b2)) {
                    objArr = new Object[]{b, b2};
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" Can't morph from ");
                    sb.append(string);
                    sb.append(" to ");
                    sb.append(string2);
                    throw new InflateException(sb.toString());
                }
                return PropertyValuesHolder.ofObject(str, aVar, objArr);
            } else if (b2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new C0075a(), new Object[]{b2});
            }
        } else {
            TypeEvaluator a = i == 3 ? C0076f.m208a() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f)});
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension});
                    }
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f)});
                }
                propertyValuesHolder2 = propertyValuesHolder;
            } else if (z) {
                int i6 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m205a(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    int i7 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m205a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                    propertyValuesHolder2 = PropertyValuesHolder.ofInt(str, new int[]{i6, i7});
                } else {
                    propertyValuesHolder2 = PropertyValuesHolder.ofInt(str, new int[]{i6});
                }
            } else if (z2) {
                int i8 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m205a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                propertyValuesHolder2 = PropertyValuesHolder.ofInt(str, new int[]{i8});
            }
            if (propertyValuesHolder2 == null || a == null) {
                return propertyValuesHolder2;
            }
            propertyValuesHolder2.setEvaluator(a);
            return propertyValuesHolder2;
        }
    }

    /* renamed from: a */
    private static ValueAnimator m200a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0451c.m2052a(resources, theme, attributeSet, C0066a.f112g);
        TypedArray a2 = C0451c.m2052a(resources, theme, attributeSet, C0066a.f116k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m202a(valueAnimator, a, a2, f, xmlPullParser);
        int c = C0451c.m2058c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C0072d.m186a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static void m201a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a = C0451c.m2053a(typedArray, xmlPullParser, "pathData", 1);
        if (a != null) {
            String a2 = C0451c.m2053a(typedArray, xmlPullParser, "propertyXName", 2);
            String a3 = C0451c.m2053a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (a2 == null && a3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            m203a(C0321b.m1203a(a), objectAnimator, f * 0.5f, a2, a3);
            return;
        }
        objectAnimator.setPropertyName(C0451c.m2053a(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    private static void m202a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long a = (long) C0451c.m2051a(typedArray, xmlPullParser, "duration", 1, 300);
        long a2 = (long) C0451c.m2051a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a3 = C0451c.m2051a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0451c.m2055a(xmlPullParser, "valueFrom") && C0451c.m2055a(xmlPullParser, "valueTo")) {
            if (a3 == 4) {
                a3 = m189a(typedArray, 5, 6);
            }
            PropertyValuesHolder a4 = m199a(typedArray, a3, 5, 6, "");
            if (a4 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{a4});
            }
        }
        valueAnimator.setDuration(a);
        valueAnimator.setStartDelay(a2);
        valueAnimator.setRepeatCount(C0451c.m2051a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0451c.m2051a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m201a(valueAnimator, typedArray2, a3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m203a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        char c = 0;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4, fArr3, null);
            fArr[i] = fArr3[c];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                f4 -= ((Float) arrayList.get(i3)).floatValue();
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
            c = 0;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else {
            objectAnimator2.setValues(propertyValuesHolder == null ? new PropertyValuesHolder[]{ofFloat} : new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    /* renamed from: a */
    private static void m204a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m205a(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m206a(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) {
        /*
            r6 = r20
            r7 = 0
            r8 = r7
        L_0x0004:
            int r0 = r20.getEventType()
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L_0x0069
            r10 = 1
            if (r0 == r10) goto L_0x0069
            r2 = 2
            if (r0 == r2) goto L_0x0016
        L_0x0012:
            r20.next()
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0062
            int[] r0 = android.support.p007d.p008a.C0066a.f114i
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = android.support.p009v4.content.p015a.C0451c.m2052a(r11, r12, r13, r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = android.support.p009v4.content.p015a.C0451c.m2053a(r14, r6, r0, r1)
            java.lang.String r0 = "valueType"
            r1 = 4
            int r5 = android.support.p009v4.content.p015a.C0451c.m2051a(r14, r6, r0, r2, r1)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = m198a(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0052
            r1 = r16
            android.animation.PropertyValuesHolder r0 = m199a(r14, r1, r9, r10, r15)
        L_0x0052:
            if (r0 == 0) goto L_0x005e
            if (r8 != 0) goto L_0x005b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x005b:
            r8.add(r0)
        L_0x005e:
            r14.recycle()
            goto L_0x0012
        L_0x0062:
            r11 = r18
            r12 = r19
            r13 = r21
            goto L_0x0012
        L_0x0069:
            if (r8 == 0) goto L_0x007e
            int r0 = r8.size()
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r0]
        L_0x0071:
            if (r9 >= r0) goto L_0x007e
            java.lang.Object r1 = r8.get(r9)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r7[r9] = r1
            int r9 = r9 + 1
            goto L_0x0071
        L_0x007e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007d.p008a.C0073e.m206a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }
}
