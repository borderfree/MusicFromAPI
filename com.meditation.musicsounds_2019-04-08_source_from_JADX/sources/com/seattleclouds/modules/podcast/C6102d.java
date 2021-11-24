package com.seattleclouds.modules.podcast;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.google.android.bitmapfun.C2422c;

/* renamed from: com.seattleclouds.modules.podcast.d */
public class C6102d extends C2422c {

    /* renamed from: e */
    private boolean f21650e = true;

    public C6102d(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8577a(ImageView imageView, Drawable drawable) {
        if (this.f21650e) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(17170445), drawable});
            imageView.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(200);
            return;
        }
        imageView.setImageDrawable(drawable);
    }
}
