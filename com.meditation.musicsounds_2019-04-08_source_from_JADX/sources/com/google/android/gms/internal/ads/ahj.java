package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ahj {

    /* renamed from: a */
    private static final String f12032a = "ahj";

    /* renamed from: b */
    private final aga f12033b;

    /* renamed from: c */
    private final String f12034c;

    /* renamed from: d */
    private final String f12035d;

    /* renamed from: e */
    private final int f12036e = 2;

    /* renamed from: f */
    private volatile Method f12037f = null;

    /* renamed from: g */
    private final Class<?>[] f12038g;

    /* renamed from: h */
    private CountDownLatch f12039h = new CountDownLatch(1);

    public ahj(aga aga, String str, String str2, Class<?>... clsArr) {
        this.f12033b = aga;
        this.f12034c = str;
        this.f12035d = str2;
        this.f12038g = clsArr;
        this.f12033b.mo11872c().submit(new ahk(this));
    }

    /* renamed from: a */
    private final String m16229a(byte[] bArr, String str) {
        return new String(this.f12033b.mo11874e().mo11857a(bArr, str), "UTF-8");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m16231b() {
        try {
            Class loadClass = this.f12033b.mo11873d().loadClass(m16229a(this.f12033b.mo11875f(), this.f12034c));
            if (loadClass != null) {
                this.f12037f = loadClass.getMethod(m16229a(this.f12033b.mo11875f(), this.f12035d), this.f12038g);
                Method method = this.f12037f;
            }
        } catch (zzcl | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            this.f12039h.countDown();
            throw th;
        }
        this.f12039h.countDown();
    }

    /* renamed from: a */
    public final Method mo11915a() {
        if (this.f12037f != null) {
            return this.f12037f;
        }
        try {
            if (!this.f12039h.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f12037f;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
