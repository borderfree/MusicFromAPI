package com.bumptech.glide.load.p044b;

import android.util.Log;
import com.bumptech.glide.load.C1261a;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.p040g.C1235a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.c */
public class C1312c implements C1261a<ByteBuffer> {
    /* renamed from: a */
    public boolean mo5922a(ByteBuffer byteBuffer, File file, C1379e eVar) {
        try {
            C1235a.m6637a(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
