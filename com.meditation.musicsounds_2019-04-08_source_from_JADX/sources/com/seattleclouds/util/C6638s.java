package com.seattleclouds.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.modules.p185r.C6194a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;

/* renamed from: com.seattleclouds.util.s */
public class C6638s {

    /* renamed from: a */
    private static final Point[] f23373a = {new Point(1536, 2048), new Point(1152, 1536), new Point(768, 1024), new Point(600, 800)};

    /* renamed from: a */
    public static Bitmap m32065a(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* renamed from: a */
    public static Bitmap m32066a(Bitmap bitmap, int i, int i2, boolean z) {
        if (bitmap == null) {
            return null;
        }
        double width = (double) bitmap.getWidth();
        double height = (double) bitmap.getHeight();
        Double.isNaN(width);
        Double.isNaN(height);
        double d = width / height;
        if ((!z || bitmap.getWidth() >= bitmap.getHeight()) && (z || bitmap.getWidth() <= bitmap.getHeight())) {
            double d2 = (double) i2;
            Double.isNaN(d2);
            i = (int) (d2 * d);
        } else {
            double d3 = (double) i;
            Double.isNaN(d3);
            i2 = (int) (d3 / d);
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, true);
    }

    /* renamed from: a */
    public static Bitmap m32067a(Uri uri, int i, Activity activity) {
        Options options = new Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        if (uri.toString().indexOf("content://") == 0) {
            try {
                BitmapFactory.decodeStream(activity.getContentResolver().openInputStream(uri), null, options);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            BitmapFactory.decodeStream(new FileInputStream(new File(uri.getPath())), null, options);
        }
        if (options.outHeight > i || options.outWidth > i) {
            double d = (double) i;
            double min = (double) Math.min(options.outHeight, options.outWidth);
            Double.isNaN(d);
            Double.isNaN(min);
            i2 = (int) Math.pow(2.0d, (double) ((int) (Math.log(d / min) / Math.log(0.5d))));
        }
        Options options2 = new Options();
        options2.inSampleSize = i2;
        options2.inPreferredConfig = Config.RGB_565;
        if (uri.toString().indexOf("content://") != 0) {
            return BitmapFactory.decodeStream(new FileInputStream(new File(uri.getPath())), null, options2);
        }
        try {
            return BitmapFactory.decodeStream(activity.getContentResolver().openInputStream(uri), null, options2);
        } catch (FileNotFoundException e2) {
            Log.e("ImageUtil", "decodeBitmapFromStream error", e2);
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m32068a(String str, int i) {
        int i2;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(App.m25649e(str), null, options);
        if (options.outHeight > i || options.outWidth > i) {
            double d = (double) i;
            double min = (double) Math.min(options.outHeight, options.outWidth);
            Double.isNaN(d);
            Double.isNaN(min);
            i2 = (int) Math.pow(2.0d, (double) ((int) (Math.log(d / min) / Math.log(0.5d))));
        } else {
            i2 = 1;
        }
        Options options2 = new Options();
        options2.inSampleSize = i2;
        options2.inPurgeable = true;
        return BitmapFactory.decodeStream(App.m25649e(str), null, options2);
    }

    /* renamed from: a */
    public static Bitmap m32069a(String str, int i, int i2, boolean z) {
        Bitmap a = m32068a(str, Math.max(i, i2));
        if (a == null) {
            return null;
        }
        return m32066a(a, i, i2, z);
    }

    /* renamed from: a */
    public static Bitmap m32070a(String str, Bitmap bitmap) {
        int i;
        try {
            ExifInterface exifInterface = new ExifInterface(str);
            if (exifInterface.getAttribute("Orientation").equals("6")) {
                i = 90;
            } else if (exifInterface.getAttribute("Orientation").equals("8")) {
                i = 270;
            } else if (!exifInterface.getAttribute("Orientation").equals("3")) {
                return bitmap;
            } else {
                i = 180;
            }
            return m32065a(bitmap, i);
        } catch (IOException unused) {
            return bitmap;
        }
    }

    /* renamed from: a */
    public static Boolean m32071a(String str, String str2) {
        CompressFormat compressFormat = m32079c(str) ? CompressFormat.PNG : CompressFormat.JPEG;
        Point[] pointArr = f23373a;
        int length = pointArr.length;
        int i = 0;
        while (i < length) {
            Point point = pointArr[i];
            try {
                Bitmap a = C6194a.m30185a(str, point.x, point.y, Config.ALPHA_8);
                if (a != null) {
                    a = m32070a(str, a);
                }
                Boolean valueOf = Boolean.valueOf(m32074a(a, compressFormat, str2));
                m32073a(a);
                return valueOf;
            } catch (OutOfMemoryError unused) {
                i++;
            }
        }
        return Boolean.valueOf(false);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m32072a(java.lang.String r5) {
        /*
            java.io.InputStream r5 = com.seattleclouds.App.m25649e(r5)
            if (r5 != 0) goto L_0x0009
            java.lang.String r5 = ""
            return r5
        L_0x0009:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r1 = new byte[r1]
        L_0x0012:
            int r2 = r1.length     // Catch:{ IOException -> 0x0043 }
            r3 = 0
            int r2 = r5.read(r1, r3, r2)     // Catch:{ IOException -> 0x0043 }
            r4 = -1
            if (r2 == r4) goto L_0x001f
            r0.write(r1, r3, r2)     // Catch:{ IOException -> 0x0043 }
            goto L_0x0012
        L_0x001f:
            r0.flush()     // Catch:{ IOException -> 0x0043 }
            if (r5 == 0) goto L_0x0027
            r5.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x0036 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0036 }
            r1 = 2
            byte[] r0 = android.util.Base64.encode(r0, r1)     // Catch:{ Exception -> 0x0036 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0036 }
            return r5
        L_0x0036:
            r5 = move-exception
            java.lang.String r0 = "ImageUtil"
            java.lang.String r1 = "base64EncodeFromResources error"
            android.util.Log.e(r0, r1, r5)
            java.lang.String r5 = ""
            return r5
        L_0x0041:
            r0 = move-exception
            goto L_0x0053
        L_0x0043:
            r0 = move-exception
            java.lang.String r1 = "ImageUtil"
            java.lang.String r2 = "base64EncodeFromResources error"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = ""
            if (r5 == 0) goto L_0x0052
            r5.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r0
        L_0x0053:
            if (r5 == 0) goto L_0x0058
            r5.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.C6638s.m32072a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static void m32073a(Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.recycle();
        }
        System.gc();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0021 A[SYNTHETIC, Splitter:B:20:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0028 A[SYNTHETIC, Splitter:B:26:0x0028] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m32074a(android.graphics.Bitmap r4, android.graphics.Bitmap.CompressFormat r5, java.lang.String r6) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0025, all -> 0x001e }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0025, all -> 0x001e }
            r3.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0025, all -> 0x001e }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0025, all -> 0x001e }
            r6 = 100
            r4.compress(r5, r6, r2)     // Catch:{ FileNotFoundException -> 0x001c, all -> 0x0019 }
            r4 = 1
            r2.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r4
        L_0x0019:
            r4 = move-exception
            r1 = r2
            goto L_0x001f
        L_0x001c:
            r1 = r2
            goto L_0x0026
        L_0x001e:
            r4 = move-exception
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r1.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            throw r4
        L_0x0025:
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.C6638s.m32074a(android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static int m32075b(String str) {
        try {
            ExifInterface exifInterface = new ExifInterface(new File(str).getAbsolutePath());
            if (exifInterface.getAttribute("Orientation").equals("6")) {
                return 90;
            }
            if (exifInterface.getAttribute("Orientation").equals("8")) {
                return 270;
            }
            return exifInterface.getAttribute("Orientation").equals("3") ? 180 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static Bitmap m32076b(Bitmap bitmap, int i) {
        int[] iArr;
        int i2 = i;
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        if (i2 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 * 256;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, new int[]{i6, 3});
        int i11 = i2 + 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            Bitmap bitmap2 = copy;
            int i15 = -i2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i15 <= i2) {
                int i25 = i5;
                int i26 = height;
                int i27 = iArr2[i13 + Math.min(i4, Math.max(i15, 0))];
                int[] iArr9 = iArr8[i15 + i2];
                iArr9[0] = (i27 & 16711680) >> 16;
                iArr9[1] = (i27 & 65280) >> 8;
                iArr9[2] = i27 & 255;
                int abs = i11 - Math.abs(i15);
                i16 += iArr9[0] * abs;
                i17 += iArr9[1] * abs;
                i18 += iArr9[2] * abs;
                if (i15 > 0) {
                    i19 += iArr9[0];
                    i20 += iArr9[1];
                    i21 += iArr9[2];
                } else {
                    i22 += iArr9[0];
                    i23 += iArr9[1];
                    i24 += iArr9[2];
                }
                i15++;
                height = i26;
                i5 = i25;
            }
            int i28 = i5;
            int i29 = height;
            int i30 = i2;
            int i31 = 0;
            while (i31 < width) {
                iArr3[i13] = iArr7[i16];
                iArr4[i13] = iArr7[i17];
                iArr5[i13] = iArr7[i18];
                int i32 = i16 - i22;
                int i33 = i17 - i23;
                int i34 = i18 - i24;
                int[] iArr10 = iArr8[((i30 - i2) + i6) % i6];
                int i35 = i22 - iArr10[0];
                int i36 = i23 - iArr10[1];
                int i37 = i24 - iArr10[2];
                if (i12 == 0) {
                    iArr = iArr7;
                    iArr6[i31] = Math.min(i31 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i38 = iArr2[i14 + iArr6[i31]];
                iArr10[0] = (i38 & 16711680) >> 16;
                iArr10[1] = (i38 & 65280) >> 8;
                iArr10[2] = i38 & 255;
                int i39 = i19 + iArr10[0];
                int i40 = i20 + iArr10[1];
                int i41 = i21 + iArr10[2];
                i16 = i32 + i39;
                i17 = i33 + i40;
                i18 = i34 + i41;
                i30 = (i30 + 1) % i6;
                int[] iArr11 = iArr8[i30 % i6];
                i22 = i35 + iArr11[0];
                i23 = i36 + iArr11[1];
                i24 = i37 + iArr11[2];
                i19 = i39 - iArr11[0];
                i20 = i40 - iArr11[1];
                i21 = i41 - iArr11[2];
                i13++;
                i31++;
                iArr7 = iArr;
            }
            int[] iArr12 = iArr7;
            i14 += width;
            i12++;
            copy = bitmap2;
            height = i29;
            i5 = i28;
        }
        Bitmap bitmap3 = copy;
        int i42 = i5;
        int i43 = height;
        int[] iArr13 = iArr7;
        int i44 = 0;
        while (i44 < width) {
            int i45 = -i2;
            int i46 = i45 * width;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            while (i45 <= i2) {
                int[] iArr14 = iArr6;
                int max = Math.max(0, i46) + i44;
                int[] iArr15 = iArr8[i45 + i2];
                iArr15[0] = iArr3[max];
                iArr15[1] = iArr4[max];
                iArr15[2] = iArr5[max];
                int abs2 = i11 - Math.abs(i45);
                i47 += iArr3[max] * abs2;
                i48 += iArr4[max] * abs2;
                i49 += iArr5[max] * abs2;
                if (i45 > 0) {
                    i50 += iArr15[0];
                    i51 += iArr15[1];
                    i52 += iArr15[2];
                } else {
                    i53 += iArr15[0];
                    i54 += iArr15[1];
                    i55 += iArr15[2];
                }
                int i56 = i42;
                if (i45 < i56) {
                    i46 += width;
                }
                i45++;
                i42 = i56;
                iArr6 = iArr14;
            }
            int[] iArr16 = iArr6;
            int i57 = i42;
            int i58 = i44;
            int i59 = i51;
            int i60 = i52;
            int i61 = 0;
            int i62 = i2;
            int i63 = i50;
            int i64 = i49;
            int i65 = i48;
            int i66 = i47;
            int i67 = i43;
            while (i61 < i67) {
                iArr2[i58] = (iArr2[i58] & -16777216) | (iArr13[i66] << 16) | (iArr13[i65] << 8) | iArr13[i64];
                int i68 = i66 - i53;
                int i69 = i65 - i54;
                int i70 = i64 - i55;
                int[] iArr17 = iArr8[((i62 - i2) + i6) % i6];
                int i71 = i53 - iArr17[0];
                int i72 = i54 - iArr17[1];
                int i73 = i55 - iArr17[2];
                if (i44 == 0) {
                    iArr16[i61] = Math.min(i61 + i11, i57) * width;
                }
                int i74 = iArr16[i61] + i44;
                iArr17[0] = iArr3[i74];
                iArr17[1] = iArr4[i74];
                iArr17[2] = iArr5[i74];
                int i75 = i63 + iArr17[0];
                int i76 = i59 + iArr17[1];
                int i77 = i60 + iArr17[2];
                i66 = i68 + i75;
                i65 = i69 + i76;
                i64 = i70 + i77;
                i62 = (i62 + 1) % i6;
                int[] iArr18 = iArr8[i62];
                i53 = i71 + iArr18[0];
                i54 = i72 + iArr18[1];
                i55 = i73 + iArr18[2];
                i63 = i75 - iArr18[0];
                i59 = i76 - iArr18[1];
                i60 = i77 - iArr18[2];
                i58 += width;
                i61++;
                i2 = i;
            }
            i44++;
            i42 = i57;
            i43 = i67;
            iArr6 = iArr16;
            i2 = i;
        }
        bitmap3.setPixels(iArr2, 0, width, 0, 0, width, i43);
        return bitmap3;
    }

    /* renamed from: b */
    public static Bitmap m32077b(String str, int i) {
        int i2;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outHeight > i || options.outWidth > i) {
            double d = (double) i;
            double min = (double) Math.min(options.outHeight, options.outWidth);
            Double.isNaN(d);
            Double.isNaN(min);
            double log = (double) ((int) Math.log(d / min));
            double log2 = Math.log(0.5d);
            Double.isNaN(log);
            i2 = (int) Math.pow(2.0d, log / log2);
        } else {
            i2 = 1;
        }
        Options options2 = new Options();
        options2.inSampleSize = i2;
        options2.inPurgeable = true;
        return BitmapFactory.decodeFile(str, options2);
    }

    /* renamed from: b */
    public static Bitmap m32078b(String str, int i, int i2, boolean z) {
        Bitmap b = m32077b(str, Math.max(i, i2));
        if (b == null) {
            return null;
        }
        return m32066a(b, i, i2, z);
    }

    /* renamed from: c */
    public static boolean m32079c(String str) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return options.outMimeType != null && options.outMimeType.equalsIgnoreCase("image/png");
    }
}
