package com.facebook.internal;

import android.app.Activity;
import android.util.Log;
import com.facebook.C2189f;
import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.internal.h */
public abstract class C2220h<CONTENT, RESULT> {

    /* renamed from: a */
    protected static final Object f7169a = new Object();

    /* renamed from: b */
    private final Activity f7170b;

    /* renamed from: c */
    private final C2236o f7171c = null;

    /* renamed from: d */
    private List<C2221a> f7172d;

    /* renamed from: e */
    private int f7173e;

    /* renamed from: com.facebook.internal.h$a */
    protected abstract class C2221a {
        protected C2221a() {
        }

        /* renamed from: a */
        public abstract C2201a mo7837a(CONTENT content);

        /* renamed from: a */
        public Object mo7838a() {
            return C2220h.f7169a;
        }

        /* renamed from: a */
        public abstract boolean mo7839a(CONTENT content, boolean z);
    }

    protected C2220h(Activity activity, int i) {
        C2264y.m10422a((Object) activity, "activity");
        this.f7170b = activity;
        this.f7173e = i;
    }

    /* renamed from: b */
    private C2201a m10188b(CONTENT content, Object obj) {
        boolean z = obj == f7169a;
        C2201a aVar = null;
        Iterator it = mo8350e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2221a aVar2 = (C2221a) it.next();
            if ((z || C2258x.m10391a(aVar2.mo7838a(), obj)) && aVar2.mo7839a(content, true)) {
                try {
                    aVar = aVar2.mo7837a(content);
                    break;
                } catch (FacebookException e) {
                    aVar = mo7836d();
                    C2218g.m10178a(aVar, e);
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        C2201a d = mo7836d();
        C2218g.m10176a(d);
        return d;
    }

    /* renamed from: e */
    private List<C2221a> mo8350e() {
        if (this.f7172d == null) {
            this.f7172d = mo7835c();
        }
        return this.f7172d;
    }

    /* renamed from: a */
    public int mo7832a() {
        return this.f7173e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7833a(CONTENT content, Object obj) {
        C2201a b = m10188b(content, obj);
        if (b == null) {
            String str = "No code path should ever result in a null appCall";
            Log.e("FacebookDialog", str);
            if (C2189f.m10086b()) {
                throw new IllegalStateException(str);
            }
        } else if (this.f7171c != null) {
            C2218g.m10180a(b, this.f7171c);
        } else {
            C2218g.m10177a(b, this.f7170b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Activity mo7834b() {
        if (this.f7170b != null) {
            return this.f7170b;
        }
        if (this.f7171c != null) {
            return this.f7171c.mo7861a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<C2221a> mo7835c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C2201a mo7836d();
}
