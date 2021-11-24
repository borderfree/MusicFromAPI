package com.seattleclouds.util.p192a;

import org.apache.http.HttpResponse;

/* renamed from: com.seattleclouds.util.a.b */
public class C6566b implements Runnable {

    /* renamed from: a */
    private C6568d f23239a;

    /* renamed from: b */
    private HttpResponse f23240b;

    /* renamed from: c */
    private boolean f23241c = false;

    public C6566b(C6568d dVar) {
        this.f23239a = dVar;
    }

    /* renamed from: a */
    public void mo20540a(HttpResponse httpResponse) {
        this.f23240b = httpResponse;
    }

    /* renamed from: a */
    public void mo20541a(boolean z) {
        this.f23241c = z;
    }

    public void run() {
        if (this.f23241c) {
            this.f23239a.mo1450b();
        } else {
            this.f23239a.mo18224a(this.f23240b);
        }
    }
}
