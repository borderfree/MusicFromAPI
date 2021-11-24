package com.bumptech.glide.request.p055a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.request.a.e */
public class C1576e {
    /* renamed from: a */
    public <Z> C1580i<ImageView, Z> mo6445a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C1573b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C1574c(imageView);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unhandled class: ");
        sb.append(cls);
        sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(sb.toString());
    }
}
