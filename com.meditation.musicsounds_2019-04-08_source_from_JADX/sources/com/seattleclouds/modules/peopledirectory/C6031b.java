package com.seattleclouds.modules.peopledirectory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.p009v4.app.C0374l;
import android.widget.ImageView;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.util.C6638s;

/* renamed from: com.seattleclouds.modules.peopledirectory.b */
public class C6031b extends C2422c {
    public C6031b(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: a */
    public static C6031b m29562a(Context context, C0374l lVar, int i) {
        C2420a aVar = new C2420a(context, "people_directory");
        aVar.f7706g = false;
        aVar.mo8566a(0.05f);
        aVar.f7708i = true;
        C6031b bVar = new C6031b(context, i, false);
        bVar.mo8576a(lVar, aVar);
        bVar.mo8580b(C5457f.people_directory_photo_placeholder);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8568a(Object obj) {
        Bitmap bitmap;
        if (obj == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.length() == 0) {
            return null;
        }
        if (valueOf.startsWith("http://") || valueOf.startsWith("https://")) {
            bitmap = super.mo8568a(obj);
        } else {
            bitmap = C6638s.m32068a(valueOf, Math.max(this.f7714a, this.f7715b));
            if (bitmap == null) {
                bitmap = C6638s.m32077b(valueOf, Math.max(this.f7714a, this.f7715b));
            }
        }
        return bitmap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8577a(ImageView imageView, Drawable drawable) {
        super.mo8577a(imageView, drawable);
        imageView.setBackgroundColor(0);
    }
}
