package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.C1456h;
import com.bumptech.glide.load.resource.p053d.C1549c;
import com.bumptech.glide.p036c.C1189c;
import com.bumptech.glide.p036c.C1189c.C1190a;
import com.bumptech.glide.p036c.C1191d;
import com.bumptech.glide.p036c.C1196h;
import com.bumptech.glide.p036c.C1197i;
import com.bumptech.glide.p036c.C1204m;
import com.bumptech.glide.p036c.C1205n;
import com.bumptech.glide.p036c.C1208p;
import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.request.C1589c;
import com.bumptech.glide.request.C1594g;
import com.bumptech.glide.request.p055a.C1579h;

/* renamed from: com.bumptech.glide.g */
public class C1231g implements C1197i {

    /* renamed from: d */
    private static final C1594g f4433d = C1594g.m7909a(Bitmap.class).mo6496g();

    /* renamed from: e */
    private static final C1594g f4434e = C1594g.m7909a(C1549c.class).mo6496g();

    /* renamed from: f */
    private static final C1594g f4435f = C1594g.m7906a(C1456h.f4829c).mo6476a(Priority.LOW).mo6488b(true);

    /* renamed from: a */
    protected final C1186c f4436a;

    /* renamed from: b */
    protected final Context f4437b;

    /* renamed from: c */
    final C1196h f4438c;

    /* renamed from: g */
    private final C1205n f4439g;

    /* renamed from: h */
    private final C1204m f4440h;

    /* renamed from: i */
    private final C1208p f4441i;

    /* renamed from: j */
    private final Runnable f4442j;

    /* renamed from: k */
    private final Handler f4443k;

    /* renamed from: l */
    private final C1189c f4444l;

    /* renamed from: m */
    private C1594g f4445m;

    /* renamed from: com.bumptech.glide.g$a */
    private static class C1234a implements C1190a {

        /* renamed from: a */
        private final C1205n f4449a;

        C1234a(C1205n nVar) {
            this.f4449a = nVar;
        }

        /* renamed from: a */
        public void mo5755a(boolean z) {
            if (z) {
                this.f4449a.mo5789d();
            }
        }
    }

    public C1231g(C1186c cVar, C1196h hVar, C1204m mVar, Context context) {
        this(cVar, hVar, mVar, new C1205n(), cVar.mo5742d(), context);
    }

    C1231g(C1186c cVar, C1196h hVar, C1204m mVar, C1205n nVar, C1191d dVar, Context context) {
        this.f4441i = new C1208p();
        this.f4442j = new Runnable() {
            public void run() {
                C1231g.this.f4438c.mo5751a(C1231g.this);
            }
        };
        this.f4443k = new Handler(Looper.getMainLooper());
        this.f4436a = cVar;
        this.f4438c = hVar;
        this.f4440h = mVar;
        this.f4439g = nVar;
        this.f4437b = context;
        this.f4444l = dVar.mo5756a(context.getApplicationContext(), new C1234a(nVar));
        if (C1258j.m6715d()) {
            this.f4443k.post(this.f4442j);
        } else {
            hVar.mo5751a(this);
        }
        hVar.mo5751a(this.f4444l);
        mo5854a(cVar.mo5743e().mo5807a());
        cVar.mo5737a(this);
    }

    /* renamed from: c */
    private void m6618c(C1579h<?> hVar) {
        if (!mo5858b(hVar) && !this.f4436a.mo5738a(hVar) && hVar.mo6436a() != null) {
            C1589c a = hVar.mo6436a();
            hVar.mo6438a((C1589c) null);
            a.mo6420c();
        }
    }

    /* renamed from: a */
    public <ResourceType> C1226f<ResourceType> mo5849a(Class<ResourceType> cls) {
        return new C1226f<>(this.f4436a, this, cls, this.f4437b);
    }

    /* renamed from: a */
    public C1226f<Drawable> mo5850a(String str) {
        return mo5860g().mo5834a(str);
    }

    /* renamed from: a */
    public void mo5851a() {
        C1258j.m6707a();
        this.f4439g.mo5784a();
    }

    /* renamed from: a */
    public void mo5852a(final C1579h<?> hVar) {
        if (hVar != null) {
            if (C1258j.m6714c()) {
                m6618c(hVar);
            } else {
                this.f4443k.post(new Runnable() {
                    public void run() {
                        C1231g.this.mo5852a(hVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5853a(C1579h<?> hVar, C1589c cVar) {
        this.f4441i.mo5796a(hVar);
        this.f4439g.mo5785a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5854a(C1594g gVar) {
        this.f4445m = gVar.clone().mo6497h();
    }

    /* renamed from: b */
    public C1231g mo5855b(C1594g gVar) {
        mo5854a(gVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <T> C1260h<?, T> mo5856b(Class<T> cls) {
        return this.f4436a.mo5743e().mo5805a(cls);
    }

    /* renamed from: b */
    public void mo5857b() {
        C1258j.m6707a();
        this.f4439g.mo5786b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5858b(C1579h<?> hVar) {
        C1589c a = hVar.mo6436a();
        if (a == null) {
            return true;
        }
        if (!this.f4439g.mo5787b(a)) {
            return false;
        }
        this.f4441i.mo5798b(hVar);
        hVar.mo6438a((C1589c) null);
        return true;
    }

    /* renamed from: c */
    public void mo5758c() {
        mo5857b();
        this.f4441i.mo5758c();
    }

    /* renamed from: d */
    public void mo5759d() {
        mo5851a();
        this.f4441i.mo5759d();
    }

    /* renamed from: e */
    public void mo5760e() {
        this.f4441i.mo5760e();
        for (C1579h a : this.f4441i.mo5795a()) {
            mo5852a(a);
        }
        this.f4441i.mo5797b();
        this.f4439g.mo5788c();
        this.f4438c.mo5753b(this);
        this.f4438c.mo5753b(this.f4444l);
        this.f4443k.removeCallbacks(this.f4442j);
        this.f4436a.mo5740b(this);
    }

    /* renamed from: f */
    public C1226f<Bitmap> mo5859f() {
        return mo5849a(Bitmap.class).mo5832a(f4433d);
    }

    /* renamed from: g */
    public C1226f<Drawable> mo5860g() {
        return mo5849a(Drawable.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C1594g mo5861h() {
        return this.f4445m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{tracker=");
        sb.append(this.f4439g);
        sb.append(", treeNode=");
        sb.append(this.f4440h);
        sb.append("}");
        return sb.toString();
    }
}
