package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.C2520e.C2521a;
import com.google.android.exoplayer2.C2520e.C2523c;
import com.google.android.exoplayer2.C2663h.C2665b;
import com.google.android.exoplayer2.C2663h.C2667d;
import com.google.android.exoplayer2.C2717q.C2719a;
import com.google.android.exoplayer2.C2717q.C2720b;
import com.google.android.exoplayer2.p101b.C2481f;
import com.google.android.exoplayer2.p101b.C2483g;
import com.google.android.exoplayer2.p101b.C2484h;
import com.google.android.exoplayer2.p101b.C2486i;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.source.C2733d;
import com.google.android.exoplayer2.source.C2740i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.g */
final class C2661g implements C2520e {

    /* renamed from: a */
    private final C2671l[] f9027a;

    /* renamed from: b */
    private final C2484h f9028b;

    /* renamed from: c */
    private final C2483g f9029c;

    /* renamed from: d */
    private final Handler f9030d;

    /* renamed from: e */
    private final C2663h f9031e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<C2521a> f9032f;

    /* renamed from: g */
    private final C2720b f9033g;

    /* renamed from: h */
    private final C2719a f9034h;

    /* renamed from: i */
    private boolean f9035i;

    /* renamed from: j */
    private boolean f9036j;

    /* renamed from: k */
    private int f9037k;

    /* renamed from: l */
    private int f9038l;

    /* renamed from: m */
    private int f9039m;

    /* renamed from: n */
    private boolean f9040n;

    /* renamed from: o */
    private C2717q f9041o;

    /* renamed from: p */
    private Object f9042p;

    /* renamed from: q */
    private C2740i f9043q;

    /* renamed from: r */
    private C2483g f9044r;

    /* renamed from: s */
    private C2670k f9045s;

    /* renamed from: t */
    private C2665b f9046t;

    /* renamed from: u */
    private int f9047u;

    /* renamed from: v */
    private int f9048v;

    /* renamed from: w */
    private long f9049w;

    @SuppressLint({"HandlerLeak"})
    public C2661g(C2671l[] lVarArr, C2484h hVar, C2669j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(C2511s.f8127e);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        C2488a.m11668b(lVarArr.length > 0);
        this.f9027a = (C2671l[]) C2488a.m11664a(lVarArr);
        this.f9028b = (C2484h) C2488a.m11664a(hVar);
        this.f9036j = false;
        this.f9037k = 1;
        this.f9032f = new CopyOnWriteArraySet<>();
        this.f9029c = new C2483g(new C2481f[lVarArr.length]);
        this.f9041o = C2717q.f9292a;
        this.f9033g = new C2720b();
        this.f9034h = new C2719a();
        this.f9043q = C2740i.f9384a;
        this.f9044r = this.f9029c;
        this.f9045s = C2670k.f9114a;
        this.f9030d = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) {
            public void handleMessage(Message message) {
                C2661g.this.mo9125a(message);
            }
        };
        this.f9046t = new C2665b(0, 0);
        C2663h hVar2 = new C2663h(lVarArr, hVar, jVar, this.f9036j, this.f9030d, this.f9046t, this);
        this.f9031e = hVar2;
    }

    /* renamed from: a */
    public void mo9123a(int i) {
        mo9124a(i, -9223372036854775807L);
    }

    /* renamed from: a */
    public void mo9124a(int i, long j) {
        int i2;
        if (i < 0 || (!this.f9041o.mo9324a() && i >= this.f9041o.mo9325b())) {
            throw new IllegalSeekPositionException(this.f9041o, i, j);
        }
        this.f9038l++;
        this.f9047u = i;
        if (!this.f9041o.mo9324a()) {
            this.f9041o.mo9321a(i, this.f9033g);
            long a = j == -9223372036854775807L ? this.f9033g.mo9330a() : j;
            i2 = this.f9033g.f9304f;
            long c = this.f9033g.mo9333c() + C2468b.m11603b(a);
            C2717q qVar = this.f9041o;
            while (true) {
                long a2 = qVar.mo9319a(i2, this.f9034h).mo9327a();
                if (a2 == -9223372036854775807L || c < a2 || i2 >= this.f9033g.f9305g) {
                    break;
                }
                c -= a2;
                qVar = this.f9041o;
                i2++;
            }
        } else {
            i2 = 0;
        }
        this.f9048v = i2;
        if (j == -9223372036854775807L) {
            this.f9049w = 0;
            this.f9031e.mo9131a(this.f9041o, i, -9223372036854775807L);
            return;
        }
        this.f9049w = j;
        this.f9031e.mo9131a(this.f9041o, i, C2468b.m11603b(j));
        Iterator it = this.f9032f.iterator();
        while (it.hasNext()) {
            ((C2521a) it.next()).mo7571f();
        }
    }

    /* renamed from: a */
    public void mo8916a(long j) {
        mo9124a(mo9127h(), j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9125a(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.f9039m--;
                return;
            case 1:
                this.f9037k = message.arg1;
                Iterator it = this.f9032f.iterator();
                while (it.hasNext()) {
                    ((C2521a) it.next()).mo7565a(this.f9036j, this.f9037k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.f9040n = z;
                Iterator it2 = this.f9032f.iterator();
                while (it2.hasNext()) {
                    ((C2521a) it2.next()).mo7567b(this.f9040n);
                }
                return;
            case 3:
                if (this.f9039m == 0) {
                    C2486i iVar = (C2486i) message.obj;
                    this.f9035i = true;
                    this.f9043q = iVar.f8043a;
                    this.f9044r = iVar.f8044b;
                    this.f9028b.mo8782a(iVar.f8045c);
                    Iterator it3 = this.f9032f.iterator();
                    while (it3.hasNext()) {
                        ((C2521a) it3.next()).mo7563a(this.f9043q, this.f9044r);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.f9038l - 1;
                this.f9038l = i;
                if (i == 0) {
                    this.f9046t = (C2665b) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.f9032f.iterator();
                        while (it4.hasNext()) {
                            ((C2521a) it4.next()).mo7571f();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f9038l == 0) {
                    this.f9046t = (C2665b) message.obj;
                    Iterator it5 = this.f9032f.iterator();
                    while (it5.hasNext()) {
                        ((C2521a) it5.next()).mo7571f();
                    }
                    return;
                }
                return;
            case 6:
                C2667d dVar = (C2667d) message.obj;
                this.f9038l -= dVar.f9112d;
                if (this.f9039m == 0) {
                    this.f9041o = dVar.f9109a;
                    this.f9042p = dVar.f9110b;
                    this.f9046t = dVar.f9111c;
                    Iterator it6 = this.f9032f.iterator();
                    while (it6.hasNext()) {
                        ((C2521a) it6.next()).mo7562a(this.f9041o, this.f9042p);
                    }
                    return;
                }
                return;
            case 7:
                C2670k kVar = (C2670k) message.obj;
                if (!this.f9045s.equals(kVar)) {
                    this.f9045s = kVar;
                    Iterator it7 = this.f9032f.iterator();
                    while (it7.hasNext()) {
                        ((C2521a) it7.next()).mo7561a(kVar);
                    }
                    return;
                }
                return;
            case 8:
                ExoPlaybackException exoPlaybackException = (ExoPlaybackException) message.obj;
                Iterator it8 = this.f9032f.iterator();
                while (it8.hasNext()) {
                    ((C2521a) it8.next()).mo7560a(exoPlaybackException);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo8917a(C2521a aVar) {
        this.f9032f.add(aVar);
    }

    /* renamed from: a */
    public void mo8918a(C2733d dVar) {
        mo9126a(dVar, true, true);
    }

    /* renamed from: a */
    public void mo9126a(C2733d dVar, boolean z, boolean z2) {
        if (z2) {
            if (!this.f9041o.mo9324a() || this.f9042p != null) {
                this.f9041o = C2717q.f9292a;
                this.f9042p = null;
                Iterator it = this.f9032f.iterator();
                while (it.hasNext()) {
                    ((C2521a) it.next()).mo7562a(this.f9041o, this.f9042p);
                }
            }
            if (this.f9035i) {
                this.f9035i = false;
                this.f9043q = C2740i.f9384a;
                this.f9044r = this.f9029c;
                this.f9028b.mo8782a((Object) null);
                Iterator it2 = this.f9032f.iterator();
                while (it2.hasNext()) {
                    ((C2521a) it2.next()).mo7563a(this.f9043q, this.f9044r);
                }
            }
        }
        this.f9039m++;
        this.f9031e.mo9134a(dVar, z);
    }

    /* renamed from: a */
    public void mo8919a(boolean z) {
        if (this.f9036j != z) {
            this.f9036j = z;
            this.f9031e.mo9136a(z);
            Iterator it = this.f9032f.iterator();
            while (it.hasNext()) {
                ((C2521a) it.next()).mo7565a(z, this.f9037k);
            }
        }
    }

    /* renamed from: a */
    public void mo8920a(C2523c... cVarArr) {
        this.f9031e.mo9137a(cVarArr);
    }

    /* renamed from: a */
    public boolean mo8921a() {
        return this.f9036j;
    }

    /* renamed from: b */
    public void mo8922b() {
        mo9123a(mo9127h());
    }

    /* renamed from: b */
    public void mo8923b(C2523c... cVarArr) {
        this.f9031e.mo9140b(cVarArr);
    }

    /* renamed from: c */
    public void mo8924c() {
        this.f9031e.mo9130a();
    }

    /* renamed from: d */
    public void mo8925d() {
        this.f9031e.mo9138b();
        this.f9030d.removeCallbacksAndMessages(null);
    }

    /* renamed from: e */
    public long mo8926e() {
        if (this.f9041o.mo9324a()) {
            return -9223372036854775807L;
        }
        return this.f9041o.mo9321a(mo9127h(), this.f9033g).mo9332b();
    }

    /* renamed from: f */
    public long mo8927f() {
        if (this.f9041o.mo9324a() || this.f9038l > 0) {
            return this.f9049w;
        }
        this.f9041o.mo9319a(this.f9046t.f9102a, this.f9034h);
        return this.f9034h.mo9329b() + C2468b.m11602a(this.f9046t.f9104c);
    }

    /* renamed from: g */
    public int mo8928g() {
        int i = 0;
        if (this.f9041o.mo9324a()) {
            return 0;
        }
        long i2 = mo9128i();
        long e = mo8926e();
        if (!(i2 == -9223372036854775807L || e == -9223372036854775807L)) {
            i = e == 0 ? 100 : C2511s.m11798a((int) ((i2 * 100) / e), 0, 100);
        }
        return i;
    }

    /* renamed from: h */
    public int mo9127h() {
        return (this.f9041o.mo9324a() || this.f9038l > 0) ? this.f9047u : this.f9041o.mo9319a(this.f9046t.f9102a, this.f9034h).f9295c;
    }

    /* renamed from: i */
    public long mo9128i() {
        if (this.f9041o.mo9324a() || this.f9038l > 0) {
            return this.f9049w;
        }
        this.f9041o.mo9319a(this.f9046t.f9102a, this.f9034h);
        return this.f9034h.mo9329b() + C2468b.m11602a(this.f9046t.f9105d);
    }
}
