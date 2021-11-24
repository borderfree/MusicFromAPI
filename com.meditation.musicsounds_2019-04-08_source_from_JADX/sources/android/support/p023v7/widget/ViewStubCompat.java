package android.support.p023v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f3397a;

    /* renamed from: b */
    private int f3398b;

    /* renamed from: c */
    private WeakReference<View> f3399c;

    /* renamed from: d */
    private LayoutInflater f3400d;

    /* renamed from: e */
    private C0990a f3401e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C0990a {
        /* renamed from: a */
        void mo4926a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3397a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736j.ViewStubCompat, i, 0);
        this.f3398b = obtainStyledAttributes.getResourceId(C0736j.ViewStubCompat_android_inflatedId, -1);
        this.f3397a = obtainStyledAttributes.getResourceId(C0736j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0736j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo4914a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f3397a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View inflate = (this.f3400d != null ? this.f3400d : LayoutInflater.from(getContext())).inflate(this.f3397a, viewGroup, false);
            if (this.f3398b != -1) {
                inflate.setId(this.f3398b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f3399c = new WeakReference<>(inflate);
            if (this.f3401e != null) {
                this.f3401e.mo4926a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f3398b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3400d;
    }

    public int getLayoutResource() {
        return this.f3397a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f3398b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f3400d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f3397a = i;
    }

    public void setOnInflateListener(C0990a aVar) {
        this.f3401e = aVar;
    }

    public void setVisibility(int i) {
        if (this.f3399c != null) {
            View view = (View) this.f3399c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo4914a();
        }
    }
}
