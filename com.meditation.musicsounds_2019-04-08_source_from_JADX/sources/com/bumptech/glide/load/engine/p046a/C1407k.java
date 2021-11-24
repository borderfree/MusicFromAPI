package com.bumptech.glide.load.engine.p046a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.engine.a.k */
public class C1407k implements C1398e {

    /* renamed from: a */
    private static final Config f4716a = Config.ARGB_8888;

    /* renamed from: b */
    private final C1410l f4717b;

    /* renamed from: c */
    private final Set<Config> f4718c;

    /* renamed from: d */
    private final long f4719d;

    /* renamed from: e */
    private final C1408a f4720e;

    /* renamed from: f */
    private long f4721f;

    /* renamed from: g */
    private long f4722g;

    /* renamed from: h */
    private int f4723h;

    /* renamed from: i */
    private int f4724i;

    /* renamed from: j */
    private int f4725j;

    /* renamed from: k */
    private int f4726k;

    /* renamed from: com.bumptech.glide.load.engine.a.k$a */
    private interface C1408a {
        /* renamed from: a */
        void mo6161a(Bitmap bitmap);

        /* renamed from: b */
        void mo6162b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.engine.a.k$b */
    private static final class C1409b implements C1408a {
        C1409b() {
        }

        /* renamed from: a */
        public void mo6161a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo6162b(Bitmap bitmap) {
        }
    }

    public C1407k(long j) {
        this(j, m7203f(), m7204g());
    }

    C1407k(long j, C1410l lVar, Set<Config> set) {
        this.f4719d = j;
        this.f4721f = j;
        this.f4717b = lVar;
        this.f4718c = set;
        this.f4720e = new C1409b();
    }

    /* renamed from: a */
    private synchronized void m7194a(long j) {
        while (this.f4722g > j) {
            Bitmap a = this.f4717b.mo6121a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m7202e();
                }
                this.f4722g = 0;
                return;
            }
            this.f4720e.mo6162b(a);
            this.f4722g -= (long) this.f4717b.mo6126c(a);
            this.f4726k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f4717b.mo6125b(a));
                Log.d("LruBitmapPool", sb.toString());
            }
            m7201d();
            a.recycle();
        }
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m7195a(Config config) {
        if (VERSION.SDK_INT >= 26 && config == Config.HARDWARE) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(config);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static void m7196b(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m7199c(bitmap);
    }

    /* renamed from: c */
    private static Bitmap m7197c(int i, int i2, Config config) {
        if (config == null) {
            config = f4716a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: c */
    private void m7198c() {
        m7194a(this.f4721f);
    }

    @TargetApi(19)
    /* renamed from: c */
    private static void m7199c(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: d */
    private synchronized Bitmap m7200d(int i, int i2, Config config) {
        Bitmap a;
        m7195a(config);
        a = this.f4717b.mo6122a(i, i2, config != null ? config : f4716a);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f4717b.mo6124b(i, i2, config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f4724i++;
        } else {
            this.f4723h++;
            this.f4722g -= (long) this.f4717b.mo6126c(a);
            this.f4720e.mo6162b(a);
            m7196b(a);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f4717b.mo6124b(i, i2, config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        m7201d();
        return a;
    }

    /* renamed from: d */
    private void m7201d() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m7202e();
        }
    }

    /* renamed from: e */
    private void m7202e() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f4723h);
        sb.append(", misses=");
        sb.append(this.f4724i);
        sb.append(", puts=");
        sb.append(this.f4725j);
        sb.append(", evictions=");
        sb.append(this.f4726k);
        sb.append(", currentSize=");
        sb.append(this.f4722g);
        sb.append(", maxSize=");
        sb.append(this.f4721f);
        sb.append("\nStrategy=");
        sb.append(this.f4717b);
        Log.v("LruBitmapPool", sb.toString());
    }

    /* renamed from: f */
    private static C1410l m7203f() {
        return VERSION.SDK_INT >= 19 ? new C1412n() : new C1394c();
    }

    @TargetApi(26)
    /* renamed from: g */
    private static Set<Config> m7204g() {
        HashSet hashSet = new HashSet(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (VERSION.SDK_INT >= 26) {
            hashSet.remove(Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Bitmap mo6138a(int i, int i2, Config config) {
        Bitmap d = m7200d(i, i2, config);
        if (d == null) {
            return m7197c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    /* renamed from: a */
    public void mo6139a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m7194a(0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo6140a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
            Log.d("LruBitmapPool", sb.toString());
        }
        if (i >= 40) {
            mo6139a();
        } else if (i >= 20 || i == 15) {
            m7194a(mo6160b() / 2);
        }
    }

    /* renamed from: a */
    public synchronized void mo6141a(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (!bitmap.isRecycled()) {
            if (bitmap.isMutable() && ((long) this.f4717b.mo6126c(bitmap)) <= this.f4721f) {
                if (this.f4718c.contains(bitmap.getConfig())) {
                    int c = this.f4717b.mo6126c(bitmap);
                    this.f4717b.mo6123a(bitmap);
                    this.f4720e.mo6161a(bitmap);
                    this.f4725j++;
                    this.f4722g += (long) c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Put bitmap in pool=");
                        sb.append(this.f4717b.mo6125b(bitmap));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    m7201d();
                    m7198c();
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reject bitmap from pool, bitmap: ");
                sb2.append(this.f4717b.mo6125b(bitmap));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f4718c.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } else {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
    }

    /* renamed from: b */
    public long mo6160b() {
        return this.f4721f;
    }

    /* renamed from: b */
    public Bitmap mo6142b(int i, int i2, Config config) {
        Bitmap d = m7200d(i, i2, config);
        return d == null ? m7197c(i, i2, config) : d;
    }
}
