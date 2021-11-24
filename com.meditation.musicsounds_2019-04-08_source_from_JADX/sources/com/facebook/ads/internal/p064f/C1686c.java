package com.facebook.ads.internal.p064f;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.p073r.p075b.C1767f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.facebook.ads.internal.f.c */
public class C1686c {

    /* renamed from: a */
    private static final String f5542a = "c";

    /* renamed from: b */
    private static C1686c f5543b;

    /* renamed from: c */
    private final Future<C1767f> f5544c;

    private C1686c(final Context context) {
        this.f5544c = Executors.newSingleThreadExecutor().submit(new Callable<C1767f>() {
            /* renamed from: a */
            public C1767f call() {
                return new C1767f(context);
            }
        });
    }

    /* renamed from: a */
    public static C1686c m8453a(Context context) {
        if (f5543b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (C1686c.class) {
                if (f5543b == null) {
                    f5543b = new C1686c(applicationContext);
                }
            }
        }
        return f5543b;
    }

    /* renamed from: a */
    private C1767f m8454a() {
        try {
            return (C1767f) this.f5544c.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e(f5542a, "Timed out waiting for cache server.", e);
            return null;
        }
    }

    /* renamed from: a */
    public String mo6830a(String str) {
        C1767f a = m8454a();
        if (a == null) {
            return null;
        }
        return a.mo7033a(str);
    }
}
