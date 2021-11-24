package com.seattleclouds.modules.p185r;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6638s;

/* renamed from: com.seattleclouds.modules.r.d */
public class C6211d extends C6557s {

    /* renamed from: h */
    private static final Point[] f22037h = {new Point(1152, 1536), new Point(768, 1024), new Point(600, 800)};

    /* renamed from: a */
    private FrameLayout f22038a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f22039b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6215b f22040c;

    /* renamed from: d */
    private C6216e f22041d;

    /* renamed from: e */
    private String f22042e;

    /* renamed from: f */
    private C6214a f22043f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f22044g = false;

    /* renamed from: com.seattleclouds.modules.r.d$a */
    private class C6214a extends AsyncTask<Void, Void, Bitmap> {
        private C6214a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            if (isCancelled()) {
                return null;
            }
            Bitmap c = C6211d.this.m30261e();
            if (isCancelled()) {
                if (c != null) {
                    c.recycle();
                }
                return null;
            }
            C6211d.this.m30253a(c);
            return c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            C6211d.this.f22039b.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.seattleclouds.modules.r.d$b */
    public interface C6215b {
        void onClick(C6211d dVar);
    }

    /* renamed from: a */
    private Bitmap m30251a(Point point) {
        try {
            Bitmap a = C6194a.m30185a(this.f22042e, point.x, point.y, Config.RGB_565);
            if (a != null) {
                a = C6638s.m32070a(this.f22042e, a);
            }
            return a;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30253a(Bitmap bitmap) {
        if (bitmap != null && this.f22041d != null) {
            this.f22041d.mo19490a(this.f22042e, bitmap);
        }
    }

    /* renamed from: c */
    private void m30258c() {
        this.f22039b = (ImageView) this.f22038a.findViewById(C5458g.imageView);
        Bundle m = mo1307m();
        if (m != null) {
            this.f22042e = m.getString("ARG_IMAGE_PATH");
        }
        this.f22039b.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C6211d.this.f22040c != null) {
                    C6211d.this.f22040c.onClick(C6211d.this);
                }
            }
        });
    }

    /* renamed from: d */
    private Bitmap m30259d() {
        if (this.f22041d == null) {
            return null;
        }
        return this.f22041d.mo19487a(this.f22042e);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Bitmap m30261e() {
        Point a = C6619m.m32015a(mo1318s());
        double d = (double) a.x;
        Double.isNaN(d);
        a.x = (int) (d * 0.7d);
        double d2 = (double) a.y;
        Double.isNaN(d2);
        a.y = (int) (d2 * 0.7d);
        Bitmap a2 = m30251a(a);
        if (a2 == null) {
            for (Point a3 : f22037h) {
                a2 = m30251a(a3);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m30262m(boolean z) {
        Bitmap bitmap;
        if (this.f22042e != null) {
            if (z) {
                this.f22043f = new C6214a();
                this.f22043f.execute(new Void[0]);
                bitmap = null;
            } else {
                bitmap = m30259d();
                if (bitmap == null) {
                    this.f22043f = new C6214a();
                    this.f22043f.execute(new Void[0]);
                }
            }
            this.f22039b.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22038a = (FrameLayout) layoutInflater.inflate(C5460i.fragment_scan_document_image, viewGroup, false);
        m30258c();
        return this.f22038a;
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        this.f22044g = false;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (!C6211d.this.f22044g) {
                    C6211d.this.m30262m(false);
                }
            }
        }, 50);
    }

    /* renamed from: a */
    public void mo19478a(C6215b bVar) {
        this.f22040c = bVar;
    }

    /* renamed from: a */
    public void mo19479a(C6216e eVar) {
        this.f22041d = eVar;
    }

    /* renamed from: b */
    public String mo1450b() {
        return this.f22042e;
    }

    /* renamed from: i */
    public void mo1296i() {
        this.f22044g = true;
        if (this.f22043f != null) {
            this.f22043f.cancel(true);
            this.f22043f = null;
        }
        this.f22039b.setImageBitmap(null);
        super.mo1296i();
    }
}
