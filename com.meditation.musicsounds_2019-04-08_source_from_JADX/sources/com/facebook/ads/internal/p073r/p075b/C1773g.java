package com.facebook.ads.internal.p073r.p075b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.p073r.p075b.p076a.C1754b;
import java.io.File;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.r.b.g */
final class C1773g {

    /* renamed from: a */
    private final AtomicInteger f5790a = new AtomicInteger(0);

    /* renamed from: b */
    private final String f5791b;

    /* renamed from: c */
    private volatile C1766e f5792c;

    /* renamed from: d */
    private final List<C1763b> f5793d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final C1763b f5794e;

    /* renamed from: f */
    private final C1764c f5795f;

    /* renamed from: com.facebook.ads.internal.r.b.g$a */
    private static final class C1774a extends Handler implements C1763b {

        /* renamed from: a */
        private final String f5796a;

        /* renamed from: b */
        private final List<C1763b> f5797b;

        public C1774a(String str, List<C1763b> list) {
            super(Looper.getMainLooper());
            this.f5796a = str;
            this.f5797b = list;
        }

        /* renamed from: a */
        public void mo7027a(File file, String str, int i) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        public void handleMessage(Message message) {
            for (C1763b a : this.f5797b) {
                a.mo7027a((File) message.obj, this.f5796a, message.arg1);
            }
        }
    }

    public C1773g(String str, C1764c cVar) {
        this.f5791b = (String) C1777j.m8841a(str);
        this.f5795f = (C1764c) C1777j.m8841a(cVar);
        this.f5794e = new C1774a(str, this.f5793d);
    }

    /* renamed from: c */
    private synchronized void m8826c() {
        this.f5792c = this.f5792c == null ? m8828e() : this.f5792c;
    }

    /* renamed from: d */
    private synchronized void m8827d() {
        if (this.f5790a.decrementAndGet() <= 0) {
            this.f5792c.mo7050a();
            this.f5792c = null;
        }
    }

    /* renamed from: e */
    private C1766e m8828e() {
        C1766e eVar = new C1766e(new C1775h(this.f5791b), new C1754b(this.f5795f.mo7028a(this.f5791b), this.f5795f.f5765c));
        eVar.mo7031a(this.f5794e);
        return eVar;
    }

    /* renamed from: a */
    public void mo7039a() {
        this.f5793d.clear();
        if (this.f5792c != null) {
            this.f5792c.mo7031a((C1763b) null);
            this.f5792c.mo7050a();
            this.f5792c = null;
        }
        this.f5790a.set(0);
    }

    /* renamed from: a */
    public void mo7040a(C1765d dVar, Socket socket) {
        m8826c();
        try {
            this.f5790a.incrementAndGet();
            this.f5792c.mo7032a(dVar, socket);
        } finally {
            m8827d();
        }
    }

    /* renamed from: b */
    public int mo7041b() {
        return this.f5790a.get();
    }
}
