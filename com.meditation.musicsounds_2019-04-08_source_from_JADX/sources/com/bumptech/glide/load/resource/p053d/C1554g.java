package com.bumptech.glide.load.resource.p053d;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.C1226f;
import com.bumptech.glide.C1231g;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.load.engine.C1456h;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.p035b.C1180a;
import com.bumptech.glide.p039f.C1230b;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.request.C1594g;
import com.bumptech.glide.request.p055a.C1577f;
import com.bumptech.glide.request.p055a.C1579h;
import com.bumptech.glide.request.p056b.C1586b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.d.g */
class C1554g {

    /* renamed from: a */
    final C1231g f5040a;

    /* renamed from: b */
    private final C1180a f5041b;

    /* renamed from: c */
    private final Handler f5042c;

    /* renamed from: d */
    private final List<C1556b> f5043d;

    /* renamed from: e */
    private final C1398e f5044e;

    /* renamed from: f */
    private boolean f5045f;

    /* renamed from: g */
    private boolean f5046g;

    /* renamed from: h */
    private boolean f5047h;

    /* renamed from: i */
    private C1226f<Bitmap> f5048i;

    /* renamed from: j */
    private C1555a f5049j;

    /* renamed from: k */
    private boolean f5050k;

    /* renamed from: l */
    private C1555a f5051l;

    /* renamed from: m */
    private Bitmap f5052m;

    /* renamed from: n */
    private C1490h<Bitmap> f5053n;

    /* renamed from: o */
    private C1555a f5054o;

    /* renamed from: p */
    private C1558d f5055p;

    /* renamed from: com.bumptech.glide.load.resource.d.g$a */
    static class C1555a extends C1577f<Bitmap> {

        /* renamed from: a */
        final int f5056a;

        /* renamed from: b */
        private final Handler f5057b;

        /* renamed from: c */
        private final long f5058c;

        /* renamed from: d */
        private Bitmap f5059d;

        C1555a(Handler handler, int i, long j) {
            this.f5057b = handler;
            this.f5056a = i;
            this.f5058c = j;
        }

        /* renamed from: a */
        public void mo6401a(Bitmap bitmap, C1586b<? super Bitmap> bVar) {
            this.f5059d = bitmap;
            this.f5057b.sendMessageAtTime(this.f5057b.obtainMessage(1, this), this.f5058c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d_ */
        public Bitmap mo6402d_() {
            return this.f5059d;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.d.g$b */
    public interface C1556b {
        /* renamed from: f */
        void mo6370f();
    }

    /* renamed from: com.bumptech.glide.load.resource.d.g$c */
    private class C1557c implements Callback {
        C1557c() {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                C1554g.this.mo6389a((C1555a) message.obj);
                return true;
            }
            if (message.what == 2) {
                C1554g.this.f5040a.mo5852a((C1579h<?>) (C1555a) message.obj);
            }
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.d.g$d */
    interface C1558d {
        /* renamed from: a */
        void mo6404a();
    }

    C1554g(C1186c cVar, C1180a aVar, int i, int i2, C1490h<Bitmap> hVar, Bitmap bitmap) {
        this(cVar.mo5735a(), C1186c.m6455b(cVar.mo5741c()), aVar, null, m7705a(C1186c.m6455b(cVar.mo5741c()), i, i2), hVar, bitmap);
    }

    C1554g(C1398e eVar, C1231g gVar, C1180a aVar, Handler handler, C1226f<Bitmap> fVar, C1490h<Bitmap> hVar, Bitmap bitmap) {
        this.f5043d = new ArrayList();
        this.f5040a = gVar;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper(), new C1557c());
        }
        this.f5044e = eVar;
        this.f5042c = handler;
        this.f5048i = fVar;
        this.f5041b = aVar;
        mo6388a(hVar, bitmap);
    }

    /* renamed from: a */
    private static C1226f<Bitmap> m7705a(C1231g gVar, int i, int i2) {
        return gVar.mo5859f().mo5832a(C1594g.m7906a(C1456h.f4828b).mo6482a(true).mo6488b(true).mo6475a(i, i2));
    }

    /* renamed from: j */
    private int m7706j() {
        return C1258j.m6698a(mo6399i().getWidth(), mo6399i().getHeight(), mo6399i().getConfig());
    }

    /* renamed from: k */
    private void m7707k() {
        if (!this.f5045f) {
            this.f5045f = true;
            this.f5050k = false;
            m7709m();
        }
    }

    /* renamed from: l */
    private void m7708l() {
        this.f5045f = false;
    }

    /* renamed from: m */
    private void m7709m() {
        if (this.f5045f && !this.f5046g) {
            if (this.f5047h) {
                C1257i.m6695a(this.f5054o == null, "Pending target must be null when starting from the first frame");
                this.f5041b.mo5716f();
                this.f5047h = false;
            }
            if (this.f5054o != null) {
                C1555a aVar = this.f5054o;
                this.f5054o = null;
                mo6389a(aVar);
                return;
            }
            this.f5046g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f5041b.mo5713c());
            this.f5041b.mo5712b();
            this.f5051l = new C1555a(this.f5042c, this.f5041b.mo5715e(), uptimeMillis);
            this.f5048i.mo5832a(C1594g.m7905a(m7711o())).mo5833a((Object) this.f5041b).mo5835a(this.f5051l);
        }
    }

    /* renamed from: n */
    private void m7710n() {
        if (this.f5052m != null) {
            this.f5044e.mo6141a(this.f5052m);
            this.f5052m = null;
        }
    }

    /* renamed from: o */
    private static C1375c m7711o() {
        return new C1230b(Double.valueOf(Math.random()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo6387a() {
        return this.f5052m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6388a(C1490h<Bitmap> hVar, Bitmap bitmap) {
        this.f5053n = (C1490h) C1257i.m6691a(hVar);
        this.f5052m = (Bitmap) C1257i.m6691a(bitmap);
        this.f5048i = this.f5048i.mo5832a(new C1594g().mo6478a(hVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6389a(C1555a aVar) {
        if (this.f5055p != null) {
            this.f5055p.mo6404a();
        }
        this.f5046g = false;
        if (this.f5050k) {
            this.f5042c.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f5045f) {
            this.f5054o = aVar;
        } else {
            if (aVar.mo6402d_() != null) {
                m7710n();
                C1555a aVar2 = this.f5049j;
                this.f5049j = aVar;
                for (int size = this.f5043d.size() - 1; size >= 0; size--) {
                    ((C1556b) this.f5043d.get(size)).mo6370f();
                }
                if (aVar2 != null) {
                    this.f5042c.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m7709m();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6390a(C1556b bVar) {
        if (this.f5050k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f5043d.contains(bVar)) {
            boolean isEmpty = this.f5043d.isEmpty();
            this.f5043d.add(bVar);
            if (isEmpty) {
                m7707k();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo6391b() {
        return mo6399i().getWidth();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6392b(C1556b bVar) {
        this.f5043d.remove(bVar);
        if (this.f5043d.isEmpty()) {
            m7708l();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo6393c() {
        return mo6399i().getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo6394d() {
        return this.f5041b.mo5717g() + m7706j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo6395e() {
        if (this.f5049j != null) {
            return this.f5049j.f5056a;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ByteBuffer mo6396f() {
        return this.f5041b.mo5710a().asReadOnlyBuffer();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo6397g() {
        return this.f5041b.mo5714d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo6398h() {
        this.f5043d.clear();
        m7710n();
        m7708l();
        if (this.f5049j != null) {
            this.f5040a.mo5852a((C1579h<?>) this.f5049j);
            this.f5049j = null;
        }
        if (this.f5051l != null) {
            this.f5040a.mo5852a((C1579h<?>) this.f5051l);
            this.f5051l = null;
        }
        if (this.f5054o != null) {
            this.f5040a.mo5852a((C1579h<?>) this.f5054o);
            this.f5054o = null;
        }
        this.f5041b.mo5719i();
        this.f5050k = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Bitmap mo6399i() {
        return this.f5049j != null ? this.f5049j.mo6402d_() : this.f5052m;
    }
}
