package com.bumptech.glide.load.resource.p053d;

import android.util.Log;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1489g;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.p040g.C1235a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.d.d */
public class C1551d implements C1489g<C1549c> {
    /* renamed from: a */
    public EncodeStrategy mo6291a(C1379e eVar) {
        return EncodeStrategy.SOURCE;
    }

    /* renamed from: a */
    public boolean mo5922a(C1482s<C1549c> sVar, File file, C1379e eVar) {
        try {
            C1235a.m6637a(((C1549c) sVar.mo6272d()).mo6366c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
