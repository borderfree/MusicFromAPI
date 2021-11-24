package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class acz extends AbstractList<String> implements aav, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final aav f11505a;

    public acz(aav aav) {
        this.f11505a = aav;
    }

    /* renamed from: a */
    public final void mo11519a(zzbah zzbah) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object mo11521b(int i) {
        return this.f11505a.mo11521b(i);
    }

    /* renamed from: d */
    public final List<?> mo11523d() {
        return this.f11505a.mo11523d();
    }

    /* renamed from: e */
    public final aav mo11524e() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f11505a.get(i);
    }

    public final Iterator<String> iterator() {
        return new adb(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new ada(this, i);
    }

    public final int size() {
        return this.f11505a.size();
    }
}
