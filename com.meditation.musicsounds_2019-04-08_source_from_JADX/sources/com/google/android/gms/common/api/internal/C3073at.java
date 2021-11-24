package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.at */
abstract class C3073at {

    /* renamed from: a */
    private final C3071ar f10704a;

    protected C3073at(C3071ar arVar) {
        this.f10704a = arVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10894a();

    /* renamed from: a */
    public final void mo10934a(C3072as asVar) {
        asVar.f10694f.lock();
        try {
            if (asVar.f10702n == this.f10704a) {
                mo10894a();
            }
        } finally {
            asVar.f10694f.unlock();
        }
    }
}
