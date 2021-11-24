package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p009v4.p010a.C0310a;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.view.component.b */
public class C1922b extends Button {

    /* renamed from: a */
    public static final int f6333a = ((int) (C1808r.f5899b * 16.0f));

    /* renamed from: b */
    private static final int f6334b = ((int) (C1808r.f5899b * 4.0f));

    /* renamed from: c */
    private final Paint f6335c = new Paint();

    /* renamed from: d */
    private final RectF f6336d;

    /* renamed from: e */
    private final boolean f6337e;

    public C1922b(Context context, boolean z, boolean z2, C1647d dVar) {
        super(context);
        this.f6337e = z;
        C1808r.m8938a((TextView) this, false, 16);
        setGravity(17);
        setPadding(f6333a, f6333a, f6333a, f6333a);
        setTextColor(dVar.mo6711f(z2));
        int e = dVar.mo6710e(z2);
        int a = C0310a.m1167a(e, -16777216, 0.1f);
        setButtonColor(e);
        this.f6336d = new RectF();
        if (!z) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(a));
            stateListDrawable.addState(new int[0], new ColorDrawable(e));
            C1808r.m8933a((View) this, (Drawable) stateListDrawable);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f6337e) {
            this.f6336d.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            canvas.drawRoundRect(this.f6336d, (float) f6334b, (float) f6334b, this.f6335c);
        }
        super.onDraw(canvas);
    }

    public void setButtonColor(int i) {
        this.f6335c.setStyle(Style.FILL);
        this.f6335c.setColor(i);
    }

    public void setText(String str) {
        super.setText(str.toUpperCase(Locale.US));
    }
}
