package android.support.p023v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.p009v4.p010a.p011a.C0313c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.q */
class C1121q {

    /* renamed from: a */
    private static final int[] f3890a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f3891b;

    /* renamed from: c */
    private Bitmap f3892c;

    C1121q(ProgressBar progressBar) {
        this.f3891b = progressBar;
    }

    /* renamed from: a */
    private Drawable mo5523a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m6125a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: a */
    private Drawable m6125a(Drawable drawable, boolean z) {
        if (drawable instanceof C0313c) {
            C0313c cVar = (C0313c) drawable;
            Drawable a = cVar.mo1131a();
            if (a != null) {
                cVar.mo1132a(m6125a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m6125a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f3892c == null) {
                this.f3892c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo5524b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            drawable = z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: b */
    private Shape mo5524b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo5519a() {
        return this.f3892c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5520a(AttributeSet attributeSet, int i) {
        C1078bk a = C1078bk.m5881a(this.f3891b.getContext(), attributeSet, f3890a, i, 0);
        Drawable b = a.mo5361b(0);
        if (b != null) {
            this.f3891b.setIndeterminateDrawable(mo5523a(b));
        }
        Drawable b2 = a.mo5361b(1);
        if (b2 != null) {
            this.f3891b.setProgressDrawable(m6125a(b2, false));
        }
        a.mo5358a();
    }
}
