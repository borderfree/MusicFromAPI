package com.facebook.ads.internal.p077s.p079b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Base64;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import java.io.InputStream;

/* renamed from: com.facebook.ads.internal.s.b.c */
public class C1818c {
    /* renamed from: a */
    private static int m8952a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    public static Bitmap m8953a(C1817b bVar) {
        byte[] decode = Base64.decode(bVar.mo7079a(C1808r.f5899b), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: a */
    public static Bitmap m8954a(InputStream inputStream, int i, int i2) {
        if (VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C1821e eVar = new C1821e(inputStream);
        eVar.mark(8192);
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar, null, options);
        eVar.reset();
        if (eVar.mo7082a()) {
            return BitmapFactory.decodeStream(eVar);
        }
        options.inSampleSize = m8952a(options, i2, i);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(eVar, null, options);
    }

    /* renamed from: a */
    public static Bitmap m8955a(String str, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m8952a(options, i2, i);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    public static Drawable m8956a(Context context, C1817b bVar) {
        return new BitmapDrawable(context.getResources(), m8953a(bVar));
    }
}
