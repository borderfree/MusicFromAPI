package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C1376d;
import com.bumptech.glide.load.C1376d.C1378a;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.load.engine.p046a.C1398e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.t */
public class C1536t<T> implements C1488f<T, Bitmap> {

    /* renamed from: a */
    public static final C1376d<Long> f5010a = C1376d.m7046a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new C1378a<Long>() {

        /* renamed from: a */
        private final ByteBuffer f5016a = ByteBuffer.allocate(8);

        /* renamed from: a */
        public void mo6060a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f5016a) {
                this.f5016a.position(0);
                messageDigest.update(this.f5016a.putLong(l.longValue()).array());
            }
        }
    });

    /* renamed from: b */
    public static final C1376d<Integer> f5011b = C1376d.m7046a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new C1378a<Integer>() {

        /* renamed from: a */
        private final ByteBuffer f5017a = ByteBuffer.allocate(4);

        /* renamed from: a */
        public void mo6060a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f5017a) {
                    this.f5017a.position(0);
                    messageDigest.update(this.f5017a.putInt(num.intValue()).array());
                }
            }
        }
    });

    /* renamed from: c */
    private static final C1540b f5012c = new C1540b();

    /* renamed from: d */
    private final C1541c<T> f5013d;

    /* renamed from: e */
    private final C1398e f5014e;

    /* renamed from: f */
    private final C1540b f5015f;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.t$a */
    private static final class C1539a implements C1541c<AssetFileDescriptor> {
        private C1539a() {
        }

        /* renamed from: a */
        public void mo6353a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.t$b */
    static class C1540b {
        C1540b() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo6354a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.t$c */
    interface C1541c<T> {
        /* renamed from: a */
        void mo6353a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.t$d */
    static final class C1542d implements C1541c<ParcelFileDescriptor> {
        C1542d() {
        }

        /* renamed from: a */
        public void mo6353a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C1536t(C1398e eVar, C1541c<T> cVar) {
        this(eVar, cVar, f5012c);
    }

    C1536t(C1398e eVar, C1541c<T> cVar, C1540b bVar) {
        this.f5014e = eVar;
        this.f5013d = cVar;
        this.f5015f = bVar;
    }

    /* renamed from: a */
    private static Bitmap m7646a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    /* renamed from: a */
    private static Bitmap m7647a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap b = (VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f4948f) ? null : m7649b(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        return b == null ? m7646a(mediaMetadataRetriever, j, i) : b;
    }

    /* renamed from: a */
    public static C1488f<AssetFileDescriptor, Bitmap> m7648a(C1398e eVar) {
        return new C1536t(eVar, new C1539a());
    }

    @TargetApi(27)
    /* renamed from: b */
    private static Bitmap m7649b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float a = downsampleStrategy.mo6301a(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * a), Math.round(a * ((float) parseInt2)));
        } catch (Throwable th) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static C1488f<ParcelFileDescriptor, Bitmap> m7650b(C1398e eVar) {
        return new C1536t(eVar, new C1542d());
    }

    /* renamed from: a */
    public C1482s<Bitmap> mo6289a(T t, int i, int i2, C1379e eVar) {
        long longValue = ((Long) eVar.mo6062a(f5010a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) eVar.mo6062a(f5011b);
            if (num == null) {
                num = Integer.valueOf(2);
            }
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) eVar.mo6062a(DownsampleStrategy.f4950h);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.f4949g;
            }
            DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
            MediaMetadataRetriever a = this.f5015f.mo6354a();
            try {
                this.f5013d.mo6353a(a, t);
                Bitmap a2 = m7647a(a, longValue, num.intValue(), i, i2, downsampleStrategy2);
                a.release();
                return C1510d.m7522a(a2, this.f5014e);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public boolean mo6290a(T t, C1379e eVar) {
        return true;
    }
}
