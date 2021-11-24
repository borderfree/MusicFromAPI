package com.facebook.ads.internal.p064f;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.f.a */
public class C1684a {

    /* renamed from: a */
    private static final String f5532a = "a";

    /* renamed from: b */
    private static final ExecutorService f5533b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    private static final ExecutorService f5534c = Executors.newFixedThreadPool(5);

    /* renamed from: d */
    private final Handler f5535d = new Handler();

    /* renamed from: e */
    private final C1685b f5536e;

    /* renamed from: f */
    private final C1686c f5537f;

    /* renamed from: g */
    private final List<Callable<Boolean>> f5538g;

    public C1684a(Context context) {
        this.f5536e = C1685b.m8444a(context);
        this.f5537f = C1686c.m8453a(context);
        this.f5538g = new ArrayList();
    }

    /* renamed from: a */
    public String mo6828a(String str) {
        return this.f5537f.mo6830a(str);
    }
}
