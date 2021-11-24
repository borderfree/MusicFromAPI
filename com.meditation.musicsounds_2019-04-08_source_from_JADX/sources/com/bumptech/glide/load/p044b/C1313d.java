package com.bumptech.glide.load.p044b;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p039f.C1230b;
import com.bumptech.glide.p040g.C1235a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.d */
public class C1313d implements C1343n<File, ByteBuffer> {

    /* renamed from: com.bumptech.glide.load.b.d$a */
    private static final class C1314a implements C1272d<ByteBuffer> {

        /* renamed from: a */
        private final File f4545a;

        C1314a(File file) {
            this.f4545a = file;
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo5924a() {
            return ByteBuffer.class;
        }

        /* renamed from: a */
        public void mo5931a(Priority priority, C1273a<? super ByteBuffer> aVar) {
            try {
                aVar.mo5946a(C1235a.m6636a(this.f4545a));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo5945a((Exception) e);
            }
        }

        /* renamed from: b */
        public void mo5932b() {
        }

        /* renamed from: c */
        public void mo5933c() {
        }

        /* renamed from: d */
        public DataSource mo5934d() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: com.bumptech.glide.load.b.d$b */
    public static class C1315b implements C1345o<File, ByteBuffer> {
        /* renamed from: a */
        public C1343n<File, ByteBuffer> mo5975a(C1351r rVar) {
            return new C1313d();
        }
    }

    /* renamed from: a */
    public C1344a<ByteBuffer> mo5971a(File file, int i, int i2, C1379e eVar) {
        return new C1344a<>(new C1230b(file), new C1314a(file));
    }

    /* renamed from: a */
    public boolean mo5973a(File file) {
        return true;
    }
}
