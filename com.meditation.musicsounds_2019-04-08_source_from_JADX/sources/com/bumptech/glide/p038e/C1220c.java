package com.bumptech.glide.p038e;

import android.support.p009v4.p019g.C0488a;
import com.bumptech.glide.load.engine.C1454g;
import com.bumptech.glide.load.engine.C1479q;
import com.bumptech.glide.load.resource.p054e.C1569g;
import com.bumptech.glide.p040g.C1256h;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.e.c */
public class C1220c {

    /* renamed from: a */
    private static final C1479q<?, ?, ?> f4397a;

    /* renamed from: b */
    private final C0488a<C1256h, C1479q<?, ?, ?>> f4398b = new C0488a<>();

    /* renamed from: c */
    private final AtomicReference<C1256h> f4399c = new AtomicReference<>();

    static {
        C1454g gVar = new C1454g(Object.class, Object.class, Object.class, Collections.emptyList(), new C1569g(), null);
        C1479q qVar = new C1479q(Object.class, Object.class, Object.class, Collections.singletonList(gVar), null);
        f4397a = qVar;
    }

    /* renamed from: b */
    private C1256h m6581b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C1256h hVar = (C1256h) this.f4399c.getAndSet(null);
        if (hVar == null) {
            hVar = new C1256h();
        }
        hVar.mo5910a(cls, cls2, cls3);
        return hVar;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C1479q<Data, TResource, Transcode> mo5818a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1479q<Data, TResource, Transcode> qVar;
        C1256h b = m6581b(cls, cls2, cls3);
        synchronized (this.f4398b) {
            qVar = (C1479q) this.f4398b.get(b);
        }
        this.f4399c.set(b);
        return qVar;
    }

    /* renamed from: a */
    public void mo5819a(Class<?> cls, Class<?> cls2, Class<?> cls3, C1479q<?, ?, ?> qVar) {
        synchronized (this.f4398b) {
            C0488a<C1256h, C1479q<?, ?, ?>> aVar = this.f4398b;
            C1256h hVar = new C1256h(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f4397a;
            }
            aVar.put(hVar, qVar);
        }
    }

    /* renamed from: a */
    public boolean mo5820a(C1479q<?, ?, ?> qVar) {
        return f4397a.equals(qVar);
    }
}
