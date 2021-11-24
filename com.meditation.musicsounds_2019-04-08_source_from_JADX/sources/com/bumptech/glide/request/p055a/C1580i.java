package com.bumptech.glide.request.p055a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.request.C1589c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bumptech.glide.request.a.i */
public abstract class C1580i<T extends View, Z> extends C1572a<Z> {

    /* renamed from: b */
    private static boolean f5114b;

    /* renamed from: c */
    private static Integer f5115c;

    /* renamed from: a */
    protected final T f5116a;

    /* renamed from: d */
    private final C1581a f5117d;

    /* renamed from: e */
    private OnAttachStateChangeListener f5118e;

    /* renamed from: f */
    private boolean f5119f;

    /* renamed from: g */
    private boolean f5120g;

    /* renamed from: com.bumptech.glide.request.a.i$a */
    static final class C1581a {

        /* renamed from: a */
        static Integer f5121a;

        /* renamed from: b */
        boolean f5122b;

        /* renamed from: c */
        private final View f5123c;

        /* renamed from: d */
        private final List<C1578g> f5124d = new ArrayList();

        /* renamed from: e */
        private C1582a f5125e;

        /* renamed from: com.bumptech.glide.request.a.i$a$a */
        private static final class C1582a implements OnPreDrawListener {

            /* renamed from: a */
            private final WeakReference<C1581a> f5126a;

            C1582a(C1581a aVar) {
                this.f5126a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v("ViewTarget", sb.toString());
                }
                C1581a aVar = (C1581a) this.f5126a.get();
                if (aVar != null) {
                    aVar.mo6449a();
                }
                return true;
            }
        }

        C1581a(View view) {
            this.f5123c = view;
        }

        /* renamed from: a */
        private int m7853a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f5122b && this.f5123c.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f5123c.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m7854a(this.f5123c.getContext());
        }

        /* renamed from: a */
        private static int m7854a(Context context) {
            if (f5121a == null) {
                Display defaultDisplay = ((WindowManager) C1257i.m6691a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f5121a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f5121a.intValue();
        }

        /* renamed from: a */
        private void m7855a(int i, int i2) {
            Iterator it = new ArrayList(this.f5124d).iterator();
            while (it.hasNext()) {
                ((C1578g) it.next()).mo6415a(i, i2);
            }
        }

        /* renamed from: a */
        private boolean m7856a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: b */
        private boolean m7857b(int i, int i2) {
            return m7856a(i) && m7856a(i2);
        }

        /* renamed from: c */
        private int m7858c() {
            int paddingTop = this.f5123c.getPaddingTop() + this.f5123c.getPaddingBottom();
            LayoutParams layoutParams = this.f5123c.getLayoutParams();
            return m7853a(this.f5123c.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: d */
        private int m7859d() {
            int paddingLeft = this.f5123c.getPaddingLeft() + this.f5123c.getPaddingRight();
            LayoutParams layoutParams = this.f5123c.getLayoutParams();
            return m7853a(this.f5123c.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6449a() {
            if (!this.f5124d.isEmpty()) {
                int d = m7859d();
                int c = m7858c();
                if (m7857b(d, c)) {
                    m7855a(d, c);
                    mo6451b();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6450a(C1578g gVar) {
            int d = m7859d();
            int c = m7858c();
            if (m7857b(d, c)) {
                gVar.mo6415a(d, c);
                return;
            }
            if (!this.f5124d.contains(gVar)) {
                this.f5124d.add(gVar);
            }
            if (this.f5125e == null) {
                ViewTreeObserver viewTreeObserver = this.f5123c.getViewTreeObserver();
                this.f5125e = new C1582a(this);
                viewTreeObserver.addOnPreDrawListener(this.f5125e);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo6451b() {
            ViewTreeObserver viewTreeObserver = this.f5123c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f5125e);
            }
            this.f5125e = null;
            this.f5124d.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo6452b(C1578g gVar) {
            this.f5124d.remove(gVar);
        }
    }

    public C1580i(T t) {
        this.f5116a = (View) C1257i.m6691a(t);
        this.f5117d = new C1581a(t);
    }

    /* renamed from: a */
    private void mo6442a(Object obj) {
        if (f5115c == null) {
            f5114b = true;
            this.f5116a.setTag(obj);
            return;
        }
        this.f5116a.setTag(f5115c.intValue(), obj);
    }

    /* renamed from: b */
    private void m7844b() {
        if (this.f5118e != null && !this.f5120g) {
            this.f5116a.addOnAttachStateChangeListener(this.f5118e);
            this.f5120g = true;
        }
    }

    /* renamed from: f */
    private void m7845f() {
        if (this.f5118e != null && this.f5120g) {
            this.f5116a.removeOnAttachStateChangeListener(this.f5118e);
            this.f5120g = false;
        }
    }

    /* renamed from: g */
    private Object m7846g() {
        return f5115c == null ? this.f5116a.getTag() : this.f5116a.getTag(f5115c.intValue());
    }

    /* renamed from: a */
    public C1589c mo6436a() {
        Object g = m7846g();
        if (g == null) {
            return null;
        }
        if (g instanceof C1589c) {
            return (C1589c) g;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: a */
    public void mo6437a(Drawable drawable) {
        super.mo6437a(drawable);
        this.f5117d.mo6451b();
        if (!this.f5119f) {
            m7845f();
        }
    }

    /* renamed from: a */
    public void mo6446a(C1578g gVar) {
        this.f5117d.mo6450a(gVar);
    }

    /* renamed from: a */
    public void mo6438a(C1589c cVar) {
        mo6442a((Object) cVar);
    }

    /* renamed from: b */
    public void mo6439b(Drawable drawable) {
        super.mo6439b(drawable);
        m7844b();
    }

    /* renamed from: b */
    public void mo6447b(C1578g gVar) {
        this.f5117d.mo6452b(gVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.f5116a);
        return sb.toString();
    }
}
