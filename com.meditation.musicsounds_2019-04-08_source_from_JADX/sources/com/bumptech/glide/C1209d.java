package com.bumptech.glide;

import android.content.Context;
import android.support.p009v4.p019g.C0488a;
import com.bumptech.glide.load.engine.C1462i;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.load.engine.p046a.C1399f;
import com.bumptech.glide.load.engine.p046a.C1404j;
import com.bumptech.glide.load.engine.p046a.C1407k;
import com.bumptech.glide.load.engine.p047b.C1417a.C1418a;
import com.bumptech.glide.load.engine.p047b.C1427f;
import com.bumptech.glide.load.engine.p047b.C1429g;
import com.bumptech.glide.load.engine.p047b.C1430h;
import com.bumptech.glide.load.engine.p047b.C1432i;
import com.bumptech.glide.load.engine.p047b.C1432i.C1433a;
import com.bumptech.glide.load.engine.p048c.C1440a;
import com.bumptech.glide.p036c.C1191d;
import com.bumptech.glide.p036c.C1194f;
import com.bumptech.glide.p036c.C1201l;
import com.bumptech.glide.p036c.C1201l.C1203a;
import com.bumptech.glide.request.C1594g;
import java.util.Map;

/* renamed from: com.bumptech.glide.d */
public final class C1209d {

    /* renamed from: a */
    private final Map<Class<?>, C1260h<?, ?>> f4368a = new C0488a();

    /* renamed from: b */
    private C1462i f4369b;

    /* renamed from: c */
    private C1398e f4370c;

    /* renamed from: d */
    private C1393b f4371d;

    /* renamed from: e */
    private C1430h f4372e;

    /* renamed from: f */
    private C1440a f4373f;

    /* renamed from: g */
    private C1440a f4374g;

    /* renamed from: h */
    private C1418a f4375h;

    /* renamed from: i */
    private C1432i f4376i;

    /* renamed from: j */
    private C1191d f4377j;

    /* renamed from: k */
    private int f4378k = 4;

    /* renamed from: l */
    private C1594g f4379l = new C1594g();

    /* renamed from: m */
    private C1203a f4380m;

    /* renamed from: n */
    private C1440a f4381n;

    /* renamed from: o */
    private boolean f4382o;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1186c mo5799a(Context context) {
        if (this.f4373f == null) {
            this.f4373f = C1440a.m7294b();
        }
        if (this.f4374g == null) {
            this.f4374g = C1440a.m7291a();
        }
        if (this.f4381n == null) {
            this.f4381n = C1440a.m7297d();
        }
        if (this.f4376i == null) {
            this.f4376i = new C1433a(context).mo6192a();
        }
        if (this.f4377j == null) {
            this.f4377j = new C1194f();
        }
        if (this.f4370c == null) {
            int b = this.f4376i.mo6190b();
            if (b > 0) {
                this.f4370c = new C1407k((long) b);
            } else {
                this.f4370c = new C1399f();
            }
        }
        if (this.f4371d == null) {
            this.f4371d = new C1404j(this.f4376i.mo6191c());
        }
        if (this.f4372e == null) {
            this.f4372e = new C1429g((long) this.f4376i.mo6189a());
        }
        if (this.f4375h == null) {
            this.f4375h = new C1427f(context);
        }
        if (this.f4369b == null) {
            C1462i iVar = new C1462i(this.f4372e, this.f4375h, this.f4374g, this.f4373f, C1440a.m7296c(), C1440a.m7297d(), this.f4382o);
            this.f4369b = iVar;
        }
        Context context2 = context;
        C1186c cVar = new C1186c(context2, this.f4369b, this.f4372e, this.f4370c, this.f4371d, new C1201l(this.f4380m), this.f4377j, this.f4378k, this.f4379l.mo6496g(), this.f4368a);
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5800a(C1203a aVar) {
        this.f4380m = aVar;
    }
}
