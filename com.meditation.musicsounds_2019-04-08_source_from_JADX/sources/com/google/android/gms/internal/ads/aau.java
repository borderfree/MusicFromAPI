package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class aau extends C4113zb<String> implements aav, RandomAccess {

    /* renamed from: a */
    private static final aau f11378a;

    /* renamed from: b */
    private static final aav f11379b = f11378a;

    /* renamed from: c */
    private final List<Object> f11380c;

    static {
        aau aau = new aau();
        f11378a = aau;
        aau.mo11502b();
    }

    public aau() {
        this(10);
    }

    public aau(int i) {
        this(new ArrayList<>(i));
    }

    private aau(ArrayList<Object> arrayList) {
        this.f11380c = arrayList;
    }

    /* renamed from: a */
    private static String m15401a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzbah ? ((zzbah) obj).zzabd() : aak.m15386b((byte[]) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ aan mo11460a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f11380c);
            return new aau(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo11519a(zzbah zzbah) {
        mo13833c();
        this.f11380c.add(zzbah);
        this.modCount++;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo11501a() {
        return super.mo11501a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo13833c();
        this.f11380c.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo13833c();
        if (collection instanceof aav) {
            collection = ((aav) collection).mo11523d();
        }
        boolean addAll = this.f11380c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public final Object mo11521b(int i) {
        return this.f11380c.get(i);
    }

    public final void clear() {
        mo13833c();
        this.f11380c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final List<?> mo11523d() {
        return Collections.unmodifiableList(this.f11380c);
    }

    /* renamed from: e */
    public final aav mo11524e() {
        return mo11501a() ? new acz(this) : this;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f11380c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzbah) {
            zzbah zzbah = (zzbah) obj;
            String zzabd = zzbah.zzabd();
            if (zzbah.zzabe()) {
                this.f11380c.set(i, zzabd);
            }
            return zzabd;
        }
        byte[] bArr = (byte[]) obj;
        String b = aak.m15386b(bArr);
        if (aak.m15385a(bArr)) {
            this.f11380c.set(i, b);
        }
        return b;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* synthetic */ Object remove(int i) {
        mo13833c();
        Object remove = this.f11380c.remove(i);
        this.modCount++;
        return m15401a(remove);
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
        mo13833c();
        return m15401a(this.f11380c.set(i, str));
    }

    public final int size() {
        return this.f11380c.size();
    }
}
