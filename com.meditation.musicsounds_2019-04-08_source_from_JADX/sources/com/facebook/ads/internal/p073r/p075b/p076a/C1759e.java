package com.facebook.ads.internal.p073r.p075b.p076a;

import android.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.r.b.a.e */
abstract class C1759e implements C1753a {

    /* renamed from: a */
    private final ExecutorService f5759a = Executors.newSingleThreadExecutor();

    /* renamed from: com.facebook.ads.internal.r.b.a.e$a */
    private class C1760a implements Callable<Void> {

        /* renamed from: b */
        private final File f5761b;

        public C1760a(File file) {
            this.f5761b = file;
        }

        /* renamed from: a */
        public Void call() {
            C1759e.this.m8784b(this.f5761b);
            return null;
        }
    }

    C1759e() {
    }

    /* renamed from: a */
    private void m8782a(List<File> list) {
        long b = m8783b(list);
        int size = list.size();
        for (File file : list) {
            if (!mo7024a(file, b, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    b -= length;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cache file ");
                    sb.append(file);
                    sb.append(" is deleted because it exceeds cache limit");
                    Log.i("ProxyCache", sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error deleting file ");
                    sb2.append(file);
                    sb2.append(" for trimming cache");
                    Log.e("ProxyCache", sb2.toString());
                }
            }
        }
    }

    /* renamed from: b */
    private long m8783b(List<File> list) {
        long j = 0;
        for (File length : list) {
            j += length.length();
        }
        return j;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8784b(File file) {
        C1756d.m8776c(file);
        m8782a(C1756d.m8775b(file.getParentFile()));
    }

    /* renamed from: a */
    public void mo7020a(File file) {
        this.f5759a.submit(new C1760a(file));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo7024a(File file, long j, int i);
}
