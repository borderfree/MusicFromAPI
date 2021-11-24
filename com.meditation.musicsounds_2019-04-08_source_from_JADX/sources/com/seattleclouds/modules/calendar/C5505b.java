package com.seattleclouds.modules.calendar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: com.seattleclouds.modules.calendar.b */
public class C5505b {

    /* renamed from: a */
    Context f19597a;

    public C5505b(Context context) {
        this.f19597a = context;
    }

    /* renamed from: a */
    public Drawable mo17840a(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }
}
