package com.bumptech.glide.load.resource.p053d;

import android.util.Log;
import com.bumptech.glide.load.C1290b;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p046a.C1393b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.d.j */
public class C1561j implements C1488f<InputStream, C1549c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f5064a;

    /* renamed from: b */
    private final C1488f<ByteBuffer, C1549c> f5065b;

    /* renamed from: c */
    private final C1393b f5066c;

    public C1561j(List<ImageHeaderParser> list, C1488f<ByteBuffer, C1549c> fVar, C1393b bVar) {
        this.f5064a = list;
        this.f5065b = fVar;
        this.f5066c = bVar;
    }

    /* renamed from: a */
    private static byte[] m7734a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public C1482s<C1549c> mo6289a(InputStream inputStream, int i, int i2, C1379e eVar) {
        byte[] a = m7734a(inputStream);
        if (a == null) {
            return null;
        }
        return this.f5065b.mo6289a(ByteBuffer.wrap(a), i, i2, eVar);
    }

    /* renamed from: a */
    public boolean mo6290a(InputStream inputStream, C1379e eVar) {
        return !((Boolean) eVar.mo6062a(C1560i.f5063b)).booleanValue() && C1290b.m6822a(this.f5064a, inputStream, this.f5066c) == ImageType.GIF;
    }
}
