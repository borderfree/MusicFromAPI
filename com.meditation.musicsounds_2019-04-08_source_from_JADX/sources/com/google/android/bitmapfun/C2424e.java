package com.google.android.bitmapfun;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.p009v4.app.C0374l;
import android.widget.ImageView;
import com.google.android.bitmapfun.C2418b.C2420a;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.bitmapfun.e */
public abstract class C2424e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2418b f7716a;

    /* renamed from: b */
    private C2420a f7717b;

    /* renamed from: c */
    protected boolean f7718c = false;

    /* renamed from: d */
    protected Resources f7719d;

    /* renamed from: e */
    private Bitmap f7720e;

    /* renamed from: f */
    private boolean f7721f = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f7722g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Object f7723h = new Object();

    /* renamed from: com.google.android.bitmapfun.e$a */
    private static class C2425a extends BitmapDrawable {

        /* renamed from: a */
        private final WeakReference<C2426b> f7724a;

        public C2425a(Resources resources, Bitmap bitmap, C2426b bVar) {
            super(resources, bitmap);
            this.f7724a = new WeakReference<>(bVar);
        }

        /* renamed from: a */
        public C2426b mo8586a() {
            return (C2426b) this.f7724a.get();
        }
    }

    /* renamed from: com.google.android.bitmapfun.e$b */
    private class C2426b extends AsyncTask<Object, Void, BitmapDrawable> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Object f7726e;

        /* renamed from: f */
        private final WeakReference<ImageView> f7727f;

        public C2426b(ImageView imageView) {
            this.f7727f = new WeakReference<>(imageView);
        }

        /* renamed from: d */
        private ImageView m11294d() {
            ImageView imageView = (ImageView) this.f7727f.get();
            if (this == C2424e.m11274b(imageView)) {
                return imageView;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8519a(BitmapDrawable bitmapDrawable) {
            if (mo8525c() || C2424e.this.f7722g) {
                bitmapDrawable = null;
            }
            ImageView d = m11294d();
            if (bitmapDrawable != null && d != null) {
                C2424e.this.mo8577a(d, (Drawable) bitmapDrawable);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo8522b(BitmapDrawable bitmapDrawable) {
            super.mo8522b(bitmapDrawable);
            synchronized (C2424e.this.f7723h) {
                C2424e.this.f7723h.notifyAll();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0012 */
        /* JADX WARNING: Removed duplicated region for block: B:2:0x0012 A[LOOP:0: B:2:0x0012->B:43:0x0012, LOOP_START, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.drawable.BitmapDrawable mo8517a(java.lang.Object... r6) {
            /*
                r5 = this;
                r0 = 0
                r1 = r6[r0]
                r5.f7726e = r1
                java.lang.Object r1 = r5.f7726e
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.android.bitmapfun.e r2 = com.google.android.bitmapfun.C2424e.this
                java.lang.Object r2 = r2.f7723h
                monitor-enter(r2)
            L_0x0012:
                com.google.android.bitmapfun.e r3 = com.google.android.bitmapfun.C2424e.this     // Catch:{ all -> 0x009f }
                boolean r3 = r3.f7718c     // Catch:{ all -> 0x009f }
                if (r3 == 0) goto L_0x0028
                boolean r3 = r5.mo8525c()     // Catch:{ all -> 0x009f }
                if (r3 != 0) goto L_0x0028
                com.google.android.bitmapfun.e r3 = com.google.android.bitmapfun.C2424e.this     // Catch:{ InterruptedException -> 0x0012 }
                java.lang.Object r3 = r3.f7723h     // Catch:{ InterruptedException -> 0x0012 }
                r3.wait()     // Catch:{ InterruptedException -> 0x0012 }
                goto L_0x0012
            L_0x0028:
                monitor-exit(r2)     // Catch:{ all -> 0x009f }
                com.google.android.bitmapfun.e r2 = com.google.android.bitmapfun.C2424e.this
                com.google.android.bitmapfun.b r2 = r2.f7716a
                r3 = 0
                if (r2 == 0) goto L_0x0051
                boolean r2 = r5.mo8525c()
                if (r2 != 0) goto L_0x0051
                android.widget.ImageView r2 = r5.m11294d()
                if (r2 == 0) goto L_0x0051
                com.google.android.bitmapfun.e r2 = com.google.android.bitmapfun.C2424e.this
                boolean r2 = r2.f7722g
                if (r2 != 0) goto L_0x0051
                com.google.android.bitmapfun.e r2 = com.google.android.bitmapfun.C2424e.this
                com.google.android.bitmapfun.b r2 = r2.f7716a
                android.graphics.Bitmap r2 = r2.mo8559b(r1)
                goto L_0x0052
            L_0x0051:
                r2 = r3
            L_0x0052:
                if (r2 != 0) goto L_0x0070
                boolean r4 = r5.mo8525c()
                if (r4 != 0) goto L_0x0070
                android.widget.ImageView r4 = r5.m11294d()
                if (r4 == 0) goto L_0x0070
                com.google.android.bitmapfun.e r4 = com.google.android.bitmapfun.C2424e.this
                boolean r4 = r4.f7722g
                if (r4 != 0) goto L_0x0070
                com.google.android.bitmapfun.e r2 = com.google.android.bitmapfun.C2424e.this
                r6 = r6[r0]
                android.graphics.Bitmap r2 = r2.mo8568a(r6)
            L_0x0070:
                if (r2 == 0) goto L_0x009e
                boolean r6 = com.google.android.bitmapfun.C2429g.m11309c()
                if (r6 == 0) goto L_0x0083
                android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
                com.google.android.bitmapfun.e r0 = com.google.android.bitmapfun.C2424e.this
                android.content.res.Resources r0 = r0.f7719d
                r6.<init>(r0, r2)
            L_0x0081:
                r3 = r6
                goto L_0x008d
            L_0x0083:
                com.google.android.bitmapfun.f r6 = new com.google.android.bitmapfun.f
                com.google.android.bitmapfun.e r0 = com.google.android.bitmapfun.C2424e.this
                android.content.res.Resources r0 = r0.f7719d
                r6.<init>(r0, r2)
                goto L_0x0081
            L_0x008d:
                com.google.android.bitmapfun.e r6 = com.google.android.bitmapfun.C2424e.this
                com.google.android.bitmapfun.b r6 = r6.f7716a
                if (r6 == 0) goto L_0x009e
                com.google.android.bitmapfun.e r6 = com.google.android.bitmapfun.C2424e.this
                com.google.android.bitmapfun.b r6 = r6.f7716a
                r6.mo8558a(r1, r3)
            L_0x009e:
                return r3
            L_0x009f:
                r6 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x009f }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.bitmapfun.C2424e.C2426b.mo8517a(java.lang.Object[]):android.graphics.drawable.BitmapDrawable");
        }
    }

    /* renamed from: com.google.android.bitmapfun.e$c */
    protected class C2427c extends AsyncTask<Object, Void, Void> {
        protected C2427c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public Void mo8517a(Object... objArr) {
            switch (objArr[0].intValue()) {
                case 0:
                    C2424e.this.mo8571b();
                    break;
                case 1:
                    C2424e.this.mo8569a();
                    break;
                case 2:
                    C2424e.this.mo8572c();
                    break;
                case 3:
                    C2424e.this.mo8573d();
                    break;
            }
            return null;
        }
    }

    protected C2424e(Context context) {
        this.f7719d = context.getResources();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C2426b m11274b(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof C2425a) {
                return ((C2425a) drawable).mo8586a();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m11275b(Object obj, ImageView imageView) {
        C2426b b = m11274b(imageView);
        if (b != null) {
            Object a = b.f7726e;
            if (a != null && a.equals(obj)) {
                return false;
            }
            b.mo8520a(true);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo8568a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8569a() {
        if (this.f7716a != null) {
            this.f7716a.mo8557a();
        }
    }

    /* renamed from: a */
    public void mo8576a(C0374l lVar, C2420a aVar) {
        this.f7717b = aVar;
        this.f7716a = C2418b.m11226a(lVar, this.f7717b);
        new C2427c().mo8524c((Params[]) new Object[]{Integer.valueOf(1)});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8577a(ImageView imageView, Drawable drawable) {
        if (this.f7721f) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(17170445), drawable});
            imageView.setBackgroundDrawable(new BitmapDrawable(this.f7719d, this.f7720e));
            imageView.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(200);
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: a */
    public void mo8578a(Object obj, ImageView imageView) {
        if (obj != null) {
            BitmapDrawable bitmapDrawable = null;
            if (this.f7716a != null) {
                bitmapDrawable = this.f7716a.mo8556a(String.valueOf(obj));
            }
            if (bitmapDrawable != null) {
                imageView.setImageDrawable(bitmapDrawable);
            } else if (m11275b(obj, imageView)) {
                C2426b bVar = new C2426b(imageView);
                imageView.setImageDrawable(new C2425a(this.f7719d, this.f7720e, bVar));
                bVar.mo8516a(AsyncTask.f7641c, (Params[]) new Object[]{obj});
            }
        }
    }

    /* renamed from: a */
    public void mo8579a(boolean z) {
        this.f7722g = z;
        mo8581b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8571b() {
        if (this.f7716a != null) {
            this.f7716a.mo8560b();
        }
    }

    /* renamed from: b */
    public void mo8580b(int i) {
        this.f7720e = BitmapFactory.decodeResource(this.f7719d, i);
    }

    /* renamed from: b */
    public void mo8581b(boolean z) {
        synchronized (this.f7723h) {
            this.f7718c = z;
            if (!this.f7718c) {
                this.f7723h.notifyAll();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8572c() {
        if (this.f7716a != null) {
            this.f7716a.mo8562d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo8573d() {
        if (this.f7716a != null) {
            this.f7716a.mo8563e();
            this.f7716a = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C2418b mo8582f() {
        return this.f7716a;
    }

    /* renamed from: g */
    public void mo8583g() {
        new C2427c().mo8524c((Params[]) new Object[]{Integer.valueOf(0)});
    }

    /* renamed from: h */
    public void mo8584h() {
        new C2427c().mo8524c((Params[]) new Object[]{Integer.valueOf(2)});
    }

    /* renamed from: i */
    public void mo8585i() {
        new C2427c().mo8524c((Params[]) new Object[]{Integer.valueOf(3)});
    }
}
