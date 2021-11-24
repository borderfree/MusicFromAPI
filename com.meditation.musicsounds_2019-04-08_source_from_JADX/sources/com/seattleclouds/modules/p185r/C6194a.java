package com.seattleclouds.modules.p185r;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.PointF;

/* renamed from: com.seattleclouds.modules.r.a */
public class C6194a {
    /* renamed from: a */
    public static int m30183a(Options options, int i, int i2) {
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
    public static Bitmap m30184a(Bitmap bitmap) {
        int i;
        int i2;
        int i3;
        Bitmap copy = bitmap.copy(Config.RGB_565, true);
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        copy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i5 = width / 8;
        int i6 = i5 >> 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8 += width) {
            i7 += iArr[i8] & 255;
            iArr2[i8] = i7;
        }
        int i9 = 0;
        for (int i10 = 1; i10 < width; i10++) {
            int i11 = i10 - i6;
            if (i10 > i5) {
                i9 = i10 - i5;
            }
            int i12 = i10 - i9;
            int i13 = i10;
            int i14 = i11;
            int i15 = 0;
            int i16 = 0;
            while (i15 < height) {
                i16 += iArr[i13] & 255;
                iArr2[i13] = iArr2[i13 - 1] + i16;
                i13 += width;
                if (i10 >= i6 && i15 >= i6) {
                    int i17 = i15 < i5 ? 0 : i15 - i5;
                    int i18 = i17 * width;
                    int i19 = i15 * width;
                    double d = (double) ((iArr[i14] & 255) * (i15 - i17) * i12);
                    i3 = i9;
                    double d2 = (double) (((iArr2[i19 + i10] - iArr2[i18 + i10]) - iArr2[i19 + i9]) + iArr2[i18 + i9]);
                    Double.isNaN(d2);
                    if (d < d2 * 0.85d) {
                        iArr3[i14] = 0;
                    } else {
                        iArr3[i14] = 16777215;
                    }
                    i14 += width;
                } else {
                    i3 = i9;
                }
                i15++;
                i9 = i3;
            }
            int i20 = i9;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < height) {
            int i23 = height - 1;
            if (i21 < height - i6) {
                i2 = width - i6;
                i = i21 + i6;
            } else {
                i = i23;
                i2 = 0;
            }
            int i24 = (i21 * width) + i2;
            if (i21 > i6) {
                i22 = i21 - i6;
            }
            int i25 = i22 * width;
            int i26 = i * width;
            int i27 = i - i22;
            while (i2 < width) {
                int i28 = i2 < i6 ? 0 : i2 - i6;
                int i29 = i2 + i6;
                if (i29 >= width) {
                    i29 = width - 1;
                }
                int i30 = i22;
                int i31 = i6;
                double d3 = (double) ((iArr[i24] & 255) * (i29 - i28) * i27);
                double d4 = (double) (((iArr2[i26 + i29] - iArr2[i29 + i25]) - iArr2[i26 + i28]) + iArr2[i28 + i25]);
                Double.isNaN(d4);
                if (d3 < d4 * 0.85d) {
                    iArr3[i24] = 0;
                } else {
                    iArr3[i24] = 16777215;
                }
                i2++;
                i24++;
                i22 = i30;
                i6 = i31;
            }
            i21++;
            i22 = i22;
            i6 = i6;
        }
        copy.setPixels(iArr3, 0, width, 0, 0, width, height);
        return copy;
    }

    /* renamed from: a */
    public static Bitmap m30185a(String str, int i, int i2, Config config) {
        Options options = new Options();
        options.inPreferredConfig = config;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m30183a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    public static Point m30186a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        return new Point((int) Math.min(Math.min(pointF.x, pointF2.x), Math.min(pointF3.x, pointF4.x)), (int) Math.min(Math.min(pointF.y, pointF2.y), Math.min(pointF3.y, pointF4.y)));
    }

    /* renamed from: b */
    public static Point m30187b(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        return new Point((int) Math.max(Math.max(pointF.x, pointF2.x), Math.max(pointF3.x, pointF4.x)), (int) Math.max(Math.max(pointF.y, pointF2.y), Math.max(pointF3.y, pointF4.y)));
    }

    /* renamed from: c */
    public static Point m30188c(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        int sqrt = (int) Math.sqrt(Math.pow((double) (pointF4.x - pointF3.x), 2.0d) + Math.pow((double) (pointF4.x - pointF3.x), 2.0d));
        int sqrt2 = (int) Math.sqrt(Math.pow((double) (pointF2.x - pointF.x), 2.0d) + Math.pow((double) (pointF2.x - pointF.x), 2.0d));
        int sqrt3 = (int) Math.sqrt(Math.pow((double) (pointF2.y - pointF4.y), 2.0d) + Math.pow((double) (pointF2.y - pointF4.y), 2.0d));
        int sqrt4 = (int) Math.sqrt(Math.pow((double) (pointF.y - pointF3.y), 2.0d) + Math.pow((double) (pointF.y - pointF3.y), 2.0d));
        if (sqrt >= sqrt2) {
            sqrt = sqrt2;
        }
        if (sqrt3 < sqrt4) {
            sqrt4 = sqrt3;
        }
        return new Point(sqrt, sqrt4);
    }
}
