package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C2520e;
import com.google.android.exoplayer2.C2717q;
import com.google.android.exoplayer2.C2717q.C2719a;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.source.C2733d.C2734a;
import com.google.android.exoplayer2.upstream.C2806b;
import com.google.android.exoplayer2.upstream.C2809d.C2810a;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.b */
public final class C2729b implements C2733d, C2734a {

    /* renamed from: a */
    private final Uri f9363a;

    /* renamed from: b */
    private final C2810a f9364b;

    /* renamed from: c */
    private final C2652i f9365c;

    /* renamed from: d */
    private final int f9366d;

    /* renamed from: e */
    private final Handler f9367e;

    /* renamed from: f */
    private final C2730a f9368f;

    /* renamed from: g */
    private final C2719a f9369g;

    /* renamed from: h */
    private final String f9370h;

    /* renamed from: i */
    private C2734a f9371i;

    /* renamed from: j */
    private C2717q f9372j;

    /* renamed from: k */
    private boolean f9373k;

    /* renamed from: com.google.android.exoplayer2.source.b$a */
    public interface C2730a {
        /* renamed from: a */
        void mo9374a(IOException iOException);
    }

    public C2729b(Uri uri, C2810a aVar, C2652i iVar, int i, Handler handler, C2730a aVar2, String str) {
        this.f9363a = uri;
        this.f9364b = aVar;
        this.f9365c = iVar;
        this.f9366d = i;
        this.f9367e = handler;
        this.f9368f = aVar2;
        this.f9370h = str;
        this.f9369g = new C2719a();
    }

    public C2729b(Uri uri, C2810a aVar, C2652i iVar, Handler handler, C2730a aVar2) {
        this(uri, aVar, iVar, -1, handler, aVar2, null);
    }

    /* renamed from: a */
    public C2731c mo9369a(int i, C2806b bVar, long j) {
        C2488a.m11666a(i == 0);
        C2721a aVar = new C2721a(this.f9363a, this.f9364b.mo9523a(), this.f9365c.mo8957a(), this.f9366d, this.f9367e, this.f9368f, this, bVar, this.f9370h);
        return aVar;
    }

    /* renamed from: a */
    public void mo9370a() {
    }

    /* renamed from: a */
    public void mo9371a(C2520e eVar, boolean z, C2734a aVar) {
        this.f9371i = aVar;
        this.f9372j = new C2738g(-9223372036854775807L, false);
        aVar.mo9132a(this.f9372j, null);
    }

    /* renamed from: a */
    public void mo9132a(C2717q qVar, Object obj) {
        boolean z = false;
        if (qVar.mo9319a(0, this.f9369g).mo9327a() != -9223372036854775807L) {
            z = true;
        }
        if (!this.f9373k || z) {
            this.f9372j = qVar;
            this.f9373k = z;
            this.f9371i.mo9132a(this.f9372j, null);
        }
    }

    /* renamed from: a */
    public void mo9372a(C2731c cVar) {
        ((C2721a) cVar).mo9346b();
    }

    /* renamed from: b */
    public void mo9373b() {
        this.f9371i = null;
    }
}
