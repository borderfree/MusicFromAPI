package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.C1462i;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.request.C1594g;
import com.bumptech.glide.request.p055a.C1576e;
import com.bumptech.glide.request.p055a.C1580i;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.e */
public class C1216e extends ContextWrapper {

    /* renamed from: a */
    static final C1260h<?, ?> f4384a = new C1179b();

    /* renamed from: b */
    private final Handler f4385b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final C1393b f4386c;

    /* renamed from: d */
    private final Registry f4387d;

    /* renamed from: e */
    private final C1576e f4388e;

    /* renamed from: f */
    private final C1594g f4389f;

    /* renamed from: g */
    private final Map<Class<?>, C1260h<?, ?>> f4390g;

    /* renamed from: h */
    private final C1462i f4391h;

    /* renamed from: i */
    private final int f4392i;

    public C1216e(Context context, C1393b bVar, Registry registry, C1576e eVar, C1594g gVar, Map<Class<?>, C1260h<?, ?>> map, C1462i iVar, int i) {
        super(context.getApplicationContext());
        this.f4386c = bVar;
        this.f4387d = registry;
        this.f4388e = eVar;
        this.f4389f = gVar;
        this.f4390g = map;
        this.f4391h = iVar;
        this.f4392i = i;
    }

    /* renamed from: a */
    public <T> C1260h<?, T> mo5805a(Class<T> cls) {
        C1260h<?, T> hVar = (C1260h) this.f4390g.get(cls);
        if (hVar == null) {
            for (Entry entry : this.f4390g.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    hVar = (C1260h) entry.getValue();
                }
            }
        }
        return hVar == null ? f4384a : hVar;
    }

    /* renamed from: a */
    public <X> C1580i<ImageView, X> mo5806a(ImageView imageView, Class<X> cls) {
        return this.f4388e.mo6445a(imageView, cls);
    }

    /* renamed from: a */
    public C1594g mo5807a() {
        return this.f4389f;
    }

    /* renamed from: b */
    public Handler mo5808b() {
        return this.f4385b;
    }

    /* renamed from: c */
    public C1462i mo5809c() {
        return this.f4391h;
    }

    /* renamed from: d */
    public Registry mo5810d() {
        return this.f4387d;
    }

    /* renamed from: e */
    public int mo5811e() {
        return this.f4392i;
    }

    /* renamed from: f */
    public C1393b mo5812f() {
        return this.f4386c;
    }
}
