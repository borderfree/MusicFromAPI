package com.bumptech.glide.p038e;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.e.b */
public final class C1219b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f4396a = new ArrayList();

    /* renamed from: a */
    public synchronized List<ImageHeaderParser> mo5816a() {
        return this.f4396a;
    }

    /* renamed from: a */
    public synchronized void mo5817a(ImageHeaderParser imageHeaderParser) {
        this.f4396a.add(imageHeaderParser);
    }
}
