package com.bumptech.glide.load.engine.p047b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.engine.b.i */
public final class C1432i {

    /* renamed from: a */
    private final int f4763a;

    /* renamed from: b */
    private final int f4764b;

    /* renamed from: c */
    private final Context f4765c;

    /* renamed from: d */
    private final int f4766d;

    /* renamed from: com.bumptech.glide.load.engine.b.i$a */
    public static final class C1433a {

        /* renamed from: a */
        static final int f4767a = (VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: b */
        final Context f4768b;

        /* renamed from: c */
        ActivityManager f4769c;

        /* renamed from: d */
        C1435c f4770d;

        /* renamed from: e */
        float f4771e = 2.0f;

        /* renamed from: f */
        float f4772f = ((float) f4767a);

        /* renamed from: g */
        float f4773g = 0.4f;

        /* renamed from: h */
        float f4774h = 0.33f;

        /* renamed from: i */
        int f4775i = 4194304;

        public C1433a(Context context) {
            this.f4768b = context;
            this.f4769c = (ActivityManager) context.getSystemService("activity");
            this.f4770d = new C1434b(context.getResources().getDisplayMetrics());
            if (VERSION.SDK_INT >= 26 && C1432i.m7276a(this.f4769c)) {
                this.f4772f = 0.0f;
            }
        }

        /* renamed from: a */
        public C1432i mo6192a() {
            return new C1432i(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b.i$b */
    private static final class C1434b implements C1435c {

        /* renamed from: a */
        private final DisplayMetrics f4776a;

        C1434b(DisplayMetrics displayMetrics) {
            this.f4776a = displayMetrics;
        }

        /* renamed from: a */
        public int mo6193a() {
            return this.f4776a.widthPixels;
        }

        /* renamed from: b */
        public int mo6194b() {
            return this.f4776a.heightPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b.i$c */
    interface C1435c {
        /* renamed from: a */
        int mo6193a();

        /* renamed from: b */
        int mo6194b();
    }

    C1432i(C1433a aVar) {
        this.f4765c = aVar.f4768b;
        this.f4766d = m7276a(aVar.f4769c) ? aVar.f4775i / 2 : aVar.f4775i;
        int a = m7274a(aVar.f4769c, aVar.f4773g, aVar.f4774h);
        float a2 = (float) (aVar.f4770d.mo6193a() * aVar.f4770d.mo6194b() * 4);
        int round = Math.round(aVar.f4772f * a2);
        int round2 = Math.round(a2 * aVar.f4771e);
        int i = a - this.f4766d;
        int i2 = round2 + round;
        if (i2 <= i) {
            this.f4764b = round2;
            this.f4763a = round;
        } else {
            float f = ((float) i) / (aVar.f4772f + aVar.f4771e);
            this.f4764b = Math.round(aVar.f4771e * f);
            this.f4763a = Math.round(f * aVar.f4772f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String str = "MemorySizeCalculator";
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m7275a(this.f4764b));
            sb.append(", pool size: ");
            sb.append(m7275a(this.f4763a));
            sb.append(", byte array size: ");
            sb.append(m7275a(this.f4766d));
            sb.append(", memory class limited? ");
            sb.append(i2 > a);
            sb.append(", max size: ");
            sb.append(m7275a(a));
            sb.append(", memoryClass: ");
            sb.append(aVar.f4769c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m7276a(aVar.f4769c));
            Log.d(str, sb.toString());
        }
    }

    /* renamed from: a */
    private static int m7274a(ActivityManager activityManager, float f, float f2) {
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (m7276a(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: a */
    private String m7275a(int i) {
        return Formatter.formatFileSize(this.f4765c, (long) i);
    }

    @TargetApi(19)
    /* renamed from: a */
    static boolean m7276a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: a */
    public int mo6189a() {
        return this.f4764b;
    }

    /* renamed from: b */
    public int mo6190b() {
        return this.f4763a;
    }

    /* renamed from: c */
    public int mo6191c() {
        return this.f4766d;
    }
}
