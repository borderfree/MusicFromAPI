package com.bumptech.glide.load.engine;

import android.support.p009v4.p019g.C0505k.C0506a;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p042a.C1274e;
import com.bumptech.glide.p040g.C1257i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.q */
public class C1479q<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<Data> f4899a;

    /* renamed from: b */
    private final C0506a<List<Throwable>> f4900b;

    /* renamed from: c */
    private final List<? extends C1454g<Data, ResourceType, Transcode>> f4901c;

    /* renamed from: d */
    private final String f4902d;

    public C1479q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1454g<Data, ResourceType, Transcode>> list, C0506a<List<Throwable>> aVar) {
        this.f4899a = cls;
        this.f4900b = aVar;
        this.f4901c = (List) C1257i.m6694a(list);
        StringBuilder sb = new StringBuilder();
        sb.append("Failed LoadPath{");
        sb.append(cls.getSimpleName());
        sb.append("->");
        sb.append(cls2.getSimpleName());
        sb.append("->");
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.f4902d = sb.toString();
    }

    /* renamed from: a */
    private C1482s<Transcode> m7417a(C1274e<Data> eVar, C1379e eVar2, int i, int i2, C1455a<ResourceType> aVar, List<Throwable> list) {
        List<Throwable> list2 = list;
        int size = this.f4901c.size();
        C1482s<Transcode> sVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                sVar = ((C1454g) this.f4901c.get(i3)).mo6239a(eVar, i, i2, eVar2, aVar);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (sVar != null) {
                break;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        throw new GlideException(this.f4902d, (List<Throwable>) new ArrayList<Throwable>(list2));
    }

    /* renamed from: a */
    public C1482s<Transcode> mo6282a(C1274e<Data> eVar, C1379e eVar2, int i, int i2, C1455a<ResourceType> aVar) {
        List list = (List) C1257i.m6691a(this.f4900b.mo2001a());
        try {
            C1482s<Transcode> a = m7417a(eVar, eVar2, i, i2, aVar, list);
            return a;
        } finally {
            this.f4900b.mo2002a(list);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.f4901c.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
