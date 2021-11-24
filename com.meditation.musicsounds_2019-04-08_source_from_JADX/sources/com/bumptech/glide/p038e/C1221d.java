package com.bumptech.glide.p038e;

import android.support.p009v4.p019g.C0488a;
import com.bumptech.glide.p040g.C1256h;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.e.d */
public class C1221d {

    /* renamed from: a */
    private final AtomicReference<C1256h> f4400a = new AtomicReference<>();

    /* renamed from: b */
    private final C0488a<C1256h, List<Class<?>>> f4401b = new C0488a<>();

    /* renamed from: a */
    public List<Class<?>> mo5821a(Class<?> cls, Class<?> cls2) {
        List<Class<?>> list;
        C1256h hVar = (C1256h) this.f4400a.getAndSet(null);
        if (hVar == null) {
            hVar = new C1256h(cls, cls2);
        } else {
            hVar.mo5909a(cls, cls2);
        }
        synchronized (this.f4401b) {
            list = (List) this.f4401b.get(hVar);
        }
        this.f4400a.set(hVar);
        return list;
    }

    /* renamed from: a */
    public void mo5822a(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        synchronized (this.f4401b) {
            this.f4401b.put(new C1256h(cls, cls2), list);
        }
    }
}
