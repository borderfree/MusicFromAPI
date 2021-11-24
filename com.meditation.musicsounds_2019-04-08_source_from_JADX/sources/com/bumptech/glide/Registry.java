package com.bumptech.glide;

import android.support.p009v4.p019g.C0505k.C0506a;
import com.bumptech.glide.load.C1261a;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.C1489g;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C1454g;
import com.bumptech.glide.load.engine.C1479q;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.p042a.C1274e;
import com.bumptech.glide.load.p042a.C1274e.C1275a;
import com.bumptech.glide.load.p042a.C1276f;
import com.bumptech.glide.load.p044b.C1343n;
import com.bumptech.glide.load.p044b.C1345o;
import com.bumptech.glide.load.p044b.C1346p;
import com.bumptech.glide.load.resource.p054e.C1566e;
import com.bumptech.glide.load.resource.p054e.C1567f;
import com.bumptech.glide.p038e.C1217a;
import com.bumptech.glide.p038e.C1219b;
import com.bumptech.glide.p038e.C1220c;
import com.bumptech.glide.p038e.C1221d;
import com.bumptech.glide.p038e.C1222e;
import com.bumptech.glide.p038e.C1224f;
import com.bumptech.glide.p040g.p041a.C1238a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Registry {

    /* renamed from: a */
    private final C1346p f4220a = new C1346p(this.f4229j);

    /* renamed from: b */
    private final C1217a f4221b = new C1217a();

    /* renamed from: c */
    private final C1222e f4222c = new C1222e();

    /* renamed from: d */
    private final C1224f f4223d = new C1224f();

    /* renamed from: e */
    private final C1276f f4224e = new C1276f();

    /* renamed from: f */
    private final C1567f f4225f = new C1567f();

    /* renamed from: g */
    private final C1219b f4226g = new C1219b();

    /* renamed from: h */
    private final C1221d f4227h = new C1221d();

    /* renamed from: i */
    private final C1220c f4228i = new C1220c();

    /* renamed from: j */
    private final C0506a<List<Throwable>> f4229j = C1238a.m6641a();

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders for model: ");
            sb.append(cls);
            sb.append(" and data: ");
            sb.append(cls2);
            super(sb.toString());
        }

        public NoModelLoaderAvailableException(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders for model: ");
            sb.append(obj);
            super(sb.toString());
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find result encoder for resource class: ");
            sb.append(cls);
            sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
            super(sb.toString());
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find source encoder for data class: ");
            sb.append(cls);
            super(sb.toString());
        }
    }

    public Registry() {
        mo5679a(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: c */
    private <Data, TResource, Transcode> List<C1454g<Data, TResource, Transcode>> m6320c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f4222c.mo5826b(cls, cls2)) {
            for (Class cls5 : this.f4225f.mo6412b(cls4, cls3)) {
                C1454g gVar = new C1454g(cls, cls4, cls5, this.f4222c.mo5823a(cls, cls4), this.f4225f.mo6410a(cls4, cls5), this.f4229j);
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public Registry mo5671a(ImageHeaderParser imageHeaderParser) {
        this.f4226g.mo5817a(imageHeaderParser);
        return this;
    }

    /* renamed from: a */
    public Registry mo5672a(C1275a<?> aVar) {
        this.f4224e.mo5952a(aVar);
        return this;
    }

    /* renamed from: a */
    public <Data> Registry mo5673a(Class<Data> cls, C1261a<Data> aVar) {
        this.f4221b.mo5814a(cls, aVar);
        return this;
    }

    /* renamed from: a */
    public <TResource> Registry mo5674a(Class<TResource> cls, C1489g<TResource> gVar) {
        this.f4223d.mo5829a(cls, gVar);
        return this;
    }

    /* renamed from: a */
    public <Model, Data> Registry mo5675a(Class<Model> cls, Class<Data> cls2, C1345o<Model, Data> oVar) {
        this.f4220a.mo6033a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> Registry mo5676a(Class<Data> cls, Class<TResource> cls2, C1488f<Data, TResource> fVar) {
        mo5678a("legacy_append", cls, cls2, fVar);
        return this;
    }

    /* renamed from: a */
    public <TResource, Transcode> Registry mo5677a(Class<TResource> cls, Class<Transcode> cls2, C1566e<TResource, Transcode> eVar) {
        this.f4225f.mo6411a(cls, cls2, eVar);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> Registry mo5678a(String str, Class<Data> cls, Class<TResource> cls2, C1488f<Data, TResource> fVar) {
        this.f4222c.mo5824a(str, fVar, cls, cls2);
        return this;
    }

    /* renamed from: a */
    public final Registry mo5679a(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f4222c.mo5825a((List<String>) arrayList);
        return this;
    }

    /* renamed from: a */
    public <X> C1261a<X> mo5680a(X x) {
        C1261a<X> a = this.f4221b.mo5813a(x.getClass());
        if (a != null) {
            return a;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C1479q<Data, TResource, Transcode> mo5681a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1479q<Data, TResource, Transcode> a = this.f4228i.mo5818a(cls, cls2, cls3);
        if (this.f4228i.mo5820a(a)) {
            return null;
        }
        if (a == null) {
            List c = m6320c(cls, cls2, cls3);
            if (c.isEmpty()) {
                a = null;
            } else {
                a = new C1479q<>(cls, cls2, cls3, c, this.f4229j);
            }
            this.f4228i.mo5819a(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: a */
    public List<ImageHeaderParser> mo5682a() {
        List<ImageHeaderParser> a = this.f4226g.mo5816a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new NoImageHeaderParserException();
    }

    /* renamed from: a */
    public boolean mo5683a(C1482s<?> sVar) {
        return this.f4223d.mo5828a(sVar.mo6271c()) != null;
    }

    /* renamed from: b */
    public <X> C1274e<X> mo5684b(X x) {
        return this.f4224e.mo5951a(x);
    }

    /* renamed from: b */
    public <X> C1489g<X> mo5685b(C1482s<X> sVar) {
        C1489g<X> a = this.f4223d.mo5828a(sVar.mo6271c());
        if (a != null) {
            return a;
        }
        throw new NoResultEncoderAvailableException(sVar.mo6271c());
    }

    /* renamed from: b */
    public <Model, TResource, Transcode> List<Class<?>> mo5686b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f4227h.mo5821a(cls, cls2);
        if (a == null) {
            a = new ArrayList<>();
            for (Class b : this.f4220a.mo6031a(cls)) {
                for (Class cls4 : this.f4222c.mo5826b(b, cls2)) {
                    if (!this.f4225f.mo6412b(cls4, cls3).isEmpty() && !a.contains(cls4)) {
                        a.add(cls4);
                    }
                }
            }
            this.f4227h.mo5822a(cls, cls2, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: c */
    public <Model> List<C1343n<Model, ?>> mo5687c(Model model) {
        List<C1343n<Model, ?>> a = this.f4220a.mo6032a(model);
        if (!a.isEmpty()) {
            return a;
        }
        throw new NoModelLoaderAvailableException(model);
    }
}
