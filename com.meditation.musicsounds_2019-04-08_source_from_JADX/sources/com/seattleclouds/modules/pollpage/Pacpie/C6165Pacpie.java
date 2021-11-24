package com.seattleclouds.modules.pollpage.Pacpie;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.seattleclouds.C5451m.C5455d;
import com.seattleclouds.C5451m.C5464m;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"DrawAllocation"})
/* renamed from: com.seattleclouds.modules.pollpage.Pacpie.Pacpie */
public class C6165Pacpie extends View implements OnTouchListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public PacpieState f21847a = PacpieState.WAIT;

    /* renamed from: b */
    private Paint f21848b = new Paint();

    /* renamed from: c */
    private Paint f21849c = new Paint();

    /* renamed from: d */
    private int f21850d;

    /* renamed from: e */
    private int f21851e;

    /* renamed from: f */
    private float f21852f = 3.0f;

    /* renamed from: g */
    private float f21853g = 0.0f;

    /* renamed from: h */
    private boolean f21854h = true;

    /* renamed from: i */
    private boolean f21855i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f21856j = false;

    /* renamed from: k */
    private int f21857k;

    /* renamed from: l */
    private int f21858l;

    /* renamed from: m */
    private float f21859m;

    /* renamed from: n */
    private float f21860n;

    /* renamed from: o */
    private int f21861o;

    /* renamed from: p */
    private long f21862p;

    /* renamed from: q */
    private List<C6168b> f21863q = new ArrayList();

    public C6165Pacpie(Context context) {
        super(context);
        this.f21850d = context.getResources().getColor(C5455d.piechart_default_line_color);
        this.f21851e = context.getResources().getColor(C5455d.piechart_default_slice_color);
        this.f21857k = context.getResources().getColor(17170445);
    }

    public C6165Pacpie(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21857k = context.getResources().getColor(17170445);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5464m.PacPieChart, 0, 0);
        try {
            this.f21855i = obtainStyledAttributes.getBoolean(C5464m.PacPieChart_sliceAntiAlias, true);
            this.f21851e = obtainStyledAttributes.getColor(C5464m.PacPieChart_sliceDefaultColor, context.getResources().getColor(C5455d.piechart_default_slice_color));
            this.f21853g = obtainStyledAttributes.getFloat(C5464m.PacPieChart_sliceStrokeWidth, 0.0f);
            this.f21854h = obtainStyledAttributes.getBoolean(C5464m.PacPieChart_lineAntiAlias, true);
            this.f21850d = obtainStyledAttributes.getColor(C5464m.PacPieChart_lineDefaultColor, context.getResources().getColor(C5455d.piechart_default_slice_color));
            this.f21852f = obtainStyledAttributes.getFloat(C5464m.PacPieChart_lineStrokeWidth, 3.0f);
            this.f21856j = obtainStyledAttributes.getBoolean(C5464m.PacPieChart_activate_rotation, this.f21856j);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo19364a() {
        int measuredHeight = getMeasuredHeight();
        setVisibility(0);
        C61661 r1 = new Animation() {
            /* access modifiers changed from: protected */
            public void applyTransformation(float f, Transformation transformation) {
                C6165Pacpie.this.f21847a = PacpieState.IS_READY_TO_DRAW;
                C6169c.m30058b(C6165Pacpie.this, f);
                C6169c.m30059c(C6165Pacpie.this, f);
                if (C6165Pacpie.this.f21856j) {
                    C6169c.m30057a(C6165Pacpie.this, f * 360.0f);
                }
                C6165Pacpie.this.invalidate();
            }

            public boolean willChangeBounds() {
                return true;
            }
        };
        r1.setDuration((long) ((int) (((float) (measuredHeight * 2)) / getContext().getResources().getDisplayMetrics().density)));
        startAnimation(r1);
    }

    /* renamed from: a */
    public void mo19365a(float f, float f2) {
    }

    public int getBackgroundColor() {
        return this.f21857k;
    }

    public int getLineColor() {
        return this.f21850d;
    }

    public float getLineStrokeWidth() {
        return this.f21852f;
    }

    public int getSliceColor() {
        return this.f21851e;
    }

    public float getSliceStrokeWidth() {
        return this.f21853g;
    }

    public PacpieState getState() {
        return this.f21847a;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"ClickableViewAccessibility"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f21847a == PacpieState.IS_READY_TO_DRAW) {
            canvas.drawColor(this.f21857k);
            this.f21848b.setAntiAlias(this.f21854h);
            this.f21848b.setStyle(Style.FILL);
            this.f21848b.setColor(this.f21851e);
            this.f21848b.setStrokeWidth(this.f21853g);
            this.f21849c.setAntiAlias(this.f21855i);
            this.f21849c.setColor(this.f21850d);
            this.f21849c.setStrokeWidth(this.f21852f);
            this.f21849c.setStyle(Style.STROKE);
            this.f21858l = getMeasuredWidth();
            if (getMeasuredHeight() < this.f21858l) {
                this.f21858l = getMeasuredHeight();
            }
            int measuredHeight = (getMeasuredHeight() - this.f21858l) / 2;
            int measuredWidth = (getMeasuredWidth() - this.f21858l) / 2;
            RectF rectF = new RectF((float) getPaddingLeft(), (float) getPaddingTop(), (float) (this.f21858l - getPaddingRight()), (float) (this.f21858l - getPaddingBottom()));
            rectF.offsetTo((float) (measuredWidth + getPaddingLeft()), (float) (measuredHeight + getPaddingTop()));
            this.f21859m = (float) PacpieState.START_INC.stateCode;
            int i = 0;
            while (i < this.f21863q.size()) {
                C6168b bVar = (C6168b) this.f21863q.get(i);
                this.f21848b.setColor(this.f21851e);
                if (-1 != bVar.f21885b) {
                    this.f21848b.setColor(bVar.f21885b);
                }
                if (0.0f != bVar.f21884a) {
                    this.f21860n = (bVar.f21884a / ((float) this.f21861o)) * 360.0f;
                    Canvas canvas2 = canvas;
                    RectF rectF2 = rectF;
                    canvas2.drawArc(rectF2, this.f21859m, this.f21860n, true, this.f21848b);
                    canvas2.drawArc(rectF2, this.f21859m, this.f21860n, true, this.f21849c);
                    this.f21859m += this.f21860n;
                    i++;
                } else {
                    throw new RuntimeException("percent is 0, will not be draw");
                }
            }
            setOnTouchListener(this);
            this.f21847a = PacpieState.IS_DRAW;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f21862p = SystemClock.elapsedRealtime();
                return true;
            case 1:
                if (SystemClock.elapsedRealtime() - this.f21862p <= 300) {
                    mo19365a(motionEvent.getX(), motionEvent.getY());
                }
                return false;
            default:
                return false;
        }
    }

    public void setBackgroundColor(int i) {
        this.f21857k = i;
    }

    public void setLineAntiAlias(boolean z) {
        this.f21854h = z;
    }

    public void setLineColor(int i) {
        this.f21850d = i;
    }

    public void setLineStrokeWidth(float f) {
        this.f21852f = f;
    }

    public void setRotation(boolean z) {
        this.f21856j = z;
    }

    public void setSliceAntiAlias(boolean z) {
        this.f21855i = z;
    }

    public void setSliceColor(int i) {
        this.f21851e = i;
    }

    public void setSliceStrokeWidth(float f) {
        this.f21853g = f;
    }

    public void setState(PacpieState pacpieState) {
        this.f21847a = pacpieState;
    }

    public void setValues(List<C6168b> list) {
        if (list == null || list.size() == 0) {
            throw new RuntimeException("data cannot be null or empty !");
        }
        this.f21863q = list;
        this.f21861o = 0;
        for (int i = 0; i < list.size(); i++) {
            this.f21861o = (int) (((float) this.f21861o) + ((C6168b) list.get(i)).f21884a);
        }
        this.f21847a = PacpieState.IS_READY_TO_DRAW;
    }
}
