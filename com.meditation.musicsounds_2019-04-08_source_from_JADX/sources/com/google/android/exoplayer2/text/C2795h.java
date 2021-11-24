package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.p100a.C2439f;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.h */
public abstract class C2795h extends C2439f implements C2768d {

    /* renamed from: c */
    private C2768d f9666c;

    /* renamed from: d */
    private long f9667d;

    /* renamed from: a */
    public int mo9424a(long j) {
        return this.f9666c.mo9424a(j - this.f9667d);
    }

    /* renamed from: a */
    public long mo9425a(int i) {
        return this.f9666c.mo9425a(i) + this.f9667d;
    }

    /* renamed from: a */
    public void mo8641a() {
        super.mo8641a();
        this.f9666c = null;
    }

    /* renamed from: a */
    public void mo9516a(long j, C2768d dVar, long j2) {
        this.f7791a = j;
        this.f9666c = dVar;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.f7791a;
        }
        this.f9667d = j2;
    }

    /* renamed from: b */
    public int mo9426b() {
        return this.f9666c.mo9426b();
    }

    /* renamed from: b */
    public List<C2741a> mo9427b(long j) {
        return this.f9666c.mo9427b(j - this.f9667d);
    }

    /* renamed from: e */
    public abstract void mo9423e();
}
