package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.w */
final class C3320w extends C3291u {

    /* renamed from: b */
    private final Callable<String> f11224b;

    private C3320w(Callable<String> callable) {
        super(false, null, null);
        this.f11224b = callable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo11320b() {
        try {
            return (String) this.f11224b.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
