package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.load.engine.p046a.C1399f;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
final class C1523k {

    /* renamed from: a */
    private static final C1398e f4988a = new C1399f() {
        /* renamed from: a */
        public void mo6141a(Bitmap bitmap) {
        }
    };

    /* renamed from: a */
    static C1482s<Bitmap> m7596a(C1398e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m7597b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f4988a;
        }
        return C1510d.m7522a(bitmap, eVar);
    }

    /* renamed from: b */
    private static Bitmap m7597b(C1398e eVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to draw ");
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                Log.w("DrawableToBitmap", sb.toString());
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock a = C1532r.m7629a();
            a.lock();
            Bitmap a2 = eVar.mo6138a(i, i2, Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(a2);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return a2;
            } finally {
                a.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to draw ");
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w("DrawableToBitmap", sb2.toString());
            }
            return null;
        }
    }
}
