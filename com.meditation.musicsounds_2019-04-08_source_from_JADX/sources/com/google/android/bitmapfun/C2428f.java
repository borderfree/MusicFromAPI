package com.google.android.bitmapfun;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: com.google.android.bitmapfun.f */
public class C2428f extends BitmapDrawable {

    /* renamed from: a */
    private int f7729a = 0;

    /* renamed from: b */
    private int f7730b = 0;

    /* renamed from: c */
    private boolean f7731c;

    public C2428f(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* renamed from: a */
    private synchronized void m11303a() {
        if (this.f7729a <= 0 && this.f7730b <= 0 && this.f7731c && m11304b()) {
            getBitmap().recycle();
        }
    }

    /* renamed from: b */
    private synchronized boolean m11304b() {
        Bitmap bitmap;
        bitmap = getBitmap();
        return bitmap != null && !bitmap.isRecycled();
    }

    /* renamed from: a */
    public void mo8591a(boolean z) {
        synchronized (this) {
            if (z) {
                try {
                    this.f7730b++;
                    this.f7731c = true;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            } else {
                this.f7730b--;
            }
        }
        m11303a();
    }

    /* renamed from: b */
    public void mo8592b(boolean z) {
        synchronized (this) {
            if (z) {
                try {
                    this.f7729a++;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            } else {
                this.f7729a--;
            }
        }
        m11303a();
    }
}
