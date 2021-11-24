package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0087a.C0093f;
import android.support.design.C0087a.C0098k;
import android.support.design.widget.C0164b.C0178c;
import android.support.p009v4.view.C0626s;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout extends LinearLayout implements C0178c {

    /* renamed from: a */
    private TextView f218a;

    /* renamed from: b */
    private Button f219b;

    /* renamed from: c */
    private int f220c;

    /* renamed from: d */
    private int f221d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0098k.SnackbarLayout);
        this.f220c = obtainStyledAttributes.getDimensionPixelSize(C0098k.SnackbarLayout_android_maxWidth, -1);
        this.f221d = obtainStyledAttributes.getDimensionPixelSize(C0098k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static void m265a(View view, int i, int i2) {
        if (C0626s.m2875r(view)) {
            C0626s.m2839a(view, C0626s.m2864g(view), i, C0626s.m2865h(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    private boolean m266a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f218a.getPaddingTop() == i2 && this.f218a.getPaddingBottom() == i3) {
            return z;
        }
        m265a((View) this.f218a, i2, i3);
        return true;
    }

    /* renamed from: a */
    public void mo296a(int i, int i2) {
        this.f218a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f218a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f219b.getVisibility() == 0) {
            this.f219b.setAlpha(0.0f);
            this.f219b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: b */
    public void mo297b(int i, int i2) {
        this.f218a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f218a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f219b.getVisibility() == 0) {
            this.f219b.setAlpha(1.0f);
            this.f219b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f219b;
    }

    public TextView getMessageView() {
        return this.f218a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f218a = (TextView) findViewById(C0093f.snackbar_text);
        this.f219b = (Button) findViewById(C0093f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (m266a(1, r0, r0 - r1) != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (m266a(0, r0, r0) != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f220c
            if (r0 <= 0) goto L_0x001a
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f220c
            if (r0 <= r1) goto L_0x001a
            int r8 = r7.f220c
            r0 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            super.onMeasure(r8, r9)
        L_0x001a:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = android.support.design.C0087a.C0091d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = android.support.design.C0087a.C0091d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f218a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003e
            r2 = 1
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            if (r2 == 0) goto L_0x0058
            int r5 = r7.f221d
            if (r5 <= 0) goto L_0x0058
            android.widget.Button r5 = r7.f219b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f221d
            if (r5 <= r6) goto L_0x0058
            int r1 = r0 - r1
            boolean r0 = r7.m266a(r4, r0, r1)
            if (r0 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0058:
            if (r2 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            boolean r0 = r7.m266a(r3, r0, r0)
            if (r0 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            if (r4 == 0) goto L_0x0069
            super.onMeasure(r8, r9)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.internal.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
