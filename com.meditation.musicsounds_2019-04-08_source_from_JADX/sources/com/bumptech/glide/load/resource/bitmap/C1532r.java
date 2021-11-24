package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.p046a.C1398e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.r */
public final class C1532r {

    /* renamed from: a */
    private static final Paint f5004a = new Paint(6);

    /* renamed from: b */
    private static final Paint f5005b = new Paint(7);

    /* renamed from: c */
    private static final Paint f5006c = new Paint(7);

    /* renamed from: d */
    private static final Set<String> f5007d = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));

    /* renamed from: e */
    private static final Lock f5008e = (f5007d.contains(Build.MODEL) ? new ReentrantLock() : new C1533a());

    /* renamed from: com.bumptech.glide.load.resource.bitmap.r$a */
    private static final class C1533a implements Lock {
        C1533a() {
        }

        public void lock() {
        }

        public void lockInterruptibly() {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, TimeUnit timeUnit) {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        f5006c.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
    }

    /* renamed from: a */
    public static int m7625a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private static Config m7626a(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888;
    }

    /* renamed from: a */
    public static Bitmap m7627a(C1398e eVar, Bitmap bitmap, int i) {
        if (!m7635b(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m7630a(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a = eVar.mo6138a(Math.round(rectF.width()), Math.round(rectF.height()), m7626a(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        m7632a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    public static Bitmap m7628a(C1398e eVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f3 = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
            f = 0.0f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f + 0.5f)), (float) ((int) (f3 + 0.5f)));
        Bitmap a = eVar.mo6138a(i, i2, m7626a(bitmap));
        m7631a(bitmap, a);
        m7632a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    public static Lock m7629a() {
        return f5008e;
    }

    /* renamed from: a */
    static void m7630a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
        matrix.postScale(-1.0f, 1.0f);
    }

    /* renamed from: a */
    public static void m7631a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* renamed from: a */
    private static void m7632a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f5008e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f5004a);
            m7633a(canvas);
        } finally {
            f5008e.unlock();
        }
    }

    /* renamed from: a */
    private static void m7633a(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: b */
    public static Bitmap m7634b(C1398e eVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap a = eVar.mo6138a((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m7626a(bitmap));
        m7631a(bitmap, a);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            Log.v("TransformationUtils", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            Log.v("TransformationUtils", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(a.getWidth());
            sb3.append("x");
            sb3.append(a.getHeight());
            Log.v("TransformationUtils", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
            Log.v("TransformationUtils", sb4.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m7632a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: b */
    public static boolean m7635b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public static Bitmap m7636c(C1398e eVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return m7634b(eVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }
}
