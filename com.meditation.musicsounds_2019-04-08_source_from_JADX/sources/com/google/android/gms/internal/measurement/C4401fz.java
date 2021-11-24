package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.fz */
public final class C4401fz extends C4347ee<String> implements C4403ga, RandomAccess {

    /* renamed from: a */
    private static final C4401fz f16147a;

    /* renamed from: b */
    private static final C4403ga f16148b = f16147a;

    /* renamed from: c */
    private final List<Object> f16149c;

    static {
        C4401fz fzVar = new C4401fz();
        f16147a = fzVar;
        fzVar.mo14312b();
    }

    public C4401fz() {
        this(10);
    }

    public C4401fz(int i) {
        this(new ArrayList<>(i));
    }

    private C4401fz(ArrayList<Object> arrayList) {
        this.f16149c = arrayList;
    }

    /* renamed from: a */
    private static String m21625a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzte ? ((zzte) obj).zzud() : C4390fo.m21612b((byte[]) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C4394fs mo14322a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f16149c);
            return new C4401fz(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo14529a(zzte zzte) {
        mo14313c();
        this.f16149c.add(zzte);
        this.modCount++;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo14307a() {
        return super.mo14307a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo14313c();
        this.f16149c.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo14313c();
        if (collection instanceof C4403ga) {
            collection = ((C4403ga) collection).mo14531d();
        }
        boolean addAll = this.f16149c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public final Object mo14530b(int i) {
        return this.f16149c.get(i);
    }

    public final void clear() {
        mo14313c();
        this.f16149c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final List<?> mo14531d() {
        return Collections.unmodifiableList(this.f16149c);
    }

    /* renamed from: e */
    public final C4403ga mo14532e() {
        return mo14307a() ? new C4459ic(this) : this;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f16149c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzte) {
            zzte zzte = (zzte) obj;
            String zzud = zzte.zzud();
            if (zzte.zzue()) {
                this.f16149c.set(i, zzud);
            }
            return zzud;
        }
        byte[] bArr = (byte[]) obj;
        String b = C4390fo.m21612b(bArr);
        if (C4390fo.m21611a(bArr)) {
            this.f16149c.set(i, b);
        }
        return b;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* synthetic */ Object remove(int i) {
        mo14313c();
        Object remove = this.f16149c.remove(i);
        this.modCount++;
        return m21625a(remove);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo14313c();
        return m21625a(this.f16149c.set(i, str));
    }

    public final int size() {
        return this.f16149c.size();
    }
}
