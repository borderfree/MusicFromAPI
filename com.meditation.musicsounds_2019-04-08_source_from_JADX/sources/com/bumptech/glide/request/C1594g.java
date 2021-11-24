package com.bumptech.glide.request;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.C1376d;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1490h;
import com.bumptech.glide.load.engine.C1456h;
import com.bumptech.glide.load.resource.bitmap.C1513g;
import com.bumptech.glide.load.resource.bitmap.C1514h;
import com.bumptech.glide.load.resource.bitmap.C1525l;
import com.bumptech.glide.load.resource.bitmap.C1526m;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.p053d.C1549c;
import com.bumptech.glide.load.resource.p053d.C1553f;
import com.bumptech.glide.p039f.C1229a;
import com.bumptech.glide.p040g.C1250b;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.C1258j;
import com.google.android.gms.ads.AdRequest;
import java.util.Map;

/* renamed from: com.bumptech.glide.request.g */
public class C1594g implements Cloneable {

    /* renamed from: a */
    private int f5141a;

    /* renamed from: b */
    private float f5142b = 1.0f;

    /* renamed from: c */
    private C1456h f5143c = C1456h.f4831e;

    /* renamed from: d */
    private Priority f5144d = Priority.NORMAL;

    /* renamed from: e */
    private Drawable f5145e;

    /* renamed from: f */
    private int f5146f;

    /* renamed from: g */
    private Drawable f5147g;

    /* renamed from: h */
    private int f5148h;

    /* renamed from: i */
    private boolean f5149i = true;

    /* renamed from: j */
    private int f5150j = -1;

    /* renamed from: k */
    private int f5151k = -1;

    /* renamed from: l */
    private C1375c f5152l = C1229a.m6615a();

    /* renamed from: m */
    private boolean f5153m;

    /* renamed from: n */
    private boolean f5154n = true;

    /* renamed from: o */
    private Drawable f5155o;

    /* renamed from: p */
    private int f5156p;

    /* renamed from: q */
    private C1379e f5157q = new C1379e();

    /* renamed from: r */
    private Map<Class<?>, C1490h<?>> f5158r = new C1250b();

    /* renamed from: s */
    private Class<?> f5159s = Object.class;

    /* renamed from: t */
    private boolean f5160t;

    /* renamed from: u */
    private Theme f5161u;

    /* renamed from: v */
    private boolean f5162v;

    /* renamed from: w */
    private boolean f5163w;

    /* renamed from: x */
    private boolean f5164x;

    /* renamed from: y */
    private boolean f5165y = true;

    /* renamed from: z */
    private boolean f5166z;

    /* renamed from: G */
    private C1594g m7904G() {
        if (!this.f5160t) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }

    /* renamed from: a */
    public static C1594g m7905a(C1375c cVar) {
        return new C1594g().mo6484b(cVar);
    }

    /* renamed from: a */
    public static C1594g m7906a(C1456h hVar) {
        return new C1594g().mo6485b(hVar);
    }

    /* renamed from: a */
    private C1594g m7907a(C1490h<Bitmap> hVar, boolean z) {
        if (this.f5162v) {
            return clone().m7907a(hVar, z);
        }
        C1525l lVar = new C1525l(hVar, z);
        m7910a(Bitmap.class, hVar, z);
        m7910a(Drawable.class, (C1490h<T>) lVar, z);
        m7910a(BitmapDrawable.class, lVar.mo6334a(), z);
        m7910a(C1549c.class, (C1490h<T>) new C1553f<T>(hVar), z);
        return m7904G();
    }

    /* renamed from: a */
    private C1594g m7908a(DownsampleStrategy downsampleStrategy, C1490h<Bitmap> hVar, boolean z) {
        C1594g b = z ? mo6486b(downsampleStrategy, hVar) : mo6480a(downsampleStrategy, hVar);
        b.f5165y = true;
        return b;
    }

    /* renamed from: a */
    public static C1594g m7909a(Class<?> cls) {
        return new C1594g().mo6487b(cls);
    }

    /* renamed from: a */
    private <T> C1594g m7910a(Class<T> cls, C1490h<T> hVar, boolean z) {
        if (this.f5162v) {
            return clone().m7910a(cls, hVar, z);
        }
        C1257i.m6691a(cls);
        C1257i.m6691a(hVar);
        this.f5158r.put(cls, hVar);
        this.f5141a |= 2048;
        this.f5154n = true;
        this.f5141a |= 65536;
        this.f5165y = false;
        if (z) {
            this.f5141a |= 131072;
            this.f5153m = true;
        }
        return m7904G();
    }

    /* renamed from: b */
    private static boolean m7911b(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: c */
    private C1594g m7912c(DownsampleStrategy downsampleStrategy, C1490h<Bitmap> hVar) {
        return m7908a(downsampleStrategy, hVar, false);
    }

    /* renamed from: c */
    private boolean m7913c(int i) {
        return m7911b(this.f5141a, i);
    }

    /* renamed from: A */
    public final int mo6466A() {
        return this.f5150j;
    }

    /* renamed from: B */
    public final float mo6467B() {
        return this.f5142b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public boolean mo6468C() {
        return this.f5165y;
    }

    /* renamed from: D */
    public final boolean mo6469D() {
        return this.f5163w;
    }

    /* renamed from: E */
    public final boolean mo6470E() {
        return this.f5166z;
    }

    /* renamed from: F */
    public final boolean mo6471F() {
        return this.f5164x;
    }

    /* renamed from: a */
    public C1594g clone() {
        try {
            C1594g gVar = (C1594g) super.clone();
            gVar.f5157q = new C1379e();
            gVar.f5157q.mo6063a(this.f5157q);
            gVar.f5158r = new C1250b();
            gVar.f5158r.putAll(this.f5158r);
            gVar.f5160t = false;
            gVar.f5162v = false;
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public C1594g mo6473a(float f) {
        if (this.f5162v) {
            return clone().mo6473a(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f5142b = f;
        this.f5141a |= 2;
        return m7904G();
    }

    /* renamed from: a */
    public C1594g mo6474a(int i) {
        if (this.f5162v) {
            return clone().mo6474a(i);
        }
        this.f5148h = i;
        this.f5141a |= 128;
        return m7904G();
    }

    /* renamed from: a */
    public C1594g mo6475a(int i, int i2) {
        if (this.f5162v) {
            return clone().mo6475a(i, i2);
        }
        this.f5151k = i;
        this.f5150j = i2;
        this.f5141a |= AdRequest.MAX_CONTENT_URL_LENGTH;
        return m7904G();
    }

    /* renamed from: a */
    public C1594g mo6476a(Priority priority) {
        if (this.f5162v) {
            return clone().mo6476a(priority);
        }
        this.f5144d = (Priority) C1257i.m6691a(priority);
        this.f5141a |= 8;
        return m7904G();
    }

    /* renamed from: a */
    public <T> C1594g mo6477a(C1376d<T> dVar, T t) {
        if (this.f5162v) {
            return clone().mo6477a(dVar, t);
        }
        C1257i.m6691a(dVar);
        C1257i.m6691a(t);
        this.f5157q.mo6061a(dVar, t);
        return m7904G();
    }

    /* renamed from: a */
    public C1594g mo6478a(C1490h<Bitmap> hVar) {
        return m7907a(hVar, true);
    }

    /* renamed from: a */
    public C1594g mo6479a(DownsampleStrategy downsampleStrategy) {
        return mo6477a(DownsampleStrategy.f4950h, (T) C1257i.m6691a(downsampleStrategy));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1594g mo6480a(DownsampleStrategy downsampleStrategy, C1490h<Bitmap> hVar) {
        if (this.f5162v) {
            return clone().mo6480a(downsampleStrategy, hVar);
        }
        mo6479a(downsampleStrategy);
        return m7907a(hVar, false);
    }

    /* renamed from: a */
    public C1594g mo6481a(C1594g gVar) {
        if (this.f5162v) {
            return clone().mo6481a(gVar);
        }
        if (m7911b(gVar.f5141a, 2)) {
            this.f5142b = gVar.f5142b;
        }
        if (m7911b(gVar.f5141a, 262144)) {
            this.f5163w = gVar.f5163w;
        }
        if (m7911b(gVar.f5141a, 1048576)) {
            this.f5166z = gVar.f5166z;
        }
        if (m7911b(gVar.f5141a, 4)) {
            this.f5143c = gVar.f5143c;
        }
        if (m7911b(gVar.f5141a, 8)) {
            this.f5144d = gVar.f5144d;
        }
        if (m7911b(gVar.f5141a, 16)) {
            this.f5145e = gVar.f5145e;
        }
        if (m7911b(gVar.f5141a, 32)) {
            this.f5146f = gVar.f5146f;
        }
        if (m7911b(gVar.f5141a, 64)) {
            this.f5147g = gVar.f5147g;
        }
        if (m7911b(gVar.f5141a, 128)) {
            this.f5148h = gVar.f5148h;
        }
        if (m7911b(gVar.f5141a, 256)) {
            this.f5149i = gVar.f5149i;
        }
        if (m7911b(gVar.f5141a, (int) AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.f5151k = gVar.f5151k;
            this.f5150j = gVar.f5150j;
        }
        if (m7911b(gVar.f5141a, 1024)) {
            this.f5152l = gVar.f5152l;
        }
        if (m7911b(gVar.f5141a, 4096)) {
            this.f5159s = gVar.f5159s;
        }
        if (m7911b(gVar.f5141a, 8192)) {
            this.f5155o = gVar.f5155o;
        }
        if (m7911b(gVar.f5141a, 16384)) {
            this.f5156p = gVar.f5156p;
        }
        if (m7911b(gVar.f5141a, 32768)) {
            this.f5161u = gVar.f5161u;
        }
        if (m7911b(gVar.f5141a, 65536)) {
            this.f5154n = gVar.f5154n;
        }
        if (m7911b(gVar.f5141a, 131072)) {
            this.f5153m = gVar.f5153m;
        }
        if (m7911b(gVar.f5141a, 2048)) {
            this.f5158r.putAll(gVar.f5158r);
            this.f5165y = gVar.f5165y;
        }
        if (m7911b(gVar.f5141a, 524288)) {
            this.f5164x = gVar.f5164x;
        }
        if (!this.f5154n) {
            this.f5158r.clear();
            this.f5141a &= -2049;
            this.f5153m = false;
            this.f5141a &= -131073;
            this.f5165y = true;
        }
        this.f5141a |= gVar.f5141a;
        this.f5157q.mo6063a(gVar.f5157q);
        return m7904G();
    }

    /* renamed from: a */
    public C1594g mo6482a(boolean z) {
        if (this.f5162v) {
            return clone().mo6482a(z);
        }
        this.f5166z = z;
        this.f5141a |= 1048576;
        return m7904G();
    }

    /* renamed from: b */
    public C1594g mo6483b(int i) {
        if (this.f5162v) {
            return clone().mo6483b(i);
        }
        this.f5146f = i;
        this.f5141a |= 32;
        return m7904G();
    }

    /* renamed from: b */
    public C1594g mo6484b(C1375c cVar) {
        if (this.f5162v) {
            return clone().mo6484b(cVar);
        }
        this.f5152l = (C1375c) C1257i.m6691a(cVar);
        this.f5141a |= 1024;
        return m7904G();
    }

    /* renamed from: b */
    public C1594g mo6485b(C1456h hVar) {
        if (this.f5162v) {
            return clone().mo6485b(hVar);
        }
        this.f5143c = (C1456h) C1257i.m6691a(hVar);
        this.f5141a |= 4;
        return m7904G();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C1594g mo6486b(DownsampleStrategy downsampleStrategy, C1490h<Bitmap> hVar) {
        if (this.f5162v) {
            return clone().mo6486b(downsampleStrategy, hVar);
        }
        mo6479a(downsampleStrategy);
        return mo6478a(hVar);
    }

    /* renamed from: b */
    public C1594g mo6487b(Class<?> cls) {
        if (this.f5162v) {
            return clone().mo6487b(cls);
        }
        this.f5159s = (Class) C1257i.m6691a(cls);
        this.f5141a |= 4096;
        return m7904G();
    }

    /* renamed from: b */
    public C1594g mo6488b(boolean z) {
        if (this.f5162v) {
            return clone().mo6488b(true);
        }
        this.f5149i = !z;
        this.f5141a |= 256;
        return m7904G();
    }

    /* renamed from: b */
    public final boolean mo6489b() {
        return this.f5154n;
    }

    /* renamed from: c */
    public final boolean mo6490c() {
        return m7913c(2048);
    }

    /* renamed from: d */
    public C1594g mo6492d() {
        return mo6480a(DownsampleStrategy.f4944b, (C1490h<Bitmap>) new C1513g<Bitmap>());
    }

    /* renamed from: e */
    public C1594g mo6493e() {
        return m7912c(DownsampleStrategy.f4943a, new C1526m());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1594g)) {
            return false;
        }
        C1594g gVar = (C1594g) obj;
        return Float.compare(gVar.f5142b, this.f5142b) == 0 && this.f5146f == gVar.f5146f && C1258j.m6709a((Object) this.f5145e, (Object) gVar.f5145e) && this.f5148h == gVar.f5148h && C1258j.m6709a((Object) this.f5147g, (Object) gVar.f5147g) && this.f5156p == gVar.f5156p && C1258j.m6709a((Object) this.f5155o, (Object) gVar.f5155o) && this.f5149i == gVar.f5149i && this.f5150j == gVar.f5150j && this.f5151k == gVar.f5151k && this.f5153m == gVar.f5153m && this.f5154n == gVar.f5154n && this.f5163w == gVar.f5163w && this.f5164x == gVar.f5164x && this.f5143c.equals(gVar.f5143c) && this.f5144d == gVar.f5144d && this.f5157q.equals(gVar.f5157q) && this.f5158r.equals(gVar.f5158r) && this.f5159s.equals(gVar.f5159s) && C1258j.m6709a((Object) this.f5152l, (Object) gVar.f5152l) && C1258j.m6709a((Object) this.f5161u, (Object) gVar.f5161u);
    }

    /* renamed from: f */
    public C1594g mo6495f() {
        return m7912c(DownsampleStrategy.f4947e, new C1514h());
    }

    /* renamed from: g */
    public C1594g mo6496g() {
        this.f5160t = true;
        return this;
    }

    /* renamed from: h */
    public C1594g mo6497h() {
        if (!this.f5160t || this.f5162v) {
            this.f5162v = true;
            return mo6496g();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public int hashCode() {
        return C1258j.m6701a((Object) this.f5161u, C1258j.m6701a((Object) this.f5152l, C1258j.m6701a((Object) this.f5159s, C1258j.m6701a((Object) this.f5158r, C1258j.m6701a((Object) this.f5157q, C1258j.m6701a((Object) this.f5144d, C1258j.m6701a((Object) this.f5143c, C1258j.m6702a(this.f5164x, C1258j.m6702a(this.f5163w, C1258j.m6702a(this.f5154n, C1258j.m6702a(this.f5153m, C1258j.m6710b(this.f5151k, C1258j.m6710b(this.f5150j, C1258j.m6702a(this.f5149i, C1258j.m6701a((Object) this.f5155o, C1258j.m6710b(this.f5156p, C1258j.m6701a((Object) this.f5147g, C1258j.m6710b(this.f5148h, C1258j.m6701a((Object) this.f5145e, C1258j.m6710b(this.f5146f, C1258j.m6696a(this.f5142b)))))))))))))))))))));
    }

    /* renamed from: i */
    public final Map<Class<?>, C1490h<?>> mo6499i() {
        return this.f5158r;
    }

    /* renamed from: j */
    public final boolean mo6500j() {
        return this.f5153m;
    }

    /* renamed from: k */
    public final C1379e mo6501k() {
        return this.f5157q;
    }

    /* renamed from: l */
    public final Class<?> mo6502l() {
        return this.f5159s;
    }

    /* renamed from: m */
    public final C1456h mo6503m() {
        return this.f5143c;
    }

    /* renamed from: n */
    public final Drawable mo6504n() {
        return this.f5145e;
    }

    /* renamed from: o */
    public final int mo6505o() {
        return this.f5146f;
    }

    /* renamed from: p */
    public final int mo6506p() {
        return this.f5148h;
    }

    /* renamed from: q */
    public final Drawable mo6507q() {
        return this.f5147g;
    }

    /* renamed from: r */
    public final int mo6508r() {
        return this.f5156p;
    }

    /* renamed from: s */
    public final Drawable mo6509s() {
        return this.f5155o;
    }

    /* renamed from: t */
    public final Theme mo6510t() {
        return this.f5161u;
    }

    /* renamed from: u */
    public final boolean mo6511u() {
        return this.f5149i;
    }

    /* renamed from: v */
    public final C1375c mo6512v() {
        return this.f5152l;
    }

    /* renamed from: w */
    public final boolean mo6513w() {
        return m7913c(8);
    }

    /* renamed from: x */
    public final Priority mo6514x() {
        return this.f5144d;
    }

    /* renamed from: y */
    public final int mo6515y() {
        return this.f5151k;
    }

    /* renamed from: z */
    public final boolean mo6516z() {
        return C1258j.m6708a(this.f5151k, this.f5150j);
    }
}
