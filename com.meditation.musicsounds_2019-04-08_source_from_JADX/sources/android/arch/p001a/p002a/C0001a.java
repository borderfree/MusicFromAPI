package android.arch.p001a.p002a;

import java.util.concurrent.Executor;

/* renamed from: android.arch.a.a.a */
public class C0001a extends C0005c {

    /* renamed from: a */
    private static volatile C0001a f0a;

    /* renamed from: d */
    private static final Executor f1d = new Executor() {
        public void execute(Runnable runnable) {
            C0001a.m1a().mo2b(runnable);
        }
    };

    /* renamed from: e */
    private static final Executor f2e = new Executor() {
        public void execute(Runnable runnable) {
            C0001a.m1a().mo1a(runnable);
        }
    };

    /* renamed from: b */
    private C0005c f3b = this.f4c;

    /* renamed from: c */
    private C0005c f4c = new C0004b();

    private C0001a() {
    }

    /* renamed from: a */
    public static C0001a m1a() {
        if (f0a != null) {
            return f0a;
        }
        synchronized (C0001a.class) {
            if (f0a == null) {
                f0a = new C0001a();
            }
        }
        return f0a;
    }

    /* renamed from: a */
    public void mo1a(Runnable runnable) {
        this.f3b.mo1a(runnable);
    }

    /* renamed from: b */
    public void mo2b(Runnable runnable) {
        this.f3b.mo2b(runnable);
    }

    /* renamed from: b */
    public boolean mo3b() {
        return this.f3b.mo3b();
    }
}
