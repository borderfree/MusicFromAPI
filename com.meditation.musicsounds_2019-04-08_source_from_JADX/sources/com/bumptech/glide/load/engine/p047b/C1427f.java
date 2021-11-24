package com.bumptech.glide.load.engine.p047b;

import android.content.Context;
import com.bumptech.glide.load.engine.p047b.C1424d.C1425a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.b.f */
public final class C1427f extends C1424d {
    public C1427f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C1427f(final Context context, final String str, long j) {
        super(new C1425a() {
            /* renamed from: a */
            public File mo6180a() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new File(cacheDir, str) : cacheDir;
            }
        }, j);
    }
}
