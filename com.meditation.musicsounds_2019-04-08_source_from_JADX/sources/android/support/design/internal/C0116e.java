package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0087a.C0097j;
import android.support.design.C0087a.C0098k;
import android.support.p009v4.view.C0591aa;
import android.support.p009v4.view.C0622o;
import android.support.p009v4.view.C0626s;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: android.support.design.internal.e */
public class C0116e extends FrameLayout {

    /* renamed from: a */
    Drawable f252a;

    /* renamed from: b */
    Rect f253b;

    /* renamed from: c */
    private Rect f254c;

    public C0116e(Context context) {
        this(context, null);
    }

    public C0116e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0116e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f254c = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0098k.ScrimInsetsFrameLayout, i, C0097j.Widget_Design_ScrimInsetsFrameLayout);
        this.f252a = obtainStyledAttributes.getDrawable(C0098k.ScrimInsetsFrameLayout_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C0626s.m2845a((View) this, (C0622o) new C0622o() {
            /* renamed from: a */
            public C0591aa mo364a(View view, C0591aa aaVar) {
                if (C0116e.this.f253b == null) {
                    C0116e.this.f253b = new Rect();
                }
                C0116e.this.f253b.set(aaVar.mo2413a(), aaVar.mo2415b(), aaVar.mo2416c(), aaVar.mo2417d());
                C0116e.this.mo360a(aaVar);
                C0116e.this.setWillNotDraw(!aaVar.mo2418e() || C0116e.this.f252a == null);
                C0626s.m2857c(C0116e.this);
                return aaVar.mo2421g();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo360a(C0591aa aaVar) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f253b != null && this.f252a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f254c.set(0, 0, width, this.f253b.top);
            this.f252a.setBounds(this.f254c);
            this.f252a.draw(canvas);
            this.f254c.set(0, height - this.f253b.bottom, width, height);
            this.f252a.setBounds(this.f254c);
            this.f252a.draw(canvas);
            this.f254c.set(0, this.f253b.top, this.f253b.left, height - this.f253b.bottom);
            this.f252a.setBounds(this.f254c);
            this.f252a.draw(canvas);
            this.f254c.set(width - this.f253b.right, this.f253b.top, width, height - this.f253b.bottom);
            this.f252a.setBounds(this.f254c);
            this.f252a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f252a != null) {
            this.f252a.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f252a != null) {
            this.f252a.setCallback(null);
        }
    }
}
