package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.p046a.C1393b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        private ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    /* renamed from: a */
    int mo5918a(InputStream inputStream, C1393b bVar);

    /* renamed from: a */
    ImageType mo5919a(InputStream inputStream);

    /* renamed from: a */
    ImageType mo5920a(ByteBuffer byteBuffer);
}
