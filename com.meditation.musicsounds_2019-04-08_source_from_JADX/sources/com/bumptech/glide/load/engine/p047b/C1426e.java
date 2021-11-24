package com.bumptech.glide.load.engine.p047b;

import android.util.Log;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.engine.p047b.C1417a.C1419b;
import com.bumptech.glide.p034a.C1170a;
import com.bumptech.glide.p034a.C1170a.C1173b;
import com.bumptech.glide.p034a.C1170a.C1175d;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.engine.b.e */
public class C1426e implements C1417a {

    /* renamed from: a */
    private final C1436j f4755a;

    /* renamed from: b */
    private final File f4756b;

    /* renamed from: c */
    private final long f4757c;

    /* renamed from: d */
    private final C1421c f4758d = new C1421c();

    /* renamed from: e */
    private C1170a f4759e;

    @Deprecated
    protected C1426e(File file, long j) {
        this.f4756b = file;
        this.f4757c = j;
        this.f4755a = new C1436j();
    }

    /* renamed from: a */
    private synchronized C1170a m7255a() {
        if (this.f4759e == null) {
            this.f4759e = C1170a.m6342a(this.f4756b, 1, 1, this.f4757c);
        }
        return this.f4759e;
    }

    /* renamed from: a */
    public static C1417a m7256a(File file, long j) {
        return new C1426e(file, j);
    }

    /* renamed from: a */
    public File mo6172a(C1375c cVar) {
        String a = this.f4755a.mo6195a(cVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(a);
            sb.append(" for for Key: ");
            sb.append(cVar);
            Log.v("DiskLruCacheWrapper", sb.toString());
        }
        try {
            C1175d a2 = m7255a().mo5690a(a);
            if (a2 != null) {
                return a2.mo5705a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo6173a(C1375c cVar, C1419b bVar) {
        C1173b b;
        String a = this.f4755a.mo6195a(cVar);
        this.f4758d.mo6176a(a);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(a);
                sb.append(" for for Key: ");
                sb.append(cVar);
                Log.v("DiskLruCacheWrapper", sb.toString());
            }
            try {
                C1170a a2 = m7255a();
                if (a2.mo5690a(a) == null) {
                    b = a2.mo5692b(a);
                    if (b != null) {
                        if (bVar.mo6175a(b.mo5698a(0))) {
                            b.mo5699a();
                        }
                        b.mo5701c();
                        this.f4758d.mo6177b(a);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Had two simultaneous puts for: ");
                    sb2.append(a);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                b.mo5701c();
                throw th;
            }
        } finally {
            this.f4758d.mo6177b(a);
        }
    }
}
