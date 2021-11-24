package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class ahl implements Callable {

    /* renamed from: a */
    protected final aga f12041a;

    /* renamed from: b */
    protected final C4110yz f12042b;

    /* renamed from: c */
    protected Method f12043c;

    /* renamed from: d */
    private final String f12044d = getClass().getSimpleName();

    /* renamed from: e */
    private final String f12045e;

    /* renamed from: f */
    private final String f12046f;

    /* renamed from: g */
    private final int f12047g;

    /* renamed from: h */
    private final int f12048h;

    public ahl(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        this.f12041a = aga;
        this.f12045e = str;
        this.f12046f = str2;
        this.f12042b = yzVar;
        this.f12047g = i;
        this.f12048h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11906a();

    /* renamed from: b */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            this.f12043c = this.f12041a.mo11867a(this.f12045e, this.f12046f);
            if (this.f12043c == null) {
                return null;
            }
            mo11906a();
            afg h = this.f12041a.mo11877h();
            if (!(h == null || this.f12047g == Integer.MIN_VALUE)) {
                h.mo11842a(this.f12048h, this.f12047g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
