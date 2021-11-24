package com.bumptech.glide.load.engine;

import android.support.p009v4.p019g.C0505k.C0506a;
import android.util.Log;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.p042a.C1274e;
import com.bumptech.glide.load.resource.p054e.C1566e;
import com.bumptech.glide.p040g.C1257i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.g */
public class C1454g<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f4822a;

    /* renamed from: b */
    private final List<? extends C1488f<DataType, ResourceType>> f4823b;

    /* renamed from: c */
    private final C1566e<ResourceType, Transcode> f4824c;

    /* renamed from: d */
    private final C0506a<List<Throwable>> f4825d;

    /* renamed from: e */
    private final String f4826e;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    interface C1455a<ResourceType> {
        /* renamed from: a */
        C1482s<ResourceType> mo6079a(C1482s<ResourceType> sVar);
    }

    public C1454g(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C1488f<DataType, ResourceType>> list, C1566e<ResourceType, Transcode> eVar, C0506a<List<Throwable>> aVar) {
        this.f4822a = cls;
        this.f4823b = list;
        this.f4824c = eVar;
        this.f4825d = aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed DecodePath{");
        sb.append(cls.getSimpleName());
        sb.append("->");
        sb.append(cls2.getSimpleName());
        sb.append("->");
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.f4826e = sb.toString();
    }

    /* renamed from: a */
    private C1482s<ResourceType> m7334a(C1274e<DataType> eVar, int i, int i2, C1379e eVar2) {
        List list = (List) C1257i.m6691a(this.f4825d.mo2001a());
        try {
            C1482s<ResourceType> a = m7335a(eVar, i, i2, eVar2, list);
            return a;
        } finally {
            this.f4825d.mo2002a(list);
        }
    }

    /* renamed from: a */
    private C1482s<ResourceType> m7335a(C1274e<DataType> eVar, int i, int i2, C1379e eVar2, List<Throwable> list) {
        int size = this.f4823b.size();
        C1482s<ResourceType> sVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1488f fVar = (C1488f) this.f4823b.get(i3);
            try {
                if (fVar.mo6290a(eVar.mo5947a(), eVar2)) {
                    sVar = fVar.mo6289a(eVar.mo5947a(), i, i2, eVar2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(fVar);
                    Log.v("DecodePath", sb.toString(), e);
                }
                list.add(e);
            }
            if (sVar != null) {
                break;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        throw new GlideException(this.f4826e, (List<Throwable>) new ArrayList<Throwable>(list));
    }

    /* renamed from: a */
    public C1482s<Transcode> mo6239a(C1274e<DataType> eVar, int i, int i2, C1379e eVar2, C1455a<ResourceType> aVar) {
        return this.f4824c.mo6409a(aVar.mo6079a(m7334a(eVar, i, i2, eVar2)), eVar2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecodePath{ dataClass=");
        sb.append(this.f4822a);
        sb.append(", decoders=");
        sb.append(this.f4823b);
        sb.append(", transcoder=");
        sb.append(this.f4824c);
        sb.append('}');
        return sb.toString();
    }
}
