package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.load.resource.bitmap.C1520j.C1522a;
import com.bumptech.glide.p040g.C1252d;
import com.bumptech.glide.p040g.C1255g;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.q */
public class C1530q implements C1488f<InputStream, Bitmap> {

    /* renamed from: a */
    private final C1520j f5000a;

    /* renamed from: b */
    private final C1393b f5001b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.q$a */
    static class C1531a implements C1522a {

        /* renamed from: a */
        private final RecyclableBufferedInputStream f5002a;

        /* renamed from: b */
        private final C1252d f5003b;

        C1531a(RecyclableBufferedInputStream recyclableBufferedInputStream, C1252d dVar) {
            this.f5002a = recyclableBufferedInputStream;
            this.f5003b = dVar;
        }

        /* renamed from: a */
        public void mo6332a() {
            this.f5002a.mo6303a();
        }

        /* renamed from: a */
        public void mo6333a(C1398e eVar, Bitmap bitmap) {
            IOException a = this.f5003b.mo5883a();
            if (a != null) {
                if (bitmap != null) {
                    eVar.mo6141a(bitmap);
                }
                throw a;
            }
        }
    }

    public C1530q(C1520j jVar, C1393b bVar) {
        this.f5000a = jVar;
        this.f5001b = bVar;
    }

    /* renamed from: a */
    public C1482s<Bitmap> mo6289a(InputStream inputStream, int i, int i2, C1379e eVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f5001b);
            z = true;
        }
        C1252d a = C1252d.m6672a(recyclableBufferedInputStream);
        try {
            return this.f5000a.mo6329a((InputStream) new C1255g(a), i, i2, eVar, (C1522a) new C1531a(recyclableBufferedInputStream, a));
        } finally {
            a.mo5885b();
            if (z) {
                recyclableBufferedInputStream.mo6305b();
            }
        }
    }

    /* renamed from: a */
    public boolean mo6290a(InputStream inputStream, C1379e eVar) {
        return this.f5000a.mo6330a(inputStream);
    }
}
