package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C1290b;
import com.bumptech.glide.load.C1376d;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding;
import com.bumptech.glide.p040g.C1253e;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.C1258j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.resource.bitmap.j */
public final class C1520j {

    /* renamed from: a */
    public static final C1376d<DecodeFormat> f4975a = C1376d.m7045a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);
    @Deprecated

    /* renamed from: b */
    public static final C1376d<DownsampleStrategy> f4976b = DownsampleStrategy.f4950h;

    /* renamed from: c */
    public static final C1376d<Boolean> f4977c = C1376d.m7045a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.valueOf(false));

    /* renamed from: d */
    public static final C1376d<Boolean> f4978d = C1376d.m7044a("com.bumtpech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");

    /* renamed from: e */
    private static final Set<String> f4979e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: f */
    private static final C1522a f4980f = new C1522a() {
        /* renamed from: a */
        public void mo6332a() {
        }

        /* renamed from: a */
        public void mo6333a(C1398e eVar, Bitmap bitmap) {
        }
    };

    /* renamed from: g */
    private static final Set<ImageType> f4981g = Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));

    /* renamed from: h */
    private static final Queue<Options> f4982h = C1258j.m6706a(0);

    /* renamed from: i */
    private final C1398e f4983i;

    /* renamed from: j */
    private final DisplayMetrics f4984j;

    /* renamed from: k */
    private final C1393b f4985k;

    /* renamed from: l */
    private final List<ImageHeaderParser> f4986l;

    /* renamed from: m */
    private final C1527n f4987m = C1527n.m7605a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.j$a */
    public interface C1522a {
        /* renamed from: a */
        void mo6332a();

        /* renamed from: a */
        void mo6333a(C1398e eVar, Bitmap bitmap);
    }

    public C1520j(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C1398e eVar, C1393b bVar) {
        this.f4986l = list;
        this.f4984j = (DisplayMetrics) C1257i.m6691a(displayMetrics);
        this.f4983i = (C1398e) C1257i.m6691a(eVar);
        this.f4985k = (C1393b) C1257i.m6691a(bVar);
    }

    /* renamed from: a */
    private static int m7570a(double d) {
        int b = m7582b(d);
        double d2 = (double) b;
        Double.isNaN(d2);
        int c = m7585c(d2 * d);
        double d3 = (double) (((float) c) / ((float) b));
        Double.isNaN(d3);
        double d4 = d / d3;
        double d5 = (double) c;
        Double.isNaN(d5);
        return m7585c(d4 * d5);
    }

    /* renamed from: a */
    private Bitmap m7571a(InputStream inputStream, Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, boolean z, int i, int i2, boolean z2, C1522a aVar) {
        int i3;
        int i4;
        C1520j jVar;
        int i5;
        int i6;
        int i7;
        InputStream inputStream2 = inputStream;
        Options options2 = options;
        C1522a aVar2 = aVar;
        long a = C1253e.m6677a();
        int[] a2 = m7581a(inputStream2, options2, aVar2, this.f4983i);
        boolean z3 = false;
        int i8 = a2[0];
        int i9 = a2[1];
        String str = options2.outMimeType;
        boolean z4 = (i8 == -1 || i9 == -1) ? false : z;
        int b = C1290b.m6824b(this.f4986l, inputStream2, this.f4985k);
        int a3 = C1532r.m7625a(b);
        boolean b2 = C1532r.m7635b(b);
        int i10 = i;
        if (i10 == Integer.MIN_VALUE) {
            i4 = i2;
            i3 = i8;
        } else {
            i4 = i2;
            i3 = i10;
        }
        int i11 = i4 == Integer.MIN_VALUE ? i9 : i4;
        ImageType a4 = C1290b.m6822a(this.f4986l, inputStream2, this.f4985k);
        C1398e eVar = this.f4983i;
        ImageType imageType = a4;
        m7577a(a4, inputStream, aVar, eVar, downsampleStrategy, a3, i8, i9, i3, i11, options);
        int i12 = b;
        String str2 = str;
        int i13 = i9;
        int i14 = i8;
        C1522a aVar3 = aVar2;
        Options options3 = options2;
        m7578a(inputStream, decodeFormat, z4, b2, options, i3, i11);
        if (VERSION.SDK_INT >= 19) {
            z3 = true;
        }
        if (options3.inSampleSize == 1 || z3) {
            jVar = this;
            if (jVar.m7580a(imageType)) {
                if (i14 < 0 || i13 < 0 || !z2 || !z3) {
                    float f = m7579a(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                    int i15 = options3.inSampleSize;
                    float f2 = (float) i15;
                    int ceil = (int) Math.ceil((double) (((float) i14) / f2));
                    int ceil2 = (int) Math.ceil((double) (((float) i13) / f2));
                    i7 = Math.round(((float) ceil) * f);
                    i6 = Math.round(((float) ceil2) * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Calculated target [");
                        sb.append(i7);
                        sb.append("x");
                        sb.append(i6);
                        sb.append("] for source [");
                        sb.append(i14);
                        sb.append("x");
                        sb.append(i13);
                        sb.append("], sampleSize: ");
                        sb.append(i15);
                        sb.append(", targetDensity: ");
                        sb.append(options3.inTargetDensity);
                        sb.append(", density: ");
                        sb.append(options3.inDensity);
                        sb.append(", density multiplier: ");
                        sb.append(f);
                        Log.v("Downsampler", sb.toString());
                    }
                } else {
                    i7 = i3;
                    i6 = i11;
                }
                if (i7 > 0 && i6 > 0) {
                    m7576a(options3, jVar.f4983i, i7, i6);
                }
            }
        } else {
            jVar = this;
        }
        Bitmap b3 = m7583b(inputStream, options3, aVar3, jVar.f4983i);
        aVar3.mo6333a(jVar.f4983i, b3);
        if (Log.isLoggable("Downsampler", 2)) {
            i5 = i12;
            m7575a(i14, i13, str2, options, b3, i, i2, a);
        } else {
            i5 = i12;
        }
        Bitmap bitmap = null;
        if (b3 != null) {
            b3.setDensity(jVar.f4984j.densityDpi);
            bitmap = C1532r.m7627a(jVar.f4983i, b3, i5);
            if (!b3.equals(bitmap)) {
                jVar.f4983i.mo6141a(b3);
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private static synchronized Options m7572a() {
        Options options;
        synchronized (C1520j.class) {
            synchronized (f4982h) {
                options = (Options) f4982h.poll();
            }
            if (options == null) {
                options = new Options();
                m7587d(options);
            }
        }
        return options;
    }

    /* renamed from: a */
    private static IOException m7573a(IllegalArgumentException illegalArgumentException, int i, int i2, String str, Options options) {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception decoding bitmap, outWidth: ");
        sb.append(i);
        sb.append(", outHeight: ");
        sb.append(i2);
        sb.append(", outMimeType: ");
        sb.append(str);
        sb.append(", inBitmap: ");
        sb.append(m7584b(options));
        return new IOException(sb.toString(), illegalArgumentException);
    }

    @TargetApi(19)
    /* renamed from: a */
    private static String m7574a(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 19) {
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(bitmap.getAllocationByteCount());
            sb.append(")");
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(bitmap.getWidth());
        sb2.append("x");
        sb2.append(bitmap.getHeight());
        sb2.append("] ");
        sb2.append(bitmap.getConfig());
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    private static void m7575a(int i, int i2, String str, Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m7574a(bitmap));
        sb.append(" from [");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m7584b(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(C1253e.m6676a(j));
        Log.v("Downsampler", sb.toString());
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m7576a(Options options, C1398e eVar, int i, int i2) {
        Config config;
        if (VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo6142b(i, i2, config);
    }

    /* renamed from: a */
    private static void m7577a(ImageType imageType, InputStream inputStream, C1522a aVar, C1398e eVar, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, Options options) {
        int i6;
        int i7;
        int i8;
        ImageType imageType2 = imageType;
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        int i9 = i;
        int i10 = i2;
        int i11 = i3;
        int i12 = i4;
        int i13 = i5;
        Options options2 = options;
        if (i10 <= 0 || i11 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType);
                sb.append(" with target [");
                sb.append(i12);
                sb.append("x");
                sb.append(i13);
                sb.append("]");
                Log.d("Downsampler", sb.toString());
            }
            return;
        }
        float a = (i9 == 90 || i9 == 270) ? downsampleStrategy2.mo6301a(i11, i10, i12, i13) : downsampleStrategy2.mo6301a(i10, i11, i12, i13);
        if (a > 0.0f) {
            SampleSizeRounding b = downsampleStrategy2.mo6302b(i10, i11, i12, i13);
            if (b != null) {
                float f = (float) i10;
                float f2 = (float) i11;
                int c = i10 / m7585c((double) (a * f));
                int c2 = i11 / m7585c((double) (a * f2));
                int max = b == SampleSizeRounding.MEMORY ? Math.max(c, c2) : Math.min(c, c2);
                if (VERSION.SDK_INT > 23 || !f4979e.contains(options2.outMimeType)) {
                    int max2 = Math.max(1, Integer.highestOneBit(max));
                    i6 = (b != SampleSizeRounding.MEMORY || ((float) max2) >= 1.0f / a) ? max2 : max2 << 1;
                } else {
                    i6 = 1;
                }
                options2.inSampleSize = i6;
                if (imageType2 == ImageType.JPEG) {
                    float min = (float) Math.min(i6, 8);
                    i7 = (int) Math.ceil((double) (f / min));
                    i8 = (int) Math.ceil((double) (f2 / min));
                    int i14 = i6 / 8;
                    if (i14 > 0) {
                        i7 /= i14;
                        i8 /= i14;
                    }
                } else {
                    if (!(imageType2 == ImageType.PNG || imageType2 == ImageType.PNG_A)) {
                        if (imageType2 == ImageType.WEBP || imageType2 == ImageType.WEBP_A) {
                            if (VERSION.SDK_INT >= 24) {
                                float f3 = (float) i6;
                                i7 = Math.round(f / f3);
                                i8 = Math.round(f2 / f3);
                            }
                        } else if (i10 % i6 == 0 && i11 % i6 == 0) {
                            i7 = i10 / i6;
                            i8 = i11 / i6;
                        } else {
                            int[] a2 = m7581a(inputStream, options2, aVar, eVar);
                            i7 = a2[0];
                            i8 = a2[1];
                        }
                    }
                    float f4 = (float) i6;
                    i7 = (int) Math.floor((double) (f / f4));
                    i8 = (int) Math.floor((double) (f2 / f4));
                }
                double a3 = (double) downsampleStrategy2.mo6301a(i7, i8, i12, i13);
                if (VERSION.SDK_INT >= 19) {
                    options2.inTargetDensity = m7570a(a3);
                    options2.inDensity = m7582b(a3);
                }
                if (m7579a(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                if (Log.isLoggable("Downsampler", 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculate scaling, source: [");
                    sb2.append(i10);
                    sb2.append("x");
                    sb2.append(i11);
                    sb2.append("], target: [");
                    sb2.append(i12);
                    sb2.append("x");
                    sb2.append(i13);
                    sb2.append("], power of two scaled: [");
                    sb2.append(i7);
                    sb2.append("x");
                    sb2.append(i8);
                    sb2.append("], exact scale factor: ");
                    sb2.append(a);
                    sb2.append(", power of 2 sample size: ");
                    sb2.append(i6);
                    sb2.append(", adjusted scale factor: ");
                    sb2.append(a3);
                    sb2.append(", target density: ");
                    sb2.append(options2.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options2.inDensity);
                    Log.v("Downsampler", sb2.toString());
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Cannot scale with factor: ");
        sb3.append(a);
        sb3.append(" from: ");
        sb3.append(downsampleStrategy2);
        sb3.append(", source: [");
        sb3.append(i10);
        sb3.append("x");
        sb3.append(i11);
        sb3.append("], target: [");
        sb3.append(i12);
        sb3.append("x");
        sb3.append(i13);
        sb3.append("]");
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: a */
    private void m7578a(InputStream inputStream, DecodeFormat decodeFormat, boolean z, boolean z2, Options options, int i, int i2) {
        boolean z3;
        if (!this.f4987m.mo6335a(i, i2, options, decodeFormat, z, z2)) {
            if (decodeFormat == DecodeFormat.PREFER_ARGB_8888 || decodeFormat == DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE || VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Config.ARGB_8888;
                return;
            }
            try {
                z3 = C1290b.m6822a(this.f4986l, inputStream, this.f4985k).hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot determine whether the image has alpha or not from header, format ");
                    sb.append(decodeFormat);
                    Log.d("Downsampler", sb.toString(), e);
                }
                z3 = false;
            }
            options.inPreferredConfig = z3 ? Config.ARGB_8888 : Config.RGB_565;
            if (options.inPreferredConfig == Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* renamed from: a */
    private static boolean m7579a(Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    /* renamed from: a */
    private boolean m7580a(ImageType imageType) {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return f4981g.contains(imageType);
    }

    /* renamed from: a */
    private static int[] m7581a(InputStream inputStream, Options options, C1522a aVar, C1398e eVar) {
        options.inJustDecodeBounds = true;
        m7583b(inputStream, options, aVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: b */
    private static int m7582b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005f */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m7583b(java.io.InputStream r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.C1520j.C1522a r7, com.bumptech.glide.load.engine.p046a.C1398e r8) {
        /*
            boolean r0 = r6.inJustDecodeBounds
            if (r0 == 0) goto L_0x000a
            r0 = 10485760(0xa00000, float:1.469368E-38)
            r5.mark(r0)
            goto L_0x000d
        L_0x000a:
            r7.mo6332a()
        L_0x000d:
            int r0 = r6.outWidth
            int r1 = r6.outHeight
            java.lang.String r2 = r6.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.C1532r.m7629a()
            r3.lock()
            r3 = 0
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch:{ IllegalArgumentException -> 0x0030 }
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.resource.bitmap.C1532r.m7629a()
            r7.unlock()
            boolean r6 = r6.inJustDecodeBounds
            if (r6 == 0) goto L_0x002d
            r5.reset()
        L_0x002d:
            return r4
        L_0x002e:
            r5 = move-exception
            goto L_0x0061
        L_0x0030:
            r4 = move-exception
            java.io.IOException r0 = m7573a(r4, r0, r1, r2, r6)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = "Downsampler"
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r1, r2, r0)     // Catch:{ all -> 0x002e }
        L_0x0045:
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0060
            r5.reset()     // Catch:{ IOException -> 0x005f }
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch:{ IOException -> 0x005f }
            r8.mo6141a(r1)     // Catch:{ IOException -> 0x005f }
            r6.inBitmap = r3     // Catch:{ IOException -> 0x005f }
            android.graphics.Bitmap r5 = m7583b(r5, r6, r7, r8)     // Catch:{ IOException -> 0x005f }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.C1532r.m7629a()
            r6.unlock()
            return r5
        L_0x005f:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x0060:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x0061:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.C1532r.m7629a()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C1520j.m7583b(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.j$a, com.bumptech.glide.load.engine.a.e):android.graphics.Bitmap");
    }

    /* renamed from: b */
    private static String m7584b(Options options) {
        return m7574a(options.inBitmap);
    }

    /* renamed from: c */
    private static int m7585c(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: c */
    private static void m7586c(Options options) {
        m7587d(options);
        synchronized (f4982h) {
            f4982h.offer(options);
        }
    }

    /* renamed from: d */
    private static void m7587d(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    public C1482s<Bitmap> mo6328a(InputStream inputStream, int i, int i2, C1379e eVar) {
        return mo6329a(inputStream, i, i2, eVar, f4980f);
    }

    /* renamed from: a */
    public C1482s<Bitmap> mo6329a(InputStream inputStream, int i, int i2, C1379e eVar, C1522a aVar) {
        C1379e eVar2 = eVar;
        C1257i.m6695a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f4985k.mo6116a(65536, byte[].class);
        Options a = m7572a();
        a.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) eVar2.mo6062a(f4975a);
        try {
            return C1510d.m7522a(m7571a(inputStream, a, (DownsampleStrategy) eVar2.mo6062a(DownsampleStrategy.f4950h), decodeFormat, decodeFormat == DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE ? false : eVar2.mo6062a(f4978d) != null && ((Boolean) eVar2.mo6062a(f4978d)).booleanValue(), i, i2, ((Boolean) eVar2.mo6062a(f4977c)).booleanValue(), aVar), this.f4983i);
        } finally {
            m7586c(a);
            this.f4985k.mo6119a(bArr);
        }
    }

    /* renamed from: a */
    public boolean mo6330a(InputStream inputStream) {
        return true;
    }

    /* renamed from: a */
    public boolean mo6331a(ByteBuffer byteBuffer) {
        return true;
    }
}
