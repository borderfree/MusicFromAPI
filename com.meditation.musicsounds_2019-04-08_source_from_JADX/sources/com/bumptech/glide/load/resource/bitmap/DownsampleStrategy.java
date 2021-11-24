package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.C1376d;

public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f4943a = new C1505e();

    /* renamed from: b */
    public static final DownsampleStrategy f4944b = new C1504d();

    /* renamed from: c */
    public static final DownsampleStrategy f4945c = new C1501a();

    /* renamed from: d */
    public static final DownsampleStrategy f4946d = new C1502b();

    /* renamed from: e */
    public static final DownsampleStrategy f4947e = new C1503c();

    /* renamed from: f */
    public static final DownsampleStrategy f4948f = new C1506f();

    /* renamed from: g */
    public static final DownsampleStrategy f4949g = f4944b;

    /* renamed from: h */
    public static final C1376d<DownsampleStrategy> f4950h = C1376d.m7045a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", f4949g);

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    private static class C1501a extends DownsampleStrategy {
        C1501a() {
        }

        /* renamed from: a */
        public float mo6301a(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }

        /* renamed from: b */
        public SampleSizeRounding mo6302b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    private static class C1502b extends DownsampleStrategy {
        C1502b() {
        }

        /* renamed from: a */
        public float mo6301a(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }

        /* renamed from: b */
        public SampleSizeRounding mo6302b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    private static class C1503c extends DownsampleStrategy {
        C1503c() {
        }

        /* renamed from: a */
        public float mo6301a(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, f4943a.mo6301a(i, i2, i3, i4));
        }

        /* renamed from: b */
        public SampleSizeRounding mo6302b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    private static class C1504d extends DownsampleStrategy {
        C1504d() {
        }

        /* renamed from: a */
        public float mo6301a(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        /* renamed from: b */
        public SampleSizeRounding mo6302b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    private static class C1505e extends DownsampleStrategy {
        C1505e() {
        }

        /* renamed from: a */
        public float mo6301a(int i, int i2, int i3, int i4) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        /* renamed from: b */
        public SampleSizeRounding mo6302b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    private static class C1506f extends DownsampleStrategy {
        C1506f() {
        }

        /* renamed from: a */
        public float mo6301a(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        /* renamed from: b */
        public SampleSizeRounding mo6302b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: a */
    public abstract float mo6301a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract SampleSizeRounding mo6302b(int i, int i2, int i3, int i4);
}
