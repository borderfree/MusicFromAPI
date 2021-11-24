package com.seattleclouds.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.seattleclouds.C5451m.C5453b;
import com.seattleclouds.C5451m.C5463l;
import com.seattleclouds.C5451m.C5464m;

public class SegmentedControlButton extends RadioButton {

    /* renamed from: a */
    private boolean f23458a;

    /* renamed from: b */
    private int f23459b;

    /* renamed from: c */
    private int f23460c;

    /* renamed from: d */
    private Paint f23461d;

    public SegmentedControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5453b.segmentedControlButtonStyle);
    }

    public SegmentedControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo20704a(attributeSet, i);
    }

    /* renamed from: a */
    public void mo20704a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5464m.SegmentedControlButton, i, C5463l.Widget_Holo_SegmentedControl);
            setTextCompat(getText());
            int color = obtainStyledAttributes.getColor(C5464m.SegmentedControlButton_lineColor, 0);
            this.f23460c = obtainStyledAttributes.getDimensionPixelSize(C5464m.SegmentedControlButton_lineHeightUnselected, 0);
            this.f23459b = obtainStyledAttributes.getDimensionPixelSize(C5464m.SegmentedControlButton_lineHeightSelected, 0);
            this.f23461d = new Paint();
            this.f23461d.setColor(color);
            this.f23461d.setStyle(Style.FILL);
            obtainStyledAttributes.recycle();
        }
    }

    public int getLineColor() {
        return this.f23461d.getColor();
    }

    public int getLineHeightUnselected() {
        return this.f23460c;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23461d.getColor() == 0) {
            return;
        }
        if (this.f23459b > 0 || this.f23460c > 0) {
            int i = isChecked() ? this.f23459b : this.f23460c;
            if (i > 0) {
                canvas.drawRect(new Rect(0, getHeight() - i, getWidth(), getHeight()), this.f23461d);
            }
        }
    }

    public void setLineColor(int i) {
        this.f23461d.setColor(i);
    }

    public void setTextCompat(CharSequence charSequence) {
        if (this.f23458a) {
            charSequence = charSequence.toString().toUpperCase();
        }
        setText(charSequence);
    }
}
