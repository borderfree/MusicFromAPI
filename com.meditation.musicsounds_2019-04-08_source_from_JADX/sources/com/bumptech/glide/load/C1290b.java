package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b */
public final class C1290b {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static ImageType m6822a(List<ImageHeaderParser> list, InputStream inputStream, C1393b bVar) {
        if (inputStream == null) {
            return ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                ImageType a = ((ImageHeaderParser) list.get(i)).mo5919a(inputStream);
                if (a != ImageType.UNKNOWN) {
                    inputStream.reset();
                    return a;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public static ImageType m6823a(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageType a = ((ImageHeaderParser) list.get(i)).mo5920a(byteBuffer);
            if (a != ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static int m6824b(List<ImageHeaderParser> list, InputStream inputStream, C1393b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                int a = ((ImageHeaderParser) list.get(i)).mo5918a(inputStream, bVar);
                if (a != -1) {
                    inputStream.reset();
                    return a;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }
}
