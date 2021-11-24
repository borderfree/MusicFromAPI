package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.C1624a;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.C2041c;
import com.facebook.ads.internal.view.p093g.p094a.C2000a;
import com.facebook.ads.internal.view.p093g.p095b.C2016a;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2019d;
import com.facebook.ads.internal.view.p093g.p095b.C2027l;
import com.facebook.ads.p057a.C1625a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.c */
public class C1658c extends C1669g {

    /* renamed from: e */
    static final /* synthetic */ boolean f5412e = (!C1658c.class.desiredAssertionStatus());

    /* renamed from: a */
    protected C1728c f5413a;

    /* renamed from: b */
    protected C1994a f5414b;

    /* renamed from: c */
    protected JSONObject f5415c;

    /* renamed from: d */
    protected Context f5416d;

    /* renamed from: f */
    private final C1720f<C2017b> f5417f = new C1720f<C2017b>() {
        /* renamed from: a */
        public Class<C2017b> mo6764a() {
            return C2017b.class;
        }

        /* renamed from: a */
        public void mo6765a(C2017b bVar) {
            if (C1658c.this.f5421j != null) {
                C1658c.this.f5421j.mo6653d(C1658c.this);
            }
        }
    };

    /* renamed from: g */
    private final C1720f<C2027l> f5418g = new C1720f<C2027l>() {
        /* renamed from: a */
        public Class<C2027l> mo6764a() {
            return C2027l.class;
        }

        /* renamed from: a */
        public void mo6765a(C2027l lVar) {
            C1658c.this.f5423l = true;
            if (C1658c.this.f5421j != null) {
                C1658c.this.f5421j.mo6649a(C1658c.this);
            }
        }
    };

    /* renamed from: h */
    private final C1720f<C2019d> f5419h = new C1720f<C2019d>() {
        /* renamed from: a */
        public Class<C2019d> mo6764a() {
            return C2019d.class;
        }

        /* renamed from: a */
        public void mo6765a(C2019d dVar) {
            if (C1658c.this.f5421j != null) {
                C1658c.this.f5421j.mo6650a(C1658c.this, C1624a.m8164a(2003));
            }
        }
    };

    /* renamed from: i */
    private final C1720f<C2016a> f5420i = new C1720f<C2016a>() {
        /* renamed from: a */
        public Class<C2016a> mo6764a() {
            return C2016a.class;
        }

        /* renamed from: a */
        public void mo6765a(C2016a aVar) {
            if (C1658c.this.f5421j != null) {
                C1658c.this.f5421j.mo6651b(C1658c.this);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1625a f5421j;

    /* renamed from: k */
    private String f5422k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f5423l = false;

    /* renamed from: m */
    private C2041c f5424m;

    /* renamed from: n */
    private String f5425n;

    /* renamed from: o */
    private boolean f5426o = false;

    /* renamed from: a */
    public void mo6761a() {
        if (this.f5414b != null) {
            this.f5414b.mo7429e();
            this.f5414b.mo7447j();
        }
        this.f5421j = null;
        this.f5413a = null;
        this.f5422k = null;
        this.f5423l = false;
        this.f5425n = null;
        this.f5414b = null;
        this.f5424m = null;
        this.f5415c = null;
        this.f5416d = null;
        this.f5426o = false;
    }

    /* renamed from: b */
    public boolean mo6762b() {
        if (!this.f5423l || this.f5414b == null) {
            return false;
        }
        if (this.f5424m.mo7499i() > 0) {
            this.f5414b.mo7420a(this.f5424m.mo7499i());
        }
        this.f5414b.mo7422a(C2000a.AUTO_STARTED);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6763c() {
        if (this.f5413a != null && !this.f5426o) {
            this.f5426o = true;
            this.f5413a.mo6939a(this.f5425n, new HashMap());
            if (this.f5421j != null) {
                this.f5421j.mo6652c(this);
            }
        }
    }
}
