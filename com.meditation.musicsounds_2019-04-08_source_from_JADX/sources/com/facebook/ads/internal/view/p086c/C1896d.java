package com.facebook.ads.internal.view.p086c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.p064f.C1685b;
import com.facebook.ads.internal.p070l.C1714a;
import com.facebook.ads.internal.p070l.C1716b;
import com.facebook.ads.internal.p077s.p078a.C1802m;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p079b.C1822f;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.c.d */
public class C1896d extends AsyncTask<String, Void, Bitmap[]> {

    /* renamed from: b */
    private static final String f6246b = "d";

    /* renamed from: a */
    public boolean f6247a = false;

    /* renamed from: c */
    private final WeakReference<Context> f6248c;

    /* renamed from: d */
    private final int f6249d;

    /* renamed from: e */
    private final WeakReference<ImageView> f6250e;

    /* renamed from: f */
    private final WeakReference<C1893b> f6251f;

    /* renamed from: g */
    private final WeakReference<ViewGroup> f6252g;

    /* renamed from: h */
    private C1897e f6253h;

    /* renamed from: i */
    private int f6254i = -1;

    /* renamed from: j */
    private int f6255j = -1;

    public C1896d(ViewGroup viewGroup, int i) {
        this.f6248c = new WeakReference<>(viewGroup.getContext());
        this.f6251f = null;
        this.f6250e = null;
        this.f6252g = new WeakReference<>(viewGroup);
        this.f6249d = i;
    }

    public C1896d(ImageView imageView) {
        this.f6248c = new WeakReference<>(imageView.getContext());
        this.f6251f = null;
        this.f6250e = new WeakReference<>(imageView);
        this.f6252g = null;
        this.f6249d = 0;
    }

    /* renamed from: a */
    public C1896d mo7236a() {
        this.f6254i = -1;
        this.f6255j = -1;
        return this;
    }

    /* renamed from: a */
    public C1896d mo7237a(int i, int i2) {
        this.f6254i = i;
        this.f6255j = i2;
        return this;
    }

    /* renamed from: a */
    public C1896d mo7238a(C1897e eVar) {
        this.f6253h = eVar;
        return this;
    }

    /* renamed from: a */
    public C1896d mo7239a(boolean z) {
        this.f6247a = z;
        return this;
    }

    /* renamed from: a */
    public void mo7240a(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.f6253h != null) {
                this.f6253h.mo7245a(false);
            }
            return;
        }
        executeOnExecutor(C1802m.f5871a, new String[]{str});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Bitmap[] bitmapArr) {
        boolean z = false;
        if (this.f6250e != null) {
            ImageView imageView = (ImageView) this.f6250e.get();
            if (imageView != null) {
                imageView.setImageBitmap(bitmapArr[0]);
            }
        }
        if (this.f6251f != null) {
            C1893b bVar = (C1893b) this.f6251f.get();
            if (bVar != null) {
                bVar.mo7222a(bitmapArr[0], bitmapArr[1]);
            }
        }
        if (!(this.f6252g == null || this.f6252g.get() == null || bitmapArr[1] == null)) {
            C1808r.m8933a((View) this.f6252g.get(), (Drawable) new BitmapDrawable(((Context) this.f6248c.get()).getResources(), bitmapArr[1]));
        }
        if (this.f6253h != null) {
            C1897e eVar = this.f6253h;
            if (bitmapArr[0] != null) {
                z = true;
            }
            eVar.mo7245a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap[] doInBackground(String... strArr) {
        Bitmap bitmap;
        String str = strArr[0];
        Context context = (Context) this.f6248c.get();
        Bitmap bitmap2 = null;
        if (context == null) {
            return new Bitmap[]{null, null};
        }
        try {
            bitmap = C1685b.m8444a(context).mo6829a(str, this.f6254i, this.f6255j);
            try {
                boolean z = (this.f6251f == null || this.f6251f.get() == null) ? false : true;
                boolean z2 = (this.f6252g == null || this.f6252g.get() == null) ? false : true;
                if ((z || z2) && bitmap != null && !this.f6247a) {
                    C1822f fVar = new C1822f(bitmap);
                    fVar.mo7090a(this.f6249d != 0 ? this.f6249d : Math.round(((float) bitmap.getWidth()) / 40.0f));
                    bitmap2 = fVar.mo7089a();
                }
            } catch (Throwable th) {
                th = th;
                String str2 = f6246b;
                StringBuilder sb = new StringBuilder();
                sb.append("Error downloading image: ");
                sb.append(str);
                Log.e(str2, sb.toString(), th);
                C1716b.m8601a(C1714a.m8600a(th, null));
                return new Bitmap[]{bitmap, bitmap2};
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
            String str22 = f6246b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error downloading image: ");
            sb2.append(str);
            Log.e(str22, sb2.toString(), th);
            C1716b.m8601a(C1714a.m8600a(th, null));
            return new Bitmap[]{bitmap, bitmap2};
        }
        return new Bitmap[]{bitmap, bitmap2};
    }
}
