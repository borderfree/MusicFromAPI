package com.google.android.gms.internal.p131f;

/* renamed from: com.google.android.gms.internal.f.g */
final class C4188g extends C4185d {

    /* renamed from: a */
    private final C4186e f15628a = new C4186e();

    C4188g() {
    }

    /* renamed from: a */
    public final void mo14025a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f15628a.mo14026a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
