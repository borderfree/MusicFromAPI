package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.C3309n;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.bc */
final class C3431bc implements C3696kx<arp> {

    /* renamed from: a */
    private final /* synthetic */ boolean f13558a;

    /* renamed from: b */
    private final /* synthetic */ double f13559b;

    /* renamed from: c */
    private final /* synthetic */ boolean f13560c;

    /* renamed from: d */
    private final /* synthetic */ String f13561d;

    /* renamed from: e */
    private final /* synthetic */ C3424aw f13562e;

    C3431bc(C3424aw awVar, boolean z, double d, boolean z2, String str) {
        this.f13562e = awVar;
        this.f13558a = z;
        this.f13559b = d;
        this.f13560c = z2;
        this.f13561d = str;
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    /* renamed from: b */
    public final arp mo12782a(InputStream inputStream) {
        Bitmap bitmap;
        Options options = new Options();
        options.inDensity = (int) (this.f13559b * 160.0d);
        if (!this.f13560c) {
            options.inPreferredConfig = Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e) {
            C3643iy.m19173b("Error grabbing image.", e);
            bitmap = null;
        }
        if (bitmap == null) {
            this.f13562e.mo12543a(2, this.f13558a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (C3309n.m15075g() && C3643iy.m18781a()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int allocationByteCount = bitmap.getAllocationByteCount();
            long j = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            C3643iy.m18780a(sb.toString());
        }
        return new arp(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(this.f13561d), this.f13559b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12781a() {
        this.f13562e.mo12543a(2, this.f13558a);
        return null;
    }
}
