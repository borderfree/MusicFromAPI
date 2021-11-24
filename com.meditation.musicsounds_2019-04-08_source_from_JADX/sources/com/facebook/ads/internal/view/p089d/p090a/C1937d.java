package com.facebook.ads.internal.view.p089d.p090a;

import android.support.p023v7.widget.RecyclerView.C0926a;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.p064f.C1684a;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.component.p087a.C1917d.C1919a;
import com.facebook.ads.internal.view.component.p087a.p088a.C1913c;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.d.a.d */
public class C1937d extends C0926a<C1944g> {

    /* renamed from: a */
    private final C1728c f6396a;

    /* renamed from: b */
    private final C1684a f6397b;

    /* renamed from: c */
    private final C1838a f6398c;

    /* renamed from: d */
    private final C1806p f6399d;

    /* renamed from: e */
    private final C1647d f6400e;

    /* renamed from: f */
    private C1845a f6401f;

    /* renamed from: g */
    private int f6402g;

    /* renamed from: h */
    private int f6403h;

    /* renamed from: i */
    private String f6404i;

    /* renamed from: j */
    private int f6405j;

    /* renamed from: k */
    private int f6406k;

    /* renamed from: l */
    private List<C1935b> f6407l;

    /* renamed from: m */
    private final C1931a f6408m;

    /* renamed from: n */
    private final SparseBooleanArray f6409n = new SparseBooleanArray();

    /* renamed from: com.facebook.ads.internal.view.d.a.d$a */
    public interface C1938a {
        /* renamed from: a */
        void mo7339a(int i);
    }

    C1937d(List<C1935b> list, C1728c cVar, C1684a aVar, C1838a aVar2, C1806p pVar, C1845a aVar3, C1647d dVar, String str, int i, int i2, int i3, int i4, C1931a aVar4) {
        this.f6396a = cVar;
        this.f6397b = aVar;
        this.f6398c = aVar2;
        this.f6399d = pVar;
        this.f6401f = aVar3;
        this.f6407l = list;
        this.f6403h = i;
        this.f6400e = dVar;
        this.f6405j = i4;
        this.f6404i = str;
        this.f6402g = i3;
        this.f6406k = i2;
        this.f6408m = aVar4;
    }

    /* renamed from: a */
    public int mo342a() {
        return this.f6407l.size();
    }

    /* renamed from: a */
    public C1944g mo353b(ViewGroup viewGroup, int i) {
        C1919a aVar = new C1919a(viewGroup.getContext(), this.f6396a, this.f6401f, null, null, this.f6398c, this.f6399d);
        C1944g gVar = new C1944g(C1913c.m9260a(aVar.mo7310a(), this.f6405j, this.f6400e, this.f6404i, this.f6408m), this.f6409n, this.f6398c, this.f6403h, this.f6402g, this.f6406k, this.f6407l.size());
        return gVar;
    }

    /* renamed from: a */
    public void mo350a(C1944g gVar, int i) {
        gVar.mo7356a((C1935b) this.f6407l.get(i), this.f6396a, this.f6397b, this.f6399d, this.f6404i);
    }
}
