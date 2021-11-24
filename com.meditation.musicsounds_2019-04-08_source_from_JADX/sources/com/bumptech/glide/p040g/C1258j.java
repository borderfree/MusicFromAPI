package com.bumptech.glide.p040g;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import com.bumptech.glide.load.p044b.C1339l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.g.j */
public final class C1258j {

    /* renamed from: a */
    private static final char[] f4476a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f4477b = new char[64];

    /* renamed from: com.bumptech.glide.g.j$1 */
    static /* synthetic */ class C12591 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4478a = new int[Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4478a = r0
                int[] r0 = f4478a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4478a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f4478a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f4478a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f4478a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p040g.C1258j.C12591.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m6696a(float f) {
        return m6697a(f, 17);
    }

    /* renamed from: a */
    public static int m6697a(float f, int i) {
        return m6710b(Float.floatToIntBits(f), i);
    }

    /* renamed from: a */
    public static int m6698a(int i, int i2, Config config) {
        return i * i2 * m6699a(config);
    }

    /* renamed from: a */
    private static int m6699a(Config config) {
        if (config == null) {
            config = Config.ARGB_8888;
        }
        switch (C12591.f4478a[config.ordinal()]) {
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 8;
            default:
                return 4;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m6700a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        sb.append("[");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append("] ");
        sb.append(bitmap.getConfig());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static int m6701a(Object obj, int i) {
        return m6710b(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: a */
    public static int m6702a(boolean z, int i) {
        return m6710b(z ? 1 : 0, i);
    }

    /* renamed from: a */
    public static String m6703a(byte[] bArr) {
        String a;
        synchronized (f4477b) {
            a = m6704a(bArr, f4477b);
        }
        return a;
    }

    /* renamed from: a */
    private static String m6704a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = f4476a[b >>> 4];
            cArr[i2 + 1] = f4476a[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static <T> List<T> m6705a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> Queue<T> m6706a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static void m6707a() {
        if (!m6714c()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    public static boolean m6708a(int i, int i2) {
        return m6712b(i) && m6712b(i2);
    }

    /* renamed from: a */
    public static boolean m6709a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m6710b(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: b */
    public static void m6711b() {
        if (!m6715d()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: b */
    private static boolean m6712b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public static boolean m6713b(Object obj, Object obj2) {
        if (obj != null) {
            return obj instanceof C1339l ? ((C1339l) obj).mo6024a(obj2) : obj.equals(obj2);
        }
        return obj2 == null;
    }

    /* renamed from: c */
    public static boolean m6714c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: d */
    public static boolean m6715d() {
        return !m6714c();
    }
}
