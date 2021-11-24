package com.seattleclouds.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.bitmapfun.C2422c;

/* renamed from: com.seattleclouds.util.r */
public class C6636r extends C2422c {

    /* renamed from: e */
    private C6637a f23372e = null;

    /* renamed from: com.seattleclouds.util.r$a */
    public interface C6637a {
        /* renamed from: a */
        void mo17709a(ImageView imageView);
    }

    public C6636r(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8568a(Object obj) {
        if (obj == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.length() == 0) {
            return null;
        }
        Bitmap a = valueOf.startsWith("http") ? super.mo8568a(obj) : C6638s.m32068a(valueOf, Math.max(this.f7714a, this.f7715b));
        if (a == null) {
            a = C6638s.m32077b(valueOf, Math.max(this.f7714a, this.f7715b));
        }
        if (a != null) {
            a = C6638s.m32066a(a, this.f7714a, this.f7715b, true);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8577a(ImageView imageView, Drawable drawable) {
        super.mo8577a(imageView, drawable);
        if (this.f23372e != null) {
            this.f23372e.mo17709a(imageView);
        }
    }

    /* renamed from: a */
    public void mo20627a(C6637a aVar) {
        this.f23372e = aVar;
    }
}
