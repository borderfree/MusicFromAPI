package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v7.widget.w */
class C1128w {

    /* renamed from: a */
    private static final RectF f3915a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f3916b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private int f3917c = 0;

    /* renamed from: d */
    private boolean f3918d = false;

    /* renamed from: e */
    private float f3919e = -1.0f;

    /* renamed from: f */
    private float f3920f = -1.0f;

    /* renamed from: g */
    private float f3921g = -1.0f;

    /* renamed from: h */
    private int[] f3922h = new int[0];

    /* renamed from: i */
    private boolean f3923i = false;

    /* renamed from: j */
    private TextPaint f3924j;

    /* renamed from: k */
    private final TextView f3925k;

    /* renamed from: l */
    private final Context f3926l;

    C1128w(TextView textView) {
        this.f3925k = textView;
        this.f3926l = this.f3925k.getContext();
    }

    /* renamed from: a */
    private int m6162a(RectF rectF) {
        int length = this.f3922h.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m6170a(this.f3922h[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f3922h[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private StaticLayout m6163a(CharSequence charSequence, Alignment alignment, int i) {
        float floatValue;
        float floatValue2;
        boolean booleanValue;
        if (VERSION.SDK_INT >= 16) {
            floatValue = this.f3925k.getLineSpacingMultiplier();
            floatValue2 = this.f3925k.getLineSpacingExtra();
            booleanValue = this.f3925k.getIncludeFontPadding();
        } else {
            floatValue = ((Float) m6165a((Object) this.f3925k, "getLineSpacingMultiplier", (T) Float.valueOf(1.0f))).floatValue();
            floatValue2 = ((Float) m6165a((Object) this.f3925k, "getLineSpacingExtra", (T) Float.valueOf(0.0f))).floatValue();
            booleanValue = ((Boolean) m6165a((Object) this.f3925k, "getIncludeFontPadding", (T) Boolean.valueOf(true))).booleanValue();
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f3924j, i, alignment, floatValue, floatValue2, booleanValue);
        return staticLayout;
    }

    /* renamed from: a */
    private StaticLayout m6164a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m6165a((Object) this.f3925k, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        Builder hyphenationFrequency = Builder.obtain(charSequence, 0, charSequence.length(), this.f3924j, i).setAlignment(alignment).setLineSpacing(this.f3925k.getLineSpacingExtra(), this.f3925k.getLineSpacingMultiplier()).setIncludePad(this.f3925k.getIncludeFontPadding()).setBreakStrategy(this.f3925k.getBreakStrategy()).setHyphenationFrequency(this.f3925k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private <T> T m6165a(Object obj, String str, T t) {
        try {
            return m6166a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            String str2 = "ACTVAutoSizeHelper";
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w(str2, sb.toString(), e);
            return t;
        }
    }

    /* renamed from: a */
    private Method m6166a(String str) {
        try {
            Method method = (Method) f3916b.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f3916b.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private void m6167a(float f) {
        if (f != this.f3925k.getPaint().getTextSize()) {
            this.f3925k.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.f3925k.isInLayout() : false;
            if (this.f3925k.getLayout() != null) {
                this.f3918d = false;
                try {
                    Method a = m6166a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f3925k, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f3925k.requestLayout();
                } else {
                    this.f3925k.forceLayout();
                }
                this.f3925k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m6168a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size ");
            sb2.append("text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f3917c = 1;
            this.f3920f = f;
            this.f3921g = f2;
            this.f3919e = f3;
            this.f3923i = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    private void m6169a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f3922h = m6171a(iArr);
            m6172h();
        }
    }

    /* renamed from: a */
    private boolean m6170a(int i, RectF rectF) {
        CharSequence text = this.f3925k.getText();
        TransformationMethod transformationMethod = this.f3925k.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f3925k);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.f3925k.getMaxLines() : -1;
        if (this.f3924j == null) {
            this.f3924j = new TextPaint();
        } else {
            this.f3924j.reset();
        }
        this.f3924j.set(this.f3925k.getPaint());
        this.f3924j.setTextSize((float) i);
        Alignment alignment = (Alignment) m6165a((Object) this.f3925k, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL);
        StaticLayout a = VERSION.SDK_INT >= 23 ? m6164a(text, alignment, Math.round(rectF.right), maxLines) : m6163a(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private int[] m6171a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: h */
    private boolean m6172h() {
        int length = this.f3922h.length;
        this.f3923i = length > 0;
        if (this.f3923i) {
            this.f3917c = 1;
            this.f3920f = (float) this.f3922h[0];
            this.f3921g = (float) this.f3922h[length - 1];
            this.f3919e = -1.0f;
        }
        return this.f3923i;
    }

    /* renamed from: i */
    private boolean m6173i() {
        if (!m6175k() || this.f3917c != 1) {
            this.f3918d = false;
        } else {
            if (!this.f3923i || this.f3922h.length == 0) {
                float round = (float) Math.round(this.f3920f);
                int i = 1;
                while (Math.round(this.f3919e + round) <= Math.round(this.f3921g)) {
                    i++;
                    round += this.f3919e;
                }
                int[] iArr = new int[i];
                float f = this.f3920f;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f3919e;
                }
                this.f3922h = m6171a(iArr);
            }
            this.f3918d = true;
        }
        return this.f3918d;
    }

    /* renamed from: j */
    private void m6174j() {
        this.f3917c = 0;
        this.f3920f = -1.0f;
        this.f3921g = -1.0f;
        this.f3919e = -1.0f;
        this.f3922h = new int[0];
        this.f3918d = false;
    }

    /* renamed from: k */
    private boolean m6175k() {
        return !(this.f3925k instanceof C1116l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5559a() {
        return this.f3917c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5560a(int i) {
        if (m6175k()) {
            switch (i) {
                case 0:
                    m6174j();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f3926l.getResources().getDisplayMetrics();
                    m6168a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m6173i()) {
                        mo5569f();
                        return;
                    }
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown auto-size text type: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5561a(int i, float f) {
        m6167a(TypedValue.applyDimension(i, f, (this.f3926l == null ? Resources.getSystem() : this.f3926l.getResources()).getDisplayMetrics()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5562a(int i, int i2, int i3, int i4) {
        if (m6175k()) {
            DisplayMetrics displayMetrics = this.f3926l.getResources().getDisplayMetrics();
            m6168a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m6173i()) {
                mo5569f();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5563a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3926l.obtainStyledAttributes(attributeSet, C0736j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0736j.AppCompatTextView_autoSizeTextType)) {
            this.f3917c = obtainStyledAttributes.getInt(C0736j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0736j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0736j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0736j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0736j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0736j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0736j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0736j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C0736j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m6169a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m6175k()) {
            this.f3917c = 0;
        } else if (this.f3917c == 1) {
            if (!this.f3923i) {
                DisplayMetrics displayMetrics = this.f3926l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m6168a(dimension2, dimension3, dimension);
            }
            m6173i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5564a(int[] iArr, int i) {
        if (m6175k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f3926l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f3922h = m6171a(iArr2);
                if (!m6172h()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f3923i = false;
            }
            if (m6173i()) {
                mo5569f();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5565b() {
        return Math.round(this.f3919e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo5566c() {
        return Math.round(this.f3920f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo5567d() {
        return Math.round(this.f3921g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int[] mo5568e() {
        return this.f3922h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo5569f() {
        if (mo5570g()) {
            if (this.f3918d) {
                if (this.f3925k.getMeasuredHeight() > 0 && this.f3925k.getMeasuredWidth() > 0) {
                    int measuredWidth = ((Boolean) m6165a((Object) this.f3925k, "getHorizontallyScrolling", (T) Boolean.valueOf(false))).booleanValue() ? 1048576 : (this.f3925k.getMeasuredWidth() - this.f3925k.getTotalPaddingLeft()) - this.f3925k.getTotalPaddingRight();
                    int height = (this.f3925k.getHeight() - this.f3925k.getCompoundPaddingBottom()) - this.f3925k.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f3915a) {
                            f3915a.setEmpty();
                            f3915a.right = (float) measuredWidth;
                            f3915a.bottom = (float) height;
                            float a = (float) m6162a(f3915a);
                            if (a != this.f3925k.getTextSize()) {
                                mo5561a(0, a);
                            }
                        }
                    }
                }
                return;
            }
            this.f3918d = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo5570g() {
        return m6175k() && this.f3917c != 0;
    }
}
