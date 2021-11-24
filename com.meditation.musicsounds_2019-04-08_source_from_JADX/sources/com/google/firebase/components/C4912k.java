package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.k */
final class C4912k {

    /* renamed from: a */
    private final C4900a<?> f17651a;

    /* renamed from: b */
    private final Set<C4912k> f17652b = new HashSet();

    /* renamed from: c */
    private final Set<C4912k> f17653c = new HashSet();

    C4912k(C4900a<?> aVar) {
        this.f17651a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<C4912k> mo16141a() {
        return this.f17652b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16142a(C4912k kVar) {
        this.f17652b.add(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C4900a<?> mo16143b() {
        return this.f17651a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16144b(C4912k kVar) {
        this.f17653c.add(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo16145c(C4912k kVar) {
        this.f17653c.remove(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo16146c() {
        return this.f17653c.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo16147d() {
        return this.f17652b.isEmpty();
    }
}
