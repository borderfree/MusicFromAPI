package com.seattleclouds.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.google.android.bitmapfun.C2418b;
import com.google.android.bitmapfun.C2423d;
import com.google.android.bitmapfun.C2429g;
import com.seattleclouds.App;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.seattleclouds.util.ae */
public class C6576ae extends C2423d {
    public C6576ae(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    private Bitmap m31828a(String str) {
        return m31829a(str, this.f7714a, this.f7715b, mo8582f());
    }

    /* renamed from: a */
    public static Bitmap m31829a(String str, int i, int i2, C2418b bVar) {
        InputStream e = App.m25649e(str);
        if (e == null) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(e, null, options);
        try {
            e.close();
        } catch (IOException unused) {
        }
        options.inSampleSize = m11263a(options, i, i2);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        options.inJustDecodeBounds = false;
        if (C2429g.m11309c() && options.inSampleSize == 1) {
            m11266a(options, bVar);
        }
        InputStream e2 = App.m25649e(str);
        if (e2 == null) {
            return null;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(e2, null, options);
        try {
            e2.close();
        } catch (IOException unused2) {
        }
        return decodeStream;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8568a(Object obj) {
        return m31828a(String.valueOf(obj));
    }
}
