package com.bumptech.glide.p040g.p041a;

/* renamed from: com.bumptech.glide.g.a.c */
public abstract class C1247c {

    /* renamed from: com.bumptech.glide.g.a.c$a */
    private static class C1249a extends C1247c {

        /* renamed from: a */
        private volatile boolean f4460a;

        C1249a() {
            super();
        }

        /* renamed from: a */
        public void mo5877a(boolean z) {
            this.f4460a = z;
        }

        /* renamed from: b */
        public void mo5878b() {
            if (this.f4460a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private C1247c() {
    }

    /* renamed from: a */
    public static C1247c m6662a() {
        return new C1249a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo5877a(boolean z);

    /* renamed from: b */
    public abstract void mo5878b();
}
