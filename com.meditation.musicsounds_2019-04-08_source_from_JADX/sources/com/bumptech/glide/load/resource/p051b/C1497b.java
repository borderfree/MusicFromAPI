package com.bumptech.glide.load.resource.p051b;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.bumptech.glide.load.engine.C1477o;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.resource.p053d.C1549c;
import com.bumptech.glide.p040g.C1257i;

/* renamed from: com.bumptech.glide.load.resource.b.b */
public abstract class C1497b<T extends Drawable> implements C1477o, C1482s<T> {

    /* renamed from: a */
    protected final T f4941a;

    public C1497b(T t) {
        this.f4941a = (Drawable) C1257i.m6691a(t);
    }

    /* renamed from: a */
    public void mo6278a() {
        Bitmap b;
        if (this.f4941a instanceof BitmapDrawable) {
            b = ((BitmapDrawable) this.f4941a).getBitmap();
        } else if (this.f4941a instanceof C1549c) {
            b = ((C1549c) this.f4941a).mo6365b();
        } else {
            return;
        }
        b.prepareToDraw();
    }

    /* renamed from: b */
    public final T mo6272d() {
        ConstantState constantState = this.f4941a.getConstantState();
        return constantState == null ? this.f4941a : constantState.newDrawable();
    }
}
