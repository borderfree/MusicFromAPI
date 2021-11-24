package com.google.firebase.components;

import com.google.firebase.p134a.C4880a;
import com.google.firebase.p134a.C4881b;
import java.util.Map.Entry;

/* renamed from: com.google.firebase.components.m */
final /* synthetic */ class C4914m implements Runnable {

    /* renamed from: a */
    private final Entry f17657a;

    /* renamed from: b */
    private final C4880a f17658b;

    private C4914m(Entry entry, C4880a aVar) {
        this.f17657a = entry;
        this.f17658b = aVar;
    }

    /* renamed from: a */
    public static Runnable m24490a(Entry entry, C4880a aVar) {
        return new C4914m(entry, aVar);
    }

    public final void run() {
        ((C4881b) this.f17657a.getKey()).mo16084a(this.f17658b);
    }
}
