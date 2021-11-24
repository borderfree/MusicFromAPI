package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
final class C1527n {

    /* renamed from: a */
    private static final File f4992a = new File("/proc/self/fd");

    /* renamed from: d */
    private static volatile C1527n f4993d;

    /* renamed from: b */
    private volatile int f4994b;

    /* renamed from: c */
    private volatile boolean f4995c = true;

    private C1527n() {
    }

    /* renamed from: a */
    static C1527n m7605a() {
        if (f4993d == null) {
            synchronized (C1527n.class) {
                if (f4993d == null) {
                    f4993d = new C1527n();
                }
            }
        }
        return f4993d;
    }

    /* renamed from: b */
    private synchronized boolean m7606b() {
        int i = this.f4994b + 1;
        this.f4994b = i;
        if (i >= 50) {
            boolean z = false;
            this.f4994b = 0;
            int length = f4992a.list().length;
            if (length < 700) {
                z = true;
            }
            this.f4995c = z;
            if (!this.f4995c && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(700);
                Log.w("Downsampler", sb.toString());
            }
        }
        return this.f4995c;
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(26)
    /* renamed from: a */
    public boolean mo6335a(int i, int i2, Options options, DecodeFormat decodeFormat, boolean z, boolean z2) {
        if (!z || VERSION.SDK_INT < 26 || decodeFormat == DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && m7606b();
        if (z3) {
            options.inPreferredConfig = Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
