package com.google.android.bitmapfun;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.io.FileDescriptor;

/* renamed from: com.google.android.bitmapfun.d */
public class C2423d extends C2424e {

    /* renamed from: a */
    protected int f7714a;

    /* renamed from: b */
    protected int f7715b;

    public C2423d(Context context, int i) {
        super(context);
        mo8574a(i);
    }

    /* renamed from: a */
    public static int m11263a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int round = Math.round(((float) i3) / ((float) i2));
        int round2 = Math.round(((float) i4) / ((float) i));
        if (round >= round2) {
            round = round2;
        }
        while (((float) (i4 * i3)) / ((float) (round * round)) > ((float) (i * i2 * 2))) {
            round++;
        }
        return round;
    }

    /* renamed from: a */
    public static Bitmap m11264a(Resources resources, int i, int i2, int i3, C2418b bVar) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inSampleSize = m11263a(options, i2, i3);
        if (C2429g.m11309c()) {
            m11266a(options, bVar);
        }
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    /* renamed from: a */
    public static Bitmap m11265a(FileDescriptor fileDescriptor, int i, int i2, C2418b bVar) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = m11263a(options, i, i2);
        options.inJustDecodeBounds = false;
        if (C2429g.m11309c()) {
            m11266a(options, bVar);
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    @TargetApi(11)
    /* renamed from: a */
    protected static void m11266a(Options options, C2418b bVar) {
    }

    /* renamed from: c */
    private Bitmap m11267c(int i) {
        return m11264a(this.f7719d, i, this.f7714a, this.f7715b, mo8582f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8568a(Object obj) {
        return m11267c(Integer.parseInt(String.valueOf(obj)));
    }

    /* renamed from: a */
    public void mo8574a(int i) {
        mo8575a(i, i);
    }

    /* renamed from: a */
    public void mo8575a(int i, int i2) {
        this.f7714a = i;
        this.f7715b = i2;
    }
}
